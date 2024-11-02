-- Tabela tb_professor
CREATE TABLE tb_professor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

-- Tabela tb_turma
CREATE TABLE tb_turma (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    professor_id BIGINT,
    FOREIGN KEY (professor_id) REFERENCES tb_professor(id)
);

-- Tabela tb_aluno
CREATE TABLE tb_aluno (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento VARCHAR(10),
    foto_url VARCHAR(255),
    usuario VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    turma_id BIGINT,
    FOREIGN KEY (turma_id) REFERENCES tb_turma(id)
);


-- Tabela tb_atividade
CREATE TABLE tb_atividade (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    data_criacao VARCHAR(10),
    prazo VARCHAR(10),
    turma_id BIGINT,
    FOREIGN KEY (turma_id) REFERENCES tb_turma(id)
);

-- Tabela tb_progresso_atividade
CREATE TABLE tb_progresso_atividade (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    data_inicio VARCHAR(10),
    data_conclusao VARCHAR(10),
    tempo_gasto VARCHAR(50),
    pontuacao DOUBLE,
    status VARCHAR(50),
    aluno_id BIGINT,
    atividade_id BIGINT,
    FOREIGN KEY (aluno_id) REFERENCES tb_aluno(id),
    FOREIGN KEY (atividade_id) REFERENCES tb_atividade(id)
);
