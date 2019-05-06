DROP TABLE IF EXISTS "Book";
CREATE TABLE "Book" ("ID" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , "Name" CHAR, "Edition" INTEGER, "ISBN" INTEGER UNIQUE , "Publisher" CHAR, "Price" INTEGER, "Pages" INTEGER);
INSERT INTO "Book" VALUES(1,'Java Programming',2,999,'Henry Foel',375,990);
INSERT INTO "Book" VALUES(2,'Objective C',1,777,'August Cothe',420,880);
INSERT INTO "Book" VALUES(3,'Arts and Practice II',2,666,'Jason Whatson',310,778);
INSERT INTO "Book" VALUES(4,'Python Programmin',3,555,'Ann Decook',550,111);
INSERT INTO "Book" VALUES(5,'Artificial Intelligence',2,222,'San Sampson',275,390);
INSERT INTO "Book" VALUES(6,'Arabian Prehistory',4,611,'Tarikul Islam',330,770);
INSERT INTO "Book" VALUES(7,'The Endless Rose',6,211,'Ashley Brim',300,600);
INSERT INTO "Book" VALUES(10,'Machine Learning',6,811,'Sami Jane',200,580);