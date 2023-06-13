package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.C11925l;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements L43, I43 {

    /* renamed from: C */
    public static final float f54307C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D */
    public static final C11557a f54308D = new C11557a();

    /* renamed from: E */
    public static final int[] f54309E = {16843130};

    /* renamed from: A */
    public float f54310A;

    /* renamed from: B */
    public InterfaceC11559c f54311B;

    /* renamed from: b */
    public final float f54312b;

    /* renamed from: c */
    public long f54313c;

    /* renamed from: d */
    public final Rect f54314d;

    /* renamed from: e */
    public OverScroller f54315e;

    /* renamed from: f */
    public EdgeEffect f54316f;

    /* renamed from: g */
    public EdgeEffect f54317g;

    /* renamed from: h */
    public int f54318h;

    /* renamed from: i */
    public boolean f54319i;

    /* renamed from: j */
    public boolean f54320j;

    /* renamed from: k */
    public View f54321k;

    /* renamed from: l */
    public boolean f54322l;

    /* renamed from: m */
    public VelocityTracker f54323m;

    /* renamed from: n */
    public boolean f54324n;

    /* renamed from: o */
    public boolean f54325o;

    /* renamed from: p */
    public int f54326p;

    /* renamed from: q */
    public int f54327q;

    /* renamed from: r */
    public int f54328r;

    /* renamed from: s */
    public int f54329s;

    /* renamed from: t */
    public final int[] f54330t;

    /* renamed from: u */
    public final int[] f54331u;

    /* renamed from: v */
    public int f54332v;

    /* renamed from: w */
    public int f54333w;

    /* renamed from: x */
    public SavedState f54334x;

    /* renamed from: y */
    public final M43 f54335y;

    /* renamed from: z */
    public final J43 f54336z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11556a();

        /* renamed from: b */
        public int f54337b;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes.dex */
        public class C11556a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f54337b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f54337b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f54337b = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    public static class C11557a extends C5148M1 {
        @Override // p000.C5148M1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.m67630r() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C28509t2.m13210a(accessibilityEvent, nestedScrollView.getScrollX());
            C28509t2.m13209b(accessibilityEvent, nestedScrollView.m67630r());
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            int m67630r;
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c27125p2.m20080f0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (m67630r = nestedScrollView.m67630r()) > 0) {
                c27125p2.m20124H0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c27125p2.m20089b(C27125p2.C27126a.f103006r);
                    c27125p2.m20089b(C27125p2.C27126a.f102974C);
                }
                if (nestedScrollView.getScrollY() < m67630r) {
                    c27125p2.m20089b(C27125p2.C27126a.f103005q);
                    c27125p2.m20089b(C27125p2.C27126a.f102976E);
                }
            }
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m67651Q(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.m67630r());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m67651Q(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public static class C11558b {
        private C11558b() {
        }

        /* renamed from: a */
        public static boolean m67619a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11559c {
        /* renamed from: a */
        void mo67618a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public static boolean m67667A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && m67667A((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m67643e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: B */
    public final boolean m67666B(View view, int i, int i2) {
        view.getDrawingRect(this.f54314d);
        offsetDescendantRectToMyCoords(view, this.f54314d);
        if (this.f54314d.bottom + i >= getScrollY() && this.f54314d.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final void m67665C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f54336z.m101212e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: D */
    public final void m67664D(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f54329s) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f54318h = (int) motionEvent.getY(i);
            this.f54329s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f54323m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: E */
    public boolean m67663E(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z2)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z3)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int i11 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i12 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i13 = -i9;
        int i14 = i9 + i5;
        int i15 = -i10;
        int i16 = i10 + i6;
        if (i11 > i14) {
            i11 = i14;
            z6 = true;
        } else if (i11 < i13) {
            z6 = true;
            i11 = i13;
        } else {
            z6 = false;
        }
        if (i12 > i16) {
            i12 = i16;
            z7 = true;
        } else if (i12 < i15) {
            z7 = true;
            i12 = i15;
        } else {
            z7 = false;
        }
        if (z7 && !m67627u(1)) {
            this.f54315e.springBack(i11, i12, 0, 0, 0, m67630r());
        }
        onOverScrolled(i11, i12, z6, z7);
        if (!z6 && !z7) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public boolean m67662F(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f54314d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f54314d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f54314d.top = getScrollY() - height;
            Rect rect2 = this.f54314d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f54314d;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m67658J(i, i2, i3);
    }

    /* renamed from: G */
    public final void m67661G() {
        VelocityTracker velocityTracker = this.f54323m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f54323m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m67660H(int i, float f) {
        float m12998d;
        int round;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (C49071t91.m13000b(this.f54316f) != 0.0f) {
            m12998d = -C49071t91.m12998d(this.f54316f, -height, width);
            if (C49071t91.m13000b(this.f54316f) == 0.0f) {
                this.f54316f.onRelease();
            }
        } else {
            if (C49071t91.m13000b(this.f54317g) != 0.0f) {
                m12998d = C49071t91.m12998d(this.f54317g, height, 1.0f - width);
                if (C49071t91.m13000b(this.f54317g) == 0.0f) {
                    this.f54317g.onRelease();
                }
            }
            round = Math.round(f2 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        f2 = m12998d;
        round = Math.round(f2 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    /* renamed from: I */
    public final void m67659I(boolean z) {
        if (z) {
            m67650R(2, 1);
        } else {
            m67648T(1);
        }
        this.f54333w = getScrollY();
        C38790bq6.m62470m0(this);
    }

    /* renamed from: J */
    public final boolean m67658J(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View m67634n = m67634n(z, i2, i3);
        if (m67634n == null) {
            m67634n = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m67638j(i4);
            z2 = true;
        }
        if (m67634n != findFocus()) {
            m67634n.requestFocus(i);
        }
        return z2;
    }

    /* renamed from: K */
    public final void m67657K(View view) {
        view.getDrawingRect(this.f54314d);
        offsetDescendantRectToMyCoords(view, this.f54314d);
        int m67642f = m67642f(this.f54314d);
        if (m67642f != 0) {
            scrollBy(0, m67642f);
        }
    }

    /* renamed from: L */
    public final boolean m67656L(Rect rect, boolean z) {
        boolean z2;
        int m67642f = m67642f(rect);
        if (m67642f != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, m67642f);
            } else {
                m67654N(0, m67642f);
            }
        }
        return z2;
    }

    /* renamed from: M */
    public final boolean m67655M(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (m67629s(-i) < C49071t91.m13000b(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void m67654N(int i, int i2) {
        m67653O(i, i2, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    /* renamed from: O */
    public final void m67653O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f54313c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f54315e;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m67659I(z);
        } else {
            if (!this.f54315e.isFinished()) {
                m67647a();
            }
            scrollBy(i, i2);
        }
        this.f54313c = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: P */
    public void m67652P(int i, int i2, int i3, boolean z) {
        m67653O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: Q */
    public void m67651Q(int i, int i2, boolean z) {
        m67652P(i, i2, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, z);
    }

    /* renamed from: R */
    public boolean m67650R(int i, int i2) {
        return this.f54336z.m101200q(i, i2);
    }

    /* renamed from: S */
    public final boolean m67649S(MotionEvent motionEvent) {
        boolean z;
        if (C49071t91.m13000b(this.f54316f) != 0.0f) {
            C49071t91.m12998d(this.f54316f, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C49071t91.m13000b(this.f54317g) != 0.0f) {
            C49071t91.m12998d(this.f54317g, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: T */
    public void m67648T(int i) {
        this.f54336z.m101198s(i);
    }

    /* renamed from: a */
    public final void m67647a() {
        this.f54315e.abortAnimation();
        m67648T(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m67646b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int m67631q = m67631q();
        if (findNextFocus != null && m67666B(findNextFocus, m67631q, getHeight())) {
            findNextFocus.getDrawingRect(this.f54314d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f54314d);
            m67638j(m67642f(this.f54314d));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < m67631q) {
                m67631q = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                m67631q = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), m67631q);
            }
            if (m67631q == 0) {
                return false;
            }
            if (i != 130) {
                m67631q = -m67631q;
            }
            m67638j(m67631q);
        }
        if (findFocus != null && findFocus.isFocused() && m67622z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m67645c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode == 1 && m67630r() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f54315e.isFinished()) {
            return;
        }
        this.f54315e.computeScrollOffset();
        int currY = this.f54315e.getCurrY();
        int m67641g = m67641g(currY - this.f54333w);
        this.f54333w = currY;
        int[] iArr = this.f54331u;
        boolean z = false;
        iArr[1] = 0;
        m67640h(0, m67641g, iArr, null, 1);
        int i = m67641g - this.f54331u[1];
        int m67630r = m67630r();
        if (i != 0) {
            int scrollY = getScrollY();
            m67663E(0, i, getScrollX(), scrollY, 0, m67630r, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.f54331u;
            iArr2[1] = 0;
            m67639i(0, scrollY2, 0, i2, this.f54330t, 1, iArr2);
            i = i2 - this.f54331u[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && m67630r > 0)) {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (this.f54316f.isFinished()) {
                        this.f54316f.onAbsorb((int) this.f54315e.getCurrVelocity());
                    }
                } else if (this.f54317g.isFinished()) {
                    this.f54317g.onAbsorb((int) this.f54315e.getCurrVelocity());
                }
            }
            m67647a();
        }
        if (!this.f54315e.isFinished()) {
            C38790bq6.m62470m0(this);
        } else {
            m67648T(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* renamed from: d */
    public final boolean m67644d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m67635m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f54336z.m101216a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f54336z.m101215b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m67640h(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f54336z.m101211f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f54316f.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C11558b.m67619a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C11558b.m67619a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.f54316f.setSize(width, height);
            if (this.f54316f.draw(canvas)) {
                C38790bq6.m62470m0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f54317g.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(m67630r(), scrollY) + height2;
            if (C11558b.m67619a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C11558b.m67619a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f54317g.setSize(width2, height2);
            if (this.f54317g.draw(canvas)) {
                C38790bq6.m62470m0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    public int m67642f(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: g */
    public int m67641g(int i) {
        int height = getHeight();
        if (i > 0 && C49071t91.m13000b(this.f54316f) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C49071t91.m12998d(this.f54316f, ((-i) * 4.0f) / height, 0.5f));
            if (round != i) {
                this.f54316f.finish();
            }
            return i - round;
        } else if (i < 0 && C49071t91.m13000b(this.f54317g) != 0.0f) {
            float f = height;
            int round2 = Math.round((f / 4.0f) * C49071t91.m12998d(this.f54317g, (i * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f54317g.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f54335y.m95845a();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m67640h(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f54336z.m101213d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m67627u(0);
    }

    /* renamed from: i */
    public void m67639i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f54336z.m101212e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f54336z.m101204m();
    }

    /* renamed from: j */
    public final void m67638j(int i) {
        if (i != 0) {
            if (this.f54325o) {
                m67654N(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: k */
    public final boolean m67637k(int i) {
        if (C49071t91.m13000b(this.f54316f) != 0.0f) {
            if (m67655M(this.f54316f, i)) {
                this.f54316f.onAbsorb(i);
            } else {
                m67633o(-i);
            }
        } else if (C49071t91.m13000b(this.f54317g) != 0.0f) {
            int i2 = -i;
            if (m67655M(this.f54317g, i2)) {
                this.f54317g.onAbsorb(i2);
            } else {
                m67633o(i2);
            }
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void m67636l() {
        this.f54322l = false;
        m67661G();
        m67648T(0);
        this.f54316f.onRelease();
        this.f54317g.onRelease();
    }

    /* renamed from: m */
    public boolean m67635m(KeyEvent keyEvent) {
        this.f54314d.setEmpty();
        int i = 130;
        if (!m67644d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m67662F(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m67646b(130);
                } else {
                    return m67632p(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m67646b(33);
            } else {
                return m67632p(33);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final View m67634n(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i < top && bottom < i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                            view = view2;
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z3) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: o */
    public void m67633o(int i) {
        if (getChildCount() > 0) {
            this.f54315e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m67659I(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54320j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f54322l) {
            if (SV2.m85339e(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
            } else if (SV2.m85339e(motionEvent, 4194304)) {
                f = motionEvent.getAxisValue(26);
            } else {
                f = 0.0f;
            }
            if (f != 0.0f) {
                int m67630r = m67630r();
                int scrollY = getScrollY();
                int m67628t = scrollY - ((int) (f * m67628t()));
                if (m67628t < 0) {
                    if (m67645c() && !SV2.m85339e(motionEvent, 8194)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        C49071t91.m12998d(this.f54316f, (-m67628t) / getHeight(), 0.5f);
                        this.f54316f.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        z = 0;
                    }
                } else if (m67628t > m67630r) {
                    if (m67645c() && !SV2.m85339e(motionEvent, 8194)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C49071t91.m12998d(this.f54317g, (m67628t - m67630r) / getHeight(), 0.5f);
                        this.f54317g.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = m67630r;
                } else {
                    z = 0;
                    i = m67628t;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f54322l) {
            return true;
        }
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            m67664D(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.f54329s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f54318h) > this.f54326p && (2 & getNestedScrollAxes()) == 0) {
                                this.f54322l = true;
                                this.f54318h = y;
                                m67623y();
                                this.f54323m.addMovement(motionEvent);
                                this.f54332v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f54322l = false;
            this.f54329s = -1;
            m67661G();
            if (this.f54315e.springBack(getScrollX(), getScrollY(), 0, 0, 0, m67630r())) {
                C38790bq6.m62470m0(this);
            }
            m67648T(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m67626v((int) motionEvent.getX(), y2)) {
                if (!m67649S(motionEvent) && this.f54315e.isFinished()) {
                    z = false;
                }
                this.f54322l = z;
                m67661G();
            } else {
                this.f54318h = y2;
                this.f54329s = motionEvent.getPointerId(0);
                m67625w();
                this.f54323m.addMovement(motionEvent);
                this.f54315e.computeScrollOffset();
                if (!m67649S(motionEvent) && this.f54315e.isFinished()) {
                    z = false;
                }
                this.f54322l = z;
                m67650R(2, 0);
            }
        }
        return this.f54322l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f54319i = false;
        View view = this.f54321k;
        if (view != null && m67667A(view, this)) {
            m67657K(this.f54321k);
        }
        this.f54321k = null;
        if (!this.f54320j) {
            if (this.f54334x != null) {
                scrollTo(getScrollX(), this.f54334x.f54337b);
                this.f54334x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m67643e = m67643e(scrollY, paddingTop, i5);
            if (m67643e != scrollY) {
                scrollTo(getScrollX(), m67643e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f54320j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f54324n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            m67633o((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // p000.K43
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m67640h(i, i2, iArr, null, i3);
    }

    @Override // p000.L43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m67665C(i4, i5, iArr);
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f54335y.m95843c(view, view2, i, i2);
        m67650R(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || m67622z(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f54334x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54337b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC11559c interfaceC11559c = this.f54311B;
        if (interfaceC11559c != null) {
            interfaceC11559c.mo67618a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m67666B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f54314d);
            offsetDescendantRectToMyCoords(findFocus, this.f54314d);
            m67638j(m67642f(this.f54314d));
        }
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p000.K43
    public void onStopNestedScroll(View view, int i) {
        this.f54335y.m95841e(view, i);
        m67648T(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        boolean z2;
        m67623y();
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f54332v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f54332v);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m67664D(motionEvent);
                                this.f54318h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f54329s));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f54318h = (int) motionEvent.getY(actionIndex);
                            this.f54329s = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f54322l && getChildCount() > 0 && this.f54315e.springBack(getScrollX(), getScrollY(), 0, 0, 0, m67630r())) {
                            C38790bq6.m62470m0(this);
                        }
                        this.f54329s = -1;
                        m67636l();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f54329s);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f54329s + " in onTouchEvent");
                    } else {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i = this.f54318h - y;
                        int m67660H = i - m67660H(i, motionEvent.getX(findPointerIndex));
                        if (!this.f54322l && Math.abs(m67660H) > this.f54326p) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f54322l = true;
                            m67660H = m67660H > 0 ? m67660H - this.f54326p : m67660H + this.f54326p;
                        }
                        int i2 = m67660H;
                        if (this.f54322l) {
                            if (m67640h(0, i2, this.f54331u, this.f54330t, 0)) {
                                i2 -= this.f54331u[1];
                                this.f54332v += this.f54330t[1];
                            }
                            int i3 = i2;
                            this.f54318h = y - this.f54330t[1];
                            int scrollY = getScrollY();
                            int m67630r = m67630r();
                            int overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 && (overScrollMode != 1 || m67630r <= 0)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (m67663E(0, i3, 0, getScrollY(), 0, m67630r, 0, 0, true) && !m67627u(0)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.f54331u;
                            iArr[1] = 0;
                            m67639i(0, scrollY2, 0, i3 - scrollY2, this.f54330t, 0, iArr);
                            int i4 = this.f54318h;
                            int i5 = this.f54330t[1];
                            this.f54318h = i4 - i5;
                            this.f54332v += i5;
                            if (z) {
                                int i6 = i3 - this.f54331u[1];
                                int i7 = scrollY + i6;
                                if (i7 < 0) {
                                    C49071t91.m12998d(this.f54316f, (-i6) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                    if (!this.f54317g.isFinished()) {
                                        this.f54317g.onRelease();
                                    }
                                } else if (i7 > m67630r) {
                                    C49071t91.m12998d(this.f54317g, i6 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f54316f.isFinished()) {
                                        this.f54316f.onRelease();
                                    }
                                }
                                if (!this.f54316f.isFinished() || !this.f54317g.isFinished()) {
                                    C38790bq6.m62470m0(this);
                                    if (z3) {
                                        this.f54323m.clear();
                                    }
                                }
                            }
                            z3 = z2;
                            if (z3) {
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.f54323m;
                velocityTracker.computeCurrentVelocity(1000, this.f54328r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f54329s);
                if (Math.abs(yVelocity) >= this.f54327q) {
                    if (!m67637k(yVelocity)) {
                        int i8 = -yVelocity;
                        float f = i8;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            m67633o(i8);
                        }
                    }
                } else if (this.f54315e.springBack(getScrollX(), getScrollY(), 0, 0, 0, m67630r())) {
                    C38790bq6.m62470m0(this);
                }
                this.f54329s = -1;
                m67636l();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f54322l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f54315e.isFinished()) {
                m67647a();
            }
            this.f54318h = (int) motionEvent.getY();
            this.f54329s = motionEvent.getPointerId(0);
            m67650R(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f54323m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public boolean m67632p(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f54314d;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f54314d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f54314d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f54314d;
        return m67658J(i, rect3.top, rect3.bottom);
    }

    /* renamed from: q */
    public int m67631q() {
        return (int) (getHeight() * 0.5f);
    }

    /* renamed from: r */
    public int m67630r() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f54319i) {
            m67657K(view2);
        } else {
            this.f54321k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m67656L(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m67661G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f54319i = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final float m67629s(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.f54312b * 0.015f));
        float f = f54307C;
        return (float) (this.f54312b * 0.015f * Math.exp((f / (f - 1.0d)) * log));
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int m67643e = m67643e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m67643e2 = m67643e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m67643e != getScrollX() || m67643e2 != getScrollY()) {
                super.scrollTo(m67643e, m67643e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f54324n) {
            this.f54324n = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f54336z.m101203n(z);
    }

    public void setOnScrollChangeListener(InterfaceC11559c interfaceC11559c) {
        this.f54311B = interfaceC11559c;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f54325o = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m67650R(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m67648T(0);
    }

    /* renamed from: t */
    public final float m67628t() {
        if (this.f54310A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f54310A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f54310A;
    }

    /* renamed from: u */
    public boolean m67627u(int i) {
        return this.f54336z.m101205l(i);
    }

    /* renamed from: v */
    public final boolean m67626v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final void m67625w() {
        VelocityTracker velocityTracker = this.f54323m;
        if (velocityTracker == null) {
            this.f54323m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    public final void m67624x() {
        this.f54315e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f54326p = viewConfiguration.getScaledTouchSlop();
        this.f54327q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f54328r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    public final void m67623y() {
        if (this.f54323m == null) {
            this.f54323m = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    public final boolean m67622z(View view) {
        return !m67666B(view, 0, getHeight());
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C46404of4.nestedScrollViewStyle);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // p000.K43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m67665C(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54314d = new Rect();
        this.f54319i = true;
        this.f54320j = false;
        this.f54321k = null;
        this.f54322l = false;
        this.f54325o = true;
        this.f54329s = -1;
        this.f54330t = new int[2];
        this.f54331u = new int[2];
        this.f54316f = C49071t91.m13001a(context, attributeSet);
        this.f54317g = C49071t91.m13001a(context, attributeSet);
        this.f54312b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m67624x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f54309E, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f54335y = new M43(this);
        this.f54336z = new J43(this);
        setNestedScrollingEnabled(true);
        C38790bq6.m62452v0(this, f54308D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m67665C(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
