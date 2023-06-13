package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;", "Landroidx/core/app/JobIntentService;", "Landroid/content/Intent;", "intent", "", "g", "LZC0;", "k", "LZC0;", Action.SCOPE_ATTRIBUTE, "<init>", "()V", "l", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ClearDatabaseService extends JobIntentService {

    /* renamed from: l */
    public static final C17150a f69224l = new C17150a(null);

    /* renamed from: k */
    public final ZC0 f69225k = C37824aD0.m71789b();

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "work", "", C17296a.f69688o, "", "CLEAN_DATABASE_JOB_ID", "I", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.support.ClearDatabaseService$a */
    /* loaded from: classes5.dex */
    public static final class C17150a {
        public /* synthetic */ C17150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m52984a(Context context, Intent work) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(work, "work");
            JobIntentService.m67746d(context, ClearDatabaseService.class, 123321, work);
        }

        private C17150a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.ClearDatabaseService$onHandleWork$1", m28418f = "ClearDatabaseService.kt", m28417i = {}, m28416l = {16}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.support.ClearDatabaseService$b */
    /* loaded from: classes5.dex */
    public static final class C17151b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69226h;

        public C17151b(Continuation<? super C17151b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17151b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17151b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69226h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NN1 m36551b = C42041hI4.f84975a.m36551b();
                this.f69226h = 1;
                if (m36551b.mo94003h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C17156a.f69245d.m52962a();
            Context applicationContext = ClearDatabaseService.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            new C17156a(applicationContext).m52967g();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.core.app.JobIntentService
    /* renamed from: g */
    public void mo52985g(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C42041hI4 c42041hI4 = C42041hI4.f84975a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        c42041hI4.m36552a(applicationContext);
        Z30.m73800d(this.f69225k, null, null, new C17151b(null), 3, null);
    }
}
