DROP SCHEMA IF EXISTS mcve CASCADE;

CREATE SCHEMA mcve;
CREATE TABLE mcve.test (
  company_id      varchar(36) NOT NULL,
  allocation_id   int unsigned NOT NULL AUTO_INCREMENT,
  name            varchar(512) NOT NULL             ,
CONSTRAINT pk_primary_kii PRIMARY KEY (company_id, allocation_id)
);

