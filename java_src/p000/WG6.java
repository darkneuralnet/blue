package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.C12120a;
import androidx.work.C12124b;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p000.UC6;
/* renamed from: WG6 */
/* loaded from: classes.dex */
public class WG6 implements Runnable {

    /* renamed from: t */
    public static final String f40700t = AbstractC32056Bx2.m113270i("WorkerWrapper");

    /* renamed from: b */
    public Context f40701b;

    /* renamed from: c */
    public final String f40702c;

    /* renamed from: d */
    public List<InterfaceC51810xm5> f40703d;

    /* renamed from: e */
    public WorkerParameters.C12119a f40704e;

    /* renamed from: f */
    public HG6 f40705f;

    /* renamed from: g */
    public AbstractC12126c f40706g;

    /* renamed from: h */
    public InterfaceC45160mZ5 f40707h;

    /* renamed from: j */
    public C12120a f40709j;

    /* renamed from: k */
    public InterfaceC37662Zw1 f40710k;

    /* renamed from: l */
    public WorkDatabase f40711l;

    /* renamed from: m */
    public IG6 f40712m;

    /* renamed from: n */
    public InterfaceC44831m01 f40713n;

    /* renamed from: o */
    public List<String> f40714o;

    /* renamed from: p */
    public String f40715p;

    /* renamed from: s */
    public volatile boolean f40718s;

    /* renamed from: i */
    public AbstractC12126c.AbstractC12127a f40708i = AbstractC12126c.AbstractC12127a.m65564a();

    /* renamed from: q */
    public C40645ew5<Boolean> f40716q = C40645ew5.m42377t();

    /* renamed from: r */
    public final C40645ew5<AbstractC12126c.AbstractC12127a> f40717r = C40645ew5.m42377t();

    /* renamed from: WG6$a */
    /* loaded from: classes.dex */
    public class RunnableC8974a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f40719b;

