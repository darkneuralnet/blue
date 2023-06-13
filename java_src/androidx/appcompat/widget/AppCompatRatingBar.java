package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: b */
    public final C28802ti f52135b;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m11906b = this.f52135b.m11906b();
        if (m11906b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m11906b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C46645p36.m20010a(this, getContext());
        C28802ti c28802ti = new C28802ti(this);
        this.f52135b = c28802ti;
        c28802ti.mo4867c(attributeSet, i);
    }
}
