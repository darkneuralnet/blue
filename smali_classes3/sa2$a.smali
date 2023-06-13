.class public final Lsa2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsa2;->a(Lco/bird/android/model/Issue;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/IssueStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/IssueStatus;",
        "kotlin.jvm.PlatformType",
        "status",
        "",
        "a",
        "(Lco/bird/android/model/IssueStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lsa2;

.field public final synthetic h:Lco/bird/android/model/Issue;


# direct methods
.method public constructor <init>(Lsa2;Lco/bird/android/model/Issue;)V
    .locals 0

    iput-object p1, p0, Lsa2$a;->g:Lsa2;

    iput-object p2, p0, Lsa2$a;->h:Lco/bird/android/model/Issue;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/IssueStatus;)V
    .locals 2

    iget-object v0, p0, Lsa2$a;->g:Lsa2;

    invoke-static {v0}, Lsa2;->access$getUi$p(Lsa2;)Lva2;

    move-result-object v0

    iget-object v1, p0, Lsa2$a;->h:Lco/bird/android/model/Issue;

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v1

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Lva2;->ri(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/IssueStatus;

    invoke-virtual {p0, p1}, Lsa2$a;->a(Lco/bird/android/model/IssueStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
