package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lnb6;", "", "", "e", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lqb6;", "c", "Lqb6;", "ui", "LZa6;", DateTokenConverter.CONVERTER_KEY, "LZa6;", "converter", "<init>", "(LTq4;Lcom/uber/autodispose/ScopeProvider;Lqb6;LZa6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksPresenter.kt\nco/bird/android/app/feature/settings/tweaks/TweaksPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,42:1\n180#2:43\n180#2:44\n*S KotlinDebug\n*F\n+ 1 TweaksPresenter.kt\nco/bird/android/app/feature/settings/tweaks/TweaksPresenter\n*L\n27#1:43\n35#1:44\n*E\n"})
/* renamed from: nb6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45773nb6 {

    /* renamed from: a */
    public final C36207Tq4 f100184a;

    /* renamed from: b */
    public final ScopeProvider f100185b;

    /* renamed from: c */
    public final InterfaceC47552qb6 f100186c;

    /* renamed from: d */
    public final InterfaceC37469Za6 f100187d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nb6$a */
    /* loaded from: classes2.dex */
    public static final class C26547a extends Lambda implements Function1<Pair<? extends Tweaks, ? extends String>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C26547a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<Tweaks, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C45773nb6.this.f100187d.mo64293a(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nb6$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26548b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26548b(Object obj) {
            super(1, obj, InterfaceC47552qb6.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC47552qb6) this.receiver).mo15713b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052>\u0010\u0004\u001a:\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LRa6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nb6$d */
    /* loaded from: classes2.dex */
    public static final class C26550d extends Lambda implements Function1<Pair<? extends C35597Ra6<?>, ? extends Tweaks>, Unit> {
        public C26550d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C35597Ra6<?>, ? extends Tweaks> pair) {
            invoke2((Pair<? extends C35597Ra6<?>, Tweaks>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C35597Ra6<?>, Tweaks> pair) {
            Tweaks tweaks = pair.component2();
            tweaks.updateTweak(pair.component1());
            C36207Tq4 c36207Tq4 = C45773nb6.this.f100184a;
            Intrinsics.checkNotNullExpressionValue(tweaks, "tweaks");
            c36207Tq4.m82622f9(tweaks);
        }
    }

    public C45773nb6(C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC47552qb6 ui, InterfaceC37469Za6 converter) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f100184a = reactiveConfig;
        this.f100185b = scopeProvider;
        this.f100186c = ui;
        this.f100187d = converter;
    }

    /* renamed from: f */
    public static final InterfaceC23447K m23465f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m23464g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final boolean m23463h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i */
    public static final void m23462i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m23466e() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f100184a.m82601h8(), this.f100186c.mo15712nk());
        final C26547a c26547a = new C26547a();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: jb6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m23465f;
                m23465f = C45773nb6.m23465f(Function1.this, obj);
                return m23465f;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onCreate() {\n    // …weaks(tweaks)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f100185b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26548b c26548b = new C26548b(this.f100186c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kb6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45773nb6.m23464g(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f100186c.mo15714I0(), this.f100184a.m82601h8());
        final C26549c c26549c = C26549c.f100189g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: lb6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m23463h;
                m23463h = C45773nb6.m23463h(Function1.this, obj);
                return m23463h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.tweakUpdates()\n      …pdatedTweak.value\n      }");
        Object m33094as2 = filter.m33094as(AutoDispose.m45239a(this.f100185b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26550d c26550d = new C26550d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: mb6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45773nb6.m23462i(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LRa6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nb6$c */
    /* loaded from: classes2.dex */
    public static final class C26549c extends Lambda implements Function1<Pair<? extends C35597Ra6<?>, ? extends Tweaks>, Boolean> {

        /* renamed from: g */
        public static final C26549c f100189g = new C26549c();

        public C26549c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends C35597Ra6<?>, Tweaks> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C35597Ra6<?> component1 = pair.component1();
            return Boolean.valueOf(!Intrinsics.areEqual(pair.component2().getTweak(component1.m86601c()).m86599e(), component1.m86599e()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C35597Ra6<?>, ? extends Tweaks> pair) {
            return invoke2((Pair<? extends C35597Ra6<?>, Tweaks>) pair);
        }
    }
}
