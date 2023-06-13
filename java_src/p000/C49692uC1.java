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
import p000.AC1;
/* renamed from: uC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49692uC1 extends Drawable implements AC1.InterfaceC0049b, Animatable {

    /* renamed from: b */
    public final C29117a f111946b;

    /* renamed from: c */
    public boolean f111947c;

    /* renamed from: d */
    public boolean f111948d;

    /* renamed from: e */
    public boolean f111949e;

    /* renamed from: f */
    public boolean f111950f;

    /* renamed from: g */
    public int f111951g;

    /* renamed from: h */
    public int f111952h;

    /* renamed from: i */
    public boolean f111953i;

    /* renamed from: j */
    public Paint f111954j;

    /* renamed from: k */
    public Rect f111955k;

    /* renamed from: l */
    public List<AbstractC27016oe> f111956l;

    /* renamed from: uC1$a */
    /* loaded from: classes5.dex */
    public static final class C29117a extends Drawable.ConstantState {

        /* renamed from: a */
        public final AC1 f111957a;

        public C29117a(AC1 ac1) {
            this.f111957a = ac1;
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
            return new C49692uC1(this);
        }
    }

    public C49692uC1(Context context, InterfaceC49099tC1 interfaceC49099tC1, InterfaceC47891r96<Bitmap> interfaceC47891r96, int i, int i2, Bitmap bitmap) {
        this(new C29117a(new AC1(ComponentCallbacks2C17096a.m53155c(context), interfaceC49099tC1, i, i2, interfaceC47891r96, bitmap)));
    }

    @Override // p000.AC1.InterfaceC0049b
    /* renamed from: a */
    public void mo10661a() {
        if (m10660b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m10655g() == m10656f() - 1) {
            this.f111951g++;
        }
        int i = this.f111952h;
        if (i != -1 && this.f111951g >= i) {
            m10652j();
            stop();
        }
    }

    /* renamed from: b */
    public final Drawable.Callback m10660b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m10659c() {
        return this.f111946b.f111957a.m116031b();
    }

    /* renamed from: d */
    public final Rect m10658d() {
        if (this.f111955k == null) {
            this.f111955k = new Rect();
        }
        return this.f111955k;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f111949e) {
            return;
        }
        if (this.f111953i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m10658d());
            this.f111953i = false;
        }
        canvas.drawBitmap(this.f111946b.f111957a.m116030c(), (Rect) null, m10658d(), m10654h());
    }

    /* renamed from: e */
    public Bitmap m10657e() {
        return this.f111946b.f111957a.m116028e();
    }

    /* renamed from: f */
    public int m10656f() {
        return this.f111946b.f111957a.m116027f();
    }

    /* renamed from: g */
    public int m10655g() {
        return this.f111946b.f111957a.m116029d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f111946b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f111946b.f111957a.m116025h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f111946b.f111957a.m116022k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m10654h() {
        if (this.f111954j == null) {
            this.f111954j = new Paint(2);
        }
        return this.f111954j;
    }

    /* renamed from: i */
    public int m10653i() {
        return this.f111946b.f111957a.m116023j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f111947c;
    }

    /* renamed from: j */
    public final void m10652j() {
        List<AbstractC27016oe> list = this.f111956l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f111956l.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m10651k() {
        this.f111949e = true;
        this.f111946b.f111957a.m116032a();
    }

    /* renamed from: l */
    public final void m10650l() {
        this.f111951g = 0;
    }

    /* renamed from: m */
    public void m10649m(InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this.f111946b.f111957a.m116018o(interfaceC47891r96, bitmap);
    }

    /* renamed from: n */
    public final void m10648n() {
        C52865zZ3.m1114a(!this.f111949e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f111946b.f111957a.m116027f() == 1) {
            invalidateSelf();
        } else if (!this.f111947c) {
            this.f111947c = true;
            this.f111946b.f111957a.m116015r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m10647o() {
        this.f111947c = false;
        this.f111946b.f111957a.m116014s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f111953i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m10654h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m10654h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C52865zZ3.m1114a(!this.f111949e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f111950f = z;
        if (!z) {
            m10647o();
        } else if (this.f111948d) {
            m10648n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f111948d = true;
        m10650l();
        if (this.f111950f) {
            m10648n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f111948d = false;
        m10647o();
    }

    public C49692uC1(C29117a c29117a) {
        this.f111950f = true;
        this.f111952h = -1;
        this.f111946b = (C29117a) C52865zZ3.m1111d(c29117a);
    }
}
