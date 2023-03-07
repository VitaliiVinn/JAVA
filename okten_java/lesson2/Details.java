package okten_java.lesson2;

public class Details {
    //    },
//        "phone": "1-770-736-8031 x56442",
//            "website": "hildegard.org",
//            "company": {
//        "name": "Romaguera-Crona",
//                "catchPhrase": "Multi-layered client-server neural-net",
//                "bs": "harness real-time e-markets"
//    }
//    }
    User user;
    private String phone;
    private String website;
    String[] company = new String[3];

    public Details(String phone, String website, User user) {
        this.phone = phone;
        this.website = website;
        this.user = user;
    }
    @Override
    public String toString(){
        return "\n{" +
                "\n'user':" + user + "," +
                "\n'phone':" + phone + "," +
                "\n'website':" + website + "," +
                "\n'company':" + company + "\n}";
    }
}
