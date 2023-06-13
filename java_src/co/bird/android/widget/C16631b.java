package co.bird.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.BatteryViewV2;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m28432d2 = {"Landroid/content/res/ColorStateList;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/widget/BatteryViewV2$a;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.widget.b */
/* loaded from: classes4.dex */
public final class C16631b {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.b$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16632a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatteryViewV2.EnumC16459a.values().length];
            try {
                iArr[BatteryViewV2.EnumC16459a.f67164b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatteryViewV2.EnumC16459a.f67165c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m54241a(ColorStateList colorStateList, Context context, BatteryViewV2.EnumC16459a enumC16459a) {
        int i = C16632a.$EnumSwitchMapping$0[enumC16459a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return colorStateList.getColorForState(new int[]{C48775sf4.state_high_battery}, NA0.m94301c(context, C32364Df4.birdGreen));
            }
            return colorStateList.getColorForState(new int[]{C48775sf4.state_medium_battery}, NA0.m94301c(context, C32364Df4.birdYellow));
        }
        return colorStateList.getColorForState(new int[]{C48775sf4.state_low_battery}, NA0.m94301c(context, C32364Df4.birdRed));
    }
}
