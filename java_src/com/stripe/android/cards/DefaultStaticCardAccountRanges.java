package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "()V", "filter", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "first", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDefaultStaticCardAccountRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStaticCardAccountRanges.kt\ncom/stripe/android/cards/DefaultStaticCardAccountRanges\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n766#2:192\n857#2,2:193\n1549#2:195\n1620#2,3:196\n1549#2:199\n1620#2,3:200\n1549#2:203\n1620#2,3:204\n1549#2:207\n1620#2,3:208\n1549#2:211\n1620#2,3:212\n1549#2:215\n1620#2,3:216\n1549#2:219\n1620#2,3:220\n1549#2:223\n1620#2,3:224\n1549#2:227\n1620#2,3:228\n*S KotlinDebug\n*F\n+ 1 DefaultStaticCardAccountRanges.kt\ncom/stripe/android/cards/DefaultStaticCardAccountRanges\n*L\n16#1:192\n16#1:193,2\n25#1:195\n25#1:196,3\n43#1:199\n43#1:200,3\n61#1:203\n61#1:204,3\n84#1:207\n84#1:208,3\n97#1:211\n97#1:212,3\n121#1:215\n121#1:216,3\n135#1:219\n135#1:220,3\n158#1:223\n158#1:224,3\n171#1:227\n171#1:228,3\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultStaticCardAccountRanges implements StaticCardAccountRanges {
    public static final int $stable = 0;
    private static final List<AccountRange> ACCOUNTS;
    private static final List<AccountRange> AMEX_ACCOUNTS;
    public static final Companion Companion = new Companion(null);
    private static final List<AccountRange> DINERSCLUB14_ACCOUNT_RANGES;
    private static final List<AccountRange> DINERSCLUB16_ACCOUNT_RANGES;
    private static final List<AccountRange> DISCOVER_ACCOUNTS;
    private static final List<AccountRange> JCB_ACCOUNTS;
    private static final List<AccountRange> MASTERCARD_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY16_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY19_ACCOUNTS;
    private static final List<AccountRange> VISA_ACCOUNTS;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;", "", "()V", "ACCOUNTS", "", "Lcom/stripe/android/model/AccountRange;", "getACCOUNTS$payments_core_release", "()Ljava/util/List;", "AMEX_ACCOUNTS", "DINERSCLUB14_ACCOUNT_RANGES", "DINERSCLUB16_ACCOUNT_RANGES", "DISCOVER_ACCOUNTS", "getDISCOVER_ACCOUNTS$payments_core_release", "JCB_ACCOUNTS", "MASTERCARD_ACCOUNTS", "UNIONPAY16_ACCOUNTS", "getUNIONPAY16_ACCOUNTS$payments_core_release$annotations", "getUNIONPAY16_ACCOUNTS$payments_core_release", "UNIONPAY19_ACCOUNTS", "getUNIONPAY19_ACCOUNTS$payments_core_release$annotations", "getUNIONPAY19_ACCOUNTS$payments_core_release", "VISA_ACCOUNTS", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getUNIONPAY16_ACCOUNTS$payments_core_release$annotations() {
        }

        public static /* synthetic */ void getUNIONPAY19_ACCOUNTS$payments_core_release$annotations() {
        }

        public final List<AccountRange> getACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.ACCOUNTS;
        }

        public final List<AccountRange> getDISCOVER_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.DISCOVER_ACCOUNTS;
        }

        public final List<AccountRange> getUNIONPAY16_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.UNIONPAY16_ACCOUNTS;
        }

        public final List<AccountRange> getUNIONPAY19_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.UNIONPAY19_ACCOUNTS;
        }

        private Companion() {
        }
    }

    static {
        Set<BinRange> of;
        int collectionSizeOrDefault;
        Set<BinRange> of2;
        int collectionSizeOrDefault2;
        Set<BinRange> of3;
        int collectionSizeOrDefault3;
        Set<BinRange> of4;
        int collectionSizeOrDefault4;
        Set<BinRange> of5;
        int collectionSizeOrDefault5;
        Set<BinRange> of6;
        int collectionSizeOrDefault6;
        Set<BinRange> of7;
        int collectionSizeOrDefault7;
        Set<BinRange> of8;
        int collectionSizeOrDefault8;
        Set<BinRange> of9;
        int collectionSizeOrDefault9;
        List plus;
        List plus2;
        List plus3;
        List plus4;
        List plus5;
        List plus6;
        List plus7;
        List<AccountRange> plus8;
        of = SetsKt__SetsJVMKt.setOf(new BinRange("4000000000000000", "4999999999999999"));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (BinRange binRange : of) {
            arrayList.add(new AccountRange(binRange, 16, AccountRange.BrandInfo.Visa, null, 8, null));
        }
        VISA_ACCOUNTS = arrayList;
        of2 = SetsKt__SetsKt.setOf((Object[]) new BinRange[]{new BinRange("2221000000000000", "2720999999999999"), new BinRange("5100000000000000", "5599999999999999")});
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (BinRange binRange2 : of2) {
            arrayList2.add(new AccountRange(binRange2, 16, AccountRange.BrandInfo.Mastercard, null, 8, null));
        }
        MASTERCARD_ACCOUNTS = arrayList2;
        of3 = SetsKt__SetsKt.setOf((Object[]) new BinRange[]{new BinRange("340000000000000", "349999999999999"), new BinRange("370000000000000", "379999999999999")});
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of3, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (BinRange binRange3 : of3) {
            arrayList3.add(new AccountRange(binRange3, 15, AccountRange.BrandInfo.AmericanExpress, null, 8, null));
        }
        AMEX_ACCOUNTS = arrayList3;
        of4 = SetsKt__SetsKt.setOf((Object[]) new BinRange[]{new BinRange("6000000000000000", "6099999999999999"), new BinRange("6400000000000000", "6499999999999999"), new BinRange("6500000000000000", "6599999999999999")});
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of4, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
        for (BinRange binRange4 : of4) {
            arrayList4.add(new AccountRange(binRange4, 16, AccountRange.BrandInfo.Discover, null, 8, null));
        }
        DISCOVER_ACCOUNTS = arrayList4;
        of5 = SetsKt__SetsJVMKt.setOf(new BinRange("3528000000000000", "3589999999999999"));
        collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of5, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault5);
        for (BinRange binRange5 : of5) {
            arrayList5.add(new AccountRange(binRange5, 16, AccountRange.BrandInfo.JCB, null, 8, null));
        }
        JCB_ACCOUNTS = arrayList5;
        of6 = SetsKt__SetsKt.setOf((Object[]) new BinRange[]{new BinRange("6200000000000000", "6216828049999999"), new BinRange("6216828060000000", "6299999999999999"), new BinRange("8100000000000000", "8199999999999999")});
        collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of6, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault6);
        for (BinRange binRange6 : of6) {
            arrayList6.add(new AccountRange(binRange6, 16, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY16_ACCOUNTS = arrayList6;
        of7 = SetsKt__SetsJVMKt.setOf(new BinRange("6216828050000000000", "6216828059999999999"));
        collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of7, 10);
        ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault7);
        for (BinRange binRange7 : of7) {
            arrayList7.add(new AccountRange(binRange7, 19, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY19_ACCOUNTS = arrayList7;
        of8 = SetsKt__SetsKt.setOf((Object[]) new BinRange[]{new BinRange("3000000000000000", "3059999999999999"), new BinRange("3095000000000000", "3095999999999999"), new BinRange("3800000000000000", "3999999999999999")});
        collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of8, 10);
        ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault8);
        for (BinRange binRange8 : of8) {
            arrayList8.add(new AccountRange(binRange8, 16, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB16_ACCOUNT_RANGES = arrayList8;
        of9 = SetsKt__SetsJVMKt.setOf(new BinRange("36000000000000", "36999999999999"));
        collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(of9, 10);
        ArrayList arrayList9 = new ArrayList(collectionSizeOrDefault9);
        for (BinRange binRange9 : of9) {
            arrayList9.add(new AccountRange(binRange9, 14, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB14_ACCOUNT_RANGES = arrayList9;
        plus = CollectionsKt___CollectionsKt.plus((Collection) VISA_ACCOUNTS, (Iterable) MASTERCARD_ACCOUNTS);
        plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) AMEX_ACCOUNTS);
        plus3 = CollectionsKt___CollectionsKt.plus((Collection) plus2, (Iterable) DISCOVER_ACCOUNTS);
        plus4 = CollectionsKt___CollectionsKt.plus((Collection) plus3, (Iterable) JCB_ACCOUNTS);
        plus5 = CollectionsKt___CollectionsKt.plus((Collection) plus4, (Iterable) UNIONPAY16_ACCOUNTS);
        plus6 = CollectionsKt___CollectionsKt.plus((Collection) plus5, (Iterable) UNIONPAY19_ACCOUNTS);
        plus7 = CollectionsKt___CollectionsKt.plus((Collection) plus6, (Iterable) DINERSCLUB16_ACCOUNT_RANGES);
        plus8 = CollectionsKt___CollectionsKt.plus((Collection) plus7, (Iterable) arrayList9);
        ACCOUNTS = plus8;
    }

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public List<AccountRange> filter(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        ArrayList arrayList = new ArrayList();
        for (Object obj : ACCOUNTS) {
            if (((AccountRange) obj).getBinRange().matches(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public AccountRange first(CardNumber.Unvalidated cardNumber) {
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) filter(cardNumber));
        return (AccountRange) firstOrNull;
    }
}
