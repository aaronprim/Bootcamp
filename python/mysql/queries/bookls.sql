-- SELECT * FROM authors
-- JOIN favorites On authors.id = favorites.author_id
-- JOIN books ON books.id = favorites.book_id
DELETE id,name FROM author IN
(SELECT authors.id,authors.name from authors 
JOIN favorites on authors.id = favorites.author_id
WHERE favorites.book_id=3)



   