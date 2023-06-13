package p000;

import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m28432d2 = {"LFQ3;", "", "Lco/bird/android/model/constant/Permission;", C17296a.f69688o, "Lco/bird/android/model/constant/Permission;", "b", "()Lco/bird/android/model/constant/Permission;", "permission", "", "Z", "()Z", "granted", "<init>", "(Lco/bird/android/model/constant/Permission;Z)V", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FQ3 */
/* loaded from: classes3.dex */
public final class FQ3 {

    /* renamed from: a */
    public final Permission f9351a;

    /* renamed from: b */
    public final boolean f9352b;

    public FQ3(Permission permission, boolean z) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.f9351a = permission;
        this.f9352b = z;
    }

    /* renamed from: a */
    public final boolean m107154a() {
        return this.f9352b;
    }

    /* renamed from: b */
    public final Permission m107153b() {
        return this.f9351a;
    }
}
