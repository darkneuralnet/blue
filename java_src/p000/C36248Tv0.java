package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.configurabletutorial.ConfigurableTutorialsActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import me.relex.circleindicator.CircleIndicator3;
import p000.C36248Tv0;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001\\B\u0007¢\u0006\u0004\bY\u0010ZJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00107\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000105050/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R.\u0010:\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000200 1*\n\u0012\u0004\u0012\u000200\u0018\u000108080/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R!\u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000200080;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010@R!\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010@R \u0010K\u001a\b\u0012\u0004\u0012\u0002050;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010@R!\u0010N\u001a\b\u0012\u0004\u0012\u00020<0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@R'\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0O0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@R \u0010U\u001a\b\u0012\u0004\u0012\u0002000;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010@R!\u0010X\u001a\b\u0012\u0004\u0012\u00020\f0;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010@¨\u0006]"}, m28432d2 = {"LTv0;", "Landroidx/fragment/app/Fragment;", "LFw0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/h;", "T0", "LKw0;", TransferTable.COLUMN_STATE, "A9", "LDw0;", "b", "LDw0;", "t8", "()LDw0;", "setPresenter", "(LDw0;)V", "presenter", "LPv0;", "c", "LPv0;", "N6", "()LPv0;", "setConverter", "(LPv0;)V", "converter", "LKv0;", DateTokenConverter.CONVERTER_KEY, "LKv0;", "a5", "()LKv0;", "setAdapter", "(LKv0;)V", "adapter", "LZx1;", "e", "LZx1;", "binding", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/d;", "tutorialFinishSubject", "", "g", "pageIndexSubject", "", "h", "tutorialIdSubject", "Lio/reactivex/Observable;", "", "i", "Lkotlin/Lazy;", "t2", "()Lio/reactivex/Observable;", "nextPageClicks", "j", "Lio/reactivex/Observable;", "g1", "tutorialIds", "k", "L", "skipClicks", "l", "l9", "currentPageIndex", "m", "t5", "messageListScrolledToBottom", "Lco/bird/android/buava/Optional;", "n", "G2", "quizAnsweredCorrectly", "o", "e5", "tutorialFinishes", "p", "h6", "helpClicks", "<init>", "()V", "q", C17296a.f69688o, "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialFragment.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,142:1\n1#2:143\n64#3:144\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialFragment.kt\nco/bird/android/feature/configurabletutorial/tutorial/ConfigurableTutorialFragment\n*L\n108#1:144\n*E\n"})
/* renamed from: Tv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36248Tv0 extends Fragment implements InterfaceC32981Fw0 {

    /* renamed from: q */
    public static final C8147a f36447q = new C8147a(null);

    /* renamed from: b */
    public C32513Dw0 f36448b;

    /* renamed from: c */
    public C35312Pv0 f36449c;

    /* renamed from: d */
    public C34142Kv0 f36450d;

    /* renamed from: e */
    public C37671Zx1 f36451e;

    /* renamed from: f */
    public final C24558d<String> f36452f;

    /* renamed from: g */
    public final C24558d<Integer> f36453g;

    /* renamed from: h */
    public final C24558d<List<String>> f36454h;

    /* renamed from: i */
    public final Lazy f36455i;

    /* renamed from: j */
    public final Observable<List<String>> f36456j;

    /* renamed from: k */
    public final Lazy f36457k;

    /* renamed from: l */
    public final Observable<Integer> f36458l;

    /* renamed from: m */
    public final Lazy f36459m;

    /* renamed from: n */
    public final Lazy f36460n;

    /* renamed from: o */
    public final Observable<String> f36461o;

    /* renamed from: p */
    public final Lazy f36462p;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LTv0$a;", "", "", "", "tutorialIds", "LTv0;", C17296a.f69688o, "TUTORIAL_IDS", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$a */
    /* loaded from: classes3.dex */
    public static final class C8147a {
        public /* synthetic */ C8147a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36248Tv0 m82252a(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            C36248Tv0 c36248Tv0 = new C36248Tv0();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("tutorial_ids", C44691lm0.m26849a(tutorialIds));
            c36248Tv0.setArguments(bundle);
            return c36248Tv0;
        }

        private C8147a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$b */
    /* loaded from: classes3.dex */
    public static final class C8148b extends Lambda implements Function0<Observable<Unit>> {
        public C8148b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C37671Zx1 c37671Zx1 = C36248Tv0.this.f36451e;
            if (c37671Zx1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx1 = null;
            }
            Button button = c37671Zx1.f49511c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.help");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$c */
    /* loaded from: classes3.dex */
    public static final class C8149c extends Lambda implements Function0<Observable<Boolean>> {
        public C8149c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            C34142Kv0 m82260a5 = C36248Tv0.this.m82260a5();
            C37671Zx1 c37671Zx1 = C36248Tv0.this.f36451e;
            if (c37671Zx1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx1 = null;
            }
            return m82260a5.m98177E(c37671Zx1.f49516h.m65700d() + 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$d */
    /* loaded from: classes3.dex */
    public static final class C8150d extends Lambda implements Function0<Observable<Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Tv0$d$a */
        /* loaded from: classes3.dex */
        public static final class C8151a extends Lambda implements Function1<Unit, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C36248Tv0 f36466g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8151a(C36248Tv0 c36248Tv0) {
                super(1);
                this.f36466g = c36248Tv0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C37671Zx1 c37671Zx1 = this.f36466g.f36451e;
                if (c37671Zx1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c37671Zx1 = null;
                }
                boolean z = true;
                if (c37671Zx1.f49516h.m65700d() != this.f36466g.m82260a5().getItemCount() - 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C8150d() {
            super(0);
        }

        /* renamed from: c */
        public static final Boolean m82247c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            C37671Zx1 c37671Zx1 = C36248Tv0.this.f36451e;
            if (c37671Zx1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx1 = null;
            }
            Button button = c37671Zx1.f49512d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.next");
            Observable<Unit> m25214a = C45219mf5.m25214a(button);
            final C8151a c8151a = new C8151a(C36248Tv0.this);
            return m25214a.map(new InterfaceC23492o() { // from class: Uv0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m82247c;
                    m82247c = C36248Tv0.C8150d.m82247c(Function1.this, obj);
                    return m82247c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Tv0$e", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "c", TransferTable.COLUMN_STATE, C17296a.f69688o, "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$e */
    /* loaded from: classes3.dex */
    public static final class C8152e extends ViewPager2.AbstractC12103i {
        public C8152e() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: a */
        public void mo48696a(int i) {
            C37671Zx1 c37671Zx1 = C36248Tv0.this.f36451e;
            if (c37671Zx1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx1 = null;
            }
            c37671Zx1.f49512d.setEnabled(i == 0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            C36248Tv0.this.f36453g.onNext(Integer.valueOf(i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$f */
    /* loaded from: classes3.dex */
    public static final class C8153f extends Lambda implements Function0<Observable<Optional<Boolean>>> {
        public C8153f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Optional<Boolean>> invoke() {
            return C36248Tv0.this.m82260a5().m98174J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tv0$g */
    /* loaded from: classes3.dex */
    public static final class C8154g extends Lambda implements Function0<Observable<Unit>> {
        public C8154g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C37671Zx1 c37671Zx1 = C36248Tv0.this.f36451e;
            if (c37671Zx1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx1 = null;
            }
            Button button = c37671Zx1.f49515g;
            Intrinsics.checkNotNullExpressionValue(button, "binding.skip");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    public C36248Tv0() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f36452f = m31902e;
        C24558d<Integer> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Int>()");
        this.f36453g = m31902e2;
        C24558d<List<String>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<List<String>>()");
        this.f36454h = m31902e3;
        lazy = LazyKt__LazyJVMKt.lazy(new C8150d());
        this.f36455i = lazy;
        Observable<List<String>> hide = m31902e3.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "tutorialIdSubject.hide()");
        this.f36456j = hide;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C8154g());
        this.f36457k = lazy2;
        Observable<Integer> hide2 = m31902e2.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "pageIndexSubject.hide()");
        this.f36458l = hide2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C8149c());
        this.f36459m = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C8153f());
        this.f36460n = lazy4;
        Observable<String> hide3 = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide3, "tutorialFinishSubject.hide()");
        this.f36461o = hide3;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C8148b());
        this.f36462p = lazy5;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: A9 */
    public void render(InterfaceC34151Kw0 state) {
        FragmentActivity activity;
        C47900rA5 c47900rA5;
        Intrinsics.checkNotNullParameter(state, "state");
        C37671Zx1 c37671Zx1 = null;
        if (state instanceof C48706sY3) {
            C48706sY3 c48706sY3 = (C48706sY3) state;
            m82260a5().mo24871u(m82261N6().m89428b(c48706sY3.m14040a()));
            C37671Zx1 c37671Zx12 = this.f36451e;
            if (c37671Zx12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx12;
            }
            c37671Zx1.f49513e.mo25274f(c48706sY3.m14040a().size(), 0);
        } else if (state instanceof SD3) {
            C37671Zx1 c37671Zx13 = this.f36451e;
            if (c37671Zx13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx13;
            }
            SD3 sd3 = (SD3) state;
            c37671Zx1.f49513e.mo25274f(sd3.m85830b(), sd3.m85831a());
        } else if (state instanceof C40169e83) {
            C37671Zx1 c37671Zx14 = this.f36451e;
            if (c37671Zx14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx14 = null;
            }
            ViewPager2 viewPager2 = c37671Zx14.f49516h;
            viewPager2.setCurrentItem(viewPager2.m65700d() + 1);
            C37671Zx1 c37671Zx15 = this.f36451e;
            if (c37671Zx15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx15 = null;
            }
            CircleIndicator3 circleIndicator3 = c37671Zx15.f49513e;
            int m43192a = ((C40169e83) state).m43192a();
            C37671Zx1 c37671Zx16 = this.f36451e;
            if (c37671Zx16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx16;
            }
            circleIndicator3.mo25274f(m43192a, c37671Zx1.f49516h.m65700d());
        } else if (state instanceof R51) {
            this.f36452f.onNext(((R51) state).m87328a());
        } else if (state instanceof C48492sA5) {
            C37671Zx1 c37671Zx17 = this.f36451e;
            if (c37671Zx17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx17 = null;
            }
            Button button = c37671Zx17.f49515g;
            Intrinsics.checkNotNullExpressionValue(button, "binding.skip");
            C49520tu6.show$default(button, ((C48492sA5) state).m14594a(), 0, 2, null);
        } else if (state instanceof C34849Nv5) {
            C37671Zx1 c37671Zx18 = this.f36451e;
            if (c37671Zx18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx18;
            }
            c37671Zx1.f49512d.setText(((C34849Nv5) state).m93191a());
        } else if (state instanceof C37189Xv5) {
            C37671Zx1 c37671Zx19 = this.f36451e;
            if (c37671Zx19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx19 = null;
            }
            c37671Zx19.f49511c.setText(((C37189Xv5) state).m76098a());
            C37671Zx1 c37671Zx110 = this.f36451e;
            if (c37671Zx110 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx110;
            }
            Button button2 = c37671Zx1.f49511c;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.help");
            C49520tu6.m11233r(button2);
        } else if (state instanceof JM1) {
            C37671Zx1 c37671Zx111 = this.f36451e;
            if (c37671Zx111 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx111 = null;
            }
            Button button3 = c37671Zx111.f49511c;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.help");
            C49520tu6.show$default(button3, false, 0, 2, null);
        } else if (state instanceof C47900rA5) {
            C37671Zx1 c37671Zx112 = this.f36451e;
            if (c37671Zx112 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx112 = null;
            }
            TextView textView = c37671Zx112.f49514f;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.scrollDownAgree");
            C49520tu6.show$default(textView, ((C47900rA5) state).m16290a(), 0, 2, null);
            C37671Zx1 c37671Zx113 = this.f36451e;
            if (c37671Zx113 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx113 = null;
            }
            Button button4 = c37671Zx113.f49512d;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.next");
            C49520tu6.show$default(button4, !c47900rA5.m16290a(), 0, 2, null);
            C37671Zx1 c37671Zx114 = this.f36451e;
            if (c37671Zx114 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx114;
            }
            Button button5 = c37671Zx1.f49515g;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.skip");
            C49520tu6.m11239l(button5);
        } else if (state instanceof IM1) {
            C37671Zx1 c37671Zx115 = this.f36451e;
            if (c37671Zx115 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c37671Zx115 = null;
            }
            Button button6 = c37671Zx115.f49512d;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.next");
            C49520tu6.show$default(button6, false, 0, 2, null);
        } else if (state instanceof C37693Zz5) {
            C37671Zx1 c37671Zx116 = this.f36451e;
            if (c37671Zx116 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c37671Zx1 = c37671Zx116;
            }
            Button button7 = c37671Zx1.f49512d;
            Intrinsics.checkNotNullExpressionValue(button7, "binding.next");
            C49520tu6.m11233r(button7);
        } else if ((state instanceof C39460cw5) && (activity = getActivity()) != null) {
            activity.setTitle(((C39460cw5) state).m44807a());
        }
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: G2 */
    public Observable<Optional<Boolean>> mo82263G2() {
        return (Observable) this.f36460n.getValue();
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: L */
    public Observable<Unit> mo82262L() {
        return (Observable) this.f36457k.getValue();
    }

    /* renamed from: N6 */
    public final C35312Pv0 m82261N6() {
        C35312Pv0 c35312Pv0 = this.f36449c;
        if (c35312Pv0 != null) {
            return c35312Pv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final C34142Kv0 m82260a5() {
        C34142Kv0 c34142Kv0 = this.f36450d;
        if (c34142Kv0 != null) {
            return c34142Kv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: e5 */
    public Observable<String> mo82259e5() {
        return this.f36461o;
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: g1 */
    public Observable<List<String>> mo82258g1() {
        return this.f36456j;
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: h6 */
    public Observable<Unit> mo82257h6() {
        return (Observable) this.f36462p.getValue();
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: l9 */
    public Observable<Integer> mo82256l9() {
        return this.f36458l;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C37671Zx1.m72283c(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ConfigurableTutorialsActivity configurableTutorialsActivity;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C37671Zx1 m72285a = C37671Zx1.m72285a(view);
        Intrinsics.checkNotNullExpressionValue(m72285a, "bind(view)");
        this.f36451e = m72285a;
        FragmentActivity activity = getActivity();
        C37671Zx1 c37671Zx1 = null;
        if (activity instanceof ConfigurableTutorialsActivity) {
            configurableTutorialsActivity = (ConfigurableTutorialsActivity) activity;
        } else {
            configurableTutorialsActivity = null;
        }
        if (configurableTutorialsActivity == null) {
            return;
        }
        configurableTutorialsActivity.m58406P().mo58401b(this);
        C37671Zx1 c37671Zx12 = this.f36451e;
        if (c37671Zx12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c37671Zx12 = null;
        }
        c37671Zx12.f49516h.setUserInputEnabled(false);
        C37671Zx1 c37671Zx13 = this.f36451e;
        if (c37671Zx13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c37671Zx13 = null;
        }
        c37671Zx13.f49516h.setAdapter(m82260a5());
        C37671Zx1 c37671Zx14 = this.f36451e;
        if (c37671Zx14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c37671Zx14 = null;
        }
        CircleIndicator3 circleIndicator3 = c37671Zx14.f49513e;
        C37671Zx1 c37671Zx15 = this.f36451e;
        if (c37671Zx15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c37671Zx15 = null;
        }
        circleIndicator3.setViewPager(c37671Zx15.f49516h);
        C37671Zx1 c37671Zx16 = this.f36451e;
        if (c37671Zx16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c37671Zx1 = c37671Zx16;
        }
        c37671Zx1.f49516h.m65690n(new C8152e());
        m82253t8().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("tutorial_ids")) != null) {
            this.f36454h.onNext(stringArrayList);
        }
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: t2 */
    public Observable<Boolean> mo82255t2() {
        Object value = this.f36455i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-nextPageClicks>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC32981Fw0
    /* renamed from: t5 */
    public Observable<Boolean> mo82254t5() {
        return (Observable) this.f36459m.getValue();
    }

    /* renamed from: t8 */
    public final C32513Dw0 m82253t8() {
        C32513Dw0 c32513Dw0 = this.f36448b;
        if (c32513Dw0 != null) {
            return c32513Dw0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }
}
