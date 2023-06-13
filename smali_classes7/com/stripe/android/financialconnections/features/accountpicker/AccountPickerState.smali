.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAN2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0018\u0008\u0080\u0008\u0018\u00002\u00020\u0001:\u0003)*+BA\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JC\u0010\u0010\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u0019R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001cR\u0011\u0010$\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001cR\u0011\u0010&\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u001c\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "LAN2;",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
        "component1",
        "",
        "component2",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "component3",
        "",
        "",
        "component4",
        "payload",
        "canRetry",
        "selectAccounts",
        "selectedIds",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "Ldp;",
        "getPayload",
        "()Ldp;",
        "Z",
        "getCanRetry",
        "()Z",
        "getSelectAccounts",
        "Ljava/util/Set;",
        "getSelectedIds",
        "()Ljava/util/Set;",
        "getSubmitLoading",
        "submitLoading",
        "getSubmitEnabled",
        "submitEnabled",
        "getAllAccountsSelected",
        "allAccountsSelected",
        "<init>",
        "(Ldp;ZLdp;Ljava/util/Set;)V",
        "PartnerAccountUI",
        "Payload",
        "SelectionMode",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final canRetry:Z

.field private final payload:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final selectAccounts:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ldp;ZLdp;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;Z",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ldp;ZLdp;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, LMd6;->e:LMd6;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    sget-object p3, LMd6;->e:LMd6;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p4

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Ldp;ZLdp;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy(Ldp;ZLdp;Ljava/util/Set;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    return v0
.end method

.method public final component3()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    return-object v0
.end method

.method public final component4()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Ldp;ZLdp;Ljava/util/Set;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;Z",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAllAccountsSelected()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    invoke-virtual {v0}, Ldp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->getSelectableAccounts()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final getCanRetry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    return v0
.end method

.method public final getPayload()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    return-object v0
.end method

.method public final getSelectAccounts()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    return-object v0
.end method

.method public final getSelectedIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    return-object v0
.end method

.method public final getSubmitEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getSubmitLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    instance-of v0, v0, LAt2;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    instance-of v0, v0, LAt2;

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

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->payload:Ldp;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->canRetry:Z

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectAccounts:Ldp;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->selectedIds:Ljava/util/Set;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AccountPickerState(payload="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canRetry="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectAccounts="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedIds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
