package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* renamed from: B2 */
/* loaded from: classes.dex */
public class C0379B2 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1549a;

    /* renamed from: B2$a */
    /* loaded from: classes.dex */
    public static class C0380a {
        private C0380a() {
        }

        /* renamed from: a */
        public static void m114781a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0379B2(ActionBarContainer actionBarContainer) {
        this.f1549a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1549a;
        if (actionBarContainer.f51978i) {
            Drawable drawable = actionBarContainer.f51977h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f51975f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1549a;
        Drawable drawable3 = actionBarContainer2.f51976g;
        if (drawable3 != null && actionBarContainer2.f51979j) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1549a;
        if (actionBarContainer.f51978i) {
            if (actionBarContainer.f51977h != null) {
                C0380a.m114781a(actionBarContainer.f51975f, outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f51975f;
        if (drawable != null) {
            C0380a.m114781a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
