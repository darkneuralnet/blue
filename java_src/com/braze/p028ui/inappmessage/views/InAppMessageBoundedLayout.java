package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.appboy.p027ui.R$styleable;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageBoundedLayout */
/* loaded from: classes5.dex */
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int mMaxDefinedHeightPixels;
    private int mMaxDefinedWidthPixels;
    private int mMinDefinedHeightPixels;
    private int mMinDefinedWidthPixels;

    public InAppMessageBoundedLayout(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.mMinDefinedWidthPixels;
        if (i3 > 0 && size < i3) {
            i = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedWidthPixels, View.MeasureSpec.getMode(i));
        } else {
            int i4 = this.mMaxDefinedWidthPixels;
            if (i4 > 0 && size > i4) {
                i = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedWidthPixels, View.MeasureSpec.getMode(i));
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.mMinDefinedHeightPixels;
        if (i5 > 0 && size2 < i5) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedHeightPixels, View.MeasureSpec.getMode(i2));
        } else {
            int i6 = this.mMaxDefinedHeightPixels;
            if (i6 > 0 && size2 > i6) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedHeightPixels, View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
    }

    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InAppMessageBoundedLayout);
        this.mMaxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.mMinDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.mMaxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.mMinDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }
}
