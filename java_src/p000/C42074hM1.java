package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.VehicleHibernationCategory;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/VehicleHibernationCategory;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "hibernation-scan_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42074hM1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hM1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22615a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VehicleHibernationCategory.values().length];
            try {
                iArr[VehicleHibernationCategory.HIBERNATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleHibernationCategory.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleHibernationCategory.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VehicleHibernationCategory.NOT_HIBERNATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m36528a(VehicleHibernationCategory vehicleHibernationCategory, Context context) {
        int i;
        int i2 = C22615a.$EnumSwitchMapping$0[vehicleHibernationCategory.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    i = C32364Df4.primaryText;
                } else {
                    i = C32364Df4.birdRed;
                }
            } else {
                i = C32364Df4.birdYellow;
            }
        } else {
            i = C32364Df4.birdGreen;
        }
        return NA0.m94301c(context, i);
    }
}
