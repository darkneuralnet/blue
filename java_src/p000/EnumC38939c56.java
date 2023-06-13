package p000;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c56  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC38939c56 implements InterfaceC39550d56 {

    /* renamed from: b */
    public static final EnumC38939c56 f60073b;

    /* renamed from: c */
    public static final EnumC38939c56 f60074c;

    /* renamed from: d */
    public static final EnumC38939c56 f60075d;

    /* renamed from: e */
    public static final EnumC38939c56 f60076e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC38939c56[] f60077f;

    /* renamed from: c56$a */
    /* loaded from: classes6.dex */
    public enum C13388a extends EnumC38939c56 {
        public C13388a(String str, int i) {
            super(str, i, null);
        }

        @Override // p000.InterfaceC39550d56
        /* renamed from: b */
        public Double mo44615a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        C13388a c13388a = new C13388a("DOUBLE", 0);
        f60073b = c13388a;
        EnumC38939c56 enumC38939c56 = new EnumC38939c56("LAZILY_PARSED_NUMBER", 1) { // from class: c56.b
            @Override // p000.InterfaceC39550d56
            /* renamed from: a */
            public Number mo44615a(JsonReader jsonReader) throws IOException {
                return new C37105Xm2(jsonReader.nextString());
            }
        };
        f60074c = enumC38939c56;
        EnumC38939c56 enumC38939c562 = new EnumC38939c56("LONG_OR_DOUBLE", 2) { // from class: c56.c
            @Override // p000.InterfaceC39550d56
            /* renamed from: a */
            public Number mo44615a(JsonReader jsonReader) throws IOException, JsonParseException {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException e) {
                        throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(nextString);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                        return valueOf;
                    }
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
            }
        };
        f60075d = enumC38939c562;
        EnumC38939c56 enumC38939c563 = new EnumC38939c56("BIG_DECIMAL", 3) { // from class: c56.d
            @Override // p000.InterfaceC39550d56
            /* renamed from: b */
            public BigDecimal mo44615a(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e) {
                    throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
                }
            }
        };
        f60076e = enumC38939c563;
        f60077f = new EnumC38939c56[]{c13388a, enumC38939c56, enumC38939c562, enumC38939c563};
    }

    public EnumC38939c56(String str, int i) {
    }

    public static EnumC38939c56 valueOf(String str) {
        return (EnumC38939c56) Enum.valueOf(EnumC38939c56.class, str);
    }

    public static EnumC38939c56[] values() {
        return (EnumC38939c56[]) f60077f.clone();
    }

    public /* synthetic */ EnumC38939c56(String str, int i, C13388a c13388a) {
        this(str, i);
    }
}
