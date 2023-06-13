package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: BL6 */
/* loaded from: classes6.dex */
public abstract class BL6 implements Closeable {
    /* renamed from: a */
    public abstract long mo97073a();

    /* renamed from: b */
    public abstract InputStream mo97072b(long j, long j2) throws IOException;

    /* renamed from: c */
    public final synchronized InputStream m114086c() throws IOException {
        return mo97072b(0L, mo97073a());
    }
}
