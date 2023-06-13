package p000;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, m28432d2 = {"LeS5;", "Lht5;", "", "", "value", "c", "b", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: eS5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40353eS5 implements InterfaceC42394ht5<CharSequence, String> {

    /* renamed from: a */
    public static final C40353eS5 f78400a = new C40353eS5();

    private C40353eS5() {
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: b */
    public CharSequence mo35621a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return C39761dS5.f76622c.m44248a(value).m44250a();
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: c */
    public String serialize(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new C39761dS5(value, value instanceof Spanned).m44249b();
    }
}
