package p000;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p000.C37875aI6;
import p000.InterfaceC46243oO1;
/* renamed from: ii0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42872ii0<T extends InterfaceC46243oO1<? extends Entry>> {

    /* renamed from: a */
    public float f87766a;

    /* renamed from: b */
    public float f87767b;

    /* renamed from: c */
    public float f87768c;

    /* renamed from: d */
    public float f87769d;

    /* renamed from: e */
    public float f87770e;

    /* renamed from: f */
    public float f87771f;

    /* renamed from: g */
    public float f87772g;

    /* renamed from: h */
    public float f87773h;

    /* renamed from: i */
    public List<T> f87774i;

    public AbstractC42872ii0() {
        this.f87766a = -3.4028235E38f;
        this.f87767b = Float.MAX_VALUE;
        this.f87768c = -3.4028235E38f;
        this.f87769d = Float.MAX_VALUE;
        this.f87770e = -3.4028235E38f;
        this.f87771f = Float.MAX_VALUE;
        this.f87772g = -3.4028235E38f;
        this.f87773h = Float.MAX_VALUE;
        this.f87774i = new ArrayList();
    }

    /* renamed from: a */
    public void mo33556a() {
        List<T> list = this.f87774i;
        if (list == null) {
            return;
        }
        this.f87766a = -3.4028235E38f;
        this.f87767b = Float.MAX_VALUE;
        this.f87768c = -3.4028235E38f;
        this.f87769d = Float.MAX_VALUE;
        for (T t : list) {
            m33555b(t);
        }
        this.f87770e = -3.4028235E38f;
        this.f87771f = Float.MAX_VALUE;
        this.f87772g = -3.4028235E38f;
        this.f87773h = Float.MAX_VALUE;
        T m33550i = m33550i(this.f87774i);
        if (m33550i != null) {
            this.f87770e = m33550i.mo21240U();
            this.f87771f = m33550i.mo21239Y();
            for (T t2 : this.f87774i) {
                if (t2.mo4013j0() == C37875aI6.EnumC10624a.LEFT) {
                    if (t2.mo21239Y() < this.f87771f) {
                        this.f87771f = t2.mo21239Y();
                    }
                    if (t2.mo21240U() > this.f87770e) {
                        this.f87770e = t2.mo21240U();
                    }
                }
            }
        }
        T m33549j = m33549j(this.f87774i);
        if (m33549j != null) {
            this.f87772g = m33549j.mo21240U();
            this.f87773h = m33549j.mo21239Y();
            for (T t3 : this.f87774i) {
                if (t3.mo4013j0() == C37875aI6.EnumC10624a.RIGHT) {
                    if (t3.mo21239Y() < this.f87773h) {
                        this.f87773h = t3.mo21239Y();
                    }
                    if (t3.mo21240U() > this.f87772g) {
                        this.f87772g = t3.mo21240U();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m33555b(T t) {
        if (this.f87766a < t.mo21240U()) {
            this.f87766a = t.mo21240U();
        }
        if (this.f87767b > t.mo21239Y()) {
            this.f87767b = t.mo21239Y();
        }
        if (this.f87768c < t.mo21242K()) {
            this.f87768c = t.mo21242K();
        }
        if (this.f87769d > t.mo21244A()) {
            this.f87769d = t.mo21244A();
        }
        if (t.mo4013j0() == C37875aI6.EnumC10624a.LEFT) {
            if (this.f87770e < t.mo21240U()) {
                this.f87770e = t.mo21240U();
            }
            if (this.f87771f > t.mo21239Y()) {
                this.f87771f = t.mo21239Y();
                return;
            }
            return;
        }
        if (this.f87772g < t.mo21240U()) {
            this.f87772g = t.mo21240U();
        }
        if (this.f87773h > t.mo21239Y()) {
            this.f87773h = t.mo21239Y();
        }
    }

    /* renamed from: c */
    public void m33554c(float f, float f2) {
        for (T t : this.f87774i) {
            t.mo21236p(f, f2);
        }
        mo33556a();
    }

    /* renamed from: d */
    public T mo17499d(int i) {
        List<T> list = this.f87774i;
        if (list != null && i >= 0 && i < list.size()) {
            return this.f87774i.get(i);
        }
        return null;
    }

    /* renamed from: e */
    public int m33553e() {
        List<T> list = this.f87774i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public List<T> m33552f() {
        return this.f87774i;
    }

    /* renamed from: g */
    public int m33551g() {
        int i = 0;
        for (T t : this.f87774i) {
            i += t.mo21241L0();
        }
        return i;
    }

    /* renamed from: h */
    public Entry mo17498h(OM1 om1) {
        if (om1.m92391d() >= this.f87774i.size()) {
            return null;
        }
        return this.f87774i.get(om1.m92391d()).mo21235p0(om1.m92387h(), om1.m92385j());
    }

    /* renamed from: i */
    public T m33550i(List<T> list) {
        for (T t : list) {
            if (t.mo4013j0() == C37875aI6.EnumC10624a.LEFT) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: j */
    public T m33549j(List<T> list) {
        for (T t : list) {
            if (t.mo4013j0() == C37875aI6.EnumC10624a.RIGHT) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: k */
    public T m33548k() {
        List<T> list = this.f87774i;
        if (list != null && !list.isEmpty()) {
            T t = this.f87774i.get(0);
            for (T t2 : this.f87774i) {
                if (t2.mo21241L0() > t.mo21241L0()) {
                    t = t2;
                }
            }
            return t;
        }
        return null;
    }

    /* renamed from: l */
    public float m33547l() {
        return this.f87768c;
    }

    /* renamed from: m */
    public float m33546m() {
        return this.f87769d;
    }

    /* renamed from: n */
    public float m33545n() {
        return this.f87766a;
    }

    /* renamed from: o */
    public float m33544o(C37875aI6.EnumC10624a enumC10624a) {
        if (enumC10624a == C37875aI6.EnumC10624a.LEFT) {
            float f = this.f87770e;
            if (f == -3.4028235E38f) {
                return this.f87772g;
            }
            return f;
        }
        float f2 = this.f87772g;
        if (f2 == -3.4028235E38f) {
            return this.f87770e;
        }
        return f2;
    }

    /* renamed from: p */
    public float m33543p() {
        return this.f87767b;
    }

    /* renamed from: q */
    public float m33542q(C37875aI6.EnumC10624a enumC10624a) {
        if (enumC10624a == C37875aI6.EnumC10624a.LEFT) {
            float f = this.f87771f;
            if (f == Float.MAX_VALUE) {
                return this.f87773h;
            }
            return f;
        }
        float f2 = this.f87773h;
        if (f2 == Float.MAX_VALUE) {
            return this.f87771f;
        }
        return f2;
    }

    /* renamed from: r */
    public void mo33541r() {
        mo33556a();
    }

    public AbstractC42872ii0(List<T> list) {
        this.f87766a = -3.4028235E38f;
        this.f87767b = Float.MAX_VALUE;
        this.f87768c = -3.4028235E38f;
        this.f87769d = Float.MAX_VALUE;
        this.f87770e = -3.4028235E38f;
        this.f87771f = Float.MAX_VALUE;
        this.f87772g = -3.4028235E38f;
        this.f87773h = Float.MAX_VALUE;
        this.f87774i = list;
        mo33541r();
    }
}
