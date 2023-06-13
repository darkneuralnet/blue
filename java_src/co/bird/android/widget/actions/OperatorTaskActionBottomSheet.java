package co.bird.android.widget.actions;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.actions.OperatorTaskActionBottomSheet;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+B!\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b'\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ8\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000bR(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006/"}, m28432d2 = {"Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;", "Landroid/widget/FrameLayout;", "", "s", "onAttachedToWindow", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/BirdAction;", "k", "Lco/bird/android/model/wire/WireBird;", "bird", "q", "", "showChirp", "showLockUnlock", "showCancelTask", "showRemoveFromList", "showFlightSheet", "r", "visible", "v", "Landroid/animation/ValueAnimator;", "value", "b", "Landroid/animation/ValueAnimator;", "t", "(Landroid/animation/ValueAnimator;)V", "alphaAnimator", "c", "u", "yAnimator", DateTokenConverter.CONVERTER_KEY, "Z", "lock", "LUZ;", "e", "LUZ;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OperatorTaskActionBottomSheet extends FrameLayout {

    /* renamed from: b */
    public ValueAnimator f67748b;

    /* renamed from: c */
    public ValueAnimator f67749c;

    /* renamed from: d */
    public boolean f67750d;

    /* renamed from: e */
    public final C8311UZ f67751e;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/widget/actions/OperatorTaskActionBottomSheet$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC16620a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC16620a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            OperatorTaskActionBottomSheet.this.f67751e.f37537b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            OperatorTaskActionBottomSheet.this.f67751e.f37537b.setTranslationY(OperatorTaskActionBottomSheet.this.f67751e.f37537b.getMeasuredHeight() + 20.0f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/BirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/BirdAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$b */
    /* loaded from: classes4.dex */
    public static final class C16621b extends Lambda implements Function1<Unit, BirdAction> {

        /* renamed from: g */
        public static final C16621b f67753g = new C16621b();

        public C16621b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdAction invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BirdAction.ALARM;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/BirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/BirdAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C16622c extends Lambda implements Function1<Unit, BirdAction> {
        public C16622c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdAction invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (OperatorTaskActionBottomSheet.this.f67750d) {
                return BirdAction.LOCK;
            }
            return BirdAction.UNLOCK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/BirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/BirdAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C16623d extends Lambda implements Function1<Unit, BirdAction> {

        /* renamed from: g */
        public static final C16623d f67755g = new C16623d();

        public C16623d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdAction invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BirdAction.CANCEL_TASK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/BirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/BirdAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C16624e extends Lambda implements Function1<Unit, BirdAction> {

        /* renamed from: g */
        public static final C16624e f67756g = new C16624e();

        public C16624e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdAction invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BirdAction.REMOVE_FROM_LIST;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/BirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/BirdAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.OperatorTaskActionBottomSheet$f */
    /* loaded from: classes4.dex */
    public static final class C16625f extends Lambda implements Function1<Unit, BirdAction> {

        /* renamed from: g */
        public static final C16625f f67757g = new C16625f();

        public C16625f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdAction invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BirdAction.FLIGHT_SHEET;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorTaskActionBottomSheet(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67750d = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C8311UZ m81345b = C8311UZ.m81345b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81345b, "inflate(context.layoutInflater, this)");
        this.f67751e = m81345b;
        m81345b.f37544i.setOnClickListener(new View.OnClickListener() { // from class: Hu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OperatorTaskActionBottomSheet.m54313j(OperatorTaskActionBottomSheet.this, view);
            }
        });
        m81345b.f37544i.setAlpha(0.0f);
        m81345b.f37544i.setVisibility(8);
        m81345b.f37537b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC16620a());
    }

    public static /* synthetic */ void configureOptionsToShow$default(OperatorTaskActionBottomSheet operatorTaskActionBottomSheet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        operatorTaskActionBottomSheet.m54305r(z, z2, z3, z4, z5);
    }

    /* renamed from: j */
    public static final void m54313j(OperatorTaskActionBottomSheet this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54301v(false);
    }

    /* renamed from: l */
    public static final BirdAction m54311l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdAction) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final BirdAction m54310m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdAction) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final BirdAction m54309n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdAction) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final BirdAction m54308o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdAction) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final BirdAction m54307p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdAction) tmp0.invoke(obj);
    }

    public static /* synthetic */ void showOptions$default(OperatorTaskActionBottomSheet operatorTaskActionBottomSheet, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        operatorTaskActionBottomSheet.m54301v(z);
    }

    /* renamed from: w */
    public static final void m54300w(final boolean z, final OperatorTaskActionBottomSheet this$0) {
        float f;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float f2 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            this$0.f67751e.f37544i.setVisibility(0);
        }
        this$0.m54303t(ValueAnimator.ofFloat(this$0.f67751e.f37544i.getAlpha(), f));
        ValueAnimator valueAnimator = this$0.f67748b;
        if (valueAnimator != null) {
            valueAnimator.setDuration(300L);
        }
        ValueAnimator valueAnimator2 = this$0.f67748b;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ou3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    OperatorTaskActionBottomSheet.m54299x(OperatorTaskActionBottomSheet.this, z, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this$0.f67748b;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        if (!z) {
            f2 = this$0.f67751e.f37537b.getMeasuredHeight();
        }
        this$0.m54302u(ValueAnimator.ofFloat(this$0.f67751e.f37537b.getTranslationY(), f2));
        ValueAnimator valueAnimator4 = this$0.f67749c;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(300L);
        }
        ValueAnimator valueAnimator5 = this$0.f67749c;
        if (valueAnimator5 != null) {
            valueAnimator5.setInterpolator(D62.f5248e.mo110910b());
        }
        ValueAnimator valueAnimator6 = this$0.f67749c;
        if (valueAnimator6 != null) {
            valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Pu3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                    OperatorTaskActionBottomSheet.m54298y(OperatorTaskActionBottomSheet.this, valueAnimator7);
                }
            });
        }
        ValueAnimator valueAnimator7 = this$0.f67749c;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
    }

    /* renamed from: x */
    public static final void m54299x(OperatorTaskActionBottomSheet this$0, boolean z, ValueAnimator anim) {
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        View view = this$0.f67751e.f37544i;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
        if (this$0.f67751e.f37544i.getAlpha() == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !z) {
            this$0.f67751e.f37544i.setVisibility(8);
        }
    }

    /* renamed from: y */
    public static final void m54298y(OperatorTaskActionBottomSheet this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        LinearLayout linearLayout = this$0.f67751e.f37537b;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setTranslationY(((Float) animatedValue).floatValue());
    }

    /* renamed from: k */
    public final Observable<BirdAction> m54312k() {
        List listOf;
        TextView textView = this.f67751e.f37539d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.chirpAlarm");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
        final C16621b c16621b = C16621b.f67753g;
        TextView textView2 = this.f67751e.f37542g;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.lockUnlock");
        Observable clicksThrottle$default2 = C44626lf5.clicksThrottle$default(textView2, 0L, 1, null);
        final C16622c c16622c = new C16622c();
        TextView textView3 = this.f67751e.f37538c;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.cancelTask");
        Observable clicksThrottle$default3 = C44626lf5.clicksThrottle$default(textView3, 0L, 1, null);
        final C16623d c16623d = C16623d.f67755g;
        TextView textView4 = this.f67751e.f37543h;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.removeFromList");
        Observable clicksThrottle$default4 = C44626lf5.clicksThrottle$default(textView4, 0L, 1, null);
        final C16624e c16624e = C16624e.f67756g;
        TextView textView5 = this.f67751e.f37540e;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.flightSheet");
        Observable clicksThrottle$default5 = C44626lf5.clicksThrottle$default(textView5, 0L, 1, null);
        final C16625f c16625f = C16625f.f67757g;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{clicksThrottle$default.map(new InterfaceC23492o() { // from class: Ju3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdAction m54311l;
                m54311l = OperatorTaskActionBottomSheet.m54311l(Function1.this, obj);
                return m54311l;
            }
        }), clicksThrottle$default2.map(new InterfaceC23492o() { // from class: Ku3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdAction m54310m;
                m54310m = OperatorTaskActionBottomSheet.m54310m(Function1.this, obj);
                return m54310m;
            }
        }), clicksThrottle$default3.map(new InterfaceC23492o() { // from class: Lu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdAction m54309n;
                m54309n = OperatorTaskActionBottomSheet.m54309n(Function1.this, obj);
                return m54309n;
            }
        }), clicksThrottle$default4.map(new InterfaceC23492o() { // from class: Mu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdAction m54308o;
                m54308o = OperatorTaskActionBottomSheet.m54308o(Function1.this, obj);
                return m54308o;
            }
        }), clicksThrottle$default5.map(new InterfaceC23492o() { // from class: Nu3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdAction m54307p;
                m54307p = OperatorTaskActionBottomSheet.m54307p(Function1.this, obj);
                return m54307p;
            }
        })});
        Observable<BirdAction> merge = Observable.merge(listOf);
        Intrinsics.checkNotNullExpressionValue(merge, "fun actionsClick(): Obse…SHEET }\n      )\n    )\n  }");
        return merge;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m54304s();
    }

    /* renamed from: q */
    public final void m54306q(WireBird bird) {
        String string;
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f67750d = !bird.getLocked();
        TextView textView = this.f67751e.f37542g;
        if (bird.getLocked()) {
            string = getContext().getString(C45871nl4.operator_task_action_unlock);
        } else {
            string = getContext().getString(C45871nl4.operator_task_action_lock);
        }
        textView.setText(string);
    }

    /* renamed from: r */
    public final void m54305r(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        TextView textView = this.f67751e.f37539d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.chirpAlarm");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f67751e.f37542g;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.lockUnlock");
        C49520tu6.show$default(textView2, z2, 0, 2, null);
        TextView textView3 = this.f67751e.f37538c;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.cancelTask");
        C49520tu6.show$default(textView3, z3, 0, 2, null);
        TextView textView4 = this.f67751e.f37543h;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.removeFromList");
        C49520tu6.show$default(textView4, z4, 0, 2, null);
        TextView textView5 = this.f67751e.f37540e;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.flightSheet");
        C49520tu6.show$default(textView5, z5, 0, 2, null);
    }

    /* renamed from: s */
    public final void m54304s() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
        setLayoutParams(layoutParams);
        invalidate();
    }

    /* renamed from: t */
    public final void m54303t(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f67748b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f67748b = valueAnimator;
    }

    /* renamed from: u */
    public final void m54302u(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f67749c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f67749c = valueAnimator;
    }

    /* renamed from: v */
    public final void m54301v(final boolean z) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Iu3
            @Override // java.lang.Runnable
            public final void run() {
                OperatorTaskActionBottomSheet.m54300w(z, this);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorTaskActionBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67750d = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C8311UZ m81345b = C8311UZ.m81345b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81345b, "inflate(context.layoutInflater, this)");
        this.f67751e = m81345b;
        m81345b.f37544i.setOnClickListener(new View.OnClickListener() { // from class: Hu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OperatorTaskActionBottomSheet.m54313j(OperatorTaskActionBottomSheet.this, view);
            }
        });
        m81345b.f37544i.setAlpha(0.0f);
        m81345b.f37544i.setVisibility(8);
        m81345b.f37537b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC16620a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorTaskActionBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67750d = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C8311UZ m81345b = C8311UZ.m81345b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81345b, "inflate(context.layoutInflater, this)");
        this.f67751e = m81345b;
        m81345b.f37544i.setOnClickListener(new View.OnClickListener() { // from class: Hu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OperatorTaskActionBottomSheet.m54313j(OperatorTaskActionBottomSheet.this, view);
            }
        });
        m81345b.f37544i.setAlpha(0.0f);
        m81345b.f37544i.setVisibility(8);
        m81345b.f37537b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC16620a());
    }
}
