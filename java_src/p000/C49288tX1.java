package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* renamed from: tX1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49288tX1 {

    /* renamed from: a */
    public final List<ImageHeaderParser> f110623a = new ArrayList();

    /* renamed from: a */
    public synchronized void m12151a(ImageHeaderParser imageHeaderParser) {
        this.f110623a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> m12150b() {
        return this.f110623a;
    }
}
