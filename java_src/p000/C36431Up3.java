package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LUp3;", "", "", "orderId", "date", "time", "listDescription", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "e", "Lco/bird/android/model/constant/OperatorOrderViewType;", "f", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Up3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36431Up3 {

    /* renamed from: a */
    public final String f38056a;

    /* renamed from: b */
    public final String f38057b;

    /* renamed from: c */
    public final String f38058c;

    /* renamed from: d */
    public final String f38059d;

    /* renamed from: e */
    public final OperatorOrderViewType f38060e;

    public C36431Up3(String orderId, String date, String time, String str, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f38056a = orderId;
        this.f38057b = date;
        this.f38058c = time;
        this.f38059d = str;
        this.f38060e = type;
    }

    public static /* synthetic */ C36431Up3 copy$default(C36431Up3 c36431Up3, String str, String str2, String str3, String str4, OperatorOrderViewType operatorOrderViewType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c36431Up3.f38056a;
        }
        if ((i & 2) != 0) {
            str2 = c36431Up3.f38057b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c36431Up3.f38058c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c36431Up3.f38059d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            operatorOrderViewType = c36431Up3.f38060e;
        }
        return c36431Up3.m80796a(str, str5, str6, str7, operatorOrderViewType);
    }

    /* renamed from: a */
    public final C36431Up3 m80796a(String orderId, String date, String time, String str, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C36431Up3(orderId, date, time, str, type);
    }

    /* renamed from: b */
    public final String m80795b() {
        return this.f38057b;
    }

    /* renamed from: c */
    public final String m80794c() {
        return this.f38059d;
    }

    /* renamed from: d */
    public final String m80793d() {
        return this.f38056a;
    }

    /* renamed from: e */
    public final String m80792e() {
        return this.f38058c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36431Up3) {
            C36431Up3 c36431Up3 = (C36431Up3) obj;
            return Intrinsics.areEqual(this.f38056a, c36431Up3.f38056a) && Intrinsics.areEqual(this.f38057b, c36431Up3.f38057b) && Intrinsics.areEqual(this.f38058c, c36431Up3.f38058c) && Intrinsics.areEqual(this.f38059d, c36431Up3.f38059d) && this.f38060e == c36431Up3.f38060e;
        }
        return false;
    }

    /* renamed from: f */
    public final OperatorOrderViewType m80791f() {
        return this.f38060e;
    }

    public int hashCode() {
        int hashCode = ((((this.f38056a.hashCode() * 31) + this.f38057b.hashCode()) * 31) + this.f38058c.hashCode()) * 31;
        String str = this.f38059d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f38060e.hashCode();
    }

    public String toString() {
        String str = this.f38056a;
        String str2 = this.f38057b;
        String str3 = this.f38058c;
        String str4 = this.f38059d;
        OperatorOrderViewType operatorOrderViewType = this.f38060e;
        return "OperatorOrderViewModel(orderId=" + str + ", date=" + str2 + ", time=" + str3 + ", listDescription=" + str4 + ", type=" + operatorOrderViewType + ")";
    }
}
