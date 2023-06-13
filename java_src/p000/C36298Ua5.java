package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ridertutorial.widget.BeginnerModeBottomView;
import co.bird.android.app.feature.ridertutorial.widget.BeginnerModeTopView;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.TutorialClosed;
import co.bird.android.model.analytics.TutorialPageViewed;
import co.bird.android.model.analytics.TutorialStarted;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireRiderTutorial;
import co.bird.android.model.wire.WireRiderTutorialStep;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0007\u001f#'BY\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\b\b\u0001\u00104\u001a\u000202\u0012\b\b\u0001\u00107\u001a\u000205\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u000108¢\u0006\u0004\bM\u0010NJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\f\u0010\u0019\u001a\u00020\u0018*\u00020\rH\u0002J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010E\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\u00060\u00060A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00100F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00110K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010I¨\u0006O"}, m28432d2 = {"LUa5;", "LOa5;", "Lco/bird/android/model/ridertutorial/TutorialKind;", "tutorialKind", "Lco/bird/android/model/constant/BirdModel;", "birdModel", "", C17296a.f69688o, "Lio/reactivex/Observable;", "observeDone", "", "selectedStep", "", "Lco/bird/android/model/wire/WireRiderTutorialStep;", "tutorialList", "o", "LUa5$c;", "LUa5$d;", "r", "numSteps", "s", "steps", "p", "g", "", "h", "n", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "b", "LEa;", "analyticsManager", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfa5;", DateTokenConverter.CONVERTER_KEY, "Lfa5;", "riderProfileManager", "LxG;", "e", "LxG;", "beginnerModeTopViewPresenterImplFactory", "LsG;", "f", "LsG;", "beginnerModeBottomViewPresenterImplFactory", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LZa5;", "LZa5;", "ui", "LDU2;", "i", "LDU2;", "modal", "j", "I", "k", "Lco/bird/android/model/wire/WireRiderTutorialStep;", "currentRiderTutorialStep", "Lma4;", "kotlin.jvm.PlatformType", "l", "Lma4;", "doneRelay", "", "", "m", "Ljava/util/Map;", "customSteps", "", "inflatedCustomSteps", "<init>", "(LTq4;LEa;Landroid/content/Context;Lfa5;LxG;LsG;Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,298:1\n1208#2,2:299\n1238#2,4:301\n1603#2,9:305\n1855#2:314\n1856#2:316\n1612#2:317\n1549#2:321\n1620#2,3:322\n1#3:315\n1#3:325\n180#4:318\n180#4:319\n180#4:320\n107#5:326\n79#5,22:327\n483#6,7:349\n215#7,2:356\n215#7,2:358\n*S KotlinDebug\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl\n*L\n131#1:299,2\n131#1:301,4\n132#1:305,9\n132#1:314\n132#1:316\n132#1:317\n228#1:321\n228#1:322,3\n132#1:315\n143#1:318\n152#1:319\n204#1:320\n246#1:326\n246#1:327,22\n263#1:349,7\n263#1:356,2\n274#1:358,2\n*E\n"})
/* renamed from: Ua5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36298Ua5 implements InterfaceC34894Oa5 {

    /* renamed from: o */
    public static final C8313a f37568o = new C8313a(null);

    /* renamed from: p */
    public static final int f37569p = 8;

    /* renamed from: a */
    public final C36207Tq4 f37570a;

    /* renamed from: b */
    public final InterfaceC1880Ea f37571b;

    /* renamed from: c */
    public final Context f37572c;

    /* renamed from: d */
    public final InterfaceC41018fa5 f37573d;

    /* renamed from: e */
    public final InterfaceC30074xG f37574e;

    /* renamed from: f */
    public final InterfaceC28249sG f37575f;

    /* renamed from: g */
    public final ScopeProvider f37576g;

    /* renamed from: h */
    public final InterfaceC37468Za5 f37577h;

    /* renamed from: i */
    public final DU2 f37578i;

    /* renamed from: j */
    public int f37579j;

    /* renamed from: k */
    public WireRiderTutorialStep f37580k;

    /* renamed from: l */
    public final C45168ma4<Unit> f37581l;

    /* renamed from: m */
    public final Map<String, C8315c> f37582m;

    /* renamed from: n */
    public final Map<String, C8316d> f37583n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUa5$a;", "", "", "CUSTOM_BEGINNER_MODE", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$a */
    /* loaded from: classes2.dex */
    public static final class C8313a {
        public /* synthetic */ C8313a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8313a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¨\u0006\u0006"}, m28432d2 = {"LUa5$b;", "", "", C17296a.f69688o, "Lio/reactivex/Observable;", "closeImmediately", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC8314b {
        /* renamed from: a */
        void mo7057a();

        Observable<Unit> closeImmediately();
    }

    @Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0002\u00128\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0014\u0012K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0014¢\u0006\u0004\b2\u00103J½\u0002\u0010\u001d\u001a\u00020\u00002:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e2#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e2M\b\u0002\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00142M\b\u0002\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0014HÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003RI\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R2\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R2\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-R\\\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00148\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\\\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00148\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b/\u00101¨\u00064"}, m28432d2 = {"LUa5$c;", "", "Lkotlin/Function2;", "Lco/bird/android/model/ridertutorial/TutorialKind;", "Lkotlin/ParameterName;", "name", "tutorialKind", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "", "shouldShow", "Lkotlin/Function0;", "", "onTutorialStarted", "Lkotlin/Function1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "aboveIndicatorView", "belowIndicatorView", "Lkotlin/Function3;", "view", "LZa5;", "parentUi", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUa5$b;", "abovePresenterFactory", "belowPresenterFactory", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lkotlin/jvm/functions/Function2;", "g", "()Lkotlin/jvm/functions/Function2;", "b", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "e", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$c */
    /* loaded from: classes2.dex */
    public static final class C8315c {

        /* renamed from: a */
        public final Function2<TutorialKind, BirdModel, Boolean> f37584a;

        /* renamed from: b */
        public final Function0<Unit> f37585b;

        /* renamed from: c */
        public final Function1<Context, View> f37586c;

        /* renamed from: d */
        public final Function1<Context, View> f37587d;

        /* renamed from: e */
        public final Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> f37588e;

        /* renamed from: f */
        public final Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> f37589f;

        /* JADX WARN: Multi-variable type inference failed */
        public C8315c(Function2<? super TutorialKind, ? super BirdModel, Boolean> shouldShow, Function0<Unit> onTutorialStarted, Function1<? super Context, ? extends View> aboveIndicatorView, Function1<? super Context, ? extends View> belowIndicatorView, Function3<? super View, ? super InterfaceC37468Za5, ? super ScopeProvider, ? extends InterfaceC8314b> abovePresenterFactory, Function3<? super View, ? super InterfaceC37468Za5, ? super ScopeProvider, ? extends InterfaceC8314b> belowPresenterFactory) {
            Intrinsics.checkNotNullParameter(shouldShow, "shouldShow");
            Intrinsics.checkNotNullParameter(onTutorialStarted, "onTutorialStarted");
            Intrinsics.checkNotNullParameter(aboveIndicatorView, "aboveIndicatorView");
            Intrinsics.checkNotNullParameter(belowIndicatorView, "belowIndicatorView");
            Intrinsics.checkNotNullParameter(abovePresenterFactory, "abovePresenterFactory");
            Intrinsics.checkNotNullParameter(belowPresenterFactory, "belowPresenterFactory");
            this.f37584a = shouldShow;
            this.f37585b = onTutorialStarted;
            this.f37586c = aboveIndicatorView;
            this.f37587d = belowIndicatorView;
            this.f37588e = abovePresenterFactory;
            this.f37589f = belowPresenterFactory;
        }

        public static /* synthetic */ C8315c copy$default(C8315c c8315c, Function2 function2, Function0 function0, Function1 function1, Function1 function12, Function3 function3, Function3 function32, int i, Object obj) {
            Function2<TutorialKind, BirdModel, Boolean> function22 = function2;
            if ((i & 1) != 0) {
                function22 = c8315c.f37584a;
            }
            Function0<Unit> function02 = function0;
            if ((i & 2) != 0) {
                function02 = c8315c.f37585b;
            }
            Function0 function03 = function02;
            Function1<Context, View> function13 = function1;
            if ((i & 4) != 0) {
                function13 = c8315c.f37586c;
            }
            Function1 function14 = function13;
            Function1<Context, View> function15 = function12;
            if ((i & 8) != 0) {
                function15 = c8315c.f37587d;
            }
            Function1 function16 = function15;
            Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> function33 = function3;
            if ((i & 16) != 0) {
                function33 = c8315c.f37588e;
            }
            Function3 function34 = function33;
            Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> function35 = function32;
            if ((i & 32) != 0) {
                function35 = c8315c.f37589f;
            }
            return c8315c.m81321a(function22, function03, function14, function16, function34, function35);
        }

        /* renamed from: a */
        public final C8315c m81321a(Function2<? super TutorialKind, ? super BirdModel, Boolean> shouldShow, Function0<Unit> onTutorialStarted, Function1<? super Context, ? extends View> aboveIndicatorView, Function1<? super Context, ? extends View> belowIndicatorView, Function3<? super View, ? super InterfaceC37468Za5, ? super ScopeProvider, ? extends InterfaceC8314b> abovePresenterFactory, Function3<? super View, ? super InterfaceC37468Za5, ? super ScopeProvider, ? extends InterfaceC8314b> belowPresenterFactory) {
            Intrinsics.checkNotNullParameter(shouldShow, "shouldShow");
            Intrinsics.checkNotNullParameter(onTutorialStarted, "onTutorialStarted");
            Intrinsics.checkNotNullParameter(aboveIndicatorView, "aboveIndicatorView");
            Intrinsics.checkNotNullParameter(belowIndicatorView, "belowIndicatorView");
            Intrinsics.checkNotNullParameter(abovePresenterFactory, "abovePresenterFactory");
            Intrinsics.checkNotNullParameter(belowPresenterFactory, "belowPresenterFactory");
            return new C8315c(shouldShow, onTutorialStarted, aboveIndicatorView, belowIndicatorView, abovePresenterFactory, belowPresenterFactory);
        }

        /* renamed from: b */
        public final Function1<Context, View> m81320b() {
            return this.f37586c;
        }

        /* renamed from: c */
        public final Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> m81319c() {
            return this.f37588e;
        }

        /* renamed from: d */
        public final Function1<Context, View> m81318d() {
            return this.f37587d;
        }

        /* renamed from: e */
        public final Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> m81317e() {
            return this.f37589f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8315c) {
                C8315c c8315c = (C8315c) obj;
                return Intrinsics.areEqual(this.f37584a, c8315c.f37584a) && Intrinsics.areEqual(this.f37585b, c8315c.f37585b) && Intrinsics.areEqual(this.f37586c, c8315c.f37586c) && Intrinsics.areEqual(this.f37587d, c8315c.f37587d) && Intrinsics.areEqual(this.f37588e, c8315c.f37588e) && Intrinsics.areEqual(this.f37589f, c8315c.f37589f);
            }
            return false;
        }

        /* renamed from: f */
        public final Function0<Unit> m81316f() {
            return this.f37585b;
        }

        /* renamed from: g */
        public final Function2<TutorialKind, BirdModel, Boolean> m81315g() {
            return this.f37584a;
        }

        public int hashCode() {
            return (((((((((this.f37584a.hashCode() * 31) + this.f37585b.hashCode()) * 31) + this.f37586c.hashCode()) * 31) + this.f37587d.hashCode()) * 31) + this.f37588e.hashCode()) * 31) + this.f37589f.hashCode();
        }

        public String toString() {
            Function2<TutorialKind, BirdModel, Boolean> function2 = this.f37584a;
            Function0<Unit> function0 = this.f37585b;
            Function1<Context, View> function1 = this.f37586c;
            Function1<Context, View> function12 = this.f37587d;
            Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> function3 = this.f37588e;
            Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> function32 = this.f37589f;
            return "CustomTutorialStepNode(shouldShow=" + function2 + ", onTutorialStarted=" + function0 + ", aboveIndicatorView=" + function1 + ", belowIndicatorView=" + function12 + ", abovePresenterFactory=" + function3 + ", belowPresenterFactory=" + function32 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"LUa5$d;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/View;", C17296a.f69688o, "Landroid/view/View;", "b", "()Landroid/view/View;", "aboveIndicatorView", DateTokenConverter.CONVERTER_KEY, "belowIndicatorView", "LUa5$b;", "c", "LUa5$b;", "()LUa5$b;", "aboveIndicatorPresenter", "belowIndicatorPresenter", "<init>", "(Landroid/view/View;Landroid/view/View;LUa5$b;LUa5$b;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$d */
    /* loaded from: classes2.dex */
    public static final class C8316d {

        /* renamed from: a */
        public final View f37590a;

        /* renamed from: b */
        public final View f37591b;

        /* renamed from: c */
        public final InterfaceC8314b f37592c;

        /* renamed from: d */
        public final InterfaceC8314b f37593d;

        public C8316d(View aboveIndicatorView, View belowIndicatorView, InterfaceC8314b aboveIndicatorPresenter, InterfaceC8314b belowIndicatorPresenter) {
            Intrinsics.checkNotNullParameter(aboveIndicatorView, "aboveIndicatorView");
            Intrinsics.checkNotNullParameter(belowIndicatorView, "belowIndicatorView");
            Intrinsics.checkNotNullParameter(aboveIndicatorPresenter, "aboveIndicatorPresenter");
            Intrinsics.checkNotNullParameter(belowIndicatorPresenter, "belowIndicatorPresenter");
            this.f37590a = aboveIndicatorView;
            this.f37591b = belowIndicatorView;
            this.f37592c = aboveIndicatorPresenter;
            this.f37593d = belowIndicatorPresenter;
        }

        /* renamed from: a */
        public final InterfaceC8314b m81314a() {
            return this.f37592c;
        }

        /* renamed from: b */
        public final View m81313b() {
            return this.f37590a;
        }

        /* renamed from: c */
        public final InterfaceC8314b m81312c() {
            return this.f37593d;
        }

        /* renamed from: d */
        public final View m81311d() {
            return this.f37591b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8316d) {
                C8316d c8316d = (C8316d) obj;
                return Intrinsics.areEqual(this.f37590a, c8316d.f37590a) && Intrinsics.areEqual(this.f37591b, c8316d.f37591b) && Intrinsics.areEqual(this.f37592c, c8316d.f37592c) && Intrinsics.areEqual(this.f37593d, c8316d.f37593d);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f37590a.hashCode() * 31) + this.f37591b.hashCode()) * 31) + this.f37592c.hashCode()) * 31) + this.f37593d.hashCode();
        }

        public String toString() {
            View view = this.f37590a;
            View view2 = this.f37591b;
            InterfaceC8314b interfaceC8314b = this.f37592c;
            InterfaceC8314b interfaceC8314b2 = this.f37593d;
            return "InflatedCustomTutorialNode(aboveIndicatorView=" + view + ", belowIndicatorView=" + view2 + ", aboveIndicatorPresenter=" + interfaceC8314b + ", belowIndicatorPresenter=" + interfaceC8314b2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/ridertutorial/TutorialKind;", "tutorialKind", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "(Lco/bird/android/model/ridertutorial/TutorialKind;Lco/bird/android/model/constant/BirdModel;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$e */
    /* loaded from: classes2.dex */
    public static final class C8317e extends Lambda implements Function2<TutorialKind, BirdModel, Boolean> {
        public C8317e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(TutorialKind tutorialKind, BirdModel birdModel) {
            boolean z;
            Intrinsics.checkNotNullParameter(tutorialKind, "tutorialKind");
            if (C36298Ua5.this.f37570a.m82623f8().m73665a().getRiderProfileConfig().getEnableBeginnerModeOnboarding() && tutorialKind == TutorialKind.CLASS_SCOOTER && birdModel != null && Intrinsics.areEqual(C36298Ua5.this.f37570a.m82623f8().m73665a().getRiderProfileConfig().getEnableBeginnerModeByModel().get(birdModel), Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRiderTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl$customSteps$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,298:1\n237#2:299\n*S KotlinDebug\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl$customSteps$2\n*L\n107#1:299\n*E\n"})
    /* renamed from: Ua5$f */
    /* loaded from: classes2.dex */
    public static final class C8318f extends Lambda implements Function0<Unit> {
        public C8318f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object m33041n = C37279Yf5.m74561d0(C36298Ua5.this.f37573d.mo30285f(), 5, 1).m33041n(AutoDispose.m45239a(C36298Ua5.this.f37576g));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", "it", "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$g */
    /* loaded from: classes2.dex */
    public static final class C8319g extends Lambda implements Function1<Context, View> {
        public C8319g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View inflate = LayoutInflater.from(C36298Ua5.this.f37572c).inflate(C39311cj4.view_beginner_mode_top, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…_beginner_mode_top, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", "it", "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$h */
    /* loaded from: classes2.dex */
    public static final class C8320h extends Lambda implements Function1<Context, View> {
        public C8320h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View inflate = LayoutInflater.from(C36298Ua5.this.f37572c).inflate(C39311cj4.rider_tutorial_beginner_mode_onboarding_buttons, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…onboarding_buttons, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "LZa5;", "<anonymous parameter 1>", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUa5$b;", C17296a.f69688o, "(Landroid/view/View;LZa5;Lcom/uber/autodispose/ScopeProvider;)LUa5$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$i */
    /* loaded from: classes2.dex */
    public static final class C8321i extends Lambda implements Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> {
        public C8321i() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC8314b invoke(View view, InterfaceC37468Za5 interfaceC37468Za5, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(interfaceC37468Za5, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C36298Ua5.this.f37574e.mo3737a((BeginnerModeTopView) view, scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "view", "LZa5;", "parentUi", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LUa5$b;", C17296a.f69688o, "(Landroid/view/View;LZa5;Lcom/uber/autodispose/ScopeProvider;)LUa5$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ua5$j */
    /* loaded from: classes2.dex */
    public static final class C8322j extends Lambda implements Function3<View, InterfaceC37468Za5, ScopeProvider, InterfaceC8314b> {
        public C8322j() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC8314b invoke(View view, InterfaceC37468Za5 parentUi, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parentUi, "parentUi");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C36298Ua5.this.f37575f.mo12550a(parentUi, (BeginnerModeBottomView) view, scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ua5$k */
    /* loaded from: classes2.dex */
    public static final class C8323k extends Lambda implements Function1<Unit, Unit> {
        public C8323k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC1880Ea interfaceC1880Ea = C36298Ua5.this.f37571b;
            WireRiderTutorialStep wireRiderTutorialStep = C36298Ua5.this.f37580k;
            interfaceC1880Ea.mo55905y(new C34660Na5(null, null, null, wireRiderTutorialStep != null ? wireRiderTutorialStep.getId() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ua5$l */
    /* loaded from: classes2.dex */
    public static final class C8324l extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<WireRiderTutorialStep> f37602h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8324l(List<WireRiderTutorialStep> list) {
            super(1);
            this.f37602h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer it) {
            C36298Ua5 c36298Ua5 = C36298Ua5.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c36298Ua5.f37579j = it.intValue();
            C36298Ua5.this.f37580k = this.f37602h.get(it.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "selectedStep", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ua5$m */
    /* loaded from: classes2.dex */
    public static final class C8325m extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<WireRiderTutorialStep> f37604h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8325m(List<WireRiderTutorialStep> list) {
            super(1);
            this.f37604h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer selectedStep) {
            C36298Ua5 c36298Ua5 = C36298Ua5.this;
            Intrinsics.checkNotNullExpressionValue(selectedStep, "selectedStep");
            c36298Ua5.m81326o(selectedStep.intValue(), this.f37604h);
            C36298Ua5.this.f37571b.mo55956N(new TutorialPageViewed(selectedStep.intValue() + 1));
            InterfaceC1880Ea interfaceC1880Ea = C36298Ua5.this.f37571b;
            WireRiderTutorialStep wireRiderTutorialStep = C36298Ua5.this.f37580k;
            interfaceC1880Ea.mo55905y(new C39833da5(null, null, null, wireRiderTutorialStep != null ? wireRiderTutorialStep.getId() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ua5$n */
    /* loaded from: classes2.dex */
    public static final class C8326n extends Lambda implements Function1<Unit, Unit> {
        public C8326n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C36298Ua5.this.f37577h.next();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ua5$o */
    /* loaded from: classes2.dex */
    public static final class C8327o extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: g */
        public static final C8327o f37606g = new C8327o();

        public C8327o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "• " + it;
        }
    }

    public C36298Ua5(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, Context context, InterfaceC41018fa5 riderProfileManager, InterfaceC30074xG beginnerModeTopViewPresenterImplFactory, InterfaceC28249sG beginnerModeBottomViewPresenterImplFactory, ScopeProvider scopeProvider, InterfaceC37468Za5 ui, DU2 du2) {
        Map<String, C8315c> mapOf;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(beginnerModeTopViewPresenterImplFactory, "beginnerModeTopViewPresenterImplFactory");
        Intrinsics.checkNotNullParameter(beginnerModeBottomViewPresenterImplFactory, "beginnerModeBottomViewPresenterImplFactory");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f37570a = reactiveConfig;
        this.f37571b = analyticsManager;
        this.f37572c = context;
        this.f37573d = riderProfileManager;
        this.f37574e = beginnerModeTopViewPresenterImplFactory;
        this.f37575f = beginnerModeBottomViewPresenterImplFactory;
        this.f37576g = scopeProvider;
        this.f37577h = ui;
        this.f37578i = du2;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f37581l = m25409g;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("custom_beginner_mode", new C8315c(new C8317e(), new C8318f(), new C8319g(), new C8320h(), new C8321i(), new C8322j())));
        this.f37582m = mapOf;
        this.f37583n = new LinkedHashMap();
    }

    /* renamed from: i */
    public static final void m81332i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m81331j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m81330k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m81329l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m81328m(C36298Ua5 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37571b.mo55956N(new TutorialClosed(this$0.f37579j + 1));
    }

    /* renamed from: q */
    public static final void m81324q(WireRiderTutorialStep wireRiderTutorialStep, Ref.IntRef intRef, List<WireRiderTutorialStep> list, String str, List<String> list2) {
        String joinToString$default;
        WireRiderTutorialStep copy;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list2, "\n", null, null, 0, null, C8327o.f37606g, 30, null);
        int i = intRef.element;
        copy = wireRiderTutorialStep.copy((r28 & 1) != 0 ? wireRiderTutorialStep.f66761id : "local_rule" + i, (r28 & 2) != 0 ? wireRiderTutorialStep.title : str, (r28 & 4) != 0 ? wireRiderTutorialStep.subtitle : null, (r28 & 8) != 0 ? wireRiderTutorialStep.body : joinToString$default, (r28 & 16) != 0 ? wireRiderTutorialStep.fileName : null, (r28 & 32) != 0 ? wireRiderTutorialStep.loopFileName : null, (r28 & 64) != 0 ? wireRiderTutorialStep.progressStart : 0.0f, (r28 & 128) != 0 ? wireRiderTutorialStep.progressLoopStart : 0.0f, (r28 & 256) != 0 ? wireRiderTutorialStep.progressLoopEnd : 0.0f, (r28 & 512) != 0 ? wireRiderTutorialStep.delayLoopStart : 0.0f, (r28 & 1024) != 0 ? wireRiderTutorialStep.textColor : null, (r28 & 2048) != 0 ? wireRiderTutorialStep.buttonBackgroundColor : null, (r28 & 4096) != 0 ? wireRiderTutorialStep.buttonTextColor : null);
        list.add(copy);
        intRef.element = intRef.element + 1;
    }

    @Override // p000.InterfaceC34894Oa5
    /* renamed from: a */
    public void mo81340a(TutorialKind tutorialKind, BirdModel birdModel) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tutorialKind, "tutorialKind");
        m81327n(tutorialKind, birdModel);
        WireRiderTutorial riderTutorial = this.f37570a.m82623f8().getValue().getRiderTutorial();
        if (riderTutorial == null) {
            return;
        }
        List<WireRiderTutorialStep> steps = riderTutorial.getSteps();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(steps, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (WireRiderTutorialStep wireRiderTutorialStep : steps) {
            linkedHashMap.put(wireRiderTutorialStep.getId(), wireRiderTutorialStep);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : C37234Ya5.m74889a(riderTutorial, tutorialKind)) {
            WireRiderTutorialStep wireRiderTutorialStep2 = (WireRiderTutorialStep) linkedHashMap.get(str);
            if (wireRiderTutorialStep2 != null) {
                arrayList.add(wireRiderTutorialStep2);
            }
        }
        List<WireRiderTutorialStep> m81334g = m81334g(m81325p(arrayList), tutorialKind, birdModel);
        this.f37571b.mo55956N(new TutorialStarted());
        this.f37577h.mo44057c7(m81334g.size());
        Observable<Integer> mo44050xi = this.f37577h.mo44050xi();
        final C8324l c8324l = new C8324l(m81334g);
        Observable<Integer> observeOn = mo44050xi.doOnNext(new InterfaceC23484g() { // from class: Pa5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36298Ua5.m81331j(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(tu…ctedStep + 1))\n    })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f37576g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8325m c8325m = new C8325m(m81334g);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Qa5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36298Ua5.m81330k(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f37577h.mo44051u().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.nextButtonClicks()\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f37576g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8326n c8326n = new C8326n();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ra5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36298Ua5.m81329l(Function1.this, obj);
            }
        });
        DU2 du2 = this.f37578i;
        if (du2 != null) {
            du2.m110369j(new DialogInterface.OnDismissListener() { // from class: Sa5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C36298Ua5.m81328m(C36298Ua5.this, dialogInterface);
                }
            });
        }
    }

    /* renamed from: g */
    public final List<WireRiderTutorialStep> m81334g(List<WireRiderTutorialStep> list, TutorialKind tutorialKind, BirdModel birdModel) {
        Map<String, C8315c> map = this.f37582m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C8315c> entry : map.entrySet()) {
            if (entry.getValue().m81315g().invoke(tutorialKind, birdModel).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<co.bird.android.model.wire.WireRiderTutorialStep>");
            TypeIntrinsics.asMutableList(list).add(new WireRiderTutorialStep(str, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, 8190, null));
        }
        return list;
    }

    /* renamed from: h */
    public final boolean m81333h(WireRiderTutorialStep wireRiderTutorialStep) {
        return this.f37582m.containsKey(wireRiderTutorialStep.getId());
    }

    /* renamed from: n */
    public final void m81327n(TutorialKind tutorialKind, BirdModel birdModel) {
        for (Map.Entry<String, C8315c> entry : this.f37582m.entrySet()) {
            C8315c value = entry.getValue();
            if (value.m81315g().invoke(tutorialKind, birdModel).booleanValue()) {
                value.m81316f().invoke();
            }
        }
    }

    /* renamed from: o */
    public final void m81326o(int i, List<WireRiderTutorialStep> list) {
        WireRiderTutorialStep wireRiderTutorialStep = list.get(i);
        if (m81333h(wireRiderTutorialStep)) {
            C8316d c8316d = this.f37583n.get(wireRiderTutorialStep.getId());
            if (c8316d == null) {
                C8315c c8315c = this.f37582m.get(wireRiderTutorialStep.getId());
                if (c8315c != null) {
                    c8316d = m81323r(c8315c);
                } else {
                    String id = wireRiderTutorialStep.getId();
                    throw new IllegalArgumentException("Cannot find fragments specified for " + id);
                }
            }
            this.f37583n.put(wireRiderTutorialStep.getId(), c8316d);
            if (this.f37577h.mo44071Ma(c8316d.m81313b(), c8316d.m81311d())) {
                c8316d.m81314a().mo7057a();
                c8316d.m81312c().mo7057a();
                return;
            }
            return;
        }
        m81322s(i, list.size());
        this.f37577h.mo44048yd(list.get(i));
    }

    @Override // p000.InterfaceC34894Oa5
    public Observable<Unit> observeDone() {
        Observable<Unit> mo44053hc = this.f37577h.mo44053hc();
        final C8323k c8323k = new C8323k();
        Observable<Unit> merge = Observable.merge(mo44053hc.doOnNext(new InterfaceC23484g() { // from class: Ta5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36298Ua5.m81332i(Function1.this, obj);
            }
        }), this.f37581l.hide());
        Intrinsics.checkNotNullExpressionValue(merge, "override fun observeDone…oneRelay.hide()\n    )\n  }");
        return merge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<WireRiderTutorialStep> m81325p(List<WireRiderTutorialStep> list) {
        boolean contains$default;
        List split$default;
        int collectionSizeOrDefault;
        boolean startsWith$default;
        boolean isBlank;
        ArrayList arrayList;
        int i;
        boolean z;
        boolean isWhitespace;
        String replace$default;
        ArrayList arrayList2 = new ArrayList();
        Ref.IntRef intRef = new Ref.IntRef();
        for (WireRiderTutorialStep wireRiderTutorialStep : list) {
            if (Intrinsics.areEqual(wireRiderTutorialStep.getId(), "local_rule")) {
                boolean z2 = false;
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) wireRiderTutorialStep.getBody(), (CharSequence) "----", false, 2, (Object) null);
                if (contains$default) {
                    split$default = StringsKt__StringsKt.split$default((CharSequence) wireRiderTutorialStep.getBody(), new String[]{"\r", "\n"}, false, 0, 6, (Object) null);
                    List<String> list2 = split$default;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList<String> arrayList3 = new ArrayList(collectionSizeOrDefault);
                    for (String str : list2) {
                        replace$default = StringsKt__StringsJVMKt.replace$default(str, "• ", "", false, 4, (Object) null);
                        arrayList3.add(replace$default);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    String title = wireRiderTutorialStep.getTitle();
                    for (String str2 : arrayList3) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str2, "----", z2, 2, null);
                        if (startsWith$default) {
                            if (!arrayList4.isEmpty()) {
                                arrayList = arrayList4;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                m81324q(wireRiderTutorialStep, intRef, arrayList2, title, arrayList);
                            }
                            int length = str2.length() - 1;
                            boolean z3 = z2;
                            boolean z4 = z3 ? 1 : 0;
                            int i2 = z3;
                            while (i2 <= length) {
                                if (!z4) {
                                    i = i2;
                                } else {
                                    i = length;
                                }
                                char charAt = str2.charAt(i);
                                if (charAt != '-') {
                                    isWhitespace = CharsKt__CharJVMKt.isWhitespace(charAt);
                                    if (!isWhitespace) {
                                        z = false;
                                        if (z4) {
                                            if (!z) {
                                                z4 = true;
                                            } else {
                                                i2++;
                                            }
                                        } else if (!z) {
                                            break;
                                        } else {
                                            length--;
                                        }
                                        i2 = i2;
                                        z4 = z4;
                                    }
                                }
                                z = true;
                                if (z4) {
                                }
                                i2 = i2;
                                z4 = z4;
                            }
                            title = str2.subSequence(i2, length + 1).toString();
                            arrayList4.clear();
                        } else {
                            isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                            if (!isBlank) {
                                arrayList4.add(str2);
                            }
                        }
                        z2 = false;
                    }
                    m81324q(wireRiderTutorialStep, intRef, arrayList2, title, arrayList4);
                }
            }
            arrayList2.add(wireRiderTutorialStep);
        }
        return arrayList2;
    }

    /* renamed from: r */
    public final C8316d m81323r(C8315c c8315c) {
        View invoke = c8315c.m81320b().invoke(this.f37572c);
        View invoke2 = c8315c.m81318d().invoke(this.f37572c);
        InterfaceC8314b invoke3 = c8315c.m81319c().invoke(invoke, this.f37577h, this.f37576g);
        InterfaceC8314b invoke4 = c8315c.m81317e().invoke(invoke2, this.f37577h, this.f37576g);
        Observable<Unit> mergeWith = invoke3.closeImmediately().mergeWith(invoke4.closeImmediately());
        Intrinsics.checkNotNullExpressionValue(mergeWith, "abovePresenter.closeImme…enter.closeImmediately())");
        Object m33094as = mergeWith.m33094as(AutoDispose.m45239a(this.f37576g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f37581l);
        return new C8316d(invoke, invoke2, invoke3, invoke4);
    }

    /* renamed from: s */
    public final void m81322s(int i, int i2) {
        if (i == i2 - 1) {
            this.f37577h.mo44052ih();
        } else {
            this.f37577h.mo44049y3();
        }
    }

    public /* synthetic */ C36298Ua5(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, Context context, InterfaceC41018fa5 interfaceC41018fa5, InterfaceC30074xG interfaceC30074xG, InterfaceC28249sG interfaceC28249sG, ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, DU2 du2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36207Tq4, interfaceC1880Ea, context, interfaceC41018fa5, interfaceC30074xG, interfaceC28249sG, scopeProvider, interfaceC37468Za5, (i & 256) != 0 ? null : du2);
    }
}
