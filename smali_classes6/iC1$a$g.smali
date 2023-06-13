.class public final LiC1$a$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiC1$a;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LP83;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LP83;",
        "ne1",
        "",
        "a",
        "(LP83;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/MotionEvent;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LP83;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Landroid/view/MotionEvent;

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:LiC1$b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Landroid/view/MotionEvent;FFLiC1$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/MotionEvent;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LP83;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/view/MotionEvent;",
            "FF",
            "LiC1$b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LiC1$a$g;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LiC1$a$g;->h:Landroid/view/MotionEvent;

    iput p3, p0, LiC1$a$g;->i:F

    iput p4, p0, LiC1$a$g;->j:F

    iput-object p5, p0, LiC1$a$g;->k:LiC1$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LP83;)V
    .locals 6

    const-string v0, "ne1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$a$g;->g:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, LiC1$a$g;->h:Landroid/view/MotionEvent;

    new-instance v2, LiC1$a$g$a;

    iget v3, p0, LiC1$a$g;->i:F

    iget v4, p0, LiC1$a$g;->j:F

    iget-object v5, p0, LiC1$a$g;->k:LiC1$b;

    invoke-direct {v2, p1, v3, v4, v5}, LiC1$a$g$a;-><init>(LP83;FFLiC1$b;)V

    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP83;

    invoke-virtual {p0, p1}, LiC1$a$g;->a(LP83;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
