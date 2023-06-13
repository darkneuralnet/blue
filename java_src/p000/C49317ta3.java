package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.NotificationAction;
import co.bird.android.model.persistence.nestedstructures.OperatorNotificationIcon;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lta3;", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "", "b", "e", "", "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "c", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "notificationActionKind", "<init>", "()V", "co.bird.android.lib.persistence.notificationcenter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterConverters.kt\nco/bird/android/persistence/notificationcenter/impl/converters/NotificationCenterConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* renamed from: ta3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49317ta3 {

    /* renamed from: a */
    public static final C49317ta3 f110767a = new C49317ta3();

    /* renamed from: b */
    public static final C51174wi2 f110768b = Converters.f66822a.m55283a();

    private C49317ta3() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m12032b(OperatorNotificationIcon operatorNotificationIcon) {
        if (operatorNotificationIcon != null) {
            return f110768b.m6453i(operatorNotificationIcon);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m12031c(List<NotificationAction> list) {
        if (list != null) {
            return f110768b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<NotificationAction> m12030d(String str) {
        if (str != null) {
            return (List) f110768b.m6460b(str, f110767a.m12033a());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final OperatorNotificationIcon m12029e(String str) {
        if (str != null) {
            return (OperatorNotificationIcon) f110768b.m6459c(str, Reflection.getOrCreateKotlinClass(OperatorNotificationIcon.class));
        }
        return null;
    }

    /* renamed from: a */
    public final Type m12033a() {
        return f110768b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(NotificationAction.class));
    }
}
