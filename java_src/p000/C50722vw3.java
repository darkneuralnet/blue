package p000;

import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lvw3;", "", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "c", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "operatorTaskReference", "<init>", "()V", "co.bird.android.lib.persistence.operator-task-v2.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskV2Converters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskV2Converters.kt\nco/bird/android/persistence/operatortaskv2/impl/converters/OperatorTaskV2Converters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* renamed from: vw3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50722vw3 {

    /* renamed from: a */
    public static final C50722vw3 f114919a = new C50722vw3();

    /* renamed from: b */
    public static final C51174wi2 f114920b = Converters.f66822a.m55283a();

    private C50722vw3() {
    }

    @JvmStatic
    @JvmName(name = "toJsonOperatorTask")
    /* renamed from: b */
    public static final String m7733b(List<OperatorTask> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f114920b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<OperatorTask> m7732c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f114920b.m6460b(str, f114919a.m7734a());
    }

    /* renamed from: a */
    public final Type m7734a() {
        return f114920b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(OperatorTask.class));
    }
}
