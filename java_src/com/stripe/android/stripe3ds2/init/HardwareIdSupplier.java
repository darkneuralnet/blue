package com.stripe.android.stripe3ds2.init;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.utils.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "get", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HardwareIdSupplier implements Supplier<HardwareId> {
    private final Context context;

    public HardwareIdSupplier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.stripe3ds2.utils.Supplier
    @SuppressLint({"HardwareIds"})
    public HardwareId get() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new HardwareId(string);
    }
}
