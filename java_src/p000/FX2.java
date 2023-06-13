package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LFX2;", "LAN2;", "S", "", "newState", "", C17296a.f69688o, "(LAN2;)V", "LAN2;", "getInitialState", "()LAN2;", "initialState", "LFX2$a;", "b", "LFX2$a;", "previousState", "<init>", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: FX2 */
/* loaded from: classes2.dex */
public final class FX2<S extends AN2> {

    /* renamed from: a */
    public final S f9596a;

    /* renamed from: b */
    public C2345a<S> f9597b;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LFX2$a;", "LAN2;", "S", "", "", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LAN2;", "getState", "()LAN2;", TransferTable.COLUMN_STATE, "b", "I", "originalHashCode", "<init>", "(LAN2;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: FX2$a */
    /* loaded from: classes2.dex */
    public static final class C2345a<S extends AN2> {

        /* renamed from: a */
        public final S f9598a;

        /* renamed from: b */
        public final int f9599b;

        public C2345a(S state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f9598a = state;
            this.f9599b = hashCode();
        }

        /* renamed from: a */
        public final void m107039a() {
            boolean z;
            if (this.f9599b == hashCode()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            throw new IllegalArgumentException((this.f9598a.getClass().getSimpleName() + " was mutated. State classes should be immutable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2345a) && Intrinsics.areEqual(this.f9598a, ((C2345a) obj).f9598a);
        }

        public int hashCode() {
            return this.f9598a.hashCode();
        }

        public String toString() {
            return "StateWrapper(state=" + this.f9598a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public FX2(S initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f9596a = initialState;
        this.f9597b = new C2345a<>(initialState);
    }

    /* renamed from: a */
    public final void m107040a(S newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f9597b.m107039a();
        this.f9597b = new C2345a<>(newState);
    }
}
