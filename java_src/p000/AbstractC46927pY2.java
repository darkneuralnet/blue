package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m28432d2 = {"LpY2;", "LzY5;", "", "LMs5;", "", "index", "f0", "nestedName", "g0", "descriptor", "e0", "parentName", "childName", "d0", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pY2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46927pY2 extends AbstractC52858zY5<String> {
    /* renamed from: d0 */
    public String mo19130d0(String parentName, String childName) {
        boolean z;
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        if (parentName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return parentName + CoreConstants.DOT + childName;
        }
        return childName;
    }

    /* renamed from: e0 */
    public String mo13778e0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.mo10458f(i);
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: f0 */
    public final String mo1150a0(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        return m19128g0(mo13778e0(interfaceC34588Ms5, i));
    }

    /* renamed from: g0 */
    public final String m19128g0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String m1152Z = m1152Z();
        if (m1152Z == null) {
            m1152Z = "";
        }
        return mo19130d0(m1152Z, nestedName);
    }
}
