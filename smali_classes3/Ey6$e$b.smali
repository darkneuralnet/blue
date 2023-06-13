.class public final LEy6$e$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEy6$e;->bind(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Ljava/lang/Long;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEy6$e;

.field public final synthetic h:Lco/bird/android/model/RefreshWarehouseButton;


# direct methods
.method public constructor <init>(LEy6$e;Lco/bird/android/model/RefreshWarehouseButton;)V
    .locals 0

    iput-object p1, p0, LEy6$e$b;->g:LEy6$e;

    iput-object p2, p0, LEy6$e$b;->h:Lco/bird/android/model/RefreshWarehouseButton;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 1

    iget-object p1, p0, LEy6$e$b;->g:LEy6$e;

    iget-object v0, p0, LEy6$e$b;->h:Lco/bird/android/model/RefreshWarehouseButton;

    invoke-virtual {v0}, Lco/bird/android/model/RefreshWarehouseButton;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {p1, v0}, LEy6$e;->b(LEy6$e;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LEy6$e$b;->a(Ljava/lang/Long;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
