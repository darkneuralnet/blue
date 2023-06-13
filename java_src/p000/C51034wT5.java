package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LwT5;", "T", "Ldp;", C17296a.f69688o, "()Ljava/lang/Object;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "e", "Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: wT5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51034wT5<T> extends AbstractC19862dp<T> {

    /* renamed from: e */
    public final T f116030e;

    public C51034wT5(T t) {
        super(true, false, t, null);
        this.f116030e = t;
    }

    @Override // p000.AbstractC19862dp
    /* renamed from: a */
    public T mo6788a() {
        return this.f116030e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51034wT5) && Intrinsics.areEqual(this.f116030e, ((C51034wT5) obj).f116030e);
    }

    public int hashCode() {
        T t = this.f116030e;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "Success(value=" + this.f116030e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
