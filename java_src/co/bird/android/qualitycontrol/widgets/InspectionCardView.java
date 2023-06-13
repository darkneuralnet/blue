package co.bird.android.qualitycontrol.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.qualitycontrol.widgets.InspectionCardView;
import co.bird.android.widget.standardcomponents.InspectionCard;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,B!\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b(\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR.\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00061"}, m28432d2 = {"Lco/bird/android/qualitycontrol/widgets/InspectionCardView;", "Lco/bird/android/widget/standardcomponents/InspectionCard;", "", "color", "", "y", "", "alpha", "w", "Lvr6;", "o", "Lvr6;", "binding", "Landroid/view/View;", "p", "Landroid/view/View;", "mask", "Landroid/animation/ValueAnimator;", "q", "Landroid/animation/ValueAnimator;", "maskAnimator", "r", "alphaAnimator", "Landroid/widget/ImageView;", "s", "Landroid/widget/ImageView;", "A", "()Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "", "value", "t", "Ljava/lang/Boolean;", "getAccepted", "()Ljava/lang/Boolean;", "setAccepted", "(Ljava/lang/Boolean;)V", "accepted", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "u", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class InspectionCardView extends InspectionCard {

    /* renamed from: u */
    public static final C16360a f66965u = new C16360a(null);

    /* renamed from: v */
    public static final int f66966v = C32364Df4.green;

    /* renamed from: w */
    public static final int f66967w = C32364Df4.errorRed;

    /* renamed from: x */
    public static final int f66968x = C32364Df4.transparentWhite;

    /* renamed from: o */
    public final C50675vr6 f66969o;

    /* renamed from: p */
    public final View f66970p;

    /* renamed from: q */
    public ValueAnimator f66971q;

    /* renamed from: r */
    public ValueAnimator f66972r;

    /* renamed from: s */
    public final ImageView f66973s;

    /* renamed from: t */
    public Boolean f66974t;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/widgets/InspectionCardView$a;", "", "", "ANIMATION_DURATION", "J", "", "FAILURE_RED", "I", "", "MASK_OPACITY", "F", "PASS_GREEN", "TRANSPARENT", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.qualitycontrol.widgets.InspectionCardView$a */
    /* loaded from: classes4.dex */
    public static final class C16360a {
        public /* synthetic */ C16360a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16360a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50675vr6 m7915b = C50675vr6.m7915b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m7915b, "inflate(context.layoutInflater, this)");
        this.f66969o = m7915b;
        View findViewById = findViewById(C51176wi4.mask);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.mask)");
        this.f66970p = findViewById;
        ImageView imageView = m7915b.f114798c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f66973s = imageView;
    }

    /* renamed from: x */
    public static final void m54974x(InspectionCardView this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        View view = this$0.f66970p;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: z */
    public static final void m54972z(InspectionCardView this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        View view = this$0.f66970p;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    /* renamed from: A */
    public final ImageView m54978A() {
        return this.f66973s;
    }

    @Override // co.bird.android.widget.standardcomponents.InspectionCard
    public void setAccepted(Boolean bool) {
        int i;
        this.f66974t = bool;
        float f = 0.35f;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i = f66966v;
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            i = f66967w;
        } else {
            i = f66968x;
            f = 0.0f;
        }
        m54973y(NA0.m94301c(getContext(), i));
        m54975w(f);
    }

    /* renamed from: w */
    public final void m54975w(float f) {
        ValueAnimator valueAnimator = this.f66972r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f66970p.getAlpha(), f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: O32
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                InspectionCardView.m54974x(InspectionCardView.this, valueAnimator2);
            }
        });
        this.f66972r = ofFloat;
        ofFloat.start();
    }

    /* renamed from: y */
    public final void m54973y(int i) {
        ColorDrawable colorDrawable;
        int m94301c;
        ValueAnimator valueAnimator = this.f66971q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Drawable background = this.f66970p.getBackground();
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        } else {
            colorDrawable = null;
        }
        if (colorDrawable != null) {
            m94301c = colorDrawable.getColor();
        } else {
            m94301c = NA0.m94301c(getContext(), f66968x);
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(m94301c, i);
        ofArgb.setInterpolator(new LinearInterpolator());
        ofArgb.setDuration(300L);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: P32
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                InspectionCardView.m54972z(InspectionCardView.this, valueAnimator2);
            }
        });
        this.f66971q = ofArgb;
        ofArgb.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50675vr6 m7915b = C50675vr6.m7915b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m7915b, "inflate(context.layoutInflater, this)");
        this.f66969o = m7915b;
        View findViewById = findViewById(C51176wi4.mask);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.mask)");
        this.f66970p = findViewById;
        ImageView imageView = m7915b.f114798c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f66973s = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50675vr6 m7915b = C50675vr6.m7915b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m7915b, "inflate(context.layoutInflater, this)");
        this.f66969o = m7915b;
        View findViewById = findViewById(C51176wi4.mask);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.mask)");
        this.f66970p = findViewById;
        ImageView imageView = m7915b.f114798c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f66973s = imageView;
    }
}
