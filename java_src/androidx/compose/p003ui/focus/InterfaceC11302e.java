package androidx.compose.p003ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRE\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RE\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, m28432d2 = {"Landroidx/compose/ui/focus/e;", "", "", "h", "()Z", "e", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/h;", "<anonymous parameter 0>", C17296a.f69688o, "()Landroidx/compose/ui/focus/h;", "setNext", "(Landroidx/compose/ui/focus/h;)V", "next", "f", "setPrevious", "previous", "b", "setUp", "up", DateTokenConverter.CONVERTER_KEY, "setDown", "down", "w", "setLeft", "left", "v", "setRight", "right", "getStart", "setStart", "start", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/c;", "g", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "()V", "enter", "c", "setExit", "getExit$annotations", "exit", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.e */
/* loaded from: classes.dex */
public interface InterfaceC11302e {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/c;", "it", "Landroidx/compose/ui/focus/h;", "b", "(I)Landroidx/compose/ui/focus/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.e$a */
    /* loaded from: classes.dex */
    public static final class C11303a extends Lambda implements Function1<C11299c, C11309h> {

        /* renamed from: g */
        public static final C11303a f52973g = new C11303a();

        public C11303a() {
            super(1);
        }

        /* renamed from: b */
        public final C11309h m68798b(int i) {
            return C11309h.f52988b.m68777b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C11309h invoke(C11299c c11299c) {
            return m68798b(c11299c.m68808o());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/c;", "it", "Landroidx/compose/ui/focus/h;", "b", "(I)Landroidx/compose/ui/focus/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.e$b */
    /* loaded from: classes.dex */
    public static final class C11304b extends Lambda implements Function1<C11299c, C11309h> {

        /* renamed from: g */
        public static final C11304b f52974g = new C11304b();

        public C11304b() {
            super(1);
        }

        /* renamed from: b */
        public final C11309h m68797b(int i) {
            return C11309h.f52988b.m68777b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C11309h invoke(C11299c c11299c) {
            return m68797b(c11299c.m68808o());
        }
    }

    /* renamed from: a */
    default C11309h mo68796a() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: b */
    default C11309h mo68795b() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: c */
    default Function1<C11299c, C11309h> mo68794c() {
        return C11304b.f52974g;
    }

    /* renamed from: d */
    default C11309h mo68793d() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: e */
    void mo68792e(boolean z);

    /* renamed from: f */
    default C11309h mo68791f() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: g */
    default Function1<C11299c, C11309h> mo68790g() {
        return C11303a.f52973g;
    }

    default C11309h getEnd() {
        return C11309h.f52988b.m68777b();
    }

    default C11309h getStart() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: h */
    boolean mo68789h();

    /* renamed from: v */
    default C11309h mo68788v() {
        return C11309h.f52988b.m68777b();
    }

    /* renamed from: w */
    default C11309h mo68787w() {
        return C11309h.f52988b.m68777b();
    }
}
