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

-- Tabela tb_jogo
CREATE TABLE tb_jogo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    icone VARCHAR(255)
);


-- Tabela tb_atividade
CREATE TABLE tb_atividade (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    data_criacao VARCHAR(10),
    data_encerramento VARCHAR(10),
    turma_id BIGINT,
    jogo_id BIGINT,
    FOREIGN KEY (turma_id) REFERENCES tb_turma(id),
    FOREIGN KEY (jogo_id) REFERENCES tb_jogo(id)
);

-- Tabela tb_progresso_atividade
CREATE TABLE tb_relatorio_atividade (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tentativas VARCHAR(10),
    acertos VARCHAR(10),
    erros VARCHAR(10),
    tempo_gasto VARCHAR(50),
    pontuacao DOUBLE,
    tipo_atividade VARCHAR(50),
    feedback VARCHAR(200),
    aluno_id BIGINT,
    atividade_id BIGINT,
    FOREIGN KEY (aluno_id) REFERENCES tb_aluno(id),
    FOREIGN KEY (atividade_id) REFERENCES tb_atividade(id)
);
