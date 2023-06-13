package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000b"}, m28432d2 = {"", "seen", "goldenMask", "LMs5;", "descriptor", "", "b", "", "seenArray", "goldenMaskArray", C17296a.f69688o, "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: zW3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52838zW3 {
    /* renamed from: a */
    public static final void m1276a(int[] seenArray, int[] goldenMaskArray, InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i = 0; i < length; i++) {
            int i2 = goldenMaskArray[i] & (~seenArray[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(descriptor.mo10458f((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.mo10456h());
    }

    /* renamed from: b */
    public static final void m1275b(int i, int i2, InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.mo10458f(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.mo10456h());
    }
}
