
import com.mysql.cj.protocol.Resultset
import java.io.File
import java.io.FileInputStream
import java.sql.*
import kotlin.system.exitProcess

class JdbcDemo {

    var conn: Connection?=null;
    fun selectQuery() {


        var stn: Statement? = null
        var res: ResultSet? = null
        print("enter the id ")
        var id= readLine()!!.toInt()
        var sql = "select * from account where account>"+id+";"

        try{
            stn=conn!!.createStatement()
            res=stn!!.executeQuery(sql);
            print(res)
            while(res!!.next()){
                print("${res.getInt("accountid")}\t")
                print("${res.getInt("accountno")}\t")
                print("${res.getInt("accountbalance")}\t")
                print("${res.getInt("accounttype")}\t")
                print("${res.getInt("customerid")}\t")
                print("${res.getInt("bankid")}\t")
            }
        }catch(e:SQLException){
            print(e)
        }
    }


    fun createconnection(){
     try {
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails","root","Pass@12345")
         if(conn!=null){
             print("connection done")
         }
        // print("connect")
     }
     catch(e:SQLException){

         print(e)
     }}

    fun createTable(){
        var prestat:PreparedStatement?=null
        var sql="create table Demo5(name CHAR(255),place CHAR(255),DOB DATE);"
        try{
            prestat=conn!!.prepareStatement(sql);
            var status =prestat.executeUpdate();
            if(status>0){
                print("table is created");
            }
        }catch(e:SQLException){
            print(e)
        }
    }
    fun createtableusingstam(){

        var stm:Statement?=null;
        var sql="create table Demo5(name CHAR(255),place CHAR(255),DOB DATE);"
        try{
            stm=conn!!.createStatement();
            stm.execute(sql);
            print("table is created")
        }catch(e:SQLException){
            print(e)
        }
    }

    fun insertIntoTable(){
       var preStat:PreparedStatement?=null
        var sql ="insert into demo5(name,age)Values(?,?);"
        try{
        preStat=conn!!.prepareStatement(sql);
        preStat.setString(1, readLine())
        preStat.setInt(2, readLine()!!.toInt())
        var status=preStat.executeUpdate()
        print(status)
        if(status>0){
            print("table inserted")
        }

    }catch(e:SQLException){
        print(e)

        }    }

    fun searchTable(){
        var stm:Statement?=null
        var res:ResultSet?=null
        print("Enter ID: ")
        var searchname =readln().toString()
        var sql = "SELECT * from demo5 WHERE name = $searchname;"

        try{
            stm=conn!!.createStatement()
            println(res)
             res =stm!!.executeQuery(sql)
            println(res)
            while(res!!.next()){
                print("${res.getInt("name")}\t")
                print("${res.getInt("Place")}\t")
                print("${res.getInt("DOB")}\t")
            }

        }catch(e:SQLException){
            println(e)
        }finally {
            if(res!=null){
                try{
                    res.close()
                    conn!!.close()
                }catch(e:SQLException){
                    println(e)
                }
            }
        }
    }
    fun updateTable(){
        var preStat:PreparedStatement?=null
        var sql="update demo5 SET name=? where id=?";
        try{
            preStat=conn!!.prepareStatement(sql);
            //var name=read
        } catch(e:SQLException){
            print(e)
        }
    }



    fun InsertImage(){
        //image datatype blobo
        var preStat:PreparedStatement?=null
        var sql ="Insert into demo5(imagename,image) values(?,?);"
        try{
            var ImageFile: File = File("image1.png")
            var readImageFile =FileInputStream(ImageFile)
            preStat=conn!!.prepareStatement(sql)
            preStat.setString(1,"demo5")
            preStat.setBinaryStream(2,readImageFile)
            preStat.executeUpdate();
        }catch(e:SQLException){
            print(e)
        }
    }
    fun deleteData(){
        var preStat:PreparedStatement?=null;
        var sql ="DELETE FROM  DEMO WHERE ID=?"
        try{
            preStat=conn!!.prepareStatement(sql);
            var id=readLine()!!.toInt()
            preStat.setInt(1,id)
            var status=preStat.executeUpdate()
            if(status>0){
                print("data is deleted from table")
            }
        }catch(e:SQLException){
            print(e)
        }
    }
    fun dropTable(){
        var preStat:PreparedStatement?=null
        var sql="Drop table demo5"
        try{
            preStat=conn!!.prepareStatement(sql)
            var status=preStat.executeUpdate();
            if(status>0){
                print("table has been drop")
            }
        }catch(e:SQLException){
            print(e)
        }
    }
        fun connectionClose(){
            if(conn!=null){
               // conn.close();
            }
        }
        fun executeQueryOfDatabase(){
            var stm:Statement?=null
            var res: ResultSet?=null
            var sql="show tables"
            try{
             stm=conn!!.createStatement()
                res=stm!!.executeQuery(sql);
                print(res)
                while(res!!.next()){
                    print(res.getString("Tables_in_bankdetails"))
                }

            }
            catch(e:SQLException){
                print(e)
            } finally{
                if(res!=null){
                    try{
                        res.close()
                        conn!!.close()
                    }catch(e:SQLException){
                        print(e)
                    }
                }
            }
        }
    }



fun main(){
    var jdbcobj=JdbcDemo();
    jdbcobj.createconnection()
    //jdbcobj.executeQueryOfDatabase()
    // jdbcobj.selectQuery()
    //jdbcobj.createTable();

    print("\n1.create table\n 2.insert table\n 3.search table\n 4.Update table\n 5.Insert Image\n 6.Delete table\n 7.Drop table\n 8.exit\n")
    var choice:Int=readLine()!!.toInt()
    when(choice){
        1->jdbcobj.createtableusingstam()
        2->jdbcobj.insertIntoTable()
        3->jdbcobj.searchTable()
        4->jdbcobj.updateTable()
        5->jdbcobj.InsertImage()
        6->jdbcobj.deleteData()
        7->jdbcobj.dropTable()
        8-> exitProcess(1)
    }





}