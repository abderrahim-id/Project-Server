package io.getarrays.server.repo;


import io.getarrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

// we give it the Object and the type of the primary key (Long in our case)
// it's like: Hey we are managing the Server, so we can update delete add the Server on the database
public interface ServerRepo extends JpaRepository<Server, Long> {

    // the name here is very important, cuz when you do "findBy" then you are  tell JPA to select by whatever you put after (ipAddress)
    Server findByIpAddress(String ipAddress);
    // Server findByName(String name); this will not work in our case, the name should be unique

}


// This interface is to create methods of manipulating data with MySQL