-- Adicione um filme à tabela de filmes.

INSERT INTO movies (title, rating, awards, release_date, length, genre_id)
VALUES
('Bacurau', 7.4, 52, '2019-03-19', 131, 3);

-- Adicione um gênero à tabela de gêneros.

INSERT INTO genres (name, ranking, active) 
VALUES
('Cinema Mudo', 1, 1);

-- Associe o filme do Ex 2. ao gênero criado no Ex. 3.

UPDATE movies
SET genre_id = (SELECT id FROM genres WHERE name = 'Cinema Mudo')
WHERE title = 'Bacurau';

/* Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2. */

UPDATE actors
SET favorite_movie_id = (SELECT id FROM movies WHERE title = 'Bacurau')
WHERE id = 1;

-- Crie uma cópia temporária da tabela de filmes.

CREATE TEMPORARY TABLE movies_temp AS SELECT * FROM movies;

-- Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.

DELETE FROM movies_temp
WHERE awards < 5;

-- Obtenha a lista de todos os gêneros que possuem pelo menos um filme.

SELECT DISTINCT (g.name) FROM genres g
INNER JOIN movies m
ON cast(m.genre_id as integer) = g.id

-- Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.

SELECT a.first_name, a.last_name, a.favorite_movie_id, m.id, m.title, m.awards FROM actors a
INNER JOIN movies m
ON m.id = cast(a.favorite_movie_id AS INTEGER)
WHERE m.awards > 3;

-- Use o plano de explicação para analisar as consultas nos Ex. 6 e 7.

/* EXPLAIN SELECT a.first_name, a.last_name, a.favorite_movie_id, m.id, m.title, m.awards FROM actors a
INNER JOIN movies m
ON m.id = cast(a.favorite_movie_id AS INTEGER)
WHERE m.awards > 3;
                              QUERY PLAN                              
----------------------------------------------------------------------
 Hash Join  (cost=1.35..2.99 rows=7 width=143)
   Hash Cond: ((a.favorite_movie_id)::integer = m.id)
   ->  Seq Scan on actors a  (cost=0.00..1.49 rows=49 width=15)
   ->  Hash  (cost=1.26..1.26 rows=7 width=128)
         ->  Seq Scan on movies m  (cost=0.00..1.26 rows=7 width=128)
               Filter: (awards > 3)
(6 rows) */

-- O que são índices e para que servem?

/*
Índices são um mecanismo de otimização de consultas em base de dados. Eles permitem que registros
sejam acessados mais rapidamente, sem a necessidade de realizar uma varredura completa a cada vez
que uma query for executada.
*/

-- Crie um índice sobre o nome na tabela de filmes.

CREATE INDEX movies_name_idx
ON movies(title);

-- Verifique se o índice foi criado corretamente.
/* meliflix=# \d+ movies
                                                          Table "public.movies"
    Column    |         Type          | Collation | Nullable |              Default               | Storage  | Stats target | Description 
--------------+-----------------------+-----------+----------+------------------------------------+----------+--------------+-------------
 id           | integer               |           | not null | nextval('movies_id_seq'::regclass) | plain    |              | 
 created_at   | character varying(1)  |           |          | NULL::character varying            | extended |              | 
 updated_at   | character varying(1)  |           |          | NULL::character varying            | extended |              | 
 title        | character varying(51) |           |          | NULL::character varying            | extended |              | 
 rating       | numeric(3,1)          |           |          | NULL::numeric                      | main     |              | 
 awards       | integer               |           |          |                                    | plain    |              | 
 release_date | character varying(19) |           |          | NULL::character varying            | extended |              | 
 length       | character varying(3)  |           |          | NULL::character varying            | extended |              | 
 genre_id     | character varying(2)  |           |          | NULL::character varying            | extended |              | 
Indexes:
    "pk_movies" PRIMARY KEY, btree (id)
    "movies_name_idx" btree (title) */

