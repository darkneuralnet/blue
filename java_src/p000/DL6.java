package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: DL6 */
/* loaded from: classes6.dex */
public final class DL6 extends BL6 {

    /* renamed from: b */
    public final BL6 f5543b;

    /* renamed from: c */
    public final long f5544c;

    /* renamed from: d */
    public final long f5545d;

    public DL6(BL6 bl6, long j, long j2) {
        this.f5543b = bl6;
        long m110566d = m110566d(j);
        this.f5544c = m110566d;
        this.f5545d = m110566d(m110566d + j2);
    }

    @Override // p000.BL6
    /* renamed from: a */
    public final long mo97073a() {
        return this.f5545d - this.f5544c;
    }

    @Override // p000.BL6
    /* renamed from: b */
    public final InputStream mo97072b(long j, long j2) throws IOException {
        long m110566d = m110566d(this.f5544c);
        return this.f5543b.mo97072b(m110566d, m110566d(j2 + m110566d) - m110566d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    /* renamed from: d */
    public final long m110566d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f5543b.mo97073a() ? this.f5543b.mo97073a() : j;
    }
}
