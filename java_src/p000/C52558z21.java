package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.constant.DeviceVerification;
import co.bird.android.model.constant.DeviceVerificationKt;
import co.bird.android.model.constant.DeviceVerificationMethod;
import co.bird.android.model.constant.HttpMethod;
import co.bird.android.model.wire.configs.DeviceVerificationEndpointConfig;
import co.bird.android.model.wire.configs.DeviceVerificationRecaptchaConfig;
import co.bird.android.model.wire.configs.VerificationMethod;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.AbstractC31956Bm1;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0002J$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-R\"\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00150\u00150/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00068"}, m28432d2 = {"Lz21;", "Lo21;", "", "isRetry", "", "y", "Lco/bird/android/model/constant/DeviceVerification;", "Lco/bird/android/model/wire/configs/VerificationMethod;", "verificationMethod", "x", "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;", "s", "", "token", "I", "deviceVerification", "forceRefresh", "G", "failureReason", "E", "Lio/reactivex/Observable;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "c", "retry", "e", C17296a.f69688o, "b", "requestHost", "requestMethod", "requestPath", DateTokenConverter.CONVERTER_KEY, "B", "Lgl;", "Lgl;", "preference", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll21;", "Ll21;", "deviceCheckDelegate", "LTq4;", "LTq4;", "reactiveConfig", "Lcom/google/android/gms/recaptcha/RecaptchaHandle;", "Lcom/google/android/gms/recaptcha/RecaptchaHandle;", "recaptchaHandle", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/d;", "deviceCheckEventSubject", "LRh6;", "userStream", "<init>", "(Lgl;Landroid/content/Context;Ll21;LTq4;LRh6;)V", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceCheckManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/DeviceCheckManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,289:1\n180#2:290\n199#2:296\n187#3,3:291\n1855#4,2:294\n1747#4,3:297\n288#4,2:300\n*S KotlinDebug\n*F\n+ 1 DeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/DeviceCheckManagerImpl\n*L\n65#1:290\n213#1:296\n109#1:291,3\n185#1:294,2\n225#1:297,3\n241#1:300,2\n*E\n"})
/* renamed from: z21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52558z21 implements InterfaceC46037o21 {

    /* renamed from: a */
    public final C22454gl f120648a;

    /* renamed from: b */
    public final Context f120649b;

    /* renamed from: c */
    public final C44258l21 f120650c;

    /* renamed from: d */
    public final C36207Tq4 f120651d;

    /* renamed from: e */
    public RecaptchaHandle f120652e;

    /* renamed from: f */
    public final C24558d<AnalyticsEvent> f120653f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$a */
    /* loaded from: classes4.dex */
    public static final class C30876a extends Lambda implements Function1<User, Unit> {

        /* renamed from: g */
        public static final C30876a f120654g = new C30876a();

        public C30876a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1941a(User user) {
            AbstractC31956Bm1.m113506c().mo36246b(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m1941a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/DeviceVerificationMethod;", "method", "", C17296a.f69688o, "(Lco/bird/android/model/constant/DeviceVerificationMethod;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$b */
    /* loaded from: classes4.dex */
    public static final class C30877b extends Lambda implements Function1<DeviceVerificationMethod, Unit> {

        /* renamed from: g */
        public static final C30877b f120655g = new C30877b();

        public C30877b() {
            super(1);
        }

        /* renamed from: a */
        public final void m1940a(DeviceVerificationMethod deviceVerificationMethod) {
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
            m1940a(deviceVerificationMethod);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/recaptcha/RecaptchaResultData;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/android/gms/recaptcha/RecaptchaResultData;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$c */
    /* loaded from: classes4.dex */
    public static final class C30878c extends Lambda implements Function1<RecaptchaResultData, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DeviceVerification f120657h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30878c(DeviceVerification deviceVerification) {
            super(1);
            this.f120657h = deviceVerification;
        }

        /* renamed from: a */
        public final void m1939a(RecaptchaResultData recaptchaResultData) {
            C52558z21.m1971F(C52558z21.this, VerificationMethod.RECAPTCHA_ENTERPRISE, this.f120657h, null, 4, null);
            C44258l21 c44258l21 = C52558z21.this.f120650c;
            String m50543s = recaptchaResultData.m50543s();
            Intrinsics.checkNotNullExpressionValue(m50543s, "it.tokenResult");
            c44258l21.m28010f(m50543s);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecaptchaResultData recaptchaResultData) {
            m1939a(recaptchaResultData);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/recaptcha/RecaptchaHandle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$d */
    /* loaded from: classes4.dex */
    public static final class C30879d extends Lambda implements Function1<RecaptchaHandle, Unit> {
        public C30879d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1938a(RecaptchaHandle recaptchaHandle) {
            C52558z21.this.f120652e = recaptchaHandle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecaptchaHandle recaptchaHandle) {
            m1938a(recaptchaHandle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$e */
    /* loaded from: classes4.dex */
    public static final class C30880e extends Lambda implements Function1<Long, Unit> {
        public C30880e() {
            super(1);
        }

        /* renamed from: a */
        public final void m1937a(Long l) {
            C52558z21.this.m1943y(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m1937a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"z21$f", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "device-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: z21$f */
    /* loaded from: classes4.dex */
    public static final class C30881f extends ConnectivityManager.NetworkCallback {
        public C30881f() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            if (C52558z21.this.f120652e == null) {
                C52558z21.this.mo1966b(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LVh;", "kotlin.jvm.PlatformType", "token", "", C17296a.f69688o, "(LVh;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z21$g */
    /* loaded from: classes4.dex */
    public static final class C30882g extends Lambda implements Function1<AbstractC8723Vh, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DeviceVerification f120662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30882g(DeviceVerification deviceVerification) {
            super(1);
            this.f120662h = deviceVerification;
        }

        /* renamed from: a */
        public final void m1936a(AbstractC8723Vh abstractC8723Vh) {
            C52558z21 c52558z21 = C52558z21.this;
            String mo19170b = abstractC8723Vh.mo19170b();
            Intrinsics.checkNotNullExpressionValue(mo19170b, "token.token");
            c52558z21.m1968I(mo19170b);
            C52558z21.m1971F(C52558z21.this, VerificationMethod.FIREBASE_APPCHECK, this.f120662h, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC8723Vh abstractC8723Vh) {
            m1936a(abstractC8723Vh);
            return Unit.INSTANCE;
        }
    }

    public C52558z21(C22454gl preference, Context context, C44258l21 deviceCheckDelegate, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceCheckDelegate, "deviceCheckDelegate");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f120648a = preference;
        this.f120649b = context;
        this.f120650c = deviceCheckDelegate;
        this.f120651d = reactiveConfig;
        C24558d<AnalyticsEvent> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<AnalyticsEvent>()");
        this.f120653f = m31902e;
        Observable<User> mo76576i = userStream.mo76576i();
        final C30876a c30876a = C30876a.f120654g;
        mo76576i.subscribe(new InterfaceC23484g() { // from class: u21
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52558z21.m1952p(Function1.this, obj);
            }
        });
        Observable<DeviceVerificationMethod> m82672b3 = reactiveConfig.m82672b3();
        final C30877b c30877b = C30877b.f120655g;
        Observable<DeviceVerificationMethod> doOnNext = m82672b3.doOnNext(new InterfaceC23484g() { // from class: v21
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52558z21.m1951q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "reactiveConfig.deviceChe…bled(autoRefresh)\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        AbstractC31956Bm1.m113506c().mo36247a(new AbstractC31956Bm1.InterfaceC0730a() { // from class: w21
            @Override // p000.AbstractC31956Bm1.InterfaceC0730a
            /* renamed from: a */
            public final void mo7546a(AbstractC8723Vh abstractC8723Vh) {
                C52558z21.m1950r(C52558z21.this, abstractC8723Vh);
            }
        });
        m1942z(this, false, 1, null);
    }

    /* renamed from: A */
    public static final void m1976A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m1974C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m1973D(C52558z21 this$0, DeviceVerification deviceVerification, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceVerification, "$deviceVerification");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m1972E(VerificationMethod.FIREBASE_APPCHECK, deviceVerification, it.toString());
    }

    /* renamed from: F */
    public static /* synthetic */ void m1971F(C52558z21 c52558z21, VerificationMethod verificationMethod, DeviceVerification deviceVerification, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c52558z21.m1972E(verificationMethod, deviceVerification, str);
    }

    /* renamed from: H */
    public static /* synthetic */ void m1969H(C52558z21 c52558z21, VerificationMethod verificationMethod, DeviceVerification deviceVerification, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c52558z21.m1970G(verificationMethod, deviceVerification, z);
    }

    /* renamed from: p */
    public static final void m1952p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m1951q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m1950r(C52558z21 this$0, AbstractC8723Vh response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        String mo19170b = response.mo19170b();
        Intrinsics.checkNotNullExpressionValue(mo19170b, "response.token");
        this$0.m1968I(mo19170b);
    }

    /* renamed from: t */
    public static final void m1948t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m1947u(boolean z, C52558z21 this$0, DeviceVerification deviceVerification, Exception error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceVerification, "$deviceVerification");
        Intrinsics.checkNotNullParameter(error, "error");
        if (z) {
            this$0.m1972E(VerificationMethod.RECAPTCHA_ENTERPRISE, deviceVerification, error.toString());
            this$0.mo1963e(deviceVerification, false);
        }
        C41318g46.m40159e(error);
    }

    /* renamed from: v */
    public static final void m1946v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m1945w(boolean z, C52558z21 this$0, Exception error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        C41318g46.m40159e(error);
        if (z) {
            VerificationMethod verificationMethod = VerificationMethod.RECAPTCHA_ENTERPRISE;
            DeviceVerification EmptyDeviceVerification = DeviceVerificationKt.EmptyDeviceVerification();
            this$0.m1972E(verificationMethod, EmptyDeviceVerification, "ReCAPTCHA client setup error. Retrying. " + error);
            this$0.mo1966b(false);
            return;
        }
        VerificationMethod verificationMethod2 = VerificationMethod.RECAPTCHA_ENTERPRISE;
        DeviceVerification EmptyDeviceVerification2 = DeviceVerificationKt.EmptyDeviceVerification();
        this$0.m1972E(verificationMethod2, EmptyDeviceVerification2, "ReCAPTCHA client setup error. " + error);
    }

    /* renamed from: z */
    public static /* synthetic */ void m1942z(C52558z21 c52558z21, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c52558z21.m1943y(z);
    }

    /* renamed from: B */
    public boolean m1975B(final DeviceVerification deviceVerification) {
        Intrinsics.checkNotNullParameter(deviceVerification, "deviceVerification");
        VerificationMethod verificationMethod = VerificationMethod.FIREBASE_APPCHECK;
        if (!m1944x(deviceVerification, verificationMethod)) {
            return false;
        }
        m1969H(this, verificationMethod, deviceVerification, false, 4, null);
        Task<AbstractC8723Vh> mo36246b = AbstractC31956Bm1.m113506c().mo36246b(false);
        final C30882g c30882g = new C30882g(deviceVerification);
        mo36246b.addOnSuccessListener(new OnSuccessListener() { // from class: x21
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C52558z21.m1974C(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: y21
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C52558z21.m1973D(C52558z21.this, deviceVerification, exc);
            }
        });
        return true;
    }

    /* renamed from: E */
    public final void m1972E(VerificationMethod verificationMethod, DeviceVerification deviceVerification, String str) {
        this.f120653f.onNext(new C35740Rq5(null, null, null, verificationMethod.name(), deviceVerification.getService(), deviceVerification.getPath(), deviceVerification.getHttpMethod().name(), str, 7, null));
    }

    /* renamed from: G */
    public final void m1970G(VerificationMethod verificationMethod, DeviceVerification deviceVerification, boolean z) {
        this.f120653f.onNext(new C35506Qq5(null, null, null, verificationMethod.name(), deviceVerification.getService(), deviceVerification.getPath(), deviceVerification.getHttpMethod().name(), z, 7, null));
    }

    /* renamed from: I */
    public final void m1968I(String str) {
        this.f120650c.m28013c(str);
    }

    @Override // p000.InterfaceC46037o21
    /* renamed from: a */
    public String mo1967a() {
        return this.f120650c.m28014b();
    }

    @Override // p000.InterfaceC46037o21
    /* renamed from: b */
    public void mo1966b(final boolean z) {
        String string;
        boolean z2;
        DeviceVerificationRecaptchaConfig recaptcha = this.f120651d.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getRecaptcha();
        if (recaptcha == null || (string = recaptcha.getSiteKey()) == null) {
            string = this.f120649b.getString(this.f120648a.m37699O().m9901g());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(prefer…CAPTCHAEnterpriseSiteKey)");
        }
        Map<String, DeviceVerificationEndpointConfig> endpoints = this.f120651d.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        if (endpoints != null && !endpoints.isEmpty()) {
            for (Map.Entry<String, DeviceVerificationEndpointConfig> entry : endpoints.entrySet()) {
                Set<VerificationMethod> verificationMethods = entry.getValue().getVerificationMethods();
                boolean z3 = true;
                if (verificationMethods != null && verificationMethods.contains(VerificationMethod.RECAPTCHA_ENTERPRISE)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !entry.getValue().getEnabled()) {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
        }
        this.f120650c.m28011e(string);
        Task<RecaptchaHandle> addOnFailureListener = C41197fs4.m40623a(this.f120649b).mo8973b(string).addOnFailureListener(new OnFailureListener() { // from class: s21
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C52558z21.m1945w(z, this, exc);
            }
        });
        final C30879d c30879d = new C30879d();
        addOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: t21
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C52558z21.m1946v(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46037o21
    /* renamed from: c */
    public Observable<AnalyticsEvent> mo1965c() {
        Observable<AnalyticsEvent> hide = this.f120653f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "deviceCheckEventSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC46037o21
    /* renamed from: d */
    public boolean mo1964d(String requestHost, String requestMethod, String requestPath) {
        Intrinsics.checkNotNullParameter(requestHost, "requestHost");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(requestPath, "requestPath");
        HttpMethod fromString = HttpMethod.Companion.fromString(requestMethod);
        if (fromString != null) {
            DeviceVerification deviceVerification = new DeviceVerification(requestHost, fromString, requestPath);
            if (!mo1963e(deviceVerification, true) && !m1975B(deviceVerification)) {
                return false;
            }
            return true;
        }
        C41318g46.m40157g("DeviceCheck.Request method not supported: " + requestMethod, new Object[0]);
        return false;
    }

    @Override // p000.InterfaceC46037o21
    /* renamed from: e */
    public boolean mo1963e(final DeviceVerification deviceVerification, final boolean z) {
        Intrinsics.checkNotNullParameter(deviceVerification, "deviceVerification");
        VerificationMethod verificationMethod = VerificationMethod.RECAPTCHA_ENTERPRISE;
        DeviceVerificationEndpointConfig m1949s = m1949s(deviceVerification, verificationMethod);
        if (m1949s != null) {
            this.f120650c.m28012d(m1949s.getAction());
            RecaptchaHandle recaptchaHandle = this.f120652e;
            if (recaptchaHandle != null) {
                m1969H(this, verificationMethod, deviceVerification, false, 4, null);
                Task<RecaptchaResultData> mo8972g = C41197fs4.m40623a(this.f120649b).mo8972g(recaptchaHandle, new RecaptchaAction(new RecaptchaActionType(m1949s.getAction())));
                final C30878c c30878c = new C30878c(deviceVerification);
                mo8972g.addOnSuccessListener(new OnSuccessListener() { // from class: q21
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        C52558z21.m1948t(Function1.this, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: r21
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        C52558z21.m1947u(z, this, deviceVerification, exc);
                    }
                });
                return true;
            }
            C41318g46.m40159e(new NullPointerException("RecaptchaHandle is null when attempting to execute an action."));
            m1972E(verificationMethod, deviceVerification, "recaptchaHandle is null.");
            return false;
        }
        return false;
    }

    /* renamed from: s */
    public final DeviceVerificationEndpointConfig m1949s(DeviceVerification deviceVerification, VerificationMethod verificationMethod) {
        Collection<DeviceVerificationEndpointConfig> values;
        boolean contains$default;
        boolean contains$default2;
        boolean equals;
        boolean z;
        Map<String, DeviceVerificationEndpointConfig> endpoints = this.f120651d.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        Object obj = null;
        if (endpoints == null || (values = endpoints.values()) == null) {
            return null;
        }
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DeviceVerificationEndpointConfig deviceVerificationEndpointConfig = (DeviceVerificationEndpointConfig) next;
            String path = deviceVerificationEndpointConfig.getPath();
            String service = deviceVerificationEndpointConfig.getService();
            boolean z2 = false;
            if (deviceVerificationEndpointConfig.getEnabled() && path != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) deviceVerification.getPath(), (CharSequence) path, false, 2, (Object) null);
                if (contains$default && service != null) {
                    contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) deviceVerification.getService(), (CharSequence) service, false, 2, (Object) null);
                    if (contains$default2) {
                        equals = StringsKt__StringsJVMKt.equals(deviceVerificationEndpointConfig.getHttpMethod(), deviceVerification.getHttpMethod().name(), true);
                        if (equals) {
                            Set<VerificationMethod> verificationMethods = deviceVerificationEndpointConfig.getVerificationMethods();
                            if (verificationMethods != null) {
                                z = verificationMethods.contains(verificationMethod);
                            } else {
                                z = false;
                            }
                            if (z) {
                                z2 = true;
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (z2) {
                obj = next;
                break;
            }
        }
        return (DeviceVerificationEndpointConfig) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1944x(DeviceVerification deviceVerification, VerificationMethod verificationMethod) {
        Collection<DeviceVerificationEndpointConfig> values;
        boolean z;
        boolean contains$default;
        boolean contains$default2;
        boolean equals;
        boolean z2;
        Map<String, DeviceVerificationEndpointConfig> endpoints = this.f120651d.m82623f8().m73665a().getSecurityConfig().getDeviceVerificationConfig().getEndpoints();
        if (endpoints == null || (values = endpoints.values()) == null) {
            return false;
        }
        Collection<DeviceVerificationEndpointConfig> collection = values;
        if (collection.isEmpty()) {
            return false;
        }
        for (DeviceVerificationEndpointConfig deviceVerificationEndpointConfig : collection) {
            String path = deviceVerificationEndpointConfig.getPath();
            String service = deviceVerificationEndpointConfig.getService();
            if (deviceVerificationEndpointConfig.getEnabled() && path != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) deviceVerification.getPath(), (CharSequence) path, false, 2, (Object) null);
                if (contains$default && service != null) {
                    contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) deviceVerification.getService(), (CharSequence) service, false, 2, (Object) null);
                    if (contains$default2) {
                        equals = StringsKt__StringsJVMKt.equals(deviceVerificationEndpointConfig.getHttpMethod(), deviceVerification.getHttpMethod().name(), true);
                        if (equals) {
                            Set<VerificationMethod> verificationMethods = deviceVerificationEndpointConfig.getVerificationMethods();
                            if (verificationMethods != null) {
                                z2 = verificationMethods.contains(verificationMethod);
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                z = true;
                                continue;
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        return false;
    }

    /* renamed from: y */
    public final void m1943y(boolean z) {
        C30881f c30881f = new C30881f();
        try {
            Object systemService = this.f120649b.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c30881f);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Caught exception while attempting to access connectivityManager, this is probably an Android 11 device, retrying: ");
            sb.append(!z);
            C41318g46.m40161c(e, sb.toString(), new Object[0]);
            if (!z) {
                AbstractC23442F<Long> m33133f0 = AbstractC23442F.m33133f0(1L, TimeUnit.SECONDS);
                Intrinsics.checkNotNullExpressionValue(m33133f0, "timer(1, TimeUnit.SECONDS)");
                ScopeProvider UNBOUND = ScopeProvider.f75557g0;
                Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
                Object m33135e = m33133f0.m33135e(AutoDispose.m45239a(UNBOUND));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C30880e c30880e = new C30880e();
                ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: p21
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C52558z21.m1976A(Function1.this, obj);
                    }
                });
            }
        }
    }
}
