.class public LuT5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTx2;


# instance fields
.field public a:Lpq2;

.field public b:LgM2;

.field public c:Ljava/lang/String;

.field public d:LsT5;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:[Ljava/lang/Object;

.field public h:J

.field public i:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LsT5;
    .locals 1

    iget-object v0, p0, LuT5;->d:LsT5;

    return-object v0
.end method

.method public b([Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LuT5;->g:[Ljava/lang/Object;

    return-void
.end method

.method public c(Lpq2;)V
    .locals 0

    iput-object p1, p0, LuT5;->a:Lpq2;

    return-void
.end method

.method public d(LsT5;)V
    .locals 0

    iput-object p1, p0, LuT5;->d:LsT5;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LuT5;->c:Ljava/lang/String;

    return-void
.end method

.method public f(LgM2;)V
    .locals 0

    iput-object p1, p0, LuT5;->b:LgM2;

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LuT5;->f:Ljava/lang/String;

    return-void
.end method

.method public getArgumentArray()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LuT5;->g:[Ljava/lang/Object;

    return-object v0
.end method

.method public getLevel()Lpq2;
    .locals 1

    iget-object v0, p0, LuT5;->a:Lpq2;

    return-object v0
.end method

.method public getMarker()LgM2;
    .locals 1

    iget-object v0, p0, LuT5;->b:LgM2;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LuT5;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getThrowable()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, LuT5;->i:Ljava/lang/Throwable;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LuT5;->e:Ljava/lang/String;

    return-void
.end method

.method public i(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LuT5;->i:Ljava/lang/Throwable;

    return-void
.end method

.method public j(J)V
    .locals 0

    iput-wide p1, p0, LuT5;->h:J

    return-void
.end method
