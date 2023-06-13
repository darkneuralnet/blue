package p000;

import co.bird.android.model.persistence.nestedstructures.OrderItemViewDetail;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lgp5;", "", "", "Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;", "", "b", "c", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "orderItemViewListDetailToken", "<init>", "()V", "co.bird.android.lib.persistence.scrap-order-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderViewConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderViewConverters.kt\nco/bird/android/persistence/scraporderview/converters/ScrapOrderViewConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* renamed from: gp5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41761gp5 {

    /* renamed from: a */
    public static final C41761gp5 f84332a = new C41761gp5();

    /* renamed from: b */
    public static final C51174wi2 f84333b = Converters.f66822a.m55283a();

    private C41761gp5() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m37441b(List<OrderItemViewDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f84333b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<OrderItemViewDetail> m37440c(String str) {
        if (str != null) {
            return (List) f84333b.m6460b(str, f84332a.m37442a());
        }
        return null;
    }

    /* renamed from: a */
    public final Type m37442a() {
        return f84333b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(OrderItemViewDetail.class));
    }
}
