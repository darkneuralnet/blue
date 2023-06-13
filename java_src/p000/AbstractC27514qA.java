package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.DamageTrack;
import co.bird.android.model.Detail;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairLog;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.AbstractC27514qA;
import p000.AbstractC36392Ul0;
import p000.C53094zw3;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001:\t\u0014\u0015\u0016\u0017\r\u0018\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"LqA;", "LoA;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/model/CommandCenterButton;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "D", "()Lio/reactivex/subjects/d;", "buttonSubject", "<init>", "()V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "f", "g", "h", "i", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qA */
/* loaded from: classes2.dex */
public abstract class AbstractC27514qA extends AbstractC26846oA {

    /* renamed from: e */
    public final C24558d<CommandCenterButton> f104793e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n18#2:215\n18#2:220\n9#3,4:216\n9#3,4:221\n1#4:225\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$ButtonViewHolder\n*L\n88#1:215\n81#1:220\n88#1:216,4\n81#1:221,4\n*E\n"})
    /* renamed from: qA$a */
    /* loaded from: classes2.dex */
    public final class C27515a extends C29735w1 {

        /* renamed from: b */
        public final Button f104794b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27515a(final AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104795c = abstractC27514qA;
            Button button = (Button) view;
            this.f104794b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: pA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC27514qA.C27515a.m18036b(AbstractC27514qA.C27515a.this, abstractC27514qA, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m18036b(C27515a this$0, AbstractC27514qA this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.getAdapterPosition() != -1) {
                Object m105816c = this$1.m94545o().m109394h().get(this$0.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof CommandCenterButton)) {
                    m105816c = null;
                }
                CommandCenterButton commandCenterButton = (CommandCenterButton) m105816c;
                if (commandCenterButton != null) {
                    this$1.m18038D().onNext(commandCenterButton);
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104795c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof CommandCenterButton)) {
                m105816c = null;
            }
            CommandCenterButton commandCenterButton = (CommandCenterButton) m105816c;
            Button button = this.f104794b;
            if (commandCenterButton != null) {
                str = commandCenterButton.getText();
            }
            button.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$b;", "Lw1;", "", "position", "", "bind", "Lrb2;", "b", "Lrb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DetailViewHolder\n*L\n165#1:215\n165#1:216,4\n*E\n"})
    /* renamed from: qA$b */
    /* loaded from: classes2.dex */
    public final class C27516b extends C29735w1 {

        /* renamed from: b */
        public final C48141rb2 f104796b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104797c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "it", "", C17296a.f69688o, "(Landroid/view/View;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DetailViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DetailViewHolder$1\n*L\n145#1:215\n145#1:216,4\n*E\n"})
        /* renamed from: qA$b$a */
        /* loaded from: classes2.dex */
        public static final class C27517a extends Lambda implements Function1<View, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC27514qA f104798g;

