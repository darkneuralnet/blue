package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.recyclerview.widget.C11925l;
import kotlin.KotlinVersion;
/* renamed from: gQ6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41522gQ6 extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public int f82155b;

    /* renamed from: c */
    public long f82156c;

    /* renamed from: d */
    public int f82157d;

    /* renamed from: e */
    public int f82158e;

    /* renamed from: f */
    public int f82159f;

    /* renamed from: g */
    public int f82160g;

    /* renamed from: h */
    public boolean f82161h;

    /* renamed from: i */
    public boolean f82162i;

    /* renamed from: j */
    public C40929fQ6 f82163j;

    /* renamed from: k */
    public Drawable f82164k;

    /* renamed from: l */
    public Drawable f82165l;

    /* renamed from: m */
    public boolean f82166m;

    /* renamed from: n */
    public boolean f82167n;

    /* renamed from: o */
    public boolean f82168o;

    /* renamed from: p */
    public int f82169p;

    public C41522gQ6(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? C39744dQ6.f76581a : drawable;
        this.f82164k = drawable;
        drawable.setCallback(this);
        C40929fQ6 c40929fQ6 = this.f82163j;
        c40929fQ6.f80108b = drawable.getChangingConfigurations() | c40929fQ6.f80108b;
        drawable2 = drawable2 == null ? C39744dQ6.f76581a : drawable2;
        this.f82165l = drawable2;
        drawable2.setCallback(this);
        C40929fQ6 c40929fQ62 = this.f82163j;
        c40929fQ62.f80108b = drawable2.getChangingConfigurations() | c40929fQ62.f80108b;
    }

    /* renamed from: a */
    public final Drawable m39486a() {
        return this.f82165l;
    }

    /* renamed from: b */
    public final void m39485b(int i) {
        this.f82157d = this.f82158e;
        this.f82160g = 0;
        this.f82159f = C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION;
        this.f82155b = 1;
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean m39484c() {
        if (!this.f82166m) {
            boolean z = false;
            if (this.f82164k.getConstantState() != null && this.f82165l.getConstantState() != null) {
                z = true;
            }
            this.f82167n = z;
            this.f82166m = true;
        }
        return this.f82167n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i = this.f82155b;
        int i2 = 0;
        boolean z = true;
        if (i != 1) {
            if (i == 2 && this.f82156c >= 0) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f82156c)) / this.f82159f;
                if (uptimeMillis < 1.0f) {
                    z = false;
                }
                if (z) {
                    this.f82155b = 0;
                }
                this.f82160g = (int) ((this.f82157d * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            }
        } else {
            this.f82156c = SystemClock.uptimeMillis();
            this.f82155b = 2;
            z = false;
        }
        int i3 = this.f82160g;
        boolean z2 = this.f82161h;
        Drawable drawable = this.f82164k;
        Drawable drawable2 = this.f82165l;
        if (z) {
            if (!z2) {
                i2 = i3;
            }
            drawable.draw(canvas);
            i3 = i2;
            int i4 = this.f82158e;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.f82158e - i3);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.f82158e);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f82158e);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C40929fQ6 c40929fQ6 = this.f82163j;
        return changingConfigurations | c40929fQ6.f80107a | c40929fQ6.f80108b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (m39484c()) {
            this.f82163j.f80107a = getChangingConfigurations();
            return this.f82163j;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f82164k.getIntrinsicHeight(), this.f82165l.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f82164k.getIntrinsicWidth(), this.f82165l.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f82168o) {
            this.f82169p = Drawable.resolveOpacity(this.f82164k.getOpacity(), this.f82165l.getOpacity());
            this.f82168o = true;
        }
        return this.f82169p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f82162i && super.mutate() == this) {
            if (m39484c()) {
                this.f82164k.mutate();
                this.f82165l.mutate();
                this.f82162i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f82164k.setBounds(rect);
        this.f82165l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f82160g == this.f82158e) {
            this.f82160g = i;
        }
        this.f82158e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f82164k.setColorFilter(colorFilter);
        this.f82165l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public C41522gQ6(C40929fQ6 c40929fQ6) {
        this.f82155b = 0;
        this.f82158e = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f82160g = 0;
        this.f82161h = true;
        this.f82163j = new C40929fQ6(c40929fQ6);
    }
}
