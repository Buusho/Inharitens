public class Phone extends Technique{

    private String chip;
    private String size;

    public Phone ( String name ,String mark, String version,String chip, String size){
        super(name,mark,version);
        this.chip=chip;
        this.size=size;
    }
    public void screenResolution(){
        System.out.println("Screen resolution: 4kFuulHd120");
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Phone{" +
                "chip='" + chip + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
