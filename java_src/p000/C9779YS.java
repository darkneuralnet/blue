package p000;

import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import co.bird.android.app.feature.bluetooth.job.DeepSleepPayload;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0000H\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "", "c", "LQh2;", "enabled", "", "b", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdScanPresenter.kt\nco/bird/android/app/feature/scanner/BirdScanPresenterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,806:1\n1#2:807\n*E\n"})
/* renamed from: YS */
/* loaded from: classes2.dex */
public final class C9779YS {
    /* renamed from: a */
    public static final boolean m75015a(WireBird wireBird) {
        Set of;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"1", "2", "3", "4", "5", "7"});
        String boardProtocol = wireBird.getBoardProtocol();
        if (boardProtocol != null) {
            return !of.contains(boardProtocol);
        }
        return false;
    }

    /* renamed from: b */
    public static final void m75014b(InterfaceC35422Qh2 interfaceC35422Qh2, WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC35422Qh2, "<this>");
        Intrinsics.checkNotNullParameter(bird, "bird");
        interfaceC35422Qh2.mo86442a(new DeepSleepPayload(bird, z), Reflection.getOrCreateKotlinClass(DeepSleepJobConsumer.class));
    }

    /* renamed from: c */
    public static final boolean m75013c(WireBird wireBird, WireBird wireBird2) {
        if (!Intrinsics.areEqual(wireBird.getId(), wireBird2.getId()) && !Intrinsics.areEqual(wireBird.getCode(), wireBird2.getCode()) && !Intrinsics.areEqual(wireBird.getSerialNumber(), wireBird2.getSerialNumber())) {
            return false;
        }
        return true;
    }
}
