.class public LkG0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU;

.field public static final b:LW;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LnG0;

    invoke-direct {v0}, LnG0;-><init>()V

    sput-object v0, LkG0;->a:LU;

    new-instance v0, LpG0;

    invoke-direct {v0}, LpG0;-><init>()V

    sput-object v0, LkG0;->b:LW;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LF;)LU;
    .locals 2

    invoke-virtual {p0}, LF;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    sget-object p0, LkG0;->a:LU;

    return-object p0

    :cond_0
    new-instance v0, LnG0;

    invoke-direct {v0, p0}, LnG0;-><init>(LF;)V

    return-object v0
.end method

.method public static b(LF;)LW;
    .locals 2

    invoke-virtual {p0}, LF;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    sget-object p0, LkG0;->b:LW;

    return-object p0

    :cond_0
    new-instance v0, LpG0;

    invoke-direct {v0, p0}, LpG0;-><init>(LF;)V

    return-object v0
.end method