            /* renamed from: h */
            public final /* synthetic */ C27516b f104799h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27517a(AbstractC27514qA abstractC27514qA, C27516b c27516b) {
                super(1);
                this.f104798g = abstractC27514qA;
                this.f104799h = c27516b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(View view) {
                Object m105816c = this.f104798g.m94545o().m109396f(this.f104799h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Detail)) {
                    m105816c = null;
                }
                Detail detail = (Detail) m105816c;
                if (detail == null) {
                    return Boolean.FALSE;
                }
                if (detail.detailIsNotBlank()) {
                    Object systemService = this.f104799h.itemView.getContext().getSystemService("clipboard");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(detail.getTitle(), detail.getDetail()));
                    C53094zw3.C31593a c31593a = C53094zw3.f122502a;
                    Context context = this.f104799h.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    String string = this.f104799h.itemView.getContext().getString(C45871nl4.command_center_details_copied_toast_format, detail.getTitle());
                    Intrinsics.checkNotNullExpressionValue(string, "itemView.context.getStri…ast_format, detail.title)");
                    C53094zw3.C31593a.makeText$default(c31593a, context, string, 1, 0, null, 24, null).show();
                }
                return Boolean.FALSE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27516b(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104797c = abstractC27514qA;
            C48141rb2 m15721a = C48141rb2.m15721a(view);
            Intrinsics.checkNotNullExpressionValue(m15721a, "bind(view)");
            this.f104796b = m15721a;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94653r(itemView, new C27517a(abstractC27514qA, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104797c.m94545o().m109396f(i).m105816c();
            if (!(m105816c instanceof Detail)) {
                m105816c = null;
            }
            Detail detail = (Detail) m105816c;
            if (detail != null) {
                String string = this.itemView.getContext().getString(C45871nl4.command_center_details_format, detail.getTitle(), detail.getDetail());
                Intrinsics.checkNotNullExpressionValue(string, "itemView.context.getStri…  detail.detail\n        )");
                SpannableString span$default = C45097mS5.span$default(string, detail.getDetail(), null, 2, null);
                if (detail.getTextColor() != null) {
                    String detail2 = detail.getDetail();
                    Integer textColor = detail.getTextColor();
                    Intrinsics.checkNotNull(textColor);
                    span$default = C45097mS5.m25592n(span$default, detail2, new ForegroundColorSpan(textColor.intValue()));
                }
                this.f104796b.f107307b.setText(span$default);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$c;", "Lw1;", "", "position", "", "bind", "Lsb2;", "b", "Lsb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DiagnosticViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n1#4:220\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$DiagnosticViewHolder\n*L\n131#1:215\n131#1:216,4\n*E\n"})
    /* renamed from: qA$c */
    /* loaded from: classes2.dex */
    public final class C27518c extends C29735w1 {

        /* renamed from: b */
        public final C48733sb2 f104800b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27518c(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104801c = abstractC27514qA;
            C48733sb2 m13964a = C48733sb2.m13964a(view);
            Intrinsics.checkNotNullExpressionValue(m13964a, "bind(view)");
            this.f104800b = m13964a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
            if (r10 != null) goto L13;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            String string;
            Object m105816c = this.f104801c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof DamageTrack)) {
                m105816c = null;
            }
            DamageTrack damageTrack = (DamageTrack) m105816c;
            if (damageTrack != null) {
                this.f104800b.f109023b.setText(this.itemView.getContext().getString(C45871nl4.command_center_diagnostic_format, damageTrack.getCodeHeader(), Integer.valueOf(damageTrack.getCode())));
                Integer textColor = damageTrack.getTextColor();
                if (textColor != null) {
                    TextView textView = this.f104800b.f109023b;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.diagnosis");
                    textView.setTextColor(textColor.intValue());
                }
                TextView textView2 = this.f104800b.f109024c;
                DateTime createdAtTime = damageTrack.getCreatedAtTime();
                if (createdAtTime != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    string = C46880pT0.getElapsedTime$default(createdAtTime, context, false, 2, null);
                }
                string = this.itemView.getContext().getString(C45871nl4.time_elapsed_greater_than_a_month);
                textView2.setText(string);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$d;", "Lw1;", "", "position", "", "bind", "Ltb2;", "b", "Ltb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$EmptyStateViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$EmptyStateViewHolder\n*L\n210#1:215\n210#1:216,4\n*E\n"})
    /* renamed from: qA$d */
    /* loaded from: classes2.dex */
    public final class C27519d extends C29735w1 {

        /* renamed from: b */
        public final C49326tb2 f104802b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27519d(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104803c = abstractC27514qA;
            C49326tb2 m12025a = C49326tb2.m12025a(view);
            Intrinsics.checkNotNullExpressionValue(m12025a, "bind(view)");
            this.f104802b = m12025a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f104802b.f110776b;
            Object m105816c = this.f104803c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$e;", "Lw1;", "", "position", "", "bind", "Lub2;", "b", "Lub2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$NoticeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$NoticeViewHolder\n*L\n97#1:215\n97#1:216,4\n*E\n"})
    /* renamed from: qA$e */
    /* loaded from: classes2.dex */
    public final class C27520e extends C29735w1 {

        /* renamed from: b */
        public final C49919ub2 f104804b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27520e(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104805c = abstractC27514qA;
            C49919ub2 m10002a = C49919ub2.m10002a(view);
            Intrinsics.checkNotNullExpressionValue(m10002a, "bind(view)");
            this.f104804b = m10002a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104805c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof CommandCenterNotice)) {
                m105816c = null;
            }
            CommandCenterNotice commandCenterNotice = (CommandCenterNotice) m105816c;
            if (commandCenterNotice == null) {
                return;
            }
            TextView textView = this.f104804b.f112658b;
            textView.setText(commandCenterNotice.getMessage());
            textView.setTextColor(commandCenterNotice.getTextColor());
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$f;", "Lw1;", "", "position", "", "bind", "Lvb2;", "b", "Lvb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$RepairLogViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$RepairLogViewHolder\n*L\n189#1:215\n189#1:216,4\n*E\n"})
    /* renamed from: qA$f */
    /* loaded from: classes2.dex */
    public final class C27521f extends C29735w1 {

        /* renamed from: b */
        public final C50511vb2 f104806b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104807c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27521f(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104807c = abstractC27514qA;
            C50511vb2 m8399a = C50511vb2.m8399a(view);
            Intrinsics.checkNotNullExpressionValue(m8399a, "bind(view)");
            this.f104806b = m8399a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
            if (r2 != null) goto L10;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            String createdAt;
            boolean z;
            boolean isBlank;
            Object m105816c = this.f104807c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof RepairLog)) {
                m105816c = null;
            }
            RepairLog repairLog = (RepairLog) m105816c;
            if (repairLog != null) {
                this.f104806b.f114367c.setText(repairLog.getRepairType());
                this.f104806b.f114370f.setText(repairLog.getRepairSubType());
                this.f104806b.f114368d.setText(repairLog.getRepairerEmail());
                this.f104806b.f114369e.setText(repairLog.getRepairerRole());
                TextView textView = this.f104806b.f114366b;
                DateTime createdAtTime = repairLog.getCreatedAtTime();
                if (createdAtTime != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    createdAt = C46880pT0.getElapsedTime$default(createdAtTime, context, false, 2, null);
                }
                createdAt = repairLog.getCreatedAt();
                textView.setText(createdAt);
                TextView textView2 = this.f104806b.f114370f;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.subtype");
                String repairSubType = repairLog.getRepairSubType();
                if (repairSubType != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(repairSubType);
                    if (!isBlank) {
                        z = false;
                        C49520tu6.show$default(textView2, !z, 0, 2, null);
                    }
                }
                z = true;
                C49520tu6.show$default(textView2, !z, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$g;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "vehicleSummaryView", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n1#4:220\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$VehicleSummaryViewHolder\n*L\n71#1:215\n71#1:216,4\n*E\n"})
    /* renamed from: qA$g */
    /* loaded from: classes2.dex */
    public final class C27522g extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f104808b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27522g(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104809c = abstractC27514qA;
            this.f104808b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104809c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f104808b.m54355e(c50043un6);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$h;", "Lw1;", "", "position", "", "bind", "Lrg2;", "b", "Lrg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$WorkOrderHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$WorkOrderHeaderViewHolder\n*L\n109#1:215\n109#1:216,4\n*E\n"})
    /* renamed from: qA$h */
    /* loaded from: classes2.dex */
    public final class C27523h extends C29735w1 {

        /* renamed from: b */
        public final C48191rg2 f104810b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27523h(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104811c = abstractC27514qA;
            C48191rg2 m15583a = C48191rg2.m15583a(view);
            Intrinsics.checkNotNullExpressionValue(m15583a, "bind(view)");
            this.f104810b = m15583a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView textView = this.f104810b.f107474b;
            Object m105816c = this.f104811c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LqA$i;", "Lw1;", "", "position", "", "bind", "Lsg2;", "b", "Lsg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LqA;Landroid/view/View;)V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$WorkOrderIssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n1#4:220\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$WorkOrderIssueViewHolder\n*L\n117#1:215\n117#1:216,4\n*E\n"})
    /* renamed from: qA$i */
    /* loaded from: classes2.dex */
    public final class C27524i extends C29735w1 {

        /* renamed from: b */
        public final C48783sg2 f104812b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC27514qA f104813c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27524i(AbstractC27514qA abstractC27514qA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104813c = abstractC27514qA;
            C48783sg2 m13852a = C48783sg2.m13852a(view);
            Intrinsics.checkNotNullExpressionValue(m13852a, "bind(view)");
            this.f104812b = m13852a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104813c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Issue)) {
                m105816c = null;
            }
            Issue issue = (Issue) m105816c;
            if (issue != null) {
                this.f104812b.f109095b.setText(issue.getDisplay());
                this.f104812b.f109096c.setText(issue.getSourceDisplay());
                TextView textView = this.f104812b.f109097d;
                String statusDisplay = issue.getStatusDisplay();
                if (statusDisplay != null) {
                    str = StringsKt__StringsJVMKt.capitalize(statusDisplay);
                }
                textView.setText(str);
                Integer statusColor = issue.getStatusColor();
                if (statusColor != null) {
                    TextView textView2 = this.f104812b.f109097d;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.status");
                    textView2.setTextColor(statusColor.intValue());
                }
            }
        }
    }

    public AbstractC27514qA() {
        C24558d<CommandCenterButton> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<CommandCenterButton>()");
        this.f104793e = m31902e;
    }

    /* renamed from: C */
    public final Observable<CommandCenterButton> m18039C() {
        Observable<CommandCenterButton> hide = this.f104793e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "buttonSubject.hide()");
        return hide;
    }

    /* renamed from: D */
    public final C24558d<CommandCenterButton> m18038D() {
        return this.f104793e;
    }

    @Override // p000.AbstractC26846oA, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C45851nj4.item_vehicle_summary) {
            return new C27522g(this, m41761u);
        }
        if (i != C45268mk4.item_button && i != C45268mk4.item_button_secondary) {
            return i == C52372yj4.item_work_order_header ? new C27523h(this, m41761u) : i == C52372yj4.item_work_order_issue_header ? new C27524i(this, m41761u) : i == C52372yj4.item_command_center_notice ? new C27520e(this, m41761u) : i == C52372yj4.item_command_center_header ? new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u) : i == C52372yj4.item_command_center_diagnostic ? new C27518c(this, m41761u) : i == C52372yj4.item_command_center_details ? new C27516b(this, m41761u) : i == C52372yj4.item_command_center_repair_log ? new C27521f(this, m41761u) : i == C52372yj4.item_command_center_empty_state ? new C27519d(this, m41761u) : super.onCreateViewHolder(parent, i);
        }
        return new C27515a(this, m41761u);
    }
}
