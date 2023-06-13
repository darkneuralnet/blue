package p000;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;
/* renamed from: XY5 */
/* loaded from: classes6.dex */
public abstract class XY5<ResultT> {
    @NonNull
    /* renamed from: a */
    public abstract XY5<ResultT> mo1427a(@NonNull InterfaceC44031kf3<ResultT> interfaceC44031kf3);

    @NonNull
    /* renamed from: b */
    public abstract XY5<ResultT> mo1426b(@NonNull Executor executor, @NonNull InterfaceC34946Og3 interfaceC34946Og3);

    @NonNull
    /* renamed from: c */
    public abstract XY5<ResultT> mo1425c(@NonNull Executor executor, @NonNull InterfaceC45830nh3<? super ResultT> interfaceC45830nh3);

    @Nullable
    /* renamed from: d */
    public abstract Exception mo1424d();

    @NonNull
    /* renamed from: e */
    public abstract ResultT mo1423e();

    /* renamed from: f */
    public abstract boolean mo1422f();

    /* renamed from: g */
    public abstract boolean mo1421g();
}
