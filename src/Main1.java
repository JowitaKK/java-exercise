public class Main1{
    public static void mian (String[] args){
    Door dd = new Door();
    dd.name = "Driver";
    dd.open();

    Door pd = new Door();
    pd.name = "Passenger";
    pd.printStatus();
    pd.open();
    pd.printStatus();
    dd.close();
    dd.printStatus();
    }
}
