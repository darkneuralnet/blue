package p000;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BottomSheetButton;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\u000b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\tR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LwZ;", "Lco/bird/android/model/BottomSheetButton;", "T", "", "", "LH6;", "sections", "", "c", "Lkotlin/Function1;", "onClick", "b", "Landroidx/recyclerview/widget/RecyclerView$p;", C17296a.f69688o, "Landroidx/recyclerview/widget/RecyclerView$p;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "LyS0;", "getAdapter", "()LyS0;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wZ */
/* loaded from: classes2.dex */
public abstract class AbstractC29912wZ<T extends BottomSheetButton> {

    /* renamed from: a */
    public final RecyclerView.AbstractC11855p f116153a;

    /* renamed from: b */
    public Function1<? super T, Unit> f116154b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BottomSheetButton;", "T", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wZ$a */
    /* loaded from: classes2.dex */
    public static final class C29913a extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C29913a f116155g = new C29913a();

        public C29913a() {
            super(1);
        }

        /* renamed from: a */
        public final void m6669a(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m6669a((BottomSheetButton) obj);
            return Unit.INSTANCE;
        }
    }

    public AbstractC29912wZ(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f116153a = new LinearLayoutManager(context);
        this.f116154b = C29913a.f116155g;
    }

    /* renamed from: a */
    public final Function1<T, Unit> m6672a() {
        return (Function1<? super T, Unit>) this.f116154b;
    }

    /* renamed from: b */
    public final void m6671b(Function1<? super T, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f116154b = onClick;
    }

    /* renamed from: c */
    public final void m6670c(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        getAdapter().mo24871u(sections);
    }

    public abstract AbstractC52206yS0 getAdapter();

    public RecyclerView.AbstractC11855p getLayoutManager() {
        return this.f116153a;
    }
}
