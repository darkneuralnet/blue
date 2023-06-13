.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0008H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003Jk\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00102\u001a\u00020\u00032\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0019R\u0013\u0010#\u001a\u0004\u0018\u00010$8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0019\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
        "",
        "skipAccountSelection",
        "",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
        "selectionMode",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
        "accessibleData",
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "singleAccount",
        "stripeDirect",
        "businessName",
        "",
        "userSelectedSingleAccountInInstitution",
        "requiresSingleAccountConfirmation",
        "(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V",
        "getAccessibleData",
        "()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "getAccounts",
        "()Ljava/util/List;",
        "getBusinessName",
        "()Ljava/lang/String;",
        "getRequiresSingleAccountConfirmation",
        "()Z",
        "selectableAccounts",
        "getSelectableAccounts",
        "getSelectionMode",
        "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
        "shouldSkipPane",
        "getShouldSkipPane",
        "getSingleAccount",
        "getSkipAccountSelection",
        "getStripeDirect",
        "subtitle",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "getSubtitle",
        "()Lcom/stripe/android/financialconnections/ui/TextResource;",
        "getUserSelectedSingleAccountInInstitution",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n766#2:324\n857#2,2:325\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n*L\n298#1:324\n298#1:325,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

.field private final accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation
.end field

.field private final businessName:Ljava/lang/String;

.field private final requiresSingleAccountConfirmation:Z

.field private final selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

.field private final singleAccount:Z

.field private final skipAccountSelection:Z

.field private final stripeDirect:Z

.field private final userSelectedSingleAccountInInstitution:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "ZZ",
            "Ljava/lang/String;",
            "ZZ)V"
        }
    .end annotation

    const-string v0, "accounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibleData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    goto :goto_8

    :cond_8
    move/from16 v1, p9

    :goto_8
    move p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->copy(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    return v0
.end method

.method public final copy(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "ZZ",
            "Ljava/lang/String;",
            "ZZ)",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;"
        }
    .end annotation

    const-string v0, "accounts"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionMode"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibleData"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    move-object v1, v0

    move v2, p1

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAccessibleData()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    return-object v0
.end method

.method public final getAccounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final getBusinessName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresSingleAccountConfirmation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    return v0
.end method

.method public final getSelectableAccounts()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getSelectionMode()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    return-object v0
.end method

.method public final getShouldSkipPane()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final getSingleAccount()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final getSkipAccountSelection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    return v0
.end method

.method public final getStripeDirect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    return v0
.end method

.method public final getSubtitle()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_accountpicker_singleaccount_description:I

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3, v1}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public final getUserSelectedSingleAccountInInstitution()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accessibleData:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    iget-boolean v5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    iget-boolean v8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->requiresSingleAccountConfirmation:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Payload(skipAccountSelection="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", accounts="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectionMode="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accessibleData="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", singleAccount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", stripeDirect="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", businessName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userSelectedSingleAccountInInstitution="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requiresSingleAccountConfirmation="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
