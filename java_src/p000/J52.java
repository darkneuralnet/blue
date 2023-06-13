package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LJ52;", "", "", "value", "", "i", "h", "default", "g", "e", "index", "f", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "c", "", "[I", "slots", "b", "I", "tos", "()I", "size", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: J52 */
/* loaded from: classes.dex */
public final class J52 {

    /* renamed from: a */
    public int[] f16810a = new int[10];

    /* renamed from: b */
    public int f16811b;

    /* renamed from: a */
    public final void m101188a() {
        this.f16811b = 0;
    }

    /* renamed from: b */
    public final int m101187b() {
        return this.f16811b;
    }

    /* renamed from: c */
    public final int m101186c(int i) {
        int i2 = this.f16811b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16810a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean m101185d() {
        return this.f16811b == 0;
    }

    /* renamed from: e */
    public final int m101184e() {
        return this.f16810a[this.f16811b - 1];
    }

    /* renamed from: f */
    public final int m101183f(int i) {
        return this.f16810a[i];
    }

    /* renamed from: g */
    public final int m101182g(int i) {
        return this.f16811b > 0 ? m101184e() : i;
    }

    /* renamed from: h */
    public final int m101181h() {
        int[] iArr = this.f16810a;
        int i = this.f16811b - 1;
        this.f16811b = i;
        return iArr[i];
    }

    /* renamed from: i */
    public final void m101180i(int i) {
        int i2 = this.f16811b;
        int[] iArr = this.f16810a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16810a = copyOf;
        }
        int[] iArr2 = this.f16810a;
        int i3 = this.f16811b;
        this.f16811b = i3 + 1;
        iArr2[i3] = i;
    }
}
