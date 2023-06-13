package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012$\b\u0002\u0010*\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002RH\u0010\u000f\u001a6\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\bj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R3\u0010*\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\bj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LOc1;", "LMI4;", "", "path", "Ljava/net/URL;", "s", "Lkotlin/Function3;", "LWT2;", "", "Lkotlin/Pair;", "", "Lcom/github/kittinunf/fuel/core/Parameters;", "LpI4;", "b", "Lkotlin/jvm/functions/Function3;", "encoder", "c", "Lkotlin/Lazy;", "getRequest", "()LpI4;", "request", "LLH1;", DateTokenConverter.CONVERTER_KEY, "LLH1;", "defaultHeaders", "e", "LWT2;", "t", "()LWT2;", "httpMethod", "f", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "urlString", "g", "getBaseUrlString", "baseUrlString", "h", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "parameters", "<init>", "(LWT2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Oc1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34908Oc1 implements MI4 {

    /* renamed from: b */
    public final Function3<WT2, String, List<? extends Pair<String, ? extends Object>>, InterfaceC46785pI4> f26891b;

    /* renamed from: c */
    public final Lazy f26892c;

    /* renamed from: d */
    public final LH1 f26893d;

    /* renamed from: e */
    public final WT2 f26894e;

    /* renamed from: f */
    public final String f26895f;

    /* renamed from: g */
    public final String f26896g;

    /* renamed from: h */
    public final List<Pair<String, Object>> f26897h;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LWT2;", "method", "", "path", "", "Lkotlin/Pair;", "", "Lcom/github/kittinunf/fuel/core/Parameters;", "parameters", "LtY0;", C17296a.f69688o, "(LWT2;Ljava/lang/String;Ljava/util/List;)LtY0;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Oc1$a */
    /* loaded from: classes5.dex */
    public static final class C6056a extends Lambda implements Function3<WT2, String, List<? extends Pair<? extends String, ? extends Object>>, C49296tY0> {
        public C6056a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final C49296tY0 invoke(WT2 method, String path, List<? extends Pair<String, ? extends Object>> list) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            URL m91854s = C34908Oc1.this.m91854s(path);
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return new C49296tY0(method, m91854s, LH1.f21034f.m97403c(C34908Oc1.this.f26893d), list, null, null, null, 112, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LpI4;", "b", "()LpI4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Oc1$b */
    /* loaded from: classes5.dex */
    public static final class C6057b extends Lambda implements Function0<InterfaceC46785pI4> {
        public C6057b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC46785pI4 invoke() {
            return (InterfaceC46785pI4) C34908Oc1.this.f26891b.invoke(C34908Oc1.this.m91853t(), C34908Oc1.this.m91852u(), C34908Oc1.this.getParameters());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34908Oc1(WT2 httpMethod, String urlString, String str, List<? extends Pair<String, ? extends Object>> list) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f26894e = httpMethod;
        this.f26895f = urlString;
        this.f26896g = str;
        this.f26897h = list;
        this.f26891b = new C6056a();
        lazy = LazyKt__LazyJVMKt.lazy(new C6057b());
        this.f26892c = lazy;
        this.f26893d = LH1.f21034f.m97402d(new Pair[0]);
    }

    public final List<Pair<String, Object>> getParameters() {
        return this.f26897h;
    }

    @Override // p000.MI4
    public InterfaceC46785pI4 getRequest() {
        return (InterfaceC46785pI4) this.f26892c.getValue();
    }

    /* renamed from: s */
    public final URL m91854s(String str) {
        boolean endsWith$default;
        boolean startsWith$default;
        URL url;
        URI uri;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            String str2 = this.f26896g;
            if (str2 == null) {
                str2 = "";
            }
            boolean z = false;
            endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) str2, (char) JsonPointer.SEPARATOR, false, 2, (Object) null);
            if (endsWith$default) {
                str2 = str2.substring(0, str2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            startsWith$default = StringsKt__StringsKt.startsWith$default((CharSequence) str, (char) JsonPointer.SEPARATOR, false, 2, (Object) null);
            if (str.length() == 0) {
                z = true;
            }
            if (!(startsWith$default | z)) {
                str = JsonPointer.SEPARATOR + str;
            }
            sb.append(str);
            url = new URL(sb.toString());
        }
        try {
            uri = url.toURI();
        } catch (URISyntaxException unused2) {
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        return new URL(uri.toASCIIString());
    }

    /* renamed from: t */
    public final WT2 m91853t() {
        return this.f26894e;
    }

    /* renamed from: u */
    public final String m91852u() {
        return this.f26895f;
    }

    public /* synthetic */ C34908Oc1(WT2 wt2, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wt2, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
