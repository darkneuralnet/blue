package p000;

import android.support.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: tO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC49212tO6 implements InterfaceC42681iN6 {

    /* renamed from: b */
    public static final EnumC49212tO6 f110421b = new EnumC49212tO6();

    /* renamed from: c */
    public static final AtomicReference<InterfaceC50981wN6> f110422c = new AtomicReference<>(null);

    private EnumC49212tO6() {
    }

    @Override // p000.InterfaceC42681iN6
    @Nullable
    /* renamed from: a */
    public final InterfaceC50981wN6 mo12416a() {
        return f110422c.get();
    }

    /* renamed from: b */
    public final void m12415b(InterfaceC50981wN6 interfaceC50981wN6) {
        f110422c.set(interfaceC50981wN6);
    }
}
