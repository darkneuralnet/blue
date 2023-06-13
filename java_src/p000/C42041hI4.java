package p000;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, m28432d2 = {"LhI4;", "", "LNN1;", "b", "Landroid/content/Context;", "applicationContext", "", C17296a.f69688o, "LNN1;", "transactionRepository", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hI4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42041hI4 {

    /* renamed from: a */
    public static final C42041hI4 f84975a = new C42041hI4();

    /* renamed from: b */
    public static NN1 f84976b;

    private C42041hI4() {
    }

    /* renamed from: a */
    public final void m36552a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (f84976b == null) {
            f84976b = new MN1(ChuckerDatabase.f69221p.m53010a(applicationContext));
        }
    }

    /* renamed from: b */
    public final NN1 m36551b() {
        NN1 nn1 = f84976b;
        if (nn1 != null) {
            return nn1;
        }
        throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
    }
}
