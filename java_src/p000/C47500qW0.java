package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
/* renamed from: qW0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47500qW0 extends AbstractC9915Yh {

    /* renamed from: a */
    public final String f105358a;

    /* renamed from: b */
    public final FirebaseException f105359b;

    public C47500qW0(String str, FirebaseException firebaseException) {
        Preconditions.checkNotEmpty(str);
        this.f105358a = str;
        this.f105359b = firebaseException;
    }

    /* renamed from: a */
    public static C47500qW0 m17479a(AbstractC8723Vh abstractC8723Vh) {
        Preconditions.checkNotNull(abstractC8723Vh);
        return new C47500qW0(abstractC8723Vh.mo19170b(), null);
    }
}
