public class Layout implements Cloneable {
    String name;
    String header;
    String footer;

    public Layout(String name,String header,String footer){
        super();
        this.name=name;
        this.footer=footer;
        this.header=header;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public Layout clone() throws CloneNotSupportedException {
        return (Layout) super.clone();
    }


    @Override
    public String toString() {
        return "Layout{" +
                "name='" + name +"'"+
                ", header='" + header + '\'' +
                ", footer='" + footer +"'" +
                '}';
    }
}
