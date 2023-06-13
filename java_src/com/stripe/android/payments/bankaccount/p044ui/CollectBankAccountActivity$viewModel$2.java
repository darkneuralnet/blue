package com.stripe.android.payments.bankaccount.p044ui;

import androidx.lifecycle.C11759u;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$viewModel$2 */
/* loaded from: classes7.dex */
public final class CollectBankAccountActivity$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$viewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C191081 extends Lambda implements Function0<CollectBankAccountContract.Args> {
        final /* synthetic */ CollectBankAccountActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191081(CollectBankAccountActivity collectBankAccountActivity) {
            super(0);
            this.this$0 = collectBankAccountActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CollectBankAccountContract.Args invoke() {
            CollectBankAccountContract.Args starterArgs;
            starterArgs = this.this$0.getStarterArgs();
            if (starterArgs != null) {
                return starterArgs;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$viewModel$2(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new CollectBankAccountViewModel.Factory(new C191081(this.this$0));
    }
}
