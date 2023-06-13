package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p000.InterfaceC34588Ms5;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, m28432d2 = {"Lrb1;", "encoder", "", "h", "LGV0;", "decoder", "g", "Lsi2;", DateTokenConverter.CONVERTER_KEY, "LDi2;", "e", "Lkotlin/Function0;", "LMs5;", "deferred", "f", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ci2 */
/* loaded from: classes8.dex */
public final class C32155Ci2 {

    @Metadata(m28433d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28432d2 = {"Ci2$a", "LMs5;", "", "index", "", "f", "name", "c", "", "", "g", DateTokenConverter.CONVERTER_KEY, "", "i", C17296a.f69688o, "Lkotlin/Lazy;", "()LMs5;", "original", "h", "()Ljava/lang/String;", "serialName", "LTs5;", "getKind", "()LTs5;", "kind", "e", "()I", "elementsCount", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ci2$a */
    /* loaded from: classes8.dex */
    public static final class C1138a implements InterfaceC34588Ms5 {

        /* renamed from: a */
        public final Lazy f4522a;

        public C1138a(Function0<? extends InterfaceC34588Ms5> function0) {
            Lazy lazy;
            lazy = LazyKt__LazyJVMKt.lazy(function0);
            this.f4522a = lazy;
        }

        /* renamed from: a */
        public final InterfaceC34588Ms5 m111817a() {
            return (InterfaceC34588Ms5) this.f4522a.getValue();
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: b */
        public boolean mo10462b() {
            return InterfaceC34588Ms5.C5406a.m94638c(this);
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: c */
        public int mo10461c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return m111817a().mo10461c(name);
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: d */
        public InterfaceC34588Ms5 mo10460d(int i) {
            return m111817a().mo10460d(i);
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: e */
        public int mo10459e() {
            return m111817a().mo10459e();
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: f */
        public String mo10458f(int i) {
            return m111817a().mo10458f(i);
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: g */
        public List<Annotation> mo10457g(int i) {
            return m111817a().mo10457g(i);
        }

        @Override // p000.InterfaceC34588Ms5
        public List<Annotation> getAnnotations() {
            return InterfaceC34588Ms5.C5406a.m94640a(this);
        }

        @Override // p000.InterfaceC34588Ms5
        public AbstractC36226Ts5 getKind() {
            return m111817a().getKind();
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: h */
        public String mo10456h() {
            return m111817a().mo10456h();
        }

        @Override // p000.InterfaceC34588Ms5
        /* renamed from: i */
        public boolean mo10455i(int i) {
            return m111817a().mo10455i(i);
        }

        @Override // p000.InterfaceC34588Ms5
        public boolean isInline() {
            return InterfaceC34588Ms5.C5406a.m94639b(this);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m111823c(InterfaceC48140rb1 interfaceC48140rb1) {
        m111818h(interfaceC48140rb1);
    }

    /* renamed from: d */
    public static final InterfaceC48803si2 m111822d(GV0 gv0) {
        InterfaceC48803si2 interfaceC48803si2;
        Intrinsics.checkNotNullParameter(gv0, "<this>");
        if (gv0 instanceof InterfaceC48803si2) {
            interfaceC48803si2 = (InterfaceC48803si2) gv0;
        } else {
            interfaceC48803si2 = null;
        }
        if (interfaceC48803si2 != null) {
            return interfaceC48803si2;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(gv0.getClass()));
    }

    /* renamed from: e */
    public static final InterfaceC32389Di2 m111821e(InterfaceC48140rb1 interfaceC48140rb1) {
        InterfaceC32389Di2 interfaceC32389Di2;
        Intrinsics.checkNotNullParameter(interfaceC48140rb1, "<this>");
        if (interfaceC48140rb1 instanceof InterfaceC32389Di2) {
            interfaceC32389Di2 = (InterfaceC32389Di2) interfaceC48140rb1;
        } else {
            interfaceC32389Di2 = null;
        }
        if (interfaceC32389Di2 != null) {
            return interfaceC32389Di2;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(interfaceC48140rb1.getClass()));
    }

    /* renamed from: f */
    public static final InterfaceC34588Ms5 m111820f(Function0<? extends InterfaceC34588Ms5> function0) {
        return new C1138a(function0);
    }

    /* renamed from: g */
    public static final void m111819g(GV0 gv0) {
        m111822d(gv0);
    }

    /* renamed from: h */
    public static final void m111818h(InterfaceC48140rb1 interfaceC48140rb1) {
        m111821e(interfaceC48140rb1);
    }
}
