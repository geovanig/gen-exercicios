create database bd_generation_game_online;

use bd_generation_game_online;

create table classe(

id_classe int auto_increment primary key,
guerreiro varchar(20),
mago varchar(20),
hibrido varchar(20)

);

create table personagem(

id_personagem int auto_increment primary key,
nome varchar(30),
sangue varchar(20),
nivel int(2),
ataque decimal(4, 1),
defesa decimal(4, 1)

);

alter table personagem add column id_classe_fk int;
alter table personagem add foreign key(id_classe_fk) references classe(id_classe);

insert into classe(guerreiro, mago, hibrido) values ('soco', 'fogo', 'super chute'), ('espadada', 'sugar alma', 'grito sonico'), ('empalada', 'curar', 'envenenar arma');
alter table personagem modify defesa int;
insert into personagem(nome, sangue, nivel, ataque, defesa) values('Lion', 'Humano', 99, 3600, 1500), ('Cath', 'Anjo', 86, 2000, 2010), ('Marc', 'Nefilim', 78, 1900, 1999);

select * from personagem where ataque > 2000;

select * from personagem where defesa between 1000 and 2000;

select * from personagem where nome like "c";

select * from personagem;

UPDATE personagem SET id_classe_fk = 3 WHERE id_personagem = 3;

select personagem.nome, mago, guerreiro, hibrido from personagem join classe on classe.id_classe = personagem.id_classe_fk;

select * from personagem where id_classe_fk = 1;

