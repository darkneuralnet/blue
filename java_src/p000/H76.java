package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C33323Hi0;
import p000.G76;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0005\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m28432d2 = {"LH76;", "Landroidx/recyclerview/widget/RecyclerView$D;", "LG76;", "item", "", C17296a.f69688o, "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "b", "c", "LH76$a;", "LH76$b;", "LH76$c;", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H76 */
/* loaded from: classes5.dex */
public abstract class H76 extends RecyclerView.AbstractC11834D {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LH76$a;", "LH76;", "LG76;", "item", "", C17296a.f69688o, "Lsj0;", "b", "Lsj0;", "bodyBinding", "<init>", "(Lsj0;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H76$a */
    /* loaded from: classes5.dex */
    public static final class C3026a extends H76 {

        /* renamed from: b */
        public final C48811sj0 f12873b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C3026a(C48811sj0 bodyBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(bodyBinding, "bodyBinding");
            TextView root = bodyBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "bodyBinding.root");
            this.f12873b = bodyBinding;
        }

        @Override // p000.H76
        /* renamed from: a */
        public void mo104383a(G76 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof G76.C2667a) {
                this.f12873b.f109153b.setText(((G76.C2667a) item).m105724a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LH76$b;", "LH76;", "LG76;", "item", "", C17296a.f69688o, "Ltj0;", "b", "Ltj0;", "headerBinding", "<init>", "(Ltj0;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H76$b */
    /* loaded from: classes5.dex */
    public static final class C3027b extends H76 {

        /* renamed from: b */
        public final C49404tj0 f12874b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C3027b(C49404tj0 headerBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(headerBinding, "headerBinding");
            TextView root = headerBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "headerBinding.root");
            this.f12874b = headerBinding;
        }

        @Override // p000.H76
        /* renamed from: a */
        public void mo104383a(G76 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof G76.C2668b) {
                this.f12874b.f110938b.setText(((G76.C2668b) item).m105722a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0011"}, m28432d2 = {"LH76$c;", "LH76;", "LG76;", "item", "", C17296a.f69688o, "", "luminance", "Landroid/graphics/drawable/Drawable;", "b", "(Ljava/lang/Double;)Landroid/graphics/drawable/Drawable;", "Luj0;", "Luj0;", "imageBinding", "<init>", "(Luj0;)V", "c", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H76$c */
    /* loaded from: classes5.dex */
    public static final class C3028c extends H76 {

        /* renamed from: c */
        public static final C3029a f12875c = new C3029a(null);

        /* renamed from: b */
        public final C49997uj0 f12876b;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LH76$c$a;", "", "", "LUMINANCE_THRESHOLD", "D", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: H76$c$a */
        /* loaded from: classes5.dex */
        public static final class C3029a {
            public /* synthetic */ C3029a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C3029a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C3028c(C49997uj0 imageBinding) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(imageBinding, "imageBinding");
            FrameLayout root = imageBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "imageBinding.root");
            this.f12876b = imageBinding;
        }

        @Override // p000.H76
        /* renamed from: a */
        public void mo104383a(G76 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof G76.C2669c) {
                G76.C2669c c2669c = (G76.C2669c) item;
                this.f12876b.f112798b.setImageBitmap(c2669c.m105721a());
                this.f12876b.getRoot().setBackground(m104382b(c2669c.m105720b()));
            }
        }

        /* renamed from: b */
        public final Drawable m104382b(Double d) {
            if (d == null) {
                return null;
            }
            if (d.doubleValue() < 0.25d) {
                C33323Hi0.C3211a c3211a = C33323Hi0.f13775b;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                return c3211a.m103518a(context, C33066Gf4.chucker_chessboard_even_square_light, C33066Gf4.chucker_chessboard_odd_square_light, C38688bg4.chucker_half_grid);
            }
            C33323Hi0.C3211a c3211a2 = C33323Hi0.f13775b;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            return c3211a2.m103518a(context2, C33066Gf4.chucker_chessboard_even_square_dark, C33066Gf4.chucker_chessboard_odd_square_dark, C38688bg4.chucker_half_grid);
        }
    }

    public /* synthetic */ H76(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* renamed from: a */
    public abstract void mo104383a(G76 g76);

    public H76(View view) {
        super(view);
    }
}
