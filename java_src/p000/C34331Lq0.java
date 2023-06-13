package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LLq0;", "", "", "", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "c", "e", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", DateTokenConverter.CONVERTER_KEY, "f", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "complaintActionTakenRequiredFieldListToken", "b", "complaintIssueOptionListToken", "<init>", "()V", "co.bird.android.lib.persistence.complaint-resolution.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverters.kt\nco/bird/android/persistence/complaintresolution/impl/converters/ComplaintResolutionConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* renamed from: Lq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34331Lq0 {

    /* renamed from: a */
    public static final C34331Lq0 f22100a = new C34331Lq0();

    private C34331Lq0() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<ComplaintActionTakenRequiredField> m96308c(String str) {
        if (str != null) {
            return (List) Converters.f66822a.m55283a().m6460b(str, f22100a.m96310a());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<ComplaintIssueOption> m96307d(String str) {
        if (str != null) {
            return (List) Converters.f66822a.m55283a().m6460b(str, f22100a.m96309b());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m96306e(List<ComplaintActionTakenRequiredField> list) {
        if (list != null) {
            return Converters.f66822a.m55283a().m6453i(list);
        }
        return null;
    }

    @JvmStatic
    @JvmName(name = "toJsonComplaintIssueOption")
    /* renamed from: f */
    public static final String m96305f(List<ComplaintIssueOption> list) {
        if (list != null) {
            return Converters.f66822a.m55283a().m6453i(list);
        }
        return null;
    }

    /* renamed from: a */
    public final Type m96310a() {
        return Converters.f66822a.m55283a().m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(ComplaintActionTakenRequiredField.class));
    }

    /* renamed from: b */
    public final Type m96309b() {
        return Converters.f66822a.m55283a().m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(ComplaintIssueOption.class));
    }
}
