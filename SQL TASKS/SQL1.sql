SELECT * FROM employee;
-- USE wipro_poc;
-- INSERT INTO employee (EmpID,EmpName, EmpAge, EmpDept)
-- VALUES
-- (6, 'Raju', 24, 'HR');

-- SET SQL_SAFE_UPDATES = 0;
-- UPDATE employee
-- SET EmpName = 'Surya'
-- WHERE EmpName = 'Raju';

-- ALTER TABLE employee RENAME COLUMN
-- EmpName TO EmployeeName;

-- DELETE FROM employee
-- WHERE EmployeeName = 'Rahul';

ALTER TABLE employee
DROP COLUMN EmpAge;



