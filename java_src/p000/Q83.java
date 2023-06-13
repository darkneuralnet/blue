package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.github.sceneview.node.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28432d2 = {"LQ83;", "", "Lio/github/sceneview/node/Node;", "child", "f", "E", "", "t", "A", "Lkotlin/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "onChildAdded", "s", "onChildRemoved", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "children", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Q83 */
/* loaded from: classes6.dex */
public interface Q83 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Q83$a */
    /* loaded from: classes6.dex */
    public static final class C6686a {
        /* renamed from: a */
        public static Node m88881a(Q83 q83, Node child) {
            List<? extends Node> plus;
            Intrinsics.checkNotNullParameter(child, "child");
            if (!q83.mo33225d().contains(child)) {
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Node>) ((Collection<? extends Object>) q83.mo33225d()), child);
                q83.setChildren(plus);
                child.m33190y0(q83);
                q83.mo33200t(child);
            }
            return child;
        }

        /* renamed from: b */
        public static List<Node> m88880b(Q83 q83) {
            List<Node> plus;
            List<Node> mo33225d = q83.mo33225d();
            ArrayList arrayList = new ArrayList();
            for (Node node : q83.mo33225d()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, node.m33240Q());
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) mo33225d, (Iterable) arrayList);
            return plus;
        }

        /* renamed from: c */
        public static Function1<Node, Unit> m88879c(Q83 q83) {
            return null;
        }

        /* renamed from: d */
        public static Function1<Node, Unit> m88878d(Q83 q83) {
            return null;
        }

        /* renamed from: e */
        public static void m88877e(Q83 q83, Node child) {
            Intrinsics.checkNotNullParameter(child, "child");
            Function1<Node, Unit> mo33196v = q83.mo33196v();
            if (mo33196v != null) {
                mo33196v.invoke(child);
            }
        }

        /* renamed from: f */
        public static void m88876f(Q83 q83, Node child) {
            Intrinsics.checkNotNullParameter(child, "child");
            Function1<Node, Unit> mo33202s = q83.mo33202s();
            if (mo33202s != null) {
                mo33202s.invoke(child);
            }
        }

        /* renamed from: g */
        public static Node m88875g(Q83 q83, Node child) {
            List<? extends Node> minus;
            Intrinsics.checkNotNullParameter(child, "child");
            if (q83.mo33225d().contains(child)) {
                minus = CollectionsKt___CollectionsKt.minus(q83.mo33225d(), child);
                q83.setChildren(minus);
                child.m33190y0(null);
                q83.mo33267A(child);
            }
            return child;
        }
    }

    /* renamed from: A */
    void mo33267A(Node node);

    /* renamed from: E */
    Node mo33259E(Node node);

    /* renamed from: d */
    List<Node> mo33225d();

    /* renamed from: f */
    Node mo33221f(Node node);

    /* renamed from: s */
    Function1<Node, Unit> mo33202s();

    void setChildren(List<? extends Node> list);

    /* renamed from: t */
    void mo33200t(Node node);

    /* renamed from: v */
    Function1<Node, Unit> mo33196v();
}
