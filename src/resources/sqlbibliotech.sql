-- Database: bibliotech

-- DROP DATABASE IF EXISTS bibliotech;

CREATE DATABASE bibliotech
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
CREATE TABLE IF NOT EXISTS public.usuarios
(
    useid integer NOT NULL DEFAULT nextval('usuarios_useid_seq'::regclass),
    nome character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    senha character varying COLLATE pg_catalog."default",
    adm boolean DEFAULT false,
    CONSTRAINT usuarios_pkey PRIMARY KEY (useid),
    CONSTRAINT usuarios_email_key UNIQUE (email)
);

insert into usuarios (Nome, Email, Senha, Adm) values ('Administrador', 'Adm@bibliotech.com', 'adm@2022', true);
CREATE TABLE IF NOT EXISTS public.livros
(
    livroid integer NOT NULL DEFAULT nextval('livros_livroid_seq'::regclass),
    nome_livro character varying(50) COLLATE pg_catalog."default",
    nome_autor character varying(50) COLLATE pg_catalog."default",
    data_cad date NOT NULL DEFAULT CURRENT_DATE,
    useid numeric,
    CONSTRAINT livros_pkey PRIMARY KEY (livroid)
);