package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41927h62;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Li62;", "Lh62$a;", "LL12;", "request", "LM12;", C17296a.f69688o, "", "Lh62;", "Ljava/util/List;", "interceptors", "", "b", "I", "index", "c", "LL12;", "<init>", "(Ljava/util/List;ILL12;)V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: i62  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42520i62 implements InterfaceC41927h62.InterfaceC22551a {

    /* renamed from: a */
    public final List<InterfaceC41927h62> f86752a;

    /* renamed from: b */
    public final int f86753b;

    /* renamed from: c */
    public final L12 f86754c;

    /* JADX WARN: Multi-variable type inference failed */
    public C42520i62(List<? extends InterfaceC41927h62> interceptors, int i, L12 request) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f86752a = interceptors;
        this.f86753b = i;
        this.f86754c = request;
    }

    @Override // p000.InterfaceC41927h62.InterfaceC22551a
    /* renamed from: a */
    public M12 mo34447a(L12 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f86753b == this.f86752a.size()) {
            return new M12(request.m97926c().invoke(), request.m97925d(), request.m97927b(), request.m97928a());
        }
        return this.f86752a.get(this.f86753b).mo36851a(new C42520i62(this.f86752a, this.f86753b + 1, request));
    }

    @Override // p000.InterfaceC41927h62.InterfaceC22551a
    public L12 request() {
        return this.f86754c;
    }
}
