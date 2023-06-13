package p000;

import android.content.Context;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Gt7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33195Gt7 implements InterfaceC41790gs4 {

    /* renamed from: h */
    public static final DV7 f12591h = RV7.m86681a();

    /* renamed from: a */
    public final Context f12592a;

    /* renamed from: b */
    public final LM7 f12593b;

    /* renamed from: c */
    public final C40894fM7 f12594c;

    /* renamed from: d */
    public final C42062hK7 f12595d;

    /* renamed from: e */
    public final C42772iX7 f12596e;

    /* renamed from: f */
    public final C40687f08 f12597f;

    /* renamed from: g */
    public final OU7 f12598g;

    public C33195Gt7(Context context, LM7 lm7, C40894fM7 c40894fM7, C42062hK7 c42062hK7, C42772iX7 c42772iX7, C40687f08 c40687f08, OU7 ou7) {
        this.f12592a = context;
        this.f12593b = lm7;
        this.f12594c = c40894fM7;
        this.f12595d = c42062hK7;
        this.f12596e = c42772iX7;
        this.f12597f = c40687f08;
        this.f12598g = ou7;
    }

    /* renamed from: a */
    public static C33195Gt7 m104608a(Context context) {
        LM7 lm7 = new LM7(context);
        C40894fM7 c40894fM7 = new C40894fM7(context);
        C42062hK7 c42062hK7 = new C42062hK7();
        DV7 dv7 = f12591h;
        return new C33195Gt7(context, lm7, c40894fM7, c42062hK7, new C42772iX7(dv7), new C40687f08(context, dv7), OU7.m92168b());
    }

    @Override // p000.InterfaceC41790gs4
    /* renamed from: b */
    public final Task<RecaptchaHandle> mo8973b(String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (str != null) {
            this.f12593b.m97022b(new BinderC53028zp7(this, taskCompletionSource), str, this.f12592a.getPackageName(), this.f12598g);
            return taskCompletionSource.getTask();
        }
        throw new NullPointerException("Cannot call init with a null site key.");
    }

    @Override // p000.InterfaceC41790gs4
    /* renamed from: g */
    public final Task<RecaptchaResultData> mo8972g(RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        if (recaptchaHandle != null && recaptchaAction != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f12594c.m41493e(new BinderC48888sq7(this, taskCompletionSource), recaptchaHandle, new RecaptchaAction(recaptchaAction, C38029aZ7.m71215a(this.f12592a, recaptchaHandle.m50544v())), this.f12598g);
            return taskCompletionSource.getTask();
        }
        throw new NullPointerException("Cannot call execute with a null RecaptchaHandle or a null RecaptchaAction. Make sure to call init first.");
    }
}
