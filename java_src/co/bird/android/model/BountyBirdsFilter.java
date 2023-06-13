package co.bird.android.model;

import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B]\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002J\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J_\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lco/bird/android/model/BountyBirdsFilter;", "Lco/bird/android/model/BirdsFilter;", "Lco/bird/android/model/wire/WireBird;", "Lorg/joda/time/DateTime;", "lastRidden", "lastLocatedAt", "", "isIncludedBountyOption", "bird", "invoke", "Lco/bird/android/model/IntervalFilter;", "", "component1", "component2", "component3", "Lm46;", "component4", "", "Lco/bird/android/model/BountyOption;", "component5", "component6", "lastRiddenMillisAgo", "lastLocatedMillisAgo", "price", "timeProvider", "includedBountyOptions", "enableLastRiddenFilter", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/IntervalFilter;", "getLastRiddenMillisAgo", "()Lco/bird/android/model/IntervalFilter;", "getLastLocatedMillisAgo", "getPrice", "Lm46;", "getTimeProvider", "()Lm46;", "Ljava/util/Set;", "getIncludedBountyOptions", "()Ljava/util/Set;", "Z", "getEnableLastRiddenFilter", "()Z", "<init>", "(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;Z)V", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyBirdsFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyBirdsFilter.kt\nco/bird/android/model/BountyBirdsFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes4.dex */
public final class BountyBirdsFilter implements BirdsFilter {
    public static final Companion Companion = new Companion(null);
    private static final DateTime MIN_DATE_TIME = new DateTime(0);
    private final boolean enableLastRiddenFilter;
    private final Set<BountyOption> includedBountyOptions;
    private final IntervalFilter<Long> lastLocatedMillisAgo;
    private final IntervalFilter<Long> lastRiddenMillisAgo;
    private final IntervalFilter<Long> price;
    private final InterfaceC44876m46 timeProvider;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/BountyBirdsFilter$Companion;", "", "()V", "MIN_DATE_TIME", "Lorg/joda/time/DateTime;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BountyBirdsFilter() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ BountyBirdsFilter copy$default(BountyBirdsFilter bountyBirdsFilter, IntervalFilter intervalFilter, IntervalFilter intervalFilter2, IntervalFilter intervalFilter3, InterfaceC44876m46 interfaceC44876m46, Set set, boolean z, int i, Object obj) {
        IntervalFilter<Long> intervalFilter4 = intervalFilter;
        if ((i & 1) != 0) {
            intervalFilter4 = bountyBirdsFilter.lastRiddenMillisAgo;
        }
        IntervalFilter<Long> intervalFilter5 = intervalFilter2;
        if ((i & 2) != 0) {
            intervalFilter5 = bountyBirdsFilter.lastLocatedMillisAgo;
        }
        IntervalFilter intervalFilter6 = intervalFilter5;
        IntervalFilter<Long> intervalFilter7 = intervalFilter3;
        if ((i & 4) != 0) {
            intervalFilter7 = bountyBirdsFilter.price;
        }
        IntervalFilter intervalFilter8 = intervalFilter7;
        if ((i & 8) != 0) {
            interfaceC44876m46 = bountyBirdsFilter.timeProvider;
        }
        InterfaceC44876m46 interfaceC44876m462 = interfaceC44876m46;
        Set<BountyOption> set2 = set;
        if ((i & 16) != 0) {
            set2 = bountyBirdsFilter.includedBountyOptions;
        }
        Set set3 = set2;
        if ((i & 32) != 0) {
            z = bountyBirdsFilter.enableLastRiddenFilter;
        }
        return bountyBirdsFilter.copy(intervalFilter4, intervalFilter6, intervalFilter8, interfaceC44876m462, set3, z);
    }

