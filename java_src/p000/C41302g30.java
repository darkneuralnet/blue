package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: g30  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41302g30 extends Drawable {

    /* renamed from: a */
    public final Drawable f81451a;

    /* renamed from: b */
    public final Drawable f81452b;

    /* renamed from: c */
    public int f81453c = -1;

    public C41302g30(Context context) {
        this.f81452b = NA0.m94299e(context, C31671Ag4.amu_bubble_mask);
        this.f81451a = NA0.m94299e(context, C31671Ag4.amu_bubble_shadow);
    }

    /* renamed from: a */
    public void m40249a(int i) {
        this.f81453c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f81452b.draw(canvas);
        canvas.drawColor(this.f81453c, PorterDuff.Mode.SRC_IN);
        this.f81451a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f81452b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        this.f81452b.setBounds(i, i2, i3, i4);
        this.f81451a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f81452b.setBounds(rect);
        this.f81451a.setBounds(rect);
    }
}
