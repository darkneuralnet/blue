package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.BountyBirdsFilter;
import co.bird.android.model.IntervalFilter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.D00;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"LNl1;", "LIl1;", "Lgl;", C17296a.f69688o, "Lgl;", "preference", "La94;", "Lco/bird/android/model/BountyBirdsFilter;", "b", "La94;", "i", "()La94;", "bountyFilter", "c", "j", "defaultBountyFilter", "LRh6;", "userStream", "LTq4;", "reactiveConfig", "<init>", "(Lgl;LRh6;LTq4;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilterBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,93:1\n81#2,2:94\n180#3:96\n*S KotlinDebug\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl\n*L\n30#1:94,2\n65#1:96\n*E\n"})
/* renamed from: Nl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34755Nl1 implements InterfaceC33585Il1 {

    /* renamed from: a */
    public final C22454gl f25092a;

    /* renamed from: b */
    public final C37791a94<BountyBirdsFilter> f25093b;

    /* renamed from: c */
    public final C37791a94<BountyBirdsFilter> f25094c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LD00;", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lco/bird/android/model/BountyBirdsFilter;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LD00;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFilterBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* renamed from: Nl1$a */
    /* loaded from: classes4.dex */
    public static final class C5668a extends Lambda implements Function1<D00, Triple<? extends BountyBirdsFilter, ? extends Boolean, ? extends Boolean>> {

        /* renamed from: g */
        public static final C5668a f25095g = new C5668a();

        public C5668a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<BountyBirdsFilter, Boolean, Boolean> invoke(D00 d00) {
            Integer m59035e;
            long j;
            long j2;
            Integer m59035e2;
            Integer m59035e3;
            Intrinsics.checkNotNullParameter(d00, "<name for destructuring parameter 0>");
            Optional<Integer> m111172a = d00.m111172a();
            Optional<Integer> m111171b = d00.m111171b();
            Optional<Integer> m111170c = d00.m111170c();
            Optional<Integer> m111169d = d00.m111169d();
            boolean m111168e = d00.m111168e();
            boolean m111167f = d00.m111167f();
            long j3 = Long.MIN_VALUE;
            if (m111172a.m59035e() != null) {
                j = TimeUnit.MINUTES.toMillis(m59035e.intValue());
            } else {
                j = Long.MIN_VALUE;
            }
            Integer m59035e4 = m111171b.m59035e();
            long j4 = LongCompanionObject.MAX_VALUE;
            if (m59035e4 != null) {
                j2 = TimeUnit.MINUTES.toMillis(m59035e4.intValue());
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (m111170c.m59035e() != null) {
                j3 = TimeUnit.MINUTES.toMillis(m59035e2.intValue());
            }
            if (m111169d.m59035e() != null) {
                j4 = TimeUnit.MINUTES.toMillis(m59035e3.intValue());
            }
            return new Triple<>(new BountyBirdsFilter(new IntervalFilter(Long.valueOf(j), Long.valueOf(j2)), new IntervalFilter(Long.valueOf(j3), Long.valueOf(j4)), null, null, null, m111167f, 28, null), Boolean.valueOf(m111168e), Boolean.valueOf(m111167f));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u000522\u0010\u0004\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/BountyBirdsFilter;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nl1$b */
    /* loaded from: classes4.dex */
    public static final class C5669b extends Lambda implements Function1<Triple<? extends BountyBirdsFilter, ? extends Boolean, ? extends Boolean>, Unit> {
        public C5669b() {
            super(1);
        }

        /* renamed from: a */
        public final void m93484a(Triple<BountyBirdsFilter, Boolean, Boolean> triple) {
            BountyBirdsFilter component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            boolean booleanValue2 = triple.component3().booleanValue();
            if (!booleanValue || !booleanValue2) {
                C34755Nl1.this.f25092a.m37628f();
            }
            C34755Nl1.this.m93486j().accept(component1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends BountyBirdsFilter, ? extends Boolean, ? extends Boolean> triple) {
            m93484a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00010\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/BountyBirdsFilter;", "", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lco/bird/android/model/BountyBirdsFilter;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nl1$c */
    /* loaded from: classes4.dex */
    public static final class C5670c extends Lambda implements Function1<Triple<? extends BountyBirdsFilter, ? extends Boolean, ? extends Boolean>, BountyBirdsFilter> {
        public C5670c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BountyBirdsFilter invoke(Triple<BountyBirdsFilter, Boolean, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            BountyBirdsFilter component1 = triple.component1();
            BountyBirdsFilter m37731G = C34755Nl1.this.f25092a.m37731G();
            if (m37731G != null) {
                return m37731G;
            }
            return component1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BountyBirdsFilter;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BountyBirdsFilter;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nl1$d */
    /* loaded from: classes4.dex */
    public static final class C5671d extends Lambda implements Function1<BountyBirdsFilter, Unit> {
        public C5671d() {
            super(1);
        }

        /* renamed from: a */
        public final void m93482a(BountyBirdsFilter it) {
            C37791a94<BountyBirdsFilter> m93487i = C34755Nl1.this.m93487i();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            m93487i.accept(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyBirdsFilter bountyBirdsFilter) {
            m93482a(bountyBirdsFilter);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0010\u0010\u0010\u001a\u00028\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u0000\"\b\b\u0006\u0010\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00042\u0006\u0010\r\u001a\u00028\u0005H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "T6", "R", "t1", "t2", "t3", "t4", "t5", "t6", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$7\n+ 2 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl\n*L\n1#1,304:1\n37#2:305\n*E\n"})
    /* renamed from: Nl1$e */
    /* loaded from: classes4.dex */
    public static final class C5672e<T1, T2, T3, T4, T5, T6, R> implements InterfaceC23488k<T1, T2, T3, T4, T5, T6, R> {

        /* renamed from: a */
        public final /* synthetic */ D00.C1269a f25099a;

        public C5672e(D00.C1269a c1269a) {
            this.f25099a = c1269a;
        }

        @Override // io.reactivex.functions.InterfaceC23488k
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            boolean booleanValue = ((Boolean) t6).booleanValue();
            boolean booleanValue2 = ((Boolean) t5).booleanValue();
            Optional<Integer> optional = (Optional) t3;
            Optional<Integer> optional2 = (Optional) t2;
            Optional<Integer> optional3 = (Optional) t1;
            return (R) this.f25099a.m111166a(optional3, optional2, optional, (Optional) t4, booleanValue2, booleanValue);
        }
    }

    public C34755Nl1(C22454gl preference, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f25092a = preference;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f25093b = C37791a94.C10586a.create$default(c10586a, new BountyBirdsFilter(null, null, null, null, null, false, 63, null), null, 2, null);
        this.f25094c = C37791a94.C10586a.create$default(c10586a, new BountyBirdsFilter(null, null, null, null, null, false, 63, null), null, 2, null);
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(reactiveConfig.m82714X2(), reactiveConfig.m82754T2(), reactiveConfig.m82734V2(), reactiveConfig.m82774R2(), reactiveConfig.m82453v3(), reactiveConfig.m82873H3(), new C5672e(D00.f5015g));
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        final C5668a c5668a = C5668a.f25095g;
        Observable map = combineLatest.map(new InterfaceC23492o() { // from class: Jl1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m93491e;
                m93491e = C34755Nl1.m93491e(Function1.this, obj);
                return m93491e;
            }
        });
        final C5669b c5669b = new C5669b();
        Observable doOnNext = map.doOnNext(new InterfaceC23484g() { // from class: Kl1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34755Nl1.m93490f(Function1.this, obj);
            }
        });
        final C5670c c5670c = new C5670c();
        Observable map2 = doOnNext.map(new InterfaceC23492o() { // from class: Ll1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BountyBirdsFilter m93489g;
                m93489g = C34755Nl1.m93489g(Function1.this, obj);
                return m93489g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "Observables.combineLates…ilter() ?: filter\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = map2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5671d c5671d = new C5671d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ml1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34755Nl1.m93488h(Function1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public static final Triple m93491e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m93490f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final BountyBirdsFilter m93489g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BountyBirdsFilter) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m93488h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public C37791a94<BountyBirdsFilter> m93487i() {
        return this.f25093b;
    }

    /* renamed from: j */
    public C37791a94<BountyBirdsFilter> m93486j() {
        return this.f25094c;
    }
}
