package androidx.camera.core;
/* loaded from: classes.dex */
public class ImageCaptureException extends Exception {

    /* renamed from: b */
    public final int f52427b;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.f52427b = i;
    }

    /* renamed from: a */
    public int m69656a() {
        return this.f52427b;
    }
}
