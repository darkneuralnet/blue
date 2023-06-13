package p000;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.tabs.TabLayout;
import dev.b3nedikt.reword.views.RewordTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LpY5;", "LQq6;", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "c", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "viewName", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pY5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C46930pY5 implements InterfaceC35507Qq6<TabLayout> {

    /* renamed from: a */
    public static final C46930pY5 f103789a = new C46930pY5();

    /* renamed from: b */
    public static final String f103790b = String.valueOf(Reflection.getOrCreateKotlinClass(TabLayout.class).getQualifiedName());

    private C46930pY5() {
    }

    @Override // p000.InterfaceC35507Qq6
    /* renamed from: b */
    public String mo19124b() {
        return f103790b;
    }

    @Override // p000.InterfaceC35507Qq6
    /* renamed from: c */
    public TabLayout mo19125a(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RewordTabLayout(context, attributeSet);
    }
}
