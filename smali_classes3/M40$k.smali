.class public final LM40$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM40;->v(Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;Ljava/lang/String;)V
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
.field public final synthetic g:LM40;

.field public final synthetic h:Lco/bird/android/model/wire/WireServiceCenterStatus;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(LM40;Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LM40$k;->g:LM40;

    iput-object p2, p0, LM40$k;->h:Lco/bird/android/model/wire/WireServiceCenterStatus;

    iput-object p3, p0, LM40$k;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LnQ5$b;)V
    .locals 2

    sget-object v0, LnQ5$b;->d:LnQ5$b;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LM40$k;->g:LM40;

    iget-object v0, p0, LM40$k;->h:Lco/bird/android/model/wire/WireServiceCenterStatus;

    iget-object v1, p0, LM40$k;->i:Ljava/lang/String;

    invoke-static {p1, v0, v1}, LM40;->access$bulkUpdateBirds(LM40;Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LM40$k;->g:LM40;

    invoke-static {p1}, LM40;->access$getNavigator$p(LM40;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LnQ5$b;

    invoke-virtual {p0, p1}, LM40$k;->a(LnQ5$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
