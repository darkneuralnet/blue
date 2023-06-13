package p000;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
/* renamed from: TS0 */
/* loaded from: classes5.dex */
public abstract class TS0<T extends Entry> extends AbstractC30437yA<T> {

    /* renamed from: s */
    public List<T> f35475s;

    /* renamed from: t */
    public float f35476t;

    /* renamed from: u */
    public float f35477u;

    /* renamed from: v */
    public float f35478v;

    /* renamed from: w */
    public float f35479w;

    /* renamed from: TS0$a */
    /* loaded from: classes5.dex */
    public enum EnumC7851a {
        UP,
        DOWN,
        CLOSEST
    }

    public TS0(List<T> list, String str) {
        super(str);
        this.f35476t = -3.4028235E38f;
        this.f35477u = Float.MAX_VALUE;
        this.f35478v = -3.4028235E38f;
        this.f35479w = Float.MAX_VALUE;
        this.f35475s = list;
        if (list == null) {
            this.f35475s = new ArrayList();
        }
        m83598T0();
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: A */
    public float mo21244A() {
        return this.f35479w;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: D0 */
    public T mo21243D0(float f, float f2, EnumC7851a enumC7851a) {
        int m83595X0 = m83595X0(f, f2, enumC7851a);
        if (m83595X0 > -1) {
            return this.f35475s.get(m83595X0);
        }
        return null;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: K */
    public float mo21242K() {
        return this.f35478v;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: L0 */
    public int mo21241L0() {
        return this.f35475s.size();
    }

    /* renamed from: T0 */
    public void m83598T0() {
        List<T> list = this.f35475s;
        if (list != null && !list.isEmpty()) {
            this.f35476t = -3.4028235E38f;
            this.f35477u = Float.MAX_VALUE;
            this.f35478v = -3.4028235E38f;
            this.f35479w = Float.MAX_VALUE;
            for (T t : this.f35475s) {
                mo9449U0(t);
            }
        }
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: U */
    public float mo21240U() {
        return this.f35476t;
    }

    /* renamed from: U0 */
    public void mo9449U0(T t) {
        if (t == null) {
            return;
        }
        m83597V0(t);
        m83596W0(t);
    }

    /* renamed from: V0 */
    public void m83597V0(T t) {
        if (t.mo51930g() < this.f35479w) {
            this.f35479w = t.mo51930g();
        }
        if (t.mo51930g() > this.f35478v) {
            this.f35478v = t.mo51930g();
        }
    }

    /* renamed from: W0 */
    public void m83596W0(T t) {
        if (t.mo51938c() < this.f35477u) {
            this.f35477u = t.mo51938c();
        }
        if (t.mo51938c() > this.f35476t) {
            this.f35476t = t.mo51938c();
        }
    }

    /* renamed from: X0 */
    public int m83595X0(float f, float f2, EnumC7851a enumC7851a) {
        int i;
        T t;
        List<T> list = this.f35475s;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.f35475s.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float mo51930g = this.f35475s.get(i3).mo51930g() - f;
            int i4 = i3 + 1;
            float abs = Math.abs(mo51930g);
            float abs2 = Math.abs(this.f35475s.get(i4).mo51930g() - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = mo51930g;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size != -1) {
            float mo51930g2 = this.f35475s.get(size).mo51930g();
            if (enumC7851a == EnumC7851a.UP) {
                if (mo51930g2 < f && size < this.f35475s.size() - 1) {
                    size++;
                }
            } else if (enumC7851a == EnumC7851a.DOWN && mo51930g2 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && this.f35475s.get(size - 1).mo51930g() == mo51930g2) {
                    size--;
                }
                float mo51938c = this.f35475s.get(size).mo51938c();
                loop2: while (true) {
                    i = size;
                    do {
                        size++;
                        if (size >= this.f35475s.size()) {
                            break loop2;
                        }
                        t = this.f35475s.get(size);
                        if (t.mo51930g() != mo51930g2) {
                            break loop2;
                        }
                    } while (Math.abs(t.mo51938c() - f2) >= Math.abs(mo51938c - f2));
                    mo51938c = f2;
                }
                return i;
            }
            return size;
        }
        return size;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: Y */
    public float mo21239Y() {
        return this.f35477u;
    }

    /* renamed from: Y0 */
    public String m83594Y0() {
        String label;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        if (getLabel() == null) {
            label = "";
        } else {
            label = getLabel();
        }
        sb.append(label);
        sb.append(", entries: ");
        sb.append(this.f35475s.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: b */
    public int mo21238b(Entry entry) {
        return this.f35475s.indexOf(entry);
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: h */
    public T mo21237h(int i) {
        return this.f35475s.get(i);
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: p */
    public void mo21236p(float f, float f2) {
        List<T> list = this.f35475s;
        if (list != null && !list.isEmpty()) {
            this.f35476t = -3.4028235E38f;
            this.f35477u = Float.MAX_VALUE;
            int m83595X0 = m83595X0(f2, Float.NaN, EnumC7851a.UP);
            for (int m83595X02 = m83595X0(f, Float.NaN, EnumC7851a.DOWN); m83595X02 <= m83595X0; m83595X02++) {
                m83596W0(this.f35475s.get(m83595X02));
            }
        }
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: p0 */
    public T mo21235p0(float f, float f2) {
        return mo21243D0(f, f2, EnumC7851a.CLOSEST);
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: q */
    public List<T> mo21234q(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.f35475s.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            T t = this.f35475s.get(i2);
            if (f == t.mo51930g()) {
                while (i2 > 0 && this.f35475s.get(i2 - 1).mo51930g() == f) {
                    i2--;
                }
                int size2 = this.f35475s.size();
                while (i2 < size2) {
                    T t2 = this.f35475s.get(i2);
                    if (t2.mo51930g() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
            } else if (f > t.mo51930g()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m83594Y0());
        for (int i = 0; i < this.f35475s.size(); i++) {
            stringBuffer.append(this.f35475s.get(i).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
