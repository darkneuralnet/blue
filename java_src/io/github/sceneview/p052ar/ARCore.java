package io.github.sceneview.p052ar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Session;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.github.sceneview.p052ar.arcore.ArSession;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC30295xm;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0015\u001a\u00020\"\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eJ\u001e\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dR\u0017\u0010\u0015\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,R\"\u00102\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010-R(\u0010C\u001a\b\u0012\u0004\u0012\u00020?0\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bA\u00109\"\u0004\bB\u0010;R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010-R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010-R(\u0010I\u001a\u0004\u0018\u00010 2\b\u0010E\u001a\u0004\u0018\u00010 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR=\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u00040J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR=\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110U¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\u00040J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010O\u001a\u0004\bW\u0010Q\"\u0004\bX\u0010S¨\u0006\\"}, m28432d2 = {"Lio/github/sceneview/ar/ARCore;", "Lxm;", "LLifecycleOwner;", "owner", "", "onCreate", "onResume", "onDestroy", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "n", "LB5;", "", "permissionLauncher", "b", "Landroid/app/Activity;", "activity", "u", "installRequested", DateTokenConverter.CONVERTER_KEY, "p", "o", "Lio/github/sceneview/ar/ArSceneLifecycle;", "lifecycle", "", "Lcom/google/ar/core/Session$Feature;", "features", "Lio/github/sceneview/ar/arcore/ArSession;", "e", "Landroidx/activity/ComponentActivity;", "Landroidx/activity/ComponentActivity;", "f", "()Landroidx/activity/ComponentActivity;", "c", "Lio/github/sceneview/ar/ArSceneLifecycle;", "getLifecycle", "()Lio/github/sceneview/ar/ArSceneLifecycle;", "Ljava/util/Set;", "getFeatures", "()Ljava/util/Set;", "Z", "getCheckCameraPermission", "()Z", "setCheckCameraPermission", "(Z)V", "checkCameraPermission", "getCheckAvailability", "setCheckAvailability", "checkAvailability", "g", "LB5;", "k", "()LB5;", "t", "(LB5;)V", "cameraPermissionLauncher", "h", "cameraPermissionRequested", "Landroid/content/Intent;", "i", "j", "s", "appSettingsLauncher", "appSettingsRequested", "<set-?>", "l", "Lio/github/sceneview/ar/arcore/ArSession;", "()Lio/github/sceneview/ar/arcore/ArSession;", "session", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isGranted", "m", "Lkotlin/jvm/functions/Function1;", "getOnCameraPermissionResult", "()Lkotlin/jvm/functions/Function1;", "setOnCameraPermissionResult", "(Lkotlin/jvm/functions/Function1;)V", "onCameraPermissionResult", "Landroidx/activity/result/ActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "getOnAppSettingsResult", "setOnAppSettingsResult", "onAppSettingsResult", "<init>", "(Landroidx/activity/ComponentActivity;Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.ARCore */
/* loaded from: classes6.dex */
public final class ARCore implements InterfaceC30295xm {

    /* renamed from: b */
    public final ComponentActivity f87936b;

    /* renamed from: c */
    public final ArSceneLifecycle f87937c;

    /* renamed from: d */
    public final Set<Session.Feature> f87938d;

    /* renamed from: e */
    public boolean f87939e;

    /* renamed from: f */
    public boolean f87940f;

    /* renamed from: g */
    public AbstractC0407B5<String> f87941g;

    /* renamed from: h */
    public boolean f87942h;

    /* renamed from: i */
    public AbstractC0407B5<Intent> f87943i;

    /* renamed from: j */
    public boolean f87944j;

    /* renamed from: k */
    public boolean f87945k;

    /* renamed from: l */
    public ArSession f87946l;

    /* renamed from: m */
    public Function1<? super Boolean, Unit> f87947m;

    /* renamed from: n */
    public Function1<? super ActivityResult, Unit> f87948n;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/activity/result/ActivityResult;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.ARCore$a */
    /* loaded from: classes6.dex */
    public static final class C23385a extends Lambda implements Function1<ActivityResult, Unit> {
        public C23385a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ActivityResult activityResult) {
            Intrinsics.checkNotNullParameter(activityResult, "<anonymous parameter 0>");
            ARCore.this.f87944j = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "isGranted", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.ARCore$b */
    /* loaded from: classes6.dex */
    public static final class C23386b extends Lambda implements Function1<Boolean, Unit> {
        public C23386b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z || C25883m3.m26445x(ARCore.this.m33427f(), "android.permission.CAMERA")) {
                return;
            }
            ARCore.this.f87944j = true;
            ARCore aRCore = ARCore.this;
            aRCore.m33417u(aRCore.m33427f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARCore(ComponentActivity activity, ArSceneLifecycle lifecycle, Set<? extends Session.Feature> features) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f87936b = activity;
        this.f87937c = lifecycle;
        this.f87938d = features;
        this.f87939e = true;
        this.f87940f = true;
        this.f87947m = new C23386b();
        this.f87948n = new C23385a();
        lifecycle.mo67008a(this);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: F */
    public void mo4733F(Exception exc) {
        InterfaceC30295xm.C30296a.m4725d(this, exc);
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        InterfaceC30295xm.C30296a.m4722g(this, i, i2);
    }

    /* renamed from: b */
    public final boolean m33430b(Context context, AbstractC0407B5<String> permissionLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionLauncher, "permissionLauncher");
        if (!m33423n(context)) {
            permissionLauncher.m114705a("android.permission.CAMERA");
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: c */
    public void mo4732c(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4724e(this, arSession);
    }

    /* renamed from: d */
    public final boolean m33429d(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!m33421p(activity) && m33422o(activity, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final ArSession m33428e(ArSceneLifecycle lifecycle, Set<? extends Session.Feature> features) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(features, "features");
        return new ArSession(lifecycle, features);
    }

    /* renamed from: f */
    public final ComponentActivity m33427f() {
        return this.f87936b;
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 c35340Py1) {
        InterfaceC30295xm.C30296a.m4723f(this, c35340Py1);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: i */
    public void mo4731i(ArSession arSession, Config config) {
        InterfaceC30295xm.C30296a.m4727b(this, arSession, config);
    }

    /* renamed from: j */
    public final AbstractC0407B5<Intent> m33426j() {
        AbstractC0407B5<Intent> abstractC0407B5 = this.f87943i;
        if (abstractC0407B5 != null) {
            return abstractC0407B5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appSettingsLauncher");
        return null;
    }

    /* renamed from: k */
    public final AbstractC0407B5<String> m33425k() {
        AbstractC0407B5<String> abstractC0407B5 = this.f87941g;
        if (abstractC0407B5 != null) {
            return abstractC0407B5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cameraPermissionLauncher");
        return null;
    }

    /* renamed from: l */
    public final ArSession m33424l() {
        return this.f87946l;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: m */
    public void mo4730m(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4726c(this, arSession);
    }

    /* renamed from: n */
    public final boolean m33423n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NA0.m94303a(context, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m33422o(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (ArCoreApk.getInstance().requestInstall(activity, !z) == ArCoreApk.InstallStatus.INSTALL_REQUESTED) {
            return true;
        }
        return false;
    }

    @Override // p000.VX0
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        AbstractC0407B5<String> m70472j = this.f87936b.getActivityResultRegistry().m70472j("sceneview_camera_permission", owner, new C30416y5(), new C30390y(this.f87947m));
        Intrinsics.checkNotNullExpressionValue(m70472j, "activity.activityResultR…ermissionResult\n        )");
        m33418t(m70472j);
        AbstractC0407B5<Intent> m70472j2 = this.f87936b.getActivityResultRegistry().m70472j("sceneview_app_settings", owner, new C30903z5(), new C30390y(this.f87948n));
        Intrinsics.checkNotNullExpressionValue(m70472j2, "activity.activityResultR…pSettingsResult\n        )");
        m33419s(m70472j2);
    }

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f87946l = null;
        super.onDestroy(owner);
    }

    @Override // p000.VX0
    public void onResume(LifecycleOwner owner) {
        boolean z;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.f87946l == null) {
            if (this.f87939e && !this.f87942h && !m33430b(this.f87936b, m33425k())) {
                this.f87942h = true;
            } else if (!this.f87944j) {
                try {
                    if (this.f87940f && !(z = this.f87945k) && !m33429d(this.f87936b, z)) {
                        this.f87945k = true;
                        return;
                    }
                    ArSession m33428e = m33428e(this.f87937c, this.f87938d);
                    this.f87946l = m33428e;
                    if (m33428e != null) {
                        ArrayList<InterfaceC30295xm> arrayList = new ArrayList();
                        for (InterfaceC32929Fq2 interfaceC32929Fq2 : this.f87937c.m83453q()) {
                            if (!(interfaceC32929Fq2 instanceof InterfaceC30295xm)) {
                                interfaceC32929Fq2 = null;
                            }
                            InterfaceC30295xm interfaceC30295xm = (InterfaceC30295xm) interfaceC32929Fq2;
                            if (interfaceC30295xm != null) {
                                arrayList.add(interfaceC30295xm);
                            }
                        }
                        for (InterfaceC30295xm interfaceC30295xm2 : arrayList) {
                            interfaceC30295xm2.mo4730m(m33428e);
                        }
                    }
                } catch (Exception e) {
                    m33420q(e);
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean m33421p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (ArCoreApk.getInstance().checkAvailability(context) == ArCoreApk.Availability.SUPPORTED_INSTALLED) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m33420q(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        ArrayList<InterfaceC30295xm> arrayList = new ArrayList();
        for (InterfaceC32929Fq2 interfaceC32929Fq2 : this.f87937c.m83453q()) {
            if (!(interfaceC32929Fq2 instanceof InterfaceC30295xm)) {
                interfaceC32929Fq2 = null;
            }
            InterfaceC30295xm interfaceC30295xm = (InterfaceC30295xm) interfaceC32929Fq2;
            if (interfaceC30295xm != null) {
                arrayList.add(interfaceC30295xm);
            }
        }
        for (InterfaceC30295xm interfaceC30295xm2 : arrayList) {
            interfaceC30295xm2.mo4733F(exception);
        }
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: r */
    public void mo4729r(C27991rm c27991rm) {
        InterfaceC30295xm.C30296a.m4728a(this, c27991rm);
    }

    /* renamed from: s */
    public final void m33419s(AbstractC0407B5<Intent> abstractC0407B5) {
        Intrinsics.checkNotNullParameter(abstractC0407B5, "<set-?>");
        this.f87943i = abstractC0407B5;
    }

    /* renamed from: t */
    public final void m33418t(AbstractC0407B5<String> abstractC0407B5) {
        Intrinsics.checkNotNullParameter(abstractC0407B5, "<set-?>");
        this.f87941g = abstractC0407B5;
    }

    /* renamed from: u */
    public final void m33417u(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Toast.makeText(activity, activity.getString(C42313hl4.sceneview_camera_permission_required), 1).show();
        AbstractC0407B5<Intent> m33426j = m33426j();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        m33426j.m114705a(intent);
    }
}
