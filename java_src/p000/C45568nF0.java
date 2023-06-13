package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;
/* renamed from: nF0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45568nF0 {

    /* renamed from: a */
    public int f99672a = -1;

    /* renamed from: b */
    public int f99673b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f99674c;

    /* renamed from: d */
    public VelocityTracker f99675d;

    /* renamed from: e */
    public boolean f99676e;

    /* renamed from: f */
    public float f99677f;

    /* renamed from: g */
    public float f99678g;

    /* renamed from: h */
    public final float f99679h;

    /* renamed from: i */
    public final float f99680i;

    /* renamed from: j */
    public InterfaceC35414Qg3 f99681j;

    /* renamed from: nF0$a */
    /* loaded from: classes5.dex */
    public class ScaleGestureDetector$OnScaleGestureListenerC26450a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC26450a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                if (scaleFactor >= 0.0f) {
                    C45568nF0.this.f99681j.mo23677c(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C45568nF0(Context context, InterfaceC35414Qg3 interfaceC35414Qg3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f99680i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f99679h = viewConfiguration.getScaledTouchSlop();
        this.f99681j = interfaceC35414Qg3;
        this.f99674c = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC26450a());
    }

    /* renamed from: b */
    public final float m24108b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f99673b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m24107c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f99673b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m24106d() {
        return this.f99676e;
    }

    /* renamed from: e */
    public boolean m24105e() {
        return this.f99674c.isInProgress();
    }

    /* renamed from: f */
    public boolean m24104f(MotionEvent motionEvent) {
        try {
            this.f99674c.onTouchEvent(motionEvent);
            return m24103g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m24103g(MotionEvent motionEvent) {
        boolean z;
        int i;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int m17206b = C47622qi6.m17206b(motionEvent.getAction());
                            if (motionEvent.getPointerId(m17206b) == this.f99672a) {
                                if (m17206b == 0) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                this.f99672a = motionEvent.getPointerId(i);
                                this.f99677f = motionEvent.getX(i);
                                this.f99678g = motionEvent.getY(i);
                            }
                        }
                    } else {
                        this.f99672a = -1;
                        VelocityTracker velocityTracker = this.f99675d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f99675d = null;
                        }
                    }
                } else {
                    float m24108b = m24108b(motionEvent);
                    float m24107c = m24107c(motionEvent);
                    float f = m24108b - this.f99677f;
                    float f2 = m24107c - this.f99678g;
                    if (!this.f99676e) {
                        if (Math.sqrt((f * f) + (f2 * f2)) >= this.f99679h) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f99676e = z;
                    }
                    if (this.f99676e) {
                        this.f99681j.mo23678b(f, f2);
                        this.f99677f = m24108b;
                        this.f99678g = m24107c;
                        VelocityTracker velocityTracker2 = this.f99675d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f99672a = -1;
                if (this.f99676e && this.f99675d != null) {
                    this.f99677f = m24108b(motionEvent);
                    this.f99678g = m24107c(motionEvent);
                    this.f99675d.addMovement(motionEvent);
                    this.f99675d.computeCurrentVelocity(1000);
                    float xVelocity = this.f99675d.getXVelocity();
                    float yVelocity = this.f99675d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f99680i) {
                        this.f99681j.mo23679a(this.f99677f, this.f99678g, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker3 = this.f99675d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f99675d = null;
                }
            }
        } else {
            this.f99672a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f99675d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f99677f = m24108b(motionEvent);
            this.f99678g = m24107c(motionEvent);
            this.f99676e = false;
        }
        int i3 = this.f99672a;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f99673b = motionEvent.findPointerIndex(i2);
        return true;
    }
}
