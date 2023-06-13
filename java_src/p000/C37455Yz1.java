package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireFrequentFlyerProgress;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LYz1;", "", "", "message", "Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "progress", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "c", "()Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "<init>", "(Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerProgress;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37455Yz1 {

    /* renamed from: a */
    public final String f47707a;

    /* renamed from: b */
    public final WireFrequentFlyerProgress f47708b;

    public C37455Yz1(String message, WireFrequentFlyerProgress progress) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f47707a = message;
        this.f47708b = progress;
    }

    public static /* synthetic */ C37455Yz1 copy$default(C37455Yz1 c37455Yz1, String str, WireFrequentFlyerProgress wireFrequentFlyerProgress, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c37455Yz1.f47707a;
        }
        if ((i & 2) != 0) {
            wireFrequentFlyerProgress = c37455Yz1.f47708b;
        }
        return c37455Yz1.m73942a(str, wireFrequentFlyerProgress);
    }

    /* renamed from: a */
    public final C37455Yz1 m73942a(String message, WireFrequentFlyerProgress progress) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new C37455Yz1(message, progress);
    }

    /* renamed from: b */
    public final String m73941b() {
        return this.f47707a;
    }

    /* renamed from: c */
    public final WireFrequentFlyerProgress m73940c() {
        return this.f47708b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37455Yz1) {
            C37455Yz1 c37455Yz1 = (C37455Yz1) obj;
            return Intrinsics.areEqual(this.f47707a, c37455Yz1.f47707a) && Intrinsics.areEqual(this.f47708b, c37455Yz1.f47708b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f47707a.hashCode() * 31) + this.f47708b.hashCode();
    }

    public String toString() {
        String str = this.f47707a;
        WireFrequentFlyerProgress wireFrequentFlyerProgress = this.f47708b;
        return "FrequentFlyerMapPillStatus(message=" + str + ", progress=" + wireFrequentFlyerProgress + ")";
    }
}
