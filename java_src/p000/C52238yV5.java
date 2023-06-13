package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LyV5;", "", "", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethods", "", "googlePayAvailable", "paypalAvailable", "", "", "paymentMethodExclusion", "", "LH6;", C17296a.f69688o, "LzV5;", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSupportedPaymentMethodConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentMethodConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n65#1,6:99\n1603#2,9:76\n1855#2:85\n1856#2:87\n1612#2:88\n1603#2,9:89\n1855#2:98\n1856#2:106\n1612#2:107\n1#3:86\n1#3:105\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentMethodConverter\n*L\n41#1:99,6\n23#1:76,9\n23#1:85\n23#1:87\n23#1:88\n36#1:89,9\n36#1:98\n36#1:106\n36#1:107\n23#1:86\n36#1:105\n*E\n"})
/* renamed from: yV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52238yV5 {

    /* renamed from: a */
    public final Context f119609a;

    public C52238yV5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119609a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C3023H6> m3440a(Collection<? extends PaymentMethod> paymentMethods, boolean z, boolean z2, Map<PaymentMethod, String> paymentMethodExclusion) {
        List plus;
        List mutableList;
        List<C3023H6> listOf;
        C52831zV5 c52831zV5;
        C2637G6 c2637g6;
        C52831zV5 m3439b;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethodExclusion, "paymentMethodExclusion");
        Collection<? extends PaymentMethod> collection = paymentMethods;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (true) {
            C2637G6 c2637g62 = null;
            if (!it.hasNext()) {
                break;
            }
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (!paymentMethodExclusion.containsKey(paymentMethod) && ((paymentMethod != PaymentMethod.GOOGLE_PAY || z) && ((paymentMethod != PaymentMethod.PAYPAL || z2) && (m3439b = m3439b(paymentMethod)) != null))) {
                c2637g62 = new C2637G6(m3439b, C31932Bj4.item_payment_method, false, 4, null);
            }
            if (c2637g62 != null) {
                arrayList.add(c2637g62);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (PaymentMethod paymentMethod2 : collection) {
            if ((paymentMethod2 != PaymentMethod.GOOGLE_PAY || z) && ((paymentMethod2 != PaymentMethod.PAYPAL || z2) && paymentMethodExclusion.containsKey(paymentMethod2))) {
                String str = paymentMethodExclusion.get(paymentMethod2);
                Integer m19355a = C46838pO3.m19355a(paymentMethod2);
                if (m19355a != null) {
                    c52831zV5 = new C52831zV5(paymentMethod2, m19355a.intValue(), C46838pO3.m19354b(paymentMethod2, this.f119609a), str);
                } else {
                    c52831zV5 = null;
                }
                if (c52831zV5 != null) {
                    c2637g6 = new C2637G6(c52831zV5, C31932Bj4.item_payment_method, false, 4, null);
                    if (c2637g6 == null) {
                        arrayList2.add(c2637g6);
                    }
                }
            }
            c2637g6 = null;
            if (c2637g6 == null) {
            }
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) plus);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final C52831zV5 m3439b(PaymentMethod paymentMethod) {
        Integer m19355a = C46838pO3.m19355a(paymentMethod);
        if (m19355a != null) {
            return new C52831zV5(paymentMethod, m19355a.intValue(), C46838pO3.m19354b(paymentMethod, this.f119609a), null, 8, null);
        }
        return null;
    }
}
