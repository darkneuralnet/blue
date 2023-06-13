package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LmZ5;", "taskExecutor", "Ldz0;", "LP73;", C17296a.f69688o, "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "c", "(Landroid/net/ConnectivityManager;)LP73;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: R73 */
/* loaded from: classes.dex */
public final class R73 {

    /* renamed from: a */
    public static final String f31580a;

    static {
        String m113270i = AbstractC32056Bx2.m113270i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"NetworkStateTracker\")");
        f31580a = m113270i;
    }

    /* renamed from: a */
    public static final AbstractC40077dz0<P73> m87282a(Context context, InterfaceC45160mZ5 taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new Q73(context, taskExecutor);
    }

    /* renamed from: c */
    public static final P73 m87280c(ConnectivityManager connectivityManager) {
        boolean z;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        boolean m87279d = m87279d(connectivityManager);
        boolean m111197a = C32297Cy0.m111197a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z2 = false;
        }
        return new P73(z, m87279d, m111197a, z2);
    }

    /* renamed from: d */
    public static final boolean m87279d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities m9167a = C50238v73.m9167a(connectivityManager, C50831w73.m7390a(connectivityManager));
            if (m9167a == null) {
                return false;
            }
            return C50238v73.m9166b(m9167a, 16);
        } catch (SecurityException e) {
            AbstractC32056Bx2.m113272e().mo113266d(f31580a, "Unable to validate active network", e);
            return false;
        }
    }
}
