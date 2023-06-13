package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Lkotlin/Function3;", "LGu1;", "", "Lkotlin/coroutines/Continuation;", "", C17296a.f69688o, "Lkotlin/jvm/functions/Function3;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: gh5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41681gh5 {

    /* renamed from: a */
    public static final Function3<InterfaceC33198Gu1<Object>, Object, Continuation<? super Unit>, Object> f84038a = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(C22412a.f84039b, 3);

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: gh5$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C22412a extends FunctionReferenceImpl implements Function3<InterfaceC33198Gu1<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {

        /* renamed from: b */
        public static final C22412a f84039b = new C22412a();

        public C22412a() {
            super(3, InterfaceC33198Gu1.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Object invoke(InterfaceC33198Gu1<Object> interfaceC33198Gu1, Object obj, Continuation<? super Unit> continuation) {
            return interfaceC33198Gu1.emit(obj, continuation);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Function3 m37894a() {
        return f84038a;
    }
}
