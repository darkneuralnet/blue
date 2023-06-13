package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LvH2;", "", "", "c", "", "LtH2;", "entries", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50330vH2 {

    /* renamed from: a */
    public final List<C49145tH2> f113795a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LtH2;", "it", "", C17296a.f69688o, "(LtH2;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vH2$a */
    /* loaded from: classes3.dex */
    public static final class C29472a extends Lambda implements Function1<C49145tH2, CharSequence> {

        /* renamed from: g */
        public static final C29472a f113796g = new C29472a();

        public C29472a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(C49145tH2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m12533e();
        }
    }

    public C50330vH2(List<C49145tH2> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f113795a = entries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50330vH2 copy$default(C50330vH2 c50330vH2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c50330vH2.f113795a;
        }
        return c50330vH2.m8940a(list);
    }

    /* renamed from: a */
    public final C50330vH2 m8940a(List<C49145tH2> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new C50330vH2(entries);
    }

    /* renamed from: b */
    public final List<C49145tH2> m8939b() {
        return this.f113795a;
    }

    /* renamed from: c */
    public final String m8938c() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f113795a, "\n", "[entries: ", "]\n", 0, null, C29472a.f113796g, 24, null);
        return joinToString$default;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50330vH2) && Intrinsics.areEqual(this.f113795a, ((C50330vH2) obj).f113795a);
    }

    public int hashCode() {
        return this.f113795a.hashCode();
    }

    public String toString() {
        List<C49145tH2> list = this.f113795a;
        return "ManageGroupRidesModel(entries=" + list + ")";
    }
}
