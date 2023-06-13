package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b!\u0010\"R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LuX3;", "LqX3;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "h", "(Lkotlin/jvm/functions/Function1;)V", "onTouchEvent", "LHI4;", "value", "c", "LHI4;", "getRequestDisallowInterceptTouchEvent", "()LHI4;", "j", "(LHI4;)V", "requestDisallowInterceptTouchEvent", DateTokenConverter.CONVERTER_KEY, "Z", C17296a.f69688o, "()Z", "g", "(Z)V", "disallowIntercept", "LpX3;", "e", "LpX3;", "P0", "()LpX3;", "pointerInputFilter", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49883uX3 implements InterfaceC47512qX3 {

    /* renamed from: b */
    public Function1<? super MotionEvent, Boolean> f112579b;

    /* renamed from: c */
    public HI4 f112580c;

    /* renamed from: d */
    public boolean f112581d;

    /* renamed from: e */
    public final AbstractC46919pX3 f112582e = new C29246b();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LuX3$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uX3$a */
    /* loaded from: classes.dex */
    public enum EnumC29245a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @Metadata(m28433d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"uX3$b", "LpX3;", "LYW3;", "pointerEvent", "LaX3;", "pass", "LG52;", "bounds", "", "e1", "(LYW3;LaX3;J)V", "d1", "i1", "h1", "LuX3$a;", "c", "LuX3$a;", TransferTable.COLUMN_STATE, "", "c1", "()Z", "shareWithSiblings", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n86#2,2:360\n33#2,6:362\n88#2:368\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,6:378\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:351,2\n223#1:353,6\n223#1:359\n238#1:360,2\n238#1:362,6\n238#1:368\n280#1:369,2\n280#1:371,6\n280#1:377\n314#1:378,6\n*E\n"})
    /* renamed from: uX3$b */
    /* loaded from: classes.dex */
    public static final class C29246b extends AbstractC46919pX3 {

        /* renamed from: c */
        public EnumC29245a f112587c = EnumC29245a.Unknown;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", C17296a.f69688o, "(Landroid/view/MotionEvent;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: uX3$b$a */
        /* loaded from: classes.dex */
        public static final class C29247a extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49883uX3 f112589g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29247a(C49883uX3 c49883uX3) {
                super(1);
                this.f112589g = c49883uX3;
            }

            /* renamed from: a */
            public final void m10101a(MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                this.f112589g.m10110b().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                m10101a(motionEvent);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", C17296a.f69688o, "(Landroid/view/MotionEvent;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: uX3$b$b */
        /* loaded from: classes.dex */
        public static final class C29248b extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C49883uX3 f112591h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29248b(C49883uX3 c49883uX3) {
                super(1);
                this.f112591h = c49883uX3;
            }

            /* renamed from: a */
            public final void m10100a(MotionEvent motionEvent) {
                EnumC29245a enumC29245a;
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() == 0) {
                    C29246b c29246b = C29246b.this;
                    if (this.f112591h.m10110b().invoke(motionEvent).booleanValue()) {
                        enumC29245a = EnumC29245a.Dispatching;
                    } else {
                        enumC29245a = EnumC29245a.NotDispatching;
                    }
                    c29246b.f112587c = enumC29245a;
                    return;
                }
                this.f112591h.m10110b().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                m10100a(motionEvent);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", C17296a.f69688o, "(Landroid/view/MotionEvent;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: uX3$b$c */
        /* loaded from: classes.dex */
        public static final class C29249c extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49883uX3 f112592g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29249c(C49883uX3 c49883uX3) {
                super(1);
                this.f112592g = c49883uX3;
            }

            /* renamed from: a */
            public final void m10099a(MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                this.f112592g.m10110b().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                m10099a(motionEvent);
                return Unit.INSTANCE;
            }
        }

        public C29246b() {
        }

        @Override // p000.AbstractC46919pX3
        /* renamed from: c1 */
        public boolean mo10105c1() {
            return true;
        }

        @Override // p000.AbstractC46919pX3
        /* renamed from: d1 */
        public void mo3427d1() {
            if (this.f112587c == EnumC29245a.Dispatching) {
                C51068wX3.m6700a(SystemClock.uptimeMillis(), new C29249c(C49883uX3.this));
                m10102i1();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // p000.AbstractC46919pX3
        /* renamed from: e1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo3426e1(YW3 pointerEvent, EnumC38007aX3 pass, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
            Intrinsics.checkNotNullParameter(pass, "pass");
            List<C43361jX3> m74945c = pointerEvent.m74945c();
            boolean z4 = false;
            if (!C49883uX3.this.m10111a()) {
                int size = m74945c.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        C43361jX3 c43361jX3 = m74945c.get(i);
                        if (!ZW3.m72997b(c43361jX3) && !ZW3.m72995d(c43361jX3)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            z2 = true;
                            break;
                        }
                        i++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    z = false;
                    if (this.f112587c != EnumC29245a.NotDispatching) {
                        if (pass == EnumC38007aX3.Initial && z) {
                            m10103h1(pointerEvent);
                        }
                        if (pass == EnumC38007aX3.Final && !z) {
                            m10103h1(pointerEvent);
                        }
                    }
                    if (pass != EnumC38007aX3.Final) {
                        int size2 = m74945c.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                if (!ZW3.m72995d(m74945c.get(i2))) {
                                    break;
                                }
                                i2++;
                            } else {
                                z4 = true;
                                break;
                            }
                        }
                        if (z4) {
                            m10102i1();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (this.f112587c != EnumC29245a.NotDispatching) {
            }
            if (pass != EnumC38007aX3.Final) {
            }
        }

        /* renamed from: h1 */
        public final void m10103h1(YW3 yw3) {
            boolean z;
            List<C43361jX3> m74945c = yw3.m74945c();
            int size = m74945c.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (m74945c.get(i).m30351n()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (this.f112587c == EnumC29245a.Dispatching) {
                    InterfaceC45879nm2 m19133b1 = m19133b1();
                    if (m19133b1 != null) {
                        C51068wX3.m6699b(yw3, m19133b1.mo23181y(C32120Ce3.f4427b.m111932c()), new C29247a(C49883uX3.this));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.f112587c = EnumC29245a.NotDispatching;
                return;
            }
            InterfaceC45879nm2 m19133b12 = m19133b1();
            if (m19133b12 != null) {
                C51068wX3.m6698c(yw3, m19133b12.mo23181y(C32120Ce3.f4427b.m111932c()), new C29248b(C49883uX3.this));
                if (this.f112587c == EnumC29245a.Dispatching) {
                    int size2 = m74945c.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        m74945c.get(i2).m30364a();
                    }
                    C49042t62 m74944d = yw3.m74944d();
                    if (m74944d != null) {
                        m74944d.m13073e(!C49883uX3.this.m10111a());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        /* renamed from: i1 */
        public final void m10102i1() {
            this.f112587c = EnumC29245a.Unknown;
            C49883uX3.this.m10109g(false);
        }
    }

    @Override // p000.InterfaceC47512qX3
    /* renamed from: P0 */
    public AbstractC46919pX3 mo3429P0() {
        return this.f112582e;
    }

    /* renamed from: a */
    public final boolean m10111a() {
        return this.f112581d;
    }

    /* renamed from: b */
    public final Function1<MotionEvent, Boolean> m10110b() {
        Function1 function1 = this.f112579b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    /* renamed from: g */
    public final void m10109g(boolean z) {
        this.f112581d = z;
    }

    /* renamed from: h */
    public final void m10108h(Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f112579b = function1;
    }

    /* renamed from: j */
    public final void m10107j(HI4 hi4) {
        HI4 hi42 = this.f112580c;
        if (hi42 != null) {
            hi42.m104039b(null);
        }
        this.f112580c = hi4;
        if (hi4 != null) {
            hi4.m104039b(this);
        }
    }
}
