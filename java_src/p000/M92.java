package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.configs.RideConfig;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u0002J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u001f"}, m28432d2 = {"LM92;", "LxE;", "", "identifier", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Ql", "Rl", "dm", "Sl", "Xl", "Yl", "Zl", "am", "bm", "cm", "Tl", "fm", "em", "gm", "Pl", "error", "Wl", "title", "body", "positiveButton", "Ul", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M92 */
/* loaded from: classes3.dex */
public final class M92 extends AbstractC30071xE {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M92(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* renamed from: Vl */
    public static /* synthetic */ AbstractC23442F m95667Vl(M92 m92, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = m92.getString(C45871nl4.general_got_it, new Object[0]);
        }
        return m92.m95668Ul(str, str2, str3);
    }

    /* renamed from: Pl */
    public final AbstractC23442F<DialogResponse> m95673Pl() {
        return m95667Vl(this, getString(C45871nl4.hard_count_already_counted, new Object[0]), null, null, 6, null);
    }

    /* renamed from: Ql */
    public final AbstractC23442F<DialogResponse> m95672Ql(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m95668Ul(getString(C45871nl4.hard_count_invalid_scan_title, identifier), getString(C45871nl4.hard_count_invalid_qr_body, new Object[0]), getString(C45871nl4.hard_count_invalid_qr_positive_button, new Object[0]));
    }

    /* renamed from: Rl */
    public final AbstractC23442F<DialogResponse> m95671Rl(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m95667Vl(this, getString(C45871nl4.hard_count_invalid_scan_title, identifier), getString(C45871nl4.hard_count_invalid_serial_body, new Object[0]), null, 4, null);
    }

    /* renamed from: Sl */
    public final AbstractC23442F<DialogResponse> m95670Sl() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_action_not_permitted_title, new Object[0]), getString(C45871nl4.sku_order_error_action_not_permitted_message, new Object[0]), null, 4, null);
    }

    /* renamed from: Tl */
    public final AbstractC23442F<DialogResponse> m95669Tl() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_already_in_sku_title, new Object[0]), getString(C45871nl4.sku_order_error_already_in_sku_message, new Object[0]), null, 4, null);
    }

    /* renamed from: Ul */
    public final AbstractC23442F<DialogResponse> m95668Ul(String str, String str2, String str3) {
        return H31.C3014a.dialog$default(this, C45268mk4.dialog_custom_cta, Integer.valueOf(C52955zi4.primaryButton), null, Integer.valueOf(C52955zi4.icon), Integer.valueOf(C52955zi4.title), Integer.valueOf(C52955zi4.body), str3, null, Integer.valueOf(C48193rg4.ic_missing_error), str, str2, false, true, false, null, 26756, null);
    }

    /* renamed from: Wl */
    public final AbstractC23442F<DialogResponse> m95666Wl(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return m95667Vl(this, getActivity().getString(C45871nl4.error_generic_title), error, null, 4, null);
    }

    /* renamed from: Xl */
    public final AbstractC23442F<DialogResponse> m95665Xl() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_incorrect_commodity_title, new Object[0]), getString(C45871nl4.sku_order_error_incorrect_commodity_message, new Object[0]), null, 4, null);
    }

    /* renamed from: Yl */
    public final AbstractC23442F<DialogResponse> m95664Yl() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_incorrect_commodity_type_title, new Object[0]), getString(C45871nl4.sku_order_error_incorrect_commodity_type_message, new Object[0]), null, 4, null);
    }

    /* renamed from: Zl */
    public final AbstractC23442F<DialogResponse> m95663Zl() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_incorrect_condition_title, new Object[0]), getString(C45871nl4.sku_order_error_incorrect_condition_message, new Object[0]), null, 4, null);
    }

    /* renamed from: am */
    public final AbstractC23442F<DialogResponse> m95662am() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_incorrect_fleet_title, new Object[0]), getString(C45871nl4.sku_order_error_incorrect_fleet_message, new Object[0]), null, 4, null);
    }

    /* renamed from: bm */
    public final AbstractC23442F<DialogResponse> m95661bm() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_incorrect_sku_title, new Object[0]), getString(C45871nl4.sku_order_error_incorrect_sku_message, new Object[0]), null, 4, null);
    }

    /* renamed from: cm */
    public final AbstractC23442F<DialogResponse> m95660cm() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_not_in_the_right_zone_title, new Object[0]), getString(C45871nl4.sku_order_error_not_in_the_right_zone_message, new Object[0]), null, 4, null);
    }

    /* renamed from: dm */
    public final AbstractC23442F<DialogResponse> m95659dm() {
        RideConfig rideConfig = getActivity().mo58955y().m82623f8().m73665a().getRideConfig();
        return dialog(new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength()), true, true);
    }

    /* renamed from: em */
    public final AbstractC23442F<DialogResponse> m95658em() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_checked_in_already_title, new Object[0]), getString(C45871nl4.sku_order_error_checked_in_already_message, new Object[0]), null, 4, null);
    }

    /* renamed from: fm */
    public final AbstractC23442F<DialogResponse> m95657fm() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_not_in_sku_title, new Object[0]), getString(C45871nl4.sku_order_error_not_in_sku_message, new Object[0]), null, 4, null);
    }

    /* renamed from: gm */
    public final AbstractC23442F<DialogResponse> m95656gm() {
        return m95667Vl(this, getString(C45871nl4.sku_order_error_terminated_vehicle_title, new Object[0]), getString(C45871nl4.sku_order_error_terminated_vehicle_message, new Object[0]), null, 4, null);
    }
}
