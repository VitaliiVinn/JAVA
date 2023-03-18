package okten_java.lesson2.describingOfUser.additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainAdditional {
    public static void main(String[] args) {

        //***Additional***
//        Є об'єкти постів:
//        {

//            "userId": 1,
//                "id": 1,
//                "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
//                "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
//        },
//        {
//            "userId": 1,
//                "id": 2,
//                "title": "qui est esse",
//                "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
//        },
//        {
//            "userId": 1,
//                "id": 3,
//                "title": "ea molestias quasi exercitationem repellat qui ipsa sit aut",
//                "body": "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
//        }
//
//        Є об'єкти коментарів до цих постів
//        {
//            "postId": 1,
//                "id": 1,
//                "name": "id labore ex et quam laborum",
//                "email": "Eliseo@gardner.biz",
//                "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
//        },
//        {
//            "postId": 1,
//                "id": 2,
//                "name": "quo vero reiciendis velit similique earum",
//                "email": "Jayne_Kuhic@sydney.com",
//                "body": "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"
//        },
//        {
//            "postId": 1,
//                "id": 3,
//                "name": "odio adipisci rerum aut animi",
//                "email": "Nikita@garfield.biz",
//                "body": "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"
//        },
//
//        {
//            "postId": 2,
//                "id": 7,
//                "name": "repellat consequatur praesentium vel minus molestias voluptatum",
//                "email": "Dallas@ole.me",
//                "body": "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"
//        },
//        {
//            "postId": 2,
//                "id": 8,
//                "name": "et omnis dolorem",
//                "email": "Mallory_Kunze@marie.org",
//                "body": "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"
//        }
//
//
//        {
//            "postId": 3,
//                "id": 13,
//                "name": "aut inventore non pariatur sit vitae voluptatem sapiente",
//                "email": "Kariane@jadyn.tv",
//                "body": "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
//        },
//            "postId": 3,
//                "id": 14,
//                "name": "et officiis id praesentium hic aut ipsa dolorem repudiandae",
//                "email": "Nathan@solon.io",
//                "body": "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
//        },
//        {
//            "postId": 3,
//                "id": 15,
//                "name": "debitis magnam hic odit aut ullam nostrum tenetur",
//                "email": "Maynard.Hodkiewicz@roberta.com",
//                {
//                "body": "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
//        },
//
//        Запакувати всі пости в список,всі коментарі в свій окремий список
//        Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
//
//        В постах додатково потрібно додати поле яке характеризує список комментарів.

        ArrayList<Posts> posts = new ArrayList<>();
        posts.add(new Posts(1, 1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut " +
                        "ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Posts(1, 2,
                "qui est esse",
                "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat " +
                        "blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus " +
                        "qui neque nisi nulla"));
        posts.add(new Posts(1, 3,
                "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel " +
                        "accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut"));

        ArrayList<Comments> comments = new ArrayList<>();
        comments.add(new Comments(1, 1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora" +
                " quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comments(1, 2,
                "quo vero reiciendis velit similique earum",
                "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\\net " +
                "omnis occaecati quod ullam at\\nvoluptatem error expedita pariatur\\nnihil sint nostrum voluptatem " +
                "reiciendis et"));
        comments.add(new Comments(1, 3,
                "odio adipisci rerum aut animi",
                "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\\naut expedita " +
                "occaecati aliquam eveniet laudantium\\nomnis quibusdam delectus saepe quia accusamus maiores nam est\\" +
                "ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comments(2, 7,
                "repellat consequatur praesentium vel minus molestias voluptatum",
                "Dallas@ole.me", "maiores sed dolores similique labore et inventore et\\nquasi temporibus " +
                "esse sunt id et\\neos voluptatem aliquam\\naliquid ratione corporis molestiae mollitia quia et magnam " +
                "dolor"));
        comments.add(new Comments(2, 8,
                "et omnis dolorem",
                "Mallory_Kunze@marie.org", "ut voluptatem corrupti velit\\nad voluptatem maiores\\net nisi " +
                "velit vero accusamus maiores\\nvoluptates quia aliquid ullam eaque"));
        comments.add(new Comments(3, 13,
                "aut inventore non pariatur sit vitae voluptatem sapiente",
                "Kariane@jadyn.tv", "fuga eos qui dolor rerum\\ninventore corporis exercitationem\\ncorporis" +
                " cupiditate et deserunt recusandae est sed quis culpa\\neum maiores corporis et"));
        comments.add(new Comments(3, 14,
                "et officiis id praesentium hic aut ipsa dolorem repudiandae",
                "Nathan@solon.io", "vel quae voluptas qui exercitationem\\nvoluptatibus unde sed\\nminima et" +
                " qui ipsam aspernatur\\nexpedita magnam laudantium et et quaerat ut qui dolorum"));
        comments.add(new Comments(3, 15,
                "debitis magnam hic odit aut ullam nostrum tenetur",
                "Maynard.Hodkiewicz@roberta.com", "nihil ut voluptates blanditiis autem odio dicta rerum\\" +
                "nquisquam saepe et est\\nsunt quasi nemo laudantium deserunt\\nmolestias tempora quo quia"));

       for (Posts p: posts){
           for(Comments c: comments){
               if(p.getId() == c.getPostId()){
                   p.getComments().add(c);
               }
           }
       }
       for (Posts p: posts){
           System.out.println(p);
       }



    }
}
