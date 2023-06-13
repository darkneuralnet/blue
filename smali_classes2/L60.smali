.class public final LL60;
.super LNy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL60$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0015\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "LL60;",
        "LNy;",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "message",
        "",
        "totalBirds",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "actionKind",
        "b",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "c",
        "d",
        "I",
        "getTotalBirds",
        "()I",
        "e",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "getActionKind",
        "()Lco/bird/api/response/OpsBatchJobActionKind;",
        "f",
        "a",
        "()Ljava/lang/Integer;",
        "positiveText",
        "g",
        "Ljava/lang/Integer;",
        "getNegativeText",
        "negativeText",
        "<init>",
        "(ILco/bird/api/response/OpsBatchJobActionKind;)V",
        "core-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:Lco/bird/api/response/OpsBatchJobActionKind;

.field public final f:I

.field public final g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(ILco/bird/api/response/OpsBatchJobActionKind;)V
    .locals 1

    const-string v0, "actionKind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LNy;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, LL60;->d:I

    iput-object p2, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    sget p1, Lnl4;->operator_bulk_scanner_update_button:I

    iput p1, p0, LL60;->f:I

    const/high16 p1, 0x1040000

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LL60;->g:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(LL60;ILco/bird/api/response/OpsBatchJobActionKind;ILjava/lang/Object;)LL60;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, LL60;->d:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    :cond_1
    invoke-virtual {p0, p1, p2}, LL60;->b(ILco/bird/api/response/OpsBatchJobActionKind;)LL60;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, LL60;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final b(ILco/bird/api/response/OpsBatchJobActionKind;)LL60;
    .locals 1

    const-string v0, "actionKind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LL60;

    invoke-direct {v0, p1, p2}, LL60;-><init>(ILco/bird/api/response/OpsBatchJobActionKind;)V

    return-object v0
.end method

.method public final c(Lco/bird/api/response/OpsBatchJobActionKind;)I
    .locals 1

    sget-object v0, LL60$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget p1, Lnl4;->bird_action_unknown:I

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->operator_bulk_update_mark_fixed_verb:I

    goto :goto_0

    :cond_1
    sget p1, Lnl4;->operator_bulk_update_mark_damaged_verb:I

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LL60;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LL60;

    iget v1, p0, LL60;->d:I

    iget v3, p1, LL60;->d:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    iget-object p1, p1, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getNegativeText()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LL60;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LL60;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public message(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    sget-object v1, LL60$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    iget-object v0, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-virtual {p0, v0}, LL60;->c(Lco/bird/api/response/OpsBatchJobActionKind;)I

    move-result v0

    sget v4, Lnl4;->operator_bulk_update_confirm_generic_message_formatted:I

    new-array v3, v3, [Ljava/lang/Object;

    iget v5, p0, LL60;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    invoke-virtual {p1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{\n        val actionStri\u2026(actionStringId))\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, LXk4;->operator_bulk_update_chirp_message:I

    iget v3, p0, LL60;->d:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-virtual {p1, v0, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.resources.getQua\u2026, totalBirds, totalBirds)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget v0, Lnl4;->operator_bulk_update_wake_bluetooth_message:I

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, LL60;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(R.stri\u2026ooth_message, totalBirds)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public title(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->operator_bulk_update_confirm_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(R.stri\u2026ulk_update_confirm_title)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, LL60;->d:I

    iget-object v1, p0, LL60;->e:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BulkUpdateConfirmDialog(totalBirds="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", actionKind="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
