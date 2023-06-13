package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.ConsentPaneBody;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNoticeBody;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsBody;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentStates;", "La24;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "", "getCount", "()I", "count", "<init>", "()V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConsentStates implements InterfaceC37721a24<ConsentState> {
    public static final Companion Companion = new Companion(null);
    private final Sequence<ConsentState> values;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;", "", "()V", "canonical", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "manualEntryPlusMicrodeposits", "sampleConsent", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "withConnectedAccountLogos", "withNoLogos", "withPlatformLogos", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConsentState canonical() {
            List emptyList;
            ConsentPane copy$default = ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new ConsentState(new C51034wT5(new ConsentState.Payload(copy$default, emptyList, false)), null, null, null, null, 30, null);
        }

        public final ConsentState manualEntryPlusMicrodeposits() {
            List emptyList;
            ConsentPane sampleConsent = sampleConsent();
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new ConsentState(new C51034wT5(new ConsentState.Payload(sampleConsent, emptyList, false)), null, null, null, null, 30, null);
        }

        public final ConsentPane sampleConsent() {
            List listOf;
            List listOf2;
            List listOf3;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet("Stripe will allow Goldilocks to access only the data requested", new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested"), new Bullet("Stripe will allow Goldilocks to access only the data requested", new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested"), new Bullet("Stripe will allow Goldilocks to access only the data requested", new Image("https://www.cdn.stripe.com/12321312321.png"), "Stripe will allow Goldilocks to access only the data requested")});
            ConsentPaneBody consentPaneBody = new ConsentPaneBody(listOf);
            listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet("Account number, routing number, account type, account nickname.", new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details"), new Bullet("Account number, routing number, account type, account nickname.", new Image("https://www.cdn.stripe.com/12321312321.png"), "Account details")});
            DataAccessNotice dataAccessNotice = new DataAccessNotice(new DataAccessNoticeBody(listOf2), "Goldilocks works with Stripe to link your accounts", "Goldilocks will use your account and routing number, balances and transactions:", "OK", "Learn more about data access", "Connected account placeholder");
            listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet("To improve our services", (Image) null, (String) null, 6, (DefaultConstructorMarker) null), new Bullet("To manage fraud and loss risk of transactions", (Image) null, (String) null, 6, (DefaultConstructorMarker) null)});
            return new ConsentPane("Manually verify instead (takes 1-2 business days)", "Stripe will allow Goldilocks to access only the data requested. We never share your login details with them.", consentPaneBody, "Agree", dataAccessNotice, new LegalDetailsNotice(new LegalDetailsBody(listOf3), "Stripe uses your account data as described in the Terms, including:", "OK", "Learn more"), "Goldilocks works with Stripe to link your accounts");
        }

        public final ConsentState withConnectedAccountLogos() {
            List listOf;
            ConsentPane copy$default = ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com", "www.logo3.com"});
            return new ConsentState(new C51034wT5(new ConsentState.Payload(copy$default, listOf, true)), null, null, null, null, 30, null);
        }

        public final ConsentState withNoLogos() {
            List emptyList;
            ConsentPane copy$default = ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new ConsentState(new C51034wT5(new ConsentState.Payload(copy$default, emptyList, true)), null, null, null, null, 30, null);
        }

        public final ConsentState withPlatformLogos() {
            List listOf;
            ConsentPane copy$default = ConsentPane.copy$default(sampleConsent(), null, null, null, null, null, null, null, 125, null);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"www.logo1.com", "www.logo2.com"});
            return new ConsentState(new C51034wT5(new ConsentState.Payload(copy$default, listOf, true)), null, null, null, null, 30, null);
        }

        private Companion() {
        }
    }

    public ConsentStates() {
        Sequence<ConsentState> sequenceOf;
        Companion companion = Companion;
        sequenceOf = SequencesKt__SequencesKt.sequenceOf(companion.canonical(), companion.manualEntryPlusMicrodeposits(), companion.withPlatformLogos());
        this.values = sequenceOf;
    }

    @Override // p000.InterfaceC37721a24
    public int getCount() {
        return super.getCount();
    }

    @Override // p000.InterfaceC37721a24
    public Sequence<ConsentState> getValues() {
        return this.values;
    }
}
