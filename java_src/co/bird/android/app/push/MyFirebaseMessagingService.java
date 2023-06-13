package co.bird.android.app.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.app.push.MyFirebaseMessagingService;
import co.bird.android.model.Deal;
import co.bird.android.model.DispatchUserKind;
import co.bird.android.model.User;
import co.bird.android.model.analytics.BonusDealPushed;
import co.bird.android.model.wire.WireBirdEvent;
import co.bird.android.model.wire.WireDeviceCheckParameters;
import co.bird.api.response.BrainSwapPayload;
import co.bird.api.response.CouponsResponse;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J(\u0010\b\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002J*\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001f\u0010\u0083\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, m28432d2 = {"Lco/bird/android/app/push/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "", MessageExtension.FIELD_DATA, "Lco/bird/android/model/DispatchUserKind;", "dispatchUserKind", "Landroid/content/Intent;", "K", "token", "", "L", "", "notificationId", "titleResId", "bodyResId", "priority", "N", "onCreate", "onDestroy", "Lcom/google/firebase/messaging/RemoteMessage;", "remote", "q", "s", "Ldd3;", "h", "Ldd3;", "I", "()Ldd3;", "setSender", "(Ldd3;)V", "sender", "LEg1;", "i", "LEg1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LEg1;", "setEventBus", "(LEg1;)V", "eventBus", "Lwi2;", "j", "Lwi2;", "B", "()Lwi2;", "setDeserializer", "(Lwi2;)V", "deserializer", "LJT0;", "k", "LJT0;", "A", "()LJT0;", "setDealManager", "(LJT0;)V", "dealManager", "LEa;", "l", "LEa;", "w", "()LEa;", "setAnalyticsManager", "(LEa;)V", "analyticsManager", "LfL;", "m", "LfL;", "x", "()LfL;", "setBirdDeviceCheckManager", "(LfL;)V", "birdDeviceCheckManager", "Lom3;", "n", "Lom3;", "getOperatorManager", "()Lom3;", "setOperatorManager", "(Lom3;)V", "operatorManager", "LV74;", "o", "LV74;", "G", "()LV74;", "setPromoManager", "(LV74;)V", "promoManager", "Lgl;", "p", "Lgl;", "F", "()Lgl;", "setPreference", "(Lgl;)V", "preference", "LuL;", "LuL;", "y", "()LuL;", "setBirdEventManager", "(LuL;)V", "birdEventManager", "LaS2;", "r", "LaS2;", "E", "()LaS2;", "setMerchantManager", "(LaS2;)V", "merchantManager", "LZC6;", "LZC6;", "J", "()LZC6;", "setWorkManager", "(LZC6;)V", "workManager", "Ln10;", "t", "Ln10;", "z", "()Ln10;", "setBrainSwapManager", "(Ln10;)V", "brainSwapManager", "Lgv5;", "u", "Lkotlin/Lazy;", "H", "()Lgv5;", Action.SCOPE_ATTRIBUTE, "Lg46$b;", "D", "()Lg46$b;", "logger", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMyFirebaseMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyFirebaseMessagingService.kt\nco/bird/android/app/push/MyFirebaseMessagingService\n+ 2 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n236#1,2:244\n236#1,2:246\n236#1,2:248\n236#1,2:250\n236#1,2:252\n236#1,2:254\n30#2,2:256\n32#2:259\n61#2,26:260\n33#2:286\n34#2:288\n13579#3:258\n13580#3:287\n1#4:289\n*S KotlinDebug\n*F\n+ 1 MyFirebaseMessagingService.kt\nco/bird/android/app/push/MyFirebaseMessagingService\n*L\n150#1:244,2\n155#1:246,2\n160#1:248,2\n164#1:250,2\n168#1:252,2\n172#1:254,2\n193#1:256,2\n193#1:259\n193#1:260,26\n193#1:286\n193#1:288\n193#1:258\n193#1:287\n*E\n"})
/* loaded from: classes2.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: h */
    public InterfaceC39861dd3 f62984h;

    /* renamed from: i */
    public InterfaceC32604Eg1 f62985i;

    /* renamed from: j */
    public C51174wi2 f62986j;

    /* renamed from: k */
    public JT0 f62987k;

    /* renamed from: l */
    public InterfaceC1880Ea f62988l;

    /* renamed from: m */
    public InterfaceC20357fL f62989m;

    /* renamed from: n */
    public InterfaceC46473om3 f62990n;

    /* renamed from: o */
    public V74 f62991o;

    /* renamed from: p */
    public C22454gl f62992p;

    /* renamed from: q */
    public InterfaceC29169uL f62993q;

    /* renamed from: r */
    public InterfaceC37961aS2 f62994r;

    /* renamed from: s */
    public ZC6 f62995s;

    /* renamed from: t */
    public InterfaceC45433n10 f62996t;

    /* renamed from: u */
    public final Lazy f62997u;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "ok", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.push.MyFirebaseMessagingService$a */
    /* loaded from: classes2.dex */
    public static final class C14421a extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C14421a f62998g = new C14421a();

        public C14421a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            C41318g46.m40151m("Successfully register new push token: " + z, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lgv5;", "b", "()Lgv5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.push.MyFirebaseMessagingService$b */
    /* loaded from: classes2.dex */
    public static final class C14422b extends Lambda implements Function0<C41821gv5> {

        /* renamed from: g */
        public static final C14422b f62999g = new C14422b();

        public C14422b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C41821gv5 invoke() {
            return new C41821gv5();
        }
    }

    public MyFirebaseMessagingService() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C14422b.f62999g);
        this.f62997u = lazy;
        H22.f12748a.mo24032s1(this);
    }

    /* renamed from: M */
    public static final void m59125M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final JT0 m59137A() {
        JT0 jt0 = this.f62987k;
        if (jt0 != null) {
            return jt0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dealManager");
        return null;
    }

    /* renamed from: B */
    public final C51174wi2 m59136B() {
        C51174wi2 c51174wi2 = this.f62986j;
        if (c51174wi2 != null) {
            return c51174wi2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deserializer");
        return null;
    }

    /* renamed from: C */
    public final InterfaceC32604Eg1 m59135C() {
        InterfaceC32604Eg1 interfaceC32604Eg1 = this.f62985i;
        if (interfaceC32604Eg1 != null) {
            return interfaceC32604Eg1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventBus");
        return null;
    }

    /* renamed from: D */
    public final C41318g46.AbstractC20723b m59134D() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("firebase-messaging-serv");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"firebase-messaging-serv\")");
        return m40153k;
    }

    /* renamed from: E */
    public final InterfaceC37961aS2 m59133E() {
        InterfaceC37961aS2 interfaceC37961aS2 = this.f62994r;
        if (interfaceC37961aS2 != null) {
            return interfaceC37961aS2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("merchantManager");
        return null;
    }

    /* renamed from: F */
    public final C22454gl m59132F() {
        C22454gl c22454gl = this.f62992p;
        if (c22454gl != null) {
            return c22454gl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preference");
        return null;
    }

    /* renamed from: G */
    public final V74 m59131G() {
        V74 v74 = this.f62991o;
        if (v74 != null) {
            return v74;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoManager");
        return null;
    }

    /* renamed from: H */
    public final C41821gv5 m59130H() {
        return (C41821gv5) this.f62997u.getValue();
    }

    /* renamed from: I */
    public final InterfaceC39861dd3 m59129I() {
        InterfaceC39861dd3 interfaceC39861dd3 = this.f62984h;
        if (interfaceC39861dd3 != null) {
            return interfaceC39861dd3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sender");
        return null;
    }

    /* renamed from: J */
    public final ZC6 m59128J() {
        ZC6 zc6 = this.f62995s;
        if (zc6 != null) {
            return zc6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workManager");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r5.containsKey("uri") == true) goto L5;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent m59127K(Map<String, String> map, DispatchUserKind dispatchUserKind) {
        boolean z;
        Uri uri;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        Intent intent = new Intent(applicationContext, MainActivity.class);
        if (map != null) {
            z = true;
        }
        z = false;
        if (z) {
            String str = map.get("uri");
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            m59134D().mo7228a("Detected deeplink uri: " + uri, new Object[0]);
            intent.setData(uri);
        }
        return intent;
    }

    /* renamed from: L */
    public final void m59126L(String str) {
        H22 h22 = H22.f12748a;
        C22454gl mo27479r = h22.mo27479r();
        mo27479r.m37748B2(str);
        if (mo27479r.m37750B0() != null) {
            Observable<Boolean> mo26966j1 = h22.mo27459x1().mo26966j1(str);
            final C14421a c14421a = C14421a.f62998g;
            mo26966j1.subscribe(new InterfaceC23484g() { // from class: bY2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MyFirebaseMessagingService.m59125M(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: N */
    public final void m59124N(int i, int i2, int i3, int i4) {
        Notification m71057c = m59129I().mo42697d(i, new Intent(getApplicationContext(), MainActivity.class)).m71036x(i4).m71067B(C48193rg4.ic_bird_logo).m71047m(getApplicationContext().getString(i2)).m71048l(getApplicationContext().getString(i3)).m71060I(System.currentTimeMillis()).m71057c();
        Intrinsics.checkNotNullExpressionValue(m71057c, "sender.getNotificationBu…eMillis())\n      .build()");
        m59129I().mo42696e(m71057c, i);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m59130H().m37321i(AbstractC11719f.EnumC11720a.ON_CREATE);
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m59130H().m37321i(AbstractC11719f.EnumC11720a.ON_DESTROY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r8 == null) goto L70;
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo47215q(RemoteMessage remote) {
        Set<String> set;
        Map<String, String> map;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        Intrinsics.checkNotNullParameter(remote, "remote");
        boolean z = false;
        m59134D().mo7221o("Received message", new Object[0]);
        if (BrazeFirebaseMessagingService.f68961h.m53254a(this, remote)) {
            m59134D().mo7221o("Braze consumed message.", new Object[0]);
            return;
        }
        RemoteMessage.C18353b m47207u = remote.m47207u();
        Map<String, String> m47208s = remote.m47208s();
        Intrinsics.checkNotNullExpressionValue(m47208s, "remote.data");
        Bundle extras = remote.m47209F().getExtras();
        if (extras != null) {
            set = extras.keySet();
        } else {
            set = null;
        }
        if (set != null && set.contains("refresh_merchant_history")) {
            z = true;
        }
        if (z) {
            m59133E().mo12345b();
            m59124N(1241, C45278ml4.bird_pay_label, C45871nl4.notification_merchant_new_transaction_body, 1);
        }
        String str2 = m47208s.get("command");
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(str2);
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(jSONObject.getString("command_name"), jSONObject.getJSONObject("parameters").toString()));
        }
        map = m47208s;
        String str3 = map.get(EnumC34191La4.BIRD_EVENT.m96623b());
        if (str3 != null) {
            obj = m59136B().m6459c(str3, Reflection.getOrCreateKotlinClass(WireBirdEvent.class));
        } else {
            obj = null;
        }
        WireBirdEvent wireBirdEvent = (WireBirdEvent) obj;
        if (wireBirdEvent != null) {
            m59120y().mo6982a(wireBirdEvent);
            m59135C().mo104915c(new C9756YK(wireBirdEvent));
        }
        String str4 = map.get(EnumC34191La4.DEAL.m96623b());
        if (str4 != null) {
            obj2 = m59136B().m6459c(str4, Reflection.getOrCreateKotlinClass(Deal.class));
        } else {
            obj2 = null;
        }
        Deal deal = (Deal) obj2;
        if (deal != null) {
            InterfaceC1880Ea m59122w = m59122w();
            User m37750B0 = m59132F().m37750B0();
            if (m37750B0 != null) {
                str = m37750B0.getId();
            } else {
                str = null;
            }
            m59122w.mo55956N(new BonusDealPushed(deal, str));
            m59137A().mo92270f(deal);
        }
        String str5 = map.get(EnumC34191La4.BLUETOOTH_SWEEP.m96623b());
        if (str5 != null) {
            obj3 = m59136B().m6459c(str5, Reflection.getOrCreateKotlinClass(Map.class));
        } else {
            obj3 = null;
        }
        if (((Map) obj3) != null) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            C34893Oa4.m92006c(applicationContext, m59128J());
        }
        String str6 = map.get(EnumC34191La4.COUPONS.m96623b());
        if (str6 != null) {
            obj4 = m59136B().m6459c(str6, Reflection.getOrCreateKotlinClass(CouponsResponse.class));
        } else {
            obj4 = null;
        }
        CouponsResponse couponsResponse = (CouponsResponse) obj4;
        if (couponsResponse != null) {
            m59131G().mo27797e(couponsResponse.getCoupons());
        }
        String str7 = map.get(EnumC34191La4.DEVICE_CHECK.m96623b());
        if (str7 != null) {
            obj5 = m59136B().m6459c(str7, Reflection.getOrCreateKotlinClass(WireDeviceCheckParameters.class));
        } else {
            obj5 = null;
        }
        WireDeviceCheckParameters wireDeviceCheckParameters = (WireDeviceCheckParameters) obj5;
        if (wireDeviceCheckParameters != null) {
            m59121x().mo21338a(wireDeviceCheckParameters.getCode());
        }
        String str8 = map.get(EnumC34191La4.BRAIN_SWAP.m96623b());
        if (str8 != null) {
            obj6 = m59136B().m6459c(str8, Reflection.getOrCreateKotlinClass(BrainSwapPayload.class));
        } else {
            obj6 = null;
        }
        BrainSwapPayload brainSwapPayload = (BrainSwapPayload) obj6;
        if (brainSwapPayload != null) {
            m59119z().mo21983U(brainSwapPayload.getImei(), Boolean.valueOf(brainSwapPayload.getAssociated())).subscribe();
        }
        if (m47207u != null) {
            m59129I().mo42698c(m47207u, m59127K(m47208s, null));
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: s */
    public void mo47213s(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.mo47213s(token);
        m59126L(token);
    }

    /* renamed from: w */
    public final InterfaceC1880Ea m59122w() {
        InterfaceC1880Ea interfaceC1880Ea = this.f62988l;
        if (interfaceC1880Ea != null) {
            return interfaceC1880Ea;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsManager");
        return null;
    }

    /* renamed from: x */
    public final InterfaceC20357fL m59121x() {
        InterfaceC20357fL interfaceC20357fL = this.f62989m;
        if (interfaceC20357fL != null) {
            return interfaceC20357fL;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdDeviceCheckManager");
        return null;
    }

    /* renamed from: y */
    public final InterfaceC29169uL m59120y() {
        InterfaceC29169uL interfaceC29169uL = this.f62993q;
        if (interfaceC29169uL != null) {
            return interfaceC29169uL;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdEventManager");
        return null;
    }

    /* renamed from: z */
    public final InterfaceC45433n10 m59119z() {
        InterfaceC45433n10 interfaceC45433n10 = this.f62996t;
        if (interfaceC45433n10 != null) {
            return interfaceC45433n10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brainSwapManager");
        return null;
    }
}
