package p000;

import android.app.Activity;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.analytics.CameraPermissionsRequested;
import co.bird.android.model.analytics.CameraPermissionsResponded;
import co.bird.android.model.analytics.LocationPermissionsRequested;
import co.bird.android.model.analytics.LocationPermissionsResponded;
import co.bird.android.model.constant.Permission;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001\tB!\b\u0007\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205¢\u0006\u0004\b=\u0010>J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J@\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\f2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$j\u0002`&2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$j\u0002`&H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u001eH\u0002R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106R$\u0010\u000b\u001a\u0004\u0018\u00010\n8A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006?"}, m28432d2 = {"LDQ3;", "", "Lco/bird/android/model/constant/Permission;", "permission", "Lio/reactivex/F;", "LFQ3;", "l", "k", "Lco/bird/android/model/PermissionStatus;", C17296a.f69688o, "LCQ3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "rationale", "", "j", DateTokenConverter.CONVERTER_KEY, "", "requestCode", "", "", "permissions", "", "grantResults", "h", "(I[Ljava/lang/String;[I)V", "q", "p", "o", "i", "", "f", "g", "b", "c", "message", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "ok", "cancel", "n", "results", "e", "r", "granted", "s", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Lgl;", "Lgl;", "preferences", "LEa;", "LEa;", "analyticsManager", "LCQ3;", "getListener$permission_release", "()LCQ3;", "m", "(LCQ3;)V", "<init>", "(Landroid/app/Activity;Lgl;LEa;)V", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DQ3 */
/* loaded from: classes3.dex */
public final class DQ3 {

    /* renamed from: e */
    public static final C1465a f5655e = new C1465a(null);

    /* renamed from: f */
    public static final Map<Integer, Permission> f5656f = new LinkedHashMap();

    /* renamed from: a */
    public final Activity f5657a;

    /* renamed from: b */
    public final C22454gl f5658b;

    /* renamed from: c */
    public final InterfaceC1880Ea f5659c;

