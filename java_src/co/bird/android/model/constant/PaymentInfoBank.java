package co.bird.android.model.constant;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentInfoBank;", "", "displayName", "", "stripeBankCode", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getStripeBankCode", "ABN_AMRO", "ASN_BANK", "BUNQ", "HANDELSBANKEN", "ING", "KNAB", "RABOBANK", "REVOLUT", "REGIOBANK", "SNS_BANK", "TRIODOS_BANK", "VAN_LANSCHOT", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PaymentInfoBank {
    ABN_AMRO("ABN AMRO", "abn_amro"),
    ASN_BANK("ASN Bank", "asn_bank"),
    BUNQ("Bunq", "bunq"),
    HANDELSBANKEN("Handelsbanken", "handelsbanken"),
    ING("ING", "ing"),
    KNAB("Knab", "knab"),
    RABOBANK("Rabobank", "rabobank"),
    REVOLUT("Revolut", "revolut"),
    REGIOBANK("RegioBank", "regiobank"),
    SNS_BANK("SNS Bank (De Volksbank)", "sns_bank"),
    TRIODOS_BANK("Triodos Bank", "triodos_bank"),
    VAN_LANSCHOT("Van Lanschot", "van_lanschot");
    
    private final String displayName;
    private final String stripeBankCode;

    PaymentInfoBank(String str, String str2) {
        this.displayName = str;
        this.stripeBankCode = str2;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getStripeBankCode() {
        return this.stripeBankCode;
    }
}
