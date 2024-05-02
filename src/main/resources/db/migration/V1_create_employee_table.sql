CREATE TABLE employee (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(255),
    lastName VARCHAR(255),
    office VARCHAR(255),
    active BOOLEAN
);