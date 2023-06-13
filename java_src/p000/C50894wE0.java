package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.EditTextBox;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.android.schedulers.C23454a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LwE0;", "LxE;", "LvE0;", "Lio/reactivex/k;", "", "g8", "", "Z3", "Ls3;", "b", "Ls3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ls3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50894wE0 extends AbstractC30071xE implements InterfaceC50301vE0 {

    /* renamed from: b */
    public final C28165s3 f115612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50894wE0(BaseActivity activity, C28165s3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f115612b = binding;
    }

    @Override // p000.InterfaceC50301vE0
    /* renamed from: Z3 */
    public AbstractC24490k<Unit> mo7211Z3() {
        Button button = this.f115612b.f108174b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.createBatchButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.createBatchButto…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC50301vE0
    /* renamed from: g8 */
    public AbstractC24490k<String> mo7210g8() {
        EditTextBox editTextBox = this.f115612b.f108175c;
        Intrinsics.checkNotNullExpressionValue(editTextBox, "binding.createBatchEditText");
        AbstractC24490k<String> flowable = C44626lf5.textChanges$default(editTextBox, 0, false, 2, null).toFlowable(EnumC23460b.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "binding.createBatchEditT…kpressureStrategy.LATEST)");
        return flowable;
    }
}
