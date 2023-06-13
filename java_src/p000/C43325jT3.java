package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import kotlin.KotlinVersion;
import p000.C42732iT3;
/* renamed from: jT3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43325jT3 extends BitmapDrawable {

    /* renamed from: h */
    public static final Paint f92752h = new Paint();

    /* renamed from: a */
    public final boolean f92753a;

    /* renamed from: b */
    public final float f92754b;

    /* renamed from: c */
    public final C42732iT3.EnumC23266e f92755c;

    /* renamed from: d */
    public Drawable f92756d;

    /* renamed from: e */
    public long f92757e;

    /* renamed from: f */
    public boolean f92758f;

    /* renamed from: g */
    public int f92759g;

    public C43325jT3(Context context, Bitmap bitmap, Drawable drawable, C42732iT3.EnumC23266e enumC23266e, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3;
        this.f92759g = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f92753a = z2;
        this.f92754b = context.getResources().getDisplayMetrics().density;
        this.f92755c = enumC23266e;
        if (enumC23266e != C42732iT3.EnumC23266e.MEMORY && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f92756d = drawable;
            this.f92758f = true;
            this.f92757e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: b */
    public static Path m30582b(int i, int i2, int i3) {
        Path path = new Path();
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        path.lineTo(i + i3, f2);
        path.lineTo(f, i2 + i3);
        return path;
    }

    /* renamed from: c */
    public static void m30581c(ImageView imageView, Context context, Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C43325jT3(context, bitmap, drawable, enumC23266e, z, z2));
    }

    /* renamed from: d */
    public static void m30580d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    public final void m30583a(Canvas canvas) {
        Paint paint = f92752h;
        paint.setColor(-1);
        canvas.drawPath(m30582b(0, 0, (int) (this.f92754b * 16.0f)), paint);
        paint.setColor(this.f92755c.f87389b);
        canvas.drawPath(m30582b(0, 0, (int) (this.f92754b * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f92758f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f92757e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f92758f = false;
                this.f92756d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f92756d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f92759g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f92759g);
            }
        }
        if (this.f92753a) {
            m30583a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f92756d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f92759g = i;
        Drawable drawable = this.f92756d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f92756d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
