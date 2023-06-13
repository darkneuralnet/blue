package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, m28432d2 = {"LQc6;", "LA24;", "Lkotlin/UIntArray;", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UInt;", "c", "e", "f", "()[I", C17296a.f69688o, "[I", "buffer", "<set-?>", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: Qc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35381Qc6 extends A24<UIntArray> {

    /* renamed from: a */
    public int[] f30588a;

    /* renamed from: b */
    public int f30589b;

    public /* synthetic */ C35381Qc6(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // p000.A24
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UIntArray mo9206a() {
        return UIntArray.m116931boximpl(m88319f());
    }

    @Override // p000.A24
    /* renamed from: b */
    public void mo9205b(int i) {
        int coerceAtLeast;
        if (UIntArray.m116939getSizeimpl(this.f30588a) < i) {
            int[] iArr = this.f30588a;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, UIntArray.m116939getSizeimpl(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30588a = UIntArray.m116933constructorimpl(copyOf);
        }
    }

    @Override // p000.A24
    /* renamed from: d */
    public int mo9204d() {
        return this.f30589b;
    }

    /* renamed from: e */
    public final void m88320e(int i) {
        A24.m116173c(this, 0, 1, null);
        int[] iArr = this.f30588a;
        int mo9204d = mo9204d();
        this.f30589b = mo9204d + 1;
        UIntArray.m116943setVXSXFK8(iArr, mo9204d, i);
    }

    /* renamed from: f */
    public int[] m88319f() {
        int[] copyOf = Arrays.copyOf(this.f30588a, mo9204d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UIntArray.m116933constructorimpl(copyOf);
    }

    public C35381Qc6(int[] iArr) {
        this.f30588a = iArr;
        this.f30589b = UIntArray.m116939getSizeimpl(iArr);
        mo9205b(10);
    }
}
