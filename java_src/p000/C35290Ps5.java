package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, m28432d2 = {"LMs5;", "", C17296a.f69688o, "(LMs5;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(LMs5;)V", "elementDescriptors", "", "b", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ps5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35290Ps5 {

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Ps5$a", "", "LMs5;", "", "hasNext", C17296a.f69688o, "", "b", "I", "elementsLeft", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ps5$a */
    /* loaded from: classes8.dex */
    public static final class C6514a implements Iterator<InterfaceC34588Ms5>, KMappedMarker {

        /* renamed from: b */
        public int f29187b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC34588Ms5 f29188c;

        public C6514a(InterfaceC34588Ms5 interfaceC34588Ms5) {
            this.f29188c = interfaceC34588Ms5;
            this.f29187b = interfaceC34588Ms5.mo10459e();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public InterfaceC34588Ms5 next() {
            InterfaceC34588Ms5 interfaceC34588Ms5 = this.f29188c;
            int mo10459e = interfaceC34588Ms5.mo10459e();
            int i = this.f29187b;
            this.f29187b = i - 1;
            return interfaceC34588Ms5.mo10460d(mo10459e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29187b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Ps5$b", "", "", "", "hasNext", C17296a.f69688o, "", "b", "I", "elementsLeft", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ps5$b */
    /* loaded from: classes8.dex */
    public static final class C6515b implements Iterator<String>, KMappedMarker {

        /* renamed from: b */
        public int f29189b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC34588Ms5 f29190c;

        public C6515b(InterfaceC34588Ms5 interfaceC34588Ms5) {
            this.f29190c = interfaceC34588Ms5;
            this.f29189b = interfaceC34588Ms5.mo10459e();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            InterfaceC34588Ms5 interfaceC34588Ms5 = this.f29190c;
            int mo10459e = interfaceC34588Ms5.mo10459e();
            int i = this.f29189b;
            this.f29189b = i - 1;
            return interfaceC34588Ms5.mo10458f(mo10459e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29189b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, m28432d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "", "iterator", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n293#2:71\n*E\n"})
    /* renamed from: Ps5$c */
    /* loaded from: classes8.dex */
    public static final class C6516c implements Iterable<InterfaceC34588Ms5>, KMappedMarker {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC34588Ms5 f29191b;

        public C6516c(InterfaceC34588Ms5 interfaceC34588Ms5) {
            this.f29191b = interfaceC34588Ms5;
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC34588Ms5> iterator() {
            return new C6514a(this.f29191b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, m28432d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "", "iterator", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n309#2:71\n*E\n"})
    /* renamed from: Ps5$d */
    /* loaded from: classes8.dex */
    public static final class C6517d implements Iterable<String>, KMappedMarker {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC34588Ms5 f29192b;

        public C6517d(InterfaceC34588Ms5 interfaceC34588Ms5) {
            this.f29192b = interfaceC34588Ms5;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new C6515b(this.f29192b);
        }
    }

    /* renamed from: a */
    public static final Iterable<InterfaceC34588Ms5> m89666a(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        return new C6516c(interfaceC34588Ms5);
    }

    /* renamed from: b */
    public static final Iterable<String> m89665b(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        return new C6517d(interfaceC34588Ms5);
    }
}
