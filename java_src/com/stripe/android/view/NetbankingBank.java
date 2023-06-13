package com.stripe.android.view;

import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b`\b\u0080\u0001\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001gB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bf¨\u0006h"}, m28432d2 = {"Lcom/stripe/android/view/NetbankingBank;", "", "Lcom/stripe/android/view/Bank;", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "displayName", "brandIconResId", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBrandIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getDisplayName", "getId", "KotakBank", "AndraBank", "AllahabadBank", "AndhraPragathiBank", "AirtelBank", "AUSmallFinanceBank", "BankOfBahrainAndKuwait", "BankOfBaroda", "BasseinCatholicBank", "BandhanBank", "BankOfIndia", "BankofMaharashtra", "CentralBankOfIndia", "CanaraBank", "CosmosBank", "CorporationBank", "CatholicSyrianBank", "CityUnionBank", "DeutscheBank", "Digibank", "DevelopmentCreditBank", "DenaBank", "DhanlakshmiBank", "EquitasSmallFinanceBank", "ESAFBank", "FederalBank", "FincareBank", "HDFCBank", "ICICIBank", "IDBIBank", "IDFCBank", "IndusIndBank", "IndianBank", "IndianOverseasBank", "JammuKashmirBank", "JanaBank", "JanataSahakariBank", "KarnatakaBank", "KalyanJanataBank", "KalpurBank", "KarurVysyaBank", "KarnatakaVikasGrameenaBank", "LaxmiVilasBank", "MehsanaBank", "NEBank", "NKGSBBank", "OBCBank", "PunjabNationalBank", "PunjabAndSindBank", "RBLBank", "SBI", "StandardCharteredBank", "ShivalikMercantileBank", "SouthIndianBank", "SuryodayBank", "SaraswatBank", "SyndicateBank", "ThaneBharatBank", "TJSBBank", "TamilnadMercantileBank", "TamilNaduStateBank", "UBI", "UNIBank", "AxisBank", "VijayaBank", "VarachhaBank", "YesBank", "ZoroastrianBank", "KarnatakaGraminBank", "ShamraoVithalBank", "NutanNagrikBank", "BOBBank", "PunjabNationalCorpBank", "ShamraoVithalCorpBank", "BNPParibas", "RBLCorpBank", "ICICICorpBank", "IDBICorpBank", "AxisCorpBank", "AndhraCorpBank", "DhanlaxmiCorpBank", "AllahabadCorpBank", "HFDCCorpBank", "YesCorpBank", "CorporationBankCorporate", "BarclaysCorpBank", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum NetbankingBank implements Bank {
    KotakBank("162", "kotak", "Kotak Bank", null, 8, null),
    AndraBank("ADB", "andhra", "Andhra Bank", null, 8, null),
    AllahabadBank("ALB", "allahabad", "Allahabad Bank", null, 8, null),
    AndhraPragathiBank("APG", "andhra_pragathi", "Andhra Pragathi Grameena Bank", null, 8, null),
    AirtelBank("ATP", "airtel", "Airtel Payment Bank", null, 8, null),
    AUSmallFinanceBank("AUB", "au_small_finance", "AU Small Finance Bank", null, 8, null),
    BankOfBahrainAndKuwait("BBK", "bank_of_bahrain_and_kuwait", "Bank of Bahrain and Kuwait", null, 8, null),
    BankOfBaroda("BBR", "bob", "Bank of Baroda - Retail Banking", null, 8, null),
    BasseinCatholicBank("BCB", "bassein_catholic", "Bassein Catholic Co-operative Bank", null, 8, null),
    BandhanBank("BDN", "bandhan", "Bandhan Bank", null, 8, null),
    BankOfIndia("BOI", "bank_of_india", "Bank of India", null, 8, null),
    BankofMaharashtra("BOM", "bank_of_maharashtra", "Bank of Maharashtra", null, 8, null),
    CentralBankOfIndia("cbi001", "central_bank_of_india", "Central Bank of India", null, 8, null),
    CanaraBank("CNB", "canara", "Canara Bank", null, 8, null),
    CosmosBank("COB", "cosmos", "Cosmos Bank", null, 8, null),
    CorporationBank("CRP", "corporation_bank", "Corporation Bank", null, 8, null),
    CatholicSyrianBank("CSB", "catholic_syrian", "Catholic Syrian Bank", null, 8, null),
    CityUnionBank("CUB", "city_union", "City Union Bank", null, 8, null),
    DeutscheBank("DBK", "deutsche", "Deutsche Bank", null, 8, null),
    Digibank("DBS", "digibank_dbs", "Digibank by DBS", null, 8, null),
    DevelopmentCreditBank("DCB", "development_credit_bank", "Development Credit Bank", null, 8, null),
    DenaBank("DEN", "dena", "Dena Bank", null, 8, null),
    DhanlakshmiBank("DLB", "dhanlakshmi", "Dhanlakshmi Bank", null, 8, null),
    EquitasSmallFinanceBank("EQB", "equitas_small_finance", "Equitas Small Finance Bank", null, 8, null),
    ESAFBank("ESF", "esaf", "ESAF Small Finance Bank", null, 8, null),
    FederalBank("FBK", "federal_bank", "Federal Bank", null, 8, null),
    FincareBank("FNC", "fincare", "Fincare Bank", null, 8, null),
    HDFCBank("HDF", "hdfc", "HDFC Bank", null, 8, null),
    ICICIBank("ICI", "icici", "ICICI Bank", null, 8, null),
    IDBIBank("IDB", "idbi", "IDBI Bank", null, 8, null),
    IDFCBank("IDN", "idfc_first", "IDFC FIRST Bank", null, 8, null),
    IndusIndBank("IDS", "indusind", "IndusInd Bank", null, 8, null),
    IndianBank("INB", "indian_bank", "Indian Bank", null, 8, null),
    IndianOverseasBank("IOB", "indian_overseas", "Indian Overseas Bank", null, 8, null),
    JammuKashmirBank("JKB", "jnk", "Jammu & Kashmir Bank", null, 8, null),
    JanaBank("JNB", "jana_small_finance", "Jana Small Finance Bank", null, 8, null),
    JanataSahakariBank("JSB", "janata_sahakari_bank", "Janata Sahakari Bank Ltd Pune", null, 8, null),
    KarnatakaBank("KBL", "karnataka_bank", "Karnataka Bank Limited", null, 8, null),
    KalyanJanataBank("KJB", "kalyan_janata", "Kalyan Janata Sahakari Bank", null, 8, null),
    KalpurBank("KLB", "The Kalupur Commercial Co-operative Bank", "kalupur", null, 8, null),
    KarurVysyaBank("KVB", "karur_vysya", "Karur Vysya Bank", null, 8, null),
    KarnatakaVikasGrameenaBank("KVG", "kvg", "Karnataka Vikas Grameena Bank", null, 8, null),
    LaxmiVilasBank("LVR", "kvg", "Laxmi Vilas Bank", null, 8, null),
    MehsanaBank("MSB", "mehsana", "Mehsana urban Co-operative Bank", null, 8, null),
    NEBank("NEB", "ne_small_finance", "North East Small Finance Bank", null, 8, null),
    NKGSBBank("NKB", "nkgsb", "NKGSB Co-op Bank", null, 8, null),
    OBCBank("OBC", "obc", "PNB (Erstwhile-Oriental Bank of Commerce)", null, 8, null),
    PunjabNationalBank("PNB", "pnb", "Punjab National Bank - Retail Banking", null, 8, null),
    PunjabAndSindBank("PSB", "punjab_and_sind", "Punjab & Sind Bank", null, 8, null),
    RBLBank("RBL", "rbl", "RBL Bank Limited", null, 8, null),
    SBI("SBI", "sbi", "State Bank of India", null, 8, null),
    StandardCharteredBank("SCB", "scb", "Standard Chartered Bank", null, 8, null),
    ShivalikMercantileBank("SHB", "shivalik", "Shivalik Mercantile Cooperative Bank Ltd", null, 8, null),
    SouthIndianBank("SIB", "south_indian_bank", "South Indian Bank", null, 8, null),
    SuryodayBank("SRB", "suryoday", "Suryoday Small Finance Bank", null, 8, null),
    SaraswatBank("SWB", "saraswat", "Saraswat Bank", null, 8, null),
    SyndicateBank("SYD", "syndicate", "Syndicate Bank", null, 8, null),
    ThaneBharatBank("TBB", "thane_bharat", "Thane Bharat Sahakari Bank Ltd", null, 8, null),
    TJSBBank("TJB", "tjsb", "TJSB Bank", null, 8, null),
    TamilnadMercantileBank("TMB", "tamilnad_mercantile", "Tamilnad Mercantile Bank Limited", null, 8, null),
    TamilNaduStateBank("TNC", "tnc", "Tamil Nadu State Co-operative Bank", null, 8, null),
    UBI("UBI", "ubi", "Union Bank of India", null, 8, null),
    UNIBank("UNI", "united_bank_of_india", "PNB (Erstwhile-United Bank of India)", null, 8, null),
    AxisBank("UTI", "axis", "Axis Bank", null, 8, null),
    VijayaBank("VJB", "vijaya", "Vijaya Bank", null, 8, null),
    VarachhaBank("VRB", "varachha", "Varachha Co-operative Bank Limited", null, 8, null),
    YesBank("YBK", "yes", "Yes Bank", null, 8, null),
    ZoroastrianBank("ZOB", "zoroastrian", "Zoroastrian Co-operative Bank Limited", null, 8, null),
    KarnatakaGraminBank("PKB", "karnataka_gramin", "Karnataka Gramin Bank", null, 8, null),
    ShamraoVithalBank("SVC", "shamrao_vithal", "Shamrao Vithal Co-op Bank", null, 8, null),
    NutanNagrikBank("NUT", "nutan_nagrik", "Nutan Nagrik Bank", null, 8, null),
    BOBBank("BBC", "bob_corp", "Bank of Baroda - Corporate Banking", null, 8, null),
    PunjabNationalCorpBank("CPN", "pnb_corp", "Punjab National Bank - Corporate Banking", null, 8, null),
    ShamraoVithalCorpBank("SV2", "shamrao_vithal_corp", "Shamrao Vithal Co-op Bank - Corporate", null, 8, null),
    BNPParibas("BNP", "bnp_paribas", "BNP Paribas", null, 8, null),
    RBLCorpBank("RTC", "rbl_corp", "RBL Bank Limited - Corporate Banking", null, 8, null),
    ICICICorpBank("ICO", "icici_corp", "ICICI Corporate Netbanking", null, 8, null),
    IDBICorpBank("IDC", "idbi_corp", "IDBI Corporate", null, 8, null),
    AxisCorpBank("AXC", "axis_corp", "Axis Bank Corporate", null, 8, null),
    AndhraCorpBank("ADC", "andhra_corp", "Andhra Bank Corporate", null, 8, null),
    DhanlaxmiCorpBank("DL2", "dhanlaxmi_corp", "Dhanlaxmi Bank Corporate", null, 8, null),
    AllahabadCorpBank("ALC", "allahabad_corp", "Allahabad Bank Corporate", null, 8, null),
    HFDCCorpBank("CH3", "hdfc_corp", "HDFC Bank Corporate", null, 8, null),
    YesCorpBank("YBC", "yes_corp", "Yes Bank Corporate", null, 8, null),
    CorporationBankCorporate("CR2", "corporation_bank_corp", "Corporation Bank - Corporate", null, 8, null),
    BarclaysCorpBank("BRL", "barclays_corp", "Barclays Bank - Corporate Net Banking", null, 8, null);
    
    public static final Companion Companion = new Companion(null);
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;

    /* renamed from: id */
    private final String f75481id;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/NetbankingBank$Companion;", "", "()V", "get", "Lcom/stripe/android/view/NetbankingBank;", "bankCode", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNetbankingBank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetbankingBank.kt\ncom/stripe/android/view/NetbankingBank$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,453:1\n1282#2,2:454\n*S KotlinDebug\n*F\n+ 1 NetbankingBank.kt\ncom/stripe/android/view/NetbankingBank$Companion\n*L\n449#1:454,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NetbankingBank get(String str) {
            NetbankingBank[] values;
            for (NetbankingBank netbankingBank : NetbankingBank.values()) {
                if (Intrinsics.areEqual(netbankingBank.getCode(), str)) {
                    return netbankingBank;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    NetbankingBank(String str, String str2, String str3, Integer num) {
        this.f75481id = str;
        this.code = str2;
        this.displayName = str3;
        this.brandIconResId = num;
    }

    @JvmStatic
    public static final NetbankingBank get(String str) {
        return Companion.get(str);
    }

    @Override // com.stripe.android.view.Bank
    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    @Override // com.stripe.android.view.Bank
    public String getCode() {
        return this.code;
    }

    @Override // com.stripe.android.view.Bank
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.view.Bank
    public String getId() {
        return this.f75481id;
    }

    /* synthetic */ NetbankingBank(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num);
    }
}
