package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"Lv52;", "LA24;", "", "", "requiredCapacity", "", "b", "(I)V", "c", "e", "f", "()[I", C17296a.f69688o, "[I", "buffer", "<set-?>", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: v52  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50217v52 extends A24<int[]> {

    /* renamed from: a */
    public int[] f113509a;

    /* renamed from: b */
    public int f113510b;

    public C50217v52(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f113509a = bufferWithData;
        this.f113510b = bufferWithData.length;
        mo9205b(10);
    }

    @Override // p000.A24
    /* renamed from: b */
    public void mo9205b(int i) {
        int coerceAtLeast;
        int[] iArr = this.f113509a;
        if (iArr.length < i) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f113509a = copyOf;
        }
    }

    @Override // p000.A24
    /* renamed from: d */
    public int mo9204d() {
        return this.f113510b;
    }

    /* renamed from: e */
    public final void m9203e(int i) {
        A24.m116173c(this, 0, 1, null);
        int[] iArr = this.f113509a;
        int mo9204d = mo9204d();
        this.f113510b = mo9204d + 1;
        iArr[mo9204d] = i;
    }

    @Override // p000.A24
    /* renamed from: f */
    public int[] mo9206a() {
        int[] copyOf = Arrays.copyOf(this.f113509a, mo9204d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
