package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b¨\u0006#"}, m28432d2 = {"Lw24;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "priceString", "holdString", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getPriceString", "()Ljava/lang/String;", "e", "getHoldString", "f", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAlertDialog.kt\nco/bird/android/core/base/viewmodel/PricingStringDetailsAlertDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2131:1\n1#2:2132\n*E\n"})
/* renamed from: w24  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50782w24 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f115188d;

    /* renamed from: e */
    public final String f115189e;

    /* renamed from: f */
    public final int f115190f;

    /* renamed from: g */
    public final Integer f115191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50782w24(String priceString, String str) {
        super(null);
        Intrinsics.checkNotNullParameter(priceString, "priceString");
        this.f115188d = priceString;
        this.f115189e = str;
        this.f115190f = C45871nl4.general_got_it;
    }

    public static /* synthetic */ C50782w24 copy$default(C50782w24 c50782w24, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50782w24.f115188d;
        }
        if ((i & 2) != 0) {
            str2 = c50782w24.f115189e;
        }
        return c50782w24.m7545b(str, str2);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f115190f);
    }

    /* renamed from: b */
    public final C50782w24 m7545b(String priceString, String str) {
        Intrinsics.checkNotNullParameter(priceString, "priceString");
        return new C50782w24(priceString, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50782w24) {
            C50782w24 c50782w24 = (C50782w24) obj;
            return Intrinsics.areEqual(this.f115188d, c50782w24.f115188d) && Intrinsics.areEqual(this.f115189e, c50782w24.f115189e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f115191g;
    }

    public int hashCode() {
        int hashCode = this.f115188d.hashCode() * 31;
        String str = this.f115189e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0 == null) goto L8;
     */
    @Override // p000.AbstractC5751Ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence message(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        String str2 = this.f115188d;
        String str3 = this.f115189e;
        if (str3 != null) {
            str = "\n\n" + str3;
        }
        str = "";
        return str2 + str;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.alert_dialog_pricing_details_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…og_pricing_details_title)");
        return string;
    }

    public String toString() {
        String str = this.f115188d;
        String str2 = this.f115189e;
        return "PricingStringDetailsAlertDialog(priceString=" + str + ", holdString=" + str2 + ")";
    }

    public /* synthetic */ C50782w24(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
