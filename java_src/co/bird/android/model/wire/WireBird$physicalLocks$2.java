package co.bird.android.model.wire;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWireBird.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBird$physicalLocks$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,672:1\n37#2,2:673\n*S KotlinDebug\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBird$physicalLocks$2\n*L\n339#1:673,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WireBird$physicalLocks$2 extends Lambda implements Function0<List<? extends WirePhysicalLock>> {
    final /* synthetic */ WireBird this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireBird$physicalLocks$2(WireBird wireBird) {
        super(0);
        this.this$0 = wireBird;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends WirePhysicalLock> invoke() {
        List<? extends WirePhysicalLock> listOfNotNull;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(this.this$0.getPhysicalLock());
        spreadBuilder.addSpread(this.this$0.getModelSpecificPhysicalLocks().toArray(new WirePhysicalLock[0]));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new WirePhysicalLock[spreadBuilder.size()]));
        return listOfNotNull;
    }
}
