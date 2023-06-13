package co.bird.api.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/api/exception/HibernateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HibernateException extends Exception {

    /* renamed from: b */
    public final String f68191b;

    public HibernateException() {
        this(null, 1, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f68191b;
    }

    public HibernateException(String str) {
        super(str);
        this.f68191b = str;
    }

    public /* synthetic */ HibernateException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "battery < 80%, cannot hibernate" : str);
    }
}
