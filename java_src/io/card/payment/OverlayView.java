package io.card.payment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.lang.ref.WeakReference;
import kotlin.KotlinVersion;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class OverlayView extends View {
    private static final GradientDrawable.Orientation[] GRADIENT_ORIENTATIONS = {GradientDrawable.Orientation.TOP_BOTTOM, GradientDrawable.Orientation.LEFT_RIGHT, GradientDrawable.Orientation.BOTTOM_TOP, GradientDrawable.Orientation.RIGHT_LEFT};
    private static final String TAG = "OverlayView";
    private int guideColor;
    private boolean hideCardIOLogo;
    private Bitmap mBitmap;
    private Rect mCameraPreviewRect;
    private DetectionInfo mDInfo;
    private CreditCard mDetectedCard;
    private GradientDrawable mGradientDrawable;
    private Rect mGuide;
    private final Paint mGuidePaint;
    private final Paint mLockedBackgroundPaint;
    private Path mLockedBackgroundPath;
    private final Logo mLogo;
    private Rect mLogoRect;
    private int mRotation;
    private int mRotationFlip;
    private float mScale;
    private final WeakReference<CardIOActivity> mScanActivityRef;
    private final boolean mShowTorch;
    private int mState;
    private final Torch mTorch;
    private Rect mTorchRect;
    private String scanInstructions;

    public OverlayView(CardIOActivity cardIOActivity, AttributeSet attributeSet, boolean z) {
        super(cardIOActivity, attributeSet);
        this.mScale = 1.0f;
        this.mShowTorch = z;
        this.mScanActivityRef = new WeakReference<>(cardIOActivity);
        this.mRotationFlip = 1;
        this.mScale = getResources().getDisplayMetrics().density / 1.5f;
        float f = this.mScale;
        this.mTorch = new Torch(70.0f * f, f * 50.0f);
        this.mLogo = new Logo(cardIOActivity);
        this.mGuidePaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mLockedBackgroundPaint = paint;
        paint.clearShadowLayer();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1157627904);
        this.scanInstructions = LocalizedStrings.getString(StringKey.SCAN_GUIDE);
    }

    private void decorateBitmap() {
        RectF rectF = new RectF(2.0f, 2.0f, this.mBitmap.getWidth() - 2, this.mBitmap.getHeight() - 2);
        float height = this.mBitmap.getHeight() * 0.06666667f;
        Bitmap createBitmap = Bitmap.createBitmap(this.mBitmap.getWidth(), this.mBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        Canvas canvas2 = new Canvas(this.mBitmap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        paint2.setXfermode(null);
        createBitmap.recycle();
    }

    private Rect guideStrokeRect(int i, int i2, int i3, int i4) {
        int i5 = (int) (this.mScale * 8.0f);
        Rect rect = new Rect();
        rect.left = Math.min(i, i3) - i5;
        rect.right = Math.max(i, i3) + i5;
        rect.top = Math.min(i2, i4) - i5;
        rect.bottom = Math.max(i2, i4) + i5;
        return rect;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Bitmap getCardImage() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmap2 = this.mBitmap;
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.mBitmap.getHeight());
        }
        return null;
    }

    public Rect getTorchRect() {
        return this.mTorchRect;
    }

    public boolean isAnimating() {
        return this.mState != 0;
    }

    public void markupCard() {
        if (this.mBitmap == null) {
            return;
        }
        if (this.mDetectedCard.flipped) {
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f, this.mBitmap.getWidth() / 2, this.mBitmap.getHeight() / 2);
            Bitmap bitmap = this.mBitmap;
            this.mBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight(), matrix, false);
        }
        Canvas canvas = new Canvas(this.mBitmap);
        Paint paint = new Paint();
        Util.setupTextPaintStyle(paint);
        paint.setTextSize(this.mScale * 28.0f);
        int length = this.mDetectedCard.cardNumber.length();
        float width = this.mBitmap.getWidth() / 428.0f;
        int i = (int) ((this.mDetectedCard.yoff * width) - 6.0f);
        for (int i2 = 0; i2 < length; i2++) {
            canvas.drawText("" + this.mDetectedCard.cardNumber.charAt(i2), (int) (this.mDetectedCard.xoff[i2] * width), i, paint);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        String[] split;
        if (this.mGuide == null || this.mCameraPreviewRect == null) {
            return;
        }
        canvas.save();
        this.mGradientDrawable.draw(canvas);
        int i2 = this.mRotation;
        if (i2 != 0 && i2 != 180) {
            Rect rect = this.mGuide;
            i = (rect.right - rect.left) / 4;
        } else {
            Rect rect2 = this.mGuide;
            i = (rect2.bottom - rect2.top) / 4;
        }
        DetectionInfo detectionInfo = this.mDInfo;
        if (detectionInfo != null && detectionInfo.numVisibleEdges() == 4) {
            canvas.drawPath(this.mLockedBackgroundPath, this.mLockedBackgroundPaint);
        }
        this.mGuidePaint.clearShadowLayer();
        this.mGuidePaint.setStyle(Paint.Style.FILL);
        this.mGuidePaint.setColor(this.guideColor);
        Rect rect3 = this.mGuide;
        int i3 = rect3.left;
        int i4 = rect3.top;
        canvas.drawRect(guideStrokeRect(i3, i4, i3 + i, i4), this.mGuidePaint);
        Rect rect4 = this.mGuide;
        int i5 = rect4.left;
        int i6 = rect4.top;
        canvas.drawRect(guideStrokeRect(i5, i6, i5, i6 + i), this.mGuidePaint);
        Rect rect5 = this.mGuide;
        int i7 = rect5.right;
        int i8 = rect5.top;
        canvas.drawRect(guideStrokeRect(i7, i8, i7 - i, i8), this.mGuidePaint);
        Rect rect6 = this.mGuide;
        int i9 = rect6.right;
        int i10 = rect6.top;
        canvas.drawRect(guideStrokeRect(i9, i10, i9, i10 + i), this.mGuidePaint);
        Rect rect7 = this.mGuide;
        int i11 = rect7.left;
        int i12 = rect7.bottom;
        canvas.drawRect(guideStrokeRect(i11, i12, i11 + i, i12), this.mGuidePaint);
        Rect rect8 = this.mGuide;
        int i13 = rect8.left;
        int i14 = rect8.bottom;
        canvas.drawRect(guideStrokeRect(i13, i14, i13, i14 - i), this.mGuidePaint);
        Rect rect9 = this.mGuide;
        int i15 = rect9.right;
        int i16 = rect9.bottom;
        canvas.drawRect(guideStrokeRect(i15, i16, i15 - i, i16), this.mGuidePaint);
        Rect rect10 = this.mGuide;
        int i17 = rect10.right;
        int i18 = rect10.bottom;
        canvas.drawRect(guideStrokeRect(i17, i18, i17, i18 - i), this.mGuidePaint);
        DetectionInfo detectionInfo2 = this.mDInfo;
        if (detectionInfo2 != null) {
            if (detectionInfo2.topEdge) {
                Rect rect11 = this.mGuide;
                int i19 = rect11.left;
                int i20 = rect11.top;
                canvas.drawRect(guideStrokeRect(i19, i20, rect11.right, i20), this.mGuidePaint);
            }
            if (this.mDInfo.bottomEdge) {
                Rect rect12 = this.mGuide;
                int i21 = rect12.left;
                int i22 = rect12.bottom;
                canvas.drawRect(guideStrokeRect(i21, i22, rect12.right, i22), this.mGuidePaint);
            }
            if (this.mDInfo.leftEdge) {
                Rect rect13 = this.mGuide;
                int i23 = rect13.left;
                canvas.drawRect(guideStrokeRect(i23, rect13.top, i23, rect13.bottom), this.mGuidePaint);
            }
            if (this.mDInfo.rightEdge) {
                Rect rect14 = this.mGuide;
                int i24 = rect14.right;
                canvas.drawRect(guideStrokeRect(i24, rect14.top, i24, rect14.bottom), this.mGuidePaint);
            }
            if (this.mDInfo.numVisibleEdges() < 3) {
                float f = this.mScale;
                float f2 = 34.0f * f;
                float f3 = f * 26.0f;
                Util.setupTextPaintStyle(this.mGuidePaint);
                this.mGuidePaint.setTextAlign(Paint.Align.CENTER);
                this.mGuidePaint.setTextSize(f3);
                Rect rect15 = this.mGuide;
                float width = rect15.left + (rect15.width() / 2);
                Rect rect16 = this.mGuide;
                canvas.translate(width, rect16.top + (rect16.height() / 2));
                canvas.rotate(this.mRotationFlip * this.mRotation);
                String str = this.scanInstructions;
                if (str != null && str != "") {
                    float f4 = (-((((split.length - 1) * f2) - f3) / 2.0f)) - 3.0f;
                    for (String str2 : str.split("\n")) {
                        canvas.drawText(str2, 0.0f, f4, this.mGuidePaint);
                        f4 += f2;
                    }
                }
            }
        }
        canvas.restore();
        if (!this.hideCardIOLogo) {
            canvas.save();
            canvas.translate(this.mLogoRect.exactCenterX(), this.mLogoRect.exactCenterY());
            canvas.rotate(this.mRotationFlip * this.mRotation);
            Logo logo = this.mLogo;
            float f5 = this.mScale;
            logo.draw(canvas, 100.0f * f5, f5 * 50.0f);
            canvas.restore();
        }
        if (this.mShowTorch) {
            canvas.save();
            canvas.translate(this.mTorchRect.exactCenterX(), this.mTorchRect.exactCenterY());
            canvas.rotate(this.mRotationFlip * this.mRotation);
            this.mTorch.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        try {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                Rect rectGivenCenter = Util.rectGivenCenter(new Point((int) motionEvent.getX(), (int) motionEvent.getY()), 20, 20);
                if (this.mShowTorch && (rect = this.mTorchRect) != null && Rect.intersects(rect, rectGivenCenter)) {
                    this.mScanActivityRef.get().toggleFlash();
                } else {
                    this.mScanActivityRef.get().triggerAutoFocus();
                }
            }
            return false;
        } catch (NullPointerException unused) {
            Log.d(TAG, "NullPointerException caught in onTouchEvent method");
            return false;
        }
    }

    public void setBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.mBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.mBitmap = bitmap;
        if (bitmap != null) {
            decorateBitmap();
        }
    }

    public void setCameraPreviewRect(Rect rect) {
        this.mCameraPreviewRect = rect;
    }

    public void setDetectedCard(CreditCard creditCard) {
        this.mDetectedCard = creditCard;
    }

    public void setDetectionInfo(DetectionInfo detectionInfo) {
        DetectionInfo detectionInfo2 = this.mDInfo;
        if (detectionInfo2 != null && !detectionInfo2.sameEdgesAs(detectionInfo)) {
            invalidate();
        }
        this.mDInfo = detectionInfo;
    }

    public void setGuideAndRotation(Rect rect, int i) {
        Point point;
        this.mRotation = i;
        this.mGuide = rect;
        invalidate();
        if (this.mRotation % 180 != 0) {
            float f = this.mScale;
            point = new Point((int) (40.0f * f), (int) (f * 60.0f));
            this.mRotationFlip = -1;
        } else {
            float f2 = this.mScale;
            point = new Point((int) (60.0f * f2), (int) (f2 * 40.0f));
            this.mRotationFlip = 1;
        }
        if (this.mCameraPreviewRect != null) {
            Rect rect2 = this.mCameraPreviewRect;
            Point point2 = new Point(rect2.left + point.x, rect2.top + point.y);
            float f3 = this.mScale;
            this.mTorchRect = Util.rectGivenCenter(point2, (int) (70.0f * f3), (int) (f3 * 50.0f));
            Rect rect3 = this.mCameraPreviewRect;
            Point point3 = new Point(rect3.right - point.x, rect3.top + point.y);
            float f4 = this.mScale;
            this.mLogoRect = Util.rectGivenCenter(point3, (int) (100.0f * f4), (int) (f4 * 50.0f));
            GradientDrawable gradientDrawable = new GradientDrawable(GRADIENT_ORIENTATIONS[(this.mRotation / 90) % 4], new int[]{-1, -16777216});
            this.mGradientDrawable = gradientDrawable;
            gradientDrawable.setGradientType(0);
            this.mGradientDrawable.setBounds(this.mGuide);
            this.mGradientDrawable.setAlpha(50);
            Path path = new Path();
            this.mLockedBackgroundPath = path;
            path.addRect(new RectF(this.mCameraPreviewRect), Path.Direction.CW);
            this.mLockedBackgroundPath.addRect(new RectF(this.mGuide), Path.Direction.CCW);
        }
    }

    public void setGuideColor(int i) {
        this.guideColor = i;
    }

    public void setHideCardIOLogo(boolean z) {
        this.hideCardIOLogo = z;
    }

    public void setScanInstructions(String str) {
        this.scanInstructions = str;
    }

    public void setTorchOn(boolean z) {
        this.mTorch.setOn(z);
        invalidate();
    }

    public void setUseCardIOLogo(boolean z) {
        this.mLogo.loadLogo(z);
    }
}
