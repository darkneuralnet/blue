package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LnM5;", "T", "Lh81;", "Lvf;", "V", "Lwb6;", "converter", "Lok6;", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "I", "getDelay", "()I", "delay", "<init>", "(I)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45636nM5<T> implements InterfaceC41946h81<T> {

    /* renamed from: a */
    public final int f99825a;

    public C45636nM5() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C45636nM5) || ((C45636nM5) obj).f99825a != this.f99825a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f99825a;
    }

    public C45636nM5(int i) {
        this.f99825a = i;
    }

    @Override // p000.InterfaceC25753lf
    /* renamed from: a */
    public <V extends AbstractC29607vf> InterfaceC46456ok6<V> mo12016a(InterfaceC51108wb6<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new C50013uk6(this.f99825a);
    }

    public /* synthetic */ C45636nM5(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
