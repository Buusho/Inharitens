public class SamrtWatch extends Technique {
    private  String size;
    private String fluidity;


    public SamrtWatch (String name , String mark, String version, String size,String fluidity){
        super(name, mark, version);
        this.size=size;
        this.fluidity=fluidity;

    }
    public void paying(){
        System.out.println("this smart watch can pay with ApplePay");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFluidity() {
        return fluidity;
    }

    public void setFluidity(String fluidity) {
        this.fluidity = fluidity;
    }

    @Override
    public String toString() {
        return super.toString() + "SamrtWatch{" +
                "size='" + size + '\'' +
                ", fluidity='" + fluidity + '\'' +
                '}';
    }
}
