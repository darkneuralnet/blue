package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lbg;", "", "Lco/bird/android/model/persistence/Announcement;", "announcement", "", "birdCode", "", "LH6;", C17296a.f69688o, "", "unlocking", "Landroid/text/SpannableString;", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnouncementConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementConverter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,2:49\n1622#2:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 AnnouncementConverter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementConverter\n*L\n22#1:48\n22#1:49,2\n22#1:52\n*E\n"})
/* renamed from: bg */
/* loaded from: classes3.dex */
public final class C12470bg {

    /* renamed from: a */
    public final Context f57850a;

    public C12470bg(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57850a = context;
    }

    /* renamed from: c */
    public static /* synthetic */ SpannableString m64187c(C12470bg c12470bg, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c12470bg.m64188b(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(new p000.C3023H6(r15, null, null, 6, null));
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C3023H6> m64189a(Announcement announcement, String str) {
        List<C3023H6> emptyList;
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        List<AnnouncementPage> pages = announcement.getPages();
        if (pages != null) {
            List<AnnouncementPage> list = pages;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (AnnouncementPage announcementPage : list) {
                SpannableString spannableString = null;
                if (str != null) {
                    spannableString = m64187c(this, str, false, 2, null);
                }
                arrayList.add(new C2637G6(new C23323ig(announcementPage, spannableString), C38135ak4.item_announcement, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList != null && listOf != null) {
                return listOf;
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: b */
    public final SpannableString m64188b(String str, boolean z) {
        int i;
        if (z) {
            i = C45871nl4.feature_announcement_ride_started_bird_unlocking_title;
        } else {
            i = C45871nl4.feature_announcement_ride_started_bird_unlocked_title;
        }
        int m94301c = NA0.m94301c(this.f57850a, C32364Df4.calloutText);
        String string = this.f57850a.getString(i, str);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringRes, birdCode)");
        return C45097mS5.m25592n(string, str, new ForegroundColorSpan(m94301c));
    }
}
