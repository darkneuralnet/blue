package p000;

import android.graphics.Canvas;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005\"\u0019\u0010\n\u001a\u00060\u0004j\u0002`\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t*\n\u0010\u000b\"\u00020\u00042\u00020\u0004¨\u0006\f"}, m28432d2 = {"LMW1;", Entry.TYPE_IMAGE, "Lme0;", C17296a.f69688o, "Landroid/graphics/Canvas;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "c", "(Lme0;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* renamed from: bc */
/* loaded from: classes.dex */
public final class C12455bc {

    /* renamed from: a */
    public static final Canvas f57749a = new Canvas();

    /* renamed from: a */
    public static final InterfaceC45204me0 m64281a(MW1 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        C10761ac c10761ac = new C10761ac();
        c10761ac.m71101z(new Canvas(C6809Qc.m88363b(image)));
        return c10761ac;
    }

    /* renamed from: c */
    public static final Canvas m64279c(InterfaceC45204me0 interfaceC45204me0) {
        Intrinsics.checkNotNullParameter(interfaceC45204me0, "<this>");
        return ((C10761ac) interfaceC45204me0).m71102y();
    }
}
