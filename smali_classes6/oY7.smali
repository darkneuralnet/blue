.class public final LoY7;
.super Ltv9;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltv9;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ltv9;
    .locals 0

    iput-object p1, p0, LoY7;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b()LW52;
    .locals 3

    iget-object v0, p0, LoY7;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, LFe8;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LFe8;-><init>(Ljava/lang/String;Lz68;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: token"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
