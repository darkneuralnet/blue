package co.bird.android.widget.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C12055c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.actions.SlideToLockView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\f\u0010\u000f\u001a\u00020\b*\u00020\u0006H\u0002J\f\u0010\u0010\u001a\u00020\b*\u00020\u0006H\u0002J\f\u0010\u0011\u001a\u00020\b*\u00020\u0006H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R?\u00100\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00105\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u00102\"\u0004\b3\u00104R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u00106R\u0014\u00108\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u00107¨\u0006A"}, m28432d2 = {"Lco/bird/android/widget/actions/SlideToLockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LkE5;", TransferTable.COLUMN_STATE, "", "setState", "Landroid/view/MotionEvent;", "event", "", "p", "i", "k", "j", "s", "o", "n", "m", "l", "Lco/bird/android/widget/actions/SlideToLockThumbView;", "b", "Lco/bird/android/widget/actions/SlideToLockThumbView;", "thumbView", "Lco/bird/android/widget/actions/SlideToLockBackgroundView;", "c", "Lco/bird/android/widget/actions/SlideToLockBackgroundView;", "backgroundView", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "labelView", "", "e", "F", "thumbMargin", "f", "lockedThumbPositionX", "g", "Z", "isDragging", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "h", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "value", "LkE5;", "r", "(LkE5;)V", "_state", "()LkE5;", "()F", "unlockedThumbPositionX", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SlideToLockView extends ConstraintLayout {

    /* renamed from: b */
    public final SlideToLockThumbView f67781b;

    /* renamed from: c */
    public final SlideToLockBackgroundView f67782c;

    /* renamed from: d */
    public final TextView f67783d;

    /* renamed from: e */
    public final float f67784e;

    /* renamed from: f */
    public final float f67785f;

    /* renamed from: g */
    public boolean f67786g;

    /* renamed from: h */
    public Function1<? super EnumC43785kE5, Unit> f67787h;

    /* renamed from: i */
    public EnumC43785kE5 f67788i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.SlideToLockView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16629a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43785kE5.values().length];
            try {
                iArr[EnumC43785kE5.LOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC43785kE5.UNLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC43785kE5.REQUESTED_LOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC43785kE5.REQUESTED_UNLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static final boolean m54262f(SlideToLockView this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(event, "event");
        return this$0.m54252p(event);
    }

    /* renamed from: g */
    public final EnumC43785kE5 m54261g() {
        return this.f67788i;
    }

    /* renamed from: h */
    public final float m54260h() {
        return (getWidth() - this.f67781b.getWidth()) - this.f67784e;
    }

    /* renamed from: i */
    public final boolean m54259i(MotionEvent motionEvent) {
        if (!m54261g().m29158c()) {
            return false;
        }
        boolean m54254n = m54254n(motionEvent);
        if (m54254n) {
            this.f67781b.animate().cancel();
            this.f67783d.animate().cancel();
            C12055c.m65805a(this);
            this.f67781b.setCardElevation(C49520tu6.m11247d(this, 18));
        }
        this.f67786g = m54254n;
        return m54254n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0 <= 0.0f) goto L5;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m54258j(MotionEvent motionEvent) {
        m54250s(motionEvent);
        if (m54261g().m29159b()) {
            float width = ((getWidth() / 2.0f) - motionEvent.getX()) / (getWidth() / 2.0f);
            float f = 1.0f;
            if (width < 1.0f) {
                f = 0.0f;
            }
            width = f;
            this.f67783d.setAlpha(width);
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m54257k(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f67786g) {
            return false;
        }
        if (m54261g() == EnumC43785kE5.LOCKED) {
            if (this.f67781b.getX() == m54260h()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setState(EnumC43785kE5.REQUESTED_UNLOCK);
                C12055c.m65805a(this);
                this.f67781b.setCardElevation(0.0f);
                this.f67786g = false;
                return true;
            }
        }
        if (m54261g() == EnumC43785kE5.UNLOCKED) {
            if (this.f67781b.getX() == this.f67785f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setState(EnumC43785kE5.REQUESTED_LOCK);
                C12055c.m65805a(this);
                this.f67781b.setCardElevation(0.0f);
                this.f67786g = false;
                return true;
            }
        }
        m54253o();
        C12055c.m65805a(this);
        this.f67781b.setCardElevation(0.0f);
        this.f67786g = false;
        return true;
    }

    /* renamed from: l */
    public final boolean m54256l(MotionEvent motionEvent) {
        return motionEvent.getX() + ((float) (this.f67781b.getWidth() / 2)) > ((float) getWidth()) && this.f67781b.getX() + ((float) (this.f67781b.getWidth() / 2)) < ((float) getWidth());
    }

    /* renamed from: m */
    public final boolean m54255m(MotionEvent motionEvent) {
        return motionEvent.getX() < this.f67784e + ((float) (this.f67781b.getWidth() / 2));
    }

    /* renamed from: n */
    public final boolean m54254n(MotionEvent motionEvent) {
        return motionEvent.getX() > this.f67781b.getX() && motionEvent.getX() < this.f67781b.getX() + ((float) this.f67781b.getWidth());
    }

    /* renamed from: o */
    public final void m54253o() {
        float m54260h;
        ViewPropertyAnimator interpolator = this.f67781b.animate().setInterpolator(new DecelerateInterpolator());
        if (m54261g().m29159b()) {
            m54260h = this.f67785f;
        } else {
            m54260h = m54260h();
        }
        ViewPropertyAnimator x = interpolator.x(m54260h);
        Intrinsics.checkNotNullExpressionValue(x, "thumbView.animate()\n    …sitionX\n        }\n      )");
        ViewPropertyAnimator alpha = this.f67783d.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha, "labelView.animate()\n    …lator())\n      .alpha(1f)");
        x.start();
        alpha.start();
    }

    /* renamed from: p */
    public final boolean m54252p(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                return m54258j(motionEvent);
            }
            return m54257k(motionEvent);
        }
        return m54259i(motionEvent);
    }

    /* renamed from: r */
    public final void m54251r(EnumC43785kE5 enumC43785kE5) {
        int i;
        int i2;
        if (this.f67788i == enumC43785kE5) {
            return;
        }
        this.f67788i = enumC43785kE5;
        Context context = getContext();
        EnumC43785kE5 enumC43785kE52 = this.f67788i;
        int[] iArr = C16629a.$EnumSwitchMapping$0;
        int i3 = iArr[enumC43785kE52.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        i = C45871nl4.unlocking;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = C45871nl4.locking;
                }
            } else {
                i = C45871nl4.slide_to_lock;
            }
        } else {
            i = C45871nl4.slide_to_unlock;
        }
        setContentDescription(context.getString(i));
        this.f67783d.setAlpha(1.0f);
        TextView textView = this.f67783d;
        Context context2 = getContext();
        int i4 = iArr[enumC43785kE5.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        i2 = C45871nl4.unlocking;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i2 = C45871nl4.locking;
                }
            } else {
                i2 = C45871nl4.slide_to_lock;
            }
        } else {
            i2 = C45871nl4.slide_to_unlock;
        }
        textView.setText(context2.getString(i2));
        Function1<? super EnumC43785kE5, Unit> function1 = this.f67787h;
        if (function1 != null) {
            function1.invoke(this.f67788i);
        }
    }

    /* renamed from: s */
    public final void m54250s(MotionEvent motionEvent) {
        if (m54255m(motionEvent)) {
            this.f67781b.setX(this.f67784e);
        } else if (m54256l(motionEvent)) {
            this.f67781b.setX((getWidth() - this.f67781b.getWidth()) - this.f67784e);
        } else {
            this.f67781b.setX(motionEvent.getX() - (this.f67784e + (this.f67781b.getWidth() / 2)));
        }
    }

    public final void setListener(Function1<? super EnumC43785kE5, Unit> function1) {
        this.f67787h = function1;
    }

    public final void setState(EnumC43785kE5 state) {
        float m54260h;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == this.f67788i) {
            return;
        }
        m54251r(state);
        if (state.m29159b()) {
            m54260h = this.f67785f;
        } else {
            m54260h = m54260h();
        }
        this.f67781b.setState(state, true);
        this.f67781b.animate().setInterpolator(new DecelerateInterpolator()).x(m54260h).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideToLockView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float m11240k = C49520tu6.m11240k(this, C37278Yf4.slide_to_unlock_thumb_margin);
        this.f67784e = m11240k;
        this.f67785f = m11240k;
        this.f67788i = EnumC43785kE5.LOCKED;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, C49520tu6.m11240k(this, C37278Yf4.slide_to_unlock_height)));
        View.inflate(context, C45268mk4.view_slide_to_lock, this);
        View findViewById = findViewById(C52955zi4.thumbView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.thumbView)");
        this.f67781b = (SlideToLockThumbView) findViewById;
        View findViewById2 = findViewById(C52955zi4.backgroundView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.backgroundView)");
        this.f67782c = (SlideToLockBackgroundView) findViewById2;
        View findViewById3 = findViewById(C52955zi4.label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.label)");
        this.f67783d = (TextView) findViewById3;
        setOnTouchListener(new View.OnTouchListener() { // from class: lE5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m54262f;
                m54262f = SlideToLockView.m54262f(SlideToLockView.this, view, motionEvent);
                return m54262f;
            }
        });
    }
}
