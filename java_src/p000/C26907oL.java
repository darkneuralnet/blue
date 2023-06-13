package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.User;
import co.bird.android.model.constant.DeviceVerificationMethod;
import co.bird.api.request.DeviceCheckConfirmRequest;
import co.bird.api.request.DeviceCheckSendRequest;
import co.bird.api.response.DeviceCheckConfirmResponse;
import co.bird.api.response.DeviceCheckSendResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.AbstractC31956Bm1;
import p000.C26907oL;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001\u0010B1\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010,\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R:\u00101\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$ )*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010.0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006;"}, m28432d2 = {"LoL;", "LfL;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", C17296a.f69688o, "Lio/reactivex/Observable;", "", "b", "", "c", "()Ljava/lang/Double;", "Lco/bird/android/model/constant/DeviceVerificationMethod;", "deviceVerificationMethod", "Lio/reactivex/F;", "Lco/bird/api/response/DeviceCheckSendResponse;", DateTokenConverter.CONVERTER_KEY, "q", "t", "token", "w", "LEa;", "LEa;", "analyticsManager", "Lgl;", "Lgl;", "appPreference", "Lj21;", "Lj21;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LTq4;", "LTq4;", "reactiveConfig", "e", "Lco/bird/android/model/constant/DeviceVerificationMethod;", "checkDeviceMethodSubject", "", "f", "J", "checkDeviceTriggerTimestamp", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "confirmDeviceTriggerSubject", "Lio/reactivex/subjects/a;", "Lkotlin/Pair;", "h", "Lio/reactivex/subjects/a;", "deviceVerifiedTimestampSubject", "", "i", "Ljava/util/Set;", "deviceCheckRequiredModes", "LRh6;", "userStream", "<init>", "(LEa;Lgl;Lj21;LTq4;LRh6;)V", "j", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdDeviceCheckManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,178:1\n180#2:179\n180#2:180\n*S KotlinDebug\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl\n*L\n65#1:179\n102#1:180\n*E\n"})
/* renamed from: oL */
/* loaded from: classes4.dex */
public final class C26907oL implements InterfaceC20357fL {

    /* renamed from: j */
    public static final C26914d f101794j = new C26914d(null);

    /* renamed from: a */
    public final InterfaceC1880Ea f101795a;

    /* renamed from: b */
    public final C22454gl f101796b;

    /* renamed from: c */
    public final InterfaceC43072j21 f101797c;

    /* renamed from: d */
    public final C36207Tq4 f101798d;

    /* renamed from: e */
    public DeviceVerificationMethod f101799e;

    /* renamed from: f */
    public long f101800f;

    /* renamed from: g */
    public final C24558d<String> f101801g;

    /* renamed from: h */
    public final C24552a<Pair<Boolean, Long>> f101802h;

    /* renamed from: i */
    public final Set<DeviceVerificationMethod> f101803i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oL$a */
    /* loaded from: classes4.dex */
    public static final class C26908a extends Lambda implements Function1<User, Unit> {

        /* renamed from: g */
        public static final C26908a f101804g = new C26908a();

