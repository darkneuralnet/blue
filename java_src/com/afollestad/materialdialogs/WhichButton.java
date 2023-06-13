package com.afollestad.materialdialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/afollestad/materialdialogs/WhichButton;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "POSITIVE", "NEGATIVE", "NEUTRAL", "Companion", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public enum WhichButton {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);
    
    public static final Companion Companion = new Companion(null);
    private final int index;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/afollestad/materialdialogs/WhichButton$Companion;", "", "()V", "fromIndex", "Lcom/afollestad/materialdialogs/WhichButton;", "index", "", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final WhichButton fromIndex(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return WhichButton.NEUTRAL;
                    }
                    throw new IndexOutOfBoundsException(i + " is not an action button index.");
                }
                return WhichButton.NEGATIVE;
            }
            return WhichButton.POSITIVE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    WhichButton(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
