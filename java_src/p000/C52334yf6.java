package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.AbstractC9547Xv;
import p000.BX5;
import p000.C46582ox2;
/* renamed from: yf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52334yf6 {

    /* renamed from: a */
    public final Context f119948a;

    /* renamed from: b */
    public final InterfaceC8824Vv f119949b;

    /* renamed from: c */
    public final InterfaceC35412Qg1 f119950c;

    /* renamed from: d */
    public final FG6 f119951d;

    /* renamed from: e */
    public final Executor f119952e;

    /* renamed from: f */
    public final BX5 f119953f;

    /* renamed from: g */
    public final InterfaceC38734bl0 f119954g;

    /* renamed from: h */
    public final InterfaceC38734bl0 f119955h;

    /* renamed from: i */
    public final InterfaceC33107Gk0 f119956i;

    public C52334yf6(Context context, InterfaceC8824Vv interfaceC8824Vv, InterfaceC35412Qg1 interfaceC35412Qg1, FG6 fg6, Executor executor, BX5 bx5, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, InterfaceC33107Gk0 interfaceC33107Gk0) {
        this.f119948a = context;
        this.f119949b = interfaceC8824Vv;
        this.f119950c = interfaceC35412Qg1;
        this.f119951d = fg6;
        this.f119952e = executor;
        this.f119953f = bx5;
        this.f119954g = interfaceC38734bl0;
        this.f119955h = interfaceC38734bl02;
        this.f119956i = interfaceC33107Gk0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m2997l(T96 t96) {
        return Boolean.valueOf(this.f119950c.mo72710q2(t96));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m2996m(T96 t96) {
        return this.f119950c.mo72767E1(t96);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m2995n(Iterable iterable, T96 t96, long j) {
        this.f119950c.mo72698w2(iterable);
        this.f119950c.mo72699w1(t96, this.f119954g.mo64040a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m2994o(Iterable iterable) {
        this.f119950c.mo72770D1(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m2993p() {
        this.f119956i.mo72737a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m2992q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f119956i.mo72731d(((Integer) entry.getValue()).intValue(), C46582ox2.EnumC27110b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m2991r(T96 t96, long j) {
        this.f119950c.mo72699w1(t96, this.f119954g.mo64040a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m2990s(T96 t96, int i) {
        this.f119951d.mo107365a(t96, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m2989t(final T96 t96, final int i, Runnable runnable) {
        try {
            try {
                BX5 bx5 = this.f119953f;
                final InterfaceC35412Qg1 interfaceC35412Qg1 = this.f119950c;
                Objects.requireNonNull(interfaceC35412Qg1);
                bx5.mo72733c(new BX5.InterfaceC0634a() { // from class: xf6
                    @Override // p000.BX5.InterfaceC0634a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC35412Qg1.this.mo72764H());
                    }
                });
                if (!m2998k()) {
                    this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: of6
                        @Override // p000.BX5.InterfaceC0634a
                        public final Object execute() {
                            Object m2990s;
                            m2990s = C52334yf6.this.m2990s(t96, i);
                            return m2990s;
                        }
                    });
                } else {
                    m2988u(t96, i);
                }
            } catch (SynchronizationException unused) {
                this.f119951d.mo107365a(t96, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC33774Jg1 m2999j(S96 s96) {
        BX5 bx5 = this.f119953f;
        final InterfaceC33107Gk0 interfaceC33107Gk0 = this.f119956i;
        Objects.requireNonNull(interfaceC33107Gk0);
        return s96.mo85874b(AbstractC33774Jg1.m100041a().mo176i(this.f119954g.mo64040a()).mo174k(this.f119955h.mo64040a()).mo175j("GDT_CLIENT_METRICS").mo177h(new C43989kb1(C35142Pc1.m90060b("proto"), ((C33809Jk0) bx5.mo72733c(new BX5.InterfaceC0634a() { // from class: vf6
            @Override // p000.BX5.InterfaceC0634a
            public final Object execute() {
                return InterfaceC33107Gk0.this.mo72735b();
            }
        })).m99895f())).mo181d());
    }

    /* renamed from: k */
    public boolean m2998k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f119948a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public AbstractC9547Xv m2988u(final T96 t96, int i) {
        AbstractC9547Xv mo85875a;
        S96 s96 = this.f119949b.get(t96.mo16804b());
        long j = 0;
        AbstractC9547Xv m76110e = AbstractC9547Xv.m76110e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: nf6
                @Override // p000.BX5.InterfaceC0634a
                public final Object execute() {
                    Boolean m2997l;
                    m2997l = C52334yf6.this.m2997l(t96);
                    return m2997l;
                }
            })).booleanValue()) {
                final Iterable<AbstractC43900kR3> iterable = (Iterable) this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: pf6
                    @Override // p000.BX5.InterfaceC0634a
                    public final Object execute() {
                        Iterable m2996m;
                        m2996m = C52334yf6.this.m2996m(t96);
                        return m2996m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m76110e;
                }
                if (s96 == null) {
                    C35800Rx2.m86172b("Uploader", "Unknown backend for %s, deleting event batch for it...", t96);
                    mo85875a = AbstractC9547Xv.m76112a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC43900kR3 abstractC43900kR3 : iterable) {
                        arrayList.add(abstractC43900kR3.mo28961b());
                    }
                    if (t96.m84268e()) {
                        arrayList.add(m2999j(s96));
                    }
                    mo85875a = s96.mo85875a(AbstractC9206Wv.m77713a().mo35672b(arrayList).mo35671c(t96.mo16803c()).mo35673a());
                }
                m76110e = mo85875a;
                if (m76110e.mo29793c() == AbstractC9547Xv.EnumC9548a.TRANSIENT_ERROR) {
                    this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: qf6
                        @Override // p000.BX5.InterfaceC0634a
                        public final Object execute() {
                            Object m2995n;
                            m2995n = C52334yf6.this.m2995n(iterable, t96, j2);
                            return m2995n;
                        }
                    });
                    this.f119951d.mo107364b(t96, i + 1, true);
                    return m76110e;
                }
                this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: rf6
                    @Override // p000.BX5.InterfaceC0634a
                    public final Object execute() {
                        Object m2994o;
                        m2994o = C52334yf6.this.m2994o(iterable);
                        return m2994o;
                    }
                });
                if (m76110e.mo29793c() == AbstractC9547Xv.EnumC9548a.OK) {
                    j = Math.max(j2, m76110e.mo29794b());
                    if (t96.m84268e()) {
                        this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: sf6
                            @Override // p000.BX5.InterfaceC0634a
                            public final Object execute() {
                                Object m2993p;
                                m2993p = C52334yf6.this.m2993p();
                                return m2993p;
                            }
                        });
                    }
                } else if (m76110e.mo29793c() == AbstractC9547Xv.EnumC9548a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (AbstractC43900kR3 abstractC43900kR32 : iterable) {
                        String mo183j = abstractC43900kR32.mo28961b().mo183j();
                        if (!hashMap.containsKey(mo183j)) {
                            hashMap.put(mo183j, 1);
                        } else {
                            hashMap.put(mo183j, Integer.valueOf(((Integer) hashMap.get(mo183j)).intValue() + 1));
                        }
                    }
                    this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: tf6
                        @Override // p000.BX5.InterfaceC0634a
                        public final Object execute() {
                            Object m2992q;
                            m2992q = C52334yf6.this.m2992q(hashMap);
                            return m2992q;
                        }
                    });
                }
            }
            this.f119953f.mo72733c(new BX5.InterfaceC0634a() { // from class: uf6
                @Override // p000.BX5.InterfaceC0634a
                public final Object execute() {
                    Object m2991r;
                    m2991r = C52334yf6.this.m2991r(t96, j2);
                    return m2991r;
                }
            });
            return m76110e;
        }
    }

    /* renamed from: v */
    public void m2987v(final T96 t96, final int i, final Runnable runnable) {
        this.f119952e.execute(new Runnable() { // from class: wf6
            @Override // java.lang.Runnable
            public final void run() {
                C52334yf6.this.m2989t(t96, i, runnable);
            }
        });
    }
}
