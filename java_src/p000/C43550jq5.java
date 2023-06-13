package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J'\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR(\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006!"}, m28432d2 = {"Ljq5;", "", "T", "Lb1;", "LTt0;", "decoder", "", "klassName", "LE01;", "c", "Lrb1;", "encoder", "value", "Let5;", DateTokenConverter.CONVERTER_KEY, "(Lrb1;Ljava/lang/Object;)Let5;", "Lkotlin/reflect/KClass;", C17296a.f69688o, "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "LMs5;", "b", "Lkotlin/Lazy;", "getDescriptor", "()LMs5;", "descriptor", "", "LKj2;", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,154:1\n1536#2:155\n1238#2,4:165\n53#3:156\n80#3,6:157\n442#4:163\n392#4:164\n84#5:169\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n*E\n"})
/* renamed from: jq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43550jq5<T> extends AbstractC12270b1<T> {

    /* renamed from: a */
    public final KClass<T> f93431a;

    /* renamed from: b */
    public final Lazy f93432b;

    /* renamed from: c */
    public final Map<KClass<? extends T>, InterfaceC34036Kj2<? extends T>> f93433c;

    /* renamed from: d */
    public final Map<String, InterfaceC34036Kj2<? extends T>> f93434d;

    @Override // p000.AbstractC12270b1
    /* renamed from: c */
    public E01<T> mo29846c(InterfaceC36230Tt0 decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34036Kj2<? extends T> interfaceC34036Kj2 = this.f93434d.get(str);
        if (interfaceC34036Kj2 == null) {
            return super.mo29846c(decoder, str);
        }
        return interfaceC34036Kj2;
    }

    @Override // p000.AbstractC12270b1
    /* renamed from: d */
    public InterfaceC40615et5<T> mo29845d(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34036Kj2<? extends T> interfaceC34036Kj2 = this.f93433c.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        if (interfaceC34036Kj2 == null) {
            interfaceC34036Kj2 = super.mo29845d(encoder, value);
        }
        if (interfaceC34036Kj2 == null) {
            return null;
        }
        return interfaceC34036Kj2;
    }

    @Override // p000.AbstractC12270b1
    /* renamed from: e */
    public KClass<T> mo29844e() {
        return this.f93431a;
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return (InterfaceC34588Ms5) this.f93432b.getValue();
    }
}
