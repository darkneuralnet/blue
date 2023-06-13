package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.LongCompanionObject;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LoP5;", "Ljz5;", "LtP5;", "", "subscriptionCount", "LEu1;", "Lhz5;", C17296a.f69688o, "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: oP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46256oP5 implements InterfaceC43640jz5 {

    /* renamed from: b */
    public final long f101951b;

    /* renamed from: c */
    public final long f101952c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"LGu1;", "Lhz5;", "", "count", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m28418f = "SharingStarted.kt", m28417i = {1, 2, 3}, m28416l = {178, 180, 182, 183, 185}, m28415m = "invokeSuspend", m28414n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m28413s = {"L$0", "L$0", "L$0"})
    /* renamed from: oP5$a */
    /* loaded from: classes8.dex */
    public static final class C26975a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super EnumC42454hz5>, Integer, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f101953h;

        /* renamed from: i */
        public /* synthetic */ Object f101954i;

        /* renamed from: j */
        public /* synthetic */ int f101955j;

        public C26975a(Continuation<? super C26975a> continuation) {
            super(3, continuation);
        }

        /* renamed from: e */
        public final Object m21097e(InterfaceC33198Gu1<? super EnumC42454hz5> interfaceC33198Gu1, int i, Continuation<? super Unit> continuation) {
            C26975a c26975a = new C26975a(continuation);
            c26975a.f101954i = interfaceC33198Gu1;
            c26975a.f101955j = i;
            return c26975a.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC33198Gu1<? super EnumC42454hz5> interfaceC33198Gu1, Integer num, Continuation<? super Unit> continuation) {
            return m21097e(interfaceC33198Gu1, num.intValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC33198Gu1 interfaceC33198Gu1;
            long j;
            EnumC42454hz5 enumC42454hz5;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f101953h;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f101954i;
                                ResultKt.throwOnFailure(obj);
                                enumC42454hz5 = EnumC42454hz5.STOP_AND_RESET_REPLAY_CACHE;
                                this.f101954i = null;
                                this.f101953h = 5;
                                if (interfaceC33198Gu1.emit(enumC42454hz5, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f101954i;
                            ResultKt.throwOnFailure(obj);
                            j = C46256oP5.this.f101952c;
                            this.f101954i = interfaceC33198Gu1;
                            this.f101953h = 4;
                            if (C48120rZ0.m15768a(j, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            enumC42454hz5 = EnumC42454hz5.STOP_AND_RESET_REPLAY_CACHE;
                            this.f101954i = null;
                            this.f101953h = 5;
                            if (interfaceC33198Gu1.emit(enumC42454hz5, this) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f101954i;
                        ResultKt.throwOnFailure(obj);
                        if (C46256oP5.this.f101952c > 0) {
                            EnumC42454hz5 enumC42454hz52 = EnumC42454hz5.STOP;
                            this.f101954i = interfaceC33198Gu1;
                            this.f101953h = 3;
                            if (interfaceC33198Gu1.emit(enumC42454hz52, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = C46256oP5.this.f101952c;
                            this.f101954i = interfaceC33198Gu1;
                            this.f101953h = 4;
                            if (C48120rZ0.m15768a(j, this) == coroutine_suspended) {
                            }
                        }
                        enumC42454hz5 = EnumC42454hz5.STOP_AND_RESET_REPLAY_CACHE;
                        this.f101954i = null;
                        this.f101953h = 5;
                        if (interfaceC33198Gu1.emit(enumC42454hz5, this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f101954i;
            if (this.f101955j > 0) {
                EnumC42454hz5 enumC42454hz53 = EnumC42454hz5.START;
                this.f101953h = 1;
                if (interfaceC33198Gu1.emit(enumC42454hz53, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            long j2 = C46256oP5.this.f101951b;
            this.f101954i = interfaceC33198Gu1;
            this.f101953h = 2;
            if (C48120rZ0.m15768a(j2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (C46256oP5.this.f101952c > 0) {
            }
            enumC42454hz5 = EnumC42454hz5.STOP_AND_RESET_REPLAY_CACHE;
            this.f101954i = null;
            this.f101953h = 5;
            if (interfaceC33198Gu1.emit(enumC42454hz5, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lhz5;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m28418f = "SharingStarted.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: oP5$b */
    /* loaded from: classes8.dex */
    public static final class C26976b extends SuspendLambda implements Function2<EnumC42454hz5, Continuation<? super Boolean>, Object> {

        /* renamed from: h */
        public int f101957h;

        /* renamed from: i */
        public /* synthetic */ Object f101958i;

        public C26976b(Continuation<? super C26976b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26976b c26976b = new C26976b(continuation);
            c26976b.f101958i = obj;
            return c26976b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(EnumC42454hz5 enumC42454hz5, Continuation<? super Boolean> continuation) {
            return ((C26976b) create(enumC42454hz5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f101957h == 0) {
                ResultKt.throwOnFailure(obj);
                if (((EnumC42454hz5) this.f101958i) != EnumC42454hz5.START) {
                    z = true;
                } else {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C46256oP5(long j, long j2) {
        boolean z;
        this.f101951b = j;
        this.f101952c = j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // p000.InterfaceC43640jz5
    /* renamed from: a */
    public InterfaceC32730Eu1<EnumC42454hz5> mo21100a(InterfaceC49220tP5<Integer> interfaceC49220tP5) {
        return C36708Vu1.m79255p(C36708Vu1.m79253r(C36708Vu1.m79271Q(interfaceC49220tP5, new C26975a(null)), new C26976b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C46256oP5) {
            C46256oP5 c46256oP5 = (C46256oP5) obj;
            if (this.f101951b == c46256oP5.f101951b && this.f101952c == c46256oP5.f101952c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f101951b) * 31) + Long.hashCode(this.f101952c);
    }

    public String toString() {
        List createListBuilder;
        List build;
        String joinToString$default;
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(2);
        if (this.f101951b > 0) {
            createListBuilder.add("stopTimeout=" + this.f101951b + "ms");
        }
        if (this.f101952c < LongCompanionObject.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.f101952c + "ms");
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
