package p000;

import android.location.Address;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationRequest;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0015"}, m28432d2 = {"Law2;", "", "Lio/reactivex/p;", "Landroid/location/Location;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Lio/reactivex/Observable;", "b", "", "lat", "lng", "", "maxResults", "Lio/reactivex/F;", "", "Landroid/location/Address;", C17296a.f69688o, "", "locationName", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aw2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC38253aw2 {
    /* renamed from: a */
    AbstractC23442F<List<Address>> mo65221a(double d, double d2, int i);

    /* renamed from: b */
    Observable<Location> mo65220b(LocationRequest locationRequest);

    /* renamed from: c */
    AbstractC23442F<List<Address>> mo65219c(String str, int i);

    /* renamed from: d */
    AbstractC24507p<Location> mo65218d();
}
