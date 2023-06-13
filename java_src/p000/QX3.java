package p000;

import ch.qos.logback.core.CoreConstants;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import p000.AbstractC36226Ts5;
import p000.OX3;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0011\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m28432d2 = {"LQX3;", "", "T", "Lb1;", "", "toString", "Lkotlin/reflect/KClass;", C17296a.f69688o, "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "LMs5;", "c", "Lkotlin/Lazy;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(Lkotlin/reflect/KClass;)V", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QX3 */
/* loaded from: classes8.dex */
public final class QX3<T> extends AbstractC12270b1<T> {

    /* renamed from: a */
    public final KClass<T> f30489a;

    /* renamed from: b */
    public List<? extends Annotation> f30490b;

    /* renamed from: c */
    public final Lazy f30491c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "T", "LMs5;", "b", "()LMs5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QX3$a */
    /* loaded from: classes8.dex */
    public static final class C6793a extends Lambda implements Function0<InterfaceC34588Ms5> {

        /* renamed from: g */
        public final /* synthetic */ QX3<T> f30492g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "T", "LLj0;", "", C17296a.f69688o, "(LLj0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: QX3$a$a */
        /* loaded from: classes8.dex */
        public static final class C6794a extends Lambda implements Function1<C34268Lj0, Unit> {

            /* renamed from: g */
            public final /* synthetic */ QX3<T> f30493g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6794a(QX3<T> qx3) {
                super(1);
                this.f30493g = qx3;
            }

            /* renamed from: a */
            public final void m88424a(C34268Lj0 buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C34268Lj0.m96406b(buildSerialDescriptor, "type", C38330b40.m65038D(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
                C34268Lj0.m96406b(buildSerialDescriptor, "value", C35524Qs5.m87850c("kotlinx.serialization.Polymorphic<" + this.f30493g.mo29844e().getSimpleName() + Typography.greater, AbstractC36226Ts5.C8135a.f36381a, new InterfaceC34588Ms5[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.m96400h(this.f30493g.f30490b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C34268Lj0 c34268Lj0) {
                m88424a(c34268Lj0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6793a(QX3<T> qx3) {
            super(0);
            this.f30492g = qx3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34588Ms5 invoke() {
            return MA0.m95645c(C35524Qs5.m87851b("kotlinx.serialization.Polymorphic", OX3.C6027a.f26738a, new InterfaceC34588Ms5[0], new C6794a(this.f30492g)), this.f30492g.mo29844e());
        }
    }

    public QX3(KClass<T> baseClass) {
        List<? extends Annotation> emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f30489a = baseClass;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f30490b = emptyList;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C6793a(this));
        this.f30491c = lazy;
    }

    @Override // p000.AbstractC12270b1
    /* renamed from: e */
    public KClass<T> mo29844e() {
        return this.f30489a;
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return (InterfaceC34588Ms5) this.f30491c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo29844e() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public QX3(KClass<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        List<? extends Annotation> asList;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        asList = ArraysKt___ArraysJvmKt.asList(classAnnotations);
        this.f30490b = asList;
    }
}
