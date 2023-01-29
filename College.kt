class College {

    var collegename: String = ""
    var collegeplace: String = ""
    var branchobj=branch();
    var studentobj=student();

    fun display(){
        println("College Name : "+collegename)
        println("College Place : "+collegeplace)
    }

    inner class branch {

        var branchname: String = ""

        fun display() {
            println("Branch Name : "+branchname)


        }
    }


        inner class student{
         var studentname:String=""
            var studentplace:String=""

            fun display() {
                println("Student Name : "+studentname)
                println("Student Place : "+studentplace)
            }
        }
    }

    fun main() {
        var collobj = College();
        collobj.studentobj.studentname="Saurabh";
        collobj.studentobj.studentplace="Nagpur";
        collobj.branchobj.branchname="ETC";
        collobj.collegename="SBJITMR"
        collobj.collegeplace="Nagpur"
        collobj.studentobj.display()
        collobj.branchobj.display()
        collobj.display()


    }



