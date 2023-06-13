package com.stripe.android.core.storage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/storage/StorageFactory;", "", "()V", "getStorageInstance", "Lcom/stripe/android/core/storage/Storage;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "purpose", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StorageFactory {
    public static final StorageFactory INSTANCE = new StorageFactory();

    private StorageFactory() {
    }

    public final Storage getStorageInstance(Context context, String purpose) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new SharedPreferencesStorage(applicationContext, purpose);
    }
}
