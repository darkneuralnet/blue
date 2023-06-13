package p000;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.HG6;
import p000.InterfaceC37061Xh3;
import p000.UC6;
/* renamed from: Nd1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC34683Nd1 implements Runnable {

    /* renamed from: d */
    public static final String f24859d = AbstractC32056Bx2.m113270i("EnqueueRunnable");

    /* renamed from: b */
    public final JC6 f24860b;

    /* renamed from: c */
    public final C38114ai3 f24861c;

    public RunnableC34683Nd1(JC6 jc6) {
        this(jc6, new C38114ai3());
    }

    /* renamed from: b */
    public static boolean m93696b(JC6 jc6) {
        boolean m93695c = m93695c(jc6.m101010i(), jc6.m101011h(), (String[]) JC6.m101005n(jc6).toArray(new String[0]), jc6.m101013f(), jc6.m101015d());
        jc6.m101006m();
        return m93695c;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m93695c(C37830aD6 c37830aD6, List<? extends EG6> list, String[] strArr, String str, EnumC41094fi1 enumC41094fi1) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Iterator<? extends EG6> it;
        InterfaceC44831m01 interfaceC44831m01;
        boolean z6;
        boolean z7;
        String[] strArr2 = strArr;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase m71756u = c37830aD6.m71756u();
        boolean z8 = true;
        if (strArr2 != null && strArr2.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = true;
            z3 = false;
            z4 = false;
            for (String str2 : strArr2) {
                HG6 mo100756l = m71756u.mo65549I().mo100756l(str2);
                if (mo100756l == null) {
                    AbstractC32056Bx2.m113272e().mo113267c(f24859d, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                UC6.EnumC8214a enumC8214a = mo100756l.f13192b;
                if (enumC8214a == UC6.EnumC8214a.SUCCEEDED) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z2 &= z7;
                if (enumC8214a == UC6.EnumC8214a.FAILED) {
                    z4 = true;
                } else if (enumC8214a == UC6.EnumC8214a.CANCELLED) {
                    z3 = true;
                }
            }
        } else {
            z2 = true;
            z3 = false;
            z4 = false;
        }
        boolean z9 = !TextUtils.isEmpty(str);
        if (z9 && !z) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            List<HG6.C3120b> mo100752p = m71756u.mo65549I().mo100752p(str);
            if (!mo100752p.isEmpty()) {
                if (enumC41094fi1 != EnumC41094fi1.APPEND && enumC41094fi1 != EnumC41094fi1.APPEND_OR_REPLACE) {
                    if (enumC41094fi1 == EnumC41094fi1.KEEP) {
                        for (HG6.C3120b c3120b : mo100752p) {
                            UC6.EnumC8214a enumC8214a2 = c3120b.f13212b;
                            if (enumC8214a2 == UC6.EnumC8214a.ENQUEUED || enumC8214a2 == UC6.EnumC8214a.RUNNING) {
                                return false;
                            }
                            while (r2.hasNext()) {
                            }
                        }
                    }
                    AbstractRunnableC36077Tc0.m83339c(str, c37830aD6, false).run();
                    IG6 mo65549I = m71756u.mo65549I();
                    for (HG6.C3120b c3120b2 : mo100752p) {
                        mo65549I.delete(c3120b2.f13211a);
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return z8;
                }
                InterfaceC44831m01 mo65554D = m71756u.mo65554D();
                List arrayList = new ArrayList();
                for (HG6.C3120b c3120b3 : mo100752p) {
                    if (!mo65554D.mo24592d(c3120b3.f13211a)) {
                        UC6.EnumC8214a enumC8214a3 = c3120b3.f13212b;
                        interfaceC44831m01 = mo65554D;
                        if (enumC8214a3 == UC6.EnumC8214a.SUCCEEDED) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z10 = z6 & z2;
                        if (enumC8214a3 == UC6.EnumC8214a.FAILED) {
                            z4 = true;
                        } else if (enumC8214a3 == UC6.EnumC8214a.CANCELLED) {
                            z3 = true;
                        }
                        arrayList.add(c3120b3.f13211a);
                        z2 = z10;
                    } else {
                        interfaceC44831m01 = mo65554D;
                    }
                    mo65554D = interfaceC44831m01;
                }
                if (enumC41094fi1 == EnumC41094fi1.APPEND_OR_REPLACE && (z3 || z4)) {
                    IG6 mo65549I2 = m71756u.mo65549I();
                    for (HG6.C3120b c3120b4 : mo65549I2.mo100752p(str)) {
                        mo65549I2.delete(c3120b4.f13211a);
                    }
                    arrayList = Collections.emptyList();
                    z3 = false;
                    z4 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                if (strArr2.length > 0) {
                    z = true;
                } else {
                    z = false;
                }
                z8 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    EG6 next = it.next();
                    HG6 m109258d = next.m109258d();
                    if (z && !z2) {
                        if (z4) {
                            m109258d.f13192b = UC6.EnumC8214a.FAILED;
                        } else if (z3) {
                            m109258d.f13192b = UC6.EnumC8214a.CANCELLED;
                        } else {
                            m109258d.f13192b = UC6.EnumC8214a.BLOCKED;
                        }
                    } else {
                        m109258d.f13204n = currentTimeMillis;
                    }
                    Iterator<? extends EG6> it2 = it;
                    if (m109258d.f13192b == UC6.EnumC8214a.ENQUEUED) {
                        z8 = true;
                    }
                    m71756u.mo65549I().mo100755m(C34917Od1.m91785b(c37830aD6.m71758s(), m109258d));
                    if (z) {
                        int length = strArr2.length;
                        int i = 0;
                        while (i < length) {
                            m71756u.mo65554D().mo24593c(new C43052j01(next.m109260b(), strArr2[i]));
                            i++;
                            length = length;
                            strArr2 = strArr2;
                        }
                    }
                    String[] strArr3 = strArr2;
                    m71756u.mo65548J().mo94114c(next.m109260b(), next.m109259c());
                    if (z9) {
                        m71756u.mo65551G().mo41712b(new C39627dD6(str, next.m109260b()));
                    }
                    it = it2;
                    strArr2 = strArr3;
                }
                return z8;
            }
        }
        z8 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        return z8;
    }

    /* renamed from: e */
    public static boolean m93693e(JC6 jc6) {
        List<JC6> m101012g = jc6.m101012g();
        boolean z = false;
        if (m101012g != null) {
            for (JC6 jc62 : m101012g) {
                if (!jc62.m101007l()) {
                    z |= m93693e(jc62);
                } else {
                    AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                    String str = f24859d;
                    m113272e.mo113262k(str, "Already enqueued work ids (" + TextUtils.join(", ", jc62.m101014e()) + ")");
                }
            }
        }
        return m93696b(jc6) | z;
    }

    /* renamed from: a */
    public boolean m93697a() {
        WorkDatabase m71756u = this.f24860b.m101010i().m71756u();
        m71756u.m108730c();
        try {
            boolean m93693e = m93693e(this.f24860b);
            m71756u.m108734A();
            return m93693e;
        } finally {
            m71756u.m108728g();
        }
    }

    /* renamed from: d */
    public InterfaceC37061Xh3 m93694d() {
        return this.f24861c;
    }

    /* renamed from: f */
    public void m93692f() {
        C37830aD6 m101010i = this.f24860b.m101010i();
        C32662Em5.m108385b(m101010i.m71763n(), m101010i.m71756u(), m101010i.m71758s());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f24860b.m101009j()) {
                if (m93697a()) {
                    KD3.m99070a(this.f24860b.m101010i().m71764m(), RescheduleReceiver.class, true);
                    m93692f();
                }
                this.f24861c.m70830a(InterfaceC37061Xh3.f43681a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f24860b + ")");
        } catch (Throwable th) {
            this.f24861c.m70830a(new InterfaceC37061Xh3.AbstractC9449b.C9450a(th));
        }
    }

    public RunnableC34683Nd1(JC6 jc6, C38114ai3 c38114ai3) {
        this.f24860b = jc6;
        this.f24861c = c38114ai3;
    }
}
