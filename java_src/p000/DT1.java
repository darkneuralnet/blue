package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationGender;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.DT1;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*\u001eB\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011J\u0006\u0010\u001b\u001a\u00020\u001aR*\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u001d*\b\u0012\u0002\b\u0003\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00140\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\"\u0010$\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00160\u00160\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\"\u0010&\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00180\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001f¨\u0006+"}, m28432d2 = {"LDT1;", "LMy;", "Lh0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "holder", "position", "", "B", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "LlT1;", "x", "Lco/bird/android/model/identification/IdentificationGender;", "y", "Ljava/util/Locale;", "v", "Lco/bird/android/model/identification/IdentificationDocumentType;", "w", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "A", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "formFieldClicksSubject", DateTokenConverter.CONVERTER_KEY, "genderClicksSubject", "e", "countryClicksSubject", "f", "documentTypeClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1855#2,2:239\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter\n*L\n73#1:239,2\n*E\n"})
/* renamed from: DT1 */
/* loaded from: classes3.dex */
public final class DT1 extends AbstractC5440My<C22528h0> {

    /* renamed from: c */
    public final C24558d<C44509lT1<?>> f5735c;

    /* renamed from: d */
    public final C24558d<IdentificationGender> f5736d;

    /* renamed from: e */
    public final C24558d<Locale> f5737e;

    /* renamed from: f */
    public final C24558d<IdentificationDocumentType> f5738f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LDT1$a;", "Lh0;", "", "position", "", "bind", "Landroid/view/View;", "f", "Landroid/view/View;", "view", "Lcc2;", "g", "Lcc2;", "binding", "<init>", "(LDT1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n180#4:244\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder\n*L\n166#1:239\n166#1:240,4\n199#1:244\n*E\n"})
    /* renamed from: DT1$a */
    /* loaded from: classes3.dex */
    public final class C1484a extends C22528h0 {

        /* renamed from: f */
        public final View f5739f;

        /* renamed from: g */
        public final C39239cc2 f5740g;

        /* renamed from: h */
        public final /* synthetic */ DT1 f5741h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$1\n*L\n140#1:239\n140#1:240,4\n*E\n"})
        /* renamed from: DT1$a$a */
        /* loaded from: classes3.dex */
        public static final class C1485a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ DT1 f5742g;

            /* renamed from: h */
            public final /* synthetic */ C1484a f5743h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: DT1$a$a$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C1486a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IdentificationManualEntryFormField.values().length];
                    try {
                        iArr[IdentificationManualEntryFormField.ISSUE_DATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IdentificationManualEntryFormField.EXPIRATION_DATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[IdentificationManualEntryFormField.DATE_OF_BIRTH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[IdentificationManualEntryFormField.ISSUING_AUTHORITY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1485a(DT1 dt1, C1484a c1484a) {
                super(1);
                this.f5742g = dt1;
                this.f5743h = c1484a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C41318g46.m40163a("view clicked " + view, new Object[0]);
                C1737E6 m94545o = this.f5742g.m94545o();
                Integer safePosition = this.f5743h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C44509lT1)) {
                        m105816c = null;
                    }
                    C44509lT1 c44509lT1 = (C44509lT1) m105816c;
                    if (c44509lT1 != null) {
                        DT1 dt1 = this.f5742g;
                        C1484a c1484a = this.f5743h;
                        C41318g46.m40163a("model referenced " + c44509lT1 + " with " + c44509lT1.m27260e() + " type", new Object[0]);
                        int i = C1486a.$EnumSwitchMapping$0[c44509lT1.m27262c().ordinal()];
                        if (i == 1 || i == 2 || i == 3) {
                            C41318g46.m40163a("date time edit text was focused", new Object[0]);
                            dt1.f5735c.onNext(c44509lT1);
                        } else if (i != 4) {
                            EditText editText = c1484a.f5740g.f60945c.getEditText();
                            C41318g46.m40163a("form field clicked but not set up to respond, is focusable? " + (editText != null ? Boolean.valueOf(editText.isFocusable()) : null), new Object[0]);
                            c1484a.f5740g.f60944b.requestFocus();
                        } else {
                            EditText editText2 = c1484a.f5740g.f60945c.getEditText();
                            C41318g46.m40163a("issuing authority field clicked, is focusable? " + (editText2 != null ? Boolean.valueOf(editText2.isFocusable()) : null), new Object[0]);
                            c1484a.f5740g.f60944b.requestFocusFromTouch();
                            TextInputEditText textInputEditText = c1484a.f5740g.f60944b;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.editText");
                            ET1.m108944a(textInputEditText);
                        }
                    }
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: DT1$a$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C1487b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentificationManualEntryFormField.values().length];
                try {
                    iArr[IdentificationManualEntryFormField.FIRST_NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IdentificationManualEntryFormField.MIDDLE_NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IdentificationManualEntryFormField.LAST_NAME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IdentificationManualEntryFormField.ID_NUMBER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "newValue", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$bind$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$bind$2\n*L\n204#1:239\n204#1:240,4\n*E\n"})
        /* renamed from: DT1$a$c */
        /* loaded from: classes3.dex */
        public static final class C1488c extends Lambda implements Function1<String, Unit> {

            /* renamed from: h */
            public final /* synthetic */ DT1 f5745h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1488c(DT1 dt1) {
                super(1);
                this.f5745h = dt1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                C44509lT1 copy$default;
                C1484a.this.f5740g.f60945c.setError(null);
                Integer safePosition = C1484a.this.getSafePosition();
                if (safePosition != null) {
                    int intValue = safePosition.intValue();
                    C2637G6 m109397e = this.f5745h.m94545o().m109397e(intValue);
                    Object m105816c = m109397e.m105816c();
                    C44509lT1 c44509lT1 = m105816c instanceof C44509lT1 ? m105816c : null;
                    if (c44509lT1 == null || (copy$default = C44509lT1.copy$default(c44509lT1, null, null, null, str, false, 23, null)) == null) {
                        return;
                    }
                    this.f5745h.m94545o().m109390l(intValue, C2637G6.copy$default(m109397e, copy$default, 0, false, 6, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1484a(DT1 dt1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5741h = dt1;
            this.f5739f = view;
            C39239cc2 m61178a = C39239cc2.m61178a(view);
            Intrinsics.checkNotNullExpressionValue(m61178a, "bind(view)");
            this.f5740g = m61178a;
            EditText editText = m61178a.f60945c.getEditText();
            if (editText != null) {
                C34585Ms2.m94661j(editText, new C1485a(dt1, this));
            }
        }

        /* renamed from: t */
        public static final void m110404t(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // p000.C22528h0
        public void bind(int i) {
            List listOf;
            String str;
            int i2;
            Editable text;
            super.bind(i);
            Object m105816c = this.f5741h.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C44509lT1)) {
                m105816c = null;
            }
            C44509lT1 c44509lT1 = (C44509lT1) m105816c;
            if (c44509lT1 != null) {
                this.f5740g.f60945c.setHint(c44509lT1.m27261d());
                this.f5740g.f60945c.setError(c44509lT1.m27263b());
                this.f5740g.f60944b.setId(ET1.m108943b(c44509lT1.m27262c()));
                int i3 = C1487b.$EnumSwitchMapping$0[c44509lT1.m27262c().ordinal()];
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        this.f5740g.f60944b.setInputType(0);
                    } else {
                        this.f5740g.f60944b.setInputType(8192);
                    }
                } else {
                    this.f5740g.f60944b.setInputType(96);
                }
                TextInputEditText textInputEditText = this.f5740g.f60944b;
                IdentificationManualEntryFormField m27262c = c44509lT1.m27262c();
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new IdentificationManualEntryFormField[]{IdentificationManualEntryFormField.DATE_OF_BIRTH, IdentificationManualEntryFormField.EXPIRATION_DATE, IdentificationManualEntryFormField.ISSUE_DATE});
                textInputEditText.setFocusable(!C10733aZ.m71221a(m27262c, listOf));
                TextInputEditText textInputEditText2 = this.f5740g.f60944b;
                Object m27260e = c44509lT1.m27260e();
                if (m27260e instanceof DateTime) {
                    str = ((DateTime) m27260e).toLocalDate().toString();
                } else if (m27260e instanceof String) {
                    str = (String) m27260e;
                } else if (m27260e != null) {
                    str = m27260e.toString();
                } else {
                    str = null;
                }
                textInputEditText2.setText(str);
                C39239cc2 c39239cc2 = this.f5740g;
                TextInputEditText textInputEditText3 = c39239cc2.f60944b;
                EditText editText = c39239cc2.f60945c.getEditText();
                if (editText != null && (text = editText.getText()) != null) {
                    i2 = text.length();
                } else {
                    i2 = 0;
                }
                textInputEditText3.setSelection(i2);
            }
            TextInputEditText textInputEditText4 = this.f5740g.f60944b;
            Intrinsics.checkNotNullExpressionValue(textInputEditText4, "binding.editText");
            Object m33094as = C44626lf5.textChanges$default(textInputEditText4, 300, false, 2, null).m33094as(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C1488c c1488c = new C1488c(this.f5741h);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: CT1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    DT1.C1484a.m110404t(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDT1$b;", "Lh0;", "", "position", "", "bind", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(LDT1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$HeaderViewHolder\n*L\n95#1:239\n95#1:240,4\n*E\n"})
    /* renamed from: DT1$b */
    /* loaded from: classes3.dex */
    public final class C1489b extends C22528h0 {

        /* renamed from: f */
        public final TextView f5746f;

        /* renamed from: g */
        public final /* synthetic */ DT1 f5747g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1489b(DT1 dt1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5747g = dt1;
            this.f5746f = (TextView) view;
        }

        @Override // p000.C22528h0
        public void bind(int i) {
            boolean z;
            C49520tu6.m11233r(this.f5746f);
            TextView textView = this.f5746f;
            Object m105816c = this.f5747g.m94545o().m109394h().get(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDT1$c;", "Lh0;", "", "position", "", "bind", "Lnd2;", "f", "Lnd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDT1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n1#4:244\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder\n*L\n124#1:239\n124#1:240,4\n*E\n"})
    /* renamed from: DT1$c */
    /* loaded from: classes3.dex */
    public final class C1490c extends C22528h0 {

        /* renamed from: f */
        public final C45789nd2 f5748f;

        /* renamed from: g */
        public final /* synthetic */ DT1 f5749g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder$1\n*L\n104#1:239\n104#1:240,4\n*E\n"})
        /* renamed from: DT1$c$a */
        /* loaded from: classes3.dex */
        public static final class C1491a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ DT1 f5750g;

            /* renamed from: h */
            public final /* synthetic */ C1490c f5751h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1491a(DT1 dt1, C1490c c1490c) {
                super(1);
                this.f5750g = dt1;
                this.f5751h = c1490c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f5750g.m94545o();
                Integer safePosition = this.f5751h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    Object obj = null;
                    if (!(m105816c instanceof C45704nU1)) {
                        m105816c = null;
                    }
                    C45704nU1 c45704nU1 = (C45704nU1) m105816c;
                    if (c45704nU1 != null) {
                        DT1 dt1 = this.f5750g;
                        if (c45704nU1.m23613f() != null) {
                            obj = c45704nU1.m23613f();
                        } else if (c45704nU1.m23616c() == IdentificationManualEntryFormField.NATIONALITY) {
                            obj = Locale.getDefault();
                        } else if (c45704nU1.m23616c() == IdentificationManualEntryFormField.GENDER) {
                            obj = IdentificationGender.UNKNOWN;
                        }
                        if (obj instanceof Locale) {
                            dt1.f5737e.onNext(obj);
                        } else if (obj instanceof IdentificationGender) {
                            dt1.f5736d.onNext(obj);
                        } else if (obj instanceof IdentificationDocumentType) {
                            dt1.f5738f.onNext(obj);
                        } else {
                            C41318g46.m40163a("Unknown data type encountered when clicking on view in Manual Entry Form recycler view", new Object[0]);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1490c(DT1 dt1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5749g = dt1;
            C45789nd2 m23410a = C45789nd2.m23410a(view);
            Intrinsics.checkNotNullExpressionValue(m23410a, "bind(view)");
            this.f5748f = m23410a;
            C34585Ms2.m94661j(view, new C1491a(dt1, this));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        @Override // p000.C22528h0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            boolean z;
            Integer m23617b;
            boolean isBlank;
            super.bind(i);
            Object m105816c = this.f5749g.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C45704nU1)) {
                m105816c = null;
            }
            C45704nU1 c45704nU1 = (C45704nU1) m105816c;
            if (c45704nU1 != null) {
                this.f5748f.f100218d.setText(c45704nU1.m23614e());
                this.f5748f.f100217c.setText(c45704nU1.m23615d());
                TextView textView = this.f5748f.f100217c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.messageView");
                String m23615d = c45704nU1.m23615d();
                boolean z2 = true;
                if (m23615d != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(m23615d);
                    if (!isBlank) {
                        z = false;
                        C49520tu6.show$default(textView, !z, 0, 2, null);
                        m23617b = c45704nU1.m23617b();
                        if (m23617b != null) {
                            ImageView imageView = this.f5748f.f100216b;
                            Intrinsics.checkNotNullExpressionValue(imageView, "binding.endIconView");
                            imageView.setImageResource(m23617b.intValue());
                        }
                        ImageView imageView2 = this.f5748f.f100216b;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.endIconView");
                        if (c45704nU1.m23617b() == null) {
                            z2 = false;
                        }
                        C49520tu6.show$default(imageView2, z2, 0, 2, null);
                    }
                }
                z = true;
                C49520tu6.show$default(textView, !z, 0, 2, null);
                m23617b = c45704nU1.m23617b();
                if (m23617b != null) {
                }
                ImageView imageView22 = this.f5748f.f100216b;
                Intrinsics.checkNotNullExpressionValue(imageView22, "binding.endIconView");
                if (c45704nU1.m23617b() == null) {
                }
                C49520tu6.show$default(imageView22, z2, 0, 2, null);
            }
        }
    }

    public DT1() {
        C24558d<C44509lT1<?>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<IdentificationEditTextViewModel<*>>()");
        this.f5735c = m31902e;
        C24558d<IdentificationGender> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<IdentificationGender>()");
        this.f5736d = m31902e2;
        C24558d<Locale> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Locale>()");
        this.f5737e = m31902e3;
        C24558d<IdentificationDocumentType> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<IdentificationDocumentType>()");
        this.f5738f = m31902e4;
    }

    /* renamed from: A */
    public final IdentificationManualEntryFormData m110413A() {
        C41318g46.m40163a("get form data called", new Object[0]);
        IdentificationManualEntryFormData identificationManualEntryFormData = new IdentificationManualEntryFormData(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        for (C2637G6 c2637g6 : m94545o().m109394h()) {
            Object m105816c = c2637g6.m105816c();
            if (m105816c instanceof C45704nU1) {
                C45704nU1 c45704nU1 = (C45704nU1) m105816c;
                IdentificationManualEntryFormField m23616c = c45704nU1.m23616c();
                Object m23613f = c45704nU1.m23613f();
                C41318g46.m40163a("Updating form data for " + m23616c + " to " + m23613f, new Object[0]);
                identificationManualEntryFormData = identificationManualEntryFormData.updateForm(c45704nU1.m23616c(), c45704nU1.m23613f());
            } else if (m105816c instanceof C44509lT1) {
                C44509lT1 c44509lT1 = (C44509lT1) m105816c;
                IdentificationManualEntryFormField m27262c = c44509lT1.m27262c();
                Object m27260e = c44509lT1.m27260e();
                C41318g46.m40163a("Updating edit text form data for " + m27262c + " to " + m27260e, new Object[0]);
                identificationManualEntryFormData = identificationManualEntryFormData.updateForm(c44509lT1.m27262c(), c44509lT1.m27260e());
            }
        }
        C41318g46.m40163a("returning " + identificationManualEntryFormData + " as form data", new Object[0]);
        return identificationManualEntryFormData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: B */
    public void onBindViewHolder(C22528h0 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: C */
    public C22528h0 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C42293hj4.item_selector_header) {
            return new C1489b(this, m41761u);
        }
        if (i == C42293hj4.item_manual_entry_selector) {
            return new C1490c(this, m41761u);
        }
        if (i == C42293hj4.item_form_edit_text) {
            return new C1484a(this, m41761u);
        }
        return new C22528h0(m41761u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new YV1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new LS1();
    }

    /* renamed from: v */
    public final Observable<Locale> m110410v() {
        Observable<Locale> hide = this.f5737e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "countryClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<IdentificationDocumentType> m110409w() {
        Observable<IdentificationDocumentType> hide = this.f5738f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "documentTypeClicksSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<C44509lT1<?>> m110408x() {
        Observable<C44509lT1<?>> hide = this.f5735c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "formFieldClicksSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<IdentificationGender> m110407y() {
        Observable<IdentificationGender> hide = this.f5736d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "genderClicksSubject.hide()");
        return hide;
    }
}
