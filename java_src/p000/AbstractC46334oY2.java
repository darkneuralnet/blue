package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m28432d2 = {"LoY2;", "LyY5;", "", "LMs5;", "", "index", "d0", "nestedName", "e0", "descriptor", "c0", "parentName", "childName", "b0", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oY2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46334oY2 extends AbstractC52265yY5<String> {
    /* renamed from: b0 */
    public String mo20910b0(String parentName, String childName) {
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

    /* renamed from: c0 */
    public String mo11845c0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.mo10458f(i);
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: d0 */
    public final String mo3303X(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        return m20908e0(mo11845c0(interfaceC34588Ms5, i));
    }

    /* renamed from: e0 */
    public final String m20908e0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String m3304W = m3304W();
        if (m3304W == null) {
            m3304W = "";
        }
        return mo20910b0(m3304W, nestedName);
    }
}
