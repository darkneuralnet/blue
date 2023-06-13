package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"Lwj2;", "", "Lxi2;", "e", "h", "Lkotlin/DeepRecursiveScope;", "", "i", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "LYi2;", "j", "g", "LC0;", C17296a.f69688o, "LC0;", "lexer", "b", "Z", "isLenient", "", "c", "I", "stackDepth", "Lji2;", "configuration", "<init>", "(Lji2;LC0;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,118:1\n26#1,24:119\n26#1,24:143\n517#2,3:167\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n18#1:119,24\n23#1:143,24\n62#1:167,3\n*E\n"})
/* renamed from: wj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51184wj2 {

    /* renamed from: a */
    public final AbstractC0809C0 f116395a;

    /* renamed from: b */
    public final boolean f116396b;

    /* renamed from: c */
    public int f116397c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"Lkotlin/DeepRecursiveScope;", "", "Lxi2;", "it", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m28418f = "JsonTreeReader.kt", m28417i = {}, m28416l = {112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: wj2$a */
    /* loaded from: classes8.dex */
    public static final class C29946a extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, AbstractC51767xi2>, Unit, Continuation<? super AbstractC51767xi2>, Object> {

        /* renamed from: h */
        public int f116398h;

        /* renamed from: i */
        public /* synthetic */ Object f116399i;

        public C29946a(Continuation<? super C29946a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: e */
        public final Object invoke(DeepRecursiveScope<Unit, AbstractC51767xi2> deepRecursiveScope, Unit unit, Continuation<? super AbstractC51767xi2> continuation) {
            C29946a c29946a = new C29946a(continuation);
            c29946a.f116399i = deepRecursiveScope;
            return c29946a.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f116398h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.f116399i;
                byte m113142E = C51184wj2.this.f116395a.m113142E();
                if (m113142E == 1) {
                    return C51184wj2.this.m6433j(true);
                }
                if (m113142E == 0) {
                    return C51184wj2.this.m6433j(false);
                }
                if (m113142E == 6) {
                    C51184wj2 c51184wj2 = C51184wj2.this;
                    this.f116398h = 1;
                    obj = c51184wj2.m6434i(deepRecursiveScope, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (m113142E == 8) {
                    return C51184wj2.this.m6437f();
                } else {
                    AbstractC0809C0.m113114y(C51184wj2.this.f116395a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return (AbstractC51767xi2) obj;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.serialization.json.internal.JsonTreeReader", m28418f = "JsonTreeReader.kt", m28417i = {0, 0, 0, 0}, m28416l = {23}, m28415m = "readObject", m28414n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: wj2$b */
    /* loaded from: classes8.dex */
    public static final class C29947b extends ContinuationImpl {

        /* renamed from: h */
        public Object f116401h;

        /* renamed from: i */
        public Object f116402i;

        /* renamed from: j */
        public Object f116403j;

        /* renamed from: k */
        public Object f116404k;

        /* renamed from: l */
        public /* synthetic */ Object f116405l;

        /* renamed from: n */
        public int f116407n;

        public C29947b(Continuation<? super C29947b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f116405l = obj;
            this.f116407n |= Integer.MIN_VALUE;
            return C51184wj2.this.m6434i(null, this);
        }
    }

    public C51184wj2(C43467ji2 configuration, AbstractC0809C0 lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f116395a = lexer;
        this.f116396b = configuration.m30061m();
    }

    /* renamed from: e */
    public final AbstractC51767xi2 m6438e() {
        AbstractC51767xi2 m6435h;
        byte m113142E = this.f116395a.m113142E();
        if (m113142E == 1) {
            return m6433j(true);
        }
        if (m113142E == 0) {
            return m6433j(false);
        }
        if (m113142E == 6) {
            int i = this.f116397c + 1;
            this.f116397c = i;
            if (i == 200) {
                m6435h = m6436g();
            } else {
                m6435h = m6435h();
            }
            this.f116397c--;
            return m6435h;
        } else if (m113142E == 8) {
            return m6437f();
        } else {
            AbstractC0809C0.m113114y(this.f116395a, "Cannot begin reading element, unexpected token: " + ((int) m113142E), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: f */
    public final AbstractC51767xi2 m6437f() {
        boolean z;
        int i;
        byte mo78439m = this.f116395a.mo78439m();
        if (this.f116395a.m113142E() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f116395a.mo78442f()) {
                arrayList.add(m6438e());
                mo78439m = this.f116395a.mo78439m();
                if (mo78439m != 4) {
                    AbstractC0809C0 abstractC0809C0 = this.f116395a;
                    if (mo78439m == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i = abstractC0809C0.f3198a;
                    if (!z) {
                        AbstractC0809C0.m113114y(abstractC0809C0, "Expected end of the array or comma", i, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (mo78439m == 8) {
                this.f116395a.m113124n((byte) 9);
            } else if (mo78439m == 4) {
                AbstractC0809C0.m113114y(this.f116395a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new C40502ei2(arrayList);
        }
        AbstractC0809C0.m113114y(this.f116395a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public final AbstractC51767xi2 m6436g() {
        return (AbstractC51767xi2) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new C29946a(null)), Unit.INSTANCE);
    }

    /* renamed from: h */
    public final AbstractC51767xi2 m6435h() {
        String m113122q;
        byte m113124n = this.f116395a.m113124n((byte) 6);
        if (this.f116395a.m113142E() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f116395a.mo78442f()) {
                    break;
                }
                if (this.f116396b) {
                    m113122q = this.f116395a.m113120s();
                } else {
                    m113122q = this.f116395a.m113122q();
                }
                this.f116395a.m113124n((byte) 5);
                linkedHashMap.put(m113122q, m6438e());
                m113124n = this.f116395a.mo78439m();
                if (m113124n != 4) {
                    if (m113124n != 7) {
                        AbstractC0809C0.m113114y(this.f116395a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (m113124n == 6) {
                this.f116395a.m113124n((byte) 7);
            } else if (m113124n == 4) {
                AbstractC0809C0.m113114y(this.f116395a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new C35899Si2(linkedHashMap);
        }
        AbstractC0809C0.m113114y(this.f116395a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please submit an issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6434i(DeepRecursiveScope<Unit, AbstractC51767xi2> deepRecursiveScope, Continuation<? super AbstractC51767xi2> continuation) {
        C29947b c29947b;
        Object coroutine_suspended;
        int i;
        C51184wj2 c51184wj2;
        LinkedHashMap linkedHashMap;
        Object obj;
        C29947b c29947b2;
        byte b;
        DeepRecursiveScope<Unit, AbstractC51767xi2> deepRecursiveScope2;
        String m113122q;
        if (continuation instanceof C29947b) {
            c29947b = (C29947b) continuation;
            int i2 = c29947b.f116407n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29947b.f116407n = i2 - Integer.MIN_VALUE;
                Object obj2 = c29947b.f116405l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29947b.f116407n;
                if (i == 0) {
                    if (i == 1) {
                        String str = (String) c29947b.f116404k;
                        linkedHashMap = (LinkedHashMap) c29947b.f116403j;
                        c51184wj2 = (C51184wj2) c29947b.f116402i;
                        DeepRecursiveScope<Unit, AbstractC51767xi2> deepRecursiveScope3 = (DeepRecursiveScope) c29947b.f116401h;
                        ResultKt.throwOnFailure(obj2);
                        c29947b2 = c29947b;
                        Object obj3 = coroutine_suspended;
                        linkedHashMap.put(str, (AbstractC51767xi2) obj2);
                        byte mo78439m = c51184wj2.f116395a.mo78439m();
                        if (mo78439m == 4) {
                            if (mo78439m == 7) {
                                b = mo78439m;
                                if (b == 6) {
                                    c51184wj2.f116395a.m113124n((byte) 7);
                                } else if (b == 4) {
                                    AbstractC0809C0.m113114y(c51184wj2.f116395a, "Unexpected trailing comma", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                                return new C35899Si2(linkedHashMap);
                            }
                            AbstractC0809C0.m113114y(c51184wj2.f116395a, "Expected end of the object or comma", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        obj = obj3;
                        b = mo78439m;
                        deepRecursiveScope2 = deepRecursiveScope3;
                        if (c51184wj2.f116395a.mo78442f()) {
                            if (c51184wj2.f116396b) {
                                m113122q = c51184wj2.f116395a.m113120s();
                            } else {
                                m113122q = c51184wj2.f116395a.m113122q();
                            }
                            c51184wj2.f116395a.m113124n((byte) 5);
                            Unit unit = Unit.INSTANCE;
                            c29947b2.f116401h = deepRecursiveScope2;
                            c29947b2.f116402i = c51184wj2;
                            c29947b2.f116403j = linkedHashMap;
                            c29947b2.f116404k = m113122q;
                            c29947b2.f116407n = 1;
                            Object callRecursive = deepRecursiveScope2.callRecursive(unit, c29947b2);
                            if (callRecursive == obj) {
                                return obj;
                            }
                            deepRecursiveScope3 = deepRecursiveScope2;
                            obj2 = callRecursive;
                            Object obj4 = obj;
                            str = m113122q;
                            obj3 = obj4;
                            linkedHashMap.put(str, (AbstractC51767xi2) obj2);
                            byte mo78439m2 = c51184wj2.f116395a.mo78439m();
                            if (mo78439m2 == 4) {
                            }
                        }
                        if (b == 6) {
                        }
                        return new C35899Si2(linkedHashMap);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                byte m113124n = this.f116395a.m113124n((byte) 6);
                if (this.f116395a.m113142E() != 4) {
                    c51184wj2 = this;
                    linkedHashMap = new LinkedHashMap();
                    obj = coroutine_suspended;
                    c29947b2 = c29947b;
                    b = m113124n;
                    deepRecursiveScope2 = deepRecursiveScope;
                    if (c51184wj2.f116395a.mo78442f()) {
                    }
                    if (b == 6) {
                    }
                    return new C35899Si2(linkedHashMap);
                }
                AbstractC0809C0.m113114y(this.f116395a, "Unexpected leading comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        c29947b = new C29947b(continuation);
        Object obj22 = c29947b.f116405l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29947b.f116407n;
        if (i == 0) {
        }
    }

    /* renamed from: j */
    public final AbstractC37303Yi2 m6433j(boolean z) {
        String m113120s;
        if (!this.f116396b && z) {
            m113120s = this.f116395a.m113122q();
        } else {
            m113120s = this.f116395a.m113120s();
        }
        String str = m113120s;
        if (!z && Intrinsics.areEqual(str, "null")) {
            return C35197Pi2.INSTANCE;
        }
        return new C34027Ki2(str, z, null, 4, null);
    }
}
