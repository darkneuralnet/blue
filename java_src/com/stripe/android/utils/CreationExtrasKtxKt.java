package com.stripe.android.utils;

import android.app.Application;
import androidx.lifecycle.C11759u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, m28432d2 = {"LFE0;", "Landroid/app/Application;", "requireApplication", "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CreationExtrasKtxKt {
    public static final Application requireApplication(FE0 fe0) {
        Intrinsics.checkNotNullParameter(fe0, "<this>");
        Object mo17471a = fe0.mo17471a(C11759u.C11760a.f54991h);
        if (mo17471a != null) {
            return (Application) mo17471a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
