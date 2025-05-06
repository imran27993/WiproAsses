USE trainerassesment;
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DeptName VARCHAR(100) NOT NULL,
    Location VARCHAR(100)
);
CREATE TABLE Employees (
    EmpID INT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50),
    Email VARCHAR(100) UNIQUE,
    DepartmentID INT,
    Salary DECIMAL(10,2) CHECK (Salary >= 0),
    HireDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);
CREATE TABLE Projects (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(100) NOT NULL,
    EmpID INT,
    FOREIGN KEY (EmpID) REFERENCES Employees(EmpID)
);
INSERT INTO Departments (DepartmentID, DeptName, Location) VALUES
(1, 'HR', 'New York'),
(2, 'IT', 'Bangalore'),
(3, 'Finance', 'London'),
(4, 'Marketing', 'San Francisco'),
(5, 'Operations', 'Singapore');

INSERT INTO Employees (EmpID, FirstName, LastName, Email, DepartmentID, Salary, HireDate) VALUES
(101, 'Alice', 'Brown', 'alice@wipro.com', 2, 70000, '2022-06-10'),
(102, 'Bob', 'Smith', 'bob@wipro.com', 1, 60000, '2021-03-15'),
(103, 'Charlie', 'Davis', 'charlie@wipro.com', 3, 65000, '2023-01-20'),
(104, 'Diana', 'Moore', 'diana@wipro.com', 2, 80000, '2020-11-01'),
(105, 'Ethan', 'Lee', 'ethan@wipro.com', 4, 72000, '2023-09-10'),
(106, 'Fiona', 'Taylor', 'fiona@wipro.com', 5, 50000, '2022-12-05'),
(107, 'George', 'Wilson', 'george@wipro.com', 4, 55000, '2021-05-22'),
(108, 'Hannah', 'Clark', 'hannah@wipro.com', 3, 67000, '2022-02-28'),
(109, 'Ian', 'Thomas', 'ian@wipro.com', 5, 62000, '2021-07-19'),
(110, 'Jane', 'Hall', 'jane@wipro.com', 2, 75000, '2023-03-10');

INSERT INTO Projects (ProjectID, ProjectName, EmpID) VALUES
(1001, 'Alpha', 101),
(1002, 'Beta', 102),
(1003, 'Gamma', 104),
(1004, 'Delta', 105),
(1005, 'Epsilon', 106),
(1006, 'Zeta', 110),
(1007, 'Eta', 108),
(1008, 'Theta', 103),
(1009, 'Iota', 109),
(1010, 'Kappa', 107);

-- Add a new column
ALTER TABLE Employees ADD PhoneNumber VARCHAR(15);

-- Modify column datatype
ALTER TABLE Employees MODIFY PhoneNumber VARCHAR(20);

-- Drop column
ALTER TABLE Employees DROP COLUMN PhoneNumber;
-- Create a new table 'Backup_Projects' similar to 'Projects'
CREATE TABLE Backup_Projects LIKE Projects;
-- Insert a new row into 'Employees'
INSERT INTO Employees (EmpID, FirstName, LastName, Email, DepartmentID, Salary, HireDate)
VALUES (111, 'Kevin', 'Lopez', 'kevin@wipro.com', 1, 59000, NOW());
-- Increase the salary of the employee with EmpID = 101 by 5000
UPDATE Employees SET Salary = Salary + 5000 WHERE EmpID = 101;
-- Delete the employee with EmpID = 111
DELETE FROM Employees WHERE EmpID = 111;
-- Insert a new record, or update if exists
INSERT INTO Employees (EmpID, FirstName, LastName, Email, DepartmentID, Salary, HireDate)
VALUES (101, 'Alice', 'Brown', 'alice@wipro.com', 2, 72000, NOW())
ON DUPLICATE KEY UPDATE Salary = 72000;
-- Select employees with salary greater than 60000
SELECT * FROM Employees WHERE Salary > 60000;

-- Select employees whose department ID is less than 3
SELECT * FROM Employees WHERE DepartmentID < 3;
-- Select employees who have a salary greater than 60000 and are in department 2
SELECT * FROM Employees WHERE Salary > 60000 AND DepartmentID = 2;

-- Select employees who are in department 1 or department 3
SELECT * FROM Employees WHERE DepartmentID = 1 OR DepartmentID = 3;

-- Select employees whose department is not 2
SELECT * FROM Employees WHERE NOT DepartmentID = 2;
-- Select employees whose first name starts with 'A'
SELECT * FROM Employees WHERE FirstName LIKE 'A%';

-- Select employees whose first name does not start with 'A'
SELECT * FROM Employees WHERE FirstName NOT LIKE 'A%';
-- Select employees from department 1 or 2
SELECT * FROM Employees WHERE DepartmentID IN (1, 2);

-- Select employees not in departments 1 or 2
SELECT * FROM Employees WHERE DepartmentID NOT IN (1, 2);
-- Select employees whose salary is between 60000 and 75000
SELECT * FROM Employees WHERE Salary BETWEEN 60000 AND 75000;

-- Select employees whose salary is not between 60000 and 75000
SELECT * FROM Employees WHERE Salary NOT BETWEEN 60000 AND 75000;
-- Select employees who are assigned to at least one project
SELECT * FROM Employees e
WHERE EXISTS (
  SELECT 1 FROM Projects p WHERE p.EmpID = e.EmpID
);

-- Select employees who are not assigned to any project
SELECT * FROM Employees e
WHERE NOT EXISTS (
  SELECT 1 FROM Projects p WHERE p.EmpID = e.EmpID
);
-- Select employees whose first name starts with 'A'
SELECT * FROM Employees WHERE FirstName LIKE 'A%';

-- Select employees whose first name has 'a' as the second letter
SELECT * FROM Employees WHERE FirstName LIKE '_a%';
-- Select employee names and their respective department names
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e
INNER JOIN Departments d ON e.DepartmentID = d.DepartmentID;
-- Select all employees and their department names (including employees with no department)
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e
LEFT JOIN Departments d ON e.DepartmentID = d.DepartmentID;
-- Select all departments and their employees (including departments with no employees)
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e
RIGHT JOIN Departments d ON e.DepartmentID = d.DepartmentID;
-- Select all employees and all departments, with matching rows from both sides
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e
LEFT JOIN Departments d ON e.DepartmentID = d.DepartmentID
UNION
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e
RIGHT JOIN Departments d ON e.DepartmentID = d.DepartmentID;
-- Return every combination of employee and department
SELECT e.FirstName, d.DeptName
FROM Employees e
CROSS JOIN Departments d;
-- Select employees who share the same department
SELECT e1.FirstName AS Emp1, e2.FirstName AS Emp2
FROM Employees e1
JOIN Employees e2 ON e1.DepartmentID = e2.DepartmentID
WHERE e1.EmpID <> e2.EmpID;
-- Same as INNER JOIN
SELECT e.FirstName, e.LastName, d.DeptName
FROM Employees e, Departments d
WHERE e.DepartmentID = d.DepartmentID;


