class MovieMangementz1
{
          public static void main(String args[])
          {

          theaterHall bs= new theaterHall();
          bs.setMovie(88,"Sooryavanshi","Rohit shetty",300);
          theaterHall bs2= new theaterHall();
          bs2.setMovie(80,"street dancer" ,"Remo sir",400);
          bs.getMovie();
          bs2.getMovie();
          }
}
 class theaterHall
 {
          private int mNum,mPrice;
          private String  mName,mDirector;

                  public void setMovie(int movieNum,String movieName,String movieDirector, int moviePrice){
                  mNum=movieNum;
                  mName=movieName;
                  mDirector=movieDirector;
                  mPrice=moviePrice;
          }
                 public void getMovie(){
                 System.out.println(mNum+"is"+mName+"which is written by"+mDirector+" and it is price"+mPrice+"rs");
          }


}