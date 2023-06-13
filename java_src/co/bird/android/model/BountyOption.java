package co.bird.android.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/BountyOption;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CHARGE", "DAMAGED_CHARGE", "REBALANCE", "DAMAGED_TRANSPORT", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBountyOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyOption.kt\nco/bird/android/model/BountyOption\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,18:1\n8811#2,2:19\n9071#2,4:21\n*S KotlinDebug\n*F\n+ 1 BountyOption.kt\nco/bird/android/model/BountyOption\n*L\n13#1:19,2\n13#1:21,4\n*E\n"})
/* loaded from: classes4.dex */
public enum BountyOption {
    CHARGE(0),
    DAMAGED_CHARGE(1),
    REBALANCE(2),
    DAMAGED_TRANSPORT(3),
    UNKNOWN(4);
    
    public static final Companion Companion = new Companion(null);
    private static final Map<Integer, BountyOption> map;
    private final int value;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/BountyOption$Companion;", "", "()V", "map", "", "", "Lco/bird/android/model/BountyOption;", "fromInt", "type", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BountyOption fromInt(int i) {
            BountyOption bountyOption = (BountyOption) BountyOption.map.get(Integer.valueOf(i));
            if (bountyOption != null) {
                return bountyOption;
            }
            throw new IllegalArgumentException("There is no BountyOption with this value");
        }

        private Companion() {
        }
    }

    static {
        int mapCapacity;
        int coerceAtLeast;
        BountyOption[] values = values();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (BountyOption bountyOption : values) {
            linkedHashMap.put(Integer.valueOf(bountyOption.value), bountyOption);
        }
        map = linkedHashMap;
    }

    BountyOption(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
