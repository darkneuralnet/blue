.class public LtB5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMC1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtB5;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LMC1$b<",
        "Landroid/net/ConnectivityManager;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LtB5;


# direct methods
.method public constructor <init>(LtB5;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LtB5$a;->b:LtB5;

    iput-object p2, p0, LtB5$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/ConnectivityManager;
    .locals 2

    iget-object v0, p0, LtB5$a;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LtB5$a;->a()Landroid/net/ConnectivityManager;

    move-result-object v0

    return-object v0
.end method
