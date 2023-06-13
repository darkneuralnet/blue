package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Ljo2;", "LDG;", "", C17296a.f69688o, "LCo2;", "LCo2;", "getState", "()LCo2;", TransferTable.COLUMN_STATE, "", "getItemCount", "()I", "itemCount", "", "b", "()Z", "hasVisibleItems", "c", "firstVisibleIndex", DateTokenConverter.CONVERTER_KEY, "lastVisibleIndex", "<init>", "(LCo2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43527jo2 implements InterfaceC1438DG {

    /* renamed from: a */
    public final C32209Co2 f93379a;

    public C43527jo2(C32209Co2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f93379a = state;
    }

    @Override // p000.InterfaceC1438DG
    /* renamed from: a */
    public void mo29900a() {
        InterfaceC34614Mv4 m111530w = this.f93379a.m111530w();
        if (m111530w != null) {
            m111530w.mo94567g();
        }
    }

    @Override // p000.InterfaceC1438DG
    /* renamed from: b */
    public boolean mo29899b() {
        return !this.f93379a.m111535r().mo8015b().isEmpty();
    }

    @Override // p000.InterfaceC1438DG
    /* renamed from: c */
    public int mo29898c() {
        return this.f93379a.m111538o();
    }

    @Override // p000.InterfaceC1438DG
    /* renamed from: d */
    public int mo29897d() {
        Object last;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f93379a.m111535r().mo8015b());
        return ((InterfaceC45306mo2) last).getIndex();
    }

    @Override // p000.InterfaceC1438DG
    public int getItemCount() {
        return this.f93379a.m111535r().mo8016a();
    }
}
