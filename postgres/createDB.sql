-- object: applicationapi | type: SCHEMA --
-- DROP SCHEMA IF EXISTS applicationapi CASCADE;

GRANT ALL PRIVILEGES ON DATABASE applicationapi TO docker;

CREATE SCHEMA applicationapi;
-- ddl-end --
ALTER SCHEMA applicationapi OWNER TO postgres;
-- ddl-end --

SET search_path TO pg_catalog,public,applicationapi;
-- ddl-end --

-- object: applicationapi.entity | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.entity CASCADE;
CREATE TABLE applicationapi.entity(
	id varchar(50) NOT NULL,
	description varchar(50) NOT NULL,
	CONSTRAINT entity_pk PRIMARY KEY (id),
	CONSTRAINT "uniqueId" UNIQUE (id)

);
-- ddl-end --
ALTER TABLE applicationapi.entity OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.status | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.status CASCADE;
CREATE TABLE applicationapi.status(
	id char(4) NOT NULL,
	description varchar(50),
	CONSTRAINT status_pk PRIMARY KEY (id),
	CONSTRAINT uniqueid UNIQUE (id)

);
-- ddl-end --
ALTER TABLE applicationapi.status OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.case_application | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.case_application CASCADE;
CREATE TABLE applicationapi.case_application(
	caseid bigint NOT NULL,
	appseq integer NOT NULL,
	business_process varchar(50) NOT NULL,
	status char(4),
	creation_date timestamp NOT NULL DEFAULT current_timestamp,
	creation_user varchar(50) NOT NULL,
	modification_date timestamp NOT NULL DEFAULT current_timestamp,
	modification_user varchar(50) NOT NULL,
	CONSTRAINT case_application_pk PRIMARY KEY (caseid,appseq)

);
-- ddl-end --
ALTER TABLE applicationapi.case_application OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.case_raw_data | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.case_raw_data CASCADE;
CREATE TABLE applicationapi.case_raw_data(
	caseid bigint NOT NULL,
	raw json NOT NULL,
	CONSTRAINT case_rawdata_pk PRIMARY KEY (caseid)

);
-- ddl-end --
ALTER TABLE applicationapi.case_raw_data OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.case_raw_attachment | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.case_raw_attachment CASCADE;
CREATE TABLE applicationapi.case_raw_attachment(
	caseid bigint NOT NULL,
	seqid smallint NOT NULL,
	data text NOT NULL,
	metadata json NOT NULL,
	CONSTRAINT case_attachment_pk PRIMARY KEY (caseid,seqid)

);
-- ddl-end --
ALTER TABLE applicationapi.case_raw_attachment OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.case_participant | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.case_participant CASCADE;
CREATE TABLE applicationapi.case_participant(
	caseid bigint NOT NULL,
	participants_data jsonb NOT NULL,
	CONSTRAINT case_participant_pk PRIMARY KEY (caseid)

);
-- ddl-end --
ALTER TABLE applicationapi.case_participant OWNER TO postgres;
-- ddl-end --

-- object: public.caseid | type: SEQUENCE --
-- DROP SEQUENCE IF EXISTS public.caseid CASCADE;
CREATE SEQUENCE public.caseid
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 2147483647
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --
ALTER SEQUENCE public.caseid OWNER TO postgres;
-- ddl-end --

