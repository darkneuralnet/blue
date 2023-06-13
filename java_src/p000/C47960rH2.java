package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.EndSelectedRideButton;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireUserGuest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\tH\u0002¨\u0006\u0015"}, m28432d2 = {"LrH2;", "LtA;", "LvH2;", RequestHeadersFactory.MODEL, "Lio/reactivex/F;", "", "LH6;", "s", "w", "LtH2;", "entry", "LG6;", "v", "y", "x", "Lco/bird/android/model/RideStatusBottomSheetButton;", "u", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetConverter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n1747#2,3:143\n1726#2,3:146\n1747#2,3:149\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetConverter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetConverter\n*L\n35#1:139\n35#1:140,3\n76#1:143,3\n77#1:146,3\n77#1:149,3\n*E\n"})
/* renamed from: rH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47960rH2 extends AbstractC28540tA {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rH2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27894a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RideState.Status.values().length];
            try {
                iArr[RideState.Status.UNLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideState.Status.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideState.Status.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RideState.Status.ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RideUpdateState.values().length];
            try {
                iArr2[RideUpdateState.RIDE_REQUIREMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RideUpdateState.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RideUpdateState.ENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RideUpdateState.LOCKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47960rH2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: t */
    public static final List m16123t(C47960rH2 this$0, C50330vH2 model) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(this$0.m16120w(model));
        return listOfNotNull;
    }

    /* renamed from: s */
    public final AbstractC23442F<List<C3023H6>> m16124s(final C50330vH2 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: qH2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m16123t;
                m16123t = C47960rH2.m16123t(C47960rH2.this, model);
                return m16123t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…tent(model)\n      )\n    }");
        return m33161E;
    }

    /* renamed from: u */
    public final RideStatusBottomSheetButton m16122u(C49145tH2 c49145tH2) {
        RideStatusBottomSheetButton rideStatusUnlockButton;
        int i = C27894a.$EnumSwitchMapping$1[c49145tH2.m12536b().getUpdateState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                int i2 = C27894a.$EnumSwitchMapping$0[c49145tH2.m12536b().getStatus().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                String string = m12962m().getString(C45871nl4.ride_action_unlock);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.ride_action_unlock)");
                                return new RideStatusUnlockButton(null, string, false, false, 4, null);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        String id = c49145tH2.m12536b().getRide().getId();
                        String string2 = m12962m().getString(C45871nl4.ride_action_unlock);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.ride_action_unlock)");
                        return new RideStatusUnlockButton(id, string2, false, false, 12, null);
                    }
                    String id2 = c49145tH2.m12536b().getRide().getId();
                    String string3 = m12962m().getString(C45871nl4.ride_action_unlock);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.ride_action_unlock)");
                    rideStatusUnlockButton = new RideStatusUnlockButton(id2, string3, true, false);
                } else {
                    String id3 = c49145tH2.m12536b().getRide().getId();
                    String string4 = m12962m().getString(C45871nl4.ride_action_lock);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.ride_action_lock)");
                    rideStatusUnlockButton = new RideStatusLockButton(id3, string4, false, false, 12, null);
                }
            } else {
                String id4 = c49145tH2.m12536b().getRide().getId();
                String string5 = m12962m().getString(C45871nl4.ride_action_unlock);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.ride_action_unlock)");
                rideStatusUnlockButton = new RideStatusUnlockButton(id4, string5, true, false);
            }
        } else {
            String id5 = c49145tH2.m12536b().getRide().getId();
            String string6 = m12962m().getString(C45871nl4.ride_action_unlock);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.string.ride_action_unlock)");
            rideStatusUnlockButton = new RideStatusUnlockButton(id5, string6, true, false);
        }
        return rideStatusUnlockButton;
    }

    /* renamed from: v */
    public final C2637G6 m16121v(C49145tH2 c49145tH2) {
        String str;
        String str2;
        String str3;
        String str4;
        String email;
        Integer estimatedRange;
        String id = c49145tH2.m12536b().getRide().getId();
        WireUserGuest m12535c = c49145tH2.m12535c();
        if (m12535c != null) {
            str = m12535c.getId();
        } else {
            str = null;
        }
        WireBird bird = c49145tH2.m12536b().getRide().getBird();
        if (bird != null) {
            str2 = bird.getCode();
        } else {
            str2 = null;
        }
        WireBird bird2 = c49145tH2.m12536b().getRide().getBird();
        if (bird2 != null && (estimatedRange = bird2.getEstimatedRange()) != null) {
            str3 = C51916xx1.distance$default(C51916xx1.f118396a, m12962m(), estimatedRange.intValue(), 0.0d, true, 4, null);
        } else {
            str3 = null;
        }
        if (RideStatesKt.isPrimaryRide(c49145tH2.m12536b())) {
            email = m12962m().getString(C45871nl4.manage_rides_your_ride_label);
        } else {
            WireUserGuest m12535c2 = c49145tH2.m12535c();
            if (m12535c2 != null) {
                email = m12535c2.getEmail();
            } else {
                str4 = null;
                return new C2637G6(new C49738uH2(id, str, str2, str3, str4, m16122u(c49145tH2), c49145tH2.m12534d()), C33570Ij4.item_manage_group_rides_entry, false, 4, null);
            }
        }
        str4 = email;
        return new C2637G6(new C49738uH2(id, str, str2, str3, str4, m16122u(c49145tH2), c49145tH2.m12534d()), C33570Ij4.item_manage_group_rides_entry, false, 4, null);
    }

    /* renamed from: w */
    public final C3023H6 m16120w(C50330vH2 c50330vH2) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C49145tH2> m8939b = c50330vH2.m8939b();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m8939b, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C49145tH2 c49145tH2 : m8939b) {
            arrayList.add(m16121v(c49145tH2));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, m16118y(), m16119x(c50330vH2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r11 != false) goto L18;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2637G6 m16119x(C50330vH2 c50330vH2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String string = m12962m().getString(C45871nl4.manage_rides_end_selected_ride);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_rides_end_selected_ride)");
        List<C49145tH2> m8939b = c50330vH2.m8939b();
        boolean z6 = true;
        if (!(m8939b instanceof Collection) || !m8939b.isEmpty()) {
            for (C49145tH2 c49145tH2 : m8939b) {
                if (c49145tH2.m12536b().getUpdateState() == RideUpdateState.ENDING) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        List<C49145tH2> m8939b2 = c50330vH2.m8939b();
        if (!(m8939b2 instanceof Collection) || !m8939b2.isEmpty()) {
            for (C49145tH2 c49145tH22 : m8939b2) {
                if (c49145tH22.m12536b().getUpdateState() == RideUpdateState.NONE) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (!z3) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        if (z4) {
            List<C49145tH2> m8939b3 = c50330vH2.m8939b();
            if (!(m8939b3 instanceof Collection) || !m8939b3.isEmpty()) {
                for (C49145tH2 c49145tH23 : m8939b3) {
                    if (c49145tH23.m12534d()) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
        }
        z6 = false;
        return new C2637G6(new EndSelectedRideButton(string, z2, z6), C45268mk4.item_button, false, 4, null);
    }

    /* renamed from: y */
    public final C2637G6 m16118y() {
        return new C2637G6(m12962m().getString(C45871nl4.manage_rides_bottom_sheet_title), C33570Ij4.item_manage_group_rides_header, false, 4, null);
    }
}
