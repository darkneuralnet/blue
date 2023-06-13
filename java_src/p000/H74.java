package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\b\u0086\b\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001j\u0002`\bBK\u0012B\b\u0002\u0010\u0017\u001a<\u00128\u00126\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001j\u0002`\b0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\n\u001a\u00020\tJ\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002JE\u0010\r\u001a\u00020\u00072:\u0010\f\u001a6\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001j\u0002`\bH\u0086\u0002J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003RN\u0010\u0017\u001a<\u00128\u00126\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001j\u0002`\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LH74;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "readBytes", "totalBytes", "", "Lcom/github/kittinunf/fuel/core/ProgressCallback;", "", "b", C17296a.f69688o, "handler", "c", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "", "Ljava/util/Collection;", "handlers", "<init>", "(Ljava/util/Collection;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: H74 */
/* loaded from: classes5.dex */
public final class H74 implements Function2<Long, Long, Unit> {

    /* renamed from: b */
    public final Collection<Function2<Long, Long, Unit>> f12871b;

    public H74() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public void m104386a(long j, long j2) {
        Iterator<T> it = this.f12871b.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    public final boolean m104385b() {
        return this.f12871b.isEmpty();
    }

    /* renamed from: c */
    public final void m104384c(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f12871b.add(handler);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof H74) && Intrinsics.areEqual(this.f12871b, ((H74) obj).f12871b);
        }
        return true;
    }

    public int hashCode() {
        Collection<Function2<Long, Long, Unit>> collection = this.f12871b;
        if (collection != null) {
            return collection.hashCode();
        }
        return 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
        m104386a(l.longValue(), l2.longValue());
        return Unit.INSTANCE;
    }

    public String toString() {
        return "Progress(handlers=" + this.f12871b + ")";
    }

    public H74(Collection<Function2<Long, Long, Unit>> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f12871b = handlers;
    }

    public /* synthetic */ H74(Collection collection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : collection);
    }
}
