package Model;

public class Page {
    private String name;
    private final String ip;
    private String url;

    public Page(String name) {
        this.name = name.trim().replace(" ", "");
        this.ip = generateRandomIP();
        receiveUrl();
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public String getUrl() {
        return url;
    }

    private static String generateRandomIP() {
        int part1 = (int) (Math.random() * 256);
        int part2 = (int) (Math.random() * 256);
        int part3 = (int) (Math.random() * 256);
        int part4 = (int) (Math.random() * 256);

        return part1 + "." + part2 + "." + part3 + "." + part4;
    }

    public String receiveUrl(){
        this.url = (getName() + getIp().trim());
        return this.url;
    }

    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
