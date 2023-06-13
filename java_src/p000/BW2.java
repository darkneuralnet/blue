package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.BW2;
import p000.C47274q72;
import p000.TO1;
import p000.UO1;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010C\u001a\u00020\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b3\u0010@R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b&\u0010@¨\u0006H"}, m28432d2 = {"LBW2;", "", "", C17296a.f69688o, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lq72;", "b", "Lq72;", "e", "()Lq72;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/Executor;", "executor", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", "clientId", "Lq72$c;", "f", "Lq72$c;", "()Lq72$c;", "l", "(Lq72$c;)V", "observer", "LUO1;", "g", "LUO1;", "h", "()LUO1;", "m", "(LUO1;)V", "service", "LTO1;", "LTO1;", "getCallback", "()LTO1;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lq72;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: BW2 */
/* loaded from: classes.dex */
public final class BW2 {

    /* renamed from: a */
    public final String f2459a;

    /* renamed from: b */
    public final C47274q72 f2460b;

    /* renamed from: c */
    public final Executor f2461c;

    /* renamed from: d */
    public final Context f2462d;

    /* renamed from: e */
    public int f2463e;

    /* renamed from: f */
    public C47274q72.AbstractC27505c f2464f;

    /* renamed from: g */
    public UO1 f2465g;

    /* renamed from: h */
    public final TO1 f2466h;

    /* renamed from: i */
    public final AtomicBoolean f2467i;

    /* renamed from: j */
    public final ServiceConnection f2468j;

    /* renamed from: k */
    public final Runnable f2469k;

    /* renamed from: l */
    public final Runnable f2470l;

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"BW2$a", "Lq72$c;", "", "", "tables", "", "c", "", "b", "()Z", "isRemote", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: BW2$a */
    /* loaded from: classes.dex */
    public static final class C0627a extends C47274q72.AbstractC27505c {
        public C0627a(String[] strArr) {
            super(strArr);
        }

        @Override // p000.C47274q72.AbstractC27505c
        /* renamed from: b */
        public boolean mo18115b() {
            return true;
        }

        @Override // p000.C47274q72.AbstractC27505c
        /* renamed from: c */
        public void mo18111c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (BW2.this.m113916j().get()) {
                return;
            }
            try {
                UO1 m113918h = BW2.this.m113918h();
                if (m113918h != null) {
                    int m113923c = BW2.this.m113923c();
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    m113918h.mo66081x3(m113923c, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"BW2$b", "LTO1$a;", "", "", "tables", "", "G", "([Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: BW2$b */
    /* loaded from: classes.dex */
    public static final class BinderC0628b extends TO1.AbstractBinderC7822a {
        public BinderC0628b() {
        }

        /* renamed from: e5 */
        public static final void m113910e5(BW2 this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.m113921e().m18134m((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // p000.TO1
        /* renamed from: G */
        public void mo83702G(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor m113922d = BW2.this.m113922d();
            final BW2 bw2 = BW2.this;
            m113922d.execute(new Runnable() { // from class: CW2
                @Override // java.lang.Runnable
                public final void run() {
                    BW2.BinderC0628b.m113910e5(BW2.this, tables);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"BW2$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: BW2$c */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC0629c implements ServiceConnection {
        public ServiceConnectionC0629c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            BW2.this.m113913m(UO1.AbstractBinderC8272a.m81568c5(service));
            BW2.this.m113922d().execute(BW2.this.m113917i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            BW2.this.m113922d().execute(BW2.this.m113919g());
            BW2.this.m113913m(null);
        }
    }

    public BW2(Context context, String name, Intent serviceIntent, C47274q72 invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f2459a = name;
        this.f2460b = invalidationTracker;
        this.f2461c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f2462d = applicationContext;
        this.f2466h = new BinderC0628b();
        this.f2467i = new AtomicBoolean(false);
        ServiceConnectionC0629c serviceConnectionC0629c = new ServiceConnectionC0629c();
        this.f2468j = serviceConnectionC0629c;
        this.f2469k = new Runnable() { // from class: zW2
            @Override // java.lang.Runnable
            public final void run() {
                BW2.m113912n(BW2.this);
            }
        };
        this.f2470l = new Runnable() { // from class: AW2
            @Override // java.lang.Runnable
            public final void run() {
                BW2.m113915k(BW2.this);
            }
        };
        Object[] array = invalidationTracker.m18136k().keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        m113914l(new C0627a((String[]) array));
        applicationContext.bindService(serviceIntent, serviceConnectionC0629c, 1);
    }

    /* renamed from: k */
    public static final void m113915k(BW2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f2460b.m18131p(this$0.m113920f());
    }

    /* renamed from: n */
    public static final void m113912n(BW2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            UO1 uo1 = this$0.f2465g;
            if (uo1 != null) {
                this$0.f2463e = uo1.mo66082r2(this$0.f2466h, this$0.f2459a);
                this$0.f2460b.m18144c(this$0.m113920f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    /* renamed from: c */
    public final int m113923c() {
        return this.f2463e;
    }

    /* renamed from: d */
    public final Executor m113922d() {
        return this.f2461c;
    }

    /* renamed from: e */
    public final C47274q72 m113921e() {
        return this.f2460b;
    }

    /* renamed from: f */
    public final C47274q72.AbstractC27505c m113920f() {
        C47274q72.AbstractC27505c abstractC27505c = this.f2464f;
        if (abstractC27505c != null) {
            return abstractC27505c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    /* renamed from: g */
    public final Runnable m113919g() {
        return this.f2470l;
    }

    /* renamed from: h */
    public final UO1 m113918h() {
        return this.f2465g;
    }

    /* renamed from: i */
    public final Runnable m113917i() {
        return this.f2469k;
    }

    /* renamed from: j */
    public final AtomicBoolean m113916j() {
        return this.f2467i;
    }

    /* renamed from: l */
    public final void m113914l(C47274q72.AbstractC27505c abstractC27505c) {
        Intrinsics.checkNotNullParameter(abstractC27505c, "<set-?>");
        this.f2464f = abstractC27505c;
    }

    /* renamed from: m */
    public final void m113913m(UO1 uo1) {
        this.f2465g = uo1;
    }
}
