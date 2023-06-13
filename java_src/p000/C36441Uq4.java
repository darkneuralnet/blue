package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.PhysicalLockKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0007\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u000b"}, m28432d2 = {"LTq4;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/wire/configs/Config;", "c", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/Bird;", "b", "", C17296a.f69688o, "config_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReactiveConfig+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveConfig+.kt\nco/bird/android/config/ReactiveConfig_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* renamed from: Uq4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36441Uq4 {
    /* renamed from: a */
    public static final boolean m80771a(C36207Tq4 c36207Tq4, WireBird bird) {
        String str;
        boolean areEqual;
        String kind;
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        Intrinsics.checkNotNullParameter(bird, "bird");
        WirePhysicalLock physicalLock = bird.getPhysicalLock();
        if (physicalLock != null && (kind = physicalLock.getKind()) != null) {
            str = kind.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, PhysicalLockKind.SMARTLOCK_CABLE_OKLOCK_HELMET.toString())) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(str, PhysicalLockKind.SMARTLOCK_OKAI_HELMET_CLIP.toString());
        }
        if (!areEqual || !m80769c(c36207Tq4, bird).getComplianceConfig().getHelmetRequiredForRide()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final Config m80770b(C36207Tq4 c36207Tq4, Bird bird) {
        String partnerId;
        Config value;
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        if (bird == null || (partnerId = bird.getPartnerId()) == null || (value = c36207Tq4.m82612g8(partnerId).getValue()) == null) {
            return c36207Tq4.m82623f8().getValue();
        }
        return value;
    }

    /* renamed from: c */
    public static final Config m80769c(C36207Tq4 c36207Tq4, WireBird wireBird) {
        String partnerId;
        Config value;
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        if (wireBird == null || (partnerId = wireBird.getPartnerId()) == null || (value = c36207Tq4.m82612g8(partnerId).getValue()) == null) {
            return c36207Tq4.m82623f8().getValue();
        }
        return value;
    }

    /* renamed from: d */
    public static final Observable<Config> m80768d(C36207Tq4 c36207Tq4, WireBird wireBird) {
        String partnerId;
        Z84<Config> m82612g8;
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        if (wireBird == null || (partnerId = wireBird.getPartnerId()) == null || (m82612g8 = c36207Tq4.m82612g8(partnerId)) == null) {
            return c36207Tq4.m82623f8();
        }
        return m82612g8;
    }
}
