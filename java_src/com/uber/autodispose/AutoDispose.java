package com.uber.autodispose;

import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
/* loaded from: classes7.dex */
public final class AutoDispose {
    private AutoDispose() {
        throw new AssertionError("No instances");
    }

    /* renamed from: a */
    public static <T> AutoDisposeConverter<T> m45239a(ScopeProvider scopeProvider) {
        AutoDisposeUtil.m45225a(scopeProvider, "provider == null");
        return m45238b(Scopes.m45207b(scopeProvider));
    }

    /* renamed from: b */
    public static <T> AutoDisposeConverter<T> m45238b(final InterfaceC23496h interfaceC23496h) {
        AutoDisposeUtil.m45225a(interfaceC23496h, "scope == null");
        return new AutoDisposeConverter<T>() { // from class: com.uber.autodispose.AutoDispose.1
            @Override // io.reactivex.InterfaceC23462d
            /* renamed from: e */
            public CompletableSubscribeProxy mo33028a(final AbstractC23461c abstractC23461c) {
                if (!AutoDisposePlugins.f75522c) {
                    return new AutoDisposeCompletable(abstractC23461c, InterfaceC23496h.this);
                }
                return new CompletableSubscribeProxy() { // from class: com.uber.autodispose.AutoDispose.1.1
                    @Override // com.uber.autodispose.CompletableSubscribeProxy
                    /* renamed from: b */
                    public InterfaceC23465c mo45218b(InterfaceC23478a interfaceC23478a) {
                        return new AutoDisposeCompletable(abstractC23461c, InterfaceC23496h.this).m33059b(interfaceC23478a);
                    }

                    @Override // com.uber.autodispose.CompletableSubscribeProxy
                    /* renamed from: e */
                    public InterfaceC23465c mo45217e(InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super Throwable> interfaceC23484g) {
                        return new AutoDisposeCompletable(abstractC23461c, InterfaceC23496h.this).m33055e(interfaceC23478a, interfaceC23484g);
                    }

                    @Override // com.uber.autodispose.CompletableSubscribeProxy
                    public InterfaceC23465c subscribe() {
                        return new AutoDisposeCompletable(abstractC23461c, InterfaceC23496h.this).subscribe();
                    }
                };
            }

            @Override // io.reactivex.InterfaceC24491l
            /* renamed from: f */
            public FlowableSubscribeProxy<T> mo32092d(final AbstractC24490k<T> abstractC24490k) {
                if (!AutoDisposePlugins.f75522c) {
                    return new AutoDisposeFlowable(abstractC24490k, InterfaceC23496h.this);
                }
                return new FlowableSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.2
                    @Override // com.uber.autodispose.FlowableSubscribeProxy
                    public InterfaceC23465c subscribe() {
                        return new AutoDisposeFlowable(abstractC24490k, InterfaceC23496h.this).subscribe();
                    }

                    @Override // com.uber.autodispose.FlowableSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
                        return new AutoDisposeFlowable(abstractC24490k, InterfaceC23496h.this).subscribe(interfaceC23484g);
                    }

                    @Override // com.uber.autodispose.FlowableSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
                        return new AutoDisposeFlowable(abstractC24490k, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2);
                    }
                };
            }

            @Override // io.reactivex.InterfaceC24515q
            /* renamed from: g */
            public MaybeSubscribeProxy<T> mo31964b(final AbstractC24507p<T> abstractC24507p) {
                if (!AutoDisposePlugins.f75522c) {
                    return new AutoDisposeMaybe(abstractC24507p, InterfaceC23496h.this);
                }
                return new MaybeSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.3
                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public InterfaceC23465c subscribe() {
                        return new AutoDisposeMaybe(abstractC24507p, InterfaceC23496h.this).subscribe();
                    }

                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
                        return new AutoDisposeMaybe(abstractC24507p, InterfaceC23496h.this).subscribe(interfaceC23484g);
                    }

                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
                        return new AutoDisposeMaybe(abstractC24507p, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2);
                    }

                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
                        return new AutoDisposeMaybe(abstractC24507p, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2, interfaceC23478a);
                    }
                };
            }

            @Override // io.reactivex.InterfaceC24577x
            /* renamed from: h */
            public ObservableSubscribeProxy<T> apply(final Observable<T> observable) {
                if (!AutoDisposePlugins.f75522c) {
                    return new AutoDisposeObservable(observable, InterfaceC23496h.this);
                }
                return new ObservableSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.4
                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public InterfaceC23465c subscribe() {
                        return new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribe();
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public <E extends InterfaceC23436D<? super T>> E subscribeWith(E e) {
                        return (E) new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribeWith(e);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
                        return new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribe(interfaceC23484g);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
                        return new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
                        return new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2, interfaceC23478a);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public void subscribe(InterfaceC23436D<? super T> interfaceC23436D) {
                        new AutoDisposeObservable(observable, InterfaceC23496h.this).subscribe(interfaceC23436D);
                    }
                };
            }

            @Override // io.reactivex.InterfaceC23443G
            /* renamed from: i */
            public SingleSubscribeProxy<T> mo33097c(final AbstractC23442F<T> abstractC23442F) {
                if (!AutoDisposePlugins.f75522c) {
                    return new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this);
                }
                return new SingleSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.5
                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    /* renamed from: a */
                    public void mo45205a(InterfaceC23445I<? super T> interfaceC23445I) {
                        new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this).mo33096a(interfaceC23445I);
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    /* renamed from: b */
                    public InterfaceC23465c mo45204b(InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
                        return new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this).m33139b(interfaceC23479b);
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public InterfaceC23465c subscribe() {
                        return new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this).subscribe();
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
                        return new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this).subscribe(interfaceC23484g);
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
                        return new AutoDisposeSingle(abstractC23442F, InterfaceC23496h.this).subscribe(interfaceC23484g, interfaceC23484g2);
                    }
                };
            }
        };
    }
}
