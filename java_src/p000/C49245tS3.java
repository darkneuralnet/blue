package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.physicallock.PhysicalLockActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockUnlockActivity;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "", "unlocking", "showForPrivateBird", "isHelmetLock", "Landroid/content/Intent;", C17296a.f69688o, "(Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;ZZLjava/lang/Boolean;)Landroid/content/Intent;", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockIntentCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockIntentCreator.kt\nco/bird/android/app/feature/physicallock/PhysicalLockIntentCreatorKt\n+ 2 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n30#2,2:44\n32#2:47\n61#2,26:48\n33#2:74\n34#2:76\n30#2,2:77\n32#2:80\n61#2,26:81\n33#2:107\n34#2:109\n13579#3:46\n13580#3:75\n13579#3:79\n13580#3:108\n*S KotlinDebug\n*F\n+ 1 PhysicalLockIntentCreator.kt\nco/bird/android/app/feature/physicallock/PhysicalLockIntentCreatorKt\n*L\n33#1:44,2\n33#1:47\n33#1:48,26\n33#1:74\n33#1:76\n35#1:77,2\n35#1:80\n35#1:81,26\n35#1:107\n35#1:109\n33#1:46\n33#1:75\n35#1:79\n35#1:108\n*E\n"})
/* renamed from: tS3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49245tS3 {
    /* renamed from: a */
    public static final Intent m12309a(Context context, Config config, WirePhysicalLock wirePhysicalLock, boolean z, boolean z2, Boolean bool) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (wirePhysicalLock == null || (!z2 && ((z && !config.getEnablePhysicalLockUnlock()) || (!z && !config.getEnablePhysicalLockLock())))) {
            return null;
        }
        if (wirePhysicalLock.isBrainBasedBluetooth() && !Intrinsics.areEqual(config.getRideConfig().getSmartlockConfig().getEnableMechanicalCableLock(), Boolean.TRUE)) {
            return null;
        }
        if (wirePhysicalLock.getSmartlock() == null && !wirePhysicalLock.isBrainBasedBluetooth()) {
            intent = new Intent(context, PhysicalLockActivity.class);
        } else {
            intent = new Intent(context, SmartlockUnlockActivity.class);
        }
        intent.putExtra("physical_lock", wirePhysicalLock);
        intent.putExtra("physical_lock_unlocking", z);
        intent.putExtra("private_bird", z2);
        intent.putExtra("helmet_lock", bool);
        return intent;
    }

    public static /* synthetic */ Intent physicalLockIntent$default(Context context, Config config, WirePhysicalLock wirePhysicalLock, boolean z, boolean z2, Boolean bool, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        }
        return m12309a(context, config, wirePhysicalLock, z, z3, bool);
    }
}
