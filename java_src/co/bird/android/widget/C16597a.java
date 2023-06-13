package co.bird.android.widget;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.net.SyslogConstants;
import co.bird.android.widget.BottomSheetOptionLayout;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0001*\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\bø\u0001\u0000\u001ar\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\bø\u0001\u0000\u001a8\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "Landroidx/appcompat/app/AppCompatActivity;", "", "which", "Lkotlin/Function1;", "", "except", "Lco/bird/android/widget/BottomSheetOptionLayout$a;", "bottomSheetLayout", "", "title", "subtitle", "", "headerGravity", "Lio/reactivex/p;", "show", "showBottomSheetOptions", "options", "Landroid/os/Bundle;", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n819#2:109\n847#2,2:110\n819#2:112\n847#2,2:113\n819#2:115\n847#2,2:116\n1549#2:118\n1620#2,3:119\n*S KotlinDebug\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n*L\n46#1:109\n46#1:110,2\n72#1:112\n72#1:113,2\n72#1:115\n72#1:116,2\n90#1:118\n90#1:119,3\n*E\n"})
/* renamed from: co.bird.android.widget.a */
/* loaded from: classes4.dex */
public final class C16597a {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$a */
    /* loaded from: classes3.dex */
    public static final class C16598a implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67707b;

        public C16598a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67707b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67707b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$b */
    /* loaded from: classes2.dex */
    public static final class C16599b implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67708b;

        public C16599b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67708b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67708b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$c */
    /* loaded from: classes3.dex */
    public static final class C16600c implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67709b;

        public C16600c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67709b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67709b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$d */
    /* loaded from: classes3.dex */
    public static final class C16601d implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67710b;

        public C16601d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67710b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67710b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$e */
    /* loaded from: classes3.dex */
    public static final class C16602e implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67711b;

        public C16602e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67711b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67711b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$f */
    /* loaded from: classes2.dex */
    public static final class C16603f implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67712b;

        public C16603f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67712b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67712b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$g */
    /* loaded from: classes3.dex */
    public static final class C16604g implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67713b;

