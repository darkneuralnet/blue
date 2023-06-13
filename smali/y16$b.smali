.class public final Ly16$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly16;->a(ZLUL4;Lx16;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field public final synthetic g:Z

.field public final synthetic h:LUL4;

.field public final synthetic i:Lx16;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(ZLUL4;Lx16;I)V
    .locals 0

    iput-boolean p1, p0, Ly16$b;->g:Z

    iput-object p2, p0, Ly16$b;->h:LUL4;

    iput-object p3, p0, Ly16$b;->i:Lx16;

    iput p4, p0, Ly16$b;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ly16$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-boolean p2, p0, Ly16$b;->g:Z

    iget-object v0, p0, Ly16$b;->h:LUL4;

    iget-object v1, p0, Ly16$b;->i:Lx16;

    iget v2, p0, Ly16$b;->j:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lps4;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Ly16;->a(ZLUL4;Lx16;LEt0;I)V

    return-void
.end method
