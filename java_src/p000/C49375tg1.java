package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"Ltg1;", "", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "message", "title", "Lkg1;", "reason", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lkg1;", "getReason", "()Lkg1;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lkg1;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tg1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49375tg1 {
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final int code;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final EnumC44039kg1 reason;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public C49375tg1() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ C49375tg1 copy$default(C49375tg1 c49375tg1, int i, String str, String str2, EnumC44039kg1 enumC44039kg1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c49375tg1.code;
        }
        if ((i2 & 2) != 0) {
            str = c49375tg1.message;
        }
        if ((i2 & 4) != 0) {
            str2 = c49375tg1.title;
        }
        if ((i2 & 8) != 0) {
            enumC44039kg1 = c49375tg1.reason;
        }
        return c49375tg1.m11934a(i, str, str2, enumC44039kg1);
    }

    /* renamed from: a */
    public final C49375tg1 m11934a(int i, String message, String str, EnumC44039kg1 enumC44039kg1) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new C49375tg1(i, message, str, enumC44039kg1);
    }

    /* renamed from: b */
    public final int m11933b() {
        return this.code;
    }

    /* renamed from: c */
    public final String m11932c() {
        return this.message;
    }

    /* renamed from: d */
    public final String m11931d() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49375tg1) {
            C49375tg1 c49375tg1 = (C49375tg1) obj;
            return this.code == c49375tg1.code && Intrinsics.areEqual(this.message, c49375tg1.message) && Intrinsics.areEqual(this.title, c49375tg1.title) && this.reason == c49375tg1.reason;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC44039kg1 enumC44039kg1 = this.reason;
        return hashCode2 + (enumC44039kg1 != null ? enumC44039kg1.hashCode() : 0);
    }

    public String toString() {
        int i = this.code;
        String str = this.message;
        String str2 = this.title;
        EnumC44039kg1 enumC44039kg1 = this.reason;
        return "ErrorResponse(code=" + i + ", message=" + str + ", title=" + str2 + ", reason=" + enumC44039kg1 + ")";
    }

    public C49375tg1(int i, String message, String str, EnumC44039kg1 enumC44039kg1) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
        this.title = str;
        this.reason = enumC44039kg1;
    }

    public /* synthetic */ C49375tg1(int i, String str, String str2, EnumC44039kg1 enumC44039kg1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? EnumC44039kg1.UNKNOWN : enumC44039kg1);
    }
}
