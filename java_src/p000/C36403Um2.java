package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33829Jm2;
import p000.C50986wO2;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\b\u001a\u00020\u0006*\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LUm2;", "", "", C17296a.f69688o, "LJm2;", "node", "", "c", "b", "", "f", DateTokenConverter.CONVERTER_KEY, "LJm2;", "root", "Ls01;", "Ls01;", "relayoutNodes", "", "LwO2$a;", "Ljava/util/List;", "postponedMeasureRequests", "<init>", "(LJm2;Ls01;Ljava/util/List;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,141:1\n33#2,6:142\n116#2,2:148\n33#2,6:150\n118#2:156\n116#2,2:157\n33#2,6:159\n118#2:165\n33#2,6:166\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:142,6\n59#1:148,2\n59#1:150,6\n59#1:156\n82#1:157,2\n82#1:159,6\n82#1:165\n134#1:166,6\n*E\n"})
/* renamed from: Um2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36403Um2 {

    /* renamed from: a */
    public final C33829Jm2 f37971a;

    /* renamed from: b */
    public final C48388s01 f37972b;

    /* renamed from: c */
    public final List<C50986wO2.C29867a> f37973c;

    public C36403Um2(C33829Jm2 root, C48388s01 relayoutNodes, List<C50986wO2.C29867a> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.f37971a = root;
        this.f37972b = relayoutNodes;
        this.f37973c = postponedMeasureRequests;
    }

    /* renamed from: e */
    public static final void m80878e(C36403Um2 c36403Um2, StringBuilder sb, C33829Jm2 c33829Jm2, int i) {
        boolean z;
        String m80877f = c36403Um2.m80877f(c33829Jm2);
        if (m80877f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            }
            sb.append(m80877f);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<C33829Jm2> m99818M = c33829Jm2.m99818M();
        int size = m99818M.size();
        for (int i3 = 0; i3 < size; i3++) {
            m80878e(c36403Um2, sb, m99818M.get(i3), i);
        }
    }

    /* renamed from: a */
    public final void m80882a() {
        if (!(!m80880c(this.f37971a))) {
            return;
        }
        System.out.println((Object) m80879d());
        throw new IllegalStateException("Inconsistency found!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r3 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m80881b(C33829Jm2 c33829Jm2) {
        C33829Jm2.EnumC4228e enumC4228e;
        boolean z;
        C50986wO2.C29867a c29867a;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
        C50986wO2.C29867a c29867a2 = null;
        if (m99756p0 != null) {
            enumC4228e = m99756p0.m99792Z();
        } else {
            enumC4228e = null;
        }
        if (!c33829Jm2.mo8156n()) {
            if (c33829Jm2.m99753q0() != Integer.MAX_VALUE) {
                if (m99756p0 != null && m99756p0.mo8156n()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (Intrinsics.areEqual(c33829Jm2.m99820K0(), Boolean.TRUE)) {
                if (c33829Jm2.m99787b0()) {
                    List<C50986wO2.C29867a> list = this.f37973c;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        C50986wO2.C29867a c29867a3 = list.get(i);
                        C50986wO2.C29867a c29867a4 = c29867a3;
                        if (Intrinsics.areEqual(c29867a4.m6904a(), c33829Jm2) && c29867a4.m6902c()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            c29867a2 = c29867a3;
                            break;
                        }
                        i++;
                    }
                    if (c29867a2 != null) {
                        return true;
                    }
                }
                if (c33829Jm2.m99787b0()) {
                    if (!this.f37972b.m14899b(c33829Jm2)) {
                        if (m99756p0 != null && m99756p0.m99787b0()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 && enumC4228e != C33829Jm2.EnumC4228e.LookaheadMeasuring) {
                            if (m99756p0 != null && m99756p0.m99777g0()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                return false;
                            }
                            XC2 m99781e0 = c33829Jm2.m99781e0();
                            Intrinsics.checkNotNull(m99781e0);
                            if (!Intrinsics.areEqual(m99781e0.m77188a(), c33829Jm2)) {
                                return false;
                            }
                        }
                    }
                    return true;
                } else if (c33829Jm2.m99789a0()) {
                    if (!this.f37972b.m14899b(c33829Jm2) && m99756p0 != null && !m99756p0.m99787b0() && !m99756p0.m99789a0() && enumC4228e != C33829Jm2.EnumC4228e.LookaheadMeasuring && enumC4228e != C33829Jm2.EnumC4228e.LookaheadLayingOut) {
                        if (!m99756p0.m99794Y()) {
                            return false;
                        }
                        XC2 m99781e02 = c33829Jm2.m99781e0();
                        Intrinsics.checkNotNull(m99781e02);
                        if (!Intrinsics.areEqual(m99781e02.m77188a(), c33829Jm2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        }
        if (c33829Jm2.m99777g0()) {
            List<C50986wO2.C29867a> list2 = this.f37973c;
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    c29867a = list2.get(i2);
                    C50986wO2.C29867a c29867a5 = c29867a;
                    if (Intrinsics.areEqual(c29867a5.m6904a(), c33829Jm2) && !c29867a5.m6902c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i2++;
                } else {
                    c29867a = null;
                    break;
                }
            }
            if (c29867a != null) {
                return true;
            }
        }
        if (c33829Jm2.m99777g0()) {
            if (!this.f37972b.m14899b(c33829Jm2)) {
                if (m99756p0 != null && m99756p0.m99777g0()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && enumC4228e != C33829Jm2.EnumC4228e.Measuring) {
                    return false;
                }
            }
            return true;
        }
        if (c33829Jm2.m99794Y()) {
            if (!this.f37972b.m14899b(c33829Jm2) && m99756p0 != null && !m99756p0.m99777g0() && !m99756p0.m99794Y() && enumC4228e != C33829Jm2.EnumC4228e.Measuring && enumC4228e != C33829Jm2.EnumC4228e.LayingOut) {
                return false;
            }
            return true;
        }
        if (Intrinsics.areEqual(c33829Jm2.m99820K0(), Boolean.TRUE)) {
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m80880c(C33829Jm2 c33829Jm2) {
        if (!m80881b(c33829Jm2)) {
            return false;
        }
        List<C33829Jm2> m99818M = c33829Jm2.m99818M();
        int size = m99818M.size();
        for (int i = 0; i < size; i++) {
            if (!m80880c(m99818M.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final String m80879d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        m80878e(this, sb, this.f37971a, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String m80877f(C33829Jm2 c33829Jm2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c33829Jm2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(c33829Jm2.m99792Z());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!c33829Jm2.mo8156n()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + c33829Jm2.m99773i0() + ']');
        if (!m80881b(c33829Jm2)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }
}
