.class public final LiK1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiK1;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiK1$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LvE5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LvE5;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LvE5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LiK1;


# direct methods
.method public constructor <init>(LiK1;)V
    .locals 0

    iput-object p1, p0, LiK1$d;->g:LiK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LvE5;)V
    .locals 7

    invoke-virtual {p1}, LvE5;->b()LwE5;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "received smart lock event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, LvE5;->b()LwE5;

    move-result-object v0

    sget-object v2, LiK1$d$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->h:LjK1$a;

    iget-object v4, p0, LiK1$d;->g:LiK1;

    invoke-static {v4}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v4

    invoke-virtual {p1, v0, v4}, LjK1;->cm(LjK1$a;Z)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    invoke-static {p1, v1, v3, v2}, LjK1;->showContinueButton$default(LjK1;ZILjava/lang/Object;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$clearReadyState(LiK1;)V

    goto/16 :goto_0

    :pswitch_1
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->i:LjK1$a;

    iget-object v4, p0, LiK1$d;->g:LiK1;

    invoke-static {v4}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v4

    invoke-virtual {p1, v0, v4}, LjK1;->cm(LjK1$a;Z)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    invoke-static {p1, v1, v3, v2}, LjK1;->showContinueButton$default(LjK1;ZILjava/lang/Object;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$clearReadyState(LiK1;)V

    goto/16 :goto_0

    :pswitch_2
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->e:LjK1$a;

    iget-object v1, p0, LiK1$d;->g:LiK1;

    invoke-static {v1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, LjK1;->cm(LjK1$a;Z)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-virtual {p1}, LvE5;->c()Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/lang/Exception;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Generic Exception encountered for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-static {v0, v4}, LiK1;->access$trackError(LiK1;Ljava/lang/Throwable;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->j:LjK1$a;

    iget-object v4, p0, LiK1$d;->g:LiK1;

    invoke-static {v4}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v4

    invoke-virtual {p1, v0, v4}, LjK1;->cm(LjK1$a;Z)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$clearReadyState(LiK1;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    invoke-static {p1, v1, v3, v2}, LjK1;->showTryAgainButton$default(LjK1;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_4
    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-virtual {p1}, LvE5;->c()Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_1

    new-instance v4, Ljava/lang/Exception;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Lease Exception encountered for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :cond_1
    invoke-static {v0, v4}, LiK1;->access$trackError(LiK1;Ljava/lang/Throwable;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->f:LjK1$a;

    iget-object v4, p0, LiK1$d;->g:LiK1;

    invoke-static {v4}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v4

    invoke-virtual {p1, v0, v4}, LjK1;->cm(LjK1$a;Z)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$clearReadyState(LiK1;)V

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    invoke-static {p1, v1, v3, v2}, LjK1;->showTryAgainButton$default(LjK1;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_5
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->g:LjK1$a;

    iget-object v1, p0, LiK1$d;->g:LiK1;

    invoke-static {v1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, LjK1;->cm(LjK1$a;Z)V

    goto/16 :goto_0

    :pswitch_6
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->e:LjK1$a;

    iget-object v1, p0, LiK1$d;->g:LiK1;

    invoke-static {v1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, LjK1;->cm(LjK1$a;Z)V

    goto :goto_0

    :pswitch_7
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->g:LjK1$a;

    iget-object v1, p0, LiK1$d;->g:LiK1;

    invoke-static {v1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, LjK1;->cm(LjK1$a;Z)V

    goto :goto_0

    :pswitch_8
    iget-object p1, p0, LiK1$d;->g:LiK1;

    invoke-static {p1}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object p1

    sget-object v0, LjK1$a;->d:LjK1$a;

    iget-object v1, p0, LiK1$d;->g:LiK1;

    invoke-static {v1}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, LjK1;->cm(LjK1$a;Z)V

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-static {v0}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object v0

    sget-object v2, LjK1$a;->e:LjK1$a;

    iget-object v3, p0, LiK1$d;->g:LiK1;

    invoke-static {v3}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, LjK1;->cm(LjK1$a;Z)V

    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-static {v0}, LiK1;->access$getUi$p(LiK1;)LjK1;

    move-result-object v0

    invoke-virtual {v0, v1}, LjK1;->am(Z)V

    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-static {v0}, LiK1;->access$getStartingLease(LiK1;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LiK1$d;->g:LiK1;

    invoke-virtual {p1}, LvE5;->d()LsE5;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, p1}, LiK1;->access$startEndingLease(LiK1;LsE5;)V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LvE5;

    invoke-virtual {p0, p1}, LiK1$d;->a(LvE5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
