package co.bird.android.feature.configurabletutorial.viewer;

import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mrp.BaseActivityLite;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR'\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LVw0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LWw0;", TransferTable.COLUMN_STATE, "Q", "LUw0;", "j", "LUw0;", "P", "()LUw0;", "setPresenter", "(LUw0;)V", "presenter", "Lp3;", "k", "Lp3;", "binding", "LOw0;", "l", "LOw0;", "converter", "LMw0;", "m", "LMw0;", "adapter", "Lio/reactivex/Observable;", "", "", "n", "Lkotlin/Lazy;", "u9", "()Lio/reactivex/Observable;", "tutorialsClicks", "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialViewerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerActivity.kt\nco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* loaded from: classes3.dex */
public final class ConfigurableTutorialViewerActivity extends BaseActivityLite implements InterfaceC36725Vw0 {

    /* renamed from: j */
    public C36491Uw0 f63739j;

    /* renamed from: k */
    public C27136p3 f63740k;

    /* renamed from: l */
    public final C35087Ow0 f63741l = new C35087Ow0();

    /* renamed from: m */
    public final C34619Mw0 f63742m = new C34619Mw0();

    /* renamed from: n */
    public final Lazy f63743n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.configurabletutorial.viewer.ConfigurableTutorialViewerActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14756a extends Lambda implements Function0<Observable<List<? extends String>>> {
        public C14756a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<List<String>> invoke() {
            return ConfigurableTutorialViewerActivity.this.f63742m.m94553v();
        }
    }

    public ConfigurableTutorialViewerActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14756a());
        this.f63743n = lazy;
    }

    /* renamed from: P */
    public final C36491Uw0 m58390P() {
        C36491Uw0 c36491Uw0 = this.f63739j;
        if (c36491Uw0 != null) {
            return c36491Uw0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(InterfaceC36959Ww0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof C50780w22) && (state instanceof C45149mY3)) {
            this.f63742m.mo24871u(this.f63741l.m91182a(((C45149mY3) state).m25444b()));
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C40851fI0.m41612a().mo41608a(m58989H()).mo41611a(this);
        C27136p3 m20018c = C27136p3.m20018c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m20018c, "inflate(layoutInflater)");
        this.f63740k = m20018c;
        C27136p3 c27136p3 = null;
        if (m20018c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m20018c = null;
        }
        setContentView(m20018c.getRoot());
        mo58977D();
        C27136p3 c27136p32 = this.f63740k;
        if (c27136p32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27136p32 = null;
        }
        c27136p32.getRoot().setLayoutManager(new LinearLayoutManager(this));
        C27136p3 c27136p33 = this.f63740k;
        if (c27136p33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27136p33 = null;
        }
        c27136p33.getRoot().setAdapter(this.f63742m);
        C27136p3 c27136p34 = this.f63740k;
        if (c27136p34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c27136p3 = c27136p34;
        }
        c27136p3.getRoot().setItemAnimator(new C11894g());
        m58390P().consume(this);
    }

    @Override // p000.InterfaceC36725Vw0
    /* renamed from: u9 */
    public Observable<List<String>> mo58388u9() {
        return (Observable) this.f63743n.getValue();
    }
}
