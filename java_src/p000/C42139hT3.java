package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.PhysicalLockKind;
import co.bird.android.model.wire.WirePhysicalLock;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41546gT3;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LhT3;", "LxE;", "LgT3;", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "e9", "Lio/reactivex/Observable;", "hg", "s3", "r0", "K8", "Y5", "", "title", "E", "sl", "LM4;", "b", "LM4;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LM4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockUnlockUiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockUnlockUiImpl.kt\nco/bird/android/app/feature/physicallock/PhysicalLockUnlockUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* renamed from: hT3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42139hT3 extends AbstractC30071xE implements InterfaceC41546gT3 {

    /* renamed from: b */
    public final C5176M4 f85277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42139hT3(BaseActivity activity, C5176M4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f85277b = binding;
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: E */
    public void mo14181E(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getString(i));
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: K8 */
    public Observable<Unit> mo14180K8() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    /* renamed from: Pl */
    public void m36360Pl(ViewGroup viewGroup, List<String> list) {
        InterfaceC41546gT3.C20870a.m39365a(this, viewGroup, list);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: Y5 */
    public void mo14179Y5() {
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: e9 */
    public void mo14178e9(WirePhysicalLock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        String combination = lock.getCombination();
        if (combination != null) {
            this.f85277b.f22561b.setText(combination);
        }
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: hg */
    public Observable<Unit> mo14177hg() {
        return this.f85277b.f22562c.m54693b();
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: r0 */
    public Observable<Unit> mo14176r0() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: s3 */
    public Observable<Unit> mo14175s3() {
        return this.f85277b.f22562c.m54687h();
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: sl */
    public void mo14174sl(WirePhysicalLock lock) {
        List<String> unlockInstructions;
        int i;
        Intrinsics.checkNotNullParameter(lock, "lock");
        ViewStub viewStub = this.f85277b.f22563d;
        boolean z = false;
        if (lock.getUnlockInstructions() != null && (!unlockInstructions.isEmpty())) {
            z = true;
        }
        if (z) {
            i = C39311cj4.view_stub_dynamic_lock_steps;
        } else {
            String kind = lock.getKind();
            if (Intrinsics.areEqual(kind, PhysicalLockKind.CARABINER.name())) {
                i = C39311cj4.view_stub_carabiner_lock_unlock_steps;
            } else if (Intrinsics.areEqual(kind, PhysicalLockKind.COMBINATION.name())) {
                i = C39311cj4.view_stub_master_lock_unlock_steps;
            } else {
                i = C39311cj4.view_stub_master_lock_unlock_steps;
            }
        }
        viewStub.setLayoutResource(i);
        View inflate = this.f85277b.f22563d.inflate();
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        List<String> unlockInstructions2 = lock.getUnlockInstructions();
        if (unlockInstructions2 != null) {
            if (!(!unlockInstructions2.isEmpty())) {
                unlockInstructions2 = null;
            }
            if (unlockInstructions2 != null) {
                m36360Pl(viewGroup, unlockInstructions2);
            }
        }
    }
}
