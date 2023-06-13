package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\b\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;", "", "()V", "provideAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "publishableKey", "", "provideAnalyticsRequestFactory$paymentsheet_release", "provideDummyInjectorKey", "provideEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "defaultAddressLauncherEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideGooglePlacesClient", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "args", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "provideGooglePlacesClient$paymentsheet_release", "providesPublishableKey", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {AddressElementViewModelSubcomponent.class, InputAddressViewModelSubcomponent.class, AutocompleteViewModelSubcomponent.class, FormControllerSubcomponent.class})
/* loaded from: classes7.dex */
public final class AddressElementViewModelModule {
    @Provides
    public final AnalyticsRequestFactory provideAnalyticsRequestFactory$paymentsheet_release(Context context, final String publishableKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        return new AnalyticsRequestFactory(packageManager, ContextUtils.INSTANCE.getPackageInfo(context), packageName, new Y94() { // from class: c8
            @Override // p000.Y94
            public final Object get() {
                String checkNotNullParameter;
                checkNotNullParameter = Intrinsics.checkNotNullParameter(publishableKey, "$publishableKey");
                return checkNotNullParameter;
            }
        });
    }

    @Provides
    @InjectorKey
    public final String provideDummyInjectorKey() {
        return InjectorKt.DUMMY_INJECTOR_KEY;
    }

    @Provides
    public final AddressLauncherEventReporter provideEventReporter(DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
        Intrinsics.checkNotNullParameter(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }

    @Provides
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }

    @Provides
    public final PlacesClientProxy provideGooglePlacesClient$paymentsheet_release(Context context, AddressElementActivityContract.Args args) {
        String googlePlacesApiKey;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(args, "args");
        AddressLauncher.Configuration config$paymentsheet_release = args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (googlePlacesApiKey = config$paymentsheet_release.getGooglePlacesApiKey()) != null) {
            return PlacesClientProxy.Companion.create$default(PlacesClientProxy.Companion, context, googlePlacesApiKey, null, null, null, 28, null);
        }
        return null;
    }

    @Provides
    public final String providesPublishableKey(AddressElementActivityContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return args.getPublishableKey$paymentsheet_release();
    }
}
