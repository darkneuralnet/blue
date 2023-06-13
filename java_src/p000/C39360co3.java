package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapNestMarkerUi;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.buava.Optional;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FavoriteNestButton;
import co.bird.android.model.FlagNestButton;
import co.bird.android.model.NestAddressButton;
import co.bird.android.model.NestFlightSheetButton;
import co.bird.android.model.RefreshNestButton;
import co.bird.android.model.RemoveNestFavoriteButton;
import co.bird.android.model.UnflagNestButton;
import co.bird.android.model.constant.ClaimStatus;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.nestedstructures.ClaimDetails;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireNest;
import co.bird.android.model.wire.WireNestClaim;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import p000.C39360co3;
import p000.C41318g46;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001\u0012Bk\b\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020100\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010A\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u00040\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010C\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\b0\b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\"\u0010E\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u00040\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\"\u0010G\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u00040\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\"\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010P\u001a\u00020M*\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0018\u0010S\u001a\u00020\r*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006W"}, m28432d2 = {"Lco3;", "", "", "e", "", "o1", "", "Lco/bird/android/model/wire/WireNestClaim;", "", "claimId", "x1", "k0", "p1", "", "count", "w1", "v1", "Lco/bird/android/app/feature/map/ui/MapUi;", C17296a.f69688o, "Lco/bird/android/app/feature/map/ui/MapUi;", "mapUi", "Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;", "b", "Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;", "mapNestMarkerUi", "Lpo3;", "c", "Lpo3;", "ui", "Ls43;", DateTokenConverter.CONVERTER_KEY, "Ls43;", "nestManager", "Lg43;", "Lg43;", "nestMarkerManager", "Lom3;", "f", "Lom3;", "operatorManager", "LDQ3;", "g", "LDQ3;", "permissionManager", "Lot5;", "h", "Lot5;", "serverDrivenFilterManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "i", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LTq4;", "j", "LTq4;", "reactiveConfig", "Le13;", "k", "Le13;", "navigator", "Lma4;", "kotlin.jvm.PlatformType", "l", "Lma4;", "nestFlightSheetRefreshRelay", "m", "nestFlightSheetRelay", "n", "nestMarkerFetchRelay", "o", "renderNestClaimsRelay", "Ljava/util/concurrent/atomic/AtomicReference;", "p", "Ljava/util/concurrent/atomic/AtomicReference;", "nestClaims", "Lyu3;", "", "j0", "(Lyu3;)Z", "showNests", "i0", "(Lco/bird/android/model/wire/WireNestClaim;)I", "claimProgress", "<init>", "(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;Lpo3;Ls43;Lg43;Lom3;LDQ3;Lot5;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LTq4;Le13;)V", "q", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n180#2:620\n180#2:621\n180#2:622\n180#2:623\n180#2:625\n180#2:627\n180#2:629\n161#2:630\n180#2:632\n180#2:633\n237#2:635\n180#2:637\n180#2:638\n180#2:640\n180#2:642\n180#2:644\n180#2:645\n180#2:646\n199#2:647\n218#2:648\n233#3:624\n233#3:626\n233#3:628\n252#3:631\n271#3:634\n233#3:636\n233#3:639\n252#3:641\n233#3:643\n1#4:649\n819#5:650\n847#5,2:651\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n98#1:620\n107#1:621\n113#1:622\n127#1:623\n151#1:625\n161#1:627\n218#1:629\n255#1:630\n295#1:632\n328#1:633\n362#1:635\n394#1:637\n409#1:638\n453#1:640\n494#1:642\n513#1:644\n521#1:645\n543#1:646\n561#1:647\n584#1:648\n147#1:624\n159#1:626\n212#1:628\n283#1:631\n339#1:634\n368#1:636\n416#1:639\n470#1:641\n512#1:643\n616#1:650\n616#1:651,2\n*E\n"})
/* renamed from: co3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39360co3 {

    /* renamed from: q */
    public static final C16744a f68246q = new C16744a(null);

    /* renamed from: r */
    public static final int f68247r = 8;

    /* renamed from: s */
    public static final Set<EnumC52481yu3> f68248s;

    /* renamed from: a */
    public final MapUi f68249a;

    /* renamed from: b */
    public final MapNestMarkerUi f68250b;

    /* renamed from: c */
    public final InterfaceC47086po3 f68251c;

    /* renamed from: d */
    public final InterfaceC48430s43 f68252d;

    /* renamed from: e */
    public final InterfaceC41315g43 f68253e;

    /* renamed from: f */
    public final InterfaceC46473om3 f68254f;

    /* renamed from: g */
    public final DQ3 f68255g;

    /* renamed from: h */
    public final InterfaceC46545ot5 f68256h;

    /* renamed from: i */
    public final LifecycleScopeProvider<EnumC7097RE> f68257i;

    /* renamed from: j */
    public final C36207Tq4 f68258j;

    /* renamed from: k */
    public final InterfaceC40099e13 f68259k;

    /* renamed from: l */
    public final C45168ma4<Unit> f68260l;

    /* renamed from: m */
    public final C45168ma4<String> f68261m;

    /* renamed from: n */
    public final C45168ma4<Unit> f68262n;

    /* renamed from: o */
    public final C45168ma4<Unit> f68263o;

    /* renamed from: p */
    public AtomicReference<List<WireNestClaim>> f68264p;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "showNests", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$A */
    /* loaded from: classes2.dex */
    public static final class C16713A extends Lambda implements Function1<Boolean, Unit> {
        public C16713A() {
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
            C41318g46.m40153k("NestMarkers").mo7228a("Clearing Nest Markers", new Object[0]);
            C39360co3.this.f68250b.clearNestMarkers();
            C39360co3.this.f68251c.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lyu3;", "tab", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lyu3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$B */
    /* loaded from: classes2.dex */
    public static final class C16714B extends Lambda implements Function1<EnumC52481yu3, Boolean> {
        public C16714B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52481yu3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            return Boolean.valueOf(C39360co3.this.m53826j0(tab));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$C */
    /* loaded from: classes2.dex */
    public static final class C16715C extends Lambda implements Function1<LatLng, Unit> {
        public C16715C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            invoke2(latLng);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LatLng latLng) {
            C39360co3.this.f68262n.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$E */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16717E extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16717E(Object obj) {
            super(1, obj, C39360co3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39360co3) this.receiver).m53810o1(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$F */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16718F extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16718F f68269b = new C16718F();

        public C16718F() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", "nestFlightSheetDetails", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$G */
    /* loaded from: classes2.dex */
    public static final class C16719G extends Lambda implements Function1<NestFlightSheetDetails, Unit> {
        public C16719G() {
            super(1);
        }

        /* renamed from: a */
        public final void m53777a(NestFlightSheetDetails nestFlightSheetDetails) {
            ClaimStatus claimStatus;
            boolean z;
            InterfaceC47086po3 interfaceC47086po3 = C39360co3.this.f68251c;
            Intrinsics.checkNotNullExpressionValue(nestFlightSheetDetails, "nestFlightSheetDetails");
            interfaceC47086po3.mo18674ua(nestFlightSheetDetails);
            InterfaceC47086po3 interfaceC47086po32 = C39360co3.this.f68251c;
            ClaimDetails claimDetails = nestFlightSheetDetails.getClaimDetails();
            if (claimDetails != null) {
                claimStatus = claimDetails.getStatus();
            } else {
                claimStatus = null;
            }
            if (claimStatus == ClaimStatus.CLAIMED) {
                z = true;
            } else {
                z = false;
            }
            interfaceC47086po32.mo86401xd(new InterfaceC35450Qk3.C6852b(z, nestFlightSheetDetails.getNewClaimErrorMessage()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            m53777a(nestFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$H */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16720H extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<WireNest>> {
        public C16720H(Object obj) {
            super(1, obj, InterfaceC48430s43.class, "getNestById", "getNestById(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<WireNest> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC48430s43) this.receiver).mo10890k(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$I */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16721I extends FunctionReferenceImpl implements Function1<WireNest, Unit> {
        public C16721I(Object obj) {
            super(1, obj, MapNestMarkerUi.class, "setNestArea", "setNestArea(Lco/bird/android/model/wire/WireNest;)V", 0);
        }

        /* renamed from: a */
        public final void m53775a(WireNest wireNest) {
            ((MapNestMarkerUi) this.receiver).setNestArea(wireNest);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireNest wireNest) {
            m53775a(wireNest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", "nestFlightSheetDetails", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$J */
    /* loaded from: classes2.dex */
    public static final class C16722J extends Lambda implements Function1<NestFlightSheetDetails, Unit> {
        public C16722J() {
            super(1);
        }

        /* renamed from: a */
        public final void m53774a(NestFlightSheetDetails nestFlightSheetDetails) {
            String newClaimErrorMessage = nestFlightSheetDetails.getNewClaimErrorMessage();
            if (newClaimErrorMessage != null) {
                C39360co3.this.f68251c.mo18676nb(newClaimErrorMessage);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            m53774a(nestFlightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$K */
    /* loaded from: classes2.dex */
    public static final class C16723K extends Lambda implements Function1<LatLng, Unit> {

        /* renamed from: g */
        public static final C16723K f68272g = new C16723K();

        public C16723K() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LatLng latLng) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            invoke2(latLng);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$L */
    /* loaded from: classes2.dex */
    public static final class C16724L extends Lambda implements Function1<NestFlightSheetDetails, Boolean> {

        /* renamed from: g */
        public static final C16724L f68273g = new C16724L();

        public C16724L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            ClaimStatus claimStatus;
            boolean z;
            Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
            ClaimDetails claimDetails = nestFlightSheetDetails.getClaimDetails();
            if (claimDetails != null) {
                claimStatus = claimDetails.getStatus();
            } else {
                claimStatus = null;
            }
            if (claimStatus == ClaimStatus.NOT_CLAIMED && nestFlightSheetDetails.getNewClaimErrorMessage() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$41\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1#2:620\n*E\n"})
    /* renamed from: co3$M */
    /* loaded from: classes2.dex */
    public static final class C16725M extends Lambda implements Function1<NestFlightSheetDetails, InterfaceC24574u<? extends String>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$M$a */
        /* loaded from: classes2.dex */
        public static final class C16726a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C16726a f68275g = new C16726a();

            public C16726a() {
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

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$M$b */
        /* loaded from: classes2.dex */
        public static final class C16727b extends Lambda implements Function1<DialogResponse, String> {

            /* renamed from: g */
            public final /* synthetic */ NestFlightSheetDetails f68276g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16727b(NestFlightSheetDetails nestFlightSheetDetails) {
                super(1);
                this.f68276g = nestFlightSheetDetails;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f68276g.getNestId();
            }
        }

        public C16725M() {
            super(1);
        }

        /* renamed from: d */
        public static final String m53769d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends String> invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
            ClaimDetails claimDetails = nestFlightSheetDetails.getClaimDetails();
            if (claimDetails != null) {
                AbstractC23442F<DialogResponse> mo18682Pg = C39360co3.this.f68251c.mo18682Pg(claimDetails.getSpaces());
                if (mo18682Pg != null) {
                    final C16726a c16726a = C16726a.f68275g;
                    AbstractC24507p<DialogResponse> m33098z = mo18682Pg.m33098z(new InterfaceC23494q() { // from class: ho3
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj) {
                            boolean invoke$lambda$0;
                            invoke$lambda$0 = C39360co3.C16725M.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                    if (m33098z != null) {
                        final C16727b c16727b = new C16727b(nestFlightSheetDetails);
                        InterfaceC24574u m32067H = m33098z.m32067H(new InterfaceC23492o() { // from class: io3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                String m53769d;
                                m53769d = C39360co3.C16725M.m53769d(Function1.this, obj);
                                return m53769d;
                            }
                        });
                        if (m32067H != null) {
                            return m32067H;
                        }
                    }
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$N */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16728N extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<WireNestClaim>> {
        public C16728N(Object obj) {
            super(1, obj, InterfaceC48430s43.class, "claimNest", "claimNest(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<WireNestClaim> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC48430s43) this.receiver).mo10897d(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$43\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1#2:620\n*E\n"})
    /* renamed from: co3$O */
    /* loaded from: classes2.dex */
    public static final class C16729O extends Lambda implements Function1<Throwable, Unit> {
        public C16729O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C49375tg1 c49375tg1;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            Throwable m87362c = R36.m87362c(e);
            Unit unit = null;
            RetrofitException retrofitException = m87362c instanceof RetrofitException ? (RetrofitException) m87362c : null;
            String m11932c = (retrofitException == null || (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) == null) ? null : c49375tg1.m11932c();
            if (m11932c != null) {
                C39360co3.this.f68251c.mo18675u4(m11932c);
                return;
            }
            HttpException httpException = m87362c instanceof HttpException ? (HttpException) m87362c : null;
            if (httpException != null) {
                C39360co3.this.f68251c.error(httpException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C39360co3.this.f68251c.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0005*8\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/NestMarker;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$P */
    /* loaded from: classes2.dex */
    public static final class C16730P extends Lambda implements Function1<Pair<? extends WireNestClaim, ? extends Pair<? extends NestMarker, ? extends Boolean>>, Unit> {
        public C16730P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireNestClaim, ? extends Pair<? extends NestMarker, ? extends Boolean>> pair) {
            invoke2((Pair<WireNestClaim, Pair<NestMarker, Boolean>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireNestClaim, Pair<NestMarker, Boolean>> pair) {
            List plus;
            WireNestClaim claim = pair.component1();
            Pair<NestMarker, Boolean> component2 = pair.component2();
            AtomicReference atomicReference = C39360co3.this.f68264p;
            Object obj = C39360co3.this.f68264p.get();
            Intrinsics.checkNotNullExpressionValue(obj, "nestClaims.get()");
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireNestClaim>) ((Collection<? extends Object>) obj), claim);
            atomicReference.set(plus);
            C39360co3 c39360co3 = C39360co3.this;
            Intrinsics.checkNotNullExpressionValue(claim, "claim");
            C39360co3.this.f68250b.claim(component2.getFirst(), c39360co3.m53829i0(claim));
            C39360co3.this.f68251c.mo18673vd(claim.getSpacesClaimed(), claim.getTotalDurationMinutes(), claim.getExpiresAt());
            C39360co3.this.f68251c.mo86401xd(new InterfaceC35450Qk3.C6852b(true, null));
            C39360co3.this.f68261m.accept(component2.getFirst().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$Q */
    /* loaded from: classes2.dex */
    public static final class C16731Q extends Lambda implements Function1<Config, Integer> {

        /* renamed from: g */
        public static final C16731Q f68279g = new C16731Q();

        public C16731Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Integer.valueOf(config.getOperatorConfig().getFeatures().getNestClaims().getClaimCooldownMinutes());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$S */
    /* loaded from: classes2.dex */
    public static final class C16733S extends Lambda implements Function1<Pair<? extends NestFlightSheetDetails, ? extends Integer>, InterfaceC24574u<? extends NestFlightSheetDetails>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$S$a */
        /* loaded from: classes2.dex */
        public static final class C16734a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C16734a f68282g = new C16734a();

            public C16734a() {
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

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/persistence/NestFlightSheetDetails;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$S$b */
        /* loaded from: classes2.dex */
        public static final class C16735b extends Lambda implements Function1<DialogResponse, NestFlightSheetDetails> {

            /* renamed from: g */
            public final /* synthetic */ NestFlightSheetDetails f68283g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16735b(NestFlightSheetDetails nestFlightSheetDetails) {
                super(1);
                this.f68283g = nestFlightSheetDetails;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final NestFlightSheetDetails invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f68283g;
            }
        }

        public C16733S() {
            super(1);
        }

        /* renamed from: d */
        public static final NestFlightSheetDetails m53761d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (NestFlightSheetDetails) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends NestFlightSheetDetails> invoke(Pair<NestFlightSheetDetails, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Integer claimCooldownMinutes = pair.component2();
            InterfaceC47086po3 interfaceC47086po3 = C39360co3.this.f68251c;
            Intrinsics.checkNotNullExpressionValue(claimCooldownMinutes, "claimCooldownMinutes");
            AbstractC23442F<DialogResponse> mo18677lh = interfaceC47086po3.mo18677lh(claimCooldownMinutes.intValue());
            final C16734a c16734a = C16734a.f68282g;
            AbstractC24507p<DialogResponse> m33098z = mo18677lh.m33098z(new InterfaceC23494q() { // from class: jo3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C39360co3.C16733S.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C16735b c16735b = new C16735b(pair.component1());
            return m33098z.m32067H(new InterfaceC23492o() { // from class: ko3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    NestFlightSheetDetails m53761d;
                    m53761d = C39360co3.C16733S.m53761d(Function1.this, obj);
                    return m53761d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$49\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1#2:620\n*E\n"})
    /* renamed from: co3$T */
    /* loaded from: classes2.dex */
    public static final class C16736T extends Lambda implements Function1<NestFlightSheetDetails, InterfaceC23447K<? extends String>> {
        public C16736T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends String> invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            String str;
            AbstractC23461c mo10888m;
            AbstractC23442F m33042m;
            Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
            ClaimDetails claimDetails = nestFlightSheetDetails.getClaimDetails();
            if (claimDetails != null) {
                str = claimDetails.getClaimId();
            } else {
                str = null;
            }
            if (str == null || (mo10888m = C39360co3.this.f68252d.mo10888m(str)) == null || (m33042m = mo10888m.m33042m(AbstractC23442F.m33158H(str))) == null) {
                String nestId = nestFlightSheetDetails.getNestId();
                return AbstractC23442F.m33100x(new IllegalArgumentException("No claim found for nest: " + nestId));
            }
            return m33042m;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$U */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16737U extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16737U f68285b = new C16737U();

        public C16737U() {
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
    /* renamed from: co3$V */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16738V extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16738V(Object obj) {
            super(1, obj, C39360co3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39360co3) this.receiver).m53810o1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0005*8\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/NestMarker;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$W */
    /* loaded from: classes2.dex */
    public static final class C16739W extends Lambda implements Function1<Pair<? extends String, ? extends Pair<? extends NestMarker, ? extends Boolean>>, Unit> {
        public C16739W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends Pair<? extends NestMarker, ? extends Boolean>> pair) {
            invoke2((Pair<String, Pair<NestMarker, Boolean>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, Pair<NestMarker, Boolean>> pair) {
            String expiredClaimId = pair.component1();
            Pair<NestMarker, Boolean> component2 = pair.component2();
            AtomicReference atomicReference = C39360co3.this.f68264p;
            C39360co3 c39360co3 = C39360co3.this;
            Object obj = c39360co3.f68264p.get();
            Intrinsics.checkNotNullExpressionValue(obj, "nestClaims.get()");
            Intrinsics.checkNotNullExpressionValue(expiredClaimId, "expiredClaimId");
            atomicReference.set(c39360co3.m53783x1((List) obj, expiredClaimId));
            C39360co3.this.f68250b.unclaim(component2.getFirst());
            C39360co3.this.f68251c.mo86401xd(new InterfaceC35450Qk3.C6852b(false, null));
            C39360co3.this.f68261m.accept(component2.getFirst().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LFQ3;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$X */
    /* loaded from: classes2.dex */
    public static final class C16740X extends Lambda implements Function1<Unit, InterfaceC24574u<? extends FQ3>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$X$a */
        /* loaded from: classes2.dex */
        public static final class C16741a extends Lambda implements Function1<FQ3, Boolean> {

            /* renamed from: g */
            public static final C16741a f68288g = new C16741a();

            public C16741a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(FQ3 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return Boolean.valueOf(response.m107154a());
            }
        }

        public C16740X() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<FQ3> m110485l = C39360co3.this.f68255g.m110485l(Permission.CAMERA);
            final C16741a c16741a = C16741a.f68288g;
            return m110485l.m33098z(new InterfaceC23494q() { // from class: lo3
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C39360co3.C16740X.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "nestId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$Y */
    /* loaded from: classes2.dex */
    public static final class C16742Y extends Lambda implements Function1<String, Unit> {
        public C16742Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            InterfaceC40099e13.C19924a.goToNestRelease$default(C39360co3.this.f68259k, str, null, 10067, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enableNests", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$Z */
    /* loaded from: classes2.dex */
    public static final class C16743Z extends Lambda implements Function1<Boolean, Unit> {
        public C16743Z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enableNests) {
            InterfaceC47086po3 interfaceC47086po3 = C39360co3.this.f68251c;
            Intrinsics.checkNotNullExpressionValue(enableNests, "enableNests");
            interfaceC47086po3.mo146mc(enableNests.booleanValue());
            if (enableNests.booleanValue()) {
                return;
            }
            C39360co3.this.f68251c.mo147Be(EnumC52481yu3.ALL);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lco3$a;", "", "", "Lyu3;", "SHOW_NEST_TABS", "Ljava/util/Set;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co3$a */
    /* loaded from: classes2.dex */
    public static final class C16744a {
        public /* synthetic */ C16744a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16744a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n149#2:305\n*E\n"})
    /* renamed from: co3$b */
    /* loaded from: classes2.dex */
    public static final class C16746b<T1, T2, R> implements InterfaceC23480c<LatLng, Boolean, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(LatLng latLng, Boolean bool) {
            return (R) bool;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "closeFlightSheet", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$b0 */
    /* loaded from: classes2.dex */
    public static final class C16747b0 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C16747b0 f68292g = new C16747b0();

        public C16747b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean closeFlightSheet) {
            Intrinsics.checkNotNullParameter(closeFlightSheet, "closeFlightSheet");
            return closeFlightSheet;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n159#2:305\n*E\n"})
    /* renamed from: co3$c */
    /* loaded from: classes2.dex */
    public static final class C16748c<T1, T2, R> implements InterfaceC23480c<Boolean, Pair<? extends NestMarker, ? extends Boolean>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Boolean bool, Pair<? extends NestMarker, ? extends Boolean> pair) {
            return (R) pair;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$c0 */
    /* loaded from: classes2.dex */
    public static final class C16749c0 extends Lambda implements Function1<Boolean, Unit> {
        public C16749c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C39360co3.this.f68251c.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n212#2,2:305\n*E\n"})
    /* renamed from: co3$d */
    /* loaded from: classes2.dex */
    public static final class C16750d<T1, T2, R> implements InterfaceC23480c<NestFlightSheetButton, Pair<? extends NestMarker, ? extends Boolean>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(NestFlightSheetButton nestFlightSheetButton, Pair<? extends NestMarker, ? extends Boolean> pair) {
            return (R) TuplesKt.m28425to(nestFlightSheetButton, pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$d0 */
    /* loaded from: classes2.dex */
    public static final class C16751d0 extends Lambda implements Function1<List<? extends OperatorFilter>, Unit> {
        public C16751d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> list) {
            C39360co3.this.f68262n.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n287#2,5:305\n*E\n"})
    /* renamed from: co3$e */
    /* loaded from: classes2.dex */
    public static final class C16752e<T1, T2, T3, R> implements InterfaceC23485h<Pair<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>>, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Pair<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>> pair, T1 t1, T2 t2) {
            Optional optional = (Optional) t1;
            Pair<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>> pair2 = pair;
            List<? extends WireNestClaim> component1 = pair2.component1();
            List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>> component2 = pair2.component2();
            if (!((Boolean) t2).booleanValue()) {
                optional = Optional.f63040c.m59034a();
            }
            return (R) new Triple(component1, component2, optional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestMarker;", "", "lastTwoItems", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$e0 */
    /* loaded from: classes2.dex */
    public static final class C16753e0 extends Lambda implements Function1<List<? extends Pair<? extends NestMarker, ? extends Boolean>>, List<? extends Pair<? extends NestMarker, ? extends Boolean>>> {

        /* renamed from: g */
        public static final C16753e0 f68295g = new C16753e0();

        public C16753e0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Pair<NestMarker, Boolean>> invoke(List<Pair<NestMarker, Boolean>> lastTwoItems) {
            List<Pair<NestMarker, Boolean>> listOf;
            Intrinsics.checkNotNullParameter(lastTwoItems, "lastTwoItems");
            if (lastTwoItems.size() != 1) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{lastTwoItems.get(1), lastTwoItems.get(0)});
                return listOf;
            }
            return lastTwoItems;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n344#2:305\n*E\n"})
    /* renamed from: co3$f */
    /* loaded from: classes2.dex */
    public static final class C16754f<T1, T2, T3, T4, R> implements InterfaceC23486i<Unit, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            LatLng latLng = (LatLng) t2;
            return (R) new Triple(C52473yt5.m2323c((List) t1), latLng, (Boolean) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "clickedItems", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$f0 */
    /* loaded from: classes2.dex */
    public static final class C16755f0 extends Lambda implements Function1<List<? extends Pair<? extends NestMarker, ? extends Boolean>>, Unit> {
        public C16755f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends NestMarker, ? extends Boolean>> list) {
            invoke2((List<Pair<NestMarker, Boolean>>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Pair<NestMarker, Boolean>> clickedItems) {
            Object orNull;
            Pair<NestMarker, Boolean> pair = clickedItems.get(0);
            NestMarker component1 = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            Intrinsics.checkNotNullExpressionValue(clickedItems, "clickedItems");
            orNull = CollectionsKt___CollectionsKt.getOrNull(clickedItems, 1);
            Pair pair2 = (Pair) orNull;
            NestMarker nestMarker = pair2 != null ? (NestMarker) pair2.getFirst() : null;
            if (nestMarker != null && !Intrinsics.areEqual(nestMarker.getId(), component1.getId())) {
                C39360co3.this.f68250b.deselect(nestMarker);
            }
            if (!booleanValue || Intrinsics.areEqual(nestMarker, component1)) {
                C39360co3.this.f68250b.select(component1);
                C39360co3.this.f68261m.accept(component1.getId());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n368#2:305\n*E\n"})
    /* renamed from: co3$g */
    /* loaded from: classes2.dex */
    public static final class C16756g<T1, T2, R> implements InterfaceC23480c<Unit, String, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, String str) {
            return (R) str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "bottomSheetVisible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$g0 */
    /* loaded from: classes2.dex */
    public static final class C16757g0 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C16757g0 f68297g = new C16757g0();

        public C16757g0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bottomSheetVisible) {
            Intrinsics.checkNotNullParameter(bottomSheetVisible, "bottomSheetVisible");
            return bottomSheetVisible;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n416#2:305\n*E\n"})
    /* renamed from: co3$h */
    /* loaded from: classes2.dex */
    public static final class C16758h<T1, T2, R> implements InterfaceC23480c<Unit, NestFlightSheetDetails, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, NestFlightSheetDetails nestFlightSheetDetails) {
            return (R) nestFlightSheetDetails;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "nestId", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$h0 */
    /* loaded from: classes2.dex */
    public static final class C16759h0 extends Lambda implements Function1<String, InterfaceC23434B<? extends NestFlightSheetDetails>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$h0$a */
        /* loaded from: classes2.dex */
        public static final class C16760a extends Lambda implements Function1<NestFlightSheetDetails, InterfaceC23434B<Unit>> {

            /* renamed from: g */
            public static final C16760a f68299g = new C16760a();

            public C16760a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<Unit> invoke(NestFlightSheetDetails it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.never();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co3$h0$b */
        /* loaded from: classes2.dex */
        public static final class C16761b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39360co3 f68300g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16761b(C39360co3 c39360co3) {
                super(1);
                this.f68300g = c39360co3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th instanceof TimeoutException) {
                    this.f68300g.f68251c.mo89356La();
                }
            }
        }

        public C16759h0() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23434B m53750d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m53749e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23434B<? extends NestFlightSheetDetails> invoke(String nestId) {
            Intrinsics.checkNotNullParameter(nestId, "nestId");
            Observable<NestFlightSheetDetails> observeOn = C39360co3.this.f68254f.mo8134S(nestId).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
            Observable<Long> timer = Observable.timer(50L, TimeUnit.MILLISECONDS);
            final C16760a c16760a = C16760a.f68299g;
            Observable<NestFlightSheetDetails> timeout = observeOn.timeout(timer, new InterfaceC23492o() { // from class: mo3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m53750d;
                    m53750d = C39360co3.C16759h0.m53750d(Function1.this, obj);
                    return m53750d;
                }
            });
            final C16761b c16761b = new C16761b(C39360co3.this);
            return Observable.merge(timeout.doOnError(new InterfaceC23484g() { // from class: no3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39360co3.C16759h0.m53749e(Function1.this, obj);
                }
            }).onErrorResumeNext(C39360co3.this.f68254f.mo8134S(nestId)), C39360co3.this.f68254f.mo8149G0(nestId).m33043l(C39360co3.this.f68254f.mo8134S(nestId)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n473#2:305\n*E\n"})
    /* renamed from: co3$i */
    /* loaded from: classes2.dex */
    public static final class C16762i<T1, T2, T3, R> implements InterfaceC23485h<Unit, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Unit unit, T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to((NestFlightSheetDetails) t1, (Integer) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lyu3;", "tab", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lyu3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$i0 */
    /* loaded from: classes2.dex */
    public static final class C16763i0 extends Lambda implements Function1<EnumC52481yu3, Boolean> {
        public C16763i0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52481yu3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            return Boolean.valueOf(C39360co3.this.m53826j0(tab));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter\n*L\n1#1,304:1\n512#2:305\n*E\n"})
    /* renamed from: co3$j */
    /* loaded from: classes2.dex */
    public static final class C16764j<T1, T2, R> implements InterfaceC23480c<FQ3, String, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(FQ3 fq3, String str) {
            return (R) str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "zoomLevel", "", "zonesEnabled", "", "zoomPinThreshold", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Ljava/lang/Boolean;Ljava/lang/Double;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$j0 */
    /* loaded from: classes2.dex */
    public static final class C16765j0 extends Lambda implements Function3<Optional<Float>, Boolean, Double, Boolean> {

        /* renamed from: g */
        public static final C16765j0 f68302g = new C16765j0();

        public C16765j0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Boolean invoke(Optional<Float> zoomLevel, Boolean zonesEnabled, Double zoomPinThreshold) {
            boolean z;
            float f;
            Intrinsics.checkNotNullParameter(zoomLevel, "zoomLevel");
            Intrinsics.checkNotNullParameter(zonesEnabled, "zonesEnabled");
            Intrinsics.checkNotNullParameter(zoomPinThreshold, "zoomPinThreshold");
            if (zonesEnabled.booleanValue()) {
                Float m59035e = zoomLevel.m59035e();
                if (m59035e != null) {
                    f = m59035e.floatValue();
                } else {
                    f = 0.0f;
                }
                if (f < zoomPinThreshold.doubleValue()) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$k */
    /* loaded from: classes2.dex */
    public static final class C16766k extends Lambda implements Function1<Boolean, Unit> {
        public C16766k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C39360co3.this.f68251c.mo89347U2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "nestsEnabled", "nestZoomLevel", C17296a.f69688o, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$k0 */
    /* loaded from: classes2.dex */
    public static final class C16767k0 extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: g */
        public static final C16767k0 f68304g = new C16767k0();

        public C16767k0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Boolean nestsEnabled, Boolean nestZoomLevel) {
            boolean z;
            Intrinsics.checkNotNullParameter(nestsEnabled, "nestsEnabled");
            Intrinsics.checkNotNullParameter(nestZoomLevel, "nestZoomLevel");
            if (nestsEnabled.booleanValue() && nestZoomLevel.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "visible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$l */
    /* loaded from: classes2.dex */
    public static final class C16768l extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C16768l f68305g = new C16768l();

        public C16768l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean visible) {
            Intrinsics.checkNotNullParameter(visible, "visible");
            return Boolean.valueOf(!visible.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$l0 */
    /* loaded from: classes2.dex */
    public static final class C16769l0 extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C16769l0 f68306g = new C16769l0();

        public C16769l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("NestMarkers");
            m40153k.mo7228a("Show Nest Markers: " + bool, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$m */
    /* loaded from: classes2.dex */
    public static final class C16770m extends Lambda implements Function1<Pair<? extends NestMarker, ? extends Boolean>, Unit> {
        public C16770m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends NestMarker, ? extends Boolean> pair) {
            invoke2((Pair<NestMarker, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<NestMarker, Boolean> pair) {
            pair.component2().booleanValue();
            C39360co3.this.f68251c.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
            C39360co3.this.f68250b.setNestArea(null);
            C39360co3.this.f68250b.deselect(pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "enabled", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$m0 */
    /* loaded from: classes2.dex */
    public static final class C16771m0 extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends List<? extends WireNestClaim>>> {
        public C16771m0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireNestClaim>> invoke(Boolean enabled) {
            List emptyList;
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            if (enabled.booleanValue()) {
                return C39360co3.this.f68252d.mo10893h();
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            AbstractC23442F m33158H = AbstractC23442F.m33158H(emptyList);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(emptyList())");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NestFlightSheetButton;", "button", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "e", "(Lco/bird/android/model/NestFlightSheetButton;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n1549#2:620\n1620#2,3:621\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$14\n*L\n184#1:620\n184#1:621,3\n*E\n"})
    /* renamed from: co3$n */
    /* loaded from: classes2.dex */
    public static final class C16772n extends Lambda implements Function1<NestFlightSheetButton, InterfaceC23447K<? extends NestFlightSheetButton>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/UnflagNestButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/UnflagNestButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$n$a */
        /* loaded from: classes2.dex */
        public static final class C16773a extends Lambda implements Function1<UnflagNestButton, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39360co3 f68310g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16773a(C39360co3 c39360co3) {
                super(1);
                this.f68310g = c39360co3;
            }

            /* renamed from: a */
            public final void m53735a(UnflagNestButton unflagNestButton) {
                C45168ma4 c45168ma4 = this.f68310g.f68260l;
                Unit unit = Unit.INSTANCE;
                c45168ma4.accept(unit);
                this.f68310g.f68262n.accept(unit);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UnflagNestButton unflagNestButton) {
                m53735a(unflagNestButton);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "partnerIds", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$n$b */
        /* loaded from: classes2.dex */
        public static final class C16774b extends Lambda implements Function1<List<? extends String>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C39360co3 f68311g;

            /* renamed from: h */
            public final /* synthetic */ NestFlightSheetButton f68312h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16774b(C39360co3 c39360co3, NestFlightSheetButton nestFlightSheetButton) {
                super(1);
                this.f68311g = c39360co3;
                this.f68312h = nestFlightSheetButton;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(List<String> partnerIds) {
                Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
                return this.f68311g.f68252d.mo10892i(((FavoriteNestButton) this.f68312h).getNestId(), partnerIds);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RemoveNestFavoriteButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RemoveNestFavoriteButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co3$n$c */
        /* loaded from: classes2.dex */
        public static final class C16775c extends Lambda implements Function1<RemoveNestFavoriteButton, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39360co3 f68313g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16775c(C39360co3 c39360co3) {
                super(1);
                this.f68313g = c39360co3;
            }

            /* renamed from: a */
            public final void m53733a(RemoveNestFavoriteButton removeNestFavoriteButton) {
                C45168ma4 c45168ma4 = this.f68313g.f68260l;
                Unit unit = Unit.INSTANCE;
                c45168ma4.accept(unit);
                this.f68313g.f68262n.accept(unit);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RemoveNestFavoriteButton removeNestFavoriteButton) {
                m53733a(removeNestFavoriteButton);
                return Unit.INSTANCE;
            }
        }

        public C16772n() {
            super(1);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m53738f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m53737g(C39360co3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C45168ma4 c45168ma4 = this$0.f68260l;
            Unit unit = Unit.INSTANCE;
            c45168ma4.accept(unit);
            this$0.f68262n.accept(unit);
        }

        /* renamed from: h */
        public static final void m53736h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23447K<? extends NestFlightSheetButton> invoke(NestFlightSheetButton button) {
            AbstractC23461c m33029z;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(button, "button");
            if (button instanceof UnflagNestButton) {
                AbstractC23442F m33042m = C39360co3.this.f68252d.mo10891j(((UnflagNestButton) button).getNestId()).m33042m(AbstractC23442F.m33158H(button));
                final C16773a c16773a = new C16773a(C39360co3.this);
                AbstractC23442F m33101w = m33042m.m33101w(new InterfaceC23484g() { // from class: do3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39360co3.C16772n.invoke$lambda$0(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33101w, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
                return m33101w;
            } else if (button instanceof FavoriteNestButton) {
                FavoriteNestButton favoriteNestButton = (FavoriteNestButton) button;
                if (favoriteNestButton.getAvailableFavoritePartners().size() == 1) {
                    InterfaceC48430s43 interfaceC48430s43 = C39360co3.this.f68252d;
                    String nestId = favoriteNestButton.getNestId();
                    List<NestFavoritePartner> availableFavoritePartners = favoriteNestButton.getAvailableFavoritePartners();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(availableFavoritePartners, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (NestFavoritePartner nestFavoritePartner : availableFavoritePartners) {
                        arrayList.add(nestFavoritePartner.getPartnerId());
                    }
                    m33029z = interfaceC48430s43.mo10892i(nestId, arrayList);
                } else {
                    AbstractC23442F<List<String>> m33142Y = C39360co3.this.f68251c.mo18681Qj(favoriteNestButton.getNestId()).m33142Y(C23454a.m33087a());
                    final C16774b c16774b = new C16774b(C39360co3.this, button);
                    AbstractC23461c m33164B = m33142Y.m33164B(new InterfaceC23492o() { // from class: eo3
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m53738f;
                            m53738f = C39360co3.C16772n.m53738f(Function1.this, obj);
                            return m53738f;
                        }
                    });
                    final C39360co3 c39360co3 = C39360co3.this;
                    m33029z = m33164B.m33029z(new InterfaceC23478a() { // from class: fo3
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            C39360co3.C16772n.m53737g(C39360co3.this);
                        }
                    });
                }
                AbstractC23442F m33042m2 = m33029z.m33042m(AbstractC23442F.m33158H(button));
                Intrinsics.checkNotNullExpressionValue(m33042m2, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
                return m33042m2;
            } else if (button instanceof RemoveNestFavoriteButton) {
                AbstractC23442F m33042m3 = C39360co3.this.f68252d.mo10900a(((RemoveNestFavoriteButton) button).getNestId()).m33042m(AbstractC23442F.m33158H(button));
                final C16775c c16775c = new C16775c(C39360co3.this);
                AbstractC23442F m33101w2 = m33042m3.m33101w(new InterfaceC23484g() { // from class: go3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39360co3.C16772n.m53736h(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33101w2, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
                return m33101w2;
            } else {
                AbstractC23442F m33158H = AbstractC23442F.m33158H(button);
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(button)");
                return m33158H;
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$n0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16776n0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16776n0(Object obj) {
            super(1, obj, C39360co3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39360co3) this.receiver).m53810o1(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$o */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16777o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C16777o(Object obj) {
            super(1, obj, C39360co3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39360co3) this.receiver).m53810o1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "activeClaims", "", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onResume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n1549#2:620\n1620#2,3:621\n766#2:624\n857#2,2:625\n1549#2:627\n1620#2,3:628\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onResume$3\n*L\n567#1:620\n567#1:621,3\n569#1:624\n569#1:625,2\n570#1:627\n570#1:628,3\n*E\n"})
    /* renamed from: co3$o0 */
    /* loaded from: classes2.dex */
    public static final class C16778o0 extends Lambda implements Function1<List<? extends WireNestClaim>, Unit> {
        public C16778o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireNestClaim> list) {
            invoke2((List<WireNestClaim>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireNestClaim> activeClaims) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List plus;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(activeClaims, "activeClaims");
            List<WireNestClaim> list = activeClaims;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestClaim wireNestClaim : list) {
                arrayList.add(wireNestClaim.getId());
            }
            List currentNestClaims = (List) C39360co3.this.f68264p.get();
            Intrinsics.checkNotNullExpressionValue(currentNestClaims, "currentNestClaims");
            ArrayList<WireNestClaim> arrayList2 = new ArrayList();
            for (Object obj : currentNestClaims) {
                if (!arrayList.contains(((WireNestClaim) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (WireNestClaim wireNestClaim2 : arrayList2) {
                Intrinsics.checkNotNullExpressionValue(now, "now");
                arrayList3.add(WireNestClaim.copy$default(wireNestClaim2, null, null, 0, 0, now, 15, null));
            }
            AtomicReference atomicReference = C39360co3.this.f68264p;
            plus = CollectionsKt___CollectionsKt.plus((Collection) activeClaims, (Iterable) arrayList3);
            atomicReference.set(plus);
            C39360co3.this.f68263o.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/NestFlightSheetButton;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/NestMarker;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$p */
    /* loaded from: classes2.dex */
    public static final class C16779p extends Lambda implements Function1<Pair<? extends NestFlightSheetButton, ? extends NestMarker>, Unit> {
        public C16779p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends NestFlightSheetButton, ? extends NestMarker> pair) {
            invoke2((Pair<? extends NestFlightSheetButton, NestMarker>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends NestFlightSheetButton, NestMarker> pair) {
            NestFlightSheetButton component1 = pair.component1();
            NestMarker component2 = pair.component2();
            if (component1 instanceof NestAddressButton) {
                C39360co3.this.f68259k.mo37162H(new Geolocation(component2.getLocation().getLatitude(), component2.getLocation().getLongitude(), null, null, null, null, false, null, null, 508, null));
            } else if (component1 instanceof FlagNestButton) {
                C39360co3.this.f68259k.mo37046c(((FlagNestButton) component1).getNestId(), 10068);
            } else if (component1 instanceof RefreshNestButton) {
                C39360co3.this.f68261m.accept(((RefreshNestButton) component1).getNestId());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "bottomSheetVisible", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$p0 */
    /* loaded from: classes2.dex */
    public static final class C16780p0 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C16780p0 f68316g = new C16780p0();

        public C16780p0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bottomSheetVisible) {
            Intrinsics.checkNotNullParameter(bottomSheetVisible, "bottomSheetVisible");
            return bottomSheetVisible;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/NestMarker;", "markers", "", "showNests", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$q */
    /* loaded from: classes2.dex */
    public static final class C16781q extends Lambda implements Function2<List<? extends NestMarker>, Boolean, Pair<? extends List<? extends NestMarker>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C16781q f68317g = new C16781q();

        public C16781q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<List<NestMarker>, Boolean> invoke(List<NestMarker> markers, Boolean showNests) {
            Intrinsics.checkNotNullParameter(markers, "markers");
            Intrinsics.checkNotNullParameter(showNests, "showNests");
            return TuplesKt.m28425to(markers, showNests);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$q0 */
    /* loaded from: classes2.dex */
    public static final class C16782q0 extends Lambda implements Function1<Boolean, Unit> {
        public C16782q0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C39360co3.this.f68260l.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/NestMarker;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$r */
    /* loaded from: classes2.dex */
    public static final class C16783r extends Lambda implements Function1<Pair<? extends List<? extends NestMarker>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C16783r f68319g = new C16783r();

        public C16783r() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<NestMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean showNests = pair.component2();
            Intrinsics.checkNotNullExpressionValue(showNests, "showNests");
            return showNests;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends NestMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<NestMarker>, Boolean>) pair);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$s */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16784s extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C16784s(Object obj) {
            super(1, obj, InterfaceC47086po3.class, "showClaimButton", "showClaimButton(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC47086po3) this.receiver).mo18679ce(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/NestMarker;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$t */
    /* loaded from: classes2.dex */
    public static final class C16785t extends Lambda implements Function1<Pair<? extends List<? extends NestMarker>, ? extends Boolean>, List<? extends NestMarker>> {

        /* renamed from: g */
        public static final C16785t f68320g = new C16785t();

        public C16785t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends NestMarker> invoke(Pair<? extends List<? extends NestMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<NestMarker>, Boolean>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<NestMarker> invoke2(Pair<? extends List<NestMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/NestMarker;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$u */
    /* loaded from: classes2.dex */
    public static final class C16786u extends Lambda implements Function1<List<? extends NestMarker>, Unit> {

        /* renamed from: g */
        public static final C16786u f68321g = new C16786u();

        public C16786u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends NestMarker> list) {
            invoke2((List<NestMarker>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<NestMarker> list) {
            C41318g46.m40153k("NestMarkers").mo7228a("Setting Nest Markers", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$v */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16787v extends FunctionReferenceImpl implements Function1<List<? extends NestMarker>, Unit> {
        public C16787v(Object obj) {
            super(1, obj, MapNestMarkerUi.class, "setNestMarkers", "setNestMarkers(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends NestMarker> list) {
            invoke2((List<NestMarker>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<NestMarker> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MapNestMarkerUi) this.receiver).setNestMarkers(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "", "Lco/bird/android/model/persistence/NestMarker;", "nestMarkers", C17296a.f69688o, "(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$w */
    /* loaded from: classes2.dex */
    public static final class C16788w extends Lambda implements Function2<Object, List<? extends NestMarker>, List<? extends NestMarker>> {

        /* renamed from: g */
        public static final C16788w f68322g = new C16788w();

        public C16788w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<NestMarker> invoke(Object obj, List<NestMarker> nestMarkers) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(nestMarkers, "nestMarkers");
            return nestMarkers;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001an\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0000 \u0005*6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/NestMarker;", "nestMarkers", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$24\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1603#2,9:620\n1855#2:629\n288#2,2:630\n1856#2:633\n1612#2:634\n1#3:632\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$24\n*L\n276#1:620,9\n276#1:629\n277#1:630,2\n276#1:633\n276#1:634\n276#1:632\n*E\n"})
    /* renamed from: co3$x */
    /* loaded from: classes2.dex */
    public static final class C16789x extends Lambda implements Function1<List<? extends NestMarker>, Pair<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>>> {
        public C16789x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<WireNestClaim>, List<Pair<WireNestClaim, NestMarker>>> invoke(List<NestMarker> nestMarkers) {
            Pair pair;
            Object obj;
            Intrinsics.checkNotNullParameter(nestMarkers, "nestMarkers");
            List<WireNestClaim> nestClaims = (List) C39360co3.this.f68264p.get();
            Intrinsics.checkNotNullExpressionValue(nestClaims, "nestClaims");
            ArrayList arrayList = new ArrayList();
            for (WireNestClaim wireNestClaim : nestClaims) {
                Iterator<T> it = nestMarkers.iterator();
                while (true) {
                    pair = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((NestMarker) obj).getId(), wireNestClaim.getNestId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NestMarker nestMarker = (NestMarker) obj;
                if (nestMarker != null) {
                    pair = TuplesKt.m28425to(wireNestClaim, nestMarker);
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return TuplesKt.m28425to(nestClaims, arrayList);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$y */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C16790y extends FunctionReferenceImpl implements Function1<String, Optional<String>> {

        /* renamed from: b */
        public static final C16790y f68324b = new C16790y();

        public C16790y() {
            super(1, Optional.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(String str) {
            return new Optional<>(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2§\u0001\u0010\b\u001a¢\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003*P\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestMarker;", "Lco/bird/android/buava/Optional;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$27\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n1855#2,2:620\n1747#2,3:622\n766#2:625\n857#2,2:626\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$27\n*L\n299#1:620,2\n313#1:622,3\n319#1:625\n319#1:626,2\n*E\n"})
    /* renamed from: co3$z */
    /* loaded from: classes2.dex */
    public static final class C16791z extends Lambda implements Function1<Triple<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>, ? extends Optional<String>>, Unit> {
        public C16791z() {
            super(1);
        }

        /* renamed from: a */
        public final void m53728a(Triple<? extends List<WireNestClaim>, ? extends List<Pair<WireNestClaim, NestMarker>>, Optional<String>> triple) {
            boolean z;
            boolean z2;
            boolean z3;
            List<WireNestClaim> nestClaims = triple.component1();
            Optional<String> component3 = triple.component3();
            DateTime now = DateTime.now();
            C39360co3 c39360co3 = C39360co3.this;
            Iterator<T> it = triple.component2().iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                WireNestClaim wireNestClaim = (WireNestClaim) pair.component1();
                NestMarker nestMarker = (NestMarker) pair.component2();
                if (wireNestClaim.getExpiresAt().compareTo((ReadableInstant) now) < 0) {
                    c39360co3.f68250b.unclaim(nestMarker);
                } else {
                    c39360co3.f68250b.claim(nestMarker, c39360co3.m53829i0(wireNestClaim));
                }
            }
            if (nestClaims.isEmpty()) {
                return;
            }
            String m59035e = component3.m59035e();
            if (m59035e != null) {
                C39360co3 c39360co32 = C39360co3.this;
                Intrinsics.checkNotNullExpressionValue(nestClaims, "nestClaims");
                List<WireNestClaim> list = nestClaims;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (WireNestClaim wireNestClaim2 : list) {
                        if (Intrinsics.areEqual(wireNestClaim2.getNestId(), m59035e) && wireNestClaim2.getExpiresAt().compareTo((ReadableInstant) now) > 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    c39360co32.f68261m.accept(m59035e);
                }
            }
            AtomicReference atomicReference = C39360co3.this.f68264p;
            Intrinsics.checkNotNullExpressionValue(nestClaims, "nestClaims");
            ArrayList arrayList = new ArrayList();
            for (Object obj : nestClaims) {
                if (((WireNestClaim) obj).getExpiresAt().compareTo((ReadableInstant) now) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            C42482i24.m35337a(atomicReference, nestClaims, arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends WireNestClaim>, ? extends List<? extends Pair<? extends WireNestClaim, ? extends NestMarker>>, ? extends Optional<String>> triple) {
            m53728a(triple);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<EnumC52481yu3> of;
        of = SetsKt__SetsKt.setOf((Object[]) new EnumC52481yu3[]{EnumC52481yu3.ALL, EnumC52481yu3.NESTS});
        f68248s = of;
    }

    public C39360co3(MapUi mapUi, MapNestMarkerUi mapNestMarkerUi, InterfaceC47086po3 ui, InterfaceC48430s43 nestManager, InterfaceC41315g43 nestMarkerManager, InterfaceC46473om3 operatorManager, DQ3 permissionManager, InterfaceC46545ot5 serverDrivenFilterManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        List emptyList;
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(mapNestMarkerUi, "mapNestMarkerUi");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(nestManager, "nestManager");
        Intrinsics.checkNotNullParameter(nestMarkerManager, "nestMarkerManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f68249a = mapUi;
        this.f68250b = mapNestMarkerUi;
        this.f68251c = ui;
        this.f68252d = nestManager;
        this.f68253e = nestMarkerManager;
        this.f68254f = operatorManager;
        this.f68255g = permissionManager;
        this.f68256h = serverDrivenFilterManager;
        this.f68257i = scopeProvider;
        this.f68258j = reactiveConfig;
        this.f68259k = navigator;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f68260l = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f68261m = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f68262n = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.f68263o = m25409g4;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f68264p = new AtomicReference<>(emptyList);
    }

    /* renamed from: A0 */
    public static final void m53905A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m53903B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final List m53901C0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj, obj2);
    }

    /* renamed from: D0 */
    public static final Pair m53899D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final Optional m53897E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m53895F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final void m53893G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m53891H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final Boolean m53889I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final InterfaceC23496h m53887J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m53885K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m53883L0() {
    }

    /* renamed from: M0 */
    public static final void m53881M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final InterfaceC23434B m53879N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m53877O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m53875P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final InterfaceC23447K m53873Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final void m53871R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m53869S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final boolean m53867T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: U0 */
    public static final InterfaceC24574u m53865U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final InterfaceC23447K m53863V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W0 */
    public static final void m53861W0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final void m53859X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final List m53857Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final Integer m53855Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final boolean m53852a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b1 */
    public static final InterfaceC24574u m53849b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final InterfaceC23447K m53846c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final void m53843d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final void m53840e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final InterfaceC24574u m53837f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m53834g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m53831h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final void m53828i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final Boolean m53825j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final boolean m53822k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: l0 */
    public static final void m53820l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m53819l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m53817m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final boolean m53816m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n0 */
    public static final boolean m53814n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n1 */
    public static final void m53813n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m53811o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23447K m53808p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m53805q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final InterfaceC23447K m53804q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m53802r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m53801r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final Boolean m53799s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final void m53798s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final Boolean m53796t0(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: t1 */
    public static final boolean m53795t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u0 */
    public static final Boolean m53793u0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj, obj2);
    }

    /* renamed from: u1 */
    public static final void m53792u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m53790v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m53787w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final Pair m53784x0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: y0 */
    public static final boolean m53781y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: z0 */
    public static final List m53779z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public final int m53829i0(WireNestClaim wireNestClaim) {
        return (int) Math.rint((Seconds.secondsBetween(DateTime.now(), wireNestClaim.getExpiresAt()).getSeconds() / Minutes.minutes(wireNestClaim.getTotalDurationMinutes()).toStandardSeconds().getSeconds()) * 100);
    }

    /* renamed from: j0 */
    public final boolean m53826j0(EnumC52481yu3 enumC52481yu3) {
        return f68248s.contains(enumC52481yu3);
    }

    /* renamed from: k0 */
    public final void m53823k0() {
        Observable<Boolean> observeOn = this.f68258j.m82605h4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.enableNes…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16784s c16784s = new C16784s(this.f68251c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Um3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53820l0(Function1.this, obj);
            }
        });
        Observable<LatLng> centerLocationChanged = this.f68249a.centerLocationChanged();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<LatLng> observeOn2 = centerLocationChanged.throttleLast(2L, timeUnit).observeOn(C23454a.m33087a());
        final C16715C c16715c = new C16715C();
        Observable<LatLng> doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: Wm3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53817m0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33094as2 = doOnNext.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16723K c16723k = C16723K.f68272g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: in3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53790v0(Function1.this, obj);
            }
        };
        final C16737U c16737u = C16737U.f68285b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: un3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53895F0(Function1.this, obj);
            }
        });
        Observable<List<OperatorFilter>> mo6176g = this.f68256h.mo6176g(true);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        Observable<List<OperatorFilter>> delay = mo6176g.delay(100L, timeUnit2);
        Intrinsics.checkNotNullExpressionValue(delay, "serverDrivenFilterManage…0, TimeUnit.MILLISECONDS)");
        Object m33094as3 = delay.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16751d0 c16751d0 = new C16751d0();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Gn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53877O0(Function1.this, obj);
            }
        });
        Observable m74549j0 = C37279Yf5.m74549j0(this.f68250b.nestMarkerClicks(), 2, true);
        final C16753e0 c16753e0 = C16753e0.f68295g;
        Observable map = m74549j0.map(new InterfaceC23492o() { // from class: Nn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m53857Y0;
                m53857Y0 = C39360co3.m53857Y0(Function1.this, obj);
                return m53857Y0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "mapNestMarkerUi.nestMark…ems[0])\n        }\n      }");
        Object m33094as4 = map.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16755f0 c16755f0 = new C16755f0();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: On3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53831h1(Function1.this, obj);
            }
        });
        Observable<LatLng> mapClicks = this.f68249a.reactiveMapEvent().mapClicks();
        InterfaceC47086po3 interfaceC47086po3 = this.f68251c;
        OperatorMapBottomSheet.EnumC14592a enumC14592a = OperatorMapBottomSheet.EnumC14592a.NEST_FLIGHT_SHEET;
        Observable<R> withLatestFrom = mapClicks.withLatestFrom(interfaceC47086po3.mo89305rg(enumC14592a), new C16746b());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C16757g0 c16757g0 = C16757g0.f68297g;
        Observable filter = withLatestFrom.filter(new InterfaceC23494q() { // from class: Pn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53816m1;
                m53816m1 = C39360co3.m53816m1(Function1.this, obj);
                return m53816m1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "mapUi.reactiveMapEvent()…e -> bottomSheetVisible }");
        Object m33094as5 = filter.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16766k c16766k = new C16766k();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Qn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53813n1(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged = this.f68251c.mo89305rg(enumC14592a).startWith((Observable<Boolean>) Boolean.FALSE).distinctUntilChanged();
        final C16768l c16768l = C16768l.f68305g;
        Observable<Boolean> filter2 = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: Rn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53814n0;
                m53814n0 = C39360co3.m53814n0(Function1.this, obj);
                return m53814n0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "ui.bottomSheetVisible(Op…r { visible -> !visible }");
        Observable<R> withLatestFrom2 = filter2.withLatestFrom(this.f68250b.nestMarkerClicks(), new C16748c());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn3 = withLatestFrom2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.bottomSheetVisible(Op…dSchedulers.mainThread())");
        Object m33094as6 = observeOn3.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16770m c16770m = new C16770m();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: fn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53811o0(Function1.this, obj);
            }
        });
        Observable<NestFlightSheetButton> mo18678h8 = this.f68251c.mo18678h8();
        final C16772n c16772n = new C16772n();
        Observable<R> flatMapSingle = mo18678h8.flatMapSingle(new InterfaceC23492o() { // from class: qn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m53808p0;
                m53808p0 = C39360co3.m53808p0(Function1.this, obj);
                return m53808p0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Observable withLatestFrom3 = flatMapSingle.withLatestFrom(this.f68250b.nestMarkerClicks(), new C16750d());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom3, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn4 = withLatestFrom3.observeOn(C23454a.m33087a());
        final C16777o c16777o = new C16777o(this);
        Observable retry = observeOn4.doOnError(new InterfaceC23484g() { // from class: Bn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53805q0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33094as7 = retry.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16779p c16779p = new C16779p();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: Mn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53802r0(Function1.this, obj);
            }
        });
        Observable<EnumC52481yu3> mo145s2 = this.f68251c.mo145s2();
        final C16763i0 c16763i0 = new C16763i0();
        InterfaceC23434B map2 = mo145s2.map(new InterfaceC23492o() { // from class: Xn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m53799s0;
                m53799s0 = C39360co3.m53799s0(Function1.this, obj);
                return m53799s0;
            }
        });
        Z84<Optional<Float>> zoomLevelObservable = this.f68249a.getZoomLevelObservable();
        Observable<Boolean> m82689Z7 = this.f68258j.m82689Z7();
        Observable<Double> m82479s9 = this.f68258j.m82479s9();
        final C16765j0 c16765j0 = C16765j0.f68302g;
        Observable combineLatest = Observable.combineLatest(zoomLevelObservable, m82689Z7, m82479s9, new InterfaceC23485h() { // from class: Yn3
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Boolean m53796t0;
                m53796t0 = C39360co3.m53796t0(Function3.this, obj, obj2, obj3);
                return m53796t0;
            }
        });
        final C16767k0 c16767k0 = C16767k0.f68304g;
        Observable distinctUntilChanged2 = Observable.combineLatest(map2, combineLatest, new InterfaceC23480c() { // from class: Zn3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Boolean m53793u0;
                m53793u0 = C39360co3.m53793u0(Function2.this, obj, obj2);
                return m53793u0;
            }
        }).distinctUntilChanged();
        final C16769l0 c16769l0 = C16769l0.f68306g;
        AbstractC24495a publish = distinctUntilChanged2.doOnNext(new InterfaceC23484g() { // from class: ao3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53787w0(Function1.this, obj);
            }
        }).publish();
        AbstractC24490k<List<NestMarker>> m32131l1 = this.f68253e.mo36867C().m32131l1(500L, timeUnit2);
        InterfaceC45761na4 flowable = publish.toFlowable(EnumC23460b.LATEST);
        final C16781q c16781q = C16781q.f68317g;
        AbstractC24490k m32136k = AbstractC24490k.m32136k(m32131l1, flowable, new InterfaceC23480c() { // from class: bo3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m53784x0;
                m53784x0 = C39360co3.m53784x0(Function2.this, obj, obj2);
                return m53784x0;
            }
        });
        final C16783r c16783r = C16783r.f68319g;
        AbstractC24490k m32175S = m32136k.m32175S(new InterfaceC23494q() { // from class: Vm3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53781y0;
                m53781y0 = C39360co3.m53781y0(Function1.this, obj);
                return m53781y0;
            }
        });
        final C16785t c16785t = C16785t.f68320g;
        AbstractC24490k m32111s0 = m32175S.m32117q0(new InterfaceC23492o() { // from class: Xm3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m53779z0;
                m53779z0 = C39360co3.m53779z0(Function1.this, obj);
                return m53779z0;
            }
        }).m32111s0(C23454a.m33087a());
        final C16786u c16786u = C16786u.f68321g;
        AbstractC24490k m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: Ym3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53905A0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "combineLatest(\n      nes…\"Setting Nest Markers\") }");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16787v c16787v = new C16787v(this.f68250b);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: Zm3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53903B0(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(Observable.interval(1L, timeUnit), this.f68263o);
        Observable<List<NestMarker>> delay2 = this.f68253e.mo36867C().m32113r1().throttleLatest(500L, timeUnit2).delay(500L, timeUnit2);
        final C16788w c16788w = C16788w.f68322g;
        Observable observeOn5 = Observable.combineLatest(merge, delay2, new InterfaceC23480c() { // from class: an3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                List m53901C0;
                m53901C0 = C39360co3.m53901C0(Function2.this, obj, obj2);
                return m53901C0;
            }
        }).observeOn(C24542a.m31934a());
        final C16789x c16789x = new C16789x();
        Observable map3 = observeOn5.map(new InterfaceC23492o() { // from class: bn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m53899D0;
                m53899D0 = C39360co3.m53899D0(Function1.this, obj);
                return m53899D0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        C45168ma4<String> c45168ma4 = this.f68261m;
        final C16790y c16790y = C16790y.f68324b;
        Observable startWith = c45168ma4.map(new InterfaceC23492o() { // from class: cn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m53897E0;
                m53897E0 = C39360co3.m53897E0(Function1.this, obj);
                return m53897E0;
            }
        }).startWith((Observable<R>) Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(startWith, "nestFlightSheetRelay.map…rtWith(Optional.absent())");
        Observable withLatestFrom4 = map3.withLatestFrom(startWith, this.f68251c.mo89305rg(enumC14592a), new C16752e());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom4, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        Observable observeOn6 = withLatestFrom4.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33094as8 = observeOn6.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16791z c16791z = new C16791z();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: dn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53893G0(Function1.this, obj);
            }
        });
        Observable observeOn7 = publish.delay(500L, timeUnit2).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "showNests\n      // Delay…dSchedulers.mainThread())");
        Object m33094as9 = observeOn7.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16713A c16713a = new C16713A();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: en3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53891H0(Function1.this, obj);
            }
        });
        C45168ma4<Unit> c45168ma42 = this.f68262n;
        Observable<List<OperatorFilter>> mo6176g2 = this.f68256h.mo6176g(true);
        Observable<LatLng> centerLocationChanged2 = this.f68249a.centerLocationChanged();
        Observable<EnumC52481yu3> mo145s22 = this.f68251c.mo145s2();
        final C16714B c16714b = new C16714B();
        InterfaceC23434B map4 = mo145s22.map(new InterfaceC23492o() { // from class: gn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m53889I0;
                m53889I0 = C39360co3.m53889I0(Function1.this, obj);
                return m53889I0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Observable<R> withLatestFrom5 = c45168ma42.withLatestFrom(mo6176g2, centerLocationChanged2, map4, new C16754f());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom5, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        Observable observeOn8 = withLatestFrom5.observeOn(C23454a.m33087a());
        final C16716D c16716d = new C16716D();
        AbstractC23461c flatMapCompletable = observeOn8.flatMapCompletable(new InterfaceC23492o() { // from class: hn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m53887J0;
                m53887J0 = C39360co3.m53887J0(Function1.this, obj);
                return m53887J0;
            }
        });
        final C16717E c16717e = new C16717E(this);
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: jn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53885K0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: kn3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C39360co3.m53883L0();
            }
        };
        final C16718F c16718f = C16718F.f68269b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: ln3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53881M0(Function1.this, obj);
            }
        });
        C45168ma4<String> c45168ma43 = this.f68261m;
        InterfaceC23434B withLatestFrom6 = this.f68260l.withLatestFrom(c45168ma43, new C16756g());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom6, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable merge2 = Observable.merge(c45168ma43, withLatestFrom6);
        final C16759h0 c16759h0 = new C16759h0();
        AbstractC24495a flightSheetSubject = merge2.switchMap(new InterfaceC23492o() { // from class: mn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m53879N0;
                m53879N0 = C39360co3.m53879N0(Function1.this, obj);
                return m53879N0;
            }
        }).publish();
        Observable<T> observeOn9 = flightSheetSubject.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "flightSheetSubject\n     …dSchedulers.mainThread())");
        Object m33094as10 = observeOn9.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16719G c16719g = new C16719G();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: nn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53875P0(Function1.this, obj);
            }
        });
        C45168ma4<String> c45168ma44 = this.f68261m;
        final C16720H c16720h = new C16720H(this.f68252d);
        Observable observeOn10 = c45168ma44.flatMapSingle(new InterfaceC23492o() { // from class: on3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m53873Q0;
                m53873Q0 = C39360co3.m53873Q0(Function1.this, obj);
                return m53873Q0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "nestFlightSheetRelay\n   …dSchedulers.mainThread())");
        Object m33094as11 = observeOn10.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16721I c16721i = new C16721I(this.f68250b);
        ((ObservableSubscribeProxy) m33094as11).subscribe(new InterfaceC23484g() { // from class: pn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53871R0(Function1.this, obj);
            }
        });
        AbstractC24495a<Unit> nestClaimClicks = this.f68251c.mo18672w5().publish();
        Intrinsics.checkNotNullExpressionValue(nestClaimClicks, "nestClaimClicks");
        Intrinsics.checkNotNullExpressionValue(flightSheetSubject, "flightSheetSubject");
        Observable<R> withLatestFrom7 = nestClaimClicks.withLatestFrom(flightSheetSubject, new C16758h());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom7, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Observable observeOn11 = withLatestFrom7.observeOn(C23454a.m33087a());
        final C16722J c16722j = new C16722J();
        Observable doOnNext2 = observeOn11.doOnNext(new InterfaceC23484g() { // from class: rn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53869S0(Function1.this, obj);
            }
        });
        final C16724L c16724l = C16724L.f68273g;
        Observable filter3 = doOnNext2.filter(new InterfaceC23494q() { // from class: sn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53867T0;
                m53867T0 = C39360co3.m53867T0(Function1.this, obj);
                return m53867T0;
            }
        });
        final C16725M c16725m = new C16725M();
        Observable flatMapMaybe = filter3.flatMapMaybe(new InterfaceC23492o() { // from class: tn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m53865U0;
                m53865U0 = C39360co3.m53865U0(Function1.this, obj);
                return m53865U0;
            }
        });
        final C16728N c16728n = new C16728N(this.f68252d);
        Observable flatMapSingle2 = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: vn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m53863V0;
                m53863V0 = C39360co3.m53863V0(Function1.this, obj);
                return m53863V0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Observable observeOn12 = C24527f.m31950a(flatMapSingle2, this.f68250b.nestMarkerClicks()).observeOn(C23454a.m33087a());
        final C16729O c16729o = new C16729O();
        Observable retry2 = observeOn12.doOnError(new InterfaceC23484g() { // from class: wn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53861W0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33094as12 = retry2.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16730P c16730p = new C16730P();
        ((ObservableSubscribeProxy) m33094as12).subscribe(new InterfaceC23484g() { // from class: xn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53859X0(Function1.this, obj);
            }
        });
        Z84<Config> m82623f8 = this.f68258j.m82623f8();
        final C16731Q c16731q = C16731Q.f68279g;
        InterfaceC23434B map5 = m82623f8.map(new InterfaceC23492o() { // from class: yn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m53855Z0;
                m53855Z0 = C39360co3.m53855Z0(Function1.this, obj);
                return m53855Z0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "reactiveConfig.config.ma…ms.claimCooldownMinutes }");
        Observable<R> withLatestFrom8 = nestClaimClicks.withLatestFrom(flightSheetSubject, map5, new C16762i());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom8, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        final C16732R c16732r = C16732R.f68280g;
        Observable filter4 = withLatestFrom8.filter(new InterfaceC23494q() { // from class: zn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53852a1;
                m53852a1 = C39360co3.m53852a1(Function1.this, obj);
                return m53852a1;
            }
        });
        final C16733S c16733s = new C16733S();
        Observable flatMapMaybe2 = filter4.flatMapMaybe(new InterfaceC23492o() { // from class: An3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m53849b1;
                m53849b1 = C39360co3.m53849b1(Function1.this, obj);
                return m53849b1;
            }
        });
        final C16736T c16736t = new C16736T();
        Observable flatMapSingle3 = flatMapMaybe2.flatMapSingle(new InterfaceC23492o() { // from class: Cn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m53846c1;
                m53846c1 = C39360co3.m53846c1(Function1.this, obj);
                return m53846c1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle3, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Observable observeOn13 = C24527f.m31950a(flatMapSingle3, this.f68250b.nestMarkerClicks()).observeOn(C23454a.m33087a());
        final C16738V c16738v = new C16738V(this);
        Observable retry3 = observeOn13.doOnError(new InterfaceC23484g() { // from class: Dn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53843d1(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Object m33094as13 = retry3.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16739W c16739w = new C16739W();
        ((ObservableSubscribeProxy) m33094as13).subscribe(new InterfaceC23484g() { // from class: En3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53840e1(Function1.this, obj);
            }
        });
        Observable<Unit> mo18671xl = this.f68251c.mo18671xl();
        final C16740X c16740x = new C16740X();
        Observable<R> flatMapMaybe3 = mo18671xl.flatMapMaybe(new InterfaceC23492o() { // from class: Fn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m53837f1;
                m53837f1 = C39360co3.m53837f1(Function1.this, obj);
                return m53837f1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe3, "fun onCreate() {\n    // …ClaimClicks.connect()\n  }");
        Observable withLatestFrom9 = flatMapMaybe3.withLatestFrom(this.f68261m, new C16764j());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom9, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as14 = withLatestFrom9.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16742Y c16742y = new C16742Y();
        ((ObservableSubscribeProxy) m33094as14).subscribe(new InterfaceC23484g() { // from class: Hn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53834g1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn14 = this.f68258j.m82561l4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn14, "reactiveConfig.enableNes…dSchedulers.mainThread())");
        Object m33094as15 = observeOn14.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16743Z c16743z = new C16743Z();
        ((ObservableSubscribeProxy) m33094as15).subscribe(new InterfaceC23484g() { // from class: In3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53828i1(Function1.this, obj);
            }
        });
        Observable<List<NestMarker>> m32113r1 = this.f68253e.mo36867C().m32131l1(500L, timeUnit2).m32113r1();
        Intrinsics.checkNotNullExpressionValue(m32113r1, "nestMarkerManager.stream…DS)\n      .toObservable()");
        Observable observeOn15 = C24527f.m31950a(m32113r1, this.f68261m).observeOn(C24542a.m31934a());
        final C16745a0 c16745a0 = C16745a0.f68291g;
        Observable map6 = observeOn15.map(new InterfaceC23492o() { // from class: Jn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m53825j1;
                m53825j1 = C39360co3.m53825j1(Function1.this, obj);
                return m53825j1;
            }
        });
        final C16747b0 c16747b0 = C16747b0.f68292g;
        Observable observeOn16 = map6.filter(new InterfaceC23494q() { // from class: Kn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53822k1;
                m53822k1 = C39360co3.m53822k1(Function1.this, obj);
                return m53822k1;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn16, "nestMarkerManager.stream…dSchedulers.mainThread())");
        Object m33094as16 = observeOn16.m33094as(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16749c0 c16749c0 = new C16749c0();
        ((ObservableSubscribeProxy) m33094as16).subscribe(new InterfaceC23484g() { // from class: Ln3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53819l1(Function1.this, obj);
            }
        });
        publish.m32087e();
        flightSheetSubject.m32087e();
        nestClaimClicks.m32087e();
    }

    /* renamed from: o1 */
    public final void m53810o1(Throwable th) {
        RetrofitException retrofitException;
        HttpException httpException;
        C49375tg1 c49375tg1;
        String m11932c;
        C41318g46.m40159e(th);
        Throwable m87362c = R36.m87362c(th);
        Unit unit = null;
        if (m87362c instanceof RetrofitException) {
            retrofitException = (RetrofitException) m87362c;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
            throw new IllegalStateException(m11932c.toString());
        }
        if (m87362c instanceof HttpException) {
            httpException = (HttpException) m87362c;
        } else {
            httpException = null;
        }
        if (httpException != null) {
            this.f68251c.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f68251c.errorGeneric();
        }
    }

    /* renamed from: p1 */
    public final void m53807p1() {
        Observable<Boolean> m82605h4 = this.f68258j.m82605h4();
        Boolean bool = Boolean.FALSE;
        AbstractC23442F<Boolean> first = m82605h4.first(bool);
        final C16771m0 c16771m0 = new C16771m0();
        AbstractC23442F<R> m33165A = first.m33165A(new InterfaceC23492o() { // from class: Sn3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m53804q1;
                m53804q1 = C39360co3.m53804q1(Function1.this, obj);
                return m53804q1;
            }
        });
        final C16776n0 c16776n0 = new C16776n0(this);
        AbstractC23442F m33146T = m33165A.m33106t(new InterfaceC23484g() { // from class: Tn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53801r1(Function1.this, obj);
            }
        }).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "fun onResume() {\n    // ….accept(Unit)\n      }\n  }");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16778o0 c16778o0 = new C16778o0();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Un3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53798s1(Function1.this, obj);
            }
        });
        this.f68262n.accept(Unit.INSTANCE);
        AbstractC23442F<Boolean> first2 = this.f68251c.mo89305rg(OperatorMapBottomSheet.EnumC14592a.NEST_FLIGHT_SHEET).first(bool);
        final C16780p0 c16780p0 = C16780p0.f68316g;
        AbstractC24507p<Boolean> m33098z = first2.m33098z(new InterfaceC23494q() { // from class: Vn3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m53795t1;
                m53795t1 = C39360co3.m53795t1(Function1.this, obj);
                return m53795t1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33098z, "ui.bottomSheetVisible(Op…e -> bottomSheetVisible }");
        Object m32048b = m33098z.m32048b(AutoDispose.m45239a(this.f68257i));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16782q0 c16782q0 = new C16782q0();
        ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Wn3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39360co3.m53792u1(Function1.this, obj);
            }
        });
    }

    /* renamed from: v1 */
    public final void m53789v1() {
        this.f68251c.mo18683Ha();
    }

    /* renamed from: w1 */
    public final void m53786w1(int i) {
        this.f68251c.mo18680R0(i);
    }

    /* renamed from: x1 */
    public final List<WireNestClaim> m53783x1(List<WireNestClaim> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((WireNestClaim) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "kotlin.jvm.PlatformType", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co3$R */
    /* loaded from: classes2.dex */
    public static final class C16732R extends Lambda implements Function1<Pair<? extends NestFlightSheetDetails, ? extends Integer>, Boolean> {

        /* renamed from: g */
        public static final C16732R f68280g = new C16732R();

        public C16732R() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<NestFlightSheetDetails, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ClaimDetails claimDetails = pair.component1().getClaimDetails();
            return Boolean.valueOf((claimDetails != null ? claimDetails.getStatus() : null) == ClaimStatus.CLAIMED);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends NestFlightSheetDetails, ? extends Integer> pair) {
            return invoke2((Pair<NestFlightSheetDetails, Integer>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012.\u0010\u0003\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u00070\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/NestMarker;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$56\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,619:1\n2624#2,3:620\n*S KotlinDebug\n*F\n+ 1 OperatorNestPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorNestPresenter$onCreate$56\n*L\n539#1:620,3\n*E\n"})
    /* renamed from: co3$a0 */
    /* loaded from: classes2.dex */
    public static final class C16745a0 extends Lambda implements Function1<Pair<? extends List<? extends NestMarker>, ? extends String>, Boolean> {

        /* renamed from: g */
        public static final C16745a0 f68291g = new C16745a0();

        public C16745a0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<NestMarker>, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<NestMarker> nestMarkers = pair.component1();
            String component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(nestMarkers, "nestMarkers");
            List<NestMarker> list = nestMarkers;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((NestMarker) it.next()).getId(), component2)) {
                        z = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends NestMarker>, ? extends String> pair) {
            return invoke2((Pair<? extends List<NestMarker>, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co3$D */
    /* loaded from: classes2.dex */
    public static final class C16716D extends Lambda implements Function1<Triple<? extends OperatorMapFilterBundle, ? extends LatLng, ? extends Boolean>, InterfaceC23496h> {
        public C16716D() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Triple<OperatorMapFilterBundle, LatLng, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            OperatorMapFilterBundle component1 = triple.component1();
            LatLng latLng = triple.component2();
            Boolean validNestTab = triple.component3();
            Intrinsics.checkNotNullExpressionValue(validNestTab, "validNestTab");
            if (validNestTab.booleanValue()) {
                InterfaceC41315g43 interfaceC41315g43 = C39360co3.this.f68253e;
                C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
                Intrinsics.checkNotNullExpressionValue(latLng, "latLng");
                return C28237sD.progress$default(interfaceC41315g43.mo36866r(c37429Yw2.m73962i(latLng), C39360co3.this.f68249a.nearbyRadius(), component1, C39360co3.this.f68249a.viewport()), C39360co3.this.f68251c, 0, 2, (Object) null);
            }
            return AbstractC23461c.m33039p();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends OperatorMapFilterBundle, ? extends LatLng, ? extends Boolean> triple) {
            return invoke2((Triple<OperatorMapFilterBundle, LatLng, Boolean>) triple);
        }
    }
}
