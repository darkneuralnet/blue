package p000;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lgx1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "b", "", "message", C17296a.f69688o, "Ljava/lang/Class;", "Landroid/app/Service;", "Ljava/lang/Class;", "serviceClass", "Z", "isStarting", "c", "shouldStop", "<init>", "(Ljava/lang/Class;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForegroundServiceLauncherImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceLauncherImpl.kt\nco/bird/android/coreinterface/core/ForegroundServiceLauncherImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/* renamed from: gx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41837gx1 {

    /* renamed from: a */
    public final Class<? extends Service> f84503a;

    /* renamed from: b */
    public boolean f84504b;

    /* renamed from: c */
    public boolean f84505c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gx1$a */
    /* loaded from: classes2.dex */
    public static final class C22518a extends Lambda implements Function1<Intent, Unit> {

        /* renamed from: g */
        public static final C22518a f84506g = new C22518a();

        public C22518a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.INSTANCE;
        }
    }

    public C41837gx1(Class<? extends Service> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        this.f84503a = serviceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean startService$default(C41837gx1 c41837gx1, Context context, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = C22518a.f84506g;
        }
        return c41837gx1.m37296b(context, function1);
    }

    /* renamed from: a */
    public final void m37297a(String str) {
        C41318g46.m40157g(str, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0049, B:9:0x0059, B:12:0x005f, B:14:0x0065, B:16:0x006d, B:20:0x0076, B:6:0x002f), top: B:28:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m37296b(Context context, Function1<? super Intent, Unit> block) {
        boolean z;
        ActivityManager activityManager;
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f84505c) {
            m37297a("startService called for " + this.f84503a.getSimpleName() + " while stop request pending during existing startRequest, cancelling stop request now.");
        } else {
            m37297a("startService called for " + this.f84503a.getSimpleName());
        }
        z = true;
        this.f84504b = true;
        this.f84505c = false;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) runningAppProcesses);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) firstOrNull;
            if (runningAppProcessInfo != null) {
                i = runningAppProcessInfo.importance;
                if (i > 100) {
                    Intent intent = new Intent(context, this.f84503a);
                    block.invoke(intent);
                    context.startService(intent);
                } else {
                    z = false;
                }
            }
        }
        i = 1000;
        if (i > 100) {
        }
        return z;
    }
}
