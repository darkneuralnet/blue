package p000;

import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LQu;", "", "LPu;", "autofillNode", "", "c", "", "id", "", "value", "b", "(ILjava/lang/String;)Lkotlin/Unit;", "", C17296a.f69688o, "Ljava/util/Map;", "()Ljava/util/Map;", "children", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qu */
/* loaded from: classes.dex */
public final class C6975Qu {

    /* renamed from: a */
    public final Map<Integer, C6560Pu> f31167a = new LinkedHashMap();

    /* renamed from: a */
    public final Map<Integer, C6560Pu> m87646a() {
        return this.f31167a;
    }

    /* renamed from: b */
    public final Unit m87645b(int i, String value) {
        Function1<String, Unit> m89454f;
        Intrinsics.checkNotNullParameter(value, "value");
        C6560Pu c6560Pu = this.f31167a.get(Integer.valueOf(i));
        if (c6560Pu != null && (m89454f = c6560Pu.m89454f()) != null) {
            m89454f.invoke(value);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* renamed from: c */
    public final void m87644c(C6560Pu autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.f31167a.put(Integer.valueOf(autofillNode.m89455e()), autofillNode);
    }
}
