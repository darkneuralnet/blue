package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C11488a;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.C11925l;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* renamed from: A */
    public int f53493A;

    /* renamed from: B */
    public int f53494B;

    /* renamed from: C */
    public float f53495C;

    /* renamed from: D */
    public int f53496D;

    /* renamed from: E */
    public int f53497E;

    /* renamed from: F */
    public int f53498F;

    /* renamed from: G */
    public Runnable f53499G;

    /* renamed from: o */
    public final ArrayList<View> f53500o;

    /* renamed from: p */
    public int f53501p;

    /* renamed from: q */
    public int f53502q;

    /* renamed from: r */
    public MotionLayout f53503r;

    /* renamed from: s */
    public int f53504s;

    /* renamed from: t */
    public boolean f53505t;

    /* renamed from: u */
    public int f53506u;

    /* renamed from: v */
    public int f53507v;

    /* renamed from: w */
    public int f53508w;

    /* renamed from: x */
    public int f53509x;

    /* renamed from: y */
    public float f53510y;

    /* renamed from: z */
    public int f53511z;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    /* loaded from: classes.dex */
    public class RunnableC11474a implements Runnable {
        public RunnableC11474a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f53503r.setProgress(0.0f);
            Carousel.this.m68216O();
            Carousel.this.getClass();
            int unused = Carousel.this.f53502q;
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11475b {
    }

    public Carousel(Context context) {
        super(context);
        this.f53500o = new ArrayList<>();
        this.f53501p = 0;
        this.f53502q = 0;
        this.f53504s = -1;
        this.f53505t = false;
        this.f53506u = -1;
        this.f53507v = -1;
        this.f53508w = -1;
        this.f53509x = -1;
        this.f53510y = 0.9f;
        this.f53511z = 0;
        this.f53493A = 4;
        this.f53494B = 1;
        this.f53495C = 2.0f;
        this.f53496D = -1;
        this.f53497E = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f53498F = -1;
        this.f53499G = new RunnableC11474a();
    }

    /* renamed from: N */
    public final void m68217N(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.Carousel_carousel_firstView) {
                    this.f53504s = obtainStyledAttributes.getResourceId(index, this.f53504s);
                } else if (index == C39341cm4.Carousel_carousel_backwardTransition) {
                    this.f53506u = obtainStyledAttributes.getResourceId(index, this.f53506u);
                } else if (index == C39341cm4.Carousel_carousel_forwardTransition) {
                    this.f53507v = obtainStyledAttributes.getResourceId(index, this.f53507v);
                } else if (index == C39341cm4.Carousel_carousel_emptyViewsBehavior) {
                    this.f53493A = obtainStyledAttributes.getInt(index, this.f53493A);
                } else if (index == C39341cm4.Carousel_carousel_previousState) {
                    this.f53508w = obtainStyledAttributes.getResourceId(index, this.f53508w);
                } else if (index == C39341cm4.Carousel_carousel_nextState) {
                    this.f53509x = obtainStyledAttributes.getResourceId(index, this.f53509x);
                } else if (index == C39341cm4.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f53510y = obtainStyledAttributes.getFloat(index, this.f53510y);
                } else if (index == C39341cm4.Carousel_carousel_touchUpMode) {
                    this.f53494B = obtainStyledAttributes.getInt(index, this.f53494B);
                } else if (index == C39341cm4.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f53495C = obtainStyledAttributes.getFloat(index, this.f53495C);
                } else if (index == C39341cm4.Carousel_carousel_infinite) {
                    this.f53505t = obtainStyledAttributes.getBoolean(index, this.f53505t);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: O */
    public final void m68216O() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11486k
    /* renamed from: a */
    public void mo68093a(MotionLayout motionLayout, int i, int i2, float f) {
        this.f53498F = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11486k
    /* renamed from: b */
    public void mo68092b(MotionLayout motionLayout, int i) {
        int i2 = this.f53502q;
        this.f53501p = i2;
        if (i == this.f53509x) {
            this.f53502q = i2 + 1;
        } else if (i == this.f53508w) {
            this.f53502q = i2 - 1;
        }
        if (this.f53505t) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f53937c; i++) {
                int i2 = this.f53936b[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f53504s == i2) {
                    this.f53511z = i;
                }
                this.f53500o.add(viewById);
            }
            this.f53503r = motionLayout;
            if (this.f53494B == 2) {
                C11488a.C11490b m68174Z = motionLayout.m68174Z(this.f53507v);
                if (m68174Z != null) {
                    m68174Z.m68027G(5);
                }
                C11488a.C11490b m68174Z2 = this.f53503r.m68174Z(this.f53506u);
                if (m68174Z2 != null) {
                    m68174Z2.m68027G(5);
                }
            }
            m68216O();
        }
    }

    public void setAdapter(InterfaceC11475b interfaceC11475b) {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53500o = new ArrayList<>();
        this.f53501p = 0;
        this.f53502q = 0;
        this.f53504s = -1;
        this.f53505t = false;
        this.f53506u = -1;
        this.f53507v = -1;
        this.f53508w = -1;
        this.f53509x = -1;
        this.f53510y = 0.9f;
        this.f53511z = 0;
        this.f53493A = 4;
        this.f53494B = 1;
        this.f53495C = 2.0f;
        this.f53496D = -1;
        this.f53497E = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f53498F = -1;
        this.f53499G = new RunnableC11474a();
        m68217N(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53500o = new ArrayList<>();
        this.f53501p = 0;
        this.f53502q = 0;
        this.f53504s = -1;
        this.f53505t = false;
        this.f53506u = -1;
        this.f53507v = -1;
        this.f53508w = -1;
        this.f53509x = -1;
        this.f53510y = 0.9f;
        this.f53511z = 0;
        this.f53493A = 4;
        this.f53494B = 1;
        this.f53495C = 2.0f;
        this.f53496D = -1;
        this.f53497E = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f53498F = -1;
        this.f53499G = new RunnableC11474a();
        m68217N(context, attributeSet);
    }
}
