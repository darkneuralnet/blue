.class public final LUS1$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUS1;->A(Lg32;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/android/gms/tasks/Task<",
        "Lp06;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/google/android/gms/tasks/Task;",
        "Lp06;",
        "b",
        "()Lcom/google/android/gms/tasks/Task;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUS1;

.field public final synthetic h:Lg32;


# direct methods
.method public constructor <init>(LUS1;Lg32;)V
    .locals 0

    iput-object p1, p0, LUS1$n;->g:LUS1;

    iput-object p2, p0, LUS1$n;->h:Lg32;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lp06;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LUS1$n;->g:LUS1;

    invoke-static {v0}, LUS1;->access$getTextRecognition$p(LUS1;)Lv26;

    move-result-object v0

    iget-object v1, p0, LUS1$n;->h:Lg32;

    invoke-interface {v0, v1}, Lv26;->h(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v1, "textRecognition.process(image)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUS1$n;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
