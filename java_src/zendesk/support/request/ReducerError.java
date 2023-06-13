package zendesk.support.request;

import zendesk.support.request.ActionFactory;
import zendesk.support.request.StateError;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;
/* loaded from: classes8.dex */
class ReducerError extends Reducer<StateError> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateError reduce(StateError stateError, Action action) {
        return reduce2(stateError, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateError getInitialState() {
        return new StateError();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[ORIG_RETURN, RETURN] */
    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StateError reduce2(StateError stateError, Action<?> action) {
        if (action instanceof ActionFactory.ErrorAction) {
            InterfaceC48782sg1 errorResponse = ((ActionFactory.ErrorAction) action).getErrorResponse();
            if (errorResponse.mo9890d() && errorResponse.getStatus() == 401) {
                return new StateError(StateError.ErrorType.NoAccess, errorResponse.mo9891c());
            }
        }
        String actionType = action.getActionType();
        actionType.hashCode();
        char c = 65535;
        switch (actionType.hashCode()) {
            case -1193398337:
                if (actionType.equals("LOAD_COMMENTS_UPDATE_SUCCESS")) {
                    c = 0;
                    break;
                }
                break;
            case -1063298693:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_ERROR")) {
                    c = 1;
                    break;
                }
                break;
            case -292168757:
                if (actionType.equals("LOAD_COMMENT_INITIAL")) {
                    c = 2;
                    break;
                }
                break;
            case -16010570:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_SUCCESS")) {
                    c = 3;
                    break;
                }
                break;
            case 1532422677:
                if (actionType.equals("CREATE_REQUEST_ERROR")) {
                    c = 4;
                    break;
                }
                break;
            case 1921186300:
                if (actionType.equals("CREATE_COMMENT")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 3:
                if (stateError.getState() == StateError.ErrorType.InitialGetComments) {
                    return new StateError();
                }
                if (action instanceof ActionFactory.ErrorAction) {
                    return new StateError(StateError.ErrorType.InputFormSubmission, ((ActionFactory.ErrorAction) action).getErrorResponse().mo9891c());
                }
                if (stateError.getState() != StateError.ErrorType.InputFormSubmission) {
                    return new StateError();
                }
                return null;
            case 1:
                if (action instanceof ActionFactory.ErrorAction) {
                    return new StateError(StateError.ErrorType.InitialGetComments, ((ActionFactory.ErrorAction) action).getErrorResponse().mo9891c());
                }
                if (stateError.getState() == StateError.ErrorType.InitialGetComments) {
                }
                if (action instanceof ActionFactory.ErrorAction) {
                }
                if (stateError.getState() != StateError.ErrorType.InputFormSubmission) {
                }
                break;
            case 4:
                if (action instanceof ActionFactory.ErrorAction) {
                }
                if (stateError.getState() != StateError.ErrorType.InputFormSubmission) {
                }
                break;
            case 5:
                if (stateError.getState() != StateError.ErrorType.InputFormSubmission) {
                }
                break;
            default:
                return null;
        }
    }
}
