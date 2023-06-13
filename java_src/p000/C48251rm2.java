package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lrm2;", "LTE3;", "Lsm2;", "LgV2$c;", "Lg01;", "", "parentData", "B", "<set-?>", "l", "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "e0", "(Ljava/lang/Object;)V", "layoutId", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48251rm2 extends InterfaceC41563gV2.AbstractC20914c implements TE3, InterfaceC48843sm2 {

    /* renamed from: l */
    public Object f107604l;

    public C48251rm2(Object layoutId) {
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        this.f107604l = layoutId;
    }

    @Override // p000.TE3
    /* renamed from: B */
    public Object mo15408B(InterfaceC41273g01 interfaceC41273g01, Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
        return this;
    }

    /* renamed from: e0 */
    public void m15407e0(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f107604l = obj;
    }

    @Override // p000.InterfaceC48843sm2
    public Object getLayoutId() {
        return this.f107604l;
    }
}
