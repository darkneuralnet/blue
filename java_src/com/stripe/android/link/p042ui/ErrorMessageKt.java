package com.stripe.android.link.p042ui;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m28432d2 = {"getErrorMessage", "Lcom/stripe/android/link/ui/ErrorMessage;", "", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.ErrorMessageKt */
/* loaded from: classes7.dex */
public final class ErrorMessageKt {
    public static final ErrorMessage getErrorMessage(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof APIConnectionException) {
            return new ErrorMessage.FromResources(C18975R.string.stripe_failure_connection_error);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return new ErrorMessage.Raw(localizedMessage);
        }
        return new ErrorMessage.FromResources(C18975R.string.stripe_internal_error);
    }
}
