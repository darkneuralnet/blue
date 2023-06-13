package p000;

import android.os.LocaleList;
import java.util.Locale;
/* renamed from: yv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52490yv2 implements InterfaceC51897xv2 {

    /* renamed from: a */
    public final LocaleList f120416a;

    public C52490yv2(Object obj) {
        this.f120416a = (LocaleList) obj;
    }

    @Override // p000.InterfaceC51897xv2
    /* renamed from: a */
    public String mo2261a() {
        return this.f120416a.toLanguageTags();
    }

    @Override // p000.InterfaceC51897xv2
    /* renamed from: b */
    public Object mo2260b() {
        return this.f120416a;
    }

    public boolean equals(Object obj) {
        return this.f120416a.equals(((InterfaceC51897xv2) obj).mo2260b());
    }

    @Override // p000.InterfaceC51897xv2
    public Locale get(int i) {
        return this.f120416a.get(i);
    }

    public int hashCode() {
        return this.f120416a.hashCode();
    }

    @Override // p000.InterfaceC51897xv2
    public boolean isEmpty() {
        return this.f120416a.isEmpty();
    }

    @Override // p000.InterfaceC51897xv2
    public int size() {
        return this.f120416a.size();
    }

    public String toString() {
        return this.f120416a.toString();
    }
}
