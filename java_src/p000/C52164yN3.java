package p000;

import co.bird.android.model.BirdPayment;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/BirdPayment;", "LpN3;", C17296a.f69688o, "model-analytics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: yN3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52164yN3 {
    /* renamed from: a */
    public static final EnumC46829pN3 m3534a(BirdPayment birdPayment) {
        Intrinsics.checkNotNullParameter(birdPayment, "<this>");
        if (birdPayment.isGooglePay()) {
            return EnumC46829pN3.GOOGLE_PAY;
        }
        if (birdPayment.isPaypal()) {
            return EnumC46829pN3.PAYPAL;
        }
        return EnumC46829pN3.CARD;
    }
}
