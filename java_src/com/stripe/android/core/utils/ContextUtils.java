package com.stripe.android.core.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/utils/ContextUtils;", "", "()V", "packageInfo", "Landroid/content/pm/PackageInfo;", "Landroid/content/Context;", "getPackageInfo", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class ContextUtils {
    public static final ContextUtils INSTANCE = new ContextUtils();

    private ContextUtils() {
    }

    public final /* synthetic */ PackageInfo getPackageInfo(Context context) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = null;
        }
        return (PackageInfo) m116783constructorimpl;
    }
}
