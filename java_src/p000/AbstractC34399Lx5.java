package p000;

import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47063pm0;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, m28432d2 = {"LLx5;", "La30;", "LxB5;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "LkE3;", "p", "", "alpha", "", C17296a.f69688o, "(JLkE3;F)V", "c", "Landroid/graphics/Shader;", "internalShader", DateTokenConverter.CONVERTER_KEY, "J", "createdSize", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
/* renamed from: Lx5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34399Lx5 extends AbstractC37727a30 {

    /* renamed from: c */
    public Shader f22319c;

    /* renamed from: d */
    public long f22320d;

    public AbstractC34399Lx5() {
        super(null);
        this.f22320d = C51465xB5.f117175b.m5724a();
    }

    @Override // p000.AbstractC37727a30
    /* renamed from: a */
    public final void mo19362a(long j, InterfaceC43783kE3 p, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(p, "p");
        Shader shader = this.f22319c;
        if (shader == null || !C51465xB5.m5733f(this.f22320d, j)) {
            shader = mo65060b(j);
            this.f22319c = shader;
            this.f22320d = j;
        }
        long mo29184a = p.mo29184a();
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        if (!C47063pm0.m18741o(mo29184a, c27386a.m18732a())) {
            p.mo29179f(c27386a.m18732a());
        }
        if (!Intrinsics.areEqual(p.mo29173l(), shader)) {
            p.mo29162w(shader);
        }
        if (p.mo29177h() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            p.mo29178g(f);
        }
    }

    /* renamed from: b */
    public abstract Shader mo65060b(long j);
}
