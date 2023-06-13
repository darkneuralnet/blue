package com.stripe.android.core.networking;

import android.os.Build;
import com.stripe.android.core.AppInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "", "systemPropertySupplier", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "create", "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "createHeaderValue", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StripeClientUserAgentHeaderFactory {
    public static final Companion Companion = new Companion(null);
    private static final Function1<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = C18623x60e4aaf2.INSTANCE;
    public static final String HEADER_STRIPE_CLIENT_USER_AGENT = "X-Stripe-Client-User-Agent";
    private static final String PROP_USER_AGENT = "http.agent";
    private final Function1<String, String> systemPropertySupplier;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory$Companion;", "", "()V", "DEFAULT_SYSTEM_PROPERTY_SUPPLIER", "Lkotlin/Function1;", "", "HEADER_STRIPE_CLIENT_USER_AGENT", "PROP_USER_AGENT", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeClientUserAgentHeaderFactory() {
        this(null, 1, null);
    }

    public static /* synthetic */ Map create$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.create(appInfo);
    }

    public static /* synthetic */ JSONObject createHeaderValue$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.createHeaderValue(appInfo);
    }

    public final Map<String, String> create(AppInfo appInfo) {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(HEADER_STRIPE_CLIENT_USER_AGENT, createHeaderValue(appInfo).toString()));
        return mapOf;
    }

    public final JSONObject createHeaderValue(AppInfo appInfo) {
        Map mapOf;
        Map<String, Map<String, String>> map;
        Map plus;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("os.name", "android"), TuplesKt.m28425to("os.version", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.m28425to("bindings.version", "20.21.0"), TuplesKt.m28425to(RequestHeadersFactory.LANG, "Java"), TuplesKt.m28425to("publisher", "Stripe"), TuplesKt.m28425to(PROP_USER_AGENT, this.systemPropertySupplier.invoke(PROP_USER_AGENT)));
        if (appInfo != null) {
            map = appInfo.createClientHeaders$stripe_core_release();
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        return new JSONObject(plus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeClientUserAgentHeaderFactory(Function1<? super String, String> systemPropertySupplier) {
        Intrinsics.checkNotNullParameter(systemPropertySupplier, "systemPropertySupplier");
        this.systemPropertySupplier = systemPropertySupplier;
    }

    public /* synthetic */ StripeClientUserAgentHeaderFactory(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_SYSTEM_PROPERTY_SUPPLIER : function1);
    }
}
