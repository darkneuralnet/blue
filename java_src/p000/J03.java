package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.DeliveryRequestKind;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/CurrentRental;", "rentals", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/configs/DeliveryRequestKind;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: J03 */
/* loaded from: classes2.dex */
public final class J03 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J03$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3830a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryRequestKind.values().length];
            try {
                iArr[DeliveryRequestKind.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryRequestKind.PAY_AS_YOU_GO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryRequestKind.LONG_TERM_RENTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r5 != false) goto L8;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair<Boolean, DeliveryRequestKind> m101399a(Config config, Optional<List<CurrentRental>> optional) {
        boolean z;
        int i = C3830a.$EnumSwitchMapping$0[config.getDeliveryConfig().getActiveRequestKind().ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!config.getRentalConfigs().getAtLeastOneEnabled()) {
                        List<CurrentRental> m59035e = optional.m59035e();
                        if (m59035e != null) {
                            z = !m59035e.isEmpty();
                        } else {
                            z = false;
                        }
                    }
                }
                z2 = false;
            } else {
                z2 = config.getDeliveryConfig().getEnableDeliveryMenuItem();
            }
        } else {
            z2 = config.getDeliveryConfig().getEnableDeliveryMenuItem();
        }
        return TuplesKt.m28425to(Boolean.valueOf(z2), config.getDeliveryConfig().getActiveRequestKind());
    }
}
