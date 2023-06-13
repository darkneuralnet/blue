package p000;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.play.core.review.ReviewInfo;
/* renamed from: YN6 */
/* loaded from: classes6.dex */
public final class YN6 {

    /* renamed from: c */
    public static final C42061hK6 f45804c = new C42061hK6("ReviewService");
    @Nullable

    /* renamed from: a */
    public C52733zK6<InterfaceC37893aK6> f45805a;

    /* renamed from: b */
    public final String f45806b;

    public YN6(Context context) {
        this.f45806b = context.getPackageName();
        if (C52149yL6.m3582a(context)) {
            this.f45805a = new C52733zK6<>(context, f45804c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), SM6.f33556a);
        }
    }

    /* renamed from: a */
    public final XY5<ReviewInfo> m75133a() {
        C42061hK6 c42061hK6 = f45804c;
        c42061hK6.m36535d("requestInAppReview (%s)", this.f45806b);
        if (this.f45805a == null) {
            c42061hK6.m36537b("Play Store app is either not installed or not the official version", new Object[0]);
            return CZ5.m112112c(new C41495gN6());
        }
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f45805a.m1533a(new C49796uN6(this, c37929aO6, c37929aO6));
        return c37929aO6.m71487c();
    }
}
