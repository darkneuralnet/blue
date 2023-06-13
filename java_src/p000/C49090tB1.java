package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, m28432d2 = {"LtB1;", "LUX5;", "", "toString", "i", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "j", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tB1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49090tB1 extends UX5 {

    /* renamed from: i */
    public final String f109991i;

    /* renamed from: j */
    public final String f109992j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49090tB1(String name, String fontFamilyName) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        this.f109991i = name;
        this.f109992j = fontFamilyName;
    }

    /* renamed from: b */
    public final String m12920b() {
        return this.f109991i;
    }

    public String toString() {
        return this.f109992j;
    }
}
