package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, m28432d2 = {"LUZ0;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UZ0 */
/* loaded from: classes.dex */
public final class UZ0 implements N91 {
    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.m85885m(0, buffer.m85890h(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof UZ0;
    }

    public int hashCode() {
        return Reflection.getOrCreateKotlinClass(UZ0.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
