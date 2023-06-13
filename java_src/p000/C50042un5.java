package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ScrapRequestReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/ScrapRequestReason;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: un5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50042un5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: un5$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29306a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrapRequestReason.values().length];
            try {
                iArr[ScrapRequestReason.SUBMERGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrapRequestReason.THERMAL_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScrapRequestReason.CHASSIS_DAMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScrapRequestReason.GRAFFITI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScrapRequestReason.MISSING_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final String m9767a(ScrapRequestReason scrapRequestReason, Context context) {
        int i = C29306a.$EnumSwitchMapping$0[scrapRequestReason.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return context.getString(C45871nl4.scrap_reason_missing_battery);
                    }
                    return context.getString(C45871nl4.scrap_reason_graffiti);
                }
                return context.getString(C45871nl4.scrap_reason_chassis_damage);
            }
            return context.getString(C45871nl4.scrap_reason_thermal_event);
        }
        return context.getString(C45871nl4.scrap_reason_submerged);
    }
}
