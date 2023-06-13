package p000;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.wire.configs.ParkingLocationVerificationMethod;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ArCoreApk;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010=\u001a\u00020;¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JS\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016Jo\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJq\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b \u0010!J.\u0010#\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0019\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010<R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010DR\u0016\u0010J\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0018\u0010L\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010KR\u0016\u0010N\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010KR4\u0010V\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020@ R*\n\u0012\u0004\u0012\u00020@\u0018\u00010?0?0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b+\u0010UR \u0010X\u001a\b\u0012\u0004\u0012\u00020\f0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\b8\u0010U¨\u0006["}, m28432d2 = {"Lvm;", "Ltm;", "", "e", "", "resolveContext", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;", "method", "rideId", "birdId", "closestNestId", "", "insideNest", "Lorg/joda/time/DateTime;", "time", "skipBirdScan", "h", "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "j", "i", "stage", "Lco/bird/android/model/ParkingNest;", "parkingNest", "", "bestAccuracyMeters", "currentAccuracyMeters", "locationSource", "g", "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "failureReason", "finalAccuracyMeters", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "reason", "c", "l", "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;)Ljava/lang/Double;", "n", "Lbn;", "Lbn;", "areaManager", "Ldr4;", "b", "Ldr4;", "locationManager", "LEa;", "LEa;", "analyticsManager", "LTq4;", "LTq4;", "config", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "LXc1;", "LXc1;", "endRideManager", "La94;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$Availability;", "La94;", "arCoreAvailabilityRelay", "arCoreUnavailableRelay", "Lorg/joda/time/DateTime;", "startTime", "k", "vpsAccuracyMetTime", "birdQrTrackingTime", "m", "currentStageStartTime", "Ljava/lang/String;", "currentSessionId", "o", "currentStage", "p", "currentResolveContext", "LZ84;", "kotlin.jvm.PlatformType", "q", "LZ84;", "()LZ84;", "arCoreAvailability", "r", "arCoreUnavailable", "<init>", "(Lbn;Ldr4;LEa;LTq4;Landroid/content/Context;Landroid/os/Handler;LXc1;)V", "ar_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArManagerImpl.kt\nco/bird/android/manager/ArManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
/* renamed from: vm */
/* loaded from: classes4.dex */
public final class C29621vm implements InterfaceC28816tm {

    /* renamed from: a */
    public final InterfaceC12495bn f114577a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f114578b;

    /* renamed from: c */
    public final InterfaceC1880Ea f114579c;

    /* renamed from: d */
    public final C36207Tq4 f114580d;

    /* renamed from: e */
    public final Context f114581e;

    /* renamed from: f */
    public final Handler f114582f;

    /* renamed from: g */
    public final InterfaceC37014Xc1 f114583g;

    /* renamed from: h */
    public final C37791a94<Optional<ArCoreApk.Availability>> f114584h;

    /* renamed from: i */
    public final C37791a94<Boolean> f114585i;

    /* renamed from: j */
    public DateTime f114586j;

    /* renamed from: k */
    public DateTime f114587k;

    /* renamed from: l */
    public DateTime f114588l;

    /* renamed from: m */
    public DateTime f114589m;

    /* renamed from: n */
    public String f114590n;

    /* renamed from: o */
    public String f114591o;

    /* renamed from: p */
    public String f114592p;

    /* renamed from: q */
    public final Z84<Optional<ArCoreApk.Availability>> f114593q;

