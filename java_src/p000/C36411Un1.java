package p000;

import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LUn1;", "Li66;", "", "name", "Lb66;", C17296a.f69688o, "Lxn1;", "Lxn1;", "firebasePerformance", "<init>", "(Lxn1;)V", "co.bird.android.lib.performance"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Un1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36411Un1 implements InterfaceC42524i66 {

    /* renamed from: a */
    public final C51816xn1 f37987a;

    public C36411Un1(C51816xn1 firebasePerformance) {
        Intrinsics.checkNotNullParameter(firebasePerformance, "firebasePerformance");
        this.f37987a = firebasePerformance;
    }

    @Override // p000.InterfaceC42524i66
    /* renamed from: a */
    public InterfaceC38356b66 mo34441a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Trace m4708e = this.f37987a.m4708e(name);
        Intrinsics.checkNotNullExpressionValue(m4708e, "firebasePerformance.newTrace(name)");
        return new C36177Tn1(m4708e);
    }
}
