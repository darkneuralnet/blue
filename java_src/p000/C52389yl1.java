package p000;

import androidx.work.AbstractC12126c;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.C12124b;
import co.bird.android.imageupload.worker.ImageUploadWorker;
import co.bird.android.model.Folder;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32849Fh3;
import p000.C44821lz0;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aA\u0010\f\u001a\u00020\u000b*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"", "Ljava/io/File;", "LZC6;", "workManager", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "Landroidx/work/b;", "inputData", "Lco/bird/android/model/Folder;", "destFolder", "", C17296a.f69688o, "([Ljava/io/File;LZC6;Ljava/lang/Class;Landroidx/work/b;Lco/bird/android/model/Folder;)V", "image-upload_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFile+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File+.kt\nco/bird/android/imageupload/File_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,39:1\n11335#2:40\n11670#2,3:41\n*S KotlinDebug\n*F\n+ 1 File+.kt\nco/bird/android/imageupload/File_Kt\n*L\n23#1:40\n23#1:41,3\n*E\n"})
/* renamed from: yl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52389yl1 {
    /* renamed from: a */
    public static final void m2660a(File[] fileArr, ZC6 workManager, Class<? extends AbstractC12126c> workerClass, C12124b inputData, Folder destFolder) {
        Intrinsics.checkNotNullParameter(fileArr, "<this>");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destFolder, "destFolder");
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            ImageUploadWorker.C16000a c16000a = ImageUploadWorker.f66040i;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            arrayList.add(new C32849Fh3.C2399a(ImageUploadWorker.class).m109252h(new C44821lz0.C25841a().m26573b(S73.CONNECTED).m26574a()).m109249k(c16000a.m56125a(absolutePath, destFolder.path())).m109257a());
        }
        workManager.mo71773a(arrayList).m102782b(new C32849Fh3.C2399a(workerClass).m106742n(ArrayCreatingInputMerger.class).m109252h(new C44821lz0.C25841a().m26573b(S73.CONNECTED).m26574a()).m109249k(inputData).m109257a()).mo101017a();
    }
}
