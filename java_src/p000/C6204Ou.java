package p000;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, m28432d2 = {"LOu;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", "view", "", "virtualId", "event", "", "onAutofillEvent", "Lrb;", "autofill", C17296a.f69688o, "b", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ou */
/* loaded from: classes.dex */
public final class C6204Ou extends AutofillManager.AutofillCallback {

    /* renamed from: a */
    public static final C6204Ou f27553a = new C6204Ou();

    private C6204Ou() {
    }

    /* renamed from: a */
    public final void m91201a(C27951rb autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.m15729c().registerCallback(C5123Lu.m96218a(this));
    }

    /* renamed from: b */
    public final void m91200b(C27951rb autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.m15729c().unregisterCallback(C5123Lu.m96218a(this));
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAutofillEvent(view, i, i2);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
