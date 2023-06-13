package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
/* renamed from: AF0 */
/* loaded from: classes.dex */
public class AF0 {

    /* renamed from: a */
    public final InterfaceC45057mO1 f309a;

    /* renamed from: b */
    public final PendingIntent f310b;

    /* renamed from: c */
    public final C49718uF0 f311c;

    /* renamed from: AF0$a */
    /* loaded from: classes.dex */
    public class C0057a extends C49718uF0 {
        public C0057a() {
        }

        @Override // p000.C49718uF0
        /* renamed from: a */
        public void mo10519a(String str, Bundle bundle) {
            try {
                AF0.this.f309a.mo8949a3(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: b */
        public Bundle mo10518b(String str, Bundle bundle) {
            try {
                return AF0.this.f309a.mo8953P(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: c */
        public void mo10517c(int i, int i2, Bundle bundle) {
            try {
                AF0.this.f309a.mo8948h1(i, i2, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: d */
        public void mo10516d(Bundle bundle) {
            try {
                AF0.this.f309a.mo8951X4(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: e */
        public void mo10515e(int i, Bundle bundle) {
            try {
                AF0.this.f309a.mo8954D1(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: f */
        public void mo10514f(String str, Bundle bundle) {
            try {
                AF0.this.f309a.mo8952U4(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.C49718uF0
        /* renamed from: g */
        public void mo10513g(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                AF0.this.f309a.mo8950Y4(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public AF0(InterfaceC45057mO1 interfaceC45057mO1, PendingIntent pendingIntent) {
        C0057a c0057a;
        if (interfaceC45057mO1 == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f309a = interfaceC45057mO1;
        this.f310b = pendingIntent;
        if (interfaceC45057mO1 == null) {
            c0057a = null;
        } else {
            c0057a = new C0057a();
        }
        this.f311c = c0057a;
    }

    /* renamed from: a */
    public IBinder m115956a() {
        InterfaceC45057mO1 interfaceC45057mO1 = this.f309a;
        if (interfaceC45057mO1 == null) {
            return null;
        }
        return interfaceC45057mO1.asBinder();
    }

    /* renamed from: b */
    public final IBinder m115955b() {
        InterfaceC45057mO1 interfaceC45057mO1 = this.f309a;
        if (interfaceC45057mO1 != null) {
            return interfaceC45057mO1.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* renamed from: c */
    public PendingIntent m115954c() {
        return this.f310b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof AF0)) {
            return false;
        }
        AF0 af0 = (AF0) obj;
        PendingIntent m115954c = af0.m115954c();
        PendingIntent pendingIntent = this.f310b;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (m115954c != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(m115954c);
        }
        return m115955b().equals(af0.m115955b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f310b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return m115955b().hashCode();
    }
}
