package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Oq9 */
/* loaded from: classes6.dex */
public final class Oq9 {

    /* renamed from: o */
    public static final Map f27456o = new HashMap();

    /* renamed from: a */
    public final Context f27457a;

    /* renamed from: b */
    public final C51459xA8 f27458b;

    /* renamed from: g */
    public boolean f27463g;

    /* renamed from: h */
    public final Intent f27464h;

    /* renamed from: l */
    public ServiceConnection f27468l;

    /* renamed from: m */
    public IInterface f27469m;

    /* renamed from: n */
    public final Jh9 f27470n;

    /* renamed from: d */
    public final List f27460d = new ArrayList();

    /* renamed from: e */
    public final Set f27461e = new HashSet();

    /* renamed from: f */
    public final Object f27462f = new Object();

    /* renamed from: j */
    public final IBinder.DeathRecipient f27466j = new IBinder.DeathRecipient() { // from class: EN8
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Oq9.m91291h(Oq9.this);
        }
    };

    /* renamed from: k */
    public final AtomicInteger f27467k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f27459c = "IntegrityService";

    /* renamed from: i */
    public final WeakReference f27465i = new WeakReference(null);

    public Oq9(Context context, C51459xA8 c51459xA8, String str, Intent intent, Jh9 jh9, InterfaceC49079t99 interfaceC49079t99, byte[] bArr) {
        this.f27457a = context;
        this.f27458b = c51459xA8;
        this.f27464h = intent;
        this.f27470n = jh9;
    }

    /* renamed from: h */
    public static /* synthetic */ void m91291h(Oq9 oq9) {
        oq9.f27458b.m5751d("reportBinderDeath", new Object[0]);
        InterfaceC49079t99 interfaceC49079t99 = (InterfaceC49079t99) oq9.f27465i.get();
        if (interfaceC49079t99 != null) {
            oq9.f27458b.m5751d("calling onBinderDied", new Object[0]);
            interfaceC49079t99.zza();
        } else {
            oq9.f27458b.m5751d("%s : Binder has died.", oq9.f27459c);
            for (AbstractRunnableC39054cH8 abstractRunnableC39054cH8 : oq9.f27460d) {
                abstractRunnableC39054cH8.mo61624a(oq9.m91280s());
            }
            oq9.f27460d.clear();
        }
        oq9.m91279t();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m91286m(Oq9 oq9, AbstractRunnableC39054cH8 abstractRunnableC39054cH8) {
        if (oq9.f27469m == null && !oq9.f27463g) {
            oq9.f27458b.m5751d("Initiate binding to the service.", new Object[0]);
            oq9.f27460d.add(abstractRunnableC39054cH8);
            Oo9 oo9 = new Oo9(oq9, null);
            oq9.f27468l = oo9;
            oq9.f27463g = true;
            if (!oq9.f27457a.bindService(oq9.f27464h, oo9, 1)) {
                oq9.f27458b.m5751d("Failed to bind to the service.", new Object[0]);
                oq9.f27463g = false;
                for (AbstractRunnableC39054cH8 abstractRunnableC39054cH82 : oq9.f27460d) {
                    abstractRunnableC39054cH82.mo61624a(new zzu());
                }
                oq9.f27460d.clear();
            }
        } else if (oq9.f27463g) {
            oq9.f27458b.m5751d("Waiting to bind to the service.", new Object[0]);
            oq9.f27460d.add(abstractRunnableC39054cH8);
        } else {
            abstractRunnableC39054cH8.run();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m91285n(Oq9 oq9) {
        oq9.f27458b.m5751d("linkToDeath", new Object[0]);
        try {
            oq9.f27469m.asBinder().linkToDeath(oq9.f27466j, 0);
        } catch (RemoteException e) {
            oq9.f27458b.m5752c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m91284o(Oq9 oq9) {
        oq9.f27458b.m5751d("unlinkToDeath", new Object[0]);
        oq9.f27469m.asBinder().unlinkToDeath(oq9.f27466j, 0);
    }

    /* renamed from: c */
    public final Handler m91296c() {
        Handler handler;
        Map map = f27456o;
        synchronized (map) {
            if (!map.containsKey(this.f27459c)) {
                HandlerThread handlerThread = new HandlerThread(this.f27459c, 10);
                handlerThread.start();
                map.put(this.f27459c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f27459c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m91294e() {
        return this.f27469m;
    }

    /* renamed from: p */
    public final void m91283p(AbstractRunnableC39054cH8 abstractRunnableC39054cH8, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f27462f) {
            this.f27461e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: FT8
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Oq9.this.m91282q(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f27462f) {
            if (this.f27467k.getAndIncrement() > 0) {
                this.f27458b.m5754a("Already connected to the service.", new Object[0]);
            }
        }
        m91296c().post(new C49906uZ8(this, abstractRunnableC39054cH8.m61623c(), abstractRunnableC39054cH8));
    }

    /* renamed from: q */
    public final /* synthetic */ void m91282q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f27462f) {
            this.f27461e.remove(taskCompletionSource);
        }
    }

    /* renamed from: r */
    public final void m91281r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f27462f) {
            this.f27461e.remove(taskCompletionSource);
        }
        synchronized (this.f27462f) {
            if (this.f27467k.get() > 0 && this.f27467k.decrementAndGet() > 0) {
                this.f27458b.m5751d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            m91296c().post(new T49(this));
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: s */
    public final RemoteException m91280s() {
        return new RemoteException(String.valueOf(this.f27459c).concat(" : Binder has died."));
    }

    /* renamed from: t */
    public final void m91279t() {
        synchronized (this.f27462f) {
            for (TaskCompletionSource taskCompletionSource : this.f27461e) {
                taskCompletionSource.trySetException(m91280s());
            }
            this.f27461e.clear();
        }
    }
}
