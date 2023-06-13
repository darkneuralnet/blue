package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC24691j1;
/* renamed from: ch5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39292ch5 extends AbstractC24691j1 implements NN5 {

    /* renamed from: f */
    public static Comparator f61077f = new C13645a();

    /* renamed from: g */
    public static Comparator f61078g = new C13646b();

    /* renamed from: h */
    public static AbstractC24691j1.InterfaceC24692a f61079h = new C13647c();
    private static final long serialVersionUID = 259274702368956900L;

    /* renamed from: ch5$a */
    /* loaded from: classes8.dex */
    public static class C13645a implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return AbstractC24691j1.m31265d(C39292ch5.m61047s((C48772sf1) ((InterfaceC48387s00) obj).getBounds()), C39292ch5.m61047s((C48772sf1) ((InterfaceC48387s00) obj2).getBounds()));
        }
    }

    /* renamed from: ch5$b */
    /* loaded from: classes8.dex */
    public static class C13646b implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return AbstractC24691j1.m31265d(C39292ch5.m61046t((C48772sf1) ((InterfaceC48387s00) obj).getBounds()), C39292ch5.m61046t((C48772sf1) ((InterfaceC48387s00) obj2).getBounds()));
        }
    }

    /* renamed from: ch5$c */
    /* loaded from: classes8.dex */
    public static class C13647c implements AbstractC24691j1.InterfaceC24692a {
        @Override // p000.AbstractC24691j1.InterfaceC24692a
        /* renamed from: a */
        public boolean mo31253a(Object obj, Object obj2) {
            return ((C48772sf1) obj).m13887K((C48772sf1) obj2);
        }
    }

    /* renamed from: ch5$d */
    /* loaded from: classes8.dex */
    public static final class C13648d extends AbstractC10089Z0 {
        public C13648d(int i) {
            super(i);
        }

        @Override // p000.AbstractC10089Z0
        /* renamed from: b */
        public Object mo61042b() {
            C48772sf1 c48772sf1 = null;
            for (InterfaceC48387s00 interfaceC48387s00 : m73924c()) {
                if (c48772sf1 == null) {
                    c48772sf1 = new C48772sf1((C48772sf1) interfaceC48387s00.getBounds());
                } else {
                    c48772sf1.m13873l((C48772sf1) interfaceC48387s00.getBounds());
                }
            }
            return c48772sf1;
        }
    }

    public C39292ch5() {
        this(10);
    }

    /* renamed from: r */
    public static double m61048r(double d, double d2) {
        return (d + d2) / 2.0d;
    }

    /* renamed from: s */
    public static double m61047s(C48772sf1 c48772sf1) {
        return m61048r(c48772sf1.m13869p(), c48772sf1.m13871n());
    }

    /* renamed from: t */
    public static double m61046t(C48772sf1 c48772sf1) {
        return m61048r(c48772sf1.m13868q(), c48772sf1.m13870o());
    }

    @Override // p000.NN5
    /* renamed from: a */
    public void mo61052a(C48772sf1 c48772sf1, Object obj) {
        if (c48772sf1.m13886L()) {
            return;
        }
        super.m31258k(c48772sf1, obj);
    }

    @Override // p000.NN5
    /* renamed from: b */
    public List mo61051b(C48772sf1 c48772sf1) {
        return super.m31255n(c48772sf1);
    }

    @Override // p000.AbstractC24691j1
    /* renamed from: f */
    public AbstractC10089Z0 mo31263f(int i) {
        return new C13648d(i);
    }

    @Override // p000.AbstractC24691j1
    /* renamed from: g */
    public List mo31262g(List list, int i) {
        C4596Ko.m98282c(!list.isEmpty());
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f61077f);
        return m61044v(m61043w(arrayList, (int) Math.ceil(Math.sqrt((int) Math.ceil(list.size() / m31259j())))), i);
    }

    @Override // p000.AbstractC24691j1
    /* renamed from: h */
    public Comparator mo31261h() {
        return f61078g;
    }

    @Override // p000.AbstractC24691j1
    /* renamed from: i */
    public AbstractC24691j1.InterfaceC24692a mo31260i() {
        return f61079h;
    }

    /* renamed from: u */
    public List m61045u(List list, int i) {
        return super.mo31262g(list, i);
    }

    /* renamed from: v */
    public final List m61044v(List[] listArr, int i) {
        boolean z;
        if (listArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C4596Ko.m98282c(z);
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            arrayList.addAll(m61045u(list, i));
        }
        return arrayList;
    }

    /* renamed from: w */
    public List[] m61043w(List list, int i) {
        int ceil = (int) Math.ceil(list.size() / i);
        List[] listArr = new List[i];
        Iterator it = list.iterator();
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = new ArrayList();
            for (int i3 = 0; it.hasNext() && i3 < ceil; i3++) {
                listArr[i2].add((InterfaceC48387s00) it.next());
            }
        }
        return listArr;
    }

    public C39292ch5(int i) {
        super(i);
    }
}
