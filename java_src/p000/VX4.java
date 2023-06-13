package p000;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ride.presenter.PaymentIntentException;
import co.bird.android.app.feature.ride.presenter.PaymentIntentStatusException;
import co.bird.android.buava.Optional;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.PAYMENT_METHOD_CREATED;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.REQUIRES_AUTHENTICATION;
import co.bird.android.model.REQUIRES_CONFIRMATION;
import co.bird.android.model.REQUIRES_PAYMENT_METHOD;
import co.bird.android.model.UNEXPECTED;
import co.bird.android.model.UNKNOWN;
import co.bird.android.model.wire.WireRide;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.StartRideBodyWithIntent;
import co.bird.api.request.StartRideChargeType;
import co.bird.api.response.StartRidePaymentResponse;
import co.bird.api.response.StartRideWithIntentResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.VX4;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 \u0012\b\b\u0001\u0010'\u001a\u00020$¢\u0006\u0004\b1\u00102J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m28432d2 = {"LVX4;", "LNX4;", "", "requestCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Lco/bird/api/request/StartRideBodyWithIntent;", "body", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireRide;", "b", "n", "LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "j", "s", "LNP4;", "LNP4;", "rideClient", "LXW2;", "LXW2;", "multiRideClient", "LpM3;", "c", "LpM3;", "manager", "Lwi2;", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "jsonDeserializer", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/appcompat/app/AppCompatActivity;", "f", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "La94;", "Lco/bird/android/buava/Optional;", "g", "La94;", "startRideBody", "Lco/bird/api/request/StartRideChargeType;", "h", "Lco/bird/api/request/StartRideChargeType;", "chargeType", "<init>", "(LNP4;LXW2;LpM3;Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/ride/presenter/RidePaymentIntentDelegateImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,193:1\n237#2:194\n*S KotlinDebug\n*F\n+ 1 RidePaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/ride/presenter/RidePaymentIntentDelegateImpl\n*L\n65#1:194\n*E\n"})
/* renamed from: VX4 */
/* loaded from: classes2.dex */
public final class VX4 implements NX4 {

    /* renamed from: a */
    public final NP4 f39193a;

    /* renamed from: b */
    public final XW2 f39194b;

    /* renamed from: c */
    public final InterfaceC46820pM3 f39195c;

    /* renamed from: d */
    public final C51174wi2 f39196d;

    /* renamed from: e */
    public final ScopeProvider f39197e;

    /* renamed from: f */
    public final AppCompatActivity f39198f;

    /* renamed from: g */
    public final C37791a94<Optional<StartRideBodyWithIntent>> f39199g;

    /* renamed from: h */
    public StartRideChargeType f39200h;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: VX4$a */
    /* loaded from: classes2.dex */
    public static final class C8664a extends Lambda implements Function1<HM4<StartRideWithIntentResponse>, Unit> {
        public C8664a() {
            super(1);
        }

