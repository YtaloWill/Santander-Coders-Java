CREATE DATABASE loja;

USE loja;

CREATE TABLE IF NOT EXISTS tbcliente (
	id INT PRIMARY KEY auto_increment,
	nome varchar(30) NOT NULL,
	cpf varchar(14),
	telefone varchar(11)
);

CREATE TABLE IF NOT EXISTS tbcategoria (
	id INT PRIMARY KEY auto_increment,
	nome VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS tbproduto (
	id INT PRIMARY KEY auto_increment,
	nome VARCHAR(30) NOT NULL,
	categoria_id int NOT NULL,
	FOREIGN KEY (categoria_id) REFERENCES tbcategoria(id)
);

CREATE TABLE IF NOT EXISTS tbpedido (
	id INT PRIMARY KEY auto_increment,
	cliente_id int NOT NULL,
	data_criacao TIMESTAMP DEFAULT NOW(),
	FOREIGN KEY (cliente_id) REFERENCES tbcliente(id)
);

CREATE TABLE IF NOT EXISTS tbitens_pedido (
	id INT PRIMARY KEY auto_increment,
	pedido_id INT NOT NULL,
	produto_id INT NOT NULL,
	data_criacao TIMESTAMP DEFAULT NOW(),
	FOREIGN KEY (pedido_id) REFERENCES tbpedido(id),
	FOREIGN KEY (produto_id) REFERENCES tbproduto(id)
);

-- ////////////////////////////////////////////

-- 1
INSERT INTO tbcliente values 
(NULL, 'Du', '111.111.111-11', '11911111111'),
(NULL, 'Dudu', '222.222.222-22', '22922222222'),
(NULL, 'Edu', '333.333.333-33', '33933333333'),
(NULL, 'Vaca', '444.444.444-44', '44944444444'),
(NULL, 'Frango', '555.555.555-55', '55955555555'),
(NULL, 'Yugioh', '666.666.666-66', '66966666666');

-- 2
SELECT * FROM tbcliente
WHERE nome like 'Y%';

-- 3
SELECT * FROM tbcliente
WHERE cpf = '111.111.111-11';

-- 4
INSERT INTO tbcategoria values 
(NULL, 'Comida'),
(NULL, 'Bebida');

-- 5
ALTER TABLE tbproduto
ADD valor DECIMAL(5, 2) NOT NULL;

-- 6
INSERT INTO tbproduto values 
(NULL, 'Frango frito', 1, 10),
(NULL, 'Leite', 2, 10.1),
(NULL, 'Carne bovina', 1, 10.2);

-- 7
INSERT INTO tbpedido VALUES (NULL, 1, NULL);

INSERT INTO tbitens_pedido VALUES
(NULL, 1, 1, NULL),
(NULL, 1, 2, NULL);

-- 8
UPDATE tbitens_pedido SET produto_id = 3
WHERE pedido_id = 1 AND produto_id = 2;

-- 9
SELECT tbproduto.nome
FROM tbitens_pedido
INNER JOIN tbproduto
ON tbitens_pedido.produto_id = tbproduto.id
WHERE tbitens_pedido.pedido_id = 1;

-- 10
DELETE FROM tbitens_pedido
WHERE pedido_id = 1;

DELETE FROM tbpedido
WHERE id = 1;
