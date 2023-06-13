package p000;

import android.widget.TextView;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m28432d2 = {"Lrj0;", "", "graphQlOperationName", "", "graphQLDetected", "", "b", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: u66  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49639u66 {
    /* renamed from: b */
    public static final void m10854b(C48219rj0 c48219rj0, String str, boolean z) {
        if (z) {
            c48219rj0.f107525d.setVisibility(0);
            c48219rj0.f107526e.setVisibility(0);
            TextView textView = c48219rj0.f107526e;
            if (str == null) {
                str = c48219rj0.getRoot().getResources().getString(C38145al4.chucker_graphql_operation_is_empty);
            }
            textView.setText(str);
            return;
        }
        c48219rj0.f107525d.setVisibility(8);
        c48219rj0.f107526e.setVisibility(8);
    }
}
