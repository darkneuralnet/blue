package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
import com.google.android.gms.internal.places.C17536d;
import com.google.android.gms.internal.places.zzaj;
import com.google.android.gms.internal.places.zzbk;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: u38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49611u38 {

    /* renamed from: f */
    public static final C49611u38 f111632f = new C49611u38(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f111633a;

    /* renamed from: b */
    public int[] f111634b;

    /* renamed from: c */
    public Object[] f111635c;

    /* renamed from: d */
    public int f111636d;

    /* renamed from: e */
    public boolean f111637e;

    private C49611u38() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public static C49611u38 m10930b(C49611u38 c49611u38, C49611u38 c49611u382) {
        int i = c49611u38.f111633a + c49611u382.f111633a;
        int[] copyOf = Arrays.copyOf(c49611u38.f111634b, i);
        System.arraycopy(c49611u382.f111634b, 0, copyOf, c49611u38.f111633a, c49611u382.f111633a);
        Object[] copyOf2 = Arrays.copyOf(c49611u38.f111635c, i);
        System.arraycopy(c49611u382.f111635c, 0, copyOf2, c49611u38.f111633a, c49611u382.f111633a);
        return new C49611u38(i, copyOf, copyOf2, true);
    }

    /* renamed from: g */
    public static void m10925g(int i, Object obj, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            interfaceC43393ja8.mo15216K(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzbk.m51035d());
                    } else if (interfaceC43393ja8.mo15206U() == AbstractC17530c.C17534d.f71164l) {
                        interfaceC43393ja8.mo15221F(i2);
                        ((C49611u38) obj).m10924h(interfaceC43393ja8);
                        interfaceC43393ja8.mo15220G(i2);
                        return;
                    } else {
                        interfaceC43393ja8.mo15220G(i2);
                        ((C49611u38) obj).m10924h(interfaceC43393ja8);
                        interfaceC43393ja8.mo15221F(i2);
                        return;
                    }
                }
                interfaceC43393ja8.mo15208S(i2, (AbstractC43604jv9) obj);
                return;
            }
            interfaceC43393ja8.mo15224B(i2, ((Long) obj).longValue());
            return;
        }
        interfaceC43393ja8.mo15223C(i2, ((Long) obj).longValue());
    }

    /* renamed from: i */
    public static C49611u38 m10923i() {
        return f111632f;
    }

    /* renamed from: j */
    public static C49611u38 m10922j() {
        return new C49611u38();
    }

    /* renamed from: a */
    public final void m10931a() {
        this.f111637e = false;
    }

    /* renamed from: c */
    public final void m10929c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f111633a; i2++) {
            C17536d.m51211b(sb, i, String.valueOf(this.f111634b[i2] >>> 3), this.f111635c[i2]);
        }
    }

    /* renamed from: d */
    public final void m10928d(InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        if (interfaceC43393ja8.mo15206U() == AbstractC17530c.C17534d.f71165m) {
            for (int i = this.f111633a - 1; i >= 0; i--) {
                interfaceC43393ja8.mo15217J(this.f111634b[i] >>> 3, this.f111635c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f111633a; i2++) {
            interfaceC43393ja8.mo15217J(this.f111634b[i2] >>> 3, this.f111635c[i2]);
        }
    }

    /* renamed from: e */
    public final int m10927e() {
        int m51103X;
        int i = this.f111636d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f111633a; i3++) {
            int i4 = this.f111634b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                m51103X = zzaj.m51083m0(i5, ((Integer) this.f111635c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzbk.m51035d());
                            }
                        } else {
                            m51103X = (zzaj.m51070v0(i5) << 1) + ((C49611u38) this.f111635c[i3]).m10927e();
                        }
                    } else {
                        m51103X = zzaj.m51114H(i5, (AbstractC43604jv9) this.f111635c[i3]);
                    }
                } else {
                    m51103X = zzaj.m51094e0(i5, ((Long) this.f111635c[i3]).longValue());
                }
            } else {
                m51103X = zzaj.m51103X(i5, ((Long) this.f111635c[i3]).longValue());
            }
            i2 += m51103X;
        }
        this.f111636d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C49611u38)) {
            return false;
        }
        C49611u38 c49611u38 = (C49611u38) obj;
        int i = this.f111633a;
        if (i == c49611u38.f111633a) {
            int[] iArr = this.f111634b;
            int[] iArr2 = c49611u38.f111634b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.f111635c;
                Object[] objArr2 = c49611u38.f111635c;
                int i3 = this.f111633a;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m10926f(int i, Object obj) {
        int i2;
        if (this.f111637e) {
            int i3 = this.f111633a;
            int[] iArr = this.f111634b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f111634b = Arrays.copyOf(iArr, i4);
                this.f111635c = Arrays.copyOf(this.f111635c, i4);
            }
            int[] iArr2 = this.f111634b;
            int i5 = this.f111633a;
            iArr2[i5] = i;
            this.f111635c[i5] = obj;
            this.f111633a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final void m10924h(InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        if (this.f111633a == 0) {
            return;
        }
        if (interfaceC43393ja8.mo15206U() == AbstractC17530c.C17534d.f71164l) {
            for (int i = 0; i < this.f111633a; i++) {
                m10925g(this.f111634b[i], this.f111635c[i], interfaceC43393ja8);
            }
            return;
        }
        for (int i2 = this.f111633a - 1; i2 >= 0; i2--) {
            m10925g(this.f111634b[i2], this.f111635c[i2], interfaceC43393ja8);
        }
    }

    public final int hashCode() {
        int i = this.f111633a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f111634b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f111635c;
        int i7 = this.f111633a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: k */
    public final int m10921k() {
        int i = this.f111636d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f111633a; i3++) {
            i2 += zzaj.m51105T(this.f111634b[i3] >>> 3, (AbstractC43604jv9) this.f111635c[i3]);
        }
        this.f111636d = i2;
        return i2;
    }

    public C49611u38(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f111636d = -1;
        this.f111633a = i;
        this.f111634b = iArr;
        this.f111635c = objArr;
        this.f111637e = z;
    }
}
