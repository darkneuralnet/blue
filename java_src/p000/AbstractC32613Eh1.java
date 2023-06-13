package p000;

import com.facebook.share.internal.C17296a;
import java.io.Closeable;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LEh1;", "LSC0;", "Ljava/io/Closeable;", "<init>", "()V", "c", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Eh1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC32613Eh1 extends SC0 implements Closeable {

    /* renamed from: c */
    public static final C1928a f7946c = new C1928a(null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"LEh1$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "LSC0;", "LEh1;", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    @ExperimentalStdlibApi
    /* renamed from: Eh1$a */
    /* loaded from: classes8.dex */
    public static final class C1928a extends AbstractCoroutineContextKey<SC0, AbstractC32613Eh1> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "LEh1;", C17296a.f69688o, "(Lkotlin/coroutines/CoroutineContext$Element;)LEh1;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: Eh1$a$a */
        /* loaded from: classes8.dex */
        public static final class C1929a extends Lambda implements Function1<CoroutineContext.Element, AbstractC32613Eh1> {

            /* renamed from: g */
            public static final C1929a f7947g = new C1929a();

            public C1929a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC32613Eh1 invoke(CoroutineContext.Element element) {
                if (element instanceof AbstractC32613Eh1) {
                    return (AbstractC32613Eh1) element;
                }
                return null;
            }
        }

        public /* synthetic */ C1928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1928a() {
            super(SC0.f33309b, C1929a.f7947g);
        }
    }
}
