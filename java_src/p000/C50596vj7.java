package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* renamed from: vj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50596vj7 implements Iterable, InterfaceC37164Xs7, InterfaceC33159Gp7 {

    /* renamed from: b */
    public final SortedMap f114554b;

    /* renamed from: c */
    public final Map f114555c;

    public C50596vj7() {
        this.f114554b = new TreeMap();
        this.f114555c = new TreeMap();
    }

    /* renamed from: A */
    public final boolean m8227A(int i) {
        if (i >= 0 && i <= ((Integer) this.f114554b.lastKey()).intValue()) {
            return this.f114554b.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo385a(String str) {
        InterfaceC37164Xs7 interfaceC37164Xs7;
        if ("length".equals(str)) {
            return new C44105km7(Double.valueOf(m8225f()));
        }
        if (mo384b(str) && (interfaceC37164Xs7 = (InterfaceC37164Xs7) this.f114555c.get(str)) != null) {
            return interfaceC37164Xs7;
        }
        return InterfaceC37164Xs7.f44125h0;
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: b */
    public final boolean mo384b(String str) {
        if (!"length".equals(str) && !this.f114555c.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC33159Gp7
    /* renamed from: c */
    public final void mo383c(String str, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (interfaceC37164Xs7 == null) {
            this.f114555c.remove(str);
        } else {
            this.f114555c.put(str, interfaceC37164Xs7);
        }
    }

    /* renamed from: e */
    public final int m8226e() {
        return this.f114554b.size();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C50596vj7)) {
            return false;
        }
        C50596vj7 c50596vj7 = (C50596vj7) obj;
        if (m8225f() != c50596vj7.m8225f()) {
            return false;
        }
        if (this.f114554b.isEmpty()) {
            return c50596vj7.f114554b.isEmpty();
        }
        for (int intValue = ((Integer) this.f114554b.firstKey()).intValue(); intValue <= ((Integer) this.f114554b.lastKey()).intValue(); intValue++) {
            if (!m8224h(intValue).equals(c50596vj7.m8224h(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m8225f() {
        if (this.f114554b.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f114554b.lastKey()).intValue() + 1;
    }

    /* renamed from: h */
    public final InterfaceC37164Xs7 m8224h(int i) {
        InterfaceC37164Xs7 interfaceC37164Xs7;
        if (i < m8225f()) {
            if (m8227A(i) && (interfaceC37164Xs7 = (InterfaceC37164Xs7) this.f114554b.get(Integer.valueOf(i))) != null) {
                return interfaceC37164Xs7;
            }
            return InterfaceC37164Xs7.f44125h0;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final int hashCode() {
        return this.f114554b.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C32394Di7(this);
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return new C33789Jh7(this, this.f114554b.keySet().iterator(), this.f114555c.keySet().iterator());
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return C36885Wn7.m77828a(this, new C43019iw7(str), c38159am8, list);
        }
        return LD7.m97518a(str, this, c38159am8, list);
    }

    /* renamed from: s */
    public final String m8223s(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f114554b.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= m8225f()) {
                    break;
                }
                InterfaceC37164Xs7 m8224h = m8224h(i);
                sb.append(str2);
                if (!(m8224h instanceof C37200Xw7) && !(m8224h instanceof C47713qr7)) {
                    sb.append(m8224h.zzi());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return m8223s(",");
    }

    /* renamed from: u */
    public final Iterator m8222u() {
        return this.f114554b.keySet().iterator();
    }

    /* renamed from: v */
    public final List m8221v() {
        ArrayList arrayList = new ArrayList(m8225f());
        for (int i = 0; i < m8225f(); i++) {
            arrayList.add(m8224h(i));
        }
        return arrayList;
    }

    /* renamed from: w */
    public final void m8220w() {
        this.f114554b.clear();
    }

    /* renamed from: x */
    public final void m8219x(int i, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (i >= 0) {
            if (i >= m8225f()) {
                m8217z(i, interfaceC37164Xs7);
                return;
            }
            for (int intValue = ((Integer) this.f114554b.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f114554b;
                Integer valueOf = Integer.valueOf(intValue);
                InterfaceC37164Xs7 interfaceC37164Xs72 = (InterfaceC37164Xs7) sortedMap.get(valueOf);
                if (interfaceC37164Xs72 != null) {
                    m8217z(intValue + 1, interfaceC37164Xs72);
                    this.f114554b.remove(valueOf);
                }
            }
            m8217z(i, interfaceC37164Xs7);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i);
    }

    /* renamed from: y */
    public final void m8218y(int i) {
        int intValue = ((Integer) this.f114554b.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f114554b.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f114554b;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f114554b.put(valueOf, InterfaceC37164Xs7.f44125h0);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f114554b.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f114554b;
                    Integer valueOf2 = Integer.valueOf(i);
                    InterfaceC37164Xs7 interfaceC37164Xs7 = (InterfaceC37164Xs7) sortedMap2.get(valueOf2);
                    if (interfaceC37164Xs7 != null) {
                        this.f114554b.put(Integer.valueOf(i - 1), interfaceC37164Xs7);
                        this.f114554b.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: z */
    public final void m8217z(int i, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (i <= 32468) {
            if (i >= 0) {
                if (interfaceC37164Xs7 == null) {
                    this.f114554b.remove(Integer.valueOf(i));
                    return;
                } else {
                    this.f114554b.put(Integer.valueOf(i), interfaceC37164Xs7);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        throw new IllegalStateException("Array too large");
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        C50596vj7 c50596vj7 = new C50596vj7();
        for (Map.Entry entry : this.f114554b.entrySet()) {
            if (entry.getValue() instanceof InterfaceC33159Gp7) {
                c50596vj7.f114554b.put((Integer) entry.getKey(), (InterfaceC37164Xs7) entry.getValue());
            } else {
                c50596vj7.f114554b.put((Integer) entry.getKey(), ((InterfaceC37164Xs7) entry.getValue()).zzd());
            }
        }
        return c50596vj7;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        if (this.f114554b.size() == 1) {
            return m8224h(0).zzh();
        }
        if (this.f114554b.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        return m8223s(",");
    }

    public C50596vj7(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m8217z(i, (InterfaceC37164Xs7) list.get(i));
            }
        }
    }
}
