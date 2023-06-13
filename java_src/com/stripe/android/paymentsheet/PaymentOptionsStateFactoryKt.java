package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0000¨\u0006\n"}, m28432d2 = {"findInitialSelectedPosition", "", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "findSelectedPosition", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "toPaymentSelection", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n350#2,7:145\n350#2,7:153\n350#2,7:160\n350#2,7:167\n350#2,7:174\n1#3:152\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n*L\n86#1:145,7\n105#1:153,7\n108#1:160,7\n111#1:167,7\n119#1:174,7\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionsStateFactoryKt {
    public static final /* synthetic */ int access$findSelectedPosition(List list, PaymentSelection paymentSelection) {
        return findSelectedPosition(list, paymentSelection);
    }

    public static final int findInitialSelectedPosition(List<? extends PaymentOptionsItem> list, SavedSelection savedSelection) {
        boolean z;
        boolean z2;
        boolean z3;
        List listOfNotNull;
        Object firstOrNull;
        boolean z4;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Integer[] numArr = new Integer[4];
        Iterator<? extends PaymentOptionsItem> it = list.iterator();
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                PaymentOptionsItem next = it.next();
                if (Intrinsics.areEqual(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
                    z4 = next instanceof PaymentOptionsItem.GooglePay;
                } else if (Intrinsics.areEqual(savedSelection, SavedSelection.Link.INSTANCE)) {
                    z4 = next instanceof PaymentOptionsItem.Link;
                } else {
                    if (savedSelection instanceof SavedSelection.PaymentMethod) {
                        if (next instanceof PaymentOptionsItem.SavedPaymentMethod) {
                            z4 = Intrinsics.areEqual(((SavedSelection.PaymentMethod) savedSelection).getId(), ((PaymentOptionsItem.SavedPaymentMethod) next).getPaymentMethod().f75358id);
                        }
                    } else {
                        Intrinsics.areEqual(savedSelection, SavedSelection.None.INSTANCE);
                    }
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            valueOf = null;
        }
        numArr[0] = valueOf;
        Iterator<? extends PaymentOptionsItem> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof PaymentOptionsItem.GooglePay) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (valueOf2.intValue() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            valueOf2 = null;
        }
        numArr[1] = valueOf2;
        Iterator<? extends PaymentOptionsItem> it3 = list.iterator();
        int i3 = 0;
        while (true) {
            if (it3.hasNext()) {
                if (it3.next() instanceof PaymentOptionsItem.Link) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Integer valueOf3 = Integer.valueOf(i3);
        if (valueOf3.intValue() != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            valueOf3 = null;
        }
        numArr[2] = valueOf3;
        Iterator<? extends PaymentOptionsItem> it4 = list.iterator();
        int i4 = 0;
        while (true) {
            if (it4.hasNext()) {
                if (it4.next() instanceof PaymentOptionsItem.SavedPaymentMethod) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        Integer valueOf4 = Integer.valueOf(i4);
        if (valueOf4.intValue() != -1) {
            z5 = true;
        }
        if (z5) {
            num = valueOf4;
        }
        numArr[3] = num;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) numArr);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) listOfNotNull);
        Integer num2 = (Integer) firstOrNull;
        if (num2 == null) {
            return -1;
        }
        return num2.intValue();
    }

    public static final int findSelectedPosition(List<? extends PaymentOptionsItem> list, PaymentSelection paymentSelection) {
        boolean z;
        int i = 0;
        for (PaymentOptionsItem paymentOptionsItem : list) {
            if (paymentSelection instanceof PaymentSelection.GooglePay) {
                z = paymentOptionsItem instanceof PaymentOptionsItem.GooglePay;
            } else if (paymentSelection instanceof PaymentSelection.Link) {
                z = paymentOptionsItem instanceof PaymentOptionsItem.Link;
            } else {
                if (paymentSelection instanceof PaymentSelection.Saved) {
                    if (paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod) {
                        z = Intrinsics.areEqual(((PaymentSelection.Saved) paymentSelection).getPaymentMethod().f75358id, ((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem).getPaymentMethod().f75358id);
                    }
                } else if (!(paymentSelection instanceof PaymentSelection.New)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            if (!z) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final PaymentSelection toPaymentSelection(PaymentOptionsItem paymentOptionsItem) {
        Intrinsics.checkNotNullParameter(paymentOptionsItem, "<this>");
        if (paymentOptionsItem instanceof PaymentOptionsItem.AddCard) {
            return null;
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.GooglePay) {
            return PaymentSelection.GooglePay.INSTANCE;
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.Link) {
            return PaymentSelection.Link.INSTANCE;
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod) {
            return new PaymentSelection.Saved(((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem).getPaymentMethod(), false, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
