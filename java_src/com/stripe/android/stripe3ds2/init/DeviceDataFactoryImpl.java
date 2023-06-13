package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "create", "", "", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DeviceDataFactoryImpl implements DeviceDataFactory {
    private final DisplayMetrics displayMetrics;
    private final Supplier<HardwareId> hardwareIdSupplier;

    public DeviceDataFactoryImpl(Context context, Supplier<HardwareId> hardwareIdSupplier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
        this.hardwareIdSupplier = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
        this.displayMetrics = displayMetrics;
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceDataFactory
    public Map<String, Object> create() {
        Map mapOf;
        Map emptyMap;
        Map<String, Object> plus;
        String value = this.hardwareIdSupplier.get().getValue();
        boolean z = false;
        String deviceParam = DeviceParam.PARAM_LOCALE.toString();
        Locale[] localeArr = {Locale.getDefault()};
        String deviceParam2 = DeviceParam.PARAM_SCREEN_RESOLUTION.toString();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.displayMetrics.heightPixels), Integer.valueOf(this.displayMetrics.widthPixels)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(DeviceParam.PARAM_PLATFORM.toString(), "Android"), TuplesKt.m28425to(DeviceParam.PARAM_DEVICE_MODEL.toString(), Build.MODEL), TuplesKt.m28425to(DeviceParam.PARAM_OS_NAME.toString(), Build.VERSION.CODENAME), TuplesKt.m28425to(DeviceParam.PARAM_OS_VERSION.toString(), Build.VERSION.RELEASE), TuplesKt.m28425to(deviceParam, C50711vv2.m7773a(localeArr).m7765i()), TuplesKt.m28425to(DeviceParam.PARAM_TIME_ZONE.toString(), TimeZone.getDefault().getDisplayName()), TuplesKt.m28425to(deviceParam2, format));
        if (value.length() > 0) {
            z = true;
        }
        if (z) {
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(DeviceParam.PARAM_HARDWARE_ID.toString(), value));
        } else {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, emptyMap);
        return plus;
    }
}
