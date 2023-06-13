package com.facebook;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p000.C32172Ck1;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\bB+\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, m28432d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "<init>", "()V", "message", "(Ljava/lang/String;)V", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class FacebookException extends RuntimeException {

    /* renamed from: b */
    public static final C17194b f69356b = new C17194b(null);
    public static final long serialVersionUID = 1;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "enabled", "", C17296a.f69688o, "(Z)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookException$a */
    /* loaded from: classes5.dex */
    public static final class C17193a implements C32172Ck1.InterfaceC1164a {

        /* renamed from: a */
        public final /* synthetic */ String f69357a;

        public C17193a(String str) {
            this.f69357a = str;
        }

        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public final void mo16504a(boolean z) {
            if (z) {
                try {
                    C45818ng1.m23336c(this.f69357a);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/facebook/FacebookException$b;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookException$b */
    /* loaded from: classes5.dex */
    public static final class C17194b {
        private C17194b() {
        }

        public /* synthetic */ C17194b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C17216a.m52722x() || random.nextInt(100) <= 50) {
            return;
        }
        C32172Ck1.m111760a(C32172Ck1.EnumC1165b.ErrorReport, new C17193a(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FacebookException(String str, Object... args) {
        this(r2);
        String str2;
        Intrinsics.checkNotNullParameter(args, "args");
        if (str != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            str2 = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        } else {
            str2 = null;
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
