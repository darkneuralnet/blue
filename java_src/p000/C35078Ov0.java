package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.ConfigurableTutorialType;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.TutorialUpdate;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import co.bird.android.model.persistence.nestedstructures.TutorialQuiz;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizAnswer;
import co.bird.android.model.persistence.nestedstructures.TutorialQuizNote;
import co.bird.android.model.wire.WireAssetMedia;
import co.bird.android.model.wire.WireLegacyAsset;
import co.bird.android.model.wire.WireTutorial;
import co.bird.android.model.wire.WireTutorialPage;
import co.bird.android.model.wire.WireTutorialQuiz;
import co.bird.android.model.wire.WireTutorialQuizAnswer;
import co.bird.android.model.wire.WireTutorialQuizNote;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\b\u001a\f\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000\u001a\n\u0010\u000f\u001a\u00020\f*\u00020\u000e\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0019\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorial;", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "groupHeader", "groupTitle", "groupMessage", "groupButtonText", "Lco/bird/android/model/persistence/Tutorial;", "b", "Lco/bird/android/model/persistence/TutorialUpdate;", "i", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", C17296a.f69688o, "Lco/bird/android/model/wire/WireTutorialPage;", "e", "Lco/bird/android/model/wire/WireTutorialQuiz;", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuiz;", "f", "Lco/bird/android/model/wire/WireTutorialQuizAnswer;", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;", "g", "Lco/bird/android/model/wire/WireTutorialQuizNote;", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizNote;", "h", "Lco/bird/android/model/wire/WireLegacyAsset;", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireAssetMedia;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "c", "co.bird.android.repository.configurable-tutorial"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialConversion.kt\nco/bird/android/repository/tutorial/converters/ConfigurableTutorialConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n1549#2:137\n1620#2,3:138\n1549#2:141\n1620#2,3:142\n1#3:136\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialConversion.kt\nco/bird/android/repository/tutorial/converters/ConfigurableTutorialConversionKt\n*L\n29#1:132\n29#1:133,3\n96#1:137\n96#1:138,3\n97#1:141\n97#1:142,3\n*E\n"})
/* renamed from: Ov0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35078Ov0 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r9 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TutorialPage m91193a(WireTutorial wireTutorial) {
        ConfigurableTutorialType configurableTutorialType;
        boolean z;
        WireLegacyAsset asset;
        LegacyAsset m91190d;
        String buttonText;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(wireTutorial, "<this>");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        if (wireTutorial.getSkippable()) {
            configurableTutorialType = ConfigurableTutorialType.CHAPTER_OPTIONAL;
        } else {
            configurableTutorialType = ConfigurableTutorialType.CHAPTER;
        }
        ConfigurableTutorialType configurableTutorialType2 = configurableTutorialType;
        String title = wireTutorial.getTitle();
        boolean z2 = false;
        if (title != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(title);
            if (!isBlank2) {
                z = false;
                if (!(!z)) {
                    title = null;
                }
                if (title != null || (asset = wireTutorial.getAsset()) == null || (m91190d = m91190d(asset)) == null) {
                    return null;
                }
                buttonText = wireTutorial.getButtonText();
                if (buttonText != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(buttonText);
                }
                z2 = true;
                if (!(!z2)) {
                    buttonText = null;
                }
                if (buttonText != null) {
                    return null;
                }
                return new TutorialPage(uuid, configurableTutorialType2, title, null, null, m91190d, buttonText, null, null, 408, null);
            }
        }
        z = true;
        if (!(!z)) {
        }
        if (title != null) {
            return null;
        }
        buttonText = wireTutorial.getButtonText();
        if (buttonText != null) {
        }
        z2 = true;
        if (!(!z2)) {
        }
        if (buttonText != null) {
        }
    }

    /* renamed from: b */
    public static final Tutorial m91192b(WireTutorial wireTutorial, ConfigurableTutorialContext context, String str, String str2, String str3, String str4) {
        int collectionSizeOrDefault;
        List mutableList;
        LegacyAsset legacyAsset;
        LegacyAsset legacyAsset2;
        Intrinsics.checkNotNullParameter(wireTutorial, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        List<WireTutorialPage> pages = wireTutorial.getPages();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(pages, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireTutorialPage wireTutorialPage : pages) {
            arrayList.add(m91189e(wireTutorialPage));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        TutorialPage m91193a = m91193a(wireTutorial);
        if (m91193a != null) {
            mutableList.add(0, m91193a);
        }
        String id = wireTutorial.getId();
        boolean skippable = wireTutorial.getSkippable();
        int viewCount = wireTutorial.getViewCount();
        List<String> birdModels = wireTutorial.getBirdModels();
        String header = wireTutorial.getHeader();
        String title = wireTutorial.getTitle();
        WireLegacyAsset asset = wireTutorial.getAsset();
        if (asset != null) {
            legacyAsset = m91190d(asset);
        } else {
            legacyAsset = null;
        }
        String menuTitle = wireTutorial.getMenuTitle();
        WireLegacyAsset menuAsset = wireTutorial.getMenuAsset();
        if (menuAsset != null) {
            legacyAsset2 = m91190d(menuAsset);
        } else {
            legacyAsset2 = null;
        }
        return new Tutorial(id, context, skippable, viewCount, header, title, legacyAsset, menuTitle, legacyAsset2, null, birdModels, 0, mutableList, str, str2, str3, str4, 2560, null);
    }

    /* renamed from: c */
    public static final AssetMedia m91191c(WireAssetMedia wireAssetMedia) {
        Intrinsics.checkNotNullParameter(wireAssetMedia, "<this>");
        return new AssetMedia(wireAssetMedia.getMediaId(), wireAssetMedia.getName(), wireAssetMedia.getMediaUrl(), wireAssetMedia.getMediaType());
    }

    /* renamed from: d */
    public static final LegacyAsset m91190d(WireLegacyAsset wireLegacyAsset) {
        Intrinsics.checkNotNullParameter(wireLegacyAsset, "<this>");
        return new LegacyAsset(wireLegacyAsset.getKind(), m91191c(wireLegacyAsset.getMedia()));
    }

    /* renamed from: e */
    public static final TutorialPage m91189e(WireTutorialPage wireTutorialPage) {
        TutorialQuiz tutorialQuiz;
        LegacyAsset legacyAsset;
        Intrinsics.checkNotNullParameter(wireTutorialPage, "<this>");
        String id = wireTutorialPage.getId();
        ConfigurableTutorialType type = wireTutorialPage.getType();
        String title = wireTutorialPage.getTitle();
        String message = wireTutorialPage.getMessage();
        WireTutorialQuiz quiz = wireTutorialPage.getQuiz();
        if (quiz != null) {
            tutorialQuiz = m91188f(quiz);
        } else {
            tutorialQuiz = null;
        }
        WireLegacyAsset asset = wireTutorialPage.getAsset();
        if (asset != null) {
            legacyAsset = m91190d(asset);
        } else {
            legacyAsset = null;
        }
        return new TutorialPage(id, type, title, message, tutorialQuiz, legacyAsset, wireTutorialPage.getButtonText(), wireTutorialPage.getHelpButtonText(), wireTutorialPage.getZendeskHelpUrl());
    }

    /* renamed from: f */
    public static final TutorialQuiz m91188f(WireTutorialQuiz wireTutorialQuiz) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireTutorialQuiz, "<this>");
        List<WireTutorialQuizAnswer> answers = wireTutorialQuiz.getAnswers();
        ArrayList arrayList2 = null;
        if (answers != null) {
            List<WireTutorialQuizAnswer> list = answers;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault2);
            for (WireTutorialQuizAnswer wireTutorialQuizAnswer : list) {
                arrayList.add(m91187g(wireTutorialQuizAnswer));
            }
        } else {
            arrayList = null;
        }
        List<WireTutorialQuizNote> notes = wireTutorialQuiz.getNotes();
        if (notes != null) {
            List<WireTutorialQuizNote> list2 = notes;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireTutorialQuizNote wireTutorialQuizNote : list2) {
                arrayList2.add(m91186h(wireTutorialQuizNote));
            }
        }
        return new TutorialQuiz(arrayList, arrayList2);
    }

    /* renamed from: g */
    public static final TutorialQuizAnswer m91187g(WireTutorialQuizAnswer wireTutorialQuizAnswer) {
        Intrinsics.checkNotNullParameter(wireTutorialQuizAnswer, "<this>");
        return new TutorialQuizAnswer(wireTutorialQuizAnswer.getAnswer(), wireTutorialQuizAnswer.getCorrect(), false, 4, null);
    }

    /* renamed from: h */
    public static final TutorialQuizNote m91186h(WireTutorialQuizNote wireTutorialQuizNote) {
        LegacyAsset legacyAsset;
        Intrinsics.checkNotNullParameter(wireTutorialQuizNote, "<this>");
        String text = wireTutorialQuizNote.getText();
        boolean bold = wireTutorialQuizNote.getBold();
        WireLegacyAsset asset = wireTutorialQuizNote.getAsset();
        if (asset != null) {
            legacyAsset = m91190d(asset);
        } else {
            legacyAsset = null;
        }
        return new TutorialQuizNote(text, bold, legacyAsset);
    }

    /* renamed from: i */
    public static final TutorialUpdate m91185i(Tutorial tutorial) {
        Intrinsics.checkNotNullParameter(tutorial, "<this>");
        return new TutorialUpdate(tutorial.getId(), tutorial.getContext(), tutorial.getSkippable(), tutorial.getHeader(), tutorial.getTitle(), tutorial.getAsset(), tutorial.getMenuTitle(), tutorial.getMenuAsset(), tutorial.getButtonText(), tutorial.getBirdModels(), tutorial.getPages(), tutorial.getGroupHeader(), tutorial.getGroupTitle(), tutorial.getGroupMessage(), tutorial.getGroupButtonText());
    }
}
