package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010G\u001a\u00020C\u0012\u0006\u0010M\u001a\u00020H\u0012\b\b\u0002\u0010R\u001a\u00020N\u0012 \b\u0002\u0010[\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0T0Sj\u0002`U\u0012\b\b\u0002\u0010a\u001a\u00020$\u0012\u0018\b\u0002\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010bj\u0002`c\u0012\u001c\b\u0002\u0010j\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030h\u0012\u0004\u0012\u00020\t0bj\u0002`i¢\u0006\u0004\bo\u0010pJ\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u001d\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002J\u0019\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0002J\u001a\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J@\u0010\u001c\u001a\u00020\u00012\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J6\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020$H\u0016JD\u0010.\u001a\u00020\u00012:\u0010-\u001a6\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+0&j\u0002`,H\u0016JD\u0010/\u001a\u00020\u00012:\u0010-\u001a6\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+0&j\u0002`,H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J0\u00106\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u000202\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002040301j\b\u0012\u0004\u0012\u00020\u001f`5H\u0016J\t\u00108\u001a\u000207HÖ\u0001J\u0013\u0010:\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010\tHÖ\u0003R\"\u0010B\u001a\u00020;8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010G\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\bE\u0010FR\"\u0010M\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010I\u001a\u0004\bJ\u0010K\"\u0004\b<\u0010LR\u001a\u0010R\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010O\u001a\u0004\bP\u0010QR:\u0010[\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0T0Sj\u0002`U8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bV\u0010ZR\"\u0010a\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010bj\u0002`c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010d\u001a\u0004\be\u0010fR(\u0010j\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030h\u0012\u0004\u0012\u00020\t0bj\u0002`i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010dR\u0014\u0010\"\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010^R\u0014\u0010n\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006q"}, m28432d2 = {"LtY0;", "LpI4;", "", "header", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "get", "values", "u", "", "value", "t", "s", "", "map", "g", "i", "Lkotlin/Function0;", "Ljava/io/InputStream;", "Lcom/github/kittinunf/fuel/core/BodySource;", "openStream", "", "Lcom/github/kittinunf/fuel/core/BodyLength;", "calculateLength", "Ljava/nio/charset/Charset;", "charset", "", "repeatable", "q", "stream", "o", "", "bytes", "r", "body", DateTokenConverter.CONVERTER_KEY, "LOY;", "l", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "readBytes", "totalBytes", "", "Lcom/github/kittinunf/fuel/core/ProgressCallback;", "handler", "e", "j", "toString", "Lkotlin/Triple;", "LFM4;", "LaN4;", "Lcom/github/kittinunf/fuel/core/FuelError;", "Lcom/github/kittinunf/fuel/core/ResponseResultOf;", "h", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "LII4;", "b", "LII4;", "c", "()LII4;", "p", "(LII4;)V", "executionOptions", "LWT2;", "LWT2;", "m", "()LWT2;", "method", "Ljava/net/URL;", "Ljava/net/URL;", C17296a.f69688o, "()Ljava/net/URL;", "(Ljava/net/URL;)V", "url", "LLH1;", "LLH1;", "getHeaders", "()LLH1;", "headers", "", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/Parameters;", "f", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "(Ljava/util/List;)V", "parameters", "LOY;", "get_body$fuel", "()LOY;", "set_body$fuel", "(LOY;)V", "_body", "", "Lcom/github/kittinunf/fuel/core/RequestFeatures;", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "enabledFeatures", "Lkotlin/reflect/KClass;", "Lcom/github/kittinunf/fuel/core/Tags;", "tags", "n", "getRequest", "()LpI4;", "request", "<init>", "(LWT2;Ljava/net/URL;LLH1;Ljava/util/List;LOY;Ljava/util/Map;Ljava/util/Map;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: tY0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49296tY0 implements InterfaceC46785pI4 {

    /* renamed from: b */
    public II4 f110672b;

    /* renamed from: c */
    public final WT2 f110673c;

    /* renamed from: d */
    public URL f110674d;

    /* renamed from: e */
    public final LH1 f110675e;

    /* renamed from: f */
    public List<? extends Pair<String, ? extends Object>> f110676f;

    /* renamed from: g */
    public InterfaceC6029OY f110677g;

    /* renamed from: h */
    public final Map<String, InterfaceC46785pI4> f110678h;

    /* renamed from: i */
    public final Map<KClass<?>, Object> f110679i;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/io/InputStream;", "b", "()Ljava/io/InputStream;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tY0$a */
    /* loaded from: classes5.dex */
    public static final class C28775a extends Lambda implements Function0<InputStream> {

        /* renamed from: g */
        public final /* synthetic */ InputStream f110680g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28775a(InputStream inputStream) {
            super(0);
            this.f110680g = inputStream;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InputStream invoke() {
            return this.f110680g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()J"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tY0$b */
    /* loaded from: classes5.dex */
    public static final class C28776b extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ byte[] f110681g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28776b(byte[] bArr) {
            super(0);
            this.f110681g = bArr;
        }

        /* renamed from: b */
        public final long m12095b() {
            return this.f110681g.length;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m12095b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "key", "value", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tY0$c */
    /* loaded from: classes5.dex */
    public static final class C28777c extends Lambda implements Function2<String, String, StringBuilder> {

        /* renamed from: g */
        public final /* synthetic */ StringBuilder f110682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28777c(StringBuilder sb) {
            super(2);
            this.f110682g = sb;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final StringBuilder invoke(String key, String value) {
            StringBuilder appendln;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            StringBuilder sb = this.f110682g;
            sb.append(key + " : " + value);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            appendln = StringsKt__StringBuilderJVMKt.appendln(sb);
            return appendln;
        }
    }

    public C49296tY0(WT2 method, URL url, LH1 headers, List<? extends Pair<String, ? extends Object>> parameters, InterfaceC6029OY _body, Map<String, InterfaceC46785pI4> enabledFeatures, Map<KClass<?>, Object> tags) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(_body, "_body");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f110673c = method;
        this.f110674d = url;
        this.f110675e = headers;
        this.f110676f = parameters;
        this.f110677g = _body;
        this.f110678h = enabledFeatures;
        this.f110679i = tags;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: a */
    public URL mo8567a() {
        return this.f110674d;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: b */
    public void mo8566b(URL url) {
        Intrinsics.checkNotNullParameter(url, "<set-?>");
        this.f110674d = url;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: c */
    public II4 mo8565c() {
        II4 ii4 = this.f110672b;
        if (ii4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executionOptions");
        }
        return ii4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC46785pI4
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC46785pI4 mo8564d(String body, Charset charset) {
        Object lastOrNull;
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = body.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        InterfaceC46785pI4 m12100r = m12100r(bytes, charset);
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(m12099s("Content-Type"));
        CharSequence charSequence = (CharSequence) lastOrNull;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return mo8559i("Content-Type", "text/plain; charset=" + charset.name());
                }
                return m12100r;
            }
        }
        z = true;
        if (!z) {
        }
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: e */
    public InterfaceC46785pI4 mo8563e(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        mo8565c().m102544h().m104384c(handler);
        return getRequest();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49296tY0) {
                C49296tY0 c49296tY0 = (C49296tY0) obj;
                return Intrinsics.areEqual(mo8555m(), c49296tY0.mo8555m()) && Intrinsics.areEqual(mo8567a(), c49296tY0.mo8567a()) && Intrinsics.areEqual(getHeaders(), c49296tY0.getHeaders()) && Intrinsics.areEqual(getParameters(), c49296tY0.getParameters()) && Intrinsics.areEqual(this.f110677g, c49296tY0.f110677g) && Intrinsics.areEqual(mo8557k(), c49296tY0.mo8557k()) && Intrinsics.areEqual(this.f110679i, c49296tY0.f110679i);
            }
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: f */
    public void mo8562f(List<? extends Pair<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f110676f = list;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: g */
    public InterfaceC46785pI4 mo8561g(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        getHeaders().putAll(LH1.f21034f.m97403c(map));
        return getRequest();
    }

    @Override // p000.InterfaceC46785pI4
    public Collection<String> get(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return getHeaders().get(header);
    }

    @Override // p000.InterfaceC46785pI4
    public LH1 getHeaders() {
        return this.f110675e;
    }

    @Override // p000.InterfaceC46785pI4
    public List<Pair<String, Object>> getParameters() {
        return this.f110676f;
    }

    @Override // p000.MI4
    public InterfaceC46785pI4 getRequest() {
        return this;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: h */
    public Triple<InterfaceC46785pI4, FM4, AbstractC37918aN4<byte[], FuelError>> mo8560h() {
        return D01.m111164b(this, new C46086o70());
    }

    public int hashCode() {
        WT2 mo8555m = mo8555m();
        int hashCode = (mo8555m != null ? mo8555m.hashCode() : 0) * 31;
        URL mo8567a = mo8567a();
        int hashCode2 = (hashCode + (mo8567a != null ? mo8567a.hashCode() : 0)) * 31;
        LH1 headers = getHeaders();
        int hashCode3 = (hashCode2 + (headers != null ? headers.hashCode() : 0)) * 31;
        List<Pair<String, Object>> parameters = getParameters();
        int hashCode4 = (hashCode3 + (parameters != null ? parameters.hashCode() : 0)) * 31;
        InterfaceC6029OY interfaceC6029OY = this.f110677g;
        int hashCode5 = (hashCode4 + (interfaceC6029OY != null ? interfaceC6029OY.hashCode() : 0)) * 31;
        Map<String, InterfaceC46785pI4> mo8557k = mo8557k();
        int hashCode6 = (hashCode5 + (mo8557k != null ? mo8557k.hashCode() : 0)) * 31;
        Map<KClass<?>, Object> map = this.f110679i;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: i */
    public InterfaceC46785pI4 mo8559i(String header, Object value) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        return m12098t(header, value);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: j */
    public InterfaceC46785pI4 mo8558j(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        mo8565c().m102542j().m104384c(handler);
        return getRequest();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: k */
    public Map<String, InterfaceC46785pI4> mo8557k() {
        return this.f110678h;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: l */
    public InterfaceC46785pI4 mo8556l(InterfaceC6029OY body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f110677g = body;
        return getRequest();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: m */
    public WT2 mo8555m() {
        return this.f110673c;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: n */
    public InterfaceC6029OY mo8554n() {
        return this.f110677g;
    }

    /* renamed from: o */
    public InterfaceC46785pI4 m12102o(InputStream stream, Function0<Long> function0, Charset charset, boolean z) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m12101q(new C28775a(stream), function0, charset, z);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: p */
    public void mo8552p(II4 ii4) {
        Intrinsics.checkNotNullParameter(ii4, "<set-?>");
        this.f110672b = ii4;
    }

    /* renamed from: q */
    public InterfaceC46785pI4 m12101q(Function0<? extends InputStream> openStream, Function0<Long> function0, Charset charset, boolean z) {
        Intrinsics.checkNotNullParameter(openStream, "openStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        C49278tW0 m12261a = C49278tW0.f110565g.m12261a(openStream, function0, charset);
        C40837fG4 c40837fG4 = m12261a;
        if (z) {
            c40837fG4 = m12261a.m12267c();
        }
        this.f110677g = c40837fG4;
        return getRequest();
    }

    /* renamed from: r */
    public InterfaceC46785pI4 m12100r(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m12102o(new ByteArrayInputStream(bytes), new C28776b(bytes), charset, true);
    }

    /* renamed from: s */
    public Collection<String> m12099s(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return get(header);
    }

    /* renamed from: t */
    public InterfaceC46785pI4 m12098t(String header, Object value) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Collection) {
            m12097u(header, (Collection) value);
        } else {
            getHeaders().m97409o(header, value.toString());
        }
        return getRequest();
    }

    @Override // p000.InterfaceC46785pI4
    public String toString() {
        Object lastOrNull;
        StringBuilder sb = new StringBuilder();
        sb.append("--> " + mo8555m() + ' ' + mo8567a());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt__StringBuilderJVMKt.appendln(sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Body : ");
        InterfaceC6029OY mo8554n = mo8554n();
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(m12099s("Content-Type"));
        sb2.append(mo8554n.mo12265f((String) lastOrNull));
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt__StringBuilderJVMKt.appendln(sb);
        sb.append("Headers : (" + getHeaders().size() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt__StringBuilderJVMKt.appendln(sb);
        LH1.m97406r(getHeaders(), new C28777c(sb), null, 2, null);
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: u */
    public InterfaceC46785pI4 m12097u(String header, Collection<?> values) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(values, "values");
        LH1 headers = getHeaders();
        Collection<?> collection = values;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        headers.m97408p(header, arrayList);
        return getRequest();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49296tY0(WT2 wt2, URL url, LH1 lh1, List list, InterfaceC6029OY interfaceC6029OY, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wt2, url, r4, r5, (i & 16) != 0 ? new C49278tW0(null, null, null, 7, null) : interfaceC6029OY, (i & 32) != 0 ? new LinkedHashMap() : map, (i & 64) != 0 ? new LinkedHashMap() : map2);
        List list2;
        List emptyList;
        LH1 lh12 = (i & 4) != 0 ? new LH1() : lh1;
        if ((i & 8) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
    }
}
