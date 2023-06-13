.class public final Lso2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso2;->b(Lpo2;LCo2;LEt0;I)V
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
.field public final synthetic g:Lpo2;

.field public final synthetic h:LCo2;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lpo2;LCo2;I)V
    .locals 0

    iput-object p1, p0, Lso2$b;->g:Lpo2;

    iput-object p2, p0, Lso2$b;->h:LCo2;

    iput p3, p0, Lso2$b;->i:I

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

    invoke-virtual {p0, p1, p2}, Lso2$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 2

    iget-object p2, p0, Lso2$b;->g:Lpo2;

    iget-object v0, p0, Lso2$b;->h:LCo2;

    iget v1, p0, Lso2$b;->i:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lps4;->a(I)I

    move-result v1

    invoke-static {p2, v0, p1, v1}, Lso2;->c(Lpo2;LCo2;LEt0;I)V

    return-void
.end method
