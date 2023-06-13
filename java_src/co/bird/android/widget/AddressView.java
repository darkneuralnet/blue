package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006 "}, m28432d2 = {"Lco/bird/android/widget/AddressView;", "Landroid/widget/RelativeLayout;", "", "firstName", "", "setFirstName", "lastName", "setLastName", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "apt", "setApt", "city", "setCity", TransferTable.COLUMN_STATE, "setState", "zip", "setZip", "country", "setCountry", "Lzp6;", "b", "Lzp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AddressView extends RelativeLayout {

    /* renamed from: b */
    public final C53027zp6 f67132b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f67132b.f122283c.setText(address);
    }

    public final void setApt(String apt) {
        Intrinsics.checkNotNullParameter(apt, "apt");
        this.f67132b.f122284d.setText(apt);
    }

    public final void setCity(String city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.f67132b.f122285e.setText(city);
    }

    public final void setCountry(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f67132b.f122287g.setText(country);
    }

    public final void setFirstName(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f67132b.f122288h.setText(firstName);
    }

    public final void setLastName(String lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f67132b.f122289i.setText(lastName);
    }

    public final void setState(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f67132b.f122291k.setText(state);
    }

    public final void setZip(String zip) {
        Intrinsics.checkNotNullParameter(zip, "zip");
        this.f67132b.f122292l.setText(zip);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AddressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C53027zp6 m398b = C53027zp6.m398b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m398b, "inflate(context.layoutInflater, this)");
        this.f67132b = m398b;
    }
}
