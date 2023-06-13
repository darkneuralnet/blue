.class public final LjV1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjV1$l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "status",
        "",
        "a",
        "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$l;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->getStatus()Lco/bird/android/model/identification/IdentificationStatus;

    move-result-object v0

    sget-object v1, LjV1$l$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LgW1;->mm(Z)V

    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    invoke-virtual {v0, v1}, LgW1;->om(Z)V

    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    invoke-virtual {v0, v1}, LgW1;->pm(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    invoke-virtual {v0, v1}, LgW1;->om(Z)V

    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    invoke-virtual {v0, v1}, LgW1;->pm(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    invoke-virtual {v0, v1}, LgW1;->mm(Z)V

    :goto_0
    iget-object v0, p0, LjV1$l;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getUi$p(LjV1;)LgW1;

    move-result-object v0

    iget-object v1, p0, LjV1$l;->g:LjV1;

    const-string v2, "status"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, LjV1;->access$toStatusText(LjV1;Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LgW1;->cm(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LjV1$l;->a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
