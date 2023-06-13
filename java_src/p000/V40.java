package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.U40;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LV40;", "LmA;", "LU40;", "", "show", "", "hiddenState", "", "showProgress", "LnQ5;", DateTokenConverter.CONVERTER_KEY, "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lf3;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lf3;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: V40 */
/* loaded from: classes3.dex */
public final class V40 extends C25922mA implements U40 {

    /* renamed from: d */
    public C45672nQ5 f38562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V40(BaseActivity activity, C20179f3 binding) {
        super(activity, binding);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // p000.FQ5
    /* renamed from: Td */
    public void mo80452Td() {
        U40.C8188a.m82018a(this);
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        U40.C8188a.m82017b(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return U40.C8188a.m82016c(this, viewHolderSupplier);
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f38562d;
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        Unit unit;
        C45672nQ5 mo12605oc = mo12605oc();
        if (mo12605oc != null) {
            mo12605oc.showProgress(z, i);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.showProgress(z, i);
        }
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f38562d = c45672nQ5;
    }
}
