package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public class C11925l extends RecyclerView.AbstractC11854o implements RecyclerView.InterfaceC11860q {

    /* renamed from: A */
    public C43170jC1 f55512A;

    /* renamed from: B */
    public C11933f f55513B;

    /* renamed from: D */
    public Rect f55515D;

    /* renamed from: E */
    public long f55516E;

    /* renamed from: e */
    public float f55520e;

    /* renamed from: f */
    public float f55521f;

    /* renamed from: g */
    public float f55522g;

    /* renamed from: h */
    public float f55523h;

    /* renamed from: i */
    public float f55524i;

    /* renamed from: j */
    public float f55525j;

    /* renamed from: k */
    public float f55526k;

    /* renamed from: l */
    public float f55527l;

    /* renamed from: n */
    public AbstractC11930e f55529n;

    /* renamed from: p */
    public int f55531p;

    /* renamed from: r */
    public int f55533r;

    /* renamed from: s */
    public RecyclerView f55534s;

    /* renamed from: u */
    public VelocityTracker f55536u;

    /* renamed from: v */
    public List<RecyclerView.AbstractC11834D> f55537v;

    /* renamed from: w */
    public List<Integer> f55538w;

    /* renamed from: b */
    public final List<View> f55517b = new ArrayList();

    /* renamed from: c */
    public final float[] f55518c = new float[2];

    /* renamed from: d */
    public RecyclerView.AbstractC11834D f55519d = null;

    /* renamed from: m */
    public int f55528m = -1;

    /* renamed from: o */
    public int f55530o = 0;

    /* renamed from: q */
    public List<C11934g> f55532q = new ArrayList();

    /* renamed from: t */
    public final Runnable f55535t = new RunnableC11926a();

    /* renamed from: x */
    public RecyclerView.InterfaceC11847k f55539x = null;

    /* renamed from: y */
    public View f55540y = null;

    /* renamed from: z */
    public int f55541z = -1;

    /* renamed from: C */
    public final RecyclerView.InterfaceC11862s f55514C = new C11927b();

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    public class RunnableC11926a implements Runnable {
        public RunnableC11926a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11925l c11925l = C11925l.this;
            if (c11925l.f55519d != null && c11925l.m66186y()) {
                C11925l c11925l2 = C11925l.this;
                RecyclerView.AbstractC11834D abstractC11834D = c11925l2.f55519d;
                if (abstractC11834D != null) {
                    c11925l2.m66191t(abstractC11834D);
                }
                C11925l c11925l3 = C11925l.this;
                c11925l3.f55534s.removeCallbacks(c11925l3.f55535t);
                C38790bq6.m62468n0(C11925l.this.f55534s, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes.dex */
    public class C11927b implements RecyclerView.InterfaceC11862s {
        public C11927b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
        /* renamed from: b */
        public void mo45809b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C11925l.this.f55512A.m31019a(motionEvent);
            VelocityTracker velocityTracker = C11925l.this.f55536u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C11925l.this.f55528m == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(C11925l.this.f55528m);
            if (findPointerIndex >= 0) {
                C11925l.this.m66202i(actionMasked, motionEvent, findPointerIndex);
            }
            C11925l c11925l = C11925l.this;
            RecyclerView.AbstractC11834D abstractC11834D = c11925l.f55519d;
            if (abstractC11834D == null) {
                return;
            }
            int i = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            C11925l c11925l2 = C11925l.this;
                            if (pointerId == c11925l2.f55528m) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                c11925l2.f55528m = motionEvent.getPointerId(i);
                                C11925l c11925l3 = C11925l.this;
                                c11925l3.m66206E(motionEvent, c11925l3.f55531p, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = c11925l.f55536u;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    c11925l.m66206E(motionEvent, c11925l.f55531p, findPointerIndex);
                    C11925l.this.m66191t(abstractC11834D);
                    C11925l c11925l4 = C11925l.this;
                    c11925l4.f55534s.removeCallbacks(c11925l4.f55535t);
                    C11925l.this.f55535t.run();
                    C11925l.this.f55534s.invalidate();
                    return;
                } else {
                    return;
                }
            }
            C11925l.this.m66185z(null, 0);
            C11925l.this.f55528m = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
        /* renamed from: c */
        public boolean mo45808c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C11934g m66198m;
            C11925l.this.f55512A.m31019a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C11925l.this.f55528m = motionEvent.getPointerId(0);
                C11925l.this.f55520e = motionEvent.getX();
                C11925l.this.f55521f = motionEvent.getY();
                C11925l.this.m66190u();
                C11925l c11925l = C11925l.this;
                if (c11925l.f55519d == null && (m66198m = c11925l.m66198m(motionEvent)) != null) {
                    C11925l c11925l2 = C11925l.this;
                    c11925l2.f55520e -= m66198m.f55561j;
                    c11925l2.f55521f -= m66198m.f55562k;
                    c11925l2.m66199l(m66198m.f55556e, true);
                    if (C11925l.this.f55517b.remove(m66198m.f55556e.itemView)) {
                        C11925l c11925l3 = C11925l.this;
                        c11925l3.f55529n.clearView(c11925l3.f55534s, m66198m.f55556e);
                    }
                    C11925l.this.m66185z(m66198m.f55556e, m66198m.f55557f);
                    C11925l c11925l4 = C11925l.this;
                    c11925l4.m66206E(motionEvent, c11925l4.f55531p, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = C11925l.this.f55528m;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C11925l.this.m66202i(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                C11925l c11925l5 = C11925l.this;
                c11925l5.f55528m = -1;
                c11925l5.m66185z(null, 0);
            }
            VelocityTracker velocityTracker = C11925l.this.f55536u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C11925l.this.f55519d != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
        /* renamed from: e */
        public void mo45806e(boolean z) {
            if (z) {
                C11925l.this.m66185z(null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* loaded from: classes.dex */
    public class C11928c extends C11934g {

        /* renamed from: o */
        public final /* synthetic */ int f55544o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.AbstractC11834D f55545p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11928c(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC11834D abstractC11834D2) {
            super(abstractC11834D, i, i2, f, f2, f3, f4);
            this.f55544o = i3;
            this.f55545p = abstractC11834D2;
        }

        @Override // androidx.recyclerview.widget.C11925l.C11934g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f55563l) {
                return;
            }
            if (this.f55544o <= 0) {
                C11925l c11925l = C11925l.this;
                c11925l.f55529n.clearView(c11925l.f55534s, this.f55545p);
            } else {
                C11925l.this.f55517b.add(this.f55545p.itemView);
                this.f55560i = true;
                int i = this.f55544o;
                if (i > 0) {
                    C11925l.this.m66189v(this, i);
                }
            }
            C11925l c11925l2 = C11925l.this;
            View view = c11925l2.f55540y;
            View view2 = this.f55545p.itemView;
            if (view == view2) {
                c11925l2.m66187x(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    /* loaded from: classes.dex */
    public class RunnableC11929d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C11934g f55547b;

        /* renamed from: c */
        public final /* synthetic */ int f55548c;

        public RunnableC11929d(C11934g c11934g, int i) {
            this.f55547b = c11934g;
            this.f55548c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C11925l.this.f55534s;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C11934g c11934g = this.f55547b;
                if (!c11934g.f55563l && c11934g.f55556e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.AbstractC11849m itemAnimator = C11925l.this.f55534s.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !C11925l.this.m66193r()) {
                        C11925l.this.f55529n.onSwiped(this.f55547b.f55556e, this.f55548c);
                    } else {
                        C11925l.this.f55534s.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11930e {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new animationInterpolatorC11931a();
        private static final Interpolator sDragViewScrollCapInterpolator = new animationInterpolatorC11932b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.l$e$a  reason: invalid class name */
        /* loaded from: classes.dex */
        public class animationInterpolatorC11931a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.l$e$b  reason: invalid class name */
        /* loaded from: classes.dex */
        public class animationInterpolatorC11932b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static InterfaceC35872Sf2 getDefaultUIUtil() {
            return C36106Tf2.f35837a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C36810Wf4.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.AbstractC11834D chooseDropTarget(RecyclerView.AbstractC11834D abstractC11834D, List<RecyclerView.AbstractC11834D> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + abstractC11834D.itemView.getWidth();
            int height = i2 + abstractC11834D.itemView.getHeight();
            int left2 = i - abstractC11834D.itemView.getLeft();
            int top2 = i2 - abstractC11834D.itemView.getTop();
            int size = list.size();
            RecyclerView.AbstractC11834D abstractC11834D2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC11834D abstractC11834D3 = list.get(i4);
                if (left2 > 0 && (right = abstractC11834D3.itemView.getRight() - width) < 0 && abstractC11834D3.itemView.getRight() > abstractC11834D.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    abstractC11834D2 = abstractC11834D3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = abstractC11834D3.itemView.getLeft() - i) > 0 && abstractC11834D3.itemView.getLeft() < abstractC11834D.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    abstractC11834D2 = abstractC11834D3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = abstractC11834D3.itemView.getTop() - i2) > 0 && abstractC11834D3.itemView.getTop() < abstractC11834D.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    abstractC11834D2 = abstractC11834D3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = abstractC11834D3.itemView.getBottom() - height) < 0 && abstractC11834D3.itemView.getBottom() > abstractC11834D.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    abstractC11834D2 = abstractC11834D3;
                    i3 = abs;
                }
            }
            return abstractC11834D2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            C36106Tf2.f35837a.mo83224c(abstractC11834D.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, abstractC11834D), C38790bq6.m62548D(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC11849m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.AbstractC11834D abstractC11834D) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.AbstractC11834D abstractC11834D) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return (getAbsoluteMovementFlags(recyclerView, abstractC11834D) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return (getAbsoluteMovementFlags(recyclerView, abstractC11834D) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * sDragScrollInterpolator.getInterpolation(f));
            if (interpolation == 0) {
                if (i2 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, float f, float f2, int i, boolean z) {
            C36106Tf2.f35837a.mo83225b(canvas, recyclerView, abstractC11834D.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.AbstractC11834D abstractC11834D, float f, float f2, int i, boolean z) {
            C36106Tf2.f35837a.mo83223d(canvas, recyclerView, abstractC11834D.itemView, f, f2, i, z);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, List<C11934g> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C11934g c11934g = list.get(i2);
                c11934g.m66179e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, c11934g.f55556e, c11934g.f55561j, c11934g.f55562k, c11934g.f55557f, false);
                canvas.restoreToCount(save);
            }
            if (abstractC11834D != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, abstractC11834D, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, List<C11934g> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C11934g c11934g = list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, c11934g.f55556e, c11934g.f55561j, c11934g.f55562k, c11934g.f55557f, false);
                canvas.restoreToCount(save);
            }
            if (abstractC11834D != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, abstractC11834D, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C11934g c11934g2 = list.get(i3);
                boolean z2 = c11934g2.f55564m;
                if (z2 && !c11934g2.f55560i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, int i, RecyclerView.AbstractC11834D abstractC11834D2, int i2, int i3, int i4) {
            RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC11937i) {
                ((InterfaceC11937i) layoutManager).mo66178q(abstractC11834D.itemView, abstractC11834D2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo51880E()) {
                if (layoutManager.m66584k0(abstractC11834D2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m66581n0(abstractC11834D2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.mo51878F()) {
                if (layoutManager.m66580o0(abstractC11834D2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m66586i0(abstractC11834D2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.AbstractC11834D abstractC11834D, int i) {
            if (abstractC11834D != null) {
                C36106Tf2.f35837a.mo83226a(abstractC11834D.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.AbstractC11834D abstractC11834D, int i);
    }

    /* renamed from: androidx.recyclerview.widget.l$f */
    /* loaded from: classes.dex */
    public class C11933f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f55550b = true;

        public C11933f() {
        }

        /* renamed from: a */
        public void m66184a() {
            this.f55550b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m66197n;
            RecyclerView.AbstractC11834D childViewHolder;
            if (this.f55550b && (m66197n = C11925l.this.m66197n(motionEvent)) != null && (childViewHolder = C11925l.this.f55534s.getChildViewHolder(m66197n)) != null) {
                C11925l c11925l = C11925l.this;
                if (!c11925l.f55529n.hasDragFlag(c11925l.f55534s, childViewHolder)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i = C11925l.this.f55528m;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C11925l c11925l2 = C11925l.this;
                    c11925l2.f55520e = x;
                    c11925l2.f55521f = y;
                    c11925l2.f55525j = 0.0f;
                    c11925l2.f55524i = 0.0f;
                    if (c11925l2.f55529n.isLongPressDragEnabled()) {
                        C11925l.this.m66185z(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$g */
    /* loaded from: classes.dex */
    public static class C11934g implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f55552a;

        /* renamed from: b */
        public final float f55553b;

        /* renamed from: c */
        public final float f55554c;

        /* renamed from: d */
        public final float f55555d;

        /* renamed from: e */
        public final RecyclerView.AbstractC11834D f55556e;

        /* renamed from: f */
        public final int f55557f;

        /* renamed from: g */
        public final ValueAnimator f55558g;

        /* renamed from: h */
        public final int f55559h;

        /* renamed from: i */
        public boolean f55560i;

        /* renamed from: j */
        public float f55561j;

        /* renamed from: k */
        public float f55562k;

        /* renamed from: l */
        public boolean f55563l = false;

        /* renamed from: m */
        public boolean f55564m = false;

        /* renamed from: n */
        public float f55565n;

        /* renamed from: androidx.recyclerview.widget.l$g$a */
        /* loaded from: classes.dex */
        public class C11935a implements ValueAnimator.AnimatorUpdateListener {
            public C11935a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11934g.this.m66181c(valueAnimator.getAnimatedFraction());
            }
        }

        public C11934g(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, float f, float f2, float f3, float f4) {
            this.f55557f = i2;
            this.f55559h = i;
            this.f55556e = abstractC11834D;
            this.f55552a = f;
            this.f55553b = f2;
            this.f55554c = f3;
            this.f55555d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f55558g = ofFloat;
            ofFloat.addUpdateListener(new C11935a());
            ofFloat.setTarget(abstractC11834D.itemView);
            ofFloat.addListener(this);
            m66181c(0.0f);
        }

        /* renamed from: a */
        public void m66183a() {
            this.f55558g.cancel();
        }

        /* renamed from: b */
        public void m66182b(long j) {
            this.f55558g.setDuration(j);
        }

        /* renamed from: c */
        public void m66181c(float f) {
            this.f55565n = f;
        }

        /* renamed from: d */
        public void m66180d() {
            this.f55556e.setIsRecyclable(false);
            this.f55558g.start();
        }

        /* renamed from: e */
        public void m66179e() {
            float f = this.f55552a;
            float f2 = this.f55554c;
            if (f == f2) {
                this.f55561j = this.f55556e.itemView.getTranslationX();
            } else {
                this.f55561j = f + (this.f55565n * (f2 - f));
            }
            float f3 = this.f55553b;
            float f4 = this.f55555d;
            if (f3 == f4) {
                this.f55562k = this.f55556e.itemView.getTranslationY();
            } else {
                this.f55562k = f3 + (this.f55565n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m66181c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f55564m) {
                this.f55556e.setIsRecyclable(true);
            }
            this.f55564m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11936h extends AbstractC11930e {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public AbstractC11936h(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return AbstractC11930e.makeMovementFlags(getDragDirs(recyclerView, abstractC11834D), getSwipeDirs(recyclerView, abstractC11834D));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$i */
    /* loaded from: classes.dex */
    public interface InterfaceC11937i {
        /* renamed from: q */
        void mo66178q(View view, View view2, int i, int i2);
    }

    public C11925l(AbstractC11930e abstractC11930e) {
        this.f55529n = abstractC11930e;
    }

    /* renamed from: s */
    public static boolean m66192s(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final void m66210A() {
        this.f55533r = ViewConfiguration.get(this.f55534s.getContext()).getScaledTouchSlop();
        this.f55534s.addItemDecoration(this);
        this.f55534s.addOnItemTouchListener(this.f55514C);
        this.f55534s.addOnChildAttachStateChangeListener(this);
        m66209B();
    }

    /* renamed from: B */
    public final void m66209B() {
        this.f55513B = new C11933f();
        this.f55512A = new C43170jC1(this.f55534s.getContext(), this.f55513B);
    }

    /* renamed from: C */
    public final void m66208C() {
        C11933f c11933f = this.f55513B;
        if (c11933f != null) {
            c11933f.m66184a();
            this.f55513B = null;
        }
        if (this.f55512A != null) {
            this.f55512A = null;
        }
    }

    /* renamed from: D */
    public final int m66207D(RecyclerView.AbstractC11834D abstractC11834D) {
        if (this.f55530o == 2) {
            return 0;
        }
        int movementFlags = this.f55529n.getMovementFlags(this.f55534s, abstractC11834D);
        int convertToAbsoluteDirection = (this.f55529n.convertToAbsoluteDirection(movementFlags, C38790bq6.m62548D(this.f55534s)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f55524i) > Math.abs(this.f55525j)) {
            int m66203h = m66203h(abstractC11834D, convertToAbsoluteDirection);
            if (m66203h > 0) {
                if ((i & m66203h) == 0) {
                    return AbstractC11930e.convertToRelativeDirection(m66203h, C38790bq6.m62548D(this.f55534s));
                }
                return m66203h;
            }
            int m66201j = m66201j(abstractC11834D, convertToAbsoluteDirection);
            if (m66201j > 0) {
                return m66201j;
            }
        } else {
            int m66201j2 = m66201j(abstractC11834D, convertToAbsoluteDirection);
            if (m66201j2 > 0) {
                return m66201j2;
            }
            int m66203h2 = m66203h(abstractC11834D, convertToAbsoluteDirection);
            if (m66203h2 > 0) {
                if ((i & m66203h2) == 0) {
                    return AbstractC11930e.convertToRelativeDirection(m66203h2, C38790bq6.m62548D(this.f55534s));
                }
                return m66203h2;
            }
        }
        return 0;
    }

    /* renamed from: E */
    public void m66206E(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f55520e;
        this.f55524i = f;
        this.f55525j = y - this.f55521f;
        if ((i & 4) == 0) {
            this.f55524i = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f55524i = Math.min(0.0f, this.f55524i);
        }
        if ((i & 1) == 0) {
            this.f55525j = Math.max(0.0f, this.f55525j);
        }
        if ((i & 2) == 0) {
            this.f55525j = Math.min(0.0f, this.f55525j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11860q
    /* renamed from: a */
    public void mo65678a(View view) {
        m66187x(view);
        RecyclerView.AbstractC11834D childViewHolder = this.f55534s.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.AbstractC11834D abstractC11834D = this.f55519d;
        if (abstractC11834D != null && childViewHolder == abstractC11834D) {
            m66185z(null, 0);
            return;
        }
        m66199l(childViewHolder, false);
        if (this.f55517b.remove(childViewHolder.itemView)) {
            this.f55529n.clearView(this.f55534s, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11860q
    /* renamed from: d */
    public void mo65677d(View view) {
    }

    /* renamed from: f */
    public final void m66205f() {
    }

    /* renamed from: g */
    public void m66204g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f55534s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m66200k();
        }
        this.f55534s = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f55522g = resources.getDimension(C36810Wf4.item_touch_helper_swipe_escape_velocity);
            this.f55523h = resources.getDimension(C36810Wf4.item_touch_helper_swipe_escape_max_velocity);
            m66210A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public final int m66203h(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.f55524i > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.f55536u;
            if (velocityTracker != null && this.f55528m > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f55529n.getSwipeVelocityThreshold(this.f55523h));
                float xVelocity = this.f55536u.getXVelocity(this.f55528m);
                float yVelocity = this.f55536u.getYVelocity(this.f55528m);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f55529n.getSwipeEscapeVelocity(this.f55522g) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.f55534s.getWidth() * this.f55529n.getSwipeThreshold(abstractC11834D);
            if ((i & i2) != 0 && Math.abs(this.f55524i) > width) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: i */
    public void m66202i(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC11834D m66195p;
        int absoluteMovementFlags;
        if (this.f55519d != null || i != 2 || this.f55530o == 2 || !this.f55529n.isItemViewSwipeEnabled() || this.f55534s.getScrollState() == 1 || (m66195p = m66195p(motionEvent)) == null || (absoluteMovementFlags = (this.f55529n.getAbsoluteMovementFlags(this.f55534s, m66195p) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f55520e;
        float f2 = y - this.f55521f;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int i3 = this.f55533r;
        if (abs < i3 && abs2 < i3) {
            return;
        }
        if (abs > abs2) {
            if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                return;
            }
            if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                return;
            }
        } else if (f2 < 0.0f && (absoluteMovementFlags & 1) == 0) {
            return;
        } else {
            if (f2 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                return;
            }
        }
        this.f55525j = 0.0f;
        this.f55524i = 0.0f;
        this.f55528m = motionEvent.getPointerId(0);
        m66185z(m66195p, 1);
    }

    /* renamed from: j */
    public final int m66201j(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.f55525j > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.f55536u;
            if (velocityTracker != null && this.f55528m > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f55529n.getSwipeVelocityThreshold(this.f55523h));
                float xVelocity = this.f55536u.getXVelocity(this.f55528m);
                float yVelocity = this.f55536u.getYVelocity(this.f55528m);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f55529n.getSwipeEscapeVelocity(this.f55522g) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.f55534s.getHeight() * this.f55529n.getSwipeThreshold(abstractC11834D);
            if ((i & i2) != 0 && Math.abs(this.f55525j) > height) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: k */
    public final void m66200k() {
        this.f55534s.removeItemDecoration(this);
        this.f55534s.removeOnItemTouchListener(this.f55514C);
        this.f55534s.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f55532q.size() - 1; size >= 0; size--) {
            C11934g c11934g = this.f55532q.get(0);
            c11934g.m66183a();
            this.f55529n.clearView(this.f55534s, c11934g.f55556e);
        }
        this.f55532q.clear();
        this.f55540y = null;
        this.f55541z = -1;
        m66188w();
        m66208C();
    }

    /* renamed from: l */
    public void m66199l(RecyclerView.AbstractC11834D abstractC11834D, boolean z) {
        for (int size = this.f55532q.size() - 1; size >= 0; size--) {
            C11934g c11934g = this.f55532q.get(size);
            if (c11934g.f55556e == abstractC11834D) {
                c11934g.f55563l |= z;
                if (!c11934g.f55564m) {
                    c11934g.m66183a();
                }
                this.f55532q.remove(size);
                return;
            }
        }
    }

    /* renamed from: m */
    public C11934g m66198m(MotionEvent motionEvent) {
        if (this.f55532q.isEmpty()) {
            return null;
        }
        View m66197n = m66197n(motionEvent);
        for (int size = this.f55532q.size() - 1; size >= 0; size--) {
            C11934g c11934g = this.f55532q.get(size);
            if (c11934g.f55556e.itemView == m66197n) {
                return c11934g;
            }
        }
        return null;
    }

    /* renamed from: n */
    public View m66197n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC11834D abstractC11834D = this.f55519d;
        if (abstractC11834D != null) {
            View view = abstractC11834D.itemView;
            if (m66192s(view, x, y, this.f55526k + this.f55524i, this.f55527l + this.f55525j)) {
                return view;
            }
        }
        for (int size = this.f55532q.size() - 1; size >= 0; size--) {
            C11934g c11934g = this.f55532q.get(size);
            View view2 = c11934g.f55556e.itemView;
            if (m66192s(view2, x, y, c11934g.f55561j, c11934g.f55562k)) {
                return view2;
            }
        }
        return this.f55534s.findChildViewUnder(x, y);
    }

    /* renamed from: o */
    public final List<RecyclerView.AbstractC11834D> m66196o(RecyclerView.AbstractC11834D abstractC11834D) {
        RecyclerView.AbstractC11834D abstractC11834D2 = abstractC11834D;
        List<RecyclerView.AbstractC11834D> list = this.f55537v;
        if (list == null) {
            this.f55537v = new ArrayList();
            this.f55538w = new ArrayList();
        } else {
            list.clear();
            this.f55538w.clear();
        }
        int boundingBoxMargin = this.f55529n.getBoundingBoxMargin();
        int round = Math.round(this.f55526k + this.f55524i) - boundingBoxMargin;
        int round2 = Math.round(this.f55527l + this.f55525j) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = abstractC11834D2.itemView.getWidth() + round + i;
        int height = abstractC11834D2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.AbstractC11855p layoutManager = this.f55534s.getLayoutManager();
        int m66594d0 = layoutManager.m66594d0();
        int i4 = 0;
        while (i4 < m66594d0) {
            View m66597c0 = layoutManager.m66597c0(i4);
            if (m66597c0 != abstractC11834D2.itemView && m66597c0.getBottom() >= round2 && m66597c0.getTop() <= height && m66597c0.getRight() >= round && m66597c0.getLeft() <= width) {
                RecyclerView.AbstractC11834D childViewHolder = this.f55534s.getChildViewHolder(m66597c0);
                if (this.f55529n.canDropOver(this.f55534s, this.f55519d, childViewHolder)) {
                    int abs = Math.abs(i2 - ((m66597c0.getLeft() + m66597c0.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((m66597c0.getTop() + m66597c0.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f55537v.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f55538w.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f55537v.add(i6, childViewHolder);
                    this.f55538w.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            abstractC11834D2 = abstractC11834D;
        }
        return this.f55537v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        float f;
        float f2;
        this.f55541z = -1;
        if (this.f55519d != null) {
            m66194q(this.f55518c);
            float[] fArr = this.f55518c;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f55529n.onDraw(canvas, recyclerView, this.f55519d, this.f55532q, this.f55530o, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        float f;
        float f2;
        if (this.f55519d != null) {
            m66194q(this.f55518c);
            float[] fArr = this.f55518c;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f55529n.onDrawOver(canvas, recyclerView, this.f55519d, this.f55532q, this.f55530o, f, f2);
    }

    /* renamed from: p */
    public final RecyclerView.AbstractC11834D m66195p(MotionEvent motionEvent) {
        View m66197n;
        RecyclerView.AbstractC11855p layoutManager = this.f55534s.getLayoutManager();
        int i = this.f55528m;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f55520e);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f55521f);
        int i2 = this.f55533r;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo51880E()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.mo51878F()) || (m66197n = m66197n(motionEvent)) == null) {
            return null;
        }
        return this.f55534s.getChildViewHolder(m66197n);
    }

    /* renamed from: q */
    public final void m66194q(float[] fArr) {
        if ((this.f55531p & 12) != 0) {
            fArr[0] = (this.f55526k + this.f55524i) - this.f55519d.itemView.getLeft();
        } else {
            fArr[0] = this.f55519d.itemView.getTranslationX();
        }
        if ((this.f55531p & 3) != 0) {
            fArr[1] = (this.f55527l + this.f55525j) - this.f55519d.itemView.getTop();
        } else {
            fArr[1] = this.f55519d.itemView.getTranslationY();
        }
    }

    /* renamed from: r */
    public boolean m66193r() {
        int size = this.f55532q.size();
        for (int i = 0; i < size; i++) {
            if (!this.f55532q.get(i).f55564m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void m66191t(RecyclerView.AbstractC11834D abstractC11834D) {
        if (this.f55534s.isLayoutRequested() || this.f55530o != 2) {
            return;
        }
        float moveThreshold = this.f55529n.getMoveThreshold(abstractC11834D);
        int i = (int) (this.f55526k + this.f55524i);
        int i2 = (int) (this.f55527l + this.f55525j);
        if (Math.abs(i2 - abstractC11834D.itemView.getTop()) < abstractC11834D.itemView.getHeight() * moveThreshold && Math.abs(i - abstractC11834D.itemView.getLeft()) < abstractC11834D.itemView.getWidth() * moveThreshold) {
            return;
        }
        List<RecyclerView.AbstractC11834D> m66196o = m66196o(abstractC11834D);
        if (m66196o.size() == 0) {
            return;
        }
        RecyclerView.AbstractC11834D chooseDropTarget = this.f55529n.chooseDropTarget(abstractC11834D, m66196o, i, i2);
        if (chooseDropTarget == null) {
            this.f55537v.clear();
            this.f55538w.clear();
            return;
        }
        int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = abstractC11834D.getAbsoluteAdapterPosition();
        if (this.f55529n.onMove(this.f55534s, abstractC11834D, chooseDropTarget)) {
            this.f55529n.onMoved(this.f55534s, abstractC11834D, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
        }
    }

    /* renamed from: u */
    public void m66190u() {
        VelocityTracker velocityTracker = this.f55536u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f55536u = VelocityTracker.obtain();
    }

    /* renamed from: v */
    public void m66189v(C11934g c11934g, int i) {
        this.f55534s.post(new RunnableC11929d(c11934g, i));
    }

    /* renamed from: w */
    public final void m66188w() {
        VelocityTracker velocityTracker = this.f55536u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f55536u = null;
        }
    }

    /* renamed from: x */
    public void m66187x(View view) {
        if (view == this.f55540y) {
            this.f55540y = null;
            if (this.f55539x != null) {
                this.f55534s.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m66186y() {
        long j;
        int i;
        int i2;
        int i3;
        int width;
        if (this.f55519d == null) {
            this.f55516E = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f55516E;
        if (j2 == Long.MIN_VALUE) {
            j = 0;
        } else {
            j = currentTimeMillis - j2;
        }
        RecyclerView.AbstractC11855p layoutManager = this.f55534s.getLayoutManager();
        if (this.f55515D == null) {
            this.f55515D = new Rect();
        }
        layoutManager.m66645D(this.f55519d.itemView, this.f55515D);
        if (layoutManager.mo51880E()) {
            int i4 = (int) (this.f55526k + this.f55524i);
            int paddingLeft = (i4 - this.f55515D.left) - this.f55534s.getPaddingLeft();
            float f = this.f55524i;
            if (f < 0.0f && paddingLeft < 0) {
                i = paddingLeft;
            } else if (f > 0.0f && (width = ((i4 + this.f55519d.itemView.getWidth()) + this.f55515D.right) - (this.f55534s.getWidth() - this.f55534s.getPaddingRight())) > 0) {
                i = width;
            }
            if (layoutManager.mo51878F()) {
                int i5 = (int) (this.f55527l + this.f55525j);
                int paddingTop = (i5 - this.f55515D.top) - this.f55534s.getPaddingTop();
                float f2 = this.f55525j;
                if (f2 < 0.0f && paddingTop < 0) {
                    i2 = paddingTop;
                } else if (f2 > 0.0f) {
                    i2 = ((i5 + this.f55519d.itemView.getHeight()) + this.f55515D.bottom) - (this.f55534s.getHeight() - this.f55534s.getPaddingBottom());
                }
                if (i != 0) {
                    i = this.f55529n.interpolateOutOfBoundsScroll(this.f55534s, this.f55519d.itemView.getWidth(), i, this.f55534s.getWidth(), j);
                }
                int i6 = i;
                if (i2 != 0) {
                    i3 = i6;
                    i2 = this.f55529n.interpolateOutOfBoundsScroll(this.f55534s, this.f55519d.itemView.getHeight(), i2, this.f55534s.getHeight(), j);
                } else {
                    i3 = i6;
                }
                if (i3 != 0 && i2 == 0) {
                    this.f55516E = Long.MIN_VALUE;
                    return false;
                }
                if (this.f55516E == Long.MIN_VALUE) {
                    this.f55516E = currentTimeMillis;
                }
                this.f55534s.scrollBy(i3, i2);
                return true;
            }
            i2 = 0;
            if (i != 0) {
            }
            int i62 = i;
            if (i2 != 0) {
            }
            if (i3 != 0) {
            }
            if (this.f55516E == Long.MIN_VALUE) {
            }
            this.f55534s.scrollBy(i3, i2);
            return true;
        }
        i = 0;
        if (layoutManager.mo51878F()) {
        }
        i2 = 0;
        if (i != 0) {
        }
        int i622 = i;
        if (i2 != 0) {
        }
        if (i3 != 0) {
        }
        if (this.f55516E == Long.MIN_VALUE) {
        }
        this.f55534s.scrollBy(i3, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m66185z(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        boolean z;
        boolean z2;
        ViewParent parent;
        boolean z3;
        int m66207D;
        float f;
        float signum;
        int i2;
        if (abstractC11834D == this.f55519d && i == this.f55530o) {
            return;
        }
        this.f55516E = Long.MIN_VALUE;
        int i3 = this.f55530o;
        m66199l(abstractC11834D, true);
        this.f55530o = i;
        if (i == 2) {
            if (abstractC11834D != null) {
                this.f55540y = abstractC11834D.itemView;
                m66205f();
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.AbstractC11834D abstractC11834D2 = this.f55519d;
        if (abstractC11834D2 != null) {
            if (abstractC11834D2.itemView.getParent() != null) {
                if (i3 == 2) {
                    m66207D = 0;
                } else {
                    m66207D = m66207D(abstractC11834D2);
                }
                m66188w();
                if (m66207D != 1 && m66207D != 2) {
                    if (m66207D != 4 && m66207D != 8 && m66207D != 16 && m66207D != 32) {
                        f = 0.0f;
                        signum = 0.0f;
                    } else {
                        signum = 0.0f;
                        f = Math.signum(this.f55524i) * this.f55534s.getWidth();
                    }
                } else {
                    f = 0.0f;
                    signum = Math.signum(this.f55525j) * this.f55534s.getHeight();
                }
                if (i3 == 2) {
                    i2 = 8;
                } else if (m66207D > 0) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                m66194q(this.f55518c);
                float[] fArr = this.f55518c;
                float f2 = fArr[0];
                float f3 = fArr[1];
                C11928c c11928c = new C11928c(abstractC11834D2, i2, i3, f2, f3, f, signum, m66207D, abstractC11834D2);
                c11928c.m66182b(this.f55529n.getAnimationDuration(this.f55534s, i2, f - f2, signum - f3));
                this.f55532q.add(c11928c);
                c11928c.m66180d();
                z = true;
            } else {
                m66187x(abstractC11834D2.itemView);
                this.f55529n.clearView(this.f55534s, abstractC11834D2);
                z = false;
            }
            this.f55519d = null;
        } else {
            z = false;
        }
        if (abstractC11834D != null) {
            this.f55531p = (this.f55529n.getAbsoluteMovementFlags(this.f55534s, abstractC11834D) & i4) >> (this.f55530o * 8);
            this.f55526k = abstractC11834D.itemView.getLeft();
            this.f55527l = abstractC11834D.itemView.getTop();
            this.f55519d = abstractC11834D;
            if (i == 2) {
                z2 = false;
                abstractC11834D.itemView.performHapticFeedback(0);
                parent = this.f55534s.getParent();
                if (parent != null) {
                    if (this.f55519d != null) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    parent.requestDisallowInterceptTouchEvent(z3);
                }
                if (!z) {
                    this.f55534s.getLayoutManager().m66625M1();
                }
                this.f55529n.onSelectedChanged(this.f55519d, this.f55530o);
                this.f55534s.invalidate();
            }
        }
        z2 = false;
        parent = this.f55534s.getParent();
        if (parent != null) {
        }
        if (!z) {
        }
        this.f55529n.onSelectedChanged(this.f55519d, this.f55530o);
        this.f55534s.invalidate();
    }
}
