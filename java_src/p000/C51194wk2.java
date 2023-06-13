package p000;

import android.view.KeyEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lkotlin/Function1;", "Lik2;", "", "shortcutModifier", "Lvk2;", C17296a.f69688o, "Lvk2;", "b", "()Lvk2;", "defaultKeyMapping", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51194wk2 {

    /* renamed from: a */
    public static final InterfaceC50601vk2 f116425a = new C29953c(m6420a(C29952b.f116427b));

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"wk2$a", "Lvk2;", "Lik2;", "event", "Lek2;", C17296a.f69688o, "(Landroid/view/KeyEvent;)Lek2;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wk2$a */
    /* loaded from: classes.dex */
    public static final class C29951a implements InterfaceC50601vk2 {

        /* renamed from: a */
        public final /* synthetic */ Function1<C42894ik2, Boolean> f116426a;

        /* JADX WARN: Multi-variable type inference failed */
        public C29951a(Function1<? super C42894ik2, Boolean> function1) {
            this.f116426a = function1;
        }

        @Override // p000.InterfaceC50601vk2
        /* renamed from: a */
        public EnumC40522ek2 mo6418a(KeyEvent event) {
            boolean m77917n;
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f116426a.invoke(C42894ik2.m33523a(event)).booleanValue() && C45266mk2.m25120f(event)) {
                if (!C36844Wj2.m77917n(C45266mk2.m25125a(event), ZL2.f48346a.m73251x())) {
                    return null;
                }
                return EnumC40522ek2.REDO;
            } else if (this.f116426a.invoke(C42894ik2.m33523a(event)).booleanValue()) {
                long m25125a = C45266mk2.m25125a(event);
                ZL2 zl2 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a, zl2.m73271d())) {
                    m77917n = true;
                } else {
                    m77917n = C36844Wj2.m77917n(m25125a, zl2.m73261n());
                }
                if (m77917n) {
                    return EnumC40522ek2.COPY;
                }
                if (C36844Wj2.m77917n(m25125a, zl2.m73254u())) {
                    return EnumC40522ek2.PASTE;
                }
                if (C36844Wj2.m77917n(m25125a, zl2.m73253v())) {
                    return EnumC40522ek2.CUT;
                }
                if (C36844Wj2.m77917n(m25125a, zl2.m73274a())) {
                    return EnumC40522ek2.SELECT_ALL;
                }
                if (C36844Wj2.m77917n(m25125a, zl2.m73252w())) {
                    return EnumC40522ek2.REDO;
                }
                if (!C36844Wj2.m77917n(m25125a, zl2.m73251x())) {
                    return null;
                }
                return EnumC40522ek2.UNDO;
            } else if (C45266mk2.m25121e(event)) {
                return null;
            } else {
                if (C45266mk2.m25120f(event)) {
                    long m25125a2 = C45266mk2.m25125a(event);
                    ZL2 zl22 = ZL2.f48346a;
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73266i())) {
                        return EnumC40522ek2.SELECT_LEFT_CHAR;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73265j())) {
                        return EnumC40522ek2.SELECT_RIGHT_CHAR;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73264k())) {
                        return EnumC40522ek2.SELECT_UP;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73267h())) {
                        return EnumC40522ek2.SELECT_DOWN;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73257r())) {
                        return EnumC40522ek2.SELECT_PAGE_UP;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73258q())) {
                        return EnumC40522ek2.SELECT_PAGE_DOWN;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73259p())) {
                        return EnumC40522ek2.SELECT_LINE_START;
                    }
                    if (C36844Wj2.m77917n(m25125a2, zl22.m73260o())) {
                        return EnumC40522ek2.SELECT_LINE_END;
                    }
                    if (!C36844Wj2.m77917n(m25125a2, zl22.m73261n())) {
                        return null;
                    }
                    return EnumC40522ek2.PASTE;
                }
                long m25125a3 = C45266mk2.m25125a(event);
                ZL2 zl23 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a3, zl23.m73266i())) {
                    return EnumC40522ek2.LEFT_CHAR;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73265j())) {
                    return EnumC40522ek2.RIGHT_CHAR;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73264k())) {
                    return EnumC40522ek2.UP;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73267h())) {
                    return EnumC40522ek2.DOWN;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73257r())) {
                    return EnumC40522ek2.PAGE_UP;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73258q())) {
                    return EnumC40522ek2.PAGE_DOWN;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73259p())) {
                    return EnumC40522ek2.LINE_START;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73260o())) {
                    return EnumC40522ek2.LINE_END;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73263l())) {
                    return EnumC40522ek2.NEW_LINE;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73272c())) {
                    return EnumC40522ek2.DELETE_PREV_CHAR;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73268g())) {
                    return EnumC40522ek2.DELETE_NEXT_CHAR;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73256s())) {
                    return EnumC40522ek2.PASTE;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73269f())) {
                    return EnumC40522ek2.CUT;
                }
                if (C36844Wj2.m77917n(m25125a3, zl23.m73270e())) {
                    return EnumC40522ek2.COPY;
                }
                if (!C36844Wj2.m77917n(m25125a3, zl23.m73255t())) {
                    return null;
                }
                return EnumC40522ek2.TAB;
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wk2$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C29952b extends PropertyReference1Impl {

        /* renamed from: b */
        public static final C29952b f116427b = new C29952b();

        public C29952b() {
            super(C45266mk2.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public Object get(Object obj) {
            return Boolean.valueOf(C45266mk2.m25121e(((C42894ik2) obj).m33518f()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"wk2$c", "Lvk2;", "Lik2;", "event", "Lek2;", C17296a.f69688o, "(Landroid/view/KeyEvent;)Lek2;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wk2$c */
    /* loaded from: classes.dex */
    public static final class C29953c implements InterfaceC50601vk2 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC50601vk2 f116428a;

        public C29953c(InterfaceC50601vk2 interfaceC50601vk2) {
            this.f116428a = interfaceC50601vk2;
        }

        @Override // p000.InterfaceC50601vk2
        /* renamed from: a */
        public EnumC40522ek2 mo6418a(KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EnumC40522ek2 enumC40522ek2 = null;
            if (C45266mk2.m25120f(event) && C45266mk2.m25121e(event)) {
                long m25125a = C45266mk2.m25125a(event);
                ZL2 zl2 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a, zl2.m73266i())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_LEFT_WORD;
                } else if (C36844Wj2.m77917n(m25125a, zl2.m73265j())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_RIGHT_WORD;
                } else if (C36844Wj2.m77917n(m25125a, zl2.m73264k())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_PREV_PARAGRAPH;
                } else if (C36844Wj2.m77917n(m25125a, zl2.m73267h())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_NEXT_PARAGRAPH;
                }
            } else if (C45266mk2.m25121e(event)) {
                long m25125a2 = C45266mk2.m25125a(event);
                ZL2 zl22 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a2, zl22.m73266i())) {
                    enumC40522ek2 = EnumC40522ek2.LEFT_WORD;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73265j())) {
                    enumC40522ek2 = EnumC40522ek2.RIGHT_WORD;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73264k())) {
                    enumC40522ek2 = EnumC40522ek2.PREV_PARAGRAPH;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73267h())) {
                    enumC40522ek2 = EnumC40522ek2.NEXT_PARAGRAPH;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73262m())) {
                    enumC40522ek2 = EnumC40522ek2.DELETE_PREV_CHAR;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73268g())) {
                    enumC40522ek2 = EnumC40522ek2.DELETE_NEXT_WORD;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73272c())) {
                    enumC40522ek2 = EnumC40522ek2.DELETE_PREV_WORD;
                } else if (C36844Wj2.m77917n(m25125a2, zl22.m73273b())) {
                    enumC40522ek2 = EnumC40522ek2.DESELECT;
                }
            } else if (C45266mk2.m25120f(event)) {
                long m25125a3 = C45266mk2.m25125a(event);
                ZL2 zl23 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a3, zl23.m73259p())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_HOME;
                } else if (C36844Wj2.m77917n(m25125a3, zl23.m73260o())) {
                    enumC40522ek2 = EnumC40522ek2.SELECT_END;
                }
            } else if (C45266mk2.m25122d(event)) {
                long m25125a4 = C45266mk2.m25125a(event);
                ZL2 zl24 = ZL2.f48346a;
                if (C36844Wj2.m77917n(m25125a4, zl24.m73272c())) {
                    enumC40522ek2 = EnumC40522ek2.DELETE_FROM_LINE_START;
                } else if (C36844Wj2.m77917n(m25125a4, zl24.m73268g())) {
                    enumC40522ek2 = EnumC40522ek2.DELETE_TO_LINE_END;
                }
            }
            if (enumC40522ek2 == null) {
                return this.f116428a.mo6418a(event);
            }
            return enumC40522ek2;
        }
    }

    /* renamed from: a */
    public static final InterfaceC50601vk2 m6420a(Function1<? super C42894ik2, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new C29951a(shortcutModifier);
    }

    /* renamed from: b */
    public static final InterfaceC50601vk2 m6419b() {
        return f116425a;
    }
}
