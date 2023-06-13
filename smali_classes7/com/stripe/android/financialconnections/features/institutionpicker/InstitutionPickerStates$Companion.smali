.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0008\u0010\u0008\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\u000c\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;",
        "",
        "()V",
        "initialLoading",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        "institutionResponse",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "noSearchMode",
        "payload",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
        "searchModeFailed",
        "searchModeNoQuery",
        "searchModeNoResults",
        "searchModeSearchingInstitutions",
        "searchModeWithResults",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;-><init>()V

    return-void
.end method

.method private final institutionResponse()Lcom/stripe/android/financialconnections/model/InstitutionResponse;
    .locals 21

    new-instance v0, Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    new-instance v11, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v3, 0x0

    const-string v4, "1"

    const/4 v5, 0x0

    const-string v6, "Very very long institution 1"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "institution 1 url"

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v11, v1, v2

    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v13, 0x0

    const-string v14, "2"

    const/4 v15, 0x0

    const-string v16, "Institution 2"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v20, "Institution 2 url"

    move-object v12, v2

    invoke-direct/range {v12 .. v20}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const-string v6, "3"

    const/4 v7, 0x0

    const-string v8, "Institution 3"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "Institution 3 url"

    move-object v4, v2

    invoke-direct/range {v4 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private final payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->institutionResponse()Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->getData()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;-><init>(Ljava/util/List;ZZ)V

    return-object v0
.end method


# virtual methods
.method public final initialLoading()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 5

    new-instance v0, LAt2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LAt2;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, LMd6;->e:LMd6;

    new-instance v3, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2, v0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;)V

    return-object v3
.end method

.method public final noSearchMode()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->institutionResponse()Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v0

    invoke-direct {v4, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final searchModeFailed()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LCj1;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Something went wrong"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v4, v0, v1, v2, v1}, LCj1;-><init>(Ljava/lang/Throwable;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final searchModeNoQuery()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->institutionResponse()Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v0

    invoke-direct {v4, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final searchModeNoResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;-><init>(Ljava/util/List;)V

    invoke-direct {v4, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final searchModeSearchingInstitutions()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LAt2;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v4, v0, v1, v0}, LAt2;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final searchModeWithResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 8

    new-instance v3, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->payload()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v0

    invoke-direct {v3, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v4, LwT5;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->institutionResponse()Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v0

    invoke-direct {v4, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(ZZLdp;Ldp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method
