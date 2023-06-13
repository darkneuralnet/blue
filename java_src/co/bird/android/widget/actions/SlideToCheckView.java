package co.bird.android.widget.actions;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C12055c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.actions.SlideToCheckView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010Q\u001a\u00020P\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010R\u001a\u00020\u0005¢\u0006\u0004\bS\u0010TJ\u001e\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0016\u0010\u0016\u001a\u00020\r*\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u0002J\f\u0010\u0017\u001a\u00020\r*\u00020\u000bH\u0002J\f\u0010\u0018\u001a\u00020\r*\u00020\u000bH\u0002J\u0016\u0010\u001c\u001a\u00020\r*\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001d\u001a\u00020\r*\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\rH\u0016R\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0013R\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0013R?\u0010>\u001a\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u0007\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010AR\u0016\u0010E\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0016\u0010G\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR$\u0010L\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010I\"\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010MR\u0011\u00107\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bF\u0010O¨\u0006U"}, m28432d2 = {"Lco/bird/android/widget/actions/SlideToCheckView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "", "i", "D", "A", "Landroid/view/MotionEvent;", "event", "", "B", "l", "m", "o", "n", "F", "y", "padding", "v", "x", "p", "Lco/bird/android/widget/actions/SlideToCheckThumbView;", "", "buffer", "r", "t", "LgE5;", "newState", "setState", "isChecked", "toggle", "checked", "setChecked", "b", "Lco/bird/android/widget/actions/SlideToCheckThumbView;", "thumbView", "Lco/bird/android/widget/actions/SlideToCheckBackgroundView;", "c", "Lco/bird/android/widget/actions/SlideToCheckBackgroundView;", "backgroundView", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "labelView", "e", "thumbMargin", "f", "uncheckedThumbPositionX", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, "g", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "h", "Ljava/lang/String;", "uncheckedText", "requestedCheckText", "j", "checkedText", "k", "requestedUncheckText", "value", "LgE5;", "E", "(LgE5;)V", "_state", "()F", "checkedThumbPositionX", "()LgE5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlideToCheckView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideToCheckView.kt\nco/bird/android/widget/actions/SlideToCheckView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"})
/* loaded from: classes4.dex */
public final class SlideToCheckView extends ConstraintLayout implements Checkable {

    /* renamed from: b */
    public final SlideToCheckThumbView f67764b;

    /* renamed from: c */
    public final SlideToCheckBackgroundView f67765c;

    /* renamed from: d */
    public final TextView f67766d;

    /* renamed from: e */
    public final float f67767e;

    /* renamed from: f */
    public final float f67768f;

    /* renamed from: g */
    public Function1<? super EnumC41413gE5, Unit> f67769g;

    /* renamed from: h */
    public String f67770h;

    /* renamed from: i */
    public String f67771i;

    /* renamed from: j */
    public String f67772j;

    /* renamed from: k */
    public String f67773k;

    /* renamed from: l */
    public EnumC41413gE5 f67774l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.SlideToCheckView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16627a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC41413gE5.values().length];
            try {
                iArr[EnumC41413gE5.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC41413gE5.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC41413gE5.REQUESTED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC41413gE5.CHECKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC41413gE5.REQUEST_UNCHECKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: C */
    public static final void m54289C(SlideToCheckView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54291A();
    }

    /* renamed from: h */
    public static final boolean m54282h(SlideToCheckView this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(event, "event");
        return this$0.m54290B(event);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m54272s(SlideToCheckView slideToCheckView, SlideToCheckThumbView slideToCheckThumbView, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = slideToCheckThumbView.getWidth() * 1.5f;
        }
        return slideToCheckView.m54273r(slideToCheckThumbView, f);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m54270u(SlideToCheckView slideToCheckView, SlideToCheckThumbView slideToCheckThumbView, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = slideToCheckThumbView.getWidth() * 1.5f;
        }
        return slideToCheckView.m54271t(slideToCheckThumbView, f);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m54268w(SlideToCheckView slideToCheckView, MotionEvent motionEvent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slideToCheckView.f67764b.getWidth();
        }
        return slideToCheckView.m54269v(motionEvent, i);
    }

    /* renamed from: z */
    public static final void m54265z(SlideToCheckView this$0) {
        EnumC41413gE5 enumC41413gE5;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m54279k().m39803g()) {
            enumC41413gE5 = EnumC41413gE5.UNCHECKED;
        } else {
            enumC41413gE5 = EnumC41413gE5.CHECKED;
        }
        this$0.setState(enumC41413gE5);
    }

    /* renamed from: A */
    public final void m54291A() {
        Function1<? super EnumC41413gE5, Unit> function1 = this.f67769g;
        if (function1 != null) {
            function1.invoke(m54279k());
        }
    }

    /* renamed from: B */
    public final boolean m54290B(MotionEvent motionEvent) {
        boolean m54277m;
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 4) {
                            return false;
                        }
                        m54277m = m54278l(motionEvent);
                        C41318g46.m40163a("Action Outside", new Object[0]);
                    } else {
                        m54277m = m54278l(motionEvent);
                        C41318g46.m40163a("Action Cancel", new Object[0]);
                    }
                } else {
                    m54277m = m54276n(motionEvent);
                    C41318g46.m40163a("Action Move", new Object[0]);
                }
            } else {
                m54277m = m54275o(motionEvent);
                C41318g46.m40163a("Action Up", new Object[0]);
            }
        } else {
            m54277m = m54277m(motionEvent);
            C41318g46.m40163a("Action Down", new Object[0]);
        }
        return m54277m;
    }

    /* renamed from: D */
    public final void m54288D() {
        int i = C16627a.$EnumSwitchMapping$0[m54279k().ordinal()];
        if (i != 2) {
            if (i == 4) {
                setState(EnumC41413gE5.DRAGGING_FROM_CHECKED);
                return;
            }
            return;
        }
        setState(EnumC41413gE5.DRAGGING_FROM_UNCHECKED);
    }

    /* renamed from: E */
    public final void m54287E(EnumC41413gE5 enumC41413gE5) {
        String str;
        if (this.f67774l == enumC41413gE5) {
            return;
        }
        this.f67774l = enumC41413gE5;
        if (!m54279k().m39807c()) {
            this.f67766d.setAlpha(1.0f);
            TextView textView = this.f67766d;
            int i = C16627a.$EnumSwitchMapping$0[enumC41413gE5.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = this.f67770h;
                            } else {
                                str = this.f67773k;
                            }
                        } else {
                            str = this.f67772j;
                        }
                    } else {
                        str = this.f67771i;
                    }
                } else {
                    str = this.f67770h;
                }
            } else {
                str = "";
            }
            textView.setText(str);
        }
    }

    /* renamed from: F */
    public final void m54286F(MotionEvent motionEvent) {
        if (m54267x(motionEvent)) {
            this.f67764b.setX(this.f67767e);
        } else if (m54274p(motionEvent)) {
            this.f67764b.setX((getWidth() - this.f67764b.getWidth()) - this.f67767e);
        } else {
            this.f67764b.setX(motionEvent.getX() - (this.f67767e + (this.f67764b.getWidth() / 2)));
        }
    }

    /* renamed from: i */
    public final void m54281i(AttributeSet attributeSet, int i) {
        EnumC41413gE5 enumC41413gE5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.SlideToCheckView, i, 0);
            try {
                String it = obtainStyledAttributes.getString(C34290Ll4.SlideToCheckView_text);
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    this.f67770h = it;
                    this.f67771i = it;
                    this.f67772j = it;
                    this.f67773k = it;
                }
                String it2 = obtainStyledAttributes.getString(C34290Ll4.SlideToCheckView_text_unchecked);
                if (it2 != null) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    this.f67770h = it2;
                }
                String it3 = obtainStyledAttributes.getString(C34290Ll4.SlideToCheckView_text_requested_to_check);
                if (it3 != null) {
                    Intrinsics.checkNotNullExpressionValue(it3, "it");
                    this.f67771i = it3;
                }
                String it4 = obtainStyledAttributes.getString(C34290Ll4.SlideToCheckView_text_checked);
                if (it4 != null) {
                    Intrinsics.checkNotNullExpressionValue(it4, "it");
                    this.f67772j = it4;
                }
                String it5 = obtainStyledAttributes.getString(C34290Ll4.SlideToCheckView_text_requested_to_uncheck);
                if (it5 != null) {
                    Intrinsics.checkNotNullExpressionValue(it5, "it");
                    this.f67773k = it5;
                }
                if (obtainStyledAttributes.getBoolean(C34290Ll4.SlideToCheckView_checked, false)) {
                    enumC41413gE5 = EnumC41413gE5.CHECKED;
                } else {
                    enumC41413gE5 = EnumC41413gE5.UNCHECKED;
                }
                setState(enumC41413gE5);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return m54279k().m39808b();
    }

    /* renamed from: j */
    public final float m54280j() {
        return (getWidth() - this.f67764b.getWidth()) - this.f67767e;
    }

    /* renamed from: k */
    public final EnumC41413gE5 m54279k() {
        return this.f67774l;
    }

    /* renamed from: l */
    public final boolean m54278l(MotionEvent motionEvent) {
        if (!m54279k().m39807c()) {
            return false;
        }
        if (m54279k().m39803g()) {
            setState(EnumC41413gE5.UNCHECKED);
        } else if (m54279k().m39804f()) {
            setState(EnumC41413gE5.CHECKED);
        } else {
            setState(EnumC41413gE5.UNCHECKED);
        }
        C12055c.m65805a(this);
        this.f67764b.setCardElevation(0.0f);
        return true;
    }

    /* renamed from: m */
    public final boolean m54277m(MotionEvent motionEvent) {
        if (!m54279k().m39806d()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        boolean m54268w = m54268w(this, motionEvent, 0, 1, null);
        if (m54268w) {
            C41318g46.m40163a("Within bounds to start drag", new Object[0]);
            this.f67764b.animate().cancel();
            this.f67766d.animate().cancel();
            C12055c.m65805a(this);
            this.f67764b.setCardElevation(C49520tu6.m11247d(this, 2));
            m54288D();
        } else {
            C41318g46.m40163a("Not within bounds to start drag", new Object[0]);
        }
        return m54268w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0 <= 0.0f) goto L5;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m54276n(MotionEvent motionEvent) {
        m54286F(motionEvent);
        if (m54279k().m39805e()) {
            float width = ((getWidth() / 2.0f) - motionEvent.getX()) / (getWidth() / 2.0f);
            float f = 1.0f;
            if (width < 1.0f) {
                f = 0.0f;
            }
            width = f;
            this.f67766d.setAlpha(width);
        }
        invalidate();
        return true;
    }

    /* renamed from: o */
    public final boolean m54275o(MotionEvent motionEvent) {
        if (m54279k().m39803g() && m54272s(this, this.f67764b, 0.0f, 1, null)) {
            setState(EnumC41413gE5.REQUESTED_CHECK);
        } else if (m54279k().m39804f() && m54270u(this, this.f67764b, 0.0f, 1, null)) {
            setState(EnumC41413gE5.REQUEST_UNCHECKED);
        } else {
            m54266y();
        }
        C12055c.m65805a(this);
        this.f67764b.setCardElevation(0.0f);
        return true;
    }

    /* renamed from: p */
    public final boolean m54274p(MotionEvent motionEvent) {
        return motionEvent.getX() + ((float) (this.f67764b.getWidth() / 2)) > ((float) getWidth()) && this.f67764b.getX() + ((float) (this.f67764b.getWidth() / 2)) < ((float) getWidth());
    }

    /* renamed from: r */
    public final boolean m54273r(SlideToCheckThumbView slideToCheckThumbView, float f) {
        return Math.abs(this.f67764b.getX() - m54280j()) <= f;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z && m54279k() == EnumC41413gE5.UNCHECKED) {
            setState(EnumC41413gE5.REQUESTED_CHECK);
        } else if (!z && m54279k() == EnumC41413gE5.CHECKED) {
            setState(EnumC41413gE5.REQUEST_UNCHECKED);
        }
    }

    public final void setListener(Function1<? super EnumC41413gE5, Unit> function1) {
        this.f67769g = function1;
    }

    public final void setState(EnumC41413gE5 newState) {
        float m54280j;
        Intrinsics.checkNotNullParameter(newState, "newState");
        EnumC41413gE5 enumC41413gE5 = this.f67774l;
        C41318g46.m40163a("setState: " + newState + " from " + enumC41413gE5, new Object[0]);
        EnumC41413gE5 enumC41413gE52 = this.f67774l;
        m54287E(newState);
        if (newState == enumC41413gE52) {
            return;
        }
        this.f67764b.setState(newState, true);
        if (!newState.m39807c()) {
            if (newState.m39805e()) {
                m54280j = this.f67768f;
            } else {
                m54280j = m54280j();
            }
            this.f67764b.animate().setInterpolator(new DecelerateInterpolator()).x(m54280j).withEndAction(new Runnable() { // from class: hE5
                @Override // java.lang.Runnable
                public final void run() {
                    SlideToCheckView.m54289C(SlideToCheckView.this);
                }
            }).start();
            return;
        }
        m54291A();
    }

    /* renamed from: t */
    public final boolean m54271t(SlideToCheckThumbView slideToCheckThumbView, float f) {
        return Math.abs(this.f67764b.getX() - this.f67768f) <= f;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m54279k().m39805e()) {
            setState(EnumC41413gE5.REQUESTED_CHECK);
        } else if (m54279k().m39808b()) {
            setState(EnumC41413gE5.REQUEST_UNCHECKED);
        } else {
            m54279k().m39807c();
        }
    }

    /* renamed from: v */
    public final boolean m54269v(MotionEvent motionEvent, int i) {
        float f = i;
        return motionEvent.getX() >= Math.max(this.f67764b.getX() - f, 0.0f) && motionEvent.getX() <= Math.min((this.f67764b.getX() + ((float) this.f67764b.getWidth())) + f, (float) getWidth());
    }

    /* renamed from: x */
    public final boolean m54267x(MotionEvent motionEvent) {
        return motionEvent.getX() < this.f67767e + ((float) (this.f67764b.getWidth() / 2));
    }

    /* renamed from: y */
    public final void m54266y() {
        float m54280j;
        ViewPropertyAnimator interpolator = this.f67764b.animate().setInterpolator(new DecelerateInterpolator());
        if (m54279k().m39803g()) {
            m54280j = this.f67768f;
        } else {
            m54280j = m54280j();
        }
        ViewPropertyAnimator x = interpolator.x(m54280j);
        Intrinsics.checkNotNullExpressionValue(x, "thumbView.animate()\n    …sitionX\n        }\n      )");
        ViewPropertyAnimator alpha = this.f67766d.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha, "labelView.animate()\n    …lator())\n      .alpha(1f)");
        x.start();
        alpha.withEndAction(new Runnable() { // from class: jE5
            @Override // java.lang.Runnable
            public final void run() {
                SlideToCheckView.m54265z(SlideToCheckView.this);
            }
        }).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideToCheckView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float m11240k = C49520tu6.m11240k(this, C37278Yf4.slide_to_check_thumb_margin);
        this.f67767e = m11240k;
        this.f67768f = m11240k;
        String string = context.getString(C45871nl4.slide_to_unlock);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.slide_to_unlock)");
        this.f67770h = string;
        String string2 = context.getString(C45871nl4.unlocking);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.unlocking)");
        this.f67771i = string2;
        String string3 = context.getString(C45871nl4.slide_to_lock);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.slide_to_lock)");
        this.f67772j = string3;
        String string4 = context.getString(C45871nl4.locking);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.locking)");
        this.f67773k = string4;
        EnumC41413gE5 enumC41413gE5 = EnumC41413gE5.UNINITIALIZED;
        this.f67774l = enumC41413gE5;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, C49520tu6.m11240k(this, C37278Yf4.slide_to_check_height)));
        View.inflate(context, C45268mk4.view_slide_to_check, this);
        View findViewById = findViewById(C52955zi4.thumbView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.thumbView)");
        this.f67764b = (SlideToCheckThumbView) findViewById;
        View findViewById2 = findViewById(C52955zi4.backgroundView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.backgroundView)");
        this.f67765c = (SlideToCheckBackgroundView) findViewById2;
        View findViewById3 = findViewById(C52955zi4.label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.label)");
        this.f67766d = (TextView) findViewById3;
        setOnTouchListener(new View.OnTouchListener() { // from class: iE5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m54282h;
                m54282h = SlideToCheckView.m54282h(SlideToCheckView.this, view, motionEvent);
                return m54282h;
            }
        });
        m54281i(attributeSet, i);
        if (m54279k() == enumC41413gE5) {
            setState(EnumC41413gE5.UNCHECKED);
        }
    }
}
