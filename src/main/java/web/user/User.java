package web.user;

public class User {
    //Field
    private String name;
    private Long id;
    private Long idParentUser;

    //Constructor

    public User() {
    }

    public User(Long id, Long idParentUser, String name) {
        this.name = name;
        this.id = id;
        this.idParentUser = idParentUser;
    }

    //Function

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Long getIdParentUser() {
        return idParentUser;
    }

    public void setIdParentUser(Long idParentUser) {
        this.idParentUser = idParentUser;
    }
}
