package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0013\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0016\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LAt2;", "T", "Ldp;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "e", "Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: At2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31786At2<T> extends AbstractC19862dp<T> {

    /* renamed from: e */
    public final T f1308e;

    public C31786At2() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31786At2) && Intrinsics.areEqual(this.f1308e, ((C31786At2) obj).f1308e);
    }

    public int hashCode() {
        T t = this.f1308e;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "Loading(value=" + this.f1308e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C31786At2(T t) {
        super(false, false, t, null);
        this.f1308e = t;
    }

    public /* synthetic */ C31786At2(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
