package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\"$\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lkt5;", "LMs5;", "descriptor", "b", "Lkotlin/reflect/KClass;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", C17296a.f69688o, "(LMs5;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(LMs5;)V", "capturedKClass", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1549#3:113\n1620#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
/* renamed from: MA0 */
/* loaded from: classes8.dex */
public final class MA0 {
    /* renamed from: a */
    public static final KClass<?> m95647a(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        if (interfaceC34588Ms5 instanceof RA0) {
            return ((RA0) interfaceC34588Ms5).f31619b;
        }
        if (interfaceC34588Ms5 instanceof C34822Ns5) {
            return m95647a(((C34822Ns5) interfaceC34588Ms5).m93250j());
        }
        return null;
    }

    /* renamed from: b */
    public static final InterfaceC34588Ms5 m95646b(AbstractC44173kt5 abstractC44173kt5, InterfaceC34588Ms5 descriptor) {
        InterfaceC34036Kj2 m28234c;
        Intrinsics.checkNotNullParameter(abstractC44173kt5, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> m95647a = m95647a(descriptor);
        if (m95647a == null || (m28234c = AbstractC44173kt5.m28234c(abstractC44173kt5, m95647a, null, 2, null)) == null) {
            return null;
        }
        return m28234c.getDescriptor();
    }

    /* renamed from: c */
    public static final InterfaceC34588Ms5 m95645c(InterfaceC34588Ms5 interfaceC34588Ms5, KClass<?> context) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RA0(interfaceC34588Ms5, context);
    }
}
