package p000;

import java.util.EnumMap;
import java.util.Map;
/* renamed from: bN4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38511bN4 {

    /* renamed from: a */
    public final String f57357a;

    /* renamed from: b */
    public final byte[] f57358b;

    /* renamed from: c */
    public final int f57359c;

    /* renamed from: d */
    public C40900fN4[] f57360d;

    /* renamed from: e */
    public final EnumC7009Qx f57361e;

    /* renamed from: f */
    public Map<EnumC39715dN4, Object> f57362f;

    /* renamed from: g */
    public final long f57363g;

    public C38511bN4(String str, byte[] bArr, C40900fN4[] c40900fN4Arr, EnumC7009Qx enumC7009Qx) {
        this(str, bArr, c40900fN4Arr, enumC7009Qx, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m64622a(C40900fN4[] c40900fN4Arr) {
        C40900fN4[] c40900fN4Arr2 = this.f57360d;
        if (c40900fN4Arr2 == null) {
            this.f57360d = c40900fN4Arr;
        } else if (c40900fN4Arr != null && c40900fN4Arr.length > 0) {
            C40900fN4[] c40900fN4Arr3 = new C40900fN4[c40900fN4Arr2.length + c40900fN4Arr.length];
            System.arraycopy(c40900fN4Arr2, 0, c40900fN4Arr3, 0, c40900fN4Arr2.length);
            System.arraycopy(c40900fN4Arr, 0, c40900fN4Arr3, c40900fN4Arr2.length, c40900fN4Arr.length);
            this.f57360d = c40900fN4Arr3;
        }
    }

    /* renamed from: b */
    public EnumC7009Qx m64621b() {
        return this.f57361e;
    }

    /* renamed from: c */
    public byte[] m64620c() {
        return this.f57358b;
    }

    /* renamed from: d */
    public Map<EnumC39715dN4, Object> m64619d() {
        return this.f57362f;
    }

    /* renamed from: e */
    public C40900fN4[] m64618e() {
        return this.f57360d;
    }

    /* renamed from: f */
    public String m64617f() {
        return this.f57357a;
    }

    /* renamed from: g */
    public void m64616g(Map<EnumC39715dN4, Object> map) {
        if (map != null) {
            Map<EnumC39715dN4, Object> map2 = this.f57362f;
            if (map2 == null) {
                this.f57362f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m64615h(EnumC39715dN4 enumC39715dN4, Object obj) {
        if (this.f57362f == null) {
            this.f57362f = new EnumMap(EnumC39715dN4.class);
        }
        this.f57362f.put(enumC39715dN4, obj);
    }

    public String toString() {
        return this.f57357a;
    }

    public C38511bN4(String str, byte[] bArr, C40900fN4[] c40900fN4Arr, EnumC7009Qx enumC7009Qx, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c40900fN4Arr, enumC7009Qx, j);
    }

    public C38511bN4(String str, byte[] bArr, int i, C40900fN4[] c40900fN4Arr, EnumC7009Qx enumC7009Qx, long j) {
        this.f57357a = str;
        this.f57358b = bArr;
        this.f57359c = i;
        this.f57360d = c40900fN4Arr;
        this.f57361e = enumC7009Qx;
        this.f57362f = null;
        this.f57363g = j;
    }
}
