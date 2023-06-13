package co.bird.android.feature.commandcenter.base;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC37103Xm0;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001c\u0010\u0011\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/base/BaseCommandActivity;", "LXm0;", "T", "Lco/bird/android/core/mvp/BaseActivity;", "", "onResume", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "getPresenter", "()LXm0;", "setPresenter", "(LXm0;)V", "presenter", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCommandActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandActivity.kt\nco/bird/android/feature/commandcenter/base/BaseCommandActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseCommandActivity<T extends InterfaceC37103Xm0> extends BaseActivity {
    public BaseCommandActivity() {
        super(false, null, null, 7, null);
    }

    public abstract T getPresenter();

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C34515Mk4.menu_command_center, menu);
        MenuItem findItem = menu.findItem(C42273hh4.refresh);
        Drawable icon = findItem.getIcon();
        if (icon != null && (drawable = P61.m90834r(icon)) != null) {
            drawable.setTint(-1);
        } else {
            drawable = null;
        }
        findItem.setIcon(drawable);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean mo25074a = getPresenter().mo25074a(item.getItemId());
        if (!mo25074a) {
            return super.onOptionsItemSelected(item);
        }
        return mo25074a;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getPresenter().refresh();
    }
}
