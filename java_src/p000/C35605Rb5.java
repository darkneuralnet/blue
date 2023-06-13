package p000;

import android.content.Context;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0010\t\n\u0002\b\t\b\u0017\u0018\u0000 L2\u00020\u0001:\u0003\n\u000e\u0005B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R$\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010(R$\u0010,\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010(R$\u0010/\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010(R$\u00102\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010(R*\u00106\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0016\u001a\u0004\b\n\u0010(\"\u0004\b\u0015\u00105R$\u00109\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u0010\u0016\u001a\u0004\b8\u0010(R\"\u0010<\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b\u000e\u0010(\"\u0004\b;\u00105R$\u0010?\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010\u0016\u001a\u0004\b>\u0010(R\"\u0010C\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0016\u001a\u0004\bA\u0010(\"\u0004\bB\u00105R$\u0010I\u001a\u00020D2\u0006\u0010!\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006M"}, m28432d2 = {"LRb5;", "", "Landroid/view/MotionEvent;", "event", "", "c", "", DateTokenConverter.CONVERTER_KEY, "f", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LRb5$b;", "b", "LRb5$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/MotionEvent;", "previousEvent", "currentEvent", "", "e", "F", "previousFingerDiffX", "previousFingerDiffY", "g", "currentFingerDiffX", "h", "currentFingerDiffY", "i", "previousPressure", "j", "currentPressure", "<set-?>", "k", "Z", "isGestureInProgress", "()Z", "l", "getFocusX", "()F", "focusX", "m", "getFocusY", "focusY", "n", "getCurrentSpan", "currentSpan", "o", "getPreviousSpan", "previousSpan", "value", "p", "(F)V", "currentAngle", "q", "getPreviousAngle", "previousAngle", "r", "setLastAngle", "lastAngle", "s", "getRotation", "rotation", "t", "getRotationThreshold", "setRotationThreshold", "rotationThreshold", "", "u", "J", "getTimeDelta", "()J", "timeDelta", "<init>", "(Landroid/content/Context;LRb5$b;)V", "v", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Rb5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35605Rb5 {

    /* renamed from: v */
    public static final C7213a f32273v = new C7213a(null);

    /* renamed from: w */
    public static final int f32274w = 8;

    /* renamed from: a */
    public final Context f32275a;

    /* renamed from: b */
    public final InterfaceC7214b f32276b;

    /* renamed from: c */
    public MotionEvent f32277c;

    /* renamed from: d */
    public MotionEvent f32278d;

    /* renamed from: e */
    public float f32279e;

    /* renamed from: f */
    public float f32280f;

    /* renamed from: g */
    public float f32281g;

    /* renamed from: h */
    public float f32282h;

    /* renamed from: i */
    public float f32283i;

    /* renamed from: j */
    public float f32284j;

    /* renamed from: k */
    public boolean f32285k;

    /* renamed from: l */
    public float f32286l;

    /* renamed from: m */
    public float f32287m;

    /* renamed from: n */
    public float f32288n;

    /* renamed from: o */
    public float f32289o;

    /* renamed from: p */
    public float f32290p;

    /* renamed from: q */
    public float f32291q;

    /* renamed from: r */
    public float f32292r;

    /* renamed from: s */
    public float f32293s;

    /* renamed from: t */
    public float f32294t;

    /* renamed from: u */
    public long f32295u;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LRb5$a;", "", "", "PRESSURE_THRESHOLD", "F", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Rb5$a */
    /* loaded from: classes6.dex */
    public static final class C7213a {
        public /* synthetic */ C7213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7213a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, m28432d2 = {"LRb5$b;", "", "LRb5;", "detector", "Landroid/view/MotionEvent;", "e", "", "b", C17296a.f69688o, "", "c", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Rb5$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC7214b {
        /* renamed from: a */
        boolean mo34355a(C35605Rb5 c35605Rb5, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo34354b(C35605Rb5 c35605Rb5, MotionEvent motionEvent);

        /* renamed from: c */
        void mo34353c(C35605Rb5 c35605Rb5, MotionEvent motionEvent);
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"LRb5$c;", "LRb5$b;", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Rb5$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC7215c extends InterfaceC7214b {

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Rb5$c$a */
        /* loaded from: classes6.dex */
        public static final class C7216a {
            /* renamed from: a */
            public static boolean m86564a(InterfaceC7215c interfaceC7215c, C35605Rb5 detector, MotionEvent e) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Intrinsics.checkNotNullParameter(e, "e");
                return false;
            }

            /* renamed from: b */
            public static boolean m86563b(InterfaceC7215c interfaceC7215c, C35605Rb5 detector, MotionEvent e) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }
        }
    }

    public C35605Rb5(Context context, InterfaceC7214b listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f32275a = context;
        this.f32276b = listener;
        this.f32294t = 2.0f;
    }

    /* renamed from: a */
    public final float m86570a() {
        return this.f32290p;
    }

    /* renamed from: b */
    public final float m86569b() {
        return this.f32292r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r0 != 3) goto L6;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m86568c(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        int i = 0;
        if (!this.f32285k) {
            if (action != 1) {
                if (action == 2) {
                    if (event.getPointerCount() != 2) {
                        return false;
                    }
                    if (this.f32277c == null) {
                        this.f32277c = MotionEvent.obtain(event);
                        return false;
                    }
                    m86565f(event);
                    if (Math.abs(this.f32293s) <= this.f32294t) {
                        return false;
                    }
                    this.f32276b.mo34355a(this, event);
                    this.f32285k = true;
                }
            }
            m86567d();
        } else if (action != 2) {
            if (action != 3) {
                if (action == 6) {
                    m86565f(event);
                    if (event.getActionIndex() == 0) {
                        i = 1;
                    }
                    this.f32286l = event.getX(i);
                    this.f32287m = event.getY(i);
                    this.f32292r = 0.0f;
                    this.f32276b.mo34353c(this, event);
                    m86567d();
                }
            } else {
                this.f32292r = 0.0f;
                this.f32276b.mo34353c(this, event);
                m86567d();
            }
        } else if (event.getPointerCount() > 2) {
            this.f32292r = 0.0f;
            this.f32276b.mo34353c(this, event);
            m86567d();
            return false;
        } else {
            m86565f(event);
            if (this.f32284j / this.f32283i > 0.67f && this.f32276b.mo34354b(this, event)) {
                MotionEvent motionEvent = this.f32277c;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.f32277c = MotionEvent.obtain(event);
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m86567d() {
        MotionEvent motionEvent = this.f32277c;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f32277c = null;
        MotionEvent motionEvent2 = this.f32278d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f32278d = null;
        this.f32285k = false;
    }

    /* renamed from: e */
    public final void m86566e(float f) {
        this.f32292r = this.f32290p;
        this.f32290p = f;
    }

    /* renamed from: f */
    public final void m86565f(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f32277c;
        if (motionEvent2 == null) {
            return;
        }
        MotionEvent motionEvent3 = this.f32278d;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.f32278d = MotionEvent.obtain(motionEvent);
        this.f32279e = motionEvent2.getX(1) - motionEvent2.getX(0);
        this.f32280f = motionEvent2.getY(1) - motionEvent2.getY(0);
        this.f32281g = motionEvent.getX(1) - motionEvent.getX(0);
        this.f32282h = motionEvent.getY(1) - motionEvent.getY(0);
        this.f32286l = motionEvent.getX(0) + (this.f32281g * 0.5f);
        float y = motionEvent.getY(0);
        float f = this.f32282h;
        this.f32287m = y + (0.5f * f);
        float f2 = this.f32281g;
        this.f32288n = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = this.f32279e;
        float f4 = this.f32282h;
        this.f32289o = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        this.f32291q = (float) Math.atan2(this.f32280f, this.f32281g);
        m86566e((float) Math.atan2(this.f32282h, this.f32281g));
        this.f32293s = (this.f32290p - this.f32291q) * 57.295776f;
        this.f32284j = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f32283i = motionEvent2.getPressure(motionEvent2.getActionIndex());
        this.f32295u = motionEvent.getEventTime() - motionEvent2.getEventTime();
    }
}
