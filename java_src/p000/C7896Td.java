package p000;

import android.view.ActionMode;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJP\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LTd;", "LI26;", "LOs4;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", C17296a.f69688o, "b", "Landroid/view/View;", "Landroid/view/View;", "view", "Landroid/view/ActionMode;", "Landroid/view/ActionMode;", "actionMode", "Lq06;", "c", "Lq06;", "textActionModeCallback", "LK26;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "LK26;", "getStatus", "()LK26;", "status", "<init>", "(Landroid/view/View;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Td */
/* loaded from: classes.dex */
public final class C7896Td implements I26 {

    /* renamed from: a */
    public final View f35788a;

    /* renamed from: b */
    public ActionMode f35789b;

    /* renamed from: c */
    public final C47208q06 f35790c;

    /* renamed from: d */
    public K26 f35791d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Td$a */
    /* loaded from: classes.dex */
    public static final class C7897a extends Lambda implements Function0<Unit> {
        public C7897a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C7896Td.this.f35789b = null;
        }
    }

    public C7896Td(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f35788a = view;
        this.f35790c = new C47208q06(new C7897a(), null, null, null, null, null, 62, null);
        this.f35791d = K26.Hidden;
    }

    @Override // p000.I26
    /* renamed from: a */
    public void mo83267a(C35055Os4 rect, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f35790c.m18322l(rect);
        this.f35790c.m18326h(function0);
        this.f35790c.m18325i(function03);
        this.f35790c.m18324j(function02);
        this.f35790c.m18323k(function04);
        ActionMode actionMode = this.f35789b;
        if (actionMode == null) {
            this.f35791d = K26.Shown;
            this.f35789b = J26.f16696a.m101258b(this.f35788a, new C51293wu1(this.f35790c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // p000.I26
    /* renamed from: b */
    public void mo83266b() {
        this.f35791d = K26.Hidden;
        ActionMode actionMode = this.f35789b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f35789b = null;
    }

    @Override // p000.I26
    public K26 getStatus() {
        return this.f35791d;
    }
}
