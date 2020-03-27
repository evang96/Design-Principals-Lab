//Evan Garvey
//SoftwareEng with Test
//Design Principals lab

package ie.gmit.single;

public class userPersistenceService {
    private Store store = new Store();

    public void saveUser(User user)
    {
        store.store(user);
    }
}
