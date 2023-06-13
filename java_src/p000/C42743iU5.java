package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LiU5;", "", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "name", "notes", "", "suggestedCapacity", "maxCapacity", "", "LH6;", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Ljava/util/List;", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestConverter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n*S KotlinDebug\n*F\n+ 1 SuggestNestConverter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestConverter\n*L\n25#1:61\n25#1:62,3\n*E\n"})
/* renamed from: iU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42743iU5 {

    /* renamed from: b */
    public static final C23271a f87401b = new C23271a(null);

    /* renamed from: c */
    public static final List<EnumC43929kU5> f87402c;

    /* renamed from: a */
    public final Context f87403a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LiU5$a;", "", "", "LkU5;", "SUGGEST_DETAIL_TYPE_ORDERING", "Ljava/util/List;", "<init>", "()V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iU5$a */
    /* loaded from: classes3.dex */
    public static final class C23271a {
        public /* synthetic */ C23271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23271a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iU5$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C23272b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43929kU5.values().length];
            try {
                iArr[EnumC43929kU5.ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC43929kU5.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC43929kU5.NOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<EnumC43929kU5> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC43929kU5[]{EnumC43929kU5.ADDRESS, EnumC43929kU5.NAME, EnumC43929kU5.NOTES});
        f87402c = listOf;
    }

    public C42743iU5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87403a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m33861a(String address, String str, String str2, int i, Integer num) {
        int collectionSizeOrDefault;
        List plus;
        List mutableList;
        List<C3023H6> listOf;
        String string;
        String str3;
        String string2;
        boolean z;
        Intrinsics.checkNotNullParameter(address, "address");
        List<EnumC43929kU5> list = f87402c;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (EnumC43929kU5 enumC43929kU5 : list) {
            int[] iArr = C23272b.$EnumSwitchMapping$0;
            int i2 = iArr[enumC43929kU5.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        string = this.f87403a.getString(C45871nl4.container_order_notes_label);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    string = this.f87403a.getString(C45871nl4.settings_name);
                }
            } else {
                string = this.f87403a.getString(C45871nl4.address_hint);
            }
            String str4 = string;
            int i3 = iArr[enumC43929kU5.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        str3 = str2;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str3 = str;
                }
            } else {
                str3 = address;
            }
            int i4 = iArr[enumC43929kU5.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    string2 = null;
                } else {
                    string2 = this.f87403a.getString(C45871nl4.suggest_nest_note_hint);
                }
            } else {
                string2 = this.f87403a.getString(C45871nl4.suggest_nest_name_hint);
            }
            if (enumC43929kU5 != EnumC43929kU5.ADDRESS) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C2637G6(new C43336jU5(str4, str3, string2, z, enumC43929kU5), C35208Pj4.item_suggest_nest_detail, false, 4, null));
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends C2637G6>) ((Collection<? extends Object>) arrayList), new C2637G6(TuplesKt.m28425to(Integer.valueOf(i), num), C45268mk4.item_nest_size, false, 4, null));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) plus);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
