package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LJc;", "LaW3;", "LJw1;", "fontWeight", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "I", "fontWeightAdjustment", "<init>", "(I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jc */
/* loaded from: classes.dex */
public final class C4166Jc implements InterfaceC37998aW3 {

    /* renamed from: b */
    public final int f17896b;

    public C4166Jc(int i) {
        this.f17896b = i;
    }

    @Override // p000.InterfaceC37998aW3
    /* renamed from: a */
    public C33918Jw1 mo71259a(C33918Jw1 fontWeight) {
        int coerceIn;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i = this.f17896b;
        if (i != 0 && i != Integer.MAX_VALUE) {
            coerceIn = RangesKt___RangesKt.coerceIn(fontWeight.m99544k() + this.f17896b, 1, 1000);
            return new C33918Jw1(coerceIn);
        }
        return fontWeight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4166Jc) && this.f17896b == ((C4166Jc) obj).f17896b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f17896b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f17896b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
