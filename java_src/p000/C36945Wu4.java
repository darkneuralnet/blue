package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireNest;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LWu4;", "", "Lco/bird/android/model/wire/WireNest;", "nest", "", "showLockOption", "", "Lco/bird/android/model/wire/ReleaseValidationResult;", "validatedItems", "releaseEnabled", "lock", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanConverter.kt\nco/bird/android/feature/release/adapters/ReleaseScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n37#3,2:73\n*S KotlinDebug\n*F\n+ 1 ReleaseScanConverter.kt\nco/bird/android/feature/release/adapters/ReleaseScanConverter\n*L\n28#1:69\n28#1:70,3\n34#1:73,2\n*E\n"})
/* renamed from: Wu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36945Wu4 {

    /* renamed from: a */
    public final Context f42284a;

    public C36945Wu4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42284a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m77715a(WireNest wireNest, boolean z, List<ReleaseValidationResult> validatedItems, boolean z2, boolean z3) {
        int collectionSizeOrDefault;
        String str;
        int i;
        boolean z4;
        Drawable drawable;
        List listOfNotNull;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(validatedItems, "validatedItems");
        List<ReleaseValidationResult> list = validatedItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ReleaseValidationResult releaseValidationResult : list) {
            arrayList.add(new C2637G6(releaseValidationResult, C45268mk4.item_fleet_status_vehicle, false, 4, null));
        }
        C2637G6[] c2637g6Arr = (C2637G6[]) arrayList.toArray(new C2637G6[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(c2637g6Arr.length);
        if (wireNest != null) {
            str = "/" + wireNest.getAvailableCapacity();
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        …  )\n          .toString()");
        Context context = this.f42284a;
        if (wireNest != null) {
            i = C45871nl4.release_to_nest_uppercased;
        } else {
            i = C45871nl4.release_button_title;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …utton_title\n            )");
        C2637G6 c2637g6 = null;
        if (z) {
            drawable = NA0.m94299e(this.f42284a, C48193rg4.ic_warehouse);
            z4 = z2;
        } else {
            z4 = z2;
            drawable = null;
        }
        C2637G6 c2637g62 = new C2637G6(new C33435Hu4(sb2, string, z4, drawable), C36144Tj4.item_scan_header, false, 4, null);
        if (z) {
            c2637g6 = new C2637G6(Boolean.valueOf(z3), C32400Dj4.item_release_lock, false, 4, null);
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g6);
        spreadBuilder.addSpread(c2637g6Arr);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g62, null, 4, null));
        return listOf;
    }
}
