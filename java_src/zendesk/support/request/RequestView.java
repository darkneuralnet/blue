package zendesk.support.request;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
/* loaded from: classes8.dex */
interface RequestView {
    boolean hasUnsavedInput();

    boolean inflateMenu(MenuInflater menuInflater, Menu menu);

    boolean onOptionsItemClicked(MenuItem menuItem);
}
