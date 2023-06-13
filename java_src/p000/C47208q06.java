package p000;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u001a\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0002R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010#R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010#R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010#R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010#¨\u00060"}, m28432d2 = {"Lq06;", "", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "e", "g", "Landroid/view/MenuItem;", "item", DateTokenConverter.CONVERTER_KEY, "", "f", "m", "(Landroid/view/Menu;)V", "LpQ2;", C17296a.f69688o, "(Landroid/view/Menu;LpQ2;)V", "Lkotlin/Function0;", "callback", "b", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "onActionModeDestroy", "LOs4;", "LOs4;", "c", "()LOs4;", "l", "(LOs4;)V", "rect", "getOnCopyRequested", "h", "(Lkotlin/jvm/functions/Function0;)V", "onCopyRequested", "getOnPasteRequested", "j", "onPasteRequested", "getOnCutRequested", "i", "onCutRequested", "getOnSelectAllRequested", "k", "onSelectAllRequested", "<init>", "(Lkotlin/jvm/functions/Function0;LOs4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: q06  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47208q06 {

    /* renamed from: a */
    public final Function0<Unit> f104478a;

    /* renamed from: b */
    public C35055Os4 f104479b;

    /* renamed from: c */
    public Function0<Unit> f104480c;

    /* renamed from: d */
    public Function0<Unit> f104481d;

    /* renamed from: e */
    public Function0<Unit> f104482e;

    /* renamed from: f */
    public Function0<Unit> f104483f;

    public C47208q06() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* renamed from: a */
    public final void m18333a(Menu menu, EnumC46855pQ2 item) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(item, "item");
        menu.add(0, item.m19324b(), item.m19323c(), item.m19322d()).setShowAsAction(1);
    }

    /* renamed from: b */
    public final void m18332b(Menu menu, EnumC46855pQ2 enumC46855pQ2, Function0<Unit> function0) {
        if (function0 != null && menu.findItem(enumC46855pQ2.m19324b()) == null) {
            m18333a(menu, enumC46855pQ2);
        } else if (function0 == null && menu.findItem(enumC46855pQ2.m19324b()) != null) {
            menu.removeItem(enumC46855pQ2.m19324b());
        }
    }

    /* renamed from: c */
    public final C35055Os4 m18331c() {
        return this.f104479b;
    }

    /* renamed from: d */
    public final boolean m18330d(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == EnumC46855pQ2.Copy.m19324b()) {
            Function0<Unit> function0 = this.f104480c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == EnumC46855pQ2.Paste.m19324b()) {
            Function0<Unit> function02 = this.f104481d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == EnumC46855pQ2.Cut.m19324b()) {
            Function0<Unit> function03 = this.f104482e;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == EnumC46855pQ2.SelectAll.m19324b()) {
            Function0<Unit> function04 = this.f104483f;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m18329e(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f104480c != null) {
                    m18333a(menu, EnumC46855pQ2.Copy);
                }
                if (this.f104481d != null) {
                    m18333a(menu, EnumC46855pQ2.Paste);
                }
                if (this.f104482e != null) {
                    m18333a(menu, EnumC46855pQ2.Cut);
                }
                if (this.f104483f != null) {
                    m18333a(menu, EnumC46855pQ2.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: f */
    public final void m18328f() {
        Function0<Unit> function0 = this.f104478a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: g */
    public final boolean m18327g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m18321m(menu);
        return true;
    }

    /* renamed from: h */
    public final void m18326h(Function0<Unit> function0) {
        this.f104480c = function0;
    }

    /* renamed from: i */
    public final void m18325i(Function0<Unit> function0) {
        this.f104482e = function0;
    }

    /* renamed from: j */
    public final void m18324j(Function0<Unit> function0) {
        this.f104481d = function0;
    }

    /* renamed from: k */
    public final void m18323k(Function0<Unit> function0) {
        this.f104483f = function0;
    }

    /* renamed from: l */
    public final void m18322l(C35055Os4 c35055Os4) {
        Intrinsics.checkNotNullParameter(c35055Os4, "<set-?>");
        this.f104479b = c35055Os4;
    }

    /* renamed from: m */
    public final void m18321m(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        m18332b(menu, EnumC46855pQ2.Copy, this.f104480c);
        m18332b(menu, EnumC46855pQ2.Paste, this.f104481d);
        m18332b(menu, EnumC46855pQ2.Cut, this.f104482e);
        m18332b(menu, EnumC46855pQ2.SelectAll, this.f104483f);
    }

    public C47208q06(Function0<Unit> function0, C35055Os4 rect, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f104478a = function0;
        this.f104479b = rect;
        this.f104480c = function02;
        this.f104481d = function03;
        this.f104482e = function04;
        this.f104483f = function05;
    }

    public /* synthetic */ C47208q06(Function0 function0, C35055Os4 c35055Os4, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? C35055Os4.f27481e.m91247a() : c35055Os4, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05);
    }
}
