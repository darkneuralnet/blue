package p000;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR$\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LdJ4;", "", "", "size", "", C17296a.f69688o, "b", "c", "J", "threshold", "<set-?>", "getProgress", "()J", "progress", "lastReportedProgress", DateTokenConverter.CONVERTER_KEY, "getMaxProgress", "maxProgress", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "callbackHandler", "Lcom/facebook/GraphRequest;", "f", "Lcom/facebook/GraphRequest;", "request", "<init>", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: dJ4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39679dJ4 {

    /* renamed from: a */
    public final long f76417a;

    /* renamed from: b */
    public long f76418b;

    /* renamed from: c */
    public long f76419c;

    /* renamed from: d */
    public long f76420d;

    /* renamed from: e */
    public final Handler f76421e;

    /* renamed from: f */
    public final GraphRequest f76422f;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: dJ4$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC19726a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ GraphRequest.InterfaceC17205b f76423b;

        /* renamed from: c */
        public final /* synthetic */ long f76424c;

        /* renamed from: d */
        public final /* synthetic */ long f76425d;

        public RunnableC19726a(GraphRequest.InterfaceC17205b interfaceC17205b, long j, long j2) {
            this.f76423b = interfaceC17205b;
            this.f76424c = j;
            this.f76425d = j2;
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
                ((GraphRequest.InterfaceC17209e) this.f76423b).m52777b(this.f76424c, this.f76425d);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public C39679dJ4(Handler handler, GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f76421e = handler;
        this.f76422f = request;
        this.f76417a = C17216a.m52726t();
    }

    /* renamed from: a */
    public final void m44403a(long j) {
        long j2 = this.f76418b + j;
        this.f76418b = j2;
        if (j2 >= this.f76419c + this.f76417a || j2 >= this.f76420d) {
            m44401c();
        }
    }

    /* renamed from: b */
    public final void m44402b(long j) {
        this.f76420d += j;
    }

    /* renamed from: c */
    public final void m44401c() {
        if (this.f76418b > this.f76419c) {
            GraphRequest.InterfaceC17205b m52834m = this.f76422f.m52834m();
            long j = this.f76420d;
            if (j > 0 && (m52834m instanceof GraphRequest.InterfaceC17209e)) {
                long j2 = this.f76418b;
                Handler handler = this.f76421e;
                if (handler != null) {
                    handler.post(new RunnableC19726a(m52834m, j2, j));
                } else {
                    ((GraphRequest.InterfaceC17209e) m52834m).m52777b(j2, j);
                }
                this.f76419c = this.f76418b;
            }
        }
    }
}
