INSERT INTO USERCREDENTIALS (ID, USERNAME, PASSWORD) VALUES (1, 'admin', 'admin')
INSERT INTO USERCREDENTIALS (ID, USERNAME, PASSWORD) VALUES (2, 'user', 'user')
INSERT INTO USERGROUP (ID, GROUPNAME, USERCREDENTIALS_ID) VALUES (1, 'ADMINS', 1)
INSERT INTO USERGROUP (ID, GROUPNAME, USERCREDENTIALS_ID) VALUES (2, 'USERS', 2)
INSERT INTO BOOK (ID, TITLE, AUTHOR, PRICE) VALUES (1, 'Romeo i Julia', 'William Szekspir', 49.99)
INSERT INTO BOOK (ID, TITLE, AUTHOR, PRICE) VALUES (2, 'Hamlet', 'William Szekspir', 37.99)
INSERT INTO BOOK (ID, TITLE, AUTHOR, PRICE) VALUES (3, 'Zbrodnia i Kara', 'Fiodor Dostojewski', 33.99)