        /* renamed from: a */
        public final void m79800a(HM4<StartRideWithIntentResponse> hm4) {
            StartRideWithIntentResponse m103944a;
            String intentId;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                VX4 vx4 = VX4.this;
                StartRidePaymentResponse payment = m103944a.getPayment();
                if (payment != null && (intentId = payment.getIntentId()) != null) {
                    InterfaceC46820pM3 interfaceC46820pM3 = vx4.f39195c;
                    StartRidePaymentResponse payment2 = m103944a.getPayment();
                    Intrinsics.checkNotNull(payment2);
                    String clientSecret = payment2.getClientSecret();
                    Intrinsics.checkNotNull(clientSecret);
                    interfaceC46820pM3.mo8809h(intentId, clientSecret);
                    StartRidePaymentResponse payment3 = m103944a.getPayment();
                    Intrinsics.checkNotNull(payment3);
                    StartRideChargeType chargeType = payment3.getChargeType();
                    Intrinsics.checkNotNull(chargeType);
                    vx4.f39200h = chargeType;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<StartRideWithIntentResponse> hm4) {
            m79800a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/ride/presenter/RidePaymentIntentDelegateImpl$handleStartRidePaymentIntent$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
    /* renamed from: VX4$b */
    /* loaded from: classes2.dex */
    public static final class C8665b extends Lambda implements Function1<HM4<StartRideWithIntentResponse>, InterfaceC23447K<? extends HM4<StartRideWithIntentResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: VX4$b$a */
        /* loaded from: classes2.dex */
        public static final class C8666a extends Lambda implements Function1<HM4<StartRideWithIntentResponse>, Unit> {

            /* renamed from: g */
            public static final C8666a f39203g = new C8666a();

            public C8666a() {
                super(1);
            }

            /* renamed from: a */
            public final void m79796a(HM4<StartRideWithIntentResponse> hm4) {
                C41318g46.m40163a("handleStartRidePaymentIntent processed payment successfully", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<StartRideWithIntentResponse> hm4) {
                m79796a(hm4);
                return Unit.INSTANCE;
            }
        }

        public C8665b() {
            super(1);
        }

        /* renamed from: c */
        public static final void m79797c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends HM4<StartRideWithIntentResponse>> invoke(HM4<StartRideWithIntentResponse> response) {
            StartRidePaymentResponse startRidePaymentResponse;
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            StartRideWithIntentResponse m103944a = response.m103944a();
            WireRide wireRide = null;
            if (m103944a == null || !response.m103939f()) {
                m103944a = null;
            }
            if (m103944a != null) {
                startRidePaymentResponse = m103944a.getPayment();
            } else {
                startRidePaymentResponse = null;
            }
            if (m103944a != null) {
                wireRide = m103944a.getRide();
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(response);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(response)");
            if (m103944a == null) {
                int m103943b = response.m103943b();
                if (400 <= m103943b && m103943b < 600) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C41318g46.m40163a("http 4xx or 5xx error encountered, will let ride error handler handle", new Object[0]);
                    VX4.this.f39195c.mo8810g(new UNKNOWN(RetrofitException.m53926d(response, VX4.this.f39196d)));
                } else {
                    C41318g46.m40163a("empty response body in handleStartRidePaymentIntent, return unexpected", new Object[0]);
                    InterfaceC46820pM3 interfaceC46820pM3 = VX4.this.f39195c;
                    String string = VX4.this.f39198f.getString(C45871nl4.payment_error_generic);
                    Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.payment_error_generic)");
                    interfaceC46820pM3.mo8810g(new UNEXPECTED(new PaymentIntentException(string)));
                }
            } else if (startRidePaymentResponse != null) {
                if (startRidePaymentResponse.getIntentId() != null) {
                    C41318g46.m40163a("non-empty response payment body in handleStartRidePaymentIntent with valid intent id, processing payment...", new Object[0]);
                    AbstractC23442F m33042m = VX4.this.f39195c.mo8798s().m33042m(m33158H);
                    final C8666a c8666a = C8666a.f39203g;
                    m33158H = m33042m.m33101w(new InterfaceC23484g() { // from class: WX4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            VX4.C8665b.m79797c(Function1.this, obj);
                        }
                    });
                } else {
                    C41318g46.m40163a("non-empty response payment body in handleStartRidePaymentIntent with invalid intent id, return unexpected", new Object[0]);
                    InterfaceC46820pM3 interfaceC46820pM32 = VX4.this.f39195c;
                    String string2 = VX4.this.f39198f.getString(C45871nl4.payment_error_generic);
                    Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.string.payment_error_generic)");
                    interfaceC46820pM32.mo8810g(new UNEXPECTED(new PaymentIntentException(string2)));
                }
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n            if (respon…            }\n          }");
            } else if (wireRide != null) {
                C41318g46.m40163a("non-empty response payment body in handleStartRidePaymentIntent with valid ride, we're done.", new Object[0]);
                VX4.this.f39195c.mo8801p(wireRide);
                VX4.this.f39195c.mo8810g(COMPLETE.INSTANCE);
            } else {
                C41318g46.m40163a("unknown state in handleStartRidePaymentIntent, return unexpected.", new Object[0]);
                InterfaceC46820pM3 interfaceC46820pM33 = VX4.this.f39195c;
                String string3 = VX4.this.f39198f.getString(C45871nl4.payment_error_generic);
                Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.string.payment_error_generic)");
                interfaceC46820pM33.mo8810g(new UNEXPECTED(new PaymentIntentException(string3)));
            }
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VX4$c */
    /* loaded from: classes2.dex */
    public static final class C8667c extends Lambda implements Function1<Throwable, Unit> {
        public C8667c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C41318g46.m40163a("error in handleStartRidePaymentIntent, return unexpected.", new Object[0]);
            VX4.this.f39195c.mo8810g(new UNKNOWN(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "status", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: VX4$d */
    /* loaded from: classes2.dex */
    public static final class C8668d extends Lambda implements Function1<PaymentIntentStatus, InterfaceC24574u<? extends WireRide>> {
        public C8668d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireRide> invoke(PaymentIntentStatus status) {
            String str;
            Intrinsics.checkNotNullParameter(status, "status");
            WireRide m59035e = VX4.this.f39195c.mo8811f().m73665a().m59035e();
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            C41318g46.m40163a("observePaymentComplete switch map called with status = " + status + " and ride = " + str, new Object[0]);
            if (Intrinsics.areEqual(status, COMPLETE.INSTANCE)) {
                if (m59035e != null) {
                    return AbstractC24507p.m32068G(m59035e);
                }
                return AbstractC24507p.m32023v(new PaymentIntentStatusException(status, "Received complete status response but no ride found", null, 4, null));
            } else if (Intrinsics.areEqual(status, REQUIRES_AUTHENTICATION.INSTANCE)) {
                VX4.this.f39195c.mo8804m(VX4.this.f39198f);
                return AbstractC24507p.m32024u();
            } else if (Intrinsics.areEqual(status, REQUIRES_CONFIRMATION.INSTANCE)) {
                VX4 vx4 = VX4.this;
                return vx4.m79810j((StartRideBodyWithIntent) ((Optional) vx4.f39199g.getValue()).m59035e()).m33159G().m33053f0();
            } else if (Intrinsics.areEqual(status, PAYMENT_METHOD_CREATED.INSTANCE)) {
                return AbstractC24507p.m32023v(new PaymentIntentStatusException(status, "Received PAYMENT_METHOD_CREATED status response", null, 4, null));
            } else {
                if (Intrinsics.areEqual(status, REQUIRES_PAYMENT_METHOD.INSTANCE)) {
                    return AbstractC24507p.m32023v(new PaymentIntentStatusException(status, "Received REQUIRES_PAYMENT_METHOD status response", null, 4, null));
                }
                if (status instanceof UNEXPECTED) {
                    return AbstractC24507p.m32023v(new PaymentIntentStatusException(status, "Received UNEXPECTED status response", ((UNEXPECTED) status).getThrowable()));
                }
                if (status instanceof UNKNOWN) {
                    return AbstractC24507p.m32023v(new PaymentIntentStatusException(status, "Received UNKNOWN status response", ((UNKNOWN) status).getThrowable()));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VX4$e */
    /* loaded from: classes2.dex */
    public static final class C8669e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C8669e f39206g = new C8669e();

        public C8669e() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: VX4$f */
    /* loaded from: classes2.dex */
    public static final class C8670f extends Lambda implements Function1<HM4<StartRideWithIntentResponse>, InterfaceC23447K<? extends WireRide>> {
        public C8670f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireRide> invoke(HM4<StartRideWithIntentResponse> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return VX4.this.m79806n();
        }
    }

    public VX4(NP4 rideClient, XW2 multiRideClient, InterfaceC46820pM3 manager, C51174wi2 jsonDeserializer, ScopeProvider scopeProvider, AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(rideClient, "rideClient");
        Intrinsics.checkNotNullParameter(multiRideClient, "multiRideClient");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f39193a = rideClient;
        this.f39194b = multiRideClient;
        this.f39195c = manager;
        this.f39196d = jsonDeserializer;
        this.f39197e = scopeProvider;
        this.f39198f = activity;
        this.f39199g = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: k */
    public static final void m79809k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final InterfaceC23447K m79808l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m79807m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC24574u m79805o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m79804p() {
    }

    /* renamed from: q */
    public static final void m79803q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m79802r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.NX4
    /* renamed from: a */
    public void mo79819a(int i, Intent intent) {
        Object m33041n = this.f39195c.mo8802o(i, intent).m33041n(AutoDispose.m45239a(this.f39197e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: TX4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                VX4.m79804p();
            }
        };
        final C8669e c8669e = C8669e.f39206g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: UX4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VX4.m79803q(Function1.this, obj);
            }
        });
    }

    @Override // p000.NX4
    /* renamed from: b */
    public AbstractC23442F<WireRide> mo79818b(StartRideBodyWithIntent startRideBodyWithIntent) {
        this.f39195c.mo8808i();
        C41318g46.m40163a("started new session in startRidePaymentIntentSingle", new Object[0]);
        AbstractC23442F<HM4<StartRideWithIntentResponse>> m79810j = m79810j(startRideBodyWithIntent);
        final C8670f c8670f = new C8670f();
        AbstractC23442F m33165A = m79810j.m33165A(new InterfaceC23492o() { // from class: OX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m79802r;
                m79802r = VX4.m79802r(Function1.this, obj);
                return m79802r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun startRidePa…entComplete()\n      }\n  }");
        return m33165A;
    }

    /* renamed from: j */
    public final AbstractC23442F<HM4<StartRideWithIntentResponse>> m79810j(StartRideBodyWithIntent startRideBodyWithIntent) {
        AbstractC23442F<HM4<StartRideWithIntentResponse>> m79801s;
        if (this.f39195c.mo8800q() == null && startRideBodyWithIntent != null) {
            C41318g46.m40163a("handleStartRidePaymentIntent intent id not available - 1st interaction", new Object[0]);
            this.f39199g.accept(Optional.f63040c.m59032c(startRideBodyWithIntent));
            AbstractC23442F<HM4<StartRideWithIntentResponse>> m79801s2 = m79801s(startRideBodyWithIntent);
            final C8664a c8664a = new C8664a();
            m79801s = m79801s2.m33101w(new InterfaceC23484g() { // from class: QX4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    VX4.m79809k(Function1.this, obj);
                }
            });
        } else {
            String mo8800q = this.f39195c.mo8800q();
            C41318g46.m40163a("handleStartRidePaymentIntent confirmation with intent id " + mo8800q + " ", new Object[0]);
            m79801s = m79801s(StartRideBodyWithIntent.copy$default(this.f39199g.getValue().m59038b(), null, false, null, this.f39195c.mo8800q(), this.f39200h, null, null, 103, null));
        }
        AbstractC23442F<HM4<StartRideWithIntentResponse>> m33152N = m79801s.m33152N(C24542a.m31932c());
        final C8665b c8665b = new C8665b();
        AbstractC23442F<R> m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: RX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m79808l;
                m79808l = VX4.m79808l(Function1.this, obj);
                return m79808l;
            }
        });
        final C8667c c8667c = new C8667c();
        AbstractC23442F<HM4<StartRideWithIntentResponse>> m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: SX4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VX4.m79807m(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun handleStartR…owable = it))\n      }\n  }");
        return m33106t;
    }

    /* renamed from: n */
    public final AbstractC23442F<WireRide> m79806n() {
        Observable m74576S = C37279Yf5.m74576S(this.f39195c.mo8807j(false));
        final C8668d c8668d = new C8668d();
        AbstractC23442F<WireRide> firstOrError = m74576S.switchMapMaybe(new InterfaceC23492o() { // from class: PX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m79805o;
                m79805o = VX4.m79805o(Function1.this, obj);
                return m79805o;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun observePayme…      .firstOrError()\n  }");
        return firstOrError;
    }

    /* renamed from: s */
    public final AbstractC23442F<HM4<StartRideWithIntentResponse>> m79801s(StartRideBodyWithIntent startRideBodyWithIntent) {
        return this.f39194b.m76914j(startRideBodyWithIntent);
    }
}
