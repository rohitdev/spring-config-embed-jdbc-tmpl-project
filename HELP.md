# Getting Started

### Reference Documentation
Use pgsql and update the config in bootstrap.yml

Create DB using the following script:

CREATE SCHEMA tmx_admin;

CREATE TABLE tmx_admin.properties (
id serial4 NOT NULL,
application varchar(128) NOT NULL,
profile varchar(32) NOT NULL,
label_value varchar(32) NULL,
prop_key varchar(1024) NULL,
prop_value varchar(24000) NULL,
CONSTRAINT properties_pkey PRIMARY KEY (id)
);



Create data as 

INSERT INTO tmx_admin.properties (application,profile,label_value,prop_key,prop_value) VALUES ('admin-service','devil','master','app.datasource.jdbc.className','org.postgresql.Driver');

