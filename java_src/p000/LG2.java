package p000;

import android.content.Context;
import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LoginException;
import co.bird.android.model.SystemSettingsReason;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.analytics.AppOpenedWithMockLocationProvider;
import co.bird.android.model.analytics.AppStart;
import co.bird.android.model.analytics.ColdAppStart;
import co.bird.android.model.analytics.SplashScreenNavigation;
import co.bird.android.model.analytics.SplashScreenTrace;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.HeadlessScanMode;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.BLEScanTrigger;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import dagger.Lazy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.schedulers.C24551b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32849Fh3;
import p000.C44821lz0;
import p000.C46856pQ3;
import p000.H31;
import p000.InterfaceC1880Ea;
import p000.InterfaceC43034iy2;
import p000.LG2;
@Metadata(m28433d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0005B¯\u0001\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010]\u001a\u00020[\u0012\f\u0010a\u001a\b\u0012\u0004\u0012\u00020_0^¢\u0006\u0004\bf\u0010gJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010`R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010d¨\u0006h"}, m28432d2 = {"LLG2;", "LtG2;", "", "specialTaskDispatchReceived", "", C17296a.f69688o, "t", "F", "Lco/bird/android/model/User;", "user", "isMerchant", "v", "w", "y", "isLocationMocked", "blockMockLocationProviders", "s", "x", "D", "z", "Ldr4;", "Ldr4;", "locationManager", "Lgl;", "b", "Lgl;", "preference", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llh6;", DateTokenConverter.CONVERTER_KEY, "Llh6;", "userManager", "LRh6;", "e", "LRh6;", "userStream", "Lhq;", "f", "Lhq;", "authTokenManager", "Lpv0;", "g", "Lpv0;", "configManager", "LEa;", "h", "LEa;", "analyticsManager", "LTq4;", "i", "LTq4;", "reactiveConfig", "LBc;", "j", "LBc;", "deviceManager", "LaS2;", "k", "LaS2;", "merchantManager", "LNV0;", "l", "LNV0;", "deepLinkNavigatorResolver", "Liy2;", "m", "Liy2;", "loginManager", "Lcom/uber/autodispose/ScopeProvider;", "n", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "o", "Le13;", "navigator", "LbH2;", "p", "LbH2;", "ui", "LDQ3;", "q", "LDQ3;", "permissionManager", "Ldy2;", "r", "Ldy2;", "loginExceptionHandler", "LcI4;", "LcI4;", "repositoryManager", "Ldagger/Lazy;", "LZC6;", "Ldagger/Lazy;", "workManager", "u", "Z", "()Z", "isLoggedIn", "<init>", "(Ldr4;Lgl;Landroid/content/Context;Llh6;LRh6;Lhq;Lpv0;LEa;LTq4;LBc;LaS2;LNV0;Liy2;Lcom/uber/autodispose/ScopeProvider;Le13;LbH2;LDQ3;Ldy2;LcI4;Ldagger/Lazy;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPresenter.kt\nco/bird/android/app/feature/main/MainPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,439:1\n237#2:440\n199#2:441\n180#2:445\n180#2:446\n2624#3,3:442\n*S KotlinDebug\n*F\n+ 1 MainPresenter.kt\nco/bird/android/app/feature/main/MainPresenterImpl\n*L\n329#1:440\n348#1:441\n382#1:445\n431#1:446\n355#1:442,3\n*E\n"})
/* renamed from: LG2 */
/* loaded from: classes2.dex */
public final class LG2 implements InterfaceC49136tG2 {

    /* renamed from: v */
    public static final C4766a f20979v = new C4766a(null);

    /* renamed from: w */
    public static final int f20980w = 8;

    /* renamed from: a */
    public final InterfaceC40001dr4 f20981a;

    /* renamed from: b */
    public final C22454gl f20982b;

    /* renamed from: c */
    public final Context f20983c;

    /* renamed from: d */
    public final InterfaceC44647lh6 f20984d;

    /* renamed from: e */
    public final InterfaceC35660Rh6 f20985e;

    /* renamed from: f */
    public final InterfaceC22767hq f20986f;

    /* renamed from: g */
    public final InterfaceC47153pv0 f20987g;

    /* renamed from: h */
    public final InterfaceC1880Ea f20988h;

    /* renamed from: i */
    public final C36207Tq4 f20989i;

    /* renamed from: j */
    public final InterfaceC0650Bc f20990j;

    /* renamed from: k */
    public final InterfaceC37961aS2 f20991k;

    /* renamed from: l */
    public final NV0 f20992l;

    /* renamed from: m */
    public final InterfaceC43034iy2 f20993m;

    /* renamed from: n */
    public final ScopeProvider f20994n;

    /* renamed from: o */
    public final InterfaceC40099e13 f20995o;

    /* renamed from: p */
    public final InterfaceC38455bH2 f20996p;

    /* renamed from: q */
    public final DQ3 f20997q;

    /* renamed from: r */
    public final C40069dy2 f20998r;

    /* renamed from: s */
    public final InterfaceC39059cI4 f20999s;

    /* renamed from: t */
    public final Lazy<ZC6> f21000t;

    /* renamed from: u */
    public boolean f21001u;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"LLG2$a;", "", "", "MULTI_TAPS_REQUIRED", "I", "MULTI_TAPS_TIME_LIMIT", "", "MULTI_TAP_LISTENER_START_DELAY", "J", "RETRY_WHEN_INITIAL_DELAY_MS", "RETRY_WHEN_MAX_RETRIES", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LG2$a */
    /* loaded from: classes2.dex */
    public static final class C4766a {
        public /* synthetic */ C4766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4766a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001aÒ\u0001\u0012b\b\u0001\u0012^\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004 \u0006*.\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0006*h\u0012b\b\u0001\u0012^\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004 \u0006*.\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "Lio/reactivex/schedulers/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$b */
    /* loaded from: classes2.dex */
    public static final class C4767b extends Lambda implements Function1<Long, InterfaceC23434B<? extends List<? extends C24551b<Unit>>>> {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u000520\u0010\u0004\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lio/reactivex/schedulers/b;", "", "kotlin.jvm.PlatformType", "times", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LG2$b$a */
        /* loaded from: classes2.dex */
        public static final class C4768a extends Lambda implements Function1<List<? extends C24551b<Unit>>, Boolean> {

            /* renamed from: g */
            public static final C4768a f21003g = new C4768a();

            public C4768a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(List<C24551b<Unit>> times) {
                Object last;
                Object first;
                Intrinsics.checkNotNullParameter(times, "times");
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) times);
                long m31925a = ((C24551b) last).m31925a();
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) times);
                return Boolean.valueOf(m31925a - ((C24551b) first).m31925a() < 2000);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(List<? extends C24551b<Unit>> list) {
                return invoke2((List<C24551b<Unit>>) list);
            }
        }

        public C4767b() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<C24551b<Unit>>> invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable<C24551b<Unit>> timestamp = LG2.this.f20996p.mo44449F8().timestamp(TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(timestamp, "ui.logoUnthrottledClicks…mp(TimeUnit.MILLISECONDS)");
            Observable slidingWindow$default = C37279Yf5.slidingWindow$default(timestamp, 7, false, 2, null);
            final C4768a c4768a = C4768a.f21003g;
            return slidingWindow$default.filter(new InterfaceC23494q() { // from class: MG2
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = LG2.C4767b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u00022b\u0010\u0004\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*.\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lio/reactivex/schedulers/b;", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$c */
    /* loaded from: classes2.dex */
    public static final class C4769c extends Lambda implements Function1<List<? extends C24551b<Unit>>, Unit> {
        public C4769c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C24551b<Unit>> list) {
            invoke2((List<C24551b<Unit>>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C24551b<Unit>> list) {
            InterfaceC38455bH2 interfaceC38455bH2 = LG2.this.f20996p;
            String deviceId = LG2.this.f20990j.getDeviceId();
            interfaceC38455bH2.snackToast("Device ID: " + deviceId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$d */
    /* loaded from: classes2.dex */
    public static final class C4770d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C4770d f21005g = new C4770d();

        public C4770d() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/HeadlessScanMode;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$e */
    /* loaded from: classes2.dex */
    public static final class C4771e extends Lambda implements Function1<Pair<? extends HeadlessScanMode, ? extends Config>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LG2$e$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C4772a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HeadlessScanMode.values().length];
                try {
                    iArr[HeadlessScanMode.ONE_OFF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeadlessScanMode.PERIODIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeadlessScanMode.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HeadlessScanMode.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C4771e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HeadlessScanMode, ? extends Config> pair) {
            invoke2((Pair<? extends HeadlessScanMode, Config>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends HeadlessScanMode, Config> pair) {
            Config component2 = pair.component2();
            C44821lz0 m26574a = new C44821lz0.C25841a().m26573b(S73.CONNECTED).m26574a();
            int i = C4772a.$EnumSwitchMapping$0[pair.component1().ordinal()];
            if (i == 1) {
                C12124b m65581a = new C12124b.C12125a().m65577e("co.bird.android.app.feature.bluetooth.job.trigger", BLEScanTrigger.APP_LAUNCH.name()).m65581a();
                Intrinsics.checkNotNullExpressionValue(m65581a, "Builder().putString(Extr….APP_LAUNCH.name).build()");
                ((ZC6) LG2.this.f21000t.get()).m73615f("periodic_headless_sweep", EnumC41094fi1.REPLACE, new C32849Fh3.C2399a(HeadlessSweepWorker.class).m109252h(m26574a).m109249k(m65581a).m109257a());
            } else if (i != 2) {
                if (i == 3 || i == 4) {
                    ((ZC6) LG2.this.f21000t.get()).mo71772b("periodic_headless_sweep");
                }
            } else {
                C12124b m65581a2 = new C12124b.C12125a().m65577e("co.bird.android.app.feature.bluetooth.job.trigger", BLEScanTrigger.PERIODIC.name()).m65581a();
                Intrinsics.checkNotNullExpressionValue(m65581a2, "Builder().putString(Extr…er.PERIODIC.name).build()");
                ((ZC6) LG2.this.f21000t.get()).mo71770e("periodic_headless_sweep", EnumC40501ei1.REPLACE, new C46856pQ3.C27290a(HeadlessSweepWorker.class, component2.getBeaconConfig().getHeadlessScanPeriodicInterval(), TimeUnit.SECONDS).m109252h(m26574a).m109249k(m65581a2).m109257a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$f */
    /* loaded from: classes2.dex */
    public static final class C4773f extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends User>> {
        public C4773f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends User> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC43034iy2.C24653a.verifyLogin$default(LG2.this.f20993m, false, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$g */
    /* loaded from: classes2.dex */
    public static final class C4774g extends Lambda implements Function1<Throwable, Unit> {
        public C4774g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th instanceof LoginException) {
                return;
            }
            C41318g46.m40159e(th);
            LG2.this.f20996p.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$h */
    /* loaded from: classes2.dex */
    public static final class C4775h extends Lambda implements Function1<User, Unit> {

        /* renamed from: g */
        public static final C4775h f21009g = new C4775h();

        public C4775h() {
            super(1);
        }

        /* renamed from: a */
        public final void m97453a(User user) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m97453a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4776i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C4776i(Object obj) {
            super(1, obj, C40069dy2.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C40069dy2) this.receiver).m43464a(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMainPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPresenter.kt\nco/bird/android/app/feature/main/MainPresenterImpl$startApp$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,439:1\n1#2:440\n*E\n"})
    /* renamed from: LG2$j */
    /* loaded from: classes2.dex */
    public static final class C4777j extends Lambda implements Function1<Pair<? extends User, ? extends Boolean>, Unit> {
        public C4777j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends User, ? extends Boolean> pair) {
            invoke2((Pair<User, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<User, Boolean> pair) {
            User user = pair.component1();
            Boolean isMerchant = pair.component2();
            if (user.getEmail() == null) {
                LG2.this.f20995o.mo37189C2();
                LG2.this.f20995o.close();
                LG2.this.f20988h.mo55956N(new SplashScreenNavigation("IntroMagicLink", "checkUser"));
                InterfaceC1880Ea.C1881a.stopTrace$default(LG2.this.f20988h, new SplashScreenTrace(), null, null, null, 14, null);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(user, "user");
            if (UserKt.isContractor(user) && LG2.this.f20982b.m37571t0() != MapMode.RIDER && !AbstractC5914OB.f26099m.m92645a(UserKt.getRoles(user, isMerchant))) {
                UserRoleItem m37579r0 = LG2.this.f20982b.m37579r0();
                if (m37579r0 != null) {
                    LG2.this.f20982b.m37732F2(m37579r0);
                }
                LG2.this.f20982b.m37548z(MapMode.OPERATOR);
            }
            if (LG2.this.f21001u && UserKt.isOperator(user)) {
                UserRoleItem m37579r02 = LG2.this.f20982b.m37579r0();
                if (m37579r02 != null) {
                    LG2.this.f20982b.m37732F2(m37579r02);
                }
                LG2.this.f20982b.m37548z(MapMode.OPERATOR);
            }
            LG2 lg2 = LG2.this;
            Intrinsics.checkNotNullExpressionValue(isMerchant, "isMerchant");
            if (lg2.m97460v(user, isMerchant.booleanValue()) || LG2.this.m97459w(user, isMerchant.booleanValue())) {
                LG2.this.m97457y();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$k */
    /* loaded from: classes2.dex */
    public static final class C4778k extends Lambda implements Function1<Pair<? extends User, ? extends Boolean>, InterfaceC23447K<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LG2$k$a */
        /* loaded from: classes2.dex */
        public static final class C4779a extends Lambda implements Function1<FQ3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ LG2 f21012g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4779a(LG2 lg2) {
                super(1);
                this.f21012g = lg2;
            }

            /* renamed from: a */
            public final void m97446a(FQ3 fq3) {
                if (!fq3.m107154a() && !this.f21012g.f20989i.m82623f8().m73665a().getRideConfig().getEnableLocationOptOut()) {
                    this.f21012g.f20996p.warn(C45871nl4.main_location_error);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
                m97446a(fq3);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LG2$k$b */
        /* loaded from: classes2.dex */
        public static final class C4780b extends Lambda implements Function1<FQ3, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ LG2 f21013g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4780b(LG2 lg2) {
                super(1);
                this.f21013g = lg2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(FQ3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(this.f21013g.f20989i.m82623f8().m73665a().getRideConfig().getEnableLocationOptOut());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "isMocked", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LG2$k$c */
        /* loaded from: classes2.dex */
        public static final class C4781c extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ LG2 f21014g;

            /* renamed from: h */
            public final /* synthetic */ User f21015h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: LG2$k$c$a */
            /* loaded from: classes2.dex */
            public static final class C4782a extends Lambda implements Function1<DialogResponse, Unit> {

                /* renamed from: g */
                public final /* synthetic */ LG2 f21016g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4782a(LG2 lg2) {
                    super(1);
                    this.f21016g = lg2;
                }

                /* renamed from: a */
                public final void m97440a(DialogResponse dialogResponse) {
                    if (dialogResponse == DialogResponse.OK) {
                        this.f21016g.f20995o.mo37013h2(SystemSettingsReason.MOCK_LOCATION);
                        this.f21016g.f20988h.mo55956N(new SplashScreenNavigation("SystemSettings", null, 2, null));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                    m97440a(dialogResponse);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: LG2$k$c$b */
            /* loaded from: classes2.dex */
            public static final class C4783b extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Boolean>> {

                /* renamed from: g */
                public static final C4783b f21017g = new C4783b();

                public C4783b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23447K<? extends Boolean> invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return AbstractC23442F.m33158H(Boolean.FALSE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4781c(LG2 lg2, User user) {
                super(1);
                this.f21014g = lg2;
                this.f21015h = user;
            }

            /* renamed from: d */
            public static final InterfaceC23447K m97441d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23447K) tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23447K<? extends Boolean> invoke(Boolean isMocked) {
                Intrinsics.checkNotNullParameter(isMocked, "isMocked");
                if (isMocked.booleanValue()) {
                    this.f21014g.f20988h.mo55956N(new AppOpenedWithMockLocationProvider());
                    LG2 lg2 = this.f21014g;
                    boolean booleanValue = isMocked.booleanValue();
                    User user = this.f21015h;
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    if (lg2.m97463s(booleanValue, user, this.f21014g.f20989i.m82623f8().m73665a().getBlockMockLocationProviders())) {
                        InterfaceC1880Ea.C1881a.stopTrace$default(this.f21014g.f20988h, new SplashScreenTrace(), null, null, null, 14, null);
                        AbstractC23442F<DialogResponse> mo44445m6 = this.f21014g.f20996p.mo44445m6();
                        final C4782a c4782a = new C4782a(this.f21014g);
                        AbstractC23442F<DialogResponse> m33101w = mo44445m6.m33101w(new InterfaceC23484g() { // from class: QG2
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                LG2.C4778k.C4781c.invoke$lambda$0(Function1.this, obj);
                            }
                        });
                        final C4783b c4783b = C4783b.f21017g;
                        return m33101w.m33165A(new InterfaceC23492o() { // from class: RG2
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC23447K m97441d;
                                m97441d = LG2.C4778k.C4781c.m97441d(Function1.this, obj);
                                return m97441d;
                            }
                        });
                    }
                    return AbstractC23442F.m33158H(Boolean.TRUE);
                }
                return AbstractC23442F.m33158H(Boolean.TRUE);
            }
        }

        public C4778k() {
            super(1);
        }

        /* renamed from: e */
        public static final Boolean m97448e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23447K m97447f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends Boolean> invoke(Pair<User, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            User component1 = pair.component1();
            if (LG2.this.m97458x()) {
                AbstractC23442F<FQ3> m33142Y = LG2.this.f20997q.m110485l(Permission.ACCESS_FINE_LOCATION).m33142Y(C23454a.m33087a());
                final C4779a c4779a = new C4779a(LG2.this);
                AbstractC23442F<FQ3> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: NG2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        LG2.C4778k.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C4780b c4780b = new C4780b(LG2.this);
                return m33101w.m33157I(new InterfaceC23492o() { // from class: OG2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Boolean m97448e;
                        m97448e = LG2.C4778k.m97448e(Function1.this, obj);
                        return m97448e;
                    }
                });
            }
            AbstractC23442F<Boolean> mo43624h = LG2.this.f20981a.mo43624h();
            final C4781c c4781c = new C4781c(LG2.this, component1);
            return mo43624h.m33165A(new InterfaceC23492o() { // from class: PG2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m97447f;
                    m97447f = LG2.C4778k.m97447f(Function1.this, obj);
                    return m97447f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "proceed", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$l */
    /* loaded from: classes2.dex */
    public static final class C4784l extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C4784l f21018g = new C4784l();

        public C4784l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean proceed) {
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            return proceed;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "proceed", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$m */
    /* loaded from: classes2.dex */
    public static final class C4785m extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Boolean>> {
        public C4785m() {
            super(1);
        }

        /* renamed from: c */
        public static final void m97436c(LG2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C41318g46.m40157g("Databases cleared", new Object[0]);
            this$0.f20982b.m37709L1();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Boolean> invoke(Boolean proceed) {
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            if (!LG2.this.f20982b.m37556x()) {
                AbstractC23461c mo43050a = LG2.this.f20999s.mo43050a();
                final LG2 lg2 = LG2.this;
                return mo43050a.m33029z(new InterfaceC23478a() { // from class: SG2
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        LG2.C4785m.m97436c(LG2.this);
                    }
                }).m33042m(AbstractC23442F.m33158H(proceed));
            }
            return AbstractC23442F.m33158H(proceed);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$n */
    /* loaded from: classes2.dex */
    public static final class C4786n extends Lambda implements Function1<Boolean, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LG2$n$a */
        /* loaded from: classes2.dex */
        public static final class C4787a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ LG2 f21021g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4787a(LG2 lg2) {
                super(1);
                this.f21021g = lg2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable e) {
                C41318g46.m40159e(e);
                Intrinsics.checkNotNullExpressionValue(e, "e");
                Throwable m87362c = R36.m87362c(e);
                if (m87362c instanceof RetrofitException) {
                    H31.C3014a.showRetrofitExceptionDialog$default(this.f21021g.f20996p, e, null, null, 6, null);
                } else if (m87362c instanceof LV0) {
                    H31.C3014a.showBirdDialog$default(this.f21021g.f20996p, C45128mW0.f98123d, false, false, null, null, null, null, 124, null);
                } else {
                    this.f21021g.f20996p.errorGeneric();
                }
                InterfaceC1880Ea.C1881a.stopTrace$default(this.f21021g.f20988h, new SplashScreenTrace(), null, null, null, 14, null);
            }
        }

        public C4786n() {
            super(1);
        }

        /* renamed from: c */
        public static final void m97433c(LG2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C41318g46.m40163a("deeplink navigator resolved", new Object[0]);
            this$0.f20988h.mo55956N(new SplashScreenNavigation("ForwardedToDeeplink", null, 2, null));
            InterfaceC1880Ea.C1881a.stopTrace$default(this$0.f20988h, new SplashScreenTrace(), null, null, null, 14, null);
        }

        /* renamed from: d */
        public static final void m97432d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            NV0 unused = LG2.this.f20992l;
            AbstractC23461c mo78300b = LG2.this.f20992l.mo78300b();
            final LG2 lg2 = LG2.this;
            AbstractC23461c m33029z = mo78300b.m33029z(new InterfaceC23478a() { // from class: TG2
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    LG2.C4786n.m97433c(LG2.this);
                }
            });
            final C4787a c4787a = new C4787a(LG2.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: UG2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    LG2.C4786n.m97432d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMainPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPresenter.kt\nco/bird/android/app/feature/main/MainPresenterImpl$startApp$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,439:1\n1#2:440\n*E\n"})
    /* renamed from: LG2$o */
    /* loaded from: classes2.dex */
    public static final class C4788o extends Lambda implements Function1<Throwable, Unit> {
        public C4788o() {
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
            Unit unit = null;
            RetrofitException retrofitException = th instanceof RetrofitException ? (RetrofitException) th : null;
            if (retrofitException != null) {
                LG2.this.f20996p.error(retrofitException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                LG2.this.f20996p.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "e", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LG2$p */
    /* loaded from: classes2.dex */
    public static final class C4789p extends Lambda implements Function1<Throwable, InterfaceC23496h> {
        public C4789p() {
            super(1);
        }

        /* renamed from: c */
        public static final void m97429c(LG2 this$0, Throwable e) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(e, "$e");
            this$0.f20996p.mo44447Qg();
            throw e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof RetrofitException) {
                AbstractC23461c ignoreElements = LG2.this.f20996p.mo44448Mc().ignoreElements();
                final LG2 lg2 = LG2.this;
                return ignoreElements.m33029z(new InterfaceC23478a() { // from class: VG2
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        LG2.C4789p.m97429c(LG2.this, e);
                    }
                });
            }
            throw e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "connected", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LG2$q */
    /* loaded from: classes2.dex */
    public static final class C4790q extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C4790q f21024g = new C4790q();

        public C4790q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean connected) {
            Intrinsics.checkNotNullParameter(connected, "connected");
            return connected;
        }
    }

    public LG2(InterfaceC40001dr4 locationManager, C22454gl preference, Context context, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream, InterfaceC22767hq authTokenManager, InterfaceC47153pv0 configManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC0650Bc deviceManager, InterfaceC37961aS2 merchantManager, NV0 deepLinkNavigatorResolver, InterfaceC43034iy2 loginManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC38455bH2 ui, DQ3 permissionManager, C40069dy2 loginExceptionHandler, InterfaceC39059cI4 repositoryManager, Lazy<ZC6> workManager) {
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(deepLinkNavigatorResolver, "deepLinkNavigatorResolver");
        Intrinsics.checkNotNullParameter(loginManager, "loginManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(loginExceptionHandler, "loginExceptionHandler");
        Intrinsics.checkNotNullParameter(repositoryManager, "repositoryManager");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f20981a = locationManager;
        this.f20982b = preference;
        this.f20983c = context;
        this.f20984d = userManager;
        this.f20985e = userStream;
        this.f20986f = authTokenManager;
        this.f20987g = configManager;
        this.f20988h = analyticsManager;
        this.f20989i = reactiveConfig;
        this.f20990j = deviceManager;
        this.f20991k = merchantManager;
        this.f20992l = deepLinkNavigatorResolver;
        this.f20993m = loginManager;
        this.f20994n = scopeProvider;
        this.f20995o = navigator;
        this.f20996p = ui;
        this.f20997q = permissionManager;
        this.f20998r = loginExceptionHandler;
        this.f20999s = repositoryManager;
        this.f21000t = workManager;
    }

    /* renamed from: A */
    public static final InterfaceC23434B m97499A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m97498B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m97497C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m97495E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final boolean m97493G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final InterfaceC23447K m97492H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m97491I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m97490J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m97489K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m97488L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m97487M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final boolean m97486N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O */
    public static final InterfaceC23447K m97485O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23496h m97484P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m97483Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23496h m97482R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m97481S(LG2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f20998r.m43463b();
    }

    /* renamed from: D */
    public final void m97496D() {
        Observable take = C24523e.f91168a.m31956a(this.f20989i.m82568k8(), this.f20989i.m82623f8()).take(1L);
        Intrinsics.checkNotNullExpressionValue(take, "Observables\n      .combi…ig.config)\n      .take(1)");
        Object m33094as = take.m33094as(AutoDispose.m45239a(this.f20994n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4771e c4771e = new C4771e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: EG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97495E(Function1.this, obj);
            }
        });
    }

    /* renamed from: F */
    public final void m97494F() {
        if (!m97461u()) {
            this.f20995o.mo37189C2();
            this.f20995o.close();
            this.f20988h.mo55956N(new SplashScreenNavigation("IntroMagicLink", "no_checkConfig_no_token"));
            InterfaceC1880Ea.C1881a.stopTrace$default(this.f20988h, new SplashScreenTrace(), null, null, null, 14, null);
            return;
        }
        AbstractC23442F<User> m33142Y = this.f20984d.getUser().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "userManager.getUser()\n  …scribeOn(Schedulers.io())");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(m33142Y, this.f20991k.mo12337j());
        final C4777j c4777j = new C4777j();
        AbstractC23442F m33101w = m74531s0.m33101w(new InterfaceC23484g() { // from class: FG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97488L(Function1.this, obj);
            }
        });
        final C4778k c4778k = new C4778k();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: JG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97487M;
                m97487M = LG2.m97487M(Function1.this, obj);
                return m97487M;
            }
        });
        final C4784l c4784l = C4784l.f21018g;
        AbstractC24507p m33098z = m33165A.m33098z(new InterfaceC23494q() { // from class: KG2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m97486N;
                m97486N = LG2.m97486N(Function1.this, obj);
                return m97486N;
            }
        });
        final C4785m c4785m = new C4785m();
        AbstractC23442F m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: vG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97485O;
                m97485O = LG2.m97485O(Function1.this, obj);
                return m97485O;
            }
        });
        final C4786n c4786n = new C4786n();
        AbstractC23461c m33164B = m32072C.m33164B(new InterfaceC23492o() { // from class: wG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m97484P;
                m97484P = LG2.m97484P(Function1.this, obj);
                return m97484P;
            }
        });
        final C4788o c4788o = new C4788o();
        AbstractC23461c m33064V = m33164B.m33084B(new InterfaceC23484g() { // from class: xG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97483Q(Function1.this, obj);
            }
        }).m33064V(SN4.m85591m(RetrofitException.class).m85581e(500L, TimeUnit.MILLISECONDS, 2.0d).m85579g(3).m85585a());
        final C4789p c4789p = new C4789p();
        AbstractC23461c m33064V2 = m33064V.m33067S(new InterfaceC23492o() { // from class: yG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m97482R;
                m97482R = LG2.m97482R(Function1.this, obj);
                return m97482R;
            }
        }).m33064V(SN4.m85591m(RetrofitException.class).m85585a());
        Intrinsics.checkNotNullExpressionValue(m33064V2, "private fun startApp() {…tionHandler::onError)\n  }");
        Object m33041n = m33064V2.m33041n(AutoDispose.m45239a(this.f20994n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: zG2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                LG2.m97481S(LG2.this);
            }
        });
        Observable<Boolean> subscribeOn = C35514Qr4.m87862b().subscribeOn(C24542a.m31932c());
        final C4790q c4790q = C4790q.f21024g;
        Observable<Boolean> filter = subscribeOn.filter(new InterfaceC23494q() { // from class: AG2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m97493G;
                m97493G = LG2.m97493G(Function1.this, obj);
                return m97493G;
            }
        });
        final C4773f c4773f = new C4773f();
        AbstractC23442F firstOrError = filter.flatMapSingle(new InterfaceC23492o() { // from class: BG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97492H;
                m97492H = LG2.m97492H(Function1.this, obj);
                return m97492H;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun startApp() {…tionHandler::onError)\n  }");
        AbstractC23442F m37271b = C41848gy2.m37271b(firstOrError, this.f20998r);
        final C4774g c4774g = new C4774g();
        AbstractC23442F m33143W = m37271b.m33106t(new InterfaceC23484g() { // from class: GG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97491I(Function1.this, obj);
            }
        }).m33143W(this.f20993m.mo24622a());
        Intrinsics.checkNotNullExpressionValue(m33143W, "private fun startApp() {…tionHandler::onError)\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33143W.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4775h c4775h = C4775h.f21009g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: HG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97490J(Function1.this, obj);
            }
        };
        final C4776i c4776i = new C4776i(this.f20998r);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: IG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97489K(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC49136tG2
    /* renamed from: a */
    public void mo12548a(boolean z) {
        C41318g46.m40163a("onCreate called", new Object[0]);
        InterfaceC1880Ea.C1881a.startTrace$default(this.f20988h, new SplashScreenTrace(), null, null, 6, null);
        this.f21001u = z;
        m97462t();
        this.f20988h.mo55905y(new TN5(null, null, null, Boolean.valueOf(!this.f20982b.m37662X0()), 7, null));
        if (!this.f20988h.mo55912v(new ColdAppStart())) {
            this.f20988h.mo55961J(new AppStart());
            InterfaceC1880Ea.C1881a.startTrace$default(this.f20988h, new AppStart(), null, null, 6, null);
        }
        m97456z();
        m97494F();
        m97496D();
    }

    /* renamed from: s */
    public final boolean m97463s(boolean z, User user, boolean z2) {
        return z && !C42878ii6.m33536a(user, false) && z2;
    }

    /* renamed from: t */
    public final void m97462t() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance()");
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.f20983c);
        if (isGooglePlayServicesAvailable != 0) {
            if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
                this.f20996p.mo44446Sf(googleApiAvailability, isGooglePlayServicesAvailable);
            } else {
                H31.C3014a.showDialog$default(this.f20996p, AD1.f292d, false, false, null, null, null, null, 124, null);
            }
        }
    }

    /* renamed from: u */
    public final boolean m97461u() {
        return this.f20986f.mo15257j();
    }

    /* renamed from: v */
    public final boolean m97460v(User user, boolean z) {
        List<UserRoleItem> roles = UserKt.getRoles(user, Boolean.valueOf(z));
        UserRoleItem m37575s0 = this.f20982b.m37575s0();
        List<UserRoleItem> list = roles;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (UserRoleItem userRoleItem : list) {
            if (Intrinsics.areEqual(userRoleItem.getUserRoleCode(), m37575s0.getUserRoleCode())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m97459w(User user, boolean z) {
        List<UserRoleItem> roles = UserKt.getRoles(user, Boolean.valueOf(z));
        if (roles.size() == 1 && roles.contains(UserRoleItemKt.toUserRoleItem(UserRole.RIDER))) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m97458x() {
        if (C40788fB0.m41760v(this.f20983c) && NA0.m94303a(this.f20983c, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final void m97457y() {
        this.f20982b.m37548z(MapMode.RIDER);
        this.f20982b.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.RIDER));
    }

    /* renamed from: z */
    public final void m97456z() {
        Observable<Long> observeOn = Observable.timer(60L, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
        final C4767b c4767b = new C4767b();
        Observable throttleFirst = observeOn.flatMap(new InterfaceC23492o() { // from class: uG2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97499A;
                m97499A = LG2.m97499A(Function1.this, obj);
                return m97499A;
            }
        }).throttleFirst(2000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "private fun scheduleDebu…Timber.e(it)\n      })\n  }");
        Object m33094as = throttleFirst.m33094as(AutoDispose.m45239a(this.f20994n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4769c c4769c = new C4769c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: CG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97498B(Function1.this, obj);
            }
        };
        final C4770d c4770d = C4770d.f21005g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: DG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LG2.m97497C(Function1.this, obj);
            }
        });
    }
}
