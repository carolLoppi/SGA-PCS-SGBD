INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (1, 'Rua da Casinha', 42, 201, '22051070', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (2, 'Rua do Apartamento', 42, 1010, '22333-456', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (3, 'Rua do Apartamento', 42, 1011, '22333-456', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (2, 'Rua do Apartamento', 42, 1012, '22333-456', 'Rio de Janeiro', 'RJ');

INSERT INTO operador_do_sistema(operador_id, cpf, login, senha, nome) VALUES (1, '111.222.333-44', 'operador', '123', 'João das Couves');

INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES (1, 'BOR123','Borracha', 'unidade', 1.00);
INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES (2, 'CAN123','Caneta Esferográfica Azul', 'unidade', 1.50);
INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES (3, 'CAR123','Cartucho Preto HP 74', 'unidade', 65.00);
INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES (4, 'PAP123','Papel A4', 'resma', 20.00);
INSERT INTO material(material_id, codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES (5, 'TIN123','Tinta Refil para catucho HP 74', 'litro', 25.00);

INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(1, 1, 1000, 'Escritorio');
INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(2, 1, 1000, 'Limpeza');
INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(3, 1, 1000, 'Eletronicos');


INSERT INTO almoxarifado(almoxarifado_id, codigo, endereco_id) VALUES(1, 'ALM12345', '1');

INSERT INTO fornecedor(fornecedor_id, cnpj, nome, telefone, codigo, endereco_id) VALUES (1, '11.222.333/0001-99', 'PIMACO', '(11) 2222-3344', 'PIM', '2');
INSERT INTO fornecedor(fornecedor_id, cnpj, nome, telefone, codigo, endereco_id) VALUES (2, '22.333.444/0001-99', '3M', '(11) 2222-3344', '3M', '2');
INSERT INTO fornecedor(fornecedor_id, cnpj, nome, telefone, codigo, endereco_id) VALUES (3, '33.444.555/0001-99', 'HP do Brasil', '(11) 2333-4444', 'HPB', '2');