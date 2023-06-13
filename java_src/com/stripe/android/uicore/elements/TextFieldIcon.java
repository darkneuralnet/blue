package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldIcon;", "", "()V", "MultiTrailing", "Trailing", "Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class TextFieldIcon {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "staticIcons", "", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "animatedIcons", "(Ljava/util/List;Ljava/util/List;)V", "getAnimatedIcons", "()Ljava/util/List;", "getStaticIcons", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class MultiTrailing extends TextFieldIcon {
        public static final int $stable = 8;
        private final List<Trailing> animatedIcons;
        private final List<Trailing> staticIcons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiTrailing(List<Trailing> staticIcons, List<Trailing> animatedIcons) {
            super(null);
            Intrinsics.checkNotNullParameter(staticIcons, "staticIcons");
            Intrinsics.checkNotNullParameter(animatedIcons, "animatedIcons");
            this.staticIcons = staticIcons;
            this.animatedIcons = animatedIcons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiTrailing copy$default(MultiTrailing multiTrailing, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multiTrailing.staticIcons;
            }
            if ((i & 2) != 0) {
                list2 = multiTrailing.animatedIcons;
            }
            return multiTrailing.copy(list, list2);
        }

        public final List<Trailing> component1() {
            return this.staticIcons;
        }

        public final List<Trailing> component2() {
            return this.animatedIcons;
        }

        public final MultiTrailing copy(List<Trailing> staticIcons, List<Trailing> animatedIcons) {
            Intrinsics.checkNotNullParameter(staticIcons, "staticIcons");
            Intrinsics.checkNotNullParameter(animatedIcons, "animatedIcons");
            return new MultiTrailing(staticIcons, animatedIcons);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MultiTrailing) {
                MultiTrailing multiTrailing = (MultiTrailing) obj;
                return Intrinsics.areEqual(this.staticIcons, multiTrailing.staticIcons) && Intrinsics.areEqual(this.animatedIcons, multiTrailing.animatedIcons);
            }
            return false;
        }

        public final List<Trailing> getAnimatedIcons() {
            return this.animatedIcons;
        }

        public final List<Trailing> getStaticIcons() {
            return this.staticIcons;
        }

        public int hashCode() {
            return (this.staticIcons.hashCode() * 31) + this.animatedIcons.hashCode();
        }

        public String toString() {
            List<Trailing> list = this.staticIcons;
            List<Trailing> list2 = this.animatedIcons;
            return "MultiTrailing(staticIcons=" + list + ", animatedIcons=" + list2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J@\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "idRes", "", "contentDescription", "isTintable", "", "onClick", "Lkotlin/Function0;", "", "(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;)V", "getContentDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdRes", "()I", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Trailing extends TextFieldIcon {
        public static final int $stable = 0;
        private final Integer contentDescription;
        private final int idRes;
        private final boolean isTintable;
        private final Function0<Unit> onClick;

        public /* synthetic */ Trailing(int i, Integer num, boolean z, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, z, (i2 & 8) != 0 ? null : function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Trailing copy$default(Trailing trailing, int i, Integer num, boolean z, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = trailing.idRes;
            }
            if ((i2 & 2) != 0) {
                num = trailing.contentDescription;
            }
            if ((i2 & 4) != 0) {
                z = trailing.isTintable;
            }
            if ((i2 & 8) != 0) {
                function0 = trailing.onClick;
            }
            return trailing.copy(i, num, z, function0);
        }

        public final int component1() {
            return this.idRes;
        }

        public final Integer component2() {
            return this.contentDescription;
        }

        public final boolean component3() {
            return this.isTintable;
        }

        public final Function0<Unit> component4() {
            return this.onClick;
        }

        public final Trailing copy(int i, Integer num, boolean z, Function0<Unit> function0) {
            return new Trailing(i, num, z, function0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Trailing) {
                Trailing trailing = (Trailing) obj;
                return this.idRes == trailing.idRes && Intrinsics.areEqual(this.contentDescription, trailing.contentDescription) && this.isTintable == trailing.isTintable && Intrinsics.areEqual(this.onClick, trailing.onClick);
            }
            return false;
        }

        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        public final int getIdRes() {
            return this.idRes;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.idRes) * 31;
            Integer num = this.contentDescription;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            boolean z = this.isTintable;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode2 + i) * 31;
            Function0<Unit> function0 = this.onClick;
            return i2 + (function0 != null ? function0.hashCode() : 0);
        }

        public final boolean isTintable() {
            return this.isTintable;
        }

        public String toString() {
            int i = this.idRes;
            Integer num = this.contentDescription;
            boolean z = this.isTintable;
            Function0<Unit> function0 = this.onClick;
            return "Trailing(idRes=" + i + ", contentDescription=" + num + ", isTintable=" + z + ", onClick=" + function0 + ")";
        }

        public Trailing(int i, Integer num, boolean z, Function0<Unit> function0) {
            super(null);
            this.idRes = i;
            this.contentDescription = num;
            this.isTintable = z;
            this.onClick = function0;
        }
    }

    public /* synthetic */ TextFieldIcon(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextFieldIcon() {
    }
}
