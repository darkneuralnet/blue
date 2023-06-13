package p000;

import co.bird.android.model.constant.TransferOrderStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/constant/TransferOrderStatus;", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: h96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41961h96 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: h96$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22563a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferOrderStatus.values().length];
            try {
                iArr[TransferOrderStatus.IN_TRANSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferOrderStatus.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferOrderStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferOrderStatus.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m36771a(TransferOrderStatus transferOrderStatus) {
        Intrinsics.checkNotNullParameter(transferOrderStatus, "<this>");
        int i = C22563a.$EnumSwitchMapping$0[transferOrderStatus.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return C32364Df4.primaryText;
                }
                return C32364Df4.birdGreen;
            }
            return C32364Df4.birdRed;
        }
        return C32364Df4.birdYellow;
    }
}
