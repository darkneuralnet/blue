.class public final LaR3$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaR3;->V(Lco/bird/android/model/PermissionStatus;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LFQ3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LaR3;


# direct methods
.method public constructor <init>(ZLaR3;)V
    .locals 0

    iput-boolean p1, p0, LaR3$s;->g:Z

    iput-object p2, p0, LaR3$s;->h:LaR3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)V
    .locals 1

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LaR3$s;->g:Z

    if-nez v0, :cond_0

    iget-object p1, p0, LaR3$s;->h:LaR3;

    invoke-static {p1}, LaR3;->access$getNavigator$p(LaR3;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->C()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, LaR3$s;->g:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, LaR3$s;->h:LaR3;

    invoke-virtual {p1}, LaR3;->X()V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, LaR3$s;->a(LFQ3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
