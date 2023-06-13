package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J/\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010!¨\u0006\""}, m28432d2 = {"Lcom/afollestad/materialdialogs/ModalDialog;", "Lcom/afollestad/materialdialogs/DialogBehavior;", "()V", "createView", "Landroid/view/ViewGroup;", "creatingContext", "Landroid/content/Context;", "dialogWindow", "Landroid/view/Window;", "layoutInflater", "Landroid/view/LayoutInflater;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialogLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "root", "getThemeRes", "", "isDark", "", "onDismiss", "onPostShow", "", "onPreShow", "setBackgroundColor", "view", "color", "cornerRadius", "", "setWindowConstraints", CoreConstants.CONTEXT_SCOPE_VALUE, "window", "maxWidth", "(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ModalDialog implements DialogBehavior {
    public static final ModalDialog INSTANCE = new ModalDialog();

    private ModalDialog() {
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    @SuppressLint({"InflateParams"})
    public ViewGroup createView(Context context, Window window, LayoutInflater layoutInflater, MaterialDialog materialDialog) {
        View inflate = layoutInflater.inflate(C16848R.C16851layout.md_dialog_base, (ViewGroup) null, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public DialogLayout getDialogLayout(ViewGroup viewGroup) {
        return (DialogLayout) viewGroup;
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public int getThemeRes(boolean z) {
        if (z) {
            return C16848R.style.MD_Dark;
        }
        return C16848R.style.MD_Light;
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public boolean onDismiss() {
        return false;
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public void onPostShow(MaterialDialog materialDialog) {
        final DialogActionButton actionButton = DialogActionExtKt.getActionButton(materialDialog, WhichButton.NEGATIVE);
        if (ViewsKt.isVisible(actionButton)) {
            actionButton.post(new Runnable() { // from class: com.afollestad.materialdialogs.ModalDialog$onPostShow$1
                @Override // java.lang.Runnable
                public final void run() {
                    DialogActionButton.this.requestFocus();
                }
            });
            return;
        }
        final DialogActionButton actionButton2 = DialogActionExtKt.getActionButton(materialDialog, WhichButton.POSITIVE);
        if (ViewsKt.isVisible(actionButton2)) {
            actionButton2.post(new Runnable() { // from class: com.afollestad.materialdialogs.ModalDialog$onPostShow$2
                @Override // java.lang.Runnable
                public final void run() {
                    DialogActionButton.this.requestFocus();
                }
            });
        }
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public void onPreShow(MaterialDialog materialDialog) {
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public void setBackgroundColor(DialogLayout dialogLayout, int i, float f) {
        dialogLayout.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        dialogLayout.setBackground(gradientDrawable);
    }

    @Override // com.afollestad.materialdialogs.DialogBehavior
    public void setWindowConstraints(Context context, Window window, DialogLayout dialogLayout, Integer num) {
        int dimensionPixelSize;
        if (num != null && num.intValue() == 0) {
            return;
        }
        window.setSoftInputMode(16);
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null) {
            Resources resources = context.getResources();
            Pair<Integer, Integer> widthAndHeight = MDUtil.INSTANCE.getWidthAndHeight(windowManager);
            int intValue = widthAndHeight.component1().intValue();
            dialogLayout.setMaxHeight(widthAndHeight.component2().intValue() - (resources.getDimensionPixelSize(C16848R.dimen.md_dialog_vertical_margin) * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            int dimensionPixelSize2 = intValue - (resources.getDimensionPixelSize(C16848R.dimen.md_dialog_horizontal_margin) * 2);
            if (num != null) {
                dimensionPixelSize = num.intValue();
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(C16848R.dimen.md_dialog_max_width);
            }
            layoutParams.width = Math.min(dimensionPixelSize, dimensionPixelSize2);
            window.setAttributes(layoutParams);
        }
    }
}