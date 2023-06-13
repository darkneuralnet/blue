package com.stripe.android.financialconnections.features.reset;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/reset/ResetState;", "LAN2;", "Ldp;", "", "component1", "payload", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ldp;", "getPayload", "()Ldp;", "<init>", "(Ldp;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ResetState implements AN2 {
    private final AbstractC19862dp<Unit> payload;

    public ResetState() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetState copy$default(ResetState resetState, AbstractC19862dp abstractC19862dp, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC19862dp = resetState.payload;
        }
        return resetState.copy(abstractC19862dp);
    }

    public final AbstractC19862dp<Unit> component1() {
        return this.payload;
    }

    public final ResetState copy(AbstractC19862dp<Unit> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new ResetState(payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetState) && Intrinsics.areEqual(this.payload, ((ResetState) obj).payload);
    }

    public final AbstractC19862dp<Unit> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        AbstractC19862dp<Unit> abstractC19862dp = this.payload;
        return "ResetState(payload=" + abstractC19862dp + ")";
    }

    public ResetState(AbstractC19862dp<Unit> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public /* synthetic */ ResetState(AbstractC19862dp abstractC19862dp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp);
    }
}
