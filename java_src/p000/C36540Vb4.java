package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.widget.standardcomponents.LabeledDetailItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C36540Vb4;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\b#$\u0015\u0018\u001a\u001d\u001f%B\u0007¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001c0\u001c0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\"\u0010 \u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016¨\u0006&"}, m28432d2 = {"LVb4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "v", "x", "y", "w", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "readyToRideClickSubject", DateTokenConverter.CONVERTER_KEY, "stillDamagedClickSubject", "e", "addIssuesClickSubject", "", "f", "notesSubject", "g", "failedSubmitClickSubject", "<init>", "()V", C17296a.f69688o, "b", "h", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vb4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36540Vb4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f39300c;

    /* renamed from: d */
    public final C24558d<Unit> f39301d;

    /* renamed from: e */
    public final C24558d<Unit> f39302e;

    /* renamed from: f */
    public final C24558d<String> f39303f;

    /* renamed from: g */
    public final C24558d<Unit> f39304g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vb4$a */
    /* loaded from: classes4.dex */
    public final class C8697a extends C29735w1 {

        /* renamed from: b */
        public final Button f39305b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39306c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8697a(final C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39306c = c36540Vb4;
            Button button = (Button) view;
            this.f39305b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: Ub4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C36540Vb4.C8697a.m79699b(C36540Vb4.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m79699b(C36540Vb4 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f39302e.onNext(Unit.INSTANCE);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f39305b.setText(C47712qr6.m16902c(this, C45871nl4.add_issues));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LVb4$b;", "Lw1;", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "notes", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vb4$b */
    /* loaded from: classes4.dex */
    public final class C8698b extends C29735w1 {

        /* renamed from: b */
        public final EditText f39307b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39308c;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Vb4$b$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Vb4$b$a */
        /* loaded from: classes4.dex */
        public static final class C8699a extends C39530d36 {

            /* renamed from: b */
            public final /* synthetic */ C36540Vb4 f39309b;

            public C8699a(C36540Vb4 c36540Vb4) {
                this.f39309b = c36540Vb4;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(s, "s");
                this.f39309b.f39303f.onNext(s.toString());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8698b(final C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39308c = c36540Vb4;
            EditText editText = (EditText) view;
            this.f39307b = editText;
            editText.addTextChangedListener(new C8699a(c36540Vb4));
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Wb4
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    C36540Vb4.C8698b.m79696e(C36540Vb4.C8698b.this, c36540Vb4, view2, z);
                }
            });
        }

        /* renamed from: e */
        public static final void m79696e(C8698b this$0, final C36540Vb4 this$1, View view, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                ViewParent parent = this$0.f39307b.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                final RecyclerView recyclerView = (RecyclerView) parent;
                new Handler().postDelayed(new Runnable() { // from class: Xb4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36540Vb4.C8698b.m79695i(RecyclerView.this, this$1);
                    }
                }, 50L);
            }
        }

        /* renamed from: i */
        public static final void m79695i(RecyclerView recyclerView, C36540Vb4 this$0) {
            Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            recyclerView.smoothScrollToPosition(this$0.m94545o().m109394h().size() - 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/LabeledDetailItemView;", "b", "Lco/bird/android/widget/standardcomponents/LabeledDetailItemView;", "labeledDetailItem", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQualityControlResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$AutoCheckViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,198:1\n18#2:199\n9#3,4:200\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$AutoCheckViewHolder\n*L\n144#1:199\n144#1:200,4\n*E\n"})
    /* renamed from: Vb4$c */
    /* loaded from: classes4.dex */
    public final class C8700c extends C29735w1 {

        /* renamed from: b */
        public final LabeledDetailItemView f39310b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39311c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8700c(C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39311c = c36540Vb4;
            this.f39310b = (LabeledDetailItemView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f39311c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof QCAutoCheck)) {
                m105816c = null;
            }
            QCAutoCheck qCAutoCheck = (QCAutoCheck) m105816c;
            if (qCAutoCheck != null) {
                this.f39310b.setLabel(qCAutoCheck.getDisplay());
                this.f39310b.setDetail(qCAutoCheck.getResult());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vb4$d */
    /* loaded from: classes4.dex */
    public final class C8701d extends C29735w1 {

        /* renamed from: b */
        public final Button f39312b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8701d(final C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39313c = c36540Vb4;
            Button button = (Button) view;
            this.f39312b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: Yb4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C36540Vb4.C8701d.m79693b(C36540Vb4.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m79693b(C36540Vb4 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f39304g.onNext(Unit.INSTANCE);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f39312b;
            button.setText(button.getResources().getString(C45871nl4.general_submit));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$e;", "Lw1;", "", "position", "", "bind", "Lxc2;", "b", "Lxc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQualityControlResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$InspectionFailedIssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,198:1\n18#2:199\n9#3,4:200\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$InspectionFailedIssueViewHolder\n*L\n132#1:199\n132#1:200,4\n*E\n"})
    /* renamed from: Vb4$e */
    /* loaded from: classes4.dex */
    public final class C8702e extends C29735w1 {

        /* renamed from: b */
        public final C51707xc2 f39314b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39315c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8702e(C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39315c = c36540Vb4;
            C51707xc2 m4949a = C51707xc2.m4949a(view);
            Intrinsics.checkNotNullExpressionValue(m4949a, "bind(view)");
            this.f39314b = m4949a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String capitalize;
            Object m105816c = this.f39315c.m94545o().m109394h().get(getAdapterPosition()).m105816c();
            if (!(m105816c instanceof C43399jb4)) {
                m105816c = null;
            }
            C43399jb4 c43399jb4 = (C43399jb4) m105816c;
            if (c43399jb4 != null) {
                this.f39314b.f117860c.setText(c43399jb4.m30216b());
                this.f39314b.f117861d.setText(c43399jb4.m30215c());
                TextView textView = this.f39314b.f117862e;
                String name = c43399jb4.m30214d().name();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                capitalize = StringsKt__StringsJVMKt.capitalize(lowerCase, locale2);
                textView.setText(capitalize);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$f;", "Lw1;", "", "position", "", "bind", "LQe2;", "b", "LQe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQualityControlResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$PassFailStatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,198:1\n18#2:199\n9#3,4:200\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$PassFailStatusViewHolder\n*L\n97#1:199\n97#1:200,4\n*E\n"})
    /* renamed from: Vb4$f */
    /* loaded from: classes4.dex */
    public final class C8703f extends C29735w1 {

        /* renamed from: b */
        public final C35395Qe2 f39316b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8703f(C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39317c = c36540Vb4;
            C35395Qe2 m88288a = C35395Qe2.m88288a(view);
            Intrinsics.checkNotNullExpressionValue(m88288a, "bind(view)");
            this.f39316b = m88288a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            int i3;
            Object m105816c = this.f39317c.m94545o().m109394h().get(getAdapterPosition()).m105816c();
            if (!(m105816c instanceof Boolean)) {
                m105816c = null;
            }
            Boolean bool = (Boolean) m105816c;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                TextView textView = this.f39316b.f30683c;
                if (booleanValue) {
                    i2 = C45871nl4.quality_control_success_title;
                } else {
                    i2 = C45871nl4.quality_control_fail_title;
                }
                textView.setText(C47712qr6.m16902c(this, i2));
                TextView textView2 = this.f39316b.f30682b;
                if (booleanValue) {
                    i3 = C45871nl4.quality_control_certify_success;
                } else {
                    i3 = C45871nl4.quality_control_fail_description;
                }
                textView2.setText(C47712qr6.m16902c(this, i3));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LVb4$g;", "Lw1;", "Lye2;", "b", "Lye2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vb4$g */
    /* loaded from: classes4.dex */
    public final class C8704g extends C29735w1 {

        /* renamed from: b */
        public final C52320ye2 f39318b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8704g(final C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39319c = c36540Vb4;
            C52320ye2 m3143a = C52320ye2.m3143a(view);
            Intrinsics.checkNotNullExpressionValue(m3143a, "bind(view)");
            this.f39318b = m3143a;
            m3143a.f119885b.setOnClickListener(new View.OnClickListener() { // from class: Zb4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C36540Vb4.C8704g.m79690e(C36540Vb4.this, view2);
                }
            });
            m3143a.f119886c.setOnClickListener(new View.OnClickListener() { // from class: ac4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C36540Vb4.C8704g.m79689i(C36540Vb4.this, view2);
                }
            });
        }

        /* renamed from: e */
        public static final void m79690e(C36540Vb4 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f39300c.onNext(Unit.INSTANCE);
        }

        /* renamed from: i */
        public static final void m79689i(C36540Vb4 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f39301d.onNext(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVb4$h;", "Lw1;", "", "position", "", "bind", "Lfg2;", "b", "Lfg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVb4;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQualityControlResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$VehicleImageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,198:1\n18#2:199\n9#3,4:200\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$VehicleImageViewHolder\n*L\n70#1:199\n70#1:200,4\n*E\n"})
    /* renamed from: Vb4$h */
    /* loaded from: classes4.dex */
    public final class C8705h extends C29735w1 {

        /* renamed from: b */
        public final C41075fg2 f39320b;

        /* renamed from: c */
        public final /* synthetic */ C36540Vb4 f39321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8705h(C36540Vb4 c36540Vb4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39321c = c36540Vb4;
            C41075fg2 m41043a = C41075fg2.m41043a(view);
            Intrinsics.checkNotNullExpressionValue(m41043a, "bind(view)");
            this.f39320b = m41043a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            if (r4 == null) goto L16;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            Drawable m16903b;
            Drawable m90445a;
            Object m105816c = this.f39321c.m94545o().m109394h().get(getAdapterPosition()).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                ImageView imageView = this.f39320b.f80441c;
                if (booleanValue) {
                    m16903b = C47712qr6.m16903b(this, C48193rg4.ic_thumbs_up_filled_small);
                } else {
                    m16903b = C47712qr6.m16903b(this, C48193rg4.ic_thumbs_down_filled_small);
                }
                imageView.setBackground(m16903b);
                ImageView imageView2 = this.f39320b.f80443e;
                BirdModel fromString = BirdModel.Companion.fromString((String) pair.getSecond());
                if (fromString != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    m90445a = C6327PM.m90445a(fromString, context);
                }
                BirdModel birdModel = BirdModel.B2;
                Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
                m90445a = C6327PM.m90445a(birdModel, context2);
                imageView2.setImageDrawable(m90445a);
            }
        }
    }

    public C36540Vb4() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f39300c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f39301d = m31902e2;
        C24558d<Unit> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Unit>()");
        this.f39302e = m31902e3;
        C24558d<String> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<String>()");
        this.f39303f = m31902e4;
        C24558d<Unit> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Unit>()");
        this.f39304g = m31902e5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C42223hc4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C38648bc4();
    }

    /* renamed from: v */
    public final Observable<Unit> m79704v() {
        Observable<Unit> hide = this.f39302e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addIssuesClickSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m79703w() {
        Observable<Unit> hide = this.f39304g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "failedSubmitClickSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Unit> m79702x() {
        Observable<Unit> hide = this.f39300c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "readyToRideClickSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<Unit> m79701y() {
        Observable<Unit> hide = this.f39301d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "stillDamagedClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C43489jk4.item_vehicle_pass_fail ? new C8705h(this, m41761u) : i == C43489jk4.item_qc_pass_fail_text ? new C8703f(this, m41761u) : i == C45268mk4.item_button_secondary ? new C8697a(this, m41761u) : i == C43489jk4.item_inspection_failed_issue ? new C8702e(this, m41761u) : i == C43489jk4.item_passed_qc_buttons ? new C8704g(this, m41761u) : i == C43489jk4.item_add_notes ? new C8698b(this, m41761u) : i == C45268mk4.item_button ? new C8701d(this, m41761u) : i == C43489jk4.item_auto_check ? new C8700c(this, m41761u) : new C29735w1(m41761u);
    }
}
