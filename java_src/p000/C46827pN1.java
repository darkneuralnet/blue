package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.DialogInterfaceC10997b;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LpN1;", "Landroidx/fragment/app/c;", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onStart", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/View;", "view", "t8", "(Landroid/view/View;)Landroid/app/Dialog;", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46827pN1 extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: c */
    public static final C27280a f103590c = new C27280a(null);

    /* renamed from: d */
    public static final int f103591d = 8;

    /* renamed from: b */
    public Function0<Unit> f103592b;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\t"}, m28432d2 = {"LpN1$a;", "", "Lkotlin/Function0;", "", "onDismiss", "LpN1;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pN1$a */
    /* loaded from: classes2.dex */
    public static final class C27280a {
        public /* synthetic */ C27280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C46827pN1 newDialog$default(C27280a c27280a, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return c27280a.m19383a(function0);
        }

        /* renamed from: a */
        public final C46827pN1 m19383a(Function0<Unit> function0) {
            C46827pN1 c46827pN1 = new C46827pN1();
            c46827pN1.f103592b = function0;
            return c46827pN1;
        }

        private C27280a() {
        }
    }

    /* renamed from: A9 */
    public static final void m19388A9(C46827pN1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        Function0<Unit> function0 = this$0.f103592b;
        if (function0 != null) {
            function0.invoke();
        }
        this$0.f103592b = null;
    }

    /* renamed from: B9 */
    public static final void m19387B9(C46827pN1 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.f103592b;
        if (function0 != null) {
            function0.invoke();
        }
        this$0.f103592b = null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setLayout(-2, -2);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = C32184Cl4.DefaultDialogAnimation;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        View view = requireActivity().getLayoutInflater().inflate(C39311cj4.dialog_how_to_ride, (ViewGroup) null, false);
        ((Button) view.findViewById(C36585Vg4.readyButton)).setOnClickListener(new View.OnClickListener() { // from class: nN1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C46827pN1.m19388A9(C46827pN1.this, view2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(view, "view");
        Dialog m19384t8 = m19384t8(view);
        m19384t8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: oN1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C46827pN1.m19387B9(C46827pN1.this, dialogInterface);
            }
        });
        return m19384t8;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-2, -2);
        }
    }

    /* renamed from: t8 */
    public final Dialog m19384t8(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DialogInterfaceC10997b.C10998a c10998a = new DialogInterfaceC10997b.C10998a(requireActivity());
        c10998a.mo70284r(view);
        DialogInterfaceC10997b mo70301a = c10998a.mo70301a();
        Intrinsics.checkNotNullExpressionValue(mo70301a, "builder.create()");
        return mo70301a;
    }
}
