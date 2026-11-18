CREATE TABLE student (
    id        BIGSERIAL PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age       INTEGER,
    state     BOOLEAN DEFAULT TRUE
);