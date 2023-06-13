.class public final LfI0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNw0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfI0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LgI0;)V
    .locals 0

    invoke-direct {p0}, LfI0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LNw0;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LfI0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LfI0$a;-><init>(LlG2;LeI0;)V

    return-object v0
.end method
