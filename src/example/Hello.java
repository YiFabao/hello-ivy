/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




/**
 * Simple example to show how easy it is to retrieve transitive libs with ivy !!! 
 */
public final class Hello {
    public static void main(String[] args) throws Exception {
    	System.out.println("helloworld!");
    	Configuration cfg = new Configuration().configure();
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	User user = new User();
    	user.setUsername("易发宝");
    	user.setPassword("123456");
    	
    	session.save(user);
    	
    	tx.commit();
    	session.close();
    	
    	System.out.println(cfg);
    }
    
    private Hello() {
    }
}
