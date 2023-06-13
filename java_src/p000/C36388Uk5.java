package p000;

import android.annotation.SuppressLint;
import android.os.ParcelUuid;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.GattUuid;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import p000.C2029Ey;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u0003\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0007\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0007\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\u0015*\u00020\u0003\u001a\f\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001d\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001e\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001f\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010 \u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010!\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\"\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010#\u001a\u00020\u0019*\u00020\u0000\u001a\u000e\u0010$\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0007\u001a\n\u0010%\u001a\u00020\u0019*\u00020\u0003\u001a\n\u0010&\u001a\u00020\u0019*\u00020\u0003\u001a\n\u0010'\u001a\u00020\u0019*\u00020\u0003\u001a\f\u0010(\u001a\u00020\u0019*\u00020\u0003H\u0007\u001a\f\u0010)\u001a\u00020\u0019*\u00020\u0003H\u0007\u001a\f\u0010*\u001a\u00020\u0019*\u00020\u0003H\u0007\u001a\f\u0010+\u001a\u00020\u0019*\u00020\u0003H\u0007\u001a\n\u0010,\u001a\u00020\u0019*\u00020\u0003\u001a\n\u0010-\u001a\u00020\u0019*\u00020\u0003\u001a%\u00101\u001a\u00020\u0019*\u00020\u00002\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/¢\u0006\u0004\b1\u00102\u001a%\u00103\u001a\u00020\u0019*\u00020\u00032\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/¢\u0006\u0004\b3\u00104\u001a\f\u00105\u001a\u00020\u0001*\u00020\u0006H\u0002\u001a\u0018\u00108\u001a\n 7*\u0004\u0018\u00010\u00010\u0001*\u00060\u0006j\u0002`6H\u0002\u001a\u0012\u0010:\u001a\u0004\u0018\u00010\u0006*\u00060\u0006j\u0002`9H\u0002\u001a\u0017\u0010<\u001a\u0004\u0018\u00010;*\u00060\u0006j\u0002`9¢\u0006\u0004\b<\u0010=\u001a\u0012\u0010>\u001a\u0004\u0018\u00010\u0001*\u00060\u0006j\u0002`6H\u0000\u001a\f\u0010@\u001a\u00020?*\u00020\u0006H\u0002\"\u001b\u0010E\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u0010D\"\u001b\u0010I\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bG\u0010H\"\u001b\u0010L\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bF\u0010K\"\u001b\u0010P\u001a\u00020M8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010B\u001a\u0004\bN\u0010O*\n\u0010Q\"\u00020\u00062\u00020\u0006*\n\u0010R\"\u00020\u00062\u00020\u0006¨\u0006S"}, m28432d2 = {"LTk5;", "", "U", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "V", "R", "", "S", "T", "l", "t", "u", "b", "m", "n", "o", "p", "r", "s", "j", "k", "Lco/bird/android/model/VehicleDescriptor;", "Y", "Z", "c", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "M", "A", "E", "N", "I", "K", "P", "G", "y", DateTokenConverter.CONVERTER_KEY, "B", "D", "F", "O", "J", "L", "Q", "H", "z", "", "Ljava/util/UUID;", "serviceUuid", "w", "(LTk5;[Ljava/util/UUID;)Z", "x", "(Lno/nordicsemi/android/support/v18/scanner/ScanResult;[Ljava/util/UUID;)Z", "X", "Lco/bird/android/library/extension/ManufacturerDataByteArray;", "kotlin.jvm.PlatformType", "W", "Lco/bird/android/library/extension/ScanRecordBytes;", "q", "", "h", "([B)Ljava/lang/Integer;", "g", "", C17296a.f69688o, "Ll8;", "Lkotlin/Lazy;", "v", "()Ll8;", "serviceUuidExtractor", "Lf;", "e", "()Lf;", "adPayloadParser", "LEy$b;", "()LEy$b;", "base64Encoder", "Ljava/nio/charset/Charset;", "i", "()Ljava/nio/charset/Charset;", "defaultCharset", "ManufacturerDataByteArray", "ScanRecordBytes", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanResultExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanResultExt.kt\nco/bird/android/library/extension/ScanResultExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,328:1\n1#2:329\n1747#3,3:330\n1747#3,3:337\n288#3,2:340\n288#3,2:342\n11335#4:333\n11670#4,3:334\n*S KotlinDebug\n*F\n+ 1 ScanResultExt.kt\nco/bird/android/library/extension/ScanResultExtKt\n*L\n286#1:330,3\n290#1:337,3\n300#1:340,2\n305#1:342,2\n289#1:333\n289#1:334,3\n*E\n"})
/* renamed from: Uk5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36388Uk5 {

    /* renamed from: a */
    public static final Lazy f37924a;

    /* renamed from: b */
    public static final Lazy f37925b;

    /* renamed from: c */
    public static final Lazy f37926c;

    /* renamed from: d */
    public static final Lazy f37927d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lf;", "kotlin.jvm.PlatformType", "b", "()Lf;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uk5$a */
    /* loaded from: classes3.dex */
    public static final class C8432a extends Lambda implements Function0<C20165f> {

        /* renamed from: g */
        public static final C8432a f37928g = new C8432a();

        public C8432a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C20165f invoke() {
            return C20165f.m42298c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LEy$b;", "kotlin.jvm.PlatformType", "b", "()LEy$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uk5$b */
    /* loaded from: classes3.dex */
    public static final class C8433b extends Lambda implements Function0<C2029Ey.C2031b> {

        /* renamed from: g */
        public static final C8433b f37929g = new C8433b();

        public C8433b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C2029Ey.C2031b invoke() {
            return C2029Ey.m108181b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "b", "()Ljava/nio/charset/Charset;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uk5$c */
    /* loaded from: classes3.dex */
    public static final class C8434c extends Lambda implements Function0<Charset> {

        /* renamed from: g */
        public static final C8434c f37930g = new C8434c();

        public C8434c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Charset invoke() {
            return Charset.defaultCharset();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uk5$d */
    /* loaded from: classes3.dex */
    public static final class C8435d extends Lambda implements Function1<Byte, CharSequence> {

        /* renamed from: g */
        public static final C8435d f37931g = new C8435d();

        public C8435d() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return String.valueOf((int) b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ll8;", "b", "()Ll8;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uk5$e */
    /* loaded from: classes3.dex */
    public static final class C8436e extends Lambda implements Function0<C25620l8> {

        /* renamed from: g */
        public static final C8436e f37932g = new C8436e();

        public C8436e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C25620l8 invoke() {
            return new C25620l8();
        }
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(C8436e.f37932g);
        f37924a = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(C8432a.f37928g);
        f37925b = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(C8433b.f37929g);
        f37926c = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(C8434c.f37930g);
        f37927d = lazy4;
    }

    /* renamed from: A */
    public static final boolean m80950A(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        return m80902w(c36154Tk5, GattUuid.BIRD_AIR_SERVICE.getUuid());
    }

    /* renamed from: B */
    public static final boolean m80949B(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        return m80901x(scanResult, GattUuid.BIRD_AIR_SERVICE.getUuid());
    }

    /* renamed from: C */
    public static final boolean m80948C(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        return m80902w(c36154Tk5, GattUuid.BIRD_BIKE_SERVICE.getUuid(), GattUuid.BIRD_BIKE_SERVICE2.getUuid(), GattUuid.BIRD_BIKE_SERVICE3.getUuid());
    }

    /* renamed from: D */
    public static final boolean m80947D(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        return m80901x(scanResult, GattUuid.BIRD_BIKE_SERVICE.getUuid(), GattUuid.BIRD_BIKE_SERVICE2.getUuid(), GattUuid.BIRD_BIKE_SERVICE3.getUuid());
    }

    /* renamed from: E */
    public static final boolean m80946E(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        return m80902w(c36154Tk5, GattUuid.BIRD_SERVICE.getUuid());
    }

    /* renamed from: F */
    public static final boolean m80945F(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        return m80901x(scanResult, GattUuid.BIRD_SERVICE.getUuid());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m80944G(C36154Tk5 c36154Tk5) {
        boolean z;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m80902w(c36154Tk5, GattUuid.BIRD_FLEX_SERVICE.getUuid())) {
            String m80930U = m80930U(c36154Tk5);
            if (m80930U != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) m80930U, (CharSequence) "ES50", false, 2, (Object) null);
                if (contains$default) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m80943H(ScanResult scanResult) {
        boolean z;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (m80901x(scanResult, GattUuid.BIRD_FLEX_SERVICE.getUuid())) {
            String m80929V = m80929V(scanResult);
            if (m80929V != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) m80929V, (CharSequence) "ES50", false, 2, (Object) null);
                if (contains$default) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    /* renamed from: I */
    public static final boolean m80942I(C36154Tk5 c36154Tk5) {
        boolean equals;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String m80922c = m80922c(c36154Tk5);
        if (m80922c == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80922c, "ZK100", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: J */
    public static final boolean m80941J(ScanResult scanResult) {
        boolean equals;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        String m80921d = m80921d(scanResult);
        if (m80921d == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80921d, "ZK100", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static final boolean m80940K(C36154Tk5 c36154Tk5) {
        boolean equals;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String m80922c = m80922c(c36154Tk5);
        if (m80922c == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80922c, "ES400", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: L */
    public static final boolean m80939L(ScanResult scanResult) {
        boolean equals;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        String m80921d = m80921d(scanResult);
        if (m80921d == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80921d, "ES400", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public static final boolean m80938M(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        return m80902w(c36154Tk5, GattUuid.BIRD_BIKE_SERVICE3.getUuid());
    }

    /* renamed from: N */
    public static final boolean m80937N(C36154Tk5 c36154Tk5) {
        boolean equals;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String m80922c = m80922c(c36154Tk5);
        if (m80922c == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80922c, "bd", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: O */
    public static final boolean m80936O(ScanResult scanResult) {
        boolean equals;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        String m80921d = m80921d(scanResult);
        if (m80921d == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(m80921d, "bd", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public static final boolean m80935P(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (!m80942I(c36154Tk5) && !m80940K(c36154Tk5)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Q */
    public static final boolean m80934Q(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (!m80941J(scanResult) && !m80939L(scanResult)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static final String m80933R(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        byte[] m80932S = m80932S(c36154Tk5);
        if (m80932S != null) {
            return m80928W(m80932S);
        }
        return null;
    }

    /* renamed from: S */
    public static final byte[] m80932S(C36154Tk5 c36154Tk5) {
        byte[] mo106631a;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        InterfaceC32176Ck5 m83014c = c36154Tk5.m83014c();
        if (m83014c != null && (mo106631a = m83014c.mo106631a()) != null) {
            return m80908q(mo106631a);
        }
        return null;
    }

    /* renamed from: T */
    public static final byte[] m80931T(ScanResult scanResult) {
        byte[] m113539b;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        C31942Bk5 m22432c = scanResult.m22432c();
        if (m22432c != null && (m113539b = m22432c.m113539b()) != null) {
            return m80908q(m113539b);
        }
        return null;
    }

    /* renamed from: U */
    public static final String m80930U(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        byte[] m80932S = m80932S(c36154Tk5);
        if (m80932S != null) {
            return m80927X(m80932S);
        }
        return null;
    }

    /* renamed from: V */
    public static final String m80929V(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        byte[] m80931T = m80931T(scanResult);
        if (m80931T != null) {
            return m80927X(m80931T);
        }
        return null;
    }

    /* renamed from: W */
    public static final String m80928W(byte[] bArr) {
        return m80919f().m108172e(bArr);
    }

    /* renamed from: X */
    public static final String m80927X(byte[] bArr) {
        return new String(bArr, m80916i());
    }

    /* renamed from: Y */
    public static final VehicleDescriptor m80926Y(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (!m80946E(c36154Tk5) && !m80900y(c36154Tk5) && !m80950A(c36154Tk5) && !m80948C(c36154Tk5) && !m80944G(c36154Tk5)) {
            return new VehicleDescriptor(null, null, null, null, null, null, 63, null);
        }
        return new VehicleDescriptor(null, m80912m(c36154Tk5), m80905t(c36154Tk5), m80910o(c36154Tk5), m80907r(c36154Tk5), m80915j(c36154Tk5), 1, null);
    }

    /* renamed from: Z */
    public static final VehicleDescriptor m80925Z(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (!m80945F(scanResult) && !m80899z(scanResult) && !m80949B(scanResult) && !m80947D(scanResult) && !m80943H(scanResult)) {
            return new VehicleDescriptor(null, null, null, null, null, null, 63, null);
        }
        return new VehicleDescriptor(null, m80911n(scanResult), m80904u(scanResult), m80909p(scanResult), m80906s(scanResult), m80914k(scanResult), 1, null);
    }

    /* renamed from: a */
    public static final long m80924a(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(java.lang.Long.BYTES)");
        allocate.put(bArr);
        allocate.flip();
        return allocate.getLong();
    }

    /* renamed from: b */
    public static final String m80923b(String str) {
        boolean startsWith$default;
        String take;
        String drop;
        String take2;
        if (str.length() != 12) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "OK", false, 2, null);
            if (startsWith$default) {
                drop = StringsKt___StringsKt.drop(str, 1);
                take2 = StringsKt___StringsKt.take("0" + drop, 14);
                return take2;
            }
            take = StringsKt___StringsKt.take(str, 14);
            return take;
        }
        return "0K" + str;
    }

    /* renamed from: c */
    public static final String m80922c(C36154Tk5 c36154Tk5) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String deviceName = c36154Tk5.m83014c().getDeviceName();
        if (deviceName != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(deviceName);
            if (!(!isBlank)) {
                deviceName = null;
            }
            if (deviceName != null) {
                return deviceName;
            }
        }
        return c36154Tk5.m83016a().getName();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public static final String m80921d(ScanResult scanResult) {
        String m113538c;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        C31942Bk5 m22432c = scanResult.m22432c();
        if (m22432c != null && (m113538c = m22432c.m113538c()) != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m113538c);
            if (!(!isBlank)) {
                m113538c = null;
            }
            if (m113538c != null) {
                return m113538c;
            }
        }
        return scanResult.m22434a().getName();
    }

    /* renamed from: e */
    public static final C20165f m80920e() {
        Object value = f37925b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-adPayloadParser>(...)");
        return (C20165f) value;
    }

    /* renamed from: f */
    public static final C2029Ey.C2031b m80919f() {
        Object value = f37926c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-base64Encoder>(...)");
        return (C2029Ey.C2031b) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        r10 = kotlin.collections.ArraysKt___ArraysJvmKt.copyOfRange(r10, 10, 18);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m80918g(byte[] bArr) {
        String joinToString$default;
        boolean z;
        byte[] copyOfRange;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C8435d.f37931g, 30, (Object) null);
        C41318g46.m40163a("VehicleDescriptor getBirdBrainImei bytes: " + joinToString$default, new Object[0]);
        if (bArr.length >= 18) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bArr = null;
        }
        if (bArr == null || copyOfRange == null) {
            return null;
        }
        long m80924a = m80924a(copyOfRange);
        C41318g46.m40163a("VehicleDescriptor construction, imeiLong " + m80924a, new Object[0]);
        if (m80924a == 0) {
            return null;
        }
        String valueOf = String.valueOf(m80924a);
        if (!C45097mS5.m25599g(valueOf, true)) {
            return null;
        }
        return valueOf;
    }

    /* renamed from: h */
    public static final Integer m80917h(byte[] bArr) {
        Object obj;
        C19649d c19649d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        List<C20674g> structures = m80920e().m42297d(bArr);
        Intrinsics.checkNotNullExpressionValue(structures, "structures");
        Iterator<T> it = structures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C20674g) obj) instanceof C19649d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj instanceof C19649d) {
            c19649d = (C19649d) obj;
        } else {
            c19649d = null;
        }
        if (c19649d == null) {
            return null;
        }
        return Integer.valueOf(c19649d.m44757d());
    }

    /* renamed from: i */
    public static final Charset m80916i() {
        Object value = f37927d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-defaultCharset>(...)");
        return (Charset) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = kotlin.collections.ArraysKt___ArraysKt.sliceArray(r0, new kotlin.ranges.IntRange(10, 12));
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m80915j(C36154Tk5 c36154Tk5) {
        String str;
        byte[] sliceArray;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (!m80948C(c36154Tk5)) {
            return null;
        }
        try {
            byte[] m80932S = m80932S(c36154Tk5);
            if (m80932S == null || sliceArray == null) {
                return null;
            }
            return m80927X(sliceArray);
        } catch (Exception e) {
            byte[] m80932S2 = m80932S(c36154Tk5);
            if (m80932S2 != null) {
                str = m80927X(m80932S2);
            } else {
                str = null;
            }
            C41318g46.m40158f(e, "Scan result was assumed to be a bird bike but parsing failed, ignoring (" + str + ")", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = kotlin.collections.ArraysKt___ArraysKt.sliceArray(r0, new kotlin.ranges.IntRange(10, 12));
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m80914k(ScanResult scanResult) {
        String str;
        byte[] sliceArray;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (!m80947D(scanResult)) {
            return null;
        }
        try {
            byte[] m80931T = m80931T(scanResult);
            if (m80931T == null || sliceArray == null) {
                return null;
            }
            return m80927X(sliceArray);
        } catch (Exception e) {
            byte[] m80931T2 = m80931T(scanResult);
            if (m80931T2 != null) {
                str = m80927X(m80931T2);
            } else {
                str = null;
            }
            C41318g46.m40158f(e, "Scan result was assumed to be a bird bike but parsing failed, ignoring (" + str + ")", new Object[0]);
            return null;
        }
    }

    /* renamed from: l */
    public static final String m80913l(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String m80922c = m80922c(c36154Tk5);
        List<ParcelUuid> mo106629c = c36154Tk5.m83014c().mo106629c();
        boolean z = false;
        if (mo106629c != null && mo106629c.contains(new ParcelUuid(GattUuid.BIRD_SERVICE.getUuid()))) {
            z = true;
        }
        if (!z) {
            m80922c = null;
        }
        if (m80922c == null) {
            return m80930U(c36154Tk5);
        }
        return m80922c;
    }

    /* renamed from: m */
    public static final String m80912m(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m80944G(c36154Tk5)) {
            return null;
        }
        if (m80946E(c36154Tk5)) {
            byte[] m80932S = m80932S(c36154Tk5);
            if (m80932S == null) {
                return null;
            }
            return m80918g(m80932S);
        } else if (!m80900y(c36154Tk5)) {
            return null;
        } else {
            return m80930U(c36154Tk5);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: n */
    public static final String m80911n(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (m80943H(scanResult)) {
            return null;
        }
        if (m80945F(scanResult)) {
            byte[] m80931T = m80931T(scanResult);
            if (m80931T == null) {
                return null;
            }
            return m80918g(m80931T);
        } else if (!m80899z(scanResult)) {
            return null;
        } else {
            return m80929V(scanResult);
        }
    }

    /* renamed from: o */
    public static final String m80910o(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        String mo17280e = c36154Tk5.m83016a().mo17280e();
        Intrinsics.checkNotNullExpressionValue(mo17280e, "bleDevice.macAddress");
        return mo17280e;
    }

    /* renamed from: p */
    public static final String m80909p(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        String address = scanResult.m22434a().getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "device.address");
        return address;
    }

    /* renamed from: q */
    public static final byte[] m80908q(byte[] bArr) {
        Object obj;
        List<C20674g> structures = m80920e().m42297d(bArr);
        Intrinsics.checkNotNullExpressionValue(structures, "structures");
        Iterator<T> it = structures.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C20674g) obj) instanceof C19649d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C20674g c20674g = (C20674g) obj;
        if (c20674g == null) {
            return null;
        }
        return c20674g.m40379a();
    }

    /* renamed from: r */
    public static final String m80907r(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m80944G(c36154Tk5)) {
            return Bird_Kt.MODEL_BIRD_FLEX;
        }
        if (m80950A(c36154Tk5)) {
            return Bird_Kt.MODEL_BIRD_AIR;
        }
        if (m80948C(c36154Tk5)) {
            return Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED;
        }
        return null;
    }

    /* renamed from: s */
    public static final String m80906s(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (m80943H(scanResult)) {
            return Bird_Kt.MODEL_BIRD_FLEX;
        }
        if (m80949B(scanResult)) {
            return Bird_Kt.MODEL_BIRD_AIR;
        }
        if (m80947D(scanResult)) {
            return Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED;
        }
        return null;
    }

    /* renamed from: t */
    public static final String m80905t(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m80944G(c36154Tk5)) {
            String m80922c = m80922c(c36154Tk5);
            if (m80922c == null) {
                return null;
            }
            return m80923b(m80922c);
        } else if (!m80946E(c36154Tk5) && !m80950A(c36154Tk5) && !m80948C(c36154Tk5)) {
            return null;
        } else {
            return m80922c(c36154Tk5);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: u */
    public static final String m80904u(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (m80943H(scanResult)) {
            String m80921d = m80921d(scanResult);
            if (m80921d == null) {
                return null;
            }
            return m80923b(m80921d);
        } else if (!m80945F(scanResult) && !m80949B(scanResult) && !m80947D(scanResult)) {
            return null;
        } else {
            return m80921d(scanResult);
        }
    }

    /* renamed from: v */
    public static final C25620l8 m80903v() {
        return (C25620l8) f37924a.getValue();
    }

    /* renamed from: w */
    public static final boolean m80902w(C36154Tk5 c36154Tk5, UUID... serviceUuid) {
        boolean contains;
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        Intrinsics.checkNotNullParameter(serviceUuid, "serviceUuid");
        List<UUID> m27819a = m80903v().m27819a(c36154Tk5.m83014c().mo106631a());
        Intrinsics.checkNotNullExpressionValue(m27819a, "serviceUuidExtractor\n  .…ctUUIDs(scanRecord.bytes)");
        List<UUID> list = m27819a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (UUID uuid : list) {
            contains = ArraysKt___ArraysKt.contains(serviceUuid, uuid);
            if (contains) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static final boolean m80901x(ScanResult scanResult, UUID... serviceUuid) {
        List<ParcelUuid> m113534g;
        boolean z;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        Intrinsics.checkNotNullParameter(serviceUuid, "serviceUuid");
        ArrayList arrayList = new ArrayList(serviceUuid.length);
        for (UUID uuid : serviceUuid) {
            arrayList.add(new ParcelUuid(uuid));
        }
        C31942Bk5 m22432c = scanResult.m22432c();
        if (m22432c == null || (m113534g = m22432c.m113534g()) == null) {
            return false;
        }
        List<ParcelUuid> list = m113534g;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ParcelUuid parcelUuid : list) {
                if (arrayList.contains(parcelUuid)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m80900y(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m80937N(c36154Tk5) || m80935P(c36154Tk5) || m80902w(c36154Tk5, GattUuid.BD_BIRD_SERVICE.getUuid())) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m80899z(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        if (m80936O(scanResult) || m80934Q(scanResult) || m80901x(scanResult, GattUuid.BD_BIRD_SERVICE.getUuid())) {
            return true;
        }
        return false;
    }
}
