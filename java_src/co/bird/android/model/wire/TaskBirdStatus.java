package co.bird.android.model.wire;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/wire/TaskBirdStatus;", "", "color", "", "(Ljava/lang/String;II)V", "getColor", "()I", "OVERDUE", "DUE_FUTURE", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TaskBirdStatus {
    OVERDUE(C32364Df4.redish),
    DUE_FUTURE(C32364Df4.greenish);
    
    private final int color;

    TaskBirdStatus(int i) {
        this.color = i;
    }

    public final int getColor() {
        return this.color;
    }
}
