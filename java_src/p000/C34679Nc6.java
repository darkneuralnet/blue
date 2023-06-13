package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m28432d2 = {"LNc6;", "LA24;", "Lkotlin/UByteArray;", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UByte;", "c", "e", "(B)V", "f", "()[B", C17296a.f69688o, "[B", "buffer", "<set-?>", "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: Nc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34679Nc6 extends A24<UByteArray> {

    /* renamed from: a */
    public byte[] f24854a;

    /* renamed from: b */
    public int f24855b;

    public /* synthetic */ C34679Nc6(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // p000.A24
    /* renamed from: a */
    public /* bridge */ /* synthetic */ UByteArray mo9206a() {
        return UByteArray.m116852boximpl(m93699f());
    }

    @Override // p000.A24
    /* renamed from: b */
    public void mo9205b(int i) {
        int coerceAtLeast;
        if (UByteArray.m116860getSizeimpl(this.f24854a) < i) {
            byte[] bArr = this.f24854a;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, UByteArray.m116860getSizeimpl(bArr) * 2);
            byte[] copyOf = Arrays.copyOf(bArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f24854a = UByteArray.m116854constructorimpl(copyOf);
        }
    }

    @Override // p000.A24
    /* renamed from: d */
    public int mo9204d() {
        return this.f24855b;
    }

    /* renamed from: e */
    public final void m93700e(byte b) {
        A24.m116173c(this, 0, 1, null);
        byte[] bArr = this.f24854a;
        int mo9204d = mo9204d();
        this.f24855b = mo9204d + 1;
        UByteArray.m116864setVurrAj0(bArr, mo9204d, b);
    }

    /* renamed from: f */
    public byte[] m93699f() {
        byte[] copyOf = Arrays.copyOf(this.f24854a, mo9204d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return UByteArray.m116854constructorimpl(copyOf);
    }

    public C34679Nc6(byte[] bArr) {
        this.f24854a = bArr;
        this.f24855b = UByteArray.m116860getSizeimpl(bArr);
        mo9205b(10);
    }
}
