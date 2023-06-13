package p000;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: yk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC52380yk2 {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");
    

    /* renamed from: b */
    public final String f120096b;

    EnumC52380yk2(String str) {
        if (str != null) {
            this.f120096b = str;
            return;
        }
        throw new IllegalArgumentException("The key operation identifier must not be null");
    }

    /* renamed from: b */
    public static Set<EnumC52380yk2> m2707b(List<String> list) throws ParseException {
        EnumC52380yk2 enumC52380yk2;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                EnumC52380yk2[] values = values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC52380yk2 = values[i];
                        if (str.equals(enumC52380yk2.m2708a())) {
                            break;
                        }
                        i++;
                    } else {
                        enumC52380yk2 = null;
                        break;
                    }
                }
                if (enumC52380yk2 != null) {
                    linkedHashSet.add(enumC52380yk2);
                } else {
                    throw new ParseException("Invalid JWK operation: " + str, 0);
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public String m2708a() {
        return this.f120096b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return m2708a();
    }
}
