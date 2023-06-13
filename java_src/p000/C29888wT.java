package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummary;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.BirdSummaryViewModel;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a(\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/BirdSummaryBody;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/BirdSummaryViewModel;", "b", "", "showTime", "Lco/bird/android/model/MobilePartner;", "partner", "Lun6;", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wT */
/* loaded from: classes4.dex */
public final class C29888wT {
    /* renamed from: a */
    public static final C50043un6 m6790a(BirdSummaryBody birdSummaryBody, Context context, boolean z, MobilePartner mobilePartner) {
        int m94301c;
        int i;
        int i2;
        Integer num;
        int m94301c2;
        Intrinsics.checkNotNullParameter(birdSummaryBody, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String serviceStatus = birdSummaryBody.getServiceStatus();
        String warehouse = birdSummaryBody.getWarehouse();
        BirdModel model = birdSummaryBody.getBirdSummary().getModel();
        String modelDisplay = birdSummaryBody.getBirdSummary().getModelDisplay();
        String string = context.getString(C45871nl4.vehicle_summary_service_center_time_format, C46880pT0.m19259c(birdSummaryBody.getBirdSummary().getEnteredWarehouseAtTime(), context, false));
        DateTime enteredWarehouseAtTime = birdSummaryBody.getBirdSummary().getEnteredWarehouseAtTime();
        if (enteredWarehouseAtTime != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            if (timeUnit.toDays((long) C46880pT0.m19253i(now, enteredWarehouseAtTime)) < 2) {
                m94301c = NA0.m94301c(context, C32364Df4.mint);
            } else {
                m94301c = NA0.m94301c(context, C32364Df4.errorRed);
            }
        } else {
            m94301c = NA0.m94301c(context, C32364Df4.errorRed);
        }
        int i3 = C45871nl4.bird_status_brain_battery_format_with_tracked_at;
        Object[] objArr = new Object[2];
        Integer batteryLevel = birdSummaryBody.getBirdSummary().getBatteryLevel();
        if (batteryLevel != null) {
            i = batteryLevel.intValue();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        objArr[1] = C46880pT0.getElapsedTime$default(birdSummaryBody.getBirdSummary().getBatteryLastTrackedAtTime(), context, false, 2, null);
        String string2 = context.getString(i3, objArr);
        Integer batteryLevel2 = birdSummaryBody.getBirdSummary().getBatteryLevel();
        if (batteryLevel2 != null) {
            i2 = batteryLevel2.intValue();
        } else {
            i2 = 0;
        }
        String code = birdSummaryBody.getBirdSummary().getCode();
        String elapsedTime$default = C46880pT0.getElapsedTime$default(birdSummaryBody.getBirdSummary().getTrackedAtTime(), context, false, 2, null);
        DateTime trackedAtTime = birdSummaryBody.getBirdSummary().getTrackedAtTime();
        if (trackedAtTime != null) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            if (timeUnit2.toHours((long) C46880pT0.m19253i(now2, trackedAtTime)) > 1) {
                m94301c2 = NA0.m94301c(context, C32364Df4.errorRed);
            } else {
                m94301c2 = NA0.m94301c(context, C32364Df4.birdNewRoad);
            }
            num = Integer.valueOf(m94301c2);
        } else {
            num = null;
        }
        return new C50043un6(serviceStatus, null, null, null, null, null, null, warehouse, null, mobilePartner, model, code, i2, string2, null, string, Integer.valueOf(m94301c), modelDisplay, null, null, null, null, elapsedTime$default, num, null, null, birdSummaryBody.getBirdSummary().getCondition(), null, birdSummaryBody.getBirdSummary().getBrainState(), birdSummaryBody.getBirdSummary().getBrainStateColor(), false, false, false, false, z, false, false, false, null, -885243522, 123, null);
    }

    /* renamed from: b */
    public static final BirdSummaryViewModel m6789b(BirdSummaryBody birdSummaryBody, Context context) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(birdSummaryBody, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        BirdSummary birdSummary = birdSummaryBody.getBirdSummary();
        DateTime trackedAtTime = birdSummaryBody.getBirdSummary().getTrackedAtTime();
        if (trackedAtTime != null) {
            str = C46880pT0.getElapsedTime$default(trackedAtTime, context, false, 2, null);
        } else {
            str = null;
        }
        DateTime batteryLastTrackedAtTime = birdSummaryBody.getBirdSummary().getBatteryLastTrackedAtTime();
        if (batteryLastTrackedAtTime != null) {
            str2 = C46880pT0.getElapsedTime$default(batteryLastTrackedAtTime, context, false, 2, null);
        } else {
            str2 = null;
        }
        return new BirdSummaryViewModel(birdSummary, str, str2, birdSummaryBody.getWarehouse(), birdSummaryBody.getServiceStatus());
    }

    public static /* synthetic */ C50043un6 toVehicleSummaryViewModel$default(BirdSummaryBody birdSummaryBody, Context context, boolean z, MobilePartner mobilePartner, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            mobilePartner = null;
        }
        return m6790a(birdSummaryBody, context, z, mobilePartner);
    }
}
