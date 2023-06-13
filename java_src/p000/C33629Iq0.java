package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33629Iq0;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002JB\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LIq0;", "", "Lio/reactivex/F;", "", "LH6;", "h", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "complaintResolutionForm", "Lco/bird/android/model/persistence/ComplaintResolution;", "submission", "m", "j", "formResponse", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "s", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "issueOptions", "actionTakenOptions", "", "required", "p", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lom3;", "b", "Lom3;", "operatorManager", "<init>", "(Landroid/content/Context;Lom3;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n1549#2:293\n1620#2,3:294\n1#3:297\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter\n*L\n41#1:289\n41#1:290,3\n206#1:293\n206#1:294,3\n*E\n"})
/* renamed from: Iq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33629Iq0 {

    /* renamed from: a */
    public final Context f16279a;

    /* renamed from: b */
    public final InterfaceC46473om3 f16280b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Iq0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3772a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComplaintResolutionField.values().length];
            try {
                iArr[ComplaintResolutionField.BEFORE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComplaintResolutionField.AFTER_PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComplaintResolutionField.ISSUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComplaintResolutionField.ACTION_TAKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComplaintResolutionField.VEHICLES_INVOLVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ComplaintResolutionField.ADDITIONAL_NOTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ComplaintResolutionField.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004 \u0006*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "fields", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertNonRequiredForm$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n766#2:289\n857#2,2:290\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertNonRequiredForm$1\n*L\n128#1:289\n128#1:290,2\n*E\n"})
    /* renamed from: Iq0$b */
    /* loaded from: classes3.dex */
    public static final class C3773b extends Lambda implements Function1<List<? extends ComplaintActionTakenRequiredField>, InterfaceC23447K<? extends List<C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ ComplaintResolution f16282h;

        /* renamed from: i */
        public final /* synthetic */ ComplaintResolutionForm f16283i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "field", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Iq0$b$a */
        /* loaded from: classes3.dex */
        public static final class C3774a extends Lambda implements Function1<ComplaintActionTakenRequiredField, InterfaceC23447K<? extends C3023H6>> {

            /* renamed from: g */
            public final /* synthetic */ C33629Iq0 f16284g;

            /* renamed from: h */
            public final /* synthetic */ ComplaintResolution f16285h;

            /* renamed from: i */
            public final /* synthetic */ ComplaintResolutionForm f16286i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3774a(C33629Iq0 c33629Iq0, ComplaintResolution complaintResolution, ComplaintResolutionForm complaintResolutionForm) {
                super(1);
                this.f16284g = c33629Iq0;
                this.f16285h = complaintResolution;
                this.f16286i = complaintResolutionForm;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends C3023H6> invoke(ComplaintActionTakenRequiredField field) {
                Intrinsics.checkNotNullParameter(field, "field");
                return this.f16284g.m101626p(field, this.f16285h, this.f16286i.getIssueOptions(), this.f16286i.getActionTakenOptions(), false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3773b(ComplaintResolution complaintResolution, ComplaintResolutionForm complaintResolutionForm) {
            super(1);
            this.f16282h = complaintResolution;
            this.f16283i = complaintResolutionForm;
        }

        /* renamed from: c */
        public static final InterfaceC23447K m101620c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<ComplaintActionTakenRequiredField> fields) {
            boolean z;
            Intrinsics.checkNotNullParameter(fields, "fields");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fields) {
                ComplaintActionTakenRequiredField complaintActionTakenRequiredField = (ComplaintActionTakenRequiredField) obj;
                if (!complaintActionTakenRequiredField.getRequired() && complaintActionTakenRequiredField.getField() != ComplaintResolutionField.BEFORE_PHOTO) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            Observable fromIterable = Observable.fromIterable(arrayList);
            final C3774a c3774a = new C3774a(C33629Iq0.this, this.f16282h, this.f16283i);
            return fromIterable.flatMapSingle(new InterfaceC23492o() { // from class: Jq0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23447K m101620c;
                    m101620c = C33629Iq0.C3773b.m101620c(Function1.this, obj2);
                    return m101620c;
                }
            }).toList();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "", "notRequiredSections", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iq0$c */
    /* loaded from: classes3.dex */
    public static final class C3775c extends Lambda implements Function1<List<C3023H6>, List<? extends C3023H6>> {

        /* renamed from: g */
        public final /* synthetic */ C3023H6 f16287g;

        /* renamed from: h */
        public final /* synthetic */ C3023H6 f16288h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3775c(C3023H6 c3023h6, C3023H6 c3023h62) {
            super(1);
            this.f16287g = c3023h6;
            this.f16288h = c3023h62;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<C3023H6> notRequiredSections) {
            List listOf;
            List<C3023H6> plus;
            List<C3023H6> emptyList;
            Intrinsics.checkNotNullParameter(notRequiredSections, "notRequiredSections");
            if (!notRequiredSections.isEmpty()) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{this.f16287g, this.f16288h});
                plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) notRequiredSections);
                return plus;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004 \u0006*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "fields", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertRequiredForm$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n766#2:289\n857#2,2:290\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertRequiredForm$1\n*L\n69#1:289\n69#1:290,2\n*E\n"})
    /* renamed from: Iq0$d */
    /* loaded from: classes3.dex */
    public static final class C3776d extends Lambda implements Function1<List<? extends ComplaintActionTakenRequiredField>, InterfaceC23447K<? extends List<C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ ComplaintResolution f16290h;

        /* renamed from: i */
        public final /* synthetic */ ComplaintResolutionForm f16291i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "field", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Iq0$d$a */
        /* loaded from: classes3.dex */
        public static final class C3777a extends Lambda implements Function1<ComplaintActionTakenRequiredField, InterfaceC23447K<? extends C3023H6>> {

            /* renamed from: g */
            public final /* synthetic */ C33629Iq0 f16292g;

            /* renamed from: h */
            public final /* synthetic */ ComplaintResolution f16293h;

            /* renamed from: i */
            public final /* synthetic */ ComplaintResolutionForm f16294i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3777a(C33629Iq0 c33629Iq0, ComplaintResolution complaintResolution, ComplaintResolutionForm complaintResolutionForm) {
                super(1);
                this.f16292g = c33629Iq0;
                this.f16293h = complaintResolution;
                this.f16294i = complaintResolutionForm;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends C3023H6> invoke(ComplaintActionTakenRequiredField field) {
                Intrinsics.checkNotNullParameter(field, "field");
                return this.f16292g.m101626p(field, this.f16293h, this.f16294i.getIssueOptions(), this.f16294i.getActionTakenOptions(), true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3776d(ComplaintResolution complaintResolution, ComplaintResolutionForm complaintResolutionForm) {
            super(1);
            this.f16290h = complaintResolution;
            this.f16291i = complaintResolutionForm;
        }

        /* renamed from: c */
        public static final InterfaceC23447K m101615c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<ComplaintActionTakenRequiredField> fields) {
            boolean z;
            Intrinsics.checkNotNullParameter(fields, "fields");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fields) {
                ComplaintActionTakenRequiredField complaintActionTakenRequiredField = (ComplaintActionTakenRequiredField) obj;
                if (!complaintActionTakenRequiredField.getRequired() && complaintActionTakenRequiredField.getField() != ComplaintResolutionField.BEFORE_PHOTO) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            Observable fromIterable = Observable.fromIterable(arrayList);
            final C3777a c3777a = new C3777a(C33629Iq0.this, this.f16290h, this.f16291i);
            return fromIterable.flatMapSingle(new InterfaceC23492o() { // from class: Kq0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23447K m101615c;
                    m101615c = C33629Iq0.C3776d.m101615c(Function1.this, obj2);
                    return m101615c;
                }
            }).toList();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "", "requiredSections", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iq0$e */
    /* loaded from: classes3.dex */
    public static final class C3778e extends Lambda implements Function1<List<C3023H6>, List<? extends C3023H6>> {

        /* renamed from: g */
        public final /* synthetic */ ComplaintResolution f16295g;

        /* renamed from: h */
        public final /* synthetic */ C3023H6 f16296h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3778e(ComplaintResolution complaintResolution, C3023H6 c3023h6) {
            super(1);
            this.f16295g = complaintResolution;
            this.f16296h = c3023h6;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<C3023H6> requiredSections) {
            List listOf;
            List<C3023H6> plus;
            Intrinsics.checkNotNullParameter(requiredSections, "requiredSections");
            if (Intrinsics.areEqual(this.f16295g.getSituation(), EnumC41608ga2.BIRDS_INVOLVED.toString())) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f16296h);
                plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) requiredSections);
                return plus;
            }
            return requiredSections;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LG6;", "adapterItems", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LH6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iq0$f */
    /* loaded from: classes3.dex */
    public static final class C3779f extends Lambda implements Function1<List<? extends C2637G6>, C3023H6> {

        /* renamed from: h */
        public final /* synthetic */ boolean f16298h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3779f(boolean z) {
            super(1);
            this.f16298h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C3023H6 invoke(List<C2637G6> adapterItems) {
            List mutableList;
            String string;
            Intrinsics.checkNotNullParameter(adapterItems, "adapterItems");
            String string2 = C33629Iq0.this.f16279a.getString(C45871nl4.involved_vehicles);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.involved_vehicles)");
            C2637G6 c2637g6 = new C2637G6(new C34804Nq5(string2, this.f16298h), C36603Vi4.item_complaint_section_header, false, 4, null);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) adapterItems);
            if (adapterItems.isEmpty()) {
                string = C33629Iq0.this.f16279a.getString(C45871nl4.scan_vehicles);
            } else {
                string = C33629Iq0.this.f16279a.getString(C45871nl4.scan_more_vehicles);
            }
            return new C3023H6(mutableList, c2637g6, new C2637G6(string, C36603Vi4.item_scan_vehicles, false, 4, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "vehiclesInvolved", "LG6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$toAdapterSection$vehiclesInvolvedSingle$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$toAdapterSection$vehiclesInvolvedSingle$2\n*L\n235#1:289\n235#1:290,3\n*E\n"})
    /* renamed from: Iq0$g */
    /* loaded from: classes3.dex */
    public static final class C3780g extends Lambda implements Function1<List<? extends Bird>, List<? extends C2637G6>> {

        /* renamed from: g */
        public static final C3780g f16299g = new C3780g();

        public C3780g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C2637G6> invoke(List<Bird> vehiclesInvolved) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(vehiclesInvolved, "vehiclesInvolved");
            List<Bird> list = vehiclesInvolved;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Bird bird : list) {
                arrayList.add(new C2637G6(bird, C36603Vi4.item_complaint_vehicle_involved, false, 4, null));
            }
            return arrayList;
        }
    }

    public C33629Iq0(Context context, InterfaceC46473om3 operatorManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        this.f16279a = context;
        this.f16280b = operatorManager;
    }

    /* renamed from: i */
    public static final List m101633i(C3023H6 introduction, C3023H6 menuItems) {
        List listOf;
        Intrinsics.checkNotNullParameter(introduction, "$introduction");
        Intrinsics.checkNotNullParameter(menuItems, "$menuItems");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{introduction, menuItems});
        return listOf;
    }

    /* renamed from: k */
    public static final InterfaceC23447K m101631k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final List m101630l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23447K m101628n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final List m101627o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final List m101625q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final C3023H6 m101624r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C3023H6) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final AbstractC23442F<List<C3023H6>> m101634h() {
        List mutableListOf;
        Iterable<EnumC41608ga2> asIterable;
        int collectionSizeOrDefault;
        List mutableList;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new IH1(this.f16279a.getString(C45871nl4.tell_us_what_you_see), this.f16279a.getString(C45871nl4.visible_issue_bird_involved), true), C36603Vi4.item_complaint_resolution_header, false, 4, null));
        final C3023H6 c3023h6 = new C3023H6(mutableListOf, null, null, 6, null);
        asIterable = ArraysKt___ArraysKt.asIterable(EnumC41608ga2.values());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(asIterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (EnumC41608ga2 enumC41608ga2 : asIterable) {
            arrayList.add(new C2637G6(enumC41608ga2, C36603Vi4.item_category, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        final C3023H6 c3023h62 = new C3023H6(mutableList, null, null, 6, null);
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Dq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m101633i;
                m101633i = C33629Iq0.m101633i(C3023H6.this, c3023h62);
                return m101633i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable { listOf(introduction, menuItems) }");
        return m33161E;
    }

    /* renamed from: j */
    public final AbstractC23442F<List<C3023H6>> m101632j(ComplaintResolutionForm complaintResolutionForm, ComplaintResolution submission) {
        List mutableListOf;
        List mutableListOf2;
        Intrinsics.checkNotNullParameter(complaintResolutionForm, "complaintResolutionForm");
        Intrinsics.checkNotNullParameter(submission, "submission");
        IH1 ih1 = new IH1(this.f16279a.getString(C45871nl4.thank_you_resolving_complaint), this.f16279a.getString(C45871nl4.help_bird_permit), true);
        int i = C36603Vi4.item_complaint_resolution_header;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(ih1, i, false, 4, null));
        C3023H6 c3023h6 = new C3023H6(mutableListOf, null, null, 6, null);
        String string = this.f16279a.getString(C45871nl4.additional_information);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.additional_information)");
        C2637G6 c2637g6 = new C2637G6(new C34804Nq5(string, false), C36603Vi4.item_complaint_section_header, false, 4, null);
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new IH1(null, this.f16279a.getString(C45871nl4.complaint_resolution_additional_information_description_body), false, 5, null), i, false, 4, null));
        C3023H6 c3023h62 = new C3023H6(mutableListOf2, c2637g6, null, 4, null);
        AbstractC23442F m33158H = AbstractC23442F.m33158H(m101623s(submission, complaintResolutionForm));
        final C3773b c3773b = new C3773b(submission, complaintResolutionForm);
        AbstractC23442F m33165A = m33158H.m33165A(new InterfaceC23492o() { // from class: Gq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m101631k;
                m101631k = C33629Iq0.m101631k(Function1.this, obj);
                return m101631k;
            }
        });
        final C3775c c3775c = new C3775c(c3023h6, c3023h62);
        AbstractC23442F<List<C3023H6>> m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: Hq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m101630l;
                m101630l = C33629Iq0.m101630l(Function1.this, obj);
                return m101630l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "fun convertNonRequiredFo…ons\n        }\n      }\n  }");
        return m33157I;
    }

    /* renamed from: m */
    public final AbstractC23442F<List<C3023H6>> m101629m(ComplaintResolutionForm complaintResolutionForm, ComplaintResolution submission) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(complaintResolutionForm, "complaintResolutionForm");
        Intrinsics.checkNotNullParameter(submission, "submission");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C36603Vi4.item_information, false, 4, null));
        C3023H6 c3023h6 = new C3023H6(mutableListOf, null, null, 6, null);
        AbstractC23442F m33158H = AbstractC23442F.m33158H(m101623s(submission, complaintResolutionForm));
        final C3776d c3776d = new C3776d(submission, complaintResolutionForm);
        AbstractC23442F m33165A = m33158H.m33165A(new InterfaceC23492o() { // from class: Eq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m101628n;
                m101628n = C33629Iq0.m101628n(Function1.this, obj);
                return m101628n;
            }
        });
        final C3778e c3778e = new C3778e(submission, c3023h6);
        AbstractC23442F<List<C3023H6>> m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: Fq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m101627o;
                m101627o = C33629Iq0.m101627o(Function1.this, obj);
                return m101627o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "fun convertRequiredForm(…ons\n        }\n      }\n  }");
        return m33157I;
    }

    /* renamed from: p */
    public final AbstractC23442F<C3023H6> m101626p(ComplaintActionTakenRequiredField complaintActionTakenRequiredField, ComplaintResolution complaintResolution, List<ComplaintIssueOption> list, List<ComplaintIssueOption> list2, boolean z) {
        List mutableListOf;
        List mutableListOf2;
        int collectionSizeOrDefault;
        List mutableList;
        List<String> emptyList;
        List mutableListOf3;
        List emptyList2;
        List<String> vehicleIdsInvolved;
        AbstractC24490k<List<Bird>> mo8073v;
        List emptyList3;
        List mutableListOf4;
        String str = null;
        r3 = null;
        r3 = null;
        r3 = null;
        AbstractC23442F abstractC23442F = null;
        String str2 = null;
        switch (C3772a.$EnumSwitchMapping$0[complaintActionTakenRequiredField.getField().ordinal()]) {
            case 1:
                C2637G6[] c2637g6Arr = new C2637G6[1];
                String string = this.f16279a.getString(C45871nl4.before);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.before)");
                ComplaintResolutionField field = complaintActionTakenRequiredField.getField();
                if (complaintResolution != null) {
                    str = complaintResolution.getBeforePhotoUrl();
                }
                c2637g6Arr[0] = new C2637G6(new AY5(string, z, field, str), C36603Vi4.item_take_photo, false, 4, null);
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
                AbstractC23442F<C3023H6> m33158H = AbstractC23442F.m33158H(new C3023H6(mutableListOf, null, null, 6, null));
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(\n        AdapterSec…      )\n        )\n      )");
                return m33158H;
            case 2:
                C2637G6[] c2637g6Arr2 = new C2637G6[1];
                String string2 = this.f16279a.getString(C45871nl4.after);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.after)");
                ComplaintResolutionField field2 = complaintActionTakenRequiredField.getField();
                if (complaintResolution != null) {
                    str2 = complaintResolution.getAfterPhotoUrl();
                }
                c2637g6Arr2[0] = new C2637G6(new AY5(string2, z, field2, str2), C36603Vi4.item_take_photo, false, 4, null);
                mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr2);
                AbstractC23442F<C3023H6> m33158H2 = AbstractC23442F.m33158H(new C3023H6(mutableListOf2, null, null, 6, null));
                Intrinsics.checkNotNullExpressionValue(m33158H2, "just(\n        AdapterSec…      )\n        )\n      )");
                return m33158H2;
            case 3:
                String string3 = this.f16279a.getString(C45871nl4.issues_check_all_that_apply);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…ues_check_all_that_apply)");
                C2637G6 c2637g6 = new C2637G6(new C34804Nq5(string3, z), C36603Vi4.item_complaint_section_header, false, 4, null);
                List<ComplaintIssueOption> list3 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (ComplaintIssueOption complaintIssueOption : list3) {
                    if (complaintResolution == null || (emptyList = complaintResolution.getIssues()) == null) {
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    arrayList.add(new C2637G6(TuplesKt.m28425to(complaintIssueOption, Boolean.valueOf(emptyList.contains(complaintIssueOption.getValue()))), C36603Vi4.item_issue, false, 4, null));
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                AbstractC23442F<C3023H6> m33158H3 = AbstractC23442F.m33158H(new C3023H6(mutableList, c2637g6, null, 4, null));
                Intrinsics.checkNotNullExpressionValue(m33158H3, "just(\n        AdapterSec…eList()\n        )\n      )");
                return m33158H3;
            case 4:
                String string4 = this.f16279a.getString(C45871nl4.action_taken);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.action_taken)");
                C2637G6 c2637g62 = new C2637G6(new C34804Nq5(string4, z), C36603Vi4.item_complaint_section_header, false, 4, null);
                mutableListOf3 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(list2, C36603Vi4.item_action_taken, false, 4, null));
                AbstractC23442F<C3023H6> m33158H4 = AbstractC23442F.m33158H(new C3023H6(mutableListOf3, c2637g62, null, 4, null));
                Intrinsics.checkNotNullExpressionValue(m33158H4, "just(\n        AdapterSec…      )\n        )\n      )");
                return m33158H4;
            case 5:
                if (complaintResolution != null && (vehicleIdsInvolved = complaintResolution.getVehicleIdsInvolved()) != null && (mo8073v = this.f16280b.mo8073v(vehicleIdsInvolved)) != null) {
                    final C3780g c3780g = C3780g.f16299g;
                    AbstractC24490k<R> m32117q0 = mo8073v.m32117q0(new InterfaceC23492o() { // from class: Bq0
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            List m101625q;
                            m101625q = C33629Iq0.m101625q(Function1.this, obj);
                            return m101625q;
                        }
                    });
                    if (m32117q0 != 0) {
                        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
                        abstractC23442F = m32117q0.m32173T(emptyList3);
                    }
                }
                if (abstractC23442F == null) {
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    abstractC23442F = AbstractC23442F.m33158H(emptyList2);
                    Intrinsics.checkNotNullExpressionValue(abstractC23442F, "just(emptyList())");
                }
                final C3779f c3779f = new C3779f(z);
                AbstractC23442F<C3023H6> m33157I = abstractC23442F.m33157I(new InterfaceC23492o() { // from class: Cq0
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C3023H6 m101624r;
                        m101624r = C33629Iq0.m101624r(Function1.this, obj);
                        return m101624r;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "private fun ComplaintAct…stOf())\n      )\n    }\n  }");
                return m33157I;
            case 6:
                String string5 = this.f16279a.getString(C45871nl4.additional_notes);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.additional_notes)");
                C2637G6 c2637g63 = new C2637G6(new C34804Nq5(string5, z), C36603Vi4.item_complaint_section_header, false, 4, null);
                mutableListOf4 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C36603Vi4.item_additional_notes, false, 4, null));
                AbstractC23442F<C3023H6> m33158H5 = AbstractC23442F.m33158H(new C3023H6(mutableListOf4, c2637g63, null, 4, null));
                Intrinsics.checkNotNullExpressionValue(m33158H5, "just(\n        AdapterSec…      )\n        )\n      )");
                return m33158H5;
            case 7:
                AbstractC23442F<C3023H6> m33158H6 = AbstractC23442F.m33158H(new C3023H6(new ArrayList(), null, null, 6, null));
                Intrinsics.checkNotNullExpressionValue(m33158H6, "just(\n        AdapterSec…(mutableListOf())\n      )");
                return m33158H6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: s */
    public final List<ComplaintActionTakenRequiredField> m101623s(ComplaintResolution complaintResolution, ComplaintResolutionForm complaintResolutionForm) {
        if (Intrinsics.areEqual(complaintResolution.getSituation(), EnumC41608ga2.BIRDS_INVOLVED.toString())) {
            return complaintResolutionForm.getActionTakenRequiredFields();
        }
        return complaintResolutionForm.getNoActionTakenRequiredFields();
    }
}
