package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScrapRequestReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LHp5;", "", "Lco/bird/android/model/constant/ScrapRequestReason;", "reason", "", "display", "", "selected", "enabled", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/constant/ScrapRequestReason;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/constant/ScrapRequestReason;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "e", "()Z", "<init>", "(Lco/bird/android/model/constant/ScrapRequestReason;Ljava/lang/String;ZZ)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hp5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33391Hp5 {

    /* renamed from: a */
    public final ScrapRequestReason f13914a;

    /* renamed from: b */
    public final String f13915b;

    /* renamed from: c */
    public final boolean f13916c;

    /* renamed from: d */
    public final boolean f13917d;

    public C33391Hp5(ScrapRequestReason reason, String display, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f13914a = reason;
        this.f13915b = display;
        this.f13916c = z;
        this.f13917d = z2;
    }

    public static /* synthetic */ C33391Hp5 copy$default(C33391Hp5 c33391Hp5, ScrapRequestReason scrapRequestReason, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            scrapRequestReason = c33391Hp5.f13914a;
        }
        if ((i & 2) != 0) {
            str = c33391Hp5.f13915b;
        }
        if ((i & 4) != 0) {
            z = c33391Hp5.f13916c;
        }
        if ((i & 8) != 0) {
            z2 = c33391Hp5.f13917d;
        }
        return c33391Hp5.m103411a(scrapRequestReason, str, z, z2);
    }

    /* renamed from: a */
    public final C33391Hp5 m103411a(ScrapRequestReason reason, String display, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(display, "display");
        return new C33391Hp5(reason, display, z, z2);
    }

    /* renamed from: b */
    public final String m103410b() {
        return this.f13915b;
    }

    /* renamed from: c */
    public final boolean m103409c() {
        return this.f13917d;
    }

    /* renamed from: d */
    public final ScrapRequestReason m103408d() {
        return this.f13914a;
    }

    /* renamed from: e */
    public final boolean m103407e() {
        return this.f13916c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33391Hp5) {
            C33391Hp5 c33391Hp5 = (C33391Hp5) obj;
            return this.f13914a == c33391Hp5.f13914a && Intrinsics.areEqual(this.f13915b, c33391Hp5.f13915b) && this.f13916c == c33391Hp5.f13916c && this.f13917d == c33391Hp5.f13917d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f13914a.hashCode() * 31) + this.f13915b.hashCode()) * 31;
        boolean z = this.f13916c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f13917d;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        ScrapRequestReason scrapRequestReason = this.f13914a;
        String str = this.f13915b;
        boolean z = this.f13916c;
        boolean z2 = this.f13917d;
        return "ScrapRequestReasonViewModel(reason=" + scrapRequestReason + ", display=" + str + ", selected=" + z + ", enabled=" + z2 + ")";
    }
}
