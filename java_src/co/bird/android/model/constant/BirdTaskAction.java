package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/constant/BirdTaskAction;", "", "(Ljava/lang/String;I)V", "ALARM", "CANCEL_TASK_DIRECT", "CANCEL_TASK_INDIRECT", "LOCK", "UNLOCK", "UNLOCK_PHYSICAL_LOCK", "VEHICLE_INFO", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum BirdTaskAction {
    ALARM,
    CANCEL_TASK_DIRECT,
    CANCEL_TASK_INDIRECT,
    LOCK,
    UNLOCK,
    UNLOCK_PHYSICAL_LOCK,
    VEHICLE_INFO;
    
    private static final Set<BirdTaskAction> CANCEL_ACTIONS;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/constant/BirdTaskAction$Companion;", "", "()V", "CANCEL_ACTIONS", "", "Lco/bird/android/model/constant/BirdTaskAction;", "getCANCEL_ACTIONS", "()Ljava/util/Set;", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<BirdTaskAction> getCANCEL_ACTIONS() {
            return BirdTaskAction.CANCEL_ACTIONS;
        }

        private Companion() {
        }
    }

    static {
        BirdTaskAction birdTaskAction;
        Set<BirdTaskAction> of;
        of = SetsKt__SetsKt.setOf((Object[]) new BirdTaskAction[]{r0, birdTaskAction});
        CANCEL_ACTIONS = of;
    }
}
