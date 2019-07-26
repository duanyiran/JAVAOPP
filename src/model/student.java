package model;

public class student {
    public String name;
    public int age;
    public String gender;
    public int number;
   // public student(String name,int age,int number,int number) {
    //    this.name = name;
      //  this.age = age;
        //this.gender = gender;
        //this.number = number;
//}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

            public int getNumber() {
                return number;
            }
            public void setNumber(int number) {
                this.number = number;
            }

                public String getGender() {
                    return gender;
                }
                public void setGender(String gender) {
                    this.gender = gender;
            }


}



//在Student类里面有学生姓名，年龄，性别，学号。
//提供构造方法和各个属性的get/set方法给Student类。
//在model外部的一个类里面生成学生实例，并打印出学生的所有属性。
//做完作业之后提交到自己的GitHub仓库里面。并将仓库地址贴在答案里。