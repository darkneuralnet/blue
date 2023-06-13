package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\nJ\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e0\nR.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0014*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010 \u0014*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R>\u0010\u001b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0014*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e0\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006 "}, m28432d2 = {"LRu2;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "y5", "Lkotlin/Pair;", "LfN1;", "", "I7", "j8", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "localAddressChangesRelay", DateTokenConverter.CONVERTER_KEY, "hostEnablesRelay", "e", "hostPortChangesRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ru2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35773Ru2 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Optional<String>> f32859c;

    /* renamed from: d */
    public final C45168ma4<Pair<EnumC40897fN1, Boolean>> f32860d;

    /* renamed from: e */
    public final C45168ma4<Pair<EnumC40897fN1, Integer>> f32861e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LRu2$a;", "Lw1;", "", "position", "", "bind", "Lpc2;", "b", "Lpc2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(LRu2;Landroid/view/View;)V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalHostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder\n*L\n89#1:102\n89#1:103,4\n*E\n"})
    /* renamed from: Ru2$a */
    /* loaded from: classes3.dex */
    public final class C7284a extends C29735w1 {

        /* renamed from: b */
        public final C46965pc2 f32862b;

        /* renamed from: c */
        public boolean f32863c;

        /* renamed from: d */
        public final /* synthetic */ C35773Ru2 f32864d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalHostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$1\n*L\n73#1:102\n73#1:103,4\n*E\n"})
        /* renamed from: Ru2$a$a */
        /* loaded from: classes3.dex */
        public static final class C7285a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C35773Ru2 f32866h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7285a(C35773Ru2 c35773Ru2) {
                super(2);
                this.f32866h = c35773Ru2;
            }

            /* renamed from: a */
            public final void m86236a(CompoundButton compoundButton, boolean z) {
                if (C7284a.this.f32863c) {
                    return;
                }
                Object m105816c = this.f32866h.m94545o().m109397e(C7284a.this.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof C41490gN1)) {
                    m105816c = null;
                }
                C41490gN1 c41490gN1 = (C41490gN1) m105816c;
                if (c41490gN1 != null) {
                    this.f32866h.f32860d.accept(TuplesKt.m28425to(c41490gN1.m39566c(), Boolean.valueOf(z)));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m86236a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ru2$a$b */
        /* loaded from: classes3.dex */
        public static final class C7286b extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C35773Ru2 f32868h;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/text/Editable;", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Landroid/text/Editable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nLocalHostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$2$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$2$1\n*L\n81#1:102\n81#1:103,4\n*E\n"})
            /* renamed from: Ru2$a$b$a */
            /* loaded from: classes3.dex */
            public static final class C7287a extends Lambda implements Function1<Editable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C7284a f32869g;

                /* renamed from: h */
                public final /* synthetic */ C35773Ru2 f32870h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7287a(C7284a c7284a, C35773Ru2 c35773Ru2) {
                    super(1);
                    this.f32869g = c7284a;
                    this.f32870h = c35773Ru2;
                }

                /* renamed from: a */
                public final void m86234a(Editable editable) {
                    EnumC40897fN1 m39566c;
                    String obj;
                    if (this.f32869g.f32863c) {
                        return;
                    }
                    Object m105816c = this.f32870h.m94545o().m109397e(this.f32869g.getBindingAdapterPosition()).m105816c();
                    Integer num = null;
                    if (!(m105816c instanceof C41490gN1)) {
                        m105816c = null;
                    }
                    C41490gN1 c41490gN1 = (C41490gN1) m105816c;
                    if (c41490gN1 != null && (m39566c = c41490gN1.m39566c()) != null) {
                        C45168ma4 c45168ma4 = this.f32870h.f32861e;
                        if (editable != null && (obj = editable.toString()) != null) {
                            num = StringsKt__StringNumberConversionsKt.toIntOrNull(obj);
                        }
                        c45168ma4.accept(TuplesKt.m28425to(m39566c, num));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    m86234a(editable);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7286b(C35773Ru2 c35773Ru2) {
                super(1);
                this.f32868h = c35773Ru2;
            }

            /* renamed from: a */
            public final void m86235a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104031a(new C7287a(C7284a.this, this.f32868h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m86235a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7284a(C35773Ru2 c35773Ru2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f32864d = c35773Ru2;
            C46965pc2 m19066a = C46965pc2.m19066a(view);
            Intrinsics.checkNotNullExpressionValue(m19066a, "bind(view)");
            this.f32862b = m19066a;
            SwitchMaterial switchMaterial = m19066a.f103851d;
            Intrinsics.checkNotNullExpressionValue(switchMaterial, "binding.switch2");
            C34585Ms2.m94663h(switchMaterial, new C7285a(c35773Ru2));
            EditText editText = m19066a.f103850c;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.port");
            C34585Ms2.m94647x(editText, new C7286b(c35773Ru2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f32863c = true;
            Object m105816c = this.f32864d.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof C41490gN1)) {
                m105816c = null;
            }
            C41490gN1 c41490gN1 = (C41490gN1) m105816c;
            if (c41490gN1 != null) {
                this.f32862b.f103851d.setChecked(c41490gN1.m39567b());
                this.f32862b.f103849b.setText(c41490gN1.m39566c().m41479b());
                this.f32862b.f103850c.setHint(String.valueOf(c41490gN1.m39566c().m41478c()));
                EditText editText = this.f32862b.f103850c;
                Integer m39565d = c41490gN1.m39565d();
                if (m39565d != null) {
                    str = m39565d.toString();
                }
                editText.setText(str);
                this.f32862b.f103850c.setEnabled(c41490gN1.m39567b());
            }
            this.f32863c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LRu2$b;", "Lw1;", "", "position", "", "bind", "Lld2;", "b", "Lld2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(LRu2;Landroid/view/View;)V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalHostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$LocalAddressViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n18#2:107\n9#3,4:103\n9#3,4:108\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$LocalAddressViewHolder\n*L\n60#1:102\n61#1:107\n60#1:103,4\n61#1:108,4\n*E\n"})
    /* renamed from: Ru2$b */
    /* loaded from: classes3.dex */
    public final class C7288b extends C29735w1 {

        /* renamed from: b */
        public final C44603ld2 f32871b;

        /* renamed from: c */
        public boolean f32872c;

        /* renamed from: d */
        public final /* synthetic */ C35773Ru2 f32873d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ru2$b$a */
        /* loaded from: classes3.dex */
        public static final class C7289a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C35773Ru2 f32875h;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/text/Editable;", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Landroid/text/Editable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ru2$b$a$a */
            /* loaded from: classes3.dex */
            public static final class C7290a extends Lambda implements Function1<Editable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C7288b f32876g;

                /* renamed from: h */
                public final /* synthetic */ C35773Ru2 f32877h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7290a(C7288b c7288b, C35773Ru2 c35773Ru2) {
                    super(1);
                    this.f32876g = c7288b;
                    this.f32877h = c35773Ru2;
                }

                /* renamed from: a */
                public final void m86230a(Editable editable) {
                    String str;
                    if (this.f32876g.f32872c) {
                        return;
                    }
                    C45168ma4 c45168ma4 = this.f32877h.f32859c;
                    Optional.C14443a c14443a = Optional.f63040c;
                    if (editable != null) {
                        str = editable.toString();
                    } else {
                        str = null;
                    }
                    c45168ma4.accept(c14443a.m59033b(str));
                    EditText editText = this.f32876g.f32871b.f96448d;
                    editText.setText(((Object) editable) + ":%d");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    m86230a(editable);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7289a(C35773Ru2 c35773Ru2) {
                super(1);
                this.f32875h = c35773Ru2;
            }

            /* renamed from: a */
            public final void m86231a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104031a(new C7290a(C7288b.this, this.f32875h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m86231a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7288b(C35773Ru2 c35773Ru2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f32873d = c35773Ru2;
            C44603ld2 m27080a = C44603ld2.m27080a(view);
            Intrinsics.checkNotNullExpressionValue(m27080a, "bind(view)");
            this.f32871b = m27080a;
            EditText editText = m27080a.f96447c;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.localAddress");
            C34585Ms2.m94647x(editText, new C7289a(c35773Ru2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f32872c = true;
            EditText editText = this.f32871b.f96447c;
            Object m105816c = this.f32873d.m94545o().m109397e(i).m105816c();
            Object obj = null;
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            editText.setText((CharSequence) m105816c);
            EditText editText2 = this.f32871b.f96448d;
            Object m105816c2 = this.f32873d.m94545o().m109397e(i).m105816c();
            if (m105816c2 instanceof String) {
                obj = m105816c2;
            }
            editText2.setText(obj + ":%d");
            this.f32872c = false;
        }
    }

    public C35773Ru2() {
        C45168ma4<Optional<String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Optional<String>>()");
        this.f32859c = m25409g;
        C45168ma4<Pair<EnumC40897fN1, Boolean>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Pair<Host, Boolean>>()");
        this.f32860d = m25409g2;
        C45168ma4<Pair<EnumC40897fN1, Integer>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Pair<Host, Int?>>()");
        this.f32861e = m25409g3;
    }

    /* renamed from: I7 */
    public final Observable<Pair<EnumC40897fN1, Boolean>> m86240I7() {
        Observable<Pair<EnumC40897fN1, Boolean>> hide = this.f32860d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hostEnablesRelay.hide()");
        return hide;
    }

    /* renamed from: j8 */
    public final Observable<Pair<EnumC40897fN1, Integer>> m86239j8() {
        Observable<Pair<EnumC40897fN1, Integer>> hide = this.f32861e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hostPortChangesRelay.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C36007Su2();
    }

    /* renamed from: y5 */
    public final Observable<Optional<String>> m86238y5() {
        Observable<Optional<String>> hide = this.f32859c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "localAddressChangesRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C43479jj4.item_local_address ? new C7288b(this, m41761u) : i == C43479jj4.item_host ? new C7284a(this, m41761u) : new C29735w1(m41761u);
    }
}
