package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"T", "Lkotlin/Result;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "LWc0;", "caller", "b", "(Ljava/lang/Object;LWc0;)Ljava/lang/Object;", TransferTable.COLUMN_STATE, "Lkotlin/coroutines/Continuation;", "uCont", C17296a.f69688o, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: ts0 */
/* loaded from: classes8.dex */
public final class C49494ts0 {
    /* renamed from: a */
    public static final <T> Object m11550a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof C47716qs0) {
            Result.Companion companion = Result.Companion;
            return Result.m116783constructorimpl(ResultKt.createFailure(((C47716qs0) obj).f105942a));
        }
        return Result.m116783constructorimpl(obj);
    }

    /* renamed from: b */
    public static final <T> Object m11549b(Object obj, InterfaceC36779Wc0<?> interfaceC36779Wc0) {
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl != null) {
            return new C47716qs0(m116786exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m11548c(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl == null) {
            if (function1 != null) {
                return new C48309rs0(obj, function1);
            }
            return obj;
        }
        return new C47716qs0(m116786exceptionOrNullimpl, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m11547d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m11548c(obj, function1);
    }
}
