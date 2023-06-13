package p000;

import com.adyen.checkout.card.api.model.BinLookupRequest;
import com.adyen.checkout.card.api.model.BinLookupResponse;
import com.adyen.checkout.core.api.Environment;
import com.adyen.checkout.core.model.JsonUtilsKt;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"LOG;", "Lfy0;", "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "i", "Lcom/adyen/checkout/card/api/model/BinLookupRequest;", "g", "Lcom/adyen/checkout/card/api/model/BinLookupRequest;", "request", "Lcom/adyen/checkout/core/api/Environment;", "environment", "", "clientKey", "<init>", "(Lcom/adyen/checkout/card/api/model/BinLookupRequest;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: OG */
/* loaded from: classes.dex */
public final class C5932OG extends AbstractCallableC41253fy0<BinLookupResponse> {

    /* renamed from: g */
    public final BinLookupRequest f26271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5932OG(BinLookupRequest request, Environment environment, String clientKey) {
        super(environment.m53575a() + "v2/bin/binLookup?clientKey=" + clientKey);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        this.f26271g = request;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public BinLookupResponse call() {
        String str;
        String str2;
        String str3;
        str = C6302PG.f28166a;
        C32290Cx2.m111209f(str, Intrinsics.stringPlus("call - ", m40409d()));
        str2 = C6302PG.f28166a;
        BinLookupRequest.C16797b c16797b = BinLookupRequest.f68359e;
        JSONObject serialize = c16797b.m53628a().serialize(this.f26271g);
        Intrinsics.checkNotNullExpressionValue(serialize, "BinLookupRequest.SERIALIZER.serialize(request)");
        C32290Cx2.m111209f(str2, Intrinsics.stringPlus("request - ", JsonUtilsKt.toStringPretty(serialize)));
        String jSONObject = c16797b.m53628a().serialize(this.f26271g).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "BinLookupRequest.SERIALIZER.serialize(request).toString()");
        Map<String, String> map = AbstractCallableC41253fy0.f81215e;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = jSONObject.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] m40405h = m40405h(map, bytes);
        Intrinsics.checkNotNullExpressionValue(m40405h, "post(CONTENT_TYPE_JSON_HEADER, requestString.toByteArray(Charsets.UTF_8))");
        JSONObject jSONObject2 = new JSONObject(new String(m40405h, charset));
        str3 = C6302PG.f28166a;
        C32290Cx2.m111209f(str3, Intrinsics.stringPlus("response: ", JsonUtilsKt.toStringPretty(jSONObject2)));
        BinLookupResponse deserialize = BinLookupResponse.f68364e.m53622a().deserialize(jSONObject2);
        Intrinsics.checkNotNullExpressionValue(deserialize, "BinLookupResponse.SERIALIZER.deserialize(resultJson)");
        return deserialize;
    }
}
