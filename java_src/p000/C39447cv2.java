package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\b¨\u0006\n"}, m28432d2 = {"Lkotlin/text/Regex;", C17296a.f69688o, "Lkotlin/text/Regex;", "HTTP_REGEX", "b", "DIGIT_TOKEN_REGEX", "Lgl;", "", "(Lgl;)Ljava/lang/String;", "formattedLocalUrl", "co.bird.android.feature.localhost"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: cv2 */
/* loaded from: classes3.dex */
public final class C39447cv2 {

    /* renamed from: a */
    public static final Regex f75849a = new Regex("https?://");

    /* renamed from: b */
    public static final Regex f75850b = new Regex("(:?%d)?\\/?$");

    /* renamed from: a */
    public static final String m44819a(C22454gl c22454gl) {
        String replace;
        String m37631e0 = c22454gl.m37631e0();
        if (m37631e0 != null && (replace = f75850b.replace(m37631e0, "")) != null) {
            return f75849a.replace(replace, "");
        }
        return null;
    }
}
