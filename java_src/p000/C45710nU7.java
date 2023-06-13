package p000;

import com.stripe.android.model.Stripe3ds2AuthResult;
/* renamed from: nU7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45710nU7 {
    /* renamed from: a */
    public static /* synthetic */ String m23606a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "D" : Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE : "B" : "A";
    }
}
