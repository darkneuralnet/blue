package p000;

import co.bird.android.buava.Optional;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.rxkotlin.C24527f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR:\u0010\u0012\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e \u000f*\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R>\u0010\u0015\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0013 \u000f*\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u001a"}, m28432d2 = {"Lbv2;", "Lf1;", "Ldv2;", "Lev2;", "renderer", "", "q", "Lgl;", "e", "Lgl;", "prefs", "Lma4;", "", "LfN1;", "", "kotlin.jvm.PlatformType", "f", "Lma4;", "hostsEnabledRelay", "", "g", "hostPortRelay", "<init>", "(Lgl;)V", "h", C17296a.f69688o, "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n61#2,2:132\n180#3:134\n180#3:135\n180#3:136\n180#3:138\n271#4:137\n12990#5,3:139\n1#6:142\n*S KotlinDebug\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter\n*L\n32#1:132,2\n39#1:134\n54#1:135\n65#1:136\n82#1:138\n75#1:137\n110#1:139,3\n*E\n"})
/* renamed from: bv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38836bv2 extends AbstractC20169f1<InterfaceC40039dv2, InterfaceC40632ev2> {

    /* renamed from: h */
    public static final C13331a f59774h = new C13331a(null);

    /* renamed from: e */
    public final C22454gl f59775e;

    /* renamed from: f */
    public final C45168ma4<Map<EnumC40897fN1, Boolean>> f59776f;

    /* renamed from: g */
    public final C45168ma4<Map<EnumC40897fN1, Integer>> f59777g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbv2$a;", "", "", "DIGIT_TOKEN_SUFFIX", "Ljava/lang/String;", "HTTP_PREFIX", "<init>", "()V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bv2$a */
    /* loaded from: classes3.dex */
    public static final class C13331a {
        public /* synthetic */ C13331a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13331a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: bv2$b */
    /* loaded from: classes3.dex */
    public static final class C13332b<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C13332b<T1, T2, T3, R> f59778a = new C13332b<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter\n*L\n1#1,304:1\n80#2:305\n*E\n"})
    /* renamed from: bv2$c */
    /* loaded from: classes3.dex */
    public static final class C13333c<T1, T2, T3, T4, R> implements InterfaceC23486i<Unit, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return (R) new Triple((Optional) t1, (Map) t2, (Map) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2ã\u0001\u0010\b\u001aÞ\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00040\u0004 \u0003*n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "", "LfN1;", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bv2$d */
    /* loaded from: classes3.dex */
    public static final class C13334d extends Lambda implements Function1<Triple<? extends Optional<String>, ? extends Map<EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Integer>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lev2;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lev2;)Lev2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$1$1\n+ 2 LocalHostState.kt\nco/bird/android/feature/localhost/LocalHostStateKt\n*L\n1#1,131:1\n26#2,8:132\n*S KotlinDebug\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$1$1\n*L\n42#1:132,8\n*E\n"})
        /* renamed from: bv2$d$a */
        /* loaded from: classes3.dex */
        public static final class C13335a extends Lambda implements Function1<InterfaceC40632ev2, InterfaceC40632ev2> {

            /* renamed from: g */
            public final /* synthetic */ Optional<String> f59780g;

            /* renamed from: h */
            public final /* synthetic */ Map<EnumC40897fN1, Boolean> f59781h;

            /* renamed from: i */
            public final /* synthetic */ Map<EnumC40897fN1, Integer> f59782i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13335a(Optional<String> optional, Map<EnumC40897fN1, Boolean> map, Map<EnumC40897fN1, Integer> map2) {
                super(1);
                this.f59780g = optional;
                this.f59781h = map;
                this.f59782i = map2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC40632ev2 invoke(InterfaceC40632ev2 state) {
                InterfaceC40632ev2 interfaceC40632ev2;
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C36101Te6.class);
                if (!(state instanceof C36101Te6)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    if (primaryConstructor != null) {
                        interfaceC40632ev2 = (InterfaceC40632ev2) primaryConstructor.call(state.mo20529a(), state.mo20528b(), state.mo20527c());
                    } else {
                        interfaceC40632ev2 = null;
                    }
                    if (interfaceC40632ev2 != null) {
                        state = (C36101Te6) interfaceC40632ev2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.localhost.UpdateUi");
                    }
                }
                Map<EnumC40897fN1, Boolean> hostsEnabled = this.f59781h;
                Intrinsics.checkNotNullExpressionValue(hostsEnabled, "hostsEnabled");
                Map<EnumC40897fN1, Integer> hostPorts = this.f59782i;
                Intrinsics.checkNotNullExpressionValue(hostPorts, "hostPorts");
                return ((C36101Te6) state).m83234d(this.f59780g.m59035e(), hostsEnabled, hostPorts);
            }
        }

        public C13334d() {
            super(1);
        }

        /* renamed from: a */
        public final void m62145a(Triple<Optional<String>, ? extends Map<EnumC40897fN1, Boolean>, ? extends Map<EnumC40897fN1, Integer>> triple) {
            C38836bv2.this.m42279i(new C13335a(triple.component1(), triple.component2(), triple.component3()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<String>, ? extends Map<EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Integer>> triple) {
            m62145a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062~\u0010\u0005\u001az\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0004*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003 \u0004*<\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0004*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LfN1;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    /* renamed from: bv2$e */
    /* loaded from: classes3.dex */
    public static final class C13336e extends Lambda implements Function1<Pair<? extends Pair<? extends EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Boolean>>, Unit> {
        public C13336e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Boolean>> pair) {
            invoke2((Pair<? extends Pair<? extends EnumC40897fN1, Boolean>, ? extends Map<EnumC40897fN1, Boolean>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Pair<? extends EnumC40897fN1, Boolean>, ? extends Map<EnumC40897fN1, Boolean>> pair) {
            Map mutableMap;
            Pair<? extends EnumC40897fN1, Boolean> component1 = pair.component1();
            Map<EnumC40897fN1, Boolean> hostsEnabled = pair.component2();
            boolean booleanValue = component1.component2().booleanValue();
            Intrinsics.checkNotNullExpressionValue(hostsEnabled, "hostsEnabled");
            mutableMap = MapsKt__MapsKt.toMutableMap(hostsEnabled);
            mutableMap.put(component1.component1(), Boolean.valueOf(booleanValue));
            C38836bv2.this.f59776f.accept(mutableMap);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u008b\u0001\u0010\u0005\u001a\u0086\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0012(\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0004*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00030\u0003 \u0004*B\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0012(\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0004*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LfN1;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    /* renamed from: bv2$f */
    /* loaded from: classes3.dex */
    public static final class C13337f extends Lambda implements Function1<Pair<? extends Pair<? extends EnumC40897fN1, ? extends Integer>, ? extends Map<EnumC40897fN1, ? extends Integer>>, Unit> {
        public C13337f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends EnumC40897fN1, ? extends Integer>, ? extends Map<EnumC40897fN1, ? extends Integer>> pair) {
            invoke2((Pair<? extends Pair<? extends EnumC40897fN1, Integer>, ? extends Map<EnumC40897fN1, Integer>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Pair<? extends EnumC40897fN1, Integer>, ? extends Map<EnumC40897fN1, Integer>> pair) {
            Map mutableMap;
            Pair<? extends EnumC40897fN1, Integer> component1 = pair.component1();
            Map<EnumC40897fN1, Integer> hostPorts = pair.component2();
            Intrinsics.checkNotNullExpressionValue(hostPorts, "hostPorts");
            mutableMap = MapsKt__MapsKt.toMutableMap(hostPorts);
            mutableMap.put(component1.component1(), component1.component2());
            C38836bv2.this.f59777g.accept(mutableMap);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2ã\u0001\u0010\b\u001aÞ\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00040\u0004 \u0003*n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "", "LfN1;", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1855#2,2:132\n1855#2,2:134\n1#3:136\n*S KotlinDebug\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$5\n*L\n85#1:132,2\n91#1:134,2\n*E\n"})
    /* renamed from: bv2$g */
    /* loaded from: classes3.dex */
    public static final class C13338g extends Lambda implements Function1<Triple<? extends Optional<String>, ? extends Map<EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Integer>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lev2;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lev2;)Lev2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$5$3\n+ 2 LocalHostState.kt\nco/bird/android/feature/localhost/LocalHostStateKt\n*L\n1#1,131:1\n26#2,8:132\n*S KotlinDebug\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter$consume$5$3\n*L\n104#1:132,8\n*E\n"})
        /* renamed from: bv2$g$a */
        /* loaded from: classes3.dex */
        public static final class C13339a extends Lambda implements Function1<InterfaceC40632ev2, InterfaceC40632ev2> {

            /* renamed from: g */
            public static final C13339a f59786g = new C13339a();

            public C13339a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC40632ev2 invoke(InterfaceC40632ev2 state) {
                InterfaceC40632ev2 interfaceC40632ev2;
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C27056om.class);
                if (!(state instanceof C27056om)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    if (primaryConstructor != null) {
                        interfaceC40632ev2 = (InterfaceC40632ev2) primaryConstructor.call(state.mo20529a(), state.mo20528b(), state.mo20527c());
                    } else {
                        interfaceC40632ev2 = null;
                    }
                    if (interfaceC40632ev2 != null) {
                        return (C27056om) interfaceC40632ev2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.localhost.ApplyChanges");
                }
                return state;
            }
        }

        public C13338g() {
            super(1);
        }

        /* renamed from: a */
        public final void m62143a(Triple<Optional<String>, ? extends Map<EnumC40897fN1, Boolean>, ? extends Map<EnumC40897fN1, Integer>> triple) {
            Optional<String> component1 = triple.component1();
            Map<EnumC40897fN1, Boolean> component2 = triple.component2();
            Map<EnumC40897fN1, Integer> component3 = triple.component3();
            Set<EnumC40897fN1> keySet = component2.keySet();
            C38836bv2 c38836bv2 = C38836bv2.this;
            for (EnumC40897fN1 enumC40897fN1 : keySet) {
                c38836bv2.f59775e.m37593n2(enumC40897fN1, Intrinsics.areEqual(component2.get(enumC40897fN1), Boolean.TRUE));
                C41318g46.m40163a("Setting Host Port Enabled: " + enumC40897fN1 + ": " + component2.get(enumC40897fN1), new Object[0]);
            }
            Set<EnumC40897fN1> keySet2 = component3.keySet();
            C38836bv2 c38836bv22 = C38836bv2.this;
            for (EnumC40897fN1 enumC40897fN12 : keySet2) {
                c38836bv22.f59775e.m37597m2(enumC40897fN12, component3.get(enumC40897fN12));
                C41318g46.m40163a("Setting Host Port: " + enumC40897fN12 + ": " + component3.get(enumC40897fN12), new Object[0]);
            }
            String str = "http://" + C39447cv2.access$getDIGIT_TOKEN_REGEX$p().replace(component1.m59038b(), "") + ":%d";
            C38836bv2.this.f59775e.m37589o2(str);
            C41318g46.m40163a("Setting Local URL: " + str, new Object[0]);
            C38836bv2.this.m42279i(C13339a.f59786g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<String>, ? extends Map<EnumC40897fN1, ? extends Boolean>, ? extends Map<EnumC40897fN1, ? extends Integer>> triple) {
            m62143a(triple);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38836bv2(C22454gl prefs) {
        super(new C36101Te6(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f59775e = prefs;
        C45168ma4<Map<EnumC40897fN1, Boolean>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Map<Host, Boolean>>()");
        this.f59776f = m25409g;
        C45168ma4<Map<EnumC40897fN1, Integer>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Map<Host, Int?>>()");
        this.f59777g = m25409g2;
    }

    /* renamed from: f */
    public static final void m62155f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m62154g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m62148r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m62147s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: q */
    public void consume(InterfaceC40039dv2 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Optional<String>> mo43502y5 = renderer.mo43502y5();
        Optional.C14443a c14443a = Optional.f63040c;
        Observable<Optional<String>> startWith = mo43502y5.startWith((Observable<Optional<String>>) c14443a.m59033b(C39447cv2.access$getFormattedLocalUrl(this.f59775e)));
        Intrinsics.checkNotNullExpressionValue(startWith, "renderer.localAddressCha…ormattedLocalUrl)\n      )");
        Observable combineLatest = Observable.combineLatest(startWith, this.f59776f, this.f59777g, C13332b.f59778a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13334d c13334d = new C13334d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Xu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38836bv2.m62155f(Function1.this, obj);
            }
        });
        Object m33094as2 = C24527f.m31950a(renderer.mo43504I7(), this.f59776f).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13336e c13336e = new C13336e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Yu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38836bv2.m62154g(Function1.this, obj);
            }
        });
        Object m33094as3 = C24527f.m31950a(renderer.mo43503j8(), this.f59777g).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13337f c13337f = new C13337f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Zu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38836bv2.m62148r(Function1.this, obj);
            }
        });
        Observable<Unit> mo43505H0 = renderer.mo43505H0();
        Observable<Optional<String>> startWith2 = renderer.mo43502y5().startWith((Observable<Optional<String>>) c14443a.m59033b(C39447cv2.access$getFormattedLocalUrl(this.f59775e)));
        Intrinsics.checkNotNullExpressionValue(startWith2, "renderer.localAddressCha…prefs.formattedLocalUrl))");
        Observable<R> withLatestFrom = mo43505H0.withLatestFrom(startWith2, this.f59776f, this.f59777g, new C13333c());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        Object m33094as4 = withLatestFrom.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13338g c13338g = new C13338g();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: av2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38836bv2.m62147s(Function1.this, obj);
            }
        });
        EnumC40897fN1[] values = EnumC40897fN1.values();
        Pair m28425to = TuplesKt.m28425to(new LinkedHashMap(), new LinkedHashMap());
        for (EnumC40897fN1 enumC40897fN1 : values) {
            Map map = (Map) m28425to.component1();
            Map map2 = (Map) m28425to.component2();
            map.put(enumC40897fN1, Boolean.valueOf(this.f59775e.m37635d0(enumC40897fN1)));
            map2.put(enumC40897fN1, Integer.valueOf(this.f59775e.m37640c0(enumC40897fN1)));
            m28425to = TuplesKt.m28425to(map, map2);
        }
        this.f59776f.accept((Map) m28425to.component1());
        this.f59777g.accept((Map) m28425to.component2());
    }
}
