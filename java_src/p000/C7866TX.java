package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a.\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, m28432d2 = {"T", "Lio/reactivex/F;", "LDX;", "bluetoothManager", "Lbi3;", "opMode", "m", "Lio/reactivex/Observable;", "l", "Lio/reactivex/p;", "k", "Lio/reactivex/c;", "j", "interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManager.kt\nco/bird/android/bluetooth/api/BluetoothManagerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* renamed from: TX */
/* loaded from: classes2.dex */
public final class C7866TX {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TX$a */
    /* loaded from: classes2.dex */
    public static final class C7867a extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC1510DX f35608g;

        /* renamed from: h */
        public final /* synthetic */ EnumC38707bi3 f35609h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC23461c f35610i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7867a(InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, AbstractC23461c abstractC23461c) {
            super(1);
            this.f35608g = interfaceC1510DX;
            this.f35609h = enumC38707bi3;
            this.f35610i = abstractC23461c;
        }

        /* renamed from: a */
        public final void m83457a(InterfaceC23465c interfaceC23465c) {
            this.f35608g.mo107062c(new C37591Zo2(this.f35609h, null, null, null, this.f35610i, 14, null), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m83457a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TX$b */
    /* loaded from: classes2.dex */
    public static final class C7868b extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC1510DX f35611g;

        /* renamed from: h */
        public final /* synthetic */ EnumC38707bi3 f35612h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC23442F<T> f35613i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7868b(InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, AbstractC23442F<T> abstractC23442F) {
            super(1);
            this.f35611g = interfaceC1510DX;
            this.f35612h = enumC38707bi3;
            this.f35613i = abstractC23442F;
        }

        /* renamed from: a */
        public final void m83456a(InterfaceC23465c interfaceC23465c) {
            this.f35611g.mo107062c(new C37591Zo2(this.f35612h, this.f35613i, null, null, null, 28, null), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m83456a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TX$c */
    /* loaded from: classes2.dex */
    public static final class C7869c extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC1510DX f35614g;

        /* renamed from: h */
        public final /* synthetic */ EnumC38707bi3 f35615h;

        /* renamed from: i */
        public final /* synthetic */ Observable<T> f35616i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7869c(InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, Observable<T> observable) {
            super(1);
            this.f35614g = interfaceC1510DX;
            this.f35615h = enumC38707bi3;
            this.f35616i = observable;
        }

        /* renamed from: a */
        public final void m83455a(InterfaceC23465c interfaceC23465c) {
            this.f35614g.mo107062c(new C37591Zo2(this.f35615h, null, this.f35616i, null, null, 26, null), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m83455a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TX$d */
    /* loaded from: classes2.dex */
    public static final class C7870d extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC38707bi3 f35617g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC1510DX f35618h;

        /* renamed from: i */
        public final /* synthetic */ Observable<T> f35619i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7870d(EnumC38707bi3 enumC38707bi3, InterfaceC1510DX interfaceC1510DX, Observable<T> observable) {
            super(1);
            this.f35617g = enumC38707bi3;
            this.f35618h = interfaceC1510DX;
            this.f35619i = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C7870d) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            EnumC38707bi3 enumC38707bi3 = this.f35617g;
            if (enumC38707bi3 == EnumC38707bi3.CONNECT) {
                this.f35618h.mo107062c(new C37591Zo2(enumC38707bi3, null, this.f35619i, null, null, 26, null), false);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TX$e */
    /* loaded from: classes2.dex */
    public static final class C7871e extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC1510DX f35620g;

        /* renamed from: h */
        public final /* synthetic */ EnumC38707bi3 f35621h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC24507p<T> f35622i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7871e(InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, AbstractC24507p<T> abstractC24507p) {
            super(1);
            this.f35620g = interfaceC1510DX;
            this.f35621h = enumC38707bi3;
            this.f35622i = abstractC24507p;
        }

        /* renamed from: a */
        public final void m83454a(InterfaceC23465c interfaceC23465c) {
            this.f35620g.mo107062c(new C37591Zo2(this.f35621h, null, null, this.f35622i, null, 22, null), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m83454a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: j */
    public static final AbstractC23461c m83470j(final AbstractC23461c abstractC23461c, final InterfaceC1510DX bluetoothManager, final EnumC38707bi3 opMode) {
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        if (opMode != EnumC38707bi3.SCAN_LEGACY && opMode != EnumC38707bi3.CONNECT) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final C7867a c7867a = new C7867a(bluetoothManager, opMode, abstractC23461c);
            AbstractC23461c m33030y = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: OX
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7866TX.m83465o(Function1.this, obj);
                }
            }).m33030y(new InterfaceC23478a() { // from class: PX
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7866TX.m83464p(InterfaceC1510DX.this, opMode, abstractC23461c);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33030y, "Completable.trackLegacyB…ng = false,\n      )\n    }");
            return m33030y;
        }
        throw new IllegalArgumentException("Only OperationMode.SCAN_LEGACY and OperationMode.CONNECT are supported".toString());
    }

    /* renamed from: k */
    public static final <T> AbstractC24507p<T> m83469k(final AbstractC24507p<T> abstractC24507p, final InterfaceC1510DX bluetoothManager, final EnumC38707bi3 opMode) {
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC24507p, "<this>");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        if (opMode != EnumC38707bi3.SCAN_LEGACY && opMode != EnumC38707bi3.CONNECT) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final C7871e c7871e = new C7871e(bluetoothManager, opMode, abstractC24507p);
            AbstractC24507p<T> m32032m = abstractC24507p.m32027r(new InterfaceC23484g() { // from class: MX
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7866TX.m83459u(Function1.this, obj);
                }
            }).m32032m(new InterfaceC23478a() { // from class: NX
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7866TX.m83458v(InterfaceC1510DX.this, opMode, abstractC24507p);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32032m, "Maybe<T>.trackLegacyBleO…ng = false,\n      )\n    }");
            return m32032m;
        }
        throw new IllegalArgumentException("Only OperationMode.SCAN_LEGACY and OperationMode.CONNECT are supported".toString());
    }

    /* renamed from: l */
    public static final <T> Observable<T> m83468l(final Observable<T> observable, final InterfaceC1510DX bluetoothManager, final EnumC38707bi3 opMode) {
        boolean z;
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        if (opMode != EnumC38707bi3.SCAN_LEGACY && opMode != EnumC38707bi3.CONNECT) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final C7869c c7869c = new C7869c(bluetoothManager, opMode, observable);
            Observable<T> doOnSubscribe = observable.doOnSubscribe(new InterfaceC23484g() { // from class: QX
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7866TX.m83462r(Function1.this, obj);
                }
            });
            final C7870d c7870d = new C7870d(opMode, bluetoothManager, observable);
            Observable<T> doFinally = doOnSubscribe.doOnNext(new InterfaceC23484g() { // from class: RX
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7866TX.m83461s(Function1.this, obj);
                }
            }).doFinally(new InterfaceC23478a() { // from class: SX
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7866TX.m83460t(EnumC38707bi3.this, bluetoothManager, observable);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doFinally, "Observable<T>.trackLegac…,\n        )\n      }\n    }");
            return doFinally;
        }
        throw new IllegalArgumentException("Only OperationMode.SCAN_LEGACY and OperationMode.CONNECT are supported".toString());
    }

    /* renamed from: m */
    public static final <T> AbstractC23442F<T> m83467m(final AbstractC23442F<T> abstractC23442F, final InterfaceC1510DX bluetoothManager, final EnumC38707bi3 opMode) {
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        if (opMode != EnumC38707bi3.SCAN_LEGACY && opMode != EnumC38707bi3.CONNECT) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final C7868b c7868b = new C7868b(bluetoothManager, opMode, abstractC23442F);
            AbstractC23442F<T> m33110r = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: KX
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7866TX.m83466n(Function1.this, obj);
                }
            }).m33110r(new InterfaceC23478a() { // from class: LX
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7866TX.m83463q(InterfaceC1510DX.this, opMode, abstractC23442F);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33110r, "Single<T>.trackLegacyBle…ng = false,\n      )\n    }");
            return m33110r;
        }
        throw new IllegalArgumentException("Only OperationMode.SCAN_LEGACY and OperationMode.CONNECT are supported".toString());
    }

    /* renamed from: n */
    public static final void m83466n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m83465o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m83464p(InterfaceC1510DX bluetoothManager, EnumC38707bi3 opMode, AbstractC23461c this_trackLegacyBleOp) {
        Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "$opMode");
        Intrinsics.checkNotNullParameter(this_trackLegacyBleOp, "$this_trackLegacyBleOp");
        bluetoothManager.mo107062c(new C37591Zo2(opMode, null, null, null, this_trackLegacyBleOp, 14, null), false);
    }

    /* renamed from: q */
    public static final void m83463q(InterfaceC1510DX bluetoothManager, EnumC38707bi3 opMode, AbstractC23442F this_trackLegacyBleOp) {
        Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "$opMode");
        Intrinsics.checkNotNullParameter(this_trackLegacyBleOp, "$this_trackLegacyBleOp");
        bluetoothManager.mo107062c(new C37591Zo2(opMode, this_trackLegacyBleOp, null, null, null, 28, null), false);
    }

    /* renamed from: r */
    public static final void m83462r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m83461s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m83460t(EnumC38707bi3 opMode, InterfaceC1510DX bluetoothManager, Observable this_trackLegacyBleOp) {
        Intrinsics.checkNotNullParameter(opMode, "$opMode");
        Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        Intrinsics.checkNotNullParameter(this_trackLegacyBleOp, "$this_trackLegacyBleOp");
        if (opMode != EnumC38707bi3.CONNECT) {
            bluetoothManager.mo107062c(new C37591Zo2(opMode, null, this_trackLegacyBleOp, null, null, 26, null), false);
        }
    }

    public static /* synthetic */ AbstractC23442F trackLegacyBleOp$default(AbstractC23442F abstractC23442F, InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC38707bi3 = EnumC38707bi3.CONNECT;
        }
        return m83467m(abstractC23442F, interfaceC1510DX, enumC38707bi3);
    }

    /* renamed from: u */
    public static final void m83459u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m83458v(InterfaceC1510DX bluetoothManager, EnumC38707bi3 opMode, AbstractC24507p this_trackLegacyBleOp) {
        Intrinsics.checkNotNullParameter(bluetoothManager, "$bluetoothManager");
        Intrinsics.checkNotNullParameter(opMode, "$opMode");
        Intrinsics.checkNotNullParameter(this_trackLegacyBleOp, "$this_trackLegacyBleOp");
        bluetoothManager.mo107062c(new C37591Zo2(opMode, null, null, this_trackLegacyBleOp, null, 22, null), false);
    }

    public static /* synthetic */ Observable trackLegacyBleOp$default(Observable observable, InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC38707bi3 = EnumC38707bi3.CONNECT;
        }
        return m83468l(observable, interfaceC1510DX, enumC38707bi3);
    }

    public static /* synthetic */ AbstractC24507p trackLegacyBleOp$default(AbstractC24507p abstractC24507p, InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC38707bi3 = EnumC38707bi3.CONNECT;
        }
        return m83469k(abstractC24507p, interfaceC1510DX, enumC38707bi3);
    }

    public static /* synthetic */ AbstractC23461c trackLegacyBleOp$default(AbstractC23461c abstractC23461c, InterfaceC1510DX interfaceC1510DX, EnumC38707bi3 enumC38707bi3, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC38707bi3 = EnumC38707bi3.CONNECT;
        }
        return m83470j(abstractC23461c, interfaceC1510DX, enumC38707bi3);
    }
}
