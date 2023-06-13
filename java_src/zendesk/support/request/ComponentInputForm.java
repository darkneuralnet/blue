package zendesk.support.request;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.KotlinVersion;
import zendesk.belvedere.KeyboardHelper;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentInputForm implements Listener<InputFormModel>, RequestViewConversationsDisabled.MenuItemsDelegate, KeyboardHelper.InterfaceC31087c {
    private final ActionFactory actionFactory;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final EditText emailField;
    private final TextInputLayout emailLayout;
    private final Validator<String> emailValidator;
    private boolean inlineValidation = false;
    private final View logo;
    private final EditText messageField;
    private final TextInputLayout messageLayout;
    private final EditText nameField;
    private final TextInputLayout nameLayout;
    private MenuItem sendButton;

    /* loaded from: classes8.dex */
    public static class EditTextTextWatcher implements TextWatcher {
        private final ComponentInputForm componentInputForm;

        private EditTextTextWatcher(ComponentInputForm componentInputForm) {
            this.componentInputForm = componentInputForm;
        }

        public static void install(ComponentInputForm componentInputForm, EditText... editTextArr) {
            for (EditText editText : editTextArr) {
                editText.addTextChangedListener(new EditTextTextWatcher(componentInputForm));
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.componentInputForm.inlineValidation) {
                this.componentInputForm.updateEmailValidation();
            }
            this.componentInputForm.updateSendButton();
        }
    }

    /* loaded from: classes8.dex */
    public static class EmailFieldFocusListener implements View.OnFocusChangeListener {
        private final ComponentInputForm componentInputForm;
        private final EditText editText;

        private EmailFieldFocusListener(ComponentInputForm componentInputForm, EditText editText) {
            this.componentInputForm = componentInputForm;
            this.editText = editText;
        }

        public static void install(ComponentInputForm componentInputForm, EditText editText) {
            editText.setOnFocusChangeListener(new EmailFieldFocusListener(componentInputForm, editText));
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (!z && C44504lS5.m27273b(this.editText.getText().toString())) {
                this.componentInputForm.updateEmailValidation();
                this.componentInputForm.updateSendButton();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class InputFormModel {
        private final boolean hasIdentityEmailAddress;
        private final boolean hasIdentityName;
        private final boolean isLoading;
        private final boolean neverRequestEmail;
        private final String referrerUrl;
        private final boolean showZendeskLogo;

        public InputFormModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
            this.neverRequestEmail = z;
            this.hasIdentityEmailAddress = z2;
            this.hasIdentityName = z3;
            this.isLoading = z4;
            this.showZendeskLogo = z5;
            this.referrerUrl = str;
        }

        private boolean isEmailFieldEnabled() {
            return (this.hasIdentityEmailAddress || this.neverRequestEmail) ? false : true;
        }

        private boolean isNameFieldEnabled() {
            return !this.hasIdentityName;
        }

        public int getEmailFieldVisibility() {
            return isEmailFieldEnabled() ? 0 : 8;
        }

        public int getLogoVisibility() {
            return isLogoEnabled() ? 0 : 8;
        }

        public int getMessageFieldVisibility() {
            return 0;
        }

        public int getNameFieldVisibility() {
            return isNameFieldEnabled() ? 0 : 8;
        }

        public String getReferrerUrl() {
            return this.referrerUrl;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        public boolean isLogoEnabled() {
            return this.showZendeskLogo;
        }
    }

    /* loaded from: classes8.dex */
    public static class InputFormSelector implements StateSelector<InputFormModel> {
        @Override // zendesk.support.suas.StateSelector
        public InputFormModel selectData(State state) {
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return new InputFormModel(settings.isNeverRequestEmailOn(), settings.hasIdentityEmailAddress(), settings.hasIdentityName(), StateProgress.fomState(state).getRunningRequests() > 0, settings.isShowZendeskLogo(), settings.getReferrerUrl());
        }
    }

    /* loaded from: classes8.dex */
    public interface Validator<T> {
        boolean isValid(T t);
    }

    public ComponentInputForm(View view, EditText editText, TextInputLayout textInputLayout, EditText editText2, TextInputLayout textInputLayout2, Validator<String> validator, EditText editText3, TextInputLayout textInputLayout3, Dispatcher dispatcher, ActionFactory actionFactory, AttachmentHelper attachmentHelper) {
        this.logo = view;
        this.nameField = editText;
        this.emailField = editText2;
        this.messageField = editText3;
        this.nameLayout = textInputLayout;
        this.emailLayout = textInputLayout2;
        this.messageLayout = textInputLayout3;
        this.emailValidator = validator;
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.attachmentHelper = attachmentHelper;
        EditTextTextWatcher.install(this, editText, editText2, editText3);
        EmailFieldFocusListener.install(this, editText2);
    }

    public static ComponentInputForm create(View view, Dispatcher dispatcher, ActionFactory actionFactory, AttachmentHelper attachmentHelper) {
        Validator<String> validator = new Validator<String>() { // from class: zendesk.support.request.ComponentInputForm.1
            @Override // zendesk.support.request.ComponentInputForm.Validator
            public boolean isValid(String str) {
                return ZK3.f48259j.matcher(str).matches();
            }
        };
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C35181Pg4.request_name_layout);
        EditText editText = (EditText) view.findViewById(C35181Pg4.request_name_field);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(C35181Pg4.request_email_layout);
        EditText editText2 = (EditText) view.findViewById(C35181Pg4.request_email_field);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(C35181Pg4.request_message_layout);
        return new ComponentInputForm(view.findViewById(C35181Pg4.request_zendesk_logo), editText, textInputLayout, editText2, textInputLayout2, validator, (EditText) view.findViewById(C35181Pg4.request_message_field), textInputLayout3, dispatcher, actionFactory, attachmentHelper);
    }

    private boolean doFieldsContainText() {
        boolean z;
        boolean z2;
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (isNameFieldVisible() && !C44504lS5.m27273b(obj)) {
            z = false;
        } else {
            z = true;
        }
        if (isEmailFieldVisible() && !C44504lS5.m27273b(obj2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean m27273b = C44504lS5.m27273b(obj3);
        if (!z || !z2 || !m27273b) {
            return false;
        }
        return true;
    }

    private boolean isEmailFieldVisible() {
        return this.emailLayout.getVisibility() == 0;
    }

    private boolean isEmailInputValid() {
        boolean isEmailFieldVisible = isEmailFieldVisible();
        String obj = this.emailField.getText().toString();
        if (isEmailFieldVisible && !this.emailValidator.isValid(obj)) {
            return false;
        }
        return true;
    }

    private boolean isNameFieldVisible() {
        return this.nameLayout.getVisibility() == 0;
    }

    private void setSendButtonEnabled(boolean z) {
        if (this.sendButton != null) {
            int i = KotlinVersion.MAX_COMPONENT_VALUE;
            if (!z) {
                i = (this.messageLayout.getContext().getResources().getInteger(C35199Pi4.zs_request_menu_send_btn_alpha_inactive) * KotlinVersion.MAX_COMPONENT_VALUE) / 100;
            }
            this.sendButton.getIcon().setAlpha(i);
            this.sendButton.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateEmailValidation() {
        if (isEmailInputValid()) {
            this.emailLayout.setError(null);
            return;
        }
        this.inlineValidation = true;
        this.emailLayout.setError(this.emailField.getContext().getString(C41720gl4.error_msg_invalid_email));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButton() {
        boolean doFieldsContainText;
        if (this.inlineValidation) {
            if (doFieldsContainText() && isEmailInputValid()) {
                doFieldsContainText = true;
            } else {
                doFieldsContainText = false;
            }
        } else {
            doFieldsContainText = doFieldsContainText();
        }
        setSendButtonEnabled(doFieldsContainText);
    }

    public StateSelector<InputFormModel> getSelector() {
        return new InputFormSelector();
    }

    public boolean hasUnsavedInput() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (this.nameField.isEnabled() && C44504lS5.m27273b(obj)) {
            return true;
        }
        if ((this.emailField.isEnabled() && C44504lS5.m27273b(obj2)) || C44504lS5.m27273b(obj3) || C43505jm0.m29948i(this.attachmentHelper.getSelectedAttachments())) {
            return true;
        }
        return false;
    }

    @Override // zendesk.belvedere.KeyboardHelper.InterfaceC31087c
    public void onKeyboardDismissed() {
        if (this.logo.getVisibility() != 8) {
            this.logo.post(new Runnable() { // from class: zendesk.support.request.ComponentInputForm.3
                @Override // java.lang.Runnable
                public void run() {
                    ComponentInputForm.this.logo.setVisibility(0);
                }
            });
        }
    }

    @Override // zendesk.belvedere.KeyboardHelper.InterfaceC31087c
    public void onKeyboardVisible() {
        if (this.logo.getVisibility() != 8) {
            this.logo.setVisibility(4);
        }
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsClicked(MenuItem menuItem) {
        if (menuItem.getItemId() == C35181Pg4.request_conversations_disabled_menu_ic_send) {
            onSendMessageRequested();
        }
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.sendButton = menuItem;
        updateSendButton();
    }

    public void onSendMessageRequested() {
        if (doFieldsContainText() && isEmailInputValid()) {
            if (isNameFieldVisible() || isEmailFieldVisible()) {
                this.dispatcher.dispatch(this.actionFactory.updateNameEmailAsync(this.nameField.getText().toString(), this.emailField.getText().toString()));
            }
            String obj = this.messageField.getText().toString();
            List<StateRequestAttachment> m29952e = C43505jm0.m29952e(this.attachmentHelper.getSelectedAttachments());
            this.dispatcher.dispatch(this.actionFactory.clearMessages());
            this.dispatcher.dispatch(this.actionFactory.createCommentAsync(obj, m29952e));
            return;
        }
        updateEmailValidation();
        updateSendButton();
    }

    @Override // zendesk.support.suas.Listener
    public void update(final InputFormModel inputFormModel) {
        this.logo.setVisibility(inputFormModel.getLogoVisibility());
        this.nameLayout.setVisibility(inputFormModel.getNameFieldVisibility());
        this.emailLayout.setVisibility(inputFormModel.getEmailFieldVisibility());
        this.messageLayout.setVisibility(inputFormModel.getMessageFieldVisibility());
        this.nameLayout.setEnabled(!inputFormModel.isLoading());
        this.emailLayout.setEnabled(!inputFormModel.isLoading());
        this.messageLayout.setEnabled(!inputFormModel.isLoading());
        if (inputFormModel.isLoading()) {
            setSendButtonEnabled(false);
            return;
        }
        this.logo.setOnClickListener((inputFormModel.isLogoEnabled() && C44504lS5.m27273b(inputFormModel.getReferrerUrl())) ? new View.OnClickListener() { // from class: zendesk.support.request.ComponentInputForm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(inputFormModel.getReferrerUrl())));
            }
        } : null);
        updateSendButton();
    }
}
