package com.stripe.android.financialconnections.utils;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m28432d2 = {"measureTimeMillis", "Lkotlin/Pair;", "T", "", "function", "Lkotlin/Function0;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TimeKt {
    public static final <T> Pair<T, Long> measureTimeMillis(Function0<? extends T> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return TuplesKt.m28425to(function.invoke(), Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
    }
}
