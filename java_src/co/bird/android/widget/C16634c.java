package co.bird.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import co.bird.android.widget.C16634c;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import io.reactivex.AbstractC24507p;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u0016B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00100\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/widget/c;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/content/DialogInterface;", "dialog", "", "onDismiss", "onPause", "Lio/reactivex/p;", "Lco/bird/android/widget/c$b;", "B9", "which", "D9", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/c;", "buttonSelection", "<init>", "()V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.widget.c */
/* loaded from: classes4.dex */
public final class C16634c extends C17714b {

    /* renamed from: c */
    public static final C16635a f67802c = new C16635a(null);

    /* renamed from: b */
    public final C24556c<EnumC16636b> f67803b;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/c$a;", "", "", "DISMISS_TIMEOUT_MS", "J", "", "EXTRA_BOTTOM_MODAL_SHEET_MODEL", "Ljava/lang/String;", "TAG", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.c$a */
    /* loaded from: classes4.dex */
    public static final class C16635a {
        public /* synthetic */ C16635a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16635a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.c$b */
    /* loaded from: classes4.dex */
    public enum EnumC16636b {
        PRIMARY,
        SECONDARY
    }

    public C16634c() {
        C24556c<EnumC16636b> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<WhichButton>()");
        this.f67803b = m31906k0;
    }

    /* renamed from: E9 */
    public static final void m54228E9(C16634c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* renamed from: G9 */
    public static final void m54227G9(C16634c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54229D9(EnumC16636b.PRIMARY);
    }

    /* renamed from: I9 */
    public static final void m54226I9(C16634c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54229D9(EnumC16636b.PRIMARY);
    }

    /* renamed from: J9 */
    public static final void m54225J9(C16634c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54229D9(EnumC16636b.SECONDARY);
    }

    /* renamed from: B9 */
    public final AbstractC24507p<EnumC16636b> m54230B9() {
        return this.f67803b;
    }

    /* renamed from: D9 */
    public final void m54229D9(EnumC16636b enumC16636b) {
        this.f67803b.onSuccess(enumC16636b);
        new Handler().postDelayed(new Runnable() { // from class: uZ
            @Override // java.lang.Runnable
            public final void run() {
                C16634c.m54228E9(C16634c.this);
            }
        }, 250L);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        BottomModalSheetModel bottomModalSheetModel = arguments != null ? (BottomModalSheetModel) arguments.getParcelable("bottom_modal_sheet_model") : null;
        if (bottomModalSheetModel == null) {
            bottomModalSheetModel = new BottomModalSheetModel(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        Function1<Context, BottomModalSheetLayout> m54739b = bottomModalSheetModel.m54739b();
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        BottomModalSheetLayout invoke = m54739b.invoke(context);
        if (viewGroup != null) {
            invoke.setLayoutParams(new LinearLayout.LayoutParams(viewGroup.getLayoutParams()));
        }
        if (bottomModalSheetModel.m54727o() != null) {
            invoke.setTitle(bottomModalSheetModel.m54727o());
        } else {
            Integer m54728n = bottomModalSheetModel.m54728n();
            if (m54728n != null) {
                invoke.setTitle(inflater.getContext().getResources().getString(m54728n.intValue()));
            }
        }
        String m54729m = bottomModalSheetModel.m54729m();
        if (m54729m != null) {
            invoke.setSubtitle(m54729m);
        }
        invoke.setButtonMode(bottomModalSheetModel.m54738c());
        Integer m54735g = bottomModalSheetModel.m54735g();
        if (m54735g != null) {
            invoke.setPrimaryButtonText(inflater.getContext().getResources().getString(m54735g.intValue()));
            ((Button) invoke.findViewById(C52955zi4.primaryButtonSingle)).setOnClickListener(new View.OnClickListener() { // from class: rZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16634c.m54227G9(C16634c.this, view);
                }
            });
            ((Button) invoke.findViewById(C52955zi4.primaryButtonDouble)).setOnClickListener(new View.OnClickListener() { // from class: sZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16634c.m54226I9(C16634c.this, view);
                }
            });
        }
        Integer m54732j = bottomModalSheetModel.m54732j();
        if (m54732j != null) {
            invoke.setSecondaryButtonText(inflater.getContext().getResources().getString(m54732j.intValue()));
            ((Button) invoke.findViewById(C52955zi4.secondaryButton)).setOnClickListener(new View.OnClickListener() { // from class: tZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16634c.m54225J9(C16634c.this, view);
                }
            });
        }
        Integer m54734h = bottomModalSheetModel.m54734h();
        if (m54734h != null) {
            invoke.setPrimaryButtonBackgroundDrawable(m54734h.intValue());
        }
        Integer m54730l = bottomModalSheetModel.m54730l();
        if (m54730l != null) {
            invoke.setSecondaryButtonTextColor(m54730l.intValue());
        }
        Integer m54731k = bottomModalSheetModel.m54731k();
        if (m54731k != null) {
            invoke.setSecondaryButtonBackgroundDrawable(m54731k.intValue());
        }
        Integer m54733i = bottomModalSheetModel.m54733i();
        if (m54733i != null) {
            invoke.setPrimaryButtonTextColor(m54733i.intValue());
        }
        invoke.setIcon(bottomModalSheetModel.m54736e());
        Boolean m54737d = bottomModalSheetModel.m54737d();
        if (m54737d != null) {
            setCancelable(m54737d.booleanValue());
        }
        return invoke;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f67803b.m31905l0()) {
            this.f67803b.onComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }
}
