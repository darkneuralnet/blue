package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.KotlinVersion;
/* loaded from: classes8.dex */
public class ViewFinderView extends View implements IViewFinder {
    private static final long ANIMATION_DELAY = 80;
    private static final float DEFAULT_SQUARE_DIMENSION_RATIO = 0.625f;
    private static final float LANDSCAPE_HEIGHT_RATIO = 0.625f;
    private static final float LANDSCAPE_WIDTH_HEIGHT_RATIO = 1.4f;
    private static final int MIN_DIMENSION_DIFF = 50;
    private static final int POINT_SIZE = 10;
    private static final float PORTRAIT_WIDTH_HEIGHT_RATIO = 0.75f;
    private static final float PORTRAIT_WIDTH_RATIO = 0.75f;
    private static final int[] SCANNER_ALPHA = {0, 64, 128, 192, KotlinVersion.MAX_COMPONENT_VALUE, 192, 128, 64};
    private static final String TAG = "ViewFinderView";
    protected int mBorderLineLength;
    protected Paint mBorderPaint;
    private float mBordersAlpha;
    private final int mDefaultBorderColor;
    private final int mDefaultBorderLineLength;
    private final int mDefaultBorderStrokeWidth;
    private final int mDefaultLaserColor;
    private final int mDefaultMaskColor;
    protected Paint mFinderMaskPaint;
    private Rect mFramingRect;
    private boolean mIsLaserEnabled;
    protected Paint mLaserPaint;
    protected boolean mSquareViewFinder;
    private int mViewFinderOffset;
    private int scannerAlpha;

    public ViewFinderView(Context context) {
        super(context);
        this.mDefaultLaserColor = getResources().getColor(C26149R.color.viewfinder_laser);
        this.mDefaultMaskColor = getResources().getColor(C26149R.color.viewfinder_mask);
        this.mDefaultBorderColor = getResources().getColor(C26149R.color.viewfinder_border);
        this.mDefaultBorderStrokeWidth = getResources().getInteger(C26149R.integer.viewfinder_border_width);
        this.mDefaultBorderLineLength = getResources().getInteger(C26149R.integer.viewfinder_border_length);
        this.mViewFinderOffset = 0;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mLaserPaint = paint;
        paint.setColor(this.mDefaultLaserColor);
        this.mLaserPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mFinderMaskPaint = paint2;
        paint2.setColor(this.mDefaultMaskColor);
        Paint paint3 = new Paint();
        this.mBorderPaint = paint3;
        paint3.setColor(this.mDefaultBorderColor);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setStrokeWidth(this.mDefaultBorderStrokeWidth);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderLineLength = this.mDefaultBorderLineLength;
    }

