package co.bird.android.model.constant;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/constant/BirdCommand;", "", "(Ljava/lang/String;I)V", "LOCKED", "UNLOCKED", "CAPTURED", "RELEASED", "PUT_TO_SLEEP", "WOKEN_UP", "NOOP", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum BirdCommand {
    LOCKED,
    UNLOCKED,
    CAPTURED,
    RELEASED,
    PUT_TO_SLEEP,
    WOKEN_UP,
    NOOP;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/BirdCommand$Companion;", "", "()V", "from", "Lco/bird/android/model/constant/BirdCommand;", Entry.TYPE_TEXT, "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BirdCommand from(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            switch (text.hashCode()) {
                case -1097452790:
                    if (text.equals("locked")) {
                        return BirdCommand.LOCKED;
                    }
                    break;
                case -551298755:
                    if (text.equals("released")) {
                        return BirdCommand.RELEASED;
                    }
                    break;
                case -485394717:
                    if (text.equals("put to sleep")) {
                        return BirdCommand.PUT_TO_SLEEP;
                    }
                    break;
                case -210949405:
                    if (text.equals("unlocked")) {
                        return BirdCommand.UNLOCKED;
                    }
                    break;
                case -170400577:
                    if (text.equals("woken up")) {
                        return BirdCommand.WOKEN_UP;
                    }
                    break;
                case -49733154:
                    if (text.equals("captured")) {
                        return BirdCommand.CAPTURED;
                    }
                    break;
            }
            return BirdCommand.NOOP;
        }

        private Companion() {
        }
    }
}
