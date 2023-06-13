.class public final LDc$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc;->a(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
.field public final synthetic g:LJ31;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LD31;

.field public final synthetic j:Lpm2;


# direct methods
.method public constructor <init>(LJ31;Lkotlin/jvm/functions/Function0;LD31;Lpm2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ31;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LD31;",
            "Lpm2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LDc$b;->g:LJ31;

    iput-object p2, p0, LDc$b;->h:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, LDc$b;->i:LD31;

    iput-object p4, p0, LDc$b;->j:Lpm2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDc$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, LDc$b;->g:LJ31;

    iget-object v1, p0, LDc$b;->h:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, LDc$b;->i:LD31;

    iget-object v3, p0, LDc$b;->j:Lpm2;

    invoke-virtual {v0, v1, v2, v3}, LJ31;->i(Lkotlin/jvm/functions/Function0;LD31;Lpm2;)V

    return-void
.end method
