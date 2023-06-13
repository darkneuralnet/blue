package com.uber.rxdogtag.autodispose;

import com.uber.autodispose.observers.AutoDisposingCompletableObserver;
import com.uber.autodispose.observers.AutoDisposingMaybeObserver;
import com.uber.autodispose.observers.AutoDisposingObserver;
import com.uber.autodispose.observers.AutoDisposingSingleObserver;
import com.uber.autodispose.observers.AutoDisposingSubscriber;
import com.uber.rxdogtag.InterfaceC19541E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.Observable;
/* renamed from: com.uber.rxdogtag.autodispose.b */
/* loaded from: classes7.dex */
public final class C19558b implements InterfaceC19541E {

    /* renamed from: a */
    public static final C19558b f75607a = new C19558b();

    private C19558b() {
    }

    @Override // com.uber.rxdogtag.InterfaceC19541E
    /* renamed from: a */
    public InterfaceC42141hT5 mo45126a(AbstractC24490k abstractC24490k, InterfaceC42141hT5 interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof AutoDisposingSubscriber) {
            return ((AutoDisposingSubscriber) interfaceC42141hT5).mo45172w();
        }
        return interfaceC42141hT5;
    }

    @Override // com.uber.rxdogtag.InterfaceC19541E
    /* renamed from: b */
    public InterfaceC23445I mo45125b(AbstractC23442F abstractC23442F, InterfaceC23445I interfaceC23445I) {
        if (interfaceC23445I instanceof AutoDisposingSingleObserver) {
            return ((AutoDisposingSingleObserver) interfaceC23445I).mo45173f();
        }
        return interfaceC23445I;
    }

    @Override // com.uber.rxdogtag.InterfaceC19541E
    /* renamed from: c */
    public InterfaceC23436D mo45124c(Observable observable, InterfaceC23436D interfaceC23436D) {
        if (interfaceC23436D instanceof AutoDisposingObserver) {
            return ((AutoDisposingObserver) interfaceC23436D).mo45174f();
        }
        return interfaceC23436D;
    }

    @Override // com.uber.rxdogtag.InterfaceC19541E
    /* renamed from: d */
    public InterfaceC23476f mo45123d(AbstractC23461c abstractC23461c, InterfaceC23476f interfaceC23476f) {
        if (interfaceC23476f instanceof AutoDisposingCompletableObserver) {
            return ((AutoDisposingCompletableObserver) interfaceC23476f).mo45176f();
        }
        return interfaceC23476f;
    }

    @Override // com.uber.rxdogtag.InterfaceC19541E
    /* renamed from: e */
    public InterfaceC24541s mo45122e(AbstractC24507p abstractC24507p, InterfaceC24541s interfaceC24541s) {
        if (interfaceC24541s instanceof AutoDisposingMaybeObserver) {
            return ((AutoDisposingMaybeObserver) interfaceC24541s).mo45175f();
        }
        return interfaceC24541s;
    }

    public String toString() {
        return "AutoDisposeObserverHandler";
    }
}
