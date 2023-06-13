package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ridertutorial.widget.CircleIndicatorView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireRiderTutorialStep;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23444H;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import p000.C39843db5;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002m.B\u0019\u0012\u0006\u0010i\u001a\u00020h\u0012\b\b\u0002\u0010j\u001a\u00020(¢\u0006\u0004\bk\u0010lJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J0\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016R\u0016\u00100\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010IR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010[\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u001e0\u001e0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010/R\u0018\u0010g\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010/¨\u0006n"}, m28432d2 = {"Ldb5;", "LxE;", "LZa5;", "Lco/bird/android/model/wire/WireRiderTutorialStep;", "tutorialStep", "", "Xl", "cm", "LrD2;", "startComposition", "Lio/reactivex/F;", "Vl", "", "fileName", "Wl", "composition", "", "progressStart", "progressEnd", "bm", "dm", "em", "x0", "y0", "x1", "y1", "x", "Tl", "Ul", "Sl", "", "numSteps", "c7", "y3", "ih", "Lio/reactivex/Observable;", "u", "hc", "xi", "yd", "Landroid/view/View;", "aboveIndicatorView", "belowIndicatorView", "", "Ma", "next", "b", "Landroid/view/View;", "rootView", "Lcom/airbnb/lottie/LottieAnimationView;", "c", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieGallery", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "title", "e", "subtitle", "f", "body", "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;", "g", "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;", "indicator", "Landroid/widget/Button;", "h", "Landroid/widget/Button;", "nextButton", "i", "closeButton", "Landroid/widget/FrameLayout;", "j", "Landroid/widget/FrameLayout;", "viewPagerTopContainer", "k", "viewPagerBottomContainer", "Landroid/widget/RelativeLayout;", "l", "Landroid/widget/RelativeLayout;", "viewPagerPage", "m", "buttonContainer", "Landroid/content/Context;", "n", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "o", "Lio/reactivex/subjects/a;", "selectedStepSubject", "Landroid/graphics/Matrix;", "p", "Landroid/graphics/Matrix;", "scaledMatrix", "Lio/reactivex/disposables/c;", "q", "Lio/reactivex/disposables/c;", "currentAnimation", "r", "mostRecentTopView", "s", "mostRecentBottomView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "contentView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: db5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39843db5 extends AbstractC30071xE implements InterfaceC37468Za5 {

    /* renamed from: b */
    public View f76826b;

    /* renamed from: c */
    public LottieAnimationView f76827c;

    /* renamed from: d */
    public TextView f76828d;

    /* renamed from: e */
    public TextView f76829e;

    /* renamed from: f */
    public TextView f76830f;

    /* renamed from: g */
    public CircleIndicatorView f76831g;

    /* renamed from: h */
    public Button f76832h;

    /* renamed from: i */
    public Button f76833i;

    /* renamed from: j */
    public final FrameLayout f76834j;

    /* renamed from: k */
    public final FrameLayout f76835k;

    /* renamed from: l */
    public final RelativeLayout f76836l;

    /* renamed from: m */
    public final FrameLayout f76837m;

    /* renamed from: n */
    public final Context f76838n;

    /* renamed from: o */
    public final C24552a<Integer> f76839o;

    /* renamed from: p */
    public Matrix f76840p;

    /* renamed from: q */
    public InterfaceC23465c f76841q;

    /* renamed from: r */
    public View f76842r;

    /* renamed from: s */
    public View f76843s;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\u000f"}, m28432d2 = {"Ldb5$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDown", "onSingleTapUp", "e1", "e2", "", "velocityX", "velocityY", "onFling", "<init>", "(Ldb5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: db5$a */
    /* loaded from: classes2.dex */
    public final class C19798a extends GestureDetector.SimpleOnGestureListener {
        public C19798a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
            boolean z;
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            boolean z2 = false;
            if (Math.abs(f) < Math.abs(f2)) {
                return false;
            }
            if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (C39843db5.this.f76827c.getLayoutDirection() == 1) {
                z2 = true;
            }
            if (z ^ z2) {
                C39843db5.this.m44056cm();
            } else {
                C39843db5.this.next();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (C39843db5.this.f76827c.getLayoutDirection() == 1) {
                if (e.getX() < C39843db5.this.f76827c.getWidth() * 0.6f) {
                    C39843db5.this.next();
                } else {
                    C39843db5.this.m44056cm();
                }
            } else if (e.getX() > C39843db5.this.f76827c.getWidth() * 0.39999998f) {
                C39843db5.this.next();
            } else {
                C39843db5.this.m44056cm();
            }
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Ldb5$b;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "onTouch", "Landroid/view/GestureDetector;", "b", "Landroid/view/GestureDetector;", "gestureDetector", "", "c", "Ljava/lang/Float;", "downX", "<init>", "(Ldb5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: db5$b */
    /* loaded from: classes2.dex */
    public final class View$OnTouchListenerC19799b implements View.OnTouchListener {

        /* renamed from: b */
        public final GestureDetector f76845b;

        /* renamed from: c */
        public Float f76846c;

        public View$OnTouchListenerC19799b() {
            this.f76845b = new GestureDetector(C39843db5.this.getActivity(), new C19798a());
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            float f;
            boolean z;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f76846c != null) {
                        float x = event.getX();
                        Float f2 = this.f76846c;
                        Intrinsics.checkNotNull(f2);
                        f = x - f2.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    if (Math.abs(f) >= C39843db5.this.f76827c.getWidth() * 0.5f) {
                        boolean z2 = false;
                        if (f < 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (C39843db5.this.f76827c.getLayoutDirection() == 1) {
                            z2 = true;
                        }
                        if (z ^ z2) {
                            C39843db5.this.next();
                        } else {
                            C39843db5.this.m44056cm();
                        }
                        return true;
                    }
                }
            } else {
                this.f76846c = Float.valueOf(event.getX());
            }
            return this.f76845b.onTouchEvent(event);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LrD2;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: db5$c */
    /* loaded from: classes2.dex */
    public static final class C19800c extends Lambda implements Function1<InterfaceC23444H<C47924rD2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f76849h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: db5$c$a */
        /* loaded from: classes2.dex */
        public static final class C19801a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C47924rD2> f76850g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19801a(InterfaceC23444H<C47924rD2> interfaceC23444H) {
                super(1);
                this.f76850g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f76850g.onError(new IOException("Error loading Lottie animation.", throwable));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LrD2;", "composition", "", C17296a.f69688o, "(LrD2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: db5$c$b */
        /* loaded from: classes2.dex */
        public static final class C19802b extends Lambda implements Function1<C47924rD2, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C47924rD2> f76851g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19802b(InterfaceC23444H<C47924rD2> interfaceC23444H) {
                super(1);
                this.f76851g = interfaceC23444H;
            }

            /* renamed from: a */
            public final void m44037a(C47924rD2 composition) {
                Intrinsics.checkNotNullParameter(composition, "composition");
                this.f76851g.onSuccess(composition);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C47924rD2 c47924rD2) {
                m44037a(c47924rD2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19800c(String str) {
            super(1);
            this.f76849h = str;
        }

        /* renamed from: f */
        public static final void m44042f(Function1 tmp0, C47924rD2 c47924rD2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(c47924rD2);
        }

        /* renamed from: g */
        public static final void m44041g(Function1 tmp0, Throwable th) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(th);
        }

        /* renamed from: h */
        public static final void m44040h(C39632dE2 c39632dE2, final Function1 successListener, final Function1 failureListener) {
            Intrinsics.checkNotNullParameter(successListener, "$successListener");
            Intrinsics.checkNotNullParameter(failureListener, "$failureListener");
            c39632dE2.m44502j(new VD2() { // from class: hb5
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    C39843db5.C19800c.m44039i(Function1.this, (C47924rD2) obj);
                }
            });
            c39632dE2.m44503i(new VD2() { // from class: ib5
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    C39843db5.C19800c.m44038j(Function1.this, (Throwable) obj);
                }
            });
        }

        /* renamed from: i */
        public static final void m44039i(Function1 tmp0, C47924rD2 c47924rD2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(c47924rD2);
        }

        /* renamed from: j */
        public static final void m44038j(Function1 tmp0, Throwable th) {
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
            final C19802b c19802b = new C19802b(emitter);
            final C19801a c19801a = new C19801a(emitter);
            Context context = C39843db5.this.f76838n;
            String str = this.f76849h;
            final C39632dE2<C47924rD2> m115977j = AD2.m115977j(context, "lottie/ridertutorial/" + str + ".json");
            m115977j.m44508d(new VD2() { // from class: eb5
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    C39843db5.C19800c.m44042f(Function1.this, (C47924rD2) obj);
                }
            });
            m115977j.m44509c(new VD2() { // from class: fb5
                @Override // p000.VD2
                public final void onResult(Object obj) {
                    C39843db5.C19800c.m44041g(Function1.this, (Throwable) obj);
                }
            });
            emitter.mo4878a(new InterfaceC23483f() { // from class: gb5
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    C39843db5.C19800c.m44040h(C39632dE2.this, c19802b, c19801a);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LrD2;", "kotlin.jvm.PlatformType", "composition", "", C17296a.f69688o, "(LrD2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: db5$d */
    /* loaded from: classes2.dex */
    public static final class C19803d extends Lambda implements Function1<C47924rD2, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireRiderTutorialStep f76853h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19803d(WireRiderTutorialStep wireRiderTutorialStep) {
            super(1);
            this.f76853h = wireRiderTutorialStep;
        }

        /* renamed from: a */
        public final void m44036a(C47924rD2 composition) {
            C49520tu6.m11233r(C39843db5.this.f76827c);
            C39843db5 c39843db5 = C39843db5.this;
            Intrinsics.checkNotNullExpressionValue(composition, "composition");
            c39843db5.m44058bm(composition, this.f76853h.getProgressStart(), this.f76853h.getProgressLoopEnd());
            C39843db5.this.m44054em(this.f76853h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47924rD2 c47924rD2) {
            m44036a(c47924rD2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LrD2;", "composition", "Lio/reactivex/B;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LrD2;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: db5$e */
    /* loaded from: classes2.dex */
    public static final class C19804e extends Lambda implements Function1<C47924rD2, InterfaceC23434B<? extends Pair<? extends Long, ? extends C47924rD2>>> {

        /* renamed from: g */
        public final /* synthetic */ WireRiderTutorialStep f76854g;

        /* renamed from: h */
        public final /* synthetic */ C39843db5 f76855h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19804e(WireRiderTutorialStep wireRiderTutorialStep, C39843db5 c39843db5) {
            super(1);
            this.f76854g = wireRiderTutorialStep;
            this.f76855h = c39843db5;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Pair<Long, C47924rD2>> invoke(C47924rD2 composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            long delayLoopStart = 1000 * this.f76854g.getDelayLoopStart();
            C24523e c24523e = C24523e.f91168a;
            Observable<Long> interval = Observable.interval((composition.m16220d() * (this.f76854g.getProgressLoopEnd() - this.f76854g.getProgressStart())) + delayLoopStart, (composition.m16220d() * (this.f76854g.getProgressLoopEnd() - this.f76854g.getProgressLoopStart())) + delayLoopStart, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(interval, "interval(duration + loop…s, TimeUnit.MILLISECONDS)");
            Observable m33123k0 = this.f76855h.m44064Vl(composition, this.f76854g).m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "loopLottieComposition(co…orialStep).toObservable()");
            return c24523e.m31956a(interval, m33123k0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "LrD2;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: db5$f */
    /* loaded from: classes2.dex */
    public static final class C19805f extends Lambda implements Function1<Pair<? extends Long, ? extends C47924rD2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireRiderTutorialStep f76857h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19805f(WireRiderTutorialStep wireRiderTutorialStep) {
            super(1);
            this.f76857h = wireRiderTutorialStep;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Long, ? extends C47924rD2> pair) {
            invoke2((Pair<Long, ? extends C47924rD2>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Long, ? extends C47924rD2> pair) {
            C47924rD2 composition = pair.component2();
            C39843db5 c39843db5 = C39843db5.this;
            Intrinsics.checkNotNullExpressionValue(composition, "composition");
            c39843db5.m44058bm(composition, this.f76857h.getProgressLoopStart(), this.f76857h.getProgressLoopEnd());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C39843db5(BaseActivity baseActivity, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, view);
        if ((i & 2) != 0) {
            view = baseActivity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "activity.window.decorView");
        }
    }

    /* renamed from: Yl */
    public static final void m44061Yl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Zl */
    public static final InterfaceC23434B m44060Zl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: am */
    public static final void m44059am(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: Ma */
    public boolean mo44071Ma(View aboveIndicatorView, View belowIndicatorView) {
        boolean z;
        Intrinsics.checkNotNullParameter(aboveIndicatorView, "aboveIndicatorView");
        Intrinsics.checkNotNullParameter(belowIndicatorView, "belowIndicatorView");
        if (Intrinsics.areEqual(this.f76842r, aboveIndicatorView) && Intrinsics.areEqual(this.f76843s, belowIndicatorView)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f76834j.removeView(this.f76842r);
            this.f76835k.removeView(this.f76843s);
        }
        C49520tu6.m11239l(this.f76836l);
        C49520tu6.m11239l(this.f76837m);
        InterfaceC23465c interfaceC23465c = this.f76841q;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        if (!Intrinsics.areEqual(aboveIndicatorView.getParent(), this.f76834j)) {
            this.f76834j.addView(aboveIndicatorView);
        }
        if (!Intrinsics.areEqual(belowIndicatorView.getParent(), this.f76835k)) {
            this.f76835k.addView(belowIndicatorView);
        }
        C49520tu6.m11233r(aboveIndicatorView);
        C49520tu6.m11233r(belowIndicatorView);
        this.f76842r = aboveIndicatorView;
        this.f76843s = belowIndicatorView;
        return z;
    }

    /* renamed from: Sl */
    public final void m44067Sl() {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        int roundToInt5;
        float m44065Ul = m44065Ul();
        if (m44065Ul < 1.7777778f) {
            float m44066Tl = m44066Tl(1.7777778f, getActivity().getResources().getDimension(C37044Xf4.rider_tutorial_title_margin_top_16_9), 1.6666666f, getActivity().getResources().getDimension(C37044Xf4.rider_tutorial_title_margin_top_5_3), m44065Ul);
            ViewGroup.LayoutParams layoutParams = this.f76828d.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            roundToInt5 = MathKt__MathJVMKt.roundToInt(m44066Tl);
            marginLayoutParams.topMargin = Math.max(roundToInt5, 0);
            this.f76828d.setLayoutParams(marginLayoutParams);
            this.f76828d.requestLayout();
        } else if (m44065Ul > 1.7777778f) {
            Resources resources = getActivity().getResources();
            int i = C37044Xf4.rider_tutorial_next_button_margin_top_16_9;
            float dimension = resources.getDimension(i);
            Resources resources2 = getActivity().getResources();
            int i2 = C37044Xf4.rider_tutorial_next_button_margin_top_18_5_9;
            float dimension2 = resources2.getDimension(i2);
            float m44066Tl2 = m44066Tl(1.7777778f, dimension, 2.0555556f, dimension2, m44065Ul);
            ViewGroup.LayoutParams layoutParams2 = this.f76832h.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            roundToInt = MathKt__MathJVMKt.roundToInt(m44066Tl2);
            roundToInt2 = MathKt__MathJVMKt.roundToInt(dimension2);
            marginLayoutParams2.topMargin = Math.min(roundToInt, roundToInt2);
            this.f76832h.setLayoutParams(marginLayoutParams2);
            this.f76832h.requestLayout();
            float dimension3 = getActivity().getResources().getDimension(i);
            float dimension4 = getActivity().getResources().getDimension(i2);
            float m44066Tl3 = m44066Tl(1.7777778f, dimension3, 2.0555556f, dimension4, m44065Ul);
            ViewGroup.LayoutParams layoutParams3 = this.f76831g.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(m44066Tl3);
            roundToInt4 = MathKt__MathJVMKt.roundToInt(dimension4);
            marginLayoutParams3.topMargin = Math.min(roundToInt3, roundToInt4);
            this.f76831g.setLayoutParams(marginLayoutParams3);
            this.f76831g.requestLayout();
        }
    }

    /* renamed from: Tl */
    public final float m44066Tl(float f, float f2, float f3, float f4, float f5) {
        return (((f4 - f2) / (f3 - f)) * (f5 - f)) + f2;
    }

    /* renamed from: Ul */
    public final float m44065Ul() {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getRealSize(point);
        return point.y / point.x;
    }

    /* renamed from: Vl */
    public final AbstractC23442F<C47924rD2> m44064Vl(C47924rD2 c47924rD2, WireRiderTutorialStep wireRiderTutorialStep) {
        if (wireRiderTutorialStep.getLoopFileName() != null && !Intrinsics.areEqual(wireRiderTutorialStep.getLoopFileName(), wireRiderTutorialStep.getFileName())) {
            String loopFileName = wireRiderTutorialStep.getLoopFileName();
            Intrinsics.checkNotNull(loopFileName);
            return m44063Wl(loopFileName);
        }
        AbstractC23442F<C47924rD2> m33158H = AbstractC23442F.m33158H(c47924rD2);
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(startComposition)\n    }");
        return m33158H;
    }

    /* renamed from: Wl */
    public final AbstractC23442F<C47924rD2> m44063Wl(String str) {
        return C45832nh5.m23305k(new C19800c(str));
    }

    /* renamed from: Xl */
    public final void m44062Xl(WireRiderTutorialStep wireRiderTutorialStep) {
        String fileName = wireRiderTutorialStep.getFileName();
        Intrinsics.checkNotNull(fileName);
        AbstractC23442F<C47924rD2> m44063Wl = m44063Wl(fileName);
        final C19803d c19803d = new C19803d(wireRiderTutorialStep);
        AbstractC23442F<C47924rD2> m33101w = m44063Wl.m33101w(new InterfaceC23484g() { // from class: ab5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39843db5.m44061Yl(Function1.this, obj);
            }
        });
        final C19804e c19804e = new C19804e(wireRiderTutorialStep, this);
        Observable observeOn = m33101w.m33162D(new InterfaceC23492o() { // from class: bb5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m44060Zl;
                m44060Zl = C39843db5.m44060Zl(Function1.this, obj);
                return m44060Zl;
            }
        }).observeOn(C23454a.m33087a());
        final C19805f c19805f = new C19805f(wireRiderTutorialStep);
        this.f76841q = observeOn.subscribe(new InterfaceC23484g() { // from class: cb5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39843db5.m44059am(Function1.this, obj);
            }
        });
    }

    /* renamed from: bm */
    public final void m44058bm(C47924rD2 c47924rD2, float f, float f2) {
        this.f76827c.setComposition(c47924rD2);
        m44055dm();
        this.f76827c.setMinAndMaxProgress(f, f2);
        this.f76827c.m53539y();
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: c7 */
    public void mo44057c7(int i) {
        this.f76839o.onNext(0);
        this.f76831g.setNumCircles(i);
    }

    /* renamed from: cm */
    public final void m44056cm() {
        Integer value = this.f76839o.getValue();
        if (value != null && value.intValue() > 0) {
            this.f76839o.onNext(Integer.valueOf(value.intValue() - 1));
            this.f76831g.setSelectedIndex(value.intValue() - 1);
        }
    }

    /* renamed from: dm */
    public final void m44055dm() {
        if (this.f76840p == null && this.f76827c.getScaleType() == ImageView.ScaleType.MATRIX) {
            Matrix imageMatrix = this.f76827c.getImageMatrix();
            Intrinsics.checkNotNullExpressionValue(imageMatrix, "lottieGallery.imageMatrix");
            this.f76840p = imageMatrix;
            float intrinsicWidth = this.f76838n.getResources().getDisplayMetrics().widthPixels / this.f76827c.getDrawable().getIntrinsicWidth();
            Matrix matrix = this.f76840p;
            Matrix matrix2 = null;
            if (matrix == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scaledMatrix");
                matrix = null;
            }
            matrix.postScale(intrinsicWidth, intrinsicWidth);
            LottieAnimationView lottieAnimationView = this.f76827c;
            Matrix matrix3 = this.f76840p;
            if (matrix3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scaledMatrix");
            } else {
                matrix2 = matrix3;
            }
            lottieAnimationView.setImageMatrix(matrix2);
        }
    }

    /* renamed from: em */
    public final void m44054em(WireRiderTutorialStep wireRiderTutorialStep) {
        boolean z;
        boolean z2;
        this.f76828d.setText(wireRiderTutorialStep.getTitle());
        String subtitle = wireRiderTutorialStep.getSubtitle();
        boolean z3 = true;
        boolean z4 = false;
        if (subtitle != null && subtitle.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C49520tu6.m11239l(this.f76829e);
        } else {
            this.f76829e.setText(wireRiderTutorialStep.getSubtitle());
            C49520tu6.m11233r(this.f76829e);
        }
        this.f76830f.setText(wireRiderTutorialStep.getBody());
        String fileName = wireRiderTutorialStep.getFileName();
        if (fileName != null && fileName.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            if (m44065Ul() >= 1.7777778f) {
                z3 = false;
            }
            C43400jb5.m30213a(this.f76830f);
            z4 = z3;
        } else {
            C43400jb5.m30211c(this.f76830f);
        }
        C43400jb5.m30212b(this.f76830f, z4);
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: hc */
    public Observable<Unit> mo44053hc() {
        return C45219mf5.m25214a(this.f76833i);
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: ih */
    public void mo44052ih() {
        C49520tu6.m11239l(this.f76832h);
        C49520tu6.m11233r(this.f76833i);
    }

    @Override // p000.InterfaceC37468Za5
    public void next() {
        Integer value = this.f76839o.getValue();
        if (value != null && value.intValue() < this.f76831g.m59414a() - 1) {
            this.f76839o.onNext(Integer.valueOf(value.intValue() + 1));
            this.f76831g.setSelectedIndex(value.intValue() + 1);
        }
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: u */
    public Observable<Unit> mo44051u() {
        return C45219mf5.m25214a(this.f76832h);
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: xi */
    public Observable<Integer> mo44050xi() {
        Observable<Integer> hide = this.f76839o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "selectedStepSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: y3 */
    public void mo44049y3() {
        C49520tu6.m11233r(this.f76832h);
        C49520tu6.m11239l(this.f76833i);
    }

    @Override // p000.InterfaceC37468Za5
    /* renamed from: yd */
    public void mo44048yd(WireRiderTutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(tutorialStep, "tutorialStep");
        View view = this.f76842r;
        if (view != null) {
            C49520tu6.m11239l(view);
        }
        View view2 = this.f76843s;
        if (view2 != null) {
            C49520tu6.m11239l(view2);
        }
        C49520tu6.m11233r(this.f76836l);
        C49520tu6.m11233r(this.f76837m);
        InterfaceC23465c interfaceC23465c = this.f76841q;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        if (tutorialStep.getFileName() != null) {
            m44062Xl(tutorialStep);
            return;
        }
        C49520tu6.m11239l(this.f76827c);
        m44054em(tutorialStep);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39843db5(BaseActivity activity, View contentView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f76826b = C49520tu6.m11243h(contentView, C36585Vg4.riderTutorial);
        this.f76827c = (LottieAnimationView) C49520tu6.m11243h(contentView, C36585Vg4.lottieGallery);
        this.f76828d = (TextView) C49520tu6.m11243h(contentView, C36585Vg4.tutorialStepTitle);
        this.f76829e = (TextView) C49520tu6.m11243h(contentView, C36585Vg4.tutorialStepSubtitle);
        this.f76830f = (TextView) C49520tu6.m11243h(contentView, C36585Vg4.tutorialStepBody);
        this.f76831g = (CircleIndicatorView) C49520tu6.m11243h(contentView, C36585Vg4.indicator);
        this.f76832h = (Button) C49520tu6.m11243h(contentView, C36585Vg4.nextButton);
        this.f76833i = (Button) C49520tu6.m11243h(contentView, C36585Vg4.closeButton);
        this.f76834j = (FrameLayout) C49520tu6.m11243h(contentView, C36585Vg4.viewPagerPageTopContainer);
        this.f76835k = (FrameLayout) C49520tu6.m11243h(contentView, C36585Vg4.viewPagerPageBottomContainer);
        this.f76836l = (RelativeLayout) C49520tu6.m11243h(contentView, C36585Vg4.viewPagerPage);
        this.f76837m = (FrameLayout) C49520tu6.m11243h(contentView, C36585Vg4.buttonContainer);
        C24552a<Integer> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Int>()");
        this.f76839o = m31922e;
        Context context = this.f76827c.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "lottieGallery.context");
        this.f76838n = context;
        m44067Sl();
        this.f76826b.setOnTouchListener(new View$OnTouchListenerC19799b());
    }
}
