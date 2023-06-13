package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.OperatorScanIntent;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.persistence.Bird;
import co.bird.api.response.OpsBatchJobActionKind;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.V60;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B9\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b'\u0010(J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LV60;", "", "", "sessionId", "tripStopId", "Lco/bird/android/model/OperatorScanIntent;", "scanIntent", "", "i", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "h", "Lom3;", C17296a.f69688o, "Lom3;", "operatorManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LY60;", DateTokenConverter.CONVERTER_KEY, "LY60;", "ui", "Le13;", "e", "Le13;", "navigator", "LN60;", "f", "LN60;", "converter", "<init>", "(Lom3;LTq4;Lcom/uber/autodispose/ScopeProvider;LY60;Le13;LN60;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkUpdatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkUpdatePresenter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdatePresenter\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,108:1\n41#2,2:109\n180#3:111\n180#3:112\n180#3:113\n*S KotlinDebug\n*F\n+ 1 BulkUpdatePresenter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdatePresenter\n*L\n39#1:109,2\n48#1:111\n57#1:112\n70#1:113\n*E\n"})
/* renamed from: V60 */
/* loaded from: classes3.dex */
public final class V60 {

    /* renamed from: a */
    public final InterfaceC46473om3 f38620a;

    /* renamed from: b */
    public final C36207Tq4 f38621b;

    /* renamed from: c */
    public final ScopeProvider f38622c;

    /* renamed from: d */
    public final Y60 f38623d;

    /* renamed from: e */
    public final InterfaceC40099e13 f38624e;

    /* renamed from: f */
    public final N60 f38625f;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LV60$a;", "", "", "markFixed", "wakeBluetooth", "chirp", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "c", "()Z", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "(ZZZ)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: V60$a */
    /* loaded from: classes3.dex */
    public static final class C8547a {

        /* renamed from: d */
        public static final C8548a f38626d = new C8548a(null);

        /* renamed from: a */
        public final boolean f38627a;

        /* renamed from: b */
        public final boolean f38628b;

        /* renamed from: c */
        public final boolean f38629c;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, m28432d2 = {"LV60$a$a;", "", "", "markFixed", "wakeBluetooth", "chirp", "LV60$a;", C17296a.f69688o, "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: V60$a$a */
        /* loaded from: classes3.dex */
        public static final class C8548a {
            public /* synthetic */ C8548a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C8547a m80400a(boolean z, boolean z2, boolean z3) {
                return new C8547a(z, z2, z3);
            }

            private C8548a() {
            }
        }

        public C8547a(boolean z, boolean z2, boolean z3) {
            this.f38627a = z;
            this.f38628b = z2;
            this.f38629c = z3;
        }

        public static /* synthetic */ C8547a copy$default(C8547a c8547a, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c8547a.f38627a;
            }
            if ((i & 2) != 0) {
                z2 = c8547a.f38628b;
            }
            if ((i & 4) != 0) {
                z3 = c8547a.f38629c;
            }
            return c8547a.m80404a(z, z2, z3);
        }

        /* renamed from: a */
        public final C8547a m80404a(boolean z, boolean z2, boolean z3) {
            return new C8547a(z, z2, z3);
        }

        /* renamed from: b */
        public final boolean m80403b() {
            return this.f38629c;
        }

        /* renamed from: c */
        public final boolean m80402c() {
            return this.f38627a;
        }

