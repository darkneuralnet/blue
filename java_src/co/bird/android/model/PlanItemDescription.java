package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/PlanItemDescription;", "", "(Ljava/lang/String;I)V", Entry.TYPE_TEXT, "", "getText", "()I", "MOST_POPULAR", "BEST_VALUE", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PlanItemDescription {
    MOST_POPULAR { // from class: co.bird.android.model.PlanItemDescription.MOST_POPULAR
        private final int text = C45871nl4.autopay_v2_plan_most_popular;

        @Override // co.bird.android.model.PlanItemDescription
        public int getText() {
            return this.text;
        }
    },
    BEST_VALUE { // from class: co.bird.android.model.PlanItemDescription.BEST_VALUE
        private final int text = C45871nl4.autopay_v2_plan_best_value;

        @Override // co.bird.android.model.PlanItemDescription
        public int getText() {
            return this.text;
        }
    };

    /* synthetic */ PlanItemDescription(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getText();
}
