package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.buava.Optional;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.AreaBottomSheetButton;
import co.bird.android.model.AreaDirectionsButton;
import co.bird.android.model.AreaRefreshButton;
import co.bird.android.model.LearnMoreButton;
import co.bird.android.model.RefreshInfoButton;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.AreaKind;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.response.OperatorMapDemandInsightResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C31931Bj3;
import p000.InterfaceC32282Cw3;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b6\u00107J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, m28432d2 = {"LBj3;", "", "Lio/reactivex/Observable;", "", "t", "", "y", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "x", "w", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LNm3;", "b", "LNm3;", "mapUi", "Lbn;", "c", "Lbn;", "areaManager", "Lom3;", DateTokenConverter.CONVERTER_KEY, "Lom3;", "operatorManager", "Lot5;", "e", "Lot5;", "serverDrivenFilterManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "LCw3;", "g", "LCw3;", "ui", "LSm;", "h", "LSm;", "areaBottomSheetModelConversion", "Le13;", "i", "Le13;", "navigator", "v", "()Z", "enableFeeArea", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;Lbn;Lom3;Lot5;LTq4;LCw3;LSm;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAreaPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorAreaPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n180#2:262\n180#2:263\n180#2:264\n180#2:265\n237#2:268\n180#2:269\n180#2:270\n71#3,2:266\n288#4,2:271\n1#5:273\n*S KotlinDebug\n*F\n+ 1 OperatorAreaPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorAreaPresenter\n*L\n89#1:262\n105#1:263\n130#1:264\n135#1:265\n198#1:268\n204#1:269\n212#1:270\n147#1:266,2\n225#1:271,2\n*E\n"})
/* renamed from: Bj3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31931Bj3 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f2739a;

    /* renamed from: b */
    public final InterfaceC34766Nm3 f2740b;

    /* renamed from: c */
    public final InterfaceC12495bn f2741c;

    /* renamed from: d */
    public final InterfaceC46473om3 f2742d;

    /* renamed from: e */
    public final InterfaceC46545ot5 f2743e;

    /* renamed from: f */
    public final C36207Tq4 f2744f;

    /* renamed from: g */
    public final InterfaceC32282Cw3 f2745g;

    /* renamed from: h */
    public final C7540Sm f2746h;

    /* renamed from: i */
    public final InterfaceC40099e13 f2747i;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastAreaUpdate", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$a */
    /* loaded from: classes2.dex */
    public static final class C0695a extends Lambda implements Function1<Optional<DateTime>, InterfaceC23434B<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Bj3$a$a */
        /* loaded from: classes2.dex */
        public static final class C0696a extends Lambda implements Function1<Long, Boolean> {

            /* renamed from: g */
            public static final C0696a f2749g = new C0696a();

            public C0696a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }

        public C0695a() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m113582c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Boolean> invoke(Optional<DateTime> lastAreaUpdate) {
            int i;
            Intrinsics.checkNotNullParameter(lastAreaUpdate, "lastAreaUpdate");
            int mapAreasLastUpdateRefreshThreshold = C31931Bj3.this.f2744f.m82623f8().m73665a().getOperatorConfig().getFeatures().getMap().getMapAreasLastUpdateRefreshThreshold();
            DateTime m59035e = lastAreaUpdate.m59035e();
            if (m59035e != null) {
                i = C46880pT0.m19254h(m59035e);
            } else {
                i = 0;
            }
            int i2 = mapAreasLastUpdateRefreshThreshold - i;
            if (!lastAreaUpdate.m59037c()) {
                return Observable.just(Boolean.FALSE);
            }
            if (i2 <= 0) {
                return Observable.just(Boolean.TRUE);
            }
            Observable<Long> timer = Observable.timer(i2, TimeUnit.SECONDS);
            final C0696a c0696a = C0696a.f2749g;
            return timer.map(new InterfaceC23492o() { // from class: Aj3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m113582c;
                    m113582c = C31931Bj3.C0695a.m113582c(Function1.this, obj);
                    return m113582c;
                }
            }).startWith((Observable<R>) Boolean.FALSE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/AreaBottomSheetButton;", "kotlin.jvm.PlatformType", "button", "", C17296a.f69688o, "(Lco/bird/android/model/AreaBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$b */
    /* loaded from: classes2.dex */
    public static final class C0697b extends Lambda implements Function1<AreaBottomSheetButton, Unit> {
        public C0697b() {
            super(1);
        }

        /* renamed from: a */
        public final void m113581a(AreaBottomSheetButton areaBottomSheetButton) {
            if (areaBottomSheetButton instanceof AreaDirectionsButton) {
                C31931Bj3.this.f2747i.mo36916x3(UB1.m81889c(((AreaDirectionsButton) areaBottomSheetButton).getLocation()));
                return;
            }
            Integer num = null;
            if (areaBottomSheetButton instanceof AreaRefreshButton) {
                C31931Bj3.this.f2741c.mo64004a0(new C5691Nn(null, null, 3, null));
            } else if (areaBottomSheetButton instanceof RefreshInfoButton) {
                InterfaceC32282Cw3 interfaceC32282Cw3 = C31931Bj3.this.f2745g;
                DateTime m59035e = C31931Bj3.this.f2741c.mo63993w().m73665a().m59035e();
                if (m59035e != null) {
                    num = Integer.valueOf(C46880pT0.m19255g(m59035e));
                }
                interfaceC32282Cw3.mo89359H6(num);
            } else if (areaBottomSheetButton instanceof LearnMoreButton) {
                C31931Bj3.this.f2747i.mo36922w3(((LearnMoreButton) areaBottomSheetButton).getZendeskArticleId());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AreaBottomSheetButton areaBottomSheetButton) {
            m113581a(areaBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0698c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0698c f2751b = new C0698c();

        public C0698c() {
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

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "c", "(Lwb4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$d */
    /* loaded from: classes2.dex */
    public static final class C0699d extends Lambda implements Function1<C51106wb4<? extends Optional<Area>, ? extends Boolean, ? extends OperatorMapBottomSheet.EnumC14592a, ? extends Boolean>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ C7540Sm f2753h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapDemandInsightResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorMapDemandInsightResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Bj3$d$a */
        /* loaded from: classes2.dex */
        public static final class C0700a extends Lambda implements Function1<OperatorMapDemandInsightResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31931Bj3 f2754g;

            /* renamed from: h */
            public final /* synthetic */ C7540Sm f2755h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0700a(C31931Bj3 c31931Bj3, C7540Sm c7540Sm) {
                super(1);
                this.f2754g = c31931Bj3;
                this.f2755h = c7540Sm;
            }

            /* renamed from: a */
            public final void m113576a(OperatorMapDemandInsightResponse operatorMapDemandInsightResponse) {
                String message = operatorMapDemandInsightResponse.getMessage();
                if (message != null) {
                    this.f2754g.f2745g.mo89311n4(this.f2755h.m84857c(message));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OperatorMapDemandInsightResponse operatorMapDemandInsightResponse) {
                m113576a(operatorMapDemandInsightResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Bj3$d$b */
        /* loaded from: classes2.dex */
        public static final class C0701b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C0701b f2756g = new C0701b();

            public C0701b() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0699d(C7540Sm c7540Sm) {
            super(1);
            this.f2753h = c7540Sm;
        }

        /* renamed from: d */
        public static final void m113577d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(C51106wb4<Optional<Area>, Boolean, ? extends OperatorMapBottomSheet.EnumC14592a, Boolean> c51106wb4) {
            InterfaceC7269Rm m84858b;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Optional<Area> m6614a = c51106wb4.m6614a();
            Boolean showRefreshUi = c51106wb4.m6613b();
            OperatorMapBottomSheet.EnumC14592a m6612c = c51106wb4.m6612c();
            Boolean m6611d = c51106wb4.m6611d();
            Area m59035e = m6614a.m59035e();
            boolean z = false;
            if (m59035e != null && m59035e.isDemandArea()) {
                z = true;
            }
            if (z && C31931Bj3.this.f2744f.m82623f8().m73665a().getOperatorConfig().getFeatures().getMap().getDemandCellsTappable()) {
                AbstractC23442F<OperatorMapDemandInsightResponse> m33152N = C31931Bj3.this.f2742d.mo8139O0().m33152N(C23454a.m33087a());
                final C0700a c0700a = new C0700a(C31931Bj3.this, this.f2753h);
                AbstractC23442F<OperatorMapDemandInsightResponse> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: Cj3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C31931Bj3.C0699d.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C0701b c0701b = C0701b.f2756g;
                return m33101w.m33106t(new InterfaceC23484g() { // from class: Dj3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C31931Bj3.C0699d.m113577d(Function1.this, obj);
                    }
                }).m33159G().m33069Q();
            } else if (m6614a.m59037c()) {
                InterfaceC32282Cw3 interfaceC32282Cw3 = C31931Bj3.this.f2745g;
                Area m59038b = m6614a.m59038b();
                C7540Sm c7540Sm = this.f2753h;
                Area area = m59038b;
                if (Intrinsics.areEqual(area.getFeeModified(), Boolean.TRUE)) {
                    m84858b = c7540Sm.m84855e(area);
                } else if (area.getOverlayIcon() == AreaIconType.REBALANCE) {
                    m84858b = c7540Sm.m84856d(area);
                } else {
                    Intrinsics.checkNotNullExpressionValue(showRefreshUi, "showRefreshUi");
                    m84858b = c7540Sm.m84858b(area, showRefreshUi.booleanValue());
                }
                interfaceC32282Cw3.mo89311n4(m84858b);
                return AbstractC23461c.m33039p();
            } else if (m6612c == OperatorMapBottomSheet.EnumC14592a.AREA && !m6611d.booleanValue()) {
                Intrinsics.checkNotNullExpressionValue(showRefreshUi, "showRefreshUi");
                if (showRefreshUi.booleanValue() && C31931Bj3.this.f2741c.mo64008R()) {
                    C31931Bj3.this.f2745g.mo89311n4(this.f2753h.m84859a());
                } else {
                    C31931Bj3.this.f2745g.mo89347U2();
                }
                return AbstractC23461c.m33039p();
            } else {
                return AbstractC23461c.m33039p();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0702e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0702e f2757b = new C0702e();

        public C0702e() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RiderAreaState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RiderAreaState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$f */
    /* loaded from: classes2.dex */
    public static final class C0703f extends Lambda implements Function1<RiderAreaState, Unit> {

        /* renamed from: g */
        public static final C0703f f2758g = new C0703f();

        public C0703f() {
            super(1);
        }

        /* renamed from: a */
        public final void m113575a(RiderAreaState riderAreaState) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RiderAreaState riderAreaState) {
            m113575a(riderAreaState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0704g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0704g f2759b = new C0704g();

        public C0704g() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$h */
    /* loaded from: classes2.dex */
    public static final class C0705h extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C0705h f2760g = new C0705h();

        public C0705h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getOperatorConfig().getFeatures().getMap().getEnableManualRefresh());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "showManualRefresh", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$i */
    /* loaded from: classes2.dex */
    public static final class C0706i extends Lambda implements Function1<Boolean, Unit> {
        public C0706i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            InterfaceC32282Cw3.C1261a.configureMenu$default(C31931Bj3.this.f2745g, bool, null, null, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$j */
    /* loaded from: classes2.dex */
    public static final class C0707j extends Lambda implements Function1<Boolean, Unit> {
        public C0707j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            if (C31931Bj3.this.m113589v()) {
                InterfaceC32282Cw3 interfaceC32282Cw3 = C31931Bj3.this.f2745g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC32282Cw3.mo89308ok(it.booleanValue());
                return;
            }
            InterfaceC32282Cw3 interfaceC32282Cw32 = C31931Bj3.this.f2745g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC32282Cw32.mo89329e7(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$k */
    /* loaded from: classes2.dex */
    public static final class C0708k extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C0708k f2763g = new C0708k();

        public C0708k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$l */
    /* loaded from: classes2.dex */
    public static final class C0709l extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Boolean>> {
        public C0709l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C31931Bj3.this.m113589v()) {
                return C31931Bj3.this.f2745g.mo89321i5();
            }
            return C31931Bj3.this.f2745g.mo89327fd();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$m */
    /* loaded from: classes2.dex */
    public static final class C0710m extends Lambda implements Function1<Boolean, Unit> {
        public C0710m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            if (C31931Bj3.this.m113589v()) {
                InterfaceC32282Cw3 interfaceC32282Cw3 = C31931Bj3.this.f2745g;
                Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
                interfaceC32282Cw3.mo89301wh(enabled.booleanValue());
                C31931Bj3.this.f2743e.mo6177f(C33101Gj3.m104825a(AreaKind.FEE_MODIFIED), enabled.booleanValue());
                return;
            }
            InterfaceC32282Cw3 interfaceC32282Cw32 = C31931Bj3.this.f2745g;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            interfaceC32282Cw32.mo77761zb(enabled.booleanValue());
            C31931Bj3.this.f2743e.mo6177f(C33101Gj3.m104825a(AreaKind.DEMAND_CELLS), enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$n */
    /* loaded from: classes2.dex */
    public static final class C0711n extends Lambda implements Function1<List<? extends OperatorFilter>, Boolean> {
        public C0711n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<? extends OperatorFilter> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C31931Bj3.this.f2743e.mo6178e().getValue().m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$o */
    /* loaded from: classes2.dex */
    public static final class C0712o extends Lambda implements Function1<List<? extends OperatorFilter>, Unit> {
        public C0712o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> list) {
            if (C31931Bj3.this.m113589v()) {
                C31931Bj3.this.f2745g.mo89301wh(false);
                C31931Bj3.this.f2743e.mo6177f(C33101Gj3.m104825a(AreaKind.FEE_MODIFIED), false);
                return;
            }
            C31931Bj3.this.f2745g.mo77761zb(false);
            C31931Bj3.this.f2743e.mo6177f(C33101Gj3.m104825a(AreaKind.DEMAND_CELLS), false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "prevFilters", "newFilters", C17296a.f69688o, "(Lkotlin/Pair;Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bj3$p */
    /* loaded from: classes2.dex */
    public static final class C0713p extends Lambda implements Function2<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, List<? extends OperatorFilter>, Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>> {

        /* renamed from: g */
        public static final C0713p f2768g = new C0713p();

        public C0713p() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<List<OperatorFilter>, List<OperatorFilter>> invoke(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> prevFilters, List<? extends OperatorFilter> newFilters) {
            Intrinsics.checkNotNullParameter(prevFilters, "prevFilters");
            Intrinsics.checkNotNullParameter(newFilters, "newFilters");
            return TuplesKt.m28425to(prevFilters.getSecond(), newFilters);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAreaPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorAreaPresenter$onCreate$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n766#2:262\n857#2,2:263\n766#2:265\n857#2,2:266\n*S KotlinDebug\n*F\n+ 1 OperatorAreaPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorAreaPresenter$onCreate$8\n*L\n125#1:262\n125#1:263,2\n126#1:265\n126#1:266,2\n*E\n"})
    /* renamed from: Bj3$q */
    /* loaded from: classes2.dex */
    public static final class C0714q extends Lambda implements Function1<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Boolean> {

        /* renamed from: g */
        public static final C0714q f2769g = new C0714q();

        public C0714q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> pair) {
            Set set;
            Set set2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<? extends OperatorFilter> component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = pair.component1().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((OperatorFilter) next).getKind() == OperatorMapKind.AREA) {
                    arrayList.add(next);
                }
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : component2) {
                if (((OperatorFilter) obj).getKind() == OperatorMapKind.AREA) {
                    arrayList2.add(obj);
                }
            }
            set2 = CollectionsKt___CollectionsKt.toSet(arrayList2);
            return Boolean.valueOf(!Intrinsics.areEqual(set, set2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bj3$r */
    /* loaded from: classes2.dex */
    public static final class C0715r extends Lambda implements Function1<Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>>, Unit> {
        public C0715r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<? extends OperatorFilter>, ? extends List<? extends OperatorFilter>> pair) {
            C31931Bj3.this.f2741c.mo64004a0(new C5691Nn(C39339cm2.m60884e(C31931Bj3.this.f2740b.getCenterLocation()), null, 2, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Bj3$s */
    /* loaded from: classes2.dex */
    public static final class C0716s<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C0716s<T1, T2, T3, T4, R> f2771a = new C0716s<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    public C31931Bj3(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC34766Nm3 mapUi, InterfaceC12495bn areaManager, InterfaceC46473om3 operatorManager, InterfaceC46545ot5 serverDrivenFilterManager, C36207Tq4 reactiveConfig, InterfaceC32282Cw3 ui, C7540Sm areaBottomSheetModelConversion, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(areaBottomSheetModelConversion, "areaBottomSheetModelConversion");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f2739a = scopeProvider;
        this.f2740b = mapUi;
        this.f2741c = areaManager;
        this.f2742d = operatorManager;
        this.f2743e = serverDrivenFilterManager;
        this.f2744f = reactiveConfig;
        this.f2745g = ui;
        this.f2746h = areaBottomSheetModelConversion;
        this.f2747i = navigator;
    }

    /* renamed from: A */
    public static final boolean m113627A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: B */
    public static final void m113626B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m113625C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m113624D() {
    }

    /* renamed from: E */
    public static final void m113623E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m113622F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m113621G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final Boolean m113620H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m113619I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23434B m113618J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m113617K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final boolean m113616L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M */
    public static final void m113615M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final Pair m113614N(Function2 tmp0, Pair pair, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(pair, obj);
    }

    /* renamed from: O */
    public static final boolean m113613O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: P */
    public static final void m113612P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m113611Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23434B m113590u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m113585z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public final Observable<Boolean> m113591t() {
        Z84<Optional<DateTime>> mo63993w = this.f2741c.mo63993w();
        final C0695a c0695a = new C0695a();
        Observable switchMap = mo63993w.switchMap(new InterfaceC23492o() { // from class: qj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m113590u;
                m113590u = C31931Bj3.m113590u(Function1.this, obj);
                return m113590u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun areaNeedRefr…  }\n        }\n      }\n  }");
        return switchMap;
    }

    /* renamed from: v */
    public final boolean m113589v() {
        return this.f2744f.m82623f8().m73665a().getOperatorConfig().getFeatures().getMap().getFilters().getEnableVariableFeeAreaQuickFilter();
    }

    /* renamed from: w */
    public final void m113588w() {
        this.f2741c.mo64004a0(new C5691Nn(null, null, 3, null));
    }

    /* renamed from: x */
    public final void m113587x(int i, int i2, Intent intent) {
        LatLng latLng;
        Object obj;
        InterfaceC7269Rm m84856d;
        if (i == 10056 && i2 == -1) {
            Unit unit = null;
            if (intent != null && (latLng = (LatLng) intent.getParcelableExtra("center_point")) != null) {
                this.f2743e.mo6177f(C33101Gj3.m104825a(AreaKind.REQUIRED_RELEASES), true);
                MapUi.DefaultImpls.zoomTo$default(this.f2740b, C37429Yw2.f47648a.m73962i(latLng), null, 2, null);
                Iterator<T> it = this.f2741c.mo63995r().getValue().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (GoogleMap_Kt.contains((Area) obj, C37429Yw2.f47648a.m73962i(latLng))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Area area = (Area) obj;
                C7540Sm c7540Sm = this.f2746h;
                if (area != null && (m84856d = c7540Sm.m84856d(area)) != null) {
                    this.f2745g.mo89311n4(m84856d);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                this.f2745g.mo89347U2();
            }
        }
    }

    /* renamed from: y */
    public final void m113586y() {
        List emptyList;
        List emptyList2;
        Observable<Boolean> observeOn = this.f2744f.m82581j6().observeOn(C23454a.m33087a());
        final C0707j c0707j = new C0707j();
        Observable<Boolean> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: hj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113585z(Function1.this, obj);
            }
        });
        final C0708k c0708k = C0708k.f2763g;
        Observable<Boolean> filter = doOnNext.filter(new InterfaceC23494q() { // from class: zj3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113627A;
                m113627A = C31931Bj3.m113627A(Function1.this, obj);
                return m113627A;
            }
        });
        final C0709l c0709l = new C0709l();
        Observable<R> flatMap = filter.flatMap(new InterfaceC23492o() { // from class: ij3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m113618J;
                m113618J = C31931Bj3.m113618J(Function1.this, obj);
                return m113618J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "fun onCreate() {\n    rea…anualRefresh)\n      }\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0710m c0710m = new C0710m();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113617K(Function1.this, obj);
            }
        });
        Observable streamOperatorFilters$default = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f2743e, false, 1, null);
        final C0711n c0711n = new C0711n();
        Observable observeOn2 = streamOperatorFilters$default.filter(new InterfaceC23494q() { // from class: kj3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113616L;
                m113616L = C31931Bj3.m113616L(Function1.this, obj);
                return m113616L;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onCreate() {\n    rea…anualRefresh)\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0712o c0712o = new C0712o();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: lj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113615M(Function1.this, obj);
            }
        });
        Observable streamOperatorFilters$default2 = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f2743e, false, 1, null);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Pair pair = new Pair(emptyList, emptyList2);
        final C0713p c0713p = C0713p.f2768g;
        Observable scan = streamOperatorFilters$default2.scan(pair, new InterfaceC23480c() { // from class: mj3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m113614N;
                m113614N = C31931Bj3.m113614N(Function2.this, (Pair) obj, obj2);
                return m113614N;
            }
        });
        final C0714q c0714q = C0714q.f2769g;
        Observable observeOn3 = scan.filter(new InterfaceC23494q() { // from class: nj3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113613O;
                m113613O = C31931Bj3.m113613O(Function1.this, obj);
                return m113613O;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "serverDrivenFilterManage…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0715r c0715r = new C0715r();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: oj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113612P(Function1.this, obj);
            }
        });
        Observable<AreaBottomSheetButton> observeOn4 = this.f2745g.mo89309o2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.areaSheetButtonClicks…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0697b c0697b = new C0697b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113611Q(Function1.this, obj);
            }
        };
        final C0698c c0698c = C0698c.f2751b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: rj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113626B(Function1.this, obj);
            }
        });
        C7540Sm c7540Sm = this.f2746h;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Optional<Area>> selectedAreaMarker = this.f2740b.selectedAreaMarker();
        Observable<Boolean> distinctUntilChanged = m113591t().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "areaNeedRefresh().distinctUntilChanged()");
        Observable<OperatorMapBottomSheet.EnumC14592a> startWith = this.f2745g.mo89318jj().startWith((Observable<OperatorMapBottomSheet.EnumC14592a>) OperatorMapBottomSheet.EnumC14592a.FLIGHT_SHEET);
        Intrinsics.checkNotNullExpressionValue(startWith, "ui.bottomSheetType()\n   …omSheetType.FLIGHT_SHEET)");
        Observable<Boolean> startWith2 = this.f2745g.mo89305rg(null).startWith((Observable<Boolean>) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(startWith2, "ui.bottomSheetVisible(nu…        .startWith(false)");
        Observable combineLatest = Observable.combineLatest(selectedAreaMarker, distinctUntilChanged, startWith, startWith2, C0716s.f2771a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        Observable observeOn5 = combineLatest.observeOn(C23454a.m33087a());
        final C0699d c0699d = new C0699d(c7540Sm);
        AbstractC23461c flatMapCompletable = observeOn5.flatMapCompletable(new InterfaceC23492o() { // from class: sj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m113625C;
                m113625C = C31931Bj3.m113625C(Function1.this, obj);
                return m113625C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "fun onCreate() {\n    rea…anualRefresh)\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: tj3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C31931Bj3.m113624D();
            }
        };
        final C0702e c0702e = C0702e.f2757b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: uj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113623E(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f2741c.mo63999g().m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0703f c0703f = C0703f.f2758g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: vj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113622F(Function1.this, obj);
            }
        };
        final C0704g c0704g = C0704g.f2759b;
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: wj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113621G(Function1.this, obj);
            }
        });
        Z84<Config> m82623f8 = this.f2744f.m82623f8();
        final C0705h c0705h = C0705h.f2760g;
        Observable observeOn6 = m82623f8.map(new InterfaceC23492o() { // from class: xj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113620H;
                m113620H = C31931Bj3.m113620H(Function1.this, obj);
                return m113620H;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "reactiveConfig.config.ma…dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f2739a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0706i c0706i = new C0706i();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: yj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31931Bj3.m113619I(Function1.this, obj);
            }
        });
    }
}
