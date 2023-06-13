package p000;

import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LhF1;", "", "Lco/bird/android/model/constant/InventoryScanningError;", "", "b", C17296a.f69688o, "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.manager.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountConverters.kt\nco/bird/android/manager/hardcount/persistence/HardCountConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* renamed from: hF1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42011hF1 {

    /* renamed from: a */
    public static final C42011hF1 f84913a = new C42011hF1();

    /* renamed from: b */
    public static final C51174wi2 f84914b = Converters.f66822a.m55283a();

    private C42011hF1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final InventoryScanningError m36578a(String str) {
        if (str != null) {
            return (InventoryScanningError) f84914b.m6459c(str, Reflection.getOrCreateKotlinClass(InventoryScanningError.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m36577b(InventoryScanningError inventoryScanningError) {
        if (inventoryScanningError != null) {
            return f84914b.m6453i(inventoryScanningError);
        }
        return null;
    }
}
