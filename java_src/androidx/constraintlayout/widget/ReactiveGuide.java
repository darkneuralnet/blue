package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C11522c;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class ReactiveGuide extends View implements C11522c.InterfaceC11523a {

    /* renamed from: b */
    public int f54048b;

    /* renamed from: c */
    public boolean f54049c;

    /* renamed from: d */
    public int f54050d;

    /* renamed from: e */
    public boolean f54051e;

    public ReactiveGuide(Context context) {
        super(context);
        this.f54048b = -1;
        this.f54049c = false;
        this.f54050d = 0;
        this.f54051e = true;
        super.setVisibility(8);
        m67865a(null);
    }

    /* renamed from: a */
    public final void m67865a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f54048b = obtainStyledAttributes.getResourceId(index, this.f54048b);
                } else if (index == C39341cm4.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f54049c = obtainStyledAttributes.getBoolean(index, this.f54049c);
                } else if (index == C39341cm4.f61221x2694048c) {
                    this.f54050d = obtainStyledAttributes.getResourceId(index, this.f54050d);
                } else if (index == C39341cm4.f61220xfdeff96) {
                    this.f54051e = obtainStyledAttributes.getBoolean(index, this.f54051e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f54048b != -1) {
            ConstraintLayout.getSharedValues().m67779a(this.f54048b, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f54049c = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f54050d = i;
    }

    public void setAttributeId(int i) {
        C11522c sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f54048b;
        if (i2 != -1) {
            sharedValues.m67778b(i2, this);
        }
        this.f54048b = i;
        if (i != -1) {
            sharedValues.m67779a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f53971a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f53973b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f53975c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54048b = -1;
        this.f54049c = false;
        this.f54050d = 0;
        this.f54051e = true;
        super.setVisibility(8);
        m67865a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54048b = -1;
        this.f54049c = false;
        this.f54050d = 0;
        this.f54051e = true;
        super.setVisibility(8);
        m67865a(attributeSet);
    }
}
