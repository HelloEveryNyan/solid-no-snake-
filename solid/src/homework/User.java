package homework;

class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public User(java.lang.String bob, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }

    public void save(DataSaver dataSaver) {
        dataSaver.save();
    }
}