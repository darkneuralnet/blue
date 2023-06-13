package p000;

import android.util.Log;
import co.bird.android.model.Detail;
import com.adyen.checkout.core.exception.NoConstructorException;
/* renamed from: Cx2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32290Cx2 {

    /* renamed from: a */
    public static int f4957a = 8;

    private C32290Cx2() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static void m111214a(String str, String str2) {
        m111210e(3, str, str2, null);
    }

    /* renamed from: b */
    public static void m111213b(String str, String str2, Throwable th) {
        m111210e(3, str, str2, th);
    }

    /* renamed from: c */
    public static void m111212c(String str, String str2) {
        m111210e(6, str, str2, null);
    }

    /* renamed from: d */
    public static void m111211d(String str, String str2, Throwable th) {
        m111210e(6, str, str2, th);
    }

    /* renamed from: e */
    public static void m111210e(int i, String str, String str2, Throwable th) {
        String substring;
        if (f4957a > i) {
            return;
        }
        if (str2.length() > 2048) {
            int length = str2.length() / 2048;
            for (int i2 = 0; i2 <= length; i2++) {
                if (i2 != length) {
                    substring = str2.substring(i2 * 2048, (i2 + 1) * 2048);
                } else {
                    substring = str2.substring(i2 * 2048);
                }
                m111210e(i, str + Detail.EMPTY_CHAR + i2, substring, th);
            }
        } else if (i != -1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                if (th == null) {
                                    Log.e(str, str2);
                                } else {
                                    Log.e(str, str2, th);
                                }
                            }
                        } else if (th == null) {
                            Log.w(str, str2);
                        } else {
                            Log.w(str, str2, th);
                        }
                    } else if (th == null) {
                        Log.i(str, str2);
                    } else {
                        Log.i(str, str2, th);
                    }
                } else if (th == null) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, th);
                }
            } else if (th == null) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, th);
            }
        } else if (th == null) {
            Log.wtf(str, str2);
        } else {
            Log.wtf(str, str2, th);
        }
    }

    /* renamed from: f */
    public static void m111209f(String str, String str2) {
        m111210e(2, str, str2, null);
    }

    /* renamed from: g */
    public static void m111208g(String str, String str2) {
        m111210e(5, str, str2, null);
    }
}
