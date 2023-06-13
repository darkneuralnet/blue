package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
/* renamed from: Au6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C31799Au6 {

    /* renamed from: a */
    public boolean f1335a;

    /* renamed from: b */
    public String f1336b;

    /* renamed from: c */
    public String f1337c;

    /* renamed from: d */
    public List<String> f1338d;

    /* renamed from: a */
    public static C31799Au6 m114961a(JSONObject jSONObject) {
        C31799Au6 c31799Au6 = new C31799Au6();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String m61029a = C39299ci2.m61029a(jSONObject, "apikey", "");
        c31799Au6.f1336b = m61029a;
        c31799Au6.f1335a = !m61029a.equals("");
        c31799Au6.f1337c = C39299ci2.m61029a(jSONObject, "externalClientId", "");
        c31799Au6.f1338d = m114960b(C32360Df0.m110025a(jSONObject).m110024b());
        return c31799Au6;
    }

    /* renamed from: b */
    public static List<String> m114960b(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -2038717326:
                    if (lowerCase.equals("mastercard")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1120637072:
                    if (lowerCase.equals("american express")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3619905:
                    if (lowerCase.equals("visa")) {
                        c = 2;
                        break;
                    }
                    break;
                case 273184745:
                    if (lowerCase.equals("discover")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    arrayList.add("MASTERCARD");
                    break;
                case 1:
                    arrayList.add("AMEX");
                    break;
                case 2:
                    arrayList.add("VISA");
                    break;
                case 3:
                    arrayList.add("DISCOVER");
                    break;
            }
        }
        return arrayList;
    }
}
