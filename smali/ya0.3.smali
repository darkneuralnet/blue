.class public final Lya0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwX1;


# instance fields
.field public final a:Lxa0;


# direct methods
.method public constructor <init>(Lxa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya0;->a:Lxa0;

    return-void
.end method


# virtual methods
.method public a(LWh1$b;)V
    .locals 1

    iget-object v0, p0, Lya0;->a:Lxa0;

    invoke-interface {v0, p1}, Lxa0;->a(LWh1$b;)V

    return-void
.end method

.method public b()LxY5;
    .locals 1

    iget-object v0, p0, Lya0;->a:Lxa0;

    invoke-interface {v0}, Lxa0;->b()LxY5;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()Lxa0;
    .locals 1

    iget-object v0, p0, Lya0;->a:Lxa0;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-object v0, p0, Lya0;->a:Lxa0;

    invoke-interface {v0}, Lxa0;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method
