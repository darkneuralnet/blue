package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;", "La24;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "<init>", "()V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InstitutionPickerStates implements InterfaceC37721a24<InstitutionPickerState> {
    public static final Companion Companion = new Companion(null);
    private final Sequence<InstitutionPickerState> values;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;", "", "()V", "initialLoading", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "institutionResponse", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "noSearchMode", "payload", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "searchModeFailed", "searchModeNoQuery", "searchModeNoResults", "searchModeSearchingInstitutions", "searchModeWithResults", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final InstitutionResponse institutionResponse() {
            List listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FinancialConnectionsInstitution[]{new FinancialConnectionsInstitution(false, "1", false, "Very very long institution 1", null, null, null, "institution 1 url"), new FinancialConnectionsInstitution(false, "2", false, "Institution 2", null, null, null, "Institution 2 url"), new FinancialConnectionsInstitution(false, "3", false, "Institution 3", null, null, null, "Institution 3 url")});
            return new InstitutionResponse(listOf);
        }

        private final InstitutionPickerState.Payload payload() {
            return new InstitutionPickerState.Payload(institutionResponse().getData(), true, false);
        }

        public final InstitutionPickerState initialLoading() {
            return new InstitutionPickerState(false, true, new C31786At2(null, 1, null), C34454Md6.f23316e);
        }

        public final InstitutionPickerState noSearchMode() {
            return new InstitutionPickerState(false, false, new C51034wT5(payload()), new C51034wT5(institutionResponse()), 2, null);
        }

        public final InstitutionPickerState searchModeFailed() {
            return new InstitutionPickerState(true, false, new C51034wT5(payload()), new C32163Cj1(new Exception("Something went wrong"), null, 2, null), 2, null);
        }

        public final InstitutionPickerState searchModeNoQuery() {
            return new InstitutionPickerState(true, false, new C51034wT5(payload()), new C51034wT5(institutionResponse()), 2, null);
        }

        public final InstitutionPickerState searchModeNoResults() {
            List emptyList;
            C51034wT5 c51034wT5 = new C51034wT5(payload());
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new InstitutionPickerState(false, false, c51034wT5, new C51034wT5(new InstitutionResponse(emptyList)), 2, null);
        }

        public final InstitutionPickerState searchModeSearchingInstitutions() {
            return new InstitutionPickerState(true, false, new C51034wT5(payload()), new C31786At2(null, 1, null), 2, null);
        }

        public final InstitutionPickerState searchModeWithResults() {
            return new InstitutionPickerState(true, false, new C51034wT5(payload()), new C51034wT5(institutionResponse()), 2, null);
        }

        private Companion() {
        }
    }

    public InstitutionPickerStates() {
        Sequence<InstitutionPickerState> sequenceOf;
        Companion companion = Companion;
        sequenceOf = SequencesKt__SequencesKt.sequenceOf(companion.searchModeSearchingInstitutions(), companion.searchModeWithResults(), companion.searchModeNoResults(), companion.searchModeNoQuery(), companion.noSearchMode());
        this.values = sequenceOf;
    }

    @Override // p000.InterfaceC37721a24
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p000.InterfaceC37721a24
    public Sequence<InstitutionPickerState> getValues() {
        return this.values;
    }
}
