package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, m28432d2 = {"LiI5;", "", "", "LlI5;", "smartlockItems", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockConverter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 SmartlockConverter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockConverter\n*L\n31#1:84\n31#1:85,3\n*E\n"})
/* renamed from: iI5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42635iI5 {

    /* renamed from: a */
    public final Context f87089a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iI5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23186a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC45600nI5.values().length];
            try {
                iArr[EnumC45600nI5.UNLOCKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC45600nI5.SMARTLOCK_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC45600nI5.BLUETOOTH_COMMUNICATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC45600nI5.REKEY_NEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC45600nI5.BLUETOOTH_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C42635iI5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87089a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m34237a(List<C44414lI5> smartlockItems) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        YL5 yl5;
        Intrinsics.checkNotNullParameter(smartlockItems, "smartlockItems");
        C2637G6 c2637g6 = new C2637G6(Unit.INSTANCE, C39311cj4.item_operator_smartlock_unlock_header, false, 4, null);
        List<C44414lI5> list = smartlockItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C44414lI5 c44414lI5 : list) {
            int i = C23186a.$EnumSwitchMapping$0[c44414lI5.m27435d().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                String m80910o = C36388Uk5.m80910o(c44414lI5.m27436c());
                                String string = this.f87089a.getString(C45871nl4.successfully_opened);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.successfully_opened)");
                                yl5 = new YL5(m80910o, string, Integer.valueOf(C48193rg4.ic_filled_check_circle_green), c44414lI5.m27437b());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String m80910o2 = C36388Uk5.m80910o(c44414lI5.m27436c());
                            String string2 = this.f87089a.getString(C45871nl4.smartlock_unlock_generic_error_title);
                            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…lock_generic_error_title)");
                            yl5 = new YL5(m80910o2, string2, Integer.valueOf(C48193rg4.ic_missing_error), c44414lI5.m27437b());
                        }
                    } else {
                        String m80910o3 = C36388Uk5.m80910o(c44414lI5.m27436c());
                        String string3 = this.f87089a.getString(C45871nl4.smartlock_unlock_generic_error_title);
                        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…lock_generic_error_title)");
                        yl5 = new YL5(m80910o3, string3, Integer.valueOf(C48193rg4.ic_missing_error), c44414lI5.m27437b());
                    }
                } else {
                    String m80910o4 = C36388Uk5.m80910o(c44414lI5.m27436c());
                    String string4 = this.f87089a.getString(C45871nl4.operator_lookup_vehicle_not_found);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…lookup_vehicle_not_found)");
                    yl5 = new YL5(m80910o4, string4, Integer.valueOf(C48193rg4.ic_missing_error), c44414lI5.m27437b());
                }
            } else {
                String string5 = this.f87089a.getString(C45871nl4.opening_lock);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.opening_lock)");
                String string6 = this.f87089a.getString(C45871nl4.mac_address, C36388Uk5.m80910o(c44414lI5.m27436c()));
                Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…anResult.getMacAddress())");
                yl5 = new YL5(string5, string6, null, c44414lI5.m27437b());
            }
            arrayList.add(new C2637G6(yl5, C39311cj4.item_operator_smartlock_unlock, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOf;
    }
}
