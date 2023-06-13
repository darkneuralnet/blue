package com.afollestad.materialdialogs.actions;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u000b"}, m28432d2 = {"getActionButton", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "which", "Lcom/afollestad/materialdialogs/WhichButton;", "hasActionButton", "", "hasActionButtons", "setActionButtonEnabled", "", "enabled", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogActionExtKt {
    public static final DialogActionButton getActionButton(MaterialDialog materialDialog, WhichButton whichButton) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        DialogActionButtonLayout buttonsLayout = materialDialog.getView().getButtonsLayout();
        if (buttonsLayout == null || (actionButtons = buttonsLayout.getActionButtons()) == null || (dialogActionButton = actionButtons[whichButton.getIndex()]) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return dialogActionButton;
    }

    public static final boolean hasActionButton(MaterialDialog materialDialog, WhichButton whichButton) {
        return ViewsKt.isVisible(getActionButton(materialDialog, whichButton));
    }

    public static final boolean hasActionButtons(MaterialDialog materialDialog) {
        DialogActionButton[] visibleButtons;
        DialogActionButtonLayout buttonsLayout = materialDialog.getView().getButtonsLayout();
        if (buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null) {
            return false;
        }
        return !(visibleButtons.length == 0);
    }

    public static final void setActionButtonEnabled(MaterialDialog materialDialog, WhichButton whichButton, boolean z) {
        getActionButton(materialDialog, whichButton).setEnabled(z);
    }
}
