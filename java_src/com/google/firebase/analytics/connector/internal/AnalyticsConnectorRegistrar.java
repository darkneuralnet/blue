package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
@KeepForSdk
/* loaded from: classes6.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(InterfaceC12447ba.class).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29483k(Context.class)).m108292b(C43645k01.m29483k(InterfaceC42734iT5.class)).m108288f(C52069yC7.f118974a).m108289e().m108290d(), C50661vq2.m7933b("fire-analytics", "21.2.2"));
    }
}
