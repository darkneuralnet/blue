package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u00020\u00002:\u0010\n\u001a6\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\tH&JD\u0010\f\u001a\u00020\u00002:\u0010\n\u001a6\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\tH&J\b\u0010\u000e\u001a\u00020\rH&J\u001b\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\rH¦\u0002J\u001c\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0014H&J0\u0010\u001f\u001a*\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u0019j\b\u0012\u0004\u0012\u00020\u001c`\u001eH&J\u001a\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020!H&J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010 \u001a\u00020$H&R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010/\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R4\u0010;\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00140504j\u0002`68&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010A\u001a\u00020<8&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010 \u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000Dj\u0002`E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m28432d2 = {"LpI4;", "LMI4;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "readBytes", "totalBytes", "", "Lcom/github/kittinunf/fuel/core/ProgressCallback;", "handler", "e", "j", "", "toString", "header", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "get", "", "", "map", "g", "value", "i", "Lkotlin/Triple;", "LFM4;", "LaN4;", "", "Lcom/github/kittinunf/fuel/core/FuelError;", "Lcom/github/kittinunf/fuel/core/ResponseResultOf;", "h", "body", "Ljava/nio/charset/Charset;", "charset", DateTokenConverter.CONVERTER_KEY, "LOY;", "l", "LWT2;", "m", "()LWT2;", "method", "Ljava/net/URL;", C17296a.f69688o, "()Ljava/net/URL;", "b", "(Ljava/net/URL;)V", "url", "LLH1;", "getHeaders", "()LLH1;", "headers", "", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/Parameters;", "getParameters", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "parameters", "LII4;", "c", "()LII4;", "p", "(LII4;)V", "executionOptions", "n", "()LOY;", "", "Lcom/github/kittinunf/fuel/core/RequestFeatures;", "k", "()Ljava/util/Map;", "enabledFeatures", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: pI4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46785pI4 extends MI4 {

    @Metadata(m28434bv = {1, 0, 3}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: pI4$a */
    /* loaded from: classes5.dex */
    public static final class C27245a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC46785pI4 m19560a(InterfaceC46785pI4 interfaceC46785pI4, String str, Charset charset, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    charset = Charsets.UTF_8;
                }
                return interfaceC46785pI4.mo8564d(str, charset);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: body");
        }
    }

    /* renamed from: a */
    URL mo8567a();

    /* renamed from: b */
    void mo8566b(URL url);

    /* renamed from: c */
    II4 mo8565c();

    /* renamed from: d */
    InterfaceC46785pI4 mo8564d(String str, Charset charset);

    /* renamed from: e */
    InterfaceC46785pI4 mo8563e(Function2<? super Long, ? super Long, Unit> function2);

    /* renamed from: f */
    void mo8562f(List<? extends Pair<String, ? extends Object>> list);

    /* renamed from: g */
    InterfaceC46785pI4 mo8561g(Map<String, ? extends Object> map);

    Collection<String> get(String str);

    LH1 getHeaders();

    List<Pair<String, Object>> getParameters();

    /* renamed from: h */
    Triple<InterfaceC46785pI4, FM4, AbstractC37918aN4<byte[], FuelError>> mo8560h();

    /* renamed from: i */
    InterfaceC46785pI4 mo8559i(String str, Object obj);

    /* renamed from: j */
    InterfaceC46785pI4 mo8558j(Function2<? super Long, ? super Long, Unit> function2);

    /* renamed from: k */
    Map<String, InterfaceC46785pI4> mo8557k();

    /* renamed from: l */
    InterfaceC46785pI4 mo8556l(InterfaceC6029OY interfaceC6029OY);

    /* renamed from: m */
    WT2 mo8555m();

    /* renamed from: n */
    InterfaceC6029OY mo8554n();

    /* renamed from: p */
    void mo8552p(II4 ii4);

    String toString();
}
