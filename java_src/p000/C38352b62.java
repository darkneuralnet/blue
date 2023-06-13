package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0007R\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lb62;", "", "", "e", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", C17296a.f69688o, "b", "c", "Ljava/util/Random;", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Random;", "random", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: b62  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38352b62 {

    /* renamed from: a */
    public static final C38352b62 f56926a = new C38352b62();

    /* renamed from: b */
    public static final Lazy f56927b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: b62$a */
    /* loaded from: classes2.dex */
    public static final class C12292a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ ComponentName f56928g;

        /* renamed from: h */
        public final /* synthetic */ Intent f56929h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12292a(ComponentName componentName, Intent intent) {
            super(0);
            this.f56928g = componentName;
            this.f56929h = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Sent intent with component " + this.f56928g + " and explicit intent " + this.f56929h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/Random;", "b", "()Ljava/util/Random;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: b62$b */
    /* loaded from: classes2.dex */
    public static final class C12293b extends Lambda implements Function0<Random> {

        /* renamed from: g */
        public static final C12293b f56930g = new C12293b();

        public C12293b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Random invoke() {
            return new Random();
        }
    }

    static {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C12293b.f56930g);
        f56927b = lazy;
    }

    private C38352b62() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m64972a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers;
        PackageManager.ResolveInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, of);
        } else {
            queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        }
        Intrinsics.checkNotNullExpressionValue(queryBroadcastReceivers, "if (Build.VERSION.SDK_IN…vers(intent, 0)\n        }");
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            C43664k20.m29442e(C43664k20.f93782a, f56926a, C43664k20.EnumC25082a.V, null, false, new C12292a(componentName, intent2), 6, null);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m64971b() {
        return 67108864;
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m64970c() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    @JvmStatic
    /* renamed from: e */
    public static final int m64968e() {
        return f56926a.m64969d().nextInt(1073741823) + 100000;
    }

    /* renamed from: d */
    public final Random m64969d() {
        return (Random) f56927b.getValue();
    }
}
