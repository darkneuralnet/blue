package p000;

import com.bumptech.glide.integration.webp.WebpFrame;
/* renamed from: KA6 */
/* loaded from: classes5.dex */
public class KA6 {

    /* renamed from: a */
    public final int f19228a;

    /* renamed from: b */
    public final int f19229b;

    /* renamed from: c */
    public final int f19230c;

    /* renamed from: d */
    public final int f19231d;

    /* renamed from: e */
    public final int f19232e;

    /* renamed from: f */
    public final int f19233f;

    /* renamed from: g */
    public final boolean f19234g;

    /* renamed from: h */
    public final boolean f19235h;

    public KA6(int i, WebpFrame webpFrame) {
        this.f19228a = i;
        this.f19229b = webpFrame.getXOffest();
        this.f19230c = webpFrame.getYOffest();
        this.f19231d = webpFrame.getWidth();
        this.f19232e = webpFrame.getHeight();
        this.f19233f = webpFrame.getDurationMs();
        this.f19234g = webpFrame.isBlendWithPreviousFrame();
        this.f19235h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public String toString() {
        return "frameNumber=" + this.f19228a + ", xOffset=" + this.f19229b + ", yOffset=" + this.f19230c + ", width=" + this.f19231d + ", height=" + this.f19232e + ", duration=" + this.f19233f + ", blendPreviousFrame=" + this.f19234g + ", disposeBackgroundColor=" + this.f19235h;
    }
}
