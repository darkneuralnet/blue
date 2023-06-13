package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.BirdLicenseView;
import co.bird.android.model.persistence.nestedstructures.BountyReason;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0012\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0003H\u0007J\f\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u0003H\u0007J\f\u0010\u000e\u001a\u00020\u0003*\u00020\rH\u0007J\f\u0010\u000f\u001a\u00020\r*\u00020\u0003H\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006H\u0007J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0003H\u0007J\f\u0010\u0019\u001a\u00020\u0003*\u00020\u0018H\u0007J\f\u0010\u001a\u001a\u00020\u0018*\u00020\u0003H\u0007J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010!H\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010!*\u0004\u0018\u00010\u0003H\u0007J\f\u0010%\u001a\u00020\u0003*\u00020$H\u0007J\f\u0010&\u001a\u00020$*\u00020\u0003H\u0007J\u0012\u0010(\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020'0\u0006H\u0007J\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u0006*\u00020\u0003H\u0007R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001c\u00102\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001c\u00103\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001c\u00104\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101¨\u00067"}, m28432d2 = {"LaL;", "", "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "", "o", DateTokenConverter.CONVERTER_KEY, "", "Lco/bird/android/model/constant/BirdAction;", "b", "c", "Lco/bird/android/model/constant/BountyKind;", "k", "g", "Lco/bird/android/model/constant/BirdTaskKind;", "j", "f", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "r", "y", "t", "z", "Lco/bird/android/model/constant/PartnerBirdState;", "n", "x", "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "q", "u", "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;", "p", "e", "Lco/bird/android/model/constant/NestPurpose;", "m", "w", "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "s", "A", "Lco/bird/android/model/constant/MapPinBadge;", "l", "v", "Lco/bird/android/model/persistence/nestedstructures/BountyReason;", "h", "i", "Lwi2;", "Lkotlin/Lazy;", C17296a.f69688o, "()Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "Ljava/lang/reflect/Type;", "birdActionsToken", "bountyReasonsToken", "physicalLocksToken", "<init>", "()V", "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdConverters.kt\nco/bird/android/persistence/bird/impl/converters/BirdConverters\n+ 2 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n13#2,2:110\n15#2,2:114\n13#2,2:116\n15#2,2:120\n13#2,2:123\n15#2,2:127\n13#2,2:129\n15#2,2:133\n13#2,2:135\n15#2,2:139\n1109#3,2:112\n1109#3,2:118\n1109#3,2:125\n1109#3,2:131\n1109#3,2:137\n1#4:122\n*S KotlinDebug\n*F\n+ 1 BirdConverters.kt\nco/bird/android/persistence/bird/impl/converters/BirdConverters\n*L\n43#1:110,2\n43#1:114,2\n49#1:116,2\n49#1:120,2\n68#1:123,2\n68#1:127,2\n88#1:129,2\n88#1:133,2\n101#1:135,2\n101#1:139,2\n43#1:112,2\n49#1:118,2\n68#1:125,2\n88#1:131,2\n101#1:137,2\n*E\n"})
/* renamed from: aL */
/* loaded from: classes4.dex */
public final class C10628aL {

    /* renamed from: a */
    public static final C10628aL f50300a = new C10628aL();

    /* renamed from: b */
    public static final Lazy f50301b;

    /* renamed from: c */
    public static final Type f50302c;

    /* renamed from: d */
    public static final Type f50303d;

    /* renamed from: e */
    public static final Type f50304e;

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"aL$a", "LFb6;", "", "Lco/bird/android/model/constant/BirdAction;", "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aL$a */
    /* loaded from: classes4.dex */
    public static final class C10629a extends C32798Fb6<List<? extends BirdAction>> {
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"aL$b", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/BountyReason;", "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aL$b */
    /* loaded from: classes4.dex */
    public static final class C10630b extends C32798Fb6<List<? extends BountyReason>> {
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lwi2;", "b", "()Lwi2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aL$c */
    /* loaded from: classes4.dex */
    public static final class C10631c extends Lambda implements Function0<C51174wi2> {

        /* renamed from: g */
        public static final C10631c f50305g = new C10631c();

        public C10631c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C51174wi2 invoke() {
            return Converters.f66822a.m55283a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"aL$d", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "co.bird.android.lib.persistence.bird.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aL$d */
    /* loaded from: classes4.dex */
    public static final class C10632d extends C32798Fb6<List<? extends PhysicalLock>> {
    }

    static {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C10631c.f50305g);
        f50301b = lazy;
        f50302c = new C10629a().getType();
        f50303d = new C10630b().getType();
        f50304e = new C10632d().getType();
    }

    private C10628aL() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final PrivateBird m71651A(String str) {
        if (str != null) {
            return (PrivateBird) f50300a.m71650a().m6459c(str, Reflection.getOrCreateKotlinClass(PrivateBird.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m71649b(List<? extends BirdAction> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f50300a.m71650a().m6453i(list);
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<BirdAction> m71648c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C51174wi2 m71650a = f50300a.m71650a();
        Type birdActionsToken = f50302c;
        Intrinsics.checkNotNullExpressionValue(birdActionsToken, "birdActionsToken");
        return (List) m71650a.m6460b(str, birdActionsToken);
    }

    @JvmStatic
    /* renamed from: d */
    public static final BirdLabel m71647d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (BirdLabel) f50300a.m71650a().m6459c(str, Reflection.getOrCreateKotlinClass(BirdLabel.class));
    }

    @JvmStatic
    /* renamed from: e */
    public static final BirdLicenseView m71646e(String str) {
        if (str != null) {
            return (BirdLicenseView) f50300a.m71650a().m6459c(str, Reflection.getOrCreateKotlinClass(BirdLicenseView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final BirdTaskKind m71645f(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            try {
                enumConstants = BirdTaskKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = BirdTaskKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r6 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            for (Object obj2 : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), upperCase, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                    r6 = (Enum) obj2;
                    return (BirdTaskKind) r6;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused2) {
            return BirdTaskKind.UNKNOWN;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final BountyKind m71644g(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            try {
                enumConstants = BountyKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = BountyKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r6 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            for (Object obj2 : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), upperCase, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                    r6 = (Enum) obj2;
                    return (BountyKind) r6;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused2) {
            return BountyKind.UNKNOWN;
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m71643h(List<BountyReason> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f50300a.m71650a().m6453i(list);
    }

    @JvmStatic
    /* renamed from: i */
    public static final List<BountyReason> m71642i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C51174wi2 m71650a = f50300a.m71650a();
        Type bountyReasonsToken = f50303d;
        Intrinsics.checkNotNullExpressionValue(bountyReasonsToken, "bountyReasonsToken");
        return (List) m71650a.m6460b(str, bountyReasonsToken);
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m71641j(BirdTaskKind birdTaskKind) {
        Intrinsics.checkNotNullParameter(birdTaskKind, "<this>");
        return birdTaskKind.name();
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m71640k(BountyKind bountyKind) {
        Intrinsics.checkNotNullParameter(bountyKind, "<this>");
        return bountyKind.name();
    }

    @JvmStatic
    /* renamed from: l */
    public static final String m71639l(MapPinBadge mapPinBadge) {
        Intrinsics.checkNotNullParameter(mapPinBadge, "<this>");
        return mapPinBadge.name();
    }

    @JvmStatic
    /* renamed from: m */
    public static final String m71638m(NestPurpose nestPurpose) {
        if (nestPurpose != null) {
            return nestPurpose.name();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: n */
    public static final String m71637n(PartnerBirdState partnerBirdState) {
        if (partnerBirdState != null) {
            return partnerBirdState.name();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: o */
    public static final String m71636o(BirdLabel birdLabel) {
        Intrinsics.checkNotNullParameter(birdLabel, "<this>");
        return f50300a.m71650a().m6453i(birdLabel);
    }

    @JvmStatic
    /* renamed from: p */
    public static final String m71635p(BirdLicenseView birdLicenseView) {
        if (birdLicenseView != null) {
            return f50300a.m71650a().m6453i(birdLicenseView);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: q */
    public static final String m71634q(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        return f50300a.m71650a().m6453i(lifecycle);
    }

    @JvmStatic
    /* renamed from: r */
    public static final String m71633r(PhysicalLock physicalLock) {
        if (physicalLock != null) {
            return f50300a.m71650a().m6453i(physicalLock);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: s */
    public static final String m71632s(PrivateBird privateBird) {
        if (privateBird != null) {
            return f50300a.m71650a().m6453i(privateBird);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: t */
    public static final String m71631t(List<PhysicalLock> list) {
        if (list != null) {
            return f50300a.m71650a().m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: u */
    public static final Lifecycle m71630u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (Lifecycle) f50300a.m71650a().m6459c(str, Reflection.getOrCreateKotlinClass(Lifecycle.class));
    }

    @JvmStatic
    /* renamed from: v */
    public static final MapPinBadge m71629v(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        try {
            enumConstants = MapPinBadge.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
        } catch (Exception unused) {
            Object[] enumConstants2 = MapPinBadge.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants2);
            for (Object obj : enumConstants2) {
                r6 = (Enum) obj;
                if (Intrinsics.areEqual(r6.name(), "UNKNOWN")) {
                    Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        for (Object obj2 : enumConstants) {
            equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), upperCase, true);
            if (equals) {
                Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                r6 = (Enum) obj2;
                return (MapPinBadge) r6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @JvmStatic
    /* renamed from: w */
    public static final NestPurpose m71628w(String str) {
        Enum r7;
        Object[] enumConstants;
        int i;
        boolean equals;
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            try {
                enumConstants = NestPurpose.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = NestPurpose.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r7 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            for (Object obj2 : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), upperCase, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                    r7 = (Enum) obj2;
                    return (NestPurpose) r7;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused2) {
            return null;
        }
    }

    @JvmStatic
    /* renamed from: x */
    public static final PartnerBirdState m71627x(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        if (str != null) {
            try {
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                try {
                    enumConstants = PartnerBirdState.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                } catch (Exception unused) {
                    Object[] enumConstants2 = PartnerBirdState.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj : enumConstants2) {
                        if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            r6 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                for (Object obj2 : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), upperCase, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r6 = (Enum) obj2;
                        return (PartnerBirdState) r6;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused2) {
                return PartnerBirdState.UNKNOWN;
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: y */
    public static final PhysicalLock m71626y(String str) {
        if (str != null) {
            return (PhysicalLock) f50300a.m71650a().m6459c(str, Reflection.getOrCreateKotlinClass(PhysicalLock.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: z */
    public static final List<PhysicalLock> m71625z(String str) {
        if (str != null) {
            C51174wi2 m71650a = f50300a.m71650a();
            Type physicalLocksToken = f50304e;
            Intrinsics.checkNotNullExpressionValue(physicalLocksToken, "physicalLocksToken");
            return (List) m71650a.m6460b(str, physicalLocksToken);
        }
        return null;
    }

    /* renamed from: a */
    public final C51174wi2 m71650a() {
        return (C51174wi2) f50301b.getValue();
    }
}
