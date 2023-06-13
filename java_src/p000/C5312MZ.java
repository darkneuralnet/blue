package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.BeginnerModeRiderMapAction;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LMZ;", "", "", "title", "", "Lco/bird/api/response/BeginnerModeRiderMapAction;", "actions", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MZ */
/* loaded from: classes2.dex */
public final class C5312MZ {

    /* renamed from: a */
    public final String f23242a;

    /* renamed from: b */
    public final List<BeginnerModeRiderMapAction> f23243b;

    public C5312MZ(String title, List<BeginnerModeRiderMapAction> actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f23242a = title;
        this.f23243b = actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5312MZ copy$default(C5312MZ c5312mz, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5312mz.f23242a;
        }
        if ((i & 2) != 0) {
            list = c5312mz.f23243b;
        }
        return c5312mz.m95168a(str, list);
    }

    /* renamed from: a */
    public final C5312MZ m95168a(String title, List<BeginnerModeRiderMapAction> actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new C5312MZ(title, actions);
    }

    /* renamed from: b */
    public final List<BeginnerModeRiderMapAction> m95167b() {
        return this.f23243b;
    }

    /* renamed from: c */
    public final String m95166c() {
        return this.f23242a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5312MZ) {
            C5312MZ c5312mz = (C5312MZ) obj;
            return Intrinsics.areEqual(this.f23242a, c5312mz.f23242a) && Intrinsics.areEqual(this.f23243b, c5312mz.f23243b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23242a.hashCode() * 31) + this.f23243b.hashCode();
    }

    public String toString() {
        String str = this.f23242a;
        List<BeginnerModeRiderMapAction> list = this.f23243b;
        return "BottomSheetData(title=" + str + ", actions=" + list + ")";
    }
}
