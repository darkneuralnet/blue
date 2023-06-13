package p000;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.github.sceneview.node.Node;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C35605Rb5;
import p000.C38719bj5;
import p000.C43944kW2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002\r\u0013B=\u0012\u0006\u0010 \u001a\u00020\u001f\u0012$\u0010%\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020$0!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, m28432d2 = {"LiC1;", "Landroid/view/GestureDetector;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "LkW2;", C17296a.f69688o, "LkW2;", "getMoveGestureDetector", "()LkW2;", "moveGestureDetector", "LRb5;", "b", "LRb5;", "getRotateGestureDetector", "()LRb5;", "rotateGestureDetector", "Lbj5;", "c", "Lbj5;", "getScaleGestureDetector", "()Lbj5;", "scaleGestureDetector", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MotionEvent;", "getLastTouchEvent", "()Landroid/view/MotionEvent;", "setLastTouchEvent", "(Landroid/view/MotionEvent;)V", "lastTouchEvent", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlin/Function1;", "LP83;", "", "pickNode", "LiC1$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;LiC1$b;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: iC1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42577iC1 extends GestureDetector {

    /* renamed from: a */
    public final C43944kW2 f86866a;

    /* renamed from: b */
    public final C35605Rb5 f86867b;

    /* renamed from: c */
    public final C38719bj5 f86868c;

    /* renamed from: d */
    public MotionEvent f86869d;

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, m28432d2 = {"iC1$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDown", "", "onShowPress", "onSingleTapUp", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "onLongPress", "velocityX", "velocityY", "onFling", "onSingleTapConfirmed", "onDoubleTap", "onDoubleTapEvent", "onContextClick", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$a */
    /* loaded from: classes6.dex */
    public static final class C23135a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86870b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23148b f86871c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$a */
        /* loaded from: classes6.dex */
        public static final class C23136a extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86872g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23136a(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86872g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34369a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33205p(ne);
                }
                this.f86872g.mo33205p(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34369a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$b */
        /* loaded from: classes6.dex */
        public static final class C23137b extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86873g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23137b(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86873g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34368a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33189z(ne);
                }
                this.f86873g.mo33189z(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34368a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$c */
        /* loaded from: classes6.dex */
        public static final class C23138c extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86874g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23138c(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86874g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34367a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33263C(ne);
                }
                this.f86874g.mo33263C(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34367a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$d */
        /* loaded from: classes6.dex */
        public static final class C23139d extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86875g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23139d(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86875g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34366a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33192x(ne);
                }
                this.f86875g.mo33192x(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34366a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne1", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$e */
        /* loaded from: classes6.dex */
        public static final class C23140e extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86876g;

            /* renamed from: h */
            public final /* synthetic */ MotionEvent f86877h;

            /* renamed from: i */
            public final /* synthetic */ float f86878i;

            /* renamed from: j */
            public final /* synthetic */ float f86879j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC23148b f86880k;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne2", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
            /* renamed from: iC1$a$e$a */
            /* loaded from: classes6.dex */
            public static final class C23141a extends Lambda implements Function1<P83, Unit> {

                /* renamed from: g */
                public final /* synthetic */ P83 f86881g;

                /* renamed from: h */
                public final /* synthetic */ float f86882h;

                /* renamed from: i */
                public final /* synthetic */ float f86883i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC23148b f86884j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23141a(P83 p83, float f, float f2, InterfaceC23148b interfaceC23148b) {
                    super(1);
                    this.f86881g = p83;
                    this.f86882h = f;
                    this.f86883i = f2;
                    this.f86884j = interfaceC23148b;
                }

                /* renamed from: a */
                public final void m34364a(P83 ne2) {
                    Intrinsics.checkNotNullParameter(ne2, "ne2");
                    Node m90710b = this.f86881g.m90710b();
                    if (m90710b != null) {
                        m90710b.mo33223e(this.f86881g, ne2, this.f86882h, this.f86883i);
                    }
                    this.f86884j.mo33223e(this.f86881g, ne2, this.f86882h, this.f86883i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                    m34364a(p83);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C23140e(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, MotionEvent motionEvent, float f, float f2, InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86876g = function2;
                this.f86877h = motionEvent;
                this.f86878i = f;
                this.f86879j = f2;
                this.f86880k = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34365a(P83 ne1) {
                Intrinsics.checkNotNullParameter(ne1, "ne1");
                this.f86876g.invoke(this.f86877h, new C23141a(ne1, this.f86878i, this.f86879j, this.f86880k));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34365a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: iC1$a$f */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C23142f extends FunctionReferenceImpl implements Function1<P83, Unit> {
            public C23142f(Object obj) {
                super(1, obj, InterfaceC23148b.class, "onLongPress", "onLongPress(Lio/github/sceneview/gesture/NodeMotionEvent;)V", 0);
            }

            /* renamed from: a */
            public final void m34363a(P83 p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC23148b) this.receiver).mo33254H(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34363a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne1", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$g */
        /* loaded from: classes6.dex */
        public static final class C23143g extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86885g;

            /* renamed from: h */
            public final /* synthetic */ MotionEvent f86886h;

            /* renamed from: i */
            public final /* synthetic */ float f86887i;

            /* renamed from: j */
            public final /* synthetic */ float f86888j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC23148b f86889k;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne2", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
            /* renamed from: iC1$a$g$a */
            /* loaded from: classes6.dex */
            public static final class C23144a extends Lambda implements Function1<P83, Unit> {

                /* renamed from: g */
                public final /* synthetic */ P83 f86890g;

                /* renamed from: h */
                public final /* synthetic */ float f86891h;

                /* renamed from: i */
                public final /* synthetic */ float f86892i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC23148b f86893j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23144a(P83 p83, float f, float f2, InterfaceC23148b interfaceC23148b) {
                    super(1);
                    this.f86890g = p83;
                    this.f86891h = f;
                    this.f86892i = f2;
                    this.f86893j = interfaceC23148b;
                }

                /* renamed from: a */
                public final void m34361a(P83 ne2) {
                    Intrinsics.checkNotNullParameter(ne2, "ne2");
                    Node m90710b = this.f86890g.m90710b();
                    if (m90710b != null) {
                        m90710b.mo33228b(this.f86890g, ne2, this.f86891h, this.f86892i);
                    }
                    this.f86893j.mo33228b(this.f86890g, ne2, this.f86891h, this.f86892i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                    m34361a(p83);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C23143g(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, MotionEvent motionEvent, float f, float f2, InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86885g = function2;
                this.f86886h = motionEvent;
                this.f86887i = f;
                this.f86888j = f2;
                this.f86889k = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34362a(P83 ne1) {
                Intrinsics.checkNotNullParameter(ne1, "ne1");
                this.f86885g.invoke(this.f86886h, new C23144a(ne1, this.f86887i, this.f86888j, this.f86889k));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34362a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$h */
        /* loaded from: classes6.dex */
        public static final class C23145h extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86894g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23145h(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86894g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34360a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33256G(ne);
                }
                this.f86894g.mo33256G(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34360a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$i */
        /* loaded from: classes6.dex */
        public static final class C23146i extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86895g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23146i(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86895g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34359a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33203q(ne);
                }
                this.f86895g.mo33203q(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34359a(p83);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$a$j */
        /* loaded from: classes6.dex */
        public static final class C23147j extends Lambda implements Function1<P83, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23148b f86896g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23147j(InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86896g = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34358a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33230a(ne);
                }
                this.f86896g.mo33230a(ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34358a(p83);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C23135a(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, InterfaceC23148b interfaceC23148b) {
            this.f86870b = function2;
            this.f86871c = interfaceC23148b;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
        public boolean onContextClick(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onDoubleTapEvent = super.onDoubleTapEvent(e);
            this.f86870b.invoke(e, new C23136a(this.f86871c));
            return onDoubleTapEvent;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onDoubleTap = super.onDoubleTap(e);
            this.f86870b.invoke(e, new C23137b(this.f86871c));
            return onDoubleTap;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onDoubleTapEvent = super.onDoubleTapEvent(e);
            this.f86870b.invoke(e, new C23138c(this.f86871c));
            return onDoubleTapEvent;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onDown = super.onDown(e);
            this.f86870b.invoke(e, new C23139d(this.f86871c));
            return onDown;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            boolean onFling = super.onFling(e1, e2, f, f2);
            Function2<MotionEvent, Function1<? super P83, Unit>, Unit> function2 = this.f86870b;
            function2.invoke(e1, new C23140e(function2, e2, f, f2, this.f86871c));
            return onFling;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.f86870b.invoke(e, new C23142f(this.f86871c));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            boolean onScroll = super.onScroll(e1, e2, f, f2);
            Function2<MotionEvent, Function1<? super P83, Unit>, Unit> function2 = this.f86870b;
            function2.invoke(e1, new C23143g(function2, e2, f, f2, this.f86871c));
            return onScroll;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.f86870b.invoke(e, new C23145h(this.f86871c));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onSingleTapConfirmed = super.onSingleTapConfirmed(e);
            this.f86870b.invoke(e, new C23146i(this.f86871c));
            return onSingleTapConfirmed;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            boolean onSingleTapUp = super.onSingleTapUp(e);
            this.f86870b.invoke(e, new C23147j(this.f86871c));
            return onSingleTapUp;
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\""}, m28432d2 = {"LiC1$b;", "", "LP83;", "e", "", "x", "G", C17296a.f69688o, "e1", "e2", "", "distanceX", "distanceY", "b", "H", "velocityX", "velocityY", "q", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "p", "LkW2;", "detector", "n", "D", "o", "LRb5;", "B", "j", "w", "Lbj5;", "l", "u", "k", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC23148b {
        /* renamed from: B */
        void mo33265B(C35605Rb5 c35605Rb5, P83 p83);

        /* renamed from: C */
        void mo33263C(P83 p83);

        /* renamed from: D */
        void mo33261D(C43944kW2 c43944kW2, P83 p83);

        /* renamed from: G */
        void mo33256G(P83 p83);

        /* renamed from: H */
        void mo33254H(P83 p83);

        /* renamed from: a */
        void mo33230a(P83 p83);

        /* renamed from: b */
        void mo33228b(P83 p83, P83 p832, float f, float f2);

        /* renamed from: e */
        void mo33223e(P83 p83, P83 p832, float f, float f2);

        /* renamed from: j */
        void mo33216j(C35605Rb5 c35605Rb5, P83 p83);

        /* renamed from: k */
        void mo33214k(C38719bj5 c38719bj5, P83 p83);

        /* renamed from: l */
        void mo33212l(C38719bj5 c38719bj5, P83 p83);

        /* renamed from: n */
        void mo33209n(C43944kW2 c43944kW2, P83 p83);

        /* renamed from: o */
        void mo33207o(C43944kW2 c43944kW2, P83 p83);

        /* renamed from: p */
        void mo33205p(P83 p83);

        /* renamed from: q */
        void mo33203q(P83 p83);

        /* renamed from: u */
        void mo33198u(C38719bj5 c38719bj5, P83 p83);

        /* renamed from: w */
        void mo33194w(C35605Rb5 c35605Rb5, P83 p83);

        /* renamed from: x */
        void mo33192x(P83 p83);

        /* renamed from: z */
        void mo33189z(P83 p83);
    }

    @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016RC\u0010+\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*RC\u0010/\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*RC\u00103\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u0082\u0001\u00107\u001ab\u0012^\u0012\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004040\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*RC\u0010;\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u0082\u0001\u0010?\u001ab\u0012^\u0012\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0004040\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*RC\u0010C\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*RC\u0010G\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010&\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*RC\u0010J\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010&\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*RC\u0010M\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*RX\u0010Q\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*RX\u0010U\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010&\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*RX\u0010X\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*RX\u0010[\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\bY\u0010(\"\u0004\bZ\u0010*RX\u0010^\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b\\\u0010(\"\u0004\b]\u0010*RX\u0010a\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b_\u0010(\"\u0004\b`\u0010*RX\u0010e\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010&\u001a\u0004\bc\u0010(\"\u0004\bd\u0010*RX\u0010i\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010&\u001a\u0004\bg\u0010(\"\u0004\bh\u0010*RX\u0010m\u001a8\u00124\u00122\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040N0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010&\u001a\u0004\bk\u0010(\"\u0004\bl\u0010*¨\u0006p"}, m28432d2 = {"LiC1$c;", "LiC1$b;", "LP83;", "e", "", "x", "G", C17296a.f69688o, "e1", "e2", "", "distanceX", "distanceY", "b", "H", "velocityX", "velocityY", "q", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "p", "LkW2;", "detector", "n", "D", "o", "LRb5;", "B", "j", "w", "Lbj5;", "l", "u", "k", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Ljava/util/List;", "getOnDown", "()Ljava/util/List;", "setOnDown", "(Ljava/util/List;)V", "onDown", "c", "getOnShowPress", "setOnShowPress", "onShowPress", DateTokenConverter.CONVERTER_KEY, "getOnSingleTapUp", "setOnSingleTapUp", "onSingleTapUp", "Lkotlin/Function4;", "getOnScroll", "setOnScroll", "onScroll", "f", "getOnLongPress", "setOnLongPress", "onLongPress", "g", "getOnFling", "setOnFling", "onFling", "h", "getOnSingleTapConfirmed", "setOnSingleTapConfirmed", "onSingleTapConfirmed", "i", "getOnDoubleTap", "setOnDoubleTap", "onDoubleTap", "getOnDoubleTapEvent", "setOnDoubleTapEvent", "onDoubleTapEvent", "getOnContextClick", "setOnContextClick", "onContextClick", "Lkotlin/Function2;", "getOnMove", "setOnMove", "onMove", "m", "getOnMoveBegin", "setOnMoveBegin", "onMoveBegin", "getOnMoveEnd", "setOnMoveEnd", "onMoveEnd", "getOnRotate", "setOnRotate", "onRotate", "getOnRotateBegin", "setOnRotateBegin", "onRotateBegin", "getOnRotateEnd", "setOnRotateEnd", "onRotateEnd", "r", "getOnScale", "setOnScale", "onScale", "s", "getOnScaleBegin", "setOnScaleBegin", "onScaleBegin", "t", "getOnScaleEnd", "setOnScaleEnd", "onScaleEnd", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$c */
    /* loaded from: classes6.dex */
    public static final class C23149c implements InterfaceC23148b {

        /* renamed from: b */
        public List<? extends Function1<? super P83, Unit>> f86897b;

        /* renamed from: c */
        public List<? extends Function1<? super P83, Unit>> f86898c;

        /* renamed from: d */
        public List<? extends Function1<? super P83, Unit>> f86899d;

        /* renamed from: e */
        public List<? extends Function4<? super P83, ? super P83, ? super Float, ? super Float, Unit>> f86900e;

        /* renamed from: f */
        public List<? extends Function1<? super P83, Unit>> f86901f;

        /* renamed from: g */
        public List<? extends Function4<? super P83, ? super P83, ? super Float, ? super Float, Unit>> f86902g;

        /* renamed from: h */
        public List<? extends Function1<? super P83, Unit>> f86903h;

        /* renamed from: i */
        public List<? extends Function1<? super P83, Unit>> f86904i;

        /* renamed from: j */
        public List<? extends Function1<? super P83, Unit>> f86905j;

        /* renamed from: k */
        public List<? extends Function1<? super P83, Unit>> f86906k;

        /* renamed from: l */
        public List<? extends Function2<? super C43944kW2, ? super P83, Unit>> f86907l;

        /* renamed from: m */
        public List<? extends Function2<? super C43944kW2, ? super P83, Unit>> f86908m;

        /* renamed from: n */
        public List<? extends Function2<? super C43944kW2, ? super P83, Unit>> f86909n;

        /* renamed from: o */
        public List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> f86910o;

        /* renamed from: p */
        public List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> f86911p;

        /* renamed from: q */
        public List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> f86912q;

        /* renamed from: r */
        public List<? extends Function2<? super C38719bj5, ? super P83, Unit>> f86913r;

        /* renamed from: s */
        public List<? extends Function2<? super C38719bj5, ? super P83, Unit>> f86914s;

        /* renamed from: t */
        public List<? extends Function2<? super C38719bj5, ? super P83, Unit>> f86915t;

        public C23149c() {
            List<? extends Function1<? super P83, Unit>> emptyList;
            List<? extends Function1<? super P83, Unit>> emptyList2;
            List<? extends Function1<? super P83, Unit>> emptyList3;
            List<? extends Function4<? super P83, ? super P83, ? super Float, ? super Float, Unit>> emptyList4;
            List<? extends Function1<? super P83, Unit>> emptyList5;
            List<? extends Function4<? super P83, ? super P83, ? super Float, ? super Float, Unit>> emptyList6;
            List<? extends Function1<? super P83, Unit>> emptyList7;
            List<? extends Function1<? super P83, Unit>> emptyList8;
            List<? extends Function1<? super P83, Unit>> emptyList9;
            List<? extends Function1<? super P83, Unit>> emptyList10;
            List<? extends Function2<? super C43944kW2, ? super P83, Unit>> emptyList11;
            List<? extends Function2<? super C43944kW2, ? super P83, Unit>> emptyList12;
            List<? extends Function2<? super C43944kW2, ? super P83, Unit>> emptyList13;
            List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> emptyList14;
            List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> emptyList15;
            List<? extends Function2<? super C35605Rb5, ? super P83, Unit>> emptyList16;
            List<? extends Function2<? super C38719bj5, ? super P83, Unit>> emptyList17;
            List<? extends Function2<? super C38719bj5, ? super P83, Unit>> emptyList18;
            List<? extends Function2<? super C38719bj5, ? super P83, Unit>> emptyList19;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.f86897b = emptyList;
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            this.f86898c = emptyList2;
            emptyList3 = CollectionsKt__CollectionsKt.emptyList();
            this.f86899d = emptyList3;
            emptyList4 = CollectionsKt__CollectionsKt.emptyList();
            this.f86900e = emptyList4;
            emptyList5 = CollectionsKt__CollectionsKt.emptyList();
            this.f86901f = emptyList5;
            emptyList6 = CollectionsKt__CollectionsKt.emptyList();
            this.f86902g = emptyList6;
            emptyList7 = CollectionsKt__CollectionsKt.emptyList();
            this.f86903h = emptyList7;
            emptyList8 = CollectionsKt__CollectionsKt.emptyList();
            this.f86904i = emptyList8;
            emptyList9 = CollectionsKt__CollectionsKt.emptyList();
            this.f86905j = emptyList9;
            emptyList10 = CollectionsKt__CollectionsKt.emptyList();
            this.f86906k = emptyList10;
            emptyList11 = CollectionsKt__CollectionsKt.emptyList();
            this.f86907l = emptyList11;
            emptyList12 = CollectionsKt__CollectionsKt.emptyList();
            this.f86908m = emptyList12;
            emptyList13 = CollectionsKt__CollectionsKt.emptyList();
            this.f86909n = emptyList13;
            emptyList14 = CollectionsKt__CollectionsKt.emptyList();
            this.f86910o = emptyList14;
            emptyList15 = CollectionsKt__CollectionsKt.emptyList();
            this.f86911p = emptyList15;
            emptyList16 = CollectionsKt__CollectionsKt.emptyList();
            this.f86912q = emptyList16;
            emptyList17 = CollectionsKt__CollectionsKt.emptyList();
            this.f86913r = emptyList17;
            emptyList18 = CollectionsKt__CollectionsKt.emptyList();
            this.f86914s = emptyList18;
            emptyList19 = CollectionsKt__CollectionsKt.emptyList();
            this.f86915t = emptyList19;
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: B */
        public void mo33265B(C35605Rb5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86911p.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: C */
        public void mo33263C(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86905j.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: D */
        public void mo33261D(C43944kW2 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86907l.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: G */
        public void mo33256G(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86898c.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: H */
        public void mo33254H(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86901f.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: a */
        public void mo33230a(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86899d.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: b */
        public void mo33228b(P83 e1, P83 e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            Iterator<T> it = this.f86900e.iterator();
            while (it.hasNext()) {
                ((Function4) it.next()).invoke(e1, e2, Float.valueOf(f), Float.valueOf(f2));
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: e */
        public void mo33223e(P83 e1, P83 e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            Iterator<T> it = this.f86902g.iterator();
            while (it.hasNext()) {
                ((Function4) it.next()).invoke(e1, e2, Float.valueOf(f), Float.valueOf(f2));
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: j */
        public void mo33216j(C35605Rb5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86910o.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: k */
        public void mo33214k(C38719bj5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86915t.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: l */
        public void mo33212l(C38719bj5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86914s.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: n */
        public void mo33209n(C43944kW2 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86908m.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: o */
        public void mo33207o(C43944kW2 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86909n.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: p */
        public void mo33205p(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86906k.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: q */
        public void mo33203q(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86903h.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: u */
        public void mo33198u(C38719bj5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86913r.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: w */
        public void mo33194w(C35605Rb5 detector, P83 e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86912q.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(detector, e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: x */
        public void mo33192x(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86897b.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }

        @Override // p000.C42577iC1.InterfaceC23148b
        /* renamed from: z */
        public void mo33189z(P83 e) {
            Intrinsics.checkNotNullParameter(e, "e");
            Iterator<T> it = this.f86904i.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"iC1$d", "LkW2$b;", "LkW2;", "detector", "Landroid/view/MotionEvent;", "e", "", "c", C17296a.f69688o, "", "b", "LP83;", "LP83;", "getMoveBeginEvent", "()LP83;", DateTokenConverter.CONVERTER_KEY, "(LP83;)V", "moveBeginEvent", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$d */
    /* loaded from: classes6.dex */
    public static final class C23150d implements C43944kW2.InterfaceC25172b {

        /* renamed from: a */
        public P83 f86916a;

        /* renamed from: b */
        public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86917b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23148b f86918c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$d$a */
        /* loaded from: classes6.dex */
        public static final class C23151a extends Lambda implements Function1<P83, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C43944kW2 f86920h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC23148b f86921i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23151a(C43944kW2 c43944kW2, InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86920h = c43944kW2;
                this.f86921i = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34356a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                C23150d.this.m34357d(ne);
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33209n(this.f86920h, ne);
                }
                this.f86921i.mo33209n(this.f86920h, ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34356a(p83);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C23150d(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, InterfaceC23148b interfaceC23148b) {
            this.f86917b = function2;
            this.f86918c = interfaceC23148b;
        }

        @Override // p000.C43944kW2.InterfaceC25171a
        /* renamed from: a */
        public boolean mo28886a(C43944kW2 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            boolean m28883a = C43944kW2.InterfaceC25172b.C25173a.m28883a(this, detector, e);
            InterfaceC23148b interfaceC23148b = this.f86918c;
            P83 p83 = this.f86916a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33261D(detector, p832);
                }
                interfaceC23148b.mo33261D(detector, p832);
            }
            return m28883a;
        }

        @Override // p000.C43944kW2.InterfaceC25171a
        /* renamed from: b */
        public void mo28885b(C43944kW2 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            P83 p83 = this.f86916a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                InterfaceC23148b interfaceC23148b = this.f86918c;
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33207o(detector, p832);
                }
                interfaceC23148b.mo33207o(detector, p832);
            }
            this.f86916a = null;
        }

        @Override // p000.C43944kW2.InterfaceC25171a
        /* renamed from: c */
        public boolean mo28884c(C43944kW2 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            boolean m28882b = C43944kW2.InterfaceC25172b.C25173a.m28882b(this, detector, e);
            this.f86917b.invoke(e, new C23151a(detector, this.f86918c));
            return m28882b;
        }

        /* renamed from: d */
        public final void m34357d(P83 p83) {
            this.f86916a = p83;
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"iC1$e", "LRb5$c;", "LRb5;", "detector", "Landroid/view/MotionEvent;", "e", "", C17296a.f69688o, "b", "", "c", "LP83;", "LP83;", "getRotateBeginEvent", "()LP83;", DateTokenConverter.CONVERTER_KEY, "(LP83;)V", "rotateBeginEvent", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$e */
    /* loaded from: classes6.dex */
    public static final class C23152e implements C35605Rb5.InterfaceC7215c {

        /* renamed from: a */
        public P83 f86922a;

        /* renamed from: b */
        public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86923b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23148b f86924c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$e$a */
        /* loaded from: classes6.dex */
        public static final class C23153a extends Lambda implements Function1<P83, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C35605Rb5 f86926h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC23148b f86927i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23153a(C35605Rb5 c35605Rb5, InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86926h = c35605Rb5;
                this.f86927i = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34351a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                C23152e.this.m34352d(ne);
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33265B(this.f86926h, ne);
                }
                this.f86927i.mo33265B(this.f86926h, ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34351a(p83);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C23152e(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, InterfaceC23148b interfaceC23148b) {
            this.f86923b = function2;
            this.f86924c = interfaceC23148b;
        }

        @Override // p000.C35605Rb5.InterfaceC7214b
        /* renamed from: a */
        public boolean mo34355a(C35605Rb5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            boolean m86563b = C35605Rb5.InterfaceC7215c.C7216a.m86563b(this, detector, e);
            this.f86923b.invoke(e, new C23153a(detector, this.f86924c));
            return m86563b;
        }

        @Override // p000.C35605Rb5.InterfaceC7214b
        /* renamed from: b */
        public boolean mo34354b(C35605Rb5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            boolean m86564a = C35605Rb5.InterfaceC7215c.C7216a.m86564a(this, detector, e);
            InterfaceC23148b interfaceC23148b = this.f86924c;
            P83 p83 = this.f86922a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33216j(detector, p832);
                }
                interfaceC23148b.mo33216j(detector, p832);
            }
            return m86564a;
        }

        @Override // p000.C35605Rb5.InterfaceC7214b
        /* renamed from: c */
        public void mo34353c(C35605Rb5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            P83 p83 = this.f86922a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                InterfaceC23148b interfaceC23148b = this.f86924c;
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33194w(detector, p832);
                }
                interfaceC23148b.mo33194w(detector, p832);
            }
            this.f86922a = null;
        }

        /* renamed from: d */
        public final void m34352d(P83 p83) {
            this.f86922a = p83;
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"iC1$f", "Lbj5$b;", "Lbj5;", "detector", "Landroid/view/MotionEvent;", "e", "", C17296a.f69688o, "c", "b", "LP83;", "LP83;", "getScaleBeginEvent", "()LP83;", DateTokenConverter.CONVERTER_KEY, "(LP83;)V", "scaleBeginEvent", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: iC1$f */
    /* loaded from: classes6.dex */
    public static final class C23154f implements C38719bj5.InterfaceC12488b {

        /* renamed from: a */
        public P83 f86928a;

        /* renamed from: b */
        public final /* synthetic */ Function2<MotionEvent, Function1<? super P83, Unit>, Unit> f86929b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23148b f86930c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LP83;", "ne", "", C17296a.f69688o, "(LP83;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: iC1$f$a */
        /* loaded from: classes6.dex */
        public static final class C23155a extends Lambda implements Function1<P83, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C38719bj5 f86932h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC23148b f86933i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23155a(C38719bj5 c38719bj5, InterfaceC23148b interfaceC23148b) {
                super(1);
                this.f86932h = c38719bj5;
                this.f86933i = interfaceC23148b;
            }

            /* renamed from: a */
            public final void m34346a(P83 ne) {
                Intrinsics.checkNotNullParameter(ne, "ne");
                C23154f.this.m34347d(ne);
                Node m90710b = ne.m90710b();
                if (m90710b != null) {
                    m90710b.mo33212l(this.f86932h, ne);
                }
                this.f86933i.mo33212l(this.f86932h, ne);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(P83 p83) {
                m34346a(p83);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C23154f(Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> function2, InterfaceC23148b interfaceC23148b) {
            this.f86929b = function2;
            this.f86930c = interfaceC23148b;
        }

        @Override // p000.C38719bj5.InterfaceC12488b
        /* renamed from: a */
        public void mo34350a(C38719bj5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            this.f86929b.invoke(e, new C23155a(detector, this.f86930c));
        }

        @Override // p000.C38719bj5.InterfaceC12488b
        /* renamed from: b */
        public void mo34349b(C38719bj5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            P83 p83 = this.f86928a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                InterfaceC23148b interfaceC23148b = this.f86930c;
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33214k(detector, p832);
                }
                interfaceC23148b.mo33214k(detector, p832);
            }
            this.f86928a = null;
        }

        @Override // p000.C38719bj5.InterfaceC12488b
        /* renamed from: c */
        public void mo34348c(C38719bj5 detector, MotionEvent e) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Intrinsics.checkNotNullParameter(e, "e");
            P83 p83 = this.f86928a;
            if (p83 != null) {
                P83 p832 = new P83(e, p83.m90710b(), p83.m90709c());
                InterfaceC23148b interfaceC23148b = this.f86930c;
                Node m90710b = p832.m90710b();
                if (m90710b != null) {
                    m90710b.mo33198u(detector, p832);
                }
                interfaceC23148b.mo33198u(detector, p832);
            }
        }

        /* renamed from: d */
        public final void m34347d(P83 p83) {
            this.f86928a = p83;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42577iC1(Context context, Function2<? super MotionEvent, ? super Function1<? super P83, Unit>, Unit> pickNode, InterfaceC23148b listener) {
        super(context, new C23135a(pickNode, listener));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pickNode, "pickNode");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f86866a = new C43944kW2(context, new C23150d(pickNode, listener));
        this.f86867b = new C35605Rb5(context, new C23152e(pickNode, listener));
        this.f86868c = new C38719bj5(context, new C23154f(pickNode, listener));
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        this.f86869d = event;
        this.f86866a.m28889a(event);
        this.f86867b.m86568c(event);
        this.f86868c.onTouchEvent(event);
        return onTouchEvent;
    }
}
