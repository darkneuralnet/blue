package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.WarehouseDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicleDetails;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LJy6;", "", "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", "", "c", "g", "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;", "b", "f", "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;", C17296a.f69688o, "e", "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;", DateTokenConverter.CONVERTER_KEY, "h", "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.warehouse-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseFlightSheetConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetConverters.kt\nco/bird/android/persistence/warehouseflightsheet/impl/converters/WarehouseFlightSheetConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* renamed from: Jy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33941Jy6 {

    /* renamed from: a */
    public static final C33941Jy6 f18871a = new C33941Jy6();

    /* renamed from: b */
    public static final C51174wi2 f18872b = Converters.f66822a.m55283a();

    private C33941Jy6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m99416a(WarehouseDetails warehouseDetails) {
        if (warehouseDetails != null) {
            return f18872b.m6453i(warehouseDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m99415b(WarehouseStatus warehouseStatus) {
        if (warehouseStatus != null) {
            return f18872b.m6453i(warehouseStatus);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m99414c(WarehouseSummary warehouseSummary) {
        if (warehouseSummary != null) {
            return f18872b.m6453i(warehouseSummary);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m99413d(WarehouseVehicleDetails warehouseVehicleDetails) {
        if (warehouseVehicleDetails != null) {
            return f18872b.m6453i(warehouseVehicleDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final WarehouseDetails m99412e(String str) {
        if (str != null) {
            return (WarehouseDetails) f18872b.m6459c(str, Reflection.getOrCreateKotlinClass(WarehouseDetails.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final WarehouseStatus m99411f(String str) {
        if (str != null) {
            return (WarehouseStatus) f18872b.m6459c(str, Reflection.getOrCreateKotlinClass(WarehouseStatus.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final WarehouseSummary m99410g(String str) {
        if (str != null) {
            return (WarehouseSummary) f18872b.m6459c(str, Reflection.getOrCreateKotlinClass(WarehouseSummary.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final WarehouseVehicleDetails m99409h(String str) {
        if (str != null) {
            return (WarehouseVehicleDetails) f18872b.m6459c(str, Reflection.getOrCreateKotlinClass(WarehouseVehicleDetails.class));
        }
        return null;
    }
}
