package com.stripe.android.link.account;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {40}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes7.dex */
public final class LinkAccountManager$special$$inlined$transform$1 extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super AccountStatus>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC32730Eu1 $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n*L\n1#1,222:1\n44#2,36:223\n*E\n"})
    /* renamed from: com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189801<T> implements InterfaceC33198Gu1 {
        final /* synthetic */ InterfaceC33198Gu1<AccountStatus> $$this$flow;
        final /* synthetic */ LinkAccountManager this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1", m28418f = "LinkAccountManager.kt", m28417i = {0, 1}, m28416l = {229, 237, 249, 223}, m28415m = "emit", m28414n = {"this", "this"}, m28413s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* renamed from: com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C189811 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C189811(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C189801.this.emit(null, this);
            }
        }

        public C189801(InterfaceC33198Gu1 interfaceC33198Gu1, LinkAccountManager linkAccountManager) {
            this.this$0 = linkAccountManager;
            this.$$this$flow = interfaceC33198Gu1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0179 A[RETURN] */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C189811 c189811;
            Object coroutine_suspended;
            int i;
            InterfaceC33198Gu1<AccountStatus> interfaceC33198Gu1;
            CookieStore cookieStore;
            InterfaceC33198Gu1<AccountStatus> interfaceC33198Gu12;
            C189801<T> c189801;
            C189801<T> c1898012;
            AccountStatus accountStatus;
            AccountStatus accountStatus2;
            CookieStore cookieStore2;
            String newUserEmail$link_release;
            C189801<T> c1898013;
            AccountStatus accountStatus3;
            Object m116783constructorimpl;
            AccountStatus accountStatus4;
            LinkPaymentLauncher.Configuration configuration;
            AccountStatus accountStatus5;
            InterfaceC33198Gu1<AccountStatus> interfaceC33198Gu13;
            Object m116783constructorimpl2;
            Object m116783constructorimpl3;
            if (continuation instanceof C189811) {
                c189811 = (C189811) continuation;
                int i2 = c189811.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c189811.label = i2 - Integer.MIN_VALUE;
                    Object obj = c189811.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c189811.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        ResultKt.throwOnFailure(obj);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC33198Gu13 = (InterfaceC33198Gu1) c189811.L$0;
                                ResultKt.throwOnFailure(obj);
                                accountStatus5 = ((Result) obj).m116792unboximpl();
                                if (Result.m116790isSuccessimpl(accountStatus5)) {
                                    LinkAccount linkAccount = (LinkAccount) accountStatus5;
                                    if (linkAccount != null) {
                                        accountStatus5 = linkAccount.getAccountStatus();
                                    } else {
                                        accountStatus5 = null;
                                    }
                                }
                                m116783constructorimpl3 = Result.m116783constructorimpl(accountStatus5);
                                if (Result.m116786exceptionOrNullimpl(m116783constructorimpl3) != null) {
                                    m116783constructorimpl3 = AccountStatus.Error;
                                }
                                AccountStatus accountStatus6 = (AccountStatus) m116783constructorimpl3;
                                interfaceC33198Gu1 = interfaceC33198Gu13;
                                accountStatus2 = accountStatus6;
                                if (accountStatus2 == null) {
                                    accountStatus2 = AccountStatus.SignedOut;
                                }
                                c189811.L$0 = null;
                                c189811.L$1 = null;
                                c189811.label = 4;
                                if (interfaceC33198Gu1.emit(accountStatus2, c189811) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            interfaceC33198Gu12 = (InterfaceC33198Gu1) c189811.L$1;
                            c1898013 = (C189801) c189811.L$0;
                            ResultKt.throwOnFailure(obj);
                            accountStatus3 = ((Result) obj).m116792unboximpl();
                            if (Result.m116790isSuccessimpl(accountStatus3)) {
                                LinkAccount linkAccount2 = (LinkAccount) accountStatus3;
                                if (linkAccount2 != null) {
                                    accountStatus3 = linkAccount2.getAccountStatus();
                                } else {
                                    accountStatus3 = null;
                                }
                            }
                            m116783constructorimpl2 = Result.m116783constructorimpl(accountStatus3);
                            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl2) != null) {
                                m116783constructorimpl2 = AccountStatus.Error;
                            }
                            AccountStatus accountStatus7 = (AccountStatus) m116783constructorimpl2;
                            interfaceC33198Gu1 = interfaceC33198Gu12;
                            accountStatus2 = accountStatus7;
                            if (accountStatus2 == null) {
                                configuration = c1898013.this$0.config;
                                String customerEmail = configuration.getCustomerEmail();
                                if (customerEmail != null) {
                                    if (c1898013.this$0.hasUserLoggedOut(customerEmail)) {
                                        accountStatus2 = AccountStatus.SignedOut;
                                    } else {
                                        LinkAccountManager linkAccountManager = c1898013.this$0;
                                        c189811.L$0 = interfaceC33198Gu1;
                                        c189811.L$1 = null;
                                        c189811.label = 3;
                                        Object m116486lookupConsumer0E7RQCE$default = LinkAccountManager.m116486lookupConsumer0E7RQCE$default(linkAccountManager, customerEmail, false, c189811, 2, null);
                                        if (m116486lookupConsumer0E7RQCE$default == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        InterfaceC33198Gu1<AccountStatus> interfaceC33198Gu14 = interfaceC33198Gu1;
                                        accountStatus5 = m116486lookupConsumer0E7RQCE$default;
                                        interfaceC33198Gu13 = interfaceC33198Gu14;
                                        if (Result.m116790isSuccessimpl(accountStatus5)) {
                                        }
                                        m116783constructorimpl3 = Result.m116783constructorimpl(accountStatus5);
                                        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl3) != null) {
                                        }
                                        AccountStatus accountStatus62 = (AccountStatus) m116783constructorimpl3;
                                        interfaceC33198Gu1 = interfaceC33198Gu13;
                                        accountStatus2 = accountStatus62;
                                    }
                                } else {
                                    accountStatus2 = null;
                                }
                                if (accountStatus2 == null) {
                                }
                            }
                            c189811.L$0 = null;
                            c189811.L$1 = null;
                            c189811.label = 4;
                            if (interfaceC33198Gu1.emit(accountStatus2, c189811) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        interfaceC33198Gu12 = (InterfaceC33198Gu1) c189811.L$1;
                        c1898012 = (C189801) c189811.L$0;
                        ResultKt.throwOnFailure(obj);
                        accountStatus = ((Result) obj).m116792unboximpl();
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC33198Gu1 = this.$$this$flow;
                        LinkAccount linkAccount3 = (LinkAccount) t;
                        if (linkAccount3 == null || (accountStatus2 = linkAccount3.getAccountStatus()) == null) {
                            cookieStore = this.this$0.cookieStore;
                            if (cookieStore.getAuthSessionCookie$link_release() != null) {
                                LinkAccountManager linkAccountManager2 = this.this$0;
                                c189811.L$0 = this;
                                c189811.L$1 = interfaceC33198Gu1;
                                c189811.label = 1;
                                Object m116486lookupConsumer0E7RQCE$default2 = LinkAccountManager.m116486lookupConsumer0E7RQCE$default(linkAccountManager2, null, false, c189811, 2, null);
                                if (m116486lookupConsumer0E7RQCE$default2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c1898012 = this;
                                accountStatus = m116486lookupConsumer0E7RQCE$default2;
                                interfaceC33198Gu12 = interfaceC33198Gu1;
                            } else {
                                interfaceC33198Gu12 = interfaceC33198Gu1;
                                c189801 = this;
                                cookieStore2 = c189801.this$0.cookieStore;
                                newUserEmail$link_release = cookieStore2.getNewUserEmail$link_release();
                                if (newUserEmail$link_release == null) {
                                    LinkAccountManager linkAccountManager3 = c189801.this$0;
                                    c189811.L$0 = c189801;
                                    c189811.L$1 = interfaceC33198Gu12;
                                    c189811.label = 2;
                                    Object m116486lookupConsumer0E7RQCE$default3 = LinkAccountManager.m116486lookupConsumer0E7RQCE$default(linkAccountManager3, newUserEmail$link_release, false, c189811, 2, null);
                                    if (m116486lookupConsumer0E7RQCE$default3 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c1898013 = c189801;
                                    accountStatus3 = m116486lookupConsumer0E7RQCE$default3;
                                    if (Result.m116790isSuccessimpl(accountStatus3)) {
                                    }
                                    m116783constructorimpl2 = Result.m116783constructorimpl(accountStatus3);
                                    if (Result.m116786exceptionOrNullimpl(m116783constructorimpl2) != null) {
                                    }
                                    AccountStatus accountStatus72 = (AccountStatus) m116783constructorimpl2;
                                    interfaceC33198Gu1 = interfaceC33198Gu12;
                                    accountStatus2 = accountStatus72;
                                    if (accountStatus2 == null) {
                                    }
                                } else {
                                    c1898013 = c189801;
                                    interfaceC33198Gu1 = interfaceC33198Gu12;
                                    accountStatus2 = null;
                                    if (accountStatus2 == null) {
                                    }
                                }
                            }
                        }
                        c189811.L$0 = null;
                        c189811.L$1 = null;
                        c189811.label = 4;
                        if (interfaceC33198Gu1.emit(accountStatus2, c189811) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (Result.m116790isSuccessimpl(accountStatus)) {
                        LinkAccount linkAccount4 = (LinkAccount) accountStatus;
                        if (linkAccount4 != null) {
                            accountStatus = linkAccount4.getAccountStatus();
                        } else {
                            accountStatus = null;
                        }
                    }
                    m116783constructorimpl = Result.m116783constructorimpl(accountStatus);
                    if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                        m116783constructorimpl = AccountStatus.Error;
                    }
                    accountStatus4 = (AccountStatus) m116783constructorimpl;
                    if (accountStatus4 != null) {
                        c189801 = c1898012;
                        cookieStore2 = c189801.this$0.cookieStore;
                        newUserEmail$link_release = cookieStore2.getNewUserEmail$link_release();
                        if (newUserEmail$link_release == null) {
                        }
                    } else {
                        interfaceC33198Gu1 = interfaceC33198Gu12;
                        accountStatus2 = accountStatus4;
                        c189811.L$0 = null;
                        c189811.L$1 = null;
                        c189811.label = 4;
                        if (interfaceC33198Gu1.emit(accountStatus2, c189811) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            c189811 = new C189811(continuation);
            Object obj2 = c189811.result;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c189811.label;
            if (i == 0) {
            }
            if (Result.m116790isSuccessimpl(accountStatus)) {
            }
            m116783constructorimpl = Result.m116783constructorimpl(accountStatus);
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
            }
            accountStatus4 = (AccountStatus) m116783constructorimpl;
            if (accountStatus4 != null) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$special$$inlined$transform$1(InterfaceC32730Eu1 interfaceC32730Eu1, Continuation continuation, LinkAccountManager linkAccountManager) {
        super(2, continuation);
        this.$this_transform = interfaceC32730Eu1;
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkAccountManager$special$$inlined$transform$1 linkAccountManager$special$$inlined$transform$1 = new LinkAccountManager$special$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        linkAccountManager$special$$inlined$transform$1.L$0 = obj;
        return linkAccountManager$special$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC33198Gu1<? super AccountStatus> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        return ((LinkAccountManager$special$$inlined$transform$1) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC32730Eu1 interfaceC32730Eu1 = this.$this_transform;
            C189801 c189801 = new C189801((InterfaceC33198Gu1) this.L$0, this.this$0);
            this.label = 1;
            if (interfaceC32730Eu1.collect(c189801, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
