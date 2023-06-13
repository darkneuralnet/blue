package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.BountyFlightSheetButton;
import co.bird.android.model.CopyTextButton;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.DirectionsButton;
import co.bird.android.model.ExternalLinkButton;
import co.bird.android.model.RefreshSurplusStateButton;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetAction;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32642Ek3;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0001\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,\u0012\b\b\u0001\u00103\u001a\u000200¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u000b0\u000b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R.\u0010=\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b 5*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010:0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00020\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R©\u0001\u0010E\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n 5*\u0004\u0018\u00010B0B\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004 5* \u0012\f\u0012\n 5*\u0004\u0018\u00010B0B\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004\u0018\u00010A0A 5*J\u0012D\u0012B\u0012\f\u0012\n 5*\u0004\u0018\u00010B0B\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004 5* \u0012\f\u0012\n 5*\u0004\u0018\u00010B0B\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004\u0018\u00010A0A\u0018\u00010@0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, m28432d2 = {"LEk3;", "", "", "K0", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "", "Y", "Lcom/google/android/gms/maps/model/LatLng;", "mapLocation", "Lio/reactivex/c;", "V", "", "bountyId", "P0", "Z", "O0", "LTk0;", C17296a.f69688o, "LTk0;", "clipboardManager", "Lom3;", "b", "Lom3;", "operatorManager", "Lot5;", "c", "Lot5;", "serverDrivenFilterManager", "LH00;", DateTokenConverter.CONVERTER_KEY, "LH00;", "bountyConverter", "Le13;", "e", "Le13;", "navigator", "Lgl;", "f", "Lgl;", "prefs", "LNm3;", "g", "LNm3;", "mapUi", "LPk3;", "h", "LPk3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "bountyIdRelay", "LAG;", "Lco/bird/android/buava/Optional;", "k", "LAG;", "lookupBountyRelay", "l", "refreshBountyRelay", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "m", "Lio/reactivex/Observable;", "actionClicks", "<init>", "(LTk0;Lom3;Lot5;LH00;Le13;Lgl;LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorBountyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,342:1\n237#2:343\n180#2:345\n237#2:346\n180#2:347\n237#2:348\n237#2:349\n180#2:350\n237#2:351\n180#2:352\n237#2:353\n233#3:344\n*S KotlinDebug\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter\n*L\n87#1:343\n100#1:345\n137#1:346\n142#1:347\n149#1:348\n187#1:349\n199#1:350\n240#1:351\n257#1:352\n288#1:353\n96#1:344\n*E\n"})
/* renamed from: Ek3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32642Ek3 {

    /* renamed from: a */
    public final InterfaceC36149Tk0 f8011a;

    /* renamed from: b */
    public final InterfaceC46473om3 f8012b;

    /* renamed from: c */
    public final InterfaceC46545ot5 f8013c;

    /* renamed from: d */
    public final H00 f8014d;

    /* renamed from: e */
    public final InterfaceC40099e13 f8015e;

    /* renamed from: f */
    public final C22454gl f8016f;

    /* renamed from: g */
    public final InterfaceC34766Nm3 f8017g;

    /* renamed from: h */
    public final InterfaceC35216Pk3 f8018h;

    /* renamed from: i */
    public final ScopeProvider f8019i;

    /* renamed from: j */
    public final C45168ma4<String> f8020j;

    /* renamed from: k */
    public final C0058AG<Optional<String>> f8021k;

    /* renamed from: l */
    public final C45168ma4<Unit> f8022l;

    /* renamed from: m */
    public final Observable<Pair<Integer, BountyFlightSheetDetails>> f8023m;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "<name for destructuring parameter 0>", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$A */
    /* loaded from: classes2.dex */
    public static final class C1940A extends Lambda implements Function1<Pair<? extends Integer, ? extends BountyFlightSheetDetails>, BountyFlightSheetAction.CancelDesignation> {

        /* renamed from: g */
        public static final C1940A f8024g = new C1940A();

        public C1940A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BountyFlightSheetAction.CancelDesignation invoke(Pair<Integer, BountyFlightSheetDetails> pair) {
            Integer index = pair.component1();
            List<BountyFlightSheetMapButtonOverrides> mapButtonOverrides = pair.component2().getMapButtonOverrides();
            Intrinsics.checkNotNullExpressionValue(index, "index");
            BountyFlightSheetAction action = mapButtonOverrides.get(index.intValue()).getAction();
            if (action instanceof BountyFlightSheetAction.CancelDesignation) {
                return (BountyFlightSheetAction.CancelDesignation) action;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;", "action", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$CancelDesignation;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$B */
    /* loaded from: classes2.dex */
    public static final class C1941B extends Lambda implements Function1<BountyFlightSheetAction.CancelDesignation, InterfaceC23447K<? extends Unit>> {
        public C1941B() {
            super(1);
        }

        /* renamed from: c */
        public static final void m108435c(C32642Ek3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f8022l.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Unit> invoke(BountyFlightSheetAction.CancelDesignation action) {
            Intrinsics.checkNotNullParameter(action, "action");
            AbstractC23461c mo8123X0 = C32642Ek3.this.f8012b.mo8123X0(action.getBountyIds());
            final C32642Ek3 c32642Ek3 = C32642Ek3.this;
            return mo8123X0.m33029z(new InterfaceC23478a() { // from class: Lk3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32642Ek3.C1941B.m108435c(C32642Ek3.this);
                }
            }).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$C */
    /* loaded from: classes2.dex */
    public static final class C1942C extends Lambda implements Function1<Unit, Unit> {
        public C1942C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32642Ek3.this.f8018h.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$D */
    /* loaded from: classes2.dex */
    public static final class C1943D extends Lambda implements Function1<Throwable, Unit> {
        public C1943D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C32642Ek3.this.f8018h.errorGeneric();
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$E */
    /* loaded from: classes2.dex */
    public static final class C1944E extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C1944E f8028g = new C1944E();

        public C1944E() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$F */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1945F extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1945F f8029b = new C1945F();

        public C1945F() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$G */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1946G extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1946G(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$H */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1947H extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1947H f8030b = new C1947H();

        public C1947H() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$I */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1948I extends FunctionReferenceImpl implements Function1<List<? extends BountyMapMarker>, Unit> {
        public C1948I(Object obj) {
            super(1, obj, InterfaceC34766Nm3.class, "setBountyMarkers", "setBountyMarkers(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BountyMapMarker> list) {
            invoke2((List<BountyMapMarker>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BountyMapMarker> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC34766Nm3) this.receiver).setBountyMarkers(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0097\u0001\u0010\u0002\u001a\u0092\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007 \u0006*H\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/BountyMapMarker;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorBountyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$onCreate$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n2624#2,3:343\n*S KotlinDebug\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$onCreate$8\n*L\n103#1:343,3\n*E\n"})
    /* renamed from: Ek3$J */
    /* loaded from: classes2.dex */
    public static final class C1949J extends Lambda implements Function1<Pair<? extends List<? extends BountyMapMarker>, ? extends Optional<String>>, Unit> {
        public C1949J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends BountyMapMarker>, ? extends Optional<String>> pair) {
            invoke2((Pair<? extends List<BountyMapMarker>, Optional<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<BountyMapMarker>, Optional<String>> pair) {
            List<BountyMapMarker> markers = pair.component1();
            String m59035e = pair.component2().m59035e();
            if (m59035e == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(markers, "markers");
            List<BountyMapMarker> list = markers;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((BountyMapMarker) it.next()).getId(), m59035e)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                C32642Ek3.this.f8018h.mo89347U2();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$K */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1950K extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1950K f8032b = new C1950K();

        public C1950K() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$M */
    /* loaded from: classes2.dex */
    public static final class C1952M extends Lambda implements Function1<Throwable, Unit> {
        public C1952M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            InterfaceC35216Pk3 interfaceC35216Pk3 = C32642Ek3.this.f8018h;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            C38689bg5.m64175f(interfaceC35216Pk3, e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$N */
    /* loaded from: classes2.dex */
    public static final class C1953N extends Lambda implements Function1<BountyFlightSheetDetails, Unit> {
        public C1953N() {
            super(1);
        }

        /* renamed from: a */
        public final void m108434a(BountyFlightSheetDetails bountyFlightSheetDetails) {
            C32642Ek3.this.f8018h.mo86401xd(new InterfaceC35450Qk3.C6851a(bountyFlightSheetDetails.getMapButtonOverrides()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyFlightSheetDetails bountyFlightSheetDetails) {
            m108434a(bountyFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "it", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$O */
    /* loaded from: classes2.dex */
    public static final class C1954O extends Lambda implements Function1<BountyFlightSheetDetails, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C1954O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(BountyFlightSheetDetails it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32642Ek3.this.f8014d.m104510b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$P */
    /* loaded from: classes2.dex */
    public static final class C1955P extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C1955P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            InterfaceC35216Pk3 interfaceC35216Pk3 = C32642Ek3.this.f8018h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC35216Pk3.mo89355M5(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$Q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1956Q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1956Q(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1957a extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<BountyFlightSheetDetails>> {
        public C1957a(Object obj) {
            super(1, obj, InterfaceC46473om3.class, "bounty", "bounty(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<BountyFlightSheetDetails> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC46473om3) this.receiver).mo8124X(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filter", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$b */
    /* loaded from: classes2.dex */
    public static final class C1958b extends Lambda implements Function1<List<? extends OperatorFilter>, OperatorMapFilterBundle> {

        /* renamed from: g */
        public static final C1958b f8038g = new C1958b();

        public C1958b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorMapFilterBundle invoke(List<? extends OperatorFilter> filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            return C52473yt5.m2323c(filter);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter\n*L\n1#1,304:1\n97#2:305\n*E\n"})
    /* renamed from: Ek3$d */
    /* loaded from: classes2.dex */
    public static final class C1961d<T1, T2, R> implements InterfaceC23480c<Boolean, String, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Boolean bool, String str) {
            String str2 = str;
            if (bool.booleanValue()) {
                return (R) Optional.f63040c.m59032c(str2);
            }
            return (R) Optional.f63040c.m59034a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052:\u0010\u0006\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/BountyMapMarker;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/persistence/BountyMapMarker;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorBountyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$onCreate$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n288#2,2:343\n*S KotlinDebug\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$onCreate$10\n*L\n120#1:343,2\n*E\n"})
    /* renamed from: Ek3$e */
    /* loaded from: classes2.dex */
    public static final class C1962e extends Lambda implements Function1<Pair<? extends Optional<String>, ? extends List<? extends BountyMapMarker>>, BountyMapMarker> {
        public C1962e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BountyMapMarker invoke(Pair<Optional<String>, ? extends List<BountyMapMarker>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<BountyMapMarker> bountyMapMarkers = pair.component2();
            String m59035e = pair.component1().m59035e();
            Object obj = null;
            if (m59035e == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(bountyMapMarkers, "bountyMapMarkers");
            Iterator<T> it = bountyMapMarkers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((BountyMapMarker) next).getId(), m59035e)) {
                    obj = next;
                    break;
                }
            }
            C32642Ek3 c32642Ek3 = C32642Ek3.this;
            BountyMapMarker bountyMapMarker = (BountyMapMarker) obj;
            if (bountyMapMarker == null) {
                C41318g46.m40151m("Lookup bounty Id (" + m59035e + ") not found", new Object[0]);
            } else {
                c32642Ek3.f8021k.accept(Optional.f63040c.m59034a());
            }
            return bountyMapMarker;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$f */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1963f extends AdaptedFunctionReference implements Function1<BountyMapMarker, Unit> {
        public C1963f(Object obj) {
            super(1, obj, InterfaceC34766Nm3.class, "zoomToBoundsContainingBounties", "zoomToBoundsContainingBounties([Lco/bird/android/model/persistence/BountyMapMarker;)V", 0);
        }

        /* renamed from: b */
        public final void m108426b(BountyMapMarker p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC34766Nm3) this.receiver).mo91461L3(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyMapMarker bountyMapMarker) {
            m108426b(bountyMapMarker);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyMapMarker;", "bountyMarker", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BountyMapMarker;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$g */
    /* loaded from: classes2.dex */
    public static final class C1964g extends Lambda implements Function1<BountyMapMarker, InterfaceC23496h> {
        public C1964g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(BountyMapMarker bountyMarker) {
            Intrinsics.checkNotNullParameter(bountyMarker, "bountyMarker");
            return C32642Ek3.this.m108505P0(bountyMarker.getId());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$h */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1965h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1965h(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1966i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1966i f8043b = new C1966i();

        public C1966i() {
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$j */
    /* loaded from: classes2.dex */
    public static final class C1967j extends Lambda implements Function1<Pair<? extends BountyMapMarker, ? extends Boolean>, String> {

        /* renamed from: g */
        public static final C1967j f8044g = new C1967j();

        public C1967j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Pair<BountyMapMarker, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1().getId();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1968k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1968k f8045b = new C1968k();

        public C1968k() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$l */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1969l extends FunctionReferenceImpl implements Function1<String, AbstractC23461c> {
        public C1969l(Object obj) {
            super(1, obj, C32642Ek3.class, "refreshFlightSheetDetails", "refreshFlightSheetDetails(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C32642Ek3) this.receiver).m108505P0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$m */
    /* loaded from: classes2.dex */
    public static final class C1970m extends Lambda implements Function1<Unit, LatLng> {
        public C1970m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final LatLng invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32642Ek3.this.f8017g.getCenterLocation();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$n */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1971n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1971n f8047b = new C1971n();

        public C1971n() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BountyFlightSheetButton;", "kotlin.jvm.PlatformType", "button", "", C17296a.f69688o, "(Lco/bird/android/model/BountyFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$o */
    /* loaded from: classes2.dex */
    public static final class C1972o extends Lambda implements Function1<BountyFlightSheetButton, Unit> {
        public C1972o() {
            super(1);
        }

        /* renamed from: a */
        public final void m108422a(BountyFlightSheetButton bountyFlightSheetButton) {
            if (bountyFlightSheetButton instanceof DirectionsButton) {
                DirectionsButton directionsButton = (DirectionsButton) bountyFlightSheetButton;
                C32642Ek3.this.f8015e.mo36935u2(C37429Yw2.f47648a.m73962i(new LatLng(directionsButton.getPoint().f66612y, directionsButton.getPoint().f66611x)));
            } else if (bountyFlightSheetButton instanceof CopyTextButton) {
                CopyTextButton copyTextButton = (CopyTextButton) bountyFlightSheetButton;
                C32642Ek3.this.f8011a.mo79490a("city_complaint", copyTextButton.getText());
                C32642Ek3.this.f8018h.snackToast(copyTextButton.getText());
            } else if (bountyFlightSheetButton instanceof ExternalLinkButton) {
                InterfaceC40099e13.C19924a.goToWebView$default(C32642Ek3.this.f8015e, ((ExternalLinkButton) bountyFlightSheetButton).getUrl(), null, null, false, 14, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyFlightSheetButton bountyFlightSheetButton) {
            m108422a(bountyFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/BountyFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BountyFlightSheetButton;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$p */
    /* loaded from: classes2.dex */
    public static final class C1973p extends Lambda implements Function1<BountyFlightSheetButton, Boolean> {

        /* renamed from: g */
        public static final C1973p f8049g = new C1973p();

        public C1973p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(BountyFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof RefreshSurplusStateButton);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BountyFlightSheetButton;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BountyFlightSheetButton;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$q */
    /* loaded from: classes2.dex */
    public static final class C1974q extends Lambda implements Function1<BountyFlightSheetButton, InterfaceC23447K<? extends Boolean>> {
        public C1974q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Boolean> invoke(BountyFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32642Ek3.this.f8012b.mo8120Z(((RefreshSurplusStateButton) it).getSurplusId());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$s */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1976s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1976s f8052b = new C1976s();

        public C1976s() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$t */
    /* loaded from: classes2.dex */
    public static final class C1977t extends Lambda implements Function1<Boolean, Unit> {
        public C1977t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C32642Ek3.this.f8018h.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$u */
    /* loaded from: classes2.dex */
    public static final class C1978u extends Lambda implements Function1<Pair<? extends Integer, ? extends BountyFlightSheetDetails>, Boolean> {
        public C1978u() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Integer, BountyFlightSheetDetails> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BountyFlightSheetDetails details = pair.component2();
            C32642Ek3 c32642Ek3 = C32642Ek3.this;
            Intrinsics.checkNotNullExpressionValue(details, "details");
            return Boolean.valueOf(c32642Ek3.m108492Y(details));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Integer, ? extends BountyFlightSheetDetails> pair) {
            return invoke2((Pair<Integer, BountyFlightSheetDetails>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "<name for destructuring parameter 0>", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$v */
    /* loaded from: classes2.dex */
    public static final class C1979v extends Lambda implements Function1<Pair<? extends Integer, ? extends BountyFlightSheetDetails>, BountyFlightSheetAction> {

        /* renamed from: g */
        public static final C1979v f8055g = new C1979v();

        public C1979v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BountyFlightSheetAction invoke(Pair<Integer, BountyFlightSheetDetails> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Integer index = pair.component1();
            List<BountyFlightSheetMapButtonOverrides> mapButtonOverrides = pair.component2().getMapButtonOverrides();
            Intrinsics.checkNotNullExpressionValue(index, "index");
            return mapButtonOverrides.get(index.intValue()).getAction();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$w */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1980w extends FunctionReferenceImpl implements Function1<LatLng, AbstractC23461c> {
        public C1980w(Object obj) {
            super(1, obj, C32642Ek3.class, "fetchLocationBountiesAndSetMap", "fetchLocationBountiesAndSetMap(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(LatLng p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C32642Ek3) this.receiver).m108495V(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;", "action", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$x */
    /* loaded from: classes2.dex */
    public static final class C1981x extends Lambda implements Function1<BountyFlightSheetAction, InterfaceC24574u<? extends BountyFlightSheetAction.AcceptDesignation>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ek3$x$a */
        /* loaded from: classes2.dex */
        public static final class C1982a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C1982a f8057g = new C1982a();

            public C1982a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ek3$x$b */
        /* loaded from: classes2.dex */
        public static final class C1983b extends Lambda implements Function1<DialogResponse, BountyFlightSheetAction.AcceptDesignation> {

            /* renamed from: g */
            public final /* synthetic */ BountyFlightSheetAction f8058g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1983b(BountyFlightSheetAction bountyFlightSheetAction) {
                super(1);
                this.f8058g = bountyFlightSheetAction;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final BountyFlightSheetAction.AcceptDesignation invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BountyFlightSheetAction action = this.f8058g;
                Intrinsics.checkNotNullExpressionValue(action, "action");
                return (BountyFlightSheetAction.AcceptDesignation) action;
            }
        }

        public C1981x() {
            super(1);
        }

        /* renamed from: d */
        public static final BountyFlightSheetAction.AcceptDesignation m108412d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (BountyFlightSheetAction.AcceptDesignation) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends BountyFlightSheetAction.AcceptDesignation> invoke(BountyFlightSheetAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof BountyFlightSheetAction.AcceptDesignation) {
                BountyFlightSheetAction.AcceptDesignation acceptDesignation = (BountyFlightSheetAction.AcceptDesignation) action;
                AbstractC23442F<DialogResponse> mo89325g3 = C32642Ek3.this.f8018h.mo89325g3(acceptDesignation.getAcceptDestinationConfirmationTitle(), acceptDesignation.getAcceptDestinationConfirmationBody());
                final C1982a c1982a = C1982a.f8057g;
                AbstractC24507p<DialogResponse> m33098z = mo89325g3.m33098z(new InterfaceC23494q() { // from class: Hk3
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = C32642Ek3.C1981x.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C1983b c1983b = new C1983b(action);
                return m33098z.m32067H(new InterfaceC23492o() { // from class: Ik3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        BountyFlightSheetAction.AcceptDesignation m108412d;
                        m108412d = C32642Ek3.C1981x.m108412d(Function1.this, obj);
                        return m108412d;
                    }
                });
            } else if (action instanceof BountyFlightSheetAction.Capture) {
                C32642Ek3.this.f8018h.mo89358K4();
                C32642Ek3.this.f8018h.mo89347U2();
                return AbstractC24507p.m32024u();
            } else if (action instanceof BountyFlightSheetAction.ResolveComplaint) {
                C32642Ek3.this.f8015e.mo36929v2(((BountyFlightSheetAction.ResolveComplaint) action).getComplaintIds());
                return AbstractC24507p.m32024u();
            } else {
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ek3$z */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1986z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1986z f8061b = new C1986z();

        public C1986z() {
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

    public C32642Ek3(InterfaceC36149Tk0 clipboardManager, InterfaceC46473om3 operatorManager, InterfaceC46545ot5 serverDrivenFilterManager, H00 bountyConverter, InterfaceC40099e13 navigator, C22454gl prefs, InterfaceC34766Nm3 mapUi, InterfaceC35216Pk3 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(bountyConverter, "bountyConverter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f8011a = clipboardManager;
        this.f8012b = operatorManager;
        this.f8013c = serverDrivenFilterManager;
        this.f8014d = bountyConverter;
        this.f8015e = navigator;
        this.f8016f = prefs;
        this.f8017g = mapUi;
        this.f8018h = ui;
        this.f8019i = scopeProvider;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f8020j = m25409g;
        C0058AG<Optional<String>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<Optional<String>>(Optional.absent())");
        this.f8021k = m115950h;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f8022l = m25409g2;
        Observable<Integer> subscribeOn = ui.mo89333cb().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "ui.bountyActionClicks()\n…dSchedulers.mainThread())");
        final C1957a c1957a = new C1957a(operatorManager);
        InterfaceC23434B flatMapSingle = m25409g.flatMapSingle(new InterfaceC23492o() { // from class: uk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108496U;
                m108496U = C32642Ek3.m108496U(Function1.this, obj);
                return m108496U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "bountyIdRelay.flatMapSin…(operatorManager::bounty)");
        this.f8023m = C24527f.m31950a(subscribeOn, flatMapSingle).share();
    }

    /* renamed from: A0 */
    public static final InterfaceC23447K m108535A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m108533B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m108531C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m108529D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m108527E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m108525F0() {
    }

    /* renamed from: G0 */
    public static final void m108523G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m108521H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final void m108519I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final void m108517J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final InterfaceC23496h m108513L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m108511M0() {
    }

    /* renamed from: N0 */
    public static final void m108509N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m108503Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final InterfaceC23447K m108501R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m108499S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m108497T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m108496U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final OperatorMapFilterBundle m108494W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorMapFilterBundle) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23496h m108493X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final LatLng m108489a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m108487b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m108485c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m108483d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m108481e0() {
    }

    /* renamed from: f0 */
    public static final void m108479f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final String m108477g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m108475h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23496h m108473i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m108471j0() {
    }

    /* renamed from: k0 */
    public static final void m108469k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23496h m108467l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m108465m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final boolean m108463n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m108461o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23496h m108459p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m108457q0() {
    }

    /* renamed from: r0 */
    public static final void m108455r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m108453s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final boolean m108451t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u0 */
    public static final BountyFlightSheetAction m108449u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BountyFlightSheetAction) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC24574u m108447v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m108445w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23496h m108443x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m108441y0() {
    }

    /* renamed from: z0 */
    public static final void m108439z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public final void m108515K0() {
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(this.f8018h.mo89335bc(), this.f8021k);
        final C1951L c1951l = new C1951L();
        AbstractC23461c m33164B = m74531s0.m33164B(new InterfaceC23492o() { // from class: vk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108513L0;
                m108513L0 = C32642Ek3.m108513L0(Function1.this, obj);
                return m108513L0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun promptBounty…gAndDisplayError(e) }\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: wk3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108511M0();
            }
        };
        final C1952M c1952m = new C1952M();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: xk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108509N0(Function1.this, obj);
            }
        });
    }

    /* renamed from: O0 */
    public final void m108507O0() {
        this.f8022l.accept(Unit.INSTANCE);
    }

    /* renamed from: P0 */
    public final AbstractC23461c m108505P0(String str) {
        AbstractC23442F<BountyFlightSheetDetails> m33152N = this.f8012b.mo8124X(str).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "operatorManager.bounty(b…dSchedulers.mainThread())");
        AbstractC23442F progress$default = C28237sD.progress$default(m33152N, this.f8018h, 0, 2, (Object) null);
        final C1953N c1953n = new C1953N();
        AbstractC23442F m33152N2 = progress$default.m33101w(new InterfaceC23484g() { // from class: gk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108503Q0(Function1.this, obj);
            }
        }).m33152N(C24542a.m31934a());
        final C1954O c1954o = new C1954O();
        AbstractC23442F m33152N3 = m33152N2.m33165A(new InterfaceC23492o() { // from class: rk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108501R0;
                m108501R0 = C32642Ek3.m108501R0(Function1.this, obj);
                return m108501R0;
            }
        }).m33152N(C23454a.m33087a());
        final C1955P c1955p = new C1955P();
        AbstractC23442F m33101w = m33152N3.m33101w(new InterfaceC23484g() { // from class: yk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108499S0(Function1.this, obj);
            }
        });
        final C1956Q c1956q = new C1956Q(this.f8018h);
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: zk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108497T0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun refreshFligh…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: V */
    public final AbstractC23461c m108495V(LatLng latLng) {
        if (!this.f8013c.mo6180c()) {
            AbstractC23442F<List<OperatorFilter>> firstOrError = this.f8013c.mo6176g(true).firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "serverDrivenFilterManage…)\n        .firstOrError()");
            AbstractC23442F progress$default = C28237sD.progress$default(firstOrError, this.f8018h, 0, 2, (Object) null);
            final C1958b c1958b = C1958b.f8038g;
            AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: Kj3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    OperatorMapFilterBundle m108494W;
                    m108494W = C32642Ek3.m108494W(Function1.this, obj);
                    return m108494W;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "serverDrivenFilterManage….toOperatorMapRequest() }");
            AbstractC23442F m33152N = C37279Yf5.m74531s0(m33157I, this.f8021k).m33152N(C23454a.m33087a());
            final C1959c c1959c = new C1959c(latLng);
            AbstractC23461c m33164B = m33152N.m33164B(new InterfaceC23492o() { // from class: Vj3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m108493X;
                    m108493X = C32642Ek3.m108493X(Function1.this, obj);
                    return m108493X;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33164B, "private fun fetchLocatio…able.complete()\n    }\n  }");
            return m33164B;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    /* renamed from: Y */
    public final boolean m108492Y(BountyFlightSheetDetails bountyFlightSheetDetails) {
        if (!(bountyFlightSheetDetails.getMapButtonOverrides().get(0).getAction() instanceof BountyFlightSheetAction.AcceptDesignation) && !(bountyFlightSheetDetails.getMapButtonOverrides().get(0).getAction() instanceof BountyFlightSheetAction.ResolveComplaint) && !(bountyFlightSheetDetails.getMapButtonOverrides().get(0).getAction() instanceof BountyFlightSheetAction.Capture)) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public final void m108491Z() {
        this.f8021k.accept(Optional.f63040c.m59033b(this.f8016f.m37623g0()));
        Observable<LatLng> centerLocationChanged = this.f8017g.centerLocationChanged();
        Observable<Unit> observeOn = this.f8022l.observeOn(C23454a.m33087a());
        final C1970m c1970m = new C1970m();
        Observable observeOn2 = Observable.merge(centerLocationChanged, observeOn.map(new InterfaceC23492o() { // from class: Ak3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LatLng m108489a0;
                m108489a0 = C32642Ek3.m108489a0(Function1.this, obj);
                return m108489a0;
            }
        })).throttleLast(2L, TimeUnit.SECONDS).observeOn(C24542a.m31932c());
        final C1980w c1980w = new C1980w(this);
        AbstractC23461c flatMapCompletable = observeOn2.flatMapCompletable(new InterfaceC23492o() { // from class: Sj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108467l0;
                m108467l0 = C32642Ek3.m108467l0(Function1.this, obj);
                return m108467l0;
            }
        });
        final C1946G c1946g = new C1946G(this.f8018h);
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: ek3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108445w0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: mk3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108525F0();
            }
        };
        final C1947H c1947h = C1947H.f8030b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: nk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108523G0(Function1.this, obj);
            }
        });
        Observable<List<BountyMapMarker>> observeOn3 = this.f8012b.mo8072v0().observeOn(C23454a.m33087a());
        final C1948I c1948i = new C1948I(this.f8017g);
        Observable<List<BountyMapMarker>> doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: ok3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108521H0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "operatorManager.bounties…(mapUi::setBountyMarkers)");
        InterfaceC35216Pk3 interfaceC35216Pk3 = this.f8018h;
        OperatorMapBottomSheet.EnumC14592a enumC14592a = OperatorMapBottomSheet.EnumC14592a.BOUNTY_FLIGHT_SHEET;
        InterfaceC23434B withLatestFrom = interfaceC35216Pk3.mo89305rg(enumC14592a).withLatestFrom(this.f8020j, new C1961d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as = C24527f.m31950a(doOnNext, withLatestFrom).m33094as(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1949J c1949j = new C1949J();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108519I0(Function1.this, obj);
            }
        };
        final C1950K c1950k = C1950K.f8032b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108517J0(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        C0058AG<Optional<String>> c0058ag = this.f8021k;
        Observable<List<BountyMapMarker>> skip = this.f8012b.mo8072v0().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "operatorManager.bounties…anceled.\n        .skip(1)");
        Observable observeOn4 = C37279Yf5.m74575T(c24523e.m31956a(c0058ag, skip), new C1962e()).observeOn(C23454a.m33087a());
        final C1963f c1963f = new C1963f(this.f8017g);
        Observable observeOn5 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: sk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108487b0(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C1964g c1964g = new C1964g();
        AbstractC23461c flatMapCompletable2 = observeOn5.flatMapCompletable(new InterfaceC23492o() { // from class: tk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108485c0;
                m108485c0 = C32642Ek3.m108485c0(Function1.this, obj);
                return m108485c0;
            }
        });
        final C1965h c1965h = new C1965h(this.f8018h);
        AbstractC23461c m33066T2 = flatMapCompletable2.m33084B(new InterfaceC23484g() { // from class: Bk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108483d0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33041n2 = m33066T2.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: Ck3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108481e0();
            }
        };
        final C1966i c1966i = C1966i.f8043b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: Dk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108479f0(Function1.this, obj);
            }
        });
        Observable<Pair<BountyMapMarker, Boolean>> bountyMarkerClicks = this.f8017g.bountyMarkerClicks();
        final C1967j c1967j = C1967j.f8044g;
        Observable<R> map = bountyMarkerClicks.map(new InterfaceC23492o() { // from class: Lj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m108477g0;
                m108477g0 = C32642Ek3.m108477g0(Function1.this, obj);
                return m108477g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "mapUi.bountyMarkerClicks…ker) -> bountyMarker.id }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        C45168ma4<String> c45168ma4 = this.f8020j;
        final C1968k c1968k = C1968k.f8045b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(c45168ma4, new InterfaceC23484g() { // from class: Mj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108475h0(Function1.this, obj);
            }
        });
        Observable<String> observeOn6 = this.f8020j.observeOn(C24542a.m31932c());
        final C1969l c1969l = new C1969l(this);
        AbstractC23461c m33066T3 = observeOn6.flatMapCompletable(new InterfaceC23492o() { // from class: Nj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108473i0;
                m108473i0 = C32642Ek3.m108473i0(Function1.this, obj);
                return m108473i0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T3, "bountyIdRelay\n      .obs…etDetails)\n      .retry()");
        Object m33041n3 = m33066T3.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a3 = new InterfaceC23478a() { // from class: Oj3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108471j0();
            }
        };
        final C1971n c1971n = C1971n.f8047b;
        ((CompletableSubscribeProxy) m33041n3).mo45217e(interfaceC23478a3, new InterfaceC23484g() { // from class: Pj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108469k0(Function1.this, obj);
            }
        });
        Observable<BountyFlightSheetButton> observeOn7 = this.f8018h.mo89324gc().observeOn(C23454a.m33087a());
        final C1972o c1972o = new C1972o();
        Observable<BountyFlightSheetButton> doOnNext2 = observeOn7.doOnNext(new InterfaceC23484g() { // from class: Qj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108465m0(Function1.this, obj);
            }
        });
        final C1973p c1973p = C1973p.f8049g;
        Observable<BountyFlightSheetButton> observeOn8 = doOnNext2.filter(new InterfaceC23494q() { // from class: Rj3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m108463n0;
                m108463n0 = C32642Ek3.m108463n0(Function1.this, obj);
                return m108463n0;
            }
        }).observeOn(C24542a.m31932c());
        final C1974q c1974q = new C1974q();
        Observable<R> flatMapSingle = observeOn8.flatMapSingle(new InterfaceC23492o() { // from class: Tj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108461o0;
                m108461o0 = C32642Ek3.m108461o0(Function1.this, obj);
                return m108461o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Observable m31950a = C24527f.m31950a(flatMapSingle, this.f8020j);
        final C1975r c1975r = new C1975r();
        AbstractC23461c flatMapCompletable3 = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: Uj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108459p0;
                m108459p0 = C32642Ek3.m108459p0(Function1.this, obj);
                return m108459p0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable3, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33041n4 = flatMapCompletable3.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a4 = new InterfaceC23478a() { // from class: Wj3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108457q0();
            }
        };
        final C1976s c1976s = C1976s.f8052b;
        ((CompletableSubscribeProxy) m33041n4).mo45217e(interfaceC23478a4, new InterfaceC23484g() { // from class: Xj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108455r0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn9 = this.f8018h.mo89305rg(enumC14592a).skip(1L).distinctUntilChanged().observeOn(C23454a.m33087a());
        final C1977t c1977t = new C1977t();
        Observable<Boolean> doOnNext3 = observeOn9.doOnNext(new InterfaceC23484g() { // from class: Yj3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108453s0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33094as3 = doOnNext3.m33094as(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Observable<Pair<Integer, BountyFlightSheetDetails>> subscribeOn = this.f8023m.subscribeOn(C23454a.m33087a());
        final C1978u c1978u = new C1978u();
        Observable<Pair<Integer, BountyFlightSheetDetails>> filter = subscribeOn.filter(new InterfaceC23494q() { // from class: Zj3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m108451t0;
                m108451t0 = C32642Ek3.m108451t0(Function1.this, obj);
                return m108451t0;
            }
        });
        final C1979v c1979v = C1979v.f8055g;
        Observable<R> map2 = filter.map(new InterfaceC23492o() { // from class: ak3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BountyFlightSheetAction m108449u0;
                m108449u0 = C32642Ek3.m108449u0(Function1.this, obj);
                return m108449u0;
            }
        });
        final C1981x c1981x = new C1981x();
        Observable observeOn10 = map2.flatMapMaybe(new InterfaceC23492o() { // from class: bk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m108447v0;
                m108447v0 = C32642Ek3.m108447v0(Function1.this, obj);
                return m108447v0;
            }
        }).observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Observable m31950a2 = C24527f.m31950a(observeOn10, this.f8020j);
        final C1984y c1984y = new C1984y();
        AbstractC23461c m33066T4 = m31950a2.flatMapCompletable(new InterfaceC23492o() { // from class: ck3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108443x0;
                m108443x0 = C32642Ek3.m108443x0(Function1.this, obj);
                return m108443x0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T4, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33041n5 = m33066T4.m33041n(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n5, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a5 = new InterfaceC23478a() { // from class: dk3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32642Ek3.m108441y0();
            }
        };
        final C1986z c1986z = C1986z.f8061b;
        ((CompletableSubscribeProxy) m33041n5).mo45217e(interfaceC23478a5, new InterfaceC23484g() { // from class: fk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108439z0(Function1.this, obj);
            }
        });
        Observable<Pair<Integer, BountyFlightSheetDetails>> actionClicks = this.f8023m;
        Intrinsics.checkNotNullExpressionValue(actionClicks, "actionClicks");
        Observable m74575T = C37279Yf5.m74575T(actionClicks, C1940A.f8024g);
        final C1941B c1941b = new C1941B();
        Observable observeOn11 = m74575T.flatMapSingle(new InterfaceC23492o() { // from class: hk3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m108535A0;
                m108535A0 = C32642Ek3.m108535A0(Function1.this, obj);
                return m108535A0;
            }
        }).observeOn(C23454a.m33087a());
        final C1942C c1942c = new C1942C();
        Observable doOnNext4 = observeOn11.doOnNext(new InterfaceC23484g() { // from class: ik3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108533B0(Function1.this, obj);
            }
        });
        final C1943D c1943d = new C1943D();
        Observable retry = doOnNext4.doOnError(new InterfaceC23484g() { // from class: jk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108531C0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate() {\n    // …ationReaccept()\n    }\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f8019i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1944E c1944e = C1944E.f8028g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: kk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108529D0(Function1.this, obj);
            }
        };
        final C1945F c1945f = C1945F.f8029b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: lk3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32642Ek3.m108527E0(Function1.this, obj);
            }
        });
        if (this.f8016f.m37735F()) {
            m108515K0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$AcceptDesignation;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$y */
    /* loaded from: classes2.dex */
    public static final class C1984y extends Lambda implements Function1<Pair<? extends BountyFlightSheetAction.AcceptDesignation, ? extends String>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ek3$y$a */
        /* loaded from: classes2.dex */
        public static final class C1985a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32642Ek3 f8060g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1985a(C32642Ek3 c32642Ek3) {
                super(1);
                this.f8060g = c32642Ek3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f8060g.f8018h.errorGeneric();
                C41318g46.m40159e(th);
            }
        }

        public C1984y() {
            super(1);
        }

        /* renamed from: c */
        public static final void m108407c(C32642Ek3 this$0, BountyFlightSheetAction.AcceptDesignation acceptDesignation) {
            Object first;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f8022l.accept(Unit.INSTANCE);
            C45168ma4 c45168ma4 = this$0.f8020j;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) acceptDesignation.getBountyIds());
            c45168ma4.accept(first);
        }

        /* renamed from: d */
        public static final void m108406d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BountyFlightSheetAction.AcceptDesignation, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final BountyFlightSheetAction.AcceptDesignation component1 = pair.component1();
            pair.component2();
            AbstractC23461c mo8088n1 = C32642Ek3.this.f8012b.mo8088n1(component1.getBountyIds());
            final C32642Ek3 c32642Ek3 = C32642Ek3.this;
            AbstractC23461c m33029z = mo8088n1.m33029z(new InterfaceC23478a() { // from class: Jk3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32642Ek3.C1984y.m108407c(C32642Ek3.this, component1);
                }
            });
            final C1985a c1985a = new C1985a(C32642Ek3.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: Kk3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32642Ek3.C1984y.m108406d(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BountyFlightSheetAction.AcceptDesignation, ? extends String> pair) {
            return invoke2((Pair<BountyFlightSheetAction.AcceptDesignation, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$L */
    /* loaded from: classes2.dex */
    public static final class C1951L extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Optional<String>>, InterfaceC23496h> {
        public C1951L() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends DialogResponse, Optional<String>> pair) {
            List<String> listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            DialogResponse component1 = pair.component1();
            String m59035e = pair.component2().m59035e();
            if (m59035e == null) {
                return AbstractC23461c.m33039p();
            }
            if (component1 == DialogResponse.CANCEL) {
                InterfaceC46473om3 interfaceC46473om3 = C32642Ek3.this.f8012b;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m59035e);
                return interfaceC46473om3.mo8123X0(listOf);
            }
            return C32642Ek3.this.f8012b.mo8121Y0(m59035e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends DialogResponse, ? extends Optional<String>> pair) {
            return invoke2((Pair<? extends DialogResponse, Optional<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ek3$r */
    /* loaded from: classes2.dex */
    public static final class C1975r extends Lambda implements Function1<Pair<? extends Boolean, ? extends String>, InterfaceC23496h> {
        public C1975r() {
            super(1);
        }

        /* renamed from: b */
        public static final void m108418b(C32642Ek3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f8022l.accept(Unit.INSTANCE);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean surplusStill = pair.component1();
            String bountyId = pair.component2();
            Intrinsics.checkNotNullExpressionValue(surplusStill, "surplusStill");
            if (surplusStill.booleanValue()) {
                C32642Ek3 c32642Ek3 = C32642Ek3.this;
                Intrinsics.checkNotNullExpressionValue(bountyId, "bountyId");
                return c32642Ek3.m108505P0(bountyId);
            }
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            final C32642Ek3 c32642Ek32 = C32642Ek3.this;
            return m33039p.m33029z(new InterfaceC23478a() { // from class: Gk3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32642Ek3.C1975r.m108418b(C32642Ek3.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends String> pair) {
            return invoke2((Pair<Boolean, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorBountyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$fetchLocationBountiesAndSetMap$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
    /* renamed from: Ek3$c */
    /* loaded from: classes2.dex */
    public static final class C1959c extends Lambda implements Function1<Pair<? extends OperatorMapFilterBundle, ? extends Optional<String>>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ LatLng f8040h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ek3$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C1960a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C1960a(Object obj) {
                super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1959c(LatLng latLng) {
            super(1);
            this.f8040h = latLng;
        }

        /* renamed from: b */
        public static final void m108429b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<OperatorMapFilterBundle, Optional<String>> pair) {
            List<String> list;
            List<String> listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorMapFilterBundle filtersRequest = pair.component1();
            InterfaceC46473om3 interfaceC46473om3 = C32642Ek3.this.f8012b;
            Location m73962i = C37429Yw2.f47648a.m73962i(this.f8040h);
            double nearbyRadius = C32642Ek3.this.f8017g.nearbyRadius();
            Intrinsics.checkNotNullExpressionValue(filtersRequest, "filtersRequest");
            String m59035e = pair.component2().m59035e();
            if (m59035e != null) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m59035e);
                list = listOf;
            } else {
                list = null;
            }
            AbstractC23461c mo8117a1 = interfaceC46473om3.mo8117a1(m73962i, nearbyRadius, filtersRequest, list, C32642Ek3.this.f8017g.viewport());
            final C1960a c1960a = new C1960a(C32642Ek3.this.f8018h);
            AbstractC23461c m33084B = mo8117a1.m33084B(new InterfaceC23484g() { // from class: Fk3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32642Ek3.C1959c.m108429b(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33084B, "operatorManager\n        …r(ui::logAndDisplayError)");
            return C28237sD.progress$default(m33084B, C32642Ek3.this.f8018h, 0, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends OperatorMapFilterBundle, ? extends Optional<String>> pair) {
            return invoke2((Pair<OperatorMapFilterBundle, Optional<String>>) pair);
        }
    }
}
