package zendesk.support.request;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import zendesk.support.suas.State;
/* loaded from: classes8.dex */
class StateUi implements Serializable {
    private final DialogState dialogState;

    /* loaded from: classes8.dex */
    public interface DialogState {
        boolean isVisible();

        DialogState setVisible(boolean z);
    }

    public StateUi(DialogState dialogState) {
        this.dialogState = dialogState;
    }

    public static StateUi fromState(State state) {
        StateUi stateUi = (StateUi) state.getState(StateUi.class);
        if (stateUi != null) {
            return stateUi;
        }
        return new StateUi();
    }

    public DialogState getDialogState() {
        return this.dialogState;
    }

    public StateUi setDialogState(DialogState dialogState) {
        return new StateUi(dialogState);
    }

    public String toString() {
        return "UiState{dialogState=" + this.dialogState + CoreConstants.CURLY_RIGHT;
    }

    public StateUi() {
        this.dialogState = null;
    }
}
