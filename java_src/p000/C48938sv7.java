package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: sv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48938sv7 implements Iterator {

    /* renamed from: b */
    public int f109575b = 0;

    /* renamed from: c */
    public final /* synthetic */ C43019iw7 f109576c;

    public C48938sv7(C43019iw7 c43019iw7) {
        this.f109576c = c43019iw7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f109575b;
        str = this.f109576c.f91746b;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.f109575b;
        C43019iw7 c43019iw7 = this.f109576c;
        str = c43019iw7.f91746b;
        if (i < str.length()) {
            str2 = c43019iw7.f91746b;
            this.f109575b = i + 1;
            return new C43019iw7(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
