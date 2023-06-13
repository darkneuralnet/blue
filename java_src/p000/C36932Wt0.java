package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J*\u0010\u0010\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LWt0;", "Landroid/text/TextWatcher;", "watcher", "", C17296a.f69688o, "b", "Landroid/text/Editable;", "s", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "", "Z", "getEnabled", "()Z", "c", "(Z)V", "enabled", "", "Ljava/util/Set;", "watchers", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSilenceableMaterialEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SilenceableMaterialEditText.kt\nco/bird/android/widget/CompositeTextWatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n1855#2,2:70\n1855#2,2:72\n*S KotlinDebug\n*F\n+ 1 SilenceableMaterialEditText.kt\nco/bird/android/widget/CompositeTextWatcher\n*L\n51#1:68,2\n57#1:70,2\n63#1:72,2\n*E\n"})
/* renamed from: Wt0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36932Wt0 implements TextWatcher {

    /* renamed from: b */
    public boolean f42258b = true;

    /* renamed from: c */
    public final Set<TextWatcher> f42259c = new LinkedHashSet();

    /* renamed from: a */
    public final void m77748a(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.f42259c.add(watcher);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f42258b) {
            for (TextWatcher textWatcher : this.f42259c) {
                textWatcher.afterTextChanged(editable);
            }
        }
    }

    /* renamed from: b */
    public final void m77747b(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.f42259c.remove(watcher);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f42258b) {
            for (TextWatcher textWatcher : this.f42259c) {
                textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    /* renamed from: c */
    public final void m77746c(boolean z) {
        this.f42258b = z;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f42258b) {
            for (TextWatcher textWatcher : this.f42259c) {
                textWatcher.onTextChanged(charSequence, i, i2, i3);
            }
        }
    }
}
