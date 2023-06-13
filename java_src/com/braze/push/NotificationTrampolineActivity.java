package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.C11925l;
import com.braze.push.BrazePushReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, m28432d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class NotificationTrampolineActivity extends Activity {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$a */
    /* loaded from: classes2.dex */
    public static final class C17046a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17046a f69002g = new C17046a();

        public C17046a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "NotificationTrampolineActivity created";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$b */
    /* loaded from: classes2.dex */
    public static final class C17047b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17047b f69003g = new C17047b();

        public C17047b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity paused and finishing";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$c */
    /* loaded from: classes2.dex */
    public static final class C17048c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17048c f69004g = new C17048c();

        public C17048c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity received null intent. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$d */
    /* loaded from: classes2.dex */
    public static final class C17049d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17049d f69005g = new C17049d();

        public C17049d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity received intent with null action. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$e */
    /* loaded from: classes2.dex */
    public static final class C17050e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Intent f69006g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17050e(Intent intent) {
            super(0);
            this.f69006g = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Notification trampoline activity received intent: ", this.f69006g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$f */
    /* loaded from: classes2.dex */
    public static final class C17051f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17051f f69007g = new C17051f();

        public C17051f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to route intent to notification receiver";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.NotificationTrampolineActivity$g */
    /* loaded from: classes2.dex */
    public static final class C17052g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17052g f69008g = new C17052g();

        public C17052g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity finished processing. Delaying before finishing activity.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.push.NotificationTrampolineActivity$onResume$7", m28418f = "NotificationTrampolineActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.push.NotificationTrampolineActivity$h */
    /* loaded from: classes2.dex */
    public static final class C17053h extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69009h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.NotificationTrampolineActivity$h$a */
        /* loaded from: classes2.dex */
        public static final class C17054a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17054a f69011g = new C17054a();

            public C17054a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Delay complete. Finishing Notification trampoline activity now";
            }
        }

        public C17053h(Continuation<? super C17053h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C17053h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69009h == 0) {
                ResultKt.throwOnFailure(obj);
                C43664k20.m29442e(C43664k20.f93782a, NotificationTrampolineActivity.this, C43664k20.EnumC25082a.V, null, false, C17054a.f69011g, 6, null);
                NotificationTrampolineActivity.this.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C17053h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C17046a.f69002g, 6, null);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C17047b.f69003g, 6, null);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C17051f.f69007g, 4, null);
        }
        if (intent == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C17048c.f69004g, 7, null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C17049d.f69005g, 7, null);
            finish();
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C17050e(intent), 6, null);
        Intent intent2 = new Intent(action).setClass(this, C47815r20.m16602e());
        Intrinsics.checkNotNullExpressionValue(intent2, "Intent(action).setClass(…otificationReceiverClass)");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (C36977Wy0.m77599a()) {
            BrazePushReceiver.C17017a.m53242k(BrazePushReceiver.f68969a, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.f68969a.m53243j(this, intent2, false);
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C17052g.f69008g, 6, null);
        Z10.m73846b(Z10.f47750b, Integer.valueOf((int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION), null, new C17053h(null), 2, null);
    }
}
