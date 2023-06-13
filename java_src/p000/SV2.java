package p000;

import android.view.MotionEvent;
/* renamed from: SV2 */
/* loaded from: classes.dex */
public final class SV2 {
    private SV2() {
    }

    @Deprecated
    /* renamed from: a */
    public static int m85343a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m85342b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: c */
    public static int m85341c(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: d */
    public static float m85340d(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: e */
    public static boolean m85339e(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
