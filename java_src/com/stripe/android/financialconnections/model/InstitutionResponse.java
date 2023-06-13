package com.stripe.android.financialconnections.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\u0019B+\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "component1", MessageExtension.FIELD_DATA, "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/List;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InstitutionResponse {
    public static final Companion Companion = new Companion(null);
    private final List<FinancialConnectionsInstitution> data;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<InstitutionResponse> serializer() {
            return InstitutionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InstitutionResponse(int i, List list, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, InstitutionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstitutionResponse copy$default(InstitutionResponse institutionResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = institutionResponse.data;
        }
        return institutionResponse.copy(list);
    }

    @JvmStatic
    public static final void write$Self(InstitutionResponse self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, new C27999ro(FinancialConnectionsInstitution$$serializer.INSTANCE), self.data);
    }

    public final List<FinancialConnectionsInstitution> component1() {
        return this.data;
    }

    public final InstitutionResponse copy(List<FinancialConnectionsInstitution> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new InstitutionResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstitutionResponse) && Intrinsics.areEqual(this.data, ((InstitutionResponse) obj).data);
    }

    public final List<FinancialConnectionsInstitution> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        List<FinancialConnectionsInstitution> list = this.data;
        return "InstitutionResponse(data=" + list + ")";
    }

    public InstitutionResponse(List<FinancialConnectionsInstitution> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }
}
