package p000;

import java.util.NoSuchElementException;
/* renamed from: xV8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51648xV8 extends HX8 {

    /* renamed from: b */
    public boolean f117737b;

    /* renamed from: c */
    public final /* synthetic */ Object f117738c;

    public C51648xV8(Object obj) {
        this.f117738c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f117737b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f117737b) {
            throw new NoSuchElementException();
        }
        this.f117737b = true;
        return this.f117738c;
    }
}
