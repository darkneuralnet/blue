package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: bP4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38529bP4 {
    /* renamed from: a */
    public static final String m64558a(WireBird wireBird) {
        long j;
        if (wireBird.getBountyPrice() != null) {
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            Integer bountyPrice = wireBird.getBountyPrice();
            if (bountyPrice != null) {
                j = bountyPrice.intValue();
            } else {
                j = 0;
            }
            return C51916xx1.currency$default(c51916xx1, j, C45097mS5.m25591o(wireBird.getBountyCurrency()), null, 4, null);
        }
        return wireBird.getLabel().getName();
    }
}
