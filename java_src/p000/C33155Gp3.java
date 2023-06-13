package p000;

import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, m28432d2 = {"LGp3;", "LKA;", "", DateTokenConverter.CONVERTER_KEY, "", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "e", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33155Gp3 extends AbstractC4367KA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33155Gp3(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    /* renamed from: d */
    public final void m104697d() {
        m99111c(new C48282rp3());
    }

    /* renamed from: e */
    public final void m104696e(String orderId, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        m99111c(C33614Io3.f16223i.m101692a(orderId, type));
    }
}
