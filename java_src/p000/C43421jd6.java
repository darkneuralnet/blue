package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: jd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43421jd6 {
    /* renamed from: a */
    public static String m30178a(String str) {
        try {
            return URLEncoder.encode(str, Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return "unable_to_encode:" + str;
        }
    }
}
