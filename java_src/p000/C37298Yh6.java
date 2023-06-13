package p000;

import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "Lgl;", "appPreference", "LOh;", "appBuildConfig", "", C17296a.f69688o, "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Yh6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37298Yh6 {
    /* renamed from: a */
    public static final boolean m74461a(User user, C22454gl appPreference, InterfaceC6097Oh appBuildConfig) {
        boolean z;
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        EnumC49958uf1 m37699O = appPreference.m37699O();
        if (user.getAdmin() && UserKt.isAdminDomain(user)) {
            z = true;
        } else {
            z = false;
        }
        if (z || user.getTester() || appBuildConfig.mo89921k() || m37699O != EnumC49958uf1.f112718k) {
            return true;
        }
        return false;
    }
}
