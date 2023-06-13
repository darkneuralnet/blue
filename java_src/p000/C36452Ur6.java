package p000;

import androidx.lifecycle.InterfaceC11718e;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, m28432d2 = {"LXr6;", "owner", "LFE0;", C17296a.f69688o, "lifecycle-viewmodel_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewModelProviderGetKt")
/* renamed from: Ur6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36452Ur6 {
    /* renamed from: a */
    public static final FE0 m80740a(InterfaceC37154Xr6 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof InterfaceC11718e) {
            return ((InterfaceC11718e) owner).getDefaultViewModelCreationExtras();
        }
        return FE0.C2209a.f9049b;
    }
}
