package p000;

import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import co.bird.android.model.persistence.nestedstructures.OperatorOrderViewDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireOperatorOrderView;
import co.bird.android.model.wire.WireOperatorOrderViewDetail;
import co.bird.android.model.wire.WireOperatorOrderViewSection;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\n\u001a\u00020\t*\u00020\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorOrderViewSection;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "b", "Lco/bird/android/model/wire/WireOperatorOrderView;", "", "section", "Lco/bird/android/model/persistence/OperatorOrderView;", C17296a.f69688o, "Lco/bird/android/model/wire/WireOperatorOrderViewDetail;", "Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;", "c", "co.bird.android.repository.operator-order-view"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderViewConversion.kt\nco/bird/android/repository/operatororderview/converters/OperatorOrderViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 OperatorOrderViewConversion.kt\nco/bird/android/repository/operatororderview/converters/OperatorOrderViewConversionKt\n*L\n24#1:44\n24#1:45,3\n*E\n"})
/* renamed from: Qp3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35495Qp3 {
    /* renamed from: a */
    public static final OperatorOrderView m87901a(WireOperatorOrderView wireOperatorOrderView, String section) {
        int collectionSizeOrDefault;
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireOperatorOrderView, "<this>");
        Intrinsics.checkNotNullParameter(section, "section");
        String orderId = wireOperatorOrderView.getOrderId();
        DateTime appointmentDate = wireOperatorOrderView.getAppointmentDate();
        String locationName = wireOperatorOrderView.getLocationName();
        String locationAddress = wireOperatorOrderView.getLocationAddress();
        List<WireOperatorOrderViewDetail> details = wireOperatorOrderView.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOperatorOrderViewDetail wireOperatorOrderViewDetail : details) {
            arrayList.add(m87899c(wireOperatorOrderViewDetail));
        }
        String instructions = wireOperatorOrderView.getInstructions();
        OperatorOrderViewType type = wireOperatorOrderView.getType();
        String listDescription = wireOperatorOrderView.getListDescription();
        int quantity = wireOperatorOrderView.getQuantity();
        String bolStatusText = wireOperatorOrderView.getBolStatusText();
        WireThemedColors bolStatusColor = wireOperatorOrderView.getBolStatusColor();
        if (bolStatusColor != null) {
            themedColors = C47311qB0.m17961f(bolStatusColor);
        } else {
            themedColors = null;
        }
        return new OperatorOrderView(orderId, appointmentDate, locationName, locationAddress, arrayList, instructions, type, listDescription, quantity, section, bolStatusText, themedColors, wireOperatorOrderView.getBolUploaded(), wireOperatorOrderView.getContainerOrderId());
    }

    /* renamed from: b */
    public static final OperatorOrderViewSection m87900b(WireOperatorOrderViewSection wireOperatorOrderViewSection) {
        Intrinsics.checkNotNullParameter(wireOperatorOrderViewSection, "<this>");
        return new OperatorOrderViewSection(wireOperatorOrderViewSection.getTitle(), wireOperatorOrderViewSection.getIdx());
    }

    /* renamed from: c */
    public static final OperatorOrderViewDetail m87899c(WireOperatorOrderViewDetail wireOperatorOrderViewDetail) {
        Intrinsics.checkNotNullParameter(wireOperatorOrderViewDetail, "<this>");
        return new OperatorOrderViewDetail(wireOperatorOrderViewDetail.getTitle(), wireOperatorOrderViewDetail.getDetail());
    }
}
