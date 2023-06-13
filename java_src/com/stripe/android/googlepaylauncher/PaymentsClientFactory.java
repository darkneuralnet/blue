package com.stripe.android.googlepaylauncher;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C35336Px6;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "environment", "LEP3;", "create", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentsClientFactory {
    private final Context context;

    public PaymentsClientFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final EP3 create(GooglePayEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        C35336Px6.C6596a m89235a = new C35336Px6.C6596a.C6597a().m89234b(environment.getValue$payments_core_release()).m89235a();
        Intrinsics.checkNotNullExpressionValue(m89235a, "Builder()\n            .s…lue)\n            .build()");
        EP3 m89236b = C35336Px6.m89236b(this.context, m89235a);
        Intrinsics.checkNotNullExpressionValue(m89236b, "getPaymentsClient(context, options)");
        return m89236b;
    }
}
