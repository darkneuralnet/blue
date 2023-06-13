package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.HY2;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b+\u0010,B#\b\u0016\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b+\u0010-J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020(0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006."}, m28432d2 = {"LIY2;", "LHY2;", "D", "", C17296a.f69688o, "()LHY2;", "Ld13;", "Ld13;", "getNavigator", "()Ld13;", "navigator", "", "b", "I", "getId", "()I", "id", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "route", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "LyY2;", "e", "Ljava/util/Map;", "arguments", "", "LFY2;", "f", "Ljava/util/List;", "deepLinks", "LxY2;", "g", "actions", "<init>", "(Ld13;ILjava/lang/String;)V", "(Ld13;Ljava/lang/String;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: IY2 */
/* loaded from: classes.dex */
public class IY2<D extends HY2> {

    /* renamed from: a */
    public final AbstractC39507d13<? extends D> f15872a;

    /* renamed from: b */
    public final int f15873b;

    /* renamed from: c */
    public final String f15874c;

    /* renamed from: d */
    public CharSequence f15875d;

    /* renamed from: e */
    public Map<String, C52262yY2> f15876e;

    /* renamed from: f */
    public List<FY2> f15877f;

    /* renamed from: g */
    public Map<Integer, C51669xY2> f15878g;

    public IY2(AbstractC39507d13<? extends D> navigator, int i, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f15872a = navigator;
        this.f15873b = i;
        this.f15874c = str;
        this.f15876e = new LinkedHashMap();
        this.f15877f = new ArrayList();
        this.f15878g = new LinkedHashMap();
    }

    /* renamed from: a */
    public D m101940a() {
        D mo173a = this.f15872a.mo173a();
        String str = this.f15874c;
        if (str != null) {
            mo173a.m103782D(str);
        }
        int i = this.f15873b;
        if (i != -1) {
            mo173a.m103769z(i);
        }
        mo173a.m103784A(this.f15875d);
        for (Map.Entry<String, C52262yY2> entry : this.f15876e.entrySet()) {
            mo173a.m103781a(entry.getKey(), entry.getValue());
        }
        for (FY2 fy2 : this.f15877f) {
            mo173a.m103780b(fy2);
        }
        for (Map.Entry<Integer, C51669xY2> entry2 : this.f15878g.entrySet()) {
            mo173a.m103770y(entry2.getKey().intValue(), entry2.getValue());
        }
        return mo173a;
    }

    /* renamed from: b */
    public final String m101939b() {
        return this.f15874c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IY2(AbstractC39507d13<? extends D> navigator, String str) {
        this(navigator, -1, str);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
