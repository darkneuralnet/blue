package p000;

import co.bird.api.response.ReceiptDetailLineItem;
import co.bird.api.response.ReceiptDetailResponse;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000f"}, m28432d2 = {"LK76;", "", "Lco/bird/api/response/ReceiptDetailResponse;", "receipt", "", "LH6;", C17296a.f69688o, "response", "c", "Lco/bird/api/response/ReceiptDetailLineItem;", "item", "LG6;", "b", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionReceiptConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptConverter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1603#2,9:54\n1855#2:63\n1856#2:65\n1612#2:66\n1#3:64\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptConverter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptConverter\n*L\n24#1:54,9\n24#1:63\n24#1:65\n24#1:66\n24#1:64\n*E\n"})
/* renamed from: K76 */
/* loaded from: classes3.dex */
public final class K76 {
    /* renamed from: a */
    public final List<C3023H6> m99191a(ReceiptDetailResponse receipt) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        C41318g46.m40163a("converting receipt " + receipt, new Object[0]);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m99189c(receipt));
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C2637G6 m99190b(ReceiptDetailLineItem receiptDetailLineItem) {
        EnumC42976is4 enumC42976is4;
        if (receiptDetailLineItem.getTitle() == null && receiptDetailLineItem.getValueString() == null) {
            return null;
        }
        String title = receiptDetailLineItem.getTitle();
        String str = "";
        if (title == null) {
            title = "";
        }
        String valueString = receiptDetailLineItem.getValueString();
        if (valueString != null) {
            str = valueString;
        }
        if (Intrinsics.areEqual(receiptDetailLineItem.getKind(), "total")) {
            enumC42976is4 = EnumC42976is4.TOTAL;
        } else {
            enumC42976is4 = EnumC42976is4.LINE_ITEM;
        }
        return new C2637G6(new C42383hs4(title, str, enumC42976is4), C34506Mj4.item_transaction_receipt_item, false, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m99189c(ReceiptDetailResponse receiptDetailResponse) {
        List list;
        List mutableList;
        List<ReceiptDetailLineItem> lineItems = receiptDetailResponse.getLineItems();
        if (lineItems != null) {
            ArrayList arrayList = new ArrayList();
            for (ReceiptDetailLineItem receiptDetailLineItem : lineItems) {
                C2637G6 m99190b = m99190b(receiptDetailLineItem);
                if (m99190b != null) {
                    arrayList.add(m99190b);
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            list = mutableList;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        return new C3023H6(list, null, null, 6, null);
    }
}
