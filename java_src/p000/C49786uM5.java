package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"LuM5;", "", "", "default", "e", "value", C17296a.f69688o, "handle", "", "f", "index", "h", "g", "b", "i", "atLeast", "c", DateTokenConverter.CONVERTER_KEY, "<set-?>", "I", "getSize", "()I", "size", "", "[I", "values", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49786uM5 {

    /* renamed from: a */
    public int f112263a;

    /* renamed from: b */
    public int[] f112264b = new int[16];

    /* renamed from: c */
    public int[] f112265c = new int[16];

    /* renamed from: d */
    public int[] f112266d;

    /* renamed from: e */
    public int f112267e;

    public C49786uM5() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f112266d = iArr;
    }

    /* renamed from: a */
    public final int m10371a(int i) {
        m10369c(this.f112263a + 1);
        int i2 = this.f112263a;
        this.f112263a = i2 + 1;
        int m10370b = m10370b();
        this.f112264b[i2] = i;
        this.f112265c[i2] = m10370b;
        this.f112266d[m10370b] = i2;
        m10364h(i2);
        return m10370b;
    }

    /* renamed from: b */
    public final int m10370b() {
        int length = this.f112266d.length;
        if (this.f112267e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.f112266d, iArr, 0, 0, 0, 14, (Object) null);
            this.f112266d = iArr;
        }
        int i4 = this.f112267e;
        this.f112267e = this.f112266d[i4];
        return i4;
    }

    /* renamed from: c */
    public final void m10369c(int i) {
        int[] iArr = this.f112264b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(this.f112265c, iArr3, 0, 0, 0, 14, (Object) null);
        this.f112264b = iArr2;
        this.f112265c = iArr3;
    }

    /* renamed from: d */
    public final void m10368d(int i) {
        this.f112266d[i] = this.f112267e;
        this.f112267e = i;
    }

    /* renamed from: e */
    public final int m10367e(int i) {
        return this.f112263a > 0 ? this.f112264b[0] : i;
    }

    /* renamed from: f */
    public final void m10366f(int i) {
        int i2 = this.f112266d[i];
        m10363i(i2, this.f112263a - 1);
        this.f112263a--;
        m10364h(i2);
        m10365g(i2);
        m10368d(i);
    }

    /* renamed from: g */
    public final void m10365g(int i) {
        int i2;
        int[] iArr = this.f112264b;
        int i3 = this.f112263a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 < this.f112263a && (i2 = iArr[i4]) < iArr[i5]) {
                if (i2 < iArr[i]) {
                    m10363i(i4, i);
                    i = i4;
                } else {
                    return;
                }
            } else if (iArr[i5] < iArr[i]) {
                m10363i(i5, i);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final void m10364h(int i) {
        int[] iArr = this.f112264b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                m10363i(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void m10363i(int i, int i2) {
        int[] iArr = this.f112264b;
        int[] iArr2 = this.f112265c;
        int[] iArr3 = this.f112266d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
