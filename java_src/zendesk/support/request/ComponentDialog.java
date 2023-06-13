package zendesk.support.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.request.RetryDialog;
import zendesk.support.request.StateUi;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
/* loaded from: classes8.dex */
class ComponentDialog implements Listener<StateUi> {
    private final Activity activity;

    /* renamed from: af */
    private final ActionFactory f121976af;
    private Dialog dialog;
    private final Dispatcher dispatcher;

    /* loaded from: classes8.dex */
    public static class OnDismissedListener implements DialogInterface.OnDismissListener {

        /* renamed from: af */
        private final ActionFactory f121977af;
        private final Dispatcher dispatcher;

        public OnDismissedListener(ActionFactory actionFactory, Dispatcher dispatcher) {
            this.f121977af = actionFactory;
            this.dispatcher = dispatcher;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.dispatcher.dispatch(this.f121977af.onDialogDismissed());
        }
    }

    /* loaded from: classes8.dex */
    public static class RetryDialogListener implements RetryDialog.Listener {

        /* renamed from: af */
        private final ActionFactory f121978af;
        private final Dispatcher dispatcher;

        public RetryDialogListener(ActionFactory actionFactory, Dispatcher dispatcher) {
            this.f121978af = actionFactory;
            this.dispatcher = dispatcher;
        }

        @Override // zendesk.support.request.RetryDialog.Listener
        public void onDeleteMessage(List<StateMessage> list) {
            for (StateMessage stateMessage : list) {
                this.dispatcher.dispatch(this.f121978af.deleteMessage(stateMessage));
            }
        }

        @Override // zendesk.support.request.RetryDialog.Listener
        public void onRetryMessage(List<StateMessage> list) {
            onDeleteMessage(list);
            for (StateMessage stateMessage : list) {
                this.dispatcher.dispatch(this.f121978af.resendCommentAsync(stateMessage));
                this.dispatcher.dispatch(this.f121978af.updateCommentsAsync());
            }
        }
    }

    public ComponentDialog(Activity activity, ActionFactory actionFactory, Dispatcher dispatcher) {
        this.activity = activity;
        this.f121976af = actionFactory;
        this.dispatcher = dispatcher;
    }

    private Dialog getDialogForState(StateUi.DialogState dialogState) {
        if (dialogState instanceof StateRetryDialog) {
            RetryDialog retryDialog = new RetryDialog(this.activity, ((StateRetryDialog) dialogState).getMessage());
            retryDialog.setListener(new RetryDialogListener(this.f121976af, this.dispatcher));
            return retryDialog;
        }
        return null;
    }

    @Override // zendesk.support.suas.Listener
    public void update(StateUi stateUi) {
        StateUi.DialogState dialogState = stateUi.getDialogState();
        if (dialogState != null) {
            Dialog dialog = this.dialog;
            if (dialog == null || !dialog.isShowing()) {
                UiUtils.dismissKeyboard(this.activity);
                Dialog dialogForState = getDialogForState(dialogState);
                this.dialog = dialogForState;
                dialogForState.setOnDismissListener(new OnDismissedListener(this.f121976af, this.dispatcher));
                this.dialog.show();
            }
        }
    }
}
