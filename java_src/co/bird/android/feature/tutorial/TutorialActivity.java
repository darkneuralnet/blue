package co.bird.android.feature.tutorial;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.tutorial.InterfaceC15879b;
import co.bird.android.model.constant.TutorialType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.AbstractC23442F;
import io.reactivex.subjects.C24567g;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import me.relex.circleindicator.CircleIndicator3;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00050\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Lco/bird/android/feature/tutorial/TutorialActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LOa6;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LPa6;", TransferTable.COLUMN_STATE, "R", "Lio/reactivex/F;", "C5", "LNa6;", "j", "LNa6;", "Q", "()LNa6;", "setPresenter", "(LNa6;)V", "presenter", "LFa6;", "k", "LFa6;", "P", "()LFa6;", "setGenerator", "(LFa6;)V", "generator", "Lo6;", "l", "Lo6;", "binding", "LDa6;", "m", "LDa6;", "adapter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "n", "Lio/reactivex/subjects/g;", "tutorialFinishSubject", "<init>", "()V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialActivity.kt\nco/bird/android/feature/tutorial/TutorialActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n6#2:106\n1#3:107\n13#4,2:108\n15#4,2:112\n1109#5,2:110\n*S KotlinDebug\n*F\n+ 1 TutorialActivity.kt\nco/bird/android/feature/tutorial/TutorialActivity\n*L\n36#1:106\n36#1:107\n36#1:108,2\n36#1:112,2\n36#1:110,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialActivity extends BaseActivityLite implements InterfaceC34895Oa6 {

    /* renamed from: j */
    public AbstractC34661Na6 f65843j;

    /* renamed from: k */
    public C32789Fa6 f65844k;

    /* renamed from: l */
    public C26816o6 f65845l;

    /* renamed from: m */
    public final C32321Da6 f65846m = new C32321Da6();

    /* renamed from: n */
    public final C24567g<Unit> f65847n;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/feature/tutorial/TutorialActivity$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "c", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.tutorial.TutorialActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15870a extends ViewPager2.AbstractC12103i {
        public C15870a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            String string;
            C26816o6 c26816o6 = TutorialActivity.this.f65845l;
            if (c26816o6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26816o6 = null;
            }
            Button button = c26816o6.f101367c;
            String m110146p = TutorialActivity.this.f65846m.m110146p(i);
            if (m110146p == null) {
                if (i == TutorialActivity.this.f65846m.getItemCount() - 1) {
                    string = TutorialActivity.this.getString(C45871nl4.general_done);
                } else {
                    string = TutorialActivity.this.getString(C45871nl4.general_next_button);
                }
                m110146p = string;
            }
            button.setText(m110146p);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/feature/tutorial/TutorialActivity$b", "Landroidx/recyclerview/widget/RecyclerView$j;", "", "onChanged", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.tutorial.TutorialActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15871b extends RecyclerView.AbstractC11846j {
        public C15871b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            if (TutorialActivity.this.f65846m.getItemCount() > 1) {
                C26816o6 c26816o6 = TutorialActivity.this.f65845l;
                C26816o6 c26816o62 = null;
                if (c26816o6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c26816o6 = null;
                }
                CircleIndicator3 circleIndicator3 = c26816o6.f101368d;
                int itemCount = TutorialActivity.this.f65846m.getItemCount();
                C26816o6 c26816o63 = TutorialActivity.this.f65845l;
                if (c26816o63 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c26816o62 = c26816o63;
                }
                circleIndicator3.mo25274f(itemCount, c26816o62.f101369e.m65700d());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.tutorial.TutorialActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15872c extends Lambda implements Function1<View, Unit> {
        public C15872c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C26816o6 c26816o6 = TutorialActivity.this.f65845l;
            C26816o6 c26816o62 = null;
            if (c26816o6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26816o6 = null;
            }
            if (c26816o6.f101369e.m65700d() + 1 < TutorialActivity.this.f65846m.getItemCount()) {
                C26816o6 c26816o63 = TutorialActivity.this.f65845l;
                if (c26816o63 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c26816o62 = c26816o63;
                }
                ViewPager2 viewPager2 = c26816o62.f101369e;
                viewPager2.setCurrentItem(viewPager2.m65700d() + 1);
                return;
            }
            TutorialActivity.this.f65847n.onSuccess(Unit.INSTANCE);
        }
    }

    public TutorialActivity() {
        C24567g<Unit> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<Unit>()");
        this.f65847n = m31882w0;
    }

    @Override // p000.InterfaceC34895Oa6
    /* renamed from: C5 */
    public AbstractC23442F<Unit> mo56352C5() {
        AbstractC23442F<Unit> m33160F = this.f65847n.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "tutorialFinishSubject.hide()");
        return m33160F;
    }

    /* renamed from: P */
    public final C32789Fa6 m56351P() {
        C32789Fa6 c32789Fa6 = this.f65844k;
        if (c32789Fa6 != null) {
            return c32789Fa6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generator");
        return null;
    }

    /* renamed from: Q */
    public final AbstractC34661Na6 m56350Q() {
        AbstractC34661Na6 abstractC34661Na6 = this.f65843j;
        if (abstractC34661Na6 != null) {
            return abstractC34661Na6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(AbstractC35129Pa6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, D22.f5104a)) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo70243D(C45871nl4.damage_nests_tutorial_title);
            }
            this.f65846m.m110147o(m56351P().m106929c());
        } else if (Intrinsics.areEqual(state, B22.f1558a)) {
            ActionBar supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.mo70243D(C45871nl4.damage_nests_damaged_bird);
            }
            this.f65846m.m110147o(m56351P().m106931a());
        } else if (state instanceof C22) {
            ActionBar supportActionBar3 = getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.mo70243D(C45871nl4.group_rides);
            }
            this.f65846m.m110147o(m56351P().m106930b(((C22) state).m112957b()));
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r7;
        boolean equals;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("tutorial_type");
        C26816o6 c26816o6 = null;
        if (stringExtra != null) {
            try {
                Object[] enumConstants = TutorialType.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r7 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = TutorialType.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r7 = (Enum) obj2;
                    if (Intrinsics.areEqual(r7.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r7 = null;
        TutorialType tutorialType = (TutorialType) r7;
        if (tutorialType == null) {
            finish();
            return;
        }
        InterfaceC15879b.InterfaceC15880a m56348a = C15873a.m56348a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56348a.mo56341a(c46172oG2.m21419a(application), new C33257Ha6(tutorialType)).mo56342a(this);
        C26816o6 m21797c = C26816o6.m21797c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m21797c, "inflate(layoutInflater)");
        this.f65845l = m21797c;
        if (m21797c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m21797c = null;
        }
        setContentView(m21797c.getRoot());
        mo58977D();
        C26816o6 c26816o62 = this.f65845l;
        if (c26816o62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26816o62 = null;
        }
        c26816o62.f101369e.m65690n(new C15870a());
        C26816o6 c26816o63 = this.f65845l;
        if (c26816o63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26816o63 = null;
        }
        c26816o63.f101369e.setUserInputEnabled(false);
        C26816o6 c26816o64 = this.f65845l;
        if (c26816o64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26816o64 = null;
        }
        c26816o64.f101369e.setAdapter(this.f65846m);
        C26816o6 c26816o65 = this.f65845l;
        if (c26816o65 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26816o65 = null;
        }
        CircleIndicator3 circleIndicator3 = c26816o65.f101368d;
        C26816o6 c26816o66 = this.f65845l;
        if (c26816o66 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26816o66 = null;
        }
        circleIndicator3.setViewPager(c26816o66.f101369e);
        this.f65846m.registerAdapterDataObserver(new C15871b());
        C26816o6 c26816o67 = this.f65845l;
        if (c26816o67 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c26816o6 = c26816o67;
        }
        Button button = c26816o6.f101367c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.next");
        C34585Ms2.m94661j(button, new C15872c());
        m56350Q().consume(this);
    }
}
