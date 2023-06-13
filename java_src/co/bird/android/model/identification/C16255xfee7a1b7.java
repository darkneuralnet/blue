package co.bird.android.model.identification;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.model.identification.IdentificationManualEntryFormData$isValid$allowedIssuingAuthorities$2 */
/* loaded from: classes4.dex */
public final class C16255xfee7a1b7 extends Lambda implements Function0<List<? extends String>> {
    final /* synthetic */ IdentificationAcceptableManualEntry $acceptableManualEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16255xfee7a1b7(IdentificationAcceptableManualEntry identificationAcceptableManualEntry) {
        super(0);
        this.$acceptableManualEntry = identificationAcceptableManualEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return this.$acceptableManualEntry.getRequireIssuingAuthority();
    }
}
