package p000;

import android.annotation.SuppressLint;
import androidx.work.C12124b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import p000.HG6;
import p000.UC6;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H'J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H'J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\b\u0010\u001f\u001a\u00020\u001eH'J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0016H'J\b\u0010\"\u001a\u00020\u0010H'J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010#\u001a\u00020\u0010H'J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010%\u001a\u00020\u0010H'J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010)\u001a\u00020\u0016H'J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006,"}, m28432d2 = {"LIG6;", "", "LHG6;", "workSpec", "", "m", "", "id", "delete", "l", "name", "", "LHG6$b;", "p", "LUC6$a;", TransferTable.COLUMN_STATE, "", "j", "h", "Landroidx/work/b;", "output", "s", "", "enqueueTime", "c", "u", "g", "b", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "f", "startTime", "o", "n", "schedulerLimit", "q", "maxLimit", "e", "k", "t", "startingAt", "i", "r", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
@SuppressLint({"UnknownNullness"})
/* renamed from: IG6 */
/* loaded from: classes.dex */
public interface IG6 {
    /* renamed from: a */
    List<String> mo100767a(String str);

    /* renamed from: b */
    UC6.EnumC8214a mo100766b(String str);

    /* renamed from: c */
    void mo100765c(String str, long j);

    /* renamed from: d */
    List<C12124b> mo100764d(String str);

    void delete(String str);

    /* renamed from: e */
    List<HG6> mo100763e(int i);

    /* renamed from: f */
    boolean mo100762f();

    /* renamed from: g */
    int mo100761g(String str);

    /* renamed from: h */
    void mo100760h(String str);

    /* renamed from: i */
    List<HG6> mo100759i(long j);

    /* renamed from: j */
    int mo100758j(UC6.EnumC8214a enumC8214a, String str);

    /* renamed from: k */
    List<HG6> mo100757k();

    /* renamed from: l */
    HG6 mo100756l(String str);

    /* renamed from: m */
    void mo100755m(HG6 hg6);

    /* renamed from: n */
    int mo100754n();

    /* renamed from: o */
    int mo100753o(String str, long j);

    /* renamed from: p */
    List<HG6.C3120b> mo100752p(String str);

    /* renamed from: q */
    List<HG6> mo100751q(int i);

    /* renamed from: r */
    void mo100750r(HG6 hg6);

    /* renamed from: s */
    void mo100749s(String str, C12124b c12124b);

    /* renamed from: t */
    List<HG6> mo100748t();

    /* renamed from: u */
    int mo100747u(String str);
}
