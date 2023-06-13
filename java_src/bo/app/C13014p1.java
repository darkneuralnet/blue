package bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, m28432d2 = {"Lbo/app/p1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "b", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.p1 */
/* loaded from: classes.dex */
public final class C13014p1 {

    /* renamed from: a */
    public static final C13014p1 f59081a = new C13014p1();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p1$b */
    /* loaded from: classes.dex */
    public static final class C13015b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13015b f59082b = new C13015b();

        public C13015b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services is available.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p1$c */
    /* loaded from: classes.dex */
    public static final class C13016c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13016c(int i) {
            super(0);
            this.f59083b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Google Play Services is unavailable. Connection result: ", Integer.valueOf(this.f59083b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.p1$d */
    /* loaded from: classes.dex */
    public static final class C13017d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13017d f59084b = new C13017d();

        public C13017d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unexpected exception while checking for com.google.android.gsf";
        }
    }

    private C13014p1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m63157a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            C43664k20.m29442e(C43664k20.f93782a, f59081a, null, null, false, C13015b.f59082b, 7, null);
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, f59081a, null, null, false, new C13016c(isGooglePlayServicesAvailable), 7, null);
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m63156b(Context context) {
        PackageManager.PackageInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageManager.getPackageInfo("com.google.android.gsf", of);
            } else {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f59081a, C43664k20.EnumC25082a.W, e, false, C13017d.f59084b, 4, null);
            return false;
        }
    }
}
