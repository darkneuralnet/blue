package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Function;", "", "T", "LK1;", "parentValue", "childValue", C17296a.f69688o, "(LK1;LK1;)LK1;"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1195:1\n*E\n"})
/* renamed from: os5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46535os5 extends Lambda implements Function2<C4297K1<Function<? extends Boolean>>, C4297K1<Function<? extends Boolean>>, C4297K1<Function<? extends Boolean>>> {

    /* renamed from: g */
    public static final C46535os5 f102688g = new C46535os5();

    public C46535os5() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a */
    public final C4297K1<Function<? extends Boolean>> invoke(C4297K1<Function<? extends Boolean>> c4297k1, C4297K1<Function<? extends Boolean>> childValue) {
        String m99356b;
        Function<? extends Boolean> m99357a;
        Intrinsics.checkNotNullParameter(childValue, "childValue");
        if (c4297k1 == null || (m99356b = c4297k1.m99356b()) == null) {
            m99356b = childValue.m99356b();
        }
        if (c4297k1 == null || (m99357a = c4297k1.m99357a()) == null) {
            m99357a = childValue.m99357a();
        }
        return new C4297K1<>(m99356b, m99357a);
    }
}
