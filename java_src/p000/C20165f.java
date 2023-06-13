package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: f */
/* loaded from: classes6.dex */
public class C20165f {

    /* renamed from: c */
    public static final C20165f f79253c = new C20165f();

    /* renamed from: a */
    public final Map<Integer, List<InterfaceC22527h>> f79254a;

    /* renamed from: b */
    public final Map<Integer, List<InterfaceC19921e>> f79255b = new HashMap();

    /* renamed from: f$b */
    /* loaded from: classes6.dex */
    public class C20167b implements InterfaceC22527h {
        public C20167b() {
        }

        @Override // p000.InterfaceC22527h
        /* renamed from: a */
        public C20674g mo1049a(int i, int i2, byte[] bArr) {
            if (bArr.length < 2) {
                return null;
            }
            int i3 = ((bArr[1] & UByte.MAX_VALUE) << 8) | (bArr[0] & UByte.MAX_VALUE);
            List<InterfaceC19921e> list = (List) C20165f.this.f79255b.get(Integer.valueOf(i3));
            if (list == null) {
                return new C19649d(i, i2, bArr, i3);
            }
            for (InterfaceC19921e interfaceC19921e : list) {
                C19649d mo9937a = interfaceC19921e.mo9937a(i, i2, bArr, i3);
                if (mo9937a != null) {
                    return mo9937a;
                }
            }
            return new C19649d(i, i2, bArr, i3);
        }
    }

    private C20165f() {
        m42294g(76, new QE2());
        m42294g(261, new RE2());
        m42294g(410, new SE2());
        C48757sd6 c48757sd6 = new C48757sd6();
        C42411hv2 c42411hv2 = new C42411hv2();
        C35767Rt5 c35767Rt5 = new C35767Rt5();
        this.f79254a = new HashMap();
        m42295f(1, new C45305mo1());
        m42295f(2, c48757sd6);
        m42295f(3, c48757sd6);
        m42295f(4, c48757sd6);
        m42295f(5, c48757sd6);
        m42295f(6, c48757sd6);
        m42295f(7, c48757sd6);
        m42295f(8, c42411hv2);
        m42295f(9, c42411hv2);
        m42295f(10, new C52887zb6());
        m42295f(20, c48757sd6);
        m42295f(21, c48757sd6);
        m42295f(22, c35767Rt5);
        m42295f(22, new C43735k91());
        m42295f(31, c48757sd6);
        m42295f(32, c35767Rt5);
        m42295f(33, c35767Rt5);
        m42295f(KotlinVersion.MAX_COMPONENT_VALUE, new C20167b());
    }

    /* renamed from: c */
    public static C20165f m42298c() {
        return f79253c;
    }

    /* renamed from: b */
    public final C20674g m42299b(int i, int i2, byte[] bArr) {
        List<InterfaceC22527h> list = this.f79254a.get(Integer.valueOf(i2));
        if (list == null) {
            return new C20674g(i, i2, bArr);
        }
        for (InterfaceC22527h interfaceC22527h : list) {
            C20674g mo1049a = interfaceC22527h.mo1049a(i, i2, bArr);
            if (mo1049a != null) {
                return mo1049a;
            }
        }
        return new C20674g(i, i2, bArr);
    }

    /* renamed from: d */
    public List<C20674g> m42297d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return m42296e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public List<C20674g> m42296e(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= 0 && bArr.length > i) {
            int min = Math.min(i2 + i, bArr.length);
            while (i < min) {
                int i3 = bArr[i] & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i3 == 0 || (min - i) - 1 < i3) {
                    break;
                }
                arrayList.add(m42299b(i3, bArr[i + 1] & UByte.MAX_VALUE, Arrays.copyOfRange(bArr, i + 2, i + i3 + 1)));
                i += i3 + 1;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public void m42295f(int i, InterfaceC22527h interfaceC22527h) {
        if (i >= 0 && 255 >= i) {
            if (interfaceC22527h == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            List<InterfaceC22527h> list = this.f79254a.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f79254a.put(valueOf, list);
            }
            list.add(0, interfaceC22527h);
            return;
        }
        throw new IllegalArgumentException(String.format("'type' is out of the valid range: %d", Integer.valueOf(i)));
    }

    /* renamed from: g */
    public void m42294g(int i, InterfaceC19921e interfaceC19921e) {
        if (i >= 0 && 65535 >= i) {
            if (interfaceC19921e == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            List<InterfaceC19921e> list = this.f79255b.get(valueOf);
            if (list == null) {
                list = new ArrayList<>();
                this.f79255b.put(valueOf, list);
            }
            list.add(0, interfaceC19921e);
            return;
        }
        throw new IllegalArgumentException(String.format("'companyId' is out of the valid range: %d", Integer.valueOf(i)));
    }
}
