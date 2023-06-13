package co.bird.android.model;

import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/BlePayloadEncryptor;", "", "", "payload", "", "macAddress", "Lio/reactivex/F;", "encrypt", "decrypt", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface BlePayloadEncryptor {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static AbstractC23442F<byte[]> decrypt(BlePayloadEncryptor blePayloadEncryptor, byte[] payload, String str) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            AbstractC23442F<byte[]> m33158H = AbstractC23442F.m33158H(payload);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(payload)");
            return m33158H;
        }

        public static /* synthetic */ AbstractC23442F decrypt$default(BlePayloadEncryptor blePayloadEncryptor, byte[] bArr, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return blePayloadEncryptor.decrypt(bArr, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrypt");
        }

        public static AbstractC23442F<byte[]> encrypt(BlePayloadEncryptor blePayloadEncryptor, byte[] payload, String str) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            AbstractC23442F<byte[]> m33158H = AbstractC23442F.m33158H(payload);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(payload)");
            return m33158H;
        }

        public static /* synthetic */ AbstractC23442F encrypt$default(BlePayloadEncryptor blePayloadEncryptor, byte[] bArr, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return blePayloadEncryptor.encrypt(bArr, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encrypt");
        }
    }

    AbstractC23442F<byte[]> decrypt(byte[] bArr, String str);

    AbstractC23442F<byte[]> encrypt(byte[] bArr, String str);
}
