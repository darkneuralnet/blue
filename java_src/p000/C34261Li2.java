package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;
import p000.E24;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LLi2;", "LKj2;", "LKi2;", "Lrb1;", "encoder", "value", "", "b", "LGV0;", "decoder", C17296a.f69688o, "LMs5;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
/* renamed from: Li2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34261Li2 implements InterfaceC34036Kj2<C34027Ki2> {

    /* renamed from: a */
    public static final C34261Li2 f21947a = new C34261Li2();

    /* renamed from: b */
    public static final InterfaceC34588Ms5 f21948b = C35524Qs5.m87852a("kotlinx.serialization.json.JsonLiteral", E24.C1721i.f6873a);

    private C34261Li2() {
    }

    @Override // p000.E01
    /* renamed from: a */
    public C34027Ki2 deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        AbstractC51767xi2 mo13802v = C32155Ci2.m111822d(decoder).mo13802v();
        if (mo13802v instanceof C34027Ki2) {
            return (C34027Ki2) mo13802v;
        }
        throw C32857Fi2.m106730f(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(mo13802v.getClass()), mo13802v.toString());
    }

    @Override // p000.InterfaceC40615et5
    /* renamed from: b */
    public void serialize(InterfaceC48140rb1 encoder, C34027Ki2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C32155Ci2.m111818h(encoder);
        if (value.m98484c()) {
            encoder.mo1134q(value.mo74434a());
        } else if (value.m98485b() != null) {
            encoder.mo1130u(value.m98485b()).mo1134q(value.mo74434a());
        } else {
            Long m518o = C52953zi2.m518o(value);
            if (m518o != null) {
                encoder.mo1127x(m518o.longValue());
                return;
            }
            ULong uLongOrNull = UStringsKt.toULongOrNull(value.mo74434a());
            if (uLongOrNull != null) {
                encoder.mo1130u(C38330b40.m65018s(ULong.Companion).getDescriptor()).mo1127x(uLongOrNull.m117009unboximpl());
                return;
            }
            Double m525h = C52953zi2.m525h(value);
            if (m525h != null) {
                encoder.mo1131t(m525h.doubleValue());
                return;
            }
            Boolean m528e = C52953zi2.m528e(value);
            if (m528e != null) {
                encoder.mo1138l(m528e.booleanValue());
            } else {
                encoder.mo1134q(value.mo74434a());
            }
        }
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return f21948b;
    }
}
