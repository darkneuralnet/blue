package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C36533Va6;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004'(\u001c\u001fB\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0013H\u0002J\f\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0002J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u00112\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002R*\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u001b*\b\u0012\u0002\b\u0003\u0018\u00010\u000f0\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00110\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"LVa6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "LRa6;", "y", "", "w", "", "v", "Landroid/widget/CheckBox;", "A", "Lkotlin/reflect/KClass;", "klass", "x", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "tweakEditsSubject", DateTokenConverter.CONVERTER_KEY, "searchSubject", "Landroid/app/Dialog;", "e", "Landroid/app/Dialog;", "currentDialog", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Va6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36533Va6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<C35597Ra6<?>> f39259c;

    /* renamed from: d */
    public final C24558d<String> f39260d;

    /* renamed from: e */
    public Dialog f39261e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LVa6$a;", "Lw1;", "", "position", "", "bind", "LZf2;", "b", "LZf2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LVa6;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder\n*L\n163#1:248\n163#1:249,4\n*E\n"})
    /* renamed from: Va6$a */
    /* loaded from: classes2.dex */
    public final class C8680a extends C29735w1 {

        /* renamed from: b */
        public final C37510Zf2 f39262b;

        /* renamed from: c */
        public boolean f39263c;

        /* renamed from: d */
        public final /* synthetic */ C36533Va6 f39264d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$1\n*L\n148#1:248\n148#1:249,4\n*E\n"})
        /* renamed from: Va6$a$a */
        /* loaded from: classes2.dex */
        public static final class C8681a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36533Va6 f39266h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8681a(C36533Va6 c36533Va6) {
                super(2);
                this.f39266h = c36533Va6;
            }

            /* renamed from: a */
            public final void m79722a(CompoundButton compoundButton, boolean z) {
                if (C8680a.this.f39263c) {
                    return;
                }
                Object m105816c = this.f39266h.m94545o().m109394h().get(C8680a.this.getAdapterPosition()).m105816c();
                Boolean bool = null;
                if (!(m105816c instanceof C10290ZY)) {
                    m105816c = null;
                }
                C10290ZY c10290zy = (C10290ZY) m105816c;
                if (c10290zy == null) {
                    return;
                }
                C24558d c24558d = this.f39266h.f39259c;
                C35597Ra6<Boolean> m72973b = c10290zy.m72973b();
                if (z) {
                    bool = Boolean.TRUE;
                }
                c24558d.onNext(C35597Ra6.copy$default(m72973b, null, null, null, null, bool, 15, null));
                C8680a.this.f39262b.f48918c.setEnabled(z);
                C36533Va6 c36533Va6 = this.f39266h;
                AppCompatCheckBox appCompatCheckBox = C8680a.this.f39262b.f48917b;
                Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
                c36533Va6.m79729A(appCompatCheckBox);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m79722a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$BooleanTweakViewHolder$2\n*L\n156#1:248\n156#1:249,4\n*E\n"})
        /* renamed from: Va6$a$b */
        /* loaded from: classes2.dex */
        public static final class C8682b extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36533Va6 f39268h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8682b(C36533Va6 c36533Va6) {
                super(2);
                this.f39268h = c36533Va6;
            }

            /* renamed from: a */
            public final void m79721a(CompoundButton compoundButton, boolean z) {
                if (C8680a.this.f39263c) {
                    return;
                }
                Object m105816c = this.f39268h.m94545o().m109394h().get(C8680a.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C10290ZY)) {
                    m105816c = null;
                }
                C10290ZY c10290zy = (C10290ZY) m105816c;
                if (c10290zy == null) {
                    return;
                }
                this.f39268h.f39259c.onNext(C35597Ra6.copy$default(c10290zy.m72973b(), null, null, null, null, Boolean.valueOf(z), 15, null));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m79721a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8680a(C36533Va6 c36533Va6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39264d = c36533Va6;
            C37510Zf2 m72795a = C37510Zf2.m72795a(view);
            Intrinsics.checkNotNullExpressionValue(m72795a, "bind(view)");
            this.f39262b = m72795a;
            AppCompatCheckBox appCompatCheckBox = m72795a.f48917b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
            C34585Ms2.m94663h(appCompatCheckBox, new C8681a(c36533Va6));
            SwitchCompat switchCompat = m72795a.f48918c;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "viewBinding.valueSwitch");
            C34585Ms2.m94663h(switchCompat, new C8682b(c36533Va6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            this.f39263c = true;
            Object m105816c = this.f39264d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C10290ZY)) {
                m105816c = null;
            }
            C10290ZY c10290zy = (C10290ZY) m105816c;
            if (c10290zy == null) {
                return;
            }
            this.f39262b.f48917b.setText(C45097mS5.m25588r(c10290zy.getName()));
            AppCompatCheckBox appCompatCheckBox = this.f39262b.f48917b;
            if (c10290zy.getValue() != null) {
                z = true;
            } else {
                z = false;
            }
            appCompatCheckBox.setChecked(z);
            C36533Va6 c36533Va6 = this.f39264d;
            AppCompatCheckBox appCompatCheckBox2 = this.f39262b.f48917b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox2, "viewBinding.checkBox");
            c36533Va6.m79729A(appCompatCheckBox2);
            SwitchCompat switchCompat = this.f39262b.f48918c;
            if (c10290zy.getValue() == null) {
                z3 = false;
            }
            switchCompat.setEnabled(z3);
            SwitchCompat switchCompat2 = this.f39262b.f48918c;
            Boolean value = c10290zy.getValue();
            if (value != null) {
                z2 = value.booleanValue();
            } else {
                z2 = false;
            }
            switchCompat2.setChecked(z2);
            this.f39263c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LVa6$b;", "Lw1;", "", "position", "", "bind", "Lag2;", "b", "Lag2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LVa6;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder\n*L\n202#1:248\n202#1:249,4\n*E\n"})
    /* renamed from: Va6$b */
    /* loaded from: classes2.dex */
    public final class C8683b extends C29735w1 {

        /* renamed from: b */
        public final C38093ag2 f39269b;

        /* renamed from: c */
        public boolean f39270c;

        /* renamed from: d */
        public final /* synthetic */ C36533Va6 f39271d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$1\n*L\n181#1:248\n181#1:249,4\n*E\n"})
        /* renamed from: Va6$b$a */
        /* loaded from: classes2.dex */
        public static final class C8684a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36533Va6 f39273h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8684a(C36533Va6 c36533Va6) {
                super(2);
                this.f39273h = c36533Va6;
            }

            /* renamed from: a */
            public final void m79718a(CompoundButton compoundButton, boolean z) {
                if (C8683b.this.f39270c) {
                    return;
                }
                Object m105816c = this.f39273h.m94545o().m109394h().get(C8683b.this.getAdapterPosition()).m105816c();
                Object obj = null;
                if (!(m105816c instanceof C46401of1)) {
                    m105816c = null;
                }
                C46401of1 c46401of1 = (C46401of1) m105816c;
                if (c46401of1 == null) {
                    return;
                }
                C24558d c24558d = this.f39273h.f39259c;
                C35597Ra6 m20687e = c46401of1.m20687e();
                if (z) {
                    obj = c46401of1.getValue();
                }
                c24558d.onNext(C35597Ra6.copy$default(m20687e, null, null, null, null, obj, 15, null));
                C8683b.this.f39269b.f50922c.setEnabled(z);
                C36533Va6 c36533Va6 = this.f39273h;
                AppCompatCheckBox appCompatCheckBox = C8683b.this.f39269b.f50921b;
                Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
                c36533Va6.m79729A(appCompatCheckBox);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m79718a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J0\u0010\f\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\r"}, m28432d2 = {"Va6$b$b", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/widget/AdapterView;", "parent", "", "onNothingSelected", "Landroid/view/View;", "view", "", "position", "", "id", "onItemSelected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder$2\n*L\n194#1:248\n194#1:249,4\n*E\n"})
        /* renamed from: Va6$b$b */
        /* loaded from: classes2.dex */
        public static final class C8685b implements AdapterView.OnItemSelectedListener {

            /* renamed from: c */
            public final /* synthetic */ C36533Va6 f39275c;

            public C8685b(C36533Va6 c36533Va6) {
                this.f39275c = c36533Va6;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (C8683b.this.f39270c) {
                    return;
                }
                Object m105816c = this.f39275c.m94545o().m109394h().get(C8683b.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C46401of1)) {
                    m105816c = null;
                }
                C46401of1 c46401of1 = (C46401of1) m105816c;
                if (c46401of1 == null) {
                    return;
                }
                this.f39275c.f39259c.onNext(C35597Ra6.copy$default(c46401of1.m20687e(), null, null, null, null, c46401of1.m20690b(i), 15, null));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, m28432d2 = {"Va6$b$c", "Landroid/widget/ArrayAdapter;", "", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Va6$b$c */
        /* loaded from: classes2.dex */
        public static final class C8686c extends ArrayAdapter<String> {
            public C8686c(Context context, List<String> list) {
                super(context, 17367050, list);
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                View view2 = super.getView(i, view, parent);
                Intrinsics.checkNotNullExpressionValue(view2, "super.getView(position, convertView, parent)");
                view2.setPadding(0, view2.getPaddingTop(), 0, view2.getPaddingBottom());
                return view2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8683b(C36533Va6 c36533Va6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39271d = c36533Va6;
            C38093ag2 m70896a = C38093ag2.m70896a(view);
            Intrinsics.checkNotNullExpressionValue(m70896a, "bind(view)");
            this.f39269b = m70896a;
            AppCompatCheckBox appCompatCheckBox = m70896a.f50921b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
            C34585Ms2.m94663h(appCompatCheckBox, new C8684a(c36533Va6));
            m70896a.f50922c.setOnItemSelectedListener(new C8685b(c36533Va6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f39270c = true;
            Object m105816c = this.f39271d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C46401of1)) {
                m105816c = null;
            }
            C46401of1 c46401of1 = (C46401of1) m105816c;
            if (c46401of1 == null) {
                return;
            }
            this.f39269b.f50921b.setText(C45097mS5.m25588r(c46401of1.getName()));
            this.f39269b.f50921b.setChecked(!Intrinsics.areEqual(c46401of1.getValue(), (Object) (-1)));
            C36533Va6 c36533Va6 = this.f39271d;
            AppCompatCheckBox appCompatCheckBox = this.f39269b.f50921b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
            c36533Va6.m79729A(appCompatCheckBox);
            C38093ag2 c38093ag2 = this.f39269b;
            c38093ag2.f50922c.setEnabled(c38093ag2.f50921b.isChecked());
            this.f39269b.f50922c.setAdapter((SpinnerAdapter) new C8686c(this.itemView.getContext(), c46401of1.m20688d()));
            this.f39269b.f50922c.setSelection(c46401of1.m20686f() + 1);
            this.f39270c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LVa6$c;", "Lw1;", "Lcg2;", "b", "Lcg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVa6;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Va6$c */
    /* loaded from: classes2.dex */
    public final class C8687c extends C29735w1 {

        /* renamed from: b */
        public final C39279cg2 f39276b;

        /* renamed from: c */
        public final /* synthetic */ C36533Va6 f39277c;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Va6$c$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Va6$c$a */
        /* loaded from: classes2.dex */
        public static final class C8688a extends C39530d36 {

            /* renamed from: c */
            public final /* synthetic */ C36533Va6 f39279c;

            public C8688a(C36533Va6 c36533Va6) {
                this.f39279c = c36533Va6;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                boolean isBlank;
                Intrinsics.checkNotNullParameter(s, "s");
                super.onTextChanged(s, i, i2, i3);
                ImageView imageView = C8687c.this.f39276b.f61031b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
                isBlank = StringsKt__StringsJVMKt.isBlank(s);
                C49520tu6.show$default(imageView, !isBlank, 0, 2, null);
                this.f39279c.f39260d.onNext(s.toString());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Va6$c$b */
        /* loaded from: classes2.dex */
        public static final class C8689b extends Lambda implements Function1<View, Unit> {
            public C8689b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C8687c.this.f39276b.f61032c.getText().clear();
                C8687c.this.f39276b.f61032c.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8687c(C36533Va6 c36533Va6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39277c = c36533Va6;
            C39279cg2 m61071a = C39279cg2.m61071a(view);
            Intrinsics.checkNotNullExpressionValue(m61071a, "bind(view)");
            this.f39276b = m61071a;
            m61071a.f61032c.addTextChangedListener(new C8688a(c36533Va6));
            m61071a.f61032c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Wa6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean m79716b;
                    m79716b = C36533Va6.C8687c.m79716b(C36533Va6.C8687c.this, textView, i, keyEvent);
                    return m79716b;
                }
            });
            ImageView imageView = m61071a.f61031b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
            C34585Ms2.m94661j(imageView, new C8689b());
        }

        /* renamed from: b */
        public static final boolean m79716b(C8687c this$0, TextView textView, int i, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (i != 6) {
                return false;
            }
            Object systemService = this$0.f39276b.f61032c.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.f39276b.f61032c.getWindowToken(), 0);
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LVa6$d;", "Lw1;", "", "position", "", "bind", "Lbg2;", "b", "Lbg2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LVa6;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder\n*L\n131#1:248\n131#1:249,4\n*E\n"})
    /* renamed from: Va6$d */
    /* loaded from: classes2.dex */
    public final class C8690d extends C29735w1 {

        /* renamed from: b */
        public final C38686bg2 f39281b;

        /* renamed from: c */
        public boolean f39282c;

        /* renamed from: d */
        public final /* synthetic */ C36533Va6 f39283d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder$1\n*L\n103#1:248\n103#1:249,4\n*E\n"})
        /* renamed from: Va6$d$a */
        /* loaded from: classes2.dex */
        public static final class C8691a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36533Va6 f39285h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8691a(C36533Va6 c36533Va6) {
                super(2);
                this.f39285h = c36533Va6;
            }

            /* renamed from: a */
            public final void m79712a(CompoundButton compoundButton, boolean z) {
                if (C8690d.this.f39282c) {
                    return;
                }
                Object m105816c = this.f39285h.m94545o().m109394h().get(C8690d.this.getAdapterPosition()).m105816c();
                Object obj = null;
                if (!(m105816c instanceof L26)) {
                    m105816c = null;
                }
                L26 l26 = (L26) m105816c;
                if (l26 == null) {
                    return;
                }
                C24558d c24558d = this.f39285h.f39259c;
                C35597Ra6 m97903b = l26.m97903b();
                if (z) {
                    obj = l26.getValue();
                }
                c24558d.onNext(C35597Ra6.copy$default(m97903b, null, null, null, null, obj, 15, null));
                C36533Va6 c36533Va6 = this.f39285h;
                AppCompatCheckBox appCompatCheckBox = C8690d.this.f39281b.f57858b;
                Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
                c36533Va6.m79729A(appCompatCheckBox);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m79712a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder$2\n*L\n111#1:248\n111#1:249,4\n*E\n"})
        /* renamed from: Va6$d$b */
        /* loaded from: classes2.dex */
        public static final class C8692b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36533Va6 f39286g;

            /* renamed from: h */
            public final /* synthetic */ C8690d f39287h;

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Va6$d$b$a */
            /* loaded from: classes2.dex */
            public static final class C8693a extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {

                /* renamed from: g */
                public static final C8693a f39288g = new C8693a();

                public C8693a() {
                    super(2);
                }

                /* renamed from: a */
                public final void m79709a(MaterialDialog materialDialog, CharSequence charSequence) {
                    Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(charSequence, "<anonymous parameter 1>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
                    m79709a(materialDialog, charSequence);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Va6$d$b$b */
            /* loaded from: classes2.dex */
            public static final class C8694b extends Lambda implements Function1<MaterialDialog, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C36533Va6 f39289g;

                /* renamed from: h */
                public final /* synthetic */ L26<Object> f39290h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8694b(C36533Va6 c36533Va6, L26<Object> l26) {
                    super(1);
                    this.f39289g = c36533Va6;
                    this.f39290h = l26;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                    invoke2(materialDialog);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(MaterialDialog dialog) {
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    this.f39289g.f39259c.onNext(C35597Ra6.copy$default(this.f39290h.m97903b(), null, null, null, null, this.f39289g.m79726x(DialogInputExtKt.getInputField(dialog).getText().toString(), this.f39290h.m97902c()), 15, null));
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Va6$d$b$c */
            /* loaded from: classes2.dex */
            public static final class C8695c extends Lambda implements Function1<MaterialDialog, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C36533Va6 f39291g;

                /* renamed from: h */
                public final /* synthetic */ L26<Object> f39292h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8695c(C36533Va6 c36533Va6, L26<Object> l26) {
                    super(1);
                    this.f39291g = c36533Va6;
                    this.f39292h = l26;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                    invoke2(materialDialog);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(MaterialDialog it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.f39291g.f39259c.onNext(C35597Ra6.copy$default(this.f39292h.m97903b(), null, null, null, null, null, 15, null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8692b(C36533Va6 c36533Va6, C8690d c8690d) {
                super(1);
                this.f39286g = c36533Va6;
                this.f39287h = c8690d;
            }

            /* renamed from: b */
            public static final void m79710b(C36533Va6 this$0, DialogInterface dialogInterface) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f39261e = null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Dialog dialog = this.f39286g.f39261e;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Object m105816c = this.f39286g.m94545o().m109394h().get(this.f39287h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof L26)) {
                    m105816c = null;
                }
                L26 l26 = (L26) m105816c;
                if (l26 == null) {
                    return;
                }
                Context context = this.f39287h.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                MaterialDialog title$default = MaterialDialog.title$default(new MaterialDialog(context, null, 2, null), null, l26.getName(), 1, null);
                Object value = l26.getValue();
                MaterialDialog negativeButton$default = MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(DialogInputExtKt.input$default(title$default, "Value", null, value != null ? value.toString() : null, null, 0, null, false, true, C8693a.f39288g, 122, null), null, "Set", new C8694b(this.f39286g, l26), 1, null), null, "Use Config", new C8695c(this.f39286g, l26), 1, null);
                this.f39286g.f39261e = negativeButton$default;
                negativeButton$default.show();
                Unit unit = Unit.INSTANCE;
                final C36533Va6 c36533Va6 = this.f39286g;
                negativeButton$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Xa6
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C36533Va6.C8690d.C8692b.m79710b(C36533Va6.this, dialogInterface);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8690d(C36533Va6 c36533Va6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39283d = c36533Va6;
            C38686bg2 m64182a = C38686bg2.m64182a(view);
            Intrinsics.checkNotNullExpressionValue(m64182a, "bind(view)");
            this.f39281b = m64182a;
            AppCompatCheckBox appCompatCheckBox = m64182a.f57858b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "viewBinding.checkBox");
            C34585Ms2.m94663h(appCompatCheckBox, new C8691a(c36533Va6));
            Button button = m64182a.f57859c;
            Intrinsics.checkNotNullExpressionValue(button, "viewBinding.editButton");
            C34585Ms2.m94661j(button, new C8692b(c36533Va6, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z = true;
            this.f39282c = true;
            Object m105816c = this.f39283d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof L26)) {
                m105816c = null;
            }
            L26 l26 = (L26) m105816c;
            if (l26 == null) {
                return;
            }
            this.f39281b.f57858b.setText(C45097mS5.m25588r(l26.getName()));
            AppCompatCheckBox appCompatCheckBox = this.f39281b.f57858b;
            if (l26.getValue() == null) {
                z = false;
            }
            appCompatCheckBox.setChecked(z);
            C36533Va6 c36533Va6 = this.f39283d;
            AppCompatCheckBox appCompatCheckBox2 = this.f39281b.f57858b;
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox2, "viewBinding.checkBox");
            c36533Va6.m79729A(appCompatCheckBox2);
            Button button = this.f39281b.f57859c;
            Object value = l26.getValue();
            button.setText((value == null || (r5 = this.f39283d.m79728v(value)) == null) ? "Use Config" : "Use Config");
            this.f39282c = false;
        }
    }

    public C36533Va6() {
        C24558d<C35597Ra6<?>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Tweak<*>>()");
        this.f39259c = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f39260d = m31902e2;
    }

    /* renamed from: A */
    public final void m79729A(CheckBox checkBox) {
        if (checkBox.isChecked()) {
            checkBox.setTextColor(NA0.m94301c(checkBox.getContext(), C32364Df4.birdNewRoad));
        } else {
            checkBox.setTextColor(NA0.m94301c(checkBox.getContext(), C32364Df4.darkGray));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C40436eb6());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C37235Ya6();
    }

    /* renamed from: v */
    public final String m79728v(Object obj) {
        if (obj instanceof String) {
            return "\"" + obj + "\"";
        }
        return obj.toString();
    }

    /* renamed from: w */
    public final Observable<String> m79727w() {
        Observable<String> hide = this.f39260d.startWith((C24558d<String>) "").hide();
        Intrinsics.checkNotNullExpressionValue(hide, "searchSubject.startWith(\"\").hide()");
        return hide;
    }

    /* renamed from: x */
    public final Object m79726x(String str, KClass<?> kClass) {
        Double doubleOrNull;
        Float floatOrNull;
        Long longOrNull;
        Integer intOrNull;
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (str != null) {
                intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                return intOrNull;
            }
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (str != null) {
                longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str);
                return longOrNull;
            }
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            if (str != null) {
                floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str);
                return floatOrNull;
            }
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            if (str != null) {
                doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
                return doubleOrNull;
            }
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(String.class))) {
            return str;
        }
        return null;
    }

    /* renamed from: y */
    public final Observable<C35597Ra6<?>> m79725y() {
        Observable<C35597Ra6<?>> hide = this.f39259c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "tweakEditsSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C39311cj4.item_tweaks_search ? new C8687c(this, m41761u) : i == C39311cj4.item_tweak_text ? new C8690d(this, m41761u) : i == C39311cj4.item_tweak_boolean ? new C8680a(this, m41761u) : i == C39311cj4.item_tweak_enum ? new C8683b(this, m41761u) : new C29735w1(m41761u);
    }
}
