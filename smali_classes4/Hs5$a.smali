.class public final LHs5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHs5;-><init>(Landroid/hardware/SensorManager;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LC1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LC1;",
        "b",
        "()LC1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHs5;


# direct methods
.method public constructor <init>(LHs5;)V
    .locals 0

    iput-object p1, p0, LHs5$a;->g:LHs5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LC1;
    .locals 3

    new-instance v0, LC1;

    iget-object v1, p0, LHs5$a;->g:LHs5;

    invoke-static {v1}, LHs5;->access$getSensorManager$p(LHs5;)Landroid/hardware/SensorManager;

    move-result-object v1

    invoke-direct {v0, v1}, LC1;-><init>(Landroid/hardware/SensorManager;)V

    iget-object v1, p0, LHs5$a;->g:LHs5;

    new-instance v2, LHs5$a$a;

    invoke-direct {v2, v1}, LHs5$a$a;-><init>(LHs5;)V

    invoke-virtual {v0, v2}, LEs5;->c(Lkotlin/jvm/functions/Function0;)V

    new-instance v2, LHs5$a$b;

    invoke-direct {v2, v1}, LHs5$a$b;-><init>(LHs5;)V

    invoke-virtual {v0, v2}, LEs5;->d(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LHs5$a;->b()LC1;

    move-result-object v0

    return-object v0
.end method
