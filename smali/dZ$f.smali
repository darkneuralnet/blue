.class public final LdZ$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdZ;->m(Le80;La30;JJZF)LH61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LiA0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LiA0;",
        "",
        "a",
        "(LiA0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:La30;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:LJ61;


# direct methods
.method public constructor <init>(La30;JJLJ61;)V
    .locals 0

    iput-object p1, p0, LdZ$f;->g:La30;

    iput-wide p2, p0, LdZ$f;->h:J

    iput-wide p4, p0, LdZ$f;->i:J

    iput-object p6, p0, LdZ$f;->j:LJ61;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 13

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LiA0;->n0()V

    iget-object v2, p0, LdZ$f;->g:La30;

    iget-wide v3, p0, LdZ$f;->h:J

    iget-wide v5, p0, LdZ$f;->i:J

    const/4 v7, 0x0

    iget-object v8, p0, LdZ$f;->j:LJ61;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v12}, LI61;->b0(LI61;La30;JJFLJ61;Lsm0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, LdZ$f;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
