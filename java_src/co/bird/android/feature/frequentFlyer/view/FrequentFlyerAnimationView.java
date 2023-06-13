package co.bird.android.feature.frequentFlyer.view;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.feature.frequentFlyer.view.AbstractC14860a;
import co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0014\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000J\f\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0002J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\nH\u0002J\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\nH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "", "level", "Lio/reactivex/c;", "G", "LrD2;", "view", "", "N", "Lco/bird/android/feature/frequentFlyer/view/a;", "P", "Lio/reactivex/F;", "O", "M", "", "fileName", "L", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FrequentFlyerAnimationView extends LottieAnimationView {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LrD2;", "kotlin.jvm.PlatformType", "composition", "", C17296a.f69688o, "(LrD2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$a */
    /* loaded from: classes3.dex */
    public static final class C14853a extends Lambda implements Function1<C47924rD2, Unit> {
        public C14853a() {
            super(1);
        }

        /* renamed from: a */
        public final void m58118a(C47924rD2 composition) {
            FrequentFlyerAnimationView frequentFlyerAnimationView = FrequentFlyerAnimationView.this;
            Intrinsics.checkNotNullExpressionValue(composition, "composition");
            frequentFlyerAnimationView.m58121N(composition, FrequentFlyerAnimationView.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47924rD2 c47924rD2) {
            m58118a(c47924rD2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LrD2;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LrD2;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$b */
    /* loaded from: classes3.dex */
    public static final class C14854b extends Lambda implements Function1<C47924rD2, InterfaceC23434B<? extends Long>> {

        /* renamed from: g */
        public static final C14854b f64035g = new C14854b();

        public C14854b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Long> invoke(C47924rD2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.interval(2L, TimeUnit.SECONDS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LrD2;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$c */
    /* loaded from: classes3.dex */
    public static final class C14855c extends Lambda implements Function1<Long, InterfaceC23447K<? extends C47924rD2>> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC14860a f64037h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14855c(AbstractC14860a abstractC14860a) {
            super(1);
            this.f64037h = abstractC14860a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C47924rD2> invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return FrequentFlyerAnimationView.this.m58122M(this.f64037h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LrD2;", "kotlin.jvm.PlatformType", "composition", "", C17296a.f69688o, "(LrD2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$d */
    /* loaded from: classes3.dex */
    public static final class C14856d extends Lambda implements Function1<C47924rD2, Unit> {
        public C14856d() {
            super(1);
        }

        /* renamed from: a */
        public final void m58116a(C47924rD2 composition) {
            FrequentFlyerAnimationView frequentFlyerAnimationView = FrequentFlyerAnimationView.this;
            Intrinsics.checkNotNullExpressionValue(composition, "composition");
            frequentFlyerAnimationView.m58121N(composition, FrequentFlyerAnimationView.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47924rD2 c47924rD2) {
            m58116a(c47924rD2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LrD2;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$e */
    /* loaded from: classes3.dex */
    public static final class C14857e extends Lambda implements Function1<InterfaceC23444H<C47924rD2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f64040h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$e$a */
        /* loaded from: classes3.dex */
        public static final class C14858a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C47924rD2> f64041g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14858a(InterfaceC23444H<C47924rD2> interfaceC23444H) {
                super(1);
                this.f64041g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f64041g.onError(new IOException("Error loading Lottie animation.", throwable));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LrD2;", "composition", "", C17296a.f69688o, "(LrD2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.frequentFlyer.view.FrequentFlyerAnimationView$e$b */
        /* loaded from: classes3.dex */
        public static final class C14859b extends Lambda implements Function1<C47924rD2, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C47924rD2> f64042g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14859b(InterfaceC23444H<C47924rD2> interfaceC23444H) {
                super(1);
                this.f64042g = interfaceC23444H;
            }

            /* renamed from: a */
            public final void m58105a(C47924rD2 composition) {
                Intrinsics.checkNotNullParameter(composition, "composition");
                this.f64042g.onSuccess(composition);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C47924rD2 c47924rD2) {
                m58105a(c47924rD2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14857e(String str) {
            super(1);
            this.f64040h = str;
        }

        /* renamed from: f */
        public static final void m58110f(Function1 tmp0, C47924rD2 c47924rD2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(c47924rD2);
        }

        /* renamed from: g */
        public static final void m58109g(Function1 tmp0, Throwable th) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(th);
        }

        /* renamed from: h */
        public static final void m58108h(C39632dE2 c39632dE2, final Function1 successListener, final Function1 failureListener) {
            Intrinsics.checkNotNullParameter(successListener, "$successListener");
            Intrinsics.checkNotNullParameter(failureListener, "$failureListener");
            c39632dE2.m44502j(new VD2() { // from class: Nz1
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    FrequentFlyerAnimationView.C14857e.m58107i(Function1.this, (C47924rD2) obj);
                }
            });
            c39632dE2.m44503i(new VD2() { // from class: Oz1
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    FrequentFlyerAnimationView.C14857e.m58106j(Function1.this, (Throwable) obj);
                }
            });
        }

        /* renamed from: i */
        public static final void m58107i(Function1 tmp0, C47924rD2 c47924rD2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(c47924rD2);
        }

        /* renamed from: j */
        public static final void m58106j(Function1 tmp0, Throwable th) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(th);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<C47924rD2> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<C47924rD2> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final C14859b c14859b = new C14859b(emitter);
            final C14858a c14858a = new C14858a(emitter);
            final C39632dE2<C47924rD2> m115977j = AD2.m115977j(FrequentFlyerAnimationView.this.getContext(), this.f64040h);
            m115977j.m44508d(new VD2() { // from class: Kz1
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    FrequentFlyerAnimationView.C14857e.m58110f(Function1.this, (C47924rD2) obj);
                }
            });
            m115977j.m44509c(new VD2() { // from class: Lz1
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    FrequentFlyerAnimationView.C14857e.m58109g(Function1.this, (Throwable) obj);
                }
            });
            emitter.mo4878a(new InterfaceC23483f() { // from class: Mz1
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    FrequentFlyerAnimationView.C14857e.m58108h(C39632dE2.this, c14859b, c14858a);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerAnimationView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: H */
    public static final void m58127H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23434B m58126I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m58125J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m58124K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final AbstractC23461c m58128G(int i) {
        AbstractC14860a m58119P = m58119P(i);
        if (m58119P == null) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        AbstractC23442F<C47924rD2> m58120O = m58120O(m58119P);
        final C14853a c14853a = new C14853a();
        AbstractC23442F<C47924rD2> m33101w = m58120O.m33101w(new InterfaceC23484g() { // from class: Gz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FrequentFlyerAnimationView.m58127H(Function1.this, obj);
            }
        });
        final C14854b c14854b = C14854b.f64035g;
        Observable observeOn = m33101w.m33162D(new InterfaceC23492o() { // from class: Hz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m58126I;
                m58126I = FrequentFlyerAnimationView.m58126I(Function1.this, obj);
                return m58126I;
            }
        }).observeOn(C23454a.m33087a());
        final C14855c c14855c = new C14855c(m58119P);
        Observable flatMapSingle = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: Iz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m58125J;
                m58125J = FrequentFlyerAnimationView.m58125J(Function1.this, obj);
                return m58125J;
            }
        });
        final C14856d c14856d = new C14856d();
        AbstractC23461c ignoreElements = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: Jz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FrequentFlyerAnimationView.m58124K(Function1.this, obj);
            }
        }).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements, "fun animate(level: Int):…    .ignoreElements()\n  }");
        return ignoreElements;
    }

    /* renamed from: L */
    public final AbstractC23442F<C47924rD2> m58123L(String str) {
        return C45832nh5.m23305k(new C14857e(str));
    }

    /* renamed from: M */
    public final AbstractC23442F<C47924rD2> m58122M(AbstractC14860a abstractC14860a) {
        return m58123L(abstractC14860a.m58102a());
    }

    /* renamed from: N */
    public final void m58121N(C47924rD2 c47924rD2, FrequentFlyerAnimationView view) {
        Intrinsics.checkNotNullParameter(c47924rD2, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setComposition(c47924rD2);
        view.m53539y();
    }

    /* renamed from: O */
    public final AbstractC23442F<C47924rD2> m58120O(AbstractC14860a abstractC14860a) {
        return m58123L(abstractC14860a.m58101b());
    }

    /* renamed from: P */
    public final AbstractC14860a m58119P(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AbstractC14860a.C14863c.f64050c;
                }
                return AbstractC14860a.C14861a.f64048c;
            }
            return AbstractC14860a.C14864d.f64051c;
        }
        return AbstractC14860a.C14862b.f64049c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
