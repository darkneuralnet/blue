package p000;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Vk1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC36618Vk1 implements InterfaceC36852Wk1 {

    /* renamed from: b */
    public static final EnumC36618Vk1 f39675b;

    /* renamed from: c */
    public static final EnumC36618Vk1 f39676c;

    /* renamed from: d */
    public static final EnumC36618Vk1 f39677d;

    /* renamed from: e */
    public static final EnumC36618Vk1 f39678e;

    /* renamed from: f */
    public static final EnumC36618Vk1 f39679f;

    /* renamed from: g */
    public static final EnumC36618Vk1 f39680g;

    /* renamed from: h */
    public static final EnumC36618Vk1 f39681h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC36618Vk1[] f39682i;

    /* renamed from: Vk1$a */
    /* loaded from: classes6.dex */
    public enum C8770a extends EnumC36618Vk1 {
        public C8770a(String str, int i) {
            super(str, i, null);
        }

        @Override // p000.InterfaceC36852Wk1
        /* renamed from: a */
        public String mo77895a(Field field) {
            return field.getName();
        }
    }

    static {
        C8770a c8770a = new C8770a("IDENTITY", 0);
        f39675b = c8770a;
        EnumC36618Vk1 enumC36618Vk1 = new EnumC36618Vk1("UPPER_CAMEL_CASE", 1) { // from class: Vk1.b
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79486c(field.getName());
            }
        };
        f39676c = enumC36618Vk1;
        EnumC36618Vk1 enumC36618Vk12 = new EnumC36618Vk1("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: Vk1.c
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79486c(EnumC36618Vk1.m79487b(field.getName(), ' '));
            }
        };
        f39677d = enumC36618Vk12;
        EnumC36618Vk1 enumC36618Vk13 = new EnumC36618Vk1("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: Vk1.d
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79487b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f39678e = enumC36618Vk13;
        EnumC36618Vk1 enumC36618Vk14 = new EnumC36618Vk1("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: Vk1.e
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79487b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f39679f = enumC36618Vk14;
        EnumC36618Vk1 enumC36618Vk15 = new EnumC36618Vk1("LOWER_CASE_WITH_DASHES", 5) { // from class: Vk1.f
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79487b(field.getName(), CoreConstants.DASH_CHAR).toLowerCase(Locale.ENGLISH);
            }
        };
        f39680g = enumC36618Vk15;
        EnumC36618Vk1 enumC36618Vk16 = new EnumC36618Vk1("LOWER_CASE_WITH_DOTS", 6) { // from class: Vk1.g
            @Override // p000.InterfaceC36852Wk1
            /* renamed from: a */
            public String mo77895a(Field field) {
                return EnumC36618Vk1.m79487b(field.getName(), CoreConstants.DOT).toLowerCase(Locale.ENGLISH);
            }
        };
        f39681h = enumC36618Vk16;
        f39682i = new EnumC36618Vk1[]{c8770a, enumC36618Vk1, enumC36618Vk12, enumC36618Vk13, enumC36618Vk14, enumC36618Vk15, enumC36618Vk16};
    }

    public EnumC36618Vk1(String str, int i) {
    }

    /* renamed from: b */
    public static String m79487b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m79486c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC36618Vk1 valueOf(String str) {
        return (EnumC36618Vk1) Enum.valueOf(EnumC36618Vk1.class, str);
    }

    public static EnumC36618Vk1[] values() {
        return (EnumC36618Vk1[]) f39682i.clone();
    }

    public /* synthetic */ EnumC36618Vk1(String str, int i, C8770a c8770a) {
        this(str, i);
    }
}
