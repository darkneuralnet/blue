package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C17961ar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: zK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52733zK6<T extends IInterface> {

    /* renamed from: l */
    public static final Map<String, Handler> f121098l = new HashMap();

    /* renamed from: a */
    public final Context f121099a;

    /* renamed from: b */
    public final C42061hK6 f121100b;

    /* renamed from: c */
    public final String f121101c;

    /* renamed from: e */
    public boolean f121103e;

    /* renamed from: f */
    public final Intent f121104f;

    /* renamed from: g */
    public final InterfaceC48583sK6<T> f121105g;
    @Nullable

    /* renamed from: j */
    public ServiceConnection f121108j;
    @Nullable

    /* renamed from: k */
    public T f121109k;

    /* renamed from: d */
    public final List<AbstractRunnableC43247jK6> f121102d = new ArrayList();

    /* renamed from: i */
    public final IBinder.DeathRecipient f121107i = new IBinder.DeathRecipient(this) { // from class: lK6

        /* renamed from: a */
        public final C52733zK6 f95878a;

        {
            this.f95878a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f95878a.m1520n();
        }
    };

    /* renamed from: h */
    public final WeakReference<InterfaceC47991rK6> f121106h = new WeakReference<>(null);

    public C52733zK6(Context context, C42061hK6 c42061hK6, String str, Intent intent, InterfaceC48583sK6<T> interfaceC48583sK6) {
        this.f121099a = context;
        this.f121100b = c42061hK6;
        this.f121101c = str;
        this.f121104f = intent;
        this.f121105g = interfaceC48583sK6;
    }

    /* renamed from: d */
    public static /* synthetic */ void m1530d(C52733zK6 c52733zK6, AbstractRunnableC43247jK6 abstractRunnableC43247jK6) {
        if (c52733zK6.f121109k != null || c52733zK6.f121103e) {
            if (!c52733zK6.f121103e) {
                abstractRunnableC43247jK6.run();
                return;
            }
            c52733zK6.f121100b.m36535d("Waiting to bind to the service.", new Object[0]);
            c52733zK6.f121102d.add(abstractRunnableC43247jK6);
            return;
        }
        c52733zK6.f121100b.m36535d("Initiate binding to the service.", new Object[0]);
        c52733zK6.f121102d.add(abstractRunnableC43247jK6);
        ServiceConnectionC51547xK6 serviceConnectionC51547xK6 = new ServiceConnectionC51547xK6(c52733zK6);
        c52733zK6.f121108j = serviceConnectionC51547xK6;
        c52733zK6.f121103e = true;
        if (c52733zK6.f121099a.bindService(c52733zK6.f121104f, serviceConnectionC51547xK6, 1)) {
            return;
        }
        c52733zK6.f121100b.m36535d("Failed to bind to the service.", new Object[0]);
        c52733zK6.f121103e = false;
        for (AbstractRunnableC43247jK6 abstractRunnableC43247jK62 : c52733zK6.f121102d) {
            abstractRunnableC43247jK62.m30768b(new C17961ar());
        }
        c52733zK6.f121102d.clear();
    }

    /* renamed from: j */
    public static /* synthetic */ void m1524j(C52733zK6 c52733zK6) {
        c52733zK6.f121100b.m36535d("linkToDeath", new Object[0]);
        try {
            c52733zK6.f121109k.asBinder().linkToDeath(c52733zK6.f121107i, 0);
        } catch (RemoteException e) {
            c52733zK6.f121100b.m36536c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m1521m(C52733zK6 c52733zK6) {
        c52733zK6.f121100b.m36535d("unlinkToDeath", new Object[0]);
        c52733zK6.f121109k.asBinder().unlinkToDeath(c52733zK6.f121107i, 0);
    }

    /* renamed from: a */
    public final void m1533a(AbstractRunnableC43247jK6 abstractRunnableC43247jK6) {
        m1516r(new C45619nK6(this, abstractRunnableC43247jK6.m30767c(), abstractRunnableC43247jK6));
    }

    /* renamed from: b */
    public final void m1532b() {
        m1516r(new C46805pK6(this));
    }

    @Nullable
    /* renamed from: c */
    public final T m1531c() {
        return this.f121109k;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void m1520n() {
        this.f121100b.m36535d("reportBinderDeath", new Object[0]);
        InterfaceC47991rK6 interfaceC47991rK6 = this.f121106h.get();
        if (interfaceC47991rK6 != null) {
            this.f121100b.m36535d("calling onBinderDied", new Object[0]);
            interfaceC47991rK6.m16049a();
            return;
        }
        this.f121100b.m36535d("%s : Binder has died.", this.f121101c);
        for (AbstractRunnableC43247jK6 abstractRunnableC43247jK6 : this.f121102d) {
            abstractRunnableC43247jK6.m30768b(new RemoteException(String.valueOf(this.f121101c).concat(" : Binder has died.")));
        }
        this.f121102d.clear();
    }

    /* renamed from: r */
    public final void m1516r(AbstractRunnableC43247jK6 abstractRunnableC43247jK6) {
        Handler handler;
        Map<String, Handler> map = f121098l;
        synchronized (map) {
            if (!map.containsKey(this.f121101c)) {
                HandlerThread handlerThread = new HandlerThread(this.f121101c, 10);
                handlerThread.start();
                map.put(this.f121101c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f121101c);
        }
        handler.post(abstractRunnableC43247jK6);
    }
}
