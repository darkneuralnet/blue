package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\bH\u0007¨\u0006\u0011"}, m28432d2 = {"Ljn1;", "", "LKm1;", "b", "Lxn1;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "e", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", C17296a.f69688o, "placesKey", "Lcom/google/android/libraries/places/api/net/PlacesClient;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: jn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43516jn1 {
    @Provides
    /* renamed from: a */
    public final FirebaseCrashlytics m29934a() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance()");
        firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
        return firebaseCrashlytics;
    }

    @Provides
    /* renamed from: b */
    public final AbstractC34062Km1 m29933b() {
        AbstractC34062Km1 m98298c = AbstractC34062Km1.m98298c();
        Intrinsics.checkNotNullExpressionValue(m98298c, "getInstance()");
        return m98298c;
    }

    @Provides
    /* renamed from: c */
    public final C51816xn1 m29932c() {
        C51816xn1 m4710c = C51816xn1.m4710c();
        Intrinsics.checkNotNullExpressionValue(m4710c, "getInstance()");
        return m4710c;
    }

    @Provides
    /* renamed from: d */
    public final PlacesClient m29931d(Context context, String placesKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placesKey, "placesKey");
        Places.initialize(context, placesKey);
        PlacesClient createClient = Places.createClient(context);
        Intrinsics.checkNotNullExpressionValue(createClient, "createClient(context)");
        return createClient;
    }

    @Provides
    /* renamed from: e */
    public final String m29930e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45278ml4.google_places_key);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.google_places_key)");
        return string;
    }
}
