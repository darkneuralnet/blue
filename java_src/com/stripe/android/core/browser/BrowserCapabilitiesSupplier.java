package com.stripe.android.core.browser;

import android.content.ComponentName;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "get", "Lcom/stripe/android/core/browser/BrowserCapabilities;", "isCustomTabsSupported", "", "Companion", "NoopCustomTabsServiceConnection", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class BrowserCapabilitiesSupplier {
    @Deprecated
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final Companion Companion = new Companion(null);
    private final Context context;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;", "", "()V", "CHROME_PACKAGE", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;", "LyF0;", "Landroid/content/ComponentName;", "componentName", "LvF0;", "customTabsClient", "", "onCustomTabsServiceConnected", "name", "onServiceDisconnected", "<init>", "()V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class NoopCustomTabsServiceConnection extends AbstractServiceConnectionC52089yF0 {
        @Override // p000.AbstractServiceConnectionC52089yF0
        public void onCustomTabsServiceConnected(ComponentName componentName, C50310vF0 customTabsClient) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public BrowserCapabilitiesSupplier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isCustomTabsSupported() {
        Boolean m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(Boolean.valueOf(C50310vF0.m8960a(this.context, CHROME_PACKAGE, new NoopCustomTabsServiceConnection())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = bool;
        }
        return ((Boolean) m116783constructorimpl).booleanValue();
    }

    public final BrowserCapabilities get() {
        if (isCustomTabsSupported()) {
            return BrowserCapabilities.CustomTabs;
        }
        return BrowserCapabilities.Unknown;
    }
}
