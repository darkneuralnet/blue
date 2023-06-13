package zendesk.messaging;

import android.app.Dialog;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import zendesk.messaging.DialogContent;
import zendesk.messaging.Event;
import zendesk.messaging.components.DateProvider;
/* loaded from: classes8.dex */
class MessagingDialog implements InterfaceC41056fe3<DialogContent> {
    private final AppCompatActivity appCompatActivity;
    private final DateProvider dateProvider;
    private final MessagingViewModel messagingViewModel;

    /* renamed from: zendesk.messaging.MessagingDialog$4 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C311904 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$DialogContent$Config;

        static {
            int[] iArr = new int[DialogContent.Config.values().length];
            $SwitchMap$zendesk$messaging$DialogContent$Config = iArr;
            try {
                iArr[DialogContent.Config.TRANSCRIPT_PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$messaging$DialogContent$Config[DialogContent.Config.TRANSCRIPT_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MessagingDialog(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, DateProvider dateProvider) {
        this.appCompatActivity = appCompatActivity;
        this.messagingViewModel = messagingViewModel;
        this.dateProvider = dateProvider;
    }

    @Override // p000.InterfaceC41056fe3
    public void onChanged(final DialogContent dialogContent) {
        if (dialogContent != null) {
            final Dialog dialog = new Dialog(this.appCompatActivity);
            dialog.setContentView(R$layout.zui_messaging_dialog);
            Button button = (Button) dialog.findViewById(R$id.zui_dialog_positive_button);
            Button button2 = (Button) dialog.findViewById(R$id.zui_dialog_negative_button);
            final TextInputEditText textInputEditText = (TextInputEditText) dialog.findViewById(R$id.zui_dialog_input);
            final TextInputLayout textInputLayout = (TextInputLayout) dialog.findViewById(R$id.zui_dialog_input_layout);
            button2.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.MessagingDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), false).build());
                }
            });
            dialog.setTitle(dialogContent.getTitle());
            ((TextView) dialog.findViewById(R$id.zui_dialog_message)).setText(dialogContent.getMessage());
            ((TextView) dialog.findViewById(R$id.zui_dialog_title)).setText(dialogContent.getTitle());
            button2.setText(R$string.zui_button_label_no);
            button.setText(R$string.zui_button_label_yes);
            int i = C311904.$SwitchMap$zendesk$messaging$DialogContent$Config[dialogContent.getConfig().ordinal()];
            if (i == 1) {
                button.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.MessagingDialog.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), true).build());
                        dialog.dismiss();
                    }
                });
            } else if (i == 2) {
                textInputLayout.setVisibility(0);
                button2.setText(17039360);
                button.setText(R$string.zui_label_send);
                textInputLayout.setHint(this.appCompatActivity.getString(R$string.zui_dialog_email_hint));
                button.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.MessagingDialog.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Editable text = textInputEditText.getText();
                        if (text != null && Patterns.EMAIL_ADDRESS.matcher(text.toString()).matches()) {
                            MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), true).setPayload(textInputEditText.getText().toString()).setPreviousConfig(dialogContent.previousConfig()).build());
                            dialog.dismiss();
                            return;
                        }
                        textInputLayout.setError(MessagingDialog.this.appCompatActivity.getString(R$string.zui_dialog_email_error));
                    }
                });
            }
            dialog.show();
        }
    }
}
