package co.bird.android.model;

import co.bird.android.model.BlePayloadEncryptor;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Lco/bird/android/model/HJPayloadEncryptor;", "Lco/bird/android/model/BlePayloadEncryptor;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface HJPayloadEncryptor extends BlePayloadEncryptor {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static AbstractC23442F<byte[]> decrypt(HJPayloadEncryptor hJPayloadEncryptor, byte[] payload, String str) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return BlePayloadEncryptor.DefaultImpls.decrypt(hJPayloadEncryptor, payload, str);
        }

        public static AbstractC23442F<byte[]> encrypt(HJPayloadEncryptor hJPayloadEncryptor, byte[] payload, String str) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return BlePayloadEncryptor.DefaultImpls.encrypt(hJPayloadEncryptor, payload, str);
        }
    }
}
