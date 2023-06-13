package p000;

import android.util.Log;
import java.io.Writer;
/* renamed from: wx2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51324wx2 extends Writer {

    /* renamed from: b */
    public final String f116888b;

    /* renamed from: c */
    public StringBuilder f116889c = new StringBuilder(128);

    public C51324wx2(String str) {
        this.f116888b = str;
    }

    /* renamed from: a */
    public final void m6062a() {
        if (this.f116889c.length() > 0) {
            Log.d(this.f116888b, this.f116889c.toString());
            StringBuilder sb = this.f116889c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m6062a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m6062a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m6062a();
            } else {
                this.f116889c.append(c);
            }
        }
    }
}
