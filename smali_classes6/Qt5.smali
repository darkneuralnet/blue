.class public LQt5;
.super Lg;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final e:Ljava/util/UUID;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x16

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LQt5;-><init>(II[B)V

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg;-><init>(II[B)V

    invoke-virtual {p0, p2, p3}, LQt5;->d(I[B)Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, LQt5;->e:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final d(I[B)Ljava/util/UUID;
    .locals 1

    const/16 v0, 0x16

    if-eq p1, v0, :cond_2

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x21

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p2}, Lpd6;->a([B)Ljava/util/UUID;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p2}, Lpd6;->g([B)Ljava/util/UUID;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p2}, Lpd6;->d([B)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LQt5;->e:Ljava/util/UUID;

    aput-object v2, v0, v1

    const-string v1, "ServiceData(ServiceUUID=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
