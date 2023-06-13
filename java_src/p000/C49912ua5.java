package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.User;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireBird;
import co.bird.api.response.BeginnerModeRiderMapAction;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J6\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010+\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\u000b0\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m28432d2 = {"Lua5;", "Lka5;", "", "j", "Lco/bird/android/model/User;", "user", "", "maxRides", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideStatus", "", "enableToggleInRide", "enableToggleOutOfRide", "t", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "LRh6;", "b", "LRh6;", "userStream", "Lfa5;", "c", "Lfa5;", "riderProfileManager", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "Lya5;", "e", "Lya5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAG;", "kotlin.jvm.PlatformType", "g", "LAG;", "shouldShowToggle", "<init>", "(LTq4;LRh6;Lfa5;LYR4;Lya5;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderProfilePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfilePresenter.kt\nco/bird/android/app/feature/riderprofile/presenter/RiderProfilePresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,124:1\n82#2,2:125\n52#2,2:128\n237#3:127\n180#3:130\n237#3:131\n*S KotlinDebug\n*F\n+ 1 RiderProfilePresenter.kt\nco/bird/android/app/feature/riderprofile/presenter/RiderProfilePresenterImpl\n*L\n51#1:125,2\n71#1:128,2\n68#1:127\n76#1:130\n112#1:131\n*E\n"})
/* renamed from: ua5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49912ua5 implements InterfaceC43983ka5 {

    /* renamed from: a */
    public final C36207Tq4 f112639a;

    /* renamed from: b */
    public final InterfaceC35660Rh6 f112640b;

    /* renamed from: c */
    public final InterfaceC41018fa5 f112641c;

    /* renamed from: d */
    public final YR4 f112642d;

    /* renamed from: e */
    public final InterfaceC52283ya5 f112643e;

    /* renamed from: f */
    public final ScopeProvider f112644f;

    /* renamed from: g */
    public final C0058AG<Boolean> f112645g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ua5$a */
    /* loaded from: classes2.dex */
    public static final class C29256a<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C29256a<T1, T2, T3, T4, T5, R> f112646a = new C29256a<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ua5$b */
    /* loaded from: classes2.dex */
    public static final class C29257b<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C29257b<T1, T2, R> f112647a = new C29257b<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00050\u00052*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LRe4;", "", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LRe4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$c */
    /* loaded from: classes2.dex */
    public static final class C29258c extends Lambda implements Function1<C35631Re4<? extends Integer, ? extends User, ? extends Optional<RideState>, ? extends Boolean, ? extends Boolean>, Boolean> {
        public C29258c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C35631Re4<Integer, User, Optional<RideState>, Boolean, Boolean> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            int intValue = c35631Re4.m86500a().intValue();
            return Boolean.valueOf(C49912ua5.this.m10027t(c35631Re4.m86499b(), intValue, c35631Re4.m86498c(), c35631Re4.m86497d().booleanValue(), c35631Re4.m86496e().booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "shouldShowToggle", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ua5$d */
    /* loaded from: classes2.dex */
    public static final class C29259d extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C29259d f112649g = new C29259d();

        public C29259d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean shouldShowToggle) {
            Intrinsics.checkNotNullParameter(shouldShowToggle, "shouldShowToggle");
            return shouldShowToggle;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$e */
    /* loaded from: classes2.dex */
    public static final class C29260e extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C29260e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49912ua5.this.f112641c.mo30289b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Ll56;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$f */
    /* loaded from: classes2.dex */
    public static final class C29261f extends Lambda implements Function1<Pair<? extends Optional<C44293l56>, ? extends Boolean>, Unit> {
        public C29261f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<C44293l56>, ? extends Boolean> pair) {
            invoke2((Pair<Optional<C44293l56>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<C44293l56>, Boolean> pair) {
            Optional<C44293l56> component1 = pair.component1();
            Boolean shouldShowToggle = pair.component2();
            if (component1.m59037c()) {
                Intrinsics.checkNotNullExpressionValue(shouldShowToggle, "shouldShowToggle");
                if (shouldShowToggle.booleanValue()) {
                    C44293l56 m59038b = component1.m59038b();
                    C49912ua5.this.f112643e.mo1079N9(m59038b.m27875c());
                    C49912ua5.this.f112643e.mo1077kf(m59038b.m27874d());
                    C49912ua5.this.f112643e.mo1081Fi(true);
                    return;
                }
            }
            C49912ua5.this.f112643e.mo1081Fi(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LMZ;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$g */
    /* loaded from: classes2.dex */
    public static final class C29262g extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<C5312MZ>>, Optional<C5312MZ>> {

        /* renamed from: g */
        public static final C29262g f112652g = new C29262g();

        public C29262g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<C5312MZ> invoke(Pair<Unit, Optional<C5312MZ>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u000b\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00000\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "LMZ;", "Lco/bird/android/buava/Optional;", "Ll56;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "LB1;", "", "invoke", "(Lkotlin/Pair;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderProfilePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfilePresenter.kt\nco/bird/android/app/feature/riderprofile/presenter/RiderProfilePresenterImpl$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 RiderProfilePresenter.kt\nco/bird/android/app/feature/riderprofile/presenter/RiderProfilePresenterImpl$onCreate$6\n*L\n94#1:125\n94#1:126,3\n*E\n"})
    /* renamed from: ua5$h */
    /* loaded from: classes2.dex */
    public static final class C29263h extends Lambda implements Function1<Pair<? extends C5312MZ, ? extends Optional<C44293l56>>, Pair<? extends List<? extends C0371B1>, ? extends String>> {

        /* renamed from: g */
        public static final C29263h f112653g = new C29263h();

        public C29263h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends C0371B1>, ? extends String> invoke(Pair<? extends C5312MZ, ? extends Optional<C44293l56>> pair) {
            return invoke2((Pair<C5312MZ, Optional<C44293l56>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<C0371B1>, String> invoke2(Pair<C5312MZ, Optional<C44293l56>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C5312MZ component1 = pair.component1();
            Optional<C44293l56> component2 = pair.component2();
            List<BeginnerModeRiderMapAction> m95167b = component1.m95167b();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m95167b, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (BeginnerModeRiderMapAction beginnerModeRiderMapAction : m95167b) {
                String accelerationLevel = beginnerModeRiderMapAction.getAccelerationLevel();
                C44293l56 m59035e = component2.m59035e();
                Integer num = null;
                if (Intrinsics.areEqual(accelerationLevel, m59035e != null ? m59035e.m27876b() : null)) {
                    num = Integer.valueOf(C48193rg4.ic_check_black);
                }
                arrayList.add(new C0371B1(beginnerModeRiderMapAction.getContentTitle(), beginnerModeRiderMapAction.getContentSubtitle(), beginnerModeRiderMapAction.getAsset().getMedia().getMediaUrl(), num, beginnerModeRiderMapAction.getAccelerationLevel()));
            }
            return TuplesKt.m28425to(arrayList, component1.m95166c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LB1;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$i */
    /* loaded from: classes2.dex */
    public static final class C29264i extends Lambda implements Function1<Pair<? extends List<? extends C0371B1>, ? extends String>, InterfaceC24574u<? extends C0371B1>> {
        public C29264i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C0371B1> invoke(Pair<? extends List<C0371B1>, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C49912ua5.this.f112643e.mo1080Ka(pair.component1(), pair.component2());
        }
    }

    public C49912ua5(C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream, InterfaceC41018fa5 riderProfileManager, YR4 rideManager, InterfaceC52283ya5 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f112639a = reactiveConfig;
        this.f112640b = userStream;
        this.f112641c = riderProfileManager;
        this.f112642d = rideManager;
        this.f112643e = ui;
        this.f112644f = scopeProvider;
        C0058AG<Boolean> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Boolean>()");
        this.f112645g = m115951g;
    }

    /* renamed from: k */
    public static final Boolean m10036k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final boolean m10035l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: m */
    public static final InterfaceC23496h m10034m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m10033n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final Optional m10032o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final Pair m10031p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC24574u m10030q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m10029r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final InterfaceC23496h m10028s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public void m10037j() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f112639a.m82677a9(), this.f112640b.mo76579f(), this.f112642d.mo75057R(), this.f112639a.m82889F7(), this.f112639a.m82869H7(), C29256a.f112646a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C29258c c29258c = new C29258c();
        Observable doOnNext = combineLatest.map(new InterfaceC23492o() { // from class: la5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m10036k;
                m10036k = C49912ua5.m10036k(Function1.this, obj);
                return m10036k;
            }
        }).doOnNext(this.f112645g);
        final C29259d c29259d = C29259d.f112649g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: ma5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m10035l;
                m10035l = C49912ua5.m10035l(Function1.this, obj);
                return m10035l;
            }
        });
        final C29260e c29260e = new C29260e();
        AbstractC23461c switchMapCompletable = filter.switchMapCompletable(new InterfaceC23492o() { // from class: na5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m10034m;
                m10034m = C49912ua5.m10034m(Function1.this, obj);
                return m10034m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f112644f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<Optional<C44293l56>> mo30287d = this.f112641c.mo30287d();
        Observable<Boolean> distinctUntilChanged = this.f112645g.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "shouldShowToggle.distinctUntilChanged()");
        Observable combineLatest2 = Observable.combineLatest(mo30287d, distinctUntilChanged, C29257b.f112647a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f112644f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29261f c29261f = new C29261f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oa5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49912ua5.m10033n(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f112643e.mo1078V0(), this.f112641c.mo30288c());
        final C29262g c29262g = C29262g.f112652g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: pa5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m10032o;
                m10032o = C49912ua5.m10032o(Function1.this, obj);
                return m10032o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.dropdownButtonClicks(…ata) -> bottomSheetData }");
        Observable m31950a2 = C24527f.m31950a(C37279Yf5.m74576S(map), this.f112641c.mo30287d());
        final C29263h c29263h = C29263h.f112653g;
        Observable map2 = m31950a2.map(new InterfaceC23492o() { // from class: qa5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m10031p;
                m10031p = C49912ua5.m10031p(Function1.this, obj);
                return m10031p;
            }
        });
        final C29264i c29264i = new C29264i();
        Observable switchMapMaybe = map2.switchMapMaybe(new InterfaceC23492o() { // from class: ra5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m10030q;
                m10030q = C49912ua5.m10030q(Function1.this, obj);
                return m10030q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapMaybe, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Observable m31950a3 = C24527f.m31950a(switchMapMaybe, this.f112641c.mo30287d());
        final C29265j c29265j = C29265j.f112655g;
        Observable filter2 = m31950a3.filter(new InterfaceC23494q() { // from class: sa5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m10029r;
                m10029r = C49912ua5.m10029r(Function1.this, obj);
                return m10029r;
            }
        });
        final C29266k c29266k = new C29266k();
        AbstractC23461c switchMapCompletable2 = filter2.switchMapCompletable(new InterfaceC23492o() { // from class: ta5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m10028s;
                m10028s = C49912ua5.m10028s(Function1.this, obj);
                return m10028s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n2 = switchMapCompletable2.m33041n(AutoDispose.m45239a(this.f112644f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.get(r4.fromString(r5)), r2) == false) goto L16;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10027t(User user, int i, Optional<RideState> optional, boolean z, boolean z2) {
        String str;
        Map<BirdModel, Boolean> enableBeginnerModeByModel = this.f112639a.m82623f8().m73665a().getRiderProfileConfig().getEnableBeginnerModeByModel();
        Collection<Boolean> values = enableBeginnerModeByModel.values();
        Boolean bool = Boolean.TRUE;
        if (values.contains(bool) && user.getRideCount() <= i) {
            if (C42149hU4.m36358a(optional) && z) {
                BirdModel.Companion companion = BirdModel.Companion;
                WireBird bird = optional.m59038b().getRide().getBird();
                if (bird != null) {
                    str = bird.getModel();
                } else {
                    str = null;
                }
            }
            if (!C42149hU4.m36358a(optional) && z2) {
                return true;
            }
        }
        return false;
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LB1;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Ll56;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$j */
    /* loaded from: classes2.dex */
    public static final class C29265j extends Lambda implements Function1<Pair<? extends C0371B1, ? extends Optional<C44293l56>>, Boolean> {

        /* renamed from: g */
        public static final C29265j f112655g = new C29265j();

        public C29265j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<C0371B1, Optional<C44293l56>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String m114793j = pair.component1().m114793j();
            C44293l56 m59035e = pair.component2().m59035e();
            return Boolean.valueOf(!Intrinsics.areEqual(m114793j, m59035e != null ? m59035e.m27876b() : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C0371B1, ? extends Optional<C44293l56>> pair) {
            return invoke2((Pair<C0371B1, Optional<C44293l56>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LB1;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Ll56;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ua5$k */
    /* loaded from: classes2.dex */
    public static final class C29266k extends Lambda implements Function1<Pair<? extends C0371B1, ? extends Optional<C44293l56>>, InterfaceC23496h> {
        public C29266k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<C0371B1, Optional<C44293l56>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C28237sD.progress$default(C49912ua5.this.f112641c.mo30286e(pair.component1().m114793j()), C49912ua5.this.f112643e, 0, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends C0371B1, ? extends Optional<C44293l56>> pair) {
            return invoke2((Pair<C0371B1, Optional<C44293l56>>) pair);
        }
    }
}
