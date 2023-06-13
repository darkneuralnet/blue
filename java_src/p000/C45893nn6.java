package p000;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.VehiclePricing;
import co.bird.android.model.VehiclePricingDetailsEmptyState;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B\u0011\b\u0007\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010&\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00062"}, m28432d2 = {"Lnn6;", "LxE;", "Lmn6;", "", "Lco/bird/android/model/VehiclePricing;", "prices", "", "Kf", "Lco/bird/android/model/VehiclePricingDetailsEmptyState;", "emptyState", "Tc", "", "show", "locationPermissionGranted", "Pc", "Lio/reactivex/Observable;", "F", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "turnOnContainer", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "turnOnTitle", "e", "turnOnMessage", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "turnOnButton", "g", "emptyStateTitle", "h", "emptyStateSubtitle", "i", "emptyStateContainer", "Lpn6;", "j", "Lpn6;", "recyclerViewAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", C17296a.f69688o, "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehiclePricingUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclePricingUi.kt\nco/bird/android/feature/vehiclepricing/VehiclePricingUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1855#2,2:87\n*S KotlinDebug\n*F\n+ 1 VehiclePricingUi.kt\nco/bird/android/feature/vehiclepricing/VehiclePricingUiImpl\n*L\n55#1:87,2\n*E\n"})
/* renamed from: nn6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45893nn6 extends AbstractC30071xE implements InterfaceC45300mn6 {

    /* renamed from: b */
    public final RecyclerView f100519b;

    /* renamed from: c */
    public final LinearLayout f100520c;

    /* renamed from: d */
    public final TextView f100521d;

    /* renamed from: e */
    public final TextView f100522e;

    /* renamed from: f */
    public final Button f100523f;

    /* renamed from: g */
    public final TextView f100524g;

    /* renamed from: h */
    public final TextView f100525h;

    /* renamed from: i */
    public final LinearLayout f100526i;

    /* renamed from: j */
    public final C47079pn6 f100527j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45893nn6(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        RecyclerView recyclerView = (RecyclerView) C40788fB0.m41779c(activity, C41097fi4.recyclerView);
        this.f100519b = recyclerView;
        this.f100520c = (LinearLayout) C40788fB0.m41779c(activity, C41097fi4.turnOnContainer);
        this.f100521d = (TextView) C40788fB0.m41779c(activity, C41097fi4.turnOnTitle);
        this.f100522e = (TextView) C40788fB0.m41779c(activity, C41097fi4.turnOnMessage);
        this.f100523f = (Button) C40788fB0.m41779c(activity, C41097fi4.turnOn);
        this.f100524g = (TextView) C40788fB0.m41779c(activity, C41097fi4.title);
        this.f100525h = (TextView) C40788fB0.m41779c(activity, C41097fi4.subtitle);
        this.f100526i = (LinearLayout) C40788fB0.m41779c(activity, C41097fi4.emptyStateContainer);
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
        C47079pn6 c47079pn6 = new C47079pn6(applicationContext);
        this.f100527j = c47079pn6;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(c47079pn6);
    }

    @Override // p000.InterfaceC45300mn6
    /* renamed from: F */
    public Observable<Unit> mo23144F() {
        return C44626lf5.clicksThrottle$default(this.f100523f, 0L, 1, null);
    }

    @Override // p000.InterfaceC45300mn6
    /* renamed from: Kf */
    public void mo23143Kf(List<VehiclePricing> prices) {
        Intrinsics.checkNotNullParameter(prices, "prices");
        ArrayList arrayList = new ArrayList();
        if (prices.size() > 1) {
            arrayList.add(new C26595a(true, null, 2, null));
        }
        for (VehiclePricing vehiclePricing : prices) {
            arrayList.add(new C26595a(false, vehiclePricing));
        }
        this.f100527j.m44899C(arrayList);
    }

    @Override // p000.InterfaceC45300mn6
    /* renamed from: Pc */
    public void mo23142Pc(boolean z, boolean z2) {
        if (z2) {
            this.f100521d.setText(getActivity().getString(C45871nl4.turn_on_title));
            this.f100522e.setText(getActivity().getString(C45871nl4.turn_on_message));
        } else {
            this.f100521d.setText(getActivity().getString(C45871nl4.permission_turn_on_title));
            this.f100522e.setText(getActivity().getString(C45871nl4.permission_turn_on_message));
        }
        C49520tu6.show$default(this.f100520c, z, 0, 2, null);
        C49520tu6.show$default(this.f100519b, !z, 0, 2, null);
        C49520tu6.show$default(this.f100526i, !z, 0, 2, null);
    }

    @Override // p000.InterfaceC45300mn6
    /* renamed from: Tc */
    public void mo23141Tc(VehiclePricingDetailsEmptyState emptyState) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        this.f100524g.setText(emptyState.getTitle());
        this.f100525h.setText(emptyState.getSubtitle());
        C49520tu6.m11233r(this.f100526i);
        C49520tu6.m11239l(this.f100519b);
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lnn6$a;", "", "", "byVehicleSeparator", "Lco/bird/android/model/VehiclePricing;", "vehicle", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "Lco/bird/android/model/VehiclePricing;", "c", "()Lco/bird/android/model/VehiclePricing;", "<init>", "(ZLco/bird/android/model/VehiclePricing;)V", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nn6$a */
    /* loaded from: classes3.dex */
    public static final class C26595a {

        /* renamed from: a */
        public final boolean f100528a;

        /* renamed from: b */
        public final VehiclePricing f100529b;

        public C26595a(boolean z, VehiclePricing vehiclePricing) {
            this.f100528a = z;
            this.f100529b = vehiclePricing;
        }

        public static /* synthetic */ C26595a copy$default(C26595a c26595a, boolean z, VehiclePricing vehiclePricing, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c26595a.f100528a;
            }
            if ((i & 2) != 0) {
                vehiclePricing = c26595a.f100529b;
            }
            return c26595a.m23140a(z, vehiclePricing);
        }

        /* renamed from: a */
        public final C26595a m23140a(boolean z, VehiclePricing vehiclePricing) {
            return new C26595a(z, vehiclePricing);
        }

        /* renamed from: b */
        public final boolean m23139b() {
            return this.f100528a;
        }

        /* renamed from: c */
        public final VehiclePricing m23138c() {
            return this.f100529b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C26595a) {
                C26595a c26595a = (C26595a) obj;
                return this.f100528a == c26595a.f100528a && Intrinsics.areEqual(this.f100529b, c26595a.f100529b);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.f100528a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            VehiclePricing vehiclePricing = this.f100529b;
            return i + (vehiclePricing == null ? 0 : vehiclePricing.hashCode());
        }

        public String toString() {
            boolean z = this.f100528a;
            VehiclePricing vehiclePricing = this.f100529b;
            return "VehiclePricingRow(byVehicleSeparator=" + z + ", vehicle=" + vehiclePricing + ")";
        }

        public /* synthetic */ C26595a(boolean z, VehiclePricing vehiclePricing, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : vehiclePricing);
        }
    }
}
