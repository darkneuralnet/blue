package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J(\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002J+\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LuV5;", "", "", "Lco/bird/android/model/constant/PaymentMethod;", "enabledPaymentMethods", "", "", "unsupportedCardBrands", "LvV5;", C17296a.f69688o, "", "enabled", "", "iconRes", "contentDescription", "b", "", "c", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/constant/PaymentMethod;ZLjava/lang/Integer;)LvV5;", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSupportedPaymentBrandConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentBrandConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentBrandConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1603#2,9:79\n1855#2:88\n1856#2:90\n1612#2:91\n1603#2,9:92\n1855#2:101\n1856#2:103\n1612#2:104\n1#3:89\n1#3:102\n1#3:105\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentBrandConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentBrandConverter\n*L\n17#1:79,9\n17#1:88\n17#1:90\n17#1:91\n46#1:92,9\n46#1:101\n46#1:103\n46#1:104\n17#1:89\n46#1:102\n*E\n"})
/* renamed from: uV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49867uV5 {

    /* renamed from: b */
    public static final C29206a f112494b = new C29206a(null);

    /* renamed from: c */
    public static final List<String> f112495c;

    /* renamed from: a */
    public final Context f112496a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LuV5$a;", "", "", "", "cardBrands", "Ljava/util/List;", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uV5$a */
    /* loaded from: classes3.dex */
    public static final class C29206a {
        public /* synthetic */ C29206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29206a() {
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"VISA", "MASTERCARD", "AMEX", "DISCOVER"});
        f112495c = listOf;
    }

    public C49867uV5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f112496a = context;
    }

    /* renamed from: e */
    public static /* synthetic */ C50459vV5 m10200e(C49867uV5 c49867uV5, PaymentMethod paymentMethod, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return c49867uV5.m10201d(paymentMethod, z, num);
    }

    /* renamed from: a */
    public final List<C50459vV5> m10204a(Collection<? extends PaymentMethod> enabledPaymentMethods, List<String> unsupportedCardBrands) {
        Set<String> set;
        List<C50459vV5> plus;
        C50459vV5 c50459vV5;
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(unsupportedCardBrands, "unsupportedCardBrands");
        ArrayList arrayList = new ArrayList();
        for (PaymentMethod paymentMethod : enabledPaymentMethods) {
            if (paymentMethod != PaymentMethod.CARD) {
                c50459vV5 = m10200e(this, paymentMethod, false, null, 3, null);
            } else {
                c50459vV5 = null;
            }
            if (c50459vV5 != null) {
                arrayList.add(c50459vV5);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(unsupportedCardBrands);
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) m10202c(set));
        return plus;
    }

    /* renamed from: b */
    public final C50459vV5 m10203b(boolean z, int i, String str) {
        if (z) {
            return new C50459vV5(i, str);
        }
        return null;
    }

    /* renamed from: c */
    public final List<C50459vV5> m10202c(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (String str : f112495c) {
            C50459vV5 m10203b = m10203b(!set.contains(str), C51735xf0.m4897b(str), str);
            if (m10203b != null) {
                arrayList.add(m10203b);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C50459vV5 m10201d(PaymentMethod paymentMethod, boolean z, Integer num) {
        String str;
        Integer m19355a = C46838pO3.m19355a(paymentMethod);
        if (m19355a == null) {
            return null;
        }
        int intValue = m19355a.intValue();
        if (num != null) {
            str = this.f112496a.getString(num.intValue());
        } else {
            str = null;
        }
        C50459vV5 m10203b = m10203b(z, intValue, str);
        if (m10203b == null) {
            return null;
        }
        return m10203b;
    }
}
