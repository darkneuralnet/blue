package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Lx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34401Lx7 {

    /* renamed from: a */
    public final PH7<InterfaceC52445yq7> f22321a;

    /* renamed from: b */
    public final Context f22322b;

    /* renamed from: c */
    public boolean f22323c = false;

    /* renamed from: d */
    public final Map<ListenerHolder.ListenerKey<LocationListener>, BinderC36966Ww7> f22324d = new HashMap();

    /* renamed from: e */
    public final Map<ListenerHolder.ListenerKey, BinderC48346rv7> f22325e = new HashMap();

    /* renamed from: f */
    public final Map<ListenerHolder.ListenerKey<LocationCallback>, BinderC31800Au7> f22326f = new HashMap();

    public C34401Lx7(Context context, PH7<InterfaceC52445yq7> ph7) {
        this.f22322b = context;
        this.f22321a = ph7;
    }

    /* renamed from: a */
    public final Location m96096a(String str) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        return ((C33898Jt8) this.f22321a).m99589a().mo2401W(str);
    }

    @Deprecated
    /* renamed from: b */
    public final Location m96095b() throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        return ((C33898Jt8) this.f22321a).m99589a().mo2398b();
    }

    /* renamed from: c */
    public final LocationAvailability m96094c() throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        return ((C33898Jt8) this.f22321a).m99589a().mo2400Y3(this.f22322b.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m96093d(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        BinderC36966Ww7 binderC36966Ww7;
        BinderC36966Ww7 binderC36966Ww72;
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ListenerHolder.ListenerKey<LocationListener> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            binderC36966Ww72 = null;
        } else {
            synchronized (this.f22324d) {
                binderC36966Ww7 = this.f22324d.get(listenerKey);
                if (binderC36966Ww7 == null) {
                    binderC36966Ww7 = new BinderC36966Ww7(listenerHolder);
                }
                this.f22324d.put(listenerKey, binderC36966Ww7);
            }
            binderC36966Ww72 = binderC36966Ww7;
        }
        if (binderC36966Ww72 == null) {
            return;
        }
        ((C33898Jt8) this.f22321a).m99589a().mo2410C(new zzbc(1, zzba.m51350s(null, locationRequest), binderC36966Ww72, null, null, interfaceC39354cn7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m96092e(zzba zzbaVar, ListenerHolder<LocationCallback> listenerHolder, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        BinderC31800Au7 binderC31800Au7;
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ListenerHolder.ListenerKey<LocationCallback> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            binderC31800Au7 = null;
        } else {
            synchronized (this.f22326f) {
                BinderC31800Au7 binderC31800Au72 = this.f22326f.get(listenerKey);
                if (binderC31800Au72 == null) {
                    binderC31800Au72 = new BinderC31800Au7(listenerHolder);
                }
                binderC31800Au7 = binderC31800Au72;
                this.f22326f.put(listenerKey, binderC31800Au7);
            }
        }
        BinderC31800Au7 binderC31800Au73 = binderC31800Au7;
        if (binderC31800Au73 == null) {
            return;
        }
        ((C33898Jt8) this.f22321a).m99589a().mo2410C(new zzbc(1, zzbaVar, null, null, binderC31800Au73, interfaceC39354cn7));
    }

    /* renamed from: f */
    public final void m96091f(zzba zzbaVar, PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51346u(zzbaVar, pendingIntent, interfaceC39354cn7));
    }

    /* renamed from: g */
    public final void m96090g(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51346u(zzba.m51350s(null, locationRequest), pendingIntent, interfaceC39354cn7));
    }

    /* renamed from: h */
    public final void m96089h(ListenerHolder.ListenerKey<LocationListener> listenerKey, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.f22324d) {
            BinderC36966Ww7 remove = this.f22324d.remove(listenerKey);
            if (remove != null) {
                remove.zzc();
                ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51347s(remove, interfaceC39354cn7));
            }
        }
    }

    /* renamed from: i */
    public final void m96088i(ListenerHolder.ListenerKey<LocationCallback> listenerKey, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.f22326f) {
            BinderC31800Au7 remove = this.f22326f.remove(listenerKey);
            if (remove != null) {
                remove.zzc();
                ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51345v(remove, interfaceC39354cn7));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m96087j(PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2410C(new zzbc(2, null, null, pendingIntent, null, interfaceC39354cn7));
    }

    /* renamed from: k */
    public final void m96086k(boolean z) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2396b2(z);
        this.f22323c = z;
    }

    /* renamed from: l */
    public final void m96085l(Location location) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2404R2(location);
    }

    /* renamed from: m */
    public final void m96084m(InterfaceC39354cn7 interfaceC39354cn7) throws RemoteException {
        LA8.m97611c(((C33898Jt8) this.f22321a).f18415a);
        ((C33898Jt8) this.f22321a).m99589a().mo2397b1(interfaceC39354cn7);
    }

    /* renamed from: n */
    public final void m96083n() throws RemoteException {
        synchronized (this.f22324d) {
            for (BinderC36966Ww7 binderC36966Ww7 : this.f22324d.values()) {
                if (binderC36966Ww7 != null) {
                    ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51347s(binderC36966Ww7, null));
                }
            }
            this.f22324d.clear();
        }
        synchronized (this.f22326f) {
            for (BinderC31800Au7 binderC31800Au7 : this.f22326f.values()) {
                if (binderC31800Au7 != null) {
                    ((C33898Jt8) this.f22321a).m99589a().mo2410C(zzbc.m51345v(binderC31800Au7, null));
                }
            }
            this.f22326f.clear();
        }
        synchronized (this.f22325e) {
            for (BinderC48346rv7 binderC48346rv7 : this.f22325e.values()) {
                if (binderC48346rv7 != null) {
                    ((C33898Jt8) this.f22321a).m99589a().mo2407K2(new zzl(2, null, binderC48346rv7, null));
                }
            }
            this.f22325e.clear();
        }
    }

    /* renamed from: o */
    public final void m96082o() throws RemoteException {
        if (this.f22323c) {
            m96086k(false);
        }
    }
}
