package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u0001:\u00016B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016JQ\u0010\f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0005J3\u0010 \u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0006\u0010\"\u001a\u00020\u0005J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0007H\u0002R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "LQ14;", "interaction", "bounded", "LxB5;", "size", "radius", "Lpm0;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(LQ14;ZJIJFLkotlin/jvm/functions/Function0;)V", "e", "h", "(JIJF)V", DateTokenConverter.CONVERTER_KEY, "c", "pressed", "f", "Lwe6;", "Lwe6;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "g", C17296a.f69688o, "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleHostView extends View {

    /* renamed from: g */
    public static final C11286a f52927g = new C11286a(null);

    /* renamed from: h */
    public static final int[] f52928h = {16842919, 16842910};

    /* renamed from: i */
    public static final int[] f52929i = new int[0];

    /* renamed from: b */
    public C51138we6 f52930b;

    /* renamed from: c */
    public Boolean f52931c;

    /* renamed from: d */
    public Long f52932d;

    /* renamed from: e */
    public Runnable f52933e;

    /* renamed from: f */
    public Function0<Unit> f52934f;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"Landroidx/compose/material/ripple/RippleHostView$a;", "", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "<init>", "()V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ripple.RippleHostView$a */
    /* loaded from: classes.dex */
    public static final class C11286a {
        public /* synthetic */ C11286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11286a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: g */
    public static final void m68878g(RippleHostView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C51138we6 c51138we6 = this$0.f52930b;
        if (c51138we6 != null) {
            c51138we6.setState(f52929i);
        }
        this$0.f52933e = null;
    }

    /* renamed from: b */
    public final void m68883b(Q14 interaction, boolean z, long j, int i, long j2, float f, Function0<Unit> onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f52930b == null || !Intrinsics.areEqual(Boolean.valueOf(z), this.f52931c)) {
            m68882c(z);
            this.f52931c = Boolean.valueOf(z);
        }
        C51138we6 c51138we6 = this.f52930b;
        Intrinsics.checkNotNull(c51138we6);
        this.f52934f = onInvalidateRipple;
        m68877h(j, i, j2, f);
        if (z) {
            c51138we6.setHotspot(C32120Ce3.m111944o(interaction.m89111a()), C32120Ce3.m111943p(interaction.m89111a()));
        } else {
            c51138we6.setHotspot(c51138we6.getBounds().centerX(), c51138we6.getBounds().centerY());
        }
        m68879f(true);
    }

    /* renamed from: c */
    public final void m68882c(boolean z) {
        C51138we6 c51138we6 = new C51138we6(z);
        setBackground(c51138we6);
        this.f52930b = c51138we6;
    }

    /* renamed from: d */
    public final void m68881d() {
        this.f52934f = null;
        Runnable runnable = this.f52933e;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f52933e;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            C51138we6 c51138we6 = this.f52930b;
            if (c51138we6 != null) {
                c51138we6.setState(f52929i);
            }
        }
        C51138we6 c51138we62 = this.f52930b;
        if (c51138we62 == null) {
            return;
        }
        c51138we62.setVisible(false, false);
        unscheduleDrawable(c51138we62);
    }

    /* renamed from: e */
    public final void m68880e() {
        m68879f(false);
    }

    /* renamed from: f */
    public final void m68879f(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f52933e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f52932d;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            Runnable runnable2 = new Runnable() { // from class: ub5
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.m68878g(RippleHostView.this);
                }
            };
            this.f52933e = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            if (z) {
                iArr = f52928h;
            } else {
                iArr = f52929i;
            }
            C51138we6 c51138we6 = this.f52930b;
            if (c51138we6 != null) {
                c51138we6.setState(iArr);
            }
        }
        this.f52932d = Long.valueOf(currentAnimationTimeMillis);
    }

    /* renamed from: h */
    public final void m68877h(long j, int i, long j2, float f) {
        int roundToInt;
        int roundToInt2;
        C51138we6 c51138we6 = this.f52930b;
        if (c51138we6 == null) {
            return;
        }
        c51138we6.m6553c(i);
        c51138we6.m6554b(j2, f);
        roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(j));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(j));
        Rect rect = new Rect(0, 0, roundToInt, roundToInt2);
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c51138we6.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Function0<Unit> function0 = this.f52934f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
