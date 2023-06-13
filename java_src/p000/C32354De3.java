package p000;

import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LDe3;", "N", "Llm;", "node", "", "h", "(Ljava/lang/Object;)V", "i", "", "index", "instance", "f", "(ILjava/lang/Object;)V", "g", "count", "b", "from", "to", "e", "clear", C17296a.f69688o, "Llm;", "applier", "I", "offset", "c", "nesting", "()Ljava/lang/Object;", "current", "<init>", "(Llm;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n4513#2,5:289\n4513#2,5:294\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:289,5\n286#1:294,5\n*E\n"})
/* renamed from: De3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32354De3<N> implements InterfaceC25773lm<N> {

    /* renamed from: a */
    public final InterfaceC25773lm<N> f6127a;

    /* renamed from: b */
    public final int f6128b;

    /* renamed from: c */
    public int f6129c;

    public C32354De3(InterfaceC25773lm<N> applier, int i) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f6127a = applier;
        this.f6128b = i;
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: a */
    public N mo26853a() {
        return this.f6127a.mo26853a();
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: b */
    public void mo8335b(int i, int i2) {
        this.f6127a.mo8335b(i + (this.f6129c == 0 ? this.f6128b : 0), i2);
    }

    @Override // p000.InterfaceC25773lm
    public void clear() {
        C35528Qt0.m87792x("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: e */
    public void mo8333e(int i, int i2, int i3) {
        int i4;
        if (this.f6129c == 0) {
            i4 = this.f6128b;
        } else {
            i4 = 0;
        }
        this.f6127a.mo8333e(i + i4, i2 + i4, i3);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: f */
    public void mo8332f(int i, N n) {
        this.f6127a.mo8332f(i + (this.f6129c == 0 ? this.f6128b : 0), n);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: g */
    public void mo8331g(int i, N n) {
        this.f6127a.mo8331g(i + (this.f6129c == 0 ? this.f6128b : 0), n);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: h */
    public void mo26851h(N n) {
        this.f6129c++;
        this.f6127a.mo26851h(n);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: i */
    public void mo26850i() {
        boolean z;
        int i = this.f6129c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6129c = i - 1;
            this.f6127a.mo26850i();
            return;
        }
        C35528Qt0.m87792x("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
