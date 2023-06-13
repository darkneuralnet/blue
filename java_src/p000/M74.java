package p000;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R$\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LM74;", "Ljava/io/OutputStream;", "LZI4;", "Lcom/facebook/GraphRequest;", "currentRequest", "", C17296a.f69688o, "", "LdJ4;", DateTokenConverter.CONVERTER_KEY, "", "size", "b", "", "buffer", "write", "", "offset", "length", "oneByte", "", "Ljava/util/Map;", "progressMap", "c", "Lcom/facebook/GraphRequest;", "LdJ4;", "currentRequestProgress", "<set-?>", "e", "I", "()I", "maxProgress", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroid/os/Handler;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: M74 */
/* loaded from: classes5.dex */
public final class M74 extends OutputStream implements ZI4 {

    /* renamed from: b */
    public final Map<GraphRequest, C39679dJ4> f22659b = new HashMap();

    /* renamed from: c */
    public GraphRequest f22660c;

    /* renamed from: d */
    public C39679dJ4 f22661d;

    /* renamed from: e */
    public int f22662e;

    /* renamed from: f */
    public final Handler f22663f;

    public M74(Handler handler) {
        this.f22663f = handler;
    }

    @Override // p000.ZI4
    /* renamed from: a */
    public void mo73316a(GraphRequest graphRequest) {
        C39679dJ4 c39679dJ4;
        this.f22660c = graphRequest;
        if (graphRequest != null) {
            c39679dJ4 = this.f22659b.get(graphRequest);
        } else {
            c39679dJ4 = null;
        }
        this.f22661d = c39679dJ4;
    }

    /* renamed from: b */
    public final void m95770b(long j) {
        GraphRequest graphRequest = this.f22660c;
        if (graphRequest != null) {
            if (this.f22661d == null) {
                C39679dJ4 c39679dJ4 = new C39679dJ4(this.f22663f, graphRequest);
                this.f22661d = c39679dJ4;
                this.f22659b.put(graphRequest, c39679dJ4);
            }
            C39679dJ4 c39679dJ42 = this.f22661d;
            if (c39679dJ42 != null) {
                c39679dJ42.m44402b(j);
            }
            this.f22662e += (int) j;
        }
    }

    /* renamed from: c */
    public final int m95769c() {
        return this.f22662e;
    }

    /* renamed from: d */
    public final Map<GraphRequest, C39679dJ4> m95768d() {
        return this.f22659b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        m95770b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        m95770b(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m95770b(1L);
    }
}
