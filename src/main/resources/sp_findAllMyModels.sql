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

CREATE PROCEDURE SaveBill
    @bill_code nvarchar(50)
    ,@is_deleted bit
    ,@nit nvarchar(50)
    ,@total_pay int

AS
    insert into bill (bill_code,is_deleted,nit,total_pay) values( @bill_code,@is_deleted,@nit,@total_pay )
