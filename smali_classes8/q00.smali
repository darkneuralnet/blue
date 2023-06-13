.class public Lq00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa4;


# static fields
.field public static e:Ljava/security/Permission;

.field public static f:Ljava/security/Permission;

.field public static g:Ljava/security/Permission;

.field public static h:Ljava/security/Permission;

.field public static i:Ljava/security/Permission;

.field public static j:Ljava/security/Permission;


# instance fields
.field public a:Ljava/lang/ThreadLocal;

.field public b:Ljava/lang/ThreadLocal;

.field public volatile c:Ljava/util/Set;

.field public volatile d:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lba4;

    const-string v1, "threadLocalEcImplicitlyCa"

    const-string v2, "BC"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->e:Ljava/security/Permission;

    new-instance v0, Lba4;

    const-string v1, "ecImplicitlyCa"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->f:Ljava/security/Permission;

    new-instance v0, Lba4;

    const-string v1, "threadLocalDhDefaultParams"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->g:Ljava/security/Permission;

    new-instance v0, Lba4;

    const-string v1, "DhDefaultParams"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->h:Ljava/security/Permission;

    new-instance v0, Lba4;

    const-string v1, "acceptableEcCurves"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->i:Ljava/security/Permission;

    new-instance v0, Lba4;

    const-string v1, "additionalEcParameters"

    invoke-direct {v0, v2, v1}, Lba4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq00;->j:Ljava/security/Permission;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lq00;->a:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lq00;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq00;->c:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lq00;->d:Ljava/util/Map;

    return-void
.end method
