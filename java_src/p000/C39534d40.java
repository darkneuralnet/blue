package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.OpsBatchJobActionKind;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"Ld40;", "", "Lco/bird/api/response/OpsBatchJobActionKind;", "bulkActionKind", "", "bulkActionName", "", "checked", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/api/response/OpsBatchJobActionKind;", "b", "()Lco/bird/api/response/OpsBatchJobActionKind;", "I", "c", "()I", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "e", "(Z)V", "<init>", "(Lco/bird/api/response/OpsBatchJobActionKind;IZ)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: d40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39534d40 {

    /* renamed from: a */
    public final OpsBatchJobActionKind f76093a;

    /* renamed from: b */
    public final int f76094b;

    /* renamed from: c */
    public boolean f76095c;

    public C39534d40(OpsBatchJobActionKind bulkActionKind, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bulkActionKind, "bulkActionKind");
        this.f76093a = bulkActionKind;
        this.f76094b = i;
        this.f76095c = z;
    }

    public static /* synthetic */ C39534d40 copy$default(C39534d40 c39534d40, OpsBatchJobActionKind opsBatchJobActionKind, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            opsBatchJobActionKind = c39534d40.f76093a;
        }
        if ((i2 & 2) != 0) {
            i = c39534d40.f76094b;
        }
        if ((i2 & 4) != 0) {
            z = c39534d40.f76095c;
        }
        return c39534d40.m44650a(opsBatchJobActionKind, i, z);
    }

    /* renamed from: a */
    public final C39534d40 m44650a(OpsBatchJobActionKind bulkActionKind, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bulkActionKind, "bulkActionKind");
        return new C39534d40(bulkActionKind, i, z);
    }

    /* renamed from: b */
    public final OpsBatchJobActionKind m44649b() {
        return this.f76093a;
    }

    /* renamed from: c */
    public final int m44648c() {
        return this.f76094b;
    }

    /* renamed from: d */
    public final boolean m44647d() {
        return this.f76095c;
    }

    /* renamed from: e */
    public final void m44646e(boolean z) {
        this.f76095c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39534d40) {
            C39534d40 c39534d40 = (C39534d40) obj;
            return this.f76093a == c39534d40.f76093a && this.f76094b == c39534d40.f76094b && this.f76095c == c39534d40.f76095c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f76093a.hashCode() * 31) + Integer.hashCode(this.f76094b)) * 31;
        boolean z = this.f76095c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        OpsBatchJobActionKind opsBatchJobActionKind = this.f76093a;
        int i = this.f76094b;
        boolean z = this.f76095c;
        return "BulkActionViewModel(bulkActionKind=" + opsBatchJobActionKind + ", bulkActionName=" + i + ", checked=" + z + ")";
    }

    public /* synthetic */ C39534d40(OpsBatchJobActionKind opsBatchJobActionKind, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(opsBatchJobActionKind, i, (i2 & 4) != 0 ? false : z);
    }
}
