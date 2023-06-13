package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.InterfaceC48509sC4;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LtC4;", "LxE;", "LsC4;", "Lio/reactivex/Observable;", "", "c", "F1", "B", "c9", "Lco/bird/android/model/Issue;", "sj", "t6", "", "LH6;", "sections", "b", "Lh5;", "Lh5;", "binding", "LnQ5;", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "LPB4;", DateTokenConverter.CONVERTER_KEY, "LPB4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lh5;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49102tC4 extends AbstractC30071xE implements InterfaceC48509sC4 {

    /* renamed from: b */
    public final C22548h5 f110131b;

    /* renamed from: c */
    public C45672nQ5 f110132c;

    /* renamed from: d */
    public final PB4 f110133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49102tC4(BaseActivity activity, C22548h5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f110131b = binding;
        PB4 pb4 = new PB4();
        this.f110133d = pb4;
        binding.f84686d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f84686d.setItemAnimator(new C11894g());
        binding.f84686d.setAdapter(pb4);
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: B */
    public Observable<Unit> mo12613B() {
        return this.f110133d.m12598w();
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: F1 */
    public Observable<Unit> mo12612F1() {
        return this.f110133d.m12599v();
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: b */
    public void mo12611b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f110133d.mo24871u(sections);
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        InterfaceC48509sC4.C28234a.m14565b(this, list);
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: c */
    public Observable<Unit> mo12609c() {
        Button button = this.f110131b.f84687e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC48509sC4
    /* renamed from: c9 */
    public Observable<Unit> mo12608c9() {
        return this.f110133d.m12597x();
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        InterfaceC48509sC4.C28234a.m14566a(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return InterfaceC48509sC4.C28234a.m14564c(this, viewHolderSupplier);
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f110132c;
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: sj */
    public Observable<Issue> mo12604sj() {
        return this.f110133d.m12596y();
    }

    @Override // p000.InterfaceC4380KD
    /* renamed from: t6 */
    public Observable<Issue> mo12603t6() {
        return this.f110133d.m12600A();
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f110132c = c45672nQ5;
    }
}
