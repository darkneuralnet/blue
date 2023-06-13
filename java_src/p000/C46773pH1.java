package p000;

import android.animation.ObjectAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountScan;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import p000.C53094zw3;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001\u0007B\u0019\b\u0007\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b<\u0010=J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0014H\u0016J \u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0019\u0012\u0004\u0012\u00020\u001d0\u001c0\u0014H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\u00150\u00150-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006?"}, m28432d2 = {"LpH1;", "LxE;", "LoH1;", "", "LH6;", "sections", "", "b", "", "scanned", "completed", "a4", "onResume", "onPause", "Il", "", "show", "Lk", "expectedScans", "R1", "Lio/reactivex/Observable;", "", "T", "B2", "n", "", "Lco/bird/android/model/persistence/HardCountScan;", "l8", "Lkotlin/Pair;", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "D6", "Ek", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "f9", "Lco/bird/android/model/HardCountStatus;", "status", "Za", "count", "S2", "v5", "Zj", "LH3;", "LH3;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "scanSubject", "LbF1;", DateTokenConverter.CONVERTER_KEY, "LbF1;", "adapter", "Landroid/animation/ObjectAnimator;", "e", "Landroid/animation/ObjectAnimator;", "progressAnimator", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LH3;)V", "f", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pH1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46773pH1 extends AbstractC30071xE implements InterfaceC46180oH1 {

    /* renamed from: f */
    public static final C27233b f103406f = new C27233b(null);

    /* renamed from: g */
    public static final Regex f103407g = new Regex(InstructionFileId.DOT);

    /* renamed from: b */
    public final C3013H3 f103408b;

    /* renamed from: c */
    public final C24558d<String> f103409c;

    /* renamed from: d */
    public final C38436bF1 f103410d;

    /* renamed from: e */
    public ObjectAnimator f103411e;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"pH1$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pH1$a */
    /* loaded from: classes3.dex */
    public static final class C27232a extends C39530d36 {
        public C27232a() {
        }

        @Override // p000.C39530d36, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            boolean isBlank;
            char last;
            CharSequence trim;
            Intrinsics.checkNotNullParameter(s, "s");
            isBlank = StringsKt__StringsJVMKt.isBlank(s);
            if (!isBlank) {
                last = StringsKt___StringsKt.last(s);
                if (!C46773pH1.f103407g.matches(String.valueOf(last))) {
                    C24558d c24558d = C46773pH1.this.f103409c;
                    trim = StringsKt__StringsKt.trim((CharSequence) s.toString());
                    c24558d.onNext(trim.toString());
                    C46773pH1.this.f103408b.f12762i.setText((CharSequence) null);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LpH1$b;", "", "Lkotlin/text/Regex;", "PERIPHERAL_NEGATIVE_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pH1$b */
    /* loaded from: classes3.dex */
    public static final class C27233b {
        public /* synthetic */ C27233b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27233b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46773pH1(BaseActivity activity, C3013H3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f103408b = binding;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f103409c = m31902e;
        C38436bF1 c38436bF1 = new C38436bF1();
        this.f103410d = c38436bF1;
        RecyclerView recyclerView = binding.f12765l;
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c38436bF1);
        binding.f12762i.addTextChangedListener(new C27232a());
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: B2 */
    public Observable<Unit> mo19591B2() {
        ImageView imageView = this.f103408b.f12767n;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.scanButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: D6 */
    public Observable<Pair<Collection<String>, InventoryScanningIdentifierCategory>> mo19590D6() {
        return this.f103410d.m64759w();
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: Ek */
    public Observable<Unit> mo19589Ek() {
        Button button = this.f103408b.f12766m;
        Intrinsics.checkNotNullExpressionValue(button, "binding.resetLap");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: Il */
    public void mo19588Il() {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.hard_count_limited_connectivity);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…unt_limited_connectivity)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: Lk */
    public void mo19587Lk(boolean z) {
        ConstraintLayout constraintLayout = this.f103408b.f12776w;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.wifiContainer");
        C49520tu6.show$default(constraintLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: R1 */
    public void mo19586R1(int i) {
        Group group = this.f103408b.f12757d;
        Intrinsics.checkNotNullExpressionValue(group, "binding.expectedScansGroup");
        C49520tu6.m11233r(group);
        this.f103408b.f12756c.setText(String.valueOf(i));
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: S2 */
    public void mo19585S2(int i) {
        this.f103408b.f12761h.setText(String.valueOf(i));
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: T */
    public Observable<String> mo19584T() {
        Observable<String> hide = this.f103409c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: Za */
    public void mo19583Za(HardCountStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f103408b.f12774u.setText(String.valueOf(status.getUserSuccessScans() + status.getUserFailedScans()));
        this.f103408b.f12758e.setText(String.valueOf(status.getUserFailedScans()));
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: Zj */
    public void mo19582Zj() {
        vibrate(1000L);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: a4 */
    public void mo19581a4(int i, int i2) {
        this.f103408b.f12763j.setMax(100);
        if (i > 0) {
            float f = (i2 / i) * 100;
            ObjectAnimator objectAnimator = this.f103411e;
            if (objectAnimator != null) {
                objectAnimator.end();
            }
            ProgressBar progressBar = this.f103408b.f12763j;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), (int) f);
            this.f103411e = ofInt;
            if (ofInt != null) {
                ofInt.setDuration(300L);
            }
            ObjectAnimator objectAnimator2 = this.f103411e;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
        if (i == i2 && i != 0) {
            this.f103408b.f12775v.setText(getActivity().getString(C45871nl4.hard_count_scans_upload_complete));
            this.f103408b.f12763j.setProgressDrawable(NA0.m94299e(getActivity(), C34011Kg4.hard_count_progressbar_finished));
        } else if (i != i2 && i != 0) {
            this.f103408b.f12775v.setText(getActivity().getString(C45871nl4.hard_count_pending_scan));
            this.f103408b.f12763j.setProgressDrawable(NA0.m94299e(getActivity(), C34011Kg4.hard_count_progressbar));
        } else {
            this.f103408b.f12775v.setText(getActivity().getString(C45871nl4.hard_count_ready_to_scan));
        }
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: b */
    public void mo19580b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f103410d.mo24871u(sections);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: f9 */
    public AbstractC23442F<DialogResponse> mo19579f9() {
        int i = C45268mk4.dialog_custom_cta;
        int i2 = C52955zi4.primaryButton;
        int i3 = C52955zi4.secondaryButton;
        int i4 = C52955zi4.icon;
        int i5 = C52955zi4.title;
        int i6 = C52955zi4.body;
        String string = getString(C45871nl4.hard_count_reset_lap_dialog_confirm, new Object[0]);
        String string2 = getString(C45871nl4.hard_count_reset_lap_dialog_title, new Object[0]);
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), string, getString(C45871nl4.hard_count_reset_lap_dialog_cancel, new Object[0]), null, string2, null, false, false, false, null, 32000, null);
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: l8 */
    public Observable<Collection<HardCountScan>> mo19578l8() {
        return this.f103410d.m64760v();
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: n */
    public Observable<Unit> mo19577n() {
        ImageView imageView = this.f103408b.f12755b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.codeButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC46180oH1
    public void onPause() {
        this.f103408b.f12762i.setText((CharSequence) null);
    }

    @Override // p000.InterfaceC46180oH1
    public void onResume() {
        this.f103408b.f12762i.requestFocus();
    }

    @Override // p000.InterfaceC46180oH1
    /* renamed from: v5 */
    public void mo19576v5() {
        vibrate(250L);
    }
}
