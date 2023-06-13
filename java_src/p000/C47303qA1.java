package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032$\b\u0002\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\bj\u0004\u0018\u0001`\u000bH\u0096\u0001R\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LqA1;", "LLI4;", "Lkotlin/Function0;", "", "function", "", "b", "path", "", "Lkotlin/Pair;", "", "Lcom/github/kittinunf/fuel/core/Parameters;", "parameters", "LpI4;", C17296a.f69688o, "", "Z", "getTrace", "()Z", "setTrace", "(Z)V", "trace", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: qA1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47303qA1 implements LI4 {

    /* renamed from: b */
    public static boolean f104814b;

    /* renamed from: c */
    public static final C47303qA1 f104815c = new C47303qA1();

    /* renamed from: a */
    public final /* synthetic */ C47896rA1 f104816a = C47896rA1.f106566t.m16315a();

    private C47303qA1() {
    }

    @Override // p000.LI4
    /* renamed from: a */
    public InterfaceC46785pI4 mo16330a(String path, List<? extends Pair<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(path, "path");
        return this.f104816a.mo16330a(path, list);
    }

    /* renamed from: b */
    public final void m18033b(Function0<String> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        if (f104814b) {
            System.out.println((Object) function.invoke());
        }
    }
}
