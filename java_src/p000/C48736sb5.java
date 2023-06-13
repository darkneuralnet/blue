package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: sb5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48736sb5 extends Drawable implements InterfaceC32302Cy5 {

    /* renamed from: b */
    public C28360b f109027b;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public C48736sb5 mutate() {
        this.f109027b = new C28360b(this.f109027b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C28360b c28360b = this.f109027b;
        if (c28360b.f109029b) {
            c28360b.f109028a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f109027b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f109027b.f109028a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f109027b.f109028a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f109027b.f109028a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m1050e = C52886zb5.m1050e(iArr);
        C28360b c28360b = this.f109027b;
        if (c28360b.f109029b != m1050e) {
            c28360b.f109029b = m1050e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f109027b.f109028a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f109027b.f109028a.setColorFilter(colorFilter);
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        this.f109027b.f109028a.setShapeAppearanceModel(c43037iy5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.f109027b.f109028a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f109027b.f109028a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f109027b.f109028a.setTintMode(mode);
    }

    public C48736sb5(C43037iy5 c43037iy5) {
        this(new C28360b(new PM2(c43037iy5)));
    }

    /* renamed from: sb5$b */
    /* loaded from: classes6.dex */
    public static final class C28360b extends Drawable.ConstantState {

        /* renamed from: a */
        public PM2 f109028a;

        /* renamed from: b */
        public boolean f109029b;

        public C28360b(PM2 pm2) {
            this.f109028a = pm2;
            this.f109029b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public C48736sb5 newDrawable() {
            return new C48736sb5(new C28360b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public C28360b(C28360b c28360b) {
            this.f109028a = (PM2) c28360b.f109028a.getConstantState().newDrawable();
            this.f109029b = c28360b.f109029b;
        }
    }

    public C48736sb5(C28360b c28360b) {
        this.f109027b = c28360b;
    }
}
