package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LBc6;", "", "LAc6;", "typefaceRequest", "Lkotlin/Function1;", "LCc6;", "", "resolveTypeface", "LsP5;", "c", "LRX5;", C17296a.f69688o, "LRX5;", "b", "()LRX5;", "lock", "LtE2;", "LtE2;", "resultCache", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"})
/* renamed from: Bc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31871Bc6 {

    /* renamed from: a */
    public final RX5 f2558a = CX5.m112154a();

    /* renamed from: b */
    public final C49118tE2<C31637Ac6, InterfaceC32105Cc6> f2559b = new C49118tE2<>(16);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LCc6;", "finalResult", "", C17296a.f69688o, "(LCc6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n191#1:249\n*E\n"})
    /* renamed from: Bc6$a */
    /* loaded from: classes.dex */
    public static final class C0651a extends Lambda implements Function1<InterfaceC32105Cc6, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C31637Ac6 f2561h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0651a(C31637Ac6 c31637Ac6) {
            super(1);
            this.f2561h = c31637Ac6;
        }

        /* renamed from: a */
        public final void m113803a(InterfaceC32105Cc6 finalResult) {
            Intrinsics.checkNotNullParameter(finalResult, "finalResult");
            RX5 m113805b = C31871Bc6.this.m113805b();
            C31871Bc6 c31871Bc6 = C31871Bc6.this;
            C31637Ac6 c31637Ac6 = this.f2561h;
            synchronized (m113805b) {
                if (finalResult.mo111983b()) {
                    c31871Bc6.f2559b.m12573e(c31637Ac6, finalResult);
                } else {
                    c31871Bc6.f2559b.m12572f(c31637Ac6);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32105Cc6 interfaceC32105Cc6) {
            m113803a(interfaceC32105Cc6);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final RX5 m113805b() {
        return this.f2558a;
    }

    /* renamed from: c */
    public final InterfaceC48627sP5<Object> m113804c(C31637Ac6 typefaceRequest, Function1<? super Function1<? super InterfaceC32105Cc6, Unit>, ? extends InterfaceC32105Cc6> resolveTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.f2558a) {
            InterfaceC32105Cc6 m12574d = this.f2559b.m12574d(typefaceRequest);
            if (m12574d != null) {
                if (m12574d.mo111983b()) {
                    return m12574d;
                }
                this.f2559b.m12572f(typefaceRequest);
            }
            try {
                InterfaceC32105Cc6 invoke = resolveTypeface.invoke(new C0651a(typefaceRequest));
                synchronized (this.f2558a) {
                    if (this.f2559b.m12574d(typefaceRequest) == null && invoke.mo111983b()) {
                        this.f2559b.m12573e(typefaceRequest, invoke);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
