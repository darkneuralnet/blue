.class public final LHn2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHn2;->a(IILEt0;II)LGn2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LGn2;",
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
.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    iput p1, p0, LHn2$a;->g:I

    iput p2, p0, LHn2$a;->h:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LGn2;
    .locals 3

    new-instance v0, LGn2;

    iget v1, p0, LHn2$a;->g:I

    iget v2, p0, LHn2$a;->h:I

    invoke-direct {v0, v1, v2}, LGn2;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LHn2$a;->b()LGn2;

    move-result-object v0

    return-object v0
.end method
