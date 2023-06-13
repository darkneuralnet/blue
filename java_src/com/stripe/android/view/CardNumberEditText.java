package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.CardNumberEditText;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001kBQ\b\u0000\u0012\u0006\u0010b\u001a\u00020a\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c\u0012\b\b\u0002\u0010e\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bf\u0010gB'\b\u0017\u0012\u0006\u0010b\u001a\u00020a\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c\u0012\b\b\u0002\u0010e\u001a\u00020\u0005¢\u0006\u0004\bf\u0010hB9\b\u0012\u0012\u0006\u0010b\u001a\u00020a\u0012\b\u0010d\u001a\u0004\u0018\u00010c\u0012\u0006\u0010e\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00020]08¢\u0006\u0004\bf\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0019\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R0\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@@X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u0010\u0012\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00102\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0002008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR \u0010E\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010\u0012\u001a\u0004\bG\u0010HR.\u0010J\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u00103\u001a\u0004\bK\u00105\"\u0004\bL\u00107R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0014\u0010\r\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010QR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006l"}, m28432d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "onAttachedToWindow", "onDetachedFromWindow", "", "maxLength", "updateLengthFilter$payments_core_release", "(I)V", "updateLengthFilter", "newFormattedLength", "start", "addedDigits", "panLength", "calculateCursorPosition$payments_core_release", "(IIII)I", "calculateCursorPosition", "onCardMetadataLoadedTooSlow$payments_core_release", "()V", "onCardMetadataLoadedTooSlow", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "setWorkContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/model/CardBrand;", "value", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "setCardBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;)V", "getCardBrand$annotations", "Lkotlin/Function1;", "callback", "brandChangeCallback", "Lkotlin/jvm/functions/Function1;", "getBrandChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setBrandChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "completionCallback", "Lkotlin/jvm/functions/Function0;", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "", "<set-?>", "isCardNumberValid", "Z", "()Z", "Lcom/stripe/android/cards/CardAccountRangeService;", "accountRangeService", "Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService", "()Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService$annotations", "isLoadingCallback", "isLoadingCallback$payments_core_release", "setLoadingCallback$payments_core_release", "Lzh2;", "loadingJob", "Lzh2;", "getFormattedPanLength", "()I", "formattedPanLength", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "getUnvalidatedCardNumber", "()Lcom/stripe/android/cards/CardNumber$Unvalidated;", "unvalidatedCardNumber", "isValid", "getPanLength$payments_core_release", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "validatedCardNumber", "", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "publishableKeySupplier", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V", "CardNumberTextWatcher", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardNumberEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,367:1\n1774#2,4:368\n1747#2,3:372\n*S KotlinDebug\n*F\n+ 1 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n*L\n220#1:368,4\n224#1:372,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CardNumberEditText extends StripeEditText {
    public static final int $stable = 8;
    private final CardAccountRangeService accountRangeService;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private /* synthetic */ Function1<? super CardBrand, Unit> brandChangeCallback;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private CardBrand cardBrand;
    private /* synthetic */ Function0<Unit> completionCallback;
    private boolean isCardNumberValid;
    private /* synthetic */ Function1<? super Boolean, Unit> isLoadingCallback;
    private InterfaceC52943zh2 loadingJob;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardNumberEditText$1 */
    /* loaded from: classes7.dex */
    public static final class C195141 extends Lambda implements Function0<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195141(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getPublishableKey();
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H\u0002J*\u0010\"\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;", "Lcom/stripe/android/view/StripeTextWatcher;", "(Lcom/stripe/android/view/CardNumberEditText;)V", "beforeCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "digitsAdded", "", "getDigitsAdded", "()Z", "formattedNumber", "", "isPastedPan", "latestChangeStart", "", "latestInsertionSize", "newCursorPosition", "Ljava/lang/Integer;", "shouldUpdateAfterChange", "getShouldUpdateAfterChange", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "isComplete", "wasCardNumberValid", "startPosition", "previousCount", "currentCount", "cardNumber", "onTextChanged", "before", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public final class CardNumberTextWatcher extends StripeTextWatcher {
        private CardNumber.Unvalidated beforeCardNumber;
        private String formattedNumber;
        private boolean isPastedPan;
        private int latestChangeStart;
        private int latestInsertionSize;
        private Integer newCursorPosition;

        public CardNumberTextWatcher() {
            CardNumberEditText.this = r1;
            this.beforeCardNumber = r1.getUnvalidatedCardNumber();
        }

        private final boolean getDigitsAdded() {
            return CardNumberEditText.this.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean getShouldUpdateAfterChange() {
            return (getDigitsAdded() || !CardNumberEditText.this.isLastKeyDelete$payments_core_release()) && this.formattedNumber != null;
        }

        private final boolean isComplete(boolean z) {
            if (!z && (CardNumberEditText.this.getUnvalidatedCardNumber().isMaxLength() || (CardNumberEditText.this.isValid() && CardNumberEditText.this.getAccountRangeService().getAccountRange() != null))) {
                return true;
            }
            return false;
        }

        private final boolean isPastedPan(int i, int i2, int i3, CardNumber.Unvalidated unvalidated) {
            return i3 > i2 && i == 0 && unvalidated.getNormalized().length() >= 14;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int coerceIn;
            if (getShouldUpdateAfterChange()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    coerceIn = RangesKt___RangesKt.coerceIn(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length());
                    cardNumberEditText.setSelection(coerceIn);
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getLength() == CardNumberEditText.this.getPanLength$payments_core_release()) {
                boolean isCardNumberValid = CardNumberEditText.this.isCardNumberValid();
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                cardNumberEditText2.isCardNumberValid = cardNumberEditText2.isValid();
                CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                cardNumberEditText3.setShouldShowError(!cardNumberEditText3.isValid());
                if (CardNumberEditText.this.getAccountRangeService().getAccountRange() == null && CardNumberEditText.this.getUnvalidatedCardNumber().isValidLuhn()) {
                    CardNumberEditText.this.onCardMetadataLoadedTooSlow$payments_core_release();
                }
                if (isComplete(isCardNumberValid)) {
                    CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
            } else if (CardNumberEditText.this.getUnvalidatedCardNumber().isPartialEntry(CardNumberEditText.this.getPanLength$payments_core_release()) && !CardNumberEditText.this.getUnvalidatedCardNumber().isPossibleCardBrand()) {
                CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
                cardNumberEditText4.isCardNumberValid = cardNumberEditText4.isValid();
                CardNumberEditText.this.setShouldShowError(true);
            } else {
                CardNumberEditText cardNumberEditText5 = CardNumberEditText.this;
                cardNumberEditText5.isCardNumberValid = cardNumberEditText5.isValid();
                CardNumberEditText.this.setShouldShowError(false);
            }
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.isPastedPan = false;
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.latestChangeStart = i;
            this.latestInsertionSize = i3;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            int panLength$payments_core_release;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(str);
            CardNumberEditText.this.getAccountRangeService().onCardNumberChanged(unvalidated);
            boolean isPastedPan = isPastedPan(i, i2, i3, unvalidated);
            this.isPastedPan = isPastedPan;
            if (isPastedPan) {
                CardNumberEditText.this.updateLengthFilter$payments_core_release(unvalidated.getFormatted(unvalidated.getLength()).length());
            }
            if (this.isPastedPan) {
                panLength$payments_core_release = unvalidated.getLength();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String formatted = unvalidated.getFormatted(panLength$payments_core_release);
            this.newCursorPosition = Integer.valueOf(cardNumberEditText.calculateCursorPosition$payments_core_release(formatted.length(), this.latestChangeStart, this.latestInsertionSize, panLength$payments_core_release));
            this.formattedNumber = formatted;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static final void _init_$lambda$1(CardNumberEditText this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z && this$0.getUnvalidatedCardNumber().isPartialEntry(this$0.getPanLength$payments_core_release())) {
            this$0.setShouldShowError(true);
        }
    }

    public static /* synthetic */ int calculateCursorPosition$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = cardNumberEditText.getPanLength$payments_core_release();
        }
        return cardNumberEditText.calculateCursorPosition$payments_core_release(i, i2, i3, i4);
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + CardNumber.Companion.getSpacePositions(getPanLength$payments_core_release()).size();
    }

    public final CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return new CardNumber.Unvalidated(getFieldText$payments_core_release());
    }

    public final boolean isValid() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    public static /* synthetic */ void updateLengthFilter$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.updateLengthFilter$payments_core_release(i);
    }

    public final /* synthetic */ int calculateCursorPosition$payments_core_release(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        Set<Integer> spacePositions = CardNumber.Companion.getSpacePositions(i4);
        boolean z3 = spacePositions instanceof Collection;
        boolean z4 = true;
        if (z3 && spacePositions.isEmpty()) {
            i5 = 0;
        } else {
            i5 = 0;
            for (Number number : spacePositions) {
                int intValue = number.intValue();
                if (i2 <= intValue && i2 + i3 >= intValue) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i5 = i5 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (!z3 || !spacePositions.isEmpty()) {
            for (Number number2 : spacePositions) {
                int intValue2 = number2.intValue();
                if (i3 == 0 && i2 == intValue2 + 1) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
        }
        z4 = false;
        int i6 = i2 + i3 + i5;
        if (z4 && i6 > 0) {
            i6--;
        }
        if (i6 <= i) {
            return i6;
        }
        return i;
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(C18606R.string.acc_label_card_number_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…l_card_number_node, text)");
        return string;
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    public final Function1<CardBrand, Unit> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final int getPanLength$payments_core_release() {
        AccountRange accountRange = this.accountRangeService.getAccountRange();
        if (accountRange != null) {
            return accountRange.getPanLength();
        }
        AccountRange first = this.accountRangeService.getStaticCardAccountRanges().first(getUnvalidatedCardNumber());
        if (first != null) {
            return first.getPanLength();
        }
        return 16;
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().validate(getPanLength$payments_core_release());
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final boolean isCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final Function1<Boolean, Unit> isLoadingCallback$payments_core_release() {
        return this.isLoadingCallback;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        InterfaceC52943zh2 m73800d;
        super.onAttachedToWindow();
        m73800d = Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new CardNumberEditText$onAttachedToWindow$1(this, null), 3, null);
        this.loadingJob = m73800d;
    }

    public final /* synthetic */ void onCardMetadataLoadedTooSlow$payments_core_release() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataLoadedTooSlow, null, null, null, null, 30, null));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.loadingJob;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.loadingJob = null;
        this.accountRangeService.cancelAccountRangeRepositoryJob();
        super.onDetachedFromWindow();
    }

    public final void setBrandChangeCallback$payments_core_release(Function1<? super CardBrand, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    public final void setCardBrand$payments_core_release(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CardBrand cardBrand = this.cardBrand;
        this.cardBrand = value;
        if (value != cardBrand) {
            this.brandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    public final void setLoadingCallback$payments_core_release(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.isLoadingCallback = function1;
    }

    public final void setWorkContext(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.workContext = coroutineContext;
    }

    public final /* synthetic */ void updateLengthFilter$payments_core_release(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i, coroutineContext, cardAccountRangeRepository, (i2 & 32) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, analyticsRequestExecutor, paymentAnalyticsRequestFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext workContext, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.workContext = workContext;
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.cardBrand = CardBrand.Unknown;
        this.brandChangeCallback = CardNumberEditText$brandChangeCallback$1.INSTANCE;
        this.completionCallback = CardNumberEditText$completionCallback$1.INSTANCE;
        this.accountRangeService = new CardAccountRangeService(cardAccountRangeRepository, this.workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.view.CardNumberEditText$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangeResult(AccountRange accountRange) {
                CardBrand cardBrand;
                CardNumberEditText.updateLengthFilter$payments_core_release$default(CardNumberEditText.this, 0, 1, null);
                CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                if (accountRange == null || (cardBrand = accountRange.getBrand()) == null) {
                    cardBrand = CardBrand.Unknown;
                }
                cardNumberEditText.setCardBrand$payments_core_release(cardBrand);
            }
        });
        this.isLoadingCallback = CardNumberEditText$isLoadingCallback$1.INSTANCE;
        setNumberOnlyInputType();
        setErrorMessage(getResources().getString(C18606R.string.invalid_card_number));
        addTextChangedListener(new CardNumberTextWatcher());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Vf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardNumberEditText._init_$lambda$1(CardNumberEditText.this, view, z);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, T41.m84377b(), new C195141(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, final Function0<String> function0) {
        this(context, attributeSet, i, coroutineContext, new DefaultCardAccountRangeRepositoryFactory(context).create(), new DefaultStaticCardAccountRanges(), new DefaultAnalyticsRequestExecutor(), new PaymentAnalyticsRequestFactory(context, new Y94() { // from class: Uf0
            @Override // p000.Y94
            public final Object get() {
                String _init_$lambda$0;
                _init_$lambda$0 = CardNumberEditText._init_$lambda$0(Function0.this);
                return _init_$lambda$0;
            }
        }));
    }
}
