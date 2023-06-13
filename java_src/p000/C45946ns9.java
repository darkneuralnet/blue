package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: ns9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45946ns9 {

    /* renamed from: a */
    public String f100967a;

    /* renamed from: b */
    public boolean f100968b;

    /* renamed from: c */
    public C34789No8 f100969c;

    /* renamed from: d */
    public BitSet f100970d;

    /* renamed from: e */
    public BitSet f100971e;

    /* renamed from: f */
    public Map f100972f;

    /* renamed from: g */
    public Map f100973g;

    /* renamed from: h */
    public final /* synthetic */ C32835Ff7 f100974h;

    public /* synthetic */ C45946ns9(C32835Ff7 c32835Ff7, String str, Jq9 jq9) {
        this.f100974h = c32835Ff7;
        this.f100967a = str;
        this.f100968b = true;
        this.f100970d = new BitSet();
        this.f100971e = new BitSet();
        this.f100972f = new C28385so();
        this.f100973g = new C28385so();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m22253b(C45946ns9 c45946ns9) {
        return c45946ns9.f100970d;
    }

    /* renamed from: a */
    public final C47041pj8 m22254a(int i) {
        ArrayList arrayList;
        List list;
        C38722bj8 m18889C = C47041pj8.m18889C();
        m18889C.m64062y(i);
        m18889C.m64064A(this.f100968b);
        C34789No8 c34789No8 = this.f100969c;
        if (c34789No8 != null) {
            m18889C.m64063B(c34789No8);
        }
        C31981Bo8 m93382F = C34789No8.m93382F();
        m93382F.m113458z(DV8.m110337H(this.f100970d));
        m93382F.m113464B(DV8.m110337H(this.f100971e));
        Map map = this.f100972f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f100972f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f100972f.get(Integer.valueOf(intValue));
                if (l != null) {
                    C32170Cj8 m88115D = C35446Qj8.m88115D();
                    m88115D.m111767z(intValue);
                    m88115D.m111768y(l.longValue());
                    arrayList2.add((C35446Qj8) m88115D.m81476q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m93382F.m113459y(arrayList);
        }
        Map map2 = this.f100973g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f100973g.keySet()) {
                C38189ap8 m24877E = C45322mp8.m24877E();
                m24877E.m65444z(num2.intValue());
                List list2 = (List) this.f100973g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m24877E.m65445y(list2);
                }
                arrayList3.add((C45322mp8) m24877E.m81476q());
            }
            list = arrayList3;
        }
        m93382F.m113465A(list);
        m18889C.m64061z(m93382F);
        return (C47041pj8) m18889C.m81476q();
    }

    /* renamed from: c */
    public final void m22252c(AbstractC52517yx9 abstractC52517yx9) {
        int mo2182a = abstractC52517yx9.mo2182a();
        Boolean bool = abstractC52517yx9.f120453c;
        if (bool != null) {
            BitSet bitSet = this.f100971e;
            bool.booleanValue();
            bitSet.set(mo2182a, true);
        }
        Boolean bool2 = abstractC52517yx9.f120454d;
        if (bool2 != null) {
            this.f100970d.set(mo2182a, bool2.booleanValue());
        }
        if (abstractC52517yx9.f120455e != null) {
            Map map = this.f100972f;
            Integer valueOf = Integer.valueOf(mo2182a);
            Long l = (Long) map.get(valueOf);
            long longValue = abstractC52517yx9.f120455e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f100972f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC52517yx9.f120456f != null) {
            Map map2 = this.f100973g;
            Integer valueOf2 = Integer.valueOf(mo2182a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f100973g.put(valueOf2, list);
            }
            if (abstractC52517yx9.mo2180c()) {
                list.clear();
            }
            Bc9.m113800b();
            C41723gl7 m89751w = this.f100974h.f100966a.m89751w();
            String str = this.f100967a;
            L88 l88 = C37795a98.f49960a0;
            if (m89751w.m37502y(str, l88) && abstractC52517yx9.mo2181b()) {
                list.clear();
            }
            Bc9.m113800b();
            if (this.f100974h.f100966a.m89751w().m37502y(this.f100967a, l88)) {
                Long valueOf3 = Long.valueOf(abstractC52517yx9.f120456f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC52517yx9.f120456f.longValue() / 1000));
        }
    }

    public /* synthetic */ C45946ns9(C32835Ff7 c32835Ff7, String str, C34789No8 c34789No8, BitSet bitSet, BitSet bitSet2, Map map, Map map2, Jq9 jq9) {
        this.f100974h = c32835Ff7;
        this.f100967a = str;
        this.f100970d = bitSet;
        this.f100971e = bitSet2;
        this.f100972f = map;
        this.f100973g = new C28385so();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f100973g.put(num, arrayList);
        }
        this.f100968b = false;
        this.f100969c = c34789No8;
    }
}
