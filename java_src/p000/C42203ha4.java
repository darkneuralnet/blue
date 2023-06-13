package p000;

import com.adyen.checkout.core.api.Environment;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Lha4;", "Lfy0;", "", "i", "Lcom/adyen/checkout/core/api/Environment;", "environment", "clientKey", "<init>", "(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: ha4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42203ha4 extends AbstractCallableC41253fy0<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42203ha4(Environment environment, String clientKey) {
        super(environment.m53575a() + "v1/clientKeys/" + clientKey);
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i */
    public String call() throws IOException, JSONException {
        String str;
        String str2;
        str = C42796ia4.f87488a;
        C32290Cx2.m111209f(str, Intrinsics.stringPlus("call - ", m40409d()));
        byte[] m40412a = m40412a();
        Intrinsics.checkNotNullExpressionValue(m40412a, "get()");
        String str3 = new String(m40412a, Charsets.UTF_8);
        JSONObject jSONObject = new JSONObject(str3);
        str2 = C42796ia4.f87488a;
        C32290Cx2.m111209f(str2, Intrinsics.stringPlus("result: ", str3));
        String string = jSONObject.getString("publicKey");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(PUBLIC_KEY_JSON_KEY)");
        return string;
    }
}
