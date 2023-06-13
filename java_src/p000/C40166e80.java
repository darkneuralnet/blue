package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010\b\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005R\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010 R\u0014\u0010#\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m28432d2 = {"Le80;", "Lg01;", "Lkotlin/Function1;", "LiA0;", "", "Lkotlin/ExtensionFunctionType;", "block", "LH61;", DateTokenConverter.CONVERTER_KEY, "LW30;", "b", "LW30;", "getCacheParams$ui_release", "()LW30;", "e", "(LW30;)V", "cacheParams", "c", "LH61;", "()LH61;", "f", "(LH61;)V", "drawResult", "LxB5;", "h", "()J", "size", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "", "()F", "density", "R0", "fontScale", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
/* renamed from: e80  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40166e80 implements InterfaceC41273g01 {

    /* renamed from: b */
    public W30 f77986b = C34890Oa1.f26784b;

    /* renamed from: c */
    public H61 f77987c;

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f77986b.mo29737b().mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f77986b.mo29737b().mo3408b();
    }

    /* renamed from: c */
    public final H61 m43236c() {
        return this.f77987c;
    }

    /* renamed from: d */
    public final H61 m43235d(Function1<? super InterfaceC42558iA0, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        H61 h61 = new H61(block);
        this.f77987c = h61;
        return h61;
    }

    /* renamed from: e */
    public final void m43234e(W30 w30) {
        Intrinsics.checkNotNullParameter(w30, "<set-?>");
        this.f77986b = w30;
    }

    /* renamed from: f */
    public final void m43233f(H61 h61) {
        this.f77987c = h61;
    }

    public final EnumC47065pm2 getLayoutDirection() {
        return this.f77986b.getLayoutDirection();
    }

    /* renamed from: h */
    public final long m43232h() {
        return this.f77986b.mo29733h();
    }
}
