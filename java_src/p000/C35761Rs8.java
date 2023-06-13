package p000;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: Rs8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35761Rs8 extends C32179Ck8<C35761Rs8> implements Cloneable {

    /* renamed from: d */
    public byte[] f32764d = C40558en8.f78868h;

    /* renamed from: e */
    public String f32765e = "";

    /* renamed from: f */
    public byte[][] f32766f = C40558en8.f78867g;

    /* renamed from: g */
    public boolean f32767g = false;

    public C35761Rs8() {
        this.f4623c = null;
        this.f30878b = -1;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: d */
    public final void mo40568d(C39325ck8 c39325ck8) throws IOException {
        if (!Arrays.equals(this.f32764d, C40558en8.f78868h)) {
            c39325ck8.m60965d(1, this.f32764d);
        }
        byte[][] bArr = this.f32766f;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f32766f;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    c39325ck8.m60965d(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f32765e;
        if (str != null && !str.equals("")) {
            c39325ck8.m60967b(4, this.f32765e);
        }
        super.mo40568d(c39325ck8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35761Rs8) {
            C35761Rs8 c35761Rs8 = (C35761Rs8) obj;
            if (Arrays.equals(this.f32764d, c35761Rs8.f32764d)) {
                String str = this.f32765e;
                if (str == null) {
                    if (c35761Rs8.f32765e != null) {
                        return false;
                    }
                } else if (!str.equals(c35761Rs8.f32765e)) {
                    return false;
                }
                if (C32422Dl8.m109965i(this.f32766f, c35761Rs8.f32766f)) {
                    C39335cl8 c39335cl8 = this.f4623c;
                    if (c39335cl8 == null || c39335cl8.m60897d()) {
                        C39335cl8 c39335cl82 = c35761Rs8.f4623c;
                        return c39335cl82 == null || c39335cl82.m60897d();
                    }
                    return this.f4623c.equals(c35761Rs8.f4623c);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: g */
    public final int mo40567g() {
        int mo40567g = super.mo40567g();
        if (!Arrays.equals(this.f32764d, C40558en8.f78868h)) {
            mo40567g += C39325ck8.m60960i(1, this.f32764d);
        }
        byte[][] bArr = this.f32766f;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f32766f;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += C39325ck8.m60950s(bArr3);
                }
                i++;
            }
            mo40567g = mo40567g + i2 + (i3 * 1);
        }
        String str = this.f32765e;
        return (str == null || str.equals("")) ? mo40567g : mo40567g + C39325ck8.m60962g(4, this.f32765e);
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: h */
    public final /* synthetic */ C35464Ql8 mo40566h() throws CloneNotSupportedException {
        return (C35761Rs8) clone();
    }

    public final int hashCode() {
        int hashCode = (((C35761Rs8.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f32764d)) * 31;
        String str = this.f32765e;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C32422Dl8.m109967g(this.f32766f)) * 31) + 1237) * 31;
        C39335cl8 c39335cl8 = this.f4623c;
        if (c39335cl8 != null && !c39335cl8.m60897d()) {
            i = this.f4623c.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // p000.C32179Ck8
    /* renamed from: j */
    public final /* synthetic */ C35761Rs8 mo40565j() throws CloneNotSupportedException {
        return (C35761Rs8) clone();
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: k */
    public final C35761Rs8 clone() {
        try {
            C35761Rs8 c35761Rs8 = (C35761Rs8) super.clone();
            byte[][] bArr = this.f32766f;
            if (bArr != null && bArr.length > 0) {
                c35761Rs8.f32766f = (byte[][]) bArr.clone();
            }
            return c35761Rs8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
