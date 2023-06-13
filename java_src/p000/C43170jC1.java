package p000;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* renamed from: jC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43170jC1 {

    /* renamed from: a */
    public final InterfaceC24734a f92281a;

    /* renamed from: jC1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC24734a {
        /* renamed from: a */
        boolean mo31018a(MotionEvent motionEvent);
    }

    /* renamed from: jC1$b */
    /* loaded from: classes.dex */
    public static class C24735b implements InterfaceC24734a {

        /* renamed from: a */
        public final GestureDetector f92282a;

        public C24735b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f92282a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // p000.C43170jC1.InterfaceC24734a
        /* renamed from: a */
        public boolean mo31018a(MotionEvent motionEvent) {
            return this.f92282a.onTouchEvent(motionEvent);
        }
    }

    public C43170jC1(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m31019a(MotionEvent motionEvent) {
        return this.f92281a.mo31018a(motionEvent);
    }

    public C43170jC1(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f92281a = new C24735b(context, onGestureListener, handler);
    }
}
