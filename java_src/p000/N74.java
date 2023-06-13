package p000;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.VD1;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0#\u0012\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0017\u0010'\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b \u0010\u0018¨\u0006,"}, m28432d2 = {"LN74;", "Ljava/io/FilterOutputStream;", "LZI4;", "Lcom/facebook/GraphRequest;", "request", "", C17296a.f69688o, "", "buffer", "write", "", "offset", "length", "oneByte", "close", "", "size", "c", "g", "b", "J", "threshold", "<set-?>", DateTokenConverter.CONVERTER_KEY, "()J", "batchProgress", "lastReportedProgress", "LdJ4;", "e", "LdJ4;", "currentRequestProgress", "LVD1;", "f", "LVD1;", "requests", "", "Ljava/util/Map;", "progressMap", "h", "maxProgress", "Ljava/io/OutputStream;", "out", "<init>", "(Ljava/io/OutputStream;LVD1;Ljava/util/Map;J)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: N74 */
/* loaded from: classes5.dex */
public final class N74 extends FilterOutputStream implements ZI4 {

    /* renamed from: b */
    public final long f24165b;

    /* renamed from: c */
    public long f24166c;

    /* renamed from: d */
    public long f24167d;

    /* renamed from: e */
    public C39679dJ4 f24168e;

    /* renamed from: f */
    public final VD1 f24169f;

    /* renamed from: g */
    public final Map<GraphRequest, C39679dJ4> f24170g;

    /* renamed from: h */
    public final long f24171h;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: N74$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC5478a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ VD1.InterfaceC8575a f24173c;

        public RunnableC5478a(VD1.InterfaceC8575a interfaceC8575a) {
            this.f24173c = interfaceC8575a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                ((VD1.InterfaceC8577c) this.f24173c).m80209b(N74.this.f24169f, N74.this.m94347d(), N74.this.m94346f());
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N74(OutputStream out, VD1 requests, Map<GraphRequest, C39679dJ4> progressMap, long j) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f24169f = requests;
        this.f24170g = progressMap;
        this.f24171h = j;
        this.f24165b = C17216a.m52726t();
    }

    @Override // p000.ZI4
    /* renamed from: a */
    public void mo73316a(GraphRequest graphRequest) {
        this.f24168e = graphRequest != null ? this.f24170g.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final void m94348c(long j) {
        C39679dJ4 c39679dJ4 = this.f24168e;
        if (c39679dJ4 != null) {
            c39679dJ4.m44403a(j);
        }
        long j2 = this.f24166c + j;
        this.f24166c = j2;
        if (j2 >= this.f24167d + this.f24165b || j2 >= this.f24171h) {
            m94345g();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        for (C39679dJ4 c39679dJ4 : this.f24170g.values()) {
            c39679dJ4.m44401c();
        }
        m94345g();
    }

    /* renamed from: d */
    public final long m94347d() {
        return this.f24166c;
    }

    /* renamed from: f */
    public final long m94346f() {
        return this.f24171h;
    }

    /* renamed from: g */
    public final void m94345g() {
        if (this.f24166c > this.f24167d) {
            for (VD1.InterfaceC8575a interfaceC8575a : this.f24169f.m80213w()) {
                if (interfaceC8575a instanceof VD1.InterfaceC8577c) {
                    Handler m80214v = this.f24169f.m80214v();
                    if (m80214v != null) {
                        m80214v.post(new RunnableC5478a(interfaceC8575a));
                    } else {
                        ((VD1.InterfaceC8577c) interfaceC8575a).m80209b(this.f24169f, this.f24166c, this.f24171h);
                    }
                }
            }
            this.f24167d = this.f24166c;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        m94348c(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i, i2);
        m94348c(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        m94348c(1L);
    }
}
