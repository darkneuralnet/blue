package co.bird.android.model.identification;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDetectedStringsResult;", "", "()V", "isSatisfied", "", "()Z", "isSatisfied$delegate", "Lkotlin/Lazy;", "Lco/bird/android/model/identification/IdentificationDetectedStringsMlKitErrorResult;", "Lco/bird/android/model/identification/IdentificationDetectedStringsNoLanguageSupportResult;", "Lco/bird/android/model/identification/IdentificationDetectedStringsNotSatisfiedResult;", "Lco/bird/android/model/identification/IdentificationDetectedStringsSatisfiedResult;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class IdentificationDetectedStringsResult {
    private final Lazy isSatisfied$delegate;

    public /* synthetic */ IdentificationDetectedStringsResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isSatisfied() {
        return ((Boolean) this.isSatisfied$delegate.getValue()).booleanValue();
    }

    private IdentificationDetectedStringsResult() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new IdentificationDetectedStringsResult$isSatisfied$2(this));
        this.isSatisfied$delegate = lazy;
    }
}
