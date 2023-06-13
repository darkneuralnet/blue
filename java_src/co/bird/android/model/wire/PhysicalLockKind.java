package co.bird.android.model.wire;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/PhysicalLockKind;", "", "(Ljava/lang/String;I)V", "isBrainLock", "", "()Z", "toString", "", "COMBINATION", "CARABINER", "SMARTLOCK_CABLE_NOKELOCK_BIRDV1", "SMARTLOCK_CABLE_OKLOCK_HELMET", "SMARTLOCK_OKAI_HELMET_CLIP", "EB100_CABLE_LOCK", "SMARTLOCK_SOLEBE_HELMET_CLIP", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PhysicalLockKind {
    COMBINATION,
    CARABINER,
    SMARTLOCK_CABLE_NOKELOCK_BIRDV1,
    SMARTLOCK_CABLE_OKLOCK_HELMET,
    SMARTLOCK_OKAI_HELMET_CLIP,
    EB100_CABLE_LOCK,
    SMARTLOCK_SOLEBE_HELMET_CLIP;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhysicalLockKind.values().length];
            try {
                iArr[PhysicalLockKind.SMARTLOCK_OKAI_HELMET_CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhysicalLockKind.EB100_CABLE_LOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isBrainLock() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
