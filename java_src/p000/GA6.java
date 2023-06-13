package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.nio.ByteBuffer;
import java.util.List;
import p000.LA6;
/* renamed from: GA6 */
/* loaded from: classes5.dex */
public class GA6 extends Drawable implements LA6.InterfaceC4754b, Animatable {

    /* renamed from: b */
    public final C2679a f11109b;

    /* renamed from: c */
    public boolean f11110c;

    /* renamed from: d */
    public boolean f11111d;

    /* renamed from: e */
    public boolean f11112e;

    /* renamed from: f */
    public boolean f11113f;

    /* renamed from: g */
    public int f11114g;

    /* renamed from: h */
    public int f11115h;

    /* renamed from: i */
    public boolean f11116i;

    /* renamed from: j */
    public Paint f11117j;

    /* renamed from: k */
    public Rect f11118k;

    /* renamed from: l */
    public List<AbstractC27016oe> f11119l;

    /* renamed from: GA6$a */
    /* loaded from: classes5.dex */
    public static class C2679a extends Drawable.ConstantState {

        /* renamed from: a */
        public final InterfaceC20044eU f11120a;

        /* renamed from: b */
        public final LA6 f11121b;

        public C2679a(InterfaceC20044eU interfaceC20044eU, LA6 la6) {
            this.f11120a = interfaceC20044eU;
            this.f11121b = la6;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GA6(this);
        }
    }

    public GA6(Context context, EA6 ea6, InterfaceC20044eU interfaceC20044eU, InterfaceC47891r96<Bitmap> interfaceC47891r96, int i, int i2, Bitmap bitmap) {
        this(new C2679a(interfaceC20044eU, new LA6(ComponentCallbacks2C17096a.m53155c(context), ea6, i, i2, interfaceC47891r96, bitmap)));
    }

    @Override // p000.LA6.InterfaceC4754b
    /* renamed from: a */
    public void mo97612a() {
        if (m105668b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m105663g() == m105664f() - 1) {
            this.f11114g++;
        }
        int i = this.f11115h;
        if (i != -1 && this.f11114g >= i) {
            stop();
            m105659k();
        }
    }

    /* renamed from: b */
    public final Drawable.Callback m105668b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m105667c() {
        return this.f11109b.f11121b.m97633b();
    }

    /* renamed from: d */
    public final Rect m105666d() {
        if (this.f11118k == null) {
            this.f11118k = new Rect();
        }
        return this.f11118k;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (m105660j()) {
            return;
        }
        if (this.f11116i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m105666d());
            this.f11116i = false;
        }
        canvas.drawBitmap(this.f11109b.f11121b.m97632c(), (Rect) null, m105666d(), m105662h());
    }

    /* renamed from: e */
    public Bitmap m105665e() {
        return this.f11109b.f11121b.m97630e();
    }

    /* renamed from: f */
    public int m105664f() {
        return this.f11109b.f11121b.m97629f();
    }

    /* renamed from: g */
    public int m105663g() {
        return this.f11109b.f11121b.m97631d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f11109b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11109b.f11121b.m97627h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11109b.f11121b.m97623l();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m105662h() {
        if (this.f11117j == null) {
            this.f11117j = new Paint(2);
        }
        return this.f11117j;
    }

    /* renamed from: i */
    public int m105661i() {
        return this.f11109b.f11121b.m97624k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f11110c;
    }

    /* renamed from: j */
    public boolean m105660j() {
        return this.f11112e;
    }

    /* renamed from: k */
    public final void m105659k() {
        List<AbstractC27016oe> list = this.f11119l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f11119l.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: l */
    public void m105658l() {
        this.f11112e = true;
        this.f11109b.f11121b.m97634a();
    }

    /* renamed from: m */
    public final void m105657m() {
        this.f11114g = 0;
    }

    /* renamed from: n */
    public void m105656n(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to LOOP_FOREVER, or equal to LOOP_INTRINSIC");
        }
        if (i == 0) {
            int m97626i = this.f11109b.f11121b.m97626i();
            if (m97626i != 0) {
                i2 = m97626i;
            }
            this.f11115h = i2;
            return;
        }
        this.f11115h = i;
    }

    /* renamed from: o */
    public final void m105655o() {
        C52865zZ3.m1114a(!this.f11112e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f11109b.f11121b.m97629f() == 1) {
            invalidateSelf();
        } else if (!this.f11110c) {
            this.f11110c = true;
            this.f11109b.f11121b.m97616s(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11116i = true;
    }

    /* renamed from: p */
    public final void m105654p() {
        this.f11110c = false;
        this.f11109b.f11121b.m97615t(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m105662h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m105662h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C52865zZ3.m1114a(!this.f11112e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f11113f = z;
        if (!z) {
            m105654p();
        } else if (this.f11111d) {
            m105655o();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f11111d = true;
        m105657m();
        if (this.f11113f) {
            m105655o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f11111d = false;
        m105654p();
    }

    public GA6(C2679a c2679a) {
        this.f11115h = -1;
        this.f11113f = true;
        this.f11109b = (C2679a) C52865zZ3.m1111d(c2679a);
        m105656n(0);
    }
}
