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
    
CREATE TABLE IF NOT EXISTS public.usuarios (
    useid serial primary key,
    nome varchar not null, 
    email varchar unique not null,
    senha varchar not null,
    adm boolean DEFAULT false
);

insert into usuarios (Nome, Email, Senha, Adm) values ('Administrador', 'Adm@bibliotech.com', 'adm@2022', true);
CREATE TABLE IF NOT EXISTS public.livros
(
    livroid serial NOT NULL,
    nome_livro varchar not null,
    nome_autor varchar not null,
    data_cad date NOT NULL DEFAULT CURRENT_DATE,
    useid numeric not null
);