        /* renamed from: d */
        public final boolean m80401d() {
            return this.f38628b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8547a) {
                C8547a c8547a = (C8547a) obj;
                return this.f38627a == c8547a.f38627a && this.f38628b == c8547a.f38628b && this.f38629c == c8547a.f38629c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z = this.f38627a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.f38628b;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            boolean z2 = this.f38629c;
            return i3 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f38627a;
            boolean z2 = this.f38628b;
            boolean z3 = this.f38629c;
            return "BulkUpdateMenuConfig(markFixed=" + z + ", wakeBluetooth=" + z2 + ", chirp=" + z3 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 BulkUpdatePresenter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdatePresenter\n*L\n1#1,304:1\n43#2:305\n*E\n"})
    /* renamed from: V60$b */
    /* loaded from: classes3.dex */
    public static final class C8549b<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {

        /* renamed from: a */
        public final /* synthetic */ C8547a.C8548a f38630a;

        public C8549b(C8547a.C8548a c8548a) {
            this.f38630a = c8548a;
        }

        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(T1 t1, T2 t2, T3 t3) {
            boolean booleanValue = ((Boolean) t3).booleanValue();
            boolean booleanValue2 = ((Boolean) t2).booleanValue();
            return (R) this.f38630a.m80400a(((Boolean) t1).booleanValue(), booleanValue2, booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LV60$a;", "Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V60$c */
    /* loaded from: classes3.dex */
    public static final class C8550c extends Lambda implements Function1<Pair<? extends C8547a, ? extends OpsBatchJobActionKind>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C8550c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<C8547a, ? extends OpsBatchJobActionKind> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return V60.this.f38625f.m94377b(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V60$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8551d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C8551d(Object obj) {
            super(1, obj, Y60.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Y60) this.receiver).m75738b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V60$e */
    /* loaded from: classes3.dex */
    public static final class C8552e extends Lambda implements Function1<Throwable, Unit> {
        public C8552e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            V60.this.f38623d.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/OpsBatchJobActionKind;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V60$f */
    /* loaded from: classes3.dex */
    public static final class C8553f extends Lambda implements Function1<OpsBatchJobActionKind, Unit> {
        public C8553f() {
            super(1);
        }

        /* renamed from: a */
        public final void m80398a(OpsBatchJobActionKind opsBatchJobActionKind) {
            V60.this.f38623d.m75739Ql(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OpsBatchJobActionKind opsBatchJobActionKind) {
            m80398a(opsBatchJobActionKind);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b \u0003*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: V60$g */
    /* loaded from: classes3.dex */
    public static final class C8554g extends Lambda implements Function1<Triple<? extends Unit, ? extends OpsBatchJobActionKind, ? extends List<? extends Bird>>, InterfaceC23447K<? extends Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: V60$g$a */
        /* loaded from: classes3.dex */
        public static final class C8555a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind>> {

            /* renamed from: g */
            public final /* synthetic */ OpsBatchJobActionKind f38635g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8555a(OpsBatchJobActionKind opsBatchJobActionKind) {
                super(1);
                this.f38635g = opsBatchJobActionKind;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, OpsBatchJobActionKind> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(response, this.f38635g);
            }
        }

        public C8554g() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<DialogResponse, OpsBatchJobActionKind>> invoke(Triple<Unit, ? extends OpsBatchJobActionKind, ? extends List<Bird>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            OpsBatchJobActionKind lastAction = triple.component2();
            Y60 y60 = V60.this.f38623d;
            int size = triple.component3().size();
            Intrinsics.checkNotNullExpressionValue(lastAction, "lastAction");
            AbstractC23442F dialog$default = H31.C3014a.dialog$default(y60, new L60(size, lastAction), false, false, 6, null);
            final C8555a c8555a = new C8555a(lastAction);
            return dialog$default.m33157I(new InterfaceC23492o() { // from class: W60
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = V60.C8554g.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V60$h */
    /* loaded from: classes3.dex */
    public static final class C8556h extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind>, Boolean> {

        /* renamed from: g */
        public static final C8556h f38636g = new C8556h();

        public C8556h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1() == DialogResponse.OK);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/api/response/OpsBatchJobActionKind;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: V60$i */
    /* loaded from: classes3.dex */
    public static final class C8557i extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f38638h;

        /* renamed from: i */
        public final /* synthetic */ String f38639i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8557i(String str, String str2) {
            super(1);
            this.f38638h = str;
            this.f38639i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends DialogResponse, ? extends OpsBatchJobActionKind> pair) {
            OpsBatchJobActionKind lastAction = pair.component2();
            InterfaceC40099e13 interfaceC40099e13 = V60.this.f38624e;
            BulkScanPurpose bulkScanPurpose = BulkScanPurpose.MAP;
            Intrinsics.checkNotNullExpressionValue(lastAction, "lastAction");
            interfaceC40099e13.mo37195B2(bulkScanPurpose, lastAction, EnumC52120yI4.BULK_STATUS_REPORT.ordinal(), this.f38638h, this.f38639i);
        }
    }

    public V60(InterfaceC46473om3 operatorManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, Y60 ui, InterfaceC40099e13 navigator, N60 converter) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f38620a = operatorManager;
        this.f38621b = reactiveConfig;
        this.f38622c = scopeProvider;
        this.f38623d = ui;
        this.f38624e = navigator;
        this.f38625f = converter;
    }

    /* renamed from: j */
    public static final InterfaceC23447K m80411j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m80410k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m80409l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m80408m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23447K m80407n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final boolean m80406o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p */
    public static final void m80405p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final void m80413h(int i, int i2, Intent intent) {
        if (i == EnumC52120yI4.BULK_STATUS_REPORT.ordinal() && i2 == -1) {
            this.f38624e.mo37050b1(-1);
        }
    }

    /* renamed from: i */
    public final void m80412i(String sessionId, String str, OperatorScanIntent scanIntent) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIntent, "scanIntent");
        this.f38623d.m75739Ql(false);
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f38621b.m82692Z4(), this.f38621b.m82670b5(), this.f38621b.m82752T4(), new C8549b(C8547a.f38626d));
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable m31950a = C24527f.m31950a(combineLatest, this.f38623d.m75740Pl());
        final C8550c c8550c = new C8550c();
        Observable observeOn = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: O60
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m80411j;
                m80411j = V60.m80411j(Function1.this, obj);
                return m80411j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onCreate(sessionId: …pId\n        )\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f38622c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8551d c8551d = new C8551d(this.f38623d);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: P60
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                V60.m80410k(Function1.this, obj);
            }
        };
        final C8552e c8552e = new C8552e();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Q60
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                V60.m80409l(Function1.this, obj);
            }
        });
        Observable<OpsBatchJobActionKind> observeOn2 = this.f38623d.m75740Pl().skip(1L).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.actionClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f38622c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8553f c8553f = new C8553f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: R60
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                V60.m80408m(Function1.this, obj);
            }
        });
        Observable m31949b = C24527f.m31949b(this.f38623d.m75737m0(), this.f38623d.m75740Pl(), this.f38620a.mo8093l1(BulkScanPurpose.MAP));
        final C8554g c8554g = new C8554g();
        Observable flatMapSingle = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: S60
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m80407n;
                m80407n = V60.m80407n(Function1.this, obj);
                return m80407n;
            }
        });
        final C8556h c8556h = C8556h.f38636g;
        Observable filter = flatMapSingle.filter(new InterfaceC23494q() { // from class: T60
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m80406o;
                m80406o = V60.m80406o(Function1.this, obj);
                return m80406o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "fun onCreate(sessionId: …pId\n        )\n      }\n  }");
        Object m33094as3 = filter.m33094as(AutoDispose.m45239a(this.f38622c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8557i c8557i = new C8557i(sessionId, str);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: U60
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                V60.m80405p(Function1.this, obj);
            }
        });
    }
}