    /* renamed from: d */
    public CQ3 f5660d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LDQ3$a;", "", "", "", "Lco/bird/android/model/constant/Permission;", "PERMISSION_MAP", "Ljava/util/Map;", "<init>", "()V", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DQ3$a */
    /* loaded from: classes3.dex */
    public static final class C1465a {
        public /* synthetic */ C1465a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1465a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DQ3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1466b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Permission.values().length];
            try {
                iArr[Permission.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Permission.ACCESS_FINE_LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Permission.BLUETOOTH_SCAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Permission.BLUETOOTH_CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Permission.POST_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DQ3$c */
    /* loaded from: classes3.dex */
    public static final class C1467c extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Permission f5662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1467c(Permission permission) {
            super(1);
            this.f5662h = permission;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DQ3.this.m110488i(this.f5662h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DQ3$d */
    /* loaded from: classes3.dex */
    public static final class C1468d extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Permission f5664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1468d(Permission permission) {
            super(1);
            this.f5664h = permission;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DQ3.this.m110478s(this.f5664h, false);
            DQ3.this.m110495b(this.f5664h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LFQ3;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DQ3$e */
    /* loaded from: classes3.dex */
    public static final class C1469e extends Lambda implements Function1<InterfaceC23444H<FQ3>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"DQ3$e$a", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: DQ3$e$a */
        /* loaded from: classes3.dex */
        public static final class C1470a implements CQ3 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<FQ3> f5666a;

            public C1470a(InterfaceC23444H<FQ3> interfaceC23444H) {
                this.f5666a = interfaceC23444H;
            }

            @Override // p000.CQ3
            /* renamed from: a */
            public void mo19266a(Permission permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                this.f5666a.onSuccess(new FQ3(permission, true));
            }

            @Override // p000.CQ3
            /* renamed from: b */
            public void mo19265b(Permission permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                this.f5666a.onSuccess(new FQ3(permission, false));
            }
        }

        public C1469e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<FQ3> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<FQ3> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            DQ3 dq3 = DQ3.this;
            Permission permission = Permission.ACCESS_FINE_LOCATION;
            if (dq3.m110490g(permission)) {
                return;
            }
            DQ3.this.m110484m(new C1470a(emitter));
            DQ3.this.m110488i(permission);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LFQ3;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DQ3$f */
    /* loaded from: classes3.dex */
    public static final class C1471f extends Lambda implements Function1<InterfaceC23444H<FQ3>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Permission f5668h;

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"DQ3$f$a", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: DQ3$f$a */
        /* loaded from: classes3.dex */
        public static final class C1472a implements CQ3 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<FQ3> f5669a;

            public C1472a(InterfaceC23444H<FQ3> interfaceC23444H) {
                this.f5669a = interfaceC23444H;
            }

            @Override // p000.CQ3
            /* renamed from: a */
            public void mo19266a(Permission permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                this.f5669a.onSuccess(new FQ3(permission, true));
            }

            @Override // p000.CQ3
            /* renamed from: b */
            public void mo19265b(Permission permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                this.f5669a.onSuccess(new FQ3(permission, false));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1471f(Permission permission) {
            super(1);
            this.f5668h = permission;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<FQ3> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<FQ3> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            DQ3.request$default(DQ3.this, this.f5668h, new C1472a(emitter), null, 4, null);
        }
    }

    static {
        Permission[] values;
        for (Permission permission : Permission.values()) {
            f5656f.put(Integer.valueOf(permission.getRequestCode()), permission);
        }
    }

    public DQ3(Activity activity, C22454gl preferences, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f5657a = activity;
        this.f5658b = preferences;
        this.f5659c = analyticsManager;
    }

    public static /* synthetic */ void request$default(DQ3 dq3, Permission permission, CQ3 cq3, CharSequence charSequence, int i, Object obj) {
        if ((i & 4) != 0) {
            charSequence = dq3.m110493d(permission);
        }
        dq3.m110487j(permission, cq3, charSequence);
    }

    /* renamed from: a */
    public final PermissionStatus m110496a(Permission permission) {
        boolean z;
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (NA0.m94303a(this.f5657a, permission.getPermission()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return PermissionStatus.GRANTED;
        }
        if (this.f5658b.m37654Z0(permission)) {
            return PermissionStatus.NEVER_ASK_AGAIN;
        }
        return PermissionStatus.DENIED;
    }

    /* renamed from: b */
    public final void m110495b(Permission permission) {
        m110482o(permission);
        CQ3 cq3 = this.f5660d;
        if (cq3 != null) {
            cq3.mo19265b(permission);
        }
    }

    /* renamed from: c */
    public final void m110494c(Permission permission) {
        m110481p(permission);
        CQ3 cq3 = this.f5660d;
        if (cq3 != null) {
            cq3.mo19266a(permission);
        }
    }

    /* renamed from: d */
    public final CharSequence m110493d(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        CharSequence text = this.f5657a.getText(permission.getRationale());
        Intrinsics.checkNotNullExpressionValue(text, "activity.getText(permission.rationale)");
        return text;
    }

    /* renamed from: e */
    public final boolean m110492e(int[] iArr) {
        return ((iArr.length == 0) ^ true) && iArr[0] == 0;
    }

    /* renamed from: f */
    public final boolean m110491f(Permission permission) {
        if (C1466b.$EnumSwitchMapping$0[permission.ordinal()] == 2) {
            if (!m110490g(permission) && NA0.m94303a(this.f5657a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return false;
            }
            return true;
        }
        return m110490g(permission);
    }

    /* renamed from: g */
    public final boolean m110490g(Permission permission) {
        return NA0.m94303a(this.f5657a, permission.getPermission()) == 0;
    }

    /* renamed from: h */
    public final void m110489h(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Permission permission = f5656f.get(Integer.valueOf(i));
        if (permission != null) {
            boolean m110492e = m110492e(grantResults);
            m110478s(permission, m110492e);
            if (m110492e) {
                m110494c(permission);
                return;
            }
            if (!C25883m3.m26445x(this.f5657a, permission.getPermission())) {
                this.f5658b.m37573s2(permission);
            }
            m110495b(permission);
        }
    }

    /* renamed from: i */
    public final void m110488i(Permission permission) {
        String[] strArr;
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        boolean z = true;
        if (i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    strArr = new String[]{permission.getPermission()};
                } else {
                    strArr = Build.VERSION.SDK_INT >= 33 ? new String[]{permission.getPermission()} : new String[0];
                }
            } else {
                strArr = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"} : new String[]{permission.getPermission()};
            }
        } else {
            strArr = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"} : new String[]{permission.getPermission()};
        }
        if (strArr.length != 0) {
            z = false;
        }
        if (z && this.f5660d != null) {
            m110494c(permission);
            return;
        }
        C25883m3.m26448u(this.f5657a, strArr, permission.getRequestCode());
        m110480q(permission);
    }

    /* renamed from: j */
    public final void m110487j(Permission permission, CQ3 listener, CharSequence rationale) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        m110479r(permission);
        this.f5660d = listener;
        if (!m110491f(permission)) {
            if (C25883m3.m26445x(this.f5657a, permission.getPermission())) {
                m110480q(permission);
                m110483n(rationale, new C1467c(permission), new C1468d(permission));
                return;
            }
            m110488i(permission);
            return;
        }
        m110494c(permission);
    }

    /* renamed from: k */
    public final AbstractC23442F<FQ3> m110486k() {
        return C45832nh5.m23305k(new C1469e());
    }

    /* renamed from: l */
    public final AbstractC23442F<FQ3> m110485l(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return C45832nh5.m23305k(new C1471f(permission));
    }

    /* renamed from: m */
    public final void m110484m(CQ3 cq3) {
        this.f5660d = cq3;
    }

    /* renamed from: n */
    public final void m110483n(CharSequence charSequence, Function1<? super MaterialDialog, Unit> function1, Function1<? super MaterialDialog, Unit> function12) {
        if (!this.f5657a.isFinishing()) {
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(this.f5657a, null, 2, null), null, charSequence, null, 5, null), 17039370, null, function1, 2, null), 17039360, null, function12, 2, null).show();
        }
    }

    /* renamed from: o */
    public final void m110482o(Permission permission) {
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f5659c.mo55905y(new C37654Zv2(null, null, null, "denied", 7, null));
                return;
            }
            return;
        }
        this.f5659c.mo55905y(new C39848dc0(null, null, null, "denied", 7, null));
    }

    /* renamed from: p */
    public final void m110481p(Permission permission) {
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (Build.VERSION.SDK_INT < 29) {
                    this.f5659c.mo55905y(new C37654Zv2(null, null, null, "always", 7, null));
                    return;
                } else {
                    this.f5659c.mo55905y(new C37654Zv2(null, null, null, "when_in_use", 7, null));
                    return;
                }
            }
            return;
        }
        this.f5659c.mo55905y(new C39848dc0(null, null, null, "authorized", 7, null));
    }

    /* renamed from: q */
    public final void m110480q(Permission permission) {
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f5659c.mo55905y(new C37420Yv2(null, null, null, 7, null));
                return;
            }
            return;
        }
        this.f5659c.mo55905y(new C39237cc0(null, null, null, 7, null));
    }

    /* renamed from: r */
    public final void m110479r(Permission permission) {
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f5659c.mo55956N(new LocationPermissionsRequested());
                return;
            }
            return;
        }
        this.f5659c.mo55956N(new CameraPermissionsRequested());
    }

    /* renamed from: s */
    public final void m110478s(Permission permission, boolean z) {
        int i = C1466b.$EnumSwitchMapping$0[permission.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f5659c.mo55956N(new LocationPermissionsResponded(z));
                return;
            }
            return;
        }
        this.f5659c.mo55956N(new CameraPermissionsResponded(z));
    }
}
