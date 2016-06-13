
CREATE TABLE public.Endereco (
                Endereco_id VARCHAR NOT NULL,
                logradouro VARCHAR NOT NULL,
                numero INTEGER NOT NULL,
                complemento VARCHAR NOT NULL,
                cep VARCHAR NOT NULL,
                cidade VARCHAR NOT NULL,
                estado VARCHAR NOT NULL,
                CONSTRAINT endereco_pk PRIMARY KEY (Endereco_id)
);


CREATE SEQUENCE public.operador_do_sistema_id_seq_2;

CREATE TABLE public.Operador_do_Sistema (
                Operador_id INTEGER NOT NULL DEFAULT nextval('public.operador_do_sistema_id_seq_2'),
                CPF VARCHAR NOT NULL,
                login VARCHAR NOT NULL,
                senha VARCHAR NOT NULL,
                nome VARCHAR NOT NULL,
                CONSTRAINT operador_do_sistema_pk PRIMARY KEY (Operador_id)
);


ALTER SEQUENCE public.operador_do_sistema_id_seq_2 OWNED BY public.Operador_do_Sistema.Operador_id;

CREATE SEQUENCE public.fornecedor_fornecedor_id_seq_1;

CREATE TABLE public.Fornecedor (
                Fornecedor_id INTEGER NOT NULL DEFAULT nextval('public.fornecedor_fornecedor_id_seq_1'),
                CNPJ VARCHAR NOT NULL,
                nome VARCHAR NOT NULL,
                telefone VARCHAR NOT NULL,
                codigo VARCHAR NOT NULL,
                Endereco_id VARCHAR NOT NULL,
                CONSTRAINT fornecedor_pk PRIMARY KEY (Fornecedor_id)
);


ALTER SEQUENCE public.fornecedor_fornecedor_id_seq_1 OWNED BY public.Fornecedor.Fornecedor_id;

CREATE SEQUENCE public.material_material_id_seq;

CREATE TABLE public.Material (
                Material_id INTEGER NOT NULL DEFAULT nextval('public.material_material_id_seq'),
                codigo VARCHAR NOT NULL,
                descricao VARCHAR NOT NULL,
                unidade_de_medida VARCHAR NOT NULL,
                preco_de_mercado DOUBLE PRECISION NOT NULL,
                CONSTRAINT material_pk PRIMARY KEY (Material_id)
);


ALTER SEQUENCE public.material_material_id_seq OWNED BY public.Material.Material_id;

CREATE SEQUENCE public.almoxarifado_almoxarifado_id_seq;

CREATE TABLE public.Almoxarifado (
                Almoxarifado_id INTEGER NOT NULL DEFAULT nextval('public.almoxarifado_almoxarifado_id_seq'),
                codigo VARCHAR NOT NULL,
                Endereco_id VARCHAR NOT NULL,
                CONSTRAINT almoxarifado_pk PRIMARY KEY (Almoxarifado_id)
);


ALTER SEQUENCE public.almoxarifado_almoxarifado_id_seq OWNED BY public.Almoxarifado.Almoxarifado_id;

CREATE TABLE public.Setor (
                Setor_id INTEGER NOT NULL,
                Almoxarifado_id INTEGER NOT NULL,
                capacidade BIGINT NOT NULL,
                nome VARCHAR NOT NULL,
                CONSTRAINT setor_pk PRIMARY KEY (Setor_id)
);


CREATE SEQUENCE public.alocacao_alocacao_id_seq;

CREATE TABLE public.Alocacao (
                Alocacao_id INTEGER NOT NULL DEFAULT nextval('public.alocacao_alocacao_id_seq'),
                Fornecedor_id INTEGER NOT NULL,
                Material_id INTEGER NOT NULL,
                Setor_id INTEGER NOT NULL,
                quantidade BIGINT NOT NULL,
                CONSTRAINT alocacao_pk PRIMARY KEY (Alocacao_id)
);


ALTER SEQUENCE public.alocacao_alocacao_id_seq OWNED BY public.Alocacao.Alocacao_id;

CREATE SEQUENCE public.entrada_entrada_id_seq_1;

CREATE TABLE public.Entrada (
                Entrada_id INTEGER NOT NULL DEFAULT nextval('public.entrada_entrada_id_seq_1'),
                Alocacao_id INTEGER NOT NULL,
                quantidade INTEGER NOT NULL,
                data_da_operacao TIMESTAMP NOT NULL,
                Operador_id INTEGER NOT NULL,
                CONSTRAINT entrada_pk PRIMARY KEY (Entrada_id)
);


ALTER SEQUENCE public.entrada_entrada_id_seq_1 OWNED BY public.Entrada.Entrada_id;

CREATE SEQUENCE public.saida_saida_id_seq_1;

CREATE TABLE public.Saida (
                Saida_id INTEGER NOT NULL DEFAULT nextval('public.saida_saida_id_seq_1'),
                Operador_id INTEGER NOT NULL,
                Alocacao_id INTEGER NOT NULL,
                nome_departamento VARCHAR NOT NULL,
                data_da_operacao TIMESTAMP NOT NULL,
                quantidade INTEGER NOT NULL,
                CONSTRAINT saida_pk PRIMARY KEY (Saida_id)
);


ALTER SEQUENCE public.saida_saida_id_seq_1 OWNED BY public.Saida.Saida_id;

ALTER TABLE public.Fornecedor ADD CONSTRAINT endereco_fornecedor_fk
FOREIGN KEY (Endereco_id)
REFERENCES public.Endereco (Endereco_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Almoxarifado ADD CONSTRAINT endereco_almoxarifado_fk
FOREIGN KEY (Endereco_id)
REFERENCES public.Endereco (Endereco_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Saida ADD CONSTRAINT operador_do_sistema_saida_fk
FOREIGN KEY (Operador_id)
REFERENCES public.Operador_do_Sistema (Operador_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Entrada ADD CONSTRAINT operador_do_sistema_entrada_fk
FOREIGN KEY (Operador_id)
REFERENCES public.Operador_do_Sistema (Operador_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT fornecedor_alocacao_fk
FOREIGN KEY (Fornecedor_id)
REFERENCES public.Fornecedor (Fornecedor_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT material_alocacao_fk
FOREIGN KEY (Material_id)
REFERENCES public.Material (Material_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Setor ADD CONSTRAINT almoxarifado_setor_fk
FOREIGN KEY (Almoxarifado_id)
REFERENCES public.Almoxarifado (Almoxarifado_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT setor_alocacao_fk
FOREIGN KEY (Setor_id)
REFERENCES public.Setor (Setor_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Saida ADD CONSTRAINT alocacao_saida_fk
FOREIGN KEY (Alocacao_id)
REFERENCES public.Alocacao (Alocacao_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Entrada ADD CONSTRAINT alocacao_entrada_fk
FOREIGN KEY (Alocacao_id)
REFERENCES public.Alocacao (Alocacao_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;