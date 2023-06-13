package p000;

import co.bird.android.model.wire.WireBird;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.WireBluetoothEncryptionPermissionResponse;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\r\u001a\u00020\fH'¨\u0006\u0010"}, m28432d2 = {"Lp54;", "", "", "offset", "limit", "", "active", "Lio/reactivex/F;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireBird;", "c", "(IILjava/lang/Boolean;)Lio/reactivex/F;", "", "macAddress", "Lco/bird/api/response/WireBluetoothEncryptionPermissionResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: p54  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC46663p54 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: p54$a */
    /* loaded from: classes4.dex */
    public static final class C27139a {
        public static /* synthetic */ AbstractC23442F getPrivateBirds$default(InterfaceC46663p54 interfaceC46663p54, int i, int i2, Boolean bool, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    bool = null;
                }
                return interfaceC46663p54.m19973c(i, i2, bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrivateBirds");
        }
    }

    @NA1("bluetooth-encryption/permission")
    /* renamed from: b */
    AbstractC23442F<WireBluetoothEncryptionPermissionResponse> m19974b(@InterfaceC37017Xc4("mac_address") String str);

    @NA1("private-bird/all")
    /* renamed from: c */
    AbstractC23442F<CollectionResponse<WireBird>> m19973c(@InterfaceC37017Xc4("offset") int i, @InterfaceC37017Xc4("limit") int i2, @InterfaceC37017Xc4("active") Boolean bool);
}
