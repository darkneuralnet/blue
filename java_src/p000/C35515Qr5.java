package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "offset", "lastOffset", "", "isStartHandle", "previousHandlesCrossed", "Ls26;", C17296a.f69688o, "(Ljava/lang/String;IIZZ)J", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Qr5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35515Qr5 {
    /* renamed from: a */
    public static final long m87858a(String text, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i2 == 0) {
            return C49006t26.m13200b(i, i);
        }
        if (i == 0) {
            if (z) {
                return C49006t26.m13200b(UR5.m81544a(text, 0), 0);
            }
            return C49006t26.m13200b(0, UR5.m81544a(text, 0));
        } else if (i == i2) {
            if (z) {
                return C49006t26.m13200b(UR5.m81543b(text, i2), i2);
            }
            return C49006t26.m13200b(i2, UR5.m81543b(text, i2));
        } else if (z) {
            if (!z2) {
                return C49006t26.m13200b(UR5.m81543b(text, i), i);
            }
            return C49006t26.m13200b(UR5.m81544a(text, i), i);
        } else if (!z2) {
            return C49006t26.m13200b(i, UR5.m81544a(text, i));
        } else {
            return C49006t26.m13200b(i, UR5.m81543b(text, i));
        }
    }
}
