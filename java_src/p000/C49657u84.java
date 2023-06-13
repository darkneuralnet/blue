package p000;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"Lu84;", "Lv0;", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "Sl", "()Landroid/widget/Button;", "sendButton", "c", "Pl", "copyButton", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "Ql", "()Landroid/widget/TextView;", "pricingMessage", "", "e", "I", "Rl", "()I", "pricingStringRes", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LMe2;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LMe2;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49657u84 extends AbstractC29350v0 {

    /* renamed from: b */
    public final Button f111790b;

    /* renamed from: c */
    public final Button f111791c;

    /* renamed from: d */
    public final TextView f111792d;

    /* renamed from: e */
    public final int f111793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49657u84(BaseActivity activity, C34459Me2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Button button = binding.f23357d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sendButton");
        this.f111790b = button;
        Button button2 = binding.f23355b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.copyButton");
        this.f111791c = button2;
        AppCompatTextView appCompatTextView = binding.f23356c;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.description");
        this.f111792d = appCompatTextView;
        this.f111793e = C45871nl4.promo_center_coupon_empty_state_body;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Pl */
    public Button mo9408Pl() {
        return this.f111791c;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Ql */
    public TextView mo9407Ql() {
        return this.f111792d;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Rl */
    public int mo9406Rl() {
        return this.f111793e;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Sl */
    public Button mo9405Sl() {
        return this.f111790b;
    }
}
