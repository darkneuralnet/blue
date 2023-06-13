package p000;

import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 ¢\u0006\u0004\b\u001e\u0010\"J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, m28432d2 = {"LTd3;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", C17296a.f69688o, "Ljava/lang/Object;", "objectInstance", "", "", "b", "Ljava/util/List;", "_annotations", "LMs5;", "c", "Lkotlin/Lazy;", "getDescriptor", "()LMs5;", "descriptor", "", "serialName", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,54:1\n565#2,4:55\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:55,4\n*E\n"})
/* renamed from: Td3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C36089Td3<T> implements InterfaceC34036Kj2<T> {

    /* renamed from: a */
    public final T f35805a;

    /* renamed from: b */
    public List<? extends Annotation> f35806b;

    /* renamed from: c */
    public final Lazy f35807c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "T", "LMs5;", "b", "()LMs5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Td3$a */
    /* loaded from: classes8.dex */
    public static final class C7904a extends Lambda implements Function0<InterfaceC34588Ms5> {

        /* renamed from: g */
        public final /* synthetic */ String f35808g;

        /* renamed from: h */
        public final /* synthetic */ C36089Td3<T> f35809h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "T", "LLj0;", "", C17296a.f69688o, "(LLj0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Td3$a$a */
        /* loaded from: classes8.dex */
        public static final class C7905a extends Lambda implements Function1<C34268Lj0, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36089Td3<T> f35810g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7905a(C36089Td3<T> c36089Td3) {
                super(1);
                this.f35810g = c36089Td3;
            }

            /* renamed from: a */
            public final void m83248a(C34268Lj0 buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.m96400h(this.f35810g.f35806b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C34268Lj0 c34268Lj0) {
                m83248a(c34268Lj0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7904a(String str, C36089Td3<T> c36089Td3) {
            super(0);
            this.f35808g = str;
            this.f35809h = c36089Td3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34588Ms5 invoke() {
            return C35524Qs5.m87851b(this.f35808g, RS5.C7174d.f32059a, new InterfaceC34588Ms5[0], new C7905a(this.f35809h));
        }
    }

    public C36089Td3(String serialName, T objectInstance) {
        List<? extends Annotation> emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f35805a = objectInstance;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f35806b = emptyList;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7904a(serialName, this));
        this.f35807c = lazy;
    }

    @Override // p000.E01
    public T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor);
        int mo11843q = mo3298b.mo11843q(getDescriptor());
        if (mo11843q == -1) {
            Unit unit = Unit.INSTANCE;
            mo3298b.mo3300a(descriptor);
            return this.f35805a;
        }
        throw new SerializationException("Unexpected index " + mo11843q);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return (InterfaceC34588Ms5) this.f35807c.getValue();
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.mo1149b(getDescriptor()).mo1151a(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public C36089Td3(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        List<? extends Annotation> asList;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        asList = ArraysKt___ArraysJvmKt.asList(classAnnotations);
        this.f35806b = asList;
    }
}
