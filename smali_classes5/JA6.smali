.class public final LJA6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJA6$b;,
        LJA6$c;
    }
.end annotation


# static fields
.field public static final c:LJA6;

.field public static final d:LJA6;

.field public static final e:LJA6;


# instance fields
.field public a:LJA6$c;

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJA6$b;

    invoke-direct {v0}, LJA6$b;-><init>()V

    invoke-virtual {v0}, LJA6$b;->f()LJA6$b;

    move-result-object v0

    invoke-virtual {v0}, LJA6$b;->c()LJA6;

    move-result-object v0

    sput-object v0, LJA6;->c:LJA6;

    new-instance v0, LJA6$b;

    invoke-direct {v0}, LJA6$b;-><init>()V

    invoke-virtual {v0}, LJA6$b;->e()LJA6$b;

    move-result-object v0

    invoke-virtual {v0}, LJA6$b;->c()LJA6;

    move-result-object v0

    sput-object v0, LJA6;->d:LJA6;

    new-instance v0, LJA6$b;

    invoke-direct {v0}, LJA6$b;-><init>()V

    invoke-virtual {v0}, LJA6$b;->d()LJA6$b;

    move-result-object v0

    invoke-virtual {v0}, LJA6$b;->c()LJA6;

    move-result-object v0

    sput-object v0, LJA6;->e:LJA6;

    return-void
.end method

.method public constructor <init>(LJA6$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LJA6$b;->a(LJA6$b;)LJA6$c;

    move-result-object v0

    iput-object v0, p0, LJA6;->a:LJA6$c;

    invoke-static {p1}, LJA6$b;->b(LJA6$b;)I

    move-result p1

    iput p1, p0, LJA6;->b:I

    return-void
.end method

.method public synthetic constructor <init>(LJA6$b;LJA6$a;)V
    .locals 0

    invoke-direct {p0, p1}, LJA6;-><init>(LJA6$b;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, LJA6;->a:LJA6$c;

    sget-object v1, LJA6$c;->e:LJA6$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LJA6;->b:I

    return v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, LJA6;->a:LJA6$c;

    sget-object v1, LJA6$c;->b:LJA6$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