        public C16604g(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67713b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67713b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$h */
    /* loaded from: classes2.dex */
    public static final class C16605h implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67714b;

        public C16605h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67714b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67714b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$i */
    /* loaded from: classes2.dex */
    public static final class C16606i implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67715b;

        public C16606i(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67715b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67715b.invoke(obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    /* renamed from: co.bird.android.widget.a$j */
    /* loaded from: classes4.dex */
    public static final class C16607j implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f67716b;

        public C16607j(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f67716b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f67716b.invoke(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "it", "", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: co.bird.android.widget.a$k */
    /* loaded from: classes4.dex */
    public static final class C16608k extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C16608k f67717g;

        static {
            Intrinsics.needClassReification();
            f67717g = new C16608k();
        }

        public C16608k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Enum it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: co.bird.android.widget.a$l */
    /* loaded from: classes4.dex */
    public static final class C16609l extends Lambda implements Function1<Integer, K> {

        /* renamed from: g */
        public final /* synthetic */ List<K> f67718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16609l(List<? extends K> list) {
            super(1);
            this.f67718g = list;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TK; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Enum invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Enum) this.f67718g.get(it.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/d;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: co.bird.android.widget.a$m */
    /* loaded from: classes4.dex */
    public static final class C16610m extends Lambda implements Function1 {

        /* renamed from: g */
        public static final C16610m f67719g;

        static {
            Intrinsics.needClassReification();
            f67719g = new C16610m();
        }

        public C16610m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC16662d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/widget/d;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: co.bird.android.widget.a$n */
    /* loaded from: classes4.dex */
    public static final class C16611n extends Lambda implements Function1<Integer, K> {

        /* renamed from: g */
        public final /* synthetic */ List<K> f67720g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16611n(List<? extends K> list) {
            super(1);
            this.f67720g = list;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TK; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC16662d invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (InterfaceC16662d) this.f67720g.get(it.intValue());
        }
    }

    /* renamed from: a */
    public static final Bundle m54345a(BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i, List<? extends InterfaceC16662d> options) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        Intrinsics.checkNotNullParameter(options, "options");
        Bundle bundle = new Bundle();
        List<? extends InterfaceC16662d> list = options;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC16662d interfaceC16662d : list) {
            arrayList.add(new ParcelableBottomSheetOption(interfaceC16662d.mo13236a(), interfaceC16662d.mo13228i(), interfaceC16662d.getColor(), interfaceC16662d.getIcon(), interfaceC16662d.mo13229h(), interfaceC16662d.mo13234c(), interfaceC16662d.mo13232e(), interfaceC16662d.mo13230g(), interfaceC16662d.mo13233d()));
        }
        bundle.putParcelable("bottom_sheet_model", new BottomSheetModel(bottomSheetLayout, str, str2, i, arrayList));
        return bundle;
    }

    public static final /* synthetic */ <K extends Enum<K> & InterfaceC16662d> AbstractC24507p<K> show(AppCompatActivity appCompatActivity, List<? extends K> which, Function1<? super K, Boolean> except, BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(which, "which");
        Intrinsics.checkNotNullParameter(except, "except");
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        ArrayList arrayList = new ArrayList();
        for (Object obj : which) {
            if (!except.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(m54345a(bottomSheetLayout, str, str2, i, arrayList));
        c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p<Integer> m54040D9 = c16664e.m54040D9();
        Intrinsics.needClassReification();
        AbstractC24507p<K> abstractC24507p = (AbstractC24507p<K>) m54040D9.m32067H(new C16607j(new C16609l(arrayList)));
        Intrinsics.checkNotNullExpressionValue(abstractC24507p, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return abstractC24507p;
    }

    public static /* synthetic */ AbstractC24507p show$default(AppCompatActivity appCompatActivity, List which, Function1 except, BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            Intrinsics.reifiedOperationMarker(5, "K");
            which = ArraysKt___ArraysKt.toList(new Enum[0]);
        }
        if ((i2 & 2) != 0) {
            Intrinsics.needClassReification();
            except = C16608k.f67717g;
        }
        if ((i2 & 4) != 0) {
            bottomSheetLayout = BottomSheetOptionLayout.EnumC16469a.NORMAL;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            i = 8388611;
        }
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(which, "which");
        Intrinsics.checkNotNullParameter(except, "except");
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : which) {
            if (!((Boolean) except.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(m54345a(bottomSheetLayout, str, str2, i, arrayList));
        c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p<Integer> m54040D9 = c16664e.m54040D9();
        Intrinsics.needClassReification();
        AbstractC24507p<R> m32067H = m54040D9.m32067H(new C16607j(new C16609l(arrayList)));
        Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return m32067H;
    }

    public static final /* synthetic */ <K extends InterfaceC16662d> AbstractC24507p<K> showBottomSheetOptions(AppCompatActivity appCompatActivity, List<? extends K> which, Function1<? super K, Boolean> except, BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(which, "which");
        Intrinsics.checkNotNullParameter(except, "except");
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        ArrayList arrayList = new ArrayList();
        for (Object obj : which) {
            if (!except.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(m54345a(bottomSheetLayout, str, str2, i, arrayList));
        c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p<Integer> m54040D9 = c16664e.m54040D9();
        Intrinsics.needClassReification();
        AbstractC24507p<K> abstractC24507p = (AbstractC24507p<K>) m54040D9.m32067H(new C16607j(new C16611n(arrayList)));
        Intrinsics.checkNotNullExpressionValue(abstractC24507p, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return abstractC24507p;
    }

    public static /* synthetic */ AbstractC24507p showBottomSheetOptions$default(AppCompatActivity appCompatActivity, List which, Function1 except, BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            Intrinsics.needClassReification();
            except = C16610m.f67719g;
        }
        if ((i2 & 4) != 0) {
            bottomSheetLayout = BottomSheetOptionLayout.EnumC16469a.NORMAL;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            i = 8388611;
        }
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(which, "which");
        Intrinsics.checkNotNullParameter(except, "except");
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : which) {
            if (!((Boolean) except.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(m54345a(bottomSheetLayout, str, str2, i, arrayList));
        c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p<Integer> m54040D9 = c16664e.m54040D9();
        Intrinsics.needClassReification();
        AbstractC24507p<R> m32067H = m54040D9.m32067H(new C16607j(new C16611n(arrayList)));
        Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return m32067H;
    }
}
