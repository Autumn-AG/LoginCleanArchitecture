package interface_adapter.clear_users;
import interface_adapter.signup.SignupController;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import use_case.signup.SignupInputBoundary;

public class ClearController extends SignupController {
    final ClearInputBoundary userClearInteractor;

    public ClearController(ClearInputBoundary userClearInteractor) {
        super((SignupInputBoundary) userClearInteractor);
        this.userClearInteractor = userClearInteractor;
    }
    public void clear() {
        userClearInteractor.execute();
    }
}
