package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.RS5;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001aN\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u00042\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, m28432d2 = {"", "serialName", "LE24;", "kind", "LMs5;", C17296a.f69688o, "LTs5;", "", "typeParameters", "Lkotlin/Function1;", "LLj0;", "", "Lkotlin/ExtensionFunctionType;", "builder", "b", "(Ljava/lang/String;LTs5;[LMs5;Lkotlin/jvm/functions/Function1;)LMs5;", "keyDescriptor", "valueDescriptor", DateTokenConverter.CONVERTER_KEY, "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
/* renamed from: Qs5 */
/* loaded from: classes8.dex */
public final class C35524Qs5 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLj0;", "", C17296a.f69688o, "(LLj0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qs5$a */
    /* loaded from: classes8.dex */
    public static final class C6921a extends Lambda implements Function1<C34268Lj0, Unit> {

        /* renamed from: g */
        public static final C6921a f31039g = new C6921a();

        public C6921a() {
            super(1);
        }

        /* renamed from: a */
        public final void m87848a(C34268Lj0 c34268Lj0) {
            Intrinsics.checkNotNullParameter(c34268Lj0, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C34268Lj0 c34268Lj0) {
            m87848a(c34268Lj0);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC34588Ms5 m87852a(String serialName, E24 kind) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        isBlank = StringsKt__StringsJVMKt.isBlank(serialName);
        if (!isBlank) {
            return M24.m95985a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: b */
    public static final InterfaceC34588Ms5 m87851b(String serialName, AbstractC36226Ts5 kind, InterfaceC34588Ms5[] typeParameters, Function1<? super C34268Lj0, Unit> builder) {
        boolean isBlank;
        List list;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        isBlank = StringsKt__StringsJVMKt.isBlank(serialName);
        if (!isBlank) {
            if (!Intrinsics.areEqual(kind, RS5.C7171a.f32056a)) {
                C34268Lj0 c34268Lj0 = new C34268Lj0(serialName);
                builder.invoke(c34268Lj0);
                int size = c34268Lj0.m96402f().size();
                list = ArraysKt___ArraysKt.toList(typeParameters);
                return new C35056Os5(serialName, kind, size, list, c34268Lj0);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC34588Ms5 m87850c(String str, AbstractC36226Ts5 abstractC36226Ts5, InterfaceC34588Ms5[] interfaceC34588Ms5Arr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = C6921a.f31039g;
        }
        return m87851b(str, abstractC36226Ts5, interfaceC34588Ms5Arr, function1);
    }

    /* renamed from: d */
    public static final InterfaceC34588Ms5 m87849d(InterfaceC34588Ms5 keyDescriptor, InterfaceC34588Ms5 valueDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new C48551sH1(keyDescriptor, valueDescriptor);
    }
}
