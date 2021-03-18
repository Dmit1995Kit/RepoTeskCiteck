create table filed_numbers(
   num INT
);

create table numbers_order(
  num INT
);

INSERT INTO filed_numbers(num) VALUES
(1),
(2),
(4),
(7),
(8),
(11),
(13),
(14),
(16),
(18),
(20);


INSERT INTO numbers_order(num) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20);


#filed_numbers мои данные
#numbers_order даные по порядку

CREATE VIEW dif_table AS SELECT n.num
FROM numbers_order AS n
WHERE n.num NOT IN (SELECT f.num FROM filed_numbers AS f);

SELECT d.num,
(SELECT MIN(f.num)FROM filed_numbers AS f
WHERE f.num>d.num)-d.num FROM dif_table AS d;
