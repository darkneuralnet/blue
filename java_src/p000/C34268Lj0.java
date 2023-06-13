package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b \u0010\u0014R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R \u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b#\u0010\u0014¨\u0006'"}, m28432d2 = {"LLj0;", "", "", "elementName", "LMs5;", "descriptor", "", "", "annotations", "", "isOptional", "", C17296a.f69688o, "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
/* renamed from: Lj0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34268Lj0 {

    /* renamed from: a */
    public final String f21970a;

    /* renamed from: b */
    public List<? extends Annotation> f21971b;

    /* renamed from: c */
    public final List<String> f21972c;

    /* renamed from: d */
    public final Set<String> f21973d;

    /* renamed from: e */
    public final List<InterfaceC34588Ms5> f21974e;

    /* renamed from: f */
    public final List<List<Annotation>> f21975f;

    /* renamed from: g */
    public final List<Boolean> f21976g;

    public C34268Lj0(String serialName) {
        List<? extends Annotation> emptyList;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f21970a = serialName;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f21971b = emptyList;
        this.f21972c = new ArrayList();
        this.f21973d = new HashSet();
        this.f21974e = new ArrayList();
        this.f21975f = new ArrayList();
        this.f21976g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m96406b(C34268Lj0 c34268Lj0, String str, InterfaceC34588Ms5 interfaceC34588Ms5, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c34268Lj0.m96407a(str, interfaceC34588Ms5, list, z);
    }

    /* renamed from: a */
    public final void m96407a(String elementName, InterfaceC34588Ms5 descriptor, List<? extends Annotation> annotations, boolean z) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f21973d.add(elementName)) {
            this.f21972c.add(elementName);
            this.f21974e.add(descriptor);
            this.f21975f.add(annotations);
            this.f21976g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f21970a).toString());
    }

    /* renamed from: c */
    public final List<Annotation> m96405c() {
        return this.f21971b;
    }

    /* renamed from: d */
    public final List<List<Annotation>> m96404d() {
        return this.f21975f;
    }

    /* renamed from: e */
    public final List<InterfaceC34588Ms5> m96403e() {
        return this.f21974e;
    }

    /* renamed from: f */
    public final List<String> m96402f() {
        return this.f21972c;
    }

    /* renamed from: g */
    public final List<Boolean> m96401g() {
        return this.f21976g;
    }

    /* renamed from: h */
    public final void m96400h(List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f21971b = list;
    }
}
