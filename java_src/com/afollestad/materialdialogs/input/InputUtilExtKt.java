package com.afollestad.materialdialogs.input;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a7\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0080\b¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\r"}, m28432d2 = {"invalidateInputMaxLength", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "allowEmpty", "", "postRun", "T", "Landroid/view/View;", "exec", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Z", "showKeyboardIfApplicable", "input"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class InputUtilExtKt {
    public static final void invalidateInputMaxLength(MaterialDialog materialDialog, boolean z) {
        int i;
        int counterMaxLength;
        Editable text = DialogInputExtKt.getInputField(materialDialog).getText();
        boolean z2 = false;
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        if ((z || i != 0) && (counterMaxLength = DialogInputExtKt.getInputLayout(materialDialog).getCounterMaxLength()) > 0) {
            WhichButton whichButton = WhichButton.POSITIVE;
            if (i <= counterMaxLength) {
                z2 = true;
            }
            DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z2);
        }
    }

    public static final <T extends View> boolean postRun(final T t, final Function1<? super T, Unit> function1) {
        return t.post(new Runnable() { // from class: com.afollestad.materialdialogs.input.InputUtilExtKt$postRun$1
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(t);
            }
        });
    }

    public static final void showKeyboardIfApplicable(final MaterialDialog materialDialog) {
        final EditText inputField = DialogInputExtKt.getInputField(materialDialog);
        inputField.post(new Runnable() { // from class: com.afollestad.materialdialogs.input.InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText = (EditText) inputField;
                editText.requestFocus();
                Object systemService = materialDialog.getWindowContext().getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).showSoftInput(editText, 1);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        });
    }
}
