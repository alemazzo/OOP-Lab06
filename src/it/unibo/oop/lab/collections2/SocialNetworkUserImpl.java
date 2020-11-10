package it.unibo.oop.lab.collections2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Instructions
 * 
 * This will be an implementation of
 * {@link it.unibo.oop.lab.collections2.SocialNetworkUser}:
 * 
 * 1) complete the definition of the methods by following the suggestions
 * included in the comments below.
 * 
 * @param <U>
 *            Specific user type
 */
public class SocialNetworkUserImpl<U extends User> extends UserImpl implements SocialNetworkUser<U> {

	private Map<String, Set<U>> followed; 
	private List<U> followers; 
	
	public SocialNetworkUserImpl(final String name, final String surname, final String user) {
		this(name, surname, user, -1);
	}
    /**
     * Builds a new {@link SocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
	public SocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
	    super(name, surname, user, userAge);
	    this.followed = new HashMap<>();
	    this.followers = new ArrayList<>();        
	}

    /*
     * [METHODS]
     * 
     * Implements the methods below
     */

    @Override
    public boolean addFollowedUser(final String circle, final U user) {
    	if (this.followed.get(circle) == null) {
    		this.followed.put(circle, new HashSet<>()); 		
    	}
    	return this.followed.get(circle).add(user);
    }

    @Override
    public Collection<U> getFollowedUsersInGroup(final String groupName) {
      	if (this.followed.containsKey(groupName)) {
      		return new HashSet<U>(this.followed.get(groupName));
      	}
      	return new HashSet<U>();
    }

    @Override
    public List<U> getFollowedUsers() {
        return this.followers;
    }

}
