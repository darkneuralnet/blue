package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC11673f<E> extends AbstractC38865by1 {

    /* renamed from: b */
    public final Activity f54709b;

    /* renamed from: c */
    public final Context f54710c;

    /* renamed from: d */
    public final Handler f54711d;

    /* renamed from: e */
    public final int f54712e;

    /* renamed from: f */
    public final FragmentManager f54713f;

    public AbstractC11673f(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // p000.AbstractC38865by1
    /* renamed from: c */
    public View mo62064c(int i) {
        return null;
    }

    @Override // p000.AbstractC38865by1
    /* renamed from: d */
    public boolean mo62063d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m67215e() {
        return this.f54709b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m67214f() {
        return this.f54710c;
    }

    /* renamed from: g */
    public Handler m67213g() {
        return this.f54711d;
    }

    /* renamed from: h */
    public void mo67212h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo67211i();

    /* renamed from: j */
    public LayoutInflater mo67210j() {
        return LayoutInflater.from(this.f54710c);
    }

    @Deprecated
    /* renamed from: k */
    public void m67209k(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: l */
    public boolean mo67208l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m67207m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            NA0.m94291m(this.f54710c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: n */
    public void m67206n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C25883m3.m26443z(this.f54709b, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public void mo67205o() {
    }

    public AbstractC11673f(Activity activity, Context context, Handler handler, int i) {
        this.f54713f = new C47184py1();
        this.f54709b = activity;
        this.f54710c = (Context) HZ3.m103730h(context, "context == null");
        this.f54711d = (Handler) HZ3.m103730h(handler, "handler == null");
        this.f54712e = i;
    }
}
