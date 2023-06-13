package p000;

import android.graphics.Typeface;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lwc6;", "", "LsP5;", C17296a.f69688o, "LsP5;", "resolveResult", "b", "Lwc6;", "next", "c", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "<init>", "(LsP5;Lwc6;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51118wc6 {

    /* renamed from: a */
    public final InterfaceC48627sP5<Object> f116272a;

    /* renamed from: b */
    public final C51118wc6 f116273b;

    /* renamed from: c */
    public final Object f116274c;

    public C51118wc6(InterfaceC48627sP5<? extends Object> resolveResult, C51118wc6 c51118wc6) {
        Intrinsics.checkNotNullParameter(resolveResult, "resolveResult");
        this.f116272a = resolveResult;
        this.f116273b = c51118wc6;
        this.f116274c = resolveResult.getValue();
    }

    /* renamed from: a */
    public final Typeface m6592a() {
        Object obj = this.f116274c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* renamed from: b */
    public final boolean m6591b() {
        C51118wc6 c51118wc6;
        return this.f116272a.getValue() != this.f116274c || ((c51118wc6 = this.f116273b) != null && c51118wc6.m6591b());
    }
}
