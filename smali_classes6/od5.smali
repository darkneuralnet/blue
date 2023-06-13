.class public final Lod5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lnd5;",
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

    iput-object p1, p0, Lod5;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Lod5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/Context;",
            ">;)",
            "Lod5;"
        }
    .end annotation

    new-instance v0, Lod5;

    invoke-direct {v0, p0}, Lod5;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lnd5;
    .locals 1

    new-instance v0, Lnd5;

    invoke-direct {v0, p0}, Lnd5;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnd5;
    .locals 1

    iget-object v0, p0, Lod5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lod5;->c(Landroid/content/Context;)Lnd5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lod5;->b()Lnd5;

    move-result-object v0

    return-object v0
.end method
