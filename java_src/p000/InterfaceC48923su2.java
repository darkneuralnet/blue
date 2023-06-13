package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AssetTask;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.TaskPriority;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J4\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130\b2\u0006\u0010\u0016\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&Jb\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0004H&R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m28432d2 = {"Lsu2;", "", "", "assetId", "Lco/bird/android/model/constant/AssetManagerType;", "manager", "Lco/bird/android/model/constant/TaskPriority;", "priority", "Lio/reactivex/F;", "Lco/bird/android/model/LocalAsset;", C17296a.f69688o, "", "assetIds", "Lorg/joda/time/DateTime;", "manifestDate", "Lio/reactivex/c;", "c", "Lco/bird/android/model/AssetTask;", "task", "LHM4;", "Lco/bird/api/response/WireSignedUrl;", DateTokenConverter.CONVERTER_KEY, "dynamicUrl", "Lokhttp3/ResponseBody;", "f", "e", "id", "", "fileSize", "mediaType", "filePath", "createdBy", "downloadedAt", "h", "g", "Ljava/io/File;", "file", "i", "Lio/reactivex/Observable;", "b", "()Lio/reactivex/Observable;", "tasks", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: su2 */
/* loaded from: classes2.dex */
public interface InterfaceC48923su2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: su2$a */
    /* loaded from: classes2.dex */
    public static final class C28429a {
        public static /* synthetic */ AbstractC23442F loadAsset$default(InterfaceC48923su2 interfaceC48923su2, String str, AssetManagerType assetManagerType, TaskPriority taskPriority, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    taskPriority = TaskPriority.STANDARD;
                }
                return interfaceC48923su2.mo13534a(str, assetManagerType, taskPriority);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAsset");
        }

        public static /* synthetic */ AbstractC23461c loadAssets$default(InterfaceC48923su2 interfaceC48923su2, List list, AssetManagerType assetManagerType, TaskPriority taskPriority, DateTime dateTime, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    taskPriority = TaskPriority.STANDARD;
                }
                if ((i & 8) != 0) {
                    dateTime = null;
                }
                return interfaceC48923su2.mo13532c(list, assetManagerType, taskPriority, dateTime);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAssets");
        }

        public static /* synthetic */ AbstractC23461c updateAssetData$default(InterfaceC48923su2 interfaceC48923su2, String str, AssetManagerType assetManagerType, long j, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
            if (obj == null) {
                return interfaceC48923su2.mo13527h(str, (i & 2) != 0 ? null : assetManagerType, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : dateTime, (i & 128) == 0 ? dateTime2 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAssetData");
        }
    }

    /* renamed from: a */
    AbstractC23442F<LocalAsset> mo13534a(String str, AssetManagerType assetManagerType, TaskPriority taskPriority);

    /* renamed from: b */
    Observable<List<AssetTask>> mo13533b();

    /* renamed from: c */
    AbstractC23461c mo13532c(List<String> list, AssetManagerType assetManagerType, TaskPriority taskPriority, DateTime dateTime);

    /* renamed from: d */
    AbstractC23442F<HM4<WireSignedUrl>> mo13531d(AssetTask assetTask);

    /* renamed from: e */
    AbstractC23461c mo13530e(String str);

    /* renamed from: f */
    AbstractC23442F<HM4<ResponseBody>> mo13529f(String str);

    /* renamed from: g */
    AbstractC23442F<DateTime> mo13528g(AssetManagerType assetManagerType);

    /* renamed from: h */
    AbstractC23461c mo13527h(String str, AssetManagerType assetManagerType, long j, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2);

    /* renamed from: i */
    AbstractC23442F<WireSignedUrl> mo13526i(File file, AssetManagerType assetManagerType);
}
