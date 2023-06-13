package p000;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* renamed from: tt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49506tt2 {

    /* renamed from: tt2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC28959a<D> {
        C48913st2<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C48913st2<D> c48913st2, D d);

        void onLoaderReset(C48913st2<D> c48913st2);
    }

    /* renamed from: b */
    public static <T extends LifecycleOwner & InterfaceC37154Xr6> AbstractC49506tt2 m11259b(T t) {
        return new C50099ut2(t, t.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo9610a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C48913st2<D> mo9609c(int i, Bundle bundle, InterfaceC28959a<D> interfaceC28959a);

    /* renamed from: d */
    public abstract void mo9608d();
}
