.class public final LR22;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR22$b;,
        LR22$c;,
        LR22$a;
    }
.end annotation


# instance fields
.field public final a:LR22$c;


# direct methods
.method public constructor <init>(LR22$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR22;->a:LR22$c;

    return-void
.end method

.method public static b(Ljava/lang/Object;)LR22;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    new-instance v0, LR22;

    new-instance v1, LR22$b;

    invoke-direct {v1, p0}, LR22$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LR22;-><init>(LR22$c;)V

    return-object v0

    :cond_1
    new-instance v0, LR22;

    new-instance v1, LR22$a;

    invoke-direct {v1, p0}, LR22$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LR22;-><init>(LR22$c;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR22;->a:LR22$c;

    invoke-interface {v0}, LR22$c;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LR22;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LR22;->a:LR22$c;

    check-cast p1, LR22;

    iget-object p1, p1, LR22;->a:LR22$c;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LR22;->a:LR22$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR22;->a:LR22$c;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
