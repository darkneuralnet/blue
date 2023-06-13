package p000;

import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "", "debug", C17296a.f69688o, "user_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ii6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42878ii6 {
    /* renamed from: a */
    public static final boolean m33536a(User user, boolean z) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        if (!z && ((!user.getAdmin() || !UserKt.isAdminDomain(user)) && !user.getTester())) {
            return false;
        }
        return true;
    }
}
