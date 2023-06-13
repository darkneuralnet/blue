package co.bird.android.feature.nestflagging;

import android.app.Application;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.nestflagging.InterfaceC15004b;
import co.bird.android.model.wire.WireFlagNestReason;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b3\u00104J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\nH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u000b0\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\r0\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b %*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f0\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R.\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 %*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, m28432d2 = {"Lco/bird/android/feature/nestflagging/NestFlaggingActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LA33;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LB33;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "", "N", "Lco/bird/android/model/wire/WireFlagNestReason;", "s", "Lco/bird/android/buava/Optional;", "y8", "", "E4", "c", "Lz33;", "j", "Lz33;", "P", "()Lz33;", "setPresenter", "(Lz33;)V", "presenter", "Lo33;", "k", "Lo33;", "converter", "Lm33;", "l", "Lm33;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "m", "Lma4;", "nestIdRelay", "n", "reasonSelectsRelay", "o", "commentUpdatesRelay", "p", "capacityUpdatesRelay", "LA3;", "q", "LA3;", "binding", "<init>", "()V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlaggingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingActivity.kt\nco/bird/android/feature/nestflagging/NestFlaggingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes3.dex */
public final class NestFlaggingActivity extends BaseActivityLite implements A33 {

    /* renamed from: j */
    public C52570z33 f64247j;

    /* renamed from: k */
    public final C46049o33 f64248k = new C46049o33();

    /* renamed from: l */
    public final C44863m33 f64249l = new C44863m33();

    /* renamed from: m */
    public final C45168ma4<String> f64250m;

    /* renamed from: n */
    public final C45168ma4<WireFlagNestReason> f64251n;

    /* renamed from: o */
    public final C45168ma4<Optional<String>> f64252o;

    /* renamed from: p */
    public final C45168ma4<Optional<Integer>> f64253p;

    /* renamed from: q */
    public C0011A3 f64254q;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.nestflagging.NestFlaggingActivity$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14998a extends FunctionReferenceImpl implements Function1<WireFlagNestReason, Unit> {
        public C14998a(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m57908a(WireFlagNestReason p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireFlagNestReason wireFlagNestReason) {
            m57908a(wireFlagNestReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "comment", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.nestflagging.NestFlaggingActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14999b extends Lambda implements Function1<String, Unit> {
        public C14999b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            NestFlaggingActivity.this.f64252o.accept(Optional.f63040c.m59033b(str));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "capacity", "", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.nestflagging.NestFlaggingActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15000c extends Lambda implements Function1<Integer, Unit> {
        public C15000c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            NestFlaggingActivity.this.f64253p.accept(Optional.f63040c.m59033b(num));
        }
    }

    public NestFlaggingActivity() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f64250m = m25409g;
        C45168ma4<WireFlagNestReason> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<WireFlagNestReason>()");
        this.f64251n = m25409g2;
        C45168ma4<Optional<String>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Optional<String>>()");
        this.f64252o = m25409g3;
        C45168ma4<Optional<Integer>> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Optional<Int>>()");
        this.f64253p = m25409g4;
    }

    @Override // p000.A33
    /* renamed from: E4 */
    public Observable<Optional<Integer>> mo57915E4() {
        Observable<Optional<Integer>> hide = this.f64253p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "capacityUpdatesRelay.hide()");
        return hide;
    }

    @Override // p000.A33
    /* renamed from: N */
    public Observable<String> mo57914N() {
        Observable<String> hide = this.f64250m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nestIdRelay.hide()");
        return hide;
    }

    /* renamed from: P */
    public final C52570z33 m57913P() {
        C52570z33 c52570z33 = this.f64247j;
        if (c52570z33 != null) {
            return c52570z33;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 == false) goto L16;
     */
    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(B33 state) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f64249l.mo24871u(this.f64248k.m21922a(state.m114765d(), state.m114764e(), state.m114767b(), state.m114763f()));
        C0011A3 c0011a3 = this.f64254q;
        if (c0011a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c0011a3 = null;
        }
        Button button = c0011a3.f58d;
        boolean z2 = false;
        if (state.m114764e() != null) {
            if (state.m114764e().getRequiresComment()) {
                String m114767b = state.m114767b();
                if (m114767b != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(m114767b);
                    if (!isBlank) {
                        z = true;
                    }
                }
                z = false;
            }
            z2 = true;
        }
        button.setEnabled(z2);
        Throwable m114766c = state.m114766c();
        if (m114766c != null) {
            C38689bg5.m64178c(m58990F(), m114766c);
        }
    }

    @Override // p000.A33
    /* renamed from: c */
    public Observable<Unit> mo57911c() {
        C0011A3 c0011a3 = this.f64254q;
        if (c0011a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c0011a3 = null;
        }
        Button button = c0011a3.f58d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.send");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC15004b.InterfaceC15005a m57907a = C15001a.m57907a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57907a.mo57903a(c46172oG2.m21419a(application)).mo57904a(this);
        C0011A3 m116166c = C0011A3.m116166c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m116166c, "inflate(layoutInflater)");
        this.f64254q = m116166c;
        C0011A3 c0011a3 = null;
        if (m116166c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m116166c = null;
        }
        setContentView(m116166c.getRoot());
        this.f64249l.m26422B(new C14998a(this.f64251n));
        this.f64249l.m26423A(new C14999b());
        this.f64249l.m26418y(new C15000c());
        C0011A3 c0011a32 = this.f64254q;
        if (c0011a32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c0011a32 = null;
        }
        c0011a32.f57c.setAdapter(this.f64249l);
        C0011A3 c0011a33 = this.f64254q;
        if (c0011a33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c0011a33 = null;
        }
        c0011a33.f57c.setLayoutManager(new LinearLayoutManager(this));
        C0011A3 c0011a34 = this.f64254q;
        if (c0011a34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c0011a3 = c0011a34;
        }
        c0011a3.f57c.setItemAnimator(new C11894g());
        m57913P().consume(this);
        String stringExtra = getIntent().getStringExtra("nest_id");
        if (stringExtra != null) {
            this.f64250m.accept(stringExtra);
        }
    }

    @Override // p000.A33
    /* renamed from: s */
    public Observable<WireFlagNestReason> mo57910s() {
        Observable<WireFlagNestReason> hide = this.f64251n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "reasonSelectsRelay.hide()");
        return hide;
    }

    @Override // p000.A33
    /* renamed from: y8 */
    public Observable<Optional<String>> mo57909y8() {
        Observable<Optional<String>> hide = this.f64252o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "commentUpdatesRelay.hide()");
        return hide;
    }
}
