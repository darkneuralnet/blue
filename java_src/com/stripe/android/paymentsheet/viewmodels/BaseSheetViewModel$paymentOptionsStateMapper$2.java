package com.stripe.android.paymentsheet.viewmodels;

import android.app.Application;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.GooglePayState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BaseSheetViewModel$paymentOptionsStateMapper$2 extends Lambda implements Function0<PaymentOptionsStateMapper> {
    final /* synthetic */ Application $application;
    final /* synthetic */ BaseSheetViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lcom/stripe/android/model/PaymentMethodCode;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$paymentOptionsStateMapper$2$1 */
    /* loaded from: classes7.dex */
    public static final class C193351 extends Lambda implements Function1<String, String> {
        final /* synthetic */ Application $application;
        final /* synthetic */ BaseSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193351(BaseSheetViewModel baseSheetViewModel, Application application) {
            super(1);
            this.this$0 = baseSheetViewModel;
            this.$application = application;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            LpmRepository.SupportedPaymentMethod fromCode = this.this$0.getLpmRepository().fromCode(str);
            String string = fromCode != null ? this.$application.getString(fromCode.getDisplayNameResource()) : null;
            return string == null ? "" : string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$paymentOptionsStateMapper$2(BaseSheetViewModel baseSheetViewModel, Application application) {
        super(0);
        this.this$0 = baseSheetViewModel;
        this.$application = application;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentOptionsStateMapper invoke() {
        InterfaceC49220tP5 interfaceC49220tP5;
        InterfaceC49220tP5<List<PaymentMethod>> paymentMethods$paymentsheet_release = this.this$0.getPaymentMethods$paymentsheet_release();
        InterfaceC49220tP5<PaymentSelection> selection$paymentsheet_release = this.this$0.getSelection$paymentsheet_release();
        InterfaceC49220tP5<GooglePayState> googlePayState$paymentsheet_release = this.this$0.getGooglePayState$paymentsheet_release();
        InterfaceC49220tP5<Boolean> isLinkEnabled = this.this$0.getLinkHandler().isLinkEnabled();
        interfaceC49220tP5 = this.this$0.savedSelection;
        BaseSheetViewModel baseSheetViewModel = this.this$0;
        return new PaymentOptionsStateMapper(paymentMethods$paymentsheet_release, googlePayState$paymentsheet_release, isLinkEnabled, interfaceC49220tP5, selection$paymentsheet_release, new C193351(baseSheetViewModel, this.$application), baseSheetViewModel instanceof PaymentOptionsViewModel);
    }
}
