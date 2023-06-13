.class public final LAi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lzi0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAi0;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LAi0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;)",
            "LAi0;"
        }
    .end annotation

    new-instance v0, LAi0;

    invoke-direct {v0, p0}, LAi0;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lzi0;
    .locals 1

    new-instance v0, Lzi0;

    invoke-direct {v0, p0}, Lzi0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzi0;
    .locals 1

    iget-object v0, p0, LAi0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LAi0;->c(Landroid/content/Context;)Lzi0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAi0;->b()Lzi0;

    move-result-object v0

    return-object v0
.end method
