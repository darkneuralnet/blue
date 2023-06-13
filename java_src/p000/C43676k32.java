package p000;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lk32;", "Lj32;", "", "b", "e", "c", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", DateTokenConverter.CONVERTER_KEY, "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", C17296a.f69688o, "Landroid/view/View;", "Landroid/view/View;", "view", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "g", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "LKY1;", "LKY1;", "helper", "<init>", "(Landroid/view/View;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43676k32 implements InterfaceC43083j32 {

    /* renamed from: a */
    public final View f93824a;

    /* renamed from: b */
    public final Lazy f93825b;

    /* renamed from: c */
    public final KY1 f93826c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/inputmethod/InputMethodManager;", "b", "()Landroid/view/inputmethod/InputMethodManager;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: k32$a */
    /* loaded from: classes.dex */
    public static final class C25092a extends Lambda implements Function0<InputMethodManager> {
        public C25092a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InputMethodManager invoke() {
            Object systemService = C43676k32.this.f93824a.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C43676k32(View view) {
        Lazy lazy;
        KY1 jy1;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f93824a = view;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C25092a());
        this.f93825b = lazy;
        if (Build.VERSION.SDK_INT < 30) {
            jy1 = new IY1(view);
        } else {
            jy1 = new JY1(view);
        }
        this.f93826c = jy1;
    }

    @Override // p000.InterfaceC43083j32
    /* renamed from: a */
    public void mo29396a(int i, int i2, int i3, int i4) {
        m29390g().updateSelection(this.f93824a, i, i2, i3, i4);
    }

    @Override // p000.InterfaceC43083j32
    /* renamed from: b */
    public void mo29395b() {
        m29390g().restartInput(this.f93824a);
    }

    @Override // p000.InterfaceC43083j32
    /* renamed from: c */
    public void mo29394c() {
        this.f93826c.mo98784a(m29390g());
    }

    @Override // p000.InterfaceC43083j32
    /* renamed from: d */
    public void mo29393d(int i, ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        m29390g().updateExtractedText(this.f93824a, i, extractedText);
    }

    @Override // p000.InterfaceC43083j32
    /* renamed from: e */
    public void mo29392e() {
        this.f93826c.mo98783b(m29390g());
    }

    /* renamed from: g */
    public final InputMethodManager m29390g() {
        return (InputMethodManager) this.f93825b.getValue();
    }
}
