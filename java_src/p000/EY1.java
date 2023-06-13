package p000;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
/* renamed from: EY1 */
/* loaded from: classes.dex */
public final class EY1 {
    private EY1() {
    }

    /* renamed from: a */
    public static void m108841a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: b */
    public static Image m108840b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: c */
    public static ImageWriter m108839c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: d */
    public static void m108838d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
