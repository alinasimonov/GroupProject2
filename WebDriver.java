package project2;

//Provide Implementation for the diagram below. Then create a test class
//in which you need to create Objects of ChromeDriver, FirefoxDrive and
//SafariDriver classes and see which methods available to them.
interface WebDriver {
    void open();

    void close();

    String getTitle();

    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }

    interface TakeScreenShot extends RemoteWebDriver {
        void getScreenShot();
    }

    class ChromeDriver implements RemoteWebDriver {
        public void open() {

        }
        public void close(){

        }
        public String getTitle(){
            return null;
        }
        public void navigate(){

        }
    }
    class FirefoxDriver implements RemoteWebDriver{
        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }
    class SafariDriver implements RemoteWebDriver{
        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }
    class tester{
        public static void main(String[] args){
            ChromeDriver c1=new ChromeDriver();
            c1.open();
            c1.close();
            c1.navigate();
            c1.getTitle();

            FirefoxDriver c2=new FirefoxDriver();
            c2.open();
            c2.close();
            c2.navigate();
            c2.getTitle();

            SafariDriver c3=new SafariDriver();
            c3.open();
            c3.close();
            c3.navigate();
            c3.getTitle();
        }
    }
        }
