package p000;

import android.content.DialogInterface;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Ltu0;", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "", C17296a.f69688o, "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "b", "Ljava/util/Set;", "listeners", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterface$OnDismissListenerC49514tu0 implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final Set<DialogInterface.OnDismissListener> f111354b = new LinkedHashSet();

    /* renamed from: a */
    public final void m11252a(DialogInterface.OnDismissListener dismissListener) {
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        this.f111354b.add(dismissListener);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        for (DialogInterface.OnDismissListener onDismissListener : this.f111354b) {
            onDismissListener.onDismiss(dialog);
        }
    }
}
