package p000;

import java.util.NoSuchElementException;
/* renamed from: lR8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44498lR8 extends AbstractC38578bU8 {

    /* renamed from: b */
    public boolean f96207b;

    /* renamed from: c */
    public final /* synthetic */ Object f96208c;

    public C44498lR8(Object obj) {
        this.f96208c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f96207b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f96207b) {
            this.f96207b = true;
            return this.f96208c;
        }
        throw new NoSuchElementException();
    }
}
