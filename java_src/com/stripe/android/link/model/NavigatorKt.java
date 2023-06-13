package com.stripe.android.link.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"LOY2;", "", "isOnRootScreen", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class NavigatorKt {
    public static final boolean isOnRootScreen(OY2 oy2) {
        Intrinsics.checkNotNullParameter(oy2, "<this>");
        if (oy2.m110205v().size() <= 2) {
            return true;
        }
        return false;
    }
}
