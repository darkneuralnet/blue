package com.stripe.android.financialconnections.utils;

import android.net.Uri;
import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/utils/UriUtils;", "", "logger", "Lcom/stripe/android/core/Logger;", "(Lcom/stripe/android/core/Logger;)V", "compareSchemeAuthorityAndPath", "", "uriString1", "", "uriString2", "getQueryParameter", "uriString", "param", "toUriOrNull", "Landroid/net/Uri;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class UriUtils {
    private final Logger logger;

    public UriUtils(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    private final Uri toUriOrNull(String str) {
        Uri.parse(str).buildUpon().clearQuery();
        try {
            Result.Companion companion = Result.Companion;
            return Uri.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                Logger logger = this.logger;
                logger.error("Could not parse given URI " + str, m116786exceptionOrNullimpl);
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = null;
            }
            return (Uri) m116783constructorimpl;
        }
    }

    public final boolean compareSchemeAuthorityAndPath(String uriString1, String uriString2) {
        boolean equals$default;
        boolean equals$default2;
        boolean equals$default3;
        Intrinsics.checkNotNullParameter(uriString1, "uriString1");
        Intrinsics.checkNotNullParameter(uriString2, "uriString2");
        Uri uriOrNull = toUriOrNull(uriString1);
        Uri uriOrNull2 = toUriOrNull(uriString2);
        if (uriOrNull == null || uriOrNull2 == null) {
            return false;
        }
        equals$default = StringsKt__StringsJVMKt.equals$default(uriOrNull.getAuthority(), uriOrNull2.getAuthority(), false, 2, null);
        if (!equals$default) {
            return false;
        }
        equals$default2 = StringsKt__StringsJVMKt.equals$default(uriOrNull.getScheme(), uriOrNull2.getScheme(), false, 2, null);
        if (!equals$default2) {
            return false;
        }
        equals$default3 = StringsKt__StringsJVMKt.equals$default(uriOrNull.getPath(), uriOrNull2.getPath(), false, 2, null);
        if (!equals$default3) {
            return false;
        }
        return true;
    }

    public final String getQueryParameter(String uriString, String param) {
        Object m116783constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(param, "param");
        String str2 = null;
        try {
            Result.Companion companion = Result.Companion;
            Uri uriOrNull = toUriOrNull(uriString);
            if (uriOrNull != null) {
                str = uriOrNull.getQueryParameter(param);
            } else {
                str = null;
            }
            m116783constructorimpl = Result.m116783constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.logger.error("Could not extract query param " + param + " from URI " + uriString, m116786exceptionOrNullimpl);
        }
        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
            str2 = m116783constructorimpl;
        }
        return str2;
    }
}
