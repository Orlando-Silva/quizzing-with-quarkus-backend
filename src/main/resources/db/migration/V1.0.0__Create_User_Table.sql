CREATE TABLE Users (
	Id SERIAL primary key,
	Name VARCHAR(256),
	Username VARCHAR(128),
	Email VARCHAR(128),
	Password VARCHAR(256),
	Status VARCHAR(64),
	CreatedAt DATE,
	UpdatedAt DATE
);