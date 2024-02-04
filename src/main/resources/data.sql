INSERT INTO record_label (id, name, creation_year, capital) VALUES (1, 'GOOD Music', 2004, 400000000);
INSERT INTO record_label (id, name, creation_year, capital) VALUES (2, 'Warner Records', 1958, 1000000000);
INSERT INTO record_label (id, name, creation_year, capital) VALUES (3, 'One Little India', 1985, 60000000);

INSERT INTO artist (id, name, active_years, record_label_id) VALUES (1, 'Kanye West', '20', 1);
INSERT INTO artist (id, name, active_years, record_label_id) VALUES (2, 'Linkin Park', '21', 2);
INSERT INTO artist (id, name, active_years, record_label_id) VALUES (3, 'Bjork', '47', 3);

INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (1, 'Yeezus', 10, 2013, 1);
INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (2, 'The Life of Pablo', 18, 2016, 1);
INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (3, 'Hybrid Theory', 12, 2000, 2);
INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (4, 'Meteora', 13, 2003, 2);
INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (5, 'Debut', 12, 1993, 3);
INSERT INTO album (id, name, songs_num, release_year, artist_id) VALUES (6, 'Post', 11, 1995, 3);

INSERT INTO songs (id, title, duration, album_id) VALUES (1, 'On Sight', 156, 1);
INSERT INTO songs (id, title, duration, album_id) VALUES (2, 'New Slaves', 256, 1);
INSERT INTO songs (id, title, duration, album_id) VALUES (3, 'No More Parties in L.A.', 375, 2);
INSERT INTO songs (id, title, duration, album_id) VALUES (4, '30 Hours', 247, 2);
INSERT INTO songs (id, title, duration, album_id) VALUES (5, 'Crawling', 209, 3);
INSERT INTO songs (id, title, duration, album_id) VALUES (6, 'In the End', 216, 3);
INSERT INTO songs (id, title, duration, album_id) VALUES (7, 'Somewhere I Belong', 213, 4);
INSERT INTO songs (id, title, duration, album_id) VALUES (8, 'Faint', 162, 4);
INSERT INTO songs (id, title, duration, album_id) VALUES (9, 'Crying', 289, 5);
INSERT INTO songs (id, title, duration, album_id) VALUES (10, 'Come to Me', 295, 5);
INSERT INTO songs (id, title, duration, album_id) VALUES (11, 'Army of Me', 234, 6);
INSERT INTO songs (id, title, duration, album_id) VALUES (12, 'Enjoy', 237, 6);