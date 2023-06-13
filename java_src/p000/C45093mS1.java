package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!JC\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LmS1;", "", "", "Lco/bird/android/model/IdToolOption;", "associateOptions", "dissociateOptions", "Lco/bird/android/model/persistence/BrainSwapRecord;", "records", "", "progress", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "f", DateTokenConverter.CONVERTER_KEY, "I", "e", "()I", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "g", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45093mS1 {

    /* renamed from: a */
    public final List<IdToolOption> f98034a;

    /* renamed from: b */
    public final List<IdToolOption> f98035b;

    /* renamed from: c */
    public final List<BrainSwapRecord> f98036c;

    /* renamed from: d */
    public final int f98037d;

    /* renamed from: e */
    public Throwable f98038e;

    public C45093mS1() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45093mS1 copy$default(C45093mS1 c45093mS1, List list, List list2, List list3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c45093mS1.f98034a;
        }
        if ((i2 & 2) != 0) {
            list2 = c45093mS1.f98035b;
        }
        if ((i2 & 4) != 0) {
            list3 = c45093mS1.f98036c;
        }
        if ((i2 & 8) != 0) {
            i = c45093mS1.f98037d;
        }
        return c45093mS1.m25613a(list, list2, list3, i);
    }

    /* renamed from: a */
    public final C45093mS1 m25613a(List<? extends IdToolOption> associateOptions, List<? extends IdToolOption> dissociateOptions, List<BrainSwapRecord> records, int i) {
        Intrinsics.checkNotNullParameter(associateOptions, "associateOptions");
        Intrinsics.checkNotNullParameter(dissociateOptions, "dissociateOptions");
        Intrinsics.checkNotNullParameter(records, "records");
        return new C45093mS1(associateOptions, dissociateOptions, records, i);
    }

    /* renamed from: b */
    public final List<IdToolOption> m25612b() {
        return this.f98034a;
    }

    /* renamed from: c */
    public final List<IdToolOption> m25611c() {
        return this.f98035b;
    }

    /* renamed from: d */
    public final Throwable m25610d() {
        return this.f98038e;
    }

    /* renamed from: e */
    public final int m25609e() {
        return this.f98037d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45093mS1) {
            C45093mS1 c45093mS1 = (C45093mS1) obj;
            return Intrinsics.areEqual(this.f98034a, c45093mS1.f98034a) && Intrinsics.areEqual(this.f98035b, c45093mS1.f98035b) && Intrinsics.areEqual(this.f98036c, c45093mS1.f98036c) && this.f98037d == c45093mS1.f98037d;
        }
        return false;
    }

    /* renamed from: f */
    public final List<BrainSwapRecord> m25608f() {
        return this.f98036c;
    }

    /* renamed from: g */
    public final void m25607g(Throwable th) {
        this.f98038e = th;
    }

    public int hashCode() {
        return (((((this.f98034a.hashCode() * 31) + this.f98035b.hashCode()) * 31) + this.f98036c.hashCode()) * 31) + Integer.hashCode(this.f98037d);
    }

    public String toString() {
        List<IdToolOption> list = this.f98034a;
        List<IdToolOption> list2 = this.f98035b;
        List<BrainSwapRecord> list3 = this.f98036c;
        int i = this.f98037d;
        return "IdToolsLandingState(associateOptions=" + list + ", dissociateOptions=" + list2 + ", records=" + list3 + ", progress=" + i + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45093mS1(List<? extends IdToolOption> associateOptions, List<? extends IdToolOption> dissociateOptions, List<BrainSwapRecord> records, int i) {
        Intrinsics.checkNotNullParameter(associateOptions, "associateOptions");
        Intrinsics.checkNotNullParameter(dissociateOptions, "dissociateOptions");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f98034a = associateOptions;
        this.f98035b = dissociateOptions;
        this.f98036c = records;
        this.f98037d = i;
    }

    public /* synthetic */ C45093mS1(List list, List list2, List list3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i2 & 8) != 0 ? 0 : i);
    }
}
