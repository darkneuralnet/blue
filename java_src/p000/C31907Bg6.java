package p000;

import co.bird.android.model.AgreementRole;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0007¨\u0006\u0007"}, m28432d2 = {"", "Lco/bird/android/model/AgreementRole;", "", "b", "([Lco/bird/android/model/AgreementRole;)Ljava/lang/String;", "Lco/bird/android/model/User;", C17296a.f69688o, "agreements_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Bg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31907Bg6 {
    @Deprecated(message = "This function only returns a single role in an improper cascading fashion (users can be more than one of these things).")
    /* renamed from: a */
    public static final AgreementRole m113687a(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        if (Intrinsics.areEqual(user.getCanCharge(), Boolean.TRUE)) {
            return AgreementRole.CHARGER;
        }
        return AgreementRole.RIDER;
    }

    /* renamed from: b */
    public static final String m113686b(AgreementRole[] agreementRoleArr) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(agreementRoleArr, "<this>");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(agreementRoleArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        return joinToString$default;
    }
}
