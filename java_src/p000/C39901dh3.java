package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Ldh3;", "", "LJm2;", "node", "", "c", "rootNode", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "layoutNode", "b", "LLX2;", "LLX2;", "layoutNodes", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,73:1\n1182#2:74\n1161#2,2:75\n728#3,2:77\n728#3,2:79\n492#3,11:81\n460#3,11:93\n163#4:92\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:74\n26#1:75,2\n29#1:77,2\n35#1:79,2\n42#1:81,11\n56#1:93,11\n56#1:92\n*E\n"})
/* renamed from: dh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39901dh3 {

    /* renamed from: b */
    public static final C19841a f77053b = new C19841a(null);

    /* renamed from: a */
    public final LX2<C33829Jm2> f77054a = new LX2<>(new C33829Jm2[16], 0);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Ldh3$a;", "", "<init>", "()V", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dh3$a */
    /* loaded from: classes.dex */
    public static final class C19841a {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Ldh3$a$a;", "Ljava/util/Comparator;", "LJm2;", "Lkotlin/Comparator;", C17296a.f69688o, "b", "", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: dh3$a$a */
        /* loaded from: classes.dex */
        public static final class C19842a implements Comparator<C33829Jm2> {

            /* renamed from: b */
            public static final C19842a f77055b = new C19842a();

            private C19842a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C33829Jm2 a, C33829Jm2 b) {
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                int compare = Intrinsics.compare(b.m99814O(), a.m99814O());
                if (compare != 0) {
                    return compare;
                }
                return Intrinsics.compare(a.hashCode(), b.hashCode());
            }
        }

        public /* synthetic */ C19841a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19841a() {
        }
    }

    /* renamed from: a */
    public final void m43883a() {
        this.f77054a.m96703G(C19841a.C19842a.f77055b);
        LX2<C33829Jm2> lx2 = this.f77054a;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            int i = m96690u - 1;
            C33829Jm2[] m96691s = lx2.m96691s();
            do {
                C33829Jm2 c33829Jm2 = m96691s[i];
                if (c33829Jm2.m99766l0()) {
                    m43882b(c33829Jm2);
                }
                i--;
            } while (i >= 0);
            this.f77054a.m96696h();
        }
        this.f77054a.m96696h();
    }

    /* renamed from: b */
    public final void m43882b(C33829Jm2 c33829Jm2) {
        c33829Jm2.m99831F();
        int i = 0;
        c33829Jm2.m99729y1(false);
        LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
        int m96690u = m99736w0.m96690u();
        if (m96690u > 0) {
            C33829Jm2[] m96691s = m99736w0.m96691s();
            do {
                m43882b(m96691s[i]);
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: c */
    public final void m43881c(C33829Jm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f77054a.m96701b(node);
        node.m99729y1(true);
    }

    /* renamed from: d */
    public final void m43880d(C33829Jm2 rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        this.f77054a.m96696h();
        this.f77054a.m96701b(rootNode);
        rootNode.m99729y1(true);
    }
}
