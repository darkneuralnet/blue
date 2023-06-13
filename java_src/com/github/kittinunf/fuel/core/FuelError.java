package com.github.kittinunf.fuel.core;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.FileUploadRequest;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringBuilderJVMKt;
import p000.FM4;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\nB\u001b\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016JC\u0010\n\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005j\u0002`\u00072\u0012\u0010\b\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005j\u0002`\u00072\u0012\u0010\t\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lcom/github/kittinunf/fuel/core/FuelError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "", "Ljava/lang/StackTraceElement;", "Lcom/github/kittinunf/fuel/core/StackTrace;", "wrapped", "cause", C17296a.f69688o, "([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "LFM4;", "b", "LFM4;", DateTokenConverter.CONVERTER_KEY, "()LFM4;", "response", "", "c", "()Ljava/lang/Throwable;", "exception", "", "()Z", "causedByInterruption", "<init>", "(Ljava/lang/Throwable;LFM4;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class FuelError extends Exception {

    /* renamed from: c */
    public static final C17429a f69982c = new C17429a(null);

    /* renamed from: b */
    public final FM4 f69983b;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lcom/github/kittinunf/fuel/core/FuelError$a;", "", "", "it", "LFM4;", "response", "Lcom/github/kittinunf/fuel/core/FuelError;", C17296a.f69688o, "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.github.kittinunf.fuel.core.FuelError$a */
    /* loaded from: classes5.dex */
    public static final class C17429a {
        private C17429a() {
        }

        /* renamed from: b */
        public static /* synthetic */ FuelError m52050b(C17429a c17429a, Throwable th, FM4 fm4, int i, Object obj) {
            if ((i & 2) != 0) {
                fm4 = FM4.C2232b.m107277b(FM4.f9239g, null, 1, null);
            }
            return c17429a.m52051a(th, fm4);
        }

        /* renamed from: a */
        public final FuelError m52051a(Throwable it, FM4 response) {
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(response, "response");
            if (it instanceof C41895h30) {
                return new C41895h30(((C41895h30) it).m36879e());
            }
            if (it instanceof FuelError) {
                return new C41895h30((FuelError) it);
            }
            return new FuelError(it, response);
        }

        public /* synthetic */ C17429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuelError(Throwable exception, FM4 response) {
        super(exception.getMessage(), exception);
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f69983b = response;
        StackTraceElement[] stackTrace = getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        StackTraceElement[] stackTrace2 = exception.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "exception.stackTrace");
        setStackTrace(m52055a(stackTrace, stackTrace2));
    }

    /* renamed from: a */
    public final StackTraceElement[] m52055a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement stackTraceElement;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
            int length = stackTraceElementArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    stackTraceElement = stackTraceElementArr2[i];
                    if (Intrinsics.areEqual(stackTraceElement, stackTraceElement2)) {
                        break;
                    }
                    i++;
                } else {
                    stackTraceElement = null;
                    break;
                }
            }
            if (stackTraceElement == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(stackTraceElement2);
        }
        Object[] array = arrayList.toArray(new StackTraceElement[0]);
        if (array != null) {
            return (StackTraceElement[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public final boolean m52054b() {
        if (!(m52053c() instanceof InterruptedException) && !(m52053c() instanceof InterruptedIOException)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final Throwable m52053c() {
        Throwable th = this;
        while ((th instanceof FuelError) && th.getCause() != null) {
            th = th.getCause();
            Intrinsics.checkNotNull(th);
        }
        return th;
    }

    /* renamed from: d */
    public final FM4 m52052d() {
        return this.f69983b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = m52053c().getMessage();
        if (message == null) {
            message = m52053c().getClass().getCanonicalName();
        }
        sb.append(message);
        sb.append(FileUploadRequest.LINE_BREAK);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        StringBuilder sb4 = new StringBuilder();
        StackTraceElement[] stackTrace = getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('\t');
            sb5.append(stackTraceElement);
            sb4.append(sb5.toString());
            Intrinsics.checkNotNullExpressionValue(sb4, "append(value)");
            StringsKt__StringBuilderJVMKt.appendln(sb4);
        }
        Throwable cause = getCause();
        if (cause != null) {
            sb4.append(CoreConstants.CAUSED_BY);
            sb4.append(cause.toString());
            Intrinsics.checkNotNullExpressionValue(sb4, "append(value)");
            StringsKt__StringBuilderJVMKt.appendln(sb4);
            if (!(cause instanceof FuelError)) {
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "it.stackTrace");
                for (StackTraceElement stackTraceElement2 : stackTrace2) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append('\t');
                    sb6.append(stackTraceElement2);
                    sb4.append(sb6.toString());
                    Intrinsics.checkNotNullExpressionValue(sb4, "append(value)");
                    StringsKt__StringBuilderJVMKt.appendln(sb4);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        String sb7 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
        sb3.append(sb7);
        return sb3.toString();
    }
}
