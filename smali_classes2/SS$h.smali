.class public final LSS$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->F(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
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
.field public final synthetic g:Z

.field public final synthetic h:LSS;


# direct methods
.method public constructor <init>(ZLSS;)V
    .locals 0

    iput-boolean p1, p0, LSS$h;->g:Z

    iput-object p2, p0, LSS$h;->h:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LSS$h;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean p1, p0, LSS$h;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LSS$h;->h:LSS;

    invoke-static {p1}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object p1

    sget v0, Lnl4;->sleep_bird_error:I

    sget-object v1, Lf56;->d:Lf56;

    invoke-interface {p1, v0, v1}, Lh56;->topToast(ILf56;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LSS$h;->h:LSS;

    invoke-static {p1}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object p1

    sget v0, Lnl4;->wake_bird_error:I

    sget-object v1, Lf56;->d:Lf56;

    invoke-interface {p1, v0, v1}, Lh56;->topToast(ILf56;)V

    :goto_0
    return-void
.end method
