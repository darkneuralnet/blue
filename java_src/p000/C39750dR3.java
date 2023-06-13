package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005\u001a\f\u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m28432d2 = {"Landroid/content/Context;", "", "permission", "", "b", "Landroid/app/Activity;", "", DateTokenConverter.CONVERTER_KEY, "e", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "c", "Ljava/lang/String;", "TAG", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: dR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39750dR3 {

    /* renamed from: a */
    public static final String f76597a = C43664k20.f93782a.m29432o("PermissionUtils");

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$a */
    /* loaded from: classes2.dex */
    public static final class C19759a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f76598g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19759a(String str) {
            super(0);
            this.f76598g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failure checking permission ", this.f76598g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$b */
    /* loaded from: classes2.dex */
    public static final class C19760b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f76599g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19760b(int i) {
            super(0);
            this.f76599g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Incrementing permission req count to " + this.f76599g + ' ';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$c */
    /* loaded from: classes2.dex */
    public static final class C19761c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19761c f76600g = new C19761c();

        public C19761c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$d */
    /* loaded from: classes2.dex */
    public static final class C19762d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19762d f76601g = new C19762d();

        public C19762d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$e */
    /* loaded from: classes2.dex */
    public static final class C19763e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19763e f76602g = new C19763e();

        public C19763e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Notification permission already granted, doing nothing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: dR3$f */
    /* loaded from: classes2.dex */
    public static final class C19764f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19764f f76603g = new C19764f();

        public C19764f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }

    /* renamed from: a */
    public static final int m44275a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt(permission, 0);
    }

    /* renamed from: b */
    public static final boolean m44274b(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(permission) != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C43664k20.m29441f(C43664k20.f93782a, f76597a, C43664k20.EnumC25082a.E, th, false, new C19759a(permission), 8, null);
            return false;
        }
    }

    /* renamed from: c */
    public static final void m44273c(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
        int i = sharedPreferences.getInt(permission, 0) + 1;
        C43664k20.m29441f(C43664k20.f93782a, f76597a, null, null, false, new C19760b(i), 14, null);
        sharedPreferences.edit().putInt(permission, i).apply();
    }

    /* renamed from: d */
    public static final void m44272d(Activity activity) {
        if (activity == null) {
            C43664k20.m29441f(C43664k20.f93782a, f76597a, null, null, false, C19761c.f76600g, 14, null);
        } else if (m44271e(activity) && Build.VERSION.SDK_INT >= 33) {
            m44273c(activity, "android.permission.POST_NOTIFICATIONS");
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, C38352b62.m64968e());
        }
    }

    /* renamed from: e */
    public static final boolean m44271e(Activity activity) {
        if (activity == null) {
            C43664k20.m29441f(C43664k20.f93782a, f76597a, null, null, false, C19762d.f76601g, 14, null);
            return false;
        } else if (Build.VERSION.SDK_INT < 33) {
            return false;
        } else {
            if (m44274b(activity, "android.permission.POST_NOTIFICATIONS")) {
                C43664k20.m29441f(C43664k20.f93782a, f76597a, null, null, false, C19763e.f76602g, 14, null);
                return false;
            } else if (m44275a(activity, "android.permission.POST_NOTIFICATIONS") >= 2) {
                return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
            } else {
                C43664k20.m29441f(C43664k20.f93782a, f76597a, C43664k20.EnumC25082a.V, null, false, C19764f.f76603g, 12, null);
                return true;
            }
        }
    }
}
