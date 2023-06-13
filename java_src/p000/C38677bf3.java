package p000;

import androidx.activity.OnBackPressedDispatcher;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b"}, m28432d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "LLifecycleOwner;", "owner", "", "enabled", "Lkotlin/Function1;", "LVe3;", "", "Lkotlin/ExtensionFunctionType;", "onBackPressed", C17296a.f69688o, "activity_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: bf3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38677bf3 {

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"bf3$a", "LVe3;", "", "handleOnBackPressed", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bf3$a */
    /* loaded from: classes.dex */
    public static final class C12466a extends AbstractC36566Ve3 {

        /* renamed from: a */
        public final /* synthetic */ Function1<AbstractC36566Ve3, Unit> f57841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12466a(boolean z, Function1<? super AbstractC36566Ve3, Unit> function1) {
            super(z);
            this.f57841a = function1;
        }

        @Override // p000.AbstractC36566Ve3
        public void handleOnBackPressed() {
            this.f57841a.invoke(this);
        }
    }

    /* renamed from: a */
    public static final AbstractC36566Ve3 m64202a(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1<? super AbstractC36566Ve3, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        C12466a c12466a = new C12466a(z, onBackPressed);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.m70498b(lifecycleOwner, c12466a);
        } else {
            onBackPressedDispatcher.m70497c(c12466a);
        }
        return c12466a;
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC36566Ve3 m64201b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m64202a(onBackPressedDispatcher, lifecycleOwner, z, function1);
    }
}
