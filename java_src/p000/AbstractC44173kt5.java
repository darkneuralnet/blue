package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H'J9\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H'¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H'\u0082\u0001\u0001\u0018¨\u0006\u0019"}, m28432d2 = {"Lkt5;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "", "LKj2;", "typeArgumentsSerializers", "b", "baseClass", "value", "Let5;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Let5;", "", "serializedClassName", "LE01;", DateTokenConverter.CONVERTER_KEY, "Lmt5;", "collector", "", C17296a.f69688o, "<init>", "()V", "LUs5;", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kt5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44173kt5 {
    public /* synthetic */ AbstractC44173kt5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static /* synthetic */ InterfaceC34036Kj2 m28234c(AbstractC44173kt5 abstractC44173kt5, KClass kClass, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return abstractC44173kt5.mo28235b(kClass, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    /* renamed from: a */
    public abstract void mo28236a(InterfaceC45359mt5 interfaceC45359mt5);

    /* renamed from: b */
    public abstract <T> InterfaceC34036Kj2<T> mo28235b(KClass<T> kClass, List<? extends InterfaceC34036Kj2<?>> list);

    /* renamed from: d */
    public abstract <T> E01<T> mo28233d(KClass<? super T> kClass, String str);

    /* renamed from: e */
    public abstract <T> InterfaceC40615et5<T> mo28232e(KClass<? super T> kClass, T t);

    private AbstractC44173kt5() {
    }
}
