package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.coreinterface.manager.AuthRejectionException;
import co.bird.android.model.User;
import co.bird.android.model.Version;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0002¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/User;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/configs/Config;", "config", "", "b", "", C17296a.f69688o, "login_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ny2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45999ny2 {
    /* renamed from: a */
    public static final boolean m22047a(Throwable th) {
        while (th != null) {
            if (th instanceof AuthRejectionException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m22046b(User user, Context context, Config config) {
        Version version = new Version(config.getAndroidMinVersion());
        Version version2 = new Version(config.getAndroidChargerMinVersion());
        String appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
        Version version3 = new Version(appVersion);
        if (version3.compareTo(version) >= 0 && (!Intrinsics.areEqual(user.getCanCharge(), Boolean.TRUE) || version3.compareTo(version2) >= 0)) {
            return false;
        }
        return true;
    }
}
