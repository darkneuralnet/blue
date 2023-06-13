package p000;

import co.bird.android.model.filter.NestTypeFilter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, m28432d2 = {"LQl1;", "LPl1;", "La94;", "Lco/bird/android/model/filter/NestTypeFilter;", C17296a.f69688o, "La94;", "()La94;", "nestTypeFilter", "Lgl;", "preference", "<init>", "(Lgl;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ql1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35457Ql1 implements InterfaceC35223Pl1 {

    /* renamed from: a */
    public final C37791a94<NestTypeFilter> f30843a;

    public C35457Ql1(C22454gl preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f30843a = C37791a94.C10586a.create$default(C37791a94.f49908h, new NestTypeFilter(false, 1, null), null, 2, null);
        mo88087a().accept(preference.m37611j0());
    }

    @Override // p000.InterfaceC35223Pl1
    /* renamed from: a */
    public C37791a94<NestTypeFilter> mo88087a() {
        return this.f30843a;
    }
}
