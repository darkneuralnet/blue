package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p000.E24;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcj2;", "LKj2;", "LYi2;", "Lrb1;", "encoder", "value", "", "b", "LGV0;", "decoder", C17296a.f69688o, "LMs5;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: cj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39309cj2 implements InterfaceC34036Kj2<AbstractC37303Yi2> {

    /* renamed from: a */
    public static final C39309cj2 f61111a = new C39309cj2();

    /* renamed from: b */
    public static final InterfaceC34588Ms5 f61112b = C35524Qs5.m87850c("kotlinx.serialization.json.JsonPrimitive", E24.C1721i.f6873a, new InterfaceC34588Ms5[0], null, 8, null);

    private C39309cj2() {
    }

    @Override // p000.E01
    /* renamed from: a */
    public AbstractC37303Yi2 deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        AbstractC51767xi2 mo13802v = C32155Ci2.m111822d(decoder).mo13802v();
        if (mo13802v instanceof AbstractC37303Yi2) {
            return (AbstractC37303Yi2) mo13802v;
        }
        throw C32857Fi2.m106730f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(mo13802v.getClass()), mo13802v.toString());
    }

    @Override // p000.InterfaceC40615et5
    /* renamed from: b */
    public void serialize(InterfaceC48140rb1 encoder, AbstractC37303Yi2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C32155Ci2.m111823c(encoder);
        if (value instanceof C35197Pi2) {
            encoder.mo1176B(C35665Ri2.f32455a, C35197Pi2.INSTANCE);
        } else {
            encoder.mo1176B(C34261Li2.f21947a, (C34027Ki2) value);
        }
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return f61112b;
    }
}
