package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\n\u001aM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"T", "Lkotlin/Function2;", "LGu1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "LEu1;", "c", "(Lkotlin/jvm/functions/Function2;)LEu1;", "value", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)LEu1;", "Ln74;", "b", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: Wu1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C36942Wu1 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"Wu1$a", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Wu1$a */
    /* loaded from: classes8.dex */
    public static final class C9205a implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Object f42283b;

        public C9205a(Object obj) {
            this.f42283b = obj;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object emit = interfaceC33198Gu1.emit(this.f42283b, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (emit == coroutine_suspended) {
                return emit;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m77723a(@BuilderInference Function2<? super InterfaceC45497n74<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new K80(function2, null, 0, null, 14, null);
    }

    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m77722b(@BuilderInference Function2<? super InterfaceC45497n74<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C33548Ih0(function2, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final <T> InterfaceC32730Eu1<T> m77721c(@BuilderInference Function2<? super InterfaceC33198Gu1<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C46425oh5(function2);
    }

    /* renamed from: d */
    public static final <T> InterfaceC32730Eu1<T> m77720d(T t) {
        return new C9205a(t);
    }
}
