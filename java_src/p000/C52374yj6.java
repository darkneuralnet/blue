package p000;

import com.adyen.checkout.core.exception.NoConstructorException;
import java.util.regex.Pattern;
/* renamed from: yj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52374yj6 {
    private C52374yj6() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static boolean m2755a(String str) {
        if (Pattern.compile("([A-F]|[0-9]){5}\\|([A-F]|[0-9]){512}").matcher(str).find() && str.length() == 518) {
            return true;
        }
        return false;
    }
}
