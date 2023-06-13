package bo.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lbo/app/w3;", "LaP1;", "Lorg/json/JSONArray;", "Lbo/app/f2;", "v", "Lorg/json/JSONObject;", "userObject", "Lorg/json/JSONObject;", "w", "()Lorg/json/JSONObject;", "", "e", "()Z", "isEmpty", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.w3 */
/* loaded from: classes.dex */
public final class C13191w3 implements InterfaceC37933aP1<JSONArray>, InterfaceC12644f2 {

    /* renamed from: b */
    private final JSONObject f59392b;

    /* renamed from: c */
    private final JSONArray f59393c;

    public C13191w3(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.f59392b = userObject;
        this.f59393c = new JSONArray().put(userObject);
    }

    @Override // bo.app.InterfaceC12644f2
    /* renamed from: e */
    public boolean mo62845e() {
        if (this.f59392b.length() == 0) {
            return true;
        }
        if (this.f59392b.length() == 1 && this.f59392b.has("user_id")) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public JSONArray forJsonPut() {
        JSONArray jsonArrayForJsonPut = this.f59393c;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    /* renamed from: w */
    public final JSONObject m62843w() {
        return this.f59392b;
    }
}
