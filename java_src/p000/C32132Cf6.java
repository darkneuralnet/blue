package p000;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Channel;
import com.braze.p028ui.BrazeWebViewActivity;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
import p000.InterfaceC39721dO1;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010*\u001a\u00020$\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0005J7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LCf6;", "LVN1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "k", "i", "l", "j", "Landroid/content/Intent;", "h", "b", "targetIntent", "LX10;", "configurationProvider", "", "e", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;LX10;)[Landroid/content/Intent;", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "()Landroid/os/Bundle;", "Lcom/appboy/enums/Channel;", "Lcom/appboy/enums/Channel;", "c", "()Lcom/appboy/enums/Channel;", "channel", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "", "Z", "g", "()Z", "setUseWebView", "(Z)V", "useWebView", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/appboy/enums/Channel;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Cf6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32132Cf6 implements VN1 {

    /* renamed from: a */
    public final Bundle f4449a;

    /* renamed from: b */
    public final Channel f4450b;

    /* renamed from: c */
    public Uri f4451c;

    /* renamed from: d */
    public boolean f4452d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$a */
    /* loaded from: classes2.dex */
    public static final class C1113a extends Lambda implements Function0<String> {
        public C1113a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Not executing local Uri: ", C32132Cf6.this.m111916f());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$b */
    /* loaded from: classes2.dex */
    public static final class C1114b extends Lambda implements Function0<String> {
        public C1114b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Executing BrazeActions uri:\n'" + C32132Cf6.this.m111916f() + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$c */
    /* loaded from: classes2.dex */
    public static final class C1115c extends Lambda implements Function0<String> {
        public C1115c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Executing Uri action from channel " + C32132Cf6.this.m111919c() + ": " + C32132Cf6.this.m111916f() + ". UseWebView: " + C32132Cf6.this.m111915g() + ". Extras: " + C32132Cf6.this.m111918d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$d */
    /* loaded from: classes2.dex */
    public static final class C1116d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ ResolveInfo f4456g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1116d(ResolveInfo resolveInfo) {
            super(0);
            this.f4456g = resolveInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting deep link intent package to " + ((Object) this.f4456g.activityInfo.packageName) + CoreConstants.DOT;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$e */
    /* loaded from: classes2.dex */
    public static final class C1117e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1117e f4457g = new C1117e();

        public C1117e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding main activity intent to back stack while opening uri from push";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$f */
    /* loaded from: classes2.dex */
    public static final class C1118f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4458g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1118f(String str) {
            super(0);
            this.f4458g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Adding custom back stack activity while opening uri from push: ", this.f4458g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$g */
    /* loaded from: classes2.dex */
    public static final class C1119g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4459g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1119g(String str) {
            super(0);
            this.f4459g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Not adding unregistered activity to the back stack while opening uri from push: ", this.f4459g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$h */
    /* loaded from: classes2.dex */
    public static final class C1120h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1120h f4460g = new C1120h();

        public C1120h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$i */
    /* loaded from: classes2.dex */
    public static final class C1121i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4461g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1121i(String str) {
            super(0);
            this.f4461g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Launching custom WebView Activity with class name: ", this.f4461g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$j */
    /* loaded from: classes2.dex */
    public static final class C1122j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f4462g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f4463h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1122j(Uri uri, Bundle bundle) {
            super(0);
            this.f4462g = uri;
            this.f4463h = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to handle uri " + this.f4462g + " with extras: " + this.f4463h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$k */
    /* loaded from: classes2.dex */
    public static final class C1123k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f4464g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1123k(Uri uri) {
            super(0);
            this.f4464g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Could not find appropriate activity to open for deep link ", this.f4464g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$l */
    /* loaded from: classes2.dex */
    public static final class C1124l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1124l f4465g = new C1124l();

        public C1124l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "BrazeWebViewActivity not opened successfully.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Cf6$m */
    /* loaded from: classes2.dex */
    public static final class C1125m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1125m f4466g = new C1125m();

        public C1125m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze WebView Activity not opened successfully.";
        }
    }

    public C32132Cf6(Uri uri, Bundle bundle, boolean z, Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f4451c = uri;
        this.f4449a = bundle;
        this.f4452d = z;
        this.f4450b = channel;
    }

    @Override // p000.VN1
    /* renamed from: a */
    public void mo44583a(Context context) {
        boolean contains;
        Intrinsics.checkNotNullParameter(context, "context");
        if (C38903c20.m62017e(this.f4451c)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1113a(), 7, null);
            return;
        }
        Q10 q10 = Q10.f29655a;
        if (q10.m89131d(this.f4451c)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C1114b(), 6, null);
            q10.m89134a(context, this.f4451c, m111919c());
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1115c(), 7, null);
        if (this.f4452d) {
            contains = CollectionsKt___CollectionsKt.contains(C38903c20.f59898b, this.f4451c.getScheme());
            if (contains) {
                if (m111919c() == Channel.PUSH) {
                    m111910l(context, this.f4451c, this.f4449a);
                    return;
                } else {
                    m111911k(context, this.f4451c, this.f4449a);
                    return;
                }
            }
        }
        if (m111919c() == Channel.PUSH) {
            m111912j(context, this.f4451c, this.f4449a);
        } else {
            m111913i(context, this.f4451c, this.f4449a);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: b */
    public final Intent m111920b(Context context, Uri uri, Bundle bundle) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1116d(next), 7, null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    /* renamed from: c */
    public Channel m111919c() {
        return this.f4450b;
    }

    /* renamed from: d */
    public final Bundle m111918d() {
        return this.f4449a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent[] m111917e(Context context, Bundle bundle, Intent targetIntent, X10 configurationProvider) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intent intent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(pushDeepLinkBackStackActivityClassName);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C1117e.f4457g, 6, null);
                        intent = C33302Hf6.m103554a(context, bundle);
                    } else if (C33302Hf6.m103552c(context, pushDeepLinkBackStackActivityClassName)) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C1118f(pushDeepLinkBackStackActivityClassName), 6, null);
                        if (bundle != null) {
                            intent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
                        }
                    } else {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C1119g(pushDeepLinkBackStackActivityClassName), 6, null);
                    }
                }
            }
            z = true;
            if (!z) {
            }
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C1120h.f4460g, 6, null);
        }
        if (intent == null) {
            targetIntent.setFlags(C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{targetIntent};
        }
        return new Intent[]{intent, targetIntent};
    }

    /* renamed from: f */
    public final Uri m111916f() {
        return this.f4451c;
    }

    /* renamed from: g */
    public final boolean m111915g() {
        return this.f4452d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent m111914h(Context context, Uri uri, Bundle bundle) {
        boolean z;
        Intent intent;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String customHtmlWebViewActivityClassName = new X10(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(customHtmlWebViewActivityClassName);
            if (!isBlank) {
                z = false;
                if (z && C33302Hf6.m103552c(context, customHtmlWebViewActivityClassName)) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C1121i(customHtmlWebViewActivityClassName), 7, null);
                    intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
                    Intrinsics.checkNotNullExpressionValue(intent, "val customWebViewActivit…ivityClassName)\n        }");
                } else {
                    intent = new Intent(context, BrazeWebViewActivity.class);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                intent.putExtra("url", uri.toString());
                return intent;
            }
        }
        z = true;
        if (z) {
        }
        intent = new Intent(context, BrazeWebViewActivity.class);
        if (bundle != null) {
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    /* renamed from: i */
    public void m111913i(Context context, Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent m111920b = m111920b(context, uri, bundle);
        m111920b.setFlags(C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(m111920b);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C1122j(uri, bundle), 4, null);
        }
    }

    /* renamed from: j */
    public final void m111912j(Context context, Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(m111917e(context, bundle, m111920b(context, uri, bundle), new X10(context)));
        } catch (ActivityNotFoundException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C1123k(uri), 4, null);
        }
    }

    /* renamed from: k */
    public final void m111911k(Context context, Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent m111914h = m111914h(context, uri, bundle);
        m111914h.setFlags(C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(m111914h);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C1124l.f4465g, 4, null);
        }
    }

    /* renamed from: l */
    public final void m111910l(Context context, Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(m111917e(context, bundle, m111914h(context, uri, bundle), new X10(context)));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C1125m.f4466g, 4, null);
        }
    }
}
