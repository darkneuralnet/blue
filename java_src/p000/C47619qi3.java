package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.persistence.nestedstructures.TransferOrderLineItem;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lqi3;", "", "Lco/bird/android/model/constant/SkuOrderStatus;", "", C17296a.f69688o, "c", "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;", "b", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.operator-allocation.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorAllocationConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationConverters.kt\nco/bird/android/persistence/operatorallocation/converters/OperatorAllocationConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* renamed from: qi3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47619qi3 {

    /* renamed from: a */
    public static final C47619qi3 f105653a = new C47619qi3();

    /* renamed from: b */
    public static final C51174wi2 f105654b = Converters.f66822a.m55283a();

    private C47619qi3() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m17211a(SkuOrderStatus skuOrderStatus) {
        Intrinsics.checkNotNullParameter(skuOrderStatus, "<this>");
        return f105654b.m6453i(skuOrderStatus);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m17210b(TransferOrderLineItem transferOrderLineItem) {
        if (transferOrderLineItem != null) {
            return f105654b.m6453i(transferOrderLineItem);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final SkuOrderStatus m17209c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (SkuOrderStatus) f105654b.m6459c(str, Reflection.getOrCreateKotlinClass(SkuOrderStatus.class));
    }

    @JvmStatic
    /* renamed from: d */
    public static final TransferOrderLineItem m17208d(String str) {
        if (str != null) {
            return (TransferOrderLineItem) f105654b.m6459c(str, Reflection.getOrCreateKotlinClass(TransferOrderLineItem.class));
        }
        return null;
    }
}
