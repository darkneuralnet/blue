package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u001a.\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a1\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28432d2 = {"LeD6;", "workNameDao", "LMG6;", "workTagDao", "LXX5;", "systemIdInfoDao", "", "LHG6;", "workSpecs", "", DateTokenConverter.CONVERTER_KEY, "workSpec", "name", "", "systemId", "tags", "c", "(LHG6;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", C17296a.f69688o, "Ljava/lang/String;", "TAG", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: m31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44861m31 {

    /* renamed from: a */
    public static final String f97223a;

    static {
        String m113270i = AbstractC32056Bx2.m113270i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f97223a = m113270i;
    }

    /* renamed from: c */
    public static final String m26425c(HG6 hg6, String str, Integer num, String str2) {
        return '\n' + hg6.f13191a + "\t " + hg6.f13193c + "\t " + num + "\t " + hg6.f13192b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* renamed from: d */
    public static final String m26424d(InterfaceC40219eD6 interfaceC40219eD6, MG6 mg6, XX5 xx5, List<HG6> list) {
        Integer num;
        String joinToString$default;
        String joinToString$default2;
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (HG6 hg6 : list) {
            WX5 mo74925d = xx5.mo74925d(KG6.m99055a(hg6));
            if (mo74925d != null) {
                num = Integer.valueOf(mo74925d.f41254c);
            } else {
                num = null;
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(interfaceC40219eD6.mo41713a(hg6.f13191a), ",", null, null, 0, null, null, 62, null);
            joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(mg6.mo94113d(hg6.f13191a), ",", null, null, 0, null, null, 62, null);
            sb.append(m26425c(hg6, joinToString$default, num, joinToString$default2));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
