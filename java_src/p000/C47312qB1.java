package p000;

import com.adyen.checkout.cse.exception.EncryptionException;
import com.amazonaws.util.DateUtils;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\u0014\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, m28432d2 = {"LqB1;", "", "", "encryptionKey", "fieldToEncrypt", "publicKey", "b", "Ljava/util/Date;", "generationTime", "c", C17296a.f69688o, "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "GENERATION_DATE_FORMAT", "<init>", "()V", "cse_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: qB1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47312qB1 {

    /* renamed from: a */
    public static final C47312qB1 f104865a = new C47312qB1();

    /* renamed from: b */
    public static final SimpleDateFormat f104866b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f104866b = simpleDateFormat;
    }

    private C47312qB1() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m17953b(String encryptionKey, Object fieldToEncrypt, String publicKey) {
        Intrinsics.checkNotNullParameter(encryptionKey, "encryptionKey");
        Intrinsics.checkNotNullParameter(fieldToEncrypt, "fieldToEncrypt");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        C34745Nk0 c34745Nk0 = new C34745Nk0(publicKey);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(encryptionKey, fieldToEncrypt);
            jSONObject.put("generationtime", m17951d(null, 1, null));
            String m93534a = c34745Nk0.m93534a(jSONObject.toString());
            Intrinsics.checkNotNullExpressionValue(m93534a, "{\n            val jsonToEncrypt = JSONObject()\n            jsonToEncrypt.put(encryptionKey, fieldToEncrypt)\n            jsonToEncrypt.put(CardEncrypter.GENERATION_TIME_KEY, makeGenerationTime())\n            encrypter.encrypt(jsonToEncrypt.toString())\n        }");
            return m93534a;
        } catch (JSONException e) {
            throw new EncryptionException("Encryption failed.", e);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m17952c(Date date) {
        String format = f104866b.format(f104865a.m17954a(date));
        Intrinsics.checkNotNullExpressionValue(format, "GENERATION_DATE_FORMAT.format(assureGenerationTime(generationTime))");
        return format;
    }

    /* renamed from: d */
    public static /* synthetic */ String m17951d(Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        return m17952c(date);
    }

    /* renamed from: a */
    public final Date m17954a(Date date) {
        return date == null ? new Date() : date;
    }
}
