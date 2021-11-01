package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "April", "https://zupimages.net/up/21/44/6nx2.png"),
            new User("002", "Jake", "https://zupimages.net/up/21/44/xmbd.png"),
            new User("003", "Louise", "https://zupimages.net/up/21/44/h8f0.png"),
            new User("004", "Paul", "https://zupimages.net/up/21/44/0a4u.png"),
            new User("005", "Elodie", "https://zupimages.net/up/21/44/5yrf.png"),
            new User("006", "Phil", "https://zupimages.net/up/21/44/sge4.png"),
            new User("007", "Helene", "https://zupimages.net/up/21/44/8iyp.png"),
            new User("008", "Guillaume", "https://zupimages.net/up/21/44/lis4.png"),
            new User("009", "Fanny", "https://zupimages.net/up/21/44/7dk5.png"),
            new User("010", "Francis", "https://zupimages.net/up/21/44/prin.png"),
            new User("011", "Laura", "https://zupimages.net/up/21/44/kdfu.png"),
            new User("012", "George", "https://zupimages.net/up/21/44/gfc1.png"),
            new User("013", "Clara", "https://zupimages.net/up/21/44/8vsf.png"),
            new User("014", "Louis", "https://zupimages.net/up/21/44/n75u.png"),
            new User("015", "Chloé", "https://zupimages.net/up/21/44/pz8b.png"),
            new User("016", "Mateo", "https://zupimages.net/up/21/44/nqei.png"),
            new User("017", "April", "https://zupimages.net/up/21/44/qh6a.png"),
            new User("018", "Henri", "https://zupimages.net/up/21/44/4oxl.png"),
            new User("019", "Marie", "https://zupimages.net/up/21/44/x89g.png"),
            new User("020", "Rémi", "https://zupimages.net/up/21/44/479i.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://zupimages.net/up/21/44/aenf.png"),
            new User("022", "Geoffrey", "https://zupimages.net/up/21/44/1pa7.png"),
            new User("023", "Carole", "https://zupimages.net/up/21/44/dsdr.png"),
            new User("024", "André", "https://zupimages.net/up/21/44/mels.png"),
            new User("025", "Elise", "https://zupimages.net/up/21/44/7b2m.png")
    );
}
