package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p000.InterfaceC49099tC1;
/* renamed from: tO5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49211tO5 implements InterfaceC49099tC1 {

    /* renamed from: u */
    public static final String f110400u = "tO5";

    /* renamed from: a */
    public int[] f110401a;

    /* renamed from: b */
    public final int[] f110402b;

    /* renamed from: c */
    public final InterfaceC49099tC1.InterfaceC28552a f110403c;

    /* renamed from: d */
    public ByteBuffer f110404d;

    /* renamed from: e */
    public byte[] f110405e;

    /* renamed from: f */
    public short[] f110406f;

    /* renamed from: g */
    public byte[] f110407g;

    /* renamed from: h */
    public byte[] f110408h;

    /* renamed from: i */
    public byte[] f110409i;

    /* renamed from: j */
    public int[] f110410j;

    /* renamed from: k */
    public int f110411k;

    /* renamed from: l */
    public CC1 f110412l;

    /* renamed from: m */
    public Bitmap f110413m;

    /* renamed from: n */
    public boolean f110414n;

    /* renamed from: o */
    public int f110415o;

    /* renamed from: p */
    public int f110416p;

    /* renamed from: q */
    public int f110417q;

    /* renamed from: r */
    public int f110418r;

    /* renamed from: s */
    public Boolean f110419s;

    /* renamed from: t */
    public Bitmap.Config f110420t;

    public C49211tO5(InterfaceC49099tC1.InterfaceC28552a interfaceC28552a, CC1 cc1, ByteBuffer byteBuffer, int i) {
        this(interfaceC28552a);
        m12418q(cc1, byteBuffer, i);
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: a */
    public void mo12434a(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f110420t = config;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: b */
    public void mo12433b() {
        this.f110411k = -1;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: c */
    public int mo12432c() {
        return this.f110411k;
    }

    @Override // p000.InterfaceC49099tC1
    public void clear() {
        this.f110412l = null;
        byte[] bArr = this.f110409i;
        if (bArr != null) {
            this.f110403c.mo12903e(bArr);
        }
        int[] iArr = this.f110410j;
        if (iArr != null) {
            this.f110403c.mo12902f(iArr);
        }
        Bitmap bitmap = this.f110413m;
        if (bitmap != null) {
            this.f110403c.mo12905c(bitmap);
        }
        this.f110413m = null;
        this.f110404d = null;
        this.f110419s = null;
        byte[] bArr2 = this.f110405e;
        if (bArr2 != null) {
            this.f110403c.mo12903e(bArr2);
        }
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: d */
    public int mo12431d() {
        return this.f110404d.limit() + this.f110409i.length + (this.f110410j.length * 4);
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: e */
    public synchronized Bitmap mo12430e() {
        C52656zC1 c52656zC1;
        if (this.f110412l.f3586c <= 0 || this.f110411k < 0) {
            String str = f110400u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f110412l.f3586c + ", framePointer=" + this.f110411k);
            }
            this.f110415o = 1;
        }
        int i = this.f110415o;
        if (i != 1 && i != 2) {
            this.f110415o = 0;
            if (this.f110405e == null) {
                this.f110405e = this.f110403c.mo12907a(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            C52656zC1 c52656zC12 = this.f110412l.f3588e.get(this.f110411k);
            int i2 = this.f110411k - 1;
            if (i2 >= 0) {
                c52656zC1 = this.f110412l.f3588e.get(i2);
            } else {
                c52656zC1 = null;
            }
            int[] iArr = c52656zC12.f120951k;
            if (iArr == null) {
                iArr = this.f110412l.f3584a;
            }
            this.f110401a = iArr;
            if (iArr == null) {
                String str2 = f110400u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f110411k);
                }
                this.f110415o = 1;
                return null;
            }
            if (c52656zC12.f120946f) {
                System.arraycopy(iArr, 0, this.f110402b, 0, iArr.length);
                int[] iArr2 = this.f110402b;
                this.f110401a = iArr2;
                iArr2[c52656zC12.f120948h] = 0;
                if (c52656zC12.f120947g == 2 && this.f110411k == 0) {
                    this.f110419s = Boolean.TRUE;
                }
            }
            return m12417r(c52656zC12, c52656zC1);
        }
        String str3 = f110400u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f110415o);
        }
        return null;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: f */
    public void mo12429f() {
        this.f110411k = (this.f110411k + 1) % this.f110412l.f3586c;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: g */
    public int mo12428g() {
        return this.f110412l.f3586c;
    }

    @Override // p000.InterfaceC49099tC1
    public ByteBuffer getData() {
        return this.f110404d;
    }

    @Override // p000.InterfaceC49099tC1
    /* renamed from: h */
    public int mo12427h() {
        int i;
        if (this.f110412l.f3586c > 0 && (i = this.f110411k) >= 0) {
            return m12422m(i);
        }
        return 0;
    }

    /* renamed from: i */
    public final int m12426i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f110416p + i; i9++) {
            byte[] bArr = this.f110409i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f110401a[bArr[i9] & UByte.MAX_VALUE];
            if (i10 != 0) {
                i4 += (i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                i5 += (i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                i6 += (i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                i7 += i10 & KotlinVersion.MAX_COMPONENT_VALUE;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f110416p + i11; i12++) {
            byte[] bArr2 = this.f110409i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f110401a[bArr2[i12] & UByte.MAX_VALUE];
            if (i13 != 0) {
                i4 += (i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                i5 += (i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                i6 += (i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                i7 += i13 & KotlinVersion.MAX_COMPONENT_VALUE;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    public final void m12425j(C52656zC1 c52656zC1) {
        boolean z;
        boolean booleanValue;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f110410j;
        int i6 = c52656zC1.f120944d;
        int i7 = this.f110416p;
        int i8 = i6 / i7;
        int i9 = c52656zC1.f120942b / i7;
        int i10 = c52656zC1.f120943c / i7;
        int i11 = c52656zC1.f120941a / i7;
        if (this.f110411k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f110418r;
        int i13 = this.f110417q;
        byte[] bArr = this.f110409i;
        int[] iArr2 = this.f110401a;
        Boolean bool = this.f110419s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (c52656zC1.f120945e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                i17 = i18;
                                i15 = 1;
                                i14 = 2;
                            }
                        } else {
                            i14 = 4;
                            i17 = i18;
                            i15 = 2;
                        }
                    } else {
                        i15 = 4;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            if (i7 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * c52656zC1.f120943c;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & UByte.MAX_VALUE];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 < i22) {
                            int m12426i = m12426i(i24, i28, c52656zC1.f120943c);
                            if (m12426i != 0) {
                                iArr[i29] = m12426i;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i24 += i7;
                            i29++;
                            i10 = i4;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.f110419s == null) {
            if (bool3 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool3.booleanValue();
            }
            this.f110419s = Boolean.valueOf(booleanValue);
        }
    }

    /* renamed from: k */
    public final void m12424k(C52656zC1 c52656zC1) {
        boolean z;
        boolean z2;
        C52656zC1 c52656zC12 = c52656zC1;
        int[] iArr = this.f110410j;
        int i = c52656zC12.f120944d;
        int i2 = c52656zC12.f120942b;
        int i3 = c52656zC12.f120943c;
        int i4 = c52656zC12.f120941a;
        if (this.f110411k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f110418r;
        byte[] bArr = this.f110409i;
        int[] iArr2 = this.f110401a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = c52656zC12.f120943c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & UByte.MAX_VALUE;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            c52656zC12 = c52656zC1;
        }
        Boolean bool = this.f110419s;
        if ((bool != null && bool.booleanValue()) || (this.f110419s == null && z && b != -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f110419s = Boolean.valueOf(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m12423l(C52656zC1 c52656zC1) {
        int i;
        int i2;
        short s;
        C49211tO5 c49211tO5 = this;
        if (c52656zC1 != null) {
            c49211tO5.f110404d.position(c52656zC1.f120950j);
        }
        if (c52656zC1 == null) {
            CC1 cc1 = c49211tO5.f110412l;
            i = cc1.f3589f;
            i2 = cc1.f3590g;
        } else {
            i = c52656zC1.f120943c;
            i2 = c52656zC1.f120944d;
        }
        int i3 = i * i2;
        byte[] bArr = c49211tO5.f110409i;
        if (bArr == null || bArr.length < i3) {
            c49211tO5.f110409i = c49211tO5.f110403c.mo12907a(i3);
        }
        byte[] bArr2 = c49211tO5.f110409i;
        if (c49211tO5.f110406f == null) {
            c49211tO5.f110406f = new short[4096];
        }
        short[] sArr = c49211tO5.f110406f;
        if (c49211tO5.f110407g == null) {
            c49211tO5.f110407g = new byte[4096];
        }
        byte[] bArr3 = c49211tO5.f110407g;
        if (c49211tO5.f110408h == null) {
            c49211tO5.f110408h = new byte[4097];
        }
        byte[] bArr4 = c49211tO5.f110408h;
        int m12419p = m12419p();
        int i4 = 1 << m12419p;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = m12419p + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = c49211tO5.f110405e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = -1;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = m12420o();
                if (i14 <= 0) {
                    c49211tO5.f110415o = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & UByte.MAX_VALUE) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i21;
            int i25 = i11;
            int i26 = i7;
            int i27 = i20;
            while (true) {
                if (i22 >= i25) {
                    int i28 = i6;
                    int i29 = i17 & i13;
                    i17 >>= i25;
                    i22 -= i25;
                    if (i29 == i4) {
                        i13 = i8;
                        i25 = i26;
                        i23 = i28;
                        i6 = i23;
                        i24 = -1;
                    } else if (i29 == i5) {
                        i16 = i22;
                        i20 = i27;
                        i12 = i23;
                        i7 = i26;
                        i6 = i28;
                        i21 = i24;
                        i11 = i25;
                        break;
                    } else if (i24 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i9++;
                        i24 = i29;
                        i27 = i24;
                        i6 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i19] = (byte) i27;
                            i19++;
                            s = i24;
                        } else {
                            s = i29;
                        }
                        while (s >= i4) {
                            bArr4[i19] = bArr3[s];
                            i19++;
                            s = sArr[s];
                        }
                        i27 = bArr3[s] & UByte.MAX_VALUE;
                        byte b = (byte) i27;
                        bArr2[i18] = b;
                        while (true) {
                            i18++;
                            i9++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i18] = bArr4[i19];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i24;
                            bArr3[i23] = b;
                            i23++;
                            if ((i23 & i13) == 0 && i23 < 4096) {
                                i25++;
                                i13 += i23;
                            }
                        }
                        i24 = i29;
                        i6 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                } else {
                    i12 = i23;
                    i11 = i25;
                    i16 = i22;
                    i20 = i27;
                    i7 = i26;
                    i21 = i24;
                    break;
                }
            }
            c49211tO5 = this;
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    /* renamed from: m */
    public int m12422m(int i) {
        if (i >= 0) {
            CC1 cc1 = this.f110412l;
            if (i < cc1.f3586c) {
                return cc1.f3588e.get(i).f120949i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m12421n() {
        Bitmap.Config config;
        Boolean bool = this.f110419s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f110420t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap mo12906b = this.f110403c.mo12906b(this.f110418r, this.f110417q, config);
        mo12906b.setHasAlpha(true);
        return mo12906b;
    }

    /* renamed from: o */
    public final int m12420o() {
        int m12419p = m12419p();
        if (m12419p <= 0) {
            return m12419p;
        }
        ByteBuffer byteBuffer = this.f110404d;
        byteBuffer.get(this.f110405e, 0, Math.min(m12419p, byteBuffer.remaining()));
        return m12419p;
    }

    /* renamed from: p */
    public final int m12419p() {
        return this.f110404d.get() & UByte.MAX_VALUE;
    }

    /* renamed from: q */
    public synchronized void m12418q(CC1 cc1, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f110415o = 0;
            this.f110412l = cc1;
            this.f110411k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f110404d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f110404d.order(ByteOrder.LITTLE_ENDIAN);
            this.f110414n = false;
            Iterator<C52656zC1> it = cc1.f3588e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f120947g == 3) {
                    this.f110414n = true;
                    break;
                }
            }
            this.f110416p = highestOneBit;
            int i2 = cc1.f3589f;
            this.f110418r = i2 / highestOneBit;
            int i3 = cc1.f3590g;
            this.f110417q = i3 / highestOneBit;
            this.f110409i = this.f110403c.mo12907a(i2 * i3);
            this.f110410j = this.f110403c.mo12904d(this.f110418r * this.f110417q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    /* renamed from: r */
    public final Bitmap m12417r(C52656zC1 c52656zC1, C52656zC1 c52656zC12) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f110410j;
        int i3 = 0;
        if (c52656zC12 == null) {
            Bitmap bitmap2 = this.f110413m;
            if (bitmap2 != null) {
                this.f110403c.mo12905c(bitmap2);
            }
            this.f110413m = null;
            Arrays.fill(iArr, 0);
        }
        if (c52656zC12 != null && c52656zC12.f120947g == 3 && this.f110413m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c52656zC12 != null && (i2 = c52656zC12.f120947g) > 0) {
            if (i2 == 2) {
                if (!c52656zC1.f120946f) {
                    CC1 cc1 = this.f110412l;
                    int i4 = cc1.f3595l;
                    if (c52656zC1.f120951k == null || cc1.f3593j != c52656zC1.f120948h) {
                        i3 = i4;
                    }
                }
                int i5 = c52656zC12.f120944d;
                int i6 = this.f110416p;
                int i7 = i5 / i6;
                int i8 = c52656zC12.f120942b / i6;
                int i9 = c52656zC12.f120943c / i6;
                int i10 = c52656zC12.f120941a / i6;
                int i11 = this.f110418r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f110418r;
                }
            } else if (i2 == 3 && (bitmap = this.f110413m) != null) {
                int i16 = this.f110418r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f110417q);
            }
        }
        m12423l(c52656zC1);
        if (!c52656zC1.f120945e && this.f110416p == 1) {
            m12424k(c52656zC1);
        } else {
            m12425j(c52656zC1);
        }
        if (this.f110414n && ((i = c52656zC1.f120947g) == 0 || i == 1)) {
            if (this.f110413m == null) {
                this.f110413m = m12421n();
            }
            Bitmap bitmap3 = this.f110413m;
            int i17 = this.f110418r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f110417q);
        }
        Bitmap m12421n = m12421n();
        int i18 = this.f110418r;
        m12421n.setPixels(iArr, 0, i18, 0, 0, i18, this.f110417q);
        return m12421n;
    }

    public C49211tO5(InterfaceC49099tC1.InterfaceC28552a interfaceC28552a) {
        this.f110402b = new int[256];
        this.f110420t = Bitmap.Config.ARGB_8888;
        this.f110403c = interfaceC28552a;
        this.f110412l = new CC1();
    }
}
