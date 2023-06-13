.class public final LCc4$n$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc4$n;->invoke(Lkotlin/Pair;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LnQ5$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LnQ5$b;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LnQ5$b;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCc4;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LCc4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCc4;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCInspection;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LCc4$n$a;->g:LCc4;

    iput-object p2, p0, LCc4$n$a;->h:Ljava/lang/String;

    iput-object p3, p0, LCc4$n$a;->i:Ljava/util/List;

    iput-object p4, p0, LCc4$n$a;->j:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LnQ5$b;)V
    .locals 3

    sget-object v0, LnQ5$b;->d:LnQ5$b;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LCc4$n$a;->g:LCc4;

    iget-object v0, p0, LCc4$n$a;->h:Ljava/lang/String;

    iget-object v1, p0, LCc4$n$a;->i:Ljava/util/List;

    const-string v2, "inspections"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LCc4$n$a;->j:Ljava/util/List;

    invoke-static {p1, v0, v1, v2}, LCc4;->access$processQcInspection(LCc4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LCc4$n$a;->g:LCc4;

    invoke-static {p1}, LCc4;->access$getNavigator$p(LCc4;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LnQ5$b;

    invoke-virtual {p0, p1}, LCc4$n$a;->a(LnQ5$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
