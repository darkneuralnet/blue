package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import p000.C32813Fd3;
import p000.C35458Ql2;
import p000.C49144tH1;
/* renamed from: wv */
/* loaded from: classes8.dex */
public final class C29993wv implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C44797lw6 f116813b;

    /* renamed from: c */
    public final int f116814c;

    /* renamed from: d */
    public final List<C30771yv> f116815d;

    /* renamed from: e */
    public int f116816e;

    /* renamed from: f */
    public OH6 f116817f;

    /* renamed from: g */
    public List<OH6> f116818g;

    /* renamed from: h */
    public Map<Integer, LinkedList<OH6>> f116819h;

    /* renamed from: i */
    public Stack<OH6> f116820i;

    /* renamed from: j */
    public Map<Integer, OH6> f116821j;

    /* renamed from: k */
    public int f116822k;

    /* renamed from: l */
    public boolean f116823l;

    /* renamed from: m */
    public transient int f116824m;

    public C29993wv(C29993wv c29993wv) {
        this.f116813b = new C44797lw6(c29993wv.f116813b.m26614d());
        this.f116814c = c29993wv.f116814c;
        this.f116816e = c29993wv.f116816e;
        this.f116817f = c29993wv.f116817f;
        ArrayList arrayList = new ArrayList();
        this.f116818g = arrayList;
        arrayList.addAll(c29993wv.f116818g);
        this.f116819h = new TreeMap();
        for (Integer num : c29993wv.f116819h.keySet()) {
            this.f116819h.put(num, (LinkedList) c29993wv.f116819h.get(num).clone());
        }
        Stack<OH6> stack = new Stack<>();
        this.f116820i = stack;
        stack.addAll(c29993wv.f116820i);
        this.f116815d = new ArrayList();
        for (C30771yv c30771yv : c29993wv.f116815d) {
            this.f116815d.add(c30771yv.clone());
        }
        this.f116821j = new TreeMap(c29993wv.f116821j);
        this.f116822k = c29993wv.f116822k;
        this.f116824m = c29993wv.f116824m;
        this.f116823l = c29993wv.f116823l;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f116824m = objectInputStream.available() != 0 ? objectInputStream.readInt() : (1 << this.f116814c) - 1;
        int i = this.f116824m;
        if (i > (1 << this.f116814c) - 1 || this.f116822k > i + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f116824m);
    }

    /* renamed from: a */
    public final C30771yv m6113a() {
        C30771yv c30771yv = null;
        for (C30771yv c30771yv2 : this.f116815d) {
            if (!c30771yv2.m2294j() && c30771yv2.m2293k() && (c30771yv == null || c30771yv2.m2298e() < c30771yv.m2298e() || (c30771yv2.m2298e() == c30771yv.m2298e() && c30771yv2.m2297f() < c30771yv.m2297f()))) {
                c30771yv = c30771yv2;
            }
        }
        return c30771yv;
    }

    /* renamed from: b */
    public int m6112b() {
        return this.f116822k;
    }

    /* renamed from: c */
    public int m6111c() {
        return this.f116824m;
    }

    /* renamed from: d */
    public C29993wv m6110d(byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        return new C29993wv(this, bArr, bArr2, c32813Fd3);
    }

    /* renamed from: e */
    public final void m6109e(byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        if (c32813Fd3 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        C35458Ql2 c35458Ql2 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m88080l();
        C49144tH1 c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m12541k();
        for (int i = 0; i < (1 << this.f116814c); i++) {
            c32813Fd3 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(i).m106841n(c32813Fd3.m106849e()).m106840o(c32813Fd3.m106848f()).m112394f(c32813Fd3.m112401a()).m106843l();
            C44797lw6 c44797lw6 = this.f116813b;
            c44797lw6.m26610h(c44797lw6.m26611g(bArr2, c32813Fd3), bArr);
            C46576ow6 m26613e = this.f116813b.m26613e(c32813Fd3);
            c35458Ql2 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql2.m112400b()).m112392h(c35458Ql2.m112399c()).m88078n(i).m88077o(c35458Ql2.m88085f()).m88076p(c35458Ql2.m88084g()).m112394f(c35458Ql2.m112401a()).m88080l();
            OH6 m90508a = PH6.m90508a(this.f116813b, m26613e, c35458Ql2);
            c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12538n(i).m112394f(c49144tH1.m112401a()).m12541k();
            while (!this.f116820i.isEmpty() && this.f116820i.peek().m92565a() == m90508a.m92565a()) {
                int m92565a = i / (1 << m90508a.m92565a());
                if (m92565a == 1) {
                    this.f116818g.add(m90508a);
                }
                if (m92565a == 3 && m90508a.m92565a() < this.f116814c - this.f116816e) {
                    this.f116815d.get(m90508a.m92565a()).m2292l(m90508a);
                }
                if (m92565a >= 3 && (m92565a & 1) == 1 && m90508a.m92565a() >= this.f116814c - this.f116816e && m90508a.m92565a() <= this.f116814c - 2) {
                    if (this.f116819h.get(Integer.valueOf(m90508a.m92565a())) == null) {
                        LinkedList<OH6> linkedList = new LinkedList<>();
                        linkedList.add(m90508a);
                        this.f116819h.put(Integer.valueOf(m90508a.m92565a()), linkedList);
                    } else {
                        this.f116819h.get(Integer.valueOf(m90508a.m92565a())).add(m90508a);
                    }
                }
                C49144tH1 c49144tH12 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12539m(c49144tH1.m12546e()).m12538n((c49144tH1.m12545f() - 1) / 2).m112394f(c49144tH1.m112401a()).m12541k();
                OH6 m90507b = PH6.m90507b(this.f116813b, this.f116820i.pop(), m90508a, c49144tH12);
                OH6 oh6 = new OH6(m90507b.m92565a() + 1, m90507b.m92564b());
                c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH12.m112400b()).m112392h(c49144tH12.m112399c()).m12539m(c49144tH12.m12546e() + 1).m12538n(c49144tH12.m12545f()).m112394f(c49144tH12.m112401a()).m12541k();
                m90508a = oh6;
            }
            this.f116820i.push(m90508a);
        }
        this.f116817f = this.f116820i.pop();
    }

    /* renamed from: f */
    public final void m6108f(byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        List<OH6> list;
        OH6 removeFirst;
        if (c32813Fd3 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f116823l) {
            throw new IllegalStateException("index already used");
        }
        int i = this.f116822k;
        if (i > this.f116824m - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int m78620b = WH6.m78620b(i, this.f116814c);
        if (((this.f116822k >> (m78620b + 1)) & 1) == 0 && m78620b < this.f116814c - 1) {
            this.f116821j.put(Integer.valueOf(m78620b), this.f116818g.get(m78620b));
        }
        C35458Ql2 c35458Ql2 = (C35458Ql2) new C35458Ql2.C6861b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m88080l();
        C49144tH1 c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m12541k();
        if (m78620b == 0) {
            c32813Fd3 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(this.f116822k).m106841n(c32813Fd3.m106849e()).m106840o(c32813Fd3.m106848f()).m112394f(c32813Fd3.m112401a()).m106843l();
            C44797lw6 c44797lw6 = this.f116813b;
            c44797lw6.m26610h(c44797lw6.m26611g(bArr2, c32813Fd3), bArr);
            this.f116818g.set(0, PH6.m90508a(this.f116813b, this.f116813b.m26613e(c32813Fd3), (C35458Ql2) new C35458Ql2.C6861b().m112393g(c35458Ql2.m112400b()).m112392h(c35458Ql2.m112399c()).m88078n(this.f116822k).m88077o(c35458Ql2.m88085f()).m88076p(c35458Ql2.m88084g()).m112394f(c35458Ql2.m112401a()).m88080l()));
        } else {
            int i2 = m78620b - 1;
            C44797lw6 c44797lw62 = this.f116813b;
            c44797lw62.m26610h(c44797lw62.m26611g(bArr2, c32813Fd3), bArr);
            OH6 m90507b = PH6.m90507b(this.f116813b, this.f116818g.get(i2), this.f116821j.get(Integer.valueOf(i2)), (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12539m(i2).m12538n(this.f116822k >> m78620b).m112394f(c49144tH1.m112401a()).m12541k());
            this.f116818g.set(m78620b, new OH6(m90507b.m92565a() + 1, m90507b.m92564b()));
            this.f116821j.remove(Integer.valueOf(i2));
            for (int i3 = 0; i3 < m78620b; i3++) {
                if (i3 < this.f116814c - this.f116816e) {
                    list = this.f116818g;
                    removeFirst = this.f116815d.get(i3).m2296g();
                } else {
                    list = this.f116818g;
                    removeFirst = this.f116819h.get(Integer.valueOf(i3)).removeFirst();
                }
                list.set(i3, removeFirst);
            }
            int min = Math.min(m78620b, this.f116814c - this.f116816e);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = this.f116822k + 1 + ((1 << i4) * 3);
                if (i5 < (1 << this.f116814c)) {
                    this.f116815d.get(i4).m2295h(i5);
                }
            }
        }
        for (int i6 = 0; i6 < ((this.f116814c - this.f116816e) >> 1); i6++) {
            C30771yv m6113a = m6113a();
            if (m6113a != null) {
                m6113a.m2291m(this.f116820i, this.f116813b, bArr, bArr2, c32813Fd3);
            }
        }
        this.f116822k++;
    }

    /* renamed from: g */
    public final void m6107g() {
        if (this.f116818g == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f116819h == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f116820i == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f116815d == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f116821j == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!WH6.m78610l(this.f116814c, this.f116822k)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    /* renamed from: h */
    public C29993wv m6106h(C5448N c5448n) {
        return new C29993wv(this, c5448n);
    }

    public C29993wv(C29993wv c29993wv, C5448N c5448n) {
        this.f116813b = new C44797lw6(new C45983nw6(c5448n));
        this.f116814c = c29993wv.f116814c;
        this.f116816e = c29993wv.f116816e;
        this.f116817f = c29993wv.f116817f;
        ArrayList arrayList = new ArrayList();
        this.f116818g = arrayList;
        arrayList.addAll(c29993wv.f116818g);
        this.f116819h = new TreeMap();
        for (Integer num : c29993wv.f116819h.keySet()) {
            this.f116819h.put(num, (LinkedList) c29993wv.f116819h.get(num).clone());
        }
        Stack<OH6> stack = new Stack<>();
        this.f116820i = stack;
        stack.addAll(c29993wv.f116820i);
        this.f116815d = new ArrayList();
        for (C30771yv c30771yv : c29993wv.f116815d) {
            this.f116815d.add(c30771yv.clone());
        }
        this.f116821j = new TreeMap(c29993wv.f116821j);
        this.f116822k = c29993wv.f116822k;
        this.f116824m = c29993wv.f116824m;
        this.f116823l = c29993wv.f116823l;
        m6107g();
    }

    public C29993wv(C29993wv c29993wv, byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        this.f116813b = new C44797lw6(c29993wv.f116813b.m26614d());
        this.f116814c = c29993wv.f116814c;
        this.f116816e = c29993wv.f116816e;
        this.f116817f = c29993wv.f116817f;
        ArrayList arrayList = new ArrayList();
        this.f116818g = arrayList;
        arrayList.addAll(c29993wv.f116818g);
        this.f116819h = new TreeMap();
        for (Integer num : c29993wv.f116819h.keySet()) {
            this.f116819h.put(num, (LinkedList) c29993wv.f116819h.get(num).clone());
        }
        Stack<OH6> stack = new Stack<>();
        this.f116820i = stack;
        stack.addAll(c29993wv.f116820i);
        this.f116815d = new ArrayList();
        for (C30771yv c30771yv : c29993wv.f116815d) {
            this.f116815d.add(c30771yv.clone());
        }
        this.f116821j = new TreeMap(c29993wv.f116821j);
        this.f116822k = c29993wv.f116822k;
        this.f116824m = c29993wv.f116824m;
        this.f116823l = false;
        m6108f(bArr, bArr2, c32813Fd3);
    }

    public C29993wv(C44797lw6 c44797lw6, int i, int i2, int i3) {
        this.f116813b = c44797lw6;
        this.f116814c = i;
        this.f116824m = i3;
        this.f116816e = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f116818g = new ArrayList();
                this.f116819h = new TreeMap();
                this.f116820i = new Stack<>();
                this.f116815d = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f116815d.add(new C30771yv(i5));
                }
                this.f116821j = new TreeMap();
                this.f116822k = 0;
                this.f116823l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public C29993wv(RH6 rh6, int i, int i2) {
        this(rh6.m86981i(), rh6.m86988b(), rh6.m86987c(), i2);
        this.f116824m = i;
        this.f116822k = i2;
        this.f116823l = true;
    }

    public C29993wv(RH6 rh6, byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        this(rh6.m86981i(), rh6.m86988b(), rh6.m86987c(), (1 << rh6.m86988b()) - 1);
        m6109e(bArr, bArr2, c32813Fd3);
    }

    public C29993wv(RH6 rh6, byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3, int i) {
        this(rh6.m86981i(), rh6.m86988b(), rh6.m86987c(), (1 << rh6.m86988b()) - 1);
        m6109e(bArr, bArr2, c32813Fd3);
        while (this.f116822k < i) {
            m6108f(bArr, bArr2, c32813Fd3);
            this.f116823l = false;
        }
    }
}
