package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.InterfaceC34209Lc4;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LMc4;", "LxE;", "LLc4;", "", "titleRes", "", "Y", "", "LH6;", "sections", "b", "Lio/reactivex/k;", "i1", "p2", "Og", "a8", "LY4;", "LY4;", "binding", "LnQ5;", "c", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "LVb4;", DateTokenConverter.CONVERTER_KEY, "LVb4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LY4;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34443Mc4 extends AbstractC30071xE implements InterfaceC34209Lc4 {

    /* renamed from: b */
    public final C9607Y4 f23286b;

    /* renamed from: c */
    public C45672nQ5 f23287c;

    /* renamed from: d */
    public final C36540Vb4 f23288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34443Mc4(BaseActivity activity, C9607Y4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f23286b = binding;
        C36540Vb4 c36540Vb4 = new C36540Vb4();
        this.f23288d = c36540Vb4;
        binding.f44494b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f44494b.setItemAnimator(new C11894g());
        binding.f44494b.setAdapter(c36540Vb4);
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: Og */
    public AbstractC24490k<Unit> mo95130Og() {
        AbstractC24490k<Unit> m32108t0 = this.f23288d.m79701y().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.stillDamagedClic…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: Y */
    public void mo95129Y(int i) {
        getActivity().setTitle(i);
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: a8 */
    public AbstractC24490k<Unit> mo95128a8() {
        AbstractC24490k<Unit> m32108t0 = this.f23288d.m79703w().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.failedSubmitClic…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: b */
    public void mo95127b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f23288d.mo24871u(sections);
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        InterfaceC34209Lc4.C5036a.m96585b(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        InterfaceC34209Lc4.C5036a.m96586a(this, list);
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: i1 */
    public AbstractC24490k<Unit> mo95126i1() {
        AbstractC24490k<Unit> m32108t0 = this.f23288d.m79704v().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.addIssuesClicks(…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return InterfaceC34209Lc4.C5036a.m96584c(this, viewHolderSupplier);
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f23287c;
    }

    @Override // p000.InterfaceC34209Lc4
    /* renamed from: p2 */
    public AbstractC24490k<Unit> mo95125p2() {
        AbstractC24490k<Unit> m32108t0 = this.f23288d.m79702x().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.readyToRideClick…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f23287c = c45672nQ5;
    }
}