    private final boolean isIncludedBountyOption(WireBird wireBird) {
        if (this.includedBountyOptions.contains(BountyOption.CHARGE) && wireBird.getBountyKind() == BountyKind.CHARGE && !WireBirdKt.isDamaged(wireBird)) {
            return true;
        }
        if (this.includedBountyOptions.contains(BountyOption.DAMAGED_CHARGE) && wireBird.getBountyKind() == BountyKind.CHARGE && WireBirdKt.isDamaged(wireBird)) {
            return true;
        }
        if (this.includedBountyOptions.contains(BountyOption.REBALANCE) && wireBird.getBountyKind() == BountyKind.REBALANCE && !WireBirdKt.isDamaged(wireBird)) {
            return true;
        }
        if (this.includedBountyOptions.contains(BountyOption.DAMAGED_TRANSPORT) && wireBird.getBountyKind() == BountyKind.REBALANCE && WireBirdKt.isDamaged(wireBird)) {
            return true;
        }
        return false;
    }

    private final DateTime lastLocatedAt(WireBird wireBird) {
        DateTime trackedAt = wireBird.getTrackedAt();
        if (trackedAt == null) {
            DateTime gpsAt = wireBird.getGpsAt();
            if (gpsAt == null) {
                return MIN_DATE_TIME;
            }
            return gpsAt;
        }
        DateTime gpsAt2 = wireBird.getGpsAt();
        if (gpsAt2 == null) {
            DateTime trackedAt2 = wireBird.getTrackedAt();
            if (trackedAt2 == null) {
                return MIN_DATE_TIME;
            }
            return trackedAt2;
        }
        return C46880pT0.m19256f(trackedAt, gpsAt2);
    }

    private final DateTime lastRidden(WireBird wireBird) {
        DateTime lastRideEndedAt = wireBird.getLastRideEndedAt();
        return lastRideEndedAt == null ? MIN_DATE_TIME : lastRideEndedAt;
    }

    public final IntervalFilter<Long> component1() {
        return this.lastRiddenMillisAgo;
    }

    public final IntervalFilter<Long> component2() {
        return this.lastLocatedMillisAgo;
    }

    public final IntervalFilter<Long> component3() {
        return this.price;
    }

    public final InterfaceC44876m46 component4() {
        return this.timeProvider;
    }

    public final Set<BountyOption> component5() {
        return this.includedBountyOptions;
    }

    public final boolean component6() {
        return this.enableLastRiddenFilter;
    }

    public final BountyBirdsFilter copy(IntervalFilter<Long> lastRiddenMillisAgo, IntervalFilter<Long> lastLocatedMillisAgo, IntervalFilter<Long> price, InterfaceC44876m46 interfaceC44876m46, Set<BountyOption> includedBountyOptions, boolean z) {
        Intrinsics.checkNotNullParameter(lastRiddenMillisAgo, "lastRiddenMillisAgo");
        Intrinsics.checkNotNullParameter(lastLocatedMillisAgo, "lastLocatedMillisAgo");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(includedBountyOptions, "includedBountyOptions");
        return new BountyBirdsFilter(lastRiddenMillisAgo, lastLocatedMillisAgo, price, interfaceC44876m46, includedBountyOptions, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyBirdsFilter) {
            BountyBirdsFilter bountyBirdsFilter = (BountyBirdsFilter) obj;
            return Intrinsics.areEqual(this.lastRiddenMillisAgo, bountyBirdsFilter.lastRiddenMillisAgo) && Intrinsics.areEqual(this.lastLocatedMillisAgo, bountyBirdsFilter.lastLocatedMillisAgo) && Intrinsics.areEqual(this.price, bountyBirdsFilter.price) && Intrinsics.areEqual(this.timeProvider, bountyBirdsFilter.timeProvider) && Intrinsics.areEqual(this.includedBountyOptions, bountyBirdsFilter.includedBountyOptions) && this.enableLastRiddenFilter == bountyBirdsFilter.enableLastRiddenFilter;
        }
        return false;
    }

    public final boolean getEnableLastRiddenFilter() {
        return this.enableLastRiddenFilter;
    }

    public final Set<BountyOption> getIncludedBountyOptions() {
        return this.includedBountyOptions;
    }

    public final IntervalFilter<Long> getLastLocatedMillisAgo() {
        return this.lastLocatedMillisAgo;
    }

    public final IntervalFilter<Long> getLastRiddenMillisAgo() {
        return this.lastRiddenMillisAgo;
    }

    public final IntervalFilter<Long> getPrice() {
        return this.price;
    }

