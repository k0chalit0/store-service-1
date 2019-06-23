/***********************************************************************************************/
CREATE PROCEDURE GetAllBill
AS
    SELECT * FROM bill;
    GO
/***********************************************************************************************/
CREATE PROCEDURE GetAllUsers
AS
    SELECT * FROM users;
    GO
/***********************************************************************************************/
CREATE PROCEDURE GetAllClient
AS
    SELECT * FROM client;
    GO
/***********************************************************************************************/
CREATE PROCEDURE GetAllProduct
AS
    SELECT * FROM product;
    GO
/***********************************************************************************************/
CREATE PROCEDURE GetAllProvider
AS
    SELECT * FROM provider;
    GO
/***********************************************************************************************/
CREATE PROCEDURE GetAllImageFile
AS
    SELECT * FROM image_file;
    GO