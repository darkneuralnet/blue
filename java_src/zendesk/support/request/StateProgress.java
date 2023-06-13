package zendesk.support.request;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import zendesk.support.suas.State;
/* loaded from: classes8.dex */
class StateProgress implements Serializable {
    private final int runningRequests;

    public StateProgress() {
        this.runningRequests = 0;
    }

    public static StateProgress fomState(State state) {
        StateProgress stateProgress = (StateProgress) state.getState(StateProgress.class);
        if (stateProgress != null) {
            return stateProgress;
        }
        return new StateProgress();
    }

    public StateProgress decrement() {
        int i = this.runningRequests;
        if (i > 0) {
            return new StateProgress(i - 1);
        }
        return new StateProgress(0);
    }

    public int getRunningRequests() {
        return this.runningRequests;
    }

    public StateProgress increment() {
        return new StateProgress(this.runningRequests + 1);
    }

    public String toString() {
        return "Progress{runningRequests=" + this.runningRequests + CoreConstants.CURLY_RIGHT;
    }

    public StateProgress(int i) {
        this.runningRequests = i;
    }
}
