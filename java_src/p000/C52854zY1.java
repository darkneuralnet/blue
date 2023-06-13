package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* renamed from: zY1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52854zY1 {
    /* renamed from: a */
    public <Z> AbstractC33662It6<ImageView, Z> m1180a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C10716aU(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new U61(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
