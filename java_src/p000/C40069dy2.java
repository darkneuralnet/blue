package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AuthenticationException;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LoginException;
import co.bird.android.model.NotLoggedInException;
import co.bird.android.model.UpdateRequestException;
import co.bird.android.model.UpdateRequiredException;
import co.bird.android.model.UserSuspendedException;
import co.bird.android.model.analytics.SplashScreenNavigation;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.functions.InterfaceC23483f;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C40069dy2;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"Ldy2;", "", "", "b", "", "e", C17296a.f69688o, "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "c", "LEa;", "LEa;", "analyticsManager", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Le13;", "Le13;", "navigator", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "f", "Ljava/util/concurrent/locks/Condition;", "condition", "", "g", "Z", "mainActivityLoaded", "<init>", "(LEa;Landroid/content/Context;Le13;Lgl;)V", "login-exception-handler_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40069dy2 {

    /* renamed from: a */
    public final InterfaceC1880Ea f77492a;

    /* renamed from: b */
    public final Context f77493b;

    /* renamed from: c */
    public final InterfaceC40099e13 f77494c;

    /* renamed from: d */
    public final C22454gl f77495d;

    /* renamed from: e */
    public final ReentrantLock f77496e;

    /* renamed from: f */
    public final Condition f77497f;

    /* renamed from: g */
    public boolean f77498g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dy2$a */
    /* loaded from: classes3.dex */
    public static final class C19918a extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Activity f77499g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: dy2$a$a */
        /* loaded from: classes3.dex */
        public static final class C19919a extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f77500g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19919a(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(1);
                this.f77500g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.f77500g.onSuccess(DialogResponse.OK);
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19918a(Activity activity) {
            super(1);
            this.f77499g = activity;
        }

        /* renamed from: c */
        public static final void m43459c(MaterialDialog dialogBuilder) {
            Intrinsics.checkNotNullParameter(dialogBuilder, "$dialogBuilder");
            dialogBuilder.setOnDismissListener(null);
            dialogBuilder.dismiss();
        }

        /* renamed from: d */
        public static final void m43458d(InterfaceC23444H emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(DialogResponse.DISMISS);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<DialogResponse> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (this.f77499g.isFinishing()) {
                emitter.onSuccess(DialogResponse.DISMISS);
                return;
            }
            MaterialDialog materialDialog = new MaterialDialog(this.f77499g, null, 2, null);
            C27665ql c27665ql = C27665ql.f105718d;
            final MaterialDialog cancelable = MaterialDialog.message$default(MaterialDialog.title$default(materialDialog, null, c27665ql.title(this.f77499g).toString(), 1, null), null, c27665ql.message(this.f77499g), null, 5, null).noAutoDismiss().cancelable(false);
            MaterialDialog.positiveButton$default(cancelable, null, this.f77499g.getString(c27665ql.mo3215a().intValue()), new C19919a(emitter), 1, null);
            cancelable.show();
            Unit unit = Unit.INSTANCE;
            Activity activity = this.f77499g;
            emitter.mo4878a(new InterfaceC23483f() { // from class: by2
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    C40069dy2.C19918a.m43459c(MaterialDialog.this);
                }
            });
            cancelable.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cy2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C40069dy2.C19918a.m43458d(InterfaceC23444H.this, dialogInterface);
                }
            });
            activity.getWindow().getDecorView().performHapticFeedback(1, 2);
        }
    }

    public C40069dy2(InterfaceC1880Ea analyticsManager, Context context, InterfaceC40099e13 navigator, C22454gl preference) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f77492a = analyticsManager;
        this.f77493b = context;
        this.f77494c = navigator;
        this.f77495d = preference;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f77496e = reentrantLock;
        this.f77497f = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public final void m43464a(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof LoginException) {
            C41318g46.m40159e(e);
            LoginException loginException = (LoginException) e;
            if (loginException instanceof NotLoggedInException) {
                this.f77492a.mo55956N(new SplashScreenNavigation("IntroMagicLink", "checkConfig_no_token"));
                this.f77494c.mo37189C2();
                this.f77494c.close();
            } else if (loginException instanceof AuthenticationException) {
                this.f77492a.mo55956N(new SplashScreenNavigation("IntroMagicLink", "checkConfig_existing_token"));
                this.f77495d.m37636d();
                this.f77494c.mo37189C2();
                this.f77494c.close();
            } else if (loginException instanceof UpdateRequiredException) {
                this.f77492a.mo55956N(new SplashScreenNavigation("PlayStore", null, 2, null));
                this.f77494c.mo37183D2(0);
                this.f77494c.close();
            } else if (loginException instanceof UserSuspendedException) {
                this.f77492a.mo55956N(new SplashScreenNavigation("AppClose", null, 2, null));
                this.f77494c.close();
            } else {
                boolean z = loginException instanceof UpdateRequestException;
            }
        }
    }

    /* renamed from: b */
    public final void m43463b() {
        ReentrantLock reentrantLock = this.f77496e;
        reentrantLock.lock();
        try {
            this.f77498g = true;
            this.f77497f.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final AbstractC23442F<DialogResponse> m43462c() {
        XE0 xe0;
        WeakReference<Activity> activity;
        Activity activity2;
        Context applicationContext = this.f77493b.getApplicationContext();
        if (applicationContext instanceof XE0) {
            xe0 = (XE0) applicationContext;
        } else {
            xe0 = null;
        }
        if (xe0 != null && (activity = xe0.getActivity()) != null && (activity2 = activity.get()) != null) {
            return C45832nh5.m23305k(new C19918a(activity2));
        }
        AbstractC23442F<DialogResponse> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }
}
