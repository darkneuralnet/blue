package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
/* renamed from: mQ5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45079mQ5 {

    /* renamed from: a */
    public final int f97974a;

    /* renamed from: b */
    public final int f97975b;

    /* renamed from: c */
    public final long f97976c;

    /* renamed from: d */
    public final long f97977d;

    /* renamed from: e */
    public final long f97978e;

    /* renamed from: f */
    public final long f97979f;

    /* renamed from: g */
    public final long f97980g;

    /* renamed from: h */
    public final long f97981h;

    /* renamed from: i */
    public final long f97982i;

    /* renamed from: j */
    public final long f97983j;

    /* renamed from: k */
    public final int f97984k;

    /* renamed from: l */
    public final int f97985l;

    /* renamed from: m */
    public final int f97986m;

    /* renamed from: n */
    public final long f97987n;

    public C45079mQ5(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f97974a = i;
        this.f97975b = i2;
        this.f97976c = j;
        this.f97977d = j2;
        this.f97978e = j3;
        this.f97979f = j4;
        this.f97980g = j5;
        this.f97981h = j6;
        this.f97982i = j7;
        this.f97983j = j8;
        this.f97984k = i3;
        this.f97985l = i4;
        this.f97986m = i5;
        this.f97987n = j9;
    }

    /* renamed from: a */
    public void m25651a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f97974a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f97975b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f97975b / this.f97974a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f97976c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f97977d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f97984k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f97978e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f97981h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f97985l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f97979f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f97986m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f97980g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f97982i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f97983j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f97974a + ", size=" + this.f97975b + ", cacheHits=" + this.f97976c + ", cacheMisses=" + this.f97977d + ", downloadCount=" + this.f97984k + ", totalDownloadSize=" + this.f97978e + ", averageDownloadSize=" + this.f97981h + ", totalOriginalBitmapSize=" + this.f97979f + ", totalTransformedBitmapSize=" + this.f97980g + ", averageOriginalBitmapSize=" + this.f97982i + ", averageTransformedBitmapSize=" + this.f97983j + ", originalBitmapCount=" + this.f97985l + ", transformedBitmapCount=" + this.f97986m + ", timeStamp=" + this.f97987n + CoreConstants.CURLY_RIGHT;
    }
}
