package co.bird.android.auth.api.json;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.TokenPair;
import com.auth0.android.jwt.JWT;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/auth/api/json/TokenPairTypeAdapter;", "Llj2;", "Lco/bird/android/model/TokenPair;", "Lvi2;", "src", "Ljava/lang/reflect/Type;", "type", "Lkj2;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyi2;", "b", "json", "Lui2;", C17296a.f69688o, "<init>", "()V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TokenPairTypeAdapter implements InterfaceC44663lj2<TokenPair>, InterfaceC50581vi2<TokenPair> {
    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public TokenPair deserialize(AbstractC52360yi2 json, Type type, InterfaceC49989ui2 context) throws JsonParseException {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        C36133Ti2 m2885e = json.m2885e();
        return new TokenPair(new JWT(m2885e.m83135y("access").mo2882j()), new JWT(m2885e.m83135y("refresh").mo2882j()));
    }

    @Override // p000.InterfaceC44663lj2
    /* renamed from: b */
    public AbstractC52360yi2 serialize(TokenPair src, Type type, InterfaceC44070kj2 context) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        C36133Ti2 c36133Ti2 = new C36133Ti2();
        c36133Ti2.m83136x("access", src.getAccessJwt().toString());
        c36133Ti2.m83136x("refresh", src.getRefreshJwt().toString());
        return c36133Ti2;
    }
}
