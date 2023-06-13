package p000;

import android.widget.TextView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\u0007"}, m28432d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "", "", "handled", "Lio/reactivex/Observable;", C17296a.f69688o, "rxbinding_release"}, m28431k = 5, m28430mv = {1, 4, 0}, m28427xs = "com/jakewharton/rxbinding3/widget/RxTextView")
/* renamed from: ff5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C41068ff5 {
    @JvmOverloads
    /* renamed from: a */
    public static final Observable<Integer> m41062a(TextView textView, Function1<? super Integer, Boolean> function1) {
        return new U26(textView, function1);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m41061b(TextView textView, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C8946W9.f40500b;
        }
        return C40475ef5.m42646a(textView, function1);
    }
}
