public class Lop {
    int id;
    String tenLop;

    public Lop() {
    }

    public Lop(int id, String tenLop) {
        this.id = id;
        this.tenLop = tenLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "id=" + id +
                ", tenLop='" + tenLop + '\'' +
                '}';
    }
}
