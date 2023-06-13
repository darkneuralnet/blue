package p000;

import android.net.Uri;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, m28432d2 = {"LKW1;", "", "", "Landroid/net/Uri;", "imageUris", "", "maxPhotos", "", "alwaysShowAddPhotoButton", "Lio/reactivex/F;", "LH6;", "b", "<init>", "()V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageBarConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBarConverter.kt\nco/bird/android/imageupload/adapters/ImageBarConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n*S KotlinDebug\n*F\n+ 1 ImageBarConverter.kt\nco/bird/android/imageupload/adapters/ImageBarConverter\n*L\n13#1:25\n13#1:26,3\n*E\n"})
/* renamed from: KW1 */
/* loaded from: classes3.dex */
public final class KW1 {
    /* renamed from: c */
    public static final List m98805c(List imageUris, int i, boolean z) {
        int collectionSizeOrDefault;
        List mutableList;
        boolean z2;
        List listOf;
        Intrinsics.checkNotNullParameter(imageUris, "$imageUris");
        List<Uri> list = imageUris;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Uri uri : list) {
            arrayList.add(new C2637G6(uri, C45861nk4.item_image_bar_photo, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, null, new C2637G6(null, C45861nk4.item_image_bar_add_photo, false, 4, null), 2, null);
        int size = mutableList.size();
        boolean z3 = false;
        if (1 <= size && size <= i) {
            z2 = true;
        } else {
            z2 = false;
        }
        c3023h6.m104406g((z2 || z) ? true : true);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
        return listOf;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m98806b(final List<? extends Uri> imageUris, final int i, final boolean z) {
        Intrinsics.checkNotNullParameter(imageUris, "imageUris");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: JW1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m98805c;
                m98805c = KW1.m98805c(imageUris, i, z);
                return m98805c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
