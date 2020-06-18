# -*- coding: utf-8 -*-
"""
Created on Wed Jun 17 17:35:17 2020

@author: Mateusz
"""

import riak
from riak import RiakObject
import json 

class RiakJsonInterface:
    
    def __init__(self, host, port, bucket):
        self.client = riak.RiakClient(host = host, port = port)
        self.bucket = self.client.bucket(bucket)
        self.content_type = 'application/json'
        
    def put_json(self, key, value):
        value = json.dumps(value)
        obj = RiakObject(self.client, self.bucket, key)
        obj.content_type = self.content_type
        obj.data = value
        obj.store()
        
    def get_json(self, key):
        value = self.bucket.get(key)
        try:
            return json.loads(value.data)
        except:
            return None
    
    def modify_json(self, key, field, new_value):
        obj = self.get_json(key)
        obj[field] = new_value
        self.put_json(key, obj)
        
    def delete_json(self, key):
        self.bucket.delete(key)
        
if __name__ == '__main__':
    
    obj = {'date' : '17-06-2020'}                                                   # Objekt JSON
    
    db = RiakJsonInterface(host = '192.168.55.10', port = 8098, bucket = 'date')    # Inicjacja polaczenia z baza riak, 
                                                                                    # Serwer postawiony na VM Ubuntu (host-only)
    db.put_json('date1', obj)                                                       # Wrzucenie objektu do bazy
    value = db.get_json('date1')                                                    # Pobranie z bazy
    print('Returned object:', value)                                    
    
    db.modify_json('date1', 'date', '18-06-2020')                                   # Zmodyfikowanie objektu
    value = db.get_json('date1')                                                    # Pobranie objektu 
    print('Returned modified object:', value)
    
    db.delete_json('date1')                                                         # Usuniecie objektu 
    value = db.get_json('date1')                                                    # Pobranie objektu 
    print('Returned deleted object:', value)