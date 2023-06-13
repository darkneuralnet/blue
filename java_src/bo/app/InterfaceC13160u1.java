package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u000f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m28432d2 = {"Lbo/app/u1;", "LaP1;", "Lorg/json/JSONObject;", "Lbo/app/d1;", "j", "()Lbo/app/d1;", "type", "k", "()Lorg/json/JSONObject;", MessageExtension.FIELD_DATA, "", "r", "()Ljava/lang/String;", "uniqueIdentifier", "getUserId", C17296a.f69688o, "(Ljava/lang/String;)V", "userId", "Lbo/app/f5;", "n", "()Lbo/app/f5;", "(Lbo/app/f5;)V", "sessionId", "", DateTokenConverter.CONVERTER_KEY, "()Z", "isNonPersistable", "p", "serialization", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.u1 */
/* loaded from: classes.dex */
public interface InterfaceC13160u1 extends InterfaceC37933aP1<JSONObject> {

    /* renamed from: a */
    public static final C13161a f59351a = C13161a.f59352a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lbo/app/u1$a;", "", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u1$a */
    /* loaded from: classes.dex */
    public static final class C13161a {

        /* renamed from: a */
        static final /* synthetic */ C13161a f59352a = new C13161a();

        private C13161a() {
        }
    }

    /* renamed from: a */
    void mo62900a(C12648f5 c12648f5);

    /* renamed from: a */
    void mo62899a(String str);

    /* renamed from: d */
    boolean mo62898d();

    /* renamed from: j */
    EnumC12577d1 mo62897j();

    /* renamed from: k */
    JSONObject mo62896k();

    /* renamed from: n */
    C12648f5 mo62895n();

    /* renamed from: p */
    default String m62894p() {
        String jSONObject = forJsonPut().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "forJsonPut().toString()");
        return jSONObject;
    }

    /* renamed from: r */
    String mo62893r();
}
