package p000;

import android.content.Context;
import com.adyen.checkout.core.exception.NoConstructorException;
import java.util.Locale;
/* renamed from: Ev2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32740Ev2 {
    private C32740Ev2() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static Locale m108214a(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    /* renamed from: b */
    public static String m108213b(Locale locale) {
        return locale.getLanguage() + "_" + locale.getCountry();
    }
}
