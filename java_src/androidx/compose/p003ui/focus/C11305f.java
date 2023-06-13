package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.C11309h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00100R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u001c\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010 \u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010#\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010'\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR7\u00101\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0(8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b/\u00100\u001a\u0004\b\u001d\u0010,\"\u0004\b-\u0010.R7\u00105\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0(8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b2\u0010+\u0012\u0004\b4\u00100\u001a\u0004\b\u0011\u0010,\"\u0004\b3\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"Landroidx/compose/ui/focus/f;", "Landroidx/compose/ui/focus/e;", "", C17296a.f69688o, "Z", "h", "()Z", "e", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/h;", "b", "Landroidx/compose/ui/focus/h;", "()Landroidx/compose/ui/focus/h;", "setNext", "(Landroidx/compose/ui/focus/h;)V", "next", "c", "f", "setPrevious", "previous", DateTokenConverter.CONVERTER_KEY, "setUp", "up", "setDown", "down", "w", "setLeft", "left", "g", "v", "setRight", "right", "getStart", "setStart", "start", "i", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/c;", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "()V", "enter", "k", "setExit", "getExit$annotations", "exit", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.f */
/* loaded from: classes.dex */
public final class C11305f implements InterfaceC11302e {

    /* renamed from: a */
    public boolean f52975a = true;

    /* renamed from: b */
    public C11309h f52976b;

    /* renamed from: c */
    public C11309h f52977c;

    /* renamed from: d */
    public C11309h f52978d;

    /* renamed from: e */
    public C11309h f52979e;

    /* renamed from: f */
    public C11309h f52980f;

    /* renamed from: g */
    public C11309h f52981g;

    /* renamed from: h */
    public C11309h f52982h;

    /* renamed from: i */
    public C11309h f52983i;

    /* renamed from: j */
    public Function1<? super C11299c, C11309h> f52984j;

    /* renamed from: k */
    public Function1<? super C11299c, C11309h> f52985k;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/c;", "it", "Landroidx/compose/ui/focus/h;", "b", "(I)Landroidx/compose/ui/focus/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.f$a */
    /* loaded from: classes.dex */
    public static final class C11306a extends Lambda implements Function1<C11299c, C11309h> {

        /* renamed from: g */
        public static final C11306a f52986g = new C11306a();

        public C11306a() {
            super(1);
        }

        /* renamed from: b */
        public final C11309h m68786b(int i) {
            return C11309h.f52988b.m68777b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C11309h invoke(C11299c c11299c) {
            return m68786b(c11299c.m68808o());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/c;", "it", "Landroidx/compose/ui/focus/h;", "b", "(I)Landroidx/compose/ui/focus/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.f$b */
    /* loaded from: classes.dex */
    public static final class C11307b extends Lambda implements Function1<C11299c, C11309h> {

        /* renamed from: g */
        public static final C11307b f52987g = new C11307b();

        public C11307b() {
            super(1);
        }

        /* renamed from: b */
        public final C11309h m68785b(int i) {
            return C11309h.f52988b.m68777b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C11309h invoke(C11299c c11299c) {
            return m68785b(c11299c.m68808o());
        }
    }

    public C11305f() {
        C11309h.C11310a c11310a = C11309h.f52988b;
        this.f52976b = c11310a.m68777b();
        this.f52977c = c11310a.m68777b();
        this.f52978d = c11310a.m68777b();
        this.f52979e = c11310a.m68777b();
        this.f52980f = c11310a.m68777b();
        this.f52981g = c11310a.m68777b();
        this.f52982h = c11310a.m68777b();
        this.f52983i = c11310a.m68777b();
        this.f52984j = C11306a.f52986g;
        this.f52985k = C11307b.f52987g;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: a */
    public C11309h mo68796a() {
        return this.f52976b;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: b */
    public C11309h mo68795b() {
        return this.f52978d;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: c */
    public Function1<C11299c, C11309h> mo68794c() {
        return this.f52985k;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: d */
    public C11309h mo68793d() {
        return this.f52979e;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: e */
    public void mo68792e(boolean z) {
        this.f52975a = z;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: f */
    public C11309h mo68791f() {
        return this.f52977c;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: g */
    public Function1<C11299c, C11309h> mo68790g() {
        return this.f52984j;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    public C11309h getEnd() {
        return this.f52983i;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    public C11309h getStart() {
        return this.f52982h;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: h */
    public boolean mo68789h() {
        return this.f52975a;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: v */
    public C11309h mo68788v() {
        return this.f52981g;
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: w */
    public C11309h mo68787w() {
        return this.f52980f;
    }
}
