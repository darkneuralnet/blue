package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LVH4;", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "close", "LJ46;", "timeout", "Ljava/io/IOException;", "exception", C17296a.f69688o, "b", "()Lkotlin/Unit;", "Ljava/io/File;", "Ljava/io/File;", "downstreamFile", "LVH4$a;", "c", "LVH4$a;", "callback", DateTokenConverter.CONVERTER_KEY, "J", "writeByteLimit", "e", "totalByteCount", "", "f", "Z", "isFailure", "g", "isClosed", "h", "LwB5;", "downstream", "<init>", "(Ljava/io/File;LVH4$a;J)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VH4 */
/* loaded from: classes5.dex */
public final class VH4 implements InterfaceC50872wB5 {

    /* renamed from: b */
    public final File f38829b;

    /* renamed from: c */
    public final InterfaceC8595a f38830c;

    /* renamed from: d */
    public final long f38831d;

    /* renamed from: e */
    public long f38832e;

    /* renamed from: f */
    public boolean f38833f;

    /* renamed from: g */
    public boolean f38834g;

    /* renamed from: h */
    public InterfaceC50872wB5 f38835h;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, m28432d2 = {"LVH4$a;", "", "Ljava/io/File;", "file", "", "sourceByteCount", "", C17296a.f69688o, "Ljava/io/IOException;", "exception", "b", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: VH4$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC8595a {
        /* renamed from: a */
        void mo80019a(File file, long j);

        /* renamed from: b */
        void mo80018b(File file, IOException iOException);
    }

    public VH4(File file, InterfaceC8595a callback, long j) {
        InterfaceC50872wB5 m88279h;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f38829b = file;
        this.f38830c = callback;
        this.f38831d = j;
        InterfaceC50872wB5 interfaceC50872wB5 = null;
        if (file != null) {
            try {
                m88279h = C35396Qe3.m88279h(file, false, 1, null);
                interfaceC50872wB5 = m88279h;
            } catch (IOException e) {
                File file2 = this.f38829b;
                m80021a(new IOException("Failed to use file " + file2 + " by Chucker", e));
            }
        }
        this.f38835h = interfaceC50872wB5;
    }

    /* renamed from: a */
    public final void m80021a(IOException iOException) {
        if (!this.f38833f) {
            this.f38833f = true;
            m80020b();
            this.f38830c.mo80018b(this.f38829b, iOException);
        }
    }

    /* renamed from: b */
    public final Unit m80020b() {
        try {
            InterfaceC50872wB5 interfaceC50872wB5 = this.f38835h;
            if (interfaceC50872wB5 != null) {
                interfaceC50872wB5.close();
                return Unit.INSTANCE;
            }
            return null;
        } catch (IOException e) {
            m80021a(e);
            return Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f38834g) {
            return;
        }
        this.f38834g = true;
        m80020b();
        this.f38830c.mo80019a(this.f38829b, this.f38832e);
    }

    @Override // p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() {
        if (this.f38833f) {
            return;
        }
        try {
            InterfaceC50872wB5 interfaceC50872wB5 = this.f38835h;
            if (interfaceC50872wB5 != null) {
                interfaceC50872wB5.flush();
            }
        } catch (IOException e) {
            m80021a(e);
        }
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        J46 timeout;
        InterfaceC50872wB5 interfaceC50872wB5 = this.f38835h;
        return (interfaceC50872wB5 == null || (timeout = interfaceC50872wB5.timeout()) == null) ? J46.NONE : timeout;
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = this.f38832e;
        this.f38832e = j2 + j;
        if (!this.f38833f) {
            long j3 = this.f38831d;
            if (j2 < j3) {
                if (j2 + j > j3) {
                    j = j3 - j2;
                }
                if (j == 0) {
                    return;
                }
                try {
                    InterfaceC50872wB5 interfaceC50872wB5 = this.f38835h;
                    if (interfaceC50872wB5 != null) {
                        interfaceC50872wB5.write(source, j);
                    }
                } catch (IOException e) {
                    m80021a(e);
                }
            }
        }
    }
}
