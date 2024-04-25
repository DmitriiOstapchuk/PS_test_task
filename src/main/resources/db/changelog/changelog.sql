
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS news;

CREATE TABLE users (
                    id BIGSERIAL PRIMARY KEY,
                    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                    login VARCHAR(255) UNIQUE NOT NULL,
                    password VARCHAR(255) NOT NULL,
                    full_name VARCHAR(255) NOT NULL,
                    avatar_ref VARCHAR(255) DEFAULT NULL
);

CREATE TABLE orders (
                    id BIGSERIAL PRIMARY KEY,
                    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                    name VARCHAR(255) NOT NULL,
                    quantity INT NOT NULL,
                    address VARCHAR(255) NOT NULL,
                    phone_number VARCHAR(255),
                    user_id BIGINT NOT NULL,

                    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE news (
                    id BIGSERIAL PRIMARY KEY,
                    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                    text VARCHAR(255) NOT NULL
);

INSERT INTO news (id, text)
VALUES  (1,'good news'),
        (2,'very good news'),
        (3,'the best news ever');




