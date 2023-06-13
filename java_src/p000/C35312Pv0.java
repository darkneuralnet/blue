package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ConfigurableTutorialType;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import co.bird.android.model.persistence.nestedstructures.TutorialQuiz;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizAnswer;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizNote;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0007\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¨\u0006\u0010"}, m28432d2 = {"LPv0;", "", "", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "pages", "LH6;", "b", "page", C17296a.f69688o, "Lco/bird/android/model/persistence/Tutorial;", "tutorials", "e", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialConverter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n1549#2:95\n1620#2,3:96\n1549#2:99\n1620#2,3:100\n1549#2:105\n1620#2,3:106\n1549#2:109\n1620#2,3:110\n37#3,2:103\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialConverter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialConverter\n*L\n13#1:91\n13#1:92,3\n38#1:95\n38#1:96,3\n62#1:99\n62#1:100,3\n75#1:105\n75#1:106,3\n81#1:109\n81#1:110,3\n67#1:103,2\n*E\n"})
/* renamed from: Pv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35312Pv0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pv0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6563a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfigurableTutorialType.values().length];
            try {
                iArr[ConfigurableTutorialType.TITLE_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfigurableTutorialType.BULLET_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfigurableTutorialType.CHAPTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConfigurableTutorialType.CHAPTER_OPTIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConfigurableTutorialType.QUIZ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConfigurableTutorialType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m89429a(TutorialPage page) {
        List<C3023H6> emptyList;
        Intrinsics.checkNotNullParameter(page, "page");
        int i = C6563a.$EnumSwitchMapping$0[page.getType().ordinal()];
        if (i != 2) {
            if (i != 5) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            return m89426d(page);
        }
        return m89427c(page);
    }

    /* renamed from: b */
    public final List<C3023H6> m89428b(List<TutorialPage> pages) {
        int collectionSizeOrDefault;
        int i;
        List mutableListOf;
        Intrinsics.checkNotNullParameter(pages, "pages");
        List<TutorialPage> list = pages;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TutorialPage tutorialPage : list) {
            switch (C6563a.$EnumSwitchMapping$0[tutorialPage.getType().ordinal()]) {
                case 1:
                    i = C36837Wi4.item_page_title_message;
                    break;
                case 2:
                    i = C36837Wi4.item_page_bullet_list;
                    break;
                case 3:
                case 4:
                    i = C36837Wi4.item_page_chapter;
                    break;
                case 5:
                    i = C36837Wi4.item_page_quiz;
                    break;
                case 6:
                    i = C36837Wi4.item_page_unknown;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(tutorialPage, i, false, 4, null));
            arrayList.add(new C3023H6(mutableListOf, null, null, 6, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        r1 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r11, new java.lang.String[]{"|"}, false, 0, 6, (java.lang.Object) null);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C3023H6> m89427c(TutorialPage tutorialPage) {
        C2637G6 c2637g6;
        Collection emptyList;
        List listOfNotNull;
        List mutableList;
        List<C3023H6> listOf;
        List split$default;
        int collectionSizeOrDefault;
        CharSequence trim;
        LegacyAsset asset = tutorialPage.getAsset();
        C2637G6 c2637g62 = null;
        if (asset != null) {
            c2637g6 = new C2637G6(asset, C36837Wi4.item_message_image, false, 4, null);
        } else {
            c2637g6 = null;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        String title = tutorialPage.getTitle();
        if (title != null) {
            c2637g62 = new C2637G6(title, C36837Wi4.item_message_title, false, 4, null);
        }
        spreadBuilder.add(c2637g62);
        String message = tutorialPage.getMessage();
        if (message != null && split$default != null) {
            List<String> list = split$default;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            emptyList = new ArrayList(collectionSizeOrDefault);
            for (String str : list) {
                trim = StringsKt__StringsKt.trim((CharSequence) str);
                emptyList.add(new C2637G6(trim.toString(), C36837Wi4.item_message_bullet, false, 4, null));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOf;
    }

    /* renamed from: d */
    public final List<C3023H6> m89426d(TutorialPage tutorialPage) {
        Collection emptyList;
        Collection emptyList2;
        List plus;
        List<C3023H6> listOf;
        List<TutorialQuizNote> notes;
        int collectionSizeOrDefault;
        List<TutorialQuizAnswer> answers;
        int collectionSizeOrDefault2;
        TutorialQuiz quiz = tutorialPage.getQuiz();
        if (quiz != null && (answers = quiz.getAnswers()) != null) {
            List<TutorialQuizAnswer> list = answers;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            emptyList = new ArrayList(collectionSizeOrDefault2);
            for (TutorialQuizAnswer tutorialQuizAnswer : list) {
                emptyList.add(new C2637G6(tutorialQuizAnswer, C36837Wi4.item_checkbox, false, 4, null));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        TutorialQuiz quiz2 = tutorialPage.getQuiz();
        if (quiz2 != null && (notes = quiz2.getNotes()) != null) {
            List<TutorialQuizNote> list2 = notes;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            emptyList2 = new ArrayList(collectionSizeOrDefault);
            for (TutorialQuizNote tutorialQuizNote : list2) {
                emptyList2.add(new C2637G6(tutorialQuizNote, C36837Wi4.item_quiz_note, false, 4, null));
            }
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus(emptyList, (Iterable) emptyList2);
        Intrinsics.checkNotNull(plus, "null cannot be cast to non-null type kotlin.collections.MutableList<co.bird.android.widget.adapter.AdapterItem>");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(TypeIntrinsics.asMutableList(plus), null, null, 6, null));
        return listOf;
    }

    /* renamed from: e */
    public final List<C3023H6> m89425e(List<Tutorial> tutorials) {
        int collectionSizeOrDefault;
        List mutableListOf;
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        List<Tutorial> list = tutorials;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Tutorial tutorial : list) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(tutorial, C36837Wi4.item_tutorial_card, false, 4, null));
            arrayList.add(new C3023H6(mutableListOf, null, null, 6, null));
        }
        return arrayList;
    }
}
