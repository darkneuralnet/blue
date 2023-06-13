package p000;

import android.content.Context;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0017\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0005\bB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R(\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006*"}, m28432d2 = {"LkW2;", "", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "", "c", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LkW2$a;", "LkW2$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Z", "gestureInProgress", DateTokenConverter.CONVERTER_KEY, "detectionInProgress", "", "e", "Ljava/lang/Float;", "getLastDistanceX", "()Ljava/lang/Float;", "setLastDistanceX", "(Ljava/lang/Float;)V", "lastDistanceX", "f", "getLastDistanceY", "setLastDistanceY", "lastDistanceY", "<set-?>", "g", "Landroid/view/MotionEvent;", "getFirstMotionEvent", "()Landroid/view/MotionEvent;", "firstMotionEvent", "h", "getCurrentMotionEvent", "currentMotionEvent", "<init>", "(Landroid/content/Context;LkW2$a;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: kW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43944kW2 {

    /* renamed from: a */
    public final Context f94458a;

    /* renamed from: b */
    public final InterfaceC25171a f94459b;

    /* renamed from: c */
    public boolean f94460c;

    /* renamed from: d */
    public boolean f94461d;

    /* renamed from: e */
    public Float f94462e;

    /* renamed from: f */
    public Float f94463f;

    /* renamed from: g */
    public MotionEvent f94464g;

    /* renamed from: h */
    public MotionEvent f94465h;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, m28432d2 = {"LkW2$a;", "", "LkW2;", "detector", "Landroid/view/MotionEvent;", "e", "", C17296a.f69688o, "c", "", "b", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: kW2$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC25171a {
        /* renamed from: a */
        boolean mo28886a(C43944kW2 c43944kW2, MotionEvent motionEvent);

        /* renamed from: b */
        void mo28885b(C43944kW2 c43944kW2, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo28884c(C43944kW2 c43944kW2, MotionEvent motionEvent);
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"LkW2$b;", "LkW2$a;", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: kW2$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC25172b extends InterfaceC25171a {

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: kW2$b$a */
        /* loaded from: classes6.dex */
        public static final class C25173a {
            /* renamed from: a */
            public static boolean m28883a(InterfaceC25172b interfaceC25172b, C43944kW2 detector, MotionEvent e) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Intrinsics.checkNotNullParameter(e, "e");
                return false;
            }

            /* renamed from: b */
            public static boolean m28882b(InterfaceC25172b interfaceC25172b, C43944kW2 detector, MotionEvent e) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }
        }
    }

    public C43944kW2(Context context, InterfaceC25171a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94458a = context;
        this.f94459b = listener;
    }

    /* renamed from: a */
    public final boolean m28889a(MotionEvent event) {
        float f;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPointerCount() > 1) {
            if (!this.f94460c && !this.f94461d) {
                return false;
            }
            this.f94459b.mo28885b(this, event);
            m28888b();
            return true;
        } else if (!this.f94460c && !this.f94461d) {
            if (event.getActionMasked() != 0) {
                return false;
            }
            m28887c(event);
            this.f94461d = true;
            return false;
        } else {
            int actionMasked = event.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3 && actionMasked != 5) {
                        return false;
                    }
                } else {
                    m28887c(event);
                    if (this.f94461d) {
                        Float f2 = this.f94462e;
                        float f3 = 0.0f;
                        if (f2 != null) {
                            f = f2.floatValue();
                        } else {
                            f = 0.0f;
                        }
                        double d = 2;
                        float pow = (float) Math.pow(f, d);
                        Float f4 = this.f94463f;
                        if (f4 != null) {
                            f3 = f4.floatValue();
                        }
                        if (pow + ((float) Math.pow(f3, d)) < 1000.0f) {
                            return false;
                        }
                        this.f94461d = false;
                        this.f94460c = true;
                        this.f94459b.mo28884c(this, event);
                    }
                    this.f94459b.mo28886a(this, event);
                    return true;
                }
            }
            m28888b();
            this.f94459b.mo28885b(this, event);
            return true;
        }
    }

    /* renamed from: b */
    public final void m28888b() {
        MotionEvent motionEvent = this.f94465h;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f94465h = null;
        MotionEvent motionEvent2 = this.f94464g;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f94464g = null;
        this.f94462e = Float.valueOf(0.0f);
        this.f94463f = Float.valueOf(0.0f);
        this.f94460c = false;
        this.f94461d = false;
    }

    /* renamed from: c */
    public final void m28887c(MotionEvent motionEvent) {
        if (this.f94464g == null) {
            this.f94464g = MotionEvent.obtain(motionEvent);
        }
        MotionEvent motionEvent2 = this.f94465h;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f94465h = obtain;
        MotionEvent motionEvent3 = this.f94464g;
        if (motionEvent3 == null || obtain == null) {
            return;
        }
        this.f94462e = Float.valueOf(obtain.getX() - motionEvent3.getX());
        this.f94463f = Float.valueOf(obtain.getY() - motionEvent3.getY());
    }
}
