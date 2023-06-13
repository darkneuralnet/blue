package com.stripe.android.financialconnections.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"parcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IntentKt {
    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String key) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableExtra = intent.getParcelableExtra(key, Parcelable.class);
            return (T) parcelableExtra;
        }
        T t = (T) intent.getParcelableExtra(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
