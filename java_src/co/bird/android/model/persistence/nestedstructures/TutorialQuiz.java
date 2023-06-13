package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TutorialQuiz;", "", "answers", "", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;", "notes", "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizNote;", "(Ljava/util/List;Ljava/util/List;)V", "getAnswers", "()Ljava/util/List;", "getNotes", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TutorialQuiz {
    @JsonProperty("answers")
    @InterfaceC41208ft5("answers")
    private final List<TutorialQuizAnswer> answers;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final List<TutorialQuizNote> notes;

    public TutorialQuiz() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TutorialQuiz copy$default(TutorialQuiz tutorialQuiz, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tutorialQuiz.answers;
        }
        if ((i & 2) != 0) {
            list2 = tutorialQuiz.notes;
        }
        return tutorialQuiz.copy(list, list2);
    }

    public final List<TutorialQuizAnswer> component1() {
        return this.answers;
    }

    public final List<TutorialQuizNote> component2() {
        return this.notes;
    }

    public final TutorialQuiz copy(List<TutorialQuizAnswer> list, List<TutorialQuizNote> list2) {
        return new TutorialQuiz(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TutorialQuiz) {
            TutorialQuiz tutorialQuiz = (TutorialQuiz) obj;
            return Intrinsics.areEqual(this.answers, tutorialQuiz.answers) && Intrinsics.areEqual(this.notes, tutorialQuiz.notes);
        }
        return false;
    }

    public final List<TutorialQuizAnswer> getAnswers() {
        return this.answers;
    }

    public final List<TutorialQuizNote> getNotes() {
        return this.notes;
    }

    public int hashCode() {
        List<TutorialQuizAnswer> list = this.answers;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TutorialQuizNote> list2 = this.notes;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        List<TutorialQuizAnswer> list = this.answers;
        List<TutorialQuizNote> list2 = this.notes;
        return "TutorialQuiz(answers=" + list + ", notes=" + list2 + ")";
    }

    public TutorialQuiz(List<TutorialQuizAnswer> list, List<TutorialQuizNote> list2) {
        this.answers = list;
        this.notes = list2;
    }

    public /* synthetic */ TutorialQuiz(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
