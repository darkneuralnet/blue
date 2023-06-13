.class public final LGr1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGr1;->p(LHr1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/constant/FleetReportPage;",
        "kotlin.jvm.PlatformType",
        "fleetTab",
        "",
        "a",
        "(Lco/bird/android/model/constant/FleetReportPage;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGr1;


# direct methods
.method public constructor <init>(LGr1;)V
    .locals 0

    iput-object p1, p0, LGr1$c;->g:LGr1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/FleetReportPage;)V
    .locals 2

    sget-object v0, Lco/bird/android/model/constant/FleetReportPage;->CORE:Lco/bird/android/model/constant/FleetReportPage;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LGr1$c;->g:LGr1;

    invoke-static {v0}, LGr1;->access$getAnalyticsManager$p(LGr1;)Lsp1;

    move-result-object v0

    invoke-interface {v0}, Lsp1;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LGr1$c;->g:LGr1;

    invoke-static {v0}, LGr1;->access$getAnalyticsManager$p(LGr1;)Lsp1;

    move-result-object v0

    invoke-interface {v0}, Lsp1;->a()V

    :goto_0
    iget-object v0, p0, LGr1$c;->g:LGr1;

    new-instance v1, LGr1$c$a;

    invoke-direct {v1, p1}, LGr1$c$a;-><init>(Lco/bird/android/model/constant/FleetReportPage;)V

    invoke-virtual {v0, v1}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/constant/FleetReportPage;

    invoke-virtual {p0, p1}, LGr1$c;->a(Lco/bird/android/model/constant/FleetReportPage;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
