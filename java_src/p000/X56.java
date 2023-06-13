package p000;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.DW5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"LX56;", "LDW5;", "LX56$a;", "newTouchListener", "", "g", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "p", "LX56$a;", "touchListener", "", "token", "LDW5$c;", "callbacks", "<init>", "(Landroid/view/View;Ljava/lang/Object;LDW5$c;)V", "(Landroid/view/View;LDW5$c;)V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: X56 */
/* loaded from: classes5.dex */
public final class X56 extends DW5 {

    /* renamed from: p */
    public InterfaceC9296a f42637p;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m28432d2 = {"LX56$a;", "", "", C17296a.f69688o, "b", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: X56$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9296a {
        /* renamed from: a */
        void mo77414a();

        /* renamed from: b */
        void mo77413b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X56(View view, Object obj, DW5.InterfaceC1509c interfaceC1509c) {
        super(view, obj, interfaceC1509c);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* renamed from: g */
    public final void m77415g(InterfaceC9296a newTouchListener) {
        Intrinsics.checkNotNullParameter(newTouchListener, "newTouchListener");
        this.f42637p = newTouchListener;
    }

    @Override // p000.DW5, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC9296a interfaceC9296a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (interfaceC9296a = this.f42637p) != null) {
                interfaceC9296a.mo77413b();
            }
        } else {
            InterfaceC9296a interfaceC9296a2 = this.f42637p;
            if (interfaceC9296a2 != null) {
                interfaceC9296a2.mo77414a();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X56(View view, DW5.InterfaceC1509c interfaceC1509c) {
        this(view, null, interfaceC1509c);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
