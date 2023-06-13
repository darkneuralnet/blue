package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0007J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006!"}, m28432d2 = {"LI52;", "", "", "oldStart", "oldEnd", "newStart", "newEnd", "", "f", "x", "y", "size", "e", DateTokenConverter.CONVERTER_KEY, "", "b", "h", "start", "end", "elSize", "g", "c", "i", "j", C17296a.f69688o, "", "[I", "stack", "I", "lastIndex", "initialCapacity", "<init>", "(I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I52 */
/* loaded from: classes.dex */
public final class I52 {

    /* renamed from: a */
    public int[] f14471a;

    /* renamed from: b */
    public int f14472b;

    public I52(int i) {
        this.f14471a = new int[i];
    }

    /* renamed from: a */
    public final boolean m102990a(int i, int i2) {
        int[] iArr = this.f14471a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 == i4 && iArr[i + 1] <= iArr[i2 + 1]) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m102989b() {
        return this.f14472b != 0;
    }

    /* renamed from: c */
    public final int m102988c(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (m102990a(i, i2)) {
                i4 += i3;
                m102982i(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        m102982i(i5, i2);
        return i5;
    }

    /* renamed from: d */
    public final int m102987d() {
        int[] iArr = this.f14471a;
        int i = this.f14472b - 1;
        this.f14472b = i;
        return iArr[i];
    }

    /* renamed from: e */
    public final void m102986e(int i, int i2, int i3) {
        int i4 = this.f14472b;
        int i5 = i4 + 3;
        int[] iArr = this.f14471a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f14471a = copyOf;
        }
        int[] iArr2 = this.f14471a;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f14472b = i5;
    }

    /* renamed from: f */
    public final void m102985f(int i, int i2, int i3, int i4) {
        int i5 = this.f14472b;
        int i6 = i5 + 4;
        int[] iArr = this.f14471a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f14471a = copyOf;
        }
        int[] iArr2 = this.f14471a;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f14472b = i6;
    }

    /* renamed from: g */
    public final void m102984g(int i, int i2, int i3) {
        if (i < i2) {
            int m102988c = m102988c(i, i2, i3);
            m102984g(i, m102988c - i3, i3);
            m102984g(m102988c + i3, i2, i3);
        }
    }

    /* renamed from: h */
    public final void m102983h() {
        boolean z;
        int i = this.f14472b;
        if (i % 3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > 3) {
                m102984g(0, i - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public final void m102982i(int i, int i2) {
        int[] iArr = this.f14471a;
        C39812dY2.m44171i(iArr, i, i2);
        C39812dY2.m44171i(iArr, i + 1, i2 + 1);
        C39812dY2.m44171i(iArr, i + 2, i2 + 2);
    }
}
