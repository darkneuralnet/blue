package zendesk.support.request;

import android.app.Activity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import zendesk.support.request.StateError;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentError implements Listener<ErrorStateModel> {

    /* renamed from: af */
    private final ActionFactory f121979af;
    private final CoordinatorLayout container;
    private final Dispatcher dispatcher;
    private StateError.ErrorType errorState;
    private Snackbar snackbar;

    /* renamed from: zendesk.support.request.ComponentError$2 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C313872 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$StateError$ErrorType;

        static {
            int[] iArr = new int[StateError.ErrorType.values().length];
            $SwitchMap$zendesk$support$request$StateError$ErrorType = iArr;
            try {
                iArr[StateError.ErrorType.InitialGetComments.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$request$StateError$ErrorType[StateError.ErrorType.InputFormSubmission.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class ErrorStateModel {
        private final boolean conversationsEnabled;
        private final String errorMessage;
        private final StateError.ErrorType errorState;

        public ErrorStateModel(StateError.ErrorType errorType, String str, boolean z) {
            this.errorState = errorType;
            this.errorMessage = str;
            this.conversationsEnabled = z;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public StateError.ErrorType getErrorState() {
            return this.errorState;
        }

        public boolean isConversationsEnabled() {
            return this.conversationsEnabled;
        }
    }

    /* loaded from: classes8.dex */
    public static class ErrorStateSelector implements StateSelector<ErrorStateModel> {
        @Override // zendesk.support.suas.StateSelector
        public ErrorStateModel selectData(State state) {
            StateError fromState = StateError.fromState(state);
            return new ErrorStateModel(fromState.getState(), fromState.getMessage(), StateConfig.fromState(state).getSettings().isConversationsEnabled());
        }
    }

    private ComponentError(CoordinatorLayout coordinatorLayout, Dispatcher dispatcher, ActionFactory actionFactory) {
        this.container = coordinatorLayout;
        this.dispatcher = dispatcher;
        this.f121979af = actionFactory;
    }

    public static ComponentError create(Activity activity, Dispatcher dispatcher, ActionFactory actionFactory) {
        return new ComponentError((CoordinatorLayout) activity.findViewById(C35181Pg4.activity_request), dispatcher, actionFactory);
    }

    public static StateSelector<ErrorStateModel> getSelector() {
        return new ErrorStateSelector();
    }

    @Override // zendesk.support.suas.Listener
    public void update(ErrorStateModel errorStateModel) {
        if (errorStateModel.errorState == this.errorState) {
            return;
        }
        this.errorState = errorStateModel.errorState;
        if (errorStateModel.errorState != StateError.ErrorType.NoError) {
            this.snackbar = Snackbar.m48855o0(this.container, errorStateModel.getErrorMessage(), -2);
            int i = C313872.$SwitchMap$zendesk$support$request$StateError$ErrorType[errorStateModel.getErrorState().ordinal()];
            if (i != 1) {
                if (i == 2 && !errorStateModel.isConversationsEnabled()) {
                    this.snackbar.m48849u0(C41720gl4.request_error_create_request);
                    this.snackbar.mo48864Y();
                    return;
                }
                return;
            }
            this.snackbar.m48849u0(C41720gl4.request_error_load_comments);
            this.snackbar.m48853q0(C41720gl4.retry_view_button_label, new View.OnClickListener() { // from class: zendesk.support.request.ComponentError.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ComponentError.this.errorState = StateError.ErrorType.NoError;
                    ComponentError.this.dispatcher.dispatch(ComponentError.this.f121979af.initialLoadCommentsAsync());
                }
            });
            this.snackbar.mo48864Y();
            return;
        }
        Snackbar snackbar = this.snackbar;
        if (snackbar != null) {
            snackbar.mo48847x();
        }
    }
}
