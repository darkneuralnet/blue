package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.auth0.android.jwt.JWT;
import com.facebook.share.internal.C17296a;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/auth0/android/jwt/JWT;", "", "b", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "payload", C17296a.f69688o, "", "leeway", "", "c", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJWT+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JWT+.kt\nco/bird/android/library/extension/JWT_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* renamed from: ph2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47015ph2 {
    /* renamed from: a */
    public static final JWT m18979a(JWT jwt, JSONObject payload) {
        String replace$default;
        Intrinsics.checkNotNullParameter(jwt, "<this>");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String jwt2 = jwt.toString();
        Intrinsics.checkNotNullExpressionValue(jwt2, "toString()");
        String m18978b = m18978b(jwt);
        String jSONObject = payload.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "payload.toString()");
        replace$default = StringsKt__StringsJVMKt.replace$default(jwt2, m18978b, C45097mS5.m25603c(jSONObject), false, 4, (Object) null);
        return new JWT(replace$default);
    }

    /* renamed from: b */
    public static final String m18978b(JWT jwt) {
        List split$default;
        String jwt2 = jwt.toString();
        Intrinsics.checkNotNullExpressionValue(jwt2, "toString()");
        split$default = StringsKt__StringsKt.split$default((CharSequence) jwt2, new String[]{InstructionFileId.DOT}, false, 0, 6, (Object) null);
        return (String) split$default.get(1);
    }

    /* renamed from: c */
    public static final boolean m18977c(JWT jwt, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jwt, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Date m53435c = jwt.m53435c();
            if (m53435c == null) {
                return false;
            }
            return DateTime.now().minusSeconds(i).isAfter(m53435c.getTime());
        }
        throw new IllegalArgumentException("The leeway must be a positive value.".toString());
    }

    /* renamed from: d */
    public static final JSONObject m18976d(JWT jwt) {
        Intrinsics.checkNotNullParameter(jwt, "<this>");
        return new JSONObject(C45097mS5.m25605a(m18978b(jwt)));
    }
}
