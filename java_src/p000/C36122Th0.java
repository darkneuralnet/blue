package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"LTh0;", "LA24;", "", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(C)V", "f", "()[C", C17296a.f69688o, "[C", "buffer", "<set-?>", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "bufferWithData", "<init>", "([C)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: Th0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C36122Th0 extends A24<char[]> {

    /* renamed from: a */
    public char[] f35874a;

    /* renamed from: b */
    public int f35875b;

    public C36122Th0(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f35874a = bufferWithData;
        this.f35875b = bufferWithData.length;
        mo9205b(10);
    }

    @Override // p000.A24
    /* renamed from: b */
    public void mo9205b(int i) {
        int coerceAtLeast;
        char[] cArr = this.f35874a;
        if (cArr.length < i) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35874a = copyOf;
        }
    }

    @Override // p000.A24
    /* renamed from: d */
    public int mo9204d() {
        return this.f35875b;
    }

    /* renamed from: e */
    public final void m83160e(char c) {
        A24.m116173c(this, 0, 1, null);
        char[] cArr = this.f35874a;
        int mo9204d = mo9204d();
        this.f35875b = mo9204d + 1;
        cArr[mo9204d] = c;
    }

    @Override // p000.A24
    /* renamed from: f */
    public char[] mo9206a() {
        char[] copyOf = Arrays.copyOf(this.f35874a, mo9204d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
