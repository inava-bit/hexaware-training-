create database techshop;
CREATE TABLE customer2 (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    address VARCHAR(255)
);
SELECT * FROM customer2;
CREATE TABLE Products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    productname VARCHAR(50) NOT NULL,
   description  VARCHAR(50) NOT NULL,
    price VARCHAR(100) NOT NULL
);
SELECT * FROM Products;
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    totalamount VARCHAR(50) NOT NULL,
    date DATE,
     customer_id INT,
     CONSTRAINT fk_customer_id
    FOREIGN KEY (customer_id) REFERENCES customer2(customer_id)
);
SELECT * FROM orders;
CREATE TABLE orderdetails(
    orderdetail_id INT PRIMARY KEY,
    quantity INT,
     order_id INT,
     CONSTRAINT fk_order_id
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
     product_id INT,
    FOREIGN KEY (product_id) REFERENCES Products(product_id)
);
SELECT * FROM orderdetails;
CREATE TABLE inventory(
    inventory_id INT PRIMARY KEY,
    quantity_stock INT,
     Laststock_update VARCHAR(77),
     product_id INT,
    FOREIGN KEY (product_id) REFERENCES Products(product_id)
);
SELECT * FROM inventory;
INSERT INTO customer2 (customer_id,firstname,lastname, email, phone, address)
VALUES
(1, 'John','Doe', 'john@example.com', '1234567890', '123 Main St'),
(2, 'Jane','Smith', 'jane@example.com', '0987654321', '456 Oak St'),
(3, 'Alice','Johnson', 'alice@example.com', '1112223333', '789 Pine St'),
(4, 'Bob', 'Brown', 'bob@example.com', '4445556666', '321 Elm St'),
(5, 'Charlie','Green', 'charlie@example.com', '7778889999', '654 Maple St'),
(6, 'Diana', 'White', 'diana@example.com', '1231231234', '987 Cedar St'),
(7, 'Eve', 'Black', 'eve@example.com', '4564564567', '159 Birch St'),
(8, 'Frank', 'Blue', 'frank@example.com', '7897897890', '753 Walnut St');
INSERT INTO Products (product_id, productname, price, description)
VALUES
(1, 'Laptop', 1000, 'Electronics'),
(2, 'Smartphone', 700, 'Electronics'),
(3, 'Headphones', 150, 'Accessories'),
(4, 'Tablet', 400, 'Electronics'),
(5, 'Smartwatch', 200, 'Accessories'),
(6, 'Monitor', 250, 'Electronics'),
(7, 'Keyboard', 50, 'Accessories'),
(8, 'Mouse', 30, 'Accessories');
INSERT INTO orders(order_id, customer_id, date, totalamount)
VALUES
(1, 1, '2023-09-01', 1700),
(2, 2, '2023-09-03', 700),
(3, 3, '2023-09-05', 1150),
(4, 4, '2023-09-07', 450),
(5, 5, '2023-09-08', 400),
(6, 6, '2023-09-10', 230),
(7, 7, '2023-09-11', 150),
(8, 8, '2023-09-12', 250);
INSERT INTO orderDetails (orderdetail_id, order_id, product_id, quantity)
VALUES
(1, 1, 1, 1), 
(2, 1, 3,4),   
(3, 2, 2, 1),   
(4, 3, 1, 1), 
(5, 3, 5, 1),   
(6, 4, 4,1),  
(7, 4, 7, 1),    
(8, 5, 4, 1);
INSERT INTO inventory (inventory_id , product_id, quantity_stock, laststock_update)
VALUES
(1,1,100,50),  
(2,2,200, 50),  
(3,3,500, 100), 
(4,4,150, 30),  
(5,5,300, 50), 
(6,6,120, 20),  
(7,7,400, 100), 
(8,8,600, 150); 
select firstname , email from customer2;
select orders.order_id ,Orders.date, customer2.firstname
FROM orders
JOIN customer2 ON orders.customer_id = customer2.customer_id;
INSERT INTO customer2(firstname,lastname,email) VALUES ('rome','k','rome2@gmail.com');
SET sql_safe_updates =0;
UPDATE Products
SET price = price * 1.10
WHERE description = 'Electronics';
DELETE from orderdetails where order_id = 1;
select * from orderdetails;
DELETE from orders where order_id = 1;
UPDATE customer2 SET email = 'john.doe@example.com', address = '123 Maple Street' WHERE customer_id = 101;
select * from Products;
UPDATE orders SET totalamount=188 where order_id=1;
