package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements K43, L43 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors;
    private static final InterfaceC41591gY3<Rect> sRectPool;
    private InterfaceC36332Ue3 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final C43092j41<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private DB6 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final M43 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private ViewTreeObserver$OnPreDrawListenerC11530f mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* loaded from: classes.dex */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((C11529e) view.getLayoutParams()).f54229r;
        }

        public static void setTag(View view, Object obj) {
            ((C11529e) view.getLayoutParams()).f54229r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public DB6 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, DB6 db6) {
            return db6;
        }

        public void onAttachedToLayoutParams(C11529e c11529e) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C11525a implements InterfaceC36332Ue3 {
        public C11525a() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            return CoordinatorLayout.this.setWindowInsets(db6);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11526b {
        /* renamed from: a */
        Behavior mo49180a();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public @interface InterfaceC11527c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public class ViewGroup$OnHierarchyChangeListenerC11528d implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup$OnHierarchyChangeListenerC11528d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC11530f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC11530f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public static class C11531g implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m62518S = C38790bq6.m62518S(view);
            float m62518S2 = C38790bq6.m62518S(view2);
            if (m62518S > m62518S2) {
                return -1;
            }
            if (m62518S < m62518S2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        WIDGET_PACKAGE_NAME = str;
        TOP_SORTED_CHILDREN_COMPARATOR = new C11531g();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new C43963kY3(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static Rect acquireTempRect() {
        Rect mo9830a = sRectPool.mo9830a();
        if (mo9830a == null) {
            return new Rect();
        }
        return mo9830a;
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void constrainChildRect(C11529e c11529e, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c11529e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c11529e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11529e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private DB6 dispatchApplyWindowInsetsToBehaviors(DB6 db6) {
        Behavior m67769f;
        if (db6.m110773q()) {
            return db6;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C38790bq6.m62554A(childAt) && (m67769f = ((C11529e) childAt.getLayoutParams()).m67769f()) != null) {
                db6 = m67769f.onApplyWindowInsets(this, childAt, db6);
                if (db6.m110773q()) {
                    break;
                }
            }
        }
        return db6;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, C11529e c11529e, int i2, int i3) {
        int width;
        int height;
        int m75415b = YD1.m75415b(resolveAnchoredChildGravity(c11529e.f54214c), i);
        int m75415b2 = YD1.m75415b(resolveGravity(c11529e.f54215d), i);
        int i4 = m75415b & 7;
        int i5 = m75415b & 112;
        int i6 = m75415b2 & 7;
        int i7 = m75415b2 & 112;
        if (i6 != 1) {
            if (i6 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i4 != 1) {
            if (i4 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i5 != 16) {
            if (i5 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    private void getTopSortedChildren(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.m31175j(view);
    }

    private void layoutChild(View view, int i) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c11529e).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11529e).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c11529e).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin);
        if (this.mLastInsets != null && C38790bq6.m62554A(this) && !C38790bq6.m62554A(view)) {
            acquireTempRect.left += this.mLastInsets.m110779k();
            acquireTempRect.top += this.mLastInsets.m110777m();
            acquireTempRect.right -= this.mLastInsets.m110778l();
            acquireTempRect.bottom -= this.mLastInsets.m110780j();
        }
        Rect acquireTempRect2 = acquireTempRect();
        YD1.m75416a(resolveGravity(c11529e.f54214c), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        int m75415b = YD1.m75415b(resolveKeylineGravity(c11529e.f54214c), i2);
        int i3 = m75415b & 7;
        int i4 = m75415b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i3 != 1) {
            if (i3 == 5) {
                keyline += measuredWidth;
            }
        } else {
            keyline += measuredWidth / 2;
        }
        int i5 = 0;
        if (i4 != 16) {
            if (i4 == 80) {
                i5 = measuredHeight + 0;
            }
        } else {
            i5 = 0 + (measuredHeight / 2);
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c11529e).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c11529e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11529e).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C38790bq6.m62504Z(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C11529e c11529e = (C11529e) view.getLayoutParams();
            Behavior m67769f = c11529e.m67769f();
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m67769f != null && m67769f.getInsetDodgeRect(this, view, acquireTempRect)) {
                if (!acquireTempRect2.contains(acquireTempRect)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + acquireTempRect.toShortString() + " | Bounds:" + acquireTempRect2.toShortString());
                }
            } else {
                acquireTempRect.set(acquireTempRect2);
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int m75415b = YD1.m75415b(c11529e.f54219h, i);
            boolean z3 = true;
            if ((m75415b & 48) == 48 && (i6 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) c11529e).topMargin) - c11529e.f54221j) < (i7 = rect.top)) {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            } else {
                z = false;
            }
            if ((m75415b & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin) + c11529e.f54221j) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((m75415b & 3) == 3 && (i3 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) c11529e).leftMargin) - c11529e.f54220i) < (i4 = rect.left)) {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((m75415b & 5) == 5 && (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) c11529e).rightMargin) + c11529e.f54220i) < (i2 = rect.right)) {
                setInsetOffsetX(view, width - i2);
            } else {
                z3 = z2;
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + CoreConstants.DOT + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C11529e c11529e = (C11529e) view.getLayoutParams();
            Behavior m67769f = c11529e.m67769f();
            if ((z || z2) && actionMasked != 0) {
                if (m67769f != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            m67769f.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        m67769f.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z && m67769f != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z = m67769f.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z = m67769f.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean m67772c = c11529e.m67772c();
                boolean m67765j = c11529e.m67765j(this, view);
                if (m67765j && !m67772c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m67765j && !z2) {
                    break;
                }
            }
        }
        list.clear();
        return z;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.m31182c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C11529e resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.m67771d(this, childAt);
            this.mChildDag.m31183b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.m67773b(this, childAt, childAt2)) {
                        if (!this.mChildDag.m31181d(childAt2)) {
                            this.mChildDag.m31183b(childAt2);
                        }
                        this.mChildDag.m31184a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.m31176i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.mo9829b(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior m67769f = ((C11529e) childAt.getLayoutParams()).m67769f();
            if (m67769f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m67769f.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    m67769f.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C11529e) getChildAt(i2).getLayoutParams()).m67761n();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void setInsetOffsetX(View view, int i) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        int i2 = c11529e.f54220i;
        if (i2 != i) {
            C38790bq6.m62486f0(view, i - i2);
            c11529e.f54220i = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        int i2 = c11529e.f54221j;
        if (i2 != i) {
            C38790bq6.m62483g0(view, i - i2);
            c11529e.f54221j = i;
        }
    }

    private void setupForInsets() {
        if (C38790bq6.m62554A(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C11525a();
            }
            C38790bq6.m62531L0(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        C38790bq6.m62531L0(this, null);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserver$OnPreDrawListenerC11530f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C11529e) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List m31178g = this.mChildDag.m31178g(view);
        if (m31178g != null && !m31178g.isEmpty()) {
            for (int i = 0; i < m31178g.size(); i++) {
                View view2 = (View) m31178g.get(i);
                Behavior m67769f = ((C11529e) view2.getLayoutParams()).m67769f();
                if (m67769f != null) {
                    m67769f.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        getChildRect(view, z, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        getChildRect(view2, z2, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        Behavior behavior = c11529e.f54212a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c11529e.f54212a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                getDescendantRect(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public List<View> getDependencies(View view) {
        List<View> m31177h = this.mChildDag.m31177h(view);
        this.mTempDependenciesList.clear();
        if (m31177h != null) {
            this.mTempDependenciesList.addAll(m31177h);
        }
        return this.mTempDependenciesList;
    }

    public List<View> getDependents(View view) {
        List m31178g = this.mChildDag.m31178g(view);
        this.mTempDependenciesList.clear();
        if (m31178g != null) {
            this.mTempDependenciesList.addAll(m31178g);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        C45340mr6.m24843a(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, c11529e, measuredWidth, measuredHeight);
        constrainChildRect(c11529e, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C11529e) view.getLayoutParams()).m67767h());
    }

    public final DB6 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m95845a();
    }

    public C11529e getResolvedLayoutParams(View view) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        if (!c11529e.f54213b) {
            if (view instanceof InterfaceC11526b) {
                Behavior mo49180a = ((InterfaceC11526b) view).mo49180a();
                if (mo49180a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c11529e.m67758q(mo49180a);
                c11529e.f54213b = true;
            } else {
                InterfaceC11527c interfaceC11527c = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC11527c = (InterfaceC11527c) cls.getAnnotation(InterfaceC11527c.class);
                    if (interfaceC11527c != null) {
                        break;
                    }
                }
                if (interfaceC11527c != null) {
                    try {
                        c11529e.m67758q(interfaceC11527c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC11527c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c11529e.f54213b = true;
            }
        }
        return c11529e;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        Behavior m67769f;
        C11529e c11529e = (C11529e) view.getLayoutParams();
        if (c11529e.f54222k != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(c11529e.f54222k, acquireTempRect);
            boolean z = false;
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i, acquireTempRect, acquireTempRect3, c11529e, measuredWidth, measuredHeight);
            z = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? true : true;
            constrainChildRect(c11529e, acquireTempRect3, measuredWidth, measuredHeight);
            int i2 = acquireTempRect3.left - acquireTempRect2.left;
            int i3 = acquireTempRect3.top - acquireTempRect2.top;
            if (i2 != 0) {
                C38790bq6.m62486f0(view, i2);
            }
            if (i3 != 0) {
                C38790bq6.m62483g0(view, i3);
            }
            if (z && (m67769f = c11529e.m67769f()) != null) {
                m67769f.onDependentViewChanged(this, view, c11529e.f54222k);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserver$OnPreDrawListenerC11530f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && C38790bq6.m62554A(this)) {
            C38790bq6.m62458s0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i) {
        boolean z;
        int m62548D = C38790bq6.m62548D(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mDependencySortedChildren.get(i2);
            C11529e c11529e = (C11529e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c11529e.f54223l == this.mDependencySortedChildren.get(i3)) {
                        offsetChildToAnchor(view, m62548D);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (c11529e.f54218g != 0 && !acquireTempRect2.isEmpty()) {
                    int m75415b = YD1.m75415b(c11529e.f54218g, m62548D);
                    int i4 = m75415b & 112;
                    if (i4 != 48) {
                        if (i4 == 80) {
                            acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                        }
                    } else {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    }
                    int i5 = m75415b & 7;
                    if (i5 != 3) {
                        if (i5 == 5) {
                            acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                        }
                    } else {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    }
                }
                if (c11529e.f54219h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, m62548D);
                }
                if (i != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.mDependencySortedChildren.get(i6);
                    C11529e c11529e2 = (C11529e) view2.getLayoutParams();
                    Behavior m67769f = c11529e2.m67769f();
                    if (m67769f != null && m67769f.layoutDependsOn(this, view2, view)) {
                        if (i == 0 && c11529e2.m67768g()) {
                            c11529e2.m67763l();
                        } else {
                            if (i != 2) {
                                z = m67769f.onDependentViewChanged(this, view2, view);
                            } else {
                                m67769f.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c11529e2.m67757r(z);
                            }
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            DB6 db6 = this.mLastInsets;
            if (db6 != null) {
                i = db6.m110777m();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior m67769f;
        int m62548D = C38790bq6.m62548D(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((m67769f = ((C11529e) view.getLayoutParams()).m67769f()) == null || !m67769f.onLayoutChild(this, view, m62548D))) {
                onLayoutChild(view, m62548D);
            }
        }
    }

    public void onLayoutChild(View view, int i) {
        C11529e c11529e = (C11529e) view.getLayoutParams();
        if (!c11529e.m67774a()) {
            View view2 = c11529e.f54222k;
            if (view2 != null) {
                layoutChildWithAnchor(view, view2, i);
                return;
            }
            int i2 = c11529e.f54216e;
            if (i2 >= 0) {
                layoutChildWithKeyline(view, i2, i);
                return;
            } else {
                layoutChild(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        Behavior m67769f;
        C11529e c11529e;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        prepareChildren();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int m62548D = C38790bq6.m62548D(this);
        if (m62548D == 1) {
            z = true;
        } else {
            z = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i13 = paddingLeft + paddingRight;
        int i14 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.mLastInsets != null && C38790bq6.m62554A(this)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int size3 = this.mDependencySortedChildren.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        int i17 = 0;
        int i18 = 0;
        while (i18 < size3) {
            View view = this.mDependencySortedChildren.get(i18);
            if (view.getVisibility() == 8) {
                i11 = i18;
                i8 = size3;
                i9 = paddingLeft;
            } else {
                C11529e c11529e2 = (C11529e) view.getLayoutParams();
                int i19 = c11529e2.f54216e;
                if (i19 >= 0 && mode != 0) {
                    int keyline = getKeyline(i19);
                    int m75415b = YD1.m75415b(resolveKeylineGravity(c11529e2.f54214c), m62548D) & 7;
                    i3 = i17;
                    if ((m75415b == 3 && !z) || (m75415b == 5 && z)) {
                        i4 = Math.max(0, (size - paddingRight) - keyline);
                    } else if ((m75415b == 5 && !z) || (m75415b == 3 && z)) {
                        i4 = Math.max(0, keyline - paddingLeft);
                    }
                    if (!z2 && !C38790bq6.m62554A(view)) {
                        i5 = View.MeasureSpec.makeMeasureSpec(size - (this.mLastInsets.m110779k() + this.mLastInsets.m110778l()), mode);
                        i6 = View.MeasureSpec.makeMeasureSpec(size2 - (this.mLastInsets.m110777m() + this.mLastInsets.m110780j()), mode2);
                    } else {
                        i5 = i;
                        i6 = i2;
                    }
                    m67769f = c11529e2.m67769f();
                    if (m67769f == null) {
                        c11529e = c11529e2;
                        i10 = i3;
                        i11 = i18;
                        i7 = i16;
                        i9 = paddingLeft;
                        i12 = i15;
                        i8 = size3;
                    } else {
                        c11529e = c11529e2;
                        i7 = i16;
                        i8 = size3;
                        i9 = paddingLeft;
                        i10 = i3;
                        i11 = i18;
                        i12 = i15;
                    }
                    onMeasureChild(view, i5, i4, i6, 0);
                    C11529e c11529e3 = c11529e;
                    int max = Math.max(i12, i13 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c11529e3).leftMargin + ((ViewGroup.MarginLayoutParams) c11529e3).rightMargin);
                    int max2 = Math.max(i7, i14 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11529e3).topMargin + ((ViewGroup.MarginLayoutParams) c11529e3).bottomMargin);
                    i17 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    i15 = max;
                    i16 = max2;
                } else {
                    i3 = i17;
                }
                i4 = 0;
                if (!z2) {
                }
                i5 = i;
                i6 = i2;
                m67769f = c11529e2.m67769f();
                if (m67769f == null) {
                }
                onMeasureChild(view, i5, i4, i6, 0);
                C11529e c11529e32 = c11529e;
                int max3 = Math.max(i12, i13 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c11529e32).leftMargin + ((ViewGroup.MarginLayoutParams) c11529e32).rightMargin);
                int max22 = Math.max(i7, i14 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11529e32).topMargin + ((ViewGroup.MarginLayoutParams) c11529e32).bottomMargin);
                i17 = View.combineMeasuredStates(i10, view.getMeasuredState());
                i15 = max3;
                i16 = max22;
            }
            i18 = i11 + 1;
            paddingLeft = i9;
            size3 = i8;
        }
        int i20 = i17;
        setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior m67769f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C11529e c11529e = (C11529e) childAt.getLayoutParams();
                if (c11529e.m67764k(0) && (m67769f = c11529e.m67769f()) != null) {
                    z2 |= m67769f.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior m67769f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C11529e c11529e = (C11529e) childAt.getLayoutParams();
                if (c11529e.m67764k(0) && (m67769f = c11529e.m67769f()) != null) {
                    z |= m67769f.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        SparseArray<Parcelable> sparseArray = savedState.f54209d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior m67769f = getResolvedLayoutParams(childAt).m67769f();
            if (id != -1 && m67769f != null && (parcelable2 = sparseArray.get(id)) != null) {
                m67769f.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior m67769f = ((C11529e) childAt.getLayoutParams()).m67769f();
            if (id != -1 && m67769f != null && (onSaveInstanceState = m67769f.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f54209d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            z = performIntercept(motionEvent, 1);
        } else {
            z = false;
        }
        Behavior m67769f = ((C11529e) this.mBehaviorTouchView.getLayoutParams()).m67769f();
        if (m67769f != null) {
            onTouchEvent = m67769f.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
            motionEvent2 = null;
            if (this.mBehaviorTouchView != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                resetTouchBehaviors(false);
            }
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        resetTouchBehaviors(false);
        return onTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C11529e) view.getLayoutParams()).m67756s(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior m67769f = ((C11529e) view.getLayoutParams()).m67769f();
        if (m67769f != null && m67769f.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                P61.m90839m(this.mStatusBarBackground, C38790bq6.m62548D(this));
                Drawable drawable4 = this.mStatusBarBackground;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.mStatusBarBackground.setCallback(this);
            }
            C38790bq6.m62470m0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? NA0.m94299e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z) {
            this.mStatusBarBackground.setVisible(z, false);
        }
    }

    public final DB6 setWindowInsets(DB6 db6) {
        boolean z;
        if (!C37259Yd3.m74780a(this.mLastInsets, db6)) {
            this.mLastInsets = db6;
            boolean z2 = true;
            if (db6 != null && db6.m110777m() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.mDrawStatusBarBackground = z;
            if (z || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            DB6 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(db6);
            requestLayout();
            return dispatchApplyWindowInsetsToBehaviors;
        }
        return db6;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C45811nf4.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public C11529e generateDefaultLayoutParams() {
        return new C11529e(-2, -2);
    }

    @Override // p000.K43
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior m67769f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C11529e c11529e = (C11529e) childAt.getLayoutParams();
                if (c11529e.m67764k(i3) && (m67769f = c11529e.m67769f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m67769f.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // p000.K43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior m67769f;
        this.mNestedScrollingParentHelper.m95843c(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C11529e c11529e = (C11529e) childAt.getLayoutParams();
            if (c11529e.m67764k(i2) && (m67769f = c11529e.m67769f()) != null) {
                m67769f.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C11529e c11529e = (C11529e) childAt.getLayoutParams();
                Behavior m67769f = c11529e.m67769f();
                if (m67769f != null) {
                    boolean onStartNestedScroll = m67769f.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    c11529e.m67755t(i2, onStartNestedScroll);
                } else {
                    c11529e.m67755t(i2, false);
                }
            }
        }
        return z;
    }

    @Override // p000.K43
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m95841e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C11529e c11529e = (C11529e) childAt.getLayoutParams();
            if (c11529e.m67764k(i)) {
                Behavior m67769f = c11529e.m67769f();
                if (m67769f != null) {
                    m67769f.onStopNestedScroll(this, childAt, view, i);
                }
                c11529e.m67762m(i);
                c11529e.m67763l();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C43092j41<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new M43(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39952dm4.CoordinatorLayout, 0, C31950Bl4.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39952dm4.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C39952dm4.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, C31950Bl4.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C39952dm4.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C39952dm4.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.mKeylines;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(C39952dm4.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC11528d());
        if (C38790bq6.m62552B(this) == 0) {
            C38790bq6.m62539H0(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public C11529e generateLayoutParams(AttributeSet attributeSet) {
        return new C11529e(getContext(), attributeSet);
    }

    @Override // p000.L43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior m67769f;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C11529e c11529e = (C11529e) childAt.getLayoutParams();
                if (c11529e.m67764k(i5) && (m67769f = c11529e.m67769f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m67769f.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        min = Math.max(i7, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        min = Math.min(i7, this.mBehaviorConsumed[1]);
                    }
                    i7 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public C11529e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C11529e) {
            return new C11529e((C11529e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C11529e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C11529e(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11524a();

        /* renamed from: d */
        public SparseArray<Parcelable> f54209d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes.dex */
        public static class C11524a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f54209d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f54209d.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f54209d;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f54209d.keyAt(i3);
                parcelableArr[i3] = this.f54209d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    public static class C11529e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f54212a;

        /* renamed from: b */
        public boolean f54213b;

        /* renamed from: c */
        public int f54214c;

        /* renamed from: d */
        public int f54215d;

        /* renamed from: e */
        public int f54216e;

        /* renamed from: f */
        public int f54217f;

        /* renamed from: g */
        public int f54218g;

        /* renamed from: h */
        public int f54219h;

        /* renamed from: i */
        public int f54220i;

        /* renamed from: j */
        public int f54221j;

        /* renamed from: k */
        public View f54222k;

        /* renamed from: l */
        public View f54223l;

        /* renamed from: m */
        public boolean f54224m;

        /* renamed from: n */
        public boolean f54225n;

        /* renamed from: o */
        public boolean f54226o;

        /* renamed from: p */
        public boolean f54227p;

        /* renamed from: q */
        public final Rect f54228q;

        /* renamed from: r */
        public Object f54229r;

        public C11529e(int i, int i2) {
            super(i, i2);
            this.f54213b = false;
            this.f54214c = 0;
            this.f54215d = 0;
            this.f54216e = -1;
            this.f54217f = -1;
            this.f54218g = 0;
            this.f54219h = 0;
            this.f54228q = new Rect();
        }

        /* renamed from: a */
        public boolean m67774a() {
            return this.f54222k == null && this.f54217f != -1;
        }

        /* renamed from: b */
        public boolean m67773b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            if (view2 != this.f54223l && !m67754u(view2, C38790bq6.m62548D(coordinatorLayout)) && ((behavior = this.f54212a) == null || !behavior.layoutDependsOn(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public boolean m67772c() {
            if (this.f54212a == null) {
                this.f54224m = false;
            }
            return this.f54224m;
        }

        /* renamed from: d */
        public View m67771d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f54217f == -1) {
                this.f54223l = null;
                this.f54222k = null;
                return null;
            }
            if (this.f54222k == null || !m67753v(view, coordinatorLayout)) {
                m67760o(view, coordinatorLayout);
            }
            return this.f54222k;
        }

        /* renamed from: e */
        public int m67770e() {
            return this.f54217f;
        }

        /* renamed from: f */
        public Behavior m67769f() {
            return this.f54212a;
        }

        /* renamed from: g */
        public boolean m67768g() {
            return this.f54227p;
        }

        /* renamed from: h */
        public Rect m67767h() {
            return this.f54228q;
        }

        /* renamed from: i */
        public void m67766i() {
            this.f54223l = null;
            this.f54222k = null;
        }

        /* renamed from: j */
        public boolean m67765j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f54224m;
            if (z2) {
                return true;
            }
            Behavior behavior = this.f54212a;
            if (behavior != null) {
                z = behavior.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f54224m = z3;
            return z3;
        }

        /* renamed from: k */
        public boolean m67764k(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f54226o;
            }
            return this.f54225n;
        }

        /* renamed from: l */
        public void m67763l() {
            this.f54227p = false;
        }

        /* renamed from: m */
        public void m67762m(int i) {
            m67755t(i, false);
        }

        /* renamed from: n */
        public void m67761n() {
            this.f54224m = false;
        }

        /* renamed from: o */
        public final void m67760o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f54217f);
            this.f54222k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f54223l = null;
                        this.f54222k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f54223l = null;
                            this.f54222k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f54223l = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.f54223l = null;
                this.f54222k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f54217f) + " to anchor view " + view);
            }
        }

        /* renamed from: p */
        public void m67759p(int i) {
            m67766i();
            this.f54217f = i;
        }

        /* renamed from: q */
        public void m67758q(Behavior behavior) {
            Behavior behavior2 = this.f54212a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f54212a = behavior;
                this.f54229r = null;
                this.f54213b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* renamed from: r */
        public void m67757r(boolean z) {
            this.f54227p = z;
        }

        /* renamed from: s */
        public void m67756s(Rect rect) {
            this.f54228q.set(rect);
        }

        /* renamed from: t */
        public void m67755t(int i, boolean z) {
            if (i != 0) {
                if (i == 1) {
                    this.f54226o = z;
                    return;
                }
                return;
            }
            this.f54225n = z;
        }

        /* renamed from: u */
        public final boolean m67754u(View view, int i) {
            int m75415b = YD1.m75415b(((C11529e) view.getLayoutParams()).f54218g, i);
            if (m75415b != 0 && (YD1.m75415b(this.f54219h, i) & m75415b) == m75415b) {
                return true;
            }
            return false;
        }

        /* renamed from: v */
        public final boolean m67753v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f54222k.getId() != this.f54217f) {
                return false;
            }
            View view2 = this.f54222k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f54223l = null;
                    this.f54222k = null;
                    return false;
                }
            }
            this.f54223l = view2;
            return true;
        }

        public C11529e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f54213b = false;
            this.f54214c = 0;
            this.f54215d = 0;
            this.f54216e = -1;
            this.f54217f = -1;
            this.f54218g = 0;
            this.f54219h = 0;
            this.f54228q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39952dm4.CoordinatorLayout_Layout);
            this.f54214c = obtainStyledAttributes.getInteger(C39952dm4.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f54217f = obtainStyledAttributes.getResourceId(C39952dm4.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f54215d = obtainStyledAttributes.getInteger(C39952dm4.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f54216e = obtainStyledAttributes.getInteger(C39952dm4.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f54218g = obtainStyledAttributes.getInt(C39952dm4.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f54219h = obtainStyledAttributes.getInt(C39952dm4.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = C39952dm4.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f54213b = hasValue;
            if (hasValue) {
                this.f54212a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f54212a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public C11529e(C11529e c11529e) {
            super((ViewGroup.MarginLayoutParams) c11529e);
            this.f54213b = false;
            this.f54214c = 0;
            this.f54215d = 0;
            this.f54216e = -1;
            this.f54217f = -1;
            this.f54218g = 0;
            this.f54219h = 0;
            this.f54228q = new Rect();
        }

        public C11529e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f54213b = false;
            this.f54214c = 0;
            this.f54215d = 0;
            this.f54216e = -1;
            this.f54217f = -1;
            this.f54218g = 0;
            this.f54219h = 0;
            this.f54228q = new Rect();
        }

        public C11529e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f54213b = false;
            this.f54214c = 0;
            this.f54215d = 0;
            this.f54216e = -1;
            this.f54217f = -1;
            this.f54218g = 0;
            this.f54219h = 0;
            this.f54228q = new Rect();
        }
    }
}