    public void drawLaser(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Paint paint = this.mLaserPaint;
        int[] iArr = SCANNER_ALPHA;
        paint.setAlpha(iArr[this.scannerAlpha]);
        this.scannerAlpha = (this.scannerAlpha + 1) % iArr.length;
        int height = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect(framingRect.left + 2, height - 1, framingRect.right - 1, height + 2, this.mLaserPaint);
        postInvalidateDelayed(ANIMATION_DELAY, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    public void drawViewFinderBorder(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Path path = new Path();
        path.moveTo(framingRect.left, framingRect.top + this.mBorderLineLength);
        path.lineTo(framingRect.left, framingRect.top);
        path.lineTo(framingRect.left + this.mBorderLineLength, framingRect.top);
        canvas.drawPath(path, this.mBorderPaint);
        path.moveTo(framingRect.right, framingRect.top + this.mBorderLineLength);
        path.lineTo(framingRect.right, framingRect.top);
        path.lineTo(framingRect.right - this.mBorderLineLength, framingRect.top);
        canvas.drawPath(path, this.mBorderPaint);
        path.moveTo(framingRect.right, framingRect.bottom - this.mBorderLineLength);
        path.lineTo(framingRect.right, framingRect.bottom);
        path.lineTo(framingRect.right - this.mBorderLineLength, framingRect.bottom);
        canvas.drawPath(path, this.mBorderPaint);
        path.moveTo(framingRect.left, framingRect.bottom - this.mBorderLineLength);
        path.lineTo(framingRect.left, framingRect.bottom);
        path.lineTo(framingRect.left + this.mBorderLineLength, framingRect.bottom);
        canvas.drawPath(path, this.mBorderPaint);
    }

    public void drawViewFinderMask(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, framingRect.top, this.mFinderMaskPaint);
        canvas.drawRect(0.0f, framingRect.top, framingRect.left, framingRect.bottom + 1, this.mFinderMaskPaint);
        canvas.drawRect(framingRect.right + 1, framingRect.top, f, framingRect.bottom + 1, this.mFinderMaskPaint);
        canvas.drawRect(0.0f, framingRect.bottom + 1, f, height, this.mFinderMaskPaint);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public Rect getFramingRect() {
        return this.mFramingRect;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getFramingRect() == null) {
            return;
        }
        drawViewFinderMask(canvas);
        drawViewFinderBorder(canvas);
        if (this.mIsLaserEnabled) {
            drawLaser(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        updateFramingRect();
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderAlpha(float f) {
        this.mBordersAlpha = f;
        this.mBorderPaint.setAlpha((int) (255.0f * f));
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderColor(int i) {
        this.mBorderPaint.setColor(i);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderCornerRadius(int i) {
        this.mBorderPaint.setPathEffect(new CornerPathEffect(i));
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderCornerRounded(boolean z) {
        if (z) {
            this.mBorderPaint.setStrokeJoin(Paint.Join.ROUND);
        } else {
            this.mBorderPaint.setStrokeJoin(Paint.Join.BEVEL);
        }
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderLineLength(int i) {
        this.mBorderLineLength = i;
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setBorderStrokeWidth(int i) {
        this.mBorderPaint.setStrokeWidth(i);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setLaserColor(int i) {
        this.mLaserPaint.setColor(i);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setLaserEnabled(boolean z) {
        this.mIsLaserEnabled = z;
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setMaskColor(int i) {
        this.mFinderMaskPaint.setColor(i);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setSquareViewFinder(boolean z) {
        this.mSquareViewFinder = z;
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setViewFinderOffset(int i) {
        this.mViewFinderOffset = i;
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setupViewFinder() {
        updateFramingRect();
        invalidate();
    }

    public synchronized void updateFramingRect() {
        int width;
        int i;
        int width2;
        Point point = new Point(getWidth(), getHeight());
        int screenOrientation = DisplayUtils.getScreenOrientation(getContext());
        if (this.mSquareViewFinder) {
            if (screenOrientation != 1) {
                width2 = getHeight();
            } else {
                width2 = getWidth();
            }
            width = (int) (width2 * 0.625f);
            i = width;
        } else if (screenOrientation != 1) {
            int height = (int) (getHeight() * 0.625f);
            i = height;
            width = (int) (height * LANDSCAPE_WIDTH_HEIGHT_RATIO);
        } else {
            width = (int) (getWidth() * 0.75f);
            i = (int) (width * 0.75f);
        }
        if (width > getWidth()) {
            width = getWidth() - 50;
        }
        if (i > getHeight()) {
            i = getHeight() - 50;
        }
        int i2 = (point.x - width) / 2;
        int i3 = (point.y - i) / 2;
        int i4 = this.mViewFinderOffset;
        this.mFramingRect = new Rect(i2 + i4, i3 + i4, (i2 + width) - i4, (i3 + i) - i4);
    }

    public ViewFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDefaultLaserColor = getResources().getColor(C26149R.color.viewfinder_laser);
        this.mDefaultMaskColor = getResources().getColor(C26149R.color.viewfinder_mask);
        this.mDefaultBorderColor = getResources().getColor(C26149R.color.viewfinder_border);
        this.mDefaultBorderStrokeWidth = getResources().getInteger(C26149R.integer.viewfinder_border_width);
        this.mDefaultBorderLineLength = getResources().getInteger(C26149R.integer.viewfinder_border_length);
        this.mViewFinderOffset = 0;
        init();
    }
}
