package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000\"6\u0010\u0012\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\f0\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"", "serialName", "LE24;", "kind", "LMs5;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "c", "", "T", "Lkotlin/reflect/KClass;", "LKj2;", "b", "", "Ljava/util/Map;", "getBUILTIN_SERIALIZERS$annotations", "()V", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* renamed from: M24 */
/* loaded from: classes8.dex */
public final class M24 {

    /* renamed from: a */
    public static final Map<KClass<? extends Object>, InterfaceC34036Kj2<? extends Object>> f22471a;

    static {
        Map<KClass<? extends Object>, InterfaceC34036Kj2<? extends Object>> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(String.class), C38330b40.m65038D(StringCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Character.TYPE), C38330b40.m65013x(CharCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(char[].class), C38330b40.m65034c()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Double.TYPE), C38330b40.m65012y(DoubleCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(double[].class), C38330b40.m65033d()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Float.TYPE), C38330b40.m65011z(FloatCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(float[].class), C38330b40.m65032e()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Long.TYPE), C38330b40.m65040B(LongCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(long[].class), C38330b40.m65029h()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(ULong.class), C38330b40.m65018s(ULong.Companion)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(ULongArray.class), C38330b40.m65023n()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Integer.TYPE), C38330b40.m65041A(IntCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(int[].class), C38330b40.m65031f()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UInt.class), C38330b40.m65019r(UInt.Companion)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UIntArray.class), C38330b40.m65024m()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Short.TYPE), C38330b40.m65039C(ShortCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(short[].class), C38330b40.m65026k()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UShort.class), C38330b40.m65017t(UShort.Companion)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UShortArray.class), C38330b40.m65022o()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Byte.TYPE), C38330b40.m65014w(ByteCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(byte[].class), C38330b40.m65035b()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UByte.class), C38330b40.m65020q(UByte.Companion)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(UByteArray.class), C38330b40.m65025l()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), C38330b40.m65015v(BooleanCompanionObject.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(boolean[].class), C38330b40.m65036a()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Unit.class), C38330b40.m65016u(Unit.INSTANCE)), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Void.class), C38330b40.m65027j()), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(Duration.class), C38330b40.m65037E(Duration.Companion)));
        f22471a = mapOf;
    }

    /* renamed from: a */
    public static final InterfaceC34588Ms5 m95985a(String serialName, E24 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        m95982d(serialName);
        return new I24(serialName, kind);
    }

    /* renamed from: b */
    public static final <T> InterfaceC34036Kj2<T> m95984b(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (InterfaceC34036Kj2<T>) f22471a.get(kClass);
    }

    /* renamed from: c */
    public static final String m95983c(String str) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt__CharKt.titlecase(charAt) : String.valueOf(charAt)));
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    /* renamed from: d */
    public static final void m95982d(String str) {
        boolean equals;
        String trimIndent;
        boolean equals2;
        for (KClass<? extends Object> kClass : f22471a.keySet()) {
            String simpleName = kClass.getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            String m95983c = m95983c(simpleName);
            equals = StringsKt__StringsJVMKt.equals(str, "kotlin." + m95983c, true);
            if (!equals) {
                equals2 = StringsKt__StringsJVMKt.equals(str, m95983c, true);
                if (equals2) {
                }
            }
            trimIndent = StringsKt__IndentKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + m95983c(m95983c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(trimIndent);
        }
    }
}
