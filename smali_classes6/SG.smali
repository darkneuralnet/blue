.class public abstract LSG;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LzE2;


# direct methods
.method public constructor <init>(LzE2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSG;->a:LzE2;

    return-void
.end method


# virtual methods
.method public abstract a(LzE2;)LSG;
.end method

.method public abstract b()LET;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public abstract c(ILCT;)LCT;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LSG;->a:LzE2;

    invoke-virtual {v0}, LzE2;->a()I

    move-result v0

    return v0
.end method

.method public final e()LzE2;
    .locals 1

    iget-object v0, p0, LSG;->a:LzE2;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, LSG;->a:LzE2;

    invoke-virtual {v0}, LzE2;->d()I

    move-result v0

    return v0
.end method
