package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0005\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LmY3;", "LWw0;", "", "Lco/bird/android/model/persistence/Tutorial;", "tutorials", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mY3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45149mY3 implements InterfaceC36959Ww0 {

    /* renamed from: a */
    public final List<List<Tutorial>> f98326a;

    /* JADX WARN: Multi-variable type inference failed */
    public C45149mY3(List<? extends List<Tutorial>> tutorials) {
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        this.f98326a = tutorials;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45149mY3 copy$default(C45149mY3 c45149mY3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c45149mY3.f98326a;
        }
        return c45149mY3.m25445a(list);
    }

    /* renamed from: a */
    public final C45149mY3 m25445a(List<? extends List<Tutorial>> tutorials) {
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        return new C45149mY3(tutorials);
    }

    /* renamed from: b */
    public final List<List<Tutorial>> m25444b() {
        return this.f98326a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C45149mY3) && Intrinsics.areEqual(this.f98326a, ((C45149mY3) obj).f98326a);
    }

    public int hashCode() {
        return this.f98326a.hashCode();
    }

    public String toString() {
        List<List<Tutorial>> list = this.f98326a;
        return "PopulateAdapter(tutorials=" + list + ")";
    }
}
