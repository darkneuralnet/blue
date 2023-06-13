package p000;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.InterfaceC12447ba;
/* renamed from: vm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50620vm1 {

    /* renamed from: a */
    public final X94<InterfaceC12447ba> f114595a;

    /* renamed from: b */
    public final String f114596b;

    /* renamed from: c */
    public Integer f114597c = null;

    public C50620vm1(Context context, X94<InterfaceC12447ba> x94, String str) {
        this.f114595a = x94;
        this.f114596b = str;
    }

    /* renamed from: c */
    public static List<C30405y1> m8170c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(C30405y1.m4243b(map));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m8172a(InterfaceC12447ba.C12450c c12450c) {
        this.f114595a.get().mo61204f(c12450c);
    }

    /* renamed from: b */
    public final void m8171b(List<C30405y1> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m8167f());
        int m8164i = m8164i();
        for (C30405y1 c30405y1 : list) {
            while (arrayDeque.size() >= m8164i) {
                m8162k(((InterfaceC12447ba.C12450c) arrayDeque.pollFirst()).f57702b);
            }
            InterfaceC12447ba.C12450c m4239f = c30405y1.m4239f(this.f114596b);
            m8172a(m4239f);
            arrayDeque.offer(m4239f);
        }
    }

    /* renamed from: d */
    public final boolean m8169d(List<C30405y1> list, C30405y1 c30405y1) {
        String m4242c = c30405y1.m4242c();
        String m4240e = c30405y1.m4240e();
        for (C30405y1 c30405y12 : list) {
            if (c30405y12.m4242c().equals(m4242c) && c30405y12.m4240e().equals(m4240e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public List<C30405y1> m8168e() throws AbtException {
        m8158o();
        List<InterfaceC12447ba.C12450c> m8167f = m8167f();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12447ba.C12450c c12450c : m8167f) {
            arrayList.add(C30405y1.m4244a(c12450c));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<InterfaceC12447ba.C12450c> m8167f() {
        return this.f114595a.get().mo61205e(this.f114596b, "");
    }

    /* renamed from: g */
    public final ArrayList<C30405y1> m8166g(List<C30405y1> list, List<C30405y1> list2) {
        ArrayList<C30405y1> arrayList = new ArrayList<>();
        for (C30405y1 c30405y1 : list) {
            if (!m8169d(list2, c30405y1)) {
                arrayList.add(c30405y1);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final ArrayList<InterfaceC12447ba.C12450c> m8165h(List<C30405y1> list, List<C30405y1> list2) {
        ArrayList<InterfaceC12447ba.C12450c> arrayList = new ArrayList<>();
        for (C30405y1 c30405y1 : list) {
            if (!m8169d(list2, c30405y1)) {
                arrayList.add(c30405y1.m4239f(this.f114596b));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final int m8164i() {
        if (this.f114597c == null) {
            this.f114597c = Integer.valueOf(this.f114595a.get().mo61206d(this.f114596b));
        }
        return this.f114597c.intValue();
    }

    /* renamed from: j */
    public void m8163j() throws AbtException {
        m8158o();
        m8161l(m8167f());
    }

    /* renamed from: k */
    public final void m8162k(String str) {
        this.f114595a.get().clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: l */
    public final void m8161l(Collection<InterfaceC12447ba.C12450c> collection) {
        for (InterfaceC12447ba.C12450c c12450c : collection) {
            m8162k(c12450c.f57702b);
        }
    }

    /* renamed from: m */
    public void m8160m(List<Map<String, String>> list) throws AbtException {
        m8158o();
        if (list != null) {
            m8159n(m8170c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    /* renamed from: n */
    public final void m8159n(List<C30405y1> list) throws AbtException {
        if (list.isEmpty()) {
            m8163j();
            return;
        }
        List<C30405y1> m8168e = m8168e();
        m8161l(m8165h(m8168e, list));
        m8171b(m8166g(list, m8168e));
    }

    /* renamed from: o */
    public final void m8158o() throws AbtException {
        if (this.f114595a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}
