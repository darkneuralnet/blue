package p000;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: B32 */
/* loaded from: classes6.dex */
public class B32 implements View.OnTouchListener {

    /* renamed from: b */
    public final Dialog f1573b;

    /* renamed from: c */
    public final int f1574c;

    /* renamed from: d */
    public final int f1575d;

    /* renamed from: e */
    public final int f1576e;

    public B32(Dialog dialog, Rect rect) {
        this.f1573b = dialog;
        this.f1574c = rect.left;
        this.f1575d = rect.top;
        this.f1576e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f1574c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f1575d + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f1576e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f1573b.onTouchEvent(obtain);
    }
}
