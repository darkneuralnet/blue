package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lk33;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "partners", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k33  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43677k33 {

    /* renamed from: a */
    public final List<Pair<NestFavoritePartner, Boolean>> f93828a;

    public C43677k33() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C43677k33 copy$default(C43677k33 c43677k33, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c43677k33.f93828a;
        }
        return c43677k33.m29388a(list);
    }

    /* renamed from: a */
    public final C43677k33 m29388a(List<Pair<NestFavoritePartner, Boolean>> partners) {
        Intrinsics.checkNotNullParameter(partners, "partners");
        return new C43677k33(partners);
    }

    /* renamed from: b */
    public final List<Pair<NestFavoritePartner, Boolean>> m29387b() {
        return this.f93828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43677k33) && Intrinsics.areEqual(this.f93828a, ((C43677k33) obj).f93828a);
    }

    public int hashCode() {
        return this.f93828a.hashCode();
    }

    public String toString() {
        List<Pair<NestFavoritePartner, Boolean>> list = this.f93828a;
        return "NestFavoritePartnerState(partners=" + list + ")";
    }

    public C43677k33(List<Pair<NestFavoritePartner, Boolean>> partners) {
        Intrinsics.checkNotNullParameter(partners, "partners");
        this.f93828a = partners;
    }

    public /* synthetic */ C43677k33(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
