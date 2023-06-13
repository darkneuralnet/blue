package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
import p000.InterfaceC50693vt4;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"Lwu6;", "Lvt4;", "T", "", "Lcom/google/android/gms/maps/model/LatLngBounds;", "region", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/c;", C17296a.f69688o, "LZ84;", "", "isEnabled", "()LZ84;", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wu6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC51298wu6<T extends InterfaceC50693vt4> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wu6$a */
    /* loaded from: classes3.dex */
    public static final class C29992a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23461c refresh$default(InterfaceC51298wu6 interfaceC51298wu6, LatLngBounds latLngBounds, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = null;
                }
                return interfaceC51298wu6.mo6122a(latLngBounds, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo6122a(LatLngBounds latLngBounds, List<WireBird> list);

    Z84<Boolean> isEnabled();
}
