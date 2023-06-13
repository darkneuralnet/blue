package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;
import net.danlew.android.joda.DateUtils;
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC39022cE3 mAdapter;
    private List<InterfaceC12075h> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC12076i mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C12073f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C12078k mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC12076i mOnPageChangeListener;
    private List<InterfaceC12076i> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC12077j mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C12073f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<C12073f> COMPARATOR = new C12068a();
    private static final Interpolator sInterpolator = new animationInterpolatorC12069b();
    private static final C12080m sPositionComparator = new C12080m();

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C12067a();

        /* renamed from: d */
        public int f56056d;

        /* renamed from: e */
        public Parcelable f56057e;

        /* renamed from: f */
        public ClassLoader f56058f;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes.dex */
        public static class C12067a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f56056d + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f56056d);
            parcel.writeParcelable(this.f56057e, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f56056d = parcel.readInt();
            this.f56057e = parcel.readParcelable(classLoader);
            this.f56058f = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    public static class C12068a implements Comparator<C12073f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C12073f c12073f, C12073f c12073f2) {
            return c12073f.f56063b - c12073f2.f56063b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationInterpolatorC12069b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    public class RunnableC12070c implements Runnable {
        public RunnableC12070c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C12071d implements InterfaceC36332Ue3 {

        /* renamed from: b */
        public final Rect f56060b = new Rect();

        public C12071d() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            DB6 m62480h0 = C38790bq6.m62480h0(view, db6);
            if (m62480h0.m110773q()) {
                return m62480h0;
            }
            Rect rect = this.f56060b;
            rect.left = m62480h0.m110779k();
            rect.top = m62480h0.m110777m();
            rect.right = m62480h0.m110778l();
            rect.bottom = m62480h0.m110780j();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                DB6 m62484g = C38790bq6.m62484g(ViewPager.this.getChildAt(i), m62480h0);
                rect.left = Math.min(m62484g.m110779k(), rect.left);
                rect.top = Math.min(m62484g.m110777m(), rect.top);
                rect.right = Math.min(m62484g.m110778l(), rect.right);
                rect.bottom = Math.min(m62484g.m110780j(), rect.bottom);
            }
            return m62480h0.m110771s(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC12072e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C12073f {

        /* renamed from: a */
        public Object f56062a;

        /* renamed from: b */
        public int f56063b;

        /* renamed from: c */
        public boolean f56064c;

        /* renamed from: d */
        public float f56065d;

        /* renamed from: e */
        public float f56066e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public class C12074g extends C5148M1 {
        public C12074g() {
        }

        /* renamed from: a */
        public final boolean m65738a() {
            AbstractC39022cE3 abstractC39022cE3 = ViewPager.this.mAdapter;
            return abstractC39022cE3 != null && abstractC39022cE3.getCount() > 1;
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC39022cE3 abstractC39022cE3;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m65738a());
            if (accessibilityEvent.getEventType() == 4096 && (abstractC39022cE3 = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(abstractC39022cE3.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20080f0(ViewPager.class.getName());
            c27125p2.m20124H0(m65738a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c27125p2.m20091a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c27125p2.m20091a(8192);
            }
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public interface InterfaceC12075h {
        /* renamed from: a */
        void mo48735a(ViewPager viewPager, AbstractC39022cE3 abstractC39022cE3, AbstractC39022cE3 abstractC39022cE32);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC12076i {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC12077j {
        /* renamed from: a */
        void mo9006a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public class C12078k extends DataSetObserver {
        public C12078k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    public static class C12079l implements InterfaceC12076i {
        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C12080m implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f56050a;
            if (z != layoutParams2.f56050a) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f56054e - layoutParams2.f56054e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C12073f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC12070c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(C12073f c12073f, int i, C12073f c12073f2) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C12073f c12073f3;
        C12073f c12073f4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
        }
        if (c12073f2 != null) {
            int i4 = c12073f2.f56063b;
            int i5 = c12073f.f56063b;
            if (i4 < i5) {
                float f4 = c12073f2.f56066e + c12073f2.f56065d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c12073f.f56063b && i7 < this.mItems.size()) {
                    C12073f c12073f5 = this.mItems.get(i7);
                    while (true) {
                        c12073f4 = c12073f5;
                        if (i6 <= c12073f4.f56063b || i7 >= this.mItems.size() - 1) {
                            break;
                        }
                        i7++;
                        c12073f5 = this.mItems.get(i7);
                    }
                    while (i6 < c12073f4.f56063b) {
                        f4 += this.mAdapter.getPageWidth(i6) + f;
                        i6++;
                    }
                    c12073f4.f56066e = f4;
                    f4 += c12073f4.f56065d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f5 = c12073f2.f56066e;
                while (true) {
                    i4--;
                    if (i4 < c12073f.f56063b || size < 0) {
                        break;
                    }
                    C12073f c12073f6 = this.mItems.get(size);
                    while (true) {
                        c12073f3 = c12073f6;
                        if (i4 >= c12073f3.f56063b || size <= 0) {
                            break;
                        }
                        size--;
                        c12073f6 = this.mItems.get(size);
                    }
                    while (i4 > c12073f3.f56063b) {
                        f5 -= this.mAdapter.getPageWidth(i4) + f;
                        i4--;
                    }
                    f5 -= c12073f3.f56065d + f;
                    c12073f3.f56066e = f5;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = c12073f.f56066e;
        int i8 = c12073f.f56063b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            f2 = f6;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i10 = count - 1;
        if (i8 == i10) {
            f3 = (c12073f.f56065d + f6) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i11 = i - 1;
        while (i11 >= 0) {
            C12073f c12073f7 = this.mItems.get(i11);
            while (true) {
                i3 = c12073f7.f56063b;
                if (i9 <= i3) {
                    break;
                }
                f6 -= this.mAdapter.getPageWidth(i9) + f;
                i9--;
            }
            f6 -= c12073f7.f56065d + f;
            c12073f7.f56066e = f6;
            if (i3 == 0) {
                this.mFirstOffset = f6;
            }
            i11--;
            i9--;
        }
        float f7 = c12073f.f56066e + c12073f.f56065d + f;
        int i12 = c12073f.f56063b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C12073f c12073f8 = this.mItems.get(i13);
            while (true) {
                i2 = c12073f8.f56063b;
                if (i12 >= i2) {
                    break;
                }
                f7 += this.mAdapter.getPageWidth(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.mLastOffset = (c12073f8.f56065d + f7) - 1.0f;
            }
            c12073f8.f56066e = f7;
            f7 += c12073f8.f56065d + f;
            i13++;
            i12++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C12073f c12073f = this.mItems.get(i);
            if (c12073f.f56064c) {
                c12073f.f56064c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C38790bq6.m62468n0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.mFlingDistance && Math.abs(i2) > this.mMinimumVelocity) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        if (this.mItems.size() > 0) {
            ArrayList<C12073f> arrayList = this.mItems;
            return Math.max(this.mItems.get(0).f56063b, Math.min(i, arrayList.get(arrayList.size() - 1).f56063b));
        }
        return i;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        InterfaceC12076i interfaceC12076i = this.mOnPageChangeListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrolled(i, f, i2);
        }
        List<InterfaceC12076i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC12076i interfaceC12076i2 = this.mOnPageChangeListeners.get(i3);
                if (interfaceC12076i2 != null) {
                    interfaceC12076i2.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC12076i interfaceC12076i3 = this.mInternalPageChangeListener;
        if (interfaceC12076i3 != null) {
            interfaceC12076i3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        InterfaceC12076i interfaceC12076i = this.mOnPageChangeListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageSelected(i);
        }
        List<InterfaceC12076i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC12076i interfaceC12076i2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC12076i2 != null) {
                    interfaceC12076i2.onPageSelected(i);
                }
            }
        }
        InterfaceC12076i interfaceC12076i3 = this.mInternalPageChangeListener;
        if (interfaceC12076i3 != null) {
            interfaceC12076i3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        InterfaceC12076i interfaceC12076i = this.mOnPageChangeListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrollStateChanged(i);
        }
        List<InterfaceC12076i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC12076i interfaceC12076i2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC12076i2 != null) {
                    interfaceC12076i2.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC12076i interfaceC12076i3 = this.mInternalPageChangeListener;
        if (interfaceC12076i3 != null) {
            interfaceC12076i3.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C12073f infoForCurrentScrollPosition() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = this.mPageMargin / clientWidth;
        } else {
            f2 = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        C12073f c12073f = null;
        int i3 = -1;
        float f4 = 0.0f;
        while (i2 < this.mItems.size()) {
            C12073f c12073f2 = this.mItems.get(i2);
            if (!z && c12073f2.f56063b != (i = i3 + 1)) {
                c12073f2 = this.mTempItem;
                c12073f2.f56066e = f3 + f4 + f2;
                c12073f2.f56063b = i;
                c12073f2.f56065d = this.mAdapter.getPageWidth(i);
                i2--;
            }
            C12073f c12073f3 = c12073f2;
            f3 = c12073f3.f56066e;
            float f5 = c12073f3.f56065d + f3 + f2;
            if (!z && f < f3) {
                return c12073f;
            }
            if (f >= f5 && i2 != this.mItems.size() - 1) {
                int i4 = c12073f3.f56063b;
                float f6 = c12073f3.f56065d;
                i2++;
                z = false;
                i3 = i4;
                f4 = f6;
                c12073f = c12073f3;
            } else {
                return c12073f3;
            }
        }
        return c12073f;
    }

    private static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(InterfaceC12072e.class) != null) {
            return true;
        }
        return false;
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C12073f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = infoForCurrentScrollPosition.f56063b;
        float f2 = ((i / f) - infoForCurrentScrollPosition.f56066e) / (infoForCurrentScrollPosition.f56065d + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C12073f c12073f = this.mItems.get(0);
        ArrayList<C12073f> arrayList = this.mItems;
        C12073f c12073f2 = arrayList.get(arrayList.size() - 1);
        if (c12073f.f56063b != 0) {
            f3 = c12073f.f56066e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c12073f2.f56063b != this.mAdapter.getCount() - 1) {
            f4 = c12073f2.f56066e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C12073f infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f = Math.min(infoForPosition.f56066e, this.mLastOffset);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            completeScroll(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f56050a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C12073f infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f56066e, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C12073f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f56063b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    public C12073f addNewItem(int i, int i2) {
        C12073f c12073f = new C12073f();
        c12073f.f56063b = i;
        c12073f.f56062a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        c12073f.f56065d = this.mAdapter.getPageWidth(i);
        if (i2 >= 0 && i2 < this.mItems.size()) {
            this.mItems.add(i2, c12073f);
        } else {
            this.mItems.add(c12073f);
        }
        return c12073f;
    }

    public void addOnAdapterChangeListener(InterfaceC12075h interfaceC12075h) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC12075h);
    }

    public void addOnPageChangeListener(InterfaceC12076i interfaceC12076i) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC12076i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C12073f infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f56063b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.f56050a | isDecorView(view);
        layoutParams2.f56050a = isDecorView;
        if (this.mInLayout) {
            if (!isDecorView) {
                layoutParams2.f56053d = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i) {
        boolean z;
        View findNextFocus;
        boolean requestFocus;
        View findFocus = findFocus();
        boolean z2 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (parent instanceof ViewGroup) {
                        if (parent == this) {
                            z = true;
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i == 17) {
                    int i2 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                    int i3 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                    if (findFocus != null && i2 >= i3) {
                        requestFocus = pageLeft();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                } else if (i == 66) {
                    int i4 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                    int i5 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                    if (findFocus != null && i4 <= i5) {
                        requestFocus = pageRight();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                }
                z2 = requestFocus;
            } else if (i == 17 && i != 1) {
                if (i == 66 || i == 2) {
                    z2 = pageRight();
                }
            } else {
                z2 = pageLeft();
            }
            if (z2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus == null) {
        }
        if (i == 17) {
        }
        z2 = pageLeft();
        if (z2) {
        }
        return z2;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC12076i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C38790bq6.m62470m0(this);
            return;
        }
        completeScroll(true);
    }

    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C12073f c12073f = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(c12073f.f56062a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c12073f.f56063b, c12073f.f56062a);
                    int i3 = this.mCurItem;
                    if (i3 == c12073f.f56063b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = c12073f.f56063b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        c12073f.f56063b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f56050a) {
                    layoutParams.f56052c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C12073f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f56063b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC39022cE3 abstractC39022cE3;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC39022cE3 = this.mAdapter) == null || abstractC39022cE3.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            C38790bq6.m62470m0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C12073f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f56063b, ((scrollX / clientWidth) - infoForCurrentScrollPosition.f56066e) / infoForCurrentScrollPosition.f56065d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f) {
        ArrayList<C12073f> arrayList;
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C12073f c12073f = this.mItems.get(0);
            C12073f c12073f2 = this.mItems.get(arrayList.size() - 1);
            if (c12073f.f56063b != 0) {
                f2 = c12073f.f56066e * clientWidth;
            }
            if (c12073f2.f56063b != this.mAdapter.getCount() - 1) {
                f3 = c12073f2.f56066e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - i;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC39022cE3 getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f56055f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C12073f infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public C12073f infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C12073f c12073f = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, c12073f.f56062a)) {
                return c12073f;
            }
        }
        return null;
    }

    public C12073f infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C12073f c12073f = this.mItems.get(i2);
            if (c12073f.f56063b == i) {
                return c12073f;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        C38790bq6.m62452v0(this, new C12074g());
        if (C38790bq6.m62552B(this) == 0) {
            C38790bq6.m62539H0(this, 1);
        }
        C38790bq6.m62531L0(this, new C12071d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f3 = this.mPageMargin / width2;
            int i2 = 0;
            C12073f c12073f = this.mItems.get(0);
            float f4 = c12073f.f56066e;
            int size = this.mItems.size();
            int i3 = c12073f.f56063b;
            int i4 = this.mItems.get(size - 1).f56063b;
            while (i3 < i4) {
                while (true) {
                    i = c12073f.f56063b;
                    if (i3 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c12073f = this.mItems.get(i2);
                }
                if (i3 == i) {
                    float f5 = c12073f.f56066e;
                    float f6 = c12073f.f56065d;
                    f = (f5 + f6) * width2;
                    f4 = f5 + f6 + f3;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i3);
                    f = (f4 + pageWidth) * width2;
                    f4 += pageWidth + f3;
                }
                if (this.mPageMargin + f > scrollX) {
                    f2 = f3;
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f2 = f3;
                }
                if (f <= scrollX + width) {
                    i3++;
                    f3 = f2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i = this.mActivePointerId;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.mLastMotionX;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.mInitialMotionY);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                            this.mLastMotionX = x;
                            this.mLastMotionY = y;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i3 = this.mTouchSlop;
                        if (abs > i3 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f3 = this.mInitialMotionX;
                            float f4 = this.mTouchSlop;
                            if (i2 > 0) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i3) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x)) {
                            C38790bq6.m62470m0(this);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.mInitialMotionX = x2;
                this.mLastMotionX = x2;
                float y2 = motionEvent.getY();
                this.mInitialMotionY = y2;
                this.mLastMotionY = y2;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C12073f infoForChild;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f56050a) {
                    int i11 = layoutParams.f56051b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 != 3) {
                            if (i12 != 5) {
                                i5 = paddingLeft;
                            } else {
                                max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i13 == 16) {
                            if (i13 != 48) {
                                if (i13 != 80) {
                                    i6 = paddingTop;
                                } else {
                                    max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, paddingTop + childAt.getMeasuredHeight());
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, paddingTop + childAt.getMeasuredHeight());
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f56050a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (infoForChild.f56066e * f)) + paddingLeft;
                    if (layoutParams2.f56053d) {
                        layoutParams2.f56053d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f56052c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i8 - paddingBottom;
        this.mDecorChildCount = i9;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f56050a) {
                int i6 = layoutParams2.f56051b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f56050a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f56052c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPageScrolled(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f56050a) {
                    int i5 = layoutParams.f56051b & 7;
                    if (i5 != 1) {
                        if (i5 != 3) {
                            if (i5 != 5) {
                                i3 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i3 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        dispatchOnPageScrolled(i, f, i2);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((LayoutParams) childAt2.getLayoutParams()).f56050a) {
                    this.mPageTransformer.mo9006a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C12073f infoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f56063b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        AbstractC39022cE3 abstractC39022cE3 = this.mAdapter;
        if (abstractC39022cE3 != null) {
            abstractC39022cE3.restoreState(savedState.f56057e, savedState.f56058f);
            setCurrentItemInternal(savedState.f56056d, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f56056d;
        this.mRestoredAdapterState = savedState.f56057e;
        this.mRestoredClassLoader = savedState.f56058f;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f56056d = this.mCurItem;
        AbstractC39022cE3 abstractC39022cE3 = this.mAdapter;
        if (abstractC39022cE3 != null) {
            savedState.f56057e = abstractC39022cE3.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC39022cE3 abstractC39022cE3;
        float f;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC39022cE3 = this.mAdapter) == null || abstractC39022cE3.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        scrollToItem(this.mCurItem, true, 0, false);
                        z = resetTouch();
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z = resetTouch();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.mLastMotionX);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f2 = this.mInitialMotionX;
                                if (x - f2 > 0.0f) {
                                    f = f2 + this.mTouchSlop;
                                } else {
                                    f = f2 - this.mTouchSlop;
                                }
                                this.mLastMotionX = f;
                                this.mLastMotionY = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C12073f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f3 = clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f56063b, ((scrollX / f3) - infoForCurrentScrollPosition.f56066e) / (infoForCurrentScrollPosition.f56065d + (this.mPageMargin / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z = resetTouch();
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x2 = motionEvent.getX();
            this.mInitialMotionX = x2;
            this.mLastMotionX = x2;
            float y2 = motionEvent.getY();
            this.mInitialMotionY = y2;
            this.mLastMotionY = y2;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z) {
            C38790bq6.m62470m0(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        AbstractC39022cE3 abstractC39022cE3 = this.mAdapter;
        if (abstractC39022cE3 != null && this.mCurItem < abstractC39022cE3.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(InterfaceC12075h interfaceC12075h) {
        List<InterfaceC12075h> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC12075h);
        }
    }

    public void removeOnPageChangeListener(InterfaceC12076i interfaceC12076i) {
        List<InterfaceC12076i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC12076i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC39022cE3 abstractC39022cE3) {
        AbstractC39022cE3 abstractC39022cE32 = this.mAdapter;
        if (abstractC39022cE32 != null) {
            abstractC39022cE32.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C12073f c12073f = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, c12073f.f56063b, c12073f.f56062a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        AbstractC39022cE3 abstractC39022cE33 = this.mAdapter;
        this.mAdapter = abstractC39022cE3;
        this.mExpectedAdapterCount = 0;
        if (abstractC39022cE3 != null) {
            if (this.mObserver == null) {
                this.mObserver = new C12078k();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC12075h> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).mo48735a(this, abstractC39022cE33, abstractC39022cE3);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public InterfaceC12076i setInternalPageChangeListener(InterfaceC12076i interfaceC12076i) {
        InterfaceC12076i interfaceC12076i2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC12076i;
        return interfaceC12076i2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC12076i interfaceC12076i) {
        this.mOnPageChangeListener = interfaceC12076i;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, InterfaceC12077j interfaceC12077j) {
        setPageTransformer(z, interfaceC12077j, 2);
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            enableLayers(z);
        }
        dispatchOnScrollStateChanged(i);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f56050a;

        /* renamed from: b */
        public int f56051b;

        /* renamed from: c */
        public float f56052c;

        /* renamed from: d */
        public boolean f56053d;

        /* renamed from: e */
        public int f56054e;

        /* renamed from: f */
        public int f56055f;

        public LayoutParams() {
            super(-1, -1);
            this.f56052c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f56052c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f56051b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void populate(int i) {
        C12073f c12073f;
        String hexString;
        C12073f c12073f2;
        C12073f infoForChild;
        C12073f c12073f3;
        int i2 = this.mCurItem;
        if (i2 != i) {
            c12073f = infoForPosition(i2);
            this.mCurItem = i;
        } else {
            c12073f = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
        } else if (this.mPopulatePending) {
            sortChildDrawingOrder();
        } else if (getWindowToken() != null) {
            this.mAdapter.startUpdate((ViewGroup) this);
            int i3 = this.mOffscreenPageLimit;
            int max = Math.max(0, this.mCurItem - i3);
            int count = this.mAdapter.getCount();
            int min = Math.min(count - 1, this.mCurItem + i3);
            if (count == this.mExpectedAdapterCount) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.mItems.size()) {
                        break;
                    }
                    c12073f2 = this.mItems.get(i4);
                    int i5 = c12073f2.f56063b;
                    int i6 = this.mCurItem;
                    if (i5 < i6) {
                        i4++;
                    }
                }
                if (c12073f2 == null && count > 0) {
                    c12073f2 = addNewItem(this.mCurItem, i4);
                }
                if (c12073f2 != null) {
                    int i7 = i4 - 1;
                    C12073f c12073f4 = i7 >= 0 ? this.mItems.get(i7) : null;
                    int clientWidth = getClientWidth();
                    float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c12073f2.f56065d) + (getPaddingLeft() / clientWidth);
                    float f = 0.0f;
                    for (int i8 = this.mCurItem - 1; i8 >= 0; i8--) {
                        if (f < paddingLeft || i8 >= max) {
                            if (c12073f4 != null && i8 == c12073f4.f56063b) {
                                f += c12073f4.f56065d;
                                i7--;
                                if (i7 >= 0) {
                                    c12073f3 = this.mItems.get(i7);
                                    c12073f4 = c12073f3;
                                }
                                c12073f3 = null;
                                c12073f4 = c12073f3;
                            } else {
                                f += addNewItem(i8, i7 + 1).f56065d;
                                i4++;
                                if (i7 >= 0) {
                                    c12073f3 = this.mItems.get(i7);
                                    c12073f4 = c12073f3;
                                }
                                c12073f3 = null;
                                c12073f4 = c12073f3;
                            }
                        } else if (c12073f4 == null) {
                            break;
                        } else {
                            if (i8 == c12073f4.f56063b && !c12073f4.f56064c) {
                                this.mItems.remove(i7);
                                this.mAdapter.destroyItem((ViewGroup) this, i8, c12073f4.f56062a);
                                i7--;
                                i4--;
                                if (i7 >= 0) {
                                    c12073f3 = this.mItems.get(i7);
                                    c12073f4 = c12073f3;
                                }
                                c12073f3 = null;
                                c12073f4 = c12073f3;
                            }
                        }
                    }
                    float f2 = c12073f2.f56065d;
                    int i9 = i4 + 1;
                    if (f2 < 2.0f) {
                        C12073f c12073f5 = i9 < this.mItems.size() ? this.mItems.get(i9) : null;
                        float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                        int i10 = this.mCurItem;
                        while (true) {
                            i10++;
                            if (i10 >= count) {
                                break;
                            } else if (f2 < paddingRight || i10 <= min) {
                                if (c12073f5 != null && i10 == c12073f5.f56063b) {
                                    f2 += c12073f5.f56065d;
                                    i9++;
                                    if (i9 < this.mItems.size()) {
                                        c12073f5 = this.mItems.get(i9);
                                    }
                                } else {
                                    C12073f addNewItem = addNewItem(i10, i9);
                                    i9++;
                                    f2 += addNewItem.f56065d;
                                    c12073f5 = i9 < this.mItems.size() ? this.mItems.get(i9) : null;
                                }
                            } else if (c12073f5 == null) {
                                break;
                            } else if (i10 == c12073f5.f56063b && !c12073f5.f56064c) {
                                this.mItems.remove(i9);
                                this.mAdapter.destroyItem((ViewGroup) this, i10, c12073f5.f56062a);
                                if (i9 < this.mItems.size()) {
                                    c12073f5 = this.mItems.get(i9);
                                }
                            }
                        }
                    }
                    calculatePageOffsets(c12073f2, i4, c12073f);
                    this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, c12073f2.f56062a);
                }
                this.mAdapter.finishUpdate((ViewGroup) this);
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    layoutParams.f56055f = i11;
                    if (!layoutParams.f56050a && layoutParams.f56052c == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                        layoutParams.f56052c = infoForChild.f56065d;
                        layoutParams.f56054e = infoForChild.f56063b;
                    }
                }
                sortChildDrawingOrder();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    C12073f infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
                    if (infoForAnyChild == null || infoForAnyChild.f56063b != this.mCurItem) {
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt2 = getChildAt(i12);
                            C12073f infoForChild2 = infoForChild(childAt2);
                            if (infoForChild2 != null && infoForChild2.f56063b == this.mCurItem && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        AbstractC39022cE3 abstractC39022cE3 = this.mAdapter;
        if (abstractC39022cE3 != null && abstractC39022cE3.getCount() > 0) {
            if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f56064c = true;
                }
            }
            boolean z3 = this.mCurItem != i;
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z, InterfaceC12077j interfaceC12077j, int i) {
        boolean z2 = interfaceC12077j != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC12077j;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, (int) MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        C38790bq6.m62470m0(this);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(NA0.m94299e(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C12073f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC12070c();
        this.mScrollState = 0;
        initViewPager();
    }
}
