package p000;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.C40610et0;
/* renamed from: Am1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31722Am1 {

    /* renamed from: k */
    public static final Object f1041k = new Object();

    /* renamed from: l */
    public static final Map<String, C31722Am1> f1042l = new C28385so();

    /* renamed from: a */
    public final Context f1043a;

    /* renamed from: b */
    public final String f1044b;

    /* renamed from: c */
    public final C47074pn1 f1045c;

    /* renamed from: d */
    public final C40610et0 f1046d;

    /* renamed from: g */
    public final C37339Ym2<FS0> f1049g;

    /* renamed from: h */
    public final X94<C49287tX0> f1050h;

    /* renamed from: e */
    public final AtomicBoolean f1047e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f1048f = new AtomicBoolean();

    /* renamed from: i */
    public final List<InterfaceC0205a> f1051i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<Object> f1052j = new CopyOnWriteArrayList();

    @KeepForSdk
    /* renamed from: Am1$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC0205a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    /* renamed from: Am1$b */
    /* loaded from: classes6.dex */
    public static class C0206b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference<C0206b> f1053a = new AtomicReference<>();

        private C0206b() {
        }

        /* renamed from: b */
        public static void m115277b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f1053a.get() == null) {
                    C0206b c0206b = new C0206b();
                    if (C42482i24.m35337a(f1053a, null, c0206b)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c0206b);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (C31722Am1.f1041k) {
                Iterator it = new ArrayList(C31722Am1.f1042l.values()).iterator();
                while (it.hasNext()) {
                    C31722Am1 c31722Am1 = (C31722Am1) it.next();
                    if (c31722Am1.f1047e.get()) {
                        c31722Am1.m115279x(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: Am1$c */
    /* loaded from: classes6.dex */
    public static class C0207c extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C0207c> f1054b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f1055a;

        public C0207c(Context context) {
            this.f1055a = context;
        }

        /* renamed from: b */
        public static void m115275b(Context context) {
            if (f1054b.get() == null) {
                C0207c c0207c = new C0207c(context);
                if (C42482i24.m35337a(f1054b, null, c0207c)) {
                    context.registerReceiver(c0207c, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m115274c() {
            this.f1055a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C31722Am1.f1041k) {
                for (C31722Am1 c31722Am1 : C31722Am1.f1042l.values()) {
                    c31722Am1.m115288o();
                }
            }
            m115274c();
        }
    }

    public C31722Am1(final Context context, String str, C47074pn1 c47074pn1) {
        this.f1043a = (Context) Preconditions.checkNotNull(context);
        this.f1044b = Preconditions.checkNotEmpty(str);
        this.f1045c = (C47074pn1) Preconditions.checkNotNull(c47074pn1);
        AbstractC46849pP5 m47027b = FirebaseInitProvider.m47027b();
        C35943Sn1.m84830b("Firebase");
        C35943Sn1.m84830b("ComponentDiscovery");
        List<X94<ComponentRegistrar>> m84731b = C35987Ss0.m84730c(context, ComponentDiscoveryService.class).m84731b();
        C35943Sn1.m84831a();
        C35943Sn1.m84830b("Runtime");
        C40610et0.C20131b m42430g = C40610et0.m42448l(EnumC51128wd6.INSTANCE).m42433d(m84731b).m42434c(new FirebaseCommonRegistrar()).m42434c(new ExecutorsRegistrar()).m42435b(C32711Es0.m108295s(context, Context.class, new Class[0])).m42435b(C32711Es0.m108295s(this, C31722Am1.class, new Class[0])).m42435b(C32711Es0.m108295s(c47074pn1, C47074pn1.class, new Class[0])).m42430g(new C37157Xs0());
        if (C45240mh6.m25160a(context) && FirebaseInitProvider.m47026c()) {
            m42430g.m42435b(C32711Es0.m108295s(m47027b, AbstractC46849pP5.class, new Class[0]));
        }
        C40610et0 m42432e = m42430g.m42432e();
        this.f1046d = m42432e;
        C35943Sn1.m84831a();
        this.f1049g = new C37339Ym2<>(new X94() { // from class: ym1
            @Override // p000.X94
            public final Object get() {
                FS0 m115282u;
                m115282u = C31722Am1.this.m115282u(context);
                return m115282u;
            }
        });
        this.f1050h = m42432e.mo85622d(C49287tX0.class);
        m115296g(new InterfaceC0205a() { // from class: zm1
            @Override // p000.C31722Am1.InterfaceC0205a
            public final void onBackgroundStateChanged(boolean z) {
                C31722Am1.this.m115281v(z);
            }
        });
        C35943Sn1.m84831a();
    }

    /* renamed from: k */
    public static C31722Am1 m115292k() {
        C31722Am1 c31722Am1;
        synchronized (f1041k) {
            c31722Am1 = f1042l.get("[DEFAULT]");
            if (c31722Am1 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c31722Am1;
    }

    /* renamed from: p */
    public static C31722Am1 m115287p(Context context) {
        synchronized (f1041k) {
            if (f1042l.containsKey("[DEFAULT]")) {
                return m115292k();
            }
            C47074pn1 m18707a = C47074pn1.m18707a(context);
            if (m18707a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m115286q(context, m18707a);
        }
    }

    /* renamed from: q */
    public static C31722Am1 m115286q(Context context, C47074pn1 c47074pn1) {
        return m115285r(context, c47074pn1, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C31722Am1 m115285r(Context context, C47074pn1 c47074pn1, String str) {
        boolean z;
        C31722Am1 c31722Am1;
        C0206b.m115277b(context);
        String m115280w = m115280w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1041k) {
            Map<String, C31722Am1> map = f1042l;
            if (!map.containsKey(m115280w)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "FirebaseApp name " + m115280w + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c31722Am1 = new C31722Am1(context, m115280w, c47074pn1);
            map.put(m115280w, c31722Am1);
        }
        c31722Am1.m115288o();
        return c31722Am1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ FS0 m115282u(Context context) {
        return new FS0(context, m115289n(), (InterfaceC46354oa4) this.f1046d.get(InterfaceC46354oa4.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m115281v(boolean z) {
        if (z) {
            return;
        }
        this.f1050h.get().m12152l();
    }

    /* renamed from: w */
    public static String m115280w(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C31722Am1)) {
            return false;
        }
        return this.f1044b.equals(((C31722Am1) obj).m115291l());
    }

    @KeepForSdk
    /* renamed from: g */
    public void m115296g(InterfaceC0205a interfaceC0205a) {
        m115295h();
        if (this.f1047e.get() && BackgroundDetector.getInstance().isInBackground()) {
            interfaceC0205a.onBackgroundStateChanged(true);
        }
        this.f1051i.add(interfaceC0205a);
    }

    /* renamed from: h */
    public final void m115295h() {
        Preconditions.checkState(!this.f1048f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.f1044b.hashCode();
    }

    @KeepForSdk
    /* renamed from: i */
    public <T> T m115294i(Class<T> cls) {
        m115295h();
        return (T) this.f1046d.get(cls);
    }

    /* renamed from: j */
    public Context m115293j() {
        m115295h();
        return this.f1043a;
    }

    /* renamed from: l */
    public String m115291l() {
        m115295h();
        return this.f1044b;
    }

    /* renamed from: m */
    public C47074pn1 m115290m() {
        m115295h();
        return this.f1045c;
    }

    @KeepForSdk
    /* renamed from: n */
    public String m115289n() {
        return Base64Utils.encodeUrlSafeNoPadding(m115291l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(m115290m().m18705c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: o */
    public final void m115288o() {
        if (!C45240mh6.m25160a(this.f1043a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m115291l());
            C0207c.m115275b(this.f1043a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m115291l());
        this.f1046d.m42445o(m115283t());
        this.f1050h.get().m12152l();
    }

    @KeepForSdk
    /* renamed from: s */
    public boolean m115284s() {
        m115295h();
        return this.f1049g.get().m107143b();
    }

    @KeepForSdk
    /* renamed from: t */
    public boolean m115283t() {
        return "[DEFAULT]".equals(m115291l());
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f1044b).add("options", this.f1045c).toString();
    }

    /* renamed from: x */
    public final void m115279x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (InterfaceC0205a interfaceC0205a : this.f1051i) {
            interfaceC0205a.onBackgroundStateChanged(z);
        }
    }
}
