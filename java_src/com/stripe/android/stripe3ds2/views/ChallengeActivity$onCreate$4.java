package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "cres", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity$onCreate$4 extends Lambda implements Function1<ChallengeResponseData, Unit> {
    final /* synthetic */ Ref.ObjectRef<String> $uiTypeCode;
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$onCreate$4(ChallengeActivity challengeActivity, Ref.ObjectRef<String> objectRef) {
        super(1);
        this.this$0 = challengeActivity;
        this.$uiTypeCode = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChallengeResponseData challengeResponseData) {
        invoke2(challengeResponseData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChallengeResponseData challengeResponseData) {
        this.this$0.dismissDialog();
        if (challengeResponseData != null) {
            this.this$0.startFragment(challengeResponseData);
            Ref.ObjectRef<String> objectRef = this.$uiTypeCode;
            UiType uiType = challengeResponseData.getUiType();
            ?? code = uiType != null ? uiType.getCode() : 0;
            if (code == 0) {
                code = "";
            }
            objectRef.element = code;
        }
    }
}
