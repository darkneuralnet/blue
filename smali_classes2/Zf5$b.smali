.class public final LZf5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZf5;->b(LH31;Landroid/content/Context;Ljava/lang/Throwable;Le13;Lco/bird/android/model/constant/MapMode;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Le13;

.field public final synthetic i:LH31;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le13;LH31;)V
    .locals 0

    iput-object p1, p0, LZf5$b;->g:Ljava/lang/String;

    iput-object p2, p0, LZf5$b;->h:Le13;

    iput-object p3, p0, LZf5$b;->i:LH31;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZf5$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, LZf5$b;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, LZf5$b;->h:Le13;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Le13;->w3(J)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LZf5$b;->h:Le13;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Le13$a;->goToFaq$default(Le13;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    iget-object v0, p0, LZf5$b;->i:LH31;

    invoke-interface {v0}, LH31;->dismissDialog()V

    return-void
.end method
