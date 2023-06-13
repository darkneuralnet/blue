package androidx.compose.p003ui.draw;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u000e"}, m28432d2 = {"LgV2;", "LnE3;", "painter", "", "sizeToIntrinsics", "LK9;", "alignment", "LBA0;", "contentScale", "", "alpha", "Lsm0;", "colorFilter", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.b */
/* loaded from: classes.dex */
public final class C11292b {
    /* renamed from: a */
    public static final InterfaceC41563gV2 m68862a(InterfaceC41563gV2 interfaceC41563gV2, AbstractC45562nE3 painter, boolean z, InterfaceC4360K9 alignment, BA0 contentScale, float f, C48841sm0 c48841sm0) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        return interfaceC41563gV2.mo39266t0(new PainterModifierNodeElement(painter, z, alignment, contentScale, f, c48841sm0));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m68861b(InterfaceC41563gV2 interfaceC41563gV2, AbstractC45562nE3 abstractC45562nE3, boolean z, InterfaceC4360K9 interfaceC4360K9, BA0 ba0, float f, C48841sm0 c48841sm0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            interfaceC4360K9 = InterfaceC4360K9.f19170a.m99141e();
        }
        InterfaceC4360K9 interfaceC4360K92 = interfaceC4360K9;
        if ((i & 8) != 0) {
            ba0 = BA0.f1929a.m114315c();
        }
        BA0 ba02 = ba0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            c48841sm0 = null;
        }
        return m68862a(interfaceC41563gV2, abstractC45562nE3, z2, interfaceC4360K92, ba02, f2, c48841sm0);
    }
}
