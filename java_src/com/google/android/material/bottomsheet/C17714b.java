package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* renamed from: com.google.android.material.bottomsheet.b */
/* loaded from: classes6.dex */
public class C17714b extends C26572ni {
    private boolean waitingForDismissAllowingStateLoss;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    /* loaded from: classes6.dex */
    public class C17716b extends BottomSheetBehavior.AbstractC17702f {
        public C17716b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                C17714b.this.dismissAfterAnimation();
            }
        }
    }

    public C17714b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.m50128L() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof DialogC17707a) {
            ((DialogC17707a) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.m50073u(new C17716b());
        bottomSheetBehavior.m50082p0(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof DialogC17707a) {
            DialogC17707a dialogC17707a = (DialogC17707a) dialog;
            BottomSheetBehavior<FrameLayout> behavior = dialogC17707a.getBehavior();
            if (behavior.m50122R() && dialogC17707a.getDismissWithAnimation()) {
                dismissWithAnimation(behavior, z);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public void dismiss() {
        if (!tryDismissWithAnimation(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public void dismissAllowingStateLoss() {
        if (!tryDismissWithAnimation(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(getContext(), getTheme());
    }

    @SuppressLint({"ValidFragment"})
    public C17714b(int i) {
        super(i);
    }
}
