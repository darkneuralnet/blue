package co.bird.android.feature.coreinventory.scan;

import co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CoreInventoryScanActivity$itemSwiped$1 extends FunctionReferenceImpl implements Function1<Integer, C2637G6> {
    public CoreInventoryScanActivity$itemSwiped$1(Object obj) {
        super(1, obj, CoreInventoryScanAdapter.class, "getAdapterItem", "getAdapterItem(I)Lco/bird/android/widget/adapter/AdapterItem;", 0);
    }

    /* renamed from: a */
    public final C2637G6 m58359a(int i) {
        return ((CoreInventoryScanAdapter) this.receiver).m94544p(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C2637G6 invoke(Integer num) {
        return m58359a(num.intValue());
    }
}
