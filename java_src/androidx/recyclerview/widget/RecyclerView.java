package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C11878a;
import androidx.recyclerview.widget.C11891f;
import androidx.recyclerview.widget.C11949s;
import androidx.recyclerview.widget.C11956w;
import androidx.recyclerview.widget.C11959x;
import androidx.recyclerview.widget.RunnableC11921k;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements I43 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final C11831A sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    C11949s mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC11843h mAdapter;
    C11878a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC11847k mChildDrawingOrderCallback;
    C11891f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C11848l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC11921k mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC11862s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC11849m mItemAnimator;
    private AbstractC11849m.InterfaceC11851b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC11854o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC11855p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C11868x mObserver;
    private List<InterfaceC11860q> mOnChildAttachStateListeners;
    private AbstractC11861r mOnFlingListener;
    private final ArrayList<InterfaceC11862s> mOnItemTouchListeners;
    final List<AbstractC11834D> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    RunnableC11921k.C11923b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C11866v mRecycler;
    InterfaceC11867w mRecyclerListener;
    final List<InterfaceC11867w> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC11863t mScrollListener;
    private List<AbstractC11863t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private J43 mScrollingChildHelper;
    final C11872z mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC11833C mViewFlinger;
    private final C11959x.InterfaceC11961b mViewInfoProcessCallback;
    final C11959x mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$A */
    /* loaded from: classes.dex */
    public static class C11831A extends C11848l {
        @Override // androidx.recyclerview.widget.RecyclerView.C11848l
        /* renamed from: a */
        public EdgeEffect mo66658a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$B */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11832B {
        /* renamed from: a */
        public abstract View m66682a(C11866v c11866v, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$C */
    /* loaded from: classes.dex */
    public class RunnableC11833C implements Runnable {

        /* renamed from: b */
        public int f55202b;

        /* renamed from: c */
        public int f55203c;

        /* renamed from: d */
        public OverScroller f55204d;

        /* renamed from: e */
        public Interpolator f55205e;

        /* renamed from: f */
        public boolean f55206f;

        /* renamed from: g */
        public boolean f55207g;

        public RunnableC11833C() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f55205e = interpolator;
            this.f55206f = false;
            this.f55207g = false;
            this.f55204d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m66681a(int i, int i2) {
            boolean z;
            int height;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: b */
        public void m66680b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f55203c = 0;
            this.f55202b = 0;
            Interpolator interpolator = this.f55205e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f55205e = interpolator2;
                this.f55204d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f55204d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m66678d();
        }

        /* renamed from: c */
        public final void m66679c() {
            RecyclerView.this.removeCallbacks(this);
            C38790bq6.m62468n0(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void m66678d() {
            if (this.f55206f) {
                this.f55207g = true;
            } else {
                m66679c();
            }
        }

        /* renamed from: e */
        public void m66677e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m66681a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f55205e != interpolator) {
                this.f55205e = interpolator;
                this.f55204d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f55203c = 0;
            this.f55202b = 0;
            RecyclerView.this.setScrollState(2);
            this.f55204d.startScroll(0, 0, i, i2, i4);
            m66678d();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.f55207g = false;
            this.f55206f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f55204d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f55202b;
                int i5 = currY - this.f55203c;
                this.f55202b = currX;
                this.f55203c = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i4);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i5);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    consumeFlingInHorizontalStretch -= i2;
                    consumeFlingInVerticalStretch -= i;
                    AbstractC11869y abstractC11869y = recyclerView4.mLayout.f55235h;
                    if (abstractC11869y != null && !abstractC11869y.isPendingInitialRun() && abstractC11869y.isRunning()) {
                        int m66490b = RecyclerView.this.mState.m66490b();
                        if (m66490b == 0) {
                            abstractC11869y.stop();
                        } else if (abstractC11869y.getTargetPosition() >= m66490b) {
                            abstractC11869y.setTargetPosition(m66490b - 1);
                            abstractC11869y.onAnimation(i2, i);
                        } else {
                            abstractC11869y.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = consumeFlingInHorizontalStretch - iArr6[0];
                int i7 = consumeFlingInVerticalStretch - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i6 == 0) || (!z2 && i7 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                AbstractC11869y abstractC11869y2 = RecyclerView.this.mLayout.f55235h;
                if (abstractC11869y2 != null && abstractC11869y2.isPendingInitialRun()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m66215b();
                    }
                } else {
                    m66678d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC11921k runnableC11921k = recyclerView7.mGapWorker;
                    if (runnableC11921k != null) {
                        runnableC11921k.m66222f(recyclerView7, i2, i);
                    }
                }
            }
            AbstractC11869y abstractC11869y3 = RecyclerView.this.mLayout.f55235h;
            if (abstractC11869y3 != null && abstractC11869y3.isPendingInitialRun()) {
                abstractC11869y3.onAnimation(0, 0);
            }
            this.f55206f = false;
            if (this.f55207g) {
                m66679c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f55204d.abortAnimation();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$D */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11834D {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        AbstractC11843h<? extends AbstractC11834D> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC11834D mShadowedHolder = null;
        AbstractC11834D mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C11866v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC11834D(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C38790bq6.m62510W(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final AbstractC11843h<? extends AbstractC11834D> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC11843h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !C38790bq6.m62510W(this.itemView)) {
                return true;
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f55211d = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C38790bq6.m62552B(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C11866v c11866v, boolean z) {
            this.mScrapContainer = c11866v;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m66528O(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    public class RunnableC11836a implements Runnable {
        public RunnableC11836a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    public class RunnableC11837b implements Runnable {
        public RunnableC11837b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC11849m abstractC11849m = RecyclerView.this.mItemAnimator;
            if (abstractC11849m != null) {
                abstractC11849m.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC11838c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    public class C11839d implements C11959x.InterfaceC11961b {
        public C11839d() {
        }

        @Override // androidx.recyclerview.widget.C11959x.InterfaceC11961b
        /* renamed from: a */
        public void mo66091a(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2) {
            RecyclerView.this.animateAppearance(abstractC11834D, c11852c, c11852c2);
        }

        @Override // androidx.recyclerview.widget.C11959x.InterfaceC11961b
        /* renamed from: b */
        public void mo66090b(AbstractC11834D abstractC11834D) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m66641E1(abstractC11834D.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C11959x.InterfaceC11961b
        /* renamed from: c */
        public void mo66089c(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2) {
            RecyclerView.this.mRecycler.m66528O(abstractC11834D);
            RecyclerView.this.animateDisappearance(abstractC11834D, c11852c, c11852c2);
        }

        @Override // androidx.recyclerview.widget.C11959x.InterfaceC11961b
        /* renamed from: d */
        public void mo66088d(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2) {
            abstractC11834D.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(abstractC11834D, abstractC11834D, c11852c, c11852c2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(abstractC11834D, c11852c, c11852c2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C11840e implements C11891f.InterfaceC11893b {
        public C11840e() {
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: a */
        public View mo66286a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: b */
        public void mo66285b(View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: c */
        public int mo66284c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: d */
        public AbstractC11834D mo66283d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: e */
        public void mo66282e(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: f */
        public void mo66281f() {
            int mo66284c = mo66284c();
            for (int i = 0; i < mo66284c; i++) {
                View mo66286a = mo66286a(i);
                RecyclerView.this.dispatchChildDetached(mo66286a);
                mo66286a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: g */
        public void mo66280g(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: h */
        public void mo66279h(int i) {
            AbstractC11834D childViewHolderInt;
            View mo66286a = mo66286a(i);
            if (mo66286a != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(mo66286a)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: i */
        public int mo66278i(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: j */
        public void mo66277j(View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C11891f.InterfaceC11893b
        /* renamed from: k */
        public void mo66276k(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C11841f implements C11878a.InterfaceC11879a {
        public C11841f() {
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: a */
        public void mo66340a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: b */
        public void mo66339b(C11878a.C11880b c11880b) {
            m66668i(c11880b);
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: c */
        public void mo66338c(C11878a.C11880b c11880b) {
            m66668i(c11880b);
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: d */
        public AbstractC11834D mo66337d(int i) {
            AbstractC11834D findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.m66301n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: e */
        public void mo66336e(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: f */
        public void mo66335f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f55280d += i2;
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: g */
        public void mo66334g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C11878a.InterfaceC11879a
        /* renamed from: h */
        public void mo66333h(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: i */
        public void m66668i(C11878a.C11880b c11880b) {
            int i = c11880b.f55358a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.mo51810k1(recyclerView, c11880b.f55359b, c11880b.f55361d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.mo51801n1(recyclerView2, c11880b.f55359b, c11880b.f55361d, c11880b.f55360c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo51807l1(recyclerView3, c11880b.f55359b, c11880b.f55361d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.mLayout.mo51816i1(recyclerView4, c11880b.f55359b, c11880b.f55361d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11842g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55219a;

        static {
            int[] iArr = new int[AbstractC11843h.EnumC11844a.values().length];
            f55219a = iArr;
            try {
                iArr[AbstractC11843h.EnumC11844a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55219a[AbstractC11843h.EnumC11844a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11843h<VH extends AbstractC11834D> {
        private final C11845i mObservable = new C11845i();
        private boolean mHasStableIds = false;
        private EnumC11844a mStateRestorationPolicy = EnumC11844a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: classes.dex */
        public enum EnumC11844a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C40152e66.m43277a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f55211d = true;
                }
                C40152e66.m43276b();
            }
        }

        public boolean canRestoreState() {
            int i = C11842g.f55219a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C40152e66.m43277a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C40152e66.m43276b();
            }
        }

        public int findRelativeAdapterPositionIn(AbstractC11843h<? extends AbstractC11834D> abstractC11843h, AbstractC11834D abstractC11834D, int i) {
            if (abstractC11843h == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final EnumC11844a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m66667a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m66666b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m66664d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m66662f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m66665c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m66664d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m66662f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m66661g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m66661g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AbstractC11846j abstractC11846j) {
            this.mObservable.registerObserver(abstractC11846j);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(EnumC11844a enumC11844a) {
            this.mStateRestorationPolicy = enumC11844a;
            this.mObservable.m66660h();
        }

        public void unregisterAdapterDataObserver(AbstractC11846j abstractC11846j) {
            this.mObservable.unregisterObserver(abstractC11846j);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.m66663e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m66663e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static class C11845i extends Observable<AbstractC11846j> {
        /* renamed from: a */
        public boolean m66667a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m66666b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void m66665c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m66664d(int i, int i2) {
            m66663e(i, i2, null);
        }

        /* renamed from: e */
        public void m66663e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m66662f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* renamed from: g */
        public void m66661g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* renamed from: h */
        public void m66660h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC11846j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11846j {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public interface InterfaceC11847k {
        /* renamed from: a */
        int m66659a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static class C11848l {
        /* renamed from: a */
        public EdgeEffect mo66658a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11849m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private InterfaceC11851b mListener = null;
        private ArrayList<InterfaceC11850a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        /* loaded from: classes.dex */
        public interface InterfaceC11850a {
            /* renamed from: a */
            void m66657a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        /* loaded from: classes.dex */
        public interface InterfaceC11851b {
            /* renamed from: a */
            void mo66654a(AbstractC11834D abstractC11834D);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        /* loaded from: classes.dex */
        public static class C11852c {

            /* renamed from: a */
            public int f55224a;

            /* renamed from: b */
            public int f55225b;

            /* renamed from: c */
            public int f55226c;

            /* renamed from: d */
            public int f55227d;

            /* renamed from: a */
            public C11852c m66656a(AbstractC11834D abstractC11834D) {
                return m66655b(abstractC11834D, 0);
            }

            /* renamed from: b */
            public C11852c m66655b(AbstractC11834D abstractC11834D, int i) {
                View view = abstractC11834D.itemView;
                this.f55224a = view.getLeft();
                this.f55225b = view.getTop();
                this.f55226c = view.getRight();
                this.f55227d = view.getBottom();
                return this;
            }
        }

        public static int buildAdapterChangeFlagsForAnimations(AbstractC11834D abstractC11834D) {
            int i = abstractC11834D.mFlags & 14;
            if (abstractC11834D.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = abstractC11834D.getOldPosition();
                int absoluteAdapterPosition = abstractC11834D.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i | 2048;
                }
                return i;
            }
            return i;
        }

        public abstract boolean animateAppearance(AbstractC11834D abstractC11834D, C11852c c11852c, C11852c c11852c2);

        public abstract boolean animateChange(AbstractC11834D abstractC11834D, AbstractC11834D abstractC11834D2, C11852c c11852c, C11852c c11852c2);

        public abstract boolean animateDisappearance(AbstractC11834D abstractC11834D, C11852c c11852c, C11852c c11852c2);

        public abstract boolean animatePersistence(AbstractC11834D abstractC11834D, C11852c c11852c, C11852c c11852c2);

        public boolean canReuseUpdatedViewHolder(AbstractC11834D abstractC11834D) {
            return true;
        }

        public final void dispatchAnimationFinished(AbstractC11834D abstractC11834D) {
            onAnimationFinished(abstractC11834D);
            InterfaceC11851b interfaceC11851b = this.mListener;
            if (interfaceC11851b != null) {
                interfaceC11851b.mo66654a(abstractC11834D);
            }
        }

        public final void dispatchAnimationStarted(AbstractC11834D abstractC11834D) {
            onAnimationStarted(abstractC11834D);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).m66657a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(AbstractC11834D abstractC11834D);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(InterfaceC11850a interfaceC11850a) {
            boolean isRunning = isRunning();
            if (interfaceC11850a != null) {
                if (!isRunning) {
                    interfaceC11850a.m66657a();
                } else {
                    this.mFinishedListeners.add(interfaceC11850a);
                }
            }
            return isRunning;
        }

        public C11852c obtainHolderInfo() {
            return new C11852c();
        }

        public void onAnimationFinished(AbstractC11834D abstractC11834D) {
        }

        public void onAnimationStarted(AbstractC11834D abstractC11834D) {
        }

        public C11852c recordPostLayoutInformation(C11872z c11872z, AbstractC11834D abstractC11834D) {
            return obtainHolderInfo().m66656a(abstractC11834D);
        }

        public C11852c recordPreLayoutInformation(C11872z c11872z, AbstractC11834D abstractC11834D, int i, List<Object> list) {
            return obtainHolderInfo().m66656a(abstractC11834D);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        public void setListener(InterfaceC11851b interfaceC11851b) {
            this.mListener = interfaceC11851b;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public boolean canReuseUpdatedViewHolder(AbstractC11834D abstractC11834D, List<Object> list) {
            return canReuseUpdatedViewHolder(abstractC11834D);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public class C11853n implements AbstractC11849m.InterfaceC11851b {
        public C11853n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m.InterfaceC11851b
        /* renamed from: a */
        public void mo66654a(AbstractC11834D abstractC11834D) {
            abstractC11834D.setIsRecyclable(true);
            if (abstractC11834D.mShadowedHolder != null && abstractC11834D.mShadowingHolder == null) {
                abstractC11834D.mShadowedHolder = null;
            }
            abstractC11834D.mShadowingHolder = null;
            if (!abstractC11834D.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(abstractC11834D.itemView) && abstractC11834D.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(abstractC11834D.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11854o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C11872z c11872z) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).m66676a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C11872z c11872z) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C11872z c11872z) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11855p {

        /* renamed from: b */
        public C11891f f55229b;

        /* renamed from: c */
        public RecyclerView f55230c;

        /* renamed from: d */
        public final C11956w.InterfaceC11958b f55231d;

        /* renamed from: e */
        public final C11956w.InterfaceC11958b f55232e;

        /* renamed from: f */
        public C11956w f55233f;

        /* renamed from: g */
        public C11956w f55234g;

        /* renamed from: h */
        public AbstractC11869y f55235h;

        /* renamed from: i */
        public boolean f55236i;

        /* renamed from: j */
        public boolean f55237j;

        /* renamed from: k */
        public boolean f55238k;

        /* renamed from: l */
        public boolean f55239l;

        /* renamed from: m */
        public boolean f55240m;

        /* renamed from: n */
        public int f55241n;

        /* renamed from: o */
        public boolean f55242o;

        /* renamed from: p */
        public int f55243p;

        /* renamed from: q */
        public int f55244q;

        /* renamed from: r */
        public int f55245r;

        /* renamed from: s */
        public int f55246s;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: classes.dex */
        public class C11856a implements C11956w.InterfaceC11958b {
            public C11856a() {
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: a */
            public View mo66116a(int i) {
                return AbstractC11855p.this.m66597c0(i);
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: b */
            public int mo66115b() {
                return AbstractC11855p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: c */
            public int mo66114c() {
                return AbstractC11855p.this.m66642E0() - AbstractC11855p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: d */
            public int mo66113d(View view) {
                return AbstractC11855p.this.m66584k0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: e */
            public int mo66112e(View view) {
                return AbstractC11855p.this.m66581n0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        /* loaded from: classes.dex */
        public class C11857b implements C11956w.InterfaceC11958b {
            public C11857b() {
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: a */
            public View mo66116a(int i) {
                return AbstractC11855p.this.m66597c0(i);
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: b */
            public int mo66115b() {
                return AbstractC11855p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: c */
            public int mo66114c() {
                return AbstractC11855p.this.m66578q0() - AbstractC11855p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: d */
            public int mo66113d(View view) {
                return AbstractC11855p.this.m66580o0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C11956w.InterfaceC11958b
            /* renamed from: e */
            public int mo66112e(View view) {
                return AbstractC11855p.this.m66586i0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        /* loaded from: classes.dex */
        public interface InterfaceC11858c {
            /* renamed from: a */
            void mo66216a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        /* loaded from: classes.dex */
        public static class C11859d {

            /* renamed from: a */
            public int f55249a;

            /* renamed from: b */
            public int f55250b;

            /* renamed from: c */
            public boolean f55251c;

            /* renamed from: d */
            public boolean f55252d;
        }

        public AbstractC11855p() {
            C11856a c11856a = new C11856a();
            this.f55231d = c11856a;
            C11857b c11857b = new C11857b();
            this.f55232e = c11857b;
            this.f55233f = new C11956w(c11856a);
            this.f55234g = new C11956w(c11857b);
            this.f55236i = false;
            this.f55237j = false;
            this.f55238k = false;
            this.f55239l = true;
            this.f55240m = true;
        }

        /* renamed from: H */
        public static int m66636H(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: N0 */
        public static boolean m66624N0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            } else if (size < i) {
                return false;
            } else {
                return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: e0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m66592e0(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 != Integer.MIN_VALUE && i2 != 1073741824) {
                                i4 = max;
                                i2 = 0;
                            } else {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* renamed from: y0 */
        public static C11859d m66561y0(Context context, AttributeSet attributeSet, int i, int i2) {
            C11859d c11859d = new C11859d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42323hm4.RecyclerView, i, i2);
            c11859d.f55249a = obtainStyledAttributes.getInt(C42323hm4.RecyclerView_android_orientation, 1);
            c11859d.f55250b = obtainStyledAttributes.getInt(C42323hm4.RecyclerView_spanCount, 1);
            c11859d.f55251c = obtainStyledAttributes.getBoolean(C42323hm4.RecyclerView_reverseLayout, false);
            c11859d.f55252d = obtainStyledAttributes.getBoolean(C42323hm4.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return c11859d;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: A */
        public void mo66484A(String str) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: A0 */
        public int mo66653A0(C11866v c11866v, C11872z c11872z) {
            return -1;
        }

        /* renamed from: A1 */
        public boolean m66652A1(C11866v c11866v, C11872z c11872z, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: B */
        public void m66651B(View view, int i) {
            m66648C(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: B0 */
        public int m66650B0(C11866v c11866v, C11872z c11872z) {
            return 0;
        }

        /* renamed from: B1 */
        public void m66649B1() {
            for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
                this.f55229b.m66298q(m66594d0);
            }
        }

        /* renamed from: C */
        public void m66648C(View view, int i, LayoutParams layoutParams) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f55230c.mViewInfoStore.m66110b(childViewHolderInt);
            } else {
                this.f55230c.mViewInfoStore.m66096p(childViewHolderInt);
            }
            this.f55229b.m66312c(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        /* renamed from: C0 */
        public int m66647C0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f55210c.top;
        }

        /* renamed from: C1 */
        public void m66646C1(C11866v c11866v) {
            for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
                if (!RecyclerView.getChildViewHolderInt(m66597c0(m66594d0)).shouldIgnore()) {
                    m66639F1(m66594d0, c11866v);
                }
            }
        }

        /* renamed from: D */
        public void m66645D(View view, Rect rect) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: D0 */
        public void m66644D0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f55210c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f55230c != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f55230c.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: D1 */
        public void m66643D1(C11866v c11866v) {
            int m66515j = c11866v.m66515j();
            for (int i = m66515j - 1; i >= 0; i--) {
                View m66511n = c11866v.m66511n(i);
                AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(m66511n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f55230c.removeDetachedView(m66511n, false);
                    }
                    AbstractC11849m abstractC11849m = this.f55230c.mItemAnimator;
                    if (abstractC11849m != null) {
                        abstractC11849m.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c11866v.m66539D(m66511n);
                }
            }
            c11866v.m66520e();
            if (m66515j > 0) {
                this.f55230c.invalidate();
            }
        }

        /* renamed from: E */
        public boolean mo51880E() {
            return false;
        }

        /* renamed from: E0 */
        public int m66642E0() {
            return this.f55245r;
        }

        /* renamed from: E1 */
        public void m66641E1(View view, C11866v c11866v) {
            m66634H1(view);
            c11866v.m66536G(view);
        }

        /* renamed from: F */
        public boolean mo51878F() {
            return false;
        }

        /* renamed from: F0 */
        public int m66640F0() {
            return this.f55243p;
        }

        /* renamed from: F1 */
        public void m66639F1(int i, C11866v c11866v) {
            View m66597c0 = m66597c0(i);
            m66633I1(i);
            c11866v.m66536G(m66597c0);
        }

        /* renamed from: G */
        public boolean mo51876G(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: G0 */
        public boolean m66638G0() {
            int m66594d0 = m66594d0();
            for (int i = 0; i < m66594d0; i++) {
                ViewGroup.LayoutParams layoutParams = m66597c0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: G1 */
        public boolean m66637G1(Runnable runnable) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: H0 */
        public boolean m66635H0() {
            return this.f55237j;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: H1 */
        public void m66634H1(View view) {
            this.f55229b.m66299p(view);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: I */
        public void mo66475I(int i, int i2, C11872z c11872z, InterfaceC11858c interfaceC11858c) {
        }

        /* renamed from: I0 */
        public boolean mo51873I0() {
            return this.f55238k;
        }

        /* renamed from: I1 */
        public void m66633I1(int i) {
            if (m66597c0(i) != null) {
                this.f55229b.m66298q(i);
            }
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: J */
        public void mo66632J(int i, InterfaceC11858c interfaceC11858c) {
        }

        /* renamed from: J0 */
        public final boolean m66631J0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m66642E0 = m66642E0() - getPaddingRight();
            int m66578q0 = m66578q0() - getPaddingBottom();
            Rect rect = this.f55230c.mTempRect;
            m66585j0(focusedChild, rect);
            if (rect.left - i >= m66642E0 || rect.right - i <= paddingLeft || rect.top - i2 >= m66578q0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: J1 */
        public boolean m66630J1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo65671K1(recyclerView, view, rect, z, false);
        }

        /* renamed from: K */
        public int mo51870K(C11872z c11872z) {
            return 0;
        }

        /* renamed from: K0 */
        public final boolean m66629K0() {
            return this.f55240m;
        }

        /* renamed from: K1 */
        public boolean mo65671K1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m66591f0 = m66591f0(view, rect);
            int i = m66591f0[0];
            int i2 = m66591f0[1];
            if ((z2 && !m66631J0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: L */
        public int mo51868L(C11872z c11872z) {
            return 0;
        }

        /* renamed from: L0 */
        public boolean m66628L0(C11866v c11866v, C11872z c11872z) {
            return false;
        }

        /* renamed from: L1 */
        public void m66627L1() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: M */
        public int mo51866M(C11872z c11872z) {
            return 0;
        }

        /* renamed from: M0 */
        public boolean m66626M0() {
            return this.f55239l;
        }

        /* renamed from: M1 */
        public void m66625M1() {
            this.f55236i = true;
        }

        /* renamed from: N */
        public int mo51864N(C11872z c11872z) {
            return 0;
        }

        /* renamed from: N1 */
        public final void m66623N1(C11866v c11866v, int i, View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f55230c.mAdapter.hasStableIds()) {
                m66633I1(i);
                c11866v.m66535H(childViewHolderInt);
                return;
            }
            m66618R(i);
            c11866v.m66534I(view);
            this.f55230c.mViewInfoStore.m66101k(childViewHolderInt);
        }

        /* renamed from: O */
        public int mo51861O(C11872z c11872z) {
            return 0;
        }

        /* renamed from: O0 */
        public boolean m66622O0() {
            AbstractC11869y abstractC11869y = this.f55235h;
            return abstractC11869y != null && abstractC11869y.isRunning();
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: O1 */
        public int mo51860O1(int i, C11866v c11866v, C11872z c11872z) {
            return 0;
        }

        /* renamed from: P */
        public int mo51858P(C11872z c11872z) {
            return 0;
        }

        /* renamed from: P0 */
        public boolean m66621P0(View view, boolean z, boolean z2) {
            boolean z3;
            if (this.f55233f.m66122b(view, 24579) && this.f55234g.m66122b(view, 24579)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: P1 */
        public void mo51857P1(int i) {
        }

        /* renamed from: Q */
        public void m66620Q(C11866v c11866v) {
            for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
                m66623N1(c11866v, m66594d0, m66597c0(m66594d0));
            }
        }

        /* renamed from: Q0 */
        public void m66619Q0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f55210c;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: Q1 */
        public int mo51855Q1(int i, C11866v c11866v, C11872z c11872z) {
            return 0;
        }

        /* renamed from: R */
        public void m66618R(int i) {
            m66615S(i, m66597c0(i));
        }

        /* renamed from: R0 */
        public void m66617R0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f55230c.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int m66592e0 = m66592e0(m66642E0(), m66640F0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, mo51880E());
            int m66592e02 = m66592e0(m66578q0(), m66576r0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, mo51878F());
            if (m66604X1(view, m66592e0, m66592e02, layoutParams)) {
                view.measure(m66592e0, m66592e02);
            }
        }

        /* renamed from: R1 */
        public void m66616R1(RecyclerView recyclerView) {
            m66613S1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: S */
        public final void m66615S(int i, View view) {
            this.f55229b.m66311d(i);
        }

        /* renamed from: S0 */
        public void m66614S0(int i, int i2) {
            View m66597c0 = m66597c0(i);
            if (m66597c0 != null) {
                m66618R(i);
                m66651B(m66597c0, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f55230c.toString());
        }

        /* renamed from: S1 */
        public void m66613S1(int i, int i2) {
            this.f55245r = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f55243p = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f55245r = 0;
            }
            this.f55246s = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f55244q = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f55246s = 0;
            }
        }

        /* renamed from: T */
        public void m66612T(RecyclerView recyclerView) {
            this.f55237j = true;
            mo51845X0(recyclerView);
        }

        /* renamed from: T0 */
        public void mo66463T0(int i) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: T1 */
        public void m66611T1(int i, int i2) {
            this.f55230c.setMeasuredDimension(i, i2);
        }

        /* renamed from: U */
        public void m66610U(RecyclerView recyclerView, C11866v c11866v) {
            this.f55237j = false;
            mo51840Z0(recyclerView, c11866v);
        }

        /* renamed from: U0 */
        public void mo66461U0(int i) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: U1 */
        public void mo66460U1(Rect rect, int i, int i2) {
            m66611T1(m66636H(i, rect.width() + getPaddingLeft() + getPaddingRight(), m66567w0()), m66636H(i2, rect.height() + getPaddingTop() + getPaddingBottom(), m66569v0()));
        }

        /* renamed from: V */
        public View m66609V(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f55229b.m66301n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: V0 */
        public void mo51849V0(AbstractC11843h abstractC11843h, AbstractC11843h abstractC11843h2) {
        }

        /* renamed from: V1 */
        public void m66608V1(int i, int i2) {
            int m66594d0 = m66594d0();
            if (m66594d0 == 0) {
                this.f55230c.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m66594d0; i7++) {
                View m66597c0 = m66597c0(i7);
                Rect rect = this.f55230c.mTempRect;
                m66585j0(m66597c0, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f55230c.mTempRect.set(i6, i4, i3, i5);
            mo66460U1(this.f55230c.mTempRect, i, i2);
        }

        /* renamed from: W */
        public View mo66607W(int i) {
            int m66594d0 = m66594d0();
            for (int i2 = 0; i2 < m66594d0; i2++) {
                View m66597c0 = m66597c0(i2);
                AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(m66597c0);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f55230c.mState.m66487e() || !childViewHolderInt.isRemoved())) {
                    return m66597c0;
                }
            }
            return null;
        }

        /* renamed from: W0 */
        public boolean m66606W0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: W1 */
        public void m66605W1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f55230c = null;
                this.f55229b = null;
                this.f55245r = 0;
                this.f55246s = 0;
            } else {
                this.f55230c = recyclerView;
                this.f55229b = recyclerView.mChildHelper;
                this.f55245r = recyclerView.getWidth();
                this.f55246s = recyclerView.getHeight();
            }
            this.f55243p = 1073741824;
            this.f55244q = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: X */
        public abstract LayoutParams mo51846X();

        /* renamed from: X0 */
        public void mo51845X0(RecyclerView recyclerView) {
        }

        /* renamed from: X1 */
        public boolean m66604X1(View view, int i, int i2, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.f55239l && m66624N0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m66624N0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: Y */
        public LayoutParams mo51842Y(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        @Deprecated
        /* renamed from: Y0 */
        public void m66603Y0(RecyclerView recyclerView) {
        }

        /* renamed from: Y1 */
        public boolean mo66602Y1() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: Z */
        public LayoutParams mo66454Z(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: Z0 */
        public void mo51840Z0(RecyclerView recyclerView, C11866v c11866v) {
            m66603Y0(recyclerView);
        }

        /* renamed from: Z1 */
        public boolean m66601Z1(View view, int i, int i2, LayoutParams layoutParams) {
            if (this.f55239l && m66624N0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m66624N0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: a0 */
        public int m66600a0() {
            return -1;
        }

        /* renamed from: a1 */
        public View mo66452a1(View view, int i, C11866v c11866v, C11872z c11872z) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a2 */
        public void mo51837a2(RecyclerView recyclerView, C11872z c11872z, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: b0 */
        public int m66599b0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f55210c.bottom;
        }

        /* renamed from: b1 */
        public void mo66450b1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f55230c;
            m66596c1(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: b2 */
        public void m66598b2(AbstractC11869y abstractC11869y) {
            AbstractC11869y abstractC11869y2 = this.f55235h;
            if (abstractC11869y2 != null && abstractC11869y != abstractC11869y2 && abstractC11869y2.isRunning()) {
                this.f55235h.stop();
            }
            this.f55235h = abstractC11869y;
            abstractC11869y.start(this.f55230c, this);
        }

        /* renamed from: c0 */
        public View m66597c0(int i) {
            C11891f c11891f = this.f55229b;
            if (c11891f != null) {
                return c11891f.m66309f(i);
            }
            return null;
        }

        /* renamed from: c1 */
        public void m66596c1(C11866v c11866v, C11872z c11872z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f55230c.canScrollVertically(-1) && !this.f55230c.canScrollHorizontally(-1) && !this.f55230c.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC11843h abstractC11843h = this.f55230c.mAdapter;
                if (abstractC11843h != null) {
                    accessibilityEvent.setItemCount(abstractC11843h.getItemCount());
                }
            }
        }

        /* renamed from: c2 */
        public void m66595c2() {
            AbstractC11869y abstractC11869y = this.f55235h;
            if (abstractC11869y != null) {
                abstractC11869y.stop();
            }
        }

        /* renamed from: d0 */
        public int m66594d0() {
            C11891f c11891f = this.f55229b;
            if (c11891f != null) {
                return c11891f.m66308g();
            }
            return 0;
        }

        /* renamed from: d1 */
        public void m66593d1(C27125p2 c27125p2) {
            RecyclerView recyclerView = this.f55230c;
            mo65670e1(recyclerView.mRecycler, recyclerView.mState, c27125p2);
        }

        /* renamed from: d2 */
        public boolean mo66447d2() {
            return false;
        }

        /* renamed from: e1 */
        public void mo65670e1(C11866v c11866v, C11872z c11872z, C27125p2 c27125p2) {
            if (this.f55230c.canScrollVertically(-1) || this.f55230c.canScrollHorizontally(-1)) {
                c27125p2.m20091a(8192);
                c27125p2.m20124H0(true);
            }
            if (this.f55230c.canScrollVertically(1) || this.f55230c.canScrollHorizontally(1)) {
                c27125p2.m20091a(4096);
                c27125p2.m20124H0(true);
            }
            c27125p2.m20076h0(C27125p2.C27127b.m20034b(mo66653A0(c11866v, c11872z), mo66588h0(c11866v, c11872z), m66628L0(c11866v, c11872z), m66650B0(c11866v, c11872z)));
        }

        /* renamed from: f0 */
        public final int[] m66591f0(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m66642E0 = m66642E0() - getPaddingRight();
            int m66578q0 = m66578q0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - m66642E0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m66578q0);
            if (m66572t0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f1 */
        public void m66590f1(View view, C27125p2 c27125p2) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f55229b.m66301n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f55230c;
                mo65669g1(recyclerView.mRecycler, recyclerView.mState, view, c27125p2);
            }
        }

        /* renamed from: g0 */
        public boolean m66589g0() {
            RecyclerView recyclerView = this.f55230c;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* renamed from: g1 */
        public void mo65669g1(C11866v c11866v, C11872z c11872z, View view, C27125p2 c27125p2) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return C38790bq6.m62540H(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return C38790bq6.m62538I(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int mo66588h0(C11866v c11866v, C11872z c11872z) {
            return -1;
        }

        /* renamed from: h1 */
        public View m66587h1(View view, int i) {
            return null;
        }

        /* renamed from: i0 */
        public int m66586i0(View view) {
            return view.getBottom() + m66599b0(view);
        }

        /* renamed from: i1 */
        public void mo51816i1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: j0 */
        public void m66585j0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: j1 */
        public void mo66435j1(RecyclerView recyclerView) {
        }

        /* renamed from: k0 */
        public int m66584k0(View view) {
            return view.getLeft() - m66571u0(view);
        }

        /* renamed from: k1 */
        public void mo51810k1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: l0 */
        public int m66583l0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f55210c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: l1 */
        public void mo51807l1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: m0 */
        public int m66582m0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f55210c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: m1 */
        public void mo51804m1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: n0 */
        public int m66581n0(View view) {
            return view.getRight() + m66559z0(view);
        }

        /* renamed from: n1 */
        public void mo51801n1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo51804m1(recyclerView, i, i2);
        }

        /* renamed from: o0 */
        public int m66580o0(View view) {
            return view.getTop() - m66647C0(view);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: o1 */
        public void mo51798o1(C11866v c11866v, C11872z c11872z) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: p0 */
        public View m66579p0() {
            View focusedChild;
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f55229b.m66301n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: p1 */
        public void mo51795p1(C11872z c11872z) {
        }

        /* renamed from: q0 */
        public int m66578q0() {
            return this.f55246s;
        }

        /* renamed from: q1 */
        public void m66577q1(C11866v c11866v, C11872z c11872z, int i, int i2) {
            this.f55230c.defaultOnMeasure(i, i2);
        }

        /* renamed from: r0 */
        public int m66576r0() {
            return this.f55244q;
        }

        @Deprecated
        /* renamed from: r1 */
        public boolean m66575r1(RecyclerView recyclerView, View view, View view2) {
            return m66622O0() || recyclerView.isComputingLayout();
        }

        /* renamed from: s0 */
        public int m66574s0() {
            AbstractC11843h abstractC11843h;
            RecyclerView recyclerView = this.f55230c;
            if (recyclerView != null) {
                abstractC11843h = recyclerView.getAdapter();
            } else {
                abstractC11843h = null;
            }
            if (abstractC11843h != null) {
                return abstractC11843h.getItemCount();
            }
            return 0;
        }

        /* renamed from: s1 */
        public boolean m66573s1(RecyclerView recyclerView, C11872z c11872z, View view, View view2) {
            return m66575r1(recyclerView, view, view2);
        }

        /* renamed from: t0 */
        public int m66572t0() {
            return C38790bq6.m62548D(this.f55230c);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: t1 */
        public void mo51787t1(Parcelable parcelable) {
        }

        /* renamed from: u0 */
        public int m66571u0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f55210c.left;
        }

        /* renamed from: u1 */
        public Parcelable mo51784u1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: v */
        public void m66570v(View view) {
            m66568w(view, -1);
        }

        /* renamed from: v0 */
        public int m66569v0() {
            return C38790bq6.m62546E(this.f55230c);
        }

        /* renamed from: v1 */
        public void mo66419v1(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: w */
        public void m66568w(View view, int i) {
            m66560z(view, i, true);
        }

        /* renamed from: w0 */
        public int m66567w0() {
            return C38790bq6.m62544F(this.f55230c);
        }

        /* renamed from: w1 */
        public void m66566w1(AbstractC11869y abstractC11869y) {
            if (this.f55235h == abstractC11869y) {
                this.f55235h = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: x */
        public void m66565x(View view) {
            m66562y(view, -1);
        }

        /* renamed from: x0 */
        public int m66564x0(View view) {
            return ((LayoutParams) view.getLayoutParams()).m66676a();
        }

        /* renamed from: x1 */
        public boolean m66563x1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f55230c;
            return mo65668y1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: y */
        public void m66562y(View view, int i) {
            m66560z(view, i, false);
        }

        /* renamed from: y1 */
        public boolean mo65668y1(C11866v c11866v, C11872z c11872z, int i, Bundle bundle) {
            int i2;
            int paddingLeft;
            int i3;
            int i4;
            if (this.f55230c == null) {
                return false;
            }
            int m66578q0 = m66578q0();
            int m66642E0 = m66642E0();
            Rect rect = new Rect();
            if (this.f55230c.getMatrix().isIdentity() && this.f55230c.getGlobalVisibleRect(rect)) {
                m66578q0 = rect.height();
                m66642E0 = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    i4 = 0;
                    i3 = 0;
                } else {
                    if (this.f55230c.canScrollVertically(-1)) {
                        i2 = -((m66578q0 - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i2 = 0;
                    }
                    if (this.f55230c.canScrollHorizontally(-1)) {
                        paddingLeft = -((m66642E0 - getPaddingLeft()) - getPaddingRight());
                        i3 = i2;
                        i4 = paddingLeft;
                    }
                    i3 = i2;
                    i4 = 0;
                }
            } else {
                if (this.f55230c.canScrollVertically(1)) {
                    i2 = (m66578q0 - getPaddingTop()) - getPaddingBottom();
                } else {
                    i2 = 0;
                }
                if (this.f55230c.canScrollHorizontally(1)) {
                    paddingLeft = (m66642E0 - getPaddingLeft()) - getPaddingRight();
                    i3 = i2;
                    i4 = paddingLeft;
                }
                i3 = i2;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f55230c.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: z */
        public final void m66560z(View view, int i, boolean z) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.f55230c.mViewInfoStore.m66096p(childViewHolderInt);
            } else {
                this.f55230c.mViewInfoStore.m66110b(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.f55230c) {
                    int m66302m = this.f55229b.m66302m(view);
                    if (i == -1) {
                        i = this.f55229b.m66308g();
                    }
                    if (m66302m != -1) {
                        if (m66302m != i) {
                            this.f55230c.mLayout.m66614S0(m66302m, i);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f55230c.indexOfChild(view) + this.f55230c.exceptionLabel());
                    }
                } else {
                    this.f55229b.m66314a(view, i, false);
                    layoutParams.f55211d = true;
                    AbstractC11869y abstractC11869y = this.f55235h;
                    if (abstractC11869y != null && abstractC11869y.isRunning()) {
                        this.f55235h.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f55229b.m66312c(view, i, view.getLayoutParams(), false);
            }
            if (layoutParams.f55212e) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f55212e = false;
            }
        }

        /* renamed from: z0 */
        public int m66559z0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f55210c.right;
        }

        /* renamed from: z1 */
        public boolean m66558z1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f55230c;
            return m66652A1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public interface InterfaceC11860q {
        /* renamed from: a */
        void mo65678a(View view);

        /* renamed from: d */
        void mo65677d(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11861r {
        /* renamed from: a */
        public abstract boolean mo66133a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public interface InterfaceC11862s {
        /* renamed from: b */
        void mo45809b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo45808c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo45806e(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11863t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static class C11864u {

        /* renamed from: a */
        public SparseArray<C11865a> f55253a = new SparseArray<>();

        /* renamed from: b */
        public int f55254b = 0;

        /* renamed from: c */
        public Set<AbstractC11843h<?>> f55255c = Collections.newSetFromMap(new IdentityHashMap());

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class C11865a {

            /* renamed from: a */
            public final ArrayList<AbstractC11834D> f55256a = new ArrayList<>();

            /* renamed from: b */
            public int f55257b = 5;

            /* renamed from: c */
            public long f55258c = 0;

            /* renamed from: d */
            public long f55259d = 0;
        }

        /* renamed from: a */
        public void m66557a() {
            this.f55254b++;
        }

        /* renamed from: b */
        public void m66556b(AbstractC11843h<?> abstractC11843h) {
            this.f55255c.add(abstractC11843h);
        }

        /* renamed from: c */
        public void m66555c() {
            for (int i = 0; i < this.f55253a.size(); i++) {
                C11865a valueAt = this.f55253a.valueAt(i);
                Iterator<AbstractC11834D> it = valueAt.f55256a.iterator();
                while (it.hasNext()) {
                    C39813dY3.m44169b(it.next().itemView);
                }
                valueAt.f55256a.clear();
            }
        }

        /* renamed from: d */
        public void m66554d() {
            this.f55254b--;
        }

        /* renamed from: e */
        public void m66553e(AbstractC11843h<?> abstractC11843h, boolean z) {
            this.f55255c.remove(abstractC11843h);
            if (this.f55255c.size() == 0 && !z) {
                for (int i = 0; i < this.f55253a.size(); i++) {
                    SparseArray<C11865a> sparseArray = this.f55253a;
                    ArrayList<AbstractC11834D> arrayList = sparseArray.get(sparseArray.keyAt(i)).f55256a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C39813dY3.m44169b(arrayList.get(i2).itemView);
                    }
                }
            }
        }

        /* renamed from: f */
        public void m66552f(int i, long j) {
            C11865a m66549i = m66549i(i);
            m66549i.f55259d = m66546l(m66549i.f55259d, j);
        }

        /* renamed from: g */
        public void m66551g(int i, long j) {
            C11865a m66549i = m66549i(i);
            m66549i.f55258c = m66546l(m66549i.f55258c, j);
        }

        /* renamed from: h */
        public AbstractC11834D m66550h(int i) {
            C11865a c11865a = this.f55253a.get(i);
            if (c11865a != null && !c11865a.f55256a.isEmpty()) {
                ArrayList<AbstractC11834D> arrayList = c11865a.f55256a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                        return arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: i */
        public final C11865a m66549i(int i) {
            C11865a c11865a = this.f55253a.get(i);
            if (c11865a == null) {
                C11865a c11865a2 = new C11865a();
                this.f55253a.put(i, c11865a2);
                return c11865a2;
            }
            return c11865a;
        }

        /* renamed from: j */
        public void m66548j(AbstractC11843h<?> abstractC11843h, AbstractC11843h<?> abstractC11843h2, boolean z) {
            if (abstractC11843h != null) {
                m66554d();
            }
            if (!z && this.f55254b == 0) {
                m66555c();
            }
            if (abstractC11843h2 != null) {
                m66557a();
            }
        }

        /* renamed from: k */
        public void m66547k(AbstractC11834D abstractC11834D) {
            int itemViewType = abstractC11834D.getItemViewType();
            ArrayList<AbstractC11834D> arrayList = m66549i(itemViewType).f55256a;
            if (this.f55253a.get(itemViewType).f55257b <= arrayList.size()) {
                C39813dY3.m44169b(abstractC11834D.itemView);
                return;
            }
            abstractC11834D.resetInternal();
            arrayList.add(abstractC11834D);
        }

        /* renamed from: l */
        public long m66546l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: m */
        public void m66545m(int i, int i2) {
            C11865a m66549i = m66549i(i);
            m66549i.f55257b = i2;
            ArrayList<AbstractC11834D> arrayList = m66549i.f55256a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: n */
        public boolean m66544n(int i, long j, long j2) {
            long j3 = m66549i(i).f55259d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: o */
        public boolean m66543o(int i, long j, long j2) {
            long j3 = m66549i(i).f55258c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public final class C11866v {

        /* renamed from: a */
        public final ArrayList<AbstractC11834D> f55260a;

        /* renamed from: b */
        public ArrayList<AbstractC11834D> f55261b;

        /* renamed from: c */
        public final ArrayList<AbstractC11834D> f55262c;

        /* renamed from: d */
        public final List<AbstractC11834D> f55263d;

        /* renamed from: e */
        public int f55264e;

        /* renamed from: f */
        public int f55265f;

        /* renamed from: g */
        public C11864u f55266g;

        /* renamed from: h */
        public AbstractC11832B f55267h;

        public C11866v() {
            ArrayList<AbstractC11834D> arrayList = new ArrayList<>();
            this.f55260a = arrayList;
            this.f55261b = null;
            this.f55262c = new ArrayList<>();
            this.f55263d = Collections.unmodifiableList(arrayList);
            this.f55264e = 2;
            this.f55265f = 2;
        }

        /* renamed from: A */
        public void m66542A() {
            for (int i = 0; i < this.f55262c.size(); i++) {
                C39813dY3.m44169b(this.f55262c.get(i).itemView);
            }
            m66541B(RecyclerView.this.mAdapter);
        }

        /* renamed from: B */
        public final void m66541B(AbstractC11843h<?> abstractC11843h) {
            m66540C(abstractC11843h, false);
        }

        /* renamed from: C */
        public final void m66540C(AbstractC11843h<?> abstractC11843h, boolean z) {
            C11864u c11864u = this.f55266g;
            if (c11864u != null) {
                c11864u.m66553e(abstractC11843h, z);
            }
        }

        /* renamed from: D */
        public void m66539D(View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m66535H(childViewHolderInt);
        }

        /* renamed from: E */
        public void m66538E() {
            for (int size = this.f55262c.size() - 1; size >= 0; size--) {
                m66537F(size);
            }
            this.f55262c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m66215b();
            }
        }

        /* renamed from: F */
        public void m66537F(int i) {
            m66524a(this.f55262c.get(i), true);
            this.f55262c.remove(i);
        }

        /* renamed from: G */
        public void m66536G(View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m66535H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        /* renamed from: H */
        public void m66535H(AbstractC11834D abstractC11834D) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (!abstractC11834D.isScrap() && abstractC11834D.itemView.getParent() == null) {
                if (!abstractC11834D.isTmpDetached()) {
                    if (!abstractC11834D.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = abstractC11834D.doesTransientStatePreventRecycling();
                        AbstractC11843h abstractC11843h = RecyclerView.this.mAdapter;
                        if (abstractC11843h != null && doesTransientStatePreventRecycling && abstractC11843h.onFailedToRecycleView(abstractC11834D)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !abstractC11834D.isRecyclable()) {
                            z4 = false;
                        } else {
                            if (this.f55265f > 0 && !abstractC11834D.hasAnyOfTheFlags(526)) {
                                int size = this.f55262c.size();
                                if (size >= this.f55265f && size > 0) {
                                    m66537F(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m66213d(abstractC11834D.mPosition)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.m66213d(this.f55262c.get(i).mPosition)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.f55262c.add(size, abstractC11834D);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                m66524a(abstractC11834D, true);
                            } else {
                                z4 = false;
                            }
                            z3 = z2;
                        }
                        RecyclerView.this.mViewInfoStore.m66095q(abstractC11834D);
                        if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                            C39813dY3.m44169b(abstractC11834D.itemView);
                            abstractC11834D.mBindingAdapter = null;
                            abstractC11834D.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC11834D + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC11834D.isScrap());
            sb.append(" isAttached:");
            if (abstractC11834D.itemView.getParent() != null) {
                z3 = true;
            }
            sb.append(z3);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: I */
        public void m66534I(View view) {
            AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f55261b == null) {
                    this.f55261b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f55261b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f55260a.add(childViewHolderInt);
            }
        }

        /* renamed from: J */
        public void m66533J(C11864u c11864u) {
            m66541B(RecyclerView.this.mAdapter);
            C11864u c11864u2 = this.f55266g;
            if (c11864u2 != null) {
                c11864u2.m66554d();
            }
            this.f55266g = c11864u;
            if (c11864u != null && RecyclerView.this.getAdapter() != null) {
                this.f55266g.m66557a();
            }
            m66504u();
        }

        /* renamed from: K */
        public void m66532K(AbstractC11832B abstractC11832B) {
            this.f55267h = abstractC11832B;
        }

        /* renamed from: L */
        public void m66531L(int i) {
            this.f55264e = i;
            m66527P();
        }

        /* renamed from: M */
        public final boolean m66530M(AbstractC11834D abstractC11834D, int i, int i2, long j) {
            abstractC11834D.mBindingAdapter = null;
            abstractC11834D.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC11834D.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f55266g.m66544n(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC11834D, i);
            this.f55266g.m66552f(abstractC11834D.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m66523b(abstractC11834D);
            if (RecyclerView.this.mState.m66487e()) {
                abstractC11834D.mPreLayoutPosition = i2;
                return true;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC11834D m66529N(int i, boolean z, long j) {
            AbstractC11834D abstractC11834D;
            boolean z2;
            AbstractC11834D abstractC11834D2;
            boolean z3;
            boolean m66530M;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView findNestedRecyclerView;
            AbstractC11832B abstractC11832B;
            View m66682a;
            if (i >= 0 && i < RecyclerView.this.mState.m66490b()) {
                boolean z4 = true;
                if (RecyclerView.this.mState.m66487e()) {
                    abstractC11834D = m66517h(i);
                    if (abstractC11834D != null) {
                        z2 = true;
                        if (abstractC11834D == null && (abstractC11834D = m66512m(i, z)) != null) {
                            if (m66526Q(abstractC11834D)) {
                                if (!z) {
                                    abstractC11834D.addFlags(4);
                                    if (abstractC11834D.isScrap()) {
                                        RecyclerView.this.removeDetachedView(abstractC11834D.itemView, false);
                                        abstractC11834D.unScrap();
                                    } else if (abstractC11834D.wasReturnedFromScrap()) {
                                        abstractC11834D.clearReturnedFromScrapFlag();
                                    }
                                    m66535H(abstractC11834D);
                                }
                                abstractC11834D = null;
                            } else {
                                z2 = true;
                            }
                        }
                        if (abstractC11834D == null) {
                            int m66354m = RecyclerView.this.mAdapterHelper.m66354m(i);
                            if (m66354m >= 0 && m66354m < RecyclerView.this.mAdapter.getItemCount()) {
                                int itemViewType = RecyclerView.this.mAdapter.getItemViewType(m66354m);
                                if (RecyclerView.this.mAdapter.hasStableIds() && (abstractC11834D = m66513l(RecyclerView.this.mAdapter.getItemId(m66354m), itemViewType, z)) != null) {
                                    abstractC11834D.mPosition = m66354m;
                                    z2 = true;
                                }
                                if (abstractC11834D == null && (abstractC11832B = this.f55267h) != null && (m66682a = abstractC11832B.m66682a(this, i, itemViewType)) != null) {
                                    abstractC11834D = RecyclerView.this.getChildViewHolder(m66682a);
                                    if (abstractC11834D != null) {
                                        if (abstractC11834D.shouldIgnore()) {
                                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                                        }
                                    } else {
                                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                                    }
                                }
                                if (abstractC11834D == null) {
                                    AbstractC11834D m66550h = m66516i().m66550h(itemViewType);
                                    if (m66550h != null) {
                                        m66550h.resetInternal();
                                        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                            m66507r(m66550h);
                                        }
                                    }
                                    abstractC11834D = m66550h;
                                }
                                if (abstractC11834D == null) {
                                    long nanoTime = RecyclerView.this.getNanoTime();
                                    if (j != Long.MAX_VALUE && !this.f55266g.m66543o(itemViewType, nanoTime, j)) {
                                        return null;
                                    }
                                    RecyclerView recyclerView = RecyclerView.this;
                                    AbstractC11834D createViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(createViewHolder.itemView)) != null) {
                                        createViewHolder.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                                    }
                                    this.f55266g.m66551g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                                    abstractC11834D2 = createViewHolder;
                                    z3 = z2;
                                    if (z3 && !RecyclerView.this.mState.m66487e() && abstractC11834D2.hasAnyOfTheFlags(8192)) {
                                        abstractC11834D2.setFlags(0, 8192);
                                        if (RecyclerView.this.mState.f55287k) {
                                            RecyclerView recyclerView2 = RecyclerView.this;
                                            RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(abstractC11834D2, recyclerView2.mItemAnimator.recordPreLayoutInformation(recyclerView2.mState, abstractC11834D2, AbstractC11849m.buildAdapterChangeFlagsForAnimations(abstractC11834D2) | 4096, abstractC11834D2.getUnmodifiedPayloads()));
                                        }
                                    }
                                    if (!RecyclerView.this.mState.m66487e() && abstractC11834D2.isBound()) {
                                        abstractC11834D2.mPreLayoutPosition = i;
                                    } else if (abstractC11834D2.isBound() || abstractC11834D2.needsUpdate() || abstractC11834D2.isInvalid()) {
                                        m66530M = m66530M(abstractC11834D2, RecyclerView.this.mAdapterHelper.m66354m(i), i, j);
                                        layoutParams = abstractC11834D2.itemView.getLayoutParams();
                                        if (layoutParams != null) {
                                            layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                                            abstractC11834D2.itemView.setLayoutParams(layoutParams2);
                                        } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                            layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                                            abstractC11834D2.itemView.setLayoutParams(layoutParams2);
                                        } else {
                                            layoutParams2 = (LayoutParams) layoutParams;
                                        }
                                        layoutParams2.f55209b = abstractC11834D2;
                                        if (z3 || !m66530M) {
                                            z4 = false;
                                        }
                                        layoutParams2.f55212e = z4;
                                        return abstractC11834D2;
                                    }
                                    m66530M = false;
                                    layoutParams = abstractC11834D2.itemView.getLayoutParams();
                                    if (layoutParams != null) {
                                    }
                                    layoutParams2.f55209b = abstractC11834D2;
                                    if (z3) {
                                    }
                                    z4 = false;
                                    layoutParams2.f55212e = z4;
                                    return abstractC11834D2;
                                }
                            } else {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + m66354m + ").state:" + RecyclerView.this.mState.m66490b() + RecyclerView.this.exceptionLabel());
                            }
                        }
                        abstractC11834D2 = abstractC11834D;
                        z3 = z2;
                        if (z3) {
                            abstractC11834D2.setFlags(0, 8192);
                            if (RecyclerView.this.mState.f55287k) {
                            }
                        }
                        if (!RecyclerView.this.mState.m66487e()) {
                        }
                        if (abstractC11834D2.isBound()) {
                        }
                        m66530M = m66530M(abstractC11834D2, RecyclerView.this.mAdapterHelper.m66354m(i), i, j);
                        layoutParams = abstractC11834D2.itemView.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        layoutParams2.f55209b = abstractC11834D2;
                        if (z3) {
                        }
                        z4 = false;
                        layoutParams2.f55212e = z4;
                        return abstractC11834D2;
                    }
                } else {
                    abstractC11834D = null;
                }
                z2 = false;
                if (abstractC11834D == null) {
                    if (m66526Q(abstractC11834D)) {
                    }
                }
                if (abstractC11834D == null) {
                }
                abstractC11834D2 = abstractC11834D;
                z3 = z2;
                if (z3) {
                }
                if (!RecyclerView.this.mState.m66487e()) {
                }
                if (abstractC11834D2.isBound()) {
                }
                m66530M = m66530M(abstractC11834D2, RecyclerView.this.mAdapterHelper.m66354m(i), i, j);
                layoutParams = abstractC11834D2.itemView.getLayoutParams();
                if (layoutParams != null) {
                }
                layoutParams2.f55209b = abstractC11834D2;
                if (z3) {
                }
                z4 = false;
                layoutParams2.f55212e = z4;
                return abstractC11834D2;
            }
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.mState.m66490b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: O */
        public void m66528O(AbstractC11834D abstractC11834D) {
            if (abstractC11834D.mInChangeScrap) {
                this.f55261b.remove(abstractC11834D);
            } else {
                this.f55260a.remove(abstractC11834D);
            }
            abstractC11834D.mScrapContainer = null;
            abstractC11834D.mInChangeScrap = false;
            abstractC11834D.clearReturnedFromScrapFlag();
        }

        /* renamed from: P */
        public void m66527P() {
            int i;
            AbstractC11855p abstractC11855p = RecyclerView.this.mLayout;
            if (abstractC11855p != null) {
                i = abstractC11855p.f55241n;
            } else {
                i = 0;
            }
            this.f55265f = this.f55264e + i;
            for (int size = this.f55262c.size() - 1; size >= 0 && this.f55262c.size() > this.f55265f; size--) {
                m66537F(size);
            }
        }

        /* renamed from: Q */
        public boolean m66526Q(AbstractC11834D abstractC11834D) {
            if (abstractC11834D.isRemoved()) {
                return RecyclerView.this.mState.m66487e();
            }
            int i = abstractC11834D.mPosition;
            if (i >= 0 && i < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.m66487e() && RecyclerView.this.mAdapter.getItemViewType(abstractC11834D.mPosition) != abstractC11834D.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && abstractC11834D.getItemId() != RecyclerView.this.mAdapter.getItemId(abstractC11834D.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC11834D + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: R */
        public void m66525R(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f55262c.size() - 1; size >= 0; size--) {
                AbstractC11834D abstractC11834D = this.f55262c.get(size);
                if (abstractC11834D != null && (i3 = abstractC11834D.mPosition) >= i && i3 < i4) {
                    abstractC11834D.addFlags(2);
                    m66537F(size);
                }
            }
        }

        /* renamed from: a */
        public void m66524a(AbstractC11834D abstractC11834D, boolean z) {
            C5148M1 c5148m1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC11834D);
            View view = abstractC11834D.itemView;
            C11949s c11949s = RecyclerView.this.mAccessibilityDelegate;
            if (c11949s != null) {
                C5148M1 m66140a = c11949s.m66140a();
                if (m66140a instanceof C11949s.C11950a) {
                    c5148m1 = ((C11949s.C11950a) m66140a).m66138a(view);
                } else {
                    c5148m1 = null;
                }
                C38790bq6.m62452v0(view, c5148m1);
            }
            if (z) {
                m66518g(abstractC11834D);
            }
            abstractC11834D.mBindingAdapter = null;
            abstractC11834D.mOwnerRecyclerView = null;
            m66516i().m66547k(abstractC11834D);
        }

        /* renamed from: b */
        public final void m66523b(AbstractC11834D abstractC11834D) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC11834D.itemView;
                if (C38790bq6.m62552B(view) == 0) {
                    C38790bq6.m62539H0(view, 1);
                }
                C11949s c11949s = RecyclerView.this.mAccessibilityDelegate;
                if (c11949s == null) {
                    return;
                }
                C5148M1 m66140a = c11949s.m66140a();
                if (m66140a instanceof C11949s.C11950a) {
                    ((C11949s.C11950a) m66140a).m66137b(view);
                }
                C38790bq6.m62452v0(view, m66140a);
            }
        }

        /* renamed from: c */
        public void m66522c() {
            this.f55260a.clear();
            m66538E();
        }

        /* renamed from: d */
        public void m66521d() {
            int size = this.f55262c.size();
            for (int i = 0; i < size; i++) {
                this.f55262c.get(i).clearOldPosition();
            }
            int size2 = this.f55260a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f55260a.get(i2).clearOldPosition();
            }
            ArrayList<AbstractC11834D> arrayList = this.f55261b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f55261b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        public void m66520e() {
            this.f55260a.clear();
            ArrayList<AbstractC11834D> arrayList = this.f55261b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m66519f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m66490b()) {
                if (!RecyclerView.this.mState.m66487e()) {
                    return i;
                }
                return RecyclerView.this.mAdapterHelper.m66354m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m66490b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        public void m66518g(AbstractC11834D abstractC11834D) {
            InterfaceC11867w interfaceC11867w = RecyclerView.this.mRecyclerListener;
            if (interfaceC11867w != null) {
                interfaceC11867w.m66498a(abstractC11834D);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i).m66498a(abstractC11834D);
            }
            AbstractC11843h abstractC11843h = RecyclerView.this.mAdapter;
            if (abstractC11843h != null) {
                abstractC11843h.onViewRecycled(abstractC11834D);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m66095q(abstractC11834D);
            }
        }

        /* renamed from: h */
        public AbstractC11834D m66517h(int i) {
            int size;
            int m66354m;
            ArrayList<AbstractC11834D> arrayList = this.f55261b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC11834D abstractC11834D = this.f55261b.get(i2);
                    if (!abstractC11834D.wasReturnedFromScrap() && abstractC11834D.getLayoutPosition() == i) {
                        abstractC11834D.addFlags(32);
                        return abstractC11834D;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m66354m = RecyclerView.this.mAdapterHelper.m66354m(i)) > 0 && m66354m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m66354m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC11834D abstractC11834D2 = this.f55261b.get(i3);
                        if (!abstractC11834D2.wasReturnedFromScrap() && abstractC11834D2.getItemId() == itemId) {
                            abstractC11834D2.addFlags(32);
                            return abstractC11834D2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        public C11864u m66516i() {
            if (this.f55266g == null) {
                this.f55266g = new C11864u();
                m66504u();
            }
            return this.f55266g;
        }

        /* renamed from: j */
        public int m66515j() {
            return this.f55260a.size();
        }

        /* renamed from: k */
        public List<AbstractC11834D> m66514k() {
            return this.f55263d;
        }

        /* renamed from: l */
        public AbstractC11834D m66513l(long j, int i, boolean z) {
            for (int size = this.f55260a.size() - 1; size >= 0; size--) {
                AbstractC11834D abstractC11834D = this.f55260a.get(size);
                if (abstractC11834D.getItemId() == j && !abstractC11834D.wasReturnedFromScrap()) {
                    if (i == abstractC11834D.getItemViewType()) {
                        abstractC11834D.addFlags(32);
                        if (abstractC11834D.isRemoved() && !RecyclerView.this.mState.m66487e()) {
                            abstractC11834D.setFlags(2, 14);
                        }
                        return abstractC11834D;
                    } else if (!z) {
                        this.f55260a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC11834D.itemView, false);
                        m66539D(abstractC11834D.itemView);
                    }
                }
            }
            int size2 = this.f55262c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC11834D abstractC11834D2 = this.f55262c.get(size2);
                if (abstractC11834D2.getItemId() == j && !abstractC11834D2.isAttachedToTransitionOverlay()) {
                    if (i == abstractC11834D2.getItemViewType()) {
                        if (!z) {
                            this.f55262c.remove(size2);
                        }
                        return abstractC11834D2;
                    } else if (!z) {
                        m66537F(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        public AbstractC11834D m66512m(int i, boolean z) {
            View m66310e;
            int size = this.f55260a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC11834D abstractC11834D = this.f55260a.get(i2);
                if (!abstractC11834D.wasReturnedFromScrap() && abstractC11834D.getLayoutPosition() == i && !abstractC11834D.isInvalid() && (RecyclerView.this.mState.f55284h || !abstractC11834D.isRemoved())) {
                    abstractC11834D.addFlags(32);
                    return abstractC11834D;
                }
            }
            if (!z && (m66310e = RecyclerView.this.mChildHelper.m66310e(i)) != null) {
                AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(m66310e);
                RecyclerView.this.mChildHelper.m66296s(m66310e);
                int m66302m = RecyclerView.this.mChildHelper.m66302m(m66310e);
                if (m66302m != -1) {
                    RecyclerView.this.mChildHelper.m66311d(m66302m);
                    m66534I(m66310e);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f55262c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC11834D abstractC11834D2 = this.f55262c.get(i3);
                if (!abstractC11834D2.isInvalid() && abstractC11834D2.getLayoutPosition() == i && !abstractC11834D2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f55262c.remove(i3);
                    }
                    return abstractC11834D2;
                }
            }
            return null;
        }

        /* renamed from: n */
        public View m66511n(int i) {
            return this.f55260a.get(i).itemView;
        }

        /* renamed from: o */
        public View m66510o(int i) {
            return m66509p(i, false);
        }

        /* renamed from: p */
        public View m66509p(int i, boolean z) {
            return m66529N(i, z, Long.MAX_VALUE).itemView;
        }

        /* renamed from: q */
        public final void m66508q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m66508q((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        /* renamed from: r */
        public final void m66507r(AbstractC11834D abstractC11834D) {
            View view = abstractC11834D.itemView;
            if (view instanceof ViewGroup) {
                m66508q((ViewGroup) view, false);
            }
        }

        /* renamed from: s */
        public void m66506s() {
            int size = this.f55262c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.f55262c.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f55211d = true;
                }
            }
        }

        /* renamed from: t */
        public void m66505t() {
            int size = this.f55262c.size();
            for (int i = 0; i < size; i++) {
                AbstractC11834D abstractC11834D = this.f55262c.get(i);
                if (abstractC11834D != null) {
                    abstractC11834D.addFlags(6);
                    abstractC11834D.addChangePayload(null);
                }
            }
            AbstractC11843h abstractC11843h = RecyclerView.this.mAdapter;
            if (abstractC11843h == null || !abstractC11843h.hasStableIds()) {
                m66538E();
            }
        }

        /* renamed from: u */
        public final void m66504u() {
            if (this.f55266g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                    this.f55266g.m66556b(RecyclerView.this.mAdapter);
                }
            }
        }

        /* renamed from: v */
        public void m66503v(int i, int i2) {
            int size = this.f55262c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC11834D abstractC11834D = this.f55262c.get(i3);
                if (abstractC11834D != null && abstractC11834D.mPosition >= i) {
                    abstractC11834D.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: w */
        public void m66502w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f55262c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC11834D abstractC11834D = this.f55262c.get(i7);
                if (abstractC11834D != null && (i6 = abstractC11834D.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC11834D.offsetPosition(i2 - i, false);
                    } else {
                        abstractC11834D.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* renamed from: x */
        public void m66501x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f55262c.size() - 1; size >= 0; size--) {
                AbstractC11834D abstractC11834D = this.f55262c.get(size);
                if (abstractC11834D != null) {
                    int i4 = abstractC11834D.mPosition;
                    if (i4 >= i3) {
                        abstractC11834D.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        abstractC11834D.addFlags(8);
                        m66537F(size);
                    }
                }
            }
        }

        /* renamed from: y */
        public void m66500y(AbstractC11843h<?> abstractC11843h, AbstractC11843h<?> abstractC11843h2, boolean z) {
            m66522c();
            m66540C(abstractC11843h, true);
            m66516i().m66548j(abstractC11843h, abstractC11843h2, z);
            m66504u();
        }

        /* renamed from: z */
        public void m66499z() {
            m66504u();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public interface InterfaceC11867w {
        /* renamed from: a */
        void m66498a(AbstractC11834D abstractC11834D);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class C11868x extends AbstractC11846j {
        public C11868x() {
        }

        /* renamed from: a */
        public void m66497a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C38790bq6.m62468n0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f55283g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.m66351p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m66349r(i, i2, obj)) {
                m66497a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m66348s(i, i2)) {
                m66497a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m66347t(i, i2, i3)) {
                m66497a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m66346u(i, i2)) {
                m66497a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onStateRestorationPolicyChanged() {
            AbstractC11843h abstractC11843h;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (abstractC11843h = recyclerView.mAdapter) != null && abstractC11843h.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11869y {
        private AbstractC11855p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final C11870a mRecyclingAction = new C11870a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        /* loaded from: classes.dex */
        public static class C11870a {

            /* renamed from: a */
            public int f55270a;

            /* renamed from: b */
            public int f55271b;

            /* renamed from: c */
            public int f55272c;

            /* renamed from: d */
            public int f55273d;

            /* renamed from: e */
            public Interpolator f55274e;

            /* renamed from: f */
            public boolean f55275f;

            /* renamed from: g */
            public int f55276g;

            public C11870a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: a */
            public boolean m66496a() {
                return this.f55273d >= 0;
            }

            /* renamed from: b */
            public void m66495b(int i) {
                this.f55273d = i;
            }

            /* renamed from: c */
            public void m66494c(RecyclerView recyclerView) {
                int i = this.f55273d;
                if (i >= 0) {
                    this.f55273d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f55275f = false;
                } else if (this.f55275f) {
                    m66492e();
                    recyclerView.mViewFlinger.m66677e(this.f55270a, this.f55271b, this.f55272c, this.f55274e);
                    int i2 = this.f55276g + 1;
                    this.f55276g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f55275f = false;
                } else {
                    this.f55276g = 0;
                }
            }

            /* renamed from: d */
            public void m66493d(int i, int i2, int i3, Interpolator interpolator) {
                this.f55270a = i;
                this.f55271b = i2;
                this.f55272c = i3;
                this.f55274e = interpolator;
                this.f55275f = true;
            }

            /* renamed from: e */
            public final void m66492e() {
                if (this.f55274e != null && this.f55272c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f55272c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            public C11870a(int i, int i2, int i3, Interpolator interpolator) {
                this.f55273d = -1;
                this.f55275f = false;
                this.f55276g = 0;
                this.f55270a = i;
                this.f55271b = i2;
                this.f55272c = i3;
                this.f55274e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        /* loaded from: classes.dex */
        public interface InterfaceC11871b {
            /* renamed from: a */
            PointF mo51838a(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
            AbstractC11855p layoutManager = getLayoutManager();
            if (layoutManager instanceof InterfaceC11871b) {
                return ((InterfaceC11871b) layoutManager).mo51838a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC11871b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.mo66607W(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.m66594d0();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public AbstractC11855p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m66494c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean m66496a = this.mRecyclingAction.m66496a();
                this.mRecyclingAction.m66494c(recyclerView);
                if (m66496a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m66678d();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, C11872z c11872z, C11870a c11870a);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, C11872z c11872z, C11870a c11870a);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, AbstractC11855p abstractC11855p) {
            recyclerView.mViewFlinger.stop();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC11855p;
            int i = this.mTargetPosition;
            if (i != -1) {
                recyclerView.mState.f55277a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.m66678d();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void stop() {
            if (!this.mRunning) {
                return;
            }
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f55277a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.m66566w1(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C11872z {

        /* renamed from: b */
        public SparseArray<Object> f55278b;

        /* renamed from: m */
        public int f55289m;

        /* renamed from: n */
        public long f55290n;

        /* renamed from: o */
        public int f55291o;

        /* renamed from: p */
        public int f55292p;

        /* renamed from: q */
        public int f55293q;

        /* renamed from: a */
        public int f55277a = -1;

        /* renamed from: c */
        public int f55279c = 0;

        /* renamed from: d */
        public int f55280d = 0;

        /* renamed from: e */
        public int f55281e = 1;

        /* renamed from: f */
        public int f55282f = 0;

        /* renamed from: g */
        public boolean f55283g = false;

        /* renamed from: h */
        public boolean f55284h = false;

        /* renamed from: i */
        public boolean f55285i = false;

        /* renamed from: j */
        public boolean f55286j = false;

        /* renamed from: k */
        public boolean f55287k = false;

        /* renamed from: l */
        public boolean f55288l = false;

        /* renamed from: a */
        public void m66491a(int i) {
            if ((this.f55281e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f55281e));
        }

        /* renamed from: b */
        public int m66490b() {
            if (this.f55284h) {
                return this.f55279c - this.f55280d;
            }
            return this.f55282f;
        }

        /* renamed from: c */
        public int m66489c() {
            return this.f55277a;
        }

        /* renamed from: d */
        public boolean m66488d() {
            return this.f55277a != -1;
        }

        /* renamed from: e */
        public boolean m66487e() {
            return this.f55284h;
        }

        /* renamed from: f */
        public void m66486f(AbstractC11843h abstractC11843h) {
            this.f55281e = 1;
            this.f55282f = abstractC11843h.getItemCount();
            this.f55284h = false;
            this.f55285i = false;
            this.f55286j = false;
        }

        /* renamed from: g */
        public boolean m66485g() {
            return this.f55288l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f55277a + ", mData=" + this.f55278b + ", mItemCount=" + this.f55282f + ", mIsMeasuring=" + this.f55286j + ", mPreviousLayoutItemCount=" + this.f55279c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f55280d + ", mStructureChanged=" + this.f55283g + ", mInPreLayout=" + this.f55284h + ", mRunSimpleAnimations=" + this.f55287k + ", mRunPredictiveAnimations=" + this.f55288l + CoreConstants.CURLY_RIGHT;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new animationInterpolatorC11838c();
        sDefaultEdgeEffectFactory = new C11831A();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC11834D abstractC11834D) {
        boolean z;
        View view = abstractC11834D.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.mRecycler.m66528O(getChildViewHolder(view));
        if (abstractC11834D.isTmpDetached()) {
            this.mChildHelper.m66312c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m66313b(view, true);
        } else {
            this.mChildHelper.m66304k(view);
        }
    }

    private void animateChange(AbstractC11834D abstractC11834D, AbstractC11834D abstractC11834D2, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2, boolean z, boolean z2) {
        abstractC11834D.setIsRecyclable(false);
        if (z) {
            addAnimatingView(abstractC11834D);
        }
        if (abstractC11834D != abstractC11834D2) {
            if (z2) {
                addAnimatingView(abstractC11834D2);
            }
            abstractC11834D.mShadowedHolder = abstractC11834D2;
            addAnimatingView(abstractC11834D);
            this.mRecycler.m66528O(abstractC11834D);
            abstractC11834D2.setIsRecyclable(false);
            abstractC11834D2.mShadowingHolder = abstractC11834D;
        }
        if (this.mItemAnimator.animateChange(abstractC11834D, abstractC11834D2, c11852c, c11852c2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC11834D abstractC11834D) {
        WeakReference<RecyclerView> weakReference = abstractC11834D.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC11834D.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            abstractC11834D.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C49071t91.m13000b(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(((-i2) / FLING_DESTRETCH_FACTOR) * C49071t91.m12998d(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i < 0 && edgeEffect2 != null && C49071t91.m13000b(edgeEffect2) != DECELERATION_RATE) {
            float f = i2;
            int round2 = Math.round((f / FLING_DESTRETCH_FACTOR) * C49071t91.m12998d(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(AbstractC11855p.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC11855p) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C5459N1.m94457b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.m66491a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f55286j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m66106f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C11872z c11872z = this.mState;
        c11872z.f55285i = (c11872z.f55287k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c11872z.f55284h = c11872z.f55288l;
        c11872z.f55282f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f55287k) {
            int m66308g = this.mChildHelper.m66308g();
            for (int i = 0; i < m66308g; i++) {
                AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66309f(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m66107e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, AbstractC11849m.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f55285i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m66109c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f55288l) {
            saveOldPositions();
            C11872z c11872z2 = this.mState;
            boolean z2 = c11872z2.f55283g;
            c11872z2.f55283g = false;
            this.mLayout.mo51798o1(this.mRecycler, c11872z2);
            this.mState.f55283g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.m66308g(); i2++) {
                AbstractC11834D childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m66309f(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m66103i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = AbstractC11849m.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    AbstractC11849m.C11852c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.m66111a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f55281e = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m66491a(6);
        this.mAdapterHelper.m66357j();
        this.mState.f55282f = this.mAdapter.getItemCount();
        this.mState.f55280d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f55213d;
            if (parcelable != null) {
                this.mLayout.mo51787t1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C11872z c11872z = this.mState;
        c11872z.f55284h = false;
        this.mLayout.mo51798o1(this.mRecycler, c11872z);
        C11872z c11872z2 = this.mState;
        c11872z2.f55283g = false;
        if (c11872z2.f55287k && this.mItemAnimator != null) {
            z = true;
        } else {
            z = false;
        }
        c11872z2.f55287k = z;
        c11872z2.f55281e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m66491a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C11872z c11872z = this.mState;
        c11872z.f55281e = 1;
        if (c11872z.f55287k) {
            for (int m66308g = this.mChildHelper.m66308g() - 1; m66308g >= 0; m66308g--) {
                AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66309f(m66308g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC11849m.C11852c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    AbstractC11834D m66105g = this.mViewInfoStore.m66105g(changedHolderKey);
                    if (m66105g != null && !m66105g.shouldIgnore()) {
                        boolean m66104h = this.mViewInfoStore.m66104h(m66105g);
                        boolean m66104h2 = this.mViewInfoStore.m66104h(childViewHolderInt);
                        if (m66104h && m66105g == childViewHolderInt) {
                            this.mViewInfoStore.m66108d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            AbstractC11849m.C11852c m66098n = this.mViewInfoStore.m66098n(m66105g);
                            this.mViewInfoStore.m66108d(childViewHolderInt, recordPostLayoutInformation);
                            AbstractC11849m.C11852c m66099m = this.mViewInfoStore.m66099m(childViewHolderInt);
                            if (m66098n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m66105g);
                            } else {
                                animateChange(m66105g, childViewHolderInt, m66098n, m66099m, m66104h, m66104h2);
                            }
                        }
                    } else {
                        this.mViewInfoStore.m66108d(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.m66097o(this.mViewInfoProcessCallback);
        }
        this.mLayout.m66643D1(this.mRecycler);
        C11872z c11872z2 = this.mState;
        c11872z2.f55279c = c11872z2.f55282f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c11872z2.f55287k = false;
        c11872z2.f55288l = false;
        this.mLayout.f55236i = false;
        ArrayList<AbstractC11834D> arrayList = this.mRecycler.f55261b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p.f55242o) {
            abstractC11855p.f55241n = 0;
            abstractC11855p.f55242o = false;
            this.mRecycler.m66527P();
        }
        this.mLayout.mo51795p1(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m66106f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC11862s interfaceC11862s = this.mInterceptingOnItemTouchListener;
        if (interfaceC11862s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC11862s.mo45809b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC11862s interfaceC11862s = this.mOnItemTouchListeners.get(i);
            if (interfaceC11862s.mo45808c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC11862s;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m66308g = this.mChildHelper.m66308g();
        if (m66308g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m66308g; i3++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66309f(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC11834D findViewHolderForAdapterPosition;
        C11872z c11872z = this.mState;
        int i = c11872z.f55289m;
        if (i == -1) {
            i = 0;
        }
        int m66490b = c11872z.m66490b();
        for (int i2 = i; i2 < m66490b; i2++) {
            AbstractC11834D findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(m66490b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static AbstractC11834D getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f55209b;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f55210c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(InstructionFileId.DOT)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + CoreConstants.DOT + str;
        }
    }

    private J43 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new J43(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i) {
        double log = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (this.mPhysicalCoef * SCROLL_FRICTION * Math.exp((f / (f - 1.0d)) * log));
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC11834D abstractC11834D, AbstractC11834D abstractC11834D2) {
        int m66308g = this.mChildHelper.m66308g();
        for (int i = 0; i < m66308g; i++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66309f(i));
            if (childViewHolderInt != abstractC11834D && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC11843h abstractC11843h = this.mAdapter;
                if (abstractC11843h != null && abstractC11843h.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC11834D + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC11834D + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC11834D2 + " cannot be found but it is necessary for " + abstractC11834D + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int m66308g = this.mChildHelper.m66308g();
        for (int i = 0; i < m66308g; i++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66309f(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C38790bq6.m62550C(this) == 0) {
            C38790bq6.m62537I0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C11891f(new C11840e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        if (this.mLayout.m66572t0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                if (c <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
                        } else if (i3 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i3 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c <= 0 && (c != 0 || i3 * i2 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i3 * i2 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        float y;
        float x;
        int i5;
        int i6;
        int i7;
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            int i8 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean mo51880E = abstractC11855p.mo51880E();
            boolean mo51878F = this.mLayout.mo51878F();
            if (mo51878F) {
                i4 = mo51880E | 2;
            } else {
                i4 = mo51880E;
            }
            if (motionEvent == null) {
                y = getHeight() / 2.0f;
            } else {
                y = motionEvent.getY();
            }
            if (motionEvent == null) {
                x = getWidth() / 2.0f;
            } else {
                x = motionEvent.getX();
            }
            int releaseHorizontalGlow = i - releaseHorizontalGlow(i, y);
            int releaseVerticalGlow = i2 - releaseVerticalGlow(i2, x);
            startNestedScroll(i4, i3);
            if (mo51880E != 0) {
                i5 = releaseHorizontalGlow;
            } else {
                i5 = 0;
            }
            if (mo51878F) {
                i6 = releaseVerticalGlow;
            } else {
                i6 = 0;
            }
            if (dispatchNestedPreScroll(i5, i6, this.mReusableIntPair, this.mScrollOffset, i3)) {
                int[] iArr2 = this.mReusableIntPair;
                releaseHorizontalGlow -= iArr2[0];
                releaseVerticalGlow -= iArr2[1];
            }
            if (mo51880E != 0) {
                i7 = releaseHorizontalGlow;
            } else {
                i7 = 0;
            }
            if (mo51878F) {
                i8 = releaseVerticalGlow;
            }
            scrollByInternal(i7, i8, motionEvent, i3);
            RunnableC11921k runnableC11921k = this.mGapWorker;
            if (runnableC11921k != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
                runnableC11921k.m66222f(this, releaseHorizontalGlow, releaseVerticalGlow);
            }
            stopNestedScroll(i3);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo66447d2();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m66342y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo66435j1(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m66344w();
        } else {
            this.mAdapterHelper.m66357j();
        }
        boolean z4 = false;
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z = false;
        } else {
            z = true;
        }
        C11872z c11872z = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z3 = this.mDataSetHasChangedAfterLayout) || z || this.mLayout.f55236i) && (!z3 || this.mAdapter.hasStableIds()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        c11872z.f55287k = z2;
        C11872z c11872z2 = this.mState;
        if (c11872z2.f55287k && z && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z4 = true;
        }
        c11872z2.f55288l = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < DECELERATION_RATE) {
            ensureLeftGlow();
            C49071t91.m12998d(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else if (f2 > DECELERATION_RATE) {
            ensureRightGlow();
            C49071t91.m12998d(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        } else {
            z = false;
            if (f4 >= DECELERATION_RATE) {
                ensureTopGlow();
                C49071t91.m12998d(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > DECELERATION_RATE) {
                ensureBottomGlow();
                C49071t91.m12998d(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (!z2 || f2 != DECELERATION_RATE || f4 != DECELERATION_RATE) {
                C38790bq6.m62470m0(this);
            }
            return;
        }
        z = true;
        if (f4 >= DECELERATION_RATE) {
        }
        if (!z2) {
        }
        C38790bq6.m62470m0(this);
    }

    private void recoverFocusFromState() {
        AbstractC11834D abstractC11834D;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.m66308g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.m66301n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f55290n != -1 && this.mAdapter.hasStableIds()) {
                    abstractC11834D = findViewHolderForItemId(this.mState.f55290n);
                } else {
                    abstractC11834D = null;
                }
                if (abstractC11834D != null && !this.mChildHelper.m66301n(abstractC11834D.itemView) && abstractC11834D.itemView.hasFocusable()) {
                    view = abstractC11834D.itemView;
                } else if (this.mChildHelper.m66308g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f55291o;
                    if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C38790bq6.m62470m0(this);
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = DECELERATION_RATE;
        if (edgeEffect != null && C49071t91.m13000b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C49071t91.m12998d(this.mLeftGlow, -width, 1.0f - height);
                if (C49071t91.m13000b(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C49071t91.m13000b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float m12998d = C49071t91.m12998d(this.mRightGlow, width, height);
                    if (C49071t91.m13000b(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = m12998d;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = DECELERATION_RATE;
        if (edgeEffect != null && C49071t91.m13000b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C49071t91.m12998d(this.mTopGlow, -height, width);
                if (C49071t91.m13000b(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C49071t91.m13000b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float m12998d = C49071t91.m12998d(this.mBottomGlow, height, 1.0f - width);
                    if (C49071t91.m13000b(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = m12998d;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f55211d) {
                Rect rect = layoutParams2.f55210c;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        abstractC11855p.mo65671K1(this, view, rect3, z2, z);
    }

    private void resetFocusInfo() {
        C11872z c11872z = this.mState;
        c11872z.f55290n = -1L;
        c11872z.f55289m = -1;
        c11872z.f55291o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j;
        int absoluteAdapterPosition;
        AbstractC11834D abstractC11834D = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            abstractC11834D = findContainingViewHolder(view);
        }
        if (abstractC11834D == null) {
            resetFocusInfo();
            return;
        }
        C11872z c11872z = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j = abstractC11834D.getItemId();
        } else {
            j = -1;
        }
        c11872z.f55290n = j;
        C11872z c11872z2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (abstractC11834D.isRemoved()) {
            absoluteAdapterPosition = abstractC11834D.mOldPosition;
        } else {
            absoluteAdapterPosition = abstractC11834D.getAbsoluteAdapterPosition();
        }
        c11872z2.f55289m = absoluteAdapterPosition;
        this.mState.f55291o = getDeepestFocusedViewWithId(abstractC11834D.itemView);
    }

    private void setAdapterInternal(AbstractC11843h<?> abstractC11843h, boolean z, boolean z2) {
        AbstractC11843h abstractC11843h2 = this.mAdapter;
        if (abstractC11843h2 != null) {
            abstractC11843h2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m66342y();
        AbstractC11843h<?> abstractC11843h3 = this.mAdapter;
        this.mAdapter = abstractC11843h;
        if (abstractC11843h != null) {
            abstractC11843h.registerAdapterDataObserver(this.mObserver);
            abstractC11843h.onAttachedToRecyclerView(this);
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.mo51849V0(abstractC11843h3, this.mAdapter);
        }
        this.mRecycler.m66500y(abstractC11843h3, this.mAdapter, z);
        this.mState.f55283g = true;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i) < C49071t91.m13000b(edgeEffect) * i2) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && C49071t91.m13000b(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            C49071t91.m12998d(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C49071t91.m13000b(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            C49071t91.m12998d(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C49071t91.m13000b(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            C49071t91.m12998d(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && C49071t91.m13000b(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            C49071t91.m12998d(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.m66595c2();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C38790bq6.m62470m0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.m66606W0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(AbstractC11854o abstractC11854o, int i) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.mo66484A("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC11854o);
        } else {
            this.mItemDecorations.add(i, abstractC11854o);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC11860q interfaceC11860q) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC11860q);
    }

    public void addOnItemTouchListener(InterfaceC11862s interfaceC11862s) {
        this.mOnItemTouchListeners.add(interfaceC11862s);
    }

    public void addOnScrollListener(AbstractC11863t abstractC11863t) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC11863t);
    }

    public void addRecyclerListener(InterfaceC11867w interfaceC11867w) {
        boolean z;
        if (interfaceC11867w != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC11867w);
    }

    public void animateAppearance(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2) {
        abstractC11834D.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(abstractC11834D, c11852c, c11852c2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c, AbstractC11849m.C11852c c11852c2) {
        addAnimatingView(abstractC11834D);
        abstractC11834D.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(abstractC11834D, c11852c, c11852c2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC11834D abstractC11834D) {
        AbstractC11849m abstractC11849m = this.mItemAnimator;
        if (abstractC11849m != null && !abstractC11849m.canReuseUpdatedViewHolder(abstractC11834D, abstractC11834D.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.mo51876G((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int m66305j = this.mChildHelper.m66305j();
        for (int i = 0; i < m66305j; i++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m66521d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC11860q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC11863t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51880E()) {
            return 0;
        }
        return this.mLayout.mo51870K(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51880E()) {
            return 0;
        }
        return this.mLayout.mo51868L(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51880E()) {
            return 0;
        }
        return this.mLayout.mo51866M(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51878F()) {
            return 0;
        }
        return this.mLayout.mo51864N(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51878F()) {
            return 0;
        }
        return this.mLayout.mo51861O(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null || !abstractC11855p.mo51878F()) {
            return 0;
        }
        return this.mLayout.mo51858P(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C38790bq6.m62470m0(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.m66351p()) {
                return;
            }
            if (this.mAdapterHelper.m66352o(4) && !this.mAdapterHelper.m66352o(11)) {
                C40152e66.m43277a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m66344w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m66358i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C40152e66.m43276b();
                return;
            } else if (this.mAdapterHelper.m66351p()) {
                C40152e66.m43277a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C40152e66.m43276b();
                return;
            } else {
                return;
            }
        }
        C40152e66.m43277a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        C40152e66.m43276b();
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(AbstractC11855p.m66636H(i, getPaddingLeft() + getPaddingRight(), C38790bq6.m62544F(this)), AbstractC11855p.m66636H(i2, getPaddingTop() + getPaddingBottom(), C38790bq6.m62546E(this)));
    }

    public void dispatchChildAttached(View view) {
        AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC11843h abstractC11843h = this.mAdapter;
        if (abstractC11843h != null && childViewHolderInt != null) {
            abstractC11843h.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC11860q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo65677d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC11843h abstractC11843h = this.mAdapter;
        if (abstractC11843h != null && childViewHolderInt != null) {
            abstractC11843h.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC11860q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo65678a(view);
            }
        }
    }

    public void dispatchLayout() {
        boolean z;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f55286j = false;
            if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
                z = true;
            } else {
                z = false;
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f55281e == 1) {
                dispatchLayoutStep1();
                this.mLayout.m66616R1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.m66350q() && !z && this.mLayout.m66642E0() == getWidth() && this.mLayout.m66578q0() == getHeight()) {
                this.mLayout.m66616R1(this);
            } else {
                this.mLayout.m66616R1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m101216a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m101215b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m101214c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m101211f(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.mo66419v1(i);
        }
        onScrollStateChanged(i);
        AbstractC11863t abstractC11863t = this.mScrollListener;
        if (abstractC11863t != null) {
            abstractC11863t.onScrollStateChanged(this, i);
        }
        List<AbstractC11863t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC11863t abstractC11863t = this.mScrollListener;
        if (abstractC11863t != null) {
            abstractC11863t.onScrolled(this, i, i2);
        }
        List<AbstractC11863t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC11834D abstractC11834D = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC11834D.itemView.getParent() == this && !abstractC11834D.shouldIgnore() && (i = abstractC11834D.mPendingAccessibilityState) != -1) {
                C38790bq6.m62539H0(abstractC11834D.itemView, i);
                abstractC11834D.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z5 = z;
        }
        if (z5) {
            C38790bq6.m62470m0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect mo66658a = this.mEdgeEffectFactory.mo66658a(this, 3);
        this.mBottomGlow = mo66658a;
        if (this.mClipToPadding) {
            mo66658a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo66658a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect mo66658a = this.mEdgeEffectFactory.mo66658a(this, 0);
        this.mLeftGlow = mo66658a;
        if (this.mClipToPadding) {
            mo66658a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo66658a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect mo66658a = this.mEdgeEffectFactory.mo66658a(this, 2);
        this.mRightGlow = mo66658a;
        if (this.mClipToPadding) {
            mo66658a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            mo66658a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect mo66658a = this.mEdgeEffectFactory.mo66658a(this, 1);
        this.mTopGlow = mo66658a;
        if (this.mClipToPadding) {
            mo66658a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            mo66658a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C11872z c11872z) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f55204d;
            c11872z.f55292p = overScroller.getFinalX() - overScroller.getCurrX();
            c11872z.f55293q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c11872z.f55292p = 0;
        c11872z.f55293q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int m66308g = this.mChildHelper.m66308g() - 1; m66308g >= 0; m66308g--) {
            View m66309f = this.mChildHelper.m66309f(m66308g);
            float translationX = m66309f.getTranslationX();
            float translationY = m66309f.getTranslationY();
            if (f >= m66309f.getLeft() + translationX && f <= m66309f.getRight() + translationX && f2 >= m66309f.getTop() + translationY && f2 <= m66309f.getBottom() + translationY) {
                return m66309f;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    public AbstractC11834D findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public AbstractC11834D findViewHolderForAdapterPosition(int i) {
        AbstractC11834D abstractC11834D = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m66305j = this.mChildHelper.m66305j();
        for (int i2 = 0; i2 < m66305j; i2++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (this.mChildHelper.m66301n(childViewHolderInt.itemView)) {
                    abstractC11834D = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return abstractC11834D;
    }

    public AbstractC11834D findViewHolderForItemId(long j) {
        AbstractC11843h abstractC11843h = this.mAdapter;
        AbstractC11834D abstractC11834D = null;
        if (abstractC11843h != null && abstractC11843h.hasStableIds()) {
            int m66305j = this.mChildHelper.m66305j();
            for (int i = 0; i < m66305j; i++) {
                AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (this.mChildHelper.m66301n(childViewHolderInt.itemView)) {
                        abstractC11834D = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return abstractC11834D;
    }

    public AbstractC11834D findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public AbstractC11834D findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i, int i2) {
        int i3;
        int i4;
        float f;
        float f2;
        boolean z;
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            int mo51880E = abstractC11855p.mo51880E();
            boolean mo51878F = this.mLayout.mo51878F();
            if (mo51880E == 0 || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!mo51878F || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            if (i != 0) {
                EdgeEffect edgeEffect = this.mLeftGlow;
                if (edgeEffect != null && C49071t91.m13000b(edgeEffect) != DECELERATION_RATE) {
                    int i5 = -i;
                    if (shouldAbsorb(this.mLeftGlow, i5, getWidth())) {
                        this.mLeftGlow.onAbsorb(i5);
                        i = 0;
                    }
                    i3 = i;
                    i = 0;
                } else {
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    if (edgeEffect2 != null && C49071t91.m13000b(edgeEffect2) != DECELERATION_RATE) {
                        if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                            this.mRightGlow.onAbsorb(i);
                            i = 0;
                        }
                        i3 = i;
                        i = 0;
                    }
                }
                if (i2 != 0) {
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 != null && C49071t91.m13000b(edgeEffect3) != DECELERATION_RATE) {
                        int i6 = -i2;
                        if (shouldAbsorb(this.mTopGlow, i6, getHeight())) {
                            this.mTopGlow.onAbsorb(i6);
                            i2 = 0;
                        }
                        i4 = 0;
                    } else {
                        EdgeEffect edgeEffect4 = this.mBottomGlow;
                        if (edgeEffect4 != null && C49071t91.m13000b(edgeEffect4) != DECELERATION_RATE) {
                            if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                                this.mBottomGlow.onAbsorb(i2);
                                i2 = 0;
                            }
                            i4 = 0;
                        }
                    }
                    if (i3 == 0 || i2 != 0) {
                        int i7 = this.mMaxFlingVelocity;
                        i3 = Math.max(-i7, Math.min(i3, i7));
                        int i8 = this.mMaxFlingVelocity;
                        i2 = Math.max(-i8, Math.min(i2, i8));
                        this.mViewFlinger.m66680b(i3, i2);
                    }
                    if (i != 0 && i4 == 0) {
                        if (i3 == 0 && i2 == 0) {
                            return false;
                        }
                        return true;
                    }
                    f = i;
                    f2 = i4;
                    if (!dispatchNestedPreFling(f, f2)) {
                        if (mo51880E == 0 && !mo51878F) {
                            z = false;
                        } else {
                            z = true;
                        }
                        dispatchNestedFling(f, f2, z);
                        AbstractC11861r abstractC11861r = this.mOnFlingListener;
                        if (abstractC11861r != null && abstractC11861r.mo66133a(i, i4)) {
                            return true;
                        }
                        if (z) {
                            if (mo51878F) {
                                mo51880E = (mo51880E == true ? 1 : 0) | 2;
                            }
                            startNestedScroll(mo51880E, 1);
                            int i9 = this.mMaxFlingVelocity;
                            int max = Math.max(-i9, Math.min(i, i9));
                            int i10 = this.mMaxFlingVelocity;
                            this.mViewFlinger.m66680b(max, Math.max(-i10, Math.min(i4, i10)));
                            return true;
                        }
                    }
                    return false;
                }
                i4 = i2;
                i2 = 0;
                if (i3 == 0) {
                }
                int i72 = this.mMaxFlingVelocity;
                i3 = Math.max(-i72, Math.min(i3, i72));
                int i82 = this.mMaxFlingVelocity;
                i2 = Math.max(-i82, Math.min(i2, i82));
                this.mViewFlinger.m66680b(i3, i2);
                if (i != 0) {
                }
                f = i;
                f2 = i4;
                if (!dispatchNestedPreFling(f, f2)) {
                }
                return false;
            }
            i3 = 0;
            if (i2 != 0) {
            }
            i4 = i2;
            i2 = 0;
            if (i3 == 0) {
            }
            int i722 = this.mMaxFlingVelocity;
            i3 = Math.max(-i722, Math.min(i3, i722));
            int i822 = this.mMaxFlingVelocity;
            i2 = Math.max(-i822, Math.min(i2, i822));
            this.mViewFlinger.m66680b(i3, i2);
            if (i != 0) {
            }
            f = i;
            f2 = i4;
            if (!dispatchNestedPreFling(f, f2)) {
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View m66587h1 = this.mLayout.m66587h1(view, i);
        if (m66587h1 != null) {
            return m66587h1;
        }
        boolean z5 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z = true;
        } else {
            z = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            if (this.mLayout.mo51878F()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.mo51880E()) {
                if (this.mLayout.m66572t0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo66452a1(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo66452a1(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            requestChildOnScreen(view2, null);
            return view;
        } else if (!isPreferredNextFocus(view, view2, i)) {
            return super.focusSearch(view, i);
        } else {
            return view2;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            return abstractC11855p.mo51846X();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            return abstractC11855p.mo51842Y(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC11843h getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(AbstractC11834D abstractC11834D) {
        if (!abstractC11834D.hasAnyOfTheFlags(524) && abstractC11834D.isBound()) {
            return this.mAdapterHelper.m66362e(abstractC11834D.mPosition);
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            return abstractC11855p.m66600a0();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC11834D abstractC11834D) {
        return this.mAdapter.hasStableIds() ? abstractC11834D.getItemId() : abstractC11834D.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC11847k interfaceC11847k = this.mChildDrawingOrderCallback;
        if (interfaceC11847k == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return interfaceC11847k.m66659a(i, i2);
    }

    public long getChildItemId(View view) {
        AbstractC11834D childViewHolderInt;
        AbstractC11843h abstractC11843h = this.mAdapter;
        if (abstractC11843h == null || !abstractC11843h.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC11834D getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C11949s getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C11848l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC11849m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f55211d) {
            return layoutParams.f55210c;
        }
        if (this.mState.m66487e() && (layoutParams.m66675b() || layoutParams.m66673d())) {
            return layoutParams.f55210c;
        }
        Rect rect = layoutParams.f55210c;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f55211d = false;
        return rect;
    }

    public AbstractC11854o getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC11855p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC11861r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C11864u getRecycledViewPool() {
        return this.mRecycler.m66516i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m101206k();
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.m66351p()) {
            return false;
        }
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C11878a(new C11841f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C11916j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C36810Wf4.fastscroll_default_thickness), resources.getDimensionPixelSize(C36810Wf4.fastscroll_minimum_range), resources.getDimensionPixelOffset(C36810Wf4.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.mo66484A("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC11849m abstractC11849m = this.mItemAnimator;
        return abstractC11849m != null && abstractC11849m.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m101204m();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo51857P1(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int m66305j = this.mChildHelper.m66305j();
        for (int i = 0; i < m66305j; i++) {
            ((LayoutParams) this.mChildHelper.m66306i(i).getLayoutParams()).f55211d = true;
        }
        this.mRecycler.m66506s();
    }

    public void markKnownViewsInvalid() {
        int m66305j = this.mChildHelper.m66305j();
        for (int i = 0; i < m66305j; i++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m66505t();
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int m66308g = this.mChildHelper.m66308g();
        for (int i2 = 0; i2 < m66308g; i2++) {
            this.mChildHelper.m66309f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int m66308g = this.mChildHelper.m66308g();
        for (int i2 = 0; i2 < m66308g; i2++) {
            this.mChildHelper.m66309f(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int m66305j = this.mChildHelper.m66305j();
        for (int i3 = 0; i3 < m66305j; i3++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f55283g = true;
            }
        }
        this.mRecycler.m66503v(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m66305j = this.mChildHelper.m66305j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m66305j; i7++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f55283g = true;
            }
        }
        this.mRecycler.m66502w(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m66305j = this.mChildHelper.m66305j();
        for (int i4 = 0; i4 < m66305j; i4++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f55283g = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f55283g = true;
                }
            }
        }
        this.mRecycler.m66501x(i, i2, z);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mRecycler.m66499z();
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.m66612T(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC11921k> threadLocal = RunnableC11921k.f55497f;
            RunnableC11921k runnableC11921k = threadLocal.get();
            this.mGapWorker = runnableC11921k;
            if (runnableC11921k == null) {
                this.mGapWorker = new RunnableC11921k();
                Display m62449x = C38790bq6.m62449x(this);
                if (!isInEditMode() && m62449x != null) {
                    f = m62449x.getRefreshRate();
                }
                f = 60.0f;
                RunnableC11921k runnableC11921k2 = this.mGapWorker;
                runnableC11921k2.f55501d = 1.0E9f / f;
                threadLocal.set(runnableC11921k2);
            }
            this.mGapWorker.m66227a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC11921k runnableC11921k;
        super.onDetachedFromWindow();
        AbstractC11849m abstractC11849m = this.mItemAnimator;
        if (abstractC11849m != null) {
            abstractC11849m.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.m66610U(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m66102j();
        this.mRecycler.m66542A();
        C39813dY3.m44168c(this);
        if (ALLOW_THREAD_GAP_WORK && (runnableC11921k = this.mGapWorker) != null) {
            runnableC11921k.m66218j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.mLayout.mo51878F()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.mLayout.mo51880E()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == DECELERATION_RATE || f2 != DECELERATION_RATE) {
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                if (f == DECELERATION_RATE) {
                }
                nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo51878F()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == DECELERATION_RATE) {
                        }
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    } else if (this.mLayout.mo51880E()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == DECELERATION_RATE) {
                        }
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == DECELERATION_RATE) {
                }
                nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            return false;
        }
        boolean mo51880E = abstractC11855p.mo51880E();
        boolean mo51878F = this.mLayout.mo51878F();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x;
                            this.mInitialTouchX = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y;
                            this.mInitialTouchY = y;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i = x2 - this.mInitialTouchX;
                        int i2 = y2 - this.mInitialTouchY;
                        if (mo51880E && Math.abs(i) > this.mTouchSlop) {
                            this.mLastTouchX = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mo51878F && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = mo51880E;
            if (mo51878F) {
                i3 = (mo51880E ? 1 : 0) | 2;
            }
            startNestedScroll(i3, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C40152e66.m43277a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C40152e66.m43276b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC11855p.mo51873I0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m66577q1(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f55281e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.m66613S1(i, i2);
                this.mState.f55286j = true;
                dispatchLayoutStep2();
                this.mLayout.m66608V1(i, i2);
                if (this.mLayout.mo66602Y1()) {
                    this.mLayout.m66613S1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f55286j = true;
                    dispatchLayoutStep2();
                    this.mLayout.m66608V1(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.m66577q1(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C11872z c11872z = this.mState;
                if (c11872z.f55288l) {
                    c11872z.f55284h = true;
                } else {
                    this.mAdapterHelper.m66357j();
                    this.mState.f55284h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f55288l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC11843h abstractC11843h = this.mAdapter;
            if (abstractC11843h != null) {
                this.mState.f55282f = abstractC11843h.getItemCount();
            } else {
                this.mState.f55282f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.m66577q1(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f55284h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.m67617a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m66672b(savedState2);
        } else {
            AbstractC11855p abstractC11855p = this.mLayout;
            if (abstractC11855p != null) {
                savedState.f55213d = abstractC11855p.mo51784u1();
            } else {
                savedState.f55213d = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            return false;
        }
        boolean mo51880E = abstractC11855p.mo51880E();
        boolean mo51878F = this.mLayout.mo51878F();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x;
                            this.mInitialTouchX = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y;
                            this.mInitialTouchY = y;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i5 = this.mLastTouchX - x2;
                    int i6 = this.mLastTouchY - y2;
                    if (this.mScrollState != 1) {
                        if (mo51880E) {
                            if (i5 > 0) {
                                i5 = Math.max(0, i5 - this.mTouchSlop);
                            } else {
                                i5 = Math.min(0, i5 + this.mTouchSlop);
                            }
                            if (i5 != 0) {
                                z = true;
                                if (mo51878F) {
                                    if (i6 > 0) {
                                        i6 = Math.max(0, i6 - this.mTouchSlop);
                                    } else {
                                        i6 = Math.min(0, i6 + this.mTouchSlop);
                                    }
                                    if (i6 != 0) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z = false;
                        if (mo51878F) {
                        }
                        if (z) {
                        }
                    }
                    if (this.mScrollState == 1) {
                        int[] iArr3 = this.mReusableIntPair;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        int releaseHorizontalGlow = i5 - releaseHorizontalGlow(i5, motionEvent.getY());
                        int releaseVerticalGlow = i6 - releaseVerticalGlow(i6, motionEvent.getX());
                        if (mo51880E) {
                            i = releaseHorizontalGlow;
                        } else {
                            i = 0;
                        }
                        if (mo51878F) {
                            i2 = releaseVerticalGlow;
                        } else {
                            i2 = 0;
                        }
                        if (dispatchNestedPreScroll(i, i2, this.mReusableIntPair, this.mScrollOffset, 0)) {
                            int[] iArr4 = this.mReusableIntPair;
                            releaseHorizontalGlow -= iArr4[0];
                            releaseVerticalGlow -= iArr4[1];
                            int[] iArr5 = this.mNestedOffsets;
                            int i7 = iArr5[0];
                            int[] iArr6 = this.mScrollOffset;
                            iArr5[0] = i7 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i8 = releaseVerticalGlow;
                        int[] iArr7 = this.mScrollOffset;
                        this.mLastTouchX = x2 - iArr7[0];
                        this.mLastTouchY = y2 - iArr7[1];
                        if (mo51880E) {
                            i3 = releaseHorizontalGlow;
                        } else {
                            i3 = 0;
                        }
                        if (mo51878F) {
                            i4 = i8;
                        } else {
                            i4 = 0;
                        }
                        if (scrollByInternal(i3, i4, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC11921k runnableC11921k = this.mGapWorker;
                        if (runnableC11921k != null && (releaseHorizontalGlow != 0 || i8 != 0)) {
                            runnableC11921k.m66222f(this, releaseHorizontalGlow, i8);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                if (mo51880E) {
                    f = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
                } else {
                    f = 0.0f;
                }
                if (mo51878F) {
                    f2 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
                } else {
                    f2 = 0.0f;
                }
                if ((f == DECELERATION_RATE && f2 == DECELERATION_RATE) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                z2 = true;
            }
        } else {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            int i9 = mo51880E;
            if (mo51878F) {
                i9 = (mo51880E ? 1 : 0) | 2;
            }
            startNestedScroll(i9, 0);
        }
        if (!z2) {
            this.mVelocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C38790bq6.m62468n0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC11834D abstractC11834D, AbstractC11849m.C11852c c11852c) {
        abstractC11834D.setFlags(0, 8192);
        if (this.mState.f55285i && abstractC11834D.isUpdated() && !abstractC11834D.isRemoved() && !abstractC11834D.shouldIgnore()) {
            this.mViewInfoStore.m66109c(getChangedHolderKey(abstractC11834D), abstractC11834D);
        }
        this.mViewInfoStore.m66107e(abstractC11834D, c11852c);
    }

    public void removeAndRecycleViews() {
        AbstractC11849m abstractC11849m = this.mItemAnimator;
        if (abstractC11849m != null) {
            abstractC11849m.endAnimations();
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.m66646C1(this.mRecycler);
            this.mLayout.m66643D1(this.mRecycler);
        }
        this.mRecycler.m66522c();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m66297r = this.mChildHelper.m66297r(view);
        if (m66297r) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m66528O(childViewHolderInt);
            this.mRecycler.m66535H(childViewHolderInt);
        }
        stopInterceptRequestLayout(!m66297r);
        return m66297r;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC11834D childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC11854o abstractC11854o) {
        boolean z;
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            abstractC11855p.mo66484A("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC11854o);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC11860q interfaceC11860q) {
        List<InterfaceC11860q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC11860q);
    }

    public void removeOnItemTouchListener(InterfaceC11862s interfaceC11862s) {
        this.mOnItemTouchListeners.remove(interfaceC11862s);
        if (this.mInterceptingOnItemTouchListener == interfaceC11862s) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC11863t abstractC11863t) {
        List<AbstractC11863t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC11863t);
        }
    }

    public void removeRecyclerListener(InterfaceC11867w interfaceC11867w) {
        this.mRecyclerListeners.remove(interfaceC11867w);
    }

    public void repositionShadowingViews() {
        AbstractC11834D abstractC11834D;
        int m66308g = this.mChildHelper.m66308g();
        for (int i = 0; i < m66308g; i++) {
            View m66309f = this.mChildHelper.m66309f(i);
            AbstractC11834D childViewHolder = getChildViewHolder(m66309f);
            if (childViewHolder != null && (abstractC11834D = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC11834D.itemView;
                int left = m66309f.getLeft();
                int top = m66309f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.m66573s1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m66630J1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo45806e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int m66305j = this.mChildHelper.m66305j();
        for (int i = 0; i < m66305j; i++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean mo51880E = abstractC11855p.mo51880E();
            boolean mo51878F = this.mLayout.mo51878F();
            if (mo51880E || mo51878F) {
                if (!mo51880E) {
                    i = 0;
                }
                if (!mo51878F) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null, 0);
            }
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        if (i10 == 0 && i12 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !SV2.m85339e(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z || i5 != 0 || i4 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C40152e66.m43277a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i3 = this.mLayout.mo51860O1(i, this.mRecycler, this.mState);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.mLayout.mo51855Q1(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        C40152e66.m43276b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        abstractC11855p.mo51857P1(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C11949s c11949s) {
        this.mAccessibilityDelegate = c11949s;
        C38790bq6.m62452v0(this, c11949s);
    }

    public void setAdapter(AbstractC11843h abstractC11843h) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC11843h, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC11847k interfaceC11847k) {
        boolean z;
        if (interfaceC11847k == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC11847k;
        if (interfaceC11847k != null) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC11834D abstractC11834D, int i) {
        if (isComputingLayout()) {
            abstractC11834D.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC11834D);
            return false;
        }
        C38790bq6.m62539H0(abstractC11834D.itemView, i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C11848l c11848l) {
        HZ3.m103731g(c11848l);
        this.mEdgeEffectFactory = c11848l;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC11849m abstractC11849m) {
        AbstractC11849m abstractC11849m2 = this.mItemAnimator;
        if (abstractC11849m2 != null) {
            abstractC11849m2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = abstractC11849m;
        if (abstractC11849m != null) {
            abstractC11849m.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m66531L(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC11855p abstractC11855p) {
        if (abstractC11855p == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC11849m abstractC11849m = this.mItemAnimator;
            if (abstractC11849m != null) {
                abstractC11849m.endAnimations();
            }
            this.mLayout.m66646C1(this.mRecycler);
            this.mLayout.m66643D1(this.mRecycler);
            this.mRecycler.m66522c();
            if (this.mIsAttached) {
                this.mLayout.m66610U(this, this.mRecycler);
            }
            this.mLayout.m66605W1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m66522c();
        }
        this.mChildHelper.m66300o();
        this.mLayout = abstractC11855p;
        if (abstractC11855p != null) {
            if (abstractC11855p.f55230c == null) {
                abstractC11855p.m66605W1(this);
                if (this.mIsAttached) {
                    this.mLayout.m66612T(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC11855p + " is already attached to a RecyclerView:" + abstractC11855p.f55230c.exceptionLabel());
            }
        }
        this.mRecycler.m66527P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m101203n(z);
    }

    public void setOnFlingListener(AbstractC11861r abstractC11861r) {
        this.mOnFlingListener = abstractC11861r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC11863t abstractC11863t) {
        this.mScrollListener = abstractC11863t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C11864u c11864u) {
        this.mRecycler.m66533J(c11864u);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC11867w interfaceC11867w) {
        this.mRecyclerListener = interfaceC11867w;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC11832B abstractC11832B) {
        this.mRecycler.m66532K(abstractC11832B);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C5459N1.m94458a(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC11855p.mo51837a2(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m101201p(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m101199r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(AbstractC11843h abstractC11843h, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC11843h, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int m66305j = this.mChildHelper.m66305j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m66305j; i5++) {
            View m66306i = this.mChildHelper.m66306i(i5);
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(m66306i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) m66306i.getLayoutParams()).f55211d = true;
            }
        }
        this.mRecycler.m66525R(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C47590qf4.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m101213d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m101210g(i, i2, i3, i4, iArr, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC11834D findViewHolderForPosition(int i, boolean z) {
        int m66305j = this.mChildHelper.m66305j();
        AbstractC11834D abstractC11834D = null;
        for (int i2 = 0; i2 < m66305j; i2++) {
            AbstractC11834D childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m66306i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                    if (this.mChildHelper.m66301n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC11834D = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i) {
                        continue;
                    }
                    if (this.mChildHelper.m66301n(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return abstractC11834D;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m101205l(i);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m101200q(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m101198s(i);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11835a();

        /* renamed from: d */
        public Parcelable f55213d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        public class C11835a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f55213d = parcel.readParcelable(classLoader == null ? AbstractC11855p.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        public void m66672b(SavedState savedState) {
            this.f55213d = savedState.f55213d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f55213d, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C11868x();
        this.mRecycler = new C11866v();
        this.mViewInfoStore = new C11959x();
        this.mUpdateChildViewsRunnable = new RunnableC11836a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C11894g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC11833C();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC11921k.C11923b() : null;
        this.mState = new C11872z();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C11853n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC11837b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C11839d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C34571Mq6.m94687b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C34571Mq6.m94684e(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C38790bq6.m62552B(this) == 0) {
            C38790bq6.m62539H0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C11949s(this));
        int[] iArr = C42323hm4.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C42323hm4.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C42323hm4.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C42323hm4.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(C42323hm4.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C42323hm4.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C42323hm4.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C42323hm4.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C42323hm4.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C38790bq6.m62456t0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        C39813dY3.m44163h(this, true);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m101212e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        public AbstractC11834D f55209b;

        /* renamed from: c */
        public final Rect f55210c;

        /* renamed from: d */
        public boolean f55211d;

        /* renamed from: e */
        public boolean f55212e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f55210c = new Rect();
            this.f55211d = true;
            this.f55212e = false;
        }

        /* renamed from: a */
        public int m66676a() {
            return this.f55209b.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m66675b() {
            return this.f55209b.isUpdated();
        }

        /* renamed from: c */
        public boolean m66674c() {
            return this.f55209b.isRemoved();
        }

        /* renamed from: d */
        public boolean m66673d() {
            return this.f55209b.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f55210c = new Rect();
            this.f55211d = true;
            this.f55212e = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f55210c = new Rect();
            this.f55211d = true;
            this.f55212e = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f55210c = new Rect();
            this.f55211d = true;
            this.f55212e = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f55210c = new Rect();
            this.f55211d = true;
            this.f55212e = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p != null) {
            return abstractC11855p.mo66454Z(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC11855p abstractC11855p = this.mLayout;
        if (abstractC11855p == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!abstractC11855p.mo51880E()) {
                i = 0;
            }
            if (!this.mLayout.mo51878F()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    int i4 = i != 0 ? 1 : 0;
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                }
                this.mViewFlinger.m66677e(i, i2, i3, interpolator);
                return;
            }
            scrollBy(i, i2);
        }
    }

    public void addItemDecoration(AbstractC11854o abstractC11854o) {
        addItemDecoration(abstractC11854o, -1);
    }
}
