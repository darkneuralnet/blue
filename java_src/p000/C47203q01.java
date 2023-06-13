package p000;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lq01;", "LPx1;", "Li30;", "sink", "", "byteCount", "read", "", "close", "", "b", "Z", "shouldDeplete", "LAN5;", "delegate", "<init>", "(LAN5;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: q01  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47203q01 extends AbstractC35331Px1 {

    /* renamed from: b */
    public boolean f104470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47203q01(AN5 delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f104470b = true;
    }

    @Override // p000.AbstractC35331Px1, p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f104470b) {
            try {
                C34928Oe3.m91759d(delegate()).mo21941Z2(C34928Oe3.m91761b());
            } catch (IOException e) {
                InterfaceC32758Ex2.f8338a.error("An error occurred while depleting the source", e);
            }
        }
        this.f104470b = false;
        super.close();
    }

    @Override // p000.AbstractC35331Px1, p000.AN5
    public long read(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long read = super.read(sink, j);
            if (read == -1) {
                this.f104470b = false;
            }
            return read;
        } catch (IOException e) {
            this.f104470b = false;
            throw e;
        }
    }
}
