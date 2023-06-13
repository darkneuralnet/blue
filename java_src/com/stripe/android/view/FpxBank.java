package com.stripe.android.view;

import com.stripe.android.C18606R;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Maybank2U uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001#B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/view/FpxBank;", "", "Lcom/stripe/android/view/Bank;", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "displayName", "brandIconResId", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBrandIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getDisplayName", "getId", "Maybank2U", "Cimb", "PublicBank", "Rhb", "HongLeongBank", "AmBank", "AffinBank", "AllianceBankBusiness", "BankIslam", "BankMuamalat", "BankRakyat", "Bsn", "Hsbc", "Kfh", "Maybank2E", "Ocbc", "StandardChartered", "UobBank", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FpxBank implements Bank {
    private static final /* synthetic */ FpxBank[] $VALUES;
    public static final FpxBank AffinBank;
    public static final FpxBank AllianceBankBusiness;
    public static final FpxBank AmBank;
    public static final FpxBank BankIslam;
    public static final FpxBank BankMuamalat;
    public static final FpxBank BankRakyat;
    public static final FpxBank Bsn;
    public static final FpxBank Cimb;
    public static final Companion Companion;
    public static final FpxBank HongLeongBank;
    public static final FpxBank Hsbc;
    public static final FpxBank Kfh;
    public static final FpxBank Maybank2E;
    public static final FpxBank Maybank2U;
    public static final FpxBank Ocbc;
    public static final FpxBank PublicBank;
    public static final FpxBank Rhb;
    public static final FpxBank StandardChartered;
    public static final FpxBank UobBank;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;

    /* renamed from: id */
    private final String f75480id;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/FpxBank$Companion;", "", "()V", "get", "Lcom/stripe/android/view/FpxBank;", "bankCode", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFpxBank.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FpxBank.kt\ncom/stripe/android/view/FpxBank$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,133:1\n1282#2,2:134\n*S KotlinDebug\n*F\n+ 1 FpxBank.kt\ncom/stripe/android/view/FpxBank$Companion\n*L\n129#1:134,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FpxBank get(String str) {
            FpxBank[] values;
            for (FpxBank fpxBank : FpxBank.values()) {
                if (Intrinsics.areEqual(fpxBank.getCode(), str)) {
                    return fpxBank;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FpxBank[] $values() {
        return new FpxBank[]{Maybank2U, Cimb, PublicBank, Rhb, HongLeongBank, AmBank, AffinBank, AllianceBankBusiness, BankIslam, BankMuamalat, BankRakyat, Bsn, Hsbc, Kfh, Maybank2E, Ocbc, StandardChartered, UobBank};
    }

    static {
        int i = C18606R.C18607drawable.stripe_ic_bank_maybank;
        Maybank2U = new FpxBank("Maybank2U", 0, "MB2U0227", "maybank2u", "Maybank2U", Integer.valueOf(i));
        Cimb = new FpxBank("Cimb", 1, "BCBB0235", "cimb", "CIMB Clicks", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_cimb));
        PublicBank = new FpxBank("PublicBank", 2, "PBB0233", "public_bank", "Public Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_public));
        Rhb = new FpxBank("Rhb", 3, "RHB0218", "rhb", "RHB Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_rhb));
        HongLeongBank = new FpxBank("HongLeongBank", 4, "HLB0224", "hong_leong_bank", "Hong Leong Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_hong_leong));
        AmBank = new FpxBank("AmBank", 5, "AMBB0209", "ambank", "AmBank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_ambank));
        AffinBank = new FpxBank("AffinBank", 6, "ABB0233", "affin_bank", "Affin Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_affin));
        AllianceBankBusiness = new FpxBank("AllianceBankBusiness", 7, "ABMB0212", "alliance_bank", "Alliance Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_alliance));
        BankIslam = new FpxBank("BankIslam", 8, "BIMB0340", "bank_islam", "Bank Islam", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_islam));
        BankMuamalat = new FpxBank("BankMuamalat", 9, "BMMB0341", "bank_muamalat", "Bank Muamalat", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_muamalat));
        BankRakyat = new FpxBank("BankRakyat", 10, "BKRM0602", "bank_rakyat", "Bank Rakyat", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_raykat));
        Bsn = new FpxBank("Bsn", 11, "BSN0601", "bsn", "BSN", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_bsn));
        Hsbc = new FpxBank("Hsbc", 12, "HSBC0223", "hsbc", "HSBC Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_hsbc));
        Kfh = new FpxBank("Kfh", 13, "KFH0346", "kfh", "KFH", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_kfh));
        Maybank2E = new FpxBank("Maybank2E", 14, "MBB0228", "maybank2e", "Maybank2E", Integer.valueOf(i));
        Ocbc = new FpxBank("Ocbc", 15, "OCBC0229", "ocbc", "OCBC Bank", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_ocbc));
        StandardChartered = new FpxBank("StandardChartered", 16, "SCB0216", "standard_chartered", "Standard Chartered", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_standard_chartered));
        UobBank = new FpxBank("UobBank", 17, "UOB0226", "uob", "UOB", Integer.valueOf(C18606R.C18607drawable.stripe_ic_bank_uob));
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private FpxBank(String str, int i, String str2, String str3, String str4, Integer num) {
        this.f75480id = str2;
        this.code = str3;
        this.displayName = str4;
        this.brandIconResId = num;
    }

    @JvmStatic
    public static final FpxBank get(String str) {
        return Companion.get(str);
    }

    public static FpxBank valueOf(String str) {
        return (FpxBank) Enum.valueOf(FpxBank.class, str);
    }

    public static FpxBank[] values() {
        return (FpxBank[]) $VALUES.clone();
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
        return this.f75480id;
    }

    public /* synthetic */ FpxBank(String str, int i, String str2, String str3, String str4, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i2 & 8) != 0 ? null : num);
    }
}
