package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m28432d2 = {"Lxm0;", "LnE3;", "LI61;", "", "onDraw", "", "alpha", "", "applyAlpha", "Lsm0;", "colorFilter", "applyColorFilter", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "", "toString", "Lpm0;", "b", "J", "getColor-0d7_KjU", "()J", "color", "c", "F", DateTokenConverter.CONVERTER_KEY, "Lsm0;", "LxB5;", "e", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51805xm0 extends AbstractC45562nE3 {

    /* renamed from: b */
    public final long f118077b;

    /* renamed from: c */
    public float f118078c;

    /* renamed from: d */
    public C48841sm0 f118079d;

    /* renamed from: e */
    public final long f118080e;

    public /* synthetic */ C51805xm0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyAlpha(float f) {
        this.f118078c = f;
        return true;
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyColorFilter(C48841sm0 c48841sm0) {
        this.f118079d = c48841sm0;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C51805xm0) && C47063pm0.m18741o(this.f118077b, ((C51805xm0) obj).f118077b)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC45562nE3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo116236getIntrinsicSizeNHjbRc() {
        return this.f118080e;
    }

    public int hashCode() {
        return C47063pm0.m18735u(this.f118077b);
    }

    @Override // p000.AbstractC45562nE3
    public void onDraw(I61 i61) {
        Intrinsics.checkNotNullParameter(i61, "<this>");
        I61.m102945z0(i61, this.f118077b, 0L, 0L, this.f118078c, null, this.f118079d, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) C47063pm0.m18734v(this.f118077b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C51805xm0(long j) {
        this.f118077b = j;
        this.f118078c = 1.0f;
        this.f118080e = C51465xB5.f117175b.m5724a();
    }
}
