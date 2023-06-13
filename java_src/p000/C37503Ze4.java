package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizAnswer;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizNote;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\b\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00140\u00140\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LZe4;", "LOq;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lh0;", "U", "Lma4;", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;", "kotlin.jvm.PlatformType", "f", "Lma4;", "H", "()Lma4;", "checkBoxChanges", "", "g", "J", "quizAnsweredCorrectly", "K", "()Ljava/lang/Boolean;", "wrongOrRight", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,156:1\n1855#2,2:157\n180#3:159\n180#3:160\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter\n*L\n36#1:157,2\n67#1:159\n74#1:160\n*E\n"})
/* renamed from: Ze4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37503Ze4 extends AbstractC6187Oq {

    /* renamed from: f */
    public final C45168ma4<TutorialQuizAnswer> f48870f;

    /* renamed from: g */
    public final C45168ma4<Boolean> f48871g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LZe4$a;", "Lh0;", "", "position", "", "bind", "Lpb2;", "f", "Lpb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LZe4;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,156:1\n18#2:157\n9#3,4:158\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder\n*L\n119#1:157\n119#1:158,4\n*E\n"})
    /* renamed from: Ze4$a */
    /* loaded from: classes3.dex */
    public final class C10306a extends C22528h0 {

        /* renamed from: f */
        public final C46955pb2 f48872f;

        /* renamed from: g */
        public final /* synthetic */ C37503Ze4 f48873g;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "checkBox", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,156:1\n18#2:157\n9#3,4:158\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder$1\n*L\n109#1:157\n109#1:158,4\n*E\n"})
        /* renamed from: Ze4$a$a */
        /* loaded from: classes3.dex */
        public static final class C10307a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37503Ze4 f48874g;

            /* renamed from: h */
            public final /* synthetic */ C10306a f48875h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10307a(C37503Ze4 c37503Ze4, C10306a c10306a) {
                super(2);
                this.f48874g = c37503Ze4;
                this.f48875h = c10306a;
            }

            /* renamed from: a */
            public final void m72812a(CompoundButton compoundButton, boolean z) {
                C1737E6 m94545o = this.f48874g.m94545o();
                Integer safePosition = this.f48875h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof TutorialQuizAnswer)) {
                        m105816c = null;
                    }
                    TutorialQuizAnswer tutorialQuizAnswer = (TutorialQuizAnswer) m105816c;
                    if (tutorialQuizAnswer != null) {
                        C37503Ze4 c37503Ze4 = this.f48874g;
                        C41318g46.m40163a("check change clicked for answer: " + tutorialQuizAnswer + ", isChecked = " + z, new Object[0]);
                        c37503Ze4.m72821H().accept(TutorialQuizAnswer.copy$default(tutorialQuizAnswer, null, false, z, 3, null));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m72812a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10306a(C37503Ze4 c37503Ze4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f48873g = c37503Ze4;
            C46955pb2 m19092a = C46955pb2.m19092a(view);
            Intrinsics.checkNotNullExpressionValue(m19092a, "bind(view)");
            this.f48872f = m19092a;
            CheckBox checkBox = m19092a.f103830b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.answer");
            C34585Ms2.m94663h(checkBox, new C10307a(c37503Ze4, this));
        }

        @Override // p000.C22528h0
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f48873g.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TutorialQuizAnswer)) {
                m105816c = null;
            }
            TutorialQuizAnswer tutorialQuizAnswer = (TutorialQuizAnswer) m105816c;
            if (tutorialQuizAnswer != null) {
                C41318g46.m40163a("binding item for answer: " + tutorialQuizAnswer, new Object[0]);
                this.f48872f.f103830b.setText(tutorialQuizAnswer.getAnswer());
                this.f48872f.f103830b.setChecked(tutorialQuizAnswer.getSelected());
                this.f48872f.f103830b.setTag(Boolean.valueOf(tutorialQuizAnswer.getCorrect()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LZe4$b;", "Lh0;", "", "position", "", "bind", "LTe2;", "f", "LTe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LZe4;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$QuizNoteViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n18#2:157\n9#3,4:158\n1#4:162\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$QuizNoteViewHolder\n*L\n133#1:157\n133#1:158,4\n*E\n"})
    /* renamed from: Ze4$b */
    /* loaded from: classes3.dex */
    public final class C10308b extends C22528h0 {

        /* renamed from: f */
        public final C36097Te2 f48876f;

        /* renamed from: g */
        public final /* synthetic */ C37503Ze4 f48877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10308b(C37503Ze4 c37503Ze4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f48877g = c37503Ze4;
            C36097Te2 m83241a = C36097Te2.m83241a(view);
            Intrinsics.checkNotNullExpressionValue(m83241a, "bind(view)");
            this.f48876f = m83241a;
        }

        @Override // p000.C22528h0
        public void bind(int i) {
            boolean z;
            int i2;
            boolean z2;
            super.bind(i);
            Object m105816c = this.f48877g.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TutorialQuizNote)) {
                m105816c = null;
            }
            TutorialQuizNote tutorialQuizNote = (TutorialQuizNote) m105816c;
            if (tutorialQuizNote != null) {
                C37503Ze4 c37503Ze4 = this.f48877g;
                C41318g46.m40163a("binding note " + tutorialQuizNote, new Object[0]);
                Boolean m72819K = c37503Ze4.m72819K();
                boolean z3 = true;
                if (tutorialQuizNote.getAsset() != null) {
                    z = true;
                } else {
                    z = false;
                }
                TextView textView = this.f48876f.f35819c;
                String text = tutorialQuizNote.getText();
                if (!Boolean.valueOf(!z).booleanValue()) {
                    text = null;
                }
                textView.setText(text);
                TextView textView2 = this.f48876f.f35819c;
                Context context = getContext();
                if (Intrinsics.areEqual(m72819K, Boolean.TRUE)) {
                    i2 = C32364Df4.birdBlue;
                } else if (Intrinsics.areEqual(m72819K, Boolean.FALSE)) {
                    i2 = C32364Df4.birdRed;
                } else if (m72819K == null) {
                    i2 = C32364Df4.birdMatteBlack;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView2.setTextColor(context.getColor(i2));
                if (tutorialQuizNote.getBold()) {
                    TextView textView3 = this.f48876f.f35819c;
                    textView3.setTypeface(textView3.getTypeface(), 1);
                } else {
                    TextView textView4 = this.f48876f.f35819c;
                    textView4.setTypeface(textView4.getTypeface(), 0);
                }
                LegacyAsset asset = tutorialQuizNote.getAsset();
                if (asset != null) {
                    LottieAnimationView lottieAnimationView = this.f48876f.f35818b;
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.image");
                    C47331qD2.setMedia$default(lottieAnimationView, asset.getMedia(), null, 2, null);
                }
                LottieAnimationView lottieAnimationView2 = this.f48876f.f35818b;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "binding.image");
                C49520tu6.show$default(lottieAnimationView2, z, 0, 2, null);
                TextView textView5 = this.f48876f.f35819c;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.note");
                if (tutorialQuizNote.getText().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49520tu6.show$default(textView5, z2, 0, 2, null);
                ConstraintLayout root = this.f48876f.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                if (m72819K == null) {
                    z3 = false;
                }
                C49520tu6.show$default(root, z3, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ze4$c */
    /* loaded from: classes3.dex */
    public static final class C10309c extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C10309c f48878g = new C10309c();

        public C10309c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;", "kotlin.jvm.PlatformType", "updatedAnswer", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$onAttachedToRecyclerView$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n350#2,7:157\n1#3:164\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$onAttachedToRecyclerView$4\n*L\n78#1:157,7\n*E\n"})
    /* renamed from: Ze4$d */
    /* loaded from: classes3.dex */
    public static final class C10310d extends Lambda implements Function1<TutorialQuizAnswer, Unit> {
        public C10310d() {
            super(1);
        }

        /* renamed from: a */
        public final void m72811a(TutorialQuizAnswer tutorialQuizAnswer) {
            Integer num;
            TutorialQuizAnswer tutorialQuizAnswer2;
            String str;
            boolean z = false;
            C41318g46.m40163a("check change updated answer: " + tutorialQuizAnswer + " for data " + C37503Ze4.this, new Object[0]);
            Iterator<C2637G6> it = C37503Ze4.this.m94545o().m109394h().iterator();
            int i = 0;
            while (true) {
                num = null;
                if (it.hasNext()) {
                    Object m105816c = it.next().m105816c();
                    if (m105816c instanceof TutorialQuizAnswer) {
                        tutorialQuizAnswer2 = (TutorialQuizAnswer) m105816c;
                    } else {
                        tutorialQuizAnswer2 = null;
                    }
                    if (tutorialQuizAnswer2 != null) {
                        str = tutorialQuizAnswer2.getAnswer();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, tutorialQuizAnswer.getAnswer())) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() != -1) {
                z = true;
            }
            if (z) {
                num = valueOf;
            }
            if (num != null) {
                int intValue = num.intValue();
                C37503Ze4.this.m94545o().m109390l(intValue, C2637G6.copy$default(C37503Ze4.this.m94545o().m109397e(intValue), tutorialQuizAnswer, 0, false, 6, null));
                C37503Ze4.this.notifyDataSetChanged();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TutorialQuizAnswer tutorialQuizAnswer) {
            m72811a(tutorialQuizAnswer);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ze4$e */
    /* loaded from: classes3.dex */
    public static final class C10311e extends Lambda implements Function1<Throwable, Unit> {
        public C10311e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37503Ze4 c37503Ze4 = C37503Ze4.this;
            C41318g46.m40161c(th, "Error in checkBoxChanges stream for " + c37503Ze4 + ": ", new Object[0]);
        }
    }

    public C37503Ze4() {
        C45168ma4<TutorialQuizAnswer> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<TutorialQuizAnswer>()");
        this.f48870f = m25409g;
        C45168ma4<Boolean> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Boolean>()");
        this.f48871g = m25409g2;
    }

    /* renamed from: M */
    public static final void m72818M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m72817P(C37503Ze4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checkBoxChanges stream terminated for " + this$0, new Object[0]);
    }

    /* renamed from: Q */
    public static final void m72816Q(C37503Ze4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checkBoxChanges stream disposed for " + this$0, new Object[0]);
    }

    /* renamed from: R */
    public static final void m72815R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m72814S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public final C45168ma4<TutorialQuizAnswer> m72821H() {
        return this.f48870f;
    }

    /* renamed from: J */
    public final C45168ma4<Boolean> m72820J() {
        return this.f48871g;
    }

    /* renamed from: K */
    public final Boolean m72819K() {
        Iterator<T> it = m94545o().m109394h().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            TutorialQuizAnswer tutorialQuizAnswer = null;
            if (it.hasNext()) {
                Object m105816c = ((C2637G6) it.next()).m105816c();
                if (m105816c instanceof TutorialQuizAnswer) {
                    tutorialQuizAnswer = (TutorialQuizAnswer) m105816c;
                }
                if (tutorialQuizAnswer != null) {
                    if (tutorialQuizAnswer.getSelected() && !tutorialQuizAnswer.getCorrect()) {
                        C45168ma4<Boolean> c45168ma4 = this.f48871g;
                        Boolean bool = Boolean.FALSE;
                        c45168ma4.accept(bool);
                        return bool;
                    } else if (tutorialQuizAnswer.getCorrect()) {
                        i++;
                        if (tutorialQuizAnswer.getSelected()) {
                            i2++;
                        }
                    }
                }
            } else if (i == i2) {
                C45168ma4<Boolean> c45168ma42 = this.f48871g;
                Boolean bool2 = Boolean.TRUE;
                c45168ma42.accept(bool2);
                return bool2;
            } else {
                this.f48871g.accept(Boolean.FALSE);
                return null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: U */
    public C22528h0 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C36837Wi4.item_checkbox) {
            return new C10306a(this, m41761u);
        }
        if (i == C36837Wi4.item_quiz_note) {
            return new C10308b(this, m41761u);
        }
        return new C22528h0(m41761u);
    }

    @Override // p000.AbstractC6187Oq, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Observable<Boolean> observeOn = this.f48871g.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "quizAnsweredCorrectly\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10309c c10309c = C10309c.f48878g;
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ue4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37503Ze4.m72818M(Function1.this, obj);
            }
        });
        Observable<TutorialQuizAnswer> observeOn2 = this.f48870f.doOnTerminate(new InterfaceC23478a() { // from class: Ve4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C37503Ze4.m72817P(C37503Ze4.this);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: We4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C37503Ze4.m72816Q(C37503Ze4.this);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "checkBoxChanges\n      .d…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10310d c10310d = new C10310d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Xe4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37503Ze4.m72815R(Function1.this, obj);
            }
        };
        final C10311e c10311e = new C10311e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ye4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37503Ze4.m72814S(Function1.this, obj);
            }
        });
    }
}
