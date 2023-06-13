package p000;

import com.adyen.checkout.core.exception.NoConstructorException;
import com.adyen.checkout.cse.EncryptedCard;
import com.adyen.checkout.cse.exception.EncryptionException;
import com.amazonaws.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Ff0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32828Ff0 {

    /* renamed from: a */
    public static final SimpleDateFormat f9925a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        f9925a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private C32828Ff0() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static String m106766a(String str, String str2) throws EncryptionException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("binValue", str);
            jSONObject.put("generationtime", C47312qB1.m17952c(new Date()));
            return new C34745Nk0(str2).m93534a(jSONObject.toString());
        } catch (JSONException e) {
            throw new EncryptionException("Failed to created encrypted JSON data.", e);
        }
    }

    /* renamed from: b */
    public static EncryptedCard m106765b(C34220Ld6 c34220Ld6, String str) throws EncryptionException {
        String message;
        String str2;
        String str3;
        String str4;
        try {
            String str5 = null;
            if (c34220Ld6.m96533d() != null) {
                str2 = C47312qB1.m17953b("number", c34220Ld6.m96533d(), str);
            } else {
                str2 = null;
            }
            if (c34220Ld6.m96535b() != null && c34220Ld6.m96534c() != null) {
                str3 = C47312qB1.m17953b("expiryMonth", c34220Ld6.m96535b(), str);
                str4 = C47312qB1.m17953b("expiryYear", c34220Ld6.m96534c(), str);
            } else if (c34220Ld6.m96535b() == null && c34220Ld6.m96534c() == null) {
                str3 = null;
                str4 = null;
            } else {
                throw new EncryptionException("Both expiryMonth and expiryYear need to be set for encryption.", null);
            }
            if (c34220Ld6.m96536a() != null) {
                str5 = C47312qB1.m17953b("cvc", c34220Ld6.m96536a(), str);
            }
            return new EncryptedCard(str2, str3, str4, str5);
        } catch (EncryptionException | IllegalStateException e) {
            if (e.getMessage() == null) {
                message = "No message.";
            } else {
                message = e.getMessage();
            }
            throw new EncryptionException(message, e);
        }
    }
}
