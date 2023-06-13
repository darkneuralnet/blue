package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, m28432d2 = {"Luj6;", "LHe3;", "", "offset", "originalToTransformed", "transformedToOriginal", "b", "LHe3;", "delegate", "c", "I", "originalLength", DateTokenConverter.CONVERTER_KEY, "transformedLength", "<init>", "(LHe3;II)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50003uj6 implements InterfaceC33290He3 {

    /* renamed from: b */
    public final InterfaceC33290He3 f112807b;

    /* renamed from: c */
    public final int f112808c;

    /* renamed from: d */
    public final int f112809d;

    public C50003uj6(InterfaceC33290He3 delegate, int i, int i2) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f112807b = delegate;
        this.f112808c = i;
        this.f112809d = i2;
    }

    @Override // p000.InterfaceC33290He3
    public int originalToTransformed(int i) {
        int originalToTransformed = this.f112807b.originalToTransformed(i);
        boolean z = false;
        if (originalToTransformed >= 0 && originalToTransformed <= this.f112809d) {
            z = true;
        }
        if (z) {
            return originalToTransformed;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + originalToTransformed + " is not in range of transformed text [0, " + this.f112809d + ']').toString());
    }

    @Override // p000.InterfaceC33290He3
    public int transformedToOriginal(int i) {
        int transformedToOriginal = this.f112807b.transformedToOriginal(i);
        boolean z = false;
        if (transformedToOriginal >= 0 && transformedToOriginal <= this.f112808c) {
            z = true;
        }
        if (z) {
            return transformedToOriginal;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + transformedToOriginal + " is not in range of original text [0, " + this.f112808c + ']').toString());
    }
}
