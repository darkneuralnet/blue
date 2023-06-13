package p000;

import android.os.Handler;
import android.view.View;
import androidx.compose.p003ui.platform.WindowRecomposer_androidKt;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LtC6;", "", "Landroid/view/View;", "rootView", "Lqs4;", C17296a.f69688o, "(Landroid/view/View;)Lqs4;", "Ljava/util/concurrent/atomic/AtomicReference;", "LsC6;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tC6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49104tC6 {

    /* renamed from: a */
    public static final C49104tC6 f110135a = new C49104tC6();

    /* renamed from: b */
    public static final AtomicReference<InterfaceC48511sC6> f110136b = new AtomicReference<>(InterfaceC48511sC6.f108445a.m14563a());

    /* renamed from: c */
    public static final int f110137c = 8;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"tC6$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tC6$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC28650a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC52943zh2 f110138b;

        public View$OnAttachStateChangeListenerC28650a(InterfaceC52943zh2 interfaceC52943zh2) {
            this.f110138b = interfaceC52943zh2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v.removeOnAttachStateChangeListener(this);
            InterfaceC52943zh2.C31478a.m550a(this.f110138b, null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m28418f = "WindowRecomposer.android.kt", m28417i = {}, m28416l = {233}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: tC6$b */
    /* loaded from: classes.dex */
    public static final class C28651b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f110139h;

        /* renamed from: i */
        public final /* synthetic */ C47720qs4 f110140i;

        /* renamed from: j */
        public final /* synthetic */ View f110141j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28651b(C47720qs4 c47720qs4, View view, Continuation<? super C28651b> continuation) {
            super(2, continuation);
            this.f110140i = c47720qs4;
            this.f110141j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28651b(this.f110140i, this.f110141j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C28651b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            View view;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f110139h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C47720qs4 c47720qs4 = this.f110140i;
                    this.f110139h = 1;
                    if (c47720qs4.m16866b0(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (WindowRecomposer_androidKt.m68503f(view) == this.f110140i) {
                    WindowRecomposer_androidKt.m68500i(this.f110141j, null);
                }
                return Unit.INSTANCE;
            } finally {
                if (WindowRecomposer_androidKt.m68503f(this.f110141j) == this.f110140i) {
                    WindowRecomposer_androidKt.m68500i(this.f110141j, null);
                }
            }
        }
    }

    private C49104tC6() {
    }

    /* renamed from: a */
    public final C47720qs4 m12601a(View rootView) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        C47720qs4 mo14562a = f110136b.get().mo14562a(rootView);
        WindowRecomposer_androidKt.m68500i(rootView, mo14562a);
        VC1 vc1 = VC1.f38731b;
        Handler handler = rootView.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "rootView.handler");
        m73800d = Z30.m73800d(vc1, TE1.m84164b(handler, "windowRecomposer cleanup").mo85816S(), null, new C28651b(mo14562a, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC28650a(m73800d));
        return mo14562a;
    }
}
