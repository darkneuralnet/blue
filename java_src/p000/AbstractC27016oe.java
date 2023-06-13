package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* renamed from: oe */
/* loaded from: classes.dex */
public abstract class AbstractC27016oe {
    Animatable2.AnimationCallback mPlatformCallback;

    /* renamed from: oe$a */
    /* loaded from: classes.dex */
    public class C27017a extends Animatable2.AnimationCallback {
        public C27017a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            AbstractC27016oe.this.onAnimationEnd(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            AbstractC27016oe.this.onAnimationStart(drawable);
        }
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new C27017a();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
