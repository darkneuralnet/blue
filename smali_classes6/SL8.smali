.class public final LSL8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LBH8;

.field public final b:Z

.field public final c:LiL8;


# direct methods
.method public constructor <init>(LiL8;ZLBH8;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSL8;->c:LiL8;

    iput-boolean p2, p0, LSL8;->b:Z

    iput-object p3, p0, LSL8;->a:LBH8;

    return-void
.end method

.method public static synthetic a(LSL8;)LBH8;
    .locals 0

    iget-object p0, p0, LSL8;->a:LBH8;

    return-object p0
.end method

.method public static c(Ljava/lang/String;)LSL8;
    .locals 7

    const-string p0, "+"

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    new-instance v0, LkG8;

    invoke-direct {v0, p0}, LkG8;-><init>(C)V

    new-instance p0, LSL8;

    new-instance v2, LiL8;

    invoke-direct {v2, v0}, LiL8;-><init>(LBH8;)V

    const/4 v3, 0x0

    sget-object v4, LIG8;->b:LIG8;

    const v5, 0x7fffffff

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LSL8;-><init>(LiL8;ZLBH8;I[B)V

    return-object p0
.end method

.method public static synthetic e(LSL8;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LSL8;->c:LiL8;

    new-instance v1, LWK8;

    invoke-direct {v1, v0, p0, p1}, LWK8;-><init>(LiL8;LSL8;Ljava/lang/CharSequence;)V

    return-object v1
.end method

.method public static synthetic f(LSL8;)Z
    .locals 0

    iget-boolean p0, p0, LSL8;->b:Z

    return p0
.end method


# virtual methods
.method public final b()LSL8;
    .locals 7

    new-instance v6, LSL8;

    iget-object v1, p0, LSL8;->c:LiL8;

    const/4 v2, 0x1

    iget-object v3, p0, LSL8;->a:LBH8;

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LSL8;-><init>(LiL8;ZLBH8;I[B)V

    return-object v6
.end method

.method public final d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LuL8;

    invoke-direct {v0, p0, p1}, LuL8;-><init>(LSL8;Ljava/lang/CharSequence;)V

    return-object v0
.end method
