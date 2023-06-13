package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LKY2;", "LIY2;", "LJY2;", "LHY2;", "destination", "", "c", DateTokenConverter.CONVERTER_KEY, "Li13;", "h", "Li13;", "e", "()Li13;", "provider", "", "i", "I", "startDestinationId", "", "j", "Ljava/lang/String;", "startDestinationRoute", "", "k", "Ljava/util/List;", "destinations", "startDestination", "route", "<init>", "(Li13;Ljava/lang/String;Ljava/lang/String;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: KY2 */
/* loaded from: classes.dex */
public class KY2 extends IY2<JY2> {

    /* renamed from: h */
    public final C42471i13 f19739h;

    /* renamed from: i */
    public int f19740i;

    /* renamed from: j */
    public String f19741j;

    /* renamed from: k */
    public final List<HY2> f19742k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY2(C42471i13 provider, String startDestination, String str) {
        super(provider.m35382d(NY2.class), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.f19742k = new ArrayList();
        this.f19739h = provider;
        this.f19741j = startDestination;
    }

    /* renamed from: c */
    public final void m98782c(HY2 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f19742k.add(destination);
    }

    /* renamed from: d */
    public JY2 m98781d() {
        JY2 jy2 = (JY2) super.m101940a();
        jy2.m100260G(this.f19742k);
        int i = this.f19740i;
        if (i == 0 && this.f19741j == null) {
            if (m101939b() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f19741j;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            jy2.m100250R(str);
        } else {
            jy2.m100251Q(i);
        }
        return jy2;
    }

    /* renamed from: e */
    public final C42471i13 m98780e() {
        return this.f19739h;
    }
}
