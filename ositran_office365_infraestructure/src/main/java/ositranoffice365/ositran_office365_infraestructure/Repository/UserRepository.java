package ositranoffice365.ositran_office365_infraestructure.Repository;

import ositranoffice365.ositran_office365_domain.IUserRepository;
import ositranoffice365.ositran_office365_shared.StatusResponse;

public class UserRepository implements IUserRepository {

    public UserRepository( )
    {

    }

    public StatusResponse<String> prueba() {
        return new StatusResponse<>(true, "xx");
    }
}
