package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"LgM1;", "", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "scannedVehicles", "Lco/bird/android/model/persistence/Bird;", "birds", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHibernationScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanConverter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,2:62\n288#2,2:64\n1622#2:66\n1774#2,4:67\n*S KotlinDebug\n*F\n+ 1 HibernationScanConverter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanConverter\n*L\n21#1:61\n21#1:62,2\n22#1:64,2\n21#1:66\n42#1:67,4\n*E\n"})
/* renamed from: gM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41481gM1 {

    /* renamed from: a */
    public final Context f82022a;

    public C41481gM1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82022a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m39596a(List<HibernationSessionVehicle> scannedVehicles, List<Bird> birds) {
        int collectionSizeOrDefault;
        int i;
        List mutableList;
        List<C3023H6> listOf;
        Drawable drawable;
        Object obj;
        int m36528a;
        Intrinsics.checkNotNullParameter(scannedVehicles, "scannedVehicles");
        Intrinsics.checkNotNullParameter(birds, "birds");
        List<HibernationSessionVehicle> list = scannedVehicles;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            HibernationSessionVehicle hibernationSessionVehicle = (HibernationSessionVehicle) it.next();
            Iterator<T> it2 = birds.iterator();
            while (true) {
                drawable = null;
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((Bird) obj).getId(), hibernationSessionVehicle.getBirdId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Bird bird = (Bird) obj;
            String str = (bird == null || (r9 = bird.getCode()) == null) ? "" : "";
            if (bird != null) {
                i = bird.getBatteryLevel();
            }
            int i2 = i;
            VehicleHibernationCategory category = hibernationSessionVehicle.getCategory();
            String title = hibernationSessionVehicle.getTitle();
            m36528a = C42074hM1.m36528a(hibernationSessionVehicle.getCategory(), this.f82022a);
            String retryMessage = hibernationSessionVehicle.getRetryMessage();
            HibernationMessage infoMessage = hibernationSessionVehicle.getInfoMessage();
            if (hibernationSessionVehicle.getRetryMessage() != null) {
                drawable = NA0.m94299e(this.f82022a, C48193rg4.ic_more);
            } else if (hibernationSessionVehicle.getInfoMessage() != null) {
                drawable = NA0.m94299e(this.f82022a, C48193rg4.ic_info);
            }
            arrayList.add(new C2637G6(new HM1(bird, str, i2, category, title, m36528a, retryMessage, infoMessage, drawable), C41700gj4.item_hibernation_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (HibernationSessionVehicle hibernationSessionVehicle2 : list) {
                if (hibernationSessionVehicle2.getCategory().isFailed() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(TuplesKt.m28425to(Integer.valueOf(scannedVehicles.size()), Integer.valueOf(i)), C41700gj4.item_hibernation_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
