package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: JC6 */
/* loaded from: classes.dex */
public class JC6 extends IC6 {

    /* renamed from: j */
    public static final String f17000j = AbstractC32056Bx2.m113270i("WorkContinuationImpl");

    /* renamed from: a */
    public final C37830aD6 f17001a;

    /* renamed from: b */
    public final String f17002b;

    /* renamed from: c */
    public final EnumC41094fi1 f17003c;

    /* renamed from: d */
    public final List<? extends EG6> f17004d;

    /* renamed from: e */
    public final List<String> f17005e;

    /* renamed from: f */
    public final List<String> f17006f;

    /* renamed from: g */
    public final List<JC6> f17007g;

    /* renamed from: h */
    public boolean f17008h;

    /* renamed from: i */
    public InterfaceC37061Xh3 f17009i;

    public JC6(C37830aD6 c37830aD6, List<? extends EG6> list) {
        this(c37830aD6, null, EnumC41094fi1.KEEP, list, null);
    }

    /* renamed from: k */
    public static boolean m101008k(JC6 jc6, Set<String> set) {
        set.addAll(jc6.m101014e());
        Set<String> m101005n = m101005n(jc6);
        for (String str : set) {
            if (m101005n.contains(str)) {
                return true;
            }
        }
        List<JC6> m101012g = jc6.m101012g();
        if (m101012g != null && !m101012g.isEmpty()) {
            for (JC6 jc62 : m101012g) {
                if (m101008k(jc62, set)) {
                    return true;
                }
            }
        }
        set.removeAll(jc6.m101014e());
        return false;
    }

    /* renamed from: n */
    public static Set<String> m101005n(JC6 jc6) {
        HashSet hashSet = new HashSet();
        List<JC6> m101012g = jc6.m101012g();
        if (m101012g != null && !m101012g.isEmpty()) {
            for (JC6 jc62 : m101012g) {
                hashSet.addAll(jc62.m101014e());
            }
        }
        return hashSet;
    }

    @Override // p000.IC6
    /* renamed from: a */
    public InterfaceC37061Xh3 mo101017a() {
        if (!this.f17008h) {
            RunnableC34683Nd1 runnableC34683Nd1 = new RunnableC34683Nd1(this);
            this.f17001a.m71755v().m25427a(runnableC34683Nd1);
            this.f17009i = runnableC34683Nd1.m93694d();
        } else {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f17000j;
            m113272e.mo113262k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f17005e) + ")");
        }
        return this.f17009i;
    }

    @Override // p000.IC6
    /* renamed from: c */
    public IC6 mo101016c(List<C32849Fh3> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new JC6(this.f17001a, this.f17002b, EnumC41094fi1.KEEP, list, Collections.singletonList(this));
    }

    /* renamed from: d */
    public EnumC41094fi1 m101015d() {
        return this.f17003c;
    }

    /* renamed from: e */
    public List<String> m101014e() {
        return this.f17005e;
    }

    /* renamed from: f */
    public String m101013f() {
        return this.f17002b;
    }

    /* renamed from: g */
    public List<JC6> m101012g() {
        return this.f17007g;
    }

    /* renamed from: h */
    public List<? extends EG6> m101011h() {
        return this.f17004d;
    }

    /* renamed from: i */
    public C37830aD6 m101010i() {
        return this.f17001a;
    }

    /* renamed from: j */
    public boolean m101009j() {
        return m101008k(this, new HashSet());
    }

    /* renamed from: l */
    public boolean m101007l() {
        return this.f17008h;
    }

    /* renamed from: m */
    public void m101006m() {
        this.f17008h = true;
    }

    public JC6(C37830aD6 c37830aD6, String str, EnumC41094fi1 enumC41094fi1, List<? extends EG6> list) {
        this(c37830aD6, str, enumC41094fi1, list, null);
    }

    public JC6(C37830aD6 c37830aD6, String str, EnumC41094fi1 enumC41094fi1, List<? extends EG6> list, List<JC6> list2) {
        this.f17001a = c37830aD6;
        this.f17002b = str;
        this.f17003c = enumC41094fi1;
        this.f17004d = list;
        this.f17007g = list2;
        this.f17005e = new ArrayList(list.size());
        this.f17006f = new ArrayList();
        if (list2 != null) {
            for (JC6 jc6 : list2) {
                this.f17006f.addAll(jc6.f17006f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String m109260b = list.get(i).m109260b();
            this.f17005e.add(m109260b);
            this.f17006f.add(m109260b);
        }
    }
}
