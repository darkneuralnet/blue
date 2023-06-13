package p000;

import co.bird.api.request.WireBluetoothDecryptionRequest;
import co.bird.api.request.WireBluetoothEncryptionRequest;
import co.bird.api.response.WireBluetoothDecryptionResponse;
import co.bird.api.response.WireBluetoothEncryptionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\n"}, m28432d2 = {"LhX;", "", "Lco/bird/api/request/WireBluetoothEncryptionRequest;", "request", "Lio/reactivex/F;", "Lco/bird/api/response/WireBluetoothEncryptionResponse;", "b", "Lco/bird/api/request/WireBluetoothDecryptionRequest;", "Lco/bird/api/response/WireBluetoothDecryptionResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hX */
/* loaded from: classes4.dex */
public interface InterfaceC22675hX {
    @AD3("/bluetooth-encryption/payload/decrypt")
    /* renamed from: a */
    AbstractC23442F<WireBluetoothDecryptionResponse> m36249a(@InterfaceC6404PY WireBluetoothDecryptionRequest wireBluetoothDecryptionRequest);

    @AD3("/bluetooth-encryption/payload/encrypt")
    /* renamed from: b */
    AbstractC23442F<WireBluetoothEncryptionResponse> m36248b(@InterfaceC6404PY WireBluetoothEncryptionRequest wireBluetoothEncryptionRequest);
}
