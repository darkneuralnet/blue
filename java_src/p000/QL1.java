package p000;

import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import co.bird.android.model.wire.WireHibernationMessage;
import co.bird.android.model.wire.WireHibernationSessionVehicle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireHibernationSessionVehicle;", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", C17296a.f69688o, "Lco/bird/android/model/wire/WireHibernationMessage;", "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "b", "co.bird.android.repository.hibernation"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: QL1 */
/* loaded from: classes4.dex */
public final class QL1 {
    /* renamed from: a */
    public static final HibernationSessionVehicle m88651a(WireHibernationSessionVehicle wireHibernationSessionVehicle) {
        HibernationMessage hibernationMessage;
        Intrinsics.checkNotNullParameter(wireHibernationSessionVehicle, "<this>");
        String birdId = wireHibernationSessionVehicle.getBirdId();
        VehicleHibernationCategory category = wireHibernationSessionVehicle.getCategory();
        String title = wireHibernationSessionVehicle.getTitle();
        String retryMessage = wireHibernationSessionVehicle.getRetryMessage();
        WireHibernationMessage infoMessage = wireHibernationSessionVehicle.getInfoMessage();
        if (infoMessage != null) {
            hibernationMessage = m88650b(infoMessage);
        } else {
            hibernationMessage = null;
        }
        return new HibernationSessionVehicle(birdId, category, title, retryMessage, hibernationMessage);
    }

    /* renamed from: b */
    public static final HibernationMessage m88650b(WireHibernationMessage wireHibernationMessage) {
        Intrinsics.checkNotNullParameter(wireHibernationMessage, "<this>");
        return new HibernationMessage(wireHibernationMessage.getTitle(), wireHibernationMessage.getMessage(), wireHibernationMessage.getUrl());
    }
}
