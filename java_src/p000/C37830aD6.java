package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.C12120a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p000.AbstractC32056Bx2;
/* renamed from: aD6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37830aD6 extends ZC6 {

    /* renamed from: k */
    public static final String f50079k = AbstractC32056Bx2.m113270i("WorkManagerImpl");

    /* renamed from: l */
    public static C37830aD6 f50080l = null;

    /* renamed from: m */
    public static C37830aD6 f50081m = null;

    /* renamed from: n */
    public static final Object f50082n = new Object();

    /* renamed from: a */
    public Context f50083a;

    /* renamed from: b */
    public C12120a f50084b;

    /* renamed from: c */
    public WorkDatabase f50085c;

    /* renamed from: d */
    public InterfaceC45160mZ5 f50086d;

    /* renamed from: e */
    public List<InterfaceC51810xm5> f50087e;

    /* renamed from: f */
    public C42532i74 f50088f;

    /* renamed from: g */
    public TZ3 f50089g;

    /* renamed from: h */
    public boolean f50090h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f50091i;

    /* renamed from: j */
    public final C44303l66 f50092j;

    /* renamed from: aD6$a */
    /* loaded from: classes.dex */
    public static class C10602a {
        private C10602a() {
        }

        /* renamed from: a */
        public static boolean m71750a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public C37830aD6(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5) {
        this(context, c12120a, interfaceC45160mZ5, context.getResources().getBoolean(C51146wf4.workmanager_test_configuration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (p000.C37830aD6.f50081m != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        p000.C37830aD6.f50081m = new p000.C37830aD6(r4, r5, new p000.C38423bD6(r5.m65597m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        p000.C37830aD6.f50080l = p000.C37830aD6.f50081m;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m71768i(Context context, C12120a c12120a) {
        synchronized (f50082n) {
            C37830aD6 c37830aD6 = f50080l;
            if (c37830aD6 != null && f50081m != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @Deprecated
    /* renamed from: o */
    public static C37830aD6 m71762o() {
        synchronized (f50082n) {
            C37830aD6 c37830aD6 = f50080l;
            if (c37830aD6 != null) {
                return c37830aD6;
            }
            return f50081m;
        }
    }

    /* renamed from: p */
    public static C37830aD6 m71761p(Context context) {
        C37830aD6 m71762o;
        synchronized (f50082n) {
            m71762o = m71762o();
            if (m71762o == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C12120a.InterfaceC12123c) {
                    m71768i(applicationContext, ((C12120a.InterfaceC12123c) applicationContext).m65594a());
                    m71762o = m71761p(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return m71762o;
    }

    /* renamed from: A */
    public void m71777A(C42698iP5 c42698iP5) {
        m71776B(c42698iP5, null);
    }

    /* renamed from: B */
    public void m71776B(C42698iP5 c42698iP5, WorkerParameters.C12119a c12119a) {
        this.f50086d.m25427a(new RunnableC44477lP5(this, c42698iP5, c12119a));
    }

    /* renamed from: C */
    public void m71775C(TC6 tc6) {
        this.f50086d.m25427a(new XQ5(this, new C42698iP5(tc6), true));
    }

    /* renamed from: D */
    public void m71774D(C42698iP5 c42698iP5) {
        this.f50086d.m25427a(new XQ5(this, c42698iP5, false));
    }

    @Override // p000.ZC6
    /* renamed from: a */
    public IC6 mo71773a(List<C32849Fh3> list) {
        if (!list.isEmpty()) {
            return new JC6(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @Override // p000.ZC6
    /* renamed from: b */
    public InterfaceC37061Xh3 mo71772b(String str) {
        AbstractRunnableC36077Tc0 m83339c = AbstractRunnableC36077Tc0.m83339c(str, this, true);
        this.f50086d.m25427a(m83339c);
        return m83339c.m83338d();
    }

    @Override // p000.ZC6
    /* renamed from: d */
    public InterfaceC37061Xh3 mo71771d(List<? extends EG6> list) {
        if (!list.isEmpty()) {
            return new JC6(this, list).mo101017a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // p000.ZC6
    /* renamed from: e */
    public InterfaceC37061Xh3 mo71770e(String str, EnumC40501ei1 enumC40501ei1, C46856pQ3 c46856pQ3) {
        if (enumC40501ei1 == EnumC40501ei1.UPDATE) {
            return UG6.m81762c(this, str, c46856pQ3);
        }
        return m71765l(str, enumC40501ei1, c46856pQ3).mo101017a();
    }

    @Override // p000.ZC6
    /* renamed from: g */
    public InterfaceC37061Xh3 mo71769g(String str, EnumC41094fi1 enumC41094fi1, List<C32849Fh3> list) {
        return new JC6(this, str, enumC41094fi1, list).mo101017a();
    }

    /* renamed from: j */
    public InterfaceC37061Xh3 m71767j(UUID uuid) {
        AbstractRunnableC36077Tc0 m83340b = AbstractRunnableC36077Tc0.m83340b(uuid, this);
        this.f50086d.m25427a(m83340b);
        return m83340b.m83338d();
    }

    /* renamed from: k */
    public List<InterfaceC51810xm5> m71766k(Context context, C12120a c12120a, C44303l66 c44303l66) {
        return Arrays.asList(C32662Em5.m108386a(context, this), new C38427bE1(context, c12120a, c44303l66, this));
    }

    /* renamed from: l */
    public JC6 m71765l(String str, EnumC40501ei1 enumC40501ei1, C46856pQ3 c46856pQ3) {
        EnumC41094fi1 enumC41094fi1;
        if (enumC40501ei1 == EnumC40501ei1.KEEP) {
            enumC41094fi1 = EnumC41094fi1.KEEP;
        } else {
            enumC41094fi1 = EnumC41094fi1.REPLACE;
        }
        return new JC6(this, str, enumC41094fi1, Collections.singletonList(c46856pQ3));
    }

    /* renamed from: m */
    public Context m71764m() {
        return this.f50083a;
    }

    /* renamed from: n */
    public C12120a m71763n() {
        return this.f50084b;
    }

    /* renamed from: q */
    public TZ3 m71760q() {
        return this.f50089g;
    }

    /* renamed from: r */
    public C42532i74 m71759r() {
        return this.f50088f;
    }

    /* renamed from: s */
    public List<InterfaceC51810xm5> m71758s() {
        return this.f50087e;
    }

    /* renamed from: t */
    public C44303l66 m71757t() {
        return this.f50092j;
    }

    /* renamed from: u */
    public WorkDatabase m71756u() {
        return this.f50085c;
    }

    /* renamed from: v */
    public InterfaceC45160mZ5 m71755v() {
        return this.f50086d;
    }

    /* renamed from: w */
    public final void m71754w(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5, WorkDatabase workDatabase, List<InterfaceC51810xm5> list, C42532i74 c42532i74) {
        Context applicationContext = context.getApplicationContext();
        this.f50083a = applicationContext;
        this.f50084b = c12120a;
        this.f50086d = interfaceC45160mZ5;
        this.f50085c = workDatabase;
        this.f50087e = list;
        this.f50088f = c42532i74;
        this.f50089g = new TZ3(workDatabase);
        this.f50090h = false;
        if (!C10602a.m71750a(applicationContext)) {
            this.f50086d.m25427a(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: x */
    public void m71753x() {
        synchronized (f50082n) {
            this.f50090h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f50091i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f50091i = null;
            }
        }
    }

    /* renamed from: y */
    public void m71752y() {
        C41593gY5.m39176a(m71764m());
        m71756u().mo65549I().mo100754n();
        C32662Em5.m108385b(m71763n(), m71756u(), m71758s());
    }

    /* renamed from: z */
    public void m71751z(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f50082n) {
            BroadcastReceiver.PendingResult pendingResult2 = this.f50091i;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.f50091i = pendingResult;
            if (this.f50090h) {
                pendingResult.finish();
                this.f50091i = null;
            }
        }
    }

    public C37830aD6(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5, boolean z) {
        this(context, c12120a, interfaceC45160mZ5, WorkDatabase.m65558C(context.getApplicationContext(), interfaceC45160mZ5.mo25425c(), z));
    }

    public C37830aD6(Context context, C12120a c12120a, InterfaceC45160mZ5 interfaceC45160mZ5, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC32056Bx2.m113271h(new AbstractC32056Bx2.C0776a(c12120a.m65600j()));
        C44303l66 c44303l66 = new C44303l66(applicationContext, interfaceC45160mZ5);
        this.f50092j = c44303l66;
        List<InterfaceC51810xm5> m71766k = m71766k(applicationContext, c12120a, c44303l66);
        m71754w(context, c12120a, interfaceC45160mZ5, workDatabase, m71766k, new C42532i74(context, c12120a, interfaceC45160mZ5, workDatabase, m71766k));
    }
}
