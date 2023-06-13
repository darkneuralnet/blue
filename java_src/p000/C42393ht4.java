package p000;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001a>\u0010\u0006\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"LrA1;", "manager", "Lkotlin/Function1;", "Lkotlin/Function2;", "LpI4;", "LFM4;", "b", "", "", C17296a.f69688o, "Ljava/util/List;", "redirectStatusWithGets", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: ht4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42393ht4 {

    /* renamed from: a */
    public static final List<Integer> f86062a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Function2;", "LpI4;", "LFM4;", "next", C17296a.f69688o, "(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: ht4$a */
    /* loaded from: classes5.dex */
    public static final class C22787a extends Lambda implements Function1<Function2<? super InterfaceC46785pI4, ? super FM4, ? extends FM4>, Function2<? super InterfaceC46785pI4, ? super FM4, ? extends FM4>> {

        /* renamed from: g */
        public final /* synthetic */ C47896rA1 f86063g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LpI4;", "request", "LFM4;", "response", C17296a.f69688o, "(LpI4;LFM4;)LFM4;"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: ht4$a$a */
        /* loaded from: classes5.dex */
        public static final class C22788a extends Lambda implements Function2<InterfaceC46785pI4, FM4, FM4> {

            /* renamed from: h */
            public final /* synthetic */ Function2 f86065h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22788a(Function2 function2) {
                super(2);
                this.f86065h = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final FM4 invoke(InterfaceC46785pI4 request, FM4 response) {
                Object lastOrNull;
                boolean z;
                List split$default;
                Object first;
                URL url;
                WT2 mo8555m;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(response, "response");
                if (JM4.m100647c(response) && !Intrinsics.areEqual(request.mo8565c().m102551a(), Boolean.FALSE)) {
                    Collection<String> m107283a = response.m107283a(HttpHeader.LOCATION);
                    if (m107283a.isEmpty()) {
                        m107283a = response.m107283a("Content-Location");
                    }
                    lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(m107283a);
                    String str = (String) lastOrNull;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'?'}, false, 0, 6, (Object) null);
                        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) split$default);
                        if (new URI((String) first).isAbsolute()) {
                            url = new URL(str);
                        } else {
                            url = new URL(request.mo8567a(), str);
                        }
                        if (C42393ht4.f86062a.contains(Integer.valueOf(response.m107280d()))) {
                            mo8555m = WT2.GET;
                        } else {
                            mo8555m = request.mo8555m();
                        }
                        String url2 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(url2, "newUrl.toString()");
                        InterfaceC46785pI4 mo8561g = C22787a.this.f86063g.m16317n(new C34908Oc1(mo8555m, url2, null, null, 12, null)).mo8561g(LH1.f21034f.m97403c(request.getHeaders()));
                        if (!Intrinsics.areEqual(url.getHost(), request.mo8567a().getHost())) {
                            mo8561g.getHeaders().remove("Authorization");
                        }
                        InterfaceC46785pI4 mo8558j = mo8561g.mo8563e(request.mo8565c().m102544h()).mo8558j(request.mo8565c().m102542j());
                        if (mo8555m == request.mo8555m() && !request.mo8554n().isEmpty() && !request.mo8554n().mo12264g()) {
                            mo8558j = mo8558j.mo8556l(request.mo8554n());
                        }
                        return (FM4) this.f86065h.invoke(request, mo8558j.mo8560h().getSecond());
                    }
                    return (FM4) this.f86065h.invoke(request, response);
                }
                return (FM4) this.f86065h.invoke(request, response);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22787a(C47896rA1 c47896rA1) {
            super(1);
            this.f86063g = c47896rA1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Function2<InterfaceC46785pI4, FM4, FM4> invoke(Function2<? super InterfaceC46785pI4, ? super FM4, FM4> next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return new C22788a(next);
        }
    }

    static {
        List<Integer> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((int) Constants.BUCKET_REDIRECT_STATUS_CODE), 302, 303});
        f86062a = listOf;
    }

    /* renamed from: b */
    public static final Function1<Function2<? super InterfaceC46785pI4, ? super FM4, FM4>, Function2<InterfaceC46785pI4, FM4, FM4>> m35624b(C47896rA1 manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new C22787a(manager);
    }
}
