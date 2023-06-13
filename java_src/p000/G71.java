package p000;

import android.content.Intent;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BarcodeDriversLicense;
import co.bird.android.model.analytics.IdBackScanned;
import co.bird.android.model.analytics.IdScannerOpened;
import co.bird.android.model.analytics.IdStoreFailed;
import co.bird.android.model.analytics.IdSubmitted;
import co.bird.android.model.constant.IdCardTerminology;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationEntry;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationIngestionResult;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationRejectionReason;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.identification.IdentificationSubmissionData;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.C0774Bx;
import p000.C2029Ey;
import p000.G71;
import p000.H31;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cBk\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\b\b\u0001\u00105\u001a\u000202\u0012\b\b\u0001\u00109\u001a\u000206\u0012\b\b\u0001\u0010=\u001a\u00020:\u0012\b\b\u0001\u0010A\u001a\u00020>\u0012\b\b\u0001\u0010E\u001a\u00020B¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\"\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u001a\u001a\u00020\r*\u00020\rR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m28432d2 = {"LG71;", "Lt71;", "Lzy;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lr71;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/BarcodeDriversLicense;", "driverLicense", "Lio/reactivex/c;", "z", "Lco/bird/android/model/identification/IdentificationRejectionReason;", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "ingestionResult", "", "o", "Landroid/content/Intent;", "intent", "", "b", "onPause", "onResume", "onDestroy", "", "requestCode", "resultCode", "onActivityResult", "n", "LmT1;", C17296a.f69688o, "LmT1;", "identificationManager", "LEa;", "LEa;", "analyticsManager", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", "LEg1;", DateTokenConverter.CONVERTER_KEY, "LEg1;", "eventBus", "LTq4;", "e", "LTq4;", "reactiveConfig", "Lgl;", "f", "Lgl;", "preference", "Lco/bird/android/core/mvp/BaseActivity;", "g", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LM71;", "i", "LM71;", "ui", "Le13;", "j", "Le13;", "navigator", "LzN5;", "k", "LzN5;", "soundManager", "", "l", "Z", "useIdCard", "Lco/bird/android/model/constant/IdCardTerminology;", "m", "Lco/bird/android/model/constant/IdCardTerminology;", "idCardTerminologyType", "<init>", "(LmT1;LEa;Landroid/os/Handler;LEg1;LTq4;Lgl;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LM71;Le13;LzN5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDriverLicenseScanV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Presenter.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2PresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,309:1\n1#2:310\n237#3:311\n180#3:312\n180#3:313\n*S KotlinDebug\n*F\n+ 1 DriverLicenseScanV2Presenter.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2PresenterImpl\n*L\n155#1:311\n169#1:312\n179#1:313\n*E\n"})
/* renamed from: G71 */
/* loaded from: classes2.dex */
public final class G71 implements InterfaceC49051t71 {

    /* renamed from: n */
    public static final C2654a f10988n = new C2654a(null);

    /* renamed from: o */
    public static final int f10989o = 8;

    /* renamed from: a */
    public final InterfaceC45102mT1 f10990a;

    /* renamed from: b */
    public final InterfaceC1880Ea f10991b;

    /* renamed from: c */
    public final Handler f10992c;

    /* renamed from: d */
    public final InterfaceC32604Eg1 f10993d;

    /* renamed from: e */
    public final C36207Tq4 f10994e;

    /* renamed from: f */
    public final C22454gl f10995f;

    /* renamed from: g */
    public final BaseActivity f10996g;

    /* renamed from: h */
    public final ScopeProvider f10997h;

    /* renamed from: i */
    public final M71 f10998i;

    /* renamed from: j */
    public final InterfaceC40099e13 f10999j;

    /* renamed from: k */
    public final C52759zN5 f11000k;

    /* renamed from: l */
    public final boolean f11001l;

    /* renamed from: m */
    public final IdCardTerminology f11002m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LG71$a;", "", "", "MINIMUM_AGE", "I", "REQUEST_CODE", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: G71$a */
    /* loaded from: classes2.dex */
    public static final class C2654a {
        public /* synthetic */ C2654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2654a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G71$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2655b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2655b f11003b = new C2655b();

        public C2655b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lzy;", "barcodeHolder", "", C17296a.f69688o, "(Lzy;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G71$c */
    /* loaded from: classes2.dex */
    public static final class C2656c extends Lambda implements Function1<C31597zy, Boolean> {

        /* renamed from: g */
        public static final C2656c f11004g = new C2656c();

        public C2656c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C31597zy barcodeHolder) {
            C0774Bx.C0775a c0775a;
            boolean z;
            Intrinsics.checkNotNullParameter(barcodeHolder, "barcodeHolder");
            C0774Bx m82b = barcodeHolder.m82b();
            if (m82b != null) {
                c0775a = m82b.m113298c();
            } else {
                c0775a = null;
            }
            if (c0775a != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lzy;", "barcodeHolder", "Lr71;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lzy;)Lr71;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G71$d */
    /* loaded from: classes2.dex */
    public static final class C2657d extends Lambda implements Function1<C31597zy, C47866r71> {
        public C2657d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C47866r71 invoke(C31597zy barcodeHolder) {
            Intrinsics.checkNotNullParameter(barcodeHolder, "barcodeHolder");
            return G71.this.m105760C(barcodeHolder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lr71;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lr71;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDriverLicenseScanV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Presenter.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2PresenterImpl$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"})
    /* renamed from: G71$e */
    /* loaded from: classes2.dex */
    public static final class C2658e extends Lambda implements Function1<C47866r71, Unit> {
        public C2658e() {
            super(1);
        }

        /* renamed from: a */
        public final void m105732a(C47866r71 c47866r71) {
            AbstractC5751Ny m16468a = c47866r71.m16468a();
            G71.this.f10991b.mo55956N(new IdBackScanned());
            G71.this.f11000k.m1478b();
            if (m16468a != null) {
                H31.C3014a.showDialog$default(G71.this.f10998i, m16468a, false, false, null, null, null, null, 126, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47866r71 c47866r71) {
            m105732a(c47866r71);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lr71;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lr71;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G71$f */
    /* loaded from: classes2.dex */
    public static final class C2659f extends Lambda implements Function1<C47866r71, Boolean> {

        /* renamed from: g */
        public static final C2659f f11007g = new C2659f();

        public C2659f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C47866r71 c47866r71) {
            boolean z;
            Intrinsics.checkNotNullParameter(c47866r71, "<name for destructuring parameter 0>");
            AbstractC5751Ny m16468a = c47866r71.m16468a();
            BarcodeDriversLicense m16467b = c47866r71.m16467b();
            if (m16468a == null && m16467b != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lr71;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lr71;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G71$g */
    /* loaded from: classes2.dex */
    public static final class C2660g extends Lambda implements Function1<C47866r71, InterfaceC23496h> {
        public C2660g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C47866r71 c47866r71) {
            AbstractC23461c m105735z;
            Intrinsics.checkNotNullParameter(c47866r71, "<name for destructuring parameter 0>");
            BarcodeDriversLicense m16467b = c47866r71.m16467b();
            if (m16467b == null || (m105735z = G71.this.m105735z(m16467b)) == null) {
                return AbstractC23461c.m33080F(new NullPointerException("Expected driver license object but received null"));
            }
            return m105735z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G71$h */
    /* loaded from: classes2.dex */
    public static final class C2661h extends Lambda implements Function1<Throwable, Unit> {
        public C2661h() {
            super(1);
        }

        /* renamed from: b */
        public static final void m105728b(G71 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f10999j.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            G71.this.f10998i.error(C45871nl4.error_generic_body);
            Handler handler = G71.this.f10992c;
            final G71 g71 = G71.this;
            handler.postDelayed(new Runnable() { // from class: H71
                @Override // java.lang.Runnable
                public final void run() {
                    G71.C2661h.m105728b(G71.this);
                }
            }, 3000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G71$i */
    /* loaded from: classes2.dex */
    public static final class C2662i extends Lambda implements Function1<Unit, Unit> {
        public C2662i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            G71.this.f10991b.mo55905y(new FP1(null, null, null, 7, null));
            G71.this.f10999j.mo37009i0(10041);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G71$j */
    /* loaded from: classes2.dex */
    public static final class C2663j extends Lambda implements Function1<Unit, Unit> {
        public C2663j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            G71.this.f10991b.mo55905y(new UP1(null, null, null, G71.this.f10994e.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle(), "barcode", 7, null));
            G71.this.f10999j.mo37180E(MapMode.RIDER, G71.this.f10994e.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G71$k */
    /* loaded from: classes2.dex */
    public static final class C2664k extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {
        public C2664k() {
            super(1);
        }

        /* renamed from: a */
        public final void m105727a(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
            G71.this.f10991b.mo55956N(new IdSubmitted(IdSubmitted.IdSource.SCAN));
            G71.this.f10991b.mo55905y(new IP1(null, null, null, 7, null));
            G71.this.f10993d.mo104915c(new P71());
            G71.this.f10999j.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
            m105727a(identificationIntentPermissionStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G71$l */
    /* loaded from: classes2.dex */
    public static final class C2665l extends Lambda implements Function1<Throwable, Unit> {
        public C2665l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            G71.this.f10991b.mo55956N(new IdStoreFailed());
            G71.this.f10991b.mo55905y(new HP1(null, null, null, 7, null));
            if (th instanceof RetrofitException) {
                G71.this.f10998i.error(((C49375tg1) ((RetrofitException) th).m53929a(C49375tg1.class)).m11932c());
            } else {
                G71.this.f10998i.error(C45871nl4.failed_to_validate_driver_license);
            }
            G71.this.f10999j.mo37030e3();
            C41318g46.m40159e(th);
        }
    }

    public G71(InterfaceC45102mT1 identificationManager, InterfaceC1880Ea analyticsManager, Handler handler, InterfaceC32604Eg1 eventBus, C36207Tq4 reactiveConfig, C22454gl preference, BaseActivity activity, ScopeProvider scopeProvider, M71 ui, InterfaceC40099e13 navigator, C52759zN5 soundManager) {
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(soundManager, "soundManager");
        this.f10990a = identificationManager;
        this.f10991b = analyticsManager;
        this.f10992c = handler;
        this.f10993d = eventBus;
        this.f10994e = reactiveConfig;
        this.f10995f = preference;
        this.f10996g = activity;
        this.f10997h = scopeProvider;
        this.f10998i = ui;
        this.f10999j = navigator;
        this.f11000k = soundManager;
        this.f11001l = reactiveConfig.m82623f8().getValue().getEnableIdCardStringSwap();
        this.f11002m = reactiveConfig.m82623f8().getValue().getIdCardTerminology();
    }

    /* renamed from: A */
    public static final void m105762A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m105761B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m105745p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q */
    public static final C47866r71 m105744q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C47866r71) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m105743r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final boolean m105742s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t */
    public static final InterfaceC23496h m105741t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m105740u() {
    }

    /* renamed from: v */
    public static final void m105739v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m105738w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m105737x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m105736y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47866r71 m105760C(C31597zy c31597zy) {
        boolean z;
        Calendar calendar;
        Calendar calendar2;
        boolean isBlank;
        BarcodeDriversLicense m81c = c31597zy.m81c();
        if (m81c != null) {
            String licenseNumber = m81c.getLicenseNumber();
            if (licenseNumber != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(licenseNumber);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        String birthDate = m81c.getBirthDate();
                        if (birthDate != null) {
                            calendar = L71.m97755b(birthDate);
                        } else {
                            calendar = null;
                        }
                        if (calendar != null && C50838w80.m7367a(calendar) >= 18) {
                            String expiryDate = m81c.getExpiryDate();
                            if (expiryDate != null) {
                                calendar2 = L71.m97755b(expiryDate);
                            } else {
                                calendar2 = null;
                            }
                            if (calendar2 != null && !L71.m97756a(calendar2)) {
                                return new C47866r71(null, m81c);
                            }
                            return new C47866r71(new C37081Xj5(this.f11001l, this.f11002m), m81c);
                        }
                        return new C47866r71(C36847Wj5.f41869d, m81c);
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        return new C47866r71(new C37315Yj5(this.f11001l, this.f11002m), m81c);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    @Override // p000.InterfaceC49051t71
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo13040b(Intent intent) {
        IdentificationIntentPermissionStatus identificationIntentPermissionStatus;
        int i;
        boolean z;
        IdentificationStatus identificationStatus;
        String str;
        DateTime dateTime;
        IdentificationEntry idCard;
        boolean z2;
        IdentificationEntry idCard2;
        String expiresAt;
        boolean isBlank;
        List<IdentificationAcceptableMethod> acceptableMethods;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f10991b.mo55956N(new IdScannerOpened());
        this.f10991b.mo55905y(new JP1(null, null, null, "Barcode", 7, null));
        ZV1 m59035e = this.f10990a.mo25562g().m73665a().m59035e();
        IdentificationIngestionResult identificationIngestionResult = null;
        if (m59035e != null) {
            identificationIntentPermissionStatus = m59035e.m73012b();
        } else {
            identificationIntentPermissionStatus = null;
        }
        if (identificationIntentPermissionStatus != null && (acceptableMethods = identificationIntentPermissionStatus.getAcceptableMethods()) != null) {
            i = acceptableMethods.size();
        } else {
            i = 0;
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        if (identificationIntentPermissionStatus != null) {
            identificationStatus = identificationIntentPermissionStatus.getStatus();
        } else {
            identificationStatus = null;
        }
        if (identificationStatus == IdentificationStatus.REJECTED) {
            try {
                idCard2 = identificationIntentPermissionStatus.getIdCard();
            } catch (Exception e) {
                IdentificationEntry idCard3 = identificationIntentPermissionStatus.getIdCard();
                if (idCard3 != null) {
                    str = idCard3.getExpiresAt();
                } else {
                    str = null;
                }
                C41318g46.m40161c(e, "Could not parse date from string " + str, new Object[0]);
            }
            if (idCard2 != null && (expiresAt = idCard2.getExpiresAt()) != null) {
                dateTime = DateTime.parse(expiresAt);
                if (identificationIntentPermissionStatus.getRejectionReason() == IdentificationRejectionReason.EXPIRED) {
                    if (dateTime != null && dateTime.isAfterNow()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        M71 m71 = this.f10998i;
                        H31.C3014a.showDialog$default(m71, m71.getString(C45871nl4.please_scan_id_again, new Object[0]), this.f10998i.getString(C45871nl4.rescan_explanation, new Object[0]), null, null, false, false, null, null, null, 508, null);
                    }
                }
                M71 m712 = this.f10998i;
                String string = m712.getString(C45871nl4.error_generic_title, new Object[0]);
                M71 m713 = this.f10998i;
                int i2 = C45871nl4.identification_status_rejected_with_reason;
                Object[] objArr = new Object[1];
                IdentificationRejectionReason rejectionReason = identificationIntentPermissionStatus.getRejectionReason();
                idCard = identificationIntentPermissionStatus.getIdCard();
                if (idCard != null) {
                    identificationIngestionResult = idCard.getIngestionResult();
                }
                objArr[0] = m105746o(rejectionReason, identificationIngestionResult);
                H31.C3014a.showDialog$default(m712, string, m713.getString(i2, objArr), null, null, false, false, null, null, null, 508, null);
            }
            dateTime = null;
            if (identificationIntentPermissionStatus.getRejectionReason() == IdentificationRejectionReason.EXPIRED) {
            }
            M71 m7122 = this.f10998i;
            String string2 = m7122.getString(C45871nl4.error_generic_title, new Object[0]);
            M71 m7132 = this.f10998i;
            int i22 = C45871nl4.identification_status_rejected_with_reason;
            Object[] objArr2 = new Object[1];
            IdentificationRejectionReason rejectionReason2 = identificationIntentPermissionStatus.getRejectionReason();
            idCard = identificationIntentPermissionStatus.getIdCard();
            if (idCard != null) {
            }
            objArr2[0] = m105746o(rejectionReason2, identificationIngestionResult);
            H31.C3014a.showDialog$default(m7122, string2, m7132.getString(i22, objArr2), null, null, false, false, null, null, null, 508, null);
        }
        AbstractC24490k<C31597zy> flowable = this.f10998i.mo92886Ai().toFlowable(EnumC23460b.LATEST);
        final C2656c c2656c = C2656c.f11004g;
        AbstractC24490k<C31597zy> m32175S = flowable.m32175S(new InterfaceC23494q() { // from class: y71
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m105745p;
                m105745p = G71.m105745p(Function1.this, obj);
                return m105745p;
            }
        });
        final C2657d c2657d = new C2657d();
        AbstractC24490k m32111s0 = m32175S.m32117q0(new InterfaceC23492o() { // from class: z71
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C47866r71 m105744q;
                m105744q = G71.m105744q(Function1.this, obj);
                return m105744q;
            }
        }).m32111s0(C23454a.m33087a());
        final C2658e c2658e = new C2658e();
        AbstractC24490k m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: A71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105743r(Function1.this, obj);
            }
        });
        final C2659f c2659f = C2659f.f11007g;
        AbstractC23442F firstOrError = m32191K.m32175S(new InterfaceC23494q() { // from class: B71
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m105742s;
                m105742s = G71.m105742s(Function1.this, obj);
                return m105742s;
            }
        }).m32111s0(C24542a.m31932c()).m32113r1().firstOrError();
        final C2660g c2660g = new C2660g();
        AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: C71
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m105741t;
                m105741t = G71.m105741t(Function1.this, obj);
                return m105741t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun onCreate(in…      }, (Timber::e))\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(this.f10997h));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: D71
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                G71.m105740u();
            }
        };
        final C2661h c2661h = new C2661h();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: E71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105739v(Function1.this, obj);
            }
        });
        this.f10998i.mo92882Ue(C45871nl4.driver_license_alternate_id);
        this.f10998i.mo92884Dh(z);
        Observable<Unit> observeOn = this.f10998i.mo92885C1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.takePhotoButtonClicks…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f10997h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2662i c2662i = new C2662i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: F71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105738w(Function1.this, obj);
            }
        });
        M71 m714 = this.f10998i;
        isBlank = StringsKt__StringsJVMKt.isBlank(this.f10994e.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle());
        m714.mo92881f0(!isBlank);
        Observable<Unit> observeOn2 = this.f10998i.mo92880ul().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.helpClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f10997h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2663j c2663j = new C2663j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: v71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105737x(Function1.this, obj);
            }
        };
        final C2655b c2655b = C2655b.f11003b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: w71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105736y(Function1.this, obj);
            }
        });
    }

    /* renamed from: n */
    public final String m105747n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int hashCode = str.hashCode();
        if (hashCode != 0) {
            if (hashCode != 66480) {
                if (hashCode != 84323 || !str.equals("USA")) {
                    return str;
                }
            } else if (str.equals("CAN")) {
                return "CA";
            } else {
                return str;
            }
        } else if (!str.equals("")) {
            return str;
        }
        return "US";
    }

    /* renamed from: o */
    public final String m105746o(IdentificationRejectionReason identificationRejectionReason, IdentificationIngestionResult identificationIngestionResult) {
        String str;
        int i;
        boolean z;
        Integer explanationResId;
        if (identificationIngestionResult != null && (explanationResId = identificationIngestionResult.explanationResId()) != null) {
            str = this.f10998i.getString(explanationResId.intValue(), new Object[0]);
        } else {
            str = null;
        }
        if (identificationRejectionReason != null) {
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            i = identificationRejectionReason.explanationResId(z);
        } else {
            i = C45871nl4.identification_reject_explanation_unknown;
        }
        if (identificationRejectionReason == IdentificationRejectionReason.INGESTION_FAILURE && str != null) {
            return this.f10998i.getString(i, str);
        }
        return this.f10998i.getString(i, new Object[0]);
    }

    @Override // p000.InterfaceC49051t71
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10041) {
            Intent intent2 = new Intent();
            intent2.putExtra("skipped_barcode_scan", true);
            this.f10999j.mo37029e4(i2, intent2);
        }
    }

    @Override // p000.InterfaceC49051t71
    public void onDestroy() {
        this.f11000k.m1476d();
    }

    @Override // p000.InterfaceC49051t71
    public void onPause() {
    }

    @Override // p000.InterfaceC49051t71
    public void onResume() {
        this.f10991b.mo55905y(new GP1(null, null, null, this.f10994e.m82623f8().m73665a().getIdentificationConfig().getOnboardingBeforePayment(), 7, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r13 == null) goto L15;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC23461c m105735z(BarcodeDriversLicense barcodeDriversLicense) {
        String str;
        byte[] bArr;
        IdentificationRequestIdentifier mo25559j = this.f10990a.mo25559j();
        if (mo25559j == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("No current session identifier found"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(NullPointerExcepti…ssion identifier found\"))");
            return m33080F;
        }
        InterfaceC45102mT1 interfaceC45102mT1 = this.f10990a;
        IdentificationEntryMethod identificationEntryMethod = IdentificationEntryMethod.BARCODE_ONLY;
        IdentificationDocumentType identificationDocumentType = IdentificationDocumentType.DRIVER_LICENSE;
        String issuingCountry = barcodeDriversLicense.getIssuingCountry();
        if (issuingCountry != null) {
            str = m105747n(issuingCountry);
        } else {
            str = null;
        }
        C2029Ey.C2031b m108181b = C2029Ey.m108181b();
        String rawValue = barcodeDriversLicense.getRawValue();
        if (rawValue != null) {
            bArr = rawValue.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
        }
        bArr = new byte[0];
        AbstractC23442F progress$default = C28237sD.progress$default(interfaceC45102mT1.mo25565d(mo25559j, identificationEntryMethod, identificationDocumentType, null, null, str, null, null, new IdentificationSubmissionData(m108181b.m108172e(bArr), null, null, null, null, 30, null)), this.f10998i, 0, 2, (Object) null);
        final C2664k c2664k = new C2664k();
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: u71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105762A(Function1.this, obj);
            }
        });
        final C2665l c2665l = new C2665l();
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: x71
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G71.m105761B(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun submitIdenti…     .ignoreElement()\n  }");
        return m33159G;
    }
}
