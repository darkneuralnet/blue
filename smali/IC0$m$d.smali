.class public final LIC0$m$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0$m;->invoke(Lss5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LC16;

.field public final synthetic h:Landroidx/compose/ui/focus/h;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(LC16;Landroidx/compose/ui/focus/h;Z)V
    .locals 0

    iput-object p1, p0, LIC0$m$d;->g:LC16;

    iput-object p2, p0, LIC0$m$d;->h:Landroidx/compose/ui/focus/h;

    iput-boolean p3, p0, LIC0$m$d;->i:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, LIC0$m$d;->g:LC16;

    iget-object v1, p0, LIC0$m$d;->h:Landroidx/compose/ui/focus/h;

    iget-boolean v2, p0, LIC0$m$d;->i:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LIC0;->j(LC16;Landroidx/compose/ui/focus/h;Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIC0$m$d;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
