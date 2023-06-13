package co.bird.android.model.wire;

import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PhysicalLockPurpose;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBird$modelSpecificPhysicalLocks$2 extends Lambda implements Function0<List<? extends WirePhysicalLock>> {
    final /* synthetic */ WireBird this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdModel.values().length];
            try {
                iArr[BirdModel.EB100.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireBird$modelSpecificPhysicalLocks$2(WireBird wireBird) {
        super(0);
        this.this$0 = wireBird;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends WirePhysicalLock> invoke() {
        List<? extends WirePhysicalLock> emptyList;
        List<? extends WirePhysicalLock> listOf;
        List<? extends WirePhysicalLock> listOf2;
        if (WhenMappings.$EnumSwitchMapping$0[WireBirdKt.birdModel(this.this$0).ordinal()] == 1) {
            if (this.this$0.getHasHelmet()) {
                String uuid = UUID.fromString(this.this$0.getId()).toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "fromString(id).toString()");
                listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new WirePhysicalLock(uuid, this.this$0.getId(), PhysicalLockKind.EB100_CABLE_LOCK.toString(), null, null, null, null, null, null, PhysicalLockPurpose.HELMET, 504, null));
                return listOf2;
            }
            String uuid2 = UUID.fromString(this.this$0.getId()).toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "fromString(id).toString()");
            listOf = CollectionsKt__CollectionsJVMKt.listOf(new WirePhysicalLock(uuid2, this.this$0.getId(), PhysicalLockKind.EB100_CABLE_LOCK.toString(), null, null, null, null, null, null, PhysicalLockPurpose.LOCK_TO, 504, null));
            return listOf;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }
}
