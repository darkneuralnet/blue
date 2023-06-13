package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LzV5;", "", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "", "iconRes", "", "title", "subtitle", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/constant/PaymentMethod;", "c", "()Lco/bird/android/model/constant/PaymentMethod;", "b", "I", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "<init>", "(Lco/bird/android/model/constant/PaymentMethod;ILjava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52831zV5 {

    /* renamed from: a */
    public final PaymentMethod f121437a;

    /* renamed from: b */
    public final int f121438b;

    /* renamed from: c */
    public final String f121439c;

    /* renamed from: d */
    public final String f121440d;

    public C52831zV5(PaymentMethod paymentMethod, int i, String title, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f121437a = paymentMethod;
        this.f121438b = i;
        this.f121439c = title;
        this.f121440d = str;
    }

    public static /* synthetic */ C52831zV5 copy$default(C52831zV5 c52831zV5, PaymentMethod paymentMethod, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paymentMethod = c52831zV5.f121437a;
        }
        if ((i2 & 2) != 0) {
            i = c52831zV5.f121438b;
        }
        if ((i2 & 4) != 0) {
            str = c52831zV5.f121439c;
        }
        if ((i2 & 8) != 0) {
            str2 = c52831zV5.f121440d;
        }
        return c52831zV5.m1294a(paymentMethod, i, str, str2);
    }

    /* renamed from: a */
    public final C52831zV5 m1294a(PaymentMethod paymentMethod, int i, String title, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(title, "title");
        return new C52831zV5(paymentMethod, i, title, str);
    }

    /* renamed from: b */
    public final int m1293b() {
        return this.f121438b;
    }

    /* renamed from: c */
    public final PaymentMethod m1292c() {
        return this.f121437a;
    }

    /* renamed from: d */
    public final String m1291d() {
        return this.f121440d;
    }

    /* renamed from: e */
    public final String m1290e() {
        return this.f121439c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52831zV5) {
            C52831zV5 c52831zV5 = (C52831zV5) obj;
            return this.f121437a == c52831zV5.f121437a && this.f121438b == c52831zV5.f121438b && Intrinsics.areEqual(this.f121439c, c52831zV5.f121439c) && Intrinsics.areEqual(this.f121440d, c52831zV5.f121440d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f121437a.hashCode() * 31) + Integer.hashCode(this.f121438b)) * 31) + this.f121439c.hashCode()) * 31;
        String str = this.f121440d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        PaymentMethod paymentMethod = this.f121437a;
        int i = this.f121438b;
        String str = this.f121439c;
        String str2 = this.f121440d;
        return "SupportedPaymentMethodViewModel(paymentMethod=" + paymentMethod + ", iconRes=" + i + ", title=" + str + ", subtitle=" + str2 + ")";
    }

    public /* synthetic */ C52831zV5(PaymentMethod paymentMethod, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethod, i, str, (i2 & 8) != 0 ? null : str2);
    }
}
