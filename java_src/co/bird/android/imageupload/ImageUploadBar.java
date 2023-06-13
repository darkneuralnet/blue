package co.bird.android.imageupload;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.imageupload.ImageUploadBar;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001EB\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AB\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b@\u0010BB#\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010C\u001a\u00020-¢\u0006\u0004\b@\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \"*\n\u0012\u0004\u0012\u00020\n\u0018\u00010!0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R*\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006F"}, m28432d2 = {"Lco/bird/android/imageupload/ImageUploadBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "onAttachedToWindow", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "", "imageUrl", "s", "Landroid/net/Uri;", "imageUri", "r", "Landroid/util/AttributeSet;", "attrs", "v", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "takePhotoText", "LIW1;", DateTokenConverter.CONVERTER_KEY, "LIW1;", "adapter", "LKW1;", "e", "LKW1;", "converter", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "photoSubject", "g", "Landroid/view/View$OnClickListener;", "clickListener", "", "h", "Z", "showButtonWhenEmpty", "", "value", "i", "I", "t", "()I", "setMaxPhotos", "(I)V", "maxPhotos", "Lco/bird/android/imageupload/ImageUploadBar$a;", "j", "Lco/bird/android/imageupload/ImageUploadBar$a;", "u", "()Lco/bird/android/imageupload/ImageUploadBar$a;", "setPhotoChangedListener", "(Lco/bird/android/imageupload/ImageUploadBar$a;)V", "photoChangedListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageUploadBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploadBar.kt\nco/bird/android/imageupload/ImageUploadBar\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,122:1\n41#2:123\n41#2:125\n41#2:127\n41#2:129\n199#3:124\n180#3:126\n180#3:128\n180#3:130\n819#4:131\n847#4,2:132\n37#5,2:134\n*S KotlinDebug\n*F\n+ 1 ImageUploadBar.kt\nco/bird/android/imageupload/ImageUploadBar\n*L\n47#1:123\n67#1:125\n77#1:127\n83#1:129\n47#1:124\n67#1:126\n77#1:128\n83#1:130\n99#1:131\n99#1:132,2\n100#1:134,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageUploadBar extends ConstraintLayout {

    /* renamed from: b */
    public final RecyclerView f66024b;

    /* renamed from: c */
    public final TextView f66025c;

    /* renamed from: d */
    public final IW1 f66026d;

    /* renamed from: e */
    public final KW1 f66027e;

    /* renamed from: f */
    public final C24552a<List<Uri>> f66028f;

    /* renamed from: g */
    public View.OnClickListener f66029g;

    /* renamed from: h */
    public boolean f66030h;

    /* renamed from: i */
    public int f66031i;

    /* renamed from: j */
    public InterfaceC15989a f66032j;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/imageupload/ImageUploadBar$a;", "", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15989a {
        /* renamed from: a */
        void mo8628a(List<? extends Uri> list);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Landroid/net/Uri;", "photoUris", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$b */
    /* loaded from: classes3.dex */
    public static final class C15990b extends Lambda implements Function1<List<? extends Uri>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C15990b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<? extends Uri> photoUris) {
            Intrinsics.checkNotNullParameter(photoUris, "photoUris");
            return ImageUploadBar.this.f66027e.m98806b(photoUris, ImageUploadBar.this.m56144t(), !ImageUploadBar.this.f66030h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15991c extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C15991c(Object obj) {
            super(1, obj, IW1.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m56136a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((IW1) this.receiver).mo24871u(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m56136a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "photoUris", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$d */
    /* loaded from: classes3.dex */
    public static final class C15992d extends Lambda implements Function1<List<? extends Uri>, Unit> {
        public C15992d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Uri> list) {
            C49520tu6.show$default(ImageUploadBar.this.f66025c, list.isEmpty() && ImageUploadBar.this.f66030h, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "photoUris", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$e */
    /* loaded from: classes3.dex */
    public static final class C15993e extends Lambda implements Function1<List<? extends Uri>, Unit> {
        public C15993e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Uri> photoUris) {
            InterfaceC15989a m56143u = ImageUploadBar.this.m56143u();
            if (m56143u != null) {
                Intrinsics.checkNotNullExpressionValue(photoUris, "photoUris");
                m56143u.mo8628a(photoUris);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Landroid/net/Uri;", "photoUris", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$f */
    /* loaded from: classes3.dex */
    public static final class C15994f extends Lambda implements Function1<List<? extends Uri>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C15994f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<? extends Uri> photoUris) {
            Intrinsics.checkNotNullParameter(photoUris, "photoUris");
            return ImageUploadBar.this.f66027e.m98806b(photoUris, ImageUploadBar.this.m56144t(), !ImageUploadBar.this.f66030h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15995g extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C15995g(Object obj) {
            super(1, obj, IW1.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m56134a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((IW1) this.receiver).mo24871u(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m56134a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "removeUri", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/net/Uri;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nImageUploadBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploadBar.kt\nco/bird/android/imageupload/ImageUploadBar$onAttachedToWindow$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n819#2:123\n847#2,2:124\n*S KotlinDebug\n*F\n+ 1 ImageUploadBar.kt\nco/bird/android/imageupload/ImageUploadBar$onAttachedToWindow$5\n*L\n74#1:123\n74#1:124,2\n*E\n"})
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$h */
    /* loaded from: classes3.dex */
    public static final class C15996h extends Lambda implements Function1<Uri, List<? extends Uri>> {
        public C15996h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Uri> invoke(Uri removeUri) {
            List<Uri> emptyList;
            Intrinsics.checkNotNullParameter(removeUri, "removeUri");
            List list = (List) ImageUploadBar.this.f66028f.getValue();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual((Uri) obj, removeUri)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15997i extends FunctionReferenceImpl implements Function1<List<? extends Uri>, Unit> {
        public C15997i(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Uri> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "it", "", C17296a.f69688o, "(Landroid/view/View;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$j */
    /* loaded from: classes3.dex */
    public static final class C15998j extends Lambda implements Function1<View, Boolean> {
        public C15998j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(View it) {
            int i;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) ImageUploadBar.this.f66028f.getValue();
            boolean z = false;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (i < ImageUploadBar.this.m56144t()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.imageupload.ImageUploadBar$k */
    /* loaded from: classes3.dex */
    public static final class C15999k extends Lambda implements Function1<View, Unit> {
        public C15999k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            View.OnClickListener onClickListener = ImageUploadBar.this.f66029g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadBar(Context context) {
        super(context);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45861nk4.view_image_upload, this);
        View findViewById = findViewById(C31689Ai4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f66024b = recyclerView;
        View findViewById2 = findViewById(C31689Ai4.takePhotoText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.takePhotoText)");
        this.f66025c = (TextView) findViewById2;
        IW1 iw1 = new IW1();
        this.f66026d = iw1;
        this.f66027e = new KW1();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<Uri>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<Uri>>(emptyList())");
        this.f66028f = m31921g;
        this.f66030h = true;
        this.f66031i = Integer.MAX_VALUE;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(iw1);
        recyclerView.setItemAnimator(new C11894g());
    }

    /* renamed from: A */
    public static final List m56162A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m56161B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m56160C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final void m56159D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m56148o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m56147p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m56141w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m56140x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m56139y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m56138z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<List<Uri>> observeOn = this.f66028f.distinctUntilChanged().observeOn(C23454a.m33087a());
        final C15992d c15992d = new C15992d();
        Observable<List<Uri>> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: aY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ImageUploadBar.m56141w(Function1.this, obj);
            }
        });
        final C15993e c15993e = new C15993e();
        Observable<List<Uri>> doAfterNext = doOnNext.doAfterNext(new InterfaceC23484g() { // from class: bY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ImageUploadBar.m56140x(Function1.this, obj);
            }
        });
        final C15994f c15994f = new C15994f();
        Observable observeOn2 = doAfterNext.flatMapSingle(new InterfaceC23492o() { // from class: cY1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m56139y;
                m56139y = ImageUploadBar.m56139y(Function1.this, obj);
                return m56139y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onAttachedT…ener?.onClick(view) }\n  }");
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(m45202a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15995g c15995g = new C15995g(this.f66026d);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ImageUploadBar.m56138z(Function1.this, obj);
            }
        });
        Observable<Uri> m101965v = this.f66026d.m101965v();
        final C15996h c15996h = new C15996h();
        Observable<R> map = m101965v.map(new InterfaceC23492o() { // from class: eY1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m56162A;
                m56162A = ImageUploadBar.m56162A(Function1.this, obj);
                return m56162A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onAttachedT…ener?.onClick(view) }\n  }");
        ScopeProvider m45202a2 = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a2, "ViewScopeProvider.from(this)");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(m45202a2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15997i c15997i = new C15997i(this.f66028f);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: fY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ImageUploadBar.m56161B(Function1.this, obj);
            }
        });
        Observable<View> m101966g = this.f66026d.m101966g();
        final C15998j c15998j = new C15998j();
        Observable<View> observeOn3 = m101966g.filter(new InterfaceC23494q() { // from class: gY1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m56160C;
                m56160C = ImageUploadBar.m56160C(Function1.this, obj);
                return m56160C;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onAttachedT…ener?.onClick(view) }\n  }");
        ScopeProvider m45202a3 = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a3, "ViewScopeProvider.from(this)");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m45202a3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15999k c15999k = new C15999k();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: hY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ImageUploadBar.m56159D(Function1.this, obj);
            }
        });
    }

    /* renamed from: r */
    public final void m56146r(Uri imageUri) {
        List<Uri> listOf;
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        List<Uri> value = this.f66028f.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (!Intrinsics.areEqual((Uri) obj, imageUri)) {
                arrayList.add(obj);
            }
        }
        C24552a<List<Uri>> c24552a = this.f66028f;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(arrayList.toArray(new Uri[0]));
        spreadBuilder.add(imageUri);
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Uri[spreadBuilder.size()]));
        c24552a.onNext(listOf);
    }

    /* renamed from: s */
    public final void m56145s(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Uri parse = Uri.parse(imageUrl);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(imageUrl)");
        m56146r(parse);
    }

    public final void setMaxPhotos(int i) {
        this.f66031i = i;
        if (isAttachedToWindow()) {
            AbstractC24507p<List<Uri>> firstElement = this.f66028f.firstElement();
            final C15990b c15990b = new C15990b();
            AbstractC23442F m33152N = firstElement.m32072C(new InterfaceC23492o() { // from class: iY1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m56148o;
                    m56148o = ImageUploadBar.m56148o(Function1.this, obj);
                    return m56148o;
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "set(value) {\n      field…ateAdapter)\n      }\n    }");
            ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m45202a));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15991c c15991c = new C15991c(this.f66026d);
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: jY1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ImageUploadBar.m56147p(Function1.this, obj);
                }
            });
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f66025c.setOnClickListener(onClickListener);
        this.f66029g = onClickListener;
    }

    public final void setPhotoChangedListener(InterfaceC15989a interfaceC15989a) {
        this.f66032j = interfaceC15989a;
    }

    /* renamed from: t */
    public final int m56144t() {
        return this.f66031i;
    }

    /* renamed from: u */
    public final InterfaceC15989a m56143u() {
        return this.f66032j;
    }

    /* renamed from: v */
    public final void m56142v(AttributeSet attributeSet) {
        List<Uri> emptyList;
        Context context = getContext();
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34524Ml4.ImageUploadBar);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ImageUploadBar)");
        try {
            boolean z = obtainStyledAttributes.getBoolean(C34524Ml4.ImageUploadBar_showButtonWhenEmpty, true);
            this.f66030h = z;
            C49520tu6.show$default(this.f66025c, z, 0, 2, null);
            if (!this.f66030h) {
                C24552a<List<Uri>> c24552a = this.f66028f;
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                c24552a.onNext(emptyList);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45861nk4.view_image_upload, this);
        View findViewById = findViewById(C31689Ai4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f66024b = recyclerView;
        View findViewById2 = findViewById(C31689Ai4.takePhotoText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.takePhotoText)");
        this.f66025c = (TextView) findViewById2;
        IW1 iw1 = new IW1();
        this.f66026d = iw1;
        this.f66027e = new KW1();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<Uri>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<Uri>>(emptyList())");
        this.f66028f = m31921g;
        this.f66030h = true;
        this.f66031i = Integer.MAX_VALUE;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(iw1);
        recyclerView.setItemAnimator(new C11894g());
        m56142v(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45861nk4.view_image_upload, this);
        View findViewById = findViewById(C31689Ai4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f66024b = recyclerView;
        View findViewById2 = findViewById(C31689Ai4.takePhotoText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.takePhotoText)");
        this.f66025c = (TextView) findViewById2;
        IW1 iw1 = new IW1();
        this.f66026d = iw1;
        this.f66027e = new KW1();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<Uri>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<Uri>>(emptyList())");
        this.f66028f = m31921g;
        this.f66030h = true;
        this.f66031i = Integer.MAX_VALUE;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(iw1);
        recyclerView.setItemAnimator(new C11894g());
        m56142v(attributeSet);
    }
}
