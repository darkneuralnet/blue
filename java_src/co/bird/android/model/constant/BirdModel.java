package co.bird.android.model.constant;

import co.bird.android.model.persistence.extensions.Bird_Kt;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/constant/BirdModel;", "", "description", "", "modelOverride", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getModelOverride", "type", "Lco/bird/android/model/constant/ModelType;", "getType", "()Lco/bird/android/model/constant/ModelType;", "isBike", "", "isCruiser", "isMiniCruiser", "isMoto", "isScanOnly", "isScooter", "toString", "M365", "ES", "ESX", "BD", "RF", "B2", "B3", "B4", "EB100", "ES400", "ES500", "BC", "SGC", "SSC", "STE", "SFB", "SKF", "SFK", "SCAN_ONLY", "BIRDAIR", "BIRDBIKE_UNPAIRED", "BIRDBIKE_PAIRABLE", "UNKNOWN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum BirdModel {
    M365("M365", null, 2, null),
    ES("ESB", null, 2, null),
    ESX("ESX", null, 2, null),
    BD("Bird Zero", null, 2, null),
    RF("Bird One", null, 2, null),
    B2("Bird Two", null, 2, null),
    B3("Bird Three", null, 2, null),
    B4("Bird Four", null, 2, null),
    EB100("Bird Bikeshare EB100", null, 2, null),
    ES400("Bird Swappable ES400", null, 2, null),
    ES500("Bird Flex", null, 2, null),
    BC("Bird Cruiser", null, 2, null),
    SGC("Scoot Genze", null, 2, null),
    SSC("Scoot Silence", null, 2, null),
    STE("Scoot Taioku Ebike", null, 2, null),
    SFB("Scoot Forever Bike", null, 2, null),
    SKF("Scoot Kick Fit Rider", null, 2, null),
    SFK("Scoot Forever Kick", null, 2, null),
    SCAN_ONLY("Scan Only Bird", null, 2, null),
    BIRDAIR("Bird Air", null, 2, null),
    BIRDBIKE_UNPAIRED("Bird Bike", Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED),
    BIRDBIKE_PAIRABLE(" Bird Bike", Bird_Kt.MODEL_BIRD_BIKE_PAIRABLE),
    UNKNOWN("Unknown", null, 2, null);
    
    public static final Companion Companion;
    private static final List<BirdModel> bikeModels;
    private static final List<BirdModel> birdOnePcmList;
    private static final List<BirdModel> birdZeroList;
    private static final List<BirdModel> cruiserModels;
    private static final List<BirdModel> miniCruiserModels;
    private static final List<BirdModel> motoModels;
    private static final List<BirdModel> scooterModels;
    private static final List<BirdModel> swappableModels;
    private static final List<BirdModel> v2BrainList;
    private final String description;
    private final String modelOverride;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/constant/BirdModel$Companion;", "", "()V", "bikeModels", "", "Lco/bird/android/model/constant/BirdModel;", "getBikeModels", "()Ljava/util/List;", "birdOnePcmList", "getBirdOnePcmList", "birdZeroList", "getBirdZeroList", "cruiserModels", "getCruiserModels", "miniCruiserModels", "getMiniCruiserModels", "motoModels", "getMotoModels", "scooterModels", "getScooterModels", "swappableModels", "getSwappableModels", "v2BrainList", "getV2BrainList", "fromString", Entry.TYPE_TEXT, "", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBirdModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdModel.kt\nco/bird/android/model/constant/BirdModel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n1282#2,2:87\n*S KotlinDebug\n*F\n+ 1 BirdModel.kt\nco/bird/android/model/constant/BirdModel$Companion\n*L\n52#1:87,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BirdModel fromString(String str) {
            BirdModel[] values;
            boolean equals;
            boolean z;
            boolean equals2;
            if (str == null) {
                return null;
            }
            for (BirdModel birdModel : BirdModel.values()) {
                boolean z2 = true;
                equals = StringsKt__StringsJVMKt.equals(birdModel.getDescription(), str, true);
                if (!equals) {
                    String name = birdModel.name();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    String upperCase = str.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    if (!Intrinsics.areEqual(name, upperCase)) {
                        String modelOverride = birdModel.getModelOverride();
                        if (modelOverride != null) {
                            equals2 = StringsKt__StringsJVMKt.equals(modelOverride, str, true);
                            if (equals2) {
                                z = true;
                                if (!z) {
                                    z2 = false;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
                if (z2) {
                    return birdModel;
                }
            }
            return null;
        }

        public final List<BirdModel> getBikeModels() {
            return BirdModel.bikeModels;
        }

        public final List<BirdModel> getBirdOnePcmList() {
            return BirdModel.birdOnePcmList;
        }

        public final List<BirdModel> getBirdZeroList() {
            return BirdModel.birdZeroList;
        }

        public final List<BirdModel> getCruiserModels() {
            return BirdModel.cruiserModels;
        }

        public final List<BirdModel> getMiniCruiserModels() {
            return BirdModel.miniCruiserModels;
        }

        public final List<BirdModel> getMotoModels() {
            return BirdModel.motoModels;
        }

        public final List<BirdModel> getScooterModels() {
            return BirdModel.scooterModels;
        }

        public final List<BirdModel> getSwappableModels() {
            return BirdModel.swappableModels;
        }

        public final List<BirdModel> getV2BrainList() {
            return BirdModel.v2BrainList;
        }

        private Companion() {
        }
    }

    static {
        BirdModel birdModel;
        BirdModel birdModel2;
        BirdModel birdModel3;
        BirdModel birdModel4;
        BirdModel birdModel5;
        BirdModel birdModel6;
        BirdModel birdModel7;
        List<BirdModel> listOf;
        List<BirdModel> listOf2;
        List<BirdModel> listOf3;
        List<BirdModel> listOf4;
        List<BirdModel> listOf5;
        List<BirdModel> emptyList;
        List<BirdModel> listOf6;
        List<BirdModel> listOf7;
        List<BirdModel> listOf8;
        BirdModel birdModel8 = M365;
        r0 = ES;
        BirdModel birdModel9 = ESX;
        BirdModel birdModel10 = BD;
        BirdModel birdModel11 = RF;
        BirdModel birdModel12 = B2;
        BirdModel birdModel13 = B3;
        BirdModel birdModel14 = B4;
        BirdModel birdModel15 = EB100;
        BirdModel birdModel16 = ES400;
        BirdModel birdModel17 = ES500;
        BirdModel birdModel18 = BC;
        Companion = new Companion(null);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel10, birdModel18, birdModel16, birdModel15, birdModel17});
        birdZeroList = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel8, r0, birdModel9, birdModel11, birdModel12, birdModel13});
        v2BrainList = listOf2;
        listOf3 = CollectionsKt__CollectionsJVMKt.listOf(birdModel11);
        birdOnePcmList = listOf3;
        listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel8, r0, birdModel9, birdModel10, birdModel11, birdModel12, birdModel13, birdModel14, birdModel5, birdModel6, birdModel7, birdModel16, birdModel17});
        scooterModels = listOf4;
        listOf5 = CollectionsKt__CollectionsJVMKt.listOf(birdModel18);
        cruiserModels = listOf5;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        miniCruiserModels = emptyList;
        listOf6 = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel, birdModel2});
        motoModels = listOf6;
        listOf7 = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel3, birdModel4, birdModel15});
        bikeModels = listOf7;
        listOf8 = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdModel[]{birdModel15, birdModel16, birdModel14});
        swappableModels = listOf8;
    }

    BirdModel(String str, String str2) {
        this.description = str;
        this.modelOverride = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getModelOverride() {
        return this.modelOverride;
    }

    public final ModelType getType() {
        if (isScooter()) {
            return ModelType.SCOOTER;
        }
        if (isCruiser()) {
            return ModelType.CRUISER;
        }
        if (isMiniCruiser()) {
            return ModelType.MINI_CRUISER;
        }
        if (isMoto()) {
            return ModelType.MOTO;
        }
        if (isBike()) {
            return ModelType.BIKE;
        }
        return ModelType.UNKNOWN;
    }

    public final boolean isBike() {
        return bikeModels.contains(this);
    }

    public final boolean isCruiser() {
        return cruiserModels.contains(this);
    }

    public final boolean isMiniCruiser() {
        return miniCruiserModels.contains(this);
    }

    public final boolean isMoto() {
        return motoModels.contains(this);
    }

    public final boolean isScanOnly() {
        return this == SCAN_ONLY;
    }

    public final boolean isScooter() {
        return scooterModels.contains(this);
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    /* synthetic */ BirdModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
