package co.bird.android.core.mvp;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Component;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002Ö\u0001B+\u0012\b\b\u0002\u0010,\u001a\u00020\u0011\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0011¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J-\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u000bH\u0014J\b\u0010$\u001a\u00020\u000bH\u0014J\b\u0010%\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0019R\u0017\u0010,\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0019\u00104\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R!\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b)\u0010=R\"\u0010F\u001a\u00020?8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010®\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R)\u0010½\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bB\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R)\u0010Ä\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bJ\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R)\u0010Ë\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bR\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R'\u0010Ó\u0001\u001a\u0012\u0012\r\u0012\u000b Ð\u0001*\u0004\u0018\u00010\u00030\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001¨\u0006×\u0001"}, m28432d2 = {"Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/base/BaseCoreActivity;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "f0", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "d0", "i0", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "LG2;", "mode", "onSupportActionModeStarted", "onSupportActionModeFinished", "onDestroy", "onPause", "D", "message", "E", "c", "Z", "getNoActionBar", "()Z", "noActionBar", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "actionBarTitle", "e", "Ljava/lang/Boolean;", "getLightTheme", "()Ljava/lang/Boolean;", "lightTheme", "LJy;", "f", "LJy;", "Q", "()LJy;", "kind", "g", "Lkotlin/Lazy;", "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", "h", "Le13;", "w", "()Le13;", "setNavigator", "(Le13;)V", "navigator", "LDQ3;", "i", "LDQ3;", "x", "()LDQ3;", "h0", "(LDQ3;)V", "permissionManager", "LTq4;", "j", "LTq4;", "y", "()LTq4;", "setReactiveConfig", "(LTq4;)V", "reactiveConfig", "Landroid/os/Handler;", "k", "Landroid/os/Handler;", "S", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "mainHandler", "Lgl;", "l", "Lgl;", "X", "()Lgl;", "setPreference", "(Lgl;)V", "preference", "LEa;", "m", "LEa;", "F", "()LEa;", "setAnalyticsManager", "(LEa;)V", "analyticsManager", "LEg1;", "n", "LEg1;", "M", "()LEg1;", "setEventBus", "(LEg1;)V", "eventBus", "Llh6;", "o", "Llh6;", "b0", "()Llh6;", "setUserManager", "(Llh6;)V", "userManager", "Llg6;", "p", "Llg6;", "getAgreementManager", "()Llg6;", "setAgreementManager", "(Llg6;)V", "agreementManager", "Lqi1;", "q", "Lqi1;", "P", "()Lqi1;", "setExperimentManager", "(Lqi1;)V", "experimentManager", "LVq4;", "r", "LVq4;", "getEventStream", "()LVq4;", "setEventStream", "(LVq4;)V", "eventStream", "LjB0;", "s", "LjB0;", "J", "()LjB0;", "setContractorManager", "(LjB0;)V", "contractorManager", "LFO2;", "t", "LFO2;", "U", "()LFO2;", "setMechanicManager", "(LFO2;)V", "mechanicManager", "LYR4;", "u", "LYR4;", "Y", "()LYR4;", "setRideManager", "(LYR4;)V", "rideManager", "LaM;", "v", "LaM;", "H", "()LaM;", "setBirdManager", "(LaM;)V", "birdManager", "LpJ;", "LpJ;", "getBluetoothManager", "()LpJ;", "setBluetoothManager", "(LpJ;)V", "bluetoothManager", "Ldr4;", "Ldr4;", "R", "()Ldr4;", "setLocationManager", "(Ldr4;)V", "locationManager", "Lo21;", "Lo21;", "K", "()Lo21;", "setDeviceCheckManager", "(Lo21;)V", "deviceCheckManager", "z", "LG2;", "actionMode", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "A", "Lio/reactivex/subjects/a;", "lifecycleEvents", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Boolean;)V", C17296a.f69688o, "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BaseActivity extends BaseCoreActivity implements LifecycleScopeProvider<EnumC7097RE> {

    /* renamed from: A */
    public final C24552a<EnumC7097RE> f63102A;

    /* renamed from: c */
    public final boolean f63103c;

    /* renamed from: d */
    public final Integer f63104d;

    /* renamed from: e */
    public final Boolean f63105e;

    /* renamed from: f */
    public final EnumC4283Jy f63106f;

    /* renamed from: g */
    public final Lazy f63107g;

    /* renamed from: h */
    public InterfaceC40099e13 f63108h;

    /* renamed from: i */
    public DQ3 f63109i;

    /* renamed from: j */
    public C36207Tq4 f63110j;

    /* renamed from: k */
    public Handler f63111k;

    /* renamed from: l */
    public C22454gl f63112l;

    /* renamed from: m */
    public InterfaceC1880Ea f63113m;

    /* renamed from: n */
    public InterfaceC32604Eg1 f63114n;

    /* renamed from: o */
    public InterfaceC44647lh6 f63115o;

    /* renamed from: p */
    public InterfaceC44637lg6 f63116p;

    /* renamed from: q */
    public InterfaceC47617qi1 f63117q;

    /* renamed from: r */
    public InterfaceC36675Vq4 f63118r;

    /* renamed from: s */
    public InterfaceC43160jB0 f63119s;

    /* renamed from: t */
    public FO2 f63120t;

    /* renamed from: u */
    public YR4 f63121u;

    /* renamed from: v */
    public InterfaceC10636aM f63122v;

    /* renamed from: w */
    public InterfaceC27246pJ f63123w;

    /* renamed from: x */
    public InterfaceC40001dr4 f63124x;

    /* renamed from: y */
    public InterfaceC46037o21 f63125y;

    /* renamed from: z */
    public AbstractC2614G2 f63126z;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/core/mvp/BaseActivity$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "", C17296a.f69688o, "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.core.mvp.BaseActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC14461a {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/core/mvp/BaseActivity$a$a;", "", "LlG2;", "mainComponent", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity$a;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Builder
        /* renamed from: co.bird.android.core.mvp.BaseActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14462a {
            /* renamed from: a */
            InterfaceC14462a mo58950a(InterfaceC44393lG2 interfaceC44393lG2);

            InterfaceC14461a build();
        }

        /* renamed from: a */
        void mo58952a(BaseActivity baseActivity);
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/core/mvp/BaseActivity;", "b", "()Lco/bird/android/core/mvp/BaseActivity;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.core.mvp.BaseActivity$b */
    /* loaded from: classes2.dex */
    public static final class C14463b extends Lambda implements Function0<BaseActivity> {
        public C14463b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final BaseActivity invoke() {
            return BaseActivity.this;
        }
    }

    public BaseActivity() {
        this(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: D */
    public void mo58977D() {
        super.mo58977D();
    }

    /* renamed from: E */
    public final void m58976E(String str) {
        if (str != null) {
            C43107j56.m31138b(getApplicationContext(), str, 1).show();
        }
    }

    /* renamed from: F */
    public final InterfaceC1880Ea m58975F() {
        InterfaceC1880Ea interfaceC1880Ea = this.f63113m;
        if (interfaceC1880Ea != null) {
            return interfaceC1880Ea;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsManager");
        return null;
    }

    /* renamed from: H */
    public final InterfaceC10636aM m58974H() {
        InterfaceC10636aM interfaceC10636aM = this.f63122v;
        if (interfaceC10636aM != null) {
            return interfaceC10636aM;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdManager");
        return null;
    }

    /* renamed from: J */
    public final InterfaceC43160jB0 m58973J() {
        InterfaceC43160jB0 interfaceC43160jB0 = this.f63119s;
        if (interfaceC43160jB0 != null) {
            return interfaceC43160jB0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contractorManager");
        return null;
    }

    /* renamed from: K */
    public final InterfaceC46037o21 m58972K() {
        InterfaceC46037o21 interfaceC46037o21 = this.f63125y;
        if (interfaceC46037o21 != null) {
            return interfaceC46037o21;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceCheckManager");
        return null;
    }

    /* renamed from: M */
    public final InterfaceC32604Eg1 m58971M() {
        InterfaceC32604Eg1 interfaceC32604Eg1 = this.f63114n;
        if (interfaceC32604Eg1 != null) {
            return interfaceC32604Eg1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventBus");
        return null;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<EnumC7097RE> mo37326O8() {
        return EnumC7097RE.f31752b.m87016a();
    }

    /* renamed from: P */
    public final InterfaceC47617qi1 m58970P() {
        InterfaceC47617qi1 interfaceC47617qi1 = this.f63117q;
        if (interfaceC47617qi1 != null) {
            return interfaceC47617qi1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentManager");
        return null;
    }

    /* renamed from: Q */
    public EnumC4283Jy mo58969Q() {
        return this.f63106f;
    }

    /* renamed from: R */
    public final InterfaceC40001dr4 m58968R() {
        InterfaceC40001dr4 interfaceC40001dr4 = this.f63124x;
        if (interfaceC40001dr4 != null) {
            return interfaceC40001dr4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationManager");
        return null;
    }

    /* renamed from: S */
    public final Handler m58967S() {
        Handler handler = this.f63111k;
        if (handler != null) {
            return handler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
        return null;
    }

    /* renamed from: U */
    public final FO2 m58966U() {
        FO2 fo2 = this.f63120t;
        if (fo2 != null) {
            return fo2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mechanicManager");
        return null;
    }

    /* renamed from: X */
    public final C22454gl m58965X() {
        C22454gl c22454gl = this.f63112l;
        if (c22454gl != null) {
            return c22454gl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preference");
        return null;
    }

    /* renamed from: Y */
    public final YR4 m58964Y() {
        YR4 yr4 = this.f63121u;
        if (yr4 != null) {
            return yr4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideManager");
        return null;
    }

    /* renamed from: Z */
    public final LifecycleScopeProvider<EnumC7097RE> m58963Z() {
        return (LifecycleScopeProvider) this.f63107g.getValue();
    }

    /* renamed from: b0 */
    public final InterfaceC44647lh6 m58962b0() {
        InterfaceC44647lh6 interfaceC44647lh6 = this.f63115o;
        if (interfaceC44647lh6 != null) {
            return interfaceC44647lh6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userManager");
        return null;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<EnumC7097RE> mo37323c2() {
        Observable<EnumC7097RE> hide = this.f63102A.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lifecycleEvents.hide()");
        return hide;
    }

    /* renamed from: d0 */
    public final void m58961d0() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70218l();
        }
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: f0 */
    public EnumC7097RE peekLifecycle() {
        return this.f63102A.getValue();
    }

    /* renamed from: h0 */
    public void m58959h0(DQ3 dq3) {
        Intrinsics.checkNotNullParameter(dq3, "<set-?>");
        this.f63109i = dq3;
    }

    /* renamed from: i0 */
    public final void m58958i0() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70240G();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC14461a.InterfaceC14462a m58953a = C14464a.m58953a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58953a.mo58950a(c46172oG2.m21419a(application)).build().mo58952a(this);
        if (m58965X().m37571t0() != MapMode.RIDER && !Intrinsics.areEqual(this.f63105e, Boolean.TRUE)) {
            m59030B(this.f63103c);
        } else {
            m59029C(this.f63103c);
        }
        this.f63102A.onNext(EnumC7097RE.ATTACH);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            Integer num = this.f63104d;
            if (num != null) {
                supportActionBar.mo70242E(getString(num.intValue()));
            }
            supportActionBar.mo70212v(true);
            supportActionBar.mo70245B(true);
        }
        m58959h0(new DQ3(this, m58965X(), m58975F()));
        super.onCreate(bundle);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f63102A.onNext(EnumC7097RE.DETACH);
        super.onDestroy();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        AbstractC2614G2 abstractC2614G2 = this.f63126z;
        if (abstractC2614G2 != null) {
            Intrinsics.checkNotNull(abstractC2614G2);
            abstractC2614G2.mo17560c();
        }
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        mo58956x().m110489h(i, permissions, grantResults);
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            if (fragment != null) {
                fragment.onRequestPermissionsResult(i, permissions, grantResults);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, p000.InterfaceC10819ai
    public void onSupportActionModeFinished(AbstractC2614G2 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        super.onSupportActionModeFinished(mode);
        this.f63126z = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, p000.InterfaceC10819ai
    public void onSupportActionModeStarted(AbstractC2614G2 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        super.onSupportActionModeStarted(mode);
        this.f63126z = mode;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: w */
    public InterfaceC40099e13 mo58957w() {
        InterfaceC40099e13 interfaceC40099e13 = this.f63108h;
        if (interfaceC40099e13 != null) {
            return interfaceC40099e13;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: x */
    public DQ3 mo58956x() {
        DQ3 dq3 = this.f63109i;
        if (dq3 != null) {
            return dq3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionManager");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: y */
    public C36207Tq4 mo58955y() {
        C36207Tq4 c36207Tq4 = this.f63110j;
        if (c36207Tq4 != null) {
            return c36207Tq4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactiveConfig");
        return null;
    }

    public /* synthetic */ BaseActivity(boolean z, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }

    public BaseActivity(boolean z, Integer num, Boolean bool) {
        Lazy lazy;
        this.f63103c = z;
        this.f63104d = num;
        this.f63105e = bool;
        this.f63106f = EnumC4283Jy.UNKNOWN;
        lazy = LazyKt__LazyJVMKt.lazy(new C14463b());
        this.f63107g = lazy;
        C24552a<EnumC7097RE> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<BasicScopeEvent>()");
        this.f63102A = m31922e;
    }
}
