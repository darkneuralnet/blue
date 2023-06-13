package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.github.sceneview.node.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LP83;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/MotionEvent;", C17296a.f69688o, "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "Lio/github/sceneview/node/Node;", "b", "Lio/github/sceneview/node/Node;", "()Lio/github/sceneview/node/Node;", "node", "Lio/github/sceneview/renderable/Renderable;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "renderable", "<init>", "(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: P83 */
/* loaded from: classes6.dex */
public final class P83 {

    /* renamed from: a */
    public final MotionEvent f27961a;

    /* renamed from: b */
    public final Node f27962b;

    /* renamed from: c */
    public final Integer f27963c;

    public P83(MotionEvent motionEvent, Node node, Integer num) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f27961a = motionEvent;
        this.f27962b = node;
        this.f27963c = num;
    }

    /* renamed from: a */
    public final MotionEvent m90711a() {
        return this.f27961a;
    }

    /* renamed from: b */
    public final Node m90710b() {
        return this.f27962b;
    }

    /* renamed from: c */
    public final Integer m90709c() {
        return this.f27963c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P83) {
            P83 p83 = (P83) obj;
            return Intrinsics.areEqual(this.f27961a, p83.f27961a) && Intrinsics.areEqual(this.f27962b, p83.f27962b) && Intrinsics.areEqual(this.f27963c, p83.f27963c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f27961a.hashCode() * 31;
        Node node = this.f27962b;
        int hashCode2 = (hashCode + (node == null ? 0 : node.hashCode())) * 31;
        Integer num = this.f27963c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NodeMotionEvent(motionEvent=" + this.f27961a + ", node=" + this.f27962b + ", renderable=" + this.f27963c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
