package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* renamed from: ti */
/* loaded from: classes.dex */
public class C28802ti {

    /* renamed from: c */
    public static final int[] f110885c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f110886a;

    /* renamed from: b */
    public Bitmap f110887b;

    /* renamed from: ti$a */
    /* loaded from: classes.dex */
    public static class C28803a {
        private C28803a() {
        }

        /* renamed from: a */
        public static void m11903a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C28802ti(ProgressBar progressBar) {
        this.f110886a = progressBar;
    }

    /* renamed from: a */
    public final Shape m11907a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: b */
    public Bitmap m11906b() {
        return this.f110887b;
    }

    /* renamed from: c */
    public void mo4867c(AttributeSet attributeSet, int i) {
        Z46 m73747v = Z46.m73747v(this.f110886a.getContext(), attributeSet, f110885c, i, 0);
        Drawable m73761h = m73747v.m73761h(0);
        if (m73761h != null) {
            this.f110886a.setIndeterminateDrawable(m11904e(m73761h));
        }
        Drawable m73761h2 = m73747v.m73761h(1);
        if (m73761h2 != null) {
            this.f110886a.setProgressDrawable(m11905d(m73761h2, false));
        }
        m73747v.m73746w();
    }

    /* renamed from: d */
    public Drawable m11905d(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof ZG6) {
            ZG6 zg6 = (ZG6) drawable;
            Drawable m73376b = zg6.m73376b();
            if (m73376b != null) {
                zg6.m73377a(m11905d(m73376b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = m11905d(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                C28803a.m11903a(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f110887b == null) {
                this.f110887b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m11907a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable m11904e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m11905d = m11905d(animationDrawable.getFrame(i), true);
                m11905d.setLevel(10000);
                animationDrawable2.addFrame(m11905d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }
}
