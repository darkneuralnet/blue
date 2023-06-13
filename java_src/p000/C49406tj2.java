package p000;

import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006!"}, m28432d2 = {"Ltj2;", "Lpj2;", "LMs5;", "descriptor", "", "index", "", "c0", "q", "tag", "Lxi2;", "g0", "", C17296a.f69688o, "LSi2;", "k", "LSi2;", "z0", "()LSi2;", "value", "", "l", "Ljava/util/List;", UserMetadata.KEYDATA_FILENAME, "m", "I", "size", "n", "position", "Lbi2;", "json", "<init>", "(Lbi2;LSi2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49406tj2 extends C47035pj2 {

    /* renamed from: k */
    public final C35899Si2 f110939k;

    /* renamed from: l */
    public final List<String> f110940l;

    /* renamed from: m */
    public final int f110941m;

    /* renamed from: n */
    public int f110942n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49406tj2(AbstractC38706bi2 json, C35899Si2 value) {
        super(json, value, null, null, 12, null);
        List<String> list;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f110939k = value;
        list = CollectionsKt___CollectionsKt.toList(mo11842v0().keySet());
        this.f110940l = list;
        this.f110941m = list.size() * 2;
        this.f110942n = -1;
    }

    @Override // p000.C47035pj2, p000.AbstractC1694E0, p000.AbstractC52265yY5, p000.InterfaceC36230Tt0
    /* renamed from: a */
    public void mo3300a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // p000.C47035pj2, p000.AbstractC46334oY2
    /* renamed from: c0 */
    public String mo11845c0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f110940l.get(i / 2);
    }

    @Override // p000.C47035pj2, p000.AbstractC1694E0
    /* renamed from: g0 */
    public AbstractC51767xi2 mo11844g0(String tag) {
        Object value;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.f110942n % 2 == 0) {
            return C52953zi2.m530c(tag);
        }
        value = MapsKt__MapsKt.getValue(mo11842v0(), tag);
        return (AbstractC51767xi2) value;
    }

    @Override // p000.C47035pj2, p000.InterfaceC36230Tt0
    /* renamed from: q */
    public int mo11843q(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f110942n;
        if (i < this.f110941m - 1) {
            int i2 = i + 1;
            this.f110942n = i2;
            return i2;
        }
        return -1;
    }

    @Override // p000.C47035pj2, p000.AbstractC1694E0
    /* renamed from: z0 */
    public C35899Si2 mo11842v0() {
        return this.f110939k;
    }
}
