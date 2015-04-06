package tutorial.card.recycler.nanofaroque.com.recyclercardtutorial;

/**
 * Created by ofaro on 4/3/2015.
 */
public class PersonInformation {
    private String name;
    private String phone;
    private int img;

    public PersonInformation(String name, String phone, int img) {
        this.name = name;
        this.phone = phone;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
