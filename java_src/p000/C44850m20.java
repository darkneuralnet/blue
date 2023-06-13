package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\r*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lm20;", "Ll20;", "", "token", "", "c", "userId", C17296a.f69688o, "event", "", "", "properties", "b", "Ls20;", DateTokenConverter.CONVERTER_KEY, "LP10;", "LP10;", "braze", "<init>", "(LP10;)V", "braze_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBrazeManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeManagerImpl.kt\nco/bird/android/manager/braze/BrazeManagerImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n215#2:50\n216#2:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 BrazeManagerImpl.kt\nco/bird/android/manager/braze/BrazeManagerImpl\n*L\n34#1:50\n34#1:52\n*E\n"})
/* renamed from: m20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44850m20 implements InterfaceC44257l20 {

    /* renamed from: a */
    public final P10 f97207a;

    public C44850m20(P10 braze) {
        Intrinsics.checkNotNullParameter(braze, "braze");
        this.f97207a = braze;
    }

    @Override // p000.InterfaceC44257l20
    /* renamed from: a */
    public void mo26466a(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f97207a.changeUser(userId);
    }

    @Override // p000.InterfaceC44257l20
    /* renamed from: b */
    public void mo26465b(String event, Map<String, ? extends Object> map) {
        C48407s20 c48407s20;
        Intrinsics.checkNotNullParameter(event, "event");
        if (map != null) {
            c48407s20 = m26463d(map);
        } else {
            c48407s20 = null;
        }
        if (c48407s20 != null) {
            this.f97207a.logCustomEvent(event, c48407s20);
        } else {
            this.f97207a.logCustomEvent(event);
        }
    }

    @Override // p000.InterfaceC44257l20
    /* renamed from: c */
    public void mo26464c(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f97207a.registerPushToken(token);
    }

    /* renamed from: d */
    public final C48407s20 m26463d(Map<String, ? extends Object> map) {
        String str;
        C48407s20 c48407s20 = new C48407s20();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                c48407s20.m14860a(key, value);
            } else if (value instanceof Float) {
                c48407s20.m14860a(key, Double.valueOf(((Number) value).floatValue()));
            } else if (value instanceof Double) {
                c48407s20.m14860a(key, value);
            } else if (value instanceof Integer) {
                c48407s20.m14860a(key, value);
            } else if (value instanceof Boolean) {
                c48407s20.m14860a(key, value);
            } else if (value instanceof DateTime) {
                c48407s20.m14860a(key, ((DateTime) value).toDate());
            } else {
                boolean z = value instanceof String;
                if (z) {
                    c48407s20.m14860a(key, value);
                } else {
                    if (z) {
                        str = (String) value;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c48407s20.m14860a(key, str);
                    }
                }
            }
        }
        return c48407s20;
    }
}