    public final InterfaceC44876m46 getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.lastRiddenMillisAgo.hashCode() * 31) + this.lastLocatedMillisAgo.hashCode()) * 31) + this.price.hashCode()) * 31;
        InterfaceC44876m46 interfaceC44876m46 = this.timeProvider;
        int hashCode2 = (((hashCode + (interfaceC44876m46 == null ? 0 : interfaceC44876m46.hashCode())) * 31) + this.includedBountyOptions.hashCode()) * 31;
        boolean z = this.enableLastRiddenFilter;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    @Override // co.bird.android.model.BirdsFilter
    public boolean invoke(WireBird bird) {
        Integer bountyPrice;
        boolean z;
        Intrinsics.checkNotNullParameter(bird, "bird");
        InterfaceC44876m46 interfaceC44876m46 = this.timeProvider;
        if (interfaceC44876m46 == null) {
            interfaceC44876m46 = InterfaceC44876m46.f97292a.m26388a();
        }
        long mo26387a = interfaceC44876m46.mo26387a();
        boolean z2 = this.enableLastRiddenFilter;
        if ((!z2 || (z2 && this.lastRiddenMillisAgo.contains(Long.valueOf(mo26387a - lastRidden(bird).getMillis())))) && this.lastLocatedMillisAgo.contains(Long.valueOf(mo26387a - lastLocatedAt(bird).getMillis()))) {
            if (bird.getBountyPrice() != null) {
                z = this.price.contains(Long.valueOf(bountyPrice.intValue()));
            } else {
                z = true;
            }
            if (z && isIncludedBountyOption(bird)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        IntervalFilter<Long> intervalFilter = this.lastRiddenMillisAgo;
        IntervalFilter<Long> intervalFilter2 = this.lastLocatedMillisAgo;
        IntervalFilter<Long> intervalFilter3 = this.price;
        InterfaceC44876m46 interfaceC44876m46 = this.timeProvider;
        Set<BountyOption> set = this.includedBountyOptions;
        boolean z = this.enableLastRiddenFilter;
        return "BountyBirdsFilter(lastRiddenMillisAgo=" + intervalFilter + ", lastLocatedMillisAgo=" + intervalFilter2 + ", price=" + intervalFilter3 + ", timeProvider=" + interfaceC44876m46 + ", includedBountyOptions=" + set + ", enableLastRiddenFilter=" + z + ")";
    }

    public BountyBirdsFilter(IntervalFilter<Long> lastRiddenMillisAgo, IntervalFilter<Long> lastLocatedMillisAgo, IntervalFilter<Long> price, InterfaceC44876m46 interfaceC44876m46, Set<BountyOption> includedBountyOptions, boolean z) {
        Intrinsics.checkNotNullParameter(lastRiddenMillisAgo, "lastRiddenMillisAgo");
        Intrinsics.checkNotNullParameter(lastLocatedMillisAgo, "lastLocatedMillisAgo");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(includedBountyOptions, "includedBountyOptions");
        this.lastRiddenMillisAgo = lastRiddenMillisAgo;
        this.lastLocatedMillisAgo = lastLocatedMillisAgo;
        this.price = price;
        this.timeProvider = interfaceC44876m46;
        this.includedBountyOptions = includedBountyOptions;
        this.enableLastRiddenFilter = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BountyBirdsFilter(IntervalFilter intervalFilter, IntervalFilter intervalFilter2, IntervalFilter intervalFilter3, InterfaceC44876m46 interfaceC44876m46, Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12 != 0 ? new IntervalFilter(Long.MIN_VALUE, r1) : intervalFilter, (i & 2) != 0 ? new IntervalFilter(Long.MIN_VALUE, r1) : intervalFilter2, (i & 4) != 0 ? new IntervalFilter(0L, r1) : intervalFilter3, (i & 8) != 0 ? InterfaceC44876m46.f97292a.m26388a() : interfaceC44876m46, (i & 16) != 0 ? SetsKt__SetsKt.mutableSetOf(BountyOption.CHARGE, BountyOption.DAMAGED_CHARGE, BountyOption.REBALANCE, BountyOption.DAMAGED_TRANSPORT) : set, (i & 32) != 0 ? true : z);
        int i2 = i & 1;
        Long valueOf = Long.valueOf((long) LongCompanionObject.MAX_VALUE);
    }
}
