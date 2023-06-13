package p000;

import org.joda.time.DateTimeConstants;
/* renamed from: ZL6 */
/* loaded from: classes8.dex */
public enum ZL6 {
    HTTP_CONNECT_TIMEOUT(DateTimeConstants.MILLIS_PER_MINUTE),
    HTTP_READ_TIMEOUT(DateTimeConstants.MILLIS_PER_MINUTE),
    READ_BYTE(1024);
    

    /* renamed from: b */
    public final int f48377b;

    ZL6(int i) {
        this.f48377b = i;
    }

    /* renamed from: a */
    public int m73250a() {
        return this.f48377b;
    }
}
