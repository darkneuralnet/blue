package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;
import kotlin.KotlinVersion;
import p000.C43042iz0;
/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: b */
    public int f54045b;

    /* renamed from: c */
    public View f54046c;

    /* renamed from: d */
    public int f54047d;

    public Placeholder(Context context) {
        super(context);
        this.f54045b = -1;
        this.f54046c = null;
        this.f54047d = 4;
        m67868b(null);
    }

    /* renamed from: a */
    public View m67869a() {
        return this.f54046c;
    }

    /* renamed from: b */
    public final void m67868b(AttributeSet attributeSet) {
        super.setVisibility(this.f54047d);
        this.f54045b = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_placeholder_content) {
                    this.f54045b = obtainStyledAttributes.getResourceId(index, this.f54045b);
                } else if (index == C39341cm4.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f54047d = obtainStyledAttributes.getInt(index, this.f54047d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public void m67867c(ConstraintLayout constraintLayout) {
        if (this.f54046c == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f54046c.getLayoutParams();
        layoutParams2.f54014v0.m31352n1(0);
        C43042iz0.EnumC24677b m31434C = layoutParams.f54014v0.m31434C();
        C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.FIXED;
        if (m31434C != enumC24677b) {
            layoutParams.f54014v0.m31349o1(layoutParams2.f54014v0.m31391Y());
        }
        if (layoutParams.f54014v0.m31397V() != enumC24677b) {
            layoutParams.f54014v0.m31407P0(layoutParams2.f54014v0.m31328z());
        }
        layoutParams2.f54014v0.m31352n1(8);
    }

    /* renamed from: d */
    public void m67866d(ConstraintLayout constraintLayout) {
        if (this.f54045b == -1 && !isInEditMode()) {
            setVisibility(this.f54047d);
        }
        View findViewById = constraintLayout.findViewById(this.f54045b);
        this.f54046c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f53990j0 = true;
            this.f54046c.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(KotlinVersion.MAX_COMPONENT_VALUE, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.f61059NA, 0, 1, rect);
            canvas.drawText(CallerData.f61059NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f54045b == i) {
            return;
        }
        View view = this.f54046c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f54046c.getLayoutParams()).f53990j0 = false;
            this.f54046c = null;
        }
        this.f54045b = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.f54047d = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54045b = -1;
        this.f54046c = null;
        this.f54047d = 4;
        m67868b(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54045b = -1;
        this.f54046c = null;
        this.f54047d = 4;
        m67868b(attributeSet);
    }
}
