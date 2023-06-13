package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR.\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \r*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LMw0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "", "", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "tutorialsRelay", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mw0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34619Mw0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<List<String>> f23845c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LMw0$a;", "Lw1;", "", "position", "", "bind", "LXf2;", "b", "LXf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LMw0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialViewerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerAdapter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerAdapter$TutorialContextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialViewerAdapter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerAdapter$TutorialContextViewHolder\n*L\n46#1:64\n46#1:65,4\n*E\n"})
    /* renamed from: Mw0$a */
    /* loaded from: classes3.dex */
    public final class C5434a extends C29735w1 {

        /* renamed from: b */
        public final C37042Xf2 f23846b;

        /* renamed from: c */
        public final /* synthetic */ C34619Mw0 f23847c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nConfigurableTutorialViewerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialViewerAdapter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerAdapter$TutorialContextViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1549#4:69\n1620#4,3:70\n1#5:73\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialViewerAdapter.kt\nco/bird/android/feature/configurabletutorial/viewer/adapters/ConfigurableTutorialViewerAdapter$TutorialContextViewHolder$1\n*L\n37#1:64\n37#1:65,4\n39#1:69\n39#1:70,3\n*E\n"})
        /* renamed from: Mw0$a$a */
        /* loaded from: classes3.dex */
        public static final class C5435a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34619Mw0 f23848g;

            /* renamed from: h */
            public final /* synthetic */ C5434a f23849h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5435a(C34619Mw0 c34619Mw0, C5434a c5434a) {
                super(1);
                this.f23848g = c34619Mw0;
                this.f23849h = c5434a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                List list;
                int collectionSizeOrDefault;
                C1737E6 m94545o = this.f23848g.m94545o();
                Integer safePosition = this.f23849h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair == null || (list = (List) pair.getSecond()) == null) {
                        return;
                    }
                    List<Tutorial> list2 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Tutorial tutorial : list2) {
                        arrayList.add(tutorial.getId());
                    }
                    this.f23848g.f23845c.accept(arrayList);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "word", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mw0$a$b */
        /* loaded from: classes3.dex */
        public static final class C5436b extends Lambda implements Function1<String, CharSequence> {

            /* renamed from: g */
            public static final C5436b f23850g = new C5436b();

            public C5436b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String word) {
                String valueOf;
                Intrinsics.checkNotNullParameter(word, "word");
                if (word.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = word.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        valueOf = CharsKt__CharJVMKt.titlecase(charAt, locale);
                    } else {
                        valueOf = String.valueOf(charAt);
                    }
                    sb.append((Object) valueOf);
                    String substring = word.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    return sb.toString();
                }
                return word;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5434a(C34619Mw0 c34619Mw0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f23847c = c34619Mw0;
            C37042Xf2 m76724a = C37042Xf2.m76724a(view);
            Intrinsics.checkNotNullExpressionValue(m76724a, "bind(view)");
            this.f23846b = m76724a;
            Button button = m76724a.f43543b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.context");
            C34585Ms2.m94661j(button, new C5435a(c34619Mw0, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ConfigurableTutorialContext configurableTutorialContext;
            List split$default;
            String joinToString$default;
            super.bind(i);
            Object m105816c = this.f23847c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null && (configurableTutorialContext = (ConfigurableTutorialContext) pair.getFirst()) != null) {
                String lowerCase = configurableTutorialContext.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                split$default = StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{"_"}, false, 0, 6, (Object) null);
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, C5436b.f23850g, 30, null);
                this.f23846b.f43543b.setText(joinToString$default);
            }
        }
    }

    public C34619Mw0() {
        C45168ma4<List<String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<String>>()");
        this.f23845c = m25409g;
    }

    /* renamed from: v */
    public final Observable<List<String>> m94553v() {
        Observable<List<String>> hide = this.f23845c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "tutorialsRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36837Wi4.item_tutorial_context ? new C5434a(this, m41761u) : new C29735w1(m41761u);
    }
}
