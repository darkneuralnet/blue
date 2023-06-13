package co.bird.android.model.identification;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDetectedStringsResult$isSatisfied$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ IdentificationDetectedStringsResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationDetectedStringsResult$isSatisfied$2(IdentificationDetectedStringsResult identificationDetectedStringsResult) {
        super(0);
        this.this$0 = identificationDetectedStringsResult;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        IdentificationDetectedStringsResult identificationDetectedStringsResult = this.this$0;
        boolean z = true;
        if (!(Intrinsics.areEqual(identificationDetectedStringsResult, IdentificationDetectedStringsNoLanguageSupportResult.INSTANCE) ? true : identificationDetectedStringsResult instanceof IdentificationDetectedStringsSatisfiedResult ? true : Intrinsics.areEqual(identificationDetectedStringsResult, IdentificationDetectedStringsMlKitErrorResult.INSTANCE))) {
            if (!Intrinsics.areEqual(identificationDetectedStringsResult, IdentificationDetectedStringsNotSatisfiedResult.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
