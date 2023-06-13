package p000;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationRequest;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pl.charmas.android.reactivelocation2.ReactiveLocationProvider;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LEr4;", "Law2;", "Lio/reactivex/p;", "Landroid/location/Location;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Lio/reactivex/Observable;", "b", "", "lat", "lng", "", "maxResults", "Lio/reactivex/F;", "", "Landroid/location/Address;", C17296a.f69688o, "", "locationName", "c", "Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;", "Lkotlin/Lazy;", "e", "()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;", "provider", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.lib.location"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Er4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32706Er4 implements InterfaceC38253aw2 {

    /* renamed from: a */
    public final Lazy f8199a;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;", "b", "()Lpl/charmas/android/reactivelocation2/ReactiveLocationProvider;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Er4$a */
    /* loaded from: classes3.dex */
    public static final class C1998a extends Lambda implements Function0<ReactiveLocationProvider> {

        /* renamed from: g */
        public final /* synthetic */ Context f8200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1998a(Context context) {
            super(0);
            this.f8200g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ReactiveLocationProvider invoke() {
            return new ReactiveLocationProvider(this.f8200g);
        }
    }

    public C32706Er4(Context context) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C1998a(context));
        this.f8199a = lazy;
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: a */
    public AbstractC23442F<List<Address>> mo65221a(double d, double d2, int i) {
        AbstractC23442F<List<Address>> reverseGeocode = m108325e().reverseGeocode(d, d2, i);
        Intrinsics.checkNotNullExpressionValue(reverseGeocode, "provider.reverseGeocode(lat, lng, maxResults)");
        return reverseGeocode;
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: b */
    public Observable<Location> mo65220b(LocationRequest locationRequest) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Observable<Location> updatedLocation = m108325e().getUpdatedLocation(locationRequest);
        Intrinsics.checkNotNullExpressionValue(updatedLocation, "provider.getUpdatedLocation(locationRequest)");
        return updatedLocation;
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: c */
    public AbstractC23442F<List<Address>> mo65219c(String locationName, int i) {
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        AbstractC23442F<List<Address>> geocode = m108325e().geocode(locationName, i);
        Intrinsics.checkNotNullExpressionValue(geocode, "provider.geocode(locationName, maxResults)");
        return geocode;
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: d */
    public AbstractC24507p<Location> mo65218d() {
        AbstractC24507p<Location> lastKnownLocation = m108325e().getLastKnownLocation();
        Intrinsics.checkNotNullExpressionValue(lastKnownLocation, "provider.lastKnownLocation");
        return lastKnownLocation;
    }

    /* renamed from: e */
    public final ReactiveLocationProvider m108325e() {
        return (ReactiveLocationProvider) this.f8199a.getValue();
    }
}