    /* renamed from: r */
    public final Z84<Boolean> f114594r;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vm$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29622a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParkingLocationVerificationMethod.values().length];
            try {
                iArr[ParkingLocationVerificationMethod.GOOGLE_VPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C29621vm(InterfaceC12495bn areaManager, InterfaceC40001dr4 locationManager, InterfaceC1880Ea analyticsManager, C36207Tq4 config, Context context, Handler handler, InterfaceC37014Xc1 endRideManager) {
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        this.f114577a = areaManager;
        this.f114578b = locationManager;
        this.f114579c = analyticsManager;
        this.f114580d = config;
        this.f114581e = context;
        this.f114582f = handler;
        this.f114583g = endRideManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        C37791a94<Optional<ArCoreApk.Availability>> create$default = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        this.f114584h = create$default;
        C37791a94<Boolean> create$default2 = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f114585i = create$default2;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f114589m = now;
        this.f114591o = "pre-init";
        Z84.C10119a c10119a = Z84.f47888d;
        this.f114593q = c10119a.m73663b(create$default);
        this.f114594r = c10119a.m73663b(create$default2);
    }

    /* renamed from: m */
    public static final void m8182m(C29621vm this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo8190e();
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: a */
    public void mo8194a(ParkingLocationVerificationMethod method, String str, String str2, ParkingNest parkingNest, Boolean bool, String str3, Double d, Double d2, Boolean bool2, String str4) {
        Unit unit;
        String str5;
        Intrinsics.checkNotNullParameter(method, "method");
        String str6 = null;
        if (str3 != null) {
            InterfaceC1880Ea interfaceC1880Ea = this.f114579c;
            String obj = method.toString();
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            DateTime dateTime = this.f114586j;
            if (dateTime == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startTime");
                dateTime = null;
            }
            double abs = Math.abs(C46880pT0.m19253i(now, dateTime));
            Double m8183l = m8183l(method);
            if (parkingNest != null) {
                str5 = parkingNest.getId();
            } else {
                str5 = null;
            }
            interfaceC1880Ea.mo55905y(new C43792kF3(null, null, null, str2, obj, str3, null, abs, m8183l, str, str5, bool, d, this.f114583g.mo55540n(), this.f114590n, this.f114592p, bool2, str4, this.f114591o, 71, null));
            mo8188g(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, "failed", str, str2, parkingNest, bool, d, d2, bool2, str4);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            InterfaceC1880Ea interfaceC1880Ea2 = this.f114579c;
            String obj2 = method.toString();
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            DateTime dateTime2 = this.f114586j;
            if (dateTime2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startTime");
                dateTime2 = null;
            }
            double abs2 = Math.abs(C46880pT0.m19253i(now2, dateTime2));
            Double m8183l2 = m8183l(method);
            Double m8181n = m8181n(method);
            if (parkingNest != null) {
                str6 = parkingNest.getId();
            }
            interfaceC1880Ea2.mo55905y(new C44978mF3(null, null, null, str2, obj2, abs2, m8183l2, m8181n, str, str6, bool, d, d2, this.f114583g.mo55540n(), this.f114590n, this.f114592p, bool2, str4, this.f114591o, 7, null));
            mo8188g(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, "success", str, str2, parkingNest, bool, d, d2, bool2, str4);
        }
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: b */
    public Z84<Optional<ArCoreApk.Availability>> mo8193b() {
        return this.f114593q;
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: c */
    public void mo8192c(ParkingLocationVerificationMethod method, String str, String str2, String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(method, "method");
        InterfaceC1880Ea interfaceC1880Ea = this.f114579c;
        String mo55540n = this.f114583g.mo55540n();
        String obj = method.toString();
        if (str3 == null) {
            str4 = "unknown";
        } else {
            str4 = str3;
        }
        interfaceC1880Ea.mo55905y(new C45571nF3(null, null, null, str2, str, mo55540n, obj, str4, 7, null));
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: d */
    public void mo8191d(String resolveContext) {
        Intrinsics.checkNotNullParameter(resolveContext, "resolveContext");
        this.f114592p = resolveContext;
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: e */
    public void mo8190e() {
        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(this.f114581e);
        Intrinsics.checkNotNullExpressionValue(checkAvailability, "getInstance().checkAvailability(context)");
        if (checkAvailability.isTransient()) {
            this.f114582f.postDelayed(new Runnable() { // from class: um
                @Override // java.lang.Runnable
                public final void run() {
                    C29621vm.m8182m(C29621vm.this);
                }
            }, 200L);
        } else if (checkAvailability.isSupported()) {
            this.f114584h.accept(Optional.f63040c.m59032c(checkAvailability));
            if (this.f114585i.getValue().booleanValue()) {
                this.f114585i.accept(Boolean.FALSE);
            }
        } else {
            this.f114585i.accept(Boolean.TRUE);
        }
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: f */
    public Z84<Boolean> mo8189f() {
        return this.f114594r;
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: g */
    public void mo8188g(ParkingLocationVerificationMethod method, String stage, String str, String str2, ParkingNest parkingNest, Boolean bool, Double d, Double d2, Boolean bool2, String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(stage, "stage");
        String str5 = this.f114591o;
        DateTime dateTime = this.f114589m;
        this.f114591o = stage;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f114589m = now;
        InterfaceC1880Ea interfaceC1880Ea = this.f114579c;
        String str6 = this.f114590n;
        if (str6 == null) {
            str6 = "none";
        }
        String obj = method.toString();
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        double abs = Math.abs(C46880pT0.m19253i(now2, dateTime));
        DateTime dateTime2 = null;
        if (parkingNest != null) {
            str4 = parkingNest.getId();
        } else {
            str4 = null;
        }
        String mo55540n = this.f114583g.mo55540n();
        String str7 = this.f114592p;
        DateTime now3 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now3, "now()");
        DateTime dateTime3 = this.f114586j;
        if (dateTime3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startTime");
        } else {
            dateTime2 = dateTime3;
        }
        interfaceC1880Ea.mo55905y(new C43199jF3(null, null, null, str6, str2, obj, abs, str5, stage, str, str4, bool, str3, d, d2, mo55540n, str7, bool2, Double.valueOf(Math.abs(C46880pT0.m19253i(now3, dateTime2))), 7, null));
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: h */
    public void mo8187h(ParkingLocationVerificationMethod method, String str, String str2, String str3, Boolean bool, DateTime dateTime, Boolean bool2) {
        DateTime dateTime2;
        Intrinsics.checkNotNullParameter(method, "method");
        if (dateTime == null) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
        this.f114586j = dateTime2;
        this.f114587k = null;
        this.f114588l = null;
        this.f114590n = UUID.randomUUID().toString();
        this.f114591o = "start";
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f114589m = now;
        this.f114579c.mo55905y(new C44385lF3(null, null, null, str2, method.toString(), str, str3, bool, this.f114583g.mo55540n(), this.f114590n, this.f114592p, bool2, 7, null));
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: i */
    public void mo8186i(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f114588l = DateTime.now();
    }

    @Override // p000.InterfaceC28816tm
    /* renamed from: j */
    public void mo8185j() {
        if (this.f114587k == null) {
            this.f114587k = DateTime.now();
        }
    }

    /* renamed from: l */
    public final Double m8183l(ParkingLocationVerificationMethod parkingLocationVerificationMethod) {
        DateTime dateTime;
        DateTime dateTime2;
        if (C29622a.$EnumSwitchMapping$0[parkingLocationVerificationMethod.ordinal()] != 1 || (dateTime = this.f114587k) == null || (dateTime2 = this.f114588l) == null) {
            return null;
        }
        return Double.valueOf(Math.abs(C46880pT0.m19253i(dateTime2, dateTime)));
    }

    /* renamed from: n */
    public final Double m8181n(ParkingLocationVerificationMethod parkingLocationVerificationMethod) {
        DateTime dateTime;
        DateTime dateTime2 = null;
        if (C29622a.$EnumSwitchMapping$0[parkingLocationVerificationMethod.ordinal()] != 1 || (dateTime = this.f114587k) == null) {
            return null;
        }
        DateTime dateTime3 = this.f114586j;
        if (dateTime3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startTime");
        } else {
            dateTime2 = dateTime3;
        }
        return Double.valueOf(Math.abs(C46880pT0.m19253i(dateTime, dateTime2)));
    }
}
