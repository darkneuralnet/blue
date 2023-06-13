package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC10997b;
import com.stripe.android.C18606R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/AlertDisplayer;", "", "show", "", "message", "", "DefaultAlertDisplayer", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface AlertDisplayer {

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/AlertDisplayer$DefaultAlertDisplayer;", "Lcom/stripe/android/view/AlertDisplayer;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "show", "", "message", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultAlertDisplayer implements AlertDisplayer {
        public static final int $stable = 8;
        private final Activity activity;

        public DefaultAlertDisplayer(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.stripe.android.view.AlertDisplayer
        public void show(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (!this.activity.isFinishing()) {
                new DialogInterfaceC10997b.C10998a(this.activity, C18606R.style.AlertDialogStyle).mo70294h(message).mo70298d(true).mo70289m(17039370, new DialogInterface.OnClickListener() { // from class: p9
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).mo70301a().show();
            }
        }
    }

    void show(String str);
}
