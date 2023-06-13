package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m28432d2 = {"Lld6;", "LA24;", "Lkotlin/UShortArray;", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UShort;", "c", "e", "(S)V", "f", "()[S", C17296a.f69688o, "[S", "buffer", "<set-?>", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: ld6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44607ld6 extends A24<UShortArray> {

    /* renamed from: a */
    public short[] f96461a;

    /* renamed from: b */
    public int f96462b;

    public /* synthetic */ C44607ld6(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // p000.A24
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UShortArray mo9206a() {
        return UShortArray.m117115boximpl(m27065f());
    }

    @Override // p000.A24
    /* renamed from: b */
    public void mo9205b(int i) {
        int coerceAtLeast;
        if (UShortArray.m117123getSizeimpl(this.f96461a) < i) {
            short[] sArr = this.f96461a;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, UShortArray.m117123getSizeimpl(sArr) * 2);
            short[] copyOf = Arrays.copyOf(sArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f96461a = UShortArray.m117117constructorimpl(copyOf);
        }
    }

    @Override // p000.A24
    /* renamed from: d */
    public int mo9204d() {
        return this.f96462b;
    }

    /* renamed from: e */
    public final void m27066e(short s) {
        A24.m116173c(this, 0, 1, null);
        short[] sArr = this.f96461a;
        int mo9204d = mo9204d();
        this.f96462b = mo9204d + 1;
        UShortArray.m117127set01HTLdE(sArr, mo9204d, s);
    }

    /* renamed from: f */
    public short[] m27065f() {
        short[] copyOf = Arrays.copyOf(this.f96461a, mo9204d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UShortArray.m117117constructorimpl(copyOf);
    }

    public C44607ld6(short[] sArr) {
        this.f96461a = sArr;
        this.f96462b = UShortArray.m117123getSizeimpl(sArr);
        mo9205b(10);
    }
}
