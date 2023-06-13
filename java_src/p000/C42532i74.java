package p000;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C12120a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C12149a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p000.WG6;
/* renamed from: i74  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42532i74 implements InterfaceC31677Ah1, InterfaceC37662Zw1 {

    /* renamed from: n */
    public static final String f86778n = AbstractC32056Bx2.m113270i("Processor");

    /* renamed from: c */
    public Context f86780c;

    /* renamed from: d */
    public C12120a f86781d;

    /* renamed from: e */
    public InterfaceC45160mZ5 f86782e;

    /* renamed from: f */
    public WorkDatabase f86783f;

    /* renamed from: j */
    public List<InterfaceC51810xm5> f86787j;

    /* renamed from: h */
    public Map<String, WG6> f86785h = new HashMap();

    /* renamed from: g */
    public Map<String, WG6> f86784g = new HashMap();

    /* renamed from: k */
    public Set<String> f86788k = new HashSet();

    /* renamed from: l */
    public final List<InterfaceC31677Ah1> f86789l = new ArrayList();

    /* renamed from: b */
    public PowerManager.WakeLock f86779b = null;

    /* renamed from: m */
    public final Object f86790m = new Object();

    /* renamed from: i */
    public Map<String, Set<C42698iP5>> f86786i = new HashMap();

    /* renamed from: i74$a */
    /* loaded from: classes.dex */
    public static class RunnableC23128a implements Runnable {

        /* renamed from: b */
        public InterfaceC31677Ah1 f86791b;

        /* renamed from: c */
        public final TC6 f86792c;

        /* renamed from: d */
        public ListenableFuture<Boolean> f86793d;

        public RunnableC23128a(InterfaceC31677Ah1 interfaceC31677Ah1, TC6 tc6, ListenableFuture<Boolean> listenableFuture) {
            this.f86791b = interfaceC31677Ah1;
            this.f86792c = tc6;
            this.f86793d = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f86793d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f86791b.mo34425d(this.f86792c, z);
        }
    }

    public C42532i74(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5, WorkDatabase workDatabase, List<InterfaceC51810xm5> list) {
        this.f86780c = context;
        this.f86781d = c12120a;
        this.f86782e = interfaceC45160mZ5;
        this.f86783f = workDatabase;
        this.f86787j = list;
    }

    /* renamed from: i */
    public static boolean m34420i(String str, WG6 wg6) {
        if (wg6 != null) {
            wg6.m78642g();
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str2 = f86778n;
            m113272e.mo113269a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
        String str3 = f86778n;
        m113272e2.mo113269a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ HG6 m34416m(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.f86783f.mo65548J().mo94113d(str));
        return this.f86783f.mo65549I().mo100756l(str);
    }

    @Override // p000.InterfaceC37662Zw1
    /* renamed from: a */
    public void mo34428a(String str, C37428Yw1 c37428Yw1) {
        synchronized (this.f86790m) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str2 = f86778n;
            m113272e.mo113265f(str2, "Moving WorkSpec (" + str + ") to the foreground");
            WG6 remove = this.f86785h.remove(str);
            if (remove != null) {
                if (this.f86779b == null) {
                    PowerManager.WakeLock m73957b = C37433Yw6.m73957b(this.f86780c, "ProcessorForegroundLck");
                    this.f86779b = m73957b;
                    m73957b.acquire();
                }
                this.f86784g.put(str, remove);
                NA0.m94290n(this.f86780c, C12149a.m65486e(this.f86780c, remove.m78645d(), c37428Yw1));
            }
        }
    }

    @Override // p000.InterfaceC37662Zw1
    /* renamed from: b */
    public void mo34427b(String str) {
        synchronized (this.f86790m) {
            this.f86784g.remove(str);
            m34410s();
        }
    }

    @Override // p000.InterfaceC37662Zw1
    /* renamed from: c */
    public boolean mo34426c(String str) {
        boolean containsKey;
        synchronized (this.f86790m) {
            containsKey = this.f86784g.containsKey(str);
        }
        return containsKey;
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void m34417l(TC6 tc6, boolean z) {
        synchronized (this.f86790m) {
            WG6 wg6 = this.f86785h.get(tc6.m84208b());
            if (wg6 != null && tc6.equals(wg6.m78645d())) {
                this.f86785h.remove(tc6.m84208b());
            }
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f86778n;
            m113272e.mo113269a(str, getClass().getSimpleName() + " " + tc6.m84208b() + " executed; reschedule = " + z);
            for (InterfaceC31677Ah1 interfaceC31677Ah1 : this.f86789l) {
                interfaceC31677Ah1.mo34425d(tc6, z);
            }
        }
    }

    /* renamed from: g */
    public void m34422g(InterfaceC31677Ah1 interfaceC31677Ah1) {
        synchronized (this.f86790m) {
            this.f86789l.add(interfaceC31677Ah1);
        }
    }

    /* renamed from: h */
    public HG6 m34421h(String str) {
        synchronized (this.f86790m) {
            WG6 wg6 = this.f86784g.get(str);
            if (wg6 == null) {
                wg6 = this.f86785h.get(str);
            }
            if (wg6 != null) {
                return wg6.m78644e();
            }
            return null;
        }
    }

    /* renamed from: j */
    public boolean m34419j(String str) {
        boolean contains;
        synchronized (this.f86790m) {
            contains = this.f86788k.contains(str);
        }
        return contains;
    }

    /* renamed from: k */
    public boolean m34418k(String str) {
        boolean z;
        synchronized (this.f86790m) {
            if (!this.f86785h.containsKey(str) && !this.f86784g.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    public void m34415n(InterfaceC31677Ah1 interfaceC31677Ah1) {
        synchronized (this.f86790m) {
            this.f86789l.remove(interfaceC31677Ah1);
        }
    }

    /* renamed from: o */
    public final void m34414o(final TC6 tc6, final boolean z) {
        this.f86782e.mo25426b().execute(new Runnable() { // from class: h74
            @Override // java.lang.Runnable
            public final void run() {
                C42532i74.this.m34417l(tc6, z);
            }
        });
    }

    /* renamed from: p */
    public boolean m34413p(C42698iP5 c42698iP5) {
        return m34412q(c42698iP5, null);
    }

    /* renamed from: q */
    public boolean m34412q(C42698iP5 c42698iP5, WorkerParameters.C12119a c12119a) {
        TC6 m34016a = c42698iP5.m34016a();
        final String m84208b = m34016a.m84208b();
        final ArrayList arrayList = new ArrayList();
        HG6 hg6 = (HG6) this.f86783f.m108713y(new Callable() { // from class: g74
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HG6 m34416m;
                m34416m = C42532i74.this.m34416m(arrayList, m84208b);
                return m34416m;
            }
        });
        if (hg6 == null) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f86778n;
            m113272e.mo113262k(str, "Didn't find WorkSpec for id " + m34016a);
            m34414o(m34016a, false);
            return false;
        }
        synchronized (this.f86790m) {
            if (m34418k(m84208b)) {
                Set<C42698iP5> set = this.f86786i.get(m84208b);
                if (set.iterator().next().m34016a().m84209a() == m34016a.m84209a()) {
                    set.add(c42698iP5);
                    AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                    String str2 = f86778n;
                    m113272e2.mo113269a(str2, "Work " + m34016a + " is already enqueued for processing");
                } else {
                    m34414o(m34016a, false);
                }
                return false;
            } else if (hg6.m104073f() != m34016a.m84209a()) {
                m34414o(m34016a, false);
                return false;
            } else {
                WG6 m78628b = new WG6.C8976c(this.f86780c, this.f86781d, this.f86782e, this, this.f86783f, hg6, arrayList).m78626d(this.f86787j).m78627c(c12119a).m78628b();
                ListenableFuture<Boolean> m78646c = m78628b.m78646c();
                m78646c.addListener(new RunnableC23128a(this, c42698iP5.m34016a(), m78646c), this.f86782e.mo25426b());
                this.f86785h.put(m84208b, m78628b);
                HashSet hashSet = new HashSet();
                hashSet.add(c42698iP5);
                this.f86786i.put(m84208b, hashSet);
                this.f86782e.mo25425c().execute(m78628b);
                AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                String str3 = f86778n;
                m113272e3.mo113269a(str3, getClass().getSimpleName() + ": processing " + m34016a);
                return true;
            }
        }
    }

    /* renamed from: r */
    public boolean m34411r(String str) {
        WG6 remove;
        boolean z;
        synchronized (this.f86790m) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str2 = f86778n;
            m113272e.mo113269a(str2, "Processor cancelling " + str);
            this.f86788k.add(str);
            remove = this.f86784g.remove(str);
            if (remove != null) {
                z = true;
            } else {
                z = false;
            }
            if (remove == null) {
                remove = this.f86785h.remove(str);
            }
            if (remove != null) {
                this.f86786i.remove(str);
            }
        }
        boolean m34420i = m34420i(str, remove);
        if (z) {
            m34410s();
        }
        return m34420i;
    }

    /* renamed from: s */
    public final void m34410s() {
        synchronized (this.f86790m) {
            if (!(!this.f86784g.isEmpty())) {
                this.f86780c.startService(C12149a.m65485g(this.f86780c));
                PowerManager.WakeLock wakeLock = this.f86779b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f86779b = null;
                }
            }
        }
    }

    /* renamed from: t */
    public boolean m34409t(C42698iP5 c42698iP5) {
        WG6 remove;
        String m84208b = c42698iP5.m34016a().m84208b();
        synchronized (this.f86790m) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f86778n;
            m113272e.mo113269a(str, "Processor stopping foreground work " + m84208b);
            remove = this.f86784g.remove(m84208b);
            if (remove != null) {
                this.f86786i.remove(m84208b);
            }
        }
        return m34420i(m84208b, remove);
    }

    /* renamed from: u */
    public boolean m34408u(C42698iP5 c42698iP5) {
        String m84208b = c42698iP5.m34016a().m84208b();
        synchronized (this.f86790m) {
            WG6 remove = this.f86785h.remove(m84208b);
            if (remove == null) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f86778n;
                m113272e.mo113269a(str, "WorkerWrapper could not be found for " + m84208b);
                return false;
            }
            Set<C42698iP5> set = this.f86786i.get(m84208b);
            if (set != null && set.contains(c42698iP5)) {
                AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                String str2 = f86778n;
                m113272e2.mo113269a(str2, "Processor stopping background work " + m84208b);
                this.f86786i.remove(m84208b);
                return m34420i(m84208b, remove);
            }
            return false;
        }
    }
}
