.class public Lzb4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzb4$b;
    }
.end annotation


# static fields
.field public static final a:Lzb4;

.field public static final b:Lzb4;

.field public static final c:Lzb4;

.field public static final d:Lzb4;

.field public static final e:Lzb4;

.field public static final f:Lzb4;

.field public static final g:Lzb4;

.field public static final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lzb4;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzb4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const-string v0, "SD"

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v0

    sput-object v0, Lzb4;->a:Lzb4;

    const-string v2, "HD"

    const/4 v3, 0x5

    invoke-static {v3, v2}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v2

    sput-object v2, Lzb4;->b:Lzb4;

    const-string v4, "FHD"

    const/4 v5, 0x6

    invoke-static {v5, v4}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v4

    sput-object v4, Lzb4;->c:Lzb4;

    const/16 v6, 0x8

    const-string v7, "UHD"

    invoke-static {v6, v7}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v6

    sput-object v6, Lzb4;->d:Lzb4;

    const-string v7, "LOWEST"

    const/4 v8, 0x0

    invoke-static {v8, v7}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v7

    sput-object v7, Lzb4;->e:Lzb4;

    const-string v9, "HIGHEST"

    const/4 v10, 0x1

    invoke-static {v10, v9}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v9

    sput-object v9, Lzb4;->f:Lzb4;

    const/4 v11, -0x1

    const-string v12, "NONE"

    invoke-static {v11, v12}, Lzb4$b;->e(ILjava/lang/String;)Lzb4$b;

    move-result-object v11

    sput-object v11, Lzb4;->g:Lzb4;

    new-instance v11, Ljava/util/HashSet;

    new-array v5, v5, [Lzb4;

    aput-object v7, v5, v8

    aput-object v9, v5, v10

    const/4 v7, 0x2

    aput-object v0, v5, v7

    const/4 v9, 0x3

    aput-object v2, v5, v9

    aput-object v4, v5, v1

    aput-object v6, v5, v3

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v11, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v11, Lzb4;->h:Ljava/util/Set;

    new-array v1, v1, [Lzb4;

    aput-object v6, v1, v8

    aput-object v4, v1, v10

    aput-object v2, v1, v7

    aput-object v0, v1, v9

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzb4;->i:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzb4$a;)V
    .locals 0

    invoke-direct {p0}, Lzb4;-><init>()V

    return-void
.end method

.method public static a(Lzb4;)Z
    .locals 1

    sget-object v0, Lzb4;->h:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzb4;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lzb4;->i:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
