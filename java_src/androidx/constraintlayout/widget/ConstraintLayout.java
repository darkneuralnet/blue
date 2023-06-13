package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;
import p000.C37211Xy0;
import p000.C43042iz0;
import p000.C5928OE;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static C11522c sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected C38281az0 mConstraintLayoutSpec;
    private C11515b mConstraintSet;
    private int mConstraintSetId;
    private AbstractC45414mz0 mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C43635jz0 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    C11511b mMeasurer;
    private C38572bU2 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C43042iz0> mTempMapIdToWidget;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11510a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54021a;

        static {
            int[] iArr = new int[C43042iz0.EnumC24677b.values().length];
            f54021a = iArr;
            try {
                iArr[C43042iz0.EnumC24677b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54021a[C43042iz0.EnumC24677b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54021a[C43042iz0.EnumC24677b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54021a[C43042iz0.EnumC24677b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes.dex */
    public class C11511b implements C5928OE.InterfaceC5930b {

        /* renamed from: a */
        public ConstraintLayout f54022a;

        /* renamed from: b */
        public int f54023b;

        /* renamed from: c */
        public int f54024c;

        /* renamed from: d */
        public int f54025d;

        /* renamed from: e */
        public int f54026e;

        /* renamed from: f */
        public int f54027f;

        /* renamed from: g */
        public int f54028g;

        public C11511b(ConstraintLayout constraintLayout) {
            this.f54022a = constraintLayout;
        }

        @Override // p000.C5928OE.InterfaceC5930b
        /* renamed from: a */
        public final void mo67878a() {
            int childCount = this.f54022a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f54022a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).m67867c(this.f54022a);
                }
            }
            int size = this.f54022a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f54022a.mConstraintHelpers.get(i2)).m67884x(this.f54022a);
                }
            }
        }

        @Override // p000.C5928OE.InterfaceC5930b
        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo67877b(C43042iz0 c43042iz0, C5928OE.C5929a c5929a) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int baseline;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            if (c43042iz0 == null) {
                return;
            }
            if (c43042iz0.m31393X() == 8 && !c43042iz0.m31358l0()) {
                c5929a.f26243e = 0;
                c5929a.f26244f = 0;
                c5929a.f26245g = 0;
            } else if (c43042iz0.m31414M() == null) {
            } else {
                C43042iz0.EnumC24677b enumC24677b = c5929a.f26239a;
                C43042iz0.EnumC24677b enumC24677b2 = c5929a.f26240b;
                int i6 = c5929a.f26241c;
                int i7 = c5929a.f26242d;
                int i8 = this.f54023b + this.f54024c;
                int i9 = this.f54025d;
                View view = (View) c43042iz0.m31337u();
                int[] iArr = C11510a.f54021a;
                int i10 = iArr[enumC24677b.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f54027f, i9, -2);
                                if (c43042iz0.f91927w == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int i11 = c5929a.f26248j;
                                if (i11 == C5928OE.C5929a.f26237l || i11 == C5928OE.C5929a.f26238m) {
                                    if (view.getMeasuredHeight() == c43042iz0.m31328z()) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (c5929a.f26248j != C5928OE.C5929a.f26238m && z13 && ((!z13 || !z14) && !(view instanceof Placeholder) && !c43042iz0.mo7201p0())) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z15) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c43042iz0.m31391Y(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f54027f, i9 + c43042iz0.m31432D(), -1);
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f54027f, i9, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                }
                int i12 = iArr[enumC24677b2.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f54028g, i8, -2);
                                if (c43042iz0.f91929x == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i13 = c5929a.f26248j;
                                if (i13 == C5928OE.C5929a.f26237l || i13 == C5928OE.C5929a.f26238m) {
                                    if (view.getMeasuredWidth() == c43042iz0.m31391Y()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (c5929a.f26248j != C5928OE.C5929a.f26238m && z10 && ((!z10 || !z11) && !(view instanceof Placeholder) && !c43042iz0.mo7199q0())) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c43042iz0.m31328z(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f54028g, i8 + c43042iz0.m31395W(), -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f54028g, i8, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                C43635jz0 c43635jz0 = (C43635jz0) c43042iz0.m31414M();
                if (c43635jz0 != null && C42442hy3.m35434b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == c43042iz0.m31391Y() && view.getMeasuredWidth() < c43635jz0.m31391Y() && view.getMeasuredHeight() == c43042iz0.m31328z() && view.getMeasuredHeight() < c43635jz0.m31328z() && view.getBaseline() == c43042iz0.m31345r() && !c43042iz0.m31350o0()) {
                    if (m67875d(c43042iz0.m31430E(), makeMeasureSpec, c43042iz0.m31391Y()) && m67875d(c43042iz0.m31428F(), makeMeasureSpec2, c43042iz0.m31328z())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        c5929a.f26243e = c43042iz0.m31391Y();
                        c5929a.f26244f = c43042iz0.m31328z();
                        c5929a.f26245g = c43042iz0.m31345r();
                        return;
                    }
                }
                C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (enumC24677b == enumC24677b3) {
                    z = true;
                } else {
                    z = false;
                }
                if (enumC24677b2 == enumC24677b3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C43042iz0.EnumC24677b enumC24677b4 = C43042iz0.EnumC24677b.MATCH_PARENT;
                if (enumC24677b2 != enumC24677b4 && enumC24677b2 != C43042iz0.EnumC24677b.FIXED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (enumC24677b != enumC24677b4 && enumC24677b != C43042iz0.EnumC24677b.FIXED) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && c43042iz0.f91894f0 > 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z2 && c43042iz0.f91894f0 > 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (view == null) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int i14 = c5929a.f26248j;
                if (i14 != C5928OE.C5929a.f26237l && i14 != C5928OE.C5929a.f26238m && z && c43042iz0.f91927w == 0 && z2 && c43042iz0.f91929x == 0) {
                    i5 = -1;
                    i3 = 0;
                    baseline = 0;
                    i = 0;
                } else {
                    if ((view instanceof VirtualLayout) && (c43042iz0 instanceof C53077zu6)) {
                        ((VirtualLayout) view).mo67864C((C53077zu6) c43042iz0, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    c43042iz0.m31388Z0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i15 = c43042iz0.f91933z;
                    if (i15 > 0) {
                        i = Math.max(i15, measuredWidth);
                    } else {
                        i = measuredWidth;
                    }
                    int i16 = c43042iz0.f91837A;
                    if (i16 > 0) {
                        i = Math.min(i16, i);
                    }
                    int i17 = c43042iz0.f91841C;
                    if (i17 > 0) {
                        i3 = Math.max(i17, measuredHeight);
                        i2 = makeMeasureSpec;
                    } else {
                        i2 = makeMeasureSpec;
                        i3 = measuredHeight;
                    }
                    int i18 = c43042iz0.f91843D;
                    if (i18 > 0) {
                        i3 = Math.min(i18, i3);
                    }
                    if (!C42442hy3.m35434b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                        if (z5 && z3) {
                            i = (int) ((i3 * c43042iz0.f91894f0) + 0.5f);
                        } else if (z6 && z4) {
                            i3 = (int) ((i / c43042iz0.f91894f0) + 0.5f);
                        }
                    }
                    if (measuredWidth != i || measuredHeight != i3) {
                        if (measuredWidth != i) {
                            i4 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        } else {
                            i4 = i2;
                        }
                        if (measuredHeight != i3) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        }
                        view.measure(i4, makeMeasureSpec2);
                        c43042iz0.m31388Z0(i4, makeMeasureSpec2);
                        i = view.getMeasuredWidth();
                        i3 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i5 = -1;
                }
                if (baseline != i5) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i == c5929a.f26241c && i3 == c5929a.f26242d) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                c5929a.f26247i = z8;
                if (layoutParams.f53984g0) {
                    z7 = true;
                }
                if (z7 && baseline != -1 && c43042iz0.m31345r() != baseline) {
                    c5929a.f26247i = true;
                }
                c5929a.f26243e = i;
                c5929a.f26244f = i3;
                c5929a.f26246h = z7;
                c5929a.f26245g = baseline;
            }
        }

        /* renamed from: c */
        public void m67876c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f54023b = i3;
            this.f54024c = i4;
            this.f54025d = i5;
            this.f54026e = i6;
            this.f54027f = i;
            this.f54028g = i2;
        }

        /* renamed from: d */
        public final boolean m67875d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C43635jz0();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C11511b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C11522c getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new C11522c();
        }
        return sSharedValues;
    }

    private final C43042iz0 getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f54014v0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m31427F0(this);
        this.mLayoutWidget.m29534a2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C39341cm4.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C39341cm4.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C39341cm4.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C39341cm4.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C11515b c11515b = new C11515b();
                        this.mConstraintSet = c11515b;
                        c11515b.m67845E(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m29533b2(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C43042iz0 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo29527v0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).m31425G0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).m67872c();
                }
            }
        }
        C11515b c11515b = this.mConstraintSet;
        if (c11515b != null) {
            c11515b.m67817k(this, true);
        }
        this.mLayoutWidget.m61755y1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).m67902A(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).m67866d(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C43042iz0 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.m61758c(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(C43042iz0 c43042iz0, LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray, int i, C37211Xy0.EnumC9561b enumC9561b) {
        View view = this.mChildrenByIds.get(i);
        C43042iz0 c43042iz02 = sparseArray.get(i);
        if (c43042iz02 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f53984g0 = true;
            C37211Xy0.EnumC9561b enumC9561b2 = C37211Xy0.EnumC9561b.BASELINE;
            if (enumC9561b == enumC9561b2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f53984g0 = true;
                layoutParams2.f54014v0.m31409O0(true);
            }
            c43042iz0.mo7200q(enumC9561b2).m76001b(c43042iz02.mo7200q(enumC9561b), layoutParams.f53948D, layoutParams.f53947C, true);
            c43042iz0.m31409O0(true);
            c43042iz0.mo7200q(C37211Xy0.EnumC9561b.TOP).m75986q();
            c43042iz0.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).m75986q();
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, C43042iz0 c43042iz0, LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray) {
        C43042iz0 c43042iz02;
        C43042iz0 c43042iz03;
        C43042iz0 c43042iz04;
        C43042iz0 c43042iz05;
        int i;
        layoutParams.m67879c();
        layoutParams.f54016w0 = false;
        c43042iz0.m31352n1(view.getVisibility());
        if (layoutParams.f53990j0) {
            c43042iz0.m31392X0(true);
            c43042iz0.m31352n1(8);
        }
        c43042iz0.m31427F0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).mo67887t(c43042iz0, this.mLayoutWidget.m29540U1());
        }
        if (layoutParams.f53986h0) {
            C50895wE1 c50895wE1 = (C50895wE1) c43042iz0;
            int i2 = layoutParams.f54008s0;
            int i3 = layoutParams.f54010t0;
            float f = layoutParams.f54012u0;
            if (f != -1.0f) {
                c50895wE1.m7206D1(f);
                return;
            } else if (i2 != -1) {
                c50895wE1.m7208B1(i2);
                return;
            } else if (i3 != -1) {
                c50895wE1.m7207C1(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = layoutParams.f53994l0;
        int i5 = layoutParams.f53996m0;
        int i6 = layoutParams.f53998n0;
        int i7 = layoutParams.f54000o0;
        int i8 = layoutParams.f54002p0;
        int i9 = layoutParams.f54004q0;
        float f2 = layoutParams.f54006r0;
        int i10 = layoutParams.f54001p;
        if (i10 != -1) {
            C43042iz0 c43042iz06 = sparseArray.get(i10);
            if (c43042iz06 != null) {
                c43042iz0.m31356m(c43042iz06, layoutParams.f54005r, layoutParams.f54003q);
            }
        } else {
            if (i4 != -1) {
                C43042iz0 c43042iz07 = sparseArray.get(i4);
                if (c43042iz07 != null) {
                    C37211Xy0.EnumC9561b enumC9561b = C37211Xy0.EnumC9561b.LEFT;
                    c43042iz0.m31372g0(enumC9561b, c43042iz07, enumC9561b, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (c43042iz02 = sparseArray.get(i5)) != null) {
                c43042iz0.m31372g0(C37211Xy0.EnumC9561b.LEFT, c43042iz02, C37211Xy0.EnumC9561b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                C43042iz0 c43042iz08 = sparseArray.get(i6);
                if (c43042iz08 != null) {
                    c43042iz0.m31372g0(C37211Xy0.EnumC9561b.RIGHT, c43042iz08, C37211Xy0.EnumC9561b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (c43042iz03 = sparseArray.get(i7)) != null) {
                C37211Xy0.EnumC9561b enumC9561b2 = C37211Xy0.EnumC9561b.RIGHT;
                c43042iz0.m31372g0(enumC9561b2, c43042iz03, enumC9561b2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i11 = layoutParams.f53987i;
            if (i11 != -1) {
                C43042iz0 c43042iz09 = sparseArray.get(i11);
                if (c43042iz09 != null) {
                    C37211Xy0.EnumC9561b enumC9561b3 = C37211Xy0.EnumC9561b.TOP;
                    c43042iz0.m31372g0(enumC9561b3, c43042iz09, enumC9561b3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f54017x);
                }
            } else {
                int i12 = layoutParams.f53989j;
                if (i12 != -1 && (c43042iz04 = sparseArray.get(i12)) != null) {
                    c43042iz0.m31372g0(C37211Xy0.EnumC9561b.TOP, c43042iz04, C37211Xy0.EnumC9561b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f54017x);
                }
            }
            int i13 = layoutParams.f53991k;
            if (i13 != -1) {
                C43042iz0 c43042iz010 = sparseArray.get(i13);
                if (c43042iz010 != null) {
                    c43042iz0.m31372g0(C37211Xy0.EnumC9561b.BOTTOM, c43042iz010, C37211Xy0.EnumC9561b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f54019z);
                }
            } else {
                int i14 = layoutParams.f53993l;
                if (i14 != -1 && (c43042iz05 = sparseArray.get(i14)) != null) {
                    C37211Xy0.EnumC9561b enumC9561b4 = C37211Xy0.EnumC9561b.BOTTOM;
                    c43042iz0.m31372g0(enumC9561b4, c43042iz05, enumC9561b4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f54019z);
                }
            }
            int i15 = layoutParams.f53995m;
            if (i15 != -1) {
                setWidgetBaseline(c43042iz0, layoutParams, sparseArray, i15, C37211Xy0.EnumC9561b.BASELINE);
            } else {
                int i16 = layoutParams.f53997n;
                if (i16 != -1) {
                    setWidgetBaseline(c43042iz0, layoutParams, sparseArray, i16, C37211Xy0.EnumC9561b.TOP);
                } else {
                    int i17 = layoutParams.f53999o;
                    if (i17 != -1) {
                        setWidgetBaseline(c43042iz0, layoutParams, sparseArray, i17, C37211Xy0.EnumC9561b.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                c43042iz0.m31406Q0(f2);
            }
            float f3 = layoutParams.f53952H;
            if (f3 >= 0.0f) {
                c43042iz0.m31369h1(f3);
            }
        }
        if (z && ((i = layoutParams.f53968X) != -1 || layoutParams.f53969Y != -1)) {
            c43042iz0.m31373f1(i, layoutParams.f53969Y);
        }
        if (!layoutParams.f53980e0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.f53972a0) {
                    c43042iz0.m31400T0(C43042iz0.EnumC24677b.MATCH_CONSTRAINT);
                } else {
                    c43042iz0.m31400T0(C43042iz0.EnumC24677b.MATCH_PARENT);
                }
                c43042iz0.mo7200q(C37211Xy0.EnumC9561b.LEFT).f44309g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                c43042iz0.mo7200q(C37211Xy0.EnumC9561b.RIGHT).f44309g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                c43042iz0.m31400T0(C43042iz0.EnumC24677b.MATCH_CONSTRAINT);
                c43042iz0.m31349o1(0);
            }
        } else {
            c43042iz0.m31400T0(C43042iz0.EnumC24677b.FIXED);
            c43042iz0.m31349o1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                c43042iz0.m31400T0(C43042iz0.EnumC24677b.WRAP_CONTENT);
            }
        }
        if (!layoutParams.f53982f0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.f53974b0) {
                    c43042iz0.m31360k1(C43042iz0.EnumC24677b.MATCH_CONSTRAINT);
                } else {
                    c43042iz0.m31360k1(C43042iz0.EnumC24677b.MATCH_PARENT);
                }
                c43042iz0.mo7200q(C37211Xy0.EnumC9561b.TOP).f44309g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                c43042iz0.mo7200q(C37211Xy0.EnumC9561b.BOTTOM).f44309g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                c43042iz0.m31360k1(C43042iz0.EnumC24677b.MATCH_CONSTRAINT);
                c43042iz0.m31407P0(0);
            }
        } else {
            c43042iz0.m31360k1(C43042iz0.EnumC24677b.FIXED);
            c43042iz0.m31407P0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                c43042iz0.m31360k1(C43042iz0.EnumC24677b.WRAP_CONTENT);
            }
        }
        c43042iz0.m31423H0(layoutParams.f53953I);
        c43042iz0.m31396V0(layoutParams.f53956L);
        c43042iz0.m31354m1(layoutParams.f53957M);
        c43042iz0.m31404R0(layoutParams.f53958N);
        c43042iz0.m31366i1(layoutParams.f53959O);
        c43042iz0.m31347p1(layoutParams.f53978d0);
        c43042iz0.m31398U0(layoutParams.f53960P, layoutParams.f53962R, layoutParams.f53964T, layoutParams.f53966V);
        c43042iz0.m31357l1(layoutParams.f53961Q, layoutParams.f53963S, layoutParams.f53965U, layoutParams.f53967W);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo67883y(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C38572bU2 c38572bU2) {
        this.mMetrics = c38572bU2;
        this.mLayoutWidget.m29549M1(c38572bU2);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m29547O1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f91911o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f91911o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f91911o = "parent";
            }
        }
        if (this.mLayoutWidget.m31335v() == null) {
            C43635jz0 c43635jz0 = this.mLayoutWidget;
            c43635jz0.m31425G0(c43635jz0.f91911o);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.m31335v());
        }
        Iterator<C43042iz0> it = this.mLayoutWidget.m61757v1().iterator();
        while (it.hasNext()) {
            C43042iz0 next = it.next();
            View view = (View) next.m31337u();
            if (view != null) {
                if (next.f91911o == null && (id = view.getId()) != -1) {
                    next.f91911o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.m31335v() == null) {
                    next.m31425G0(next.f91911o);
                    Log.v(TAG, " setDebugName " + next.m31335v());
                }
            }
        }
        this.mLayoutWidget.mo29545Q(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C43042iz0 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f54014v0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams) view.getLayoutParams()).f54014v0;
            }
            return null;
        }
        return null;
    }

    public boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C38281az0(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View m67869a;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C43042iz0 c43042iz0 = layoutParams.f54014v0;
            if ((childAt.getVisibility() != 8 || layoutParams.f53986h0 || layoutParams.f53988i0 || layoutParams.f53992k0 || isInEditMode) && !layoutParams.f53990j0) {
                int m31389Z = c43042iz0.m31389Z();
                int m31387a0 = c43042iz0.m31387a0();
                int m31391Y = c43042iz0.m31391Y() + m31389Z;
                int m31328z = c43042iz0.m31328z() + m31387a0;
                childAt.layout(m31389Z, m31387a0, m31391Y, m31328z);
                if ((childAt instanceof Placeholder) && (m67869a = ((Placeholder) childAt).m67869a()) != null) {
                    m67869a.setVisibility(0);
                    m67869a.layout(m31389Z, m31387a0, m31391Y, m31328z);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo67870w(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m29531d2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.m29529f2();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m31391Y(), this.mLayoutWidget.m31328z(), this.mLayoutWidget.m29539V1(), this.mLayoutWidget.m29541T1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C43042iz0 viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C50895wE1)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C50895wE1 c50895wE1 = new C50895wE1();
            layoutParams.f54014v0 = c50895wE1;
            layoutParams.f53986h0 = true;
            c50895wE1.m7205E1(layoutParams.f53970Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m67901B();
            ((LayoutParams) view.getLayoutParams()).f53988i0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m61756x1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C38281az0(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C11511b c11511b = this.mMeasurer;
        int i5 = c11511b.f54026e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + c11511b.f54025d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(C43635jz0 c43635jz0, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.m67876c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(c43635jz0, mode, i6, mode2, i7);
        c43635jz0.m29538W1(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(C11515b c11515b) {
        this.mConstraintSet = c11515b;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC45414mz0 abstractC45414mz0) {
        this.mConstraintsChangedListener = abstractC45414mz0;
        C38281az0 c38281az0 = this.mConstraintLayoutSpec;
        if (c38281az0 != null) {
            c38281az0.m65183c(abstractC45414mz0);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m29533b2(i);
    }

    public void setSelfDimensionBehaviour(C43635jz0 c43635jz0, int i, int i2, int i3, int i4) {
        C43042iz0.EnumC24677b enumC24677b;
        C11511b c11511b = this.mMeasurer;
        int i5 = c11511b.f54026e;
        int i6 = c11511b.f54025d;
        C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    enumC24677b = enumC24677b2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.mMaxWidth - i6, i2);
                    enumC24677b = enumC24677b2;
                }
            } else {
                enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
                i2 = 0;
            }
        } else {
            enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.mMaxHeight - i5, i4);
                }
                i4 = 0;
            } else {
                enumC24677b2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                i4 = 0;
            }
        } else {
            enumC24677b2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != c43635jz0.m31391Y() || i4 != c43635jz0.m31328z()) {
            c43635jz0.m29542S1();
        }
        c43635jz0.m31346q1(0);
        c43635jz0.m31343r1(0);
        c43635jz0.m31384b1(this.mMaxWidth - i6);
        c43635jz0.m31386a1(this.mMaxHeight - i5);
        c43635jz0.m31376e1(0);
        c43635jz0.m31379d1(0);
        c43635jz0.m31400T0(enumC24677b);
        c43635jz0.m31349o1(i2);
        c43635jz0.m31360k1(enumC24677b2);
        c43635jz0.m31407P0(i4);
        c43635jz0.m31376e1(this.mMinWidth - i6);
        c43635jz0.m31379d1(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C38281az0 c38281az0 = this.mConstraintLayoutSpec;
        if (c38281az0 != null) {
            c38281az0.m65182d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C43635jz0();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C11511b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C43635jz0();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C11511b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C43635jz0();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C11511b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f53945A;

        /* renamed from: B */
        public int f53946B;

        /* renamed from: C */
        public int f53947C;

        /* renamed from: D */
        public int f53948D;

        /* renamed from: E */
        public boolean f53949E;

        /* renamed from: F */
        public boolean f53950F;

        /* renamed from: G */
        public float f53951G;

        /* renamed from: H */
        public float f53952H;

        /* renamed from: I */
        public String f53953I;

        /* renamed from: J */
        public float f53954J;

        /* renamed from: K */
        public int f53955K;

        /* renamed from: L */
        public float f53956L;

        /* renamed from: M */
        public float f53957M;

        /* renamed from: N */
        public int f53958N;

        /* renamed from: O */
        public int f53959O;

        /* renamed from: P */
        public int f53960P;

        /* renamed from: Q */
        public int f53961Q;

        /* renamed from: R */
        public int f53962R;

        /* renamed from: S */
        public int f53963S;

        /* renamed from: T */
        public int f53964T;

        /* renamed from: U */
        public int f53965U;

        /* renamed from: V */
        public float f53966V;

        /* renamed from: W */
        public float f53967W;

        /* renamed from: X */
        public int f53968X;

        /* renamed from: Y */
        public int f53969Y;

        /* renamed from: Z */
        public int f53970Z;

        /* renamed from: a */
        public int f53971a;

        /* renamed from: a0 */
        public boolean f53972a0;

        /* renamed from: b */
        public int f53973b;

        /* renamed from: b0 */
        public boolean f53974b0;

        /* renamed from: c */
        public float f53975c;

        /* renamed from: c0 */
        public String f53976c0;

        /* renamed from: d */
        public boolean f53977d;

        /* renamed from: d0 */
        public int f53978d0;

        /* renamed from: e */
        public int f53979e;

        /* renamed from: e0 */
        public boolean f53980e0;

        /* renamed from: f */
        public int f53981f;

        /* renamed from: f0 */
        public boolean f53982f0;

        /* renamed from: g */
        public int f53983g;

        /* renamed from: g0 */
        public boolean f53984g0;

        /* renamed from: h */
        public int f53985h;

        /* renamed from: h0 */
        public boolean f53986h0;

        /* renamed from: i */
        public int f53987i;

        /* renamed from: i0 */
        public boolean f53988i0;

        /* renamed from: j */
        public int f53989j;

        /* renamed from: j0 */
        public boolean f53990j0;

        /* renamed from: k */
        public int f53991k;

        /* renamed from: k0 */
        public boolean f53992k0;

        /* renamed from: l */
        public int f53993l;

        /* renamed from: l0 */
        public int f53994l0;

        /* renamed from: m */
        public int f53995m;

        /* renamed from: m0 */
        public int f53996m0;

        /* renamed from: n */
        public int f53997n;

        /* renamed from: n0 */
        public int f53998n0;

        /* renamed from: o */
        public int f53999o;

        /* renamed from: o0 */
        public int f54000o0;

        /* renamed from: p */
        public int f54001p;

        /* renamed from: p0 */
        public int f54002p0;

        /* renamed from: q */
        public int f54003q;

        /* renamed from: q0 */
        public int f54004q0;

        /* renamed from: r */
        public float f54005r;

        /* renamed from: r0 */
        public float f54006r0;

        /* renamed from: s */
        public int f54007s;

        /* renamed from: s0 */
        public int f54008s0;

        /* renamed from: t */
        public int f54009t;

        /* renamed from: t0 */
        public int f54010t0;

        /* renamed from: u */
        public int f54011u;

        /* renamed from: u0 */
        public float f54012u0;

        /* renamed from: v */
        public int f54013v;

        /* renamed from: v0 */
        public C43042iz0 f54014v0;

        /* renamed from: w */
        public int f54015w;

        /* renamed from: w0 */
        public boolean f54016w0;

        /* renamed from: x */
        public int f54017x;

        /* renamed from: y */
        public int f54018y;

        /* renamed from: z */
        public int f54019z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        /* loaded from: classes.dex */
        public static class C11509a {

            /* renamed from: a */
            public static final SparseIntArray f54020a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f54020a = sparseIntArray;
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C39341cm4.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }

            private C11509a() {
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53971a = -1;
            this.f53973b = -1;
            this.f53975c = -1.0f;
            this.f53977d = true;
            this.f53979e = -1;
            this.f53981f = -1;
            this.f53983g = -1;
            this.f53985h = -1;
            this.f53987i = -1;
            this.f53989j = -1;
            this.f53991k = -1;
            this.f53993l = -1;
            this.f53995m = -1;
            this.f53997n = -1;
            this.f53999o = -1;
            this.f54001p = -1;
            this.f54003q = 0;
            this.f54005r = 0.0f;
            this.f54007s = -1;
            this.f54009t = -1;
            this.f54011u = -1;
            this.f54013v = -1;
            this.f54015w = Integer.MIN_VALUE;
            this.f54017x = Integer.MIN_VALUE;
            this.f54018y = Integer.MIN_VALUE;
            this.f54019z = Integer.MIN_VALUE;
            this.f53945A = Integer.MIN_VALUE;
            this.f53946B = Integer.MIN_VALUE;
            this.f53947C = Integer.MIN_VALUE;
            this.f53948D = 0;
            this.f53949E = true;
            this.f53950F = true;
            this.f53951G = 0.5f;
            this.f53952H = 0.5f;
            this.f53953I = null;
            this.f53954J = 0.0f;
            this.f53955K = 1;
            this.f53956L = -1.0f;
            this.f53957M = -1.0f;
            this.f53958N = 0;
            this.f53959O = 0;
            this.f53960P = 0;
            this.f53961Q = 0;
            this.f53962R = 0;
            this.f53963S = 0;
            this.f53964T = 0;
            this.f53965U = 0;
            this.f53966V = 1.0f;
            this.f53967W = 1.0f;
            this.f53968X = -1;
            this.f53969Y = -1;
            this.f53970Z = -1;
            this.f53972a0 = false;
            this.f53974b0 = false;
            this.f53976c0 = null;
            this.f53978d0 = 0;
            this.f53980e0 = true;
            this.f53982f0 = true;
            this.f53984g0 = false;
            this.f53986h0 = false;
            this.f53988i0 = false;
            this.f53990j0 = false;
            this.f53992k0 = false;
            this.f53994l0 = -1;
            this.f53996m0 = -1;
            this.f53998n0 = -1;
            this.f54000o0 = -1;
            this.f54002p0 = Integer.MIN_VALUE;
            this.f54004q0 = Integer.MIN_VALUE;
            this.f54006r0 = 0.5f;
            this.f54014v0 = new C43042iz0();
            this.f54016w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C11509a.f54020a.get(index);
                switch (i2) {
                    case 1:
                        this.f53970Z = obtainStyledAttributes.getInt(index, this.f53970Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f54001p);
                        this.f54001p = resourceId;
                        if (resourceId == -1) {
                            this.f54001p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f54003q = obtainStyledAttributes.getDimensionPixelSize(index, this.f54003q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f54005r) % 360.0f;
                        this.f54005r = f;
                        if (f < 0.0f) {
                            this.f54005r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f53971a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53971a);
                        break;
                    case 6:
                        this.f53973b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53973b);
                        break;
                    case 7:
                        this.f53975c = obtainStyledAttributes.getFloat(index, this.f53975c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f53979e);
                        this.f53979e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f53979e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f53981f);
                        this.f53981f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f53981f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f53983g);
                        this.f53983g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f53983g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f53985h);
                        this.f53985h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f53985h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f53987i);
                        this.f53987i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f53987i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f53989j);
                        this.f53989j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f53989j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f53991k);
                        this.f53991k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f53991k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f53993l);
                        this.f53993l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f53993l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f53995m);
                        this.f53995m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f53995m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f54007s);
                        this.f54007s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f54007s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f54009t);
                        this.f54009t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f54009t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f54011u);
                        this.f54011u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f54011u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f54013v);
                        this.f54013v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f54013v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f54015w = obtainStyledAttributes.getDimensionPixelSize(index, this.f54015w);
                        break;
                    case 22:
                        this.f54017x = obtainStyledAttributes.getDimensionPixelSize(index, this.f54017x);
                        break;
                    case 23:
                        this.f54018y = obtainStyledAttributes.getDimensionPixelSize(index, this.f54018y);
                        break;
                    case 24:
                        this.f54019z = obtainStyledAttributes.getDimensionPixelSize(index, this.f54019z);
                        break;
                    case 25:
                        this.f53945A = obtainStyledAttributes.getDimensionPixelSize(index, this.f53945A);
                        break;
                    case 26:
                        this.f53946B = obtainStyledAttributes.getDimensionPixelSize(index, this.f53946B);
                        break;
                    case 27:
                        this.f53972a0 = obtainStyledAttributes.getBoolean(index, this.f53972a0);
                        break;
                    case 28:
                        this.f53974b0 = obtainStyledAttributes.getBoolean(index, this.f53974b0);
                        break;
                    case 29:
                        this.f53951G = obtainStyledAttributes.getFloat(index, this.f53951G);
                        break;
                    case 30:
                        this.f53952H = obtainStyledAttributes.getFloat(index, this.f53952H);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.f53960P = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f53961Q = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f53962R = obtainStyledAttributes.getDimensionPixelSize(index, this.f53962R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f53962R) == -2) {
                                this.f53962R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f53964T = obtainStyledAttributes.getDimensionPixelSize(index, this.f53964T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f53964T) == -2) {
                                this.f53964T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f53966V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f53966V));
                        this.f53960P = 2;
                        break;
                    case 36:
                        try {
                            this.f53963S = obtainStyledAttributes.getDimensionPixelSize(index, this.f53963S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f53963S) == -2) {
                                this.f53963S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f53965U = obtainStyledAttributes.getDimensionPixelSize(index, this.f53965U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f53965U) == -2) {
                                this.f53965U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f53967W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f53967W));
                        this.f53961Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C11515b.m67840J(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.f53956L = obtainStyledAttributes.getFloat(index, this.f53956L);
                                continue;
                            case 46:
                                this.f53957M = obtainStyledAttributes.getFloat(index, this.f53957M);
                                continue;
                            case 47:
                                this.f53958N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f53959O = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f53968X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53968X);
                                continue;
                            case 50:
                                this.f53969Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53969Y);
                                continue;
                            case 51:
                                this.f53976c0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f53997n);
                                this.f53997n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f53997n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f53999o);
                                this.f53999o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f53999o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.f53948D = obtainStyledAttributes.getDimensionPixelSize(index, this.f53948D);
                                continue;
                            case 55:
                                this.f53947C = obtainStyledAttributes.getDimensionPixelSize(index, this.f53947C);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        C11515b.m67842H(this, obtainStyledAttributes, index, 0);
                                        this.f53949E = true;
                                        continue;
                                    case 65:
                                        C11515b.m67842H(this, obtainStyledAttributes, index, 1);
                                        this.f53950F = true;
                                        continue;
                                    case 66:
                                        this.f53978d0 = obtainStyledAttributes.getInt(index, this.f53978d0);
                                        continue;
                                    case 67:
                                        this.f53977d = obtainStyledAttributes.getBoolean(index, this.f53977d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m67879c();
        }

        /* renamed from: a */
        public String m67881a() {
            return this.f53976c0;
        }

        /* renamed from: b */
        public C43042iz0 m67880b() {
            return this.f54014v0;
        }

        /* renamed from: c */
        public void m67879c() {
            this.f53986h0 = false;
            this.f53980e0 = true;
            this.f53982f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f53972a0) {
                this.f53980e0 = false;
                if (this.f53960P == 0) {
                    this.f53960P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f53974b0) {
                this.f53982f0 = false;
                if (this.f53961Q == 0) {
                    this.f53961Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f53980e0 = false;
                if (i == 0 && this.f53960P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f53972a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f53982f0 = false;
                if (i2 == 0 && this.f53961Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f53974b0 = true;
                }
            }
            if (this.f53975c != -1.0f || this.f53971a != -1 || this.f53973b != -1) {
                this.f53986h0 = true;
                this.f53980e0 = true;
                this.f53982f0 = true;
                if (!(this.f54014v0 instanceof C50895wE1)) {
                    this.f54014v0 = new C50895wE1();
                }
                ((C50895wE1) this.f54014v0).m7205E1(this.f53970Z);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z2 = false;
            if (1 == getLayoutDirection()) {
                z = true;
            } else {
                z = false;
            }
            this.f53998n0 = -1;
            this.f54000o0 = -1;
            this.f53994l0 = -1;
            this.f53996m0 = -1;
            this.f54002p0 = this.f54015w;
            this.f54004q0 = this.f54018y;
            float f = this.f53951G;
            this.f54006r0 = f;
            int i8 = this.f53971a;
            this.f54008s0 = i8;
            int i9 = this.f53973b;
            this.f54010t0 = i9;
            float f2 = this.f53975c;
            this.f54012u0 = f2;
            if (z) {
                int i10 = this.f54007s;
                if (i10 != -1) {
                    this.f53998n0 = i10;
                } else {
                    int i11 = this.f54009t;
                    if (i11 != -1) {
                        this.f54000o0 = i11;
                    }
                    i2 = this.f54011u;
                    if (i2 != -1) {
                        this.f53996m0 = i2;
                        z2 = true;
                    }
                    i3 = this.f54013v;
                    if (i3 != -1) {
                        this.f53994l0 = i3;
                        z2 = true;
                    }
                    i4 = this.f53945A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f54004q0 = i4;
                    }
                    i5 = this.f53946B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f54002p0 = i5;
                    }
                    if (z2) {
                        this.f54006r0 = 1.0f - f;
                    }
                    if (this.f53986h0 && this.f53970Z == 1 && this.f53977d) {
                        if (f2 == -1.0f) {
                            this.f54012u0 = 1.0f - f2;
                            this.f54008s0 = -1;
                            this.f54010t0 = -1;
                        } else if (i8 != -1) {
                            this.f54010t0 = i8;
                            this.f54008s0 = -1;
                            this.f54012u0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f54008s0 = i9;
                            this.f54010t0 = -1;
                            this.f54012u0 = -1.0f;
                        }
                    }
                }
                z2 = true;
                i2 = this.f54011u;
                if (i2 != -1) {
                }
                i3 = this.f54013v;
                if (i3 != -1) {
                }
                i4 = this.f53945A;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.f53946B;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z2) {
                }
                if (this.f53986h0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f54007s;
                if (i12 != -1) {
                    this.f53996m0 = i12;
                }
                int i13 = this.f54009t;
                if (i13 != -1) {
                    this.f53994l0 = i13;
                }
                int i14 = this.f54011u;
                if (i14 != -1) {
                    this.f53998n0 = i14;
                }
                int i15 = this.f54013v;
                if (i15 != -1) {
                    this.f54000o0 = i15;
                }
                int i16 = this.f53945A;
                if (i16 != Integer.MIN_VALUE) {
                    this.f54002p0 = i16;
                }
                int i17 = this.f53946B;
                if (i17 != Integer.MIN_VALUE) {
                    this.f54004q0 = i17;
                }
            }
            if (this.f54011u == -1 && this.f54013v == -1 && this.f54009t == -1 && this.f54007s == -1) {
                int i18 = this.f53983g;
                if (i18 != -1) {
                    this.f53998n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f53985h;
                    if (i19 != -1) {
                        this.f54000o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f53979e;
                if (i20 != -1) {
                    this.f53994l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i6 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                        return;
                    }
                    return;
                }
                int i21 = this.f53981f;
                if (i21 != -1) {
                    this.f53996m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i6 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    }
                }
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f53971a = -1;
            this.f53973b = -1;
            this.f53975c = -1.0f;
            this.f53977d = true;
            this.f53979e = -1;
            this.f53981f = -1;
            this.f53983g = -1;
            this.f53985h = -1;
            this.f53987i = -1;
            this.f53989j = -1;
            this.f53991k = -1;
            this.f53993l = -1;
            this.f53995m = -1;
            this.f53997n = -1;
            this.f53999o = -1;
            this.f54001p = -1;
            this.f54003q = 0;
            this.f54005r = 0.0f;
            this.f54007s = -1;
            this.f54009t = -1;
            this.f54011u = -1;
            this.f54013v = -1;
            this.f54015w = Integer.MIN_VALUE;
            this.f54017x = Integer.MIN_VALUE;
            this.f54018y = Integer.MIN_VALUE;
            this.f54019z = Integer.MIN_VALUE;
            this.f53945A = Integer.MIN_VALUE;
            this.f53946B = Integer.MIN_VALUE;
            this.f53947C = Integer.MIN_VALUE;
            this.f53948D = 0;
            this.f53949E = true;
            this.f53950F = true;
            this.f53951G = 0.5f;
            this.f53952H = 0.5f;
            this.f53953I = null;
            this.f53954J = 0.0f;
            this.f53955K = 1;
            this.f53956L = -1.0f;
            this.f53957M = -1.0f;
            this.f53958N = 0;
            this.f53959O = 0;
            this.f53960P = 0;
            this.f53961Q = 0;
            this.f53962R = 0;
            this.f53963S = 0;
            this.f53964T = 0;
            this.f53965U = 0;
            this.f53966V = 1.0f;
            this.f53967W = 1.0f;
            this.f53968X = -1;
            this.f53969Y = -1;
            this.f53970Z = -1;
            this.f53972a0 = false;
            this.f53974b0 = false;
            this.f53976c0 = null;
            this.f53978d0 = 0;
            this.f53980e0 = true;
            this.f53982f0 = true;
            this.f53984g0 = false;
            this.f53986h0 = false;
            this.f53988i0 = false;
            this.f53990j0 = false;
            this.f53992k0 = false;
            this.f53994l0 = -1;
            this.f53996m0 = -1;
            this.f53998n0 = -1;
            this.f54000o0 = -1;
            this.f54002p0 = Integer.MIN_VALUE;
            this.f54004q0 = Integer.MIN_VALUE;
            this.f54006r0 = 0.5f;
            this.f54014v0 = new C43042iz0();
            this.f54016w0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53971a = -1;
            this.f53973b = -1;
            this.f53975c = -1.0f;
            this.f53977d = true;
            this.f53979e = -1;
            this.f53981f = -1;
            this.f53983g = -1;
            this.f53985h = -1;
            this.f53987i = -1;
            this.f53989j = -1;
            this.f53991k = -1;
            this.f53993l = -1;
            this.f53995m = -1;
            this.f53997n = -1;
            this.f53999o = -1;
            this.f54001p = -1;
            this.f54003q = 0;
            this.f54005r = 0.0f;
            this.f54007s = -1;
            this.f54009t = -1;
            this.f54011u = -1;
            this.f54013v = -1;
            this.f54015w = Integer.MIN_VALUE;
            this.f54017x = Integer.MIN_VALUE;
            this.f54018y = Integer.MIN_VALUE;
            this.f54019z = Integer.MIN_VALUE;
            this.f53945A = Integer.MIN_VALUE;
            this.f53946B = Integer.MIN_VALUE;
            this.f53947C = Integer.MIN_VALUE;
            this.f53948D = 0;
            this.f53949E = true;
            this.f53950F = true;
            this.f53951G = 0.5f;
            this.f53952H = 0.5f;
            this.f53953I = null;
            this.f53954J = 0.0f;
            this.f53955K = 1;
            this.f53956L = -1.0f;
            this.f53957M = -1.0f;
            this.f53958N = 0;
            this.f53959O = 0;
            this.f53960P = 0;
            this.f53961Q = 0;
            this.f53962R = 0;
            this.f53963S = 0;
            this.f53964T = 0;
            this.f53965U = 0;
            this.f53966V = 1.0f;
            this.f53967W = 1.0f;
            this.f53968X = -1;
            this.f53969Y = -1;
            this.f53970Z = -1;
            this.f53972a0 = false;
            this.f53974b0 = false;
            this.f53976c0 = null;
            this.f53978d0 = 0;
            this.f53980e0 = true;
            this.f53982f0 = true;
            this.f53984g0 = false;
            this.f53986h0 = false;
            this.f53988i0 = false;
            this.f53990j0 = false;
            this.f53992k0 = false;
            this.f53994l0 = -1;
            this.f53996m0 = -1;
            this.f53998n0 = -1;
            this.f54000o0 = -1;
            this.f54002p0 = Integer.MIN_VALUE;
            this.f54004q0 = Integer.MIN_VALUE;
            this.f54006r0 = 0.5f;
            this.f54014v0 = new C43042iz0();
            this.f54016w0 = false;
        }
    }
}
