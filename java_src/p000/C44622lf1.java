package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import kotlinx.serialization.SerializationException;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010 J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000eH\u0002R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"Llf1;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "e", "(Lrb1;Ljava/lang/Enum;)V", "LGV0;", "decoder", DateTokenConverter.CONVERTER_KEY, "(LGV0;)Ljava/lang/Enum;", "", "toString", "serialName", "LMs5;", "c", "", C17296a.f69688o, "[Ljava/lang/Enum;", "values", "b", "LMs5;", "overriddenDescriptor", "Lkotlin/Lazy;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "(Ljava/lang/String;[Ljava/lang/Enum;LMs5;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13579#2,2:152\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n123#1:152,2\n*E\n"})
/* renamed from: lf1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44622lf1<T extends Enum<T>> implements InterfaceC34036Kj2<T> {

    /* renamed from: a */
    public final T[] f96518a;

    /* renamed from: b */
    public InterfaceC34588Ms5 f96519b;

    /* renamed from: c */
    public final Lazy f96520c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "T", "LMs5;", "b", "()LMs5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lf1$a */
    /* loaded from: classes8.dex */
    public static final class C25757a extends Lambda implements Function0<InterfaceC34588Ms5> {

        /* renamed from: g */
        public final /* synthetic */ C44622lf1<T> f96521g;

        /* renamed from: h */
        public final /* synthetic */ String f96522h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25757a(C44622lf1<T> c44622lf1, String str) {
            super(0);
            this.f96521g = c44622lf1;
            this.f96522h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC34588Ms5 invoke() {
            InterfaceC34588Ms5 interfaceC34588Ms5 = this.f96521g.f96519b;
            return interfaceC34588Ms5 == null ? this.f96521g.m27025c(this.f96522h) : interfaceC34588Ms5;
        }
    }

    public C44622lf1(String serialName, T[] values) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f96518a = values;
        lazy = LazyKt__LazyJVMKt.lazy(new C25757a(this, serialName));
        this.f96520c = lazy;
    }

    /* renamed from: c */
    public final InterfaceC34588Ms5 m27025c(String str) {
        C41657gf1 c41657gf1 = new C41657gf1(str, this.f96518a.length);
        for (T t : this.f96518a) {
            AW3.m115696l(c41657gf1, t.name(), false, 2, null);
        }
        return c41657gf1;
    }

    @Override // p000.E01
    /* renamed from: d */
    public T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int mo3324C = decoder.mo3324C(getDescriptor());
        boolean z = false;
        if (mo3324C >= 0 && mo3324C < this.f96518a.length) {
            z = true;
        }
        if (z) {
            return this.f96518a[mo3324C];
        }
        throw new SerializationException(mo3324C + " is not among valid " + getDescriptor().mo10456h() + " enum values, values size is " + this.f96518a.length);
    }

    @Override // p000.InterfaceC40615et5
    /* renamed from: e */
    public void serialize(InterfaceC48140rb1 encoder, T value) {
        int indexOf;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        indexOf = ArraysKt___ArraysKt.indexOf(this.f96518a, value);
        if (indexOf != -1) {
            encoder.mo1141i(getDescriptor(), indexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().mo10456h());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f96518a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return (InterfaceC34588Ms5) this.f96520c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo10456h() + Typography.greater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C44622lf1(String serialName, T[] values, InterfaceC34588Ms5 descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f96519b = descriptor;
    }
}
