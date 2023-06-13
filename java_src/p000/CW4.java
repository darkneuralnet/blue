package p000;

import android.content.Context;
import android.text.style.StrikethroughSpan;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LCW4;", "", "", "Lco/bird/android/model/persistence/RidePassView;", "ridePasses", "LH6;", "b", "", "ridePass", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Converter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Converter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n1549#2:100\n1620#2,3:101\n*S KotlinDebug\n*F\n+ 1 RidePassV4Converter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Converter\n*L\n22#1:96\n22#1:97,3\n63#1:100\n63#1:101,3\n*E\n"})
/* renamed from: CW4 */
/* loaded from: classes3.dex */
public final class CW4 {

    /* renamed from: a */
    public final Context f4159a;

    public CW4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4159a = context;
    }

    /* renamed from: a */
    public final String m112181a(String str, RidePassView ridePassView) {
        String billingIntervalDescription;
        if (ridePassView.getUserSubscription() != null) {
            return str;
        }
        RidePassSubscriptionPlanView subscriptionPlan = ridePassView.getSubscriptionPlan();
        if (subscriptionPlan != null && (billingIntervalDescription = subscriptionPlan.getBillingIntervalDescription()) != null) {
            return str + "/" + billingIntervalDescription;
        }
        return str;
    }

    /* renamed from: b */
    public final List<C3023H6> m112180b(List<RidePassView> ridePasses) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List mutableList;
        List<C3023H6> listOf;
        CharSequence m112181a;
        DateTime dateTime;
        String str;
        Intrinsics.checkNotNullParameter(ridePasses, "ridePasses");
        List<RidePassView> list = ridePasses;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList<FX4> arrayList = new ArrayList(collectionSizeOrDefault);
        for (RidePassView ridePassView : list) {
            Long previousPrice = ridePassView.getPreviousPrice();
            if (ridePassView.isActive()) {
                m112181a = ridePassView.getTitle();
            } else if (previousPrice != null) {
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                String currency$default = C51916xx1.currency$default(c51916xx1, ridePassView.getPrice(), C45097mS5.m25591o(ridePassView.getCurrency()), null, 4, null);
                String currency$default2 = C51916xx1.currency$default(c51916xx1, previousPrice.longValue(), C45097mS5.m25591o(ridePassView.getCurrency()), null, 4, null);
                m112181a = C45097mS5.m25592n(m112181a(ridePassView.getTitle() + " " + currency$default2 + " " + currency$default, ridePassView), currency$default2, new StrikethroughSpan());
            } else {
                m112181a = m112181a(ridePassView.getTitle() + " " + C51916xx1.currency$default(C51916xx1.f118396a, ridePassView.getPrice(), C45097mS5.m25591o(ridePassView.getCurrency()), null, 4, null), ridePassView);
            }
            CharSequence charSequence = m112181a;
            RidePassUserSubscriptionView userSubscription = ridePassView.getUserSubscription();
            String str2 = null;
            if (userSubscription != null) {
                dateTime = userSubscription.getNextRenewalAt();
            } else {
                dateTime = null;
            }
            boolean z = false;
            if (dateTime != null) {
                Context context = this.f4159a;
                str = context.getString(C45871nl4.ride_pass_renews_in, C46880pT0.m19258d(dateTime, context));
            } else if (ridePassView.isActive()) {
                Context context2 = this.f4159a;
                int i = C45871nl4.ride_pass_expires_in;
                Object[] objArr = new Object[1];
                DateTime expiresAt = ridePassView.getExpiresAt();
                if (expiresAt != null) {
                    str2 = C46880pT0.m19258d(expiresAt, this.f4159a);
                }
                objArr[0] = str2;
                str = context2.getString(i, objArr);
            } else {
                str = null;
            }
            if (ridePassView.getSubscriptionPlan() != null) {
                z = true;
            }
            arrayList.add(new FX4(charSequence, z, str, ridePassView.getLabel(), ridePassView.getDetailBody(), ridePassView.getFooter(), ridePassView));
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (FX4 fx4 : arrayList) {
            arrayList2.add(new C2637G6(fx4, C33102Gj4.item_ride_pass_v4_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(null, C33102Gj4.item_ride_pass_v4_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
