package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002 #B\u0007¢\u0006\u0004\bJ\u0010KJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0017J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R(\u0010<\u001a\b\u0012\u0004\u0012\u00020\b068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b(\u0010;R$\u0010A\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b#\u0010@R$\u0010E\u001a\u00020+2\u0006\u0010=\u001a\u00020+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\b,\u0010DR\u001b\u0010I\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b \u0010F*\u0004\bG\u0010H¨\u0006M"}, m28432d2 = {"LGj0;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "", "left", "top", "right", "bottom", "", "setBounds", "Landroid/graphics/Canvas;", "canvas", "draw", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "start", "stop", "", "isRunning", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "paint", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "c", "Landroid/animation/ValueAnimator;", "angleAnimator", DateTokenConverter.CONVERTER_KEY, "sweepAngleAnimator", "Landroid/animation/AnimatorSet;", "e", "Landroid/animation/AnimatorSet;", "progressAnimation", "LGj0$e;", "Landroid/graphics/RectF;", "f", "LGj0$e;", "resettableBoundsF", "", "g", "F", "sweepAngle", "h", "angle", "i", "angleOffset", "j", "Z", "elongating", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "getInvalidationCallback", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "invalidationCallback", "value", "getColor", "()I", "(I)V", "color", "getStrokeWidth", "()F", "(F)V", "strokeWidth", "()Landroid/graphics/RectF;", "getBoundsF$delegate", "(LGj0;)Ljava/lang/Object;", "boundsF", "<init>", "()V", "l", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCircularProgressDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressDrawable.kt\nco/bird/android/drawable/CircularProgressDrawable\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,163:1\n64#2:164\n95#2,14:165\n*S KotlinDebug\n*F\n+ 1 CircularProgressDrawable.kt\nco/bird/android/drawable/CircularProgressDrawable\n*L\n53#1:164\n53#1:165,14\n*E\n"})
/* renamed from: Gj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33098Gj0 extends Drawable implements Animatable {

    /* renamed from: l */
    public static final C2926d f12312l = new C2926d(null);

    /* renamed from: b */
    public Paint f12313b;

    /* renamed from: c */
    public final ValueAnimator f12314c;

    /* renamed from: d */
    public final ValueAnimator f12315d;

    /* renamed from: e */
    public final AnimatorSet f12316e;

    /* renamed from: f */
    public final C2927e<RectF> f12317f;

    /* renamed from: g */
    public float f12318g;

    /* renamed from: h */
    public float f12319h;

    /* renamed from: i */
    public float f12320i;

    /* renamed from: j */
    public boolean f12321j;

    /* renamed from: k */
    public Function0<Unit> f12322k;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gj0$a */
    /* loaded from: classes2.dex */
    public static final class C2923a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C2923a f12323g = new C2923a();

        public C2923a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/graphics/RectF;", "b", "()Landroid/graphics/RectF;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gj0$b */
    /* loaded from: classes2.dex */
    public static final class C2924b extends Lambda implements Function0<RectF> {
        public C2924b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final RectF invoke() {
            return new RectF(C33098Gj0.this.getBounds());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 CircularProgressDrawable.kt\nco/bird/android/drawable/CircularProgressDrawable\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n55#2,8:137\n96#3:145\n98#4:146\n97#5:147\n*E\n"})
    /* renamed from: Gj0$c */
    /* loaded from: classes2.dex */
    public static final class C2925c implements Animator.AnimatorListener {
        public C2925c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            C33098Gj0 c33098Gj0 = C33098Gj0.this;
            c33098Gj0.f12321j = !c33098Gj0.f12321j;
            if (C33098Gj0.this.f12321j) {
                C33098Gj0 c33098Gj02 = C33098Gj0.this;
                c33098Gj02.f12320i = (c33098Gj02.f12320i + 60.0f) % 360.0f;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, m28432d2 = {"LGj0$d;", "", "", "ANGLE_ANIMATION_DURATION_MS", "J", "", "DEFAULT_STROKE_WIDTH_DP", "I", "", "MIN_SWEEP_ANGLE", "F", "SWEEP_ANIMATION_DURATION_MS", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gj0$d */
    /* loaded from: classes2.dex */
    public static final class C2926d {
        public /* synthetic */ C2926d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2926d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0004B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LGj0$e;", "T", "Lkotlin/Lazy;", "", C17296a.f69688o, "", "isInitialized", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "initializer", "c", "Ljava/lang/Object;", "cached", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gj0$e */
    /* loaded from: classes2.dex */
    public static final class C2927e<T> implements Lazy<T> {

        /* renamed from: d */
        public static final C2928a f12326d = new C2928a(null);

        /* renamed from: b */
        public final Function0<T> f12327b;

        /* renamed from: c */
        public T f12328c;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\t"}, m28432d2 = {"LGj0$e$a;", "", "T", "Lkotlin/Function0;", "value", "LGj0$e;", C17296a.f69688o, "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Gj0$e$a */
        /* loaded from: classes2.dex */
        public static final class C2928a {
            public /* synthetic */ C2928a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final <T> C2927e<T> m104827a(Function0<? extends T> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new C2927e<>(value);
            }

            private C2928a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2927e(Function0<? extends T> initializer) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            this.f12327b = initializer;
        }

        /* renamed from: a */
        public final void m104828a() {
            this.f12328c = null;
        }

        @Override // kotlin.Lazy
        public T getValue() {
            if (this.f12328c == null) {
                this.f12328c = this.f12327b.invoke();
            }
            return this.f12328c;
        }

        @Override // kotlin.Lazy
        public boolean isInitialized() {
            return this.f12328c != null;
        }
    }

    public C33098Gj0() {
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(C49347td3.m12001b(4));
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.f12313b = paint;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setInterpolator(D62.f5245b.mo110910b());
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Dj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33098Gj0.m104835c(C33098Gj0.this, valueAnimator);
            }
        });
        this.f12314c = ofFloat;
        ValueAnimator sweepAngleAnimator$lambda$5 = ValueAnimator.ofFloat(0.0f, 300.0f);
        sweepAngleAnimator$lambda$5.setInterpolator(D62.f5249f.mo110910b());
        sweepAngleAnimator$lambda$5.setDuration(700L);
        sweepAngleAnimator$lambda$5.setRepeatCount(-1);
        sweepAngleAnimator$lambda$5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ej0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33098Gj0.m104830h(C33098Gj0.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(sweepAngleAnimator$lambda$5, "sweepAngleAnimator$lambda$5");
        sweepAngleAnimator$lambda$5.addListener(new C2925c());
        this.f12315d = sweepAngleAnimator$lambda$5;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, sweepAngleAnimator$lambda$5);
        this.f12316e = animatorSet;
        this.f12317f = C2927e.f12326d.m104827a(new C2924b());
        this.f12318g = 30.0f;
        this.f12321j = true;
        this.f12322k = C2923a.f12323g;
    }

    /* renamed from: c */
    public static final void m104835c(C33098Gj0 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f12319h = ((Float) animatedValue).floatValue();
    }

    /* renamed from: h */
    public static final void m104830h(C33098Gj0 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f12318g = ((Float) animatedValue).floatValue();
        this$0.f12322k.invoke();
    }

    /* renamed from: d */
    public final RectF m104834d() {
        return this.f12317f.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f12321j) {
            f = this.f12319h - this.f12320i;
            f2 = this.f12318g + 30.0f;
        } else {
            float f3 = this.f12319h - this.f12320i;
            float f4 = this.f12318g;
            f = f3 + f4;
            f2 = (360.0f - f4) - 30.0f;
        }
        canvas.drawArc(m104834d(), f, f2, false, this.f12313b);
    }

    /* renamed from: e */
    public final void m104833e(int i) {
        this.f12313b.setColor(i);
    }

    /* renamed from: f */
    public final void m104832f(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12322k = function0;
    }

    /* renamed from: g */
    public final void m104831g(float f) {
        this.f12313b.setStrokeWidth(f);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f12316e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f12313b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f12317f.m104828a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12313b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!this.f12316e.isRunning()) {
            this.f12316e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f12316e.isRunning()) {
            this.f12316e.end();
        }
    }
}
