package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.SwipeUpToSubmitLayout;
import com.google.android.material.card.MaterialCardView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C43037iy5;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010C\u001a\u00020B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\b\b\u0002\u0010F\u001a\u00020*¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R*\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00109\u001a\u0004\b=\u0010>\"\u0004\b?\u0010;R\u0014\u0010A\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010%¨\u0006I"}, m28432d2 = {"Lco/bird/android/widget/SwipeUpToSubmitLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/MotionEvent;", "event", "", "j", "", "r", "m", "n", "", "s", "dragDistance", "w", "o", "t", "p", "h", "Lcom/google/android/material/card/MaterialCardView;", "b", "Lcom/google/android/material/card/MaterialCardView;", "cardContainer", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "contentContainer", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "swipeableAreaContainer", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "swipeIndicatorText", "f", "Lkotlin/Lazy;", "i", "()F", "defaultCardElevation", "g", "k", "draggingCardElevation", "", "I", "maxOverscroll", "submitDragDistance", "Ljava/lang/Float;", "swipeStartY", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnSubmitCallback", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitCallback", "(Lkotlin/jvm/functions/Function0;)V", "onSubmitCallback", "value", "l", "Z", "v", "(Z)V", "isDragging", "getSubmitEnabled", "()Z", "setSubmitEnabled", "submitEnabled", "textDefaultAlpha", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeUpToSubmitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeUpToSubmitLayout.kt\nco/bird/android/widget/SwipeUpToSubmitLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,221:1\n52#2,9:222\n262#3,2:231\n*S KotlinDebug\n*F\n+ 1 SwipeUpToSubmitLayout.kt\nco/bird/android/widget/SwipeUpToSubmitLayout\n*L\n63#1:222,9\n186#1:231,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SwipeUpToSubmitLayout extends ConstraintLayout {

    /* renamed from: b */
    public final MaterialCardView f67668b;

    /* renamed from: c */
    public final FrameLayout f67669c;

    /* renamed from: d */
    public final View f67670d;

    /* renamed from: e */
    public final TextView f67671e;

    /* renamed from: f */
    public final Lazy f67672f;

    /* renamed from: g */
    public final Lazy f67673g;

    /* renamed from: h */
    public final int f67674h;

    /* renamed from: i */
    public int f67675i;

    /* renamed from: j */
    public Float f67676j;

    /* renamed from: k */
    public Function0<Unit> f67677k;

    /* renamed from: l */
    public boolean f67678l;

    /* renamed from: m */
    public boolean f67679m;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SwipeUpToSubmitLayout$a */
    /* loaded from: classes4.dex */
    public static final class C16586a extends Lambda implements Function0<Float> {
        public C16586a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(C49520tu6.m11240k(SwipeUpToSubmitLayout.this, C37278Yf4.swipe_up_to_submit_content_elevation_normal));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SwipeUpToSubmitLayout$b */
    /* loaded from: classes4.dex */
    public static final class C16587b extends Lambda implements Function0<Float> {
        public C16587b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(C49520tu6.m11240k(SwipeUpToSubmitLayout.this, C37278Yf4.swipe_up_to_submit_content_elevation_dragging));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwipeUpToSubmitLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: g */
    public static final boolean m54375g(SwipeUpToSubmitLayout this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(event, "event");
        return this$0.m54365r(event);
    }

    /* renamed from: u */
    public static final void m54362u(SwipeUpToSubmitLayout this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(8);
        this$0.m54366p();
        Function0<Unit> function0 = this$0.f67677k;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: h */
    public final void m54374h() {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
        this.f67668b.animate().setInterpolator(decelerateInterpolator).alpha(1.0f).translationY(0.0f).start();
        this.f67670d.animate().alpha(m54370l()).setInterpolator(decelerateInterpolator).translationY(0.0f).start();
    }

    /* renamed from: i */
    public final float m54373i() {
        return ((Number) this.f67672f.getValue()).floatValue();
    }

    /* renamed from: j */
    public final float m54372j(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        Float f = this.f67676j;
        Intrinsics.checkNotNull(f);
        return y - f.floatValue();
    }

    /* renamed from: k */
    public final float m54371k() {
        return ((Number) this.f67673g.getValue()).floatValue();
    }

    /* renamed from: l */
    public final float m54370l() {
        return this.f67679m ? 1.0f : 0.75f;
    }

    /* renamed from: m */
    public final boolean m54369m(MotionEvent motionEvent) {
        this.f67676j = Float.valueOf(motionEvent.getY());
        if (this.f67679m) {
            m54361v(true);
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m54368n(MotionEvent motionEvent) {
        if (this.f67678l && this.f67679m) {
            m54364s(motionEvent);
            return true;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m54367o(MotionEvent motionEvent) {
        boolean z;
        if (!this.f67678l) {
            return false;
        }
        float m54372j = m54372j(motionEvent);
        if (m54372j < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && Math.abs(m54372j) >= this.f67675i) {
            m54363t();
        } else {
            m54374h();
        }
        m54361v(false);
        this.f67676j = null;
        return true;
    }

    /* renamed from: p */
    public final void m54366p() {
        MaterialCardView materialCardView = this.f67668b;
        materialCardView.setTranslationY(0.0f);
        materialCardView.setAlpha(1.0f);
        View view = this.f67670d;
        view.setTranslationY(0.0f);
        view.setAlpha(m54370l());
    }

    /* renamed from: r */
    public final boolean m54365r(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                return m54368n(motionEvent);
            }
            return m54367o(motionEvent);
        }
        return m54369m(motionEvent);
    }

    /* renamed from: s */
    public final void m54364s(MotionEvent motionEvent) {
        float m54372j = m54372j(motionEvent);
        if (m54372j <= 0.0f) {
            this.f67668b.setTranslationY(m54372j);
            this.f67670d.setTranslationY(0.75f * m54372j);
            m54360w(m54372j);
        }
    }

    public final void setOnSubmitCallback(Function0<Unit> function0) {
        this.f67677k = function0;
    }

    public final void setSubmitEnabled(boolean z) {
        if (this.f67679m == z) {
            return;
        }
        this.f67679m = z;
        if (!z) {
            m54361v(false);
            m54374h();
        }
    }

    /* renamed from: t */
    public final void m54363t() {
        this.f67668b.animate().setInterpolator(new AccelerateInterpolator(2.0f)).translationY(-this.f67668b.getHeight()).alpha(0.0f).withEndAction(new Runnable() { // from class: pX5
            @Override // java.lang.Runnable
            public final void run() {
                SwipeUpToSubmitLayout.m54362u(SwipeUpToSubmitLayout.this);
            }
        }).start();
    }

    /* renamed from: v */
    public final void m54361v(boolean z) {
        float m54373i;
        if (this.f67678l == z) {
            return;
        }
        this.f67678l = z;
        ViewPropertyAnimator animate = this.f67668b.animate();
        if (z) {
            m54373i = m54371k();
        } else {
            m54373i = m54373i();
        }
        animate.z(m54373i).setInterpolator(new AccelerateInterpolator(2.0f)).start();
    }

    /* renamed from: w */
    public final void m54360w(float f) {
        float abs = 1.0f - (Math.abs(f) / this.f67675i);
        if (abs >= 0.0f || abs <= 1.0f) {
            this.f67670d.setAlpha(abs);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwipeUpToSubmitLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SwipeUpToSubmitLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwipeUpToSubmitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16586a());
        this.f67672f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16587b());
        this.f67673g = lazy2;
        this.f67674h = C49520tu6.m11247d(this, 24);
        this.f67675i = Integer.MAX_VALUE;
        View.inflate(context, C45268mk4.view_swipe_up_to_submit, this);
        View findViewById = findViewById(C52955zi4.content_card_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.content_card_container)");
        MaterialCardView materialCardView = (MaterialCardView) findViewById;
        this.f67668b = materialCardView;
        View findViewById2 = findViewById(C52955zi4.content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.content_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f67669c = frameLayout;
        View findViewById3 = findViewById(C52955zi4.swipeable_area_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.swipeable_area_container)");
        this.f67670d = findViewById3;
        View findViewById4 = findViewById(C52955zi4.swipe_indicator_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.swipe_indicator_tv)");
        TextView textView = (TextView) findViewById4;
        this.f67671e = textView;
        int[] SwipeUpToSubmitLayout = C34290Ll4.SwipeUpToSubmitLayout;
        Intrinsics.checkNotNullExpressionValue(SwipeUpToSubmitLayout, "SwipeUpToSubmitLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SwipeUpToSubmitLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        int i2 = C34290Ll4.SwipeUpToSubmitLayout_submitDragDistance;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f67675i = C33032Gb6.m104982b(obtainStyledAttributes, i2);
        }
        textView.setText(C33032Gb6.m104979e(obtainStyledAttributes, C34290Ll4.SwipeUpToSubmitLayout_swipeIndicatorText));
        LayoutInflater.from(context).inflate(C33032Gb6.m104980d(obtainStyledAttributes, C34290Ll4.SwipeUpToSubmitLayout_contentLayout), frameLayout);
        obtainStyledAttributes.recycle();
        float m11240k = C49520tu6.m11240k(this, C37278Yf4.swipe_up_to_submit_content_corner_radius);
        C43037iy5.C24658b m31544a = C43037iy5.m31544a();
        m31544a.m31488t(0, m11240k);
        m31544a.m31483y(0, m11240k);
        materialCardView.setShapeAppearanceModel(m31544a.m31495m());
        findViewById3.setOnTouchListener(new View.OnTouchListener() { // from class: oX5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m54375g;
                m54375g = SwipeUpToSubmitLayout.m54375g(SwipeUpToSubmitLayout.this, view, motionEvent);
                return m54375g;
            }
        });
        this.f67679m = true;
    }
}
