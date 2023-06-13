.class public abstract Lgw4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/Map;

.field public static final e:Ljava/util/Map;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LEB;

.field public final c:LeV2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LEB;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lgw4;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/EnumMap;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lgw4;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgw4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgw4;

    iget-object v1, p0, Lgw4;->a:Ljava/lang/String;

    iget-object v3, p1, Lgw4;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lgw4;->b:LEB;

    iget-object v3, p1, Lgw4;->b:LEB;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lgw4;->c:LeV2;

    iget-object p1, p1, Lgw4;->c:LeV2;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lgw4;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lgw4;->b:LEB;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lgw4;->c:LeV2;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "RemoteModel"

    invoke-static {v0}, LQf7;->a(Ljava/lang/String;)LKy9;

    move-result-object v0

    const-string v1, "modelName"

    iget-object v2, p0, Lgw4;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, LKy9;->a(Ljava/lang/String;Ljava/lang/Object;)LKy9;

    const-string v1, "baseModel"

    iget-object v2, p0, Lgw4;->b:LEB;

    invoke-virtual {v0, v1, v2}, LKy9;->a(Ljava/lang/String;Ljava/lang/Object;)LKy9;

    const-string v1, "modelType"

    iget-object v2, p0, Lgw4;->c:LeV2;

    invoke-virtual {v0, v1, v2}, LKy9;->a(Ljava/lang/String;Ljava/lang/Object;)LKy9;

    invoke-virtual {v0}, LKy9;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
