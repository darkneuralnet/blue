package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m28432d2 = {"LF12;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "x", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F12 */
/* loaded from: classes.dex */
public interface F12 extends CoroutineContext.Element {

    /* renamed from: V */
    public static final C2051a f8435V = C2051a.f8436b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"LF12$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LF12;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F12$a */
    /* loaded from: classes.dex */
    public static final class C2051a implements CoroutineContext.Key<F12> {

        /* renamed from: b */
        public static final /* synthetic */ C2051a f8436b = new C2051a();

        private C2051a() {
        }
    }

    /* renamed from: x */
    <R> Object m108110x(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation);
}
