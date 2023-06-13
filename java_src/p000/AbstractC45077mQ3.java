package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* renamed from: mQ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45077mQ3 {
    /* renamed from: a */
    public static List<AbstractC45077mQ3> m25656a(C43891kQ3 c43891kQ3, Context context) {
        ArrayList arrayList = new ArrayList();
        if (c43891kQ3.mo27313k()) {
            arrayList.add(new C51223wn1(c43891kQ3.mo27312l()));
        }
        if (c43891kQ3.mo27314j()) {
            arrayList.add(new C49445tn1(c43891kQ3.mo27317e(), context));
        }
        if (c43891kQ3.m28985Z()) {
            arrayList.add(new C47667qn1(c43891kQ3.m28986Y()));
        }
        if (c43891kQ3.mo27315h()) {
            arrayList.add(new C48852sn1(c43891kQ3.mo27316g()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m25655b(C43891kQ3 c43891kQ3, Context context) {
        List<AbstractC45077mQ3> m25656a = m25656a(c43891kQ3, context);
        if (m25656a.isEmpty()) {
            C10776ad.m71007e().m71011a("No validators found for PerfMetric.");
            return false;
        }
        for (AbstractC45077mQ3 abstractC45077mQ3 : m25656a) {
            if (!abstractC45077mQ3.mo6338c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m25654d(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    /* renamed from: e */
    public static String m25653e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC36041Sy0 enumC36041Sy0 : EnumC36041Sy0.values()) {
            if (enumC36041Sy0.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    /* renamed from: f */
    public static String m25652f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC36275Ty0 enumC36275Ty0 : EnumC36275Ty0.values()) {
            if (enumC36275Ty0.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    /* renamed from: c */
    public abstract boolean mo6338c();
}
