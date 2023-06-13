package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
/* renamed from: zF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52682zF0 {

    /* renamed from: a */
    public final Object f121012a = new Object();

    /* renamed from: b */
    public final InterfaceC45650nO1 f121013b;

    /* renamed from: c */
    public final InterfaceC45057mO1 f121014c;

    /* renamed from: d */
    public final ComponentName f121015d;

    /* renamed from: e */
    public final PendingIntent f121016e;

    public C52682zF0(InterfaceC45650nO1 interfaceC45650nO1, InterfaceC45057mO1 interfaceC45057mO1, ComponentName componentName, PendingIntent pendingIntent) {
        this.f121013b = interfaceC45650nO1;
        this.f121014c = interfaceC45057mO1;
        this.f121015d = componentName;
        this.f121016e = pendingIntent;
    }

    /* renamed from: a */
    public final void m1600a(Bundle bundle) {
        PendingIntent pendingIntent = this.f121016e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle m1599b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m1600a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public IBinder m1598c() {
        return this.f121014c.asBinder();
    }

    /* renamed from: d */
    public ComponentName m1597d() {
        return this.f121015d;
    }

    /* renamed from: e */
    public PendingIntent m1596e() {
        return this.f121016e;
    }

    /* renamed from: f */
    public boolean m1595f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f121013b.mo23910t1(this.f121014c, uri, m1599b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
