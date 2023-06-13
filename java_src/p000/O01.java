package p000;

import android.location.Address;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AddressGuess;
import co.bird.android.model.destination.Destination;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0010\u001a\u00020\nH&R \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m28432d2 = {"LO01;", "", "Lco/bird/android/model/destination/Destination;", "destination", "", "c", "", "latitude", "longitude", "e", "", "query", "Lio/reactivex/F;", "", "Lco/bird/android/model/AddressGuess;", C17296a.f69688o, "id", "Landroid/location/Address;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "getDestination", "()Lio/reactivex/Observable;", "", "f", "hasDestinationObservable", "b", "()Z", "hasDestination", "co.bird.android.manager.destination.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O01 */
/* loaded from: classes4.dex */
public interface O01 {
    /* renamed from: a */
    AbstractC23442F<List<AddressGuess>> mo73916a(String str);

    /* renamed from: b */
    boolean mo73915b();

    /* renamed from: c */
    void mo73914c(Destination destination);

    /* renamed from: d */
    AbstractC23442F<Address> mo73913d(String str);

    /* renamed from: e */
    void mo73912e(double d, double d2);

    /* renamed from: f */
    Observable<Boolean> mo73911f();

    Observable<Optional<Destination>> getDestination();
}
