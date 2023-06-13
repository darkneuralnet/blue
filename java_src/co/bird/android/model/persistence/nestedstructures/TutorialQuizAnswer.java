package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;", "", "answer", "", "correct", "", "selected", "(Ljava/lang/String;ZZ)V", "getAnswer", "()Ljava/lang/String;", "getCorrect", "()Z", "getSelected", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TutorialQuizAnswer {
    @JsonProperty("answer")
    @InterfaceC41208ft5("answer")
    private final String answer;
    @JsonProperty("correct")
    @InterfaceC41208ft5("correct")
    private final boolean correct;
    private boolean selected;

    public TutorialQuizAnswer(String answer, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.answer = answer;
        this.correct = z;
        this.selected = z2;
    }

    public static /* synthetic */ TutorialQuizAnswer copy$default(TutorialQuizAnswer tutorialQuizAnswer, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tutorialQuizAnswer.answer;
        }
        if ((i & 2) != 0) {
            z = tutorialQuizAnswer.correct;
        }
        if ((i & 4) != 0) {
            z2 = tutorialQuizAnswer.selected;
        }
        return tutorialQuizAnswer.copy(str, z, z2);
    }

    public final String component1() {
        return this.answer;
    }

    public final boolean component2() {
        return this.correct;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final TutorialQuizAnswer copy(String answer, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new TutorialQuizAnswer(answer, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TutorialQuizAnswer) {
            TutorialQuizAnswer tutorialQuizAnswer = (TutorialQuizAnswer) obj;
            return Intrinsics.areEqual(this.answer, tutorialQuizAnswer.answer) && this.correct == tutorialQuizAnswer.correct && this.selected == tutorialQuizAnswer.selected;
        }
        return false;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final boolean getCorrect() {
        return this.correct;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.answer.hashCode() * 31;
        boolean z = this.correct;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.selected;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        String str = this.answer;
        boolean z = this.correct;
        boolean z2 = this.selected;
        return "TutorialQuizAnswer(answer=" + str + ", correct=" + z + ", selected=" + z2 + ")";
    }

    public /* synthetic */ TutorialQuizAnswer(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2);
    }
}
