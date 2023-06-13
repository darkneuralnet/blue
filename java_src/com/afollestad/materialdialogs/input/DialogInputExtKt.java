package com.afollestad.materialdialogs.input;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007\u001a\u008d\u0001\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0002`\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a-\u0010\u0018\u001a\u00020\u0014*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\u0014*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001b*2\u0010\u001c\"\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¨\u0006\u0005"}, m28432d2 = {"getInputField", "Landroid/widget/EditText;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "input", "hint", "", "hintRes", "", "prefill", "", "prefillRes", "inputType", "maxLength", "waitForPositiveButton", "", "allowEmpty", "callback", "Lkotlin/Function2;", "", "Lcom/afollestad/materialdialogs/input/InputCallback;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ILjava/lang/Integer;ZZLkotlin/jvm/functions/Function2;)Lcom/afollestad/materialdialogs/MaterialDialog;", "lookupInputLayout", "prefillInput", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;Ljava/lang/Integer;Z)V", "styleInput", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;I)V", "InputCallback"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogInputExtKt {
    public static final EditText getInputField(MaterialDialog materialDialog) {
        EditText editText = getInputLayout(materialDialog).getEditText();
        if (editText != null) {
            return editText;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    public static final TextInputLayout getInputLayout(MaterialDialog materialDialog) {
        Object obj = materialDialog.getConfig().get("[custom_view_input_layout]");
        if (!(obj instanceof TextInputLayout)) {
            obj = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) obj;
        if (textInputLayout == null) {
            TextInputLayout lookupInputLayout = lookupInputLayout(materialDialog);
            materialDialog.getConfig().put("[custom_view_input_layout]", lookupInputLayout);
            return lookupInputLayout;
        }
        return textInputLayout;
    }

    @SuppressLint({"CheckResult"})
    public static final MaterialDialog input(MaterialDialog materialDialog, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, Function2<? super MaterialDialog, ? super CharSequence, Unit> function2) {
        DialogCustomViewExtKt.customView$default(materialDialog, Integer.valueOf(C16852R.C16855layout.md_dialog_stub_input), null, false, false, false, false, 62, null);
        DialogCallbackExtKt.onPreShow(materialDialog, new DialogInputExtKt$input$1(materialDialog));
        if (!DialogActionExtKt.hasActionButtons(materialDialog)) {
            MaterialDialog.positiveButton$default(materialDialog, 17039370, null, null, 6, null);
        }
        if (function2 != null && z) {
            MaterialDialog.positiveButton$default(materialDialog, null, null, new DialogInputExtKt$input$2(materialDialog, function2), 3, null);
        }
        prefillInput(materialDialog, charSequence, num2, z2);
        styleInput(materialDialog, str, num, i);
        if (num3 != null) {
            TextInputLayout inputLayout = getInputLayout(materialDialog);
            inputLayout.setCounterEnabled(true);
            inputLayout.setCounterMaxLength(num3.intValue());
            InputUtilExtKt.invalidateInputMaxLength(materialDialog, z2);
        }
        MDUtil.INSTANCE.textChanged(getInputField(materialDialog), new DialogInputExtKt$input$4(materialDialog, z2, num3, z, function2));
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog input$default(MaterialDialog materialDialog, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            charSequence = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        if ((i2 & 32) != 0) {
            num3 = null;
        }
        if ((i2 & 64) != 0) {
            z = true;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            function2 = null;
        }
        return input(materialDialog, str, num, charSequence, num2, i, num3, z, z2, function2);
    }

    private static final TextInputLayout lookupInputLayout(MaterialDialog materialDialog) {
        View findViewById = DialogCustomViewExtKt.getCustomView(materialDialog).findViewById(C16852R.C16854id.md_input_layout);
        if (!(findViewById instanceof TextInputLayout)) {
            findViewById = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) findViewById;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    private static final void prefillInput(MaterialDialog materialDialog, CharSequence charSequence, Integer num, boolean z) {
        boolean z2;
        boolean z3;
        Resources resources = materialDialog.getWindowContext().getResources();
        EditText inputField = getInputField(materialDialog);
        if (charSequence == null) {
            if (num != null) {
                charSequence = resources.getString(num.intValue());
            } else {
                charSequence = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(charSequence, "if (prefillRes != null) …tring(prefillRes) else \"\"");
        }
        boolean z4 = true;
        if (charSequence.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            inputField.setText(charSequence);
            DialogCallbackExtKt.onShow(materialDialog, new DialogInputExtKt$prefillInput$1(inputField, charSequence));
        }
        WhichButton whichButton = WhichButton.POSITIVE;
        if (!z) {
            if (charSequence.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z4 = false;
            }
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z4);
    }

    private static final void styleInput(MaterialDialog materialDialog, String str, Integer num, int i) {
        Resources resources = materialDialog.getWindowContext().getResources();
        EditText inputField = getInputField(materialDialog);
        if (str == null) {
            if (num != null) {
                str = resources.getString(num.intValue());
            } else {
                str = null;
            }
        }
        inputField.setHint(str);
        inputField.setInputType(i);
        MDUtil.INSTANCE.maybeSetTextColor(inputField, materialDialog.getWindowContext(), Integer.valueOf(C16852R.attr.md_color_content), Integer.valueOf(C16852R.attr.md_color_hint));
        Typeface bodyFont = materialDialog.getBodyFont();
        if (bodyFont != null) {
            inputField.setTypeface(bodyFont);
        }
    }
}
