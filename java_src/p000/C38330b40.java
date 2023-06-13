package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import java.util.Map;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006\u001a\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u001a\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001H\u0007ø\u0001\u0000\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\r\u001a\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001\u001a\u0011\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0007ø\u0001\u0000\u001a\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014\u001a\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001\u001a\u0011\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001H\u0007ø\u0001\u0000\u001a\u0010\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u001b\u001a\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001\u001a\u0011\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001H\u0007ø\u0001\u0000\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0001*\u00020\"\u001a\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0001\u001a\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0001*\u00020'\u001a\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0001\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020,¢\u0006\u0004\b.\u0010/\u001a\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0001\u001a\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0001*\u000202¢\u0006\u0004\b3\u00104\u001a\u0010\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u000205\u001a&\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:0\u0001\"\u0004\b\u0000\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a@\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0\u0001\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\u001a\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0001*\u00020Bø\u0001\u0000\u001a\u0013\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u0001*\u00020Eø\u0001\u0000\u001a\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u0001*\u00020Hø\u0001\u0000\u001a\u0013\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u0001*\u00020Kø\u0001\u0000\u001a\u0013\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u0001*\u00020Nø\u0001\u0000\u001a\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u0001H\u0007\"3\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u00108*\u00020S*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\f\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, m28432d2 = {"Lkotlin/Char$Companion;", "LKj2;", "", "x", "", "c", "Lkotlin/Byte$Companion;", "", "w", "", "b", "Lkotlin/UByteArray;", "l", "Lkotlin/Short$Companion;", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "k", "Lkotlin/UShortArray;", "o", "Lkotlin/Int$Companion;", "", "A", "", "f", "Lkotlin/UIntArray;", "m", "Lkotlin/Long$Companion;", "", "B", "", "h", "Lkotlin/ULongArray;", "n", "Lkotlin/Float$Companion;", "", "z", "", "e", "Lkotlin/Double$Companion;", "", "y", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Boolean$Companion;", "", "v", "(Lkotlin/jvm/internal/BooleanCompanionObject;)LKj2;", "", C17296a.f69688o, "", "u", "(Lkotlin/Unit;)LKj2;", "Lkotlin/String$Companion;", "", "D", "T", "elementSerializer", "", "g", "K", "V", "keySerializer", "valueSerializer", "", "i", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "r", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "s", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "q", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "t", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "E", "", "j", "", "p", "(LKj2;)LKj2;", "getNullable$annotations", "(LKj2;)V", "nullable", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: b40  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38330b40 {
    /* renamed from: A */
    public static final InterfaceC34036Kj2<Integer> m65041A(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return F52.f8705a;
    }

    /* renamed from: B */
    public static final InterfaceC34036Kj2<Long> m65040B(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return C46009nz2.f101176a;
    }

    /* renamed from: C */
    public static final InterfaceC34036Kj2<Short> m65039C(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return C36991Wz5.f42434a;
    }

    /* renamed from: D */
    public static final InterfaceC34036Kj2<String> m65038D(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return C41539gS5.f82260a;
    }

    /* renamed from: E */
    public static final InterfaceC34036Kj2<Duration> m65037E(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C44318l81.f95588a;
    }

    /* renamed from: a */
    public static final InterfaceC34036Kj2<boolean[]> m65036a() {
        return C9425XY.f43377c;
    }

    /* renamed from: b */
    public static final InterfaceC34036Kj2<byte[]> m65035b() {
        return C47865r70.f106480c;
    }

    /* renamed from: c */
    public static final InterfaceC34036Kj2<char[]> m65034c() {
        return C36824Wh0.f41510c;
    }

    /* renamed from: d */
    public static final InterfaceC34036Kj2<double[]> m65033d() {
        return T51.f34737c;
    }

    /* renamed from: e */
    public static final InterfaceC34036Kj2<float[]> m65032e() {
        return C45365mu1.f99011c;
    }

    /* renamed from: f */
    public static final InterfaceC34036Kj2<int[]> m65031f() {
        return C51403x52.f117084c;
    }

    /* renamed from: g */
    public static final <T> InterfaceC34036Kj2<List<T>> m65030g(InterfaceC34036Kj2<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C27999ro(elementSerializer);
    }

    /* renamed from: h */
    public static final InterfaceC34036Kj2<long[]> m65029h() {
        return C42451hz2.f86246c;
    }

    /* renamed from: i */
    public static final <K, V> InterfaceC34036Kj2<Map<K, V>> m65028i(InterfaceC34036Kj2<K> keySerializer, InterfaceC34036Kj2<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C35512Qr2(keySerializer, valueSerializer);
    }

    /* renamed from: j */
    public static final InterfaceC34036Kj2 m65027j() {
        return P93.f28029a;
    }

    /* renamed from: k */
    public static final InterfaceC34036Kj2<short[]> m65026k() {
        return C36055Sz5.f34593c;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: l */
    public static final InterfaceC34036Kj2<UByteArray> m65025l() {
        return C34913Oc6.f26946c;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: m */
    public static final InterfaceC34036Kj2<UIntArray> m65024m() {
        return C35615Rc6.f32318c;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: n */
    public static final InterfaceC34036Kj2<ULongArray> m65023n() {
        return C36317Uc6.f37689c;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: o */
    public static final InterfaceC34036Kj2<UShortArray> m65022o() {
        return C45200md6.f98458c;
    }

    /* renamed from: p */
    public static final <T> InterfaceC34036Kj2<T> m65021p(InterfaceC34036Kj2<T> interfaceC34036Kj2) {
        Intrinsics.checkNotNullParameter(interfaceC34036Kj2, "<this>");
        if (!interfaceC34036Kj2.getDescriptor().mo10462b()) {
            return new C47569qd3(interfaceC34036Kj2);
        }
        return interfaceC34036Kj2;
    }

    /* renamed from: q */
    public static final InterfaceC34036Kj2<UByte> m65020q(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C35147Pc6.f28748a;
    }

    /* renamed from: r */
    public static final InterfaceC34036Kj2<UInt> m65019r(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C35849Sc6.f33965a;
    }

    /* renamed from: s */
    public static final InterfaceC34036Kj2<ULong> m65018s(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C37253Yc6.f46077a;
    }

    /* renamed from: t */
    public static final InterfaceC34036Kj2<UShort> m65017t(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C45793nd6.f100233a;
    }

    /* renamed from: u */
    public static final InterfaceC34036Kj2<Unit> m65016u(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return C40466ee6.f78656b;
    }

    /* renamed from: v */
    public static final InterfaceC34036Kj2<Boolean> m65015v(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return C9804YY.f45990a;
    }

    /* renamed from: w */
    public static final InterfaceC34036Kj2<Byte> m65014w(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return K70.f19100a;
    }

    /* renamed from: x */
    public static final InterfaceC34036Kj2<Character> m65013x(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return C37526Zh0.f48962a;
    }

    /* renamed from: y */
    public static final InterfaceC34036Kj2<Double> m65012y(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Z51.f47834a;
    }

    /* renamed from: z */
    public static final InterfaceC34036Kj2<Float> m65011z(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return C48922su1.f109470a;
    }
}
