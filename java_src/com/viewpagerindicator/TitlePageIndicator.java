package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import kotlin.KotlinVersion;
/* loaded from: classes7.dex */
public class TitlePageIndicator extends View implements PageIndicator {
    private static final float BOLD_FADE_PERCENTAGE = 0.05f;
    private static final String EMPTY_TITLE = "";
    private static final int INVALID_POINTER = -1;
    private static final float SELECTION_FADE_PERCENTAGE = 0.25f;
    private int mActivePointerId;
    private boolean mBoldText;
    private final Rect mBounds;
    private OnCenterItemClickListener mCenterItemClickListener;
    private float mClipPadding;
    private int mColorSelected;
    private int mColorText;
    private int mCurrentPage;
    private float mFooterIndicatorHeight;
    private IndicatorStyle mFooterIndicatorStyle;
    private float mFooterIndicatorUnderlinePadding;
    private float mFooterLineHeight;
    private float mFooterPadding;
    private boolean mIsDragging;
    private float mLastMotionX;
    private LinePosition mLinePosition;
    private ViewPager.InterfaceC12076i mListener;
    private float mPageOffset;
    private final Paint mPaintFooterIndicator;
    private final Paint mPaintFooterLine;
    private final Paint mPaintText;
    private Path mPath;
    private int mScrollState;
    private float mTitlePadding;
    private float mTopPadding;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C195941 {

        /* renamed from: $SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle */
        static final /* synthetic */ int[] f75648x23f3a60e;

        static {
            int[] iArr = new int[IndicatorStyle.values().length];
            f75648x23f3a60e = iArr;
            try {
                iArr[IndicatorStyle.Triangle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75648x23f3a60e[IndicatorStyle.Underline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum IndicatorStyle {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int value;

        IndicatorStyle(int i) {
            this.value = i;
        }

        public static IndicatorStyle fromValue(int i) {
            IndicatorStyle[] values;
            for (IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == i) {
                    return indicatorStyle;
                }
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public enum LinePosition {
        Bottom(0),
        Top(1);
        
        public final int value;

        LinePosition(int i) {
            this.value = i;
        }

        public static LinePosition fromValue(int i) {
            LinePosition[] values;
            for (LinePosition linePosition : values()) {
                if (linePosition.value == i) {
                    return linePosition;
                }
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public interface OnCenterItemClickListener {
        void onCenterItemClick(int i);
    }

    /* loaded from: classes7.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.TitlePageIndicator.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPage;

        public /* synthetic */ SavedState(Parcel parcel, C195941 c195941) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    private Rect calcBounds(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence title = getTitle(i);
        rect.right = (int) paint.measureText(title, 0, title.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    private ArrayList<Rect> calculateAllBounds(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int count = this.mViewPager.getAdapter().getCount();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < count; i2++) {
            Rect calcBounds = calcBounds(i2, paint);
            int i3 = calcBounds.right - calcBounds.left;
            int i4 = calcBounds.bottom - calcBounds.top;
            int i5 = (int) ((i - (i3 / 2.0f)) + (((i2 - this.mCurrentPage) - this.mPageOffset) * width));
            calcBounds.left = i5;
            calcBounds.right = i5 + i3;
            calcBounds.top = 0;
            calcBounds.bottom = i4;
            arrayList.add(calcBounds);
        }
        return arrayList;
    }

    private void clipViewOnTheLeft(Rect rect, float f, int i) {
        float f2 = this.mClipPadding;
        rect.left = (int) (i + f2);
        rect.right = (int) (f2 + f);
    }

    private void clipViewOnTheRight(Rect rect, float f, int i) {
        int i2 = (int) (i - this.mClipPadding);
        rect.right = i2;
        rect.left = (int) (i2 - f);
    }

    private CharSequence getTitle(int i) {
        CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i);
        return pageTitle == null ? "" : pageTitle;
    }

    public float getClipPadding() {
        return this.mClipPadding;
    }

    public int getFooterColor() {
        return this.mPaintFooterLine.getColor();
    }

    public float getFooterIndicatorHeight() {
        return this.mFooterIndicatorHeight;
    }

    public float getFooterIndicatorPadding() {
        return this.mFooterPadding;
    }

    public IndicatorStyle getFooterIndicatorStyle() {
        return this.mFooterIndicatorStyle;
    }

    public float getFooterLineHeight() {
        return this.mFooterLineHeight;
    }

    public LinePosition getLinePosition() {
        return this.mLinePosition;
    }

    public int getSelectedColor() {
        return this.mColorSelected;
    }

    public int getTextColor() {
        return this.mColorText;
    }

    public float getTextSize() {
        return this.mPaintText.getTextSize();
    }

    public float getTitlePadding() {
        return this.mTitlePadding;
    }

    public float getTopPadding() {
        return this.mTopPadding;
    }

    public Typeface getTypeface() {
        return this.mPaintText.getTypeface();
    }

    public boolean isSelectedBold() {
        return this.mBoldText;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        ViewPager viewPager;
        super.onDraw(canvas);
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == null || (count = viewPager2.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.mCurrentPage == -1 && (viewPager = this.mViewPager) != null) {
            this.mCurrentPage = viewPager.getCurrentItem();
        }
        ArrayList<Rect> calculateAllBounds = calculateAllBounds(this.mPaintText);
        int size = calculateAllBounds.size();
        if (this.mCurrentPage >= size) {
            setCurrentItem(size - 1);
            return;
        }
        int i10 = count - 1;
        float width = getWidth() / 2.0f;
        int left = getLeft();
        float f2 = left + this.mClipPadding;
        int width2 = getWidth();
        int height = getHeight();
        int i11 = left + width2;
        float f3 = i11 - this.mClipPadding;
        int i12 = this.mCurrentPage;
        float f4 = this.mPageOffset;
        if (f4 <= 0.5d) {
            i = i12;
        } else {
            i = i12 + 1;
            f4 = 1.0f - f4;
        }
        boolean z = f4 <= SELECTION_FADE_PERCENTAGE;
        boolean z2 = f4 <= BOLD_FADE_PERCENTAGE;
        float f5 = (SELECTION_FADE_PERCENTAGE - f4) / SELECTION_FADE_PERCENTAGE;
        Rect rect = calculateAllBounds.get(i12);
        int i13 = rect.right;
        int i14 = rect.left;
        float f6 = i13 - i14;
        if (i14 < f2) {
            clipViewOnTheLeft(rect, f6, left);
        }
        if (rect.right > f3) {
            clipViewOnTheRight(rect, f6, i11);
        }
        int i15 = this.mCurrentPage;
        if (i15 > 0) {
            int i16 = i15 - 1;
            while (i16 >= 0) {
                Rect rect2 = calculateAllBounds.get(i16);
                int i17 = rect2.left;
                int i18 = width2;
                if (i17 < f2) {
                    int i19 = rect2.right - i17;
                    clipViewOnTheLeft(rect2, i19, left);
                    f = f2;
                    float f7 = this.mTitlePadding;
                    i8 = size;
                    if (rect2.right + f7 > calculateAllBounds.get(i16 + 1).left) {
                        int i20 = (int) ((i9 - i19) - f7);
                        rect2.left = i20;
                        rect2.right = i20 + i19;
                    }
                } else {
                    f = f2;
                    i8 = size;
                }
                i16--;
                width2 = i18;
                f2 = f;
                size = i8;
            }
        }
        int i21 = width2;
        int i22 = size;
        int i23 = this.mCurrentPage;
        if (i23 < i10) {
            for (int i24 = i23 + 1; i24 < count; i24++) {
                Rect rect3 = calculateAllBounds.get(i24);
                int i25 = rect3.right;
                if (i25 > f3) {
                    int i26 = i25 - rect3.left;
                    clipViewOnTheRight(rect3, i26, i11);
                    float f8 = this.mTitlePadding;
                    int i27 = calculateAllBounds.get(i24 - 1).right;
                    if (rect3.left - f8 < i27) {
                        int i28 = (int) (i27 + f8);
                        rect3.left = i28;
                        rect3.right = i28 + i26;
                    }
                }
            }
        }
        int i29 = this.mColorText >>> 24;
        int i30 = 0;
        while (i30 < count) {
            Rect rect4 = calculateAllBounds.get(i30);
            int i31 = rect4.left;
            if ((i31 <= left || i31 >= i11) && ((i3 = rect4.right) <= left || i3 >= i11)) {
                i4 = i11;
                i5 = i29;
                i6 = i21;
            } else {
                boolean z3 = i30 == i;
                CharSequence title = getTitle(i30);
                this.mPaintText.setFakeBoldText(z3 && z2 && this.mBoldText);
                this.mPaintText.setColor(this.mColorText);
                if (z3 && z) {
                    this.mPaintText.setAlpha(i29 - ((int) (i29 * f5)));
                }
                if (i30 < i22 - 1) {
                    int i32 = rect4.right;
                    float f9 = this.mTitlePadding;
                    if (i32 + f9 > calculateAllBounds.get(i30 + 1).left) {
                        int i33 = i32 - rect4.left;
                        int i34 = (int) ((i7 - i33) - f9);
                        rect4.left = i34;
                        rect4.right = i34 + i33;
                    }
                }
                i4 = i11;
                i5 = i29;
                i6 = i21;
                canvas.drawText(title, 0, title.length(), rect4.left, rect4.bottom + this.mTopPadding, this.mPaintText);
                if (z3 && z) {
                    this.mPaintText.setColor(this.mColorSelected);
                    this.mPaintText.setAlpha((int) ((this.mColorSelected >>> 24) * f5));
                    canvas.drawText(title, 0, title.length(), rect4.left, rect4.bottom + this.mTopPadding, this.mPaintText);
                }
            }
            i30++;
            i21 = i6;
            i11 = i4;
            i29 = i5;
        }
        int i35 = i21;
        float f10 = this.mFooterLineHeight;
        float f11 = this.mFooterIndicatorHeight;
        if (this.mLinePosition == LinePosition.Top) {
            f10 = -f10;
            f11 = -f11;
            i2 = 0;
        } else {
            i2 = height;
        }
        this.mPath.reset();
        float f12 = i2;
        float f13 = f12 - (f10 / 2.0f);
        this.mPath.moveTo(0.0f, f13);
        this.mPath.lineTo(i35, f13);
        this.mPath.close();
        canvas.drawPath(this.mPath, this.mPaintFooterLine);
        float f14 = f12 - f10;
        int i36 = C195941.f75648x23f3a60e[this.mFooterIndicatorStyle.ordinal()];
        if (i36 == 1) {
            this.mPath.reset();
            this.mPath.moveTo(width, f14 - f11);
            this.mPath.lineTo(width + f11, f14);
            this.mPath.lineTo(width - f11, f14);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
        } else if (i36 == 2 && z && i < i22) {
            Rect rect5 = calculateAllBounds.get(i);
            float f15 = this.mFooterIndicatorUnderlinePadding;
            float f16 = rect5.right + f15;
            float f17 = rect5.left - f15;
            float f18 = f14 - f11;
            this.mPath.reset();
            this.mPath.moveTo(f17, f14);
            this.mPath.lineTo(f16, f14);
            this.mPath.lineTo(f16, f18);
            this.mPath.lineTo(f17, f18);
            this.mPath.close();
            this.mPaintFooterIndicator.setAlpha((int) (f5 * 255.0f));
            canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
            this.mPaintFooterIndicator.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = View.MeasureSpec.getSize(i2);
        } else {
            this.mBounds.setEmpty();
            this.mBounds.bottom = (int) (this.mPaintText.descent() - this.mPaintText.ascent());
            Rect rect = this.mBounds;
            f = (rect.bottom - rect.top) + this.mFooterLineHeight + this.mFooterPadding + this.mTopPadding;
            if (this.mFooterIndicatorStyle != IndicatorStyle.None) {
                f += this.mFooterIndicatorHeight;
            }
        }
        setMeasuredDimension(size, (int) f);
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrollStateChanged(int i) {
        this.mScrollState = i;
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrolled(int i, float f, int i2) {
        this.mCurrentPage = i;
        this.mPageOffset = f;
        invalidate();
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageSelected(int i) {
        if (this.mScrollState == 0) {
            this.mCurrentPage = i;
            invalidate();
        }
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.mViewPager;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int m85342b = SV2.m85342b(motionEvent);
                                if (SV2.m85341c(motionEvent, m85342b) == this.mActivePointerId) {
                                    if (m85342b == 0) {
                                        i = 1;
                                    }
                                    this.mActivePointerId = SV2.m85341c(motionEvent, i);
                                }
                                this.mLastMotionX = SV2.m85340d(motionEvent, SV2.m85343a(motionEvent, this.mActivePointerId));
                            }
                        } else {
                            int m85342b2 = SV2.m85342b(motionEvent);
                            this.mLastMotionX = SV2.m85340d(motionEvent, m85342b2);
                            this.mActivePointerId = SV2.m85341c(motionEvent, m85342b2);
                        }
                    }
                } else {
                    float m85340d = SV2.m85340d(motionEvent, SV2.m85343a(motionEvent, this.mActivePointerId));
                    float f = m85340d - this.mLastMotionX;
                    if (!this.mIsDragging && Math.abs(f) > this.mTouchSlop) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionX = m85340d;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                }
            }
            if (!this.mIsDragging) {
                int count = this.mViewPager.getAdapter().getCount();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                float f4 = f2 - f3;
                float f5 = f2 + f3;
                float x = motionEvent.getX();
                if (x < f4) {
                    int i2 = this.mCurrentPage;
                    if (i2 > 0) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i2 - 1);
                        }
                        return true;
                    }
                } else if (x > f5) {
                    int i3 = this.mCurrentPage;
                    if (i3 < count - 1) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i3 + 1);
                        }
                        return true;
                    }
                } else {
                    OnCenterItemClickListener onCenterItemClickListener = this.mCenterItemClickListener;
                    if (onCenterItemClickListener != null && action != 3) {
                        onCenterItemClickListener.onCenterItemClick(this.mCurrentPage);
                    }
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.mActivePointerId = SV2.m85341c(motionEvent, 0);
            this.mLastMotionX = motionEvent.getX();
        }
        return true;
    }

    public void setClipPadding(float f) {
        this.mClipPadding = f;
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFooterColor(int i) {
        this.mPaintFooterLine.setColor(i);
        this.mPaintFooterIndicator.setColor(i);
        invalidate();
    }

    public void setFooterIndicatorHeight(float f) {
        this.mFooterIndicatorHeight = f;
        invalidate();
    }

    public void setFooterIndicatorPadding(float f) {
        this.mFooterPadding = f;
        invalidate();
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorStyle) {
        this.mFooterIndicatorStyle = indicatorStyle;
        invalidate();
    }

    public void setFooterLineHeight(float f) {
        this.mFooterLineHeight = f;
        this.mPaintFooterLine.setStrokeWidth(f);
        invalidate();
    }

    public void setLinePosition(LinePosition linePosition) {
        this.mLinePosition = linePosition;
        invalidate();
    }

    public void setOnCenterItemClickListener(OnCenterItemClickListener onCenterItemClickListener) {
        this.mCenterItemClickListener = onCenterItemClickListener;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.mListener = interfaceC12076i;
    }

    public void setSelectedBold(boolean z) {
        this.mBoldText = z;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.mColorSelected = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.mPaintText.setColor(i);
        this.mColorText = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.mPaintText.setTextSize(f);
        invalidate();
    }

    public void setTitlePadding(float f) {
        this.mTitlePadding = f;
        invalidate();
    }

    public void setTopPadding(float f) {
        this.mTopPadding = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.mPaintText.setTypeface(typeface);
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.mViewPager = viewPager;
            viewPager.setOnPageChangeListener(this);
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19589R.attr.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPage = -1;
        Paint paint = new Paint();
        this.mPaintText = paint;
        this.mPath = new Path();
        this.mBounds = new Rect();
        Paint paint2 = new Paint();
        this.mPaintFooterLine = paint2;
        Paint paint3 = new Paint();
        this.mPaintFooterIndicator = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(C19589R.color.default_title_indicator_footer_color);
        float dimension = resources.getDimension(C19589R.dimen.default_title_indicator_footer_line_height);
        int integer = resources.getInteger(C19589R.integer.default_title_indicator_footer_indicator_style);
        float dimension2 = resources.getDimension(C19589R.dimen.default_title_indicator_footer_indicator_height);
        float dimension3 = resources.getDimension(C19589R.dimen.default_title_indicator_footer_indicator_underline_padding);
        float dimension4 = resources.getDimension(C19589R.dimen.default_title_indicator_footer_padding);
        int integer2 = resources.getInteger(C19589R.integer.default_title_indicator_line_position);
        int color2 = resources.getColor(C19589R.color.default_title_indicator_selected_color);
        boolean z = resources.getBoolean(C19589R.bool.default_title_indicator_selected_bold);
        int color3 = resources.getColor(C19589R.color.default_title_indicator_text_color);
        float dimension5 = resources.getDimension(C19589R.dimen.default_title_indicator_text_size);
        float dimension6 = resources.getDimension(C19589R.dimen.default_title_indicator_title_padding);
        float dimension7 = resources.getDimension(C19589R.dimen.default_title_indicator_clip_padding);
        float dimension8 = resources.getDimension(C19589R.dimen.default_title_indicator_top_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19589R.styleable.TitlePageIndicator, i, 0);
        this.mFooterLineHeight = obtainStyledAttributes.getDimension(6, dimension);
        this.mFooterIndicatorStyle = IndicatorStyle.fromValue(obtainStyledAttributes.getInteger(7, integer));
        this.mFooterIndicatorHeight = obtainStyledAttributes.getDimension(8, dimension2);
        this.mFooterIndicatorUnderlinePadding = obtainStyledAttributes.getDimension(9, dimension3);
        this.mFooterPadding = obtainStyledAttributes.getDimension(10, dimension4);
        this.mLinePosition = LinePosition.fromValue(obtainStyledAttributes.getInteger(11, integer2));
        this.mTopPadding = obtainStyledAttributes.getDimension(14, dimension8);
        this.mTitlePadding = obtainStyledAttributes.getDimension(13, dimension6);
        this.mClipPadding = obtainStyledAttributes.getDimension(4, dimension7);
        this.mColorSelected = obtainStyledAttributes.getColor(3, color2);
        this.mColorText = obtainStyledAttributes.getColor(1, color3);
        this.mBoldText = obtainStyledAttributes.getBoolean(12, z);
        float dimension9 = obtainStyledAttributes.getDimension(0, dimension5);
        int color4 = obtainStyledAttributes.getColor(5, color);
        paint.setTextSize(dimension9);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(this.mFooterLineHeight);
        paint2.setColor(color4);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setColor(color4);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.mTouchSlop = C34571Mq6.m94685d(ViewConfiguration.get(context));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
