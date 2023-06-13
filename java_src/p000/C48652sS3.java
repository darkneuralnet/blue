package p000;

import android.graphics.BlurMaskFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLock;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LsS3;", "LxE;", "LgT3;", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "e9", "Lio/reactivex/Observable;", "K8", "hg", "s3", "r0", "", "title", "E", "Y5", "sl", "LK4;", "b", "LK4;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LK4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockBlurUnlockUiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockBlurUnlockUiImpl.kt\nco/bird/android/app/feature/physicallock/PhysicalLockBlurUnlockUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1864#2,3:80\n*S KotlinDebug\n*F\n+ 1 PhysicalLockBlurUnlockUiImpl.kt\nco/bird/android/app/feature/physicallock/PhysicalLockBlurUnlockUiImpl\n*L\n69#1:80,3\n*E\n"})
/* renamed from: sS3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48652sS3 extends AbstractC30071xE implements InterfaceC41546gT3 {

    /* renamed from: b */
    public final C4329K4 f108831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48652sS3(BaseActivity activity, C4329K4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f108831b = binding;
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
        LinearLayout linearLayout = this.f108831b.f19022i;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.physicalLockTextContainer");
        return C44626lf5.clicksThrottle$default(linearLayout, 0L, 1, null);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: Y5 */
    public void mo14179Y5() {
        this.f108831b.f19022i.setEnabled(false);
        this.f108831b.f19020g.setVisibility(0);
        this.f108831b.f19021h.setVisibility(4);
        this.f108831b.f19023j.setVisibility(8);
        this.f108831b.f19016c.setVisibility(0);
        this.f108831b.f19018e.setVisibility(0);
        this.f108831b.f19015b.setVisibility(8);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: e9 */
    public void mo14178e9(WirePhysicalLock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f108831b.getRoot();
        String combination = lock.getCombination();
        if (combination != null) {
            this.f108831b.f19020g.setText(combination);
        }
        this.f108831b.f19021h.setLayerType(1, null);
        this.f108831b.f19021h.getPaint().setMaskFilter(new BlurMaskFilter(24.0f, BlurMaskFilter.Blur.NORMAL));
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: hg */
    public Observable<Unit> mo14177hg() {
        Button button = this.f108831b.f19016c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.doneButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: r0 */
    public Observable<Unit> mo14176r0() {
        Button button = this.f108831b.f19018e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.getHelpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: s3 */
    public Observable<Unit> mo14175s3() {
        Button button = this.f108831b.f19015b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.birdAlreadyUnlocked");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC41546gT3
    /* renamed from: sl */
    public void mo14174sl(WirePhysicalLock lock) {
        boolean z;
        List<String> asList;
        Intrinsics.checkNotNullParameter(lock, "lock");
        LayoutInflater from = LayoutInflater.from(getActivity());
        List<String> unlockInstructions = lock.getUnlockInstructions();
        if (unlockInstructions != null && !unlockInstructions.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            asList = lock.getUnlockInstructions();
            Intrinsics.checkNotNull(asList);
        } else {
            String[] stringArray = getActivity().getResources().getStringArray(C42846if4.physical_lock_blurred_code_unlock_fallback_instructions);
            Intrinsics.checkNotNullExpressionValue(stringArray, "activity.resources.getSt…ck_fallback_instructions)");
            asList = ArraysKt___ArraysJvmKt.asList(stringArray);
        }
        int i = 0;
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View inflate = from.inflate(C39311cj4.item_physical_lock_blurred_code_instruction, (ViewGroup) this.f108831b.f19019f, false);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            ((TextView) C49520tu6.m11243h(viewGroup, C36585Vg4.step_index_label)).setText(viewGroup.getResources().getString(LQ5.m96945a(i2)));
            ((TextView) C49520tu6.m11243h(viewGroup, C36585Vg4.step_instruction)).setText((String) obj);
            this.f108831b.f19019f.addView(viewGroup);
            i = i2;
        }
    }
}
