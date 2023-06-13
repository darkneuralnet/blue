package p000;

import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LAz1;", "Lv0;", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "Sl", "()Landroid/widget/Button;", "sendButton", "c", "Pl", "copyButton", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "Ql", "()Landroid/widget/TextView;", "pricingMessage", "", "e", "I", "Rl", "()I", "pricingStringRes", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LG3;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LG3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Az1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31839Az1 extends AbstractC29350v0 {

    /* renamed from: b */
    public final Button f1501b;

    /* renamed from: c */
    public final Button f1502c;

    /* renamed from: d */
    public final TextView f1503d;

    /* renamed from: e */
    public final int f1504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31839Az1(BaseActivity activity, C2621G3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Button button = binding.f10835f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sendButton");
        this.f1501b = button;
        Button button2 = binding.f10831b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.copyButton");
        this.f1502c = button2;
        TextView textView = binding.f10832c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.pricingMessage");
        this.f1503d = textView;
        this.f1504e = C45871nl4.free_rides_instruction;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Pl */
    public Button mo9408Pl() {
        return this.f1502c;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Ql */
    public TextView mo9407Ql() {
        return this.f1503d;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Rl */
    public int mo9406Rl() {
        return this.f1504e;
    }

    @Override // p000.AbstractC29350v0
    /* renamed from: Sl */
    public Button mo9405Sl() {
        return this.f1501b;
    }
}
