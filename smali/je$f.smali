.class public final Lje$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje;->c(Lkotlin/jvm/functions/Function1;LC43;LEt0;I)Lkotlin/jvm/functions/Function0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LJm2;",
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
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic i:LYt0;

.field public final synthetic j:LC43;

.field public final synthetic k:LHi5;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LYt0;LC43;LHi5;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+TT;>;",
            "LYt0;",
            "LC43;",
            "LHi5;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lje$f;->g:Landroid/content/Context;

    iput-object p2, p0, Lje$f;->h:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lje$f;->i:LYt0;

    iput-object p4, p0, Lje$f;->j:LC43;

    iput-object p5, p0, Lje$f;->k:LHi5;

    iput-object p6, p0, Lje$f;->l:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LJm2;
    .locals 8

    new-instance v7, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;

    iget-object v1, p0, Lje$f;->g:Landroid/content/Context;

    iget-object v2, p0, Lje$f;->h:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lje$f;->i:LYt0;

    iget-object v4, p0, Lje$f;->j:LC43;

    iget-object v5, p0, Lje$f;->k:LHi5;

    iget-object v6, p0, Lje$f;->l:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LYt0;LC43;LHi5;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->h()LJm2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lje$f;->b()LJm2;

    move-result-object v0

    return-object v0
.end method
