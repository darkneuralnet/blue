package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
/* renamed from: d0 */
/* loaded from: classes.dex */
public abstract class AbstractC19650d0 extends ViewGroup {

    /* renamed from: b */
    public final C19651a f75933b;

    /* renamed from: c */
    public final Context f75934c;

    /* renamed from: d */
    public ActionMenuView f75935d;

    /* renamed from: e */
    public ActionMenuPresenter f75936e;

    /* renamed from: f */
    public int f75937f;

    /* renamed from: g */
    public C34823Ns6 f75938g;

    /* renamed from: h */
    public boolean f75939h;

    /* renamed from: i */
    public boolean f75940i;

    /* renamed from: d0$a */
    /* loaded from: classes.dex */
    public class C19651a implements InterfaceC35291Ps6 {

        /* renamed from: a */
        public boolean f75941a = false;

        /* renamed from: b */
        public int f75942b;

        public C19651a() {
        }

        @Override // p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
            this.f75941a = true;
        }

        @Override // p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            if (this.f75941a) {
                return;
            }
            AbstractC19650d0 abstractC19650d0 = AbstractC19650d0.this;
            abstractC19650d0.f75938g = null;
            AbstractC19650d0.super.setVisibility(this.f75942b);
        }

        @Override // p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC19650d0.super.setVisibility(0);
            this.f75941a = false;
        }

        /* renamed from: d */
        public C19651a m44750d(C34823Ns6 c34823Ns6, int i) {
            AbstractC19650d0.this.f75938g = c34823Ns6;
            this.f75942b = i;
            return this;
        }
    }

    public AbstractC19650d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public static int m44753d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public int m44754c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: e */
    public int m44752e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public C34823Ns6 mo44751f(int i, long j) {
        C34823Ns6 c34823Ns6 = this.f75938g;
        if (c34823Ns6 != null) {
            c34823Ns6.m93247c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C34823Ns6 m93248b = C38790bq6.m62490e(this).m93248b(1.0f);
            m93248b.m93244f(j);
            m93248b.m93242h(this.f75933b.m44750d(m93248b, i));
            return m93248b;
        }
        C34823Ns6 m93248b2 = C38790bq6.m62490e(this).m93248b(0.0f);
        m93248b2.m93244f(j);
        m93248b2.m93242h(this.f75933b.m44750d(m93248b2, i));
        return m93248b2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C43509jm4.ActionBar, C50553vf4.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C43509jm4.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f75936e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m70022H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f75940i = false;
        }
        if (!this.f75940i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f75940i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f75940i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f75939h = false;
        }
        if (!this.f75939h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f75939h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f75939h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f75937f = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C34823Ns6 c34823Ns6 = this.f75938g;
            if (c34823Ns6 != null) {
                c34823Ns6.m93247c();
            }
            super.setVisibility(i);
        }
    }

    public AbstractC19650d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75933b = new C19651a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C50553vf4.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f75934c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f75934c = context;
        }
    }
}
