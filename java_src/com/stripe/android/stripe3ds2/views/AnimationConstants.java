package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.C19336R;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/AnimationConstants;", "", "()V", "SLIDE_IN", "", "getSLIDE_IN", "()I", "SLIDE_OUT", "getSLIDE_OUT", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AnimationConstants {
    public static final AnimationConstants INSTANCE = new AnimationConstants();
    private static final int SLIDE_IN = C19336R.anim.stripe_3ds2_challenge_transition_slide_in;
    private static final int SLIDE_OUT = C19336R.anim.stripe_3ds2_challenge_transition_slide_out;

    private AnimationConstants() {
    }

    public final int getSLIDE_IN() {
        return SLIDE_IN;
    }

    public final int getSLIDE_OUT() {
        return SLIDE_OUT;
    }
}
