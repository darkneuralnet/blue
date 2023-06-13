package com.stripe.android.paymentsheet.forms;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0014\u0010\u0014\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0014\u0010\u0016\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0014\u0010\u0018\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0014\u0010\u001a\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0014\u0010\u001c\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0003\"\u0014\u0010\u001e\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0003\"\u0014\u0010 \u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0003\"\u0014\u0010\"\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0003\"\u0014\u0010$\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0003\"\u0014\u0010&\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0003¨\u0006("}, m28432d2 = {"AffirmRequirement", "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "getAffirmRequirement", "()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "AfterpayClearpayRequirement", "getAfterpayClearpayRequirement", "AuBecsDebitRequirement", "getAuBecsDebitRequirement", "BancontactRequirement", "getBancontactRequirement", "CardRequirement", "getCardRequirement", "CashAppPayRequirement", "getCashAppPayRequirement", "EpsRequirement", "getEpsRequirement", "GiropayRequirement", "getGiropayRequirement", "IdealRequirement", "getIdealRequirement", "KlarnaRequirement", "getKlarnaRequirement", "MobilePayRequirement", "getMobilePayRequirement", "P24Requirement", "getP24Requirement", "PaypalRequirement", "getPaypalRequirement", "RevolutPayRequirement", "getRevolutPayRequirement", "SepaDebitRequirement", "getSepaDebitRequirement", "SofortRequirement", "getSofortRequirement", "USBankAccountRequirement", "getUSBankAccountRequirement", "UpiRequirement", "getUpiRequirement", "ZipRequirement", "getZipRequirement", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodRequirementsKt {
    private static final PaymentMethodRequirements AffirmRequirement;
    private static final PaymentMethodRequirements AfterpayClearpayRequirement;
    private static final PaymentMethodRequirements AuBecsDebitRequirement;
    private static final PaymentMethodRequirements BancontactRequirement;
    private static final PaymentMethodRequirements CardRequirement;
    private static final PaymentMethodRequirements CashAppPayRequirement;
    private static final PaymentMethodRequirements EpsRequirement;
    private static final PaymentMethodRequirements GiropayRequirement;
    private static final PaymentMethodRequirements IdealRequirement;
    private static final PaymentMethodRequirements KlarnaRequirement;
    private static final PaymentMethodRequirements MobilePayRequirement;
    private static final PaymentMethodRequirements P24Requirement;
    private static final PaymentMethodRequirements PaypalRequirement;
    private static final PaymentMethodRequirements RevolutPayRequirement;
    private static final PaymentMethodRequirements SepaDebitRequirement;
    private static final PaymentMethodRequirements SofortRequirement;
    private static final PaymentMethodRequirements USBankAccountRequirement;
    private static final PaymentMethodRequirements UpiRequirement;
    private static final PaymentMethodRequirements ZipRequirement;

    static {
        Set emptySet;
        Set emptySet2;
        Set emptySet3;
        Set of;
        Set emptySet4;
        Set of2;
        Set emptySet5;
        Set emptySet6;
        Set emptySet7;
        Set of3;
        Set emptySet8;
        Set emptySet9;
        Set emptySet10;
        Set of4;
        Set emptySet11;
        Set emptySet12;
        Set of5;
        Set emptySet13;
        Set of6;
        Set of7;
        Set emptySet14;
        Set emptySet15;
        emptySet = SetsKt__SetsKt.emptySet();
        emptySet2 = SetsKt__SetsKt.emptySet();
        Boolean bool = Boolean.TRUE;
        CardRequirement = new PaymentMethodRequirements(emptySet, emptySet2, bool);
        emptySet3 = SetsKt__SetsKt.emptySet();
        Boolean bool2 = Boolean.FALSE;
        BancontactRequirement = new PaymentMethodRequirements(emptySet3, null, bool2);
        Delayed delayed = Delayed.INSTANCE;
        of = SetsKt__SetsJVMKt.setOf(delayed);
        SofortRequirement = new PaymentMethodRequirements(of, null, bool2);
        emptySet4 = SetsKt__SetsKt.emptySet();
        IdealRequirement = new PaymentMethodRequirements(emptySet4, null, bool2);
        of2 = SetsKt__SetsJVMKt.setOf(delayed);
        SepaDebitRequirement = new PaymentMethodRequirements(of2, null, bool2);
        emptySet5 = SetsKt__SetsKt.emptySet();
        EpsRequirement = new PaymentMethodRequirements(emptySet5, null, null);
        emptySet6 = SetsKt__SetsKt.emptySet();
        P24Requirement = new PaymentMethodRequirements(emptySet6, null, null);
        emptySet7 = SetsKt__SetsKt.emptySet();
        GiropayRequirement = new PaymentMethodRequirements(emptySet7, null, null);
        ShippingAddress shippingAddress = ShippingAddress.INSTANCE;
        of3 = SetsKt__SetsJVMKt.setOf(shippingAddress);
        AfterpayClearpayRequirement = new PaymentMethodRequirements(of3, null, null);
        emptySet8 = SetsKt__SetsKt.emptySet();
        KlarnaRequirement = new PaymentMethodRequirements(emptySet8, null, null);
        emptySet9 = SetsKt__SetsKt.emptySet();
        emptySet10 = SetsKt__SetsKt.emptySet();
        PaypalRequirement = new PaymentMethodRequirements(emptySet9, emptySet10, bool);
        of4 = SetsKt__SetsJVMKt.setOf(shippingAddress);
        AffirmRequirement = new PaymentMethodRequirements(of4, null, null);
        emptySet11 = SetsKt__SetsKt.emptySet();
        RevolutPayRequirement = new PaymentMethodRequirements(emptySet11, null, null);
        emptySet12 = SetsKt__SetsKt.emptySet();
        MobilePayRequirement = new PaymentMethodRequirements(emptySet12, null, null);
        of5 = SetsKt__SetsJVMKt.setOf(delayed);
        AuBecsDebitRequirement = new PaymentMethodRequirements(of5, null, null);
        emptySet13 = SetsKt__SetsKt.emptySet();
        ZipRequirement = new PaymentMethodRequirements(emptySet13, null, null);
        of6 = SetsKt__SetsJVMKt.setOf(delayed);
        of7 = SetsKt__SetsJVMKt.setOf(delayed);
        USBankAccountRequirement = new PaymentMethodRequirements(of6, of7, bool);
        emptySet14 = SetsKt__SetsKt.emptySet();
        UpiRequirement = new PaymentMethodRequirements(emptySet14, null, null);
        emptySet15 = SetsKt__SetsKt.emptySet();
        CashAppPayRequirement = new PaymentMethodRequirements(emptySet15, null, bool2);
    }

    public static final PaymentMethodRequirements getAffirmRequirement() {
        return AffirmRequirement;
    }

    public static final PaymentMethodRequirements getAfterpayClearpayRequirement() {
        return AfterpayClearpayRequirement;
    }

    public static final PaymentMethodRequirements getAuBecsDebitRequirement() {
        return AuBecsDebitRequirement;
    }

    public static final PaymentMethodRequirements getBancontactRequirement() {
        return BancontactRequirement;
    }

    public static final PaymentMethodRequirements getCardRequirement() {
        return CardRequirement;
    }

    public static final PaymentMethodRequirements getCashAppPayRequirement() {
        return CashAppPayRequirement;
    }

    public static final PaymentMethodRequirements getEpsRequirement() {
        return EpsRequirement;
    }

    public static final PaymentMethodRequirements getGiropayRequirement() {
        return GiropayRequirement;
    }

    public static final PaymentMethodRequirements getIdealRequirement() {
        return IdealRequirement;
    }

    public static final PaymentMethodRequirements getKlarnaRequirement() {
        return KlarnaRequirement;
    }

    public static final PaymentMethodRequirements getMobilePayRequirement() {
        return MobilePayRequirement;
    }

    public static final PaymentMethodRequirements getP24Requirement() {
        return P24Requirement;
    }

    public static final PaymentMethodRequirements getPaypalRequirement() {
        return PaypalRequirement;
    }

    public static final PaymentMethodRequirements getRevolutPayRequirement() {
        return RevolutPayRequirement;
    }

    public static final PaymentMethodRequirements getSepaDebitRequirement() {
        return SepaDebitRequirement;
    }

    public static final PaymentMethodRequirements getSofortRequirement() {
        return SofortRequirement;
    }

    public static final PaymentMethodRequirements getUSBankAccountRequirement() {
        return USBankAccountRequirement;
    }

    public static final PaymentMethodRequirements getUpiRequirement() {
        return UpiRequirement;
    }

    public static final PaymentMethodRequirements getZipRequirement() {
        return ZipRequirement;
    }
}
