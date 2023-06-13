package com.stripe.android.view;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/KeyboardController;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "hide", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class KeyboardController {
    public static final int $stable = 8;
    private final Activity activity;
    private final InputMethodManager inputMethodManager;

    public KeyboardController(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputMethodManager = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void hide() {
        IBinder iBinder;
        if (this.inputMethodManager.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.inputMethodManager;
            View currentFocus = this.activity.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
