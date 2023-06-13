package com.stripe.android.paymentsheet.utils;

import androidx.lifecycle.AbstractC11719f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m28432d2 = {"T", "LEu1;", "LLifecycleOwner;", "owner", "Landroidx/lifecycle/f$b;", "minActiveState", "Lkotlin/Function1;", "", "action", "Lzh2;", "launchAndCollectIn", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class UiUtilsKt {
    public static final <T> InterfaceC52943zh2 launchAndCollectIn(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, LifecycleOwner owner, AbstractC11719f.EnumC11724b minActiveState, Function1<? super T, Unit> action) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        m73800d = Z30.m73800d(C33163Gq2.m104689a(owner), null, null, new UiUtilsKt$launchAndCollectIn$1(owner, minActiveState, interfaceC32730Eu1, action, null), 3, null);
        return m73800d;
    }

    public static /* synthetic */ InterfaceC52943zh2 launchAndCollectIn$default(InterfaceC32730Eu1 interfaceC32730Eu1, LifecycleOwner owner, AbstractC11719f.EnumC11724b enumC11724b, Function1 action, int i, Object obj) {
        InterfaceC52943zh2 m73800d;
        if ((i & 2) != 0) {
            enumC11724b = AbstractC11719f.EnumC11724b.STARTED;
        }
        AbstractC11719f.EnumC11724b minActiveState = enumC11724b;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        m73800d = Z30.m73800d(C33163Gq2.m104689a(owner), null, null, new UiUtilsKt$launchAndCollectIn$1(owner, minActiveState, interfaceC32730Eu1, action, null), 3, null);
        return m73800d;
    }
}
