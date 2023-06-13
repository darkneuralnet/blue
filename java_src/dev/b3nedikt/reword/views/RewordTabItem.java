package dev.b3nedikt.reword.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"Ldev/b3nedikt/reword/views/RewordTabItem;", "Lcom/google/android/material/tabs/TabItem;", "", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "textResourceId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/Integer;)V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class RewordTabItem extends TabItem {

    /* renamed from: e */
    public final Integer f76994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewordTabItem(Context context, AttributeSet attributeSet, Integer num) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76994e = num;
    }

    /* renamed from: a */
    public final Integer m43951a() {
        return this.f76994e;
    }
}
