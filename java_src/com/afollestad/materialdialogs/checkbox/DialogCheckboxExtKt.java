package com.afollestad.materialdialogs.checkbox;

import android.graphics.Typeface;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0002`\u000b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0001H\u0007\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\u0001H\u0007*&\u0010\u000f\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¨\u0006\u0010"}, m28432d2 = {"checkBoxPrompt", "Lcom/afollestad/materialdialogs/MaterialDialog;", "res", "", Entry.TYPE_TEXT, "", "isCheckedDefault", "", "onToggle", "Lkotlin/Function1;", "", "Lcom/afollestad/materialdialogs/checkbox/BooleanCallback;", "getCheckBoxPrompt", "Landroid/widget/CheckBox;", "isCheckPromptChecked", "BooleanCallback", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogCheckboxExtKt {
    public static final MaterialDialog checkBoxPrompt(final MaterialDialog materialDialog, final int i, final String str, final boolean z, final Function1<? super Boolean, Unit> function1) {
        AppCompatCheckBox checkBoxPrompt;
        CharSequence resolveString$default;
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("checkBoxPrompt", str, Integer.valueOf(i));
        DialogActionButtonLayout buttonsLayout = materialDialog.getView().getButtonsLayout();
        if (buttonsLayout != null && (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) != null) {
            checkBoxPrompt.setVisibility(0);
            if (str != null) {
                resolveString$default = str;
            } else {
                resolveString$default = MDUtil.resolveString$default(mDUtil, materialDialog, Integer.valueOf(i), (Integer) null, false, 12, (Object) null);
            }
            checkBoxPrompt.setText(resolveString$default);
            checkBoxPrompt.setChecked(z);
            checkBoxPrompt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.afollestad.materialdialogs.checkbox.DialogCheckboxExtKt$checkBoxPrompt$$inlined$run$lambda$1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    Function1 function12 = function1;
                    if (function12 != null) {
                        Unit unit = (Unit) function12.invoke(Boolean.valueOf(z2));
                    }
                }
            });
            MDUtil.maybeSetTextColor$default(mDUtil, checkBoxPrompt, materialDialog.getWindowContext(), Integer.valueOf(C16848R.attr.md_color_content), null, 4, null);
            Typeface bodyFont = materialDialog.getBodyFont();
            if (bodyFont != null) {
                checkBoxPrompt.setTypeface(bodyFont);
            }
            int[] resolveColors$default = ColorsKt.resolveColors$default(materialDialog, new int[]{C16848R.attr.md_color_widget, C16848R.attr.md_color_widget_unchecked}, null, 2, null);
            C48921su0.m13543d(checkBoxPrompt, mDUtil.createColorSelector(materialDialog.getWindowContext(), resolveColors$default[1], resolveColors$default[0]));
        }
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog checkBoxPrompt$default(MaterialDialog materialDialog, int i, String str, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return checkBoxPrompt(materialDialog, i, str, z, function1);
    }

    public static final CheckBox getCheckBoxPrompt(MaterialDialog materialDialog) {
        AppCompatCheckBox checkBoxPrompt;
        DialogActionButtonLayout buttonsLayout = materialDialog.getView().getButtonsLayout();
        if (buttonsLayout == null || (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return checkBoxPrompt;
    }

    public static final boolean isCheckPromptChecked(MaterialDialog materialDialog) {
        return getCheckBoxPrompt(materialDialog).isChecked();
    }
}
