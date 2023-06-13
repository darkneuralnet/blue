package co.bird.android.model;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/OnboardingInput;", "", "type", "", "title", "hint", "action", "(Ljava/lang/String;IIIII)V", "getAction", "()I", "getHint", "getTitle", "getType", "EMAIL", "CODE", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum OnboardingInput {
    EMAIL(32, C45871nl4.map_email_title, C45871nl4.map_email, C45871nl4.map_email_action),
    CODE(1, C45871nl4.map_code_title, C45871nl4.map_code, C45871nl4.map_code_action);
    
    private final int action;
    private final int hint;
    private final int title;
    private final int type;

    OnboardingInput(int i, int i2, int i3, int i4) {
        this.type = i;
        this.title = i2;
        this.hint = i3;
        this.action = i4;
    }

    public final int getAction() {
        return this.action;
    }

    public final int getHint() {
        return this.hint;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }
}
