package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016¨\u0006\u000e"}, m28432d2 = {"LMG6;", "", "LLG6;", "workTag", "", "b", "", "id", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "", "tags", "c", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: MG6 */
/* loaded from: classes.dex */
public interface MG6 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: MG6$a */
    /* loaded from: classes.dex */
    public static final class C5264a {
        /* renamed from: a */
        public static void m95458a(MG6 mg6, String id, Set<String> tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            for (String str : tags) {
                mg6.mo94115b(new LG6(str, id));
            }
        }
    }

    /* renamed from: a */
    void mo94116a(String str);

    /* renamed from: b */
    void mo94115b(LG6 lg6);

    /* renamed from: c */
    void mo94114c(String str, Set<String> set);

    /* renamed from: d */
    List<String> mo94113d(String str);
}