        public RunnableC8974a(ListenableFuture listenableFuture) {
            this.f40719b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WG6.this.f40717r.isCancelled()) {
                return;
            }
            try {
                this.f40719b.get();
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = WG6.f40700t;
                m113272e.mo113269a(str, "Starting work for " + WG6.this.f40705f.f13193c);
                WG6 wg6 = WG6.this;
                wg6.f40717r.mo7592r(wg6.f40706g.mo65464o());
            } catch (Throwable th) {
                WG6.this.f40717r.mo7593q(th);
            }
        }
    }

    /* renamed from: WG6$b */
    /* loaded from: classes.dex */
    public class RunnableC8975b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f40721b;

        public RunnableC8975b(String str) {
            this.f40721b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    AbstractC12126c.AbstractC12127a abstractC12127a = WG6.this.f40717r.get();
                    if (abstractC12127a == null) {
                        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                        String str = WG6.f40700t;
                        m113272e.mo113267c(str, WG6.this.f40705f.f13193c + " returned a null result. Treating it as a failure.");
                    } else {
                        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                        String str2 = WG6.f40700t;
                        m113272e2.mo113269a(str2, WG6.this.f40705f.f13193c + " returned a " + abstractC12127a + InstructionFileId.DOT);
                        WG6.this.f40708i = abstractC12127a;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                    String str3 = WG6.f40700t;
                    m113272e3.mo113266d(str3, this.f40721b + " failed because it threw an exception/error", e);
                } catch (CancellationException e2) {
                    AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
                    String str4 = WG6.f40700t;
                    m113272e4.mo113264g(str4, this.f40721b + " was cancelled", e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    AbstractC32056Bx2 m113272e32 = AbstractC32056Bx2.m113272e();
                    String str32 = WG6.f40700t;
                    m113272e32.mo113266d(str32, this.f40721b + " failed because it threw an exception/error", e);
                }
            } finally {
                WG6.this.m78639j();
            }
        }
    }

    /* renamed from: WG6$c */
    /* loaded from: classes.dex */
    public static class C8976c {

        /* renamed from: a */
        public Context f40723a;

        /* renamed from: b */
        public AbstractC12126c f40724b;

        /* renamed from: c */
        public InterfaceC37662Zw1 f40725c;

        /* renamed from: d */
        public InterfaceC45160mZ5 f40726d;

        /* renamed from: e */
        public C12120a f40727e;

        /* renamed from: f */
        public WorkDatabase f40728f;

        /* renamed from: g */
        public HG6 f40729g;

        /* renamed from: h */
        public List<InterfaceC51810xm5> f40730h;

        /* renamed from: i */
        public final List<String> f40731i;

        /* renamed from: j */
        public WorkerParameters.C12119a f40732j = new WorkerParameters.C12119a();

        public C8976c(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5, InterfaceC37662Zw1 interfaceC37662Zw1, WorkDatabase workDatabase, HG6 hg6, List<String> list) {
            this.f40723a = context.getApplicationContext();
            this.f40726d = interfaceC45160mZ5;
            this.f40725c = interfaceC37662Zw1;
            this.f40727e = c12120a;
            this.f40728f = workDatabase;
            this.f40729g = hg6;
            this.f40731i = list;
        }

        /* renamed from: b */
        public WG6 m78628b() {
            return new WG6(this);
        }

        /* renamed from: c */
        public C8976c m78627c(WorkerParameters.C12119a c12119a) {
            if (c12119a != null) {
                this.f40732j = c12119a;
            }
            return this;
        }

        /* renamed from: d */
        public C8976c m78626d(List<InterfaceC51810xm5> list) {
            this.f40730h = list;
            return this;
        }
    }

    public WG6(C8976c c8976c) {
        this.f40701b = c8976c.f40723a;
        this.f40707h = c8976c.f40726d;
        this.f40710k = c8976c.f40725c;
        HG6 hg6 = c8976c.f40729g;
        this.f40705f = hg6;
        this.f40702c = hg6.f13191a;
        this.f40703d = c8976c.f40730h;
        this.f40704e = c8976c.f40732j;
        this.f40706g = c8976c.f40724b;
        this.f40709j = c8976c.f40727e;
        WorkDatabase workDatabase = c8976c.f40728f;
        this.f40711l = workDatabase;
        this.f40712m = workDatabase.mo65549I();
        this.f40713n = this.f40711l.mo65554D();
        this.f40714o = c8976c.f40731i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m78640i(ListenableFuture listenableFuture) {
        if (this.f40717r.isCancelled()) {
            listenableFuture.cancel(true);
        }
    }

    /* renamed from: b */
    public final String m78647b(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f40702c);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    public ListenableFuture<Boolean> m78646c() {
        return this.f40716q;
    }

    /* renamed from: d */
    public TC6 m78645d() {
        return KG6.m99055a(this.f40705f);
    }

    /* renamed from: e */
    public HG6 m78644e() {
        return this.f40705f;
    }

    /* renamed from: f */
    public final void m78643f(AbstractC12126c.AbstractC12127a abstractC12127a) {
        if (abstractC12127a instanceof AbstractC12126c.AbstractC12127a.C12130c) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f40700t;
            m113272e.mo113265f(str, "Worker result SUCCESS for " + this.f40715p);
            if (this.f40705f.m104069j()) {
                m78637l();
            } else {
                m78632q();
            }
        } else if (abstractC12127a instanceof AbstractC12126c.AbstractC12127a.C12129b) {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            String str2 = f40700t;
            m113272e2.mo113265f(str2, "Worker result RETRY for " + this.f40715p);
            m78638k();
        } else {
            AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
            String str3 = f40700t;
            m113272e3.mo113265f(str3, "Worker result FAILURE for " + this.f40715p);
            if (this.f40705f.m104069j()) {
                m78637l();
            } else {
                m78633p();
            }
        }
    }

    /* renamed from: g */
    public void m78642g() {
        this.f40718s = true;
        m78631r();
        this.f40717r.cancel(true);
        if (this.f40706g != null && this.f40717r.isCancelled()) {
            this.f40706g.m65565p();
            return;
        }
        AbstractC32056Bx2.m113272e().mo113269a(f40700t, "WorkSpec " + this.f40705f + " is already done. Not interrupting.");
    }

    /* renamed from: h */
    public final void m78641h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f40712m.mo100766b(str2) != UC6.EnumC8214a.CANCELLED) {
                this.f40712m.mo100758j(UC6.EnumC8214a.FAILED, str2);
            }
            linkedList.addAll(this.f40713n.mo24595a(str2));
        }
    }

    /* renamed from: j */
    public void m78639j() {
        if (!m78631r()) {
            this.f40711l.m108730c();
            try {
                UC6.EnumC8214a mo100766b = this.f40712m.mo100766b(this.f40702c);
                this.f40711l.mo65550H().delete(this.f40702c);
                if (mo100766b == null) {
                    m78636m(false);
                } else if (mo100766b == UC6.EnumC8214a.RUNNING) {
                    m78643f(this.f40708i);
                } else if (!mo100766b.m81823b()) {
                    m78638k();
                }
                this.f40711l.m108734A();
            } finally {
                this.f40711l.m108728g();
            }
        }
        List<InterfaceC51810xm5> list = this.f40703d;
        if (list != null) {
            for (InterfaceC51810xm5 interfaceC51810xm5 : list) {
                interfaceC51810xm5.mo4714e(this.f40702c);
            }
            C32662Em5.m108385b(this.f40709j, this.f40711l, this.f40703d);
        }
    }

    /* renamed from: k */
    public final void m78638k() {
        this.f40711l.m108730c();
        try {
            this.f40712m.mo100758j(UC6.EnumC8214a.ENQUEUED, this.f40702c);
            this.f40712m.mo100765c(this.f40702c, System.currentTimeMillis());
            this.f40712m.mo100753o(this.f40702c, -1L);
            this.f40711l.m108734A();
        } finally {
            this.f40711l.m108728g();
            m78636m(true);
        }
    }

    /* renamed from: l */
    public final void m78637l() {
        this.f40711l.m108730c();
        try {
            this.f40712m.mo100765c(this.f40702c, System.currentTimeMillis());
            this.f40712m.mo100758j(UC6.EnumC8214a.ENQUEUED, this.f40702c);
            this.f40712m.mo100761g(this.f40702c);
            this.f40712m.mo100760h(this.f40702c);
            this.f40712m.mo100753o(this.f40702c, -1L);
            this.f40711l.m108734A();
        } finally {
            this.f40711l.m108728g();
            m78636m(false);
        }
    }

    /* renamed from: m */
    public final void m78636m(boolean z) {
        this.f40711l.m108730c();
        try {
            if (!this.f40711l.mo65549I().mo100762f()) {
                KD3.m99070a(this.f40701b, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f40712m.mo100758j(UC6.EnumC8214a.ENQUEUED, this.f40702c);
                this.f40712m.mo100753o(this.f40702c, -1L);
            }
            if (this.f40705f != null && this.f40706g != null && this.f40710k.mo34426c(this.f40702c)) {
                this.f40710k.mo34427b(this.f40702c);
            }
            this.f40711l.m108734A();
            this.f40711l.m108728g();
            this.f40716q.mo7594p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f40711l.m108728g();
            throw th;
        }
    }

    /* renamed from: n */
    public final void m78635n() {
        UC6.EnumC8214a mo100766b = this.f40712m.mo100766b(this.f40702c);
        if (mo100766b == UC6.EnumC8214a.RUNNING) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f40700t;
            m113272e.mo113269a(str, "Status for " + this.f40702c + " is RUNNING; not doing any work and rescheduling for later execution");
            m78636m(true);
            return;
        }
        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
        String str2 = f40700t;
        m113272e2.mo113269a(str2, "Status for " + this.f40702c + " is " + mo100766b + " ; not doing any work");
        m78636m(false);
    }

    /* renamed from: o */
    public final void m78634o() {
        C12124b mo36877b;
        if (m78631r()) {
            return;
        }
        this.f40711l.m108730c();
        try {
            HG6 hg6 = this.f40705f;
            if (hg6.f13192b != UC6.EnumC8214a.ENQUEUED) {
                m78635n();
                this.f40711l.m108734A();
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f40700t;
                m113272e.mo113269a(str, this.f40705f.f13193c + " is not in ENQUEUED state. Nothing more to do");
            } else if ((hg6.m104069j() || this.f40705f.m104070i()) && System.currentTimeMillis() < this.f40705f.m104076c()) {
                AbstractC32056Bx2.m113272e().mo113269a(f40700t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f40705f.f13193c));
                m78636m(true);
                this.f40711l.m108734A();
            } else {
                this.f40711l.m108734A();
                this.f40711l.m108728g();
                if (this.f40705f.m104069j()) {
                    mo36877b = this.f40705f.f13195e;
                } else {
                    AbstractC41897h32 m34533b = this.f40709j.m65604f().m34533b(this.f40705f.f13194d);
                    if (m34533b == null) {
                        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                        String str2 = f40700t;
                        m113272e2.mo113267c(str2, "Could not create Input Merger " + this.f40705f.f13194d);
                        m78633p();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f40705f.f13195e);
                    arrayList.addAll(this.f40712m.mo100764d(this.f40702c));
                    mo36877b = m34533b.mo36877b(arrayList);
                }
                C12124b c12124b = mo36877b;
                UUID fromString = UUID.fromString(this.f40702c);
                List<String> list = this.f40714o;
                WorkerParameters.C12119a c12119a = this.f40704e;
                HG6 hg62 = this.f40705f;
                WorkerParameters workerParameters = new WorkerParameters(fromString, c12124b, list, c12119a, hg62.f13201k, hg62.m104073f(), this.f40709j.m65606d(), this.f40707h, this.f40709j.m65596n(), new BG6(this.f40711l, this.f40707h), new SC6(this.f40711l, this.f40710k, this.f40707h));
                if (this.f40706g == null) {
                    this.f40706g = this.f40709j.m65596n().m88676b(this.f40701b, this.f40705f.f13193c, workerParameters);
                }
                AbstractC12126c abstractC12126c = this.f40706g;
                if (abstractC12126c == null) {
                    AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                    String str3 = f40700t;
                    m113272e3.mo113267c(str3, "Could not create Worker " + this.f40705f.f13193c);
                    m78633p();
                } else if (abstractC12126c.m65567l()) {
                    AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
                    String str4 = f40700t;
                    m113272e4.mo113267c(str4, "Received an already-used Worker " + this.f40705f.f13193c + "; Worker Factory should return new instances");
                    m78633p();
                } else {
                    this.f40706g.m65566n();
                    if (m78630s()) {
                        if (m78631r()) {
                            return;
                        }
                        RC6 rc6 = new RC6(this.f40701b, this.f40705f, this.f40706g, workerParameters.m65615b(), this.f40707h);
                        this.f40707h.mo25426b().execute(rc6);
                        final ListenableFuture<Void> m87195b = rc6.m87195b();
                        this.f40717r.addListener(new Runnable() { // from class: VG6
                            @Override // java.lang.Runnable
                            public final void run() {
                                WG6.this.m78640i(m87195b);
                            }
                        }, new SX5());
                        m87195b.addListener(new RunnableC8974a(m87195b), this.f40707h.mo25426b());
                        this.f40717r.addListener(new RunnableC8975b(this.f40715p), this.f40707h.mo25425c());
                        return;
                    }
                    m78635n();
                }
            }
        } finally {
            this.f40711l.m108728g();
        }
    }

    /* renamed from: p */
    public void m78633p() {
        this.f40711l.m108730c();
        try {
            m78641h(this.f40702c);
            this.f40712m.mo100749s(this.f40702c, ((AbstractC12126c.AbstractC12127a.C12128a) this.f40708i).m65560e());
            this.f40711l.m108734A();
        } finally {
            this.f40711l.m108728g();
            m78636m(false);
        }
    }

    /* renamed from: q */
    public final void m78632q() {
        this.f40711l.m108730c();
        try {
            this.f40712m.mo100758j(UC6.EnumC8214a.SUCCEEDED, this.f40702c);
            this.f40712m.mo100749s(this.f40702c, ((AbstractC12126c.AbstractC12127a.C12130c) this.f40708i).m65559e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f40713n.mo24595a(this.f40702c)) {
                if (this.f40712m.mo100766b(str) == UC6.EnumC8214a.BLOCKED && this.f40713n.mo24594b(str)) {
                    AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                    String str2 = f40700t;
                    m113272e.mo113265f(str2, "Setting status to enqueued for " + str);
                    this.f40712m.mo100758j(UC6.EnumC8214a.ENQUEUED, str);
                    this.f40712m.mo100765c(str, currentTimeMillis);
                }
            }
            this.f40711l.m108734A();
        } finally {
            this.f40711l.m108728g();
            m78636m(false);
        }
    }

    /* renamed from: r */
    public final boolean m78631r() {
        if (!this.f40718s) {
            return false;
        }
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f40700t;
        m113272e.mo113269a(str, "Work interrupted for " + this.f40715p);
        UC6.EnumC8214a mo100766b = this.f40712m.mo100766b(this.f40702c);
        if (mo100766b == null) {
            m78636m(false);
        } else {
            m78636m(!mo100766b.m81823b());
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f40715p = m78647b(this.f40714o);
        m78634o();
    }

    /* renamed from: s */
    public final boolean m78630s() {
        boolean z;
        this.f40711l.m108730c();
        try {
            if (this.f40712m.mo100766b(this.f40702c) == UC6.EnumC8214a.ENQUEUED) {
                this.f40712m.mo100758j(UC6.EnumC8214a.RUNNING, this.f40702c);
                this.f40712m.mo100747u(this.f40702c);
                z = true;
            } else {
                z = false;
            }
            this.f40711l.m108734A();
            return z;
        } finally {
            this.f40711l.m108728g();
        }
    }
}
