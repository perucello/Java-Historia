
    abstract public void myfunc();
    public void another(){
    System.out.println("Another method");
    }

    public class Abs extends Demo{
        public void main(String argv[]) {
            Abs a = new Abs();
            a.amethod();
        }
        
        public void myfunc(){
         System.out.println("My Fbunc");   
        }
        public void amethod(){
         myfunc();   
        }
        }
    }










drop database BDLive;
create database BDLive;
use BDLive;

create table palestrante
(
	Id integer(11) not null auto_increment,
    Nome varchar(30) not null,
    Tema varchar(30) not null,
    Profissao varchar(30),    
    primary key (Id)
);


select * from palestrante;


insert into palestrante 
	(Id, 
	Nome, 
	Tema, 
	Profissao)
values
	('1', 'George Menezes', 'Cyber Segurança', 'CEO Central Desk'),
	('2', 'Fabio Perucello', 'Banco de Dados', 'Consultor de Sistemas');


insert into palestrante 
	(Nome, 
	Tema, 
	Profissao)
values
	('Silvio Moraes', 'Gerenciamento Projetos', 'CEO ExplorandoTI'),
	('Bill Gates', 'Plataforma Windows', 'Fundador Micrisoft');




select * from palestrante;

drop database BDLive;

select * from palestrante;

delete from palestrante where id != 6;

delete from palestrante where id = 1;

select * from palestrante;







