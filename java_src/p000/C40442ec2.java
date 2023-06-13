package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lec2;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "b", "I", C17296a.f69688o, "()I", "itemOffset", "Lnf;", "", "Lsf;", "c", "Lnf;", "()Lnf;", "previousAnimation", "<init>", "(ILnf;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ec2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40442ec2 extends CancellationException {

    /* renamed from: b */
    public final int f78605b;

    /* renamed from: c */
    public final C26565nf<Float, C28366sf> f78606c;

    public C40442ec2(int i, C26565nf<Float, C28366sf> previousAnimation) {
        Intrinsics.checkNotNullParameter(previousAnimation, "previousAnimation");
        this.f78605b = i;
        this.f78606c = previousAnimation;
    }

    /* renamed from: a */
    public final int m42724a() {
        return this.f78605b;
    }

    /* renamed from: b */
    public final C26565nf<Float, C28366sf> m42723b() {
        return this.f78606c;
    }
}
