package com.zendesk.service;
/* loaded from: classes7.dex */
public class ZendeskException extends Exception {

    /* renamed from: b */
    public final InterfaceC48782sg1 f75649b;

    @Override // java.lang.Throwable
    public String toString() {
        String mo9891c;
        InterfaceC48782sg1 interfaceC48782sg1 = this.f75649b;
        if (interfaceC48782sg1 == null) {
            mo9891c = "null";
        } else {
            mo9891c = interfaceC48782sg1.mo9891c();
        }
        return String.format("ZendeskException{details=%s,errorResponse=%s,cause=%s}", super.toString(), mo9891c, C36323Ud3.m81221a(getCause()));
    }
}
