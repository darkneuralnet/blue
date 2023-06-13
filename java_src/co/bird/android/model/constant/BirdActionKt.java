package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"oneOf", "", "Lco/bird/android/model/constant/BirdAction;", "actions", "", "(Lco/bird/android/model/constant/BirdAction;[Lco/bird/android/model/constant/BirdAction;)Z", "model-constant"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBirdAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAction.kt\nco/bird/android/model/constant/BirdActionKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,74:1\n1282#2,2:75\n*S KotlinDebug\n*F\n+ 1 BirdAction.kt\nco/bird/android/model/constant/BirdActionKt\n*L\n72#1:75,2\n*E\n"})
/* loaded from: classes4.dex */
public final class BirdActionKt {
    public static final boolean oneOf(BirdAction birdAction, BirdAction... actions) {
        BirdAction birdAction2;
        boolean z;
        Intrinsics.checkNotNullParameter(birdAction, "<this>");
        Intrinsics.checkNotNullParameter(actions, "actions");
        int length = actions.length;
        int i = 0;
        while (true) {
            if (i < length) {
                birdAction2 = actions[i];
                if (birdAction2 == birdAction) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                birdAction2 = null;
                break;
            }
        }
        if (birdAction2 == null) {
            return false;
        }
        return true;
    }
}
