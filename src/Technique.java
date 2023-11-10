public class Technique {
private String name;
private String mark;
private String version;

public Technique (String name,String mark , String version){
    this.name=name;
    this.mark=mark;
    this.version=version;

}
public void TurnOn(){
    System.out.println(name+"Включено");
}
public  void TurnOff(){
    System.out.println(name+"Выключена");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
