-- queries.sql

-- вывод таблицы
SELECT * FROM Jaegers;
-- отобразить не уничтоженных роботов
SELECT * FROM Jaegers WHERE status = 'In line';
-- отобразить несколько серий
SELECT * FROM Jaegers WHERE mark = '5' OR mark = '7';
-- отсортировать таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;
-- отобразить самого старого робота
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
-- отобразить роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers)
OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
-- отобразить средний вес роботов
SELECT AVG(weight) FROM Jaegers;
-- увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'In line';
-- удалите уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'Destroyed';

