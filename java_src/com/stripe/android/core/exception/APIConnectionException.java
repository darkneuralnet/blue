package com.stripe.android.core.exception;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/core/exception/StripeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class APIConnectionException extends StripeException {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/exception/APIConnectionException$Companion;", "", "()V", "create", "Lcom/stripe/android/core/exception/APIConnectionException;", "e", "Ljava/io/IOException;", "url", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAPIConnectionException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIConnectionException.kt\ncom/stripe/android/core/exception/APIConnectionException$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ APIConnectionException create$default(Companion companion, IOException iOException, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(iOException, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
            if (r11 != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final /* synthetic */ APIConnectionException create(IOException e, String str) {
            List listOfNotNull;
            String joinToString$default;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(e, "e");
            String[] strArr = new String[2];
            boolean z = false;
            strArr[0] = "Stripe";
            String str2 = "(" + str + ")";
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
            }
            z = true;
            if (z) {
                str2 = null;
            }
            strArr[1] = str2;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, " ", null, null, 0, null, null, 62, null);
            return new APIConnectionException("IOException during API request to " + joinToString$default + ": " + e.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e);
        }

        private Companion() {
        }
    }

    public APIConnectionException() {
        this(null, null, 3, null);
    }

    public /* synthetic */ APIConnectionException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public APIConnectionException(String str, Throwable th) {
        super(null, null, 0, th, str, 7, null);
    }
}
