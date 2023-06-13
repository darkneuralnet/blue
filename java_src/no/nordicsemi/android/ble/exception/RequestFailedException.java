package no.nordicsemi.android.ble.exception;

import no.nordicsemi.android.ble.AbstractC26684u0;
/* loaded from: classes8.dex */
public final class RequestFailedException extends Exception {

    /* renamed from: b */
    public final AbstractC26684u0 f100631b;

    /* renamed from: c */
    public final int f100632c;

    public RequestFailedException(AbstractC26684u0 abstractC26684u0, int i) {
        super("Request failed with status " + i);
        this.f100631b = abstractC26684u0;
        this.f100632c = i;
    }

    /* renamed from: a */
    public int m22613a() {
        return this.f100632c;
    }
}
