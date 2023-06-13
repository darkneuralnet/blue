package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\u000fB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J5\u0010\n\u001a\u0004\u0018\u00010\t\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0012\u001a\u00020\u0011*\u00020\tH\u0002R\u0080\u0001\u0010\u0016\u001an\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012(\u0012&\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013j\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u00140\u0013j6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012(\u0012&\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013j\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u0014`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0080\u0001\u0010\u0017\u001an\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012(\u0012&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\t0\u0013j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\t`\u00140\u0013j6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012(\u0012&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\t0\u0013j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\t`\u0014`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R@\u0010\u0018\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013j\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lef1;", "", "Ljava/lang/Class;", "clazz", "", C17296a.f69688o, "", "E", "enum", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/String;", "name", "c", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", "b", "(Ljava/lang/Class;)Ljava/lang/Enum;", "Lef1$b;", "e", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nameEnumCache", "enumNameCache", "enumDefaultCache", "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumCache.kt\nco/bird/android/lib/jackson/enums/EnumCache\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 EnumCache.kt\nco/bird/android/lib/jackson/enums/EnumCacheKt\n*L\n1#1,111:1\n11653#2,9:112\n13579#2:121\n13580#2:123\n11662#2:124\n11335#2:138\n11670#2,3:139\n1#3:122\n1#3:137\n105#4,4:125\n105#4,4:129\n105#4,4:133\n*S KotlinDebug\n*F\n+ 1 EnumCache.kt\nco/bird/android/lib/jackson/enums/EnumCache\n*L\n28#1:112,9\n28#1:121\n28#1:123\n28#1:124\n45#1:138\n45#1:139,3\n28#1:122\n30#1:125,4\n31#1:129,4\n35#1:133,4\n*E\n"})
/* renamed from: ef1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40471ef1 {

    /* renamed from: d */
    public static final C20083a f78664d = new C20083a(null);

    /* renamed from: a */
    public final HashMap<Class<?>, HashMap<C20084b, Enum<?>>> f78665a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<Class<?>, HashMap<Enum<?>, String>> f78666b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<Class<?>, Enum<?>> f78667c = new HashMap<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lef1$a;", "", "", "UNKNOWN", "Ljava/lang/String;", "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ef1$a */
    /* loaded from: classes3.dex */
    public static final class C20083a {
        public /* synthetic */ C20083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20083a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lef1$b;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "b", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ef1$b */
    /* loaded from: classes3.dex */
    public static final class C20084b {

        /* renamed from: b */
        public static final C20085a f78668b = new C20085a(null);

        /* renamed from: a */
        public final String f78669a;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lef1$b$a;", "", "", "name", "Lef1$b;", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: ef1$b$a */
        /* loaded from: classes3.dex */
        public static final class C20085a {
            public /* synthetic */ C20085a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C20084b m42650a(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = name.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                return new C20084b(lowerCase, null);
            }

            private C20085a() {
            }
        }

        public /* synthetic */ C20084b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C20084b)) {
                return false;
            }
            return Intrinsics.areEqual(this.f78669a, ((C20084b) obj).f78669a);
        }

        public int hashCode() {
            return this.f78669a.hashCode();
        }

        public String toString() {
            return this.f78669a;
        }

        public C20084b(String str) {
            this.f78669a = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m42655a(Class<?> clazz) {
        HashMap<C20084b, Enum<?>> hashMap;
        Annotation annotation;
        Annotation annotation2;
        String lowerCase;
        boolean equals;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this.f78665a.containsKey(clazz) && this.f78666b.containsKey(clazz)) {
            return;
        }
        this.f78665a.put(clazz, new HashMap<>());
        this.f78666b.put(clazz, new HashMap<>());
        Object[] enumConstants = clazz.getEnumConstants();
        if (enumConstants != null) {
            ArrayList<Enum<?>> arrayList = new ArrayList();
            for (Object[] objArr : enumConstants) {
                Intrinsics.checkNotNull(objArr, "null cannot be cast to non-null type kotlin.Enum<*>");
                arrayList.add((Enum) objArr);
            }
            for (Enum<?> r1 : arrayList) {
                Annotation annotation3 = null;
                try {
                    annotation = clazz.getField(r1.name()).getAnnotation(JsonProperty.class);
                } catch (NoSuchFieldException unused) {
                    annotation = null;
                }
                JsonProperty jsonProperty = (JsonProperty) annotation;
                try {
                    annotation2 = clazz.getField(r1.name()).getAnnotation(JsonAlias.class);
                } catch (NoSuchFieldException unused2) {
                    annotation2 = null;
                }
                JsonAlias jsonAlias = (JsonAlias) annotation2;
                if (jsonProperty == null || (lowerCase = jsonProperty.value()) == null) {
                    String name = r1.name();
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    lowerCase = name.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                }
                if (this.f78667c.get(clazz) == null) {
                    try {
                        annotation3 = clazz.getField(r1.name()).getAnnotation(JsonEnumDefaultValue.class);
                    } catch (NoSuchFieldException unused3) {
                    }
                    if (annotation3 == null) {
                        equals = StringsKt__StringsJVMKt.equals(r1.name(), "unknown", true);
                    }
                    this.f78667c.put(clazz, r1);
                }
                HashMap<C20084b, Enum<?>> hashMap2 = this.f78665a.get(clazz);
                if (hashMap2 != null && hashMap2.put(m42651e(lowerCase), r1) != null) {
                    C41064ff1.m41065a(lowerCase);
                    throw new KotlinNothingValueException();
                }
                HashMap<Enum<?>, String> hashMap3 = this.f78666b.get(clazz);
                if (hashMap3 != null) {
                    hashMap3.put(r1, lowerCase);
                }
                if (jsonAlias != null) {
                    String[] value = jsonAlias.value();
                    ArrayList<String> arrayList2 = new ArrayList(value.length);
                    for (String str : value) {
                        Locale US2 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US2, "US");
                        String lowerCase2 = str.toLowerCase(US2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        arrayList2.add(lowerCase2);
                    }
                    for (String str2 : arrayList2) {
                        HashMap<C20084b, Enum<?>> hashMap4 = this.f78665a.get(clazz);
                        if (hashMap4 != null && hashMap4.put(m42651e(str2), r1) != null) {
                            C41064ff1.m41065a(str2);
                            throw new KotlinNothingValueException();
                        }
                    }
                    continue;
                }
            }
            Enum<?> r0 = this.f78667c.get(clazz);
            if (r0 != null && (hashMap = this.f78665a.get(clazz)) != null) {
                hashMap.put(m42651e("unknown"), r0);
            }
        }
    }

    /* renamed from: b */
    public final <E extends Enum<E>> E m42654b(Class<E> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Enum<?> r2 = this.f78667c.get(clazz);
        if (r2 instanceof Enum) {
            return (E) r2;
        }
        return null;
    }

    /* renamed from: c */
    public final <E extends Enum<E>> E m42653c(Class<E> clazz, String name) {
        Enum<?> r3;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(name, "name");
        HashMap<C20084b, Enum<?>> hashMap = this.f78665a.get(clazz);
        if (hashMap != null) {
            r3 = hashMap.get(C20084b.f78668b.m42650a(name));
        } else {
            r3 = null;
        }
        if (!(r3 instanceof Enum)) {
            return null;
        }
        return (E) r3;
    }

    /* renamed from: d */
    public final <E extends Enum<E>> String m42652d(Class<E> clazz, E e) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(e, "enum");
        HashMap<Enum<?>, String> hashMap = this.f78666b.get(clazz);
        if (hashMap != null) {
            return hashMap.get(e);
        }
        return null;
    }

    /* renamed from: e */
    public final C20084b m42651e(String str) {
        return C20084b.f78668b.m42650a(str);
    }
}