-- object: public.seq_caseid | type: SEQUENCE --
-- DROP SEQUENCE IF EXISTS public.seq_caseid CASCADE;
CREATE SEQUENCE public.seq_caseid
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 2147483647
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --
ALTER SEQUENCE public.seq_caseid OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.activity | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.activity CASCADE;
CREATE TABLE applicationapi.activity(
	id varchar(50) NOT NULL,
	description varchar(50),
	CONSTRAINT activity_pk PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE applicationapi.activity OWNER TO postgres;
-- ddl-end --

-- object: applicationapi.activity_status_restriction | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.activity_status_restriction CASCADE;
CREATE TABLE applicationapi.activity_status_restriction(
	status_id char(4) NOT NULL,
	activity_id char(4) NOT NULL,
	CONSTRAINT activity_status_restriction_pk PRIMARY KEY (status_id,activity_id)

);
-- ddl-end --
COMMENT ON TABLE applicationapi.activity_status_restriction IS 'shows in what status an activity can be executed';
-- ddl-end --
ALTER TABLE applicationapi.activity_status_restriction OWNER TO postgres;
-- ddl-end --

-- object: pkindex | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.pkindex CASCADE;
CREATE INDEX pkindex ON applicationapi.entity
	USING btree
	(
	  id
	);
-- ddl-end --

-- object: pkappcase | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.pkappcase CASCADE;
CREATE INDEX pkappcase ON applicationapi.case_application
	USING btree
	(
	  caseid
	);
-- ddl-end --

-- object: participants_data_jsonb | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.participants_data_jsonb CASCADE;
CREATE INDEX participants_data_jsonb ON applicationapi.case_participant
	USING gin
	(
	  participants_data
	);
-- ddl-end --

-- object: pkraw | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.pkraw CASCADE;
CREATE INDEX pkraw ON applicationapi.case_raw_data
	USING btree
	(
	  caseid
	);
-- ddl-end --

-- object: pkrawattachment | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.pkrawattachment CASCADE;
CREATE INDEX pkrawattachment ON applicationapi.case_raw_attachment
	USING btree
	(
	  caseid,
	  seqid ASC NULLS LAST
	);
-- ddl-end --

-- object: idx_main_act_st_restriction | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.idx_main_act_st_restriction CASCADE;
CREATE INDEX idx_main_act_st_restriction ON applicationapi.activity_status_restriction
	USING btree
	(
	  status_id,
	  activity_id ASC NULLS LAST
	);
-- ddl-end --

-- object: idx_main_status | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.idx_main_status CASCADE;
CREATE INDEX idx_main_status ON applicationapi.status
	USING btree
	(
	  id
	);
-- ddl-end --

-- object: idx_main_act | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.idx_main_act CASCADE;
CREATE INDEX idx_main_act ON applicationapi.activity
	USING btree
	(
	  id
	);
-- ddl-end --

-- object: applicationapi.case_request | type: TABLE --
-- DROP TABLE IF EXISTS applicationapi.case_request CASCADE;
CREATE TABLE applicationapi.case_request(
	id bigserial NOT NULL,
	entity varchar(50) NOT NULL,
	creation_date timestamp NOT NULL DEFAULT current_timestamp,
	creation_user varchar(50) NOT NULL,
	modification_date timestamp NOT NULL DEFAULT current_timestamp,
	modification_user varchar(50) NOT NULL,
	CONSTRAINT case_pk PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE applicationapi.case_request OWNER TO postgres;
-- ddl-end --

-- object: pkindexcase | type: INDEX --
-- DROP INDEX IF EXISTS applicationapi.pkindexcase CASCADE;
CREATE INDEX pkindexcase ON applicationapi.case_request
	USING btree
	(
	  id
	);
-- ddl-end --

-- object: has_entity | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_request DROP CONSTRAINT IF EXISTS has_entity CASCADE;
ALTER TABLE applicationapi.case_request ADD CONSTRAINT has_entity FOREIGN KEY (entity)
REFERENCES applicationapi.entity (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: rel_application_caseid | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_application DROP CONSTRAINT IF EXISTS rel_application_caseid CASCADE;
ALTER TABLE applicationapi.case_application ADD CONSTRAINT rel_application_caseid FOREIGN KEY (caseid)
REFERENCES applicationapi.case_request (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: rel_application_status | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_application DROP CONSTRAINT IF EXISTS rel_application_status CASCADE;
ALTER TABLE applicationapi.case_application ADD CONSTRAINT rel_application_status FOREIGN KEY (status)
REFERENCES applicationapi.status (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: rawdata_case | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_raw_data DROP CONSTRAINT IF EXISTS rawdata_case CASCADE;
ALTER TABLE applicationapi.case_raw_data ADD CONSTRAINT rawdata_case FOREIGN KEY (caseid)
REFERENCES applicationapi.case_request (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: rel_raw_attachment_case | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_raw_attachment DROP CONSTRAINT IF EXISTS rel_raw_attachment_case CASCADE;
ALTER TABLE applicationapi.case_raw_attachment ADD CONSTRAINT rel_raw_attachment_case FOREIGN KEY (caseid)
REFERENCES applicationapi.case_request (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: rel_participant_caseid | type: CONSTRAINT --
-- ALTER TABLE applicationapi.case_participant DROP CONSTRAINT IF EXISTS rel_participant_caseid CASCADE;
ALTER TABLE applicationapi.case_participant ADD CONSTRAINT rel_participant_caseid FOREIGN KEY (caseid)
REFERENCES applicationapi.case_request (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: restriction_status | type: CONSTRAINT --
-- ALTER TABLE applicationapi.activity_status_restriction DROP CONSTRAINT IF EXISTS restriction_status CASCADE;
ALTER TABLE applicationapi.activity_status_restriction ADD CONSTRAINT restriction_status FOREIGN KEY (status_id)
REFERENCES applicationapi.status (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: restriction_activity | type: CONSTRAINT --
-- ALTER TABLE applicationapi.activity_status_restriction DROP CONSTRAINT IF EXISTS restriction_activity CASCADE;
ALTER TABLE applicationapi.activity_status_restriction ADD CONSTRAINT restriction_activity FOREIGN KEY (activity_id)
REFERENCES applicationapi.activity (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --



