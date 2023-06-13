package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.GM2;
/* renamed from: pi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47023pi0<T extends GM2<T>> {

    /* renamed from: a */
    public final Map<Integer, T> f103957a = new HashMap();

    /* renamed from: b */
    public final Set<Integer> f103958b = new HashSet();

    /* renamed from: c */
    public InterfaceC27342b f103959c;

    /* renamed from: d */
    public boolean f103960d;

    /* renamed from: e */
    public boolean f103961e;

    /* renamed from: pi0$a */
    /* loaded from: classes6.dex */
    public class C27341a implements GM2.InterfaceC2832a<T> {
        public C27341a() {
        }

        @Override // p000.GM2.InterfaceC2832a
        /* renamed from: b */
        public void mo18934a(T t, boolean z) {
            if (z) {
                if (!C47023pi0.this.m18946g(t)) {
                    return;
                }
            } else {
                C47023pi0 c47023pi0 = C47023pi0.this;
                if (!c47023pi0.m18935r(t, c47023pi0.f103961e)) {
                    return;
                }
            }
            C47023pi0.this.m18940m();
        }
    }

    /* renamed from: pi0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC27342b {
        /* renamed from: a */
        void mo18932a(Set<Integer> set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m18948e(T t) {
        this.f103957a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m18946g(t);
        }
        t.setInternalOnCheckedChangeListener(new C27341a());
    }

    /* renamed from: f */
    public void m18947f(int i) {
        T t = this.f103957a.get(Integer.valueOf(i));
        if (t != null && m18946g(t)) {
            m18940m();
        }
    }

    /* renamed from: g */
    public final boolean m18946g(GM2<T> gm2) {
        int id = gm2.getId();
        if (this.f103958b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.f103957a.get(Integer.valueOf(m18942k()));
        if (t != null) {
            m18935r(t, false);
        }
        boolean add = this.f103958b.add(Integer.valueOf(id));
        if (!gm2.isChecked()) {
            gm2.setChecked(true);
        }
        return add;
    }

    /* renamed from: h */
    public void m18945h() {
        boolean z = !this.f103958b.isEmpty();
        for (T t : this.f103957a.values()) {
            m18935r(t, false);
        }
        if (z) {
            m18940m();
        }
    }

    /* renamed from: i */
    public Set<Integer> m18944i() {
        return new HashSet(this.f103958b);
    }

    /* renamed from: j */
    public List<Integer> m18943j(ViewGroup viewGroup) {
        Set<Integer> m18944i = m18944i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof GM2) && m18944i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int m18942k() {
        if (!this.f103960d || this.f103958b.isEmpty()) {
            return -1;
        }
        return this.f103958b.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean m18941l() {
        return this.f103960d;
    }

    /* renamed from: m */
    public final void m18940m() {
        InterfaceC27342b interfaceC27342b = this.f103959c;
        if (interfaceC27342b != null) {
            interfaceC27342b.mo18932a(m18944i());
        }
    }

    /* renamed from: n */
    public void m18939n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f103957a.remove(Integer.valueOf(t.getId()));
        this.f103958b.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: o */
    public void m18938o(InterfaceC27342b interfaceC27342b) {
        this.f103959c = interfaceC27342b;
    }

    /* renamed from: p */
    public void m18937p(boolean z) {
        this.f103961e = z;
    }

    /* renamed from: q */
    public void m18936q(boolean z) {
        if (this.f103960d != z) {
            this.f103960d = z;
            m18945h();
        }
    }

    /* renamed from: r */
    public final boolean m18935r(GM2<T> gm2, boolean z) {
        int id = gm2.getId();
        if (!this.f103958b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f103958b.size() == 1 && this.f103958b.contains(Integer.valueOf(id))) {
            gm2.setChecked(true);
            return false;
        }
        boolean remove = this.f103958b.remove(Integer.valueOf(id));
        if (gm2.isChecked()) {
            gm2.setChecked(false);
        }
        return remove;
    }
}
