package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R<\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0003\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Ly01;", "", "T", "LMs5;", "descriptor", "Ly01$a;", "key", "value", "", "c", "(LMs5;Ly01$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(LMs5;Ly01$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", C17296a.f69688o, "(LMs5;Ly01$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n361#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
/* renamed from: y01  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51945y01 {

    /* renamed from: a */
    public final Map<InterfaceC34588Ms5, Map<C30404a<Object>, Object>> f118605a = BE0.m114200a(16);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Ly01$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: y01$a */
    /* loaded from: classes8.dex */
    public static final class C30404a<T> {
    }

    /* renamed from: a */
    public final <T> T m4249a(InterfaceC34588Ms5 descriptor, C30404a<T> key) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<C30404a<Object>, Object> map = this.f118605a.get(descriptor);
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    /* renamed from: b */
    public final <T> T m4248b(InterfaceC34588Ms5 descriptor, C30404a<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) m4249a(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        m4247c(descriptor, key, invoke);
        return invoke;
    }

    /* renamed from: c */
    public final <T> void m4247c(InterfaceC34588Ms5 descriptor, C30404a<T> key, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<InterfaceC34588Ms5, Map<C30404a<Object>, Object>> map = this.f118605a;
        Map<C30404a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = BE0.m114200a(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}
