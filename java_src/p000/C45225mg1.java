package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u0013\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lmg1;", "", MessageExtension.FIELD_DATA, "", "b", "", "e", C17296a.f69688o, "", "toString", "Ljava/lang/String;", "filename", "errorMessage", "", "c", "Ljava/lang/Long;", FraudDetectionData.KEY_TIMESTAMP, "", DateTokenConverter.CONVERTER_KEY, "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: mg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45225mg1 {

    /* renamed from: d */
    public static final C26164a f98542d = new C26164a(null);

    /* renamed from: a */
    public String f98543a;

    /* renamed from: b */
    public String f98544b;

    /* renamed from: c */
    public Long f98545c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lmg1$a;", "", "", "PARAM_TIMESTAMP", "Ljava/lang/String;", "PRARAM_ERROR_MESSAGE", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: mg1$a */
    /* loaded from: classes5.dex */
    public static final class C26164a {
        private C26164a() {
        }

        public /* synthetic */ C26164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C45225mg1(String str) {
        this.f98545c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f98544b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f98545c;
        if (l != null) {
            stringBuffer.append(l.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
            this.f98543a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* renamed from: a */
    public final void m25187a() {
        C49032t52.m13152a(this.f98543a);
    }

    /* renamed from: b */
    public final int m25186b(C45225mg1 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = this.f98545c;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = data.f98545c;
            if (l2 != null) {
                return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public final JSONObject m25185c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f98545c;
            if (l != null) {
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, l.longValue());
            }
            jSONObject.put("error_message", this.f98544b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m25184d() {
        return (this.f98544b == null || this.f98545c == null) ? false : true;
    }

    /* renamed from: e */
    public final void m25183e() {
        if (m25184d()) {
            C49032t52.m13140m(this.f98543a, toString());
        }
    }

    public String toString() {
        JSONObject m25185c = m25185c();
        if (m25185c != null) {
            String jSONObject = m25185c.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "params.toString()");
            return jSONObject;
        }
        return super.toString();
    }

    public C45225mg1(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f98543a = name;
        JSONObject m13142k = C49032t52.m13142k(name, true);
        if (m13142k != null) {
            this.f98545c = Long.valueOf(m13142k.optLong(FraudDetectionData.KEY_TIMESTAMP, 0L));
            this.f98544b = m13142k.optString("error_message", null);
        }
    }
}
