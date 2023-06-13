package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBrand;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.WireVehicleModel;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0012"}, m28432d2 = {"Lr24;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireBird;", "vehicle", "Lco/bird/android/model/wire/configs/Config;", "config", "", "c", "Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "b", "Lco/bird/android/model/wire/WireRidePrice;", "pricing", C17296a.f69688o, "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Price.kt\nco/bird/android/core/base/Price\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* renamed from: r24  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47819r24 {

    /* renamed from: a */
    public static final C47819r24 f106320a = new C47819r24();

    private C47819r24() {
    }

    /* renamed from: a */
    public final String m16579a(Context context, WireRidePrice pricing) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        String overwriteString = pricing.getOverwriteString();
        if (overwriteString != null) {
            return overwriteString;
        }
        if (pricing.getIncludedMinutes() > 0 && pricing.getMinimumPrice() > 0 && pricing.getSalesTax()) {
            int i = C45871nl4.dynamic_pricing_minimum_included_minutes_plus_tax;
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            long basePrice = pricing.getBasePrice();
            Currency m25591o = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string = context.getString(i, c51916xx1.m4408d(basePrice, m25591o, enumC36501Ux1), String.valueOf(pricing.getIncludedMinutes()), c51916xx1.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux1), c51916xx1.m4408d(pricing.getMinimumPrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux1));
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string;
        } else if (pricing.getIncludedMinutes() > 0 && pricing.getMinimumPrice() > 0 && !pricing.getSalesTax()) {
            int i2 = C45871nl4.dynamic_pricing_minimum_included_minutes;
            C51916xx1 c51916xx12 = C51916xx1.f118396a;
            long basePrice2 = pricing.getBasePrice();
            Currency m25591o2 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux12 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string2 = context.getString(i2, c51916xx12.m4408d(basePrice2, m25591o2, enumC36501Ux12), String.valueOf(pricing.getIncludedMinutes()), c51916xx12.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux12), c51916xx12.m4408d(pricing.getMinimumPrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux12));
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string2;
        } else if (pricing.getIncludedMinutes() > 0 && pricing.getMinimumPrice() == 0 && pricing.getSalesTax()) {
            int i3 = C45871nl4.dynamic_pricing_included_minutes_plus_tax;
            C51916xx1 c51916xx13 = C51916xx1.f118396a;
            long basePrice3 = pricing.getBasePrice();
            Currency m25591o3 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux13 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string3 = context.getString(i3, c51916xx13.m4408d(basePrice3, m25591o3, enumC36501Ux13), String.valueOf(pricing.getIncludedMinutes()), c51916xx13.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux13));
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string3;
        } else if (pricing.getIncludedMinutes() > 0 && pricing.getMinimumPrice() == 0 && !pricing.getSalesTax()) {
            int i4 = C45871nl4.dynamic_pricing_included_minutes;
            C51916xx1 c51916xx14 = C51916xx1.f118396a;
            long basePrice4 = pricing.getBasePrice();
            Currency m25591o4 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux14 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string4 = context.getString(i4, c51916xx14.m4408d(basePrice4, m25591o4, enumC36501Ux14), String.valueOf(pricing.getIncludedMinutes()), c51916xx14.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux14));
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string4;
        } else if (pricing.getIncludedMinutes() == 0 && pricing.getMinimumPrice() > 0 && pricing.getSalesTax()) {
            int i5 = C45871nl4.dynamic_pricing_minimum_plus_tax;
            C51916xx1 c51916xx15 = C51916xx1.f118396a;
            long basePrice5 = pricing.getBasePrice();
            Currency m25591o5 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux15 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string5 = context.getString(i5, c51916xx15.m4408d(basePrice5, m25591o5, enumC36501Ux15), c51916xx15.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux15), c51916xx15.m4408d(pricing.getMinimumPrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux15));
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string5;
        } else if (pricing.getIncludedMinutes() == 0 && pricing.getMinimumPrice() > 0 && !pricing.getSalesTax()) {
            int i6 = C45871nl4.dynamic_pricing_minimum;
            C51916xx1 c51916xx16 = C51916xx1.f118396a;
            long basePrice6 = pricing.getBasePrice();
            Currency m25591o6 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux16 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string6 = context.getString(i6, c51916xx16.m4408d(basePrice6, m25591o6, enumC36501Ux16), c51916xx16.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux16), c51916xx16.m4408d(pricing.getMinimumPrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux16));
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string6;
        } else if (pricing.getIncludedMinutes() == 0 && pricing.getMinimumPrice() == 0 && pricing.getSalesTax()) {
            int i7 = C45871nl4.dynamic_pricing_base_plus_tax;
            C51916xx1 c51916xx17 = C51916xx1.f118396a;
            long basePrice7 = pricing.getBasePrice();
            Currency m25591o7 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux17 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string7 = context.getString(i7, c51916xx17.m4408d(basePrice7, m25591o7, enumC36501Ux17), c51916xx17.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux17));
            Intrinsics.checkNotNullExpressionValue(string7, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string7;
        } else if (pricing.getIncludedMinutes() == 0 && pricing.getMinimumPrice() == 0 && !pricing.getSalesTax()) {
            int i8 = C45871nl4.dynamic_pricing_base;
            C51916xx1 c51916xx18 = C51916xx1.f118396a;
            long basePrice8 = pricing.getBasePrice();
            Currency m25591o8 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux18 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string8 = context.getString(i8, c51916xx18.m4408d(basePrice8, m25591o8, enumC36501Ux18), c51916xx18.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux18));
            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string8;
        } else {
            int i9 = C45871nl4.dynamic_pricing_base;
            C51916xx1 c51916xx19 = C51916xx1.f118396a;
            long basePrice9 = pricing.getBasePrice();
            Currency m25591o9 = C45097mS5.m25591o(pricing.getCurrency());
            EnumC36501Ux1 enumC36501Ux19 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            String string9 = context.getString(i9, c51916xx19.m4408d(basePrice9, m25591o9, enumC36501Ux19), c51916xx19.m4408d(pricing.getMinutePrice(), C45097mS5.m25591o(pricing.getCurrency()), enumC36501Ux19));
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(\n     …Option.SHOW_IF_NON_ZERO))");
            return string9;
        }
    }

    /* renamed from: b */
    public final String m16578b(Context context, RideConfig rideConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        return f106320a.m16579a(context, new WireRidePrice(rideConfig.getCurrency(), rideConfig.getBasePrice(), rideConfig.getMinutePrice(), rideConfig.getAdditionalFees().getApplyTax(), rideConfig.getMinimumRidePrice(), rideConfig.getIncludedMinutes(), rideConfig.getLocalizedDynamicPriceString()));
    }

    /* renamed from: c */
    public final String m16577c(Context context, WireBird vehicle, Config config) {
        Object obj;
        Object obj2;
        List<WireVehicleModel> vehicleModels;
        WireRidePrice pricing;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(config, "config");
        List<WireBrand> brands = config.getMarketManifestConfig().getBrands();
        if (brands != null) {
            Iterator<T> it = brands.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((WireBrand) obj2).getName(), vehicle.getBrandName())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            WireBrand wireBrand = (WireBrand) obj2;
            if (wireBrand != null && (vehicleModels = wireBrand.getVehicleModels()) != null) {
                Iterator<T> it2 = vehicleModels.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.areEqual(((WireVehicleModel) next).getModel(), vehicle.getModel())) {
                        obj = next;
                        break;
                    }
                }
                WireVehicleModel wireVehicleModel = (WireVehicleModel) obj;
                if (wireVehicleModel != null && (pricing = wireVehicleModel.getPricing()) != null) {
                    return f106320a.m16579a(context, pricing);
                }
            }
        }
        return m16579a(context, C32972Fv0.m106251a(config));
    }
}