        public C26908a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21315a(User user) {
            AbstractC31956Bm1.m113506c().mo36246b(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m21315a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/DeviceVerificationMethod;", "method", "", C17296a.f69688o, "(Lco/bird/android/model/constant/DeviceVerificationMethod;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oL$b */
    /* loaded from: classes4.dex */
    public static final class C26909b extends Lambda implements Function1<DeviceVerificationMethod, Unit> {

        /* renamed from: g */
        public static final C26909b f101805g = new C26909b();

        public C26909b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21314a(DeviceVerificationMethod deviceVerificationMethod) {
            boolean z;
            if (deviceVerificationMethod == DeviceVerificationMethod.APP_CHECK) {
                z = true;
            } else {
                z = false;
            }
            AbstractC31956Bm1.m113506c().mo36244f(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceVerificationMethod deviceVerificationMethod) {
            m21314a(deviceVerificationMethod);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oL$c */
    /* loaded from: classes4.dex */
    public static final class C26910c extends Lambda implements Function1<String, InterfaceC23447K<? extends Pair<? extends Boolean, ? extends Long>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DeviceCheckConfirmResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/DeviceCheckConfirmResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: oL$c$a */
        /* loaded from: classes4.dex */
        public static final class C26911a extends Lambda implements Function1<DeviceCheckConfirmResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C26907oL f101807g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26911a(C26907oL c26907oL) {
                super(1);
                this.f101807g = c26907oL;
            }

            /* renamed from: a */
            public final void m21309a(DeviceCheckConfirmResponse deviceCheckConfirmResponse) {
                this.f101807g.f101795a.mo55905y(new C43665k21(null, null, null, String.valueOf(this.f101807g.f101799e), deviceCheckConfirmResponse.getSuccess(), null, this.f101807g.m21319t(), 39, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DeviceCheckConfirmResponse deviceCheckConfirmResponse) {
                m21309a(deviceCheckConfirmResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBirdDeviceCheckManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$4$2\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n9#2,4:179\n*S KotlinDebug\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$4$2\n*L\n91#1:179,4\n*E\n"})
        /* renamed from: oL$c$b */
        /* loaded from: classes4.dex */
        public static final class C26912b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C26907oL f101808g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26912b(C26907oL c26907oL) {
                super(1);
                this.f101808g = c26907oL;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                if (!(th instanceof HttpException)) {
                    th = null;
                }
                HttpException httpException = (HttpException) th;
                if (httpException != null) {
                    C26907oL c26907oL = this.f101808g;
                    c26907oL.f101795a.mo55905y(new C43665k21(null, null, null, String.valueOf(c26907oL.f101799e), false, Integer.valueOf(httpException.m15616a()), c26907oL.m21319t(), 7, null));
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/DeviceCheckConfirmResponse;", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/DeviceCheckConfirmResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: oL$c$c */
        /* loaded from: classes4.dex */
        public static final class C26913c extends Lambda implements Function1<DeviceCheckConfirmResponse, Pair<? extends Boolean, ? extends Long>> {

            /* renamed from: g */
            public static final C26913c f101809g = new C26913c();

            public C26913c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Boolean, Long> invoke(DeviceCheckConfirmResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(Boolean.valueOf(it.getSuccess()), Long.valueOf(System.currentTimeMillis()));
            }
        }

        public C26910c() {
            super(1);
        }

        /* renamed from: d */
        public static final void m21310d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<Boolean, Long>> invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            AbstractC23442F<DeviceCheckConfirmResponse> m31234b = C26907oL.this.f101797c.m31234b(new DeviceCheckConfirmRequest(code, C26907oL.this.m21322q(), DateTime.now().getMillis()));
            final C26911a c26911a = new C26911a(C26907oL.this);
            AbstractC23442F<DeviceCheckConfirmResponse> m33101w = m31234b.m33101w(new InterfaceC23484g() { // from class: pL
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26907oL.C26910c.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C26912b c26912b = new C26912b(C26907oL.this);
            AbstractC23442F<DeviceCheckConfirmResponse> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: qL
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26907oL.C26910c.m21310d(Function1.this, obj);
                }
            });
            final C26913c c26913c = C26913c.f101809g;
            return m33106t.m33157I(new InterfaceC23492o() { // from class: rL
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$2;
                    invoke$lambda$2 = C26907oL.C26910c.invoke$lambda$2(Function1.this, obj);
                    return invoke$lambda$2;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LoL$d;", "", "", "DEVICE_CHECK_VERIFY_TIMEOUT_MILLIS", "J", "DEVICE_TRIGGER_THROTTLE_PERIOD_MILLIS", "DEVICE_VERIFICATION_MAX_AGE_MILLIS", "TRIGGER_DEVICE_RETRY_COUNT", "<init>", "()V", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: oL$d */
    /* loaded from: classes4.dex */
    public static final class C26914d {
        public /* synthetic */ C26914d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26914d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DeviceCheckSendResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/DeviceCheckSendResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oL$g */
    /* loaded from: classes4.dex */
    public static final class C26917g extends Lambda implements Function1<DeviceCheckSendResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DeviceVerificationMethod f101813h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26917g(DeviceVerificationMethod deviceVerificationMethod) {
            super(1);
            this.f101813h = deviceVerificationMethod;
        }

        /* renamed from: a */
        public final void m21307a(DeviceCheckSendResponse deviceCheckSendResponse) {
            C26907oL.this.f101795a.mo55905y(new B21(null, null, null, this.f101813h.toString(), deviceCheckSendResponse.getSuccess(), null, 39, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceCheckSendResponse deviceCheckSendResponse) {
            m21307a(deviceCheckSendResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBirdDeviceCheckManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$triggerDeviceCheck$2\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n9#2,4:179\n*S KotlinDebug\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$triggerDeviceCheck$2\n*L\n163#1:179,4\n*E\n"})
    /* renamed from: oL$h */
    /* loaded from: classes4.dex */
    public static final class C26918h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DeviceVerificationMethod f101815h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26918h(DeviceVerificationMethod deviceVerificationMethod) {
            super(1);
            this.f101815h = deviceVerificationMethod;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                C26907oL.this.f101795a.mo55905y(new B21(null, null, null, this.f101815h.toString(), false, Integer.valueOf(httpException.m15616a()), 7, null));
            }
        }
    }

    public C26907oL(InterfaceC1880Ea analyticsManager, C22454gl appPreference, InterfaceC43072j21 client, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Set<DeviceVerificationMethod> of;
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f101795a = analyticsManager;
        this.f101796b = appPreference;
        this.f101797c = client;
        this.f101798d = reactiveConfig;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f101801g = m31902e;
        C24552a<Pair<Boolean, Long>> m31921g = C24552a.m31921g(new Pair(Boolean.FALSE, 0L));
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(Pair(false, 0L))");
        this.f101802h = m31921g;
        of = SetsKt__SetsJVMKt.setOf(DeviceVerificationMethod.PUSH);
        this.f101803i = of;
        Observable<User> mo76576i = userStream.mo76576i();
        final C26908a c26908a = C26908a.f101804g;
        mo76576i.subscribe(new InterfaceC23484g() { // from class: gL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26907oL.m21326m(Function1.this, obj);
            }
        });
        Observable<DeviceVerificationMethod> m82672b3 = reactiveConfig.m82672b3();
        final C26909b c26909b = C26909b.f101805g;
        Observable<DeviceVerificationMethod> doOnNext = m82672b3.doOnNext(new InterfaceC23484g() { // from class: hL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26907oL.m21325n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "reactiveConfig.deviceChe…bled(autoRefresh)\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        AbstractC31956Bm1.m113506c().mo36247a(new AbstractC31956Bm1.InterfaceC0730a() { // from class: iL
            @Override // p000.AbstractC31956Bm1.InterfaceC0730a
            /* renamed from: a */
            public final void mo7546a(AbstractC8723Vh abstractC8723Vh) {
                C26907oL.m21324o(C26907oL.this, abstractC8723Vh);
            }
        });
        final C26910c c26910c = new C26910c();
        Observable<R> flatMapSingle = m31902e.flatMapSingle(new InterfaceC23492o() { // from class: jL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m21323p;
                m21323p = C26907oL.m21323p(Function1.this, obj);
                return m21323p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "confirmDeviceTriggerSubj…entTimeMillis() }\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe(m31921g);
    }

    /* renamed from: m */
    public static final void m21326m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m21325n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m21324o(C26907oL this$0, AbstractC8723Vh response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        String mo19170b = response.mo19170b();
        Intrinsics.checkNotNullExpressionValue(mo19170b, "response.token");
        this$0.m21316w(mo19170b);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m21323p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m21321r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final Boolean m21320s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m21318u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m21317v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC20357fL
    /* renamed from: a */
    public void mo21338a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f101800f = System.currentTimeMillis();
        this.f101801g.onNext(code);
    }

    @Override // p000.InterfaceC20357fL
    /* renamed from: b */
    public Observable<Boolean> mo21337b() {
        boolean contains;
        Observable map;
        contains = CollectionsKt___CollectionsKt.contains(this.f101803i, this.f101798d.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod());
        if (!contains) {
            map = Observable.just(Boolean.TRUE);
        } else {
            C24552a<Pair<Boolean, Long>> c24552a = this.f101802h;
            final C26915e c26915e = C26915e.f101810g;
            Observable<Pair<Boolean, Long>> filter = c24552a.filter(new InterfaceC23494q() { // from class: kL
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m21321r;
                    m21321r = C26907oL.m21321r(Function1.this, obj);
                    return m21321r;
                }
            });
            final C26916f c26916f = C26916f.f101811g;
            map = filter.map(new InterfaceC23492o() { // from class: lL
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m21320s;
                    m21320s = C26907oL.m21320s(Function1.this, obj);
                    return m21320s;
                }
            });
        }
        Observable<Boolean> timeout = map.timeout(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS, Observable.just(Boolean.FALSE));
        Intrinsics.checkNotNullExpressionValue(timeout, "if (!checkRequired) {\n  …, Observable.just(false))");
        return timeout;
    }

    @Override // p000.InterfaceC20357fL
    /* renamed from: c */
    public Double mo21336c() {
        Pair<Boolean, Long> value = this.f101802h.getValue();
        if (value != null) {
            return Double.valueOf((System.currentTimeMillis() - value.getSecond().longValue()) / 1000.0d);
        }
        return null;
    }

    @Override // p000.InterfaceC20357fL
    /* renamed from: d */
    public AbstractC23442F<DeviceCheckSendResponse> mo21335d(DeviceVerificationMethod deviceVerificationMethod) {
        Intrinsics.checkNotNullParameter(deviceVerificationMethod, "deviceVerificationMethod");
        if (System.currentTimeMillis() - this.f101800f < 5000) {
            AbstractC23442F<DeviceCheckSendResponse> m33153M = AbstractC23442F.m33153M();
            Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
            return m33153M;
        }
        this.f101799e = deviceVerificationMethod;
        this.f101800f = System.currentTimeMillis();
        AbstractC23442F<DeviceCheckSendResponse> m31235a = this.f101797c.m31235a(new DeviceCheckSendRequest(m21322q(), DateTime.now().getMillis()));
        final C26917g c26917g = new C26917g(deviceVerificationMethod);
        AbstractC23442F<DeviceCheckSendResponse> m33101w = m31235a.m33101w(new InterfaceC23484g() { // from class: mL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26907oL.m21318u(Function1.this, obj);
            }
        });
        final C26918h c26918h = new C26918h(deviceVerificationMethod);
        AbstractC23442F<DeviceCheckSendResponse> m33146T = m33101w.m33106t(new InterfaceC23484g() { // from class: nL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C26907oL.m21317v(Function1.this, obj);
            }
        }).m33146T(2L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "override fun triggerDevi…R_DEVICE_RETRY_COUNT)\n  }");
        return m33146T;
    }

    /* renamed from: q */
    public final String m21322q() {
        String m37587p0 = this.f101796b.m37587p0();
        return m37587p0 == null ? "" : m37587p0;
    }

    /* renamed from: t */
    public final double m21319t() {
        return (System.currentTimeMillis() - this.f101800f) / 1000.0d;
    }

    /* renamed from: w */
    public final void m21316w(String str) {
        this.f101796b.m37745C1(str);
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oL$e */
    /* loaded from: classes4.dex */
    public static final class C26915e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Long>, Boolean> {

        /* renamed from: g */
        public static final C26915e f101810g = new C26915e();

        public C26915e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Long> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1().booleanValue() && pair.component2().longValue() > 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Long> pair) {
            return invoke2((Pair<Boolean, Long>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oL$f */
    /* loaded from: classes4.dex */
    public static final class C26916f extends Lambda implements Function1<Pair<? extends Boolean, ? extends Long>, Boolean> {

        /* renamed from: g */
        public static final C26916f f101811g = new C26916f();

        public C26916f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Long> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component1().booleanValue();
            if (System.currentTimeMillis() - pair.component2().longValue() >= 300000) {
                booleanValue = false;
            }
            return Boolean.valueOf(booleanValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Long> pair) {
            return invoke2((Pair<Boolean, Long>) pair);
        }
    }
}
