
video-2
-----------
	step-1: create a maven project and follow all the basic steps
	step-2: insert all the required dependency in pom.xml 
		like- a)Hibernate-core 
		exam- 
		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
		<dependency>
		    <groupId>org.hibernate</groupId>
		    <artifactId>hibernate-core</artifactId>
		    <version>6.4.1.Final</version>
		    <type>pom</type>
		</dependency>
		b) mysql-connecter jar
		exampe-
		<!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
		<dependency>
		    <groupId>com.mysql</groupId>
		    <artifactId>mysql-connector-j</artifactId>
		    <version>8.0.33</version>
		</dependency>

--------------------------------------------------------------------------
video-3
-------
	step-1: setting the hibernate project without maven
---------------------------------------------------------------------------
video-4 Configuring Hibernate in our project | hibernate configuration | hibernate.cfg.xml
--------
	step-1:  we are creating a object of class and sending that object to hibenate and hibernate goes to send that object to databse and search the values 
		from 	database based on that object and it gives that values in-form of that object and it by-selph write and run the sql function or query.
	step-2: create a configuration file namae as hiberante.cfg.xml and past all the dependeny or code required
	step-3: create database name as myhibernate in mysql
	step-4: test the xml file by App.java.
	step-5: create the session-factroy object in App.java here SessionFactroy is interface so we need to create object of its implements class that is  		Configuration() class here SessionFactroy  is used to give the connection object.
	step-6: 
	
	
	
--------------------------------------------------------------------------------------
video-5 First Hibernate Program using Annotations |
------
	step-1:create a class and define some properties of that class here by using hibernate we can map the class to database table where class considers as 
		entity.
	
	step-2: create all the required fields in that class and we are using the @Entity annocation to define that class as entity so Hibernate goes to create 		table with same name as class and we can also change the table name by give the name in @Entity(name="name_table") annotation and also can using the 		@Table annotaion to change the details of tables on the class.
	
	step-3: give inforamtion the hibernate about that class by uisng xml 
		ex- 
		 <mapping class="com.Hibernate.Hibernate.Student" />
		 
	 step-4: we have use the more than 5 version of mysql otherwise it will show error
		 ex-
		 <!-- if you use less version of 5 then it will show error
	        here dialect define the type of databse. -->
	        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
	
		
	
	