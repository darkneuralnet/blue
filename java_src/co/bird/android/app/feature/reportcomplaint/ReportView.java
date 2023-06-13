package co.bird.android.app.feature.reportcomplaint;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.widget.RemovableImageView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b!\u0010%B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b!\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019¨\u0006)"}, m28432d2 = {"Lco/bird/android/app/feature/reportcomplaint/ReportView;", "Landroid/widget/LinearLayout;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "setBirdCode", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "f", "e", "", "Lco/bird/android/widget/RemovableImageView;", "b", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "images", "Llt6;", "c", "Llt6;", "binding", "Lco/bird/android/imageupload/ImageUploadBar;", "()Lco/bird/android/imageupload/ImageUploadBar;", "imageUploadBar", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "scanBirdText", C17296a.f69688o, "addressText", DateTokenConverter.CONVERTER_KEY, "scanRequiredTextView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportView extends LinearLayout {

    /* renamed from: b */
    public final List<RemovableImageView> f62346b;

    /* renamed from: c */
    public final C44767lt6 f62347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62346b = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C44767lt6 m26700b = C44767lt6.m26700b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m26700b, "inflate(context.layoutInflater, this)");
        this.f62347c = m26700b;
        setOrientation(1);
    }

    /* renamed from: a */
    public final TextView m59616a() {
        TextView textView = this.f62347c.f96867b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.addressText");
        return textView;
    }

    /* renamed from: b */
    public final ImageUploadBar m59615b() {
        ImageUploadBar imageUploadBar = this.f62347c.f96870e;
        Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
        return imageUploadBar;
    }

    /* renamed from: c */
    public final TextView m59614c() {
        TextView textView = this.f62347c.f96871f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanBirdText");
        return textView;
    }

    /* renamed from: d */
    public final TextView m59613d() {
        TextView textView = this.f62347c.f96872g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanRequiredTextView");
        return textView;
    }

    /* renamed from: e */
    public final void m59612e() {
        ImageView imageView = this.f62347c.f96869d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkIconGreen");
        ImageView imageView2 = this.f62347c.f96868c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.checkIconGray");
        C49520tu6.m11245f(imageView, imageView2, 1000L);
    }

    /* renamed from: f */
    public final void m59611f() {
        ImageView imageView = this.f62347c.f96868c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkIconGray");
        ImageView imageView2 = this.f62347c.f96869d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.checkIconGreen");
        C49520tu6.m11245f(imageView, imageView2, 1000L);
    }

    public final void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f62347c.f96867b.setText(address);
    }

    public final void setBirdCode(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f62347c.f96871f.setText(code);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62346b = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C44767lt6 m26700b = C44767lt6.m26700b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m26700b, "inflate(context.layoutInflater, this)");
        this.f62347c = m26700b;
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62346b = new ArrayList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C44767lt6 m26700b = C44767lt6.m26700b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m26700b, "inflate(context.layoutInflater, this)");
        this.f62347c = m26700b;
        setOrientation(1);
    }
}
