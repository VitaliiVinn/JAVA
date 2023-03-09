package okten_java.lesson2.describingOfUser;

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
    Company company;

    public Details(String phone, String website, User user, Company company) {
        this.phone = phone;
        this.website = website;
        this.user = user;
        this.company = company;
    }

    @Override
    public String toString() {
        return "\n'user':" + user + "," +
                "\n'phone':" + phone + "," +
                "\n'website':" + website + "," +
                "\n'company':{" +
                "\n'name':" + company.name +
                "\n'catchPhrase':" + company.catchPhrase +
                "\n'bs':" + company.bs + "\n}" + "\n}";
    }
}
