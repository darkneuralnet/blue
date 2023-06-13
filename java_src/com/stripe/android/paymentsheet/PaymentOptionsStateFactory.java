package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0004\u0012\u00020\u00110\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0002¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;", "", "()V", "create", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "showGooglePay", "", "showLink", "initialSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "currentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "nameProvider", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "sortedPaymentMethods", "savedSelection", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n1549#3:146\n1620#3,3:147\n350#3,7:150\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n*L\n30#1:146\n30#1:147,3\n55#1:150,7\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionsStateFactory {
    public static final PaymentOptionsStateFactory INSTANCE = new PaymentOptionsStateFactory();

    private PaymentOptionsStateFactory() {
    }

    public static /* synthetic */ PaymentOptionsState create$default(PaymentOptionsStateFactory paymentOptionsStateFactory, List list, boolean z, boolean z2, SavedSelection savedSelection, PaymentSelection paymentSelection, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            paymentSelection = null;
        }
        return paymentOptionsStateFactory.create(list, z, z2, savedSelection, paymentSelection, function1);
    }

    private final List<PaymentMethod> sortedPaymentMethods(List<PaymentMethod> list, SavedSelection savedSelection) {
        int i;
        List<PaymentMethod> mutableList;
        if (savedSelection instanceof SavedSelection.PaymentMethod) {
            i = 0;
            for (PaymentMethod paymentMethod : list) {
                if (Intrinsics.areEqual(paymentMethod.f75358id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (i != -1) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            mutableList.add(0, mutableList.remove(i));
            return mutableList;
        }
        return list;
    }

    public final PaymentOptionsState create(List<PaymentMethod> paymentMethods, boolean z, boolean z2, SavedSelection initialSelection, PaymentSelection paymentSelection, Function1<? super String, String> nameProvider) {
        List listOfNotNull;
        int collectionSizeOrDefault;
        List plus;
        Integer num;
        String str;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        Intrinsics.checkNotNullParameter(nameProvider, "nameProvider");
        PaymentOptionsItem[] paymentOptionsItemArr = new PaymentOptionsItem[3];
        boolean z3 = false;
        paymentOptionsItemArr[0] = PaymentOptionsItem.AddCard.INSTANCE;
        PaymentOptionsItem.GooglePay googlePay = PaymentOptionsItem.GooglePay.INSTANCE;
        Integer num2 = null;
        if (!z) {
            googlePay = null;
        }
        paymentOptionsItemArr[1] = googlePay;
        PaymentOptionsItem.Link link = PaymentOptionsItem.Link.INSTANCE;
        if (!z2) {
            link = null;
        }
        paymentOptionsItemArr[2] = link;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) paymentOptionsItemArr);
        List list = listOfNotNull;
        List<PaymentMethod> sortedPaymentMethods = sortedPaymentMethods(paymentMethods, initialSelection);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedPaymentMethods, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PaymentMethod paymentMethod : sortedPaymentMethods) {
            PaymentMethod.Type type = paymentMethod.type;
            if (type != null) {
                str = type.code;
            } else {
                str = null;
            }
            arrayList.add(new PaymentOptionsItem.SavedPaymentMethod(nameProvider.invoke(str), paymentMethod));
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        if (paymentSelection != null) {
            num = Integer.valueOf(PaymentOptionsStateFactoryKt.access$findSelectedPosition(plus, paymentSelection));
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != -1) ? true : true) {
            num2 = num;
        }
        int findInitialSelectedPosition = PaymentOptionsStateFactoryKt.findInitialSelectedPosition(plus, initialSelection);
        if (num2 != null) {
            findInitialSelectedPosition = num2.intValue();
        }
        return new PaymentOptionsState(plus, findInitialSelectedPosition);
    }
}
