                                        //threading in java--->
                                        //extends  thread iska  syantex h
/*class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while (i<=300){
            System.out.println("i am cocking ");
            System.out.println("i am happy ");
            i++;
        }
    }
}
                                        class MyThread2 extends Thread{
                                            public void run(){
                                                int i=0;
                                                while (i<=300){
                                                    System.out.println("i am runing ");
                                                    System.out.println("i am sad ");
                                                    i++;
                                                }
                                            }
                                        }

public class Main {
    public static void main(String[] args)
    {
 MyThread1 show=new MyThread1();
        MyThread2 showme=new MyThread2();
        show.start();              // yhan method work nhi karega yhan start methods ko hi use karna padta h
        showme.start();

    }
}*/

// thread using by runable interface ----->

// class  mytreadrunnable implements Runnable{
//     public void run(){
//         int i=0;
//         while (i<=50){
//             System.out.println("my name is ayush ");
//             i++;
//         }
//     }
//}
//                                        class  mytreadrunnable2 implements Runnable{
//                                            public void run(){
//                                                int i=0;
//                                                while (i<=50){
//                                                    System.out.println("my name is arpit ");
//                                                    i++;
//                                                }
//                                            }
//                                        }
// public class Main{
//     public static void main(String[] args) {
//         mytreadrunnable bulet=new mytreadrunnable();
//         Thread gun=new Thread(bulet);   // ye bnana hi padta h runnable tread main.. "gun" ki jgh hum kuch bhi name le skte h
//          //    aur thread ke () main class ke fuction ka naam dalna pdta h yhhan fuction  bulet h to dala gya h..
//         gun.start();
//         mytreadrunnable2 bulet2=new mytreadrunnable2();
//         Thread gun2=new Thread(bulet2);   // ye bnana hi padta h runnable tread main.. "gun" ki jgh hum kuch bhi name le skte h
//         gun2.start();
//
//     }
// }
                                  //      constructor in thread -
// there are 4 type of constructor-->
// 1.thread()
// 2.thread(string name)
// 3.thread(runnable)
// 4.thread(runnable,string name)

// 1.thread()-->> ye to hum upr padh cuke h ..


//  2.thread(string name)  --->>

//class mythread extends Thread {
//    public mythread(String name) {
//        super(name);
//    }
//
//    public void run() {
//        int i = 0;
//        while (i<=20){
//            System.out.println("my name is ramu");
//            i++;
//        }
//
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        mythread show=new mythread("ayush");
//        mythread show2=new mythread("gupta");
//        show2.start();
//        show.start();
//        System.out.println(" the id of this tread="+show.getId());    //------->>>>>> fuction.get karke sabhi method ko
//                                                                         // bula  skte h
//         System.out.println(" the id of this tread="+show2.getId());
//    }
//}

//3.thread(runnable)-->> upar kar cuke h ..


// 4.thread(runnable,string name)-->>>

//class mytread implements Runnable{
//  public  mytread( String name){
//      super();
//  }
//  public void run(){
//      int i=1;
//      while (i<=34){
//          System.out.println("my name is shyam" );
//          i++;
//      }
//  }
//}
//public class Main {
//    public static void main(String[] args) {
//        mytread show=new mytread("ayush");
//        Thread gun=new Thread(show);
//        gun.start();
//        System.out.println(gun.getName());
//        System.out.println(gun.getId());
//
//    }
//}

                     //         treads priorities--->>>>>
//     there are three type of priorities --->
//     Treads.Min priorities==1;
//     Treads.Norm priorities==5;
//     Treads.Max priorities==10;

   class mythread extends Thread {
    public mythread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i<=20){
            System.out.println("thanks  "  + this.getName());
            i++;
        }

    }
}
public class Main{
    public static void main(String[] args) {

        mythread show=new mythread("ayush");
        mythread show2=new mythread("gupta");
        mythread show3=new mythread("arpit");
        mythread show4=new mythread("ashu");
        mythread show5=new mythread("shivam");
        show5.setPriority(Thread.MAX_PRIORITY);
        show4.setPriority(Thread.MIN_PRIORITY);
        show.start();
        show2.start();
        show3.start();
        show4.start();
        show5.start();
}
        }

                                        //threads methoods---->
                                      //  1.join--->>>

//class mythreads extends Thread{
//    public void run(){
//        int i=0;
//        while (i<=450) {
//            System.out.println("thanks you ayush");
//            i++;
//
//        }
//    }
//
//}
//class mythreads2 extends Thread{
//    public void run(){
//   //     int i=0;
//     //   while(i<=356){
//            System.out.println("happy diwali");
//   //         i++;
//     //   }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        mythreads show=new mythreads();
//        mythreads2 show2=new mythreads2();
//        show.start();
//        try {
//            show.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//        show2.start();
//    }
//}

                                      //    2.sleep-->>>
//                                      class mythreads extends Thread{
//                                          public void run(){
//                                              int i=0;
//                                              while (i<=450) {
//                                                  System.out.println("thanks you ayush");
//                                                  i++;
//
//                                              }
//                                          }
//
//                                      }
//                                        class mythreads2 extends Thread{
//                                            public void run(){
//                                                int i=0;
//                                                while(i<=356){
//                                                    System.out.println("happy diwali");
//                                                    i++;
//                                                    try {
//                                                        Thread.sleep(123);
//                                                    } catch (InterruptedException e) {
//                                                        throw new RuntimeException(e);
//                                                    }
//
//                                                }
//
//                                            }
//                                        }
//                                        public class Main {
//                                            public static void main(String[] args) {
//                                                mythreads show=new mythreads();
//                                                mythreads2 show2=new mythreads2();
//                                                show.start();
//
//                                                show2.start();
//
//                                            }
//                                        }


//   how to getstate of threads--->>>
//class mythreads extends Thread{
//    public void run(){
//        int i=0;
//        while (i<=450) {
//            System.out.println("thanks you ayush");
//            i++;
//
//        }
//    }
//
//}
//class mythreads2 extends Thread{
//    public void run(){
//        int i=0;
//        while(i<=356){
//            System.out.println("happy diwali");
//            i++;
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        mythreads show=new mythreads();
//        mythreads2 show2=new mythreads2();
//        show.start();
//        show2.start();
//        System.out.println(show.getState());
//        System.out.println(show2.getState());
//
//    }
//}


