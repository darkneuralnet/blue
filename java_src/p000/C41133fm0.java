package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C27125p2;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\fH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0016\u001a\u00020\u0007*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"Lis5;", "node", "Lp2;", "info", "", DateTokenConverter.CONVERTER_KEY, "e", "", "b", "", "items", C17296a.f69688o, "Lem0;", "Lp2$b;", "kotlin.jvm.PlatformType", "f", "Lgm0;", "itemNode", "Lp2$c;", "g", "c", "(Lem0;)Z", "isLazyCollection", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"})
/* renamed from: fm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41133fm0 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fm0$a */
    /* loaded from: classes.dex */
    public static final class C20515a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C20515a f80615g = new C20515a();

        public C20515a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fm0$b */
    /* loaded from: classes.dex */
    public static final class C20516b extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C20516b f80616g = new C20516b();

        public C20516b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static final boolean m40884a(List<C42977is5> list) {
        List emptyList;
        Object first;
        int lastIndex;
        long m111935x;
        Object first2;
        int lastIndex2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            emptyList = new ArrayList();
            C42977is5 c42977is5 = list.get(0);
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
            int i = 0;
            while (i < lastIndex2) {
                i++;
                C42977is5 c42977is52 = list.get(i);
                C42977is5 c42977is53 = c42977is52;
                C42977is5 c42977is54 = c42977is5;
                emptyList.add(C32120Ce3.m111955d(C33056Ge3.m104938a(Math.abs(C32120Ce3.m111944o(c42977is54.m31735f().m91260g()) - C32120Ce3.m111944o(c42977is53.m31735f().m91260g())), Math.abs(C32120Ce3.m111943p(c42977is54.m31735f().m91260g()) - C32120Ce3.m111943p(c42977is53.m31735f().m91260g())))));
                c42977is5 = c42977is52;
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (emptyList.size() == 1) {
            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) emptyList);
            m111935x = ((C32120Ce3) first2).m111935x();
        } else if (!emptyList.isEmpty()) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) emptyList);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(emptyList);
            if (1 <= lastIndex) {
                int i2 = 1;
                while (true) {
                    first = C32120Ce3.m111955d(C32120Ce3.m111939t(((C32120Ce3) first).m111935x(), ((C32120Ce3) emptyList.get(i2)).m111935x()));
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            m111935x = ((C32120Ce3) first).m111935x();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (C32120Ce3.m111953f(m111935x) < C32120Ce3.m111954e(m111935x)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m40883b(C42977is5 c42977is5) {
        Intrinsics.checkNotNullParameter(c42977is5, "<this>");
        C38809bs5 m31731j = c42977is5.m31731j();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        if (C39420cs5.m44940a(m31731j, c45349ms5.m24819a()) == null && C39420cs5.m44940a(c42977is5.m31731j(), c45349ms5.m24799u()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m40882c(C40540em0 c40540em0) {
        return c40540em0.m42567b() < 0 || c40540em0.m42568a() < 0;
    }

    /* renamed from: d */
    public static final void m40881d(C42977is5 node, C27125p2 info) {
        int size;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        C38809bs5 m31731j = node.m31731j();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        C40540em0 c40540em0 = (C40540em0) C39420cs5.m44940a(m31731j, c45349ms5.m24819a());
        if (c40540em0 != null) {
            info.m20076h0(m40879f(c40540em0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (C39420cs5.m44940a(node.m31731j(), c45349ms5.m24799u()) != null) {
            List<C42977is5> m31724q = node.m31724q();
            int size2 = m31724q.size();
            for (int i = 0; i < size2; i++) {
                C42977is5 c42977is5 = m31724q.get(i);
                if (c42977is5.m31731j().m62260c(C45349ms5.f98933a.m24798v())) {
                    arrayList.add(c42977is5);
                }
            }
        }
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            boolean m40884a = m40884a(arrayList);
            if (m40884a) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (m40884a) {
                i2 = arrayList.size();
            }
            info.m20076h0(C27125p2.C27127b.m20034b(size, i2, false, 0));
        }
    }

    /* renamed from: e */
    public static final void m40880e(C42977is5 node, C27125p2 info) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        C38809bs5 m31731j = node.m31731j();
        C45349ms5 c45349ms5 = C45349ms5.f98933a;
        C41726gm0 c41726gm0 = (C41726gm0) C39420cs5.m44940a(m31731j, c45349ms5.m24818b());
        if (c41726gm0 != null) {
            info.m20074i0(m40878g(c41726gm0, node));
        }
        C42977is5 m31726o = node.m31726o();
        if (m31726o != null && C39420cs5.m44940a(m31726o.m31731j(), c45349ms5.m24799u()) != null) {
            C40540em0 c40540em0 = (C40540em0) C39420cs5.m44940a(m31726o.m31731j(), c45349ms5.m24819a());
            if ((c40540em0 != null && m40882c(c40540em0)) || !node.m31731j().m62260c(c45349ms5.m24798v())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<C42977is5> m31724q = m31726o.m31724q();
            int size = m31724q.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C42977is5 c42977is5 = m31724q.get(i4);
                if (c42977is5.m31731j().m62260c(C45349ms5.f98933a.m24798v())) {
                    arrayList.add(c42977is5);
                    if (c42977is5.m31728m().m99753q0() < node.m31728m().m99753q0()) {
                        i3++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean m40884a = m40884a(arrayList);
                if (m40884a) {
                    i = 0;
                } else {
                    i = i3;
                }
                if (m40884a) {
                    i2 = i3;
                } else {
                    i2 = 0;
                }
                C27125p2.C27128c m20033a = C27125p2.C27128c.m20033a(i, 1, i2, 1, false, ((Boolean) node.m31731j().m62257h(C45349ms5.f98933a.m24798v(), C20515a.f80615g)).booleanValue());
                if (m20033a != null) {
                    info.m20074i0(m20033a);
                }
            }
        }
    }

    /* renamed from: f */
    public static final C27125p2.C27127b m40879f(C40540em0 c40540em0) {
        return C27125p2.C27127b.m20034b(c40540em0.m42567b(), c40540em0.m42568a(), false, 0);
    }

    /* renamed from: g */
    public static final C27125p2.C27128c m40878g(C41726gm0 c41726gm0, C42977is5 c42977is5) {
        return C27125p2.C27128c.m20033a(c41726gm0.m37499c(), c41726gm0.m37498d(), c41726gm0.m37501a(), c41726gm0.m37500b(), false, ((Boolean) c42977is5.m31731j().m62257h(C45349ms5.f98933a.m24798v(), C20516b.f80616g)).booleanValue());
    }
}
