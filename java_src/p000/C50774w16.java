package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Li26;", "textLayoutResult", "", "rawStartOffset", "rawEndOffset", "Ls26;", "previousSelection", "", "isStartHandle", "LPr5;", "adjustment", C17296a.f69688o, "(Li26;IILs26;ZLPr5;)J", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: w16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50774w16 {
    /* renamed from: a */
    public static final long m7552a(C42484i26 c42484i26, int i, int i2, C48413s26 c48413s26, boolean z, InterfaceC35281Pr5 adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (c42484i26 != null) {
            long m13200b = C49006t26.m13200b(i, i2);
            if (c48413s26 == null && Intrinsics.areEqual(adjustment, InterfaceC35281Pr5.f29167a.m89693c())) {
                return m13200b;
            }
            return adjustment.mo89683a(c42484i26, m13200b, -1, z, c48413s26);
        }
        return C49006t26.m13200b(0, 0);
    }
}
