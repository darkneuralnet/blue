package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000.InterfaceC45650nO1;
/* renamed from: yF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC52089yF0 implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: yF0$a */
    /* loaded from: classes.dex */
    public class C30497a extends C50310vF0 {
        public C30497a(InterfaceC45650nO1 interfaceC45650nO1, ComponentName componentName, Context context) {
            super(interfaceC45650nO1, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C50310vF0 c50310vF0);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new C30497a(InterfaceC45650nO1.AbstractBinderC26468a.m23914c5(iBinder), componